/**
 */
package at.ac.tuwien.big.stl.impl;

import at.ac.tuwien.big.stl.Area;
import at.ac.tuwien.big.stl.ItemType;
import at.ac.tuwien.big.stl.STLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.impl.SystemImpl#getAreas <em>Areas</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.impl.SystemImpl#getItemTypes <em>Item Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements at.ac.tuwien.big.stl.System {
	/**
	 * The cached value of the '{@link #getAreas() <em>Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> areas;

	/**
	 * The cached value of the '{@link #getItemTypes() <em>Item Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> itemTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getAreas() {
		if (areas == null) {
			areas = new EObjectContainmentEList<Area>(Area.class, this, STLPackage.SYSTEM__AREAS);
		}
		return areas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItemTypes() {
		if (itemTypes == null) {
			itemTypes = new EObjectContainmentEList<ItemType>(ItemType.class, this, STLPackage.SYSTEM__ITEM_TYPES);
		}
		return itemTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case STLPackage.SYSTEM__AREAS:
				return ((InternalEList<?>)getAreas()).basicRemove(otherEnd, msgs);
			case STLPackage.SYSTEM__ITEM_TYPES:
				return ((InternalEList<?>)getItemTypes()).basicRemove(otherEnd, msgs);
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
			case STLPackage.SYSTEM__AREAS:
				return getAreas();
			case STLPackage.SYSTEM__ITEM_TYPES:
				return getItemTypes();
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
			case STLPackage.SYSTEM__AREAS:
				getAreas().clear();
				getAreas().addAll((Collection<? extends Area>)newValue);
				return;
			case STLPackage.SYSTEM__ITEM_TYPES:
				getItemTypes().clear();
				getItemTypes().addAll((Collection<? extends ItemType>)newValue);
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
			case STLPackage.SYSTEM__AREAS:
				getAreas().clear();
				return;
			case STLPackage.SYSTEM__ITEM_TYPES:
				getItemTypes().clear();
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
			case STLPackage.SYSTEM__AREAS:
				return areas != null && !areas.isEmpty();
			case STLPackage.SYSTEM__ITEM_TYPES:
				return itemTypes != null && !itemTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
