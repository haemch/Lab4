package at.ac.tuwien.big.stl.codegen.lib.server;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

import org.nanohttpd.protocols.http.IHTTPSession;
import org.nanohttpd.protocols.http.response.IStatus;
import org.nanohttpd.protocols.http.response.Status;
import org.nanohttpd.protocols.websockets.CloseCode;
import org.nanohttpd.protocols.websockets.RoutingSocketNanoServer;
import org.nanohttpd.protocols.websockets.WebSocket;
import org.nanohttpd.protocols.websockets.WebSocketFrame;

import at.ac.tuwien.big.stl.Component;
import at.ac.tuwien.big.stl.codegen.lib.util.ModelStore;
import at.ac.tuwien.big.stl.simulation.ComponentInfo;
import at.ac.tuwien.big.stl.simulation.ConnectorInfo;
import at.ac.tuwien.big.stl.simulation.ItemInfo;
import at.ac.tuwien.big.stl.simulation.SimConfiguration;
import at.ac.tuwien.big.stl.simulation.SimulationModel;
import at.ac.tuwien.big.stl.simulation.StoreInfo;
import at.ac.tuwien.big.stl.simulation.simulator.Event;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator.EventListener;

public class Server {

	public static String toAlphaNumerical(String string) {
		return string.replaceAll("[^A-Za-z0-9]", "");
	}

