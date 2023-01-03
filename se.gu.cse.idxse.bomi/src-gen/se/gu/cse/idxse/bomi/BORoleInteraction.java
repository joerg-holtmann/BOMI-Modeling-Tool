/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BO Role Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.BORoleInteraction#getRoles <em>Roles</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BORoleInteraction#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BORoleInteraction#getCreates <em>Creates</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BORoleInteraction#getReads <em>Reads</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BORoleInteraction#getUpdates <em>Updates</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BORoleInteraction#getDeletes <em>Deletes</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction()
 * @model
 * @generated
 */
public interface BORoleInteraction extends UsageAssociation {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.MyBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #setResponsible(MyBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction_Responsible()
	 * @model
	 * @generated
	 */
	MyBoolean getResponsible();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getResponsible <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(MyBoolean value);

	/**
	 * Returns the value of the '<em><b>Creates</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.MyBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creates</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #setCreates(MyBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction_Creates()
	 * @model
	 * @generated
	 */
	MyBoolean getCreates();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getCreates <em>Creates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creates</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #getCreates()
	 * @generated
	 */
	void setCreates(MyBoolean value);

	/**
	 * Returns the value of the '<em><b>Reads</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.MyBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reads</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #setReads(MyBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction_Reads()
	 * @model
	 * @generated
	 */
	MyBoolean getReads();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getReads <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reads</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #getReads()
	 * @generated
	 */
	void setReads(MyBoolean value);

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.MyBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #setUpdates(MyBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction_Updates()
	 * @model
	 * @generated
	 */
	MyBoolean getUpdates();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getUpdates <em>Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updates</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #getUpdates()
	 * @generated
	 */
	void setUpdates(MyBoolean value);

	/**
	 * Returns the value of the '<em><b>Deletes</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.MyBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletes</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #setDeletes(MyBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction_Deletes()
	 * @model
	 * @generated
	 */
	MyBoolean getDeletes();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getDeletes <em>Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletes</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.MyBoolean
	 * @see #getDeletes()
	 * @generated
	 */
	void setDeletes(MyBoolean value);

} // BORoleInteraction
