/**
 */
package at.ac.tuwien.big.stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.System#getAreas <em>Areas</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.System#getItemTypes <em>Item Types</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getSystem_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getAreas();

	/**
	 * Returns the value of the '<em><b>Item Types</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Types</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getSystem_ItemTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemType> getItemTypes();

} // System
