/**
 */
package at.ac.tuwien.big.stl.impl;

import at.ac.tuwien.big.stl.Area;
import at.ac.tuwien.big.stl.Buffer;
import at.ac.tuwien.big.stl.Component;
import at.ac.tuwien.big.stl.Connector;
import at.ac.tuwien.big.stl.Conveyor;
import at.ac.tuwien.big.stl.ItemGenerator;
import at.ac.tuwien.big.stl.ItemType;
import at.ac.tuwien.big.stl.Machine;
import at.ac.tuwien.big.stl.NamedElement;
import at.ac.tuwien.big.stl.Parameter;
import at.ac.tuwien.big.stl.ProductStore;
import at.ac.tuwien.big.stl.STLFactory;
import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.Service;
import at.ac.tuwien.big.stl.Slot;
import at.ac.tuwien.big.stl.Store;
import at.ac.tuwien.big.stl.TurnTable;
import at.ac.tuwien.big.stl.WasteStore;

import at.ac.tuwien.big.stl.util.STLValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STLPackageImpl extends EPackageImpl implements STLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wasteStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

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
	 * @see at.ac.tuwien.big.stl.STLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private STLPackageImpl() {
		super(eNS_URI, STLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link STLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static STLPackage init() {
		if (isInited) return (STLPackage)EPackage.Registry.INSTANCE.getEPackage(STLPackage.eNS_URI);

		// Obtain or create and register package
		STLPackageImpl theSTLPackage = (STLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof STLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new STLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSTLPackage.createPackageContents();

		// Initialize created meta-data
		theSTLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSTLPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return STLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSTLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(STLPackage.eNS_URI, theSTLPackage);
		return theSTLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Areas() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ItemTypes() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Components() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Connectors() {
		return (EReference)areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Cost() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Services() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OutputSlots() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_InputSlots() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductStore() {
		return productStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Capacity() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemGenerator() {
		return itemGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemGenerator_GeneratedType() {
		return (EReference)itemGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyor() {
		return conveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnTable() {
		return turnTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_RequiredType() {
		return (EReference)slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWasteStore() {
		return wasteStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer() {
		return bufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Cost() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ProcessingTime() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Reliability() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Parameters() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Description() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Entry() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Exit() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLFactory getSTLFactory() {
		return (STLFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__AREAS);
		createEReference(systemEClass, SYSTEM__ITEM_TYPES);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__COMPONENTS);
		createEReference(areaEClass, AREA__CONNECTORS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__COST);
		createEReference(componentEClass, COMPONENT__SERVICES);
		createEReference(componentEClass, COMPONENT__OUTPUT_SLOTS);
		createEReference(componentEClass, COMPONENT__INPUT_SLOTS);

		productStoreEClass = createEClass(PRODUCT_STORE);

		storeEClass = createEClass(STORE);
		createEAttribute(storeEClass, STORE__CAPACITY);

		itemGeneratorEClass = createEClass(ITEM_GENERATOR);
		createEReference(itemGeneratorEClass, ITEM_GENERATOR__GENERATED_TYPE);

		conveyorEClass = createEClass(CONVEYOR);

		turnTableEClass = createEClass(TURN_TABLE);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__REQUIRED_TYPE);

		machineEClass = createEClass(MACHINE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		wasteStoreEClass = createEClass(WASTE_STORE);

		bufferEClass = createEClass(BUFFER);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__COST);
		createEAttribute(serviceEClass, SERVICE__PROCESSING_TIME);
		createEAttribute(serviceEClass, SERVICE__RELIABILITY);
		createEReference(serviceEClass, SERVICE__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__DESCRIPTION);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__ENTRY);
		createEReference(connectorEClass, CONNECTOR__EXIT);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemEClass.getESuperTypes().add(this.getNamedElement());
		areaEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getNamedElement());
		productStoreEClass.getESuperTypes().add(this.getStore());
		storeEClass.getESuperTypes().add(this.getComponent());
		itemGeneratorEClass.getESuperTypes().add(this.getComponent());
		conveyorEClass.getESuperTypes().add(this.getComponent());
		turnTableEClass.getESuperTypes().add(this.getComponent());
		slotEClass.getESuperTypes().add(this.getNamedElement());
		machineEClass.getESuperTypes().add(this.getComponent());
		wasteStoreEClass.getESuperTypes().add(this.getStore());
		bufferEClass.getESuperTypes().add(this.getComponent());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		itemTypeEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, at.ac.tuwien.big.stl.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Areas(), this.getArea(), null, "areas", null, 0, -1, at.ac.tuwien.big.stl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ItemTypes(), this.getItemType(), null, "itemTypes", null, 0, -1, at.ac.tuwien.big.stl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_Components(), this.getComponent(), null, "components", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArea_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Cost(), ecorePackage.getEInt(), "cost", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Services(), this.getService(), null, "services", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OutputSlots(), this.getSlot(), null, "outputSlots", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_InputSlots(), this.getSlot(), null, "inputSlots", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreEClass, ProductStore.class, "ProductStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storeEClass, Store.class, "Store", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStore_Capacity(), ecorePackage.getEInt(), "capacity", "5", 1, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemGeneratorEClass, ItemGenerator.class, "ItemGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemGenerator_GeneratedType(), this.getItemType(), null, "generatedType", null, 1, 1, ItemGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conveyorEClass, Conveyor.class, "Conveyor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnTableEClass, TurnTable.class, "TurnTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_RequiredType(), this.getItemType(), null, "requiredType", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wasteStoreEClass, WasteStore.class, "WasteStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferEClass, Buffer.class, "Buffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Cost(), ecorePackage.getEInt(), "cost", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProcessingTime(), ecorePackage.getEInt(), "processingTime", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Reliability(), ecorePackage.getEDouble(), "reliability", "1.0", 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Entry(), this.getSlot(), null, "entry", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Exit(), this.getSlot(), null, "exit", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (storeEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneInputSlot NoOutputSlot"
		   });	
		addAnnotation
		  (itemGeneratorEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoInputSlot OneOutputslot ItemTypeHasToMatch"
		   });	
		addAnnotation
		  (conveyorEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneInputSlot OneOutputSlot"
		   });	
		addAnnotation
		  (turnTableEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneInputSlot AtLeastOneOutputslot"
		   });	
		addAnnotation
		  (machineEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneInputSlot AtLeastOneOutputslot"
		   });	
		addAnnotation
		  (bufferEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneInputSlot OneOutputSlot"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ReliabilityBetween0And1"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConnectedSlotsHaveToMatch ConnectorsHaveToConnectInputAndOutputSlots ConnectorsHaveToConnectSlotsOfDifferentComponents ConnectorInSourceArea"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (storeEClass, 
		   source, 
		   new String[] {
			 "OneInputSlot", "inputSlots->size() = 1",
			 "NoOutputSlot", "outputSlots->size() = 0"
		   });	
		addAnnotation
		  (itemGeneratorEClass, 
		   source, 
		   new String[] {
			 "NoInputSlot", "inputSlots->size() = 0",
			 "OneOutputslot", "outputSlots->size() = 1",
			 "ItemTypeHasToMatch", "outputSlots->forAll(s | s.requiredType = generatedType)"
		   });	
		addAnnotation
		  (conveyorEClass, 
		   source, 
		   new String[] {
			 "OneInputSlot", "inputSlots->size() = 1",
			 "OneOutputSlot", "outputSlots->size() = 1"
		   });	
		addAnnotation
		  (turnTableEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneInputSlot", "inputSlots->size() > 0",
			 "AtLeastOneOutputslot", "outputSlots->size() > 0"
		   });	
		addAnnotation
		  (machineEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneInputSlot", "inputSlots->size() > 0",
			 "AtLeastOneOutputslot", "outputSlots->size() > 0"
		   });	
		addAnnotation
		  (bufferEClass, 
		   source, 
		   new String[] {
			 "OneInputSlot", "inputSlots->size() = 1",
			 "OneOutputSlot", "outputSlots->size() = 1"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "ReliabilityBetween0And1", "self.reliability >= 0 and self.reliability <=1"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "ConnectedSlotsHaveToMatch", "self.entry.requiredType = self.exit.requiredType",
			 "ConnectorsHaveToConnectInputAndOutputSlots", "Component.allInstances() -> exists (c | c.outputSlots->includes(self.entry)) and Component.allInstances() -> exists (c | c.inputSlots->includes(self.exit))",
			 "ConnectorsHaveToConnectSlotsOfDifferentComponents", "Component.allInstances() -> select(c | c.outputSlots->includes(self.entry) or c.inputSlots->includes(self.entry)) -> asOrderedSet() -> first() <> Component.allInstances() -> select(c | c.outputSlots->includes(self.exit) or c.inputSlots->includes(self.exit)) -> asOrderedSet() -> first()",
			 "ConnectorInSourceArea", "Area.allInstances() -> select (a | a.components-> includes(Component.allInstances() -> select(c | c.outputSlots -> includes(self.entry) or c.inputSlots -> includes(self.entry)) -> asOrderedSet() -> first())) -> asOrderedSet() -> first() = Area.allInstances() -> select(a | a.connectors -> includes(self)) -> asOrderedSet() -> first()"
		   });
	}

} //STLPackageImpl
