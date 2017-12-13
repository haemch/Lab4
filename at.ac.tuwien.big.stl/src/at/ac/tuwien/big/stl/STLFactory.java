/**
 */
package at.ac.tuwien.big.stl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.stl.STLPackage
 * @generated
 */
public interface STLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	STLFactory eINSTANCE = at.ac.tuwien.big.stl.impl.STLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area</em>'.
	 * @generated
	 */
	Area createArea();

	/**
	 * Returns a new object of class '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store</em>'.
	 * @generated
	 */
	ProductStore createProductStore();

	/**
	 * Returns a new object of class '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Generator</em>'.
	 * @generated
	 */
	ItemGenerator createItemGenerator();

	/**
	 * Returns a new object of class '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor</em>'.
	 * @generated
	 */
	Conveyor createConveyor();

	/**
	 * Returns a new object of class '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Table</em>'.
	 * @generated
	 */
	TurnTable createTurnTable();

	/**
	 * Returns a new object of class '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot</em>'.
	 * @generated
	 */
	Slot createSlot();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waste Store</em>'.
	 * @generated
	 */
	WasteStore createWasteStore();

	/**
	 * Returns a new object of class '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer</em>'.
	 * @generated
	 */
	Buffer createBuffer();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type</em>'.
	 * @generated
	 */
	ItemType createItemType();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	STLPackage getSTLPackage();

} //STLFactory
