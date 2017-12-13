/**
 */
package at.ac.tuwien.big.stl.impl;

import at.ac.tuwien.big.stl.Connector;
import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.Slot;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.impl.ConnectorImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.impl.ConnectorImpl#getExit <em>Exit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Slot entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Slot exit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (Slot)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STLPackage.CONNECTOR__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Slot newEntry) {
		Slot oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.CONNECTOR__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getExit() {
		if (exit != null && exit.eIsProxy()) {
			InternalEObject oldExit = (InternalEObject)exit;
			exit = (Slot)eResolveProxy(oldExit);
			if (exit != oldExit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STLPackage.CONNECTOR__EXIT, oldExit, exit));
			}
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Slot newExit) {
		Slot oldExit = exit;
		exit = newExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.CONNECTOR__EXIT, oldExit, exit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case STLPackage.CONNECTOR__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case STLPackage.CONNECTOR__EXIT:
				if (resolve) return getExit();
				return basicGetExit();
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
			case STLPackage.CONNECTOR__ENTRY:
				setEntry((Slot)newValue);
				return;
			case STLPackage.CONNECTOR__EXIT:
				setExit((Slot)newValue);
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
			case STLPackage.CONNECTOR__ENTRY:
				setEntry((Slot)null);
				return;
			case STLPackage.CONNECTOR__EXIT:
				setExit((Slot)null);
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
			case STLPackage.CONNECTOR__ENTRY:
				return entry != null;
			case STLPackage.CONNECTOR__EXIT:
				return exit != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
