/**
 */
package at.ac.tuwien.big.stl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.stl.Connector#getEntry <em>Entry</em>}</li>
 *   <li>{@link at.ac.tuwien.big.stl.Connector#getExit <em>Exit</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.stl.STLPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConnectedSlotsHaveToMatch ConnectorsHaveToConnectInputAndOutputSlots ConnectorsHaveToConnectSlotsOfDifferentComponents ConnectorInSourceArea'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConnectedSlotsHaveToMatch='self.entry.requiredType = self.exit.requiredType' ConnectorsHaveToConnectInputAndOutputSlots='Component.allInstances() -&gt; exists (c | c.outputSlots-&gt;includes(self.entry)) and Component.allInstances() -&gt; exists (c | c.inputSlots-&gt;includes(self.exit))' ConnectorsHaveToConnectSlotsOfDifferentComponents='Component.allInstances() -&gt; select(c | c.outputSlots-&gt;includes(self.entry) or c.inputSlots-&gt;includes(self.entry)) -&gt; asOrderedSet() -&gt; first() &lt;&gt; Component.allInstances() -&gt; select(c | c.outputSlots-&gt;includes(self.exit) or c.inputSlots-&gt;includes(self.exit)) -&gt; asOrderedSet() -&gt; first()' ConnectorInSourceArea='Area.allInstances() -&gt; select (a | a.components-&gt; includes(Component.allInstances() -&gt; select(c | c.outputSlots -&gt; includes(self.entry) or c.inputSlots -&gt; includes(self.entry)) -&gt; asOrderedSet() -&gt; first())) -&gt; asOrderedSet() -&gt; first() = Area.allInstances() -&gt; select(a | a.connectors -&gt; includes(self)) -&gt; asOrderedSet() -&gt; first()'"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(Slot)
	 * @see at.ac.tuwien.big.stl.STLPackage#getConnector_Entry()
	 * @model required="true"
	 * @generated
	 */
	Slot getEntry();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Connector#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Slot value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference.
	 * @see #setExit(Slot)
	 * @see at.ac.tuwien.big.stl.STLPackage#getConnector_Exit()
	 * @model required="true"
	 * @generated
	 */
	Slot getExit();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.stl.Connector#getExit <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Slot value);

} // Connector
