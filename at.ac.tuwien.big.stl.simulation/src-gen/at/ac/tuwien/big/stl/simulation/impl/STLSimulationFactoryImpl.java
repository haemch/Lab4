/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import at.ac.tuwien.big.stl.simulation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STLSimulationFactoryImpl extends EFactoryImpl implements STLSimulationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static STLSimulationFactory init() {
		try {
			STLSimulationFactory theSTLSimulationFactory = (STLSimulationFactory) EPackage.Registry.INSTANCE
					.getEFactory(STLSimulationPackage.eNS_URI);
			if (theSTLSimulationFactory != null) {
				return theSTLSimulationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new STLSimulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLSimulationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case STLSimulationPackage.SIM_CONFIGURATION:
			return createSimConfiguration();
		case STLSimulationPackage.COMPONENT_INFO:
			return createComponentInfo();
		case STLSimulationPackage.SIMULATION_MODEL:
			return createSimulationModel();
		case STLSimulationPackage.STORE_INFO:
			return createStoreInfo();
		case STLSimulationPackage.ITEM_INFO:
			return createItemInfo();
		case STLSimulationPackage.CONNECTOR_INFO:
			return createConnectorInfo();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimConfiguration createSimConfiguration() {
		SimConfigurationImpl simConfiguration = new SimConfigurationImpl();
		return simConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemInfo createItemInfo() {
		ItemInfoImpl itemInfo = new ItemInfoImpl();
		return itemInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorInfo createConnectorInfo() {
		ConnectorInfoImpl connectorInfo = new ConnectorInfoImpl();
		return connectorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInfo createComponentInfo() {
		ComponentInfoImpl componentInfo = new ComponentInfoImpl();
		return componentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationModel createSimulationModel() {
		SimulationModelImpl simulationModel = new SimulationModelImpl();
		return simulationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreInfo createStoreInfo() {
		StoreInfoImpl storeInfo = new StoreInfoImpl();
		return storeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLSimulationPackage getSTLSimulationPackage() {
		return (STLSimulationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static STLSimulationPackage getPackage() {
		return STLSimulationPackage.eINSTANCE;
	}

} //STLSimulationFactoryImpl
