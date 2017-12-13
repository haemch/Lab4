/**
 */
package at.ac.tuwien.big.stl.util;

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
import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.Service;
import at.ac.tuwien.big.stl.Slot;
import at.ac.tuwien.big.stl.Store;
import at.ac.tuwien.big.stl.TurnTable;
import at.ac.tuwien.big.stl.WasteStore;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.stl.STLPackage
 * @generated
 */
public class STLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static STLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = STLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STLSwitch<Adapter> modelSwitch =
		new STLSwitch<Adapter>() {
			@Override
			public Adapter caseSystem(at.ac.tuwien.big.stl.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseArea(Area object) {
				return createAreaAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseProductStore(ProductStore object) {
				return createProductStoreAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseItemGenerator(ItemGenerator object) {
				return createItemGeneratorAdapter();
			}
			@Override
			public Adapter caseConveyor(Conveyor object) {
				return createConveyorAdapter();
			}
			@Override
			public Adapter caseTurnTable(TurnTable object) {
				return createTurnTableAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseWasteStore(WasteStore object) {
				return createWasteStoreAdapter();
			}
			@Override
			public Adapter caseBuffer(Buffer object) {
				return createBufferAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.ProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.ProductStore
	 * @generated
	 */
	public Adapter createProductStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.ItemGenerator <em>Item Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.ItemGenerator
	 * @generated
	 */
	public Adapter createItemGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Conveyor
	 * @generated
	 */
	public Adapter createConveyorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.TurnTable <em>Turn Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.TurnTable
	 * @generated
	 */
	public Adapter createTurnTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.WasteStore <em>Waste Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.WasteStore
	 * @generated
	 */
	public Adapter createWasteStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Buffer
	 * @generated
	 */
	public Adapter createBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.stl.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.stl.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //STLAdapterFactory
