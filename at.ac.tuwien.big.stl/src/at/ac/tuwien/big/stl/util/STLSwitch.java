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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.stl.STLPackage
 * @generated
 */
public class STLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static STLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLSwitch() {
		if (modelPackage == null) {
			modelPackage = STLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case STLPackage.SYSTEM: {
				at.ac.tuwien.big.stl.System system = (at.ac.tuwien.big.stl.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseNamedElement(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseNamedElement(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.PRODUCT_STORE: {
				ProductStore productStore = (ProductStore)theEObject;
				T result = caseProductStore(productStore);
				if (result == null) result = caseStore(productStore);
				if (result == null) result = caseComponent(productStore);
				if (result == null) result = caseNamedElement(productStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseComponent(store);
				if (result == null) result = caseNamedElement(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.ITEM_GENERATOR: {
				ItemGenerator itemGenerator = (ItemGenerator)theEObject;
				T result = caseItemGenerator(itemGenerator);
				if (result == null) result = caseComponent(itemGenerator);
				if (result == null) result = caseNamedElement(itemGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.CONVEYOR: {
				Conveyor conveyor = (Conveyor)theEObject;
				T result = caseConveyor(conveyor);
				if (result == null) result = caseComponent(conveyor);
				if (result == null) result = caseNamedElement(conveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.TURN_TABLE: {
				TurnTable turnTable = (TurnTable)theEObject;
				T result = caseTurnTable(turnTable);
				if (result == null) result = caseComponent(turnTable);
				if (result == null) result = caseNamedElement(turnTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseNamedElement(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseComponent(machine);
				if (result == null) result = caseNamedElement(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.WASTE_STORE: {
				WasteStore wasteStore = (WasteStore)theEObject;
				T result = caseWasteStore(wasteStore);
				if (result == null) result = caseStore(wasteStore);
				if (result == null) result = caseComponent(wasteStore);
				if (result == null) result = caseNamedElement(wasteStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.BUFFER: {
				Buffer buffer = (Buffer)theEObject;
				T result = caseBuffer(buffer);
				if (result == null) result = caseComponent(buffer);
				if (result == null) result = caseNamedElement(buffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = caseNamedElement(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case STLPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(at.ac.tuwien.big.stl.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductStore(ProductStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemGenerator(ItemGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnTable(TurnTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waste Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWasteStore(WasteStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer(Buffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //STLSwitch
