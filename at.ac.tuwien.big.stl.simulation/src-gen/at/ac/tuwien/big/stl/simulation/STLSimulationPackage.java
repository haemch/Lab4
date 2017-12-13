/**
 */
package at.ac.tuwien.big.stl.simulation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import at.ac.tuwien.big.stl='../../at.ac.tuwien.big.stl/model/stl.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface STLSimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.big.tuwien.ac.at/stl/simulation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	STLSimulationPackage eINSTANCE = at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl <em>Sim Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl
	 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getSimConfiguration()
	 * @generated
	 */
	int SIM_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Simulation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION__SIMULATION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION__BUDGET = 1;

	/**
	 * The feature id for the '<em><b>Remaining Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION__REMAINING_BUDGET = 2;

	/**
	 * The feature id for the '<em><b>Item Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION__ITEM_THROUGHPUT = 3;

	/**
	 * The feature id for the '<em><b>Average Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION__AVERAGE_LATENCY = 4;

	/**
	 * The feature id for the '<em><b>Average Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION__AVERAGE_QUALITY = 5;

	/**
	 * The feature id for the '<em><b>Sim Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION__SIM_SPEED = 6;

	/**
	 * The number of structural features of the '<em>Sim Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Sim Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl <em>Item Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl
	 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getItemInfo()
	 * @generated
	 */
	int ITEM_INFO = 4;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl <em>Component Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl
	 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getComponentInfo()
	 * @generated
	 */
	int COMPONENT_INFO = 1;

	/**
	 * The feature id for the '<em><b>Is Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__IS_BUSY = 0;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__CREATION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__USE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__UTILIZATION = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__PROCESSING_TIME = 5;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__RELIABILITY = 6;

	/**
	 * The feature id for the '<em><b>Output Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__OUTPUT_CONNECTORS = 7;

	/**
	 * The feature id for the '<em><b>Input Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__INPUT_CONNECTORS = 8;

	/**
	 * The feature id for the '<em><b>Min Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO__MIN_INPUT = 9;

	/**
	 * The number of structural features of the '<em>Component Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO___PROCESS = 0;

	/**
	 * The number of operations of the '<em>Component Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INFO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl <em>Simulation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl
	 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getSimulationModel()
	 * @generated
	 */
	int SIMULATION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MODEL__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Component Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MODEL__COMPONENT_INFOS = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MODEL__SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Connector Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MODEL__CONNECTOR_INFOS = 3;

	/**
	 * The number of structural features of the '<em>Simulation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MODEL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Simulate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MODEL___SIMULATE = 0;

	/**
	 * The number of operations of the '<em>Simulation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.simulation.impl.StoreInfoImpl <em>Store Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.simulation.impl.StoreInfoImpl
	 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getStoreInfo()
	 * @generated
	 */
	int STORE_INFO = 3;

	/**
	 * The feature id for the '<em><b>Is Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__IS_BUSY = COMPONENT_INFO__IS_BUSY;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__CREATION_TIME = COMPONENT_INFO__CREATION_TIME;

	/**
	 * The feature id for the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__USE_TIME = COMPONENT_INFO__USE_TIME;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__UTILIZATION = COMPONENT_INFO__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__COMPONENT = COMPONENT_INFO__COMPONENT;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__PROCESSING_TIME = COMPONENT_INFO__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__RELIABILITY = COMPONENT_INFO__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Output Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__OUTPUT_CONNECTORS = COMPONENT_INFO__OUTPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Input Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__INPUT_CONNECTORS = COMPONENT_INFO__INPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Min Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__MIN_INPUT = COMPONENT_INFO__MIN_INPUT;

	/**
	 * The feature id for the '<em><b>Stored Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO__STORED_ITEMS = COMPONENT_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Store Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO_FEATURE_COUNT = COMPONENT_INFO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO___PROCESS = COMPONENT_INFO___PROCESS;

	/**
	 * The number of operations of the '<em>Store Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_INFO_OPERATION_COUNT = COMPONENT_INFO_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finalization Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO__FINALIZATION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Total Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO__TOTAL_LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO__QUALITY = 2;

	/**
	 * The feature id for the '<em><b>Itemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO__ITEMTYPE = 3;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO__CREATION_TIME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO__NAME = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO__STATE = 6;

	/**
	 * The number of structural features of the '<em>Item Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Item Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.stl.simulation.impl.ConnectorInfoImpl <em>Connector Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.stl.simulation.impl.ConnectorInfoImpl
	 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getConnectorInfo()
	 * @generated
	 */
	int CONNECTOR_INFO = 5;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Required State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__REQUIRED_STATE = 2;

	/**
	 * The number of structural features of the '<em>Connector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration <em>Sim Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Configuration</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration
	 * @generated
	 */
	EClass getSimConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimulationTime <em>Simulation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Time</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimulationTime()
	 * @see #getSimConfiguration()
	 * @generated
	 */
	EAttribute getSimConfiguration_SimulationTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration#getBudget()
	 * @see #getSimConfiguration()
	 * @generated
	 */
	EAttribute getSimConfiguration_Budget();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getRemainingBudget <em>Remaining Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Budget</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration#getRemainingBudget()
	 * @see #getSimConfiguration()
	 * @generated
	 */
	EAttribute getSimConfiguration_RemainingBudget();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getItemThroughput <em>Item Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Throughput</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration#getItemThroughput()
	 * @see #getSimConfiguration()
	 * @generated
	 */
	EAttribute getSimConfiguration_ItemThroughput();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageLatency <em>Average Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Latency</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageLatency()
	 * @see #getSimConfiguration()
	 * @generated
	 */
	EAttribute getSimConfiguration_AverageLatency();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageQuality <em>Average Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Quality</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration#getAverageQuality()
	 * @see #getSimConfiguration()
	 * @generated
	 */
	EAttribute getSimConfiguration_AverageQuality();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimSpeed <em>Sim Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sim Speed</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimConfiguration#getSimSpeed()
	 * @see #getSimConfiguration()
	 * @generated
	 */
	EAttribute getSimConfiguration_SimSpeed();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.simulation.ItemInfo <em>Item Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Info</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo
	 * @generated
	 */
	EClass getItemInfo();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getItemtype <em>Itemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Itemtype</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo#getItemtype()
	 * @see #getItemInfo()
	 * @generated
	 */
	EReference getItemInfo_Itemtype();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo#getCreationTime()
	 * @see #getItemInfo()
	 * @generated
	 */
	EAttribute getItemInfo_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo#getName()
	 * @see #getItemInfo()
	 * @generated
	 */
	EAttribute getItemInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo#getState()
	 * @see #getItemInfo()
	 * @generated
	 */
	EAttribute getItemInfo_State();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo <em>Connector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Info</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ConnectorInfo
	 * @generated
	 */
	EClass getConnectorInfo();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ConnectorInfo#getItem()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EReference getConnectorInfo_Item();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ConnectorInfo#getConnector()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EReference getConnectorInfo_Connector();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ConnectorInfo#getRequiredState <em>Required State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required State</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ConnectorInfo#getRequiredState()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EAttribute getConnectorInfo_RequiredState();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getFinalizationTime <em>Finalization Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalization Time</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo#getFinalizationTime()
	 * @see #getItemInfo()
	 * @generated
	 */
	EAttribute getItemInfo_FinalizationTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getTotalLatency <em>Total Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Latency</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo#getTotalLatency()
	 * @see #getItemInfo()
	 * @generated
	 */
	EAttribute getItemInfo_TotalLatency();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ItemInfo#getQuality()
	 * @see #getItemInfo()
	 * @generated
	 */
	EAttribute getItemInfo_Quality();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo <em>Component Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Info</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo
	 * @generated
	 */
	EClass getComponentInfo();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#isIsBusy <em>Is Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Busy</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#isIsBusy()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_IsBusy();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getCreationTime()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getUseTime <em>Use Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Time</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getUseTime()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_UseTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getUtilization()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_Utilization();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getComponent()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EReference getComponentInfo_Component();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getInputConnectors <em>Input Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Connectors</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getInputConnectors()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EReference getComponentInfo_InputConnectors();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getMinInput <em>Min Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Input</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getMinInput()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_MinInput();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Time</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getProcessingTime()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_ProcessingTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getReliability()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EAttribute getComponentInfo_Reliability();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#getOutputConnectors <em>Output Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Connectors</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#getOutputConnectors()
	 * @see #getComponentInfo()
	 * @generated
	 */
	EReference getComponentInfo_OutputConnectors();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.stl.simulation.ComponentInfo#process() <em>Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process</em>' operation.
	 * @see at.ac.tuwien.big.stl.simulation.ComponentInfo#process()
	 * @generated
	 */
	EOperation getComponentInfo__Process();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.simulation.SimulationModel <em>Simulation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Model</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimulationModel
	 * @generated
	 */
	EClass getSimulationModel();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimulationModel#getConfiguration()
	 * @see #getSimulationModel()
	 * @generated
	 */
	EReference getSimulationModel_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getComponentInfos <em>Component Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Infos</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimulationModel#getComponentInfos()
	 * @see #getSimulationModel()
	 * @generated
	 */
	EReference getSimulationModel_ComponentInfos();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimulationModel#getSystem()
	 * @see #getSimulationModel()
	 * @generated
	 */
	EReference getSimulationModel_System();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.simulation.SimulationModel#getConnectorInfos <em>Connector Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Infos</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.SimulationModel#getConnectorInfos()
	 * @see #getSimulationModel()
	 * @generated
	 */
	EReference getSimulationModel_ConnectorInfos();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.stl.simulation.SimulationModel#simulate() <em>Simulate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Simulate</em>' operation.
	 * @see at.ac.tuwien.big.stl.simulation.SimulationModel#simulate()
	 * @generated
	 */
	EOperation getSimulationModel__Simulate();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.stl.simulation.StoreInfo <em>Store Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Info</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.StoreInfo
	 * @generated
	 */
	EClass getStoreInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.stl.simulation.StoreInfo#getStoredItems <em>Stored Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stored Items</em>'.
	 * @see at.ac.tuwien.big.stl.simulation.StoreInfo#getStoredItems()
	 * @see #getStoreInfo()
	 * @generated
	 */
	EReference getStoreInfo_StoredItems();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	STLSimulationFactory getSTLSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl <em>Sim Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.simulation.impl.SimConfigurationImpl
		 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getSimConfiguration()
		 * @generated
		 */
		EClass SIM_CONFIGURATION = eINSTANCE.getSimConfiguration();

		/**
		 * The meta object literal for the '<em><b>Simulation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIGURATION__SIMULATION_TIME = eINSTANCE.getSimConfiguration_SimulationTime();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIGURATION__BUDGET = eINSTANCE.getSimConfiguration_Budget();

		/**
		 * The meta object literal for the '<em><b>Remaining Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIGURATION__REMAINING_BUDGET = eINSTANCE.getSimConfiguration_RemainingBudget();

		/**
		 * The meta object literal for the '<em><b>Item Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIGURATION__ITEM_THROUGHPUT = eINSTANCE.getSimConfiguration_ItemThroughput();

		/**
		 * The meta object literal for the '<em><b>Average Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIGURATION__AVERAGE_LATENCY = eINSTANCE.getSimConfiguration_AverageLatency();

		/**
		 * The meta object literal for the '<em><b>Average Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIGURATION__AVERAGE_QUALITY = eINSTANCE.getSimConfiguration_AverageQuality();

		/**
		 * The meta object literal for the '<em><b>Sim Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIGURATION__SIM_SPEED = eINSTANCE.getSimConfiguration_SimSpeed();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl <em>Item Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.simulation.impl.ItemInfoImpl
		 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getItemInfo()
		 * @generated
		 */
		EClass ITEM_INFO = eINSTANCE.getItemInfo();

		/**
		 * The meta object literal for the '<em><b>Itemtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_INFO__ITEMTYPE = eINSTANCE.getItemInfo_Itemtype();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_INFO__CREATION_TIME = eINSTANCE.getItemInfo_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_INFO__NAME = eINSTANCE.getItemInfo_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_INFO__STATE = eINSTANCE.getItemInfo_State();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.simulation.impl.ConnectorInfoImpl <em>Connector Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.simulation.impl.ConnectorInfoImpl
		 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getConnectorInfo()
		 * @generated
		 */
		EClass CONNECTOR_INFO = eINSTANCE.getConnectorInfo();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INFO__ITEM = eINSTANCE.getConnectorInfo_Item();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INFO__CONNECTOR = eINSTANCE.getConnectorInfo_Connector();

		/**
		 * The meta object literal for the '<em><b>Required State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_INFO__REQUIRED_STATE = eINSTANCE.getConnectorInfo_RequiredState();

		/**
		 * The meta object literal for the '<em><b>Finalization Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_INFO__FINALIZATION_TIME = eINSTANCE.getItemInfo_FinalizationTime();

		/**
		 * The meta object literal for the '<em><b>Total Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_INFO__TOTAL_LATENCY = eINSTANCE.getItemInfo_TotalLatency();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_INFO__QUALITY = eINSTANCE.getItemInfo_Quality();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl <em>Component Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.simulation.impl.ComponentInfoImpl
		 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getComponentInfo()
		 * @generated
		 */
		EClass COMPONENT_INFO = eINSTANCE.getComponentInfo();

		/**
		 * The meta object literal for the '<em><b>Is Busy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__IS_BUSY = eINSTANCE.getComponentInfo_IsBusy();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__CREATION_TIME = eINSTANCE.getComponentInfo_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Use Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__USE_TIME = eINSTANCE.getComponentInfo_UseTime();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__UTILIZATION = eINSTANCE.getComponentInfo_Utilization();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INFO__COMPONENT = eINSTANCE.getComponentInfo_Component();

		/**
		 * The meta object literal for the '<em><b>Input Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INFO__INPUT_CONNECTORS = eINSTANCE.getComponentInfo_InputConnectors();

		/**
		 * The meta object literal for the '<em><b>Min Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__MIN_INPUT = eINSTANCE.getComponentInfo_MinInput();

		/**
		 * The meta object literal for the '<em><b>Processing Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__PROCESSING_TIME = eINSTANCE.getComponentInfo_ProcessingTime();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INFO__RELIABILITY = eINSTANCE.getComponentInfo_Reliability();

		/**
		 * The meta object literal for the '<em><b>Output Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INFO__OUTPUT_CONNECTORS = eINSTANCE.getComponentInfo_OutputConnectors();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_INFO___PROCESS = eINSTANCE.getComponentInfo__Process();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl <em>Simulation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.simulation.impl.SimulationModelImpl
		 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getSimulationModel()
		 * @generated
		 */
		EClass SIMULATION_MODEL = eINSTANCE.getSimulationModel();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_MODEL__CONFIGURATION = eINSTANCE.getSimulationModel_Configuration();

		/**
		 * The meta object literal for the '<em><b>Component Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_MODEL__COMPONENT_INFOS = eINSTANCE.getSimulationModel_ComponentInfos();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_MODEL__SYSTEM = eINSTANCE.getSimulationModel_System();

		/**
		 * The meta object literal for the '<em><b>Connector Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_MODEL__CONNECTOR_INFOS = eINSTANCE.getSimulationModel_ConnectorInfos();

		/**
		 * The meta object literal for the '<em><b>Simulate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMULATION_MODEL___SIMULATE = eINSTANCE.getSimulationModel__Simulate();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.stl.simulation.impl.StoreInfoImpl <em>Store Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.stl.simulation.impl.StoreInfoImpl
		 * @see at.ac.tuwien.big.stl.simulation.impl.STLSimulationPackageImpl#getStoreInfo()
		 * @generated
		 */
		EClass STORE_INFO = eINSTANCE.getStoreInfo();

		/**
		 * The meta object literal for the '<em><b>Stored Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_INFO__STORED_ITEMS = eINSTANCE.getStoreInfo_StoredItems();

	}

} //STLSimulationPackage
