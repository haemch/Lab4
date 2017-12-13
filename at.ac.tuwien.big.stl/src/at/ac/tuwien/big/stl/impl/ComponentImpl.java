/**
 */
package at.ac.tuwien.big.stl.impl;

import at.ac.tuwien.big.stl.Component;
import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.Service;
import at.ac.tuwien.big.stl.Slot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.impl.ComponentImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.impl.ComponentImpl#getServices <em>Services</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.impl.ComponentImpl#getOutputSlots <em>Output Slots</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.impl.ComponentImpl#getInputSlots <em>Input Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getOutputSlots() <em>Output Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> outputSlots;

	/**
	 * The cached value of the '{@link #getInputSlots() <em>Input Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> inputSlots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.COMPONENT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, STLPackage.COMPONENT__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getOutputSlots() {
		if (outputSlots == null) {
			outputSlots = new EObjectContainmentEList<Slot>(Slot.class, this, STLPackage.COMPONENT__OUTPUT_SLOTS);
		}
		return outputSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getInputSlots() {
		if (inputSlots == null) {
			inputSlots = new EObjectContainmentEList<Slot>(Slot.class, this, STLPackage.COMPONENT__INPUT_SLOTS);
		}
		return inputSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case STLPackage.COMPONENT__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case STLPackage.COMPONENT__OUTPUT_SLOTS:
				return ((InternalEList<?>)getOutputSlots()).basicRemove(otherEnd, msgs);
			case STLPackage.COMPONENT__INPUT_SLOTS:
				return ((InternalEList<?>)getInputSlots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case STLPackage.COMPONENT__COST:
				return getCost();
			case STLPackage.COMPONENT__SERVICES:
				return getServices();
			case STLPackage.COMPONENT__OUTPUT_SLOTS:
				return getOutputSlots();
			case STLPackage.COMPONENT__INPUT_SLOTS:
				return getInputSlots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case STLPackage.COMPONENT__COST:
				setCost((Integer)newValue);
				return;
			case STLPackage.COMPONENT__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case STLPackage.COMPONENT__OUTPUT_SLOTS:
				getOutputSlots().clear();
				getOutputSlots().addAll((Collection<? extends Slot>)newValue);
				return;
			case STLPackage.COMPONENT__INPUT_SLOTS:
				getInputSlots().clear();
				getInputSlots().addAll((Collection<? extends Slot>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case STLPackage.COMPONENT__COST:
				setCost(COST_EDEFAULT);
				return;
			case STLPackage.COMPONENT__SERVICES:
				getServices().clear();
				return;
			case STLPackage.COMPONENT__OUTPUT_SLOTS:
				getOutputSlots().clear();
				return;
			case STLPackage.COMPONENT__INPUT_SLOTS:
				getInputSlots().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case STLPackage.COMPONENT__COST:
				return cost != COST_EDEFAULT;
			case STLPackage.COMPONENT__SERVICES:
				return services != null && !services.isEmpty();
			case STLPackage.COMPONENT__OUTPUT_SLOTS:
				return outputSlots != null && !outputSlots.isEmpty();
			case STLPackage.COMPONENT__INPUT_SLOTS:
				return inputSlots != null && !inputSlots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
