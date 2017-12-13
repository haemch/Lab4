package at.ac.tuwien.big.stl.simulation.simulator.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import at.ac.tuwien.big.stl.simulation.simulator.Event;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator;

public class SimulatorImpl implements Simulator {

	PriorityQueue<Event> queue = new PriorityQueue<Event>(new Comparator<Event>() {

		@Override
		public int compare(Event o1, Event o2) {
			int ret = Long.compare(o1.getTime(), o2.getTime());
			if (ret != 0) {
				return ret;
			}
			return System.identityHashCode(o1) - System.identityHashCode(o2);
		}
	});

	@Override
	public void priv_addEvent(Event ev) {
		queue.add(ev);
	}

	private long currentTime = 0;
	private long timeout = Long.MAX_VALUE;
	private double speed;
	private boolean isRunning = false;

	@Override
	public void init(double speed) {
		queue.clear();
		this.speed = speed;
	}

	@Override
	public synchronized void run() {
		isRunning = true;
		currentTime = 0;
		long startTime = new Date().getTime();
		double speedInv = 1.0 / speed;
		for (Set<EventListener> preL : idToStartedEvents.values()) {
			for (EventListener l : preL) {
				l.haveEvent(this, null);
			}
		}
		try {
			while (!queue.isEmpty()) {
				Event ev = queue.poll();
				currentTime = ev.getTime();

				if (currentTime > timeout) {
					return;
				}
				if (speed > 0) {
					long targetTime = (long) (speedInv * currentTime + startTime) - new Date().getTime();
					if (targetTime > 0) {
						try {
							Thread.sleep(targetTime);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				for (Set<EventListener> preL : idToPreEvents.values()) {
					for (EventListener l : preL) {
						l.haveEvent(this, ev);
					}
				}
				// System.out.println("Processing event" + ev+" at time
				// "+currentTime+"/"+timeout);
				ev.processEvent();
				for (Set<EventListener> preL : idToPostEvents.values()) {
					for (EventListener l : preL) {
						l.haveEvent(this, ev);
					}
				}
			}
		} finally {
			for (Set<EventListener> preL : idToFinishedEvents.values()) {
				for (EventListener l : preL) {
					l.haveEvent(this, null);
				}
			}
			isRunning = false;
		}
	}

	@Override
	public long getCurrentTime() {
		return currentTime;
	}

	@Override
	public void setTimeout(long simulationTime) {
		this.timeout = simulationTime;
	}

	private Map<Object, Set<EventListener>> idToPreEvents = new HashMap<>();
	private Map<Object, Set<EventListener>> idToPostEvents = new HashMap<>();
	private Map<Object, Set<EventListener>> idToFinishedEvents = new HashMap<>();
	private Map<Object, Set<EventListener>> idToStartedEvents = new HashMap<>();

	@Override
	public void addPreEventListener(Object identifier, EventListener listener) {
		idToPreEvents.putIfAbsent(identifier, new HashSet<Simulator.EventListener>());
		idToPreEvents.get(identifier).add(listener);

	}

	@Override
	public void addPostEventListener(Object identifier, EventListener listener) {
		idToPostEvents.putIfAbsent(identifier, new HashSet<Simulator.EventListener>());
		idToPostEvents.get(identifier).add(listener);
	}

	@Override
	public void addStartedListener(Object identifier, EventListener listener) {
		idToStartedEvents.putIfAbsent(identifier, new HashSet<Simulator.EventListener>());
		idToStartedEvents.get(identifier).add(listener);
	}

	@Override
	public void addFinishedListener(Object identifier, EventListener listener) {
		idToFinishedEvents.putIfAbsent(identifier, new HashSet<Simulator.EventListener>());
		idToFinishedEvents.get(identifier).add(listener);
	}

	@Override
	public void clearEventListener(Object identifier) {
		idToPreEvents.remove(identifier);
		idToPostEvents.remove(identifier);
		idToFinishedEvents.remove(identifier);
	}

	@Override
	public boolean isRunning() {
		return isRunning;

	}

}
