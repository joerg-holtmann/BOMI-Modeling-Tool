/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage
 * @generated
 */
public interface BomiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BomiFactory eINSTANCE = se.gu.cse.idxse.bomi.impl.BomiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boundary Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boundary Object</em>'.
	 * @generated
	 */
	BoundaryObject createBoundaryObject();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>BO Role Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BO Role Interaction</em>'.
	 * @generated
	 */
	BORoleInteraction createBORoleInteraction();

	/**
	 * Returns a new object of class '<em>BOMI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOMI Model</em>'.
	 * @generated
	 */
	BOMIModel createBOMIModel();

	/**
	 * Returns a new object of class '<em>Methodological Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Methodological Island</em>'.
	 * @generated
	 */
	MethodologicalIsland createMethodologicalIsland();

	/**
	 * Returns a new object of class '<em>BOMI Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOMI Coordination</em>'.
	 * @generated
	 */
	BOMICoordination createBOMICoordination();

	/**
	 * Returns a new object of class '<em>Governance Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Governance Team</em>'.
	 * @generated
	 */
	GovernanceTeam createGovernanceTeam();

	/**
	 * Returns a new object of class '<em>BO Team Governance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BO Team Governance</em>'.
	 * @generated
	 */
	BOTeamGovernance createBOTeamGovernance();

	/**
	 * Returns a new object of class '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Driver</em>'.
	 * @generated
	 */
	Driver createDriver();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BomiPackage getBomiPackage();

} //BomiFactory
