package at.ac.tuwien.big.stl.simulation.simulator;

public interface Event {

	public Simulator getSimulator();
	
	public long getTime();
	
	public void processEvent();
	
	public default Event scheduleIn(long ms, EventRunnable runnable) {
		return getSimulator().addEvent(getTime()+ms, runnable);
	}
	
	public default Event scheduleAt(long ms, EventRunnable runnable) {
		return getSimulator().addEvent(ms, runnable);
	}
		
}
