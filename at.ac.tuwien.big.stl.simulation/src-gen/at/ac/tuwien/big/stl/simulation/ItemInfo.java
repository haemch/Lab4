/**
 */
package at.ac.tuwien.big.stl.simulation;

import at.ac.tuwien.big.stl.ItemType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getFinalizationTime <em>Finalization Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getTotalLatency <em>Total Latency</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getQuality <em>Quality</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getState <em>State</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo()
 * @model
 * @generated
 */
public interface ItemInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Itemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtype</em>' reference.
	 * @see #setItemtype(ItemType)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo_Itemtype()
	 * @model
	 * @generated
	 */
	ItemType getItemtype();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getItemtype <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtype</em>' reference.
	 * @see #getItemtype()
	 * @generated
	 */
	void setItemtype(ItemType value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(long)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo_CreationTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getCreationTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(int)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo_State()
	 * @model default="-1"
	 * @generated
	 */
	int getState();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(int value);

	/**
	 * Returns the value of the '<em><b>Finalization Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalization Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalization Time</em>' attribute.
	 * @see #setFinalizationTime(long)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo_FinalizationTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getFinalizationTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getFinalizationTime <em>Finalization Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalization Time</em>' attribute.
	 * @see #getFinalizationTime()
	 * @generated
	 */
	void setFinalizationTime(long value);

	/**
	 * Returns the value of the '<em><b>Total Latency</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Latency</em>' attribute.
	 * @see #setTotalLatency(long)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo_TotalLatency()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getTotalLatency();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getTotalLatency <em>Total Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Latency</em>' attribute.
	 * @see #getTotalLatency()
	 * @generated
	 */
	void setTotalLatency(long value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see #setQuality(double)
	 * @see at.ac.tuwien.big.stl.simulation.STLSimulationPackage#getItemInfo_Quality()
	 * @model required="true"
	 * @generated
	 */
	double getQuality();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.simulation.ItemInfo#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(double value);

} // ItemInfo
