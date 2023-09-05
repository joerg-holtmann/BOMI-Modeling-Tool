/**
 */
package se.gu.cse.idxse.bomi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getLevelOfDetail <em>Level Of Detail</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getFrequencyOfChange <em>Frequency Of Change</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getModularity <em>Modularity</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getMaintainability <em>Maintainability</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getPrescriptive <em>Prescriptive</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getLifecycleStage <em>Lifecycle Stage</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getRepresentationFormat <em>Representation Format</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getTooling <em>Tooling</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getUpToDate <em>Up To Date</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getInternalConsistency <em>Internal Consistency</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BoundaryObject#getExternalConsistency <em>External Consistency</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject()
 * @model
 * @generated
 */
public interface BoundaryObject extends PurposedElement {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.BOSuperType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.BOSuperType
	 * @see #setSuperType(BOSuperType)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_SuperType()
	 * @model
	 * @generated
	 */
	BOSuperType getSuperType();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getSuperType <em>Super Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.BOSuperType
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(BOSuperType value);

	/**
	 * Returns the value of the '<em><b>Level Of Detail</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Of Detail</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setLevelOfDetail(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_LevelOfDetail()
	 * @model
	 * @generated
	 */
	HighLow getLevelOfDetail();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getLevelOfDetail <em>Level Of Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Of Detail</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getLevelOfDetail()
	 * @generated
	 */
	void setLevelOfDetail(HighLow value);

	/**
	 * Returns the value of the '<em><b>Frequency Of Change</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Of Change</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setFrequencyOfChange(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_FrequencyOfChange()
	 * @model
	 * @generated
	 */
	HighLow getFrequencyOfChange();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getFrequencyOfChange <em>Frequency Of Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Of Change</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getFrequencyOfChange()
	 * @generated
	 */
	void setFrequencyOfChange(HighLow value);

	/**
	 * Returns the value of the '<em><b>Modularity</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modularity</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setModularity(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_Modularity()
	 * @model
	 * @generated
	 */
	HighLow getModularity();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getModularity <em>Modularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modularity</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getModularity()
	 * @generated
	 */
	void setModularity(HighLow value);

	/**
	 * Returns the value of the '<em><b>Maintainability</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainability</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setMaintainability(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_Maintainability()
	 * @model
	 * @generated
	 */
	HighLow getMaintainability();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getMaintainability <em>Maintainability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainability</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getMaintainability()
	 * @generated
	 */
	void setMaintainability(HighLow value);

	/**
	 * Returns the value of the '<em><b>Prescriptive</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptive</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setPrescriptive(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_Prescriptive()
	 * @model
	 * @generated
	 */
	HighLow getPrescriptive();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getPrescriptive <em>Prescriptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptive</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getPrescriptive()
	 * @generated
	 */
	void setPrescriptive(HighLow value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.LifecycleStage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Stage</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.LifecycleStage
	 * @see #setLifecycleStage(LifecycleStage)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_LifecycleStage()
	 * @model
	 * @generated
	 */
	LifecycleStage getLifecycleStage();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getLifecycleStage <em>Lifecycle Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Stage</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.LifecycleStage
	 * @see #getLifecycleStage()
	 * @generated
	 */
	void setLifecycleStage(LifecycleStage value);

	/**
	 * Returns the value of the '<em><b>Representation Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Format</em>' attribute.
	 * @see #setRepresentationFormat(String)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_RepresentationFormat()
	 * @model
	 * @generated
	 */
	String getRepresentationFormat();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getRepresentationFormat <em>Representation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Format</em>' attribute.
	 * @see #getRepresentationFormat()
	 * @generated
	 */
	void setRepresentationFormat(String value);

	/**
	 * Returns the value of the '<em><b>Tooling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooling</em>' attribute.
	 * @see #setTooling(String)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_Tooling()
	 * @model
	 * @generated
	 */
	String getTooling();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getTooling <em>Tooling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooling</em>' attribute.
	 * @see #getTooling()
	 * @generated
	 */
	void setTooling(String value);

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning</em>' attribute.
	 * @see #setVersioning(String)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_Versioning()
	 * @model
	 * @generated
	 */
	String getVersioning();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getVersioning <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' attribute.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(String value);

	/**
	 * Returns the value of the '<em><b>Up To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up To Date</em>' attribute.
	 * @see #setUpToDate(String)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_UpToDate()
	 * @model
	 * @generated
	 */
	String getUpToDate();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getUpToDate <em>Up To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up To Date</em>' attribute.
	 * @see #getUpToDate()
	 * @generated
	 */
	void setUpToDate(String value);

	/**
	 * Returns the value of the '<em><b>Internal Consistency</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Consistency</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setInternalConsistency(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_InternalConsistency()
	 * @model
	 * @generated
	 */
	HighLow getInternalConsistency();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getInternalConsistency <em>Internal Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Consistency</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getInternalConsistency()
	 * @generated
	 */
	void setInternalConsistency(HighLow value);

	/**
	 * Returns the value of the '<em><b>External Consistency</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Consistency</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setExternalConsistency(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBoundaryObject_ExternalConsistency()
	 * @model
	 * @generated
	 */
	HighLow getExternalConsistency();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BoundaryObject#getExternalConsistency <em>External Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Consistency</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getExternalConsistency()
	 * @generated
	 */
	void setExternalConsistency(HighLow value);

} // BoundaryObject
