package at.ac.tuwien.big.stl.simulation.simulator;



import at.ac.tuwien.big.stl.simulation.simulator.impl.EventImpl;
import at.ac.tuwien.big.stl.simulation.simulator.impl.SimulatorImpl;

public interface Simulator {
	
	public static final Simulator INSTANCE = new SimulatorImpl();
	
	public static final int BROKEN_PRODUCT = 666;
	
	public void priv_addEvent(Event ev);
	
	public long getCurrentTime();
	
	/**This event is automatically processed*/
	public default Event addEvent(long atTime, EventRunnable runnable) {
		Event ev = new EventImpl(this, atTime, runnable);
		priv_addEvent(ev);
		return ev;
	}
	
	public default Event scheduleEvent(long inTime, EventRunnable runnable) {
		return addEvent(getCurrentTime()+inTime,runnable);
	}
	
	public static Event staticSchedule(long inTime, EventRunnable runnable) {
		return getInstance().scheduleEvent(inTime, runnable);
	}
	
	public default Event startEvent(EventRunnable runnable) {
		return addEvent(getCurrentTime(),runnable);
	}
	
	public interface EventListener {
		public void haveEvent(Simulator This, Event ev);
	}
	
	public void addPreEventListener(Object identifier, EventListener listener);
	
	public void addPostEventListener(Object identifier, EventListener listener);
	
	public void clearEventListener(Object identifier);

	/**Initializes this simulator - clears remaining events*/
	public void init(double speed);
	
	public void run();

	public static Simulator getInstance() {
		return INSTANCE;
	}

	public void setTimeout(long simulationTime);

	public void addFinishedListener(Object identifier, EventListener eventListener);

	public boolean isRunning();

	public void addStartedListener(Object identifier, EventListener eventListener);


}
