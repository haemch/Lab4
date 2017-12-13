/**
 */
package at.ac.tuwien.big.stl.simulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimulationTime <em>Simulation Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getBudget <em>Budget</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getRemainingBudget <em>Remaining Budget</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getItemThroughput <em>Item Throughput</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageLatency <em>Average Latency</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageQuality <em>Average Quality</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimSpeed <em>Sim Speed</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration()
 * @model
 * @generated
 */
public interface SimConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Simulation Time</b></em>' attribute.
	 * The default value is <code>"28800000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Time</em>' attribute.
	 * @see #setSimulationTime(long)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration_SimulationTime()
	 * @model default="28800000" required="true"
	 * @generated
	 */
	long getSimulationTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimulationTime <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Time</em>' attribute.
	 * @see #getSimulationTime()
	 * @generated
	 */
	void setSimulationTime(long value);

	/**
	 * Returns the value of the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' attribute.
	 * @see #setBudget(int)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration_Budget()
	 * @model required="true"
	 * @generated
	 */
	int getBudget();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getBudget <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' attribute.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(int value);

	/**
	 * Returns the value of the '<em><b>Remaining Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Budget</em>' attribute.
	 * @see #setRemainingBudget(int)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration_RemainingBudget()
	 * @model required="true"
	 * @generated
	 */
	int getRemainingBudget();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getRemainingBudget <em>Remaining Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Budget</em>' attribute.
	 * @see #getRemainingBudget()
	 * @generated
	 */
	void setRemainingBudget(int value);

	/**
	 * Returns the value of the '<em><b>Item Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Throughput</em>' attribute.
	 * @see #setItemThroughput(int)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration_ItemThroughput()
	 * @model required="true"
	 * @generated
	 */
	int getItemThroughput();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getItemThroughput <em>Item Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Throughput</em>' attribute.
	 * @see #getItemThroughput()
	 * @generated
	 */
	void setItemThroughput(int value);

	/**
	 * Returns the value of the '<em><b>Average Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Latency</em>' attribute.
	 * @see #setAverageLatency(double)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration_AverageLatency()
	 * @model required="true"
	 * @generated
	 */
	double getAverageLatency();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageLatency <em>Average Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Latency</em>' attribute.
	 * @see #getAverageLatency()
	 * @generated
	 */
	void setAverageLatency(double value);

	/**
	 * Returns the value of the '<em><b>Average Quality</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Quality</em>' attribute.
	 * @see #setAverageQuality(double)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration_AverageQuality()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getAverageQuality();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageQuality <em>Average Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Quality</em>' attribute.
	 * @see #getAverageQuality()
	 * @generated
	 */
	void setAverageQuality(double value);

	/**
	 * Returns the value of the '<em><b>Sim Speed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Speed</em>' attribute.
	 * @see #setSimSpeed(double)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimConfiguration_SimSpeed()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getSimSpeed();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimSpeed <em>Sim Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Speed</em>' attribute.
	 * @see #getSimSpeed()
	 * @generated
	 */
	void setSimSpeed(double value);

} // SimConfiguration
