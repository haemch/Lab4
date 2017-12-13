package at.ac.tuwien.big.stl.simulation.simulator;

public interface EventRunnable {
	
	public void run(Event ev, long startTime);

	public static EventRunnable fromRunnable(Runnable runnable) {
		return (ev,startTime)->runnable.run();
	}
}
