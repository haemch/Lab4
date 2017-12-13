/**
 */
package at.ac.tuwien.big.stl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.stl.STLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface STLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.big.tuwien.ac.at/Stl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "at.ac.tuwien.big.stl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	STLPackage eINSTANCE = at.ac.tuwien.big.stl.impl.STLPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.NamedElementImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.SystemImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__AREAS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ITEM_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.AreaImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ComponentImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COST = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTPUT_SLOTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUT_SLOTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.StoreImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__COST = COMPONENT__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SERVICES = COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__OUTPUT_SLOTS = COMPONENT__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__INPUT_SLOTS = COMPONENT__INPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CAPACITY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ProductStoreImpl <em>Product Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ProductStoreImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getProductStore()
	 * @generated
	 */
	int PRODUCT_STORE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__NAME = STORE__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__COST = STORE__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SERVICES = STORE__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OUTPUT_SLOTS = STORE__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__INPUT_SLOTS = STORE__INPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__CAPACITY = STORE__CAPACITY;

	/**
	 * The number of structural features of the '<em>Product Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FEATURE_COUNT = STORE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_OPERATION_COUNT = STORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ItemGeneratorImpl <em>Item Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ItemGeneratorImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getItemGenerator()
	 * @generated
	 */
	int ITEM_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__COST = COMPONENT__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__SERVICES = COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__OUTPUT_SLOTS = COMPONENT__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__INPUT_SLOTS = COMPONENT__INPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Generated Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__GENERATED_TYPE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ConveyorImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__COST = COMPONENT__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__SERVICES = COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__OUTPUT_SLOTS = COMPONENT__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__INPUT_SLOTS = COMPONENT__INPUT_SLOTS;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.TurnTableImpl <em>Turn Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.TurnTableImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getTurnTable()
	 * @generated
	 */
	int TURN_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TABLE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TABLE__COST = COMPONENT__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TABLE__SERVICES = COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TABLE__OUTPUT_SLOTS = COMPONENT__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TABLE__INPUT_SLOTS = COMPONENT__INPUT_SLOTS;

	/**
	 * The number of structural features of the '<em>Turn Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TABLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TABLE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.SlotImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Required Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__REQUIRED_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.MachineImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__COST = COMPONENT__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SERVICES = COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUTPUT_SLOTS = COMPONENT__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__INPUT_SLOTS = COMPONENT__INPUT_SLOTS;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.WasteStoreImpl <em>Waste Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.WasteStoreImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getWasteStore()
	 * @generated
	 */
	int WASTE_STORE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__NAME = STORE__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__COST = STORE__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__SERVICES = STORE__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__OUTPUT_SLOTS = STORE__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__INPUT_SLOTS = STORE__INPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__CAPACITY = STORE__CAPACITY;

	/**
	 * The number of structural features of the '<em>Waste Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE_FEATURE_COUNT = STORE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Waste Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE_OPERATION_COUNT = STORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.BufferImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__COST = COMPONENT__COST;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__SERVICES = COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Output Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__OUTPUT_SLOTS = COMPONENT__OUTPUT_SLOTS;

	/**
	 * The feature id for the '<em><b>Input Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__INPUT_SLOTS = COMPONENT__INPUT_SLOTS;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ServiceImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COST = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROCESSING_TIME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RELIABILITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ParameterImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ItemTypeImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.impl.ConnectorImpl
	 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EXIT = 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see at.ac.tuwien.big.stl.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.System#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see at.ac.tuwien.big.stl.System#getAreas()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Areas();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.System#getItemTypes <em>Item Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Types</em>'.
	 * @see at.ac.tuwien.big.stl.System#getItemTypes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ItemTypes();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see at.ac.tuwien.big.stl.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.Area#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see at.ac.tuwien.big.stl.Area#getComponents()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.Area#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see at.ac.tuwien.big.stl.Area#getConnectors()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Connectors();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see at.ac.tuwien.big.stl.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.Component#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see at.ac.tuwien.big.stl.Component#getCost()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Cost();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.Component#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see at.ac.tuwien.big.stl.Component#getServices()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.Component#getOutputSlots <em>Output Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Slots</em>'.
	 * @see at.ac.tuwien.big.stl.Component#getOutputSlots()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OutputSlots();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.Component#getInputSlots <em>Input Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Slots</em>'.
	 * @see at.ac.tuwien.big.stl.Component#getInputSlots()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InputSlots();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.ProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store</em>'.
	 * @see at.ac.tuwien.big.stl.ProductStore
	 * @generated
	 */
	EClass getProductStore();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see at.ac.tuwien.big.stl.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.Store#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see at.ac.tuwien.big.stl.Store#getCapacity()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Capacity();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.ItemGenerator <em>Item Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Generator</em>'.
	 * @see at.ac.tuwien.big.stl.ItemGenerator
	 * @generated
	 */
	EClass getItemGenerator();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.ItemGenerator#getGeneratedType <em>Generated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generated Type</em>'.
	 * @see at.ac.tuwien.big.stl.ItemGenerator#getGeneratedType()
	 * @see #getItemGenerator()
	 * @generated
	 */
	EReference getItemGenerator_GeneratedType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see at.ac.tuwien.big.stl.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.TurnTable <em>Turn Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Table</em>'.
	 * @see at.ac.tuwien.big.stl.TurnTable
	 * @generated
	 */
	EClass getTurnTable();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see at.ac.tuwien.big.stl.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.Slot#getRequiredType <em>Required Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Type</em>'.
	 * @see at.ac.tuwien.big.stl.Slot#getRequiredType()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_RequiredType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see at.ac.tuwien.big.stl.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see at.ac.tuwien.big.stl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.stl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.WasteStore <em>Waste Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waste Store</em>'.
	 * @see at.ac.tuwien.big.stl.WasteStore
	 * @generated
	 */
	EClass getWasteStore();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see at.ac.tuwien.big.stl.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see at.ac.tuwien.big.stl.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.Service#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see at.ac.tuwien.big.stl.Service#getCost()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Cost();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.Service#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Time</em>'.
	 * @see at.ac.tuwien.big.stl.Service#getProcessingTime()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ProcessingTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.Service#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see at.ac.tuwien.big.stl.Service#getReliability()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Reliability();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.Service#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see at.ac.tuwien.big.stl.Service#getParameters()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Parameters();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see at.ac.tuwien.big.stl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see at.ac.tuwien.big.stl.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.ItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see at.ac.tuwien.big.stl.ItemType#getDescription()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Description();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see at.ac.tuwien.big.stl.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.Connector#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see at.ac.tuwien.big.stl.Connector#getEntry()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Entry();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.Connector#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit</em>'.
	 * @see at.ac.tuwien.big.stl.Connector#getExit()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Exit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	STLFactory getSTLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.SystemImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__AREAS = eINSTANCE.getSystem_Areas();

		/**
		 * The meta object literal for the '<em><b>Item Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ITEM_TYPES = eINSTANCE.getSystem_ItemTypes();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.AreaImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__COMPONENTS = eINSTANCE.getArea_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__CONNECTORS = eINSTANCE.getArea_Connectors();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ComponentImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COST = eINSTANCE.getComponent_Cost();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SERVICES = eINSTANCE.getComponent_Services();

		/**
		 * The meta object literal for the '<em><b>Output Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTPUT_SLOTS = eINSTANCE.getComponent_OutputSlots();

		/**
		 * The meta object literal for the '<em><b>Input Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INPUT_SLOTS = eINSTANCE.getComponent_InputSlots();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ProductStoreImpl <em>Product Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ProductStoreImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getProductStore()
		 * @generated
		 */
		EClass PRODUCT_STORE = eINSTANCE.getProductStore();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.StoreImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__CAPACITY = eINSTANCE.getStore_Capacity();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ItemGeneratorImpl <em>Item Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ItemGeneratorImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getItemGenerator()
		 * @generated
		 */
		EClass ITEM_GENERATOR = eINSTANCE.getItemGenerator();

		/**
		 * The meta object literal for the '<em><b>Generated Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_GENERATOR__GENERATED_TYPE = eINSTANCE.getItemGenerator_GeneratedType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ConveyorImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.TurnTableImpl <em>Turn Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.TurnTableImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getTurnTable()
		 * @generated
		 */
		EClass TURN_TABLE = eINSTANCE.getTurnTable();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.SlotImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Required Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__REQUIRED_TYPE = eINSTANCE.getSlot_RequiredType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.MachineImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.NamedElementImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.WasteStoreImpl <em>Waste Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.WasteStoreImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getWasteStore()
		 * @generated
		 */
		EClass WASTE_STORE = eINSTANCE.getWasteStore();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.BufferImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ServiceImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__COST = eINSTANCE.getService_Cost();

		/**
		 * The meta object literal for the '<em><b>Processing Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PROCESSING_TIME = eINSTANCE.getService_ProcessingTime();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RELIABILITY = eINSTANCE.getService_Reliability();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PARAMETERS = eINSTANCE.getService_Parameters();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ParameterImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ItemTypeImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__DESCRIPTION = eINSTANCE.getItemType_Description();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.impl.ConnectorImpl
		 * @see at.ac.tuwien.big.stl.impl.STLPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ENTRY = eINSTANCE.getConnector_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__EXIT = eINSTANCE.getConnector_Exit();

	}

} //STLPackage
