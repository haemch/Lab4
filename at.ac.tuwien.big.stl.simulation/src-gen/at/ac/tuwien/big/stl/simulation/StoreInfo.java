/**
 */
package at.ac.tuwien.big.stl.simulation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.StoreInfo#getStoredItems <em>Stored Items</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getStoreInfo()
 * @model
 * @generated
 */
public interface StoreInfo extends ComponentInfo {
	/**
	 * Returns the value of the '<em><b>Stored Items</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.simulation.ItemInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Items</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getStoreInfo_StoredItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemInfo> getStoredItems();

} // StoreInfo
