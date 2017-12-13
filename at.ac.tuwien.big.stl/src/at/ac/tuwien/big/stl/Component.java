/**
 */
package at.ac.tuwien.big.stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.Component#getCost <em>Cost</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Component#getServices <em>Services</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Component#getOutputSlots <em>Output Slots</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Component#getInputSlots <em>Input Slots</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see at.ac.tuwien.big.stl.STLPackage#getComponent_Cost()
	 * @model required="true"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Component#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getComponent_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Output Slots</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Slots</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getComponent_OutputSlots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slot> getOutputSlots();

	/**
	 * Returns the value of the '<em><b>Input Slots</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Slots</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getComponent_InputSlots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slot> getInputSlots();

} // Component
