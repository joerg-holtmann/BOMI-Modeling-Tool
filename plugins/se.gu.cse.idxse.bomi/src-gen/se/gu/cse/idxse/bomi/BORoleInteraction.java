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
 *   <li>{@link se.gu.cse.idxse.bomi.BORoleInteraction#getInteractionKinds <em>Interaction Kinds</em>}</li>
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
	 * Returns the value of the '<em><b>Interaction Kinds</b></em>' attribute list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.InteractionKind}.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.InteractionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Kinds</em>' attribute list.
	 * @see se.gu.cse.idxse.bomi.InteractionKind
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBORoleInteraction_InteractionKinds()
	 * @model
	 * @generated
	 */
	EList<InteractionKind> getInteractionKinds();

} // BORoleInteraction
