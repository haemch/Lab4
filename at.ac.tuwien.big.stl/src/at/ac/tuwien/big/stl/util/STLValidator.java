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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.stl.STLPackage
 * @generated
 */
public class STLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final STLValidator INSTANCE = new STLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at.ac.tuwien.big.stl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return STLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case STLPackage.SYSTEM:
				return validateSystem((at.ac.tuwien.big.stl.System)value, diagnostics, context);
			case STLPackage.AREA:
				return validateArea((Area)value, diagnostics, context);
			case STLPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case STLPackage.PRODUCT_STORE:
				return validateProductStore((ProductStore)value, diagnostics, context);
			case STLPackage.STORE:
				return validateStore((Store)value, diagnostics, context);
			case STLPackage.ITEM_GENERATOR:
				return validateItemGenerator((ItemGenerator)value, diagnostics, context);
			case STLPackage.CONVEYOR:
				return validateConveyor((Conveyor)value, diagnostics, context);
			case STLPackage.TURN_TABLE:
				return validateTurnTable((TurnTable)value, diagnostics, context);
			case STLPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case STLPackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case STLPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case STLPackage.WASTE_STORE:
				return validateWasteStore((WasteStore)value, diagnostics, context);
			case STLPackage.BUFFER:
				return validateBuffer((Buffer)value, diagnostics, context);
			case STLPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case STLPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case STLPackage.ITEM_TYPE:
				return validateItemType((ItemType)value, diagnostics, context);
			case STLPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(at.ac.tuwien.big.stl.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(area, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductStore(ProductStore productStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productStore, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validateStore_OneInputSlot(productStore, diagnostics, context);
		if (result || diagnostics != null) result &= validateStore_NoOutputSlot(productStore, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(store, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(store, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(store, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(store, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(store, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(store, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(store, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(store, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(store, diagnostics, context);
		if (result || diagnostics != null) result &= validateStore_OneInputSlot(store, diagnostics, context);
		if (result || diagnostics != null) result &= validateStore_NoOutputSlot(store, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlot constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORE__ONE_INPUT_SLOT__EEXPRESSION = "inputSlots->size() = 1";

	/**
	 * Validates the OneInputSlot constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore_OneInputSlot(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.STORE,
				 store,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneInputSlot",
				 STORE__ONE_INPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoOutputSlot constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORE__NO_OUTPUT_SLOT__EEXPRESSION = "outputSlots->size() = 0";

	/**
	 * Validates the NoOutputSlot constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore_NoOutputSlot(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.STORE,
				 store,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoOutputSlot",
				 STORE__NO_OUTPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator(ItemGenerator itemGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemGenerator_NoInputSlot(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemGenerator_OneOutputslot(itemGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemGenerator_ItemTypeHasToMatch(itemGenerator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoInputSlot constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__NO_INPUT_SLOT__EEXPRESSION = "inputSlots->size() = 0";

	/**
	 * Validates the NoInputSlot constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_NoInputSlot(ItemGenerator itemGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.ITEM_GENERATOR,
				 itemGenerator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoInputSlot",
				 ITEM_GENERATOR__NO_INPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneOutputslot constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__ONE_OUTPUTSLOT__EEXPRESSION = "outputSlots->size() = 1";

	/**
	 * Validates the OneOutputslot constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_OneOutputslot(ItemGenerator itemGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.ITEM_GENERATOR,
				 itemGenerator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneOutputslot",
				 ITEM_GENERATOR__ONE_OUTPUTSLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ItemTypeHasToMatch constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__ITEM_TYPE_HAS_TO_MATCH__EEXPRESSION = "outputSlots->forAll(s | s.requiredType = generatedType)";

	/**
	 * Validates the ItemTypeHasToMatch constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_ItemTypeHasToMatch(ItemGenerator itemGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.ITEM_GENERATOR,
				 itemGenerator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ItemTypeHasToMatch",
				 ITEM_GENERATOR__ITEM_TYPE_HAS_TO_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor(Conveyor conveyor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conveyor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validateConveyor_OneInputSlot(conveyor, diagnostics, context);
		if (result || diagnostics != null) result &= validateConveyor_OneOutputSlot(conveyor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlot constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONVEYOR__ONE_INPUT_SLOT__EEXPRESSION = "inputSlots->size() = 1";

	/**
	 * Validates the OneInputSlot constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor_OneInputSlot(Conveyor conveyor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.CONVEYOR,
				 conveyor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneInputSlot",
				 CONVEYOR__ONE_INPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneOutputSlot constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONVEYOR__ONE_OUTPUT_SLOT__EEXPRESSION = "outputSlots->size() = 1";

	/**
	 * Validates the OneOutputSlot constraint of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor_OneOutputSlot(Conveyor conveyor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.CONVEYOR,
				 conveyor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneOutputSlot",
				 CONVEYOR__ONE_OUTPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnTable(TurnTable turnTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turnTable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validateTurnTable_AtLeastOneInputSlot(turnTable, diagnostics, context);
		if (result || diagnostics != null) result &= validateTurnTable_AtLeastOneOutputslot(turnTable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneInputSlot constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_TABLE__AT_LEAST_ONE_INPUT_SLOT__EEXPRESSION = "inputSlots->size() > 0";

	/**
	 * Validates the AtLeastOneInputSlot constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnTable_AtLeastOneInputSlot(TurnTable turnTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.TURN_TABLE,
				 turnTable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtLeastOneInputSlot",
				 TURN_TABLE__AT_LEAST_ONE_INPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AtLeastOneOutputslot constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_TABLE__AT_LEAST_ONE_OUTPUTSLOT__EEXPRESSION = "outputSlots->size() > 0";

	/**
	 * Validates the AtLeastOneOutputslot constraint of '<em>Turn Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnTable_AtLeastOneOutputslot(TurnTable turnTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.TURN_TABLE,
				 turnTable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtLeastOneOutputslot",
				 TURN_TABLE__AT_LEAST_ONE_OUTPUTSLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_AtLeastOneInputSlot(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_AtLeastOneOutputslot(machine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneInputSlot constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MACHINE__AT_LEAST_ONE_INPUT_SLOT__EEXPRESSION = "inputSlots->size() > 0";

	/**
	 * Validates the AtLeastOneInputSlot constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_AtLeastOneInputSlot(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.MACHINE,
				 machine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtLeastOneInputSlot",
				 MACHINE__AT_LEAST_ONE_INPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AtLeastOneOutputslot constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MACHINE__AT_LEAST_ONE_OUTPUTSLOT__EEXPRESSION = "outputSlots->size() > 0";

	/**
	 * Validates the AtLeastOneOutputslot constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_AtLeastOneOutputslot(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.MACHINE,
				 machine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtLeastOneOutputslot",
				 MACHINE__AT_LEAST_ONE_OUTPUTSLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore(WasteStore wasteStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wasteStore, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validateStore_OneInputSlot(wasteStore, diagnostics, context);
		if (result || diagnostics != null) result &= validateStore_NoOutputSlot(wasteStore, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer(Buffer buffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buffer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validateBuffer_OneInputSlot(buffer, diagnostics, context);
		if (result || diagnostics != null) result &= validateBuffer_OneOutputSlot(buffer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlot constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUFFER__ONE_INPUT_SLOT__EEXPRESSION = "inputSlots->size() = 1";

	/**
	 * Validates the OneInputSlot constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer_OneInputSlot(Buffer buffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.BUFFER,
				 buffer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneInputSlot",
				 BUFFER__ONE_INPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneOutputSlot constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUFFER__ONE_OUTPUT_SLOT__EEXPRESSION = "outputSlots->size() = 1";

	/**
	 * Validates the OneOutputSlot constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer_OneOutputSlot(Buffer buffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.BUFFER,
				 buffer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneOutputSlot",
				 BUFFER__ONE_OUTPUT_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_ReliabilityBetween0And1(service, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ReliabilityBetween0And1 constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__RELIABILITY_BETWEEN0_AND1__EEXPRESSION = "self.reliability >= 0 and self.reliability <=1";

	/**
	 * Validates the ReliabilityBetween0And1 constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ReliabilityBetween0And1(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ReliabilityBetween0And1",
				 SERVICE__RELIABILITY_BETWEEN0_AND1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_ConnectedSlotsHaveToMatch(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_ConnectorsHaveToConnectInputAndOutputSlots(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_ConnectorsHaveToConnectSlotsOfDifferentComponents(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_ConnectorInSourceArea(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConnectedSlotsHaveToMatch constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__CONNECTED_SLOTS_HAVE_TO_MATCH__EEXPRESSION = "self.entry.requiredType = self.exit.requiredType";

	/**
	 * Validates the ConnectedSlotsHaveToMatch constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_ConnectedSlotsHaveToMatch(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectedSlotsHaveToMatch",
				 CONNECTOR__CONNECTED_SLOTS_HAVE_TO_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConnectorsHaveToConnectInputAndOutputSlots constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__CONNECTORS_HAVE_TO_CONNECT_INPUT_AND_OUTPUT_SLOTS__EEXPRESSION = "Component.allInstances() -> exists (c | c.outputSlots->includes(self.entry)) and Component.allInstances() -> exists (c | c.inputSlots->includes(self.exit))";

	/**
	 * Validates the ConnectorsHaveToConnectInputAndOutputSlots constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_ConnectorsHaveToConnectInputAndOutputSlots(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectorsHaveToConnectInputAndOutputSlots",
				 CONNECTOR__CONNECTORS_HAVE_TO_CONNECT_INPUT_AND_OUTPUT_SLOTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConnectorsHaveToConnectSlotsOfDifferentComponents constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__CONNECTORS_HAVE_TO_CONNECT_SLOTS_OF_DIFFERENT_COMPONENTS__EEXPRESSION = "Component.allInstances() -> select(c | c.outputSlots->includes(self.entry) or c.inputSlots->includes(self.entry)) -> asOrderedSet() -> first() <> Component.allInstances() -> select(c | c.outputSlots->includes(self.exit) or c.inputSlots->includes(self.exit)) -> asOrderedSet() -> first()";

	/**
	 * Validates the ConnectorsHaveToConnectSlotsOfDifferentComponents constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_ConnectorsHaveToConnectSlotsOfDifferentComponents(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectorsHaveToConnectSlotsOfDifferentComponents",
				 CONNECTOR__CONNECTORS_HAVE_TO_CONNECT_SLOTS_OF_DIFFERENT_COMPONENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConnectorInSourceArea constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__CONNECTOR_IN_SOURCE_AREA__EEXPRESSION = "Area.allInstances() -> select (a | a.components-> includes(Component.allInstances() -> select(c | c.outputSlots -> includes(self.entry) or c.inputSlots -> includes(self.entry)) -> asOrderedSet() -> first())) -> asOrderedSet() -> first() = Area.allInstances() -> select(a | a.connectors -> includes(self)) -> asOrderedSet() -> first()";

	/**
	 * Validates the ConnectorInSourceArea constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_ConnectorInSourceArea(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(STLPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectorInSourceArea",
				 CONNECTOR__CONNECTOR_IN_SOURCE_AREA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //STLValidator
