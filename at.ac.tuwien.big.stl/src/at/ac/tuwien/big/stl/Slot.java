/**
 */
package at.ac.tuwien.big.stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.Slot#getRequiredType <em>Required Type</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Required Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Type</em>' reference.
	 * @see #setRequiredType(ItemType)
	 * @see at.ac.tuwien.big.stl.STLPackage#getSlot_RequiredType()
	 * @model required="true"
	 * @generated
	 */
	ItemType getRequiredType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Slot#getRequiredType <em>Required Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Type</em>' reference.
	 * @see #getRequiredType()
	 * @generated
	 */
	void setRequiredType(ItemType value);

} // Slot
