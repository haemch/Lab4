package at.ac.tuwien.big.stl.simulation.simulator.impl;

import at.ac.tuwien.big.stl.simulation.simulator.Event;
import at.ac.tuwien.big.stl.simulation.simulator.EventRunnable;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator;

public class EventImpl implements Event {

	private Simulator simulator;
	private EventRunnable runnable;
	private long time;
	
	public EventImpl(Simulator simulator, long time, EventRunnable runnable) {
		this.simulator = simulator;
		this.time = time;
		this.runnable = runnable;
	}
	
	public Simulator getSimulator() {
		return simulator;
	}

	@Override
	public long getTime() {
		return time;
	}

	@Override
	public void processEvent() {
		runnable.run(this,time);
	}
	

	public String toString() {
		return time+": "+runnable;
	}
	
	
}
