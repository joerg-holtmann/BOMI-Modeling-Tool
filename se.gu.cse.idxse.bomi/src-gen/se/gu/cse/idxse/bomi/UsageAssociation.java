/**
 */
package se.gu.cse.idxse.bomi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.UsageAssociation#getAccessability <em>Accessability</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.UsageAssociation#getStability <em>Stability</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.UsageAssociation#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.UsageAssociation#getFitForPurpose <em>Fit For Purpose</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getUsageAssociation()
 * @model abstract="true"
 * @generated
 */
public interface UsageAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Accessability</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessability</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setAccessability(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getUsageAssociation_Accessability()
	 * @model
	 * @generated
	 */
	HighLow getAccessability();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.UsageAssociation#getAccessability <em>Accessability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessability</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getAccessability()
	 * @generated
	 */
	void setAccessability(HighLow value);

	/**
	 * Returns the value of the '<em><b>Stability</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stability</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setStability(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getUsageAssociation_Stability()
	 * @model
	 * @generated
	 */
	HighLow getStability();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.UsageAssociation#getStability <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stability</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getStability()
	 * @generated
	 */
	void setStability(HighLow value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setCriticality(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getUsageAssociation_Criticality()
	 * @model
	 * @generated
	 */
	HighLow getCriticality();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.UsageAssociation#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(HighLow value);

	/**
	 * Returns the value of the '<em><b>Fit For Purpose</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit For Purpose</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setFitForPurpose(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getUsageAssociation_FitForPurpose()
	 * @model
	 * @generated
	 */
	HighLow getFitForPurpose();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.UsageAssociation#getFitForPurpose <em>Fit For Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit For Purpose</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getFitForPurpose()
	 * @generated
	 */
	void setFitForPurpose(HighLow value);

} // UsageAssociation
