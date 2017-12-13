/**
 */
package at.ac.tuwien.big.stl.simulation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage
 * @generated
 */
public interface STLSimulationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	STLSimulationFactory eINSTANCE = at.ac.tuwien.big.stl.simulation.impl.STLSimulationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sim Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sim Configuration</em>'.
	 * @generated
	 */
	SimConfiguration createSimConfiguration();

	/**
	 * Returns a new object of class '<em>Item Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Info</em>'.
	 * @generated
	 */
	ItemInfo createItemInfo();

	/**
	 * Returns a new object of class '<em>Connector Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Info</em>'.
	 * @generated
	 */
	ConnectorInfo createConnectorInfo();

	/**
	 * Returns a new object of class '<em>Component Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Info</em>'.
	 * @generated
	 */
	ComponentInfo createComponentInfo();

	/**
	 * Returns a new object of class '<em>Simulation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Model</em>'.
	 * @generated
	 */
	SimulationModel createSimulationModel();

	/**
	 * Returns a new object of class '<em>Store Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Info</em>'.
	 * @generated
	 */
	StoreInfo createStoreInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	STLSimulationPackage getSTLSimulationPackage();

} //STLSimulationFactory
