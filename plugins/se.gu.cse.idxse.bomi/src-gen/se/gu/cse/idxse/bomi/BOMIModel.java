/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOMI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getBoRoleInteractions <em>Bo Role Interactions</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getBoundaryObjects <em>Boundary Objects</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getBoMiCoordinations <em>Bo Mi Coordinations</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getMethodologicalIslands <em>Methodological Islands</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getGovernanceTeams <em>Governance Teams</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getBoTeamGovernances <em>Bo Team Governances</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMIModel#getDrivers <em>Drivers</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel()
 * @model
 * @generated
 */
public interface BOMIModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Bo Role Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.BORoleInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bo Role Interactions</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_BoRoleInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BORoleInteraction> getBoRoleInteractions();

	/**
	 * Returns the value of the '<em><b>Boundary Objects</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.BoundaryObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Objects</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_BoundaryObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundaryObject> getBoundaryObjects();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Bo Mi Coordinations</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.BOMICoordination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bo Mi Coordinations</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_BoMiCoordinations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOMICoordination> getBoMiCoordinations();

	/**
	 * Returns the value of the '<em><b>Methodological Islands</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.MethodologicalIsland}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodological Islands</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_MethodologicalIslands()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodologicalIsland> getMethodologicalIslands();

	/**
	 * Returns the value of the '<em><b>Governance Teams</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.GovernanceTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governance Teams</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_GovernanceTeams()
	 * @model containment="true"
	 * @generated
	 */
	EList<GovernanceTeam> getGovernanceTeams();

	/**
	 * Returns the value of the '<em><b>Bo Team Governances</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.BOTeamGovernance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bo Team Governances</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_BoTeamGovernances()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOTeamGovernance> getBoTeamGovernances();

	/**
	 * Returns the value of the '<em><b>Drivers</b></em>' containment reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.Driver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drivers</em>' containment reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMIModel_Drivers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Driver> getDrivers();

} // BOMIModel
