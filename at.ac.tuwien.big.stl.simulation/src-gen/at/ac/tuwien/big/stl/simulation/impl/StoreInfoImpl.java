/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import at.ac.tuwien.big.stl.Buffer;
import at.ac.tuwien.big.stl.Component;
import at.ac.tuwien.big.stl.ProductStore;
import at.ac.tuwien.big.stl.Store;
import at.ac.tuwien.big.stl.WasteStore;
import at.ac.tuwien.big.stl.simulation.ConnectorInfo;
import at.ac.tuwien.big.stl.simulation.ItemInfo;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.SimConfiguration;
import at.ac.tuwien.big.stl.simulation.SimulationModel;
import at.ac.tuwien.big.stl.simulation.StoreInfo;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Store
 * Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.StoreInfoImpl#getStoredItems
 * <em>Stored Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreInfoImpl extends ComponentInfoImpl implements StoreInfo {
	/**
	 * The cached value of the '{@link #getStoredItems() <em>Stored Items</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStoredItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemInfo> storedItems;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoreInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLSimulationPackage.Literals.STORE_INFO;
	}

	/** @generated NOT */
	@Override
	public boolean process() {
		if (isBusy) {
			return false;
		}
		Component comp = getComponent();
		if (comp instanceof Buffer) {
			return process((Buffer) comp);
		} else if (comp instanceof ProductStore) {
			return process((ProductStore) comp);
		} else if (comp instanceof WasteStore) {
			return process((WasteStore) comp);
		}
		return false;
	}

	/**
	 * Performs simulation step for a waste store component: If an input connector
	 * of the waste store (ComponentInfo.inputConnector) provides an item
	 * (ConnectorInfo.item) and the capacity of the waste store
	 * (WasteStore.capacity) is not exceeded yet (StoreInfo.storedItems), the
	 * provided item is added to the waste store (StoreInfo.storedItems).
	 * Furthermore, the usage time of the waste store (ComponentInfo.useTime) is
	 * updated, i.e., it is increased by the waste store's processing time
	 * (WasteStore.processingTime). Note that these actions are performed for all
	 * input connectors of the waste store in a single simulation step.
	 * 
	 * @param comp
	 *            Waste store for which a simulation step should be executed
	 * @return returns always true
	 */
	private boolean process(WasteStore comp) {
		// TODO 
		throw new UnsupportedOperationException("Operation not implemented yet");
	}

	private boolean process(ProductStore comp) {
		// Transport item
		for (ConnectorInfo inCon : getInputConnectors()) {
			ItemInfo curItem = inCon.getItem();
			if (curItem != null) {
				if (getStoredItems().size() < ((Store) getComponent()).getCapacity()) {

					curItem.setFinalizationTime(Simulator.getInstance().getCurrentTime());

					curItem.setTotalLatency(curItem.getFinalizationTime() - curItem.getCreationTime());
					getStoredItems().add(curItem);

					System.out.println("Product store " + getComponent().getName() + " receives finished product at "
							+ Simulator.getInstance().getCurrentTime());
					SimulationModel simModel = (SimulationModel) eContainer();
					SimConfiguration sc = simModel.getConfiguration();
					setUseTime(getUseTime() + getProcessingTime());
					sc.setItemThroughput(sc.getItemThroughput() + 1);

					inCon.setItem(null);
				}
			}
		}
		return true;

	}

	private boolean process(Buffer comp) {
		// First try to output
		if (getStoredItems().size() > 0) {
			ItemInfo takeItem = getStoredItems().get(0);
			for (ConnectorInfo outCon : getOutputConnectors()) {
				if (outCon.getItem() == null && outCon.doesFit(takeItem)) {
					setIsBusy(true);
					Simulator.staticSchedule(getProcessingTime(), (ev, st) -> {
						outCon.setItem(takeItem);
						if (Math.random() > getReliability()) {
							takeItem.setQuality(0.0);
						}
						getStoredItems().remove(takeItem);
						setUseTime(getUseTime() + getProcessingTime());
						setIsBusy(false);
						ev.scheduleIn(0, (e, s) -> process());
					});
					return true;
				}
			}
		}
		for (ConnectorInfo inCon : getInputConnectors()) {
			ItemInfo curItem = inCon.getItem();
			if (curItem != null) {

				setIsBusy(true);
				Simulator.staticSchedule(getProcessingTime(), (ev, st) -> {
					inCon.setItem(null);
					getStoredItems().add(curItem);

					setUseTime(getUseTime() + getProcessingTime());
					setIsBusy(false);
					ev.scheduleIn(0, (e, s) -> process());
				});
				return true;
			}

		}
		return false;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ItemInfo> getStoredItems() {
		if (storedItems == null) {
			storedItems = new EObjectContainmentEList<ItemInfo>(ItemInfo.class, this,
					STLSimulationPackage.STORE_INFO__STORED_ITEMS);
		}
		return storedItems;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STLSimulationPackage.STORE_INFO__STORED_ITEMS:
			return ((InternalEList<?>) getStoredItems()).basicRemove(otherEnd, msgs);
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
		case STLSimulationPackage.STORE_INFO__STORED_ITEMS:
			return getStoredItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STLSimulationPackage.STORE_INFO__STORED_ITEMS:
			getStoredItems().clear();
			getStoredItems().addAll((Collection<? extends ItemInfo>) newValue);
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
		case STLSimulationPackage.STORE_INFO__STORED_ITEMS:
			getStoredItems().clear();
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
		case STLSimulationPackage.STORE_INFO__STORED_ITEMS:
			return storedItems != null && !storedItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StoreInfoImpl
