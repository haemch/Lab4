/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import at.ac.tuwien.big.stl.ItemType;

import at.ac.tuwien.big.stl.simulation.ItemInfo;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl#getFinalizationTime <em>Finalization Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl#getTotalLatency <em>Total Latency</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemInfoImpl extends MinimalEObjectImpl.Container implements ItemInfo {
	/**
	 * The default value of the '{@link #getFinalizationTime() <em>Finalization Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalizationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long FINALIZATION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFinalizationTime() <em>Finalization Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalizationTime()
	 * @generated
	 * @ordered
	 */
	protected long finalizationTime = FINALIZATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalLatency() <em>Total Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLatency()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_LATENCY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalLatency() <em>Total Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLatency()
	 * @generated
	 * @ordered
	 */
	protected long totalLatency = TOTAL_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final double QUALITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected double quality = QUALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemtype() <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtype()
	 * @generated
	 * @ordered
	 */
	protected ItemType itemtype;

	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected long creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected int state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLSimulationPackage.Literals.ITEM_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItemtype() {
		if (itemtype != null && itemtype.eIsProxy()) {
			InternalEObject oldItemtype = (InternalEObject) itemtype;
			itemtype = (ItemType) eResolveProxy(oldItemtype);
			if (itemtype != oldItemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STLSimulationPackage.ITEM_INFO__ITEMTYPE,
							oldItemtype, itemtype));
			}
		}
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetItemtype() {
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemtype(ItemType newItemtype) {
		ItemType oldItemtype = itemtype;
		itemtype = newItemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.ITEM_INFO__ITEMTYPE, oldItemtype,
					itemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(long newCreationTime) {
		long oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.ITEM_INFO__CREATION_TIME,
					oldCreationTime, creationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.ITEM_INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(int newState) {
		int oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.ITEM_INFO__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFinalizationTime() {
		return finalizationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalizationTime(long newFinalizationTime) {
		long oldFinalizationTime = finalizationTime;
		finalizationTime = newFinalizationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.ITEM_INFO__FINALIZATION_TIME,
					oldFinalizationTime, finalizationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalLatency() {
		return totalLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLatency(long newTotalLatency) {
		long oldTotalLatency = totalLatency;
		totalLatency = newTotalLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.ITEM_INFO__TOTAL_LATENCY,
					oldTotalLatency, totalLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(double newQuality) {
		double oldQuality = quality;
		quality = newQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.ITEM_INFO__QUALITY, oldQuality,
					quality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STLSimulationPackage.ITEM_INFO__FINALIZATION_TIME:
			return getFinalizationTime();
		case STLSimulationPackage.ITEM_INFO__TOTAL_LATENCY:
			return getTotalLatency();
		case STLSimulationPackage.ITEM_INFO__QUALITY:
			return getQuality();
		case STLSimulationPackage.ITEM_INFO__ITEMTYPE:
			if (resolve)
				return getItemtype();
			return basicGetItemtype();
		case STLSimulationPackage.ITEM_INFO__CREATION_TIME:
			return getCreationTime();
		case STLSimulationPackage.ITEM_INFO__NAME:
			return getName();
		case STLSimulationPackage.ITEM_INFO__STATE:
			return getState();
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
		case STLSimulationPackage.ITEM_INFO__FINALIZATION_TIME:
			setFinalizationTime((Long) newValue);
			return;
		case STLSimulationPackage.ITEM_INFO__TOTAL_LATENCY:
			setTotalLatency((Long) newValue);
			return;
		case STLSimulationPackage.ITEM_INFO__QUALITY:
			setQuality((Double) newValue);
			return;
		case STLSimulationPackage.ITEM_INFO__ITEMTYPE:
			setItemtype((ItemType) newValue);
			return;
		case STLSimulationPackage.ITEM_INFO__CREATION_TIME:
			setCreationTime((Long) newValue);
			return;
		case STLSimulationPackage.ITEM_INFO__NAME:
			setName((String) newValue);
			return;
		case STLSimulationPackage.ITEM_INFO__STATE:
			setState((Integer) newValue);
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
		case STLSimulationPackage.ITEM_INFO__FINALIZATION_TIME:
			setFinalizationTime(FINALIZATION_TIME_EDEFAULT);
			return;
		case STLSimulationPackage.ITEM_INFO__TOTAL_LATENCY:
			setTotalLatency(TOTAL_LATENCY_EDEFAULT);
			return;
		case STLSimulationPackage.ITEM_INFO__QUALITY:
			setQuality(QUALITY_EDEFAULT);
			return;
		case STLSimulationPackage.ITEM_INFO__ITEMTYPE:
			setItemtype((ItemType) null);
			return;
		case STLSimulationPackage.ITEM_INFO__CREATION_TIME:
			setCreationTime(CREATION_TIME_EDEFAULT);
			return;
		case STLSimulationPackage.ITEM_INFO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case STLSimulationPackage.ITEM_INFO__STATE:
			setState(STATE_EDEFAULT);
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
		case STLSimulationPackage.ITEM_INFO__FINALIZATION_TIME:
			return finalizationTime != FINALIZATION_TIME_EDEFAULT;
		case STLSimulationPackage.ITEM_INFO__TOTAL_LATENCY:
			return totalLatency != TOTAL_LATENCY_EDEFAULT;
		case STLSimulationPackage.ITEM_INFO__QUALITY:
			return quality != QUALITY_EDEFAULT;
		case STLSimulationPackage.ITEM_INFO__ITEMTYPE:
			return itemtype != null;
		case STLSimulationPackage.ITEM_INFO__CREATION_TIME:
			return creationTime != CREATION_TIME_EDEFAULT;
		case STLSimulationPackage.ITEM_INFO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case STLSimulationPackage.ITEM_INFO__STATE:
			return state != STATE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (finalizationTime: ");
		result.append(finalizationTime);
		result.append(", totalLatency: ");
		result.append(totalLatency);
		result.append(", quality: ");
		result.append(quality);
		result.append(", creationTime: ");
		result.append(creationTime);
		result.append(", name: ");
		result.append(name);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ItemInfoImpl
