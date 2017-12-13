/**
 */
package at.ac.tuwien.big.stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.Area#getComponents <em>Components</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Area#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getArea_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getArea_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // Area
