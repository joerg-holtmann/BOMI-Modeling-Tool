/**
 */
package se.gu.cse.idxse.bomi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purposed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.PurposedElement#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getPurposedElement()
 * @model abstract="true"
 * @generated
 */
public interface PurposedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getPurposedElement_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.PurposedElement#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // PurposedElement
