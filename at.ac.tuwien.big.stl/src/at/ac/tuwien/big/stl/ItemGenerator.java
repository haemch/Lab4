/**
 */
package at.ac.tuwien.big.stl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.ItemGenerator#getGeneratedType <em>Generated Type</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getItemGenerator()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoInputSlot OneOutputslot ItemTypeHasToMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoInputSlot='inputSlots-&gt;size() = 0' OneOutputslot='outputSlots-&gt;size() = 1' ItemTypeHasToMatch='outputSlots-&gt;forAll(s | s.requiredType = generatedType)'"
 * @generated
 */
public interface ItemGenerator extends Component {
	/**
	 * Returns the value of the '<em><b>Generated Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Type</em>' reference.
	 * @see #setGeneratedType(ItemType)
	 * @see at.ac.tuwien.big.stl.STLPackage#getItemGenerator_GeneratedType()
	 * @model required="true"
	 * @generated
	 */
	ItemType getGeneratedType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.ItemGenerator#getGeneratedType <em>Generated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Type</em>' reference.
	 * @see #getGeneratedType()
	 * @generated
	 */
	void setGeneratedType(ItemType value);

} // ItemGenerator
