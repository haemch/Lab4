/**
 */
package at.ac.tuwien.big.stl.simulation;

import at.ac.tuwien.big.stl.Connector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getItem <em>Item</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getConnector <em>Connector</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getRequiredState <em>Required State</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getConnectorInfo()
 * @model
 * @generated
 */
public interface ConnectorInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(ItemInfo)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getConnectorInfo_Item()
	 * @model containment="true"
	 * @generated
	 */
	ItemInfo getItem();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(ItemInfo value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getConnectorInfo_Connector()
	 * @model
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Required State</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required State</em>' attribute.
	 * @see #setRequiredState(int)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getConnectorInfo_RequiredState()
	 * @model default="-1"
	 * @generated
	 */
	int getRequiredState();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getRequiredState <em>Required State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required State</em>' attribute.
	 * @see #getRequiredState()
	 * @generated
	 */
	void setRequiredState(int value);

	boolean doesFit(ItemInfo item);

} // ConnectorInfo
