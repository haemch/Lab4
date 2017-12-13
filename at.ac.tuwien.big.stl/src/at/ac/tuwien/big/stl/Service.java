/**
 */
package at.ac.tuwien.big.stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.Service#getCost <em>Cost</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Service#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Service#getReliability <em>Reliability</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Service#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ReliabilityBetween0And1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ReliabilityBetween0And1='self.reliability &gt;= 0 and self.reliability &lt;=1'"
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see at.ac.tuwien.big.stl.STLPackage#getService_Cost()
	 * @model required="true"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Service#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' attribute.
	 * @see #setProcessingTime(int)
	 * @see at.ac.tuwien.big.stl.STLPackage#getService_ProcessingTime()
	 * @model required="true"
	 * @generated
	 */
	int getProcessingTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Service#getProcessingTime <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' attribute.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(int value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(double)
	 * @see at.ac.tuwien.big.stl.STLPackage#getService_Reliability()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getReliability();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Service#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(double value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.stl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see at.ac.tuwien.big.stl.STLPackage#getService_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Service
