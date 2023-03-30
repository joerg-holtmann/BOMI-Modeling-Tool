/**
 */
package se.gu.cse.idxse.bomi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methodological Island</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.MethodologicalIsland#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getMethodologicalIsland()
 * @model
 * @generated
 */
public interface MethodologicalIsland extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.MIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MIType
	 * @see #setType(MIType)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getMethodologicalIsland_Type()
	 * @model
	 * @generated
	 */
	MIType getType();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.MethodologicalIsland#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MIType
	 * @see #getType()
	 * @generated
	 */
	void setType(MIType value);

} // MethodologicalIsland
