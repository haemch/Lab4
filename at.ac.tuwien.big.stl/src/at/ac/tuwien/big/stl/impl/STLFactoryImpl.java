/**
 */
package at.ac.tuwien.big.stl.impl;

import at.ac.tuwien.big.stl.Area;
import at.ac.tuwien.big.stl.Buffer;
import at.ac.tuwien.big.stl.Connector;
import at.ac.tuwien.big.stl.Conveyor;
import at.ac.tuwien.big.stl.ItemGenerator;
import at.ac.tuwien.big.stl.ItemType;
import at.ac.tuwien.big.stl.Machine;
import at.ac.tuwien.big.stl.Parameter;
import at.ac.tuwien.big.stl.ProductStore;
import at.ac.tuwien.big.stl.STLFactory;
import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.Service;
import at.ac.tuwien.big.stl.Slot;
import at.ac.tuwien.big.stl.TurnTable;
import at.ac.tuwien.big.stl.WasteStore;

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
public class STLFactoryImpl extends EFactoryImpl implements STLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static STLFactory init() {
		try {
			STLFactory theSTLFactory = (STLFactory)EPackage.Registry.INSTANCE.getEFactory(STLPackage.eNS_URI);
			if (theSTLFactory != null) {
				return theSTLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new STLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLFactoryImpl() {
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
			case STLPackage.SYSTEM: return createSystem();
			case STLPackage.AREA: return createArea();
			case STLPackage.PRODUCT_STORE: return createProductStore();
			case STLPackage.ITEM_GENERATOR: return createItemGenerator();
			case STLPackage.CONVEYOR: return createConveyor();
			case STLPackage.TURN_TABLE: return createTurnTable();
			case STLPackage.SLOT: return createSlot();
			case STLPackage.MACHINE: return createMachine();
			case STLPackage.WASTE_STORE: return createWasteStore();
			case STLPackage.BUFFER: return createBuffer();
			case STLPackage.SERVICE: return createService();
			case STLPackage.PARAMETER: return createParameter();
			case STLPackage.ITEM_TYPE: return createItemType();
			case STLPackage.CONNECTOR: return createConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public at.ac.tuwien.big.stl.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore createProductStore() {
		ProductStoreImpl productStore = new ProductStoreImpl();
		return productStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemGenerator createItemGenerator() {
		ItemGeneratorImpl itemGenerator = new ItemGeneratorImpl();
		return itemGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnTable createTurnTable() {
		TurnTableImpl turnTable = new TurnTableImpl();
		return turnTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WasteStore createWasteStore() {
		WasteStoreImpl wasteStore = new WasteStoreImpl();
		return wasteStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer createBuffer() {
		BufferImpl buffer = new BufferImpl();
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLPackage getSTLPackage() {
		return (STLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static STLPackage getPackage() {
		return STLPackage.eINSTANCE;
	}

} //STLFactoryImpl
