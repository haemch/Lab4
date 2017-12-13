/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.SimConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl#getSimulationTime <em>Simulation Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl#getBudget <em>Budget</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl#getRemainingBudget <em>Remaining Budget</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl#getItemThroughput <em>Item Throughput</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl#getAverageLatency <em>Average Latency</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl#getAverageQuality <em>Average Quality</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl#getSimSpeed <em>Sim Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimConfigurationImpl extends MinimalEObjectImpl.Container implements SimConfiguration {
	/**
	 * The default value of the '{@link #getSimulationTime() <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long SIMULATION_TIME_EDEFAULT = 28800000L;

	/**
	 * The cached value of the '{@link #getSimulationTime() <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTime()
	 * @generated
	 * @ordered
	 */
	protected long simulationTime = SIMULATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected static final int BUDGET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected int budget = BUDGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingBudget() <em>Remaining Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingBudget()
	 * @generated
	 * @ordered
	 */
	protected static final int REMAINING_BUDGET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemainingBudget() <em>Remaining Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingBudget()
	 * @generated
	 * @ordered
	 */
	protected int remainingBudget = REMAINING_BUDGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemThroughput() <em>Item Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final int ITEM_THROUGHPUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getItemThroughput() <em>Item Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemThroughput()
	 * @generated
	 * @ordered
	 */
	protected int itemThroughput = ITEM_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageLatency() <em>Average Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageLatency()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_LATENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAverageLatency() <em>Average Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageLatency()
	 * @generated
	 * @ordered
	 */
	protected double averageLatency = AVERAGE_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageQuality() <em>Average Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageQuality()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_QUALITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getAverageQuality() <em>Average Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageQuality()
	 * @generated
	 * @ordered
	 */
	protected double averageQuality = AVERAGE_QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimSpeed() <em>Sim Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SIM_SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSimSpeed() <em>Sim Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimSpeed()
	 * @generated
	 * @ordered
	 */
	protected double simSpeed = SIM_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLSimulationPackage.Literals.SIM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSimulationTime() {
		return simulationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationTime(long newSimulationTime) {
		long oldSimulationTime = simulationTime;
		simulationTime = newSimulationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STLSimulationPackage.SIM_CONFIGURATION__SIMULATION_TIME, oldSimulationTime, simulationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBudget() {
		return budget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudget(int newBudget) {
		int oldBudget = budget;
		budget = newBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.SIM_CONFIGURATION__BUDGET,
					oldBudget, budget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemainingBudget() {
		return remainingBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingBudget(int newRemainingBudget) {
		int oldRemainingBudget = remainingBudget;
		remainingBudget = newRemainingBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STLSimulationPackage.SIM_CONFIGURATION__REMAINING_BUDGET, oldRemainingBudget, remainingBudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getItemThroughput() {
		return itemThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemThroughput(int newItemThroughput) {
		int oldItemThroughput = itemThroughput;
		itemThroughput = newItemThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STLSimulationPackage.SIM_CONFIGURATION__ITEM_THROUGHPUT, oldItemThroughput, itemThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverageLatency() {
		return averageLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageLatency(double newAverageLatency) {
		double oldAverageLatency = averageLatency;
		averageLatency = newAverageLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_LATENCY, oldAverageLatency, averageLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverageQuality() {
		return averageQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageQuality(double newAverageQuality) {
		double oldAverageQuality = averageQuality;
		averageQuality = newAverageQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_QUALITY, oldAverageQuality, averageQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSimSpeed() {
		return simSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimSpeed(double newSimSpeed) {
		double oldSimSpeed = simSpeed;
		simSpeed = newSimSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.SIM_CONFIGURATION__SIM_SPEED,
					oldSimSpeed, simSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STLSimulationPackage.SIM_CONFIGURATION__SIMULATION_TIME:
			return getSimulationTime();
		case STLSimulationPackage.SIM_CONFIGURATION__BUDGET:
			return getBudget();
		case STLSimulationPackage.SIM_CONFIGURATION__REMAINING_BUDGET:
			return getRemainingBudget();
		case STLSimulationPackage.SIM_CONFIGURATION__ITEM_THROUGHPUT:
			return getItemThroughput();
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_LATENCY:
			return getAverageLatency();
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_QUALITY:
			return getAverageQuality();
		case STLSimulationPackage.SIM_CONFIGURATION__SIM_SPEED:
			return getSimSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STLSimulationPackage.SIM_CONFIGURATION__SIMULATION_TIME:
			setSimulationTime((Long) newValue);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__BUDGET:
			setBudget((Integer) newValue);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__REMAINING_BUDGET:
			setRemainingBudget((Integer) newValue);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__ITEM_THROUGHPUT:
			setItemThroughput((Integer) newValue);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_LATENCY:
			setAverageLatency((Double) newValue);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_QUALITY:
			setAverageQuality((Double) newValue);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__SIM_SPEED:
			setSimSpeed((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STLSimulationPackage.SIM_CONFIGURATION__SIMULATION_TIME:
			setSimulationTime(SIMULATION_TIME_EDEFAULT);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__BUDGET:
			setBudget(BUDGET_EDEFAULT);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__REMAINING_BUDGET:
			setRemainingBudget(REMAINING_BUDGET_EDEFAULT);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__ITEM_THROUGHPUT:
			setItemThroughput(ITEM_THROUGHPUT_EDEFAULT);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_LATENCY:
			setAverageLatency(AVERAGE_LATENCY_EDEFAULT);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_QUALITY:
			setAverageQuality(AVERAGE_QUALITY_EDEFAULT);
			return;
		case STLSimulationPackage.SIM_CONFIGURATION__SIM_SPEED:
			setSimSpeed(SIM_SPEED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STLSimulationPackage.SIM_CONFIGURATION__SIMULATION_TIME:
			return simulationTime != SIMULATION_TIME_EDEFAULT;
		case STLSimulationPackage.SIM_CONFIGURATION__BUDGET:
			return budget != BUDGET_EDEFAULT;
		case STLSimulationPackage.SIM_CONFIGURATION__REMAINING_BUDGET:
			return remainingBudget != REMAINING_BUDGET_EDEFAULT;
		case STLSimulationPackage.SIM_CONFIGURATION__ITEM_THROUGHPUT:
			return itemThroughput != ITEM_THROUGHPUT_EDEFAULT;
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_LATENCY:
			return averageLatency != AVERAGE_LATENCY_EDEFAULT;
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_QUALITY:
			return averageQuality != AVERAGE_QUALITY_EDEFAULT;
		case STLSimulationPackage.SIM_CONFIGURATION__SIM_SPEED:
			return simSpeed != SIM_SPEED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (simulationTime: ");
		result.append(simulationTime);
		result.append(", budget: ");
		result.append(budget);
		result.append(", remainingBudget: ");
		result.append(remainingBudget);
		result.append(", itemThroughput: ");
		result.append(itemThroughput);
		result.append(", averageLatency: ");
		result.append(averageLatency);
		result.append(", averageQuality: ");
		result.append(averageQuality);
		result.append(", simSpeed: ");
		result.append(simSpeed);
		result.append(')');
		return result.toString();
	}

} //SimConfigurationImpl
