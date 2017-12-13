/**
 */
package at.ac.tuwien.big.stl.impl;

import at.ac.tuwien.big.stl.ItemType;
import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.Slot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.impl.SlotImpl#getRequiredType <em>Required Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends NamedElementImpl implements Slot {
	/**
	 * The cached value of the '{@link #getRequiredType() <em>Required Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredType()
	 * @generated
	 * @ordered
	 */
	protected ItemType requiredType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLPackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getRequiredType() {
		if (requiredType != null && requiredType.eIsProxy()) {
			InternalEObject oldRequiredType = (InternalEObject)requiredType;
			requiredType = (ItemType)eResolveProxy(oldRequiredType);
			if (requiredType != oldRequiredType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STLPackage.SLOT__REQUIRED_TYPE, oldRequiredType, requiredType));
			}
		}
		return requiredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetRequiredType() {
		return requiredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredType(ItemType newRequiredType) {
		ItemType oldRequiredType = requiredType;
		requiredType = newRequiredType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.SLOT__REQUIRED_TYPE, oldRequiredType, requiredType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case STLPackage.SLOT__REQUIRED_TYPE:
				if (resolve) return getRequiredType();
				return basicGetRequiredType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case STLPackage.SLOT__REQUIRED_TYPE:
				setRequiredType((ItemType)newValue);
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
			case STLPackage.SLOT__REQUIRED_TYPE:
				setRequiredType((ItemType)null);
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
			case STLPackage.SLOT__REQUIRED_TYPE:
				return requiredType != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
