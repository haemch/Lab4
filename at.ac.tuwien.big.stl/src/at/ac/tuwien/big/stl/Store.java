/**
 */
package at.ac.tuwien.big.stl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.Store#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getStore()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneInputSlot NoOutputSlot'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneInputSlot='inputSlots-&gt;size() = 1' NoOutputSlot='outputSlots-&gt;size() = 0'"
 * @generated
 */
public interface Store extends Component {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see at.ac.tuwien.big.stl.STLPackage#getStore_Capacity()
	 * @model default="5" required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Store#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Store
