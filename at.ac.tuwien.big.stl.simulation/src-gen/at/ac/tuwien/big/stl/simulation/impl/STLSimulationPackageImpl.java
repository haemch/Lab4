/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import at.ac.tuwien.big.stl.STLPackage;

import at.ac.tuwien.big.stl.simulation.ComponentInfo;
import at.ac.tuwien.big.stl.simulation.ConnectorInfo;
import at.ac.tuwien.big.stl.simulation.ItemInfo;
import at.ac.tuwien.big.stl.simulation.STLSimulationFactory;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.SimConfiguration;
import at.ac.tuwien.big.stl.simulation.SimulationModel;
import at.ac.tuwien.big.stl.simulation.StoreInfo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STLSimulationPackageImpl extends EPackageImpl implements STLSimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeInfoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private STLSimulationPackageImpl() {
		super(eNS_URI, STLSimulationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link STLSimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static STLSimulationPackage init() {
		if (isInited)
			return (STLSimulationPackage) EPackage.Registry.INSTANCE.getEPackage(STLSimulationPackage.eNS_URI);

		// Obtain or create and register package
		STLSimulationPackageImpl theSTLSimulationPackage = (STLSimulationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof STLSimulationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new STLSimulationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		STLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSTLSimulationPackage.createPackageContents();

		// Initialize created meta-data
		theSTLSimulationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSTLSimulationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(STLSimulationPackage.eNS_URI, theSTLSimulationPackage);
		return theSTLSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimConfiguration() {
		return simConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimConfiguration_SimulationTime() {
		return (EAttribute) simConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimConfiguration_Budget() {
		return (EAttribute) simConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimConfiguration_RemainingBudget() {
		return (EAttribute) simConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimConfiguration_ItemThroughput() {
		return (EAttribute) simConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimConfiguration_AverageLatency() {
		return (EAttribute) simConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimConfiguration_AverageQuality() {
		return (EAttribute) simConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimConfiguration_SimSpeed() {
		return (EAttribute) simConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemInfo() {
		return itemInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInfo_Itemtype() {
		return (EReference) itemInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInfo_CreationTime() {
		return (EAttribute) itemInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInfo_Name() {
		return (EAttribute) itemInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInfo_State() {
		return (EAttribute) itemInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorInfo() {
		return connectorInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInfo_Item() {
		return (EReference) connectorInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInfo_Connector() {
		return (EReference) connectorInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorInfo_RequiredState() {
		return (EAttribute) connectorInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInfo_FinalizationTime() {
		return (EAttribute) itemInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInfo_TotalLatency() {
		return (EAttribute) itemInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInfo_Quality() {
		return (EAttribute) itemInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInfo() {
		return componentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_IsBusy() {
		return (EAttribute) componentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_CreationTime() {
		return (EAttribute) componentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_UseTime() {
		return (EAttribute) componentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_Utilization() {
		return (EAttribute) componentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInfo_Component() {
		return (EReference) componentInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInfo_InputConnectors() {
		return (EReference) componentInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_MinInput() {
		return (EAttribute) componentInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_ProcessingTime() {
		return (EAttribute) componentInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInfo_Reliability() {
		return (EAttribute) componentInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInfo_OutputConnectors() {
		return (EReference) componentInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentInfo__Process() {
		return componentInfoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationModel() {
		return simulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationModel_Configuration() {
		return (EReference) simulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationModel_ComponentInfos() {
		return (EReference) simulationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationModel_System() {
		return (EReference) simulationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationModel_ConnectorInfos() {
		return (EReference) simulationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimulationModel__Simulate() {
		return simulationModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreInfo() {
		return storeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreInfo_StoredItems() {
		return (EReference) storeInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLSimulationFactory getSTLSimulationFactory() {
		return (STLSimulationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		simConfigurationEClass = createEClass(SIM_CONFIGURATION);
		createEAttribute(simConfigurationEClass, SIM_CONFIGURATION__SIMULATION_TIME);
		createEAttribute(simConfigurationEClass, SIM_CONFIGURATION__BUDGET);
		createEAttribute(simConfigurationEClass, SIM_CONFIGURATION__REMAINING_BUDGET);
		createEAttribute(simConfigurationEClass, SIM_CONFIGURATION__ITEM_THROUGHPUT);
		createEAttribute(simConfigurationEClass, SIM_CONFIGURATION__AVERAGE_LATENCY);
		createEAttribute(simConfigurationEClass, SIM_CONFIGURATION__AVERAGE_QUALITY);
		createEAttribute(simConfigurationEClass, SIM_CONFIGURATION__SIM_SPEED);

		componentInfoEClass = createEClass(COMPONENT_INFO);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__IS_BUSY);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__CREATION_TIME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__USE_TIME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__UTILIZATION);
		createEReference(componentInfoEClass, COMPONENT_INFO__COMPONENT);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__PROCESSING_TIME);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__RELIABILITY);
		createEReference(componentInfoEClass, COMPONENT_INFO__OUTPUT_CONNECTORS);
		createEReference(componentInfoEClass, COMPONENT_INFO__INPUT_CONNECTORS);
		createEAttribute(componentInfoEClass, COMPONENT_INFO__MIN_INPUT);
		createEOperation(componentInfoEClass, COMPONENT_INFO___PROCESS);

		simulationModelEClass = createEClass(SIMULATION_MODEL);
		createEReference(simulationModelEClass, SIMULATION_MODEL__CONFIGURATION);
		createEReference(simulationModelEClass, SIMULATION_MODEL__COMPONENT_INFOS);
		createEReference(simulationModelEClass, SIMULATION_MODEL__SYSTEM);
		createEReference(simulationModelEClass, SIMULATION_MODEL__CONNECTOR_INFOS);
		createEOperation(simulationModelEClass, SIMULATION_MODEL___SIMULATE);

		storeInfoEClass = createEClass(STORE_INFO);
		createEReference(storeInfoEClass, STORE_INFO__STORED_ITEMS);

		itemInfoEClass = createEClass(ITEM_INFO);
		createEAttribute(itemInfoEClass, ITEM_INFO__FINALIZATION_TIME);
		createEAttribute(itemInfoEClass, ITEM_INFO__TOTAL_LATENCY);
		createEAttribute(itemInfoEClass, ITEM_INFO__QUALITY);
		createEReference(itemInfoEClass, ITEM_INFO__ITEMTYPE);
		createEAttribute(itemInfoEClass, ITEM_INFO__CREATION_TIME);
		createEAttribute(itemInfoEClass, ITEM_INFO__NAME);
		createEAttribute(itemInfoEClass, ITEM_INFO__STATE);

		connectorInfoEClass = createEClass(CONNECTOR_INFO);
		createEReference(connectorInfoEClass, CONNECTOR_INFO__ITEM);
		createEReference(connectorInfoEClass, CONNECTOR_INFO__CONNECTOR);
		createEAttribute(connectorInfoEClass, CONNECTOR_INFO__REQUIRED_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		STLPackage theSTLPackage = (STLPackage) EPackage.Registry.INSTANCE.getEPackage(STLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		storeInfoEClass.getESuperTypes().add(this.getComponentInfo());

		// Initialize classes, features, and operations; add parameters
		initEClass(simConfigurationEClass, SimConfiguration.class, "SimConfiguration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimConfiguration_SimulationTime(), ecorePackage.getELong(), "simulationTime", "28800000", 1,
				1, SimConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimConfiguration_Budget(), ecorePackage.getEInt(), "budget", null, 1, 1,
				SimConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimConfiguration_RemainingBudget(), ecorePackage.getEInt(), "remainingBudget", null, 1, 1,
				SimConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimConfiguration_ItemThroughput(), ecorePackage.getEInt(), "itemThroughput", null, 1, 1,
				SimConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimConfiguration_AverageLatency(), ecorePackage.getEDouble(), "averageLatency", null, 1, 1,
				SimConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimConfiguration_AverageQuality(), ecorePackage.getEDouble(), "averageQuality", "1.0", 1, 1,
				SimConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimConfiguration_SimSpeed(), ecorePackage.getEDouble(), "simSpeed", "0", 1, 1,
				SimConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(componentInfoEClass, ComponentInfo.class, "ComponentInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInfo_IsBusy(), ecorePackage.getEBoolean(), "isBusy", "false", 1, 1,
				ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_CreationTime(), ecorePackage.getELong(), "creationTime", "0", 1, 1,
				ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_UseTime(), ecorePackage.getELong(), "useTime", "0", 1, 1, ComponentInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_Utilization(), ecorePackage.getEDouble(), "utilization", "0.0", 1, 1,
				ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInfo_Component(), theSTLPackage.getComponent(), null, "component", null, 0, 1,
				ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_ProcessingTime(), ecorePackage.getEInt(), "processingTime", "0", 1, 1,
				ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_Reliability(), ecorePackage.getEDouble(), "reliability", "1.0", 1, 1,
				ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInfo_OutputConnectors(), this.getConnectorInfo(), null, "outputConnectors", null, 0,
				-1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInfo_InputConnectors(), this.getConnectorInfo(), null, "inputConnectors", null, 0,
				-1, ComponentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInfo_MinInput(), ecorePackage.getEInt(), "minInput", "1", 0, 1, ComponentInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComponentInfo__Process(), ecorePackage.getEBoolean(), "process", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simulationModelEClass, SimulationModel.class, "SimulationModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulationModel_Configuration(), this.getSimConfiguration(), null, "configuration", null, 0,
				1, SimulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationModel_ComponentInfos(), this.getComponentInfo(), null, "componentInfos", null, 0,
				-1, SimulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationModel_System(), theSTLPackage.getSystem(), null, "system", null, 0, 1,
				SimulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationModel_ConnectorInfos(), this.getConnectorInfo(), null, "connectorInfos", null, 0,
				-1, SimulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSimulationModel__Simulate(), null, "simulate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storeInfoEClass, StoreInfo.class, "StoreInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreInfo_StoredItems(), this.getItemInfo(), null, "storedItems", null, 0, -1,
				StoreInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemInfoEClass, ItemInfo.class, "ItemInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemInfo_FinalizationTime(), ecorePackage.getELong(), "finalizationTime", "0", 1, 1,
				ItemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemInfo_TotalLatency(), ecorePackage.getELong(), "totalLatency", "0", 1, 1, ItemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemInfo_Quality(), ecorePackage.getEDouble(), "quality", null, 1, 1, ItemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemInfo_Itemtype(), theSTLPackage.getItemType(), null, "itemtype", null, 0, 1,
				ItemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemInfo_CreationTime(), ecorePackage.getELong(), "creationTime", "0", 1, 1, ItemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemInfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, ItemInfo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemInfo_State(), ecorePackage.getEInt(), "state", "-1", 0, 1, ItemInfo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorInfoEClass, ConnectorInfo.class, "ConnectorInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorInfo_Item(), this.getItemInfo(), null, "item", null, 0, 1, ConnectorInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInfo_Connector(), theSTLPackage.getConnector(), null, "connector", null, 0, 1,
				ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorInfo_RequiredState(), ecorePackage.getEInt(), "requiredState", "-1", 0, 1,
				ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "at.ac.tuwien.big.stl",
				"../../at.ac.tuwien.big.stl/model/stl.ecore#/", "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
	}

} //STLSimulationPackageImpl
