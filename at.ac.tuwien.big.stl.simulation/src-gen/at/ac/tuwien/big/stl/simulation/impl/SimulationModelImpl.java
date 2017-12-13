/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import at.ac.tuwien.big.stl.Buffer;
import at.ac.tuwien.big.stl.Component;
import at.ac.tuwien.big.stl.Connector;
import at.ac.tuwien.big.stl.ItemGenerator;
import at.ac.tuwien.big.stl.Store;
import at.ac.tuwien.big.stl.WasteStore;
import at.ac.tuwien.big.stl.simulation.ComponentInfo;
import at.ac.tuwien.big.stl.simulation.ConnectorInfo;
import at.ac.tuwien.big.stl.simulation.ItemInfo;
import at.ac.tuwien.big.stl.simulation.STLSimulationFactory;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.SimConfiguration;
import at.ac.tuwien.big.stl.simulation.SimulationModel;
import at.ac.tuwien.big.stl.simulation.StoreInfo;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Simulation Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl#getConfiguration
 * <em>Configuration</em>}</li>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl#getComponentInfos
 * <em>Component Infos</em>}</li>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl#getSystem
 * <em>System</em>}</li>
 * <li>{@link at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl#getConnectorInfos
 * <em>Connector Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationModelImpl extends MinimalEObjectImpl.Container implements SimulationModel {
	private static int DEFAULT_BUDGET = 1000000;
	private static double DEFAULT_SIM_SPEED = 1000.0;
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected SimConfiguration configuration;

	/**
	 * The cached value of the '{@link #getComponentInfos() <em>Component
	 * Infos</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getComponentInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInfo> componentInfos;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected at.ac.tuwien.big.stl.System system;

	/**
	 * The cached value of the '{@link #getConnectorInfos() <em>Connector
	 * Infos</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConnectorInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInfo> connectorInfos;


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected SimulationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLSimulationPackage.Literals.SIMULATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SimConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(SimConfiguration newConfiguration, NotificationChain msgs) {
		SimConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION, oldConfiguration, newConfiguration);
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
	 * @generated
	 */
	public void setConfiguration(SimConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION,
					newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ComponentInfo> getComponentInfos() {
		if (componentInfos == null) {
			componentInfos = new EObjectContainmentEList<ComponentInfo>(ComponentInfo.class, this,
					STLSimulationPackage.SIMULATION_MODEL__COMPONENT_INFOS);
		}
		return componentInfos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public at.ac.tuwien.big.stl.System getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject) system;
			system = (at.ac.tuwien.big.stl.System) eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STLSimulationPackage.SIMULATION_MODEL__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public at.ac.tuwien.big.stl.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSystem(at.ac.tuwien.big.stl.System newSystem) {
		at.ac.tuwien.big.stl.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.SIMULATION_MODEL__SYSTEM,
					oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ConnectorInfo> getConnectorInfos() {
		if (connectorInfos == null) {
			connectorInfos = new EObjectContainmentEList<ConnectorInfo>(ConnectorInfo.class, this,
					STLSimulationPackage.SIMULATION_MODEL__CONNECTOR_INFOS);
		}
		return connectorInfos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void simulate() {
		Simulator simulator = Simulator.getInstance();
		if (simulator.isRunning()) {
			return;
		}

		synchronized (this) {
			// initialize simulation model
			initializeRuntimeInformation();
			SimConfiguration sc = getConfiguration();

			// calculate budget
			int remainingBudget = sc.getBudget();
			for (ComponentInfo ci : getComponentInfos()) {
				remainingBudget -= ci.getComponent().getCost();
				ci.getOutputConnectors().forEach(c -> c.eUnset(STLSimulationPackage.eINSTANCE.getConnectorInfo_Item()));
				if (ci instanceof StoreInfo) {
					((StoreInfo) ci).getStoredItems().clear();
				}

				ci.setUseTime(0);
				ci.setCreationTime(0);
				ci.setIsBusy(false);
			}

			sc.setItemThroughput(0);

			sc.setRemainingBudget(remainingBudget);

			simulator.init(sc.getSimSpeed());

			// set time out
			simulator.setTimeout(sc.getSimulationTime()/* +8*60*60*1000L */);
			
			// initialize item generators
			simulator.addEvent(0, (ev, startTime) -> {
				getComponentInfos().stream().filter(ci -> ci.getComponent() instanceof ItemGenerator)
						.forEach(g -> Simulator.staticSchedule(0, (ev1, st) -> g.process()));
			});

			int storedWastedItems = 0;
			int storedGoodItems = 0;
			simulator.run();

			// compute average latency = sum(finalization time)/number objects
			double latencySum = 0;
			for (ComponentInfo ci : getComponentInfos()) {

				for (ConnectorInfo outputCon : ci.getOutputConnectors()) {
					if (outputCon.getItem() != null) {
						latencySum += outputCon.getItem().getTotalLatency();
					}
				}
				if (ci instanceof StoreInfo) {
					if (ci.getComponent() instanceof Store) {
						StoreInfo si = (StoreInfo) ci;
						for (ItemInfo ii : si.getStoredItems()) {
							latencySum += ii.getTotalLatency();
						}
						if (ci.getComponent() instanceof WasteStore) {
							storedWastedItems += si.getStoredItems().size();
						} else {
							storedGoodItems += si.getStoredItems().size();
						}
					}
				}

				double componentUse = ((double) ci.getUseTime()) / sc.getSimulationTime();
				ci.setUtilization(componentUse);
				System.out.println("Utilization of component " + ci.getComponent().getName() + ": " + componentUse);
			}

			double avgLatency = latencySum / sc.getItemThroughput();
			sc.setAverageLatency(avgLatency);
			sc.setAverageQuality((double) storedGoodItems / (storedWastedItems + storedGoodItems));
			System.out.println("Throughput: " + sc.getItemThroughput() + ", average latency: " + avgLatency
					+ " ms , average quality: " + (sc.getAverageQuality()) + "%");

		}
	}

	private void initializeRuntimeInformation() {
		Map<Connector, ConnectorInfo> cInfoMap = new HashMap<>();
		if (getConfiguration() == null) {
			SimConfiguration configuration = STLSimulationFactory.eINSTANCE.createSimConfiguration();
			configuration.setBudget(DEFAULT_BUDGET);
			configuration.setRemainingBudget(DEFAULT_BUDGET);
			configuration.setSimSpeed(DEFAULT_SIM_SPEED);
			setConfiguration(configuration);
		}

		getSystem().getAreas().stream().map(a -> a.getConnectors()).flatMap(c -> c.stream()).forEach(con -> {
			ConnectorInfo coni = getConnectorInfos().stream().filter(ci -> ci.getConnector().equals(con)).findFirst()
					.orElse(null);
			if (coni == null) {
				coni = STLSimulationFactory.eINSTANCE.createConnectorInfo();
				getConnectorInfos().add(coni);
				coni.setConnector(con);

			}
			cInfoMap.put(con, coni);
		});

		getSystem().getAreas().forEach(a -> a.getComponents().forEach(com -> {
			ComponentInfo ci = getComponentInfos().stream().filter(ci1 -> ci1.getComponent().equals(com)).findFirst()
					.orElse(null);
			if (ci == null) {
				ci = createComponentInfo(com);
			}

			ci.getOutputConnectors().clear();
			for (Connector con : getOutputConnectors(getSystem(), com)) {
				ci.getOutputConnectors().add(cInfoMap.get(con));

			}

			ci.getInputConnectors().clear();
			for (Connector con : getInputConnectors(getSystem(), com)) {
				ci.getInputConnectors().add(cInfoMap.get(con));

			}

			if (!com.getServices().isEmpty()) {
				ci.setReliability(com.getServices().get(0).getReliability());
				ci.setProcessingTime(com.getServices().get(0).getProcessingTime());
			}
			getComponentInfos().add(ci);

		}));

	}

	private ComponentInfo createComponentInfo(Component component) {
		ComponentInfo newInfo;
		if (component instanceof Store || component instanceof Buffer) {
			newInfo = STLSimulationFactory.eINSTANCE.createStoreInfo();
		} else {
			newInfo = STLSimulationFactory.eINSTANCE.createComponentInfo();
		}
		newInfo.setComponent(component);
		return newInfo;
	}

	private List<Connector> getOutputConnectors(at.ac.tuwien.big.stl.System system, Component component) {
		return system.getAreas().stream().map(a -> a.getConnectors()).flatMap(x -> x.stream())
				.filter(con -> component.getOutputSlots().contains(con.getEntry())).collect(Collectors.toList());
	}

	private List<Connector> getInputConnectors(at.ac.tuwien.big.stl.System system, Component component) {
		return system.getAreas().stream().map(a -> a.getConnectors()).flatMap(x -> x.stream())
				.filter(con -> component.getInputSlots().contains(con.getExit())).collect(Collectors.toList());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case STLSimulationPackage.SIMULATION_MODEL__COMPONENT_INFOS:
			return ((InternalEList<?>) getComponentInfos()).basicRemove(otherEnd, msgs);
		case STLSimulationPackage.SIMULATION_MODEL__CONNECTOR_INFOS:
			return ((InternalEList<?>) getConnectorInfos()).basicRemove(otherEnd, msgs);
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
		case STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION:
			return getConfiguration();
		case STLSimulationPackage.SIMULATION_MODEL__COMPONENT_INFOS:
			return getComponentInfos();
		case STLSimulationPackage.SIMULATION_MODEL__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
		case STLSimulationPackage.SIMULATION_MODEL__CONNECTOR_INFOS:
			return getConnectorInfos();
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
		case STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION:
			setConfiguration((SimConfiguration) newValue);
			return;
		case STLSimulationPackage.SIMULATION_MODEL__COMPONENT_INFOS:
			getComponentInfos().clear();
			getComponentInfos().addAll((Collection<? extends ComponentInfo>) newValue);
			return;
		case STLSimulationPackage.SIMULATION_MODEL__SYSTEM:
			setSystem((at.ac.tuwien.big.stl.System) newValue);
			return;
		case STLSimulationPackage.SIMULATION_MODEL__CONNECTOR_INFOS:
			getConnectorInfos().clear();
			getConnectorInfos().addAll((Collection<? extends ConnectorInfo>) newValue);
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
		case STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION:
			setConfiguration((SimConfiguration) null);
			return;
		case STLSimulationPackage.SIMULATION_MODEL__COMPONENT_INFOS:
			getComponentInfos().clear();
			return;
		case STLSimulationPackage.SIMULATION_MODEL__SYSTEM:
			setSystem((at.ac.tuwien.big.stl.System) null);
			return;
		case STLSimulationPackage.SIMULATION_MODEL__CONNECTOR_INFOS:
			getConnectorInfos().clear();
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
		case STLSimulationPackage.SIMULATION_MODEL__CONFIGURATION:
			return configuration != null;
		case STLSimulationPackage.SIMULATION_MODEL__COMPONENT_INFOS:
			return componentInfos != null && !componentInfos.isEmpty();
		case STLSimulationPackage.SIMULATION_MODEL__SYSTEM:
			return system != null;
		case STLSimulationPackage.SIMULATION_MODEL__CONNECTOR_INFOS:
			return connectorInfos != null && !connectorInfos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case STLSimulationPackage.SIMULATION_MODEL___SIMULATE:
			simulate();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // SimulationModelImpl