	static boolean isIdStart(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c == '_');
	}

	static boolean isIdPart(char c) {
		return (c >= '0' && c <= '9') || isIdStart(c);
	}

	public static class SimpleServer extends RoutingSocketNanoServer {

		public static SimpleServer INSTANCE;

		private SimulationModel model;

		protected SimulationModel getModel() {
			return model;
		}

		private List<String[]> historicalData = new ArrayList<String[]>();

		public SimpleServer(SimulationModel model, String host, int port, File wwwroot, boolean quiet) {
			this(host, port, wwwroot, quiet);
			this.model = model;
		}

		public SimpleServer(String host, int port, File wwwroot, boolean quiet) {
			super(host, port, wwwroot, quiet);
			init();
			INSTANCE = this;
			addRoute("/modelinfo", ModelInfoHandler.class, this);
			addRoute("/restart", RestartSimulationHandler.class, this);

		}

		public String getModelInfo(String addStr) {
			SimConfiguration cfg = getModel().getConfiguration();
			if (cfg != null) {
				int cost = cfg.getBudget() - cfg.getRemainingBudget();
				int products = cfg.getItemThroughput();
				double errorrate = 1.0 - cfg.getAverageQuality();
				double latency = cfg.getAverageLatency();
				return "{ \"cost\": " + cost + ", \"products\": " + products + ", \"errorrate\": " + errorrate
						+ ", \"latency\": " + latency + addStr + "}";
			}
			return "";
		}

		public static class ModelInfoHandler extends DefaultHandler {

			private SimpleServer This;

			public ModelInfoHandler() {
				This = INSTANCE;
			}

			@Override
			public String getText() {
				return This.getModelInfo("");
			}

			@Override
			public IStatus getStatus() {
				return Status.OK;
			}

			@Override
			public String getMimeType() {
				return "application/json";
			}

		}

		public static class RestartSimulationHandler extends DefaultHandler {

			private SimpleServer This;

			public RestartSimulationHandler() {
				This = INSTANCE;

			}

			@Override
			public String getText() {
				// This.notifyStarted();
				new Thread(() -> {
					This.getModel().simulate();
				}).start();
				synchronized (This.allSockets) {
					This.historicalData.clear();
				}
				return "{\"ok\": true}";
			}

			@Override
			public IStatus getStatus() {
				return Status.OK;
			}

			@Override
			public String getMimeType() {
				return "application/json";
			}

		}

		WeakHashMap<WebSocket, String> allSockets = new WeakHashMap<WebSocket, String>();

		public static Date now = new Date();
		Thread t = new Thread(() -> {
			for (;;) {
				synchronized (allSockets) {
					for (WebSocket ws : allSockets.keySet()) {
						try {
							ws.ping(new byte[] {});
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		{
			t.start();
		}

		public void sendOverSocket(String component, String data) {

			synchronized (allSockets) {
				if (!Simulator.INSTANCE.isRunning()) {
					data = "{\"finished\": true, " + data.substring(1);
				}
				historicalData.add(new String[] { component, data });
				for (Entry<WebSocket, String> socket : allSockets.entrySet()) {
					try {
						if (socket.getValue() == null || component == null
								|| socket.getValue().contentEquals(component)) {
							socket.getKey().send(data);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		}

		@Override
		protected WebSocket openWebSocket(IHTTPSession handshake) {
			WebSocket ws = new WebSocket(handshake) {

				@Override
				protected void onOpen() {
					java.lang.System.out.println("Opened connection!");
					synchronized (allSockets) {
						allSockets.put(this, null);
					}

					try {
						ping(new byte[] {});
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				@Override
				protected void onMessage(WebSocketFrame message) {
					String text = message.getTextPayload();
					java.lang.System.out.println("Received " + text + "!");
					// Send every utilization
					List<ComponentInfo> componentInfos = getModel().getComponentInfos();
					synchronized (allSockets) {
						allSockets.put(this, "null".contentEquals(text) ? null : text);
						Map<WebSocket, String> save = new HashMap<WebSocket, String>(allSockets);
						allSockets.clear();
						allSockets.put(this, "null".contentEquals(text) ? null : text);
						List<String[]> oldHistorical = historicalData;
						historicalData = new ArrayList<String[]>();
						for (String[] hd : oldHistorical) {
							sendOverSocket(hd[0], hd[1]);
						}
						if (Simulator.getInstance().isRunning()) {

							notifyChanged(Simulator.getInstance().getCurrentTime(), componentInfos);

							for (ComponentInfo info : componentInfos) {

								if (allSockets.get(this) != null) {
									notifyChangedBusy(Simulator.getInstance().getCurrentTime(), info.getComponent(),
											info.isIsBusy(), info.isIsBusy());
								}
								if (info instanceof StoreInfo) {
									int ss = ((StoreInfo) info).getStoredItems().size();
									notifyStoreChange(Simulator.getInstance().getCurrentTime(), info.getComponent(), ss,
											ss);
								}
							}
						}
						historicalData = oldHistorical;
						allSockets.putAll(save);
					}
				}

				@Override
				protected void onException(IOException exception) {
					java.lang.System.err.println("Exception: " + exception.getMessage());
				}

				@Override
				protected void onClose(CloseCode code, String reason, boolean initiatedByRemote) {
					synchronized (allSockets) {
						allSockets.remove(this);
					}
				}

				@Override
				protected void onPong(WebSocketFrame pong) {
				}
			};
			return ws;
		}

		public long getTotalTime(long tot) {
			double ss = getModel().getConfiguration().getSimSpeed();
			if (ss <= 0) {
				ss = 1.0;
			}
			return (long) Math.round(now.getTime() + tot / ss);
		}

		public void notifyChanged(long totalTime, Collection<ComponentInfo> infos) {
			for (ComponentInfo info : infos) {
				double utilisation = ((double) info.getUseTime()) / Math.max(totalTime, 1);
				sendOverSocket(info.getComponent().getName(),
						"{\"type\": \"utilization\", \"basicTime\": " + totalTime + ", \"time\":"
								+ getTotalTime(totalTime) + ", \"component\": \""
								+ toAlphaNumerical(info.getComponent().getName()) + "\", \"utilization\": "
								+ utilisation + "}");

				if (info instanceof StoreInfo) {
					sendOverSocket(info.getComponent().getName(), getModelInfo(",\"type\": \"modelinfo\""));
				}
			}
		}

		public void notifyChangedBusy(long totalTime, Component comp, Boolean wasBusy, Boolean isBusy) {
			sendOverSocket(comp.getName(),
					"{\"type\": \"busyState\", \"basicTime\": " + totalTime + ", \"time\":" + getTotalTime(totalTime)
							+ ", \"component\": \"" + toAlphaNumerical(comp.getName()) + "\", \"wasBusy\": " + wasBusy
							+ ", \"isBusy\": " + isBusy + "}");
		}

		public void notifyStoreChange(long totalTime, Component comp, Integer prevcount, Integer itemCount) {

			sendOverSocket(comp.getName(),
					"{\"type\": \"store\", \"basicTime\": " + totalTime + ", \"time\":" + getTotalTime(totalTime)
							+ ", \"component\": \"" + toAlphaNumerical(comp.getName()) + "\", \"prevCount\": "
							+ prevcount + ", \"eleCount\": " + itemCount + "}");
		}

		public void notifyFinished() {
			Simulator sim = Simulator.getInstance();
			notifyChanged(sim.getCurrentTime(), getModel().getComponentInfos());
			for (ComponentInfo ci : getModel().getComponentInfos()) {
				notifyChangedBusy(Simulator.getInstance().getCurrentTime(), ci.getComponent(), ci.isIsBusy(),
						ci.isIsBusy());
				if (ci instanceof StoreInfo) {
					int ss = ((StoreInfo) ci).getStoredItems().size();
					notifyStoreChange(Simulator.getInstance().getCurrentTime(), ci.getComponent(), ss, ss);
				}
			}

			sendOverSocket(null, "{\"type\": \"finished\"}");
		}

		public void notifyStarted() {
			historicalData = new ArrayList<String[]>();
			sendOverSocket(null, "{\"type\": \"started\"}");
			Simulator sim = Simulator.INSTANCE;
			now = new Date();
			notifyChanged(sim.getCurrentTime(), getModel().getComponentInfos());
			for (ComponentInfo info : getModel().getComponentInfos()) {
				if (info instanceof StoreInfo) {
					int itemCount = ((StoreInfo) info).getStoredItems().size();
					notifyStoreChange(sim.getCurrentTime(), info.getComponent(), itemCount, itemCount);
				}
				notifyChangedBusy(sim.getCurrentTime(), info.getComponent(), false, info.isIsBusy());
			}
		}

		public void configSimulatorAndRun() {
			Simulator simulator = Simulator.getInstance();
			Map<ConnectorInfo, Object> associatedObjects = new HashMap<>();
			Map<ComponentInfo, Boolean> componentBusy = new HashMap<>();
			Map<ComponentInfo, Integer> componentStoreCount = new HashMap<>();
			simulator.addPreEventListener(this, new EventListener() {

				@Override
				public void haveEvent(Simulator This, Event ev) {

					associatedObjects.clear();

					for (ComponentInfo comp : model.getComponentInfos()) {
						for (ConnectorInfo con : comp.getOutputConnectors()) {
							associatedObjects.put(con, con.getItem());
						}

						componentBusy.put(comp, comp.isIsBusy());
						if (comp instanceof StoreInfo) {
							componentStoreCount.put(comp, ((StoreInfo) comp).getStoredItems().size());
						}
					}

				}
			});
			simulator.addPostEventListener(this, new EventListener() {

				@Override
				public void haveEvent(Simulator This, Event ev) {

					for (ComponentInfo comp : model.getComponentInfos()) {
						for (ConnectorInfo con : comp.getOutputConnectors()) {
							Object prevItem = associatedObjects.get(con);
							ItemInfo curItem = con.getItem();
							if (curItem != prevItem) {
								// Something could have changed
								Set<ComponentInfo> comps = new HashSet<>();
								comps.add(comp);
								ComponentInfo exitComp = model.getComponentInfos().stream()
										.filter(ci -> ci.getComponent()
												.equals((Component) con.getConnector().getExit().eContainer()))
										.findFirst().orElse(null);
								if (exitComp != null) {
									comps.add(exitComp);
								}

								notifyChanged(This.getCurrentTime(), comps);
							}
						}
						Boolean wasBusy = componentBusy.get(comp);
						Boolean isBusy = comp.isIsBusy();
						if (wasBusy != isBusy) {
							notifyChangedBusy(This.getCurrentTime(), comp.getComponent(), wasBusy, isBusy);
						}
						if (comp instanceof StoreInfo) {
							Integer oldCount = componentStoreCount.get(comp);
							Integer newCount = ((StoreInfo) comp).getStoredItems().size();
							if (Integer.compare(oldCount, newCount) != 0) {
								notifyStoreChange(This.getCurrentTime(), comp.getComponent(), oldCount, newCount);
							}
						}
					}

				}
			});
			simulator.addFinishedListener(this, new EventListener() {

				@Override
				public void haveEvent(Simulator This, Event ev) {
					notifyFinished();
					persistModel();
				}

			});
			simulator.addStartedListener(this, new EventListener() {
				@Override
				public void haveEvent(Simulator This, Event ev) {
					notifyStarted();
				}
			});
		}

		private void persistModel() {
			ModelStore.store(model,
					"execution/" + model.getSystem().getName() + "_" + System.currentTimeMillis() + ".stlsimulation");

		}

	}

}
