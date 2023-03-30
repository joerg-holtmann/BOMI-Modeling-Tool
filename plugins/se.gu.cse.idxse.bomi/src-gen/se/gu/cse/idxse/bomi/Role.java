/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.Role#getPartOfGovernanceTeams <em>Part Of Governance Teams</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.Role#getPartOfMIs <em>Part Of MIs</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Part Of Governance Teams</b></em>' reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.GovernanceTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Governance Teams</em>' reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getRole_PartOfGovernanceTeams()
	 * @model
	 * @generated
	 */
	EList<GovernanceTeam> getPartOfGovernanceTeams();

	/**
	 * Returns the value of the '<em><b>Part Of MIs</b></em>' reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.MethodologicalIsland}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of MIs</em>' reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getRole_PartOfMIs()
	 * @model
	 * @generated
	 */
	EList<MethodologicalIsland> getPartOfMIs();

} // Role
