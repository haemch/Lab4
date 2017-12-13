/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import at.ac.tuwien.big.stl.Component;
import at.ac.tuwien.big.stl.Connector;
import at.ac.tuwien.big.stl.simulation.ComponentInfo;
import at.ac.tuwien.big.stl.simulation.ConnectorInfo;
import at.ac.tuwien.big.stl.simulation.ItemInfo;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.SimulationModel;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Connector Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.ConnectorInfoImpl#getItem
 * <em>Item</em>}</li>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.ConnectorInfoImpl#getConnector
 * <em>Connector</em>}</li>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.ConnectorInfoImpl#getRequiredState
 * <em>Required State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorInfoImpl extends MinimalEObjectImpl.Container implements ConnectorInfo {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected ItemInfo item;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * The default value of the '{@link #getRequiredState() <em>Required
	 * State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRequiredState()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_STATE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getRequiredState() <em>Required State</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRequiredState()
	 * @generated
	 * @ordered
	 */
	protected int requiredState = REQUIRED_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConnectorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLSimulationPackage.Literals.CONNECTOR_INFO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ItemInfo getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetItem(ItemInfo newItem, NotificationChain msgs) {
		ItemInfo oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STLSimulationPackage.CONNECTOR_INFO__ITEM, oldItem, newItem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setItem(ItemInfo newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject) item).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - STLSimulationPackage.CONNECTOR_INFO__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject) newItem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - STLSimulationPackage.CONNECTOR_INFO__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.CONNECTOR_INFO__ITEM, newItem,
					newItem));

		SimulationModel simulationModel = (SimulationModel) eContainer();
		if (simulationModel != null) {
			List<ComponentInfo> infos = simulationModel.getComponentInfos();
			List<ComponentInfo> inc = infos.stream()
					.filter(ci -> ci.getComponent().equals((Component) getConnector().getEntry().eContainer())).collect(Collectors.toList());
			if (inc.size()==1) {
				Simulator.staticSchedule(0, (ev, st) -> inc.get(0).process());
			}
			ComponentInfo oc = infos.stream()
					.filter(ci -> ci.getComponent().equals((Component) getConnector().getExit().eContainer())).findFirst()
					.orElse(null);
	
			if (oc != null) {
				Simulator.staticSchedule(0, (ev, st) -> oc.process());
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject) connector;
			connector = (Connector) eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STLSimulationPackage.CONNECTOR_INFO__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.CONNECTOR_INFO__CONNECTOR,
					oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getRequiredState() {
		return requiredState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequiredState(int newRequiredState) {
		int oldRequiredState = requiredState;
		requiredState = newRequiredState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.CONNECTOR_INFO__REQUIRED_STATE,
					oldRequiredState, requiredState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STLSimulationPackage.CONNECTOR_INFO__ITEM:
			return basicSetItem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STLSimulationPackage.CONNECTOR_INFO__ITEM:
			return getItem();
		case STLSimulationPackage.CONNECTOR_INFO__CONNECTOR:
			if (resolve)
				return getConnector();
			return basicGetConnector();
		case STLSimulationPackage.CONNECTOR_INFO__REQUIRED_STATE:
			return getRequiredState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STLSimulationPackage.CONNECTOR_INFO__ITEM:
			setItem((ItemInfo) newValue);
			return;
		case STLSimulationPackage.CONNECTOR_INFO__CONNECTOR:
			setConnector((Connector) newValue);
			return;
		case STLSimulationPackage.CONNECTOR_INFO__REQUIRED_STATE:
			setRequiredState((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STLSimulationPackage.CONNECTOR_INFO__ITEM:
			setItem((ItemInfo) null);
			return;
		case STLSimulationPackage.CONNECTOR_INFO__CONNECTOR:
			setConnector((Connector) null);
			return;
		case STLSimulationPackage.CONNECTOR_INFO__REQUIRED_STATE:
			setRequiredState(REQUIRED_STATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STLSimulationPackage.CONNECTOR_INFO__ITEM:
			return item != null;
		case STLSimulationPackage.CONNECTOR_INFO__CONNECTOR:
			return connector != null;
		case STLSimulationPackage.CONNECTOR_INFO__REQUIRED_STATE:
			return requiredState != REQUIRED_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (requiredState: ");
		result.append(requiredState);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean doesFit(ItemInfo item) {
		return item != null && getConnector().getEntry().getRequiredType().equals(item.getItemtype())
				&& (getRequiredState() < 0 || getRequiredState() == item.getState());
	}

} // ConnectorInfoImpl
