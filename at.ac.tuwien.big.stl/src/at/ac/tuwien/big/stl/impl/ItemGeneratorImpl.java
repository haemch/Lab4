/**
 */
package at.ac.tuwien.big.stl.impl;

import at.ac.tuwien.big.stl.ItemGenerator;
import at.ac.tuwien.big.stl.ItemType;
import at.ac.tuwien.big.stl.STLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.impl.ItemGeneratorImpl#getGeneratedType <em>Generated Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemGeneratorImpl extends ComponentImpl implements ItemGenerator {
	/**
	 * The cached value of the '{@link #getGeneratedType() <em>Generated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedType()
	 * @generated
	 * @ordered
	 */
	protected ItemType generatedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLPackage.Literals.ITEM_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getGeneratedType() {
		if (generatedType != null && generatedType.eIsProxy()) {
			InternalEObject oldGeneratedType = (InternalEObject)generatedType;
			generatedType = (ItemType)eResolveProxy(oldGeneratedType);
			if (generatedType != oldGeneratedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STLPackage.ITEM_GENERATOR__GENERATED_TYPE, oldGeneratedType, generatedType));
			}
		}
		return generatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetGeneratedType() {
		return generatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedType(ItemType newGeneratedType) {
		ItemType oldGeneratedType = generatedType;
		generatedType = newGeneratedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.ITEM_GENERATOR__GENERATED_TYPE, oldGeneratedType, generatedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case STLPackage.ITEM_GENERATOR__GENERATED_TYPE:
				if (resolve) return getGeneratedType();
				return basicGetGeneratedType();
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
			case STLPackage.ITEM_GENERATOR__GENERATED_TYPE:
				setGeneratedType((ItemType)newValue);
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
			case STLPackage.ITEM_GENERATOR__GENERATED_TYPE:
				setGeneratedType((ItemType)null);
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
			case STLPackage.ITEM_GENERATOR__GENERATED_TYPE:
				return generatedType != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemGeneratorImpl
