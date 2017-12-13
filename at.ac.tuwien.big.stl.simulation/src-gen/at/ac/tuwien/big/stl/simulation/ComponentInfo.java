/**
 */
package at.ac.tuwien.big.stl.simulation;

import at.ac.tuwien.big.stl.Component;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#isIsBusy <em>Is Busy</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getComponent <em>Component</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getReliability <em>Reliability</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getOutputConnectors <em>Output Connectors</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getInputConnectors <em>Input Connectors</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getMinInput <em>Min Input</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo()
 * @model
 * @generated
 */
public interface ComponentInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Busy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Busy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Busy</em>' attribute.
	 * @see #setIsBusy(boolean)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_IsBusy()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsBusy();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#isIsBusy <em>Is Busy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Busy</em>' attribute.
	 * @see #isIsBusy()
	 * @generated
	 */
	void setIsBusy(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(long)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_CreationTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getCreationTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(long value);

	/**
	 * Returns the value of the '<em><b>Use Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time</em>' attribute.
	 * @see #setUseTime(long)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_UseTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getUseTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getUseTime <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time</em>' attribute.
	 * @see #getUseTime()
	 * @generated
	 */
	void setUseTime(long value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(double)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_Utilization()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getUtilization();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(double value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Input Connectors</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.simulation.ConnectorInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connectors</em>' reference list.
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_InputConnectors()
	 * @model
	 * @generated
	 */
	EList<ConnectorInfo> getInputConnectors();

	/**
	 * Returns the value of the '<em><b>Min Input</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Input</em>' attribute.
	 * @see #setMinInput(int)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_MinInput()
	 * @model default="1"
	 * @generated
	 */
	int getMinInput();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getMinInput <em>Min Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Input</em>' attribute.
	 * @see #getMinInput()
	 * @generated
	 */
	void setMinInput(int value);

	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' attribute.
	 * @see #setProcessingTime(int)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_ProcessingTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getProcessingTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getProcessingTime <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' attribute.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(int value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(double)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_Reliability()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getReliability();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(double value);

	/**
	 * Returns the value of the '<em><b>Output Connectors</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.simulation.ConnectorInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connectors</em>' reference list.
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getComponentInfo_OutputConnectors()
	 * @model
	 * @generated
	 */
	EList<ConnectorInfo> getOutputConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean process();

} // ComponentInfo
