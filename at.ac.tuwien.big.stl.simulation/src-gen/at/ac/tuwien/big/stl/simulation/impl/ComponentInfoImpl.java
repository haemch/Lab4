/**
 */
package at.ac.tuwien.big.stl.simulation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import at.ac.tuwien.big.stl.Component;
import at.ac.tuwien.big.stl.Conveyor;
import at.ac.tuwien.big.stl.ItemGenerator;
import at.ac.tuwien.big.stl.Machine;
import at.ac.tuwien.big.stl.TurnTable;
import at.ac.tuwien.big.stl.simulation.ComponentInfo;
import at.ac.tuwien.big.stl.simulation.ConnectorInfo;
import at.ac.tuwien.big.stl.simulation.ItemInfo;
import at.ac.tuwien.big.stl.simulation.STLSimulationFactory;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.simulator.Event;
import at.ac.tuwien.big.stl.simulation.simulator.EventRunnable;
import at.ac.tuwien.big.stl.simulation.simulator.Simulator;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#isIsBusy <em>Is Busy</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getOutputConnectors <em>Output Connectors</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getInputConnectors <em>Input Connectors</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl#getMinInput <em>Min Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInfoImpl extends MinimalEObjectImpl.Container implements ComponentInfo {
	/**
	 * The default value of the '{@link #isIsBusy() <em>Is Busy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsBusy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BUSY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBusy() <em>Is Busy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsBusy()
	 * @generated
	 * @ordered
	 */
	protected boolean isBusy = IS_BUSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected long creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected long useTime = USE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected double utilization = UTILIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The default value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSING_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected int processingTime = PROCESSING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected static final double RELIABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected double reliability = RELIABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputConnectors() <em>Output
	 * Connectors</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getOutputConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInfo> outputConnectors;

	/**
	 * The cached value of the '{@link #getInputConnectors() <em>Input
	 * Connectors</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getInputConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInfo> inputConnectors;

	/**
	 * The default value of the '{@link #getMinInput() <em>Min Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInput()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INPUT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinInput() <em>Min Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInput()
	 * @generated
	 * @ordered
	 */
	protected int minInput = MIN_INPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STLSimulationPackage.Literals.COMPONENT_INFO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBusy() {
		return isBusy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBusy(boolean newIsBusy) {
		boolean oldIsBusy = isBusy;
		isBusy = newIsBusy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__IS_BUSY,
					oldIsBusy, isBusy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(long newCreationTime) {
		long oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__CREATION_TIME,
					oldCreationTime, creationTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getUseTime() {
		return useTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseTime(long newUseTime) {
		long oldUseTime = useTime;
		useTime = newUseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__USE_TIME,
					oldUseTime, useTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(double newUtilization) {
		double oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__UTILIZATION,
					oldUtilization, utilization));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STLSimulationPackage.COMPONENT_INFO__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInfo> getInputConnectors() {
		if (inputConnectors == null) {
			inputConnectors = new EObjectResolvingEList<ConnectorInfo>(ConnectorInfo.class, this,
					STLSimulationPackage.COMPONENT_INFO__INPUT_CONNECTORS);
		}
		return inputConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInput() {
		return minInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInput(int newMinInput) {
		int oldMinInput = minInput;
		minInput = newMinInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__MIN_INPUT,
					oldMinInput, minInput));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessingTime() {
		return processingTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingTime(int newProcessingTime) {
		int oldProcessingTime = processingTime;
		processingTime = newProcessingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__PROCESSING_TIME,
					oldProcessingTime, processingTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(double newReliability) {
		double oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STLSimulationPackage.COMPONENT_INFO__RELIABILITY,
					oldReliability, reliability));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInfo> getOutputConnectors() {
		if (outputConnectors == null) {
			outputConnectors = new EObjectResolvingEList<ConnectorInfo>(ConnectorInfo.class, this,
					STLSimulationPackage.COMPONENT_INFO__OUTPUT_CONNECTORS);
		}
		return outputConnectors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean process() {
		if (isBusy) {
			return false;
		}
		Component comp = getComponent();
		if (comp instanceof ItemGenerator) {
			return process((ItemGenerator) comp);
		} else if (comp instanceof Conveyor) {
			return process((Conveyor) comp);
		} else if (comp instanceof Machine) {
			return process((Machine) comp);
		} else if (comp instanceof TurnTable) {
			return process((TurnTable) comp);
		}
		return false;
	}

	private boolean process(TurnTable comp) {
		// Transport item
		for (ConnectorInfo inCon : getInputConnectors()) {
			ItemInfo curItem = inCon.getItem();
			if (curItem != null) {
				// Don't do anything if target slot is nonempty
				for (ConnectorInfo oslot : getOutputConnectors()) {
					if (oslot.getItem() == null && oslot.doesFit(curItem)) {

						setIsBusy(true);
						Simulator.staticSchedule(getProcessingTime(), (ev, st) -> {
							Component outputComponent = (Component) oslot.getConnector().getExit().eContainer();
							System.out.println("TurnTable " + getComponent().getName() + " transfers product "
									+ curItem.getItemtype().toString() + "/" + curItem.getState() + "at " + st + " to "
									+ outputComponent.getName());

							inCon.setItem(null);
							oslot.setItem(curItem);
							if (Math.random() >= getReliability()) {
								curItem.setQuality(0.0);
							}

							setUseTime(getUseTime() + getProcessingTime());
							isBusy = false;
							ev.scheduleIn(0, (e, s) -> process());
						});
						return true;
					}

				}
			}
		}
		return false;

	}

	private boolean process(Machine comp) {
		// Check input
		int haveInput = 0;
		for (ConnectorInfo inCon : getInputConnectors()) {
			ItemInfo it = inCon.getItem();
			if (it == null) {
				return false;
			}
			if (!inCon.doesFit(it)) {
				return false;
			}else {
				++haveInput;
			}
		}
		
		if (haveInput < getMinInput()) {
			return false;
		}
		// Check output
		for (ConnectorInfo outCon : getOutputConnectors()) {
			if (outCon.getItem() != null) {
				return false;
			}
		}

		// Now you can start production
		setIsBusy(true);
		Simulator.staticSchedule(getProcessingTime(), (ev, st) -> {
			double minQuality = 1.0;
			for (ConnectorInfo inCon : getInputConnectors()) {
				minQuality = Math.min(inCon.getItem().getQuality(), minQuality);
				inCon.setItem(null);
			}
			setUseTime(getUseTime() + getProcessingTime());
			setIsBusy(false);

			for (ConnectorInfo outCon : getOutputConnectors()) {
				ItemInfo item = STLSimulationFactory.eINSTANCE.createItemInfo();

				item.setName(UUID.randomUUID().toString());
				item.setQuality(1.0);
				item.setItemtype(outCon.getConnector().getEntry().getRequiredType());
				// Don't do anything if target slot is nonempty

				System.out.println("[" + st + "]: Machine " + getComponent().getName() + " builds product");
				item.setCreationTime(st);

				if (Math.random() > getReliability()) {
					item.setQuality(0.0);
				} else {
					item.setQuality(minQuality);
				}
				if (item.getQuality() == 0.0) {
					item.setState(Simulator.BROKEN_PRODUCT);
				} else {

				}
				outCon.setItem(item);
			}
			ev.scheduleIn(0, (e, s) -> process());
		});
		return true;

	}

	private boolean process(Conveyor conveyor) {
		for (ConnectorInfo inCon : getInputConnectors()) {
			ItemInfo curItem = inCon.getItem();
			if (curItem != null) {
				for (ConnectorInfo outCon : getOutputConnectors()) {
					if (outCon.getItem() == null && outCon.doesFit(curItem)) {
						setIsBusy(true);
						System.out.println("Valid item: " + curItem);
						Simulator.staticSchedule(getProcessingTime(), (ev, st) -> {
							Component outputComponent = (Component) outCon.getConnector().getExit().eContainer();

							System.out.println("[" + st + "]: Band " + getComponent().getName()
									+ " transfers product to " + outputComponent.getName());

							outCon.setItem(curItem);
							inCon.setItem(null);
							setUseTime(getUseTime() + getProcessingTime());

							setIsBusy(false);
							ev.scheduleIn(0, (e, s) -> process());
						});
						return true;
					}

				}
			}
		}
		setIsBusy(false);
		return false;
	}

	private boolean process(ItemGenerator generator) {
		for (ConnectorInfo conInfo : getOutputConnectors()) {
			if (conInfo.getItem() == null) {
				ItemInfo ii = STLSimulationFactory.eINSTANCE.createItemInfo();
				ii.setName(UUID.randomUUID().toString());
				ii.setQuality(1.0);

				if (Math.random() > getReliability()) {
					ii.setQuality(0.0);
				}
				ii.setItemtype(generator.getGeneratedType());

				setIsBusy(true);

				Simulator.staticSchedule(getProcessingTime(), new EventRunnable() {

					@Override
					public void run(Event ev, long startTime) {
						System.out.println(
								"[" + startTime + "]: Item Generator " + getComponent().getName() + " generates item");
						ii.setCreationTime(startTime);
						conInfo.setItem(ii);
						setUseTime(getUseTime() + getProcessingTime());
						isBusy = false;
						ev.scheduleIn(0, (ev2, st2) -> process());
					}
				});
				return true;
			}
		}

		System.out.println("Generator " + getComponent().getName() + ": all output blocked");
		return false;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STLSimulationPackage.COMPONENT_INFO__IS_BUSY:
			return isIsBusy();
		case STLSimulationPackage.COMPONENT_INFO__CREATION_TIME:
			return getCreationTime();
		case STLSimulationPackage.COMPONENT_INFO__USE_TIME:
			return getUseTime();
		case STLSimulationPackage.COMPONENT_INFO__UTILIZATION:
			return getUtilization();
		case STLSimulationPackage.COMPONENT_INFO__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case STLSimulationPackage.COMPONENT_INFO__PROCESSING_TIME:
			return getProcessingTime();
		case STLSimulationPackage.COMPONENT_INFO__RELIABILITY:
			return getReliability();
		case STLSimulationPackage.COMPONENT_INFO__OUTPUT_CONNECTORS:
			return getOutputConnectors();
		case STLSimulationPackage.COMPONENT_INFO__INPUT_CONNECTORS:
			return getInputConnectors();
		case STLSimulationPackage.COMPONENT_INFO__MIN_INPUT:
			return getMinInput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STLSimulationPackage.COMPONENT_INFO__IS_BUSY:
			setIsBusy((Boolean) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__CREATION_TIME:
			setCreationTime((Long) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__USE_TIME:
			setUseTime((Long) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__UTILIZATION:
			setUtilization((Double) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__COMPONENT:
			setComponent((Component) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__PROCESSING_TIME:
			setProcessingTime((Integer) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__RELIABILITY:
			setReliability((Double) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__OUTPUT_CONNECTORS:
			getOutputConnectors().clear();
			getOutputConnectors().addAll((Collection<? extends ConnectorInfo>) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__INPUT_CONNECTORS:
			getInputConnectors().clear();
			getInputConnectors().addAll((Collection<? extends ConnectorInfo>) newValue);
			return;
		case STLSimulationPackage.COMPONENT_INFO__MIN_INPUT:
			setMinInput((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STLSimulationPackage.COMPONENT_INFO__IS_BUSY:
			setIsBusy(IS_BUSY_EDEFAULT);
			return;
		case STLSimulationPackage.COMPONENT_INFO__CREATION_TIME:
			setCreationTime(CREATION_TIME_EDEFAULT);
			return;
		case STLSimulationPackage.COMPONENT_INFO__USE_TIME:
			setUseTime(USE_TIME_EDEFAULT);
			return;
		case STLSimulationPackage.COMPONENT_INFO__UTILIZATION:
			setUtilization(UTILIZATION_EDEFAULT);
			return;
		case STLSimulationPackage.COMPONENT_INFO__COMPONENT:
			setComponent((Component) null);
			return;
		case STLSimulationPackage.COMPONENT_INFO__PROCESSING_TIME:
			setProcessingTime(PROCESSING_TIME_EDEFAULT);
			return;
		case STLSimulationPackage.COMPONENT_INFO__RELIABILITY:
			setReliability(RELIABILITY_EDEFAULT);
			return;
		case STLSimulationPackage.COMPONENT_INFO__OUTPUT_CONNECTORS:
			getOutputConnectors().clear();
			return;
		case STLSimulationPackage.COMPONENT_INFO__INPUT_CONNECTORS:
			getInputConnectors().clear();
			return;
		case STLSimulationPackage.COMPONENT_INFO__MIN_INPUT:
			setMinInput(MIN_INPUT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STLSimulationPackage.COMPONENT_INFO__IS_BUSY:
			return isBusy != IS_BUSY_EDEFAULT;
		case STLSimulationPackage.COMPONENT_INFO__CREATION_TIME:
			return creationTime != CREATION_TIME_EDEFAULT;
		case STLSimulationPackage.COMPONENT_INFO__USE_TIME:
			return useTime != USE_TIME_EDEFAULT;
		case STLSimulationPackage.COMPONENT_INFO__UTILIZATION:
			return utilization != UTILIZATION_EDEFAULT;
		case STLSimulationPackage.COMPONENT_INFO__COMPONENT:
			return component != null;
		case STLSimulationPackage.COMPONENT_INFO__PROCESSING_TIME:
			return processingTime != PROCESSING_TIME_EDEFAULT;
		case STLSimulationPackage.COMPONENT_INFO__RELIABILITY:
			return reliability != RELIABILITY_EDEFAULT;
		case STLSimulationPackage.COMPONENT_INFO__OUTPUT_CONNECTORS:
			return outputConnectors != null && !outputConnectors.isEmpty();
		case STLSimulationPackage.COMPONENT_INFO__INPUT_CONNECTORS:
			return inputConnectors != null && !inputConnectors.isEmpty();
		case STLSimulationPackage.COMPONENT_INFO__MIN_INPUT:
			return minInput != MIN_INPUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case STLSimulationPackage.COMPONENT_INFO___PROCESS:
			return process();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isBusy: ");
		result.append(isBusy);
		result.append(", creationTime: ");
		result.append(creationTime);
		result.append(", useTime: ");
		result.append(useTime);
		result.append(", utilization: ");
		result.append(utilization);
		result.append(", processingTime: ");
		result.append(processingTime);
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", minInput: ");
		result.append(minInput);
		result.append(')');
		return result.toString();
	}

} // ComponentInfoImpl
