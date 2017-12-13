/**
 */
package at.ac.tuwien.big.stl.simulation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getComponentInfos <em>Component Infos</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getSystem <em>System</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getConnectorInfos <em>Connector Infos</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimulationModel()
 * @model
 * @generated
 */
public interface SimulationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(SimConfiguration)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimulationModel_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	SimConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(SimConfiguration value);

	/**
	 * Returns the value of the '<em><b>Component Infos</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.simulation.ComponentInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Infos</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimulationModel_ComponentInfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInfo> getComponentInfos();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(at.ac.tuwien.big.stl.System)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimulationModel_System()
	 * @model
	 * @generated
	 */
	at.ac.tuwien.big.stl.System getSystem();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(at.ac.tuwien.big.stl.System value);

	/**
	 * Returns the value of the '<em><b>Connector Infos</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.simulation.ConnectorInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Infos</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getSimulationModel_ConnectorInfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorInfo> getConnectorInfos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void simulate();

} // SimulationModel
