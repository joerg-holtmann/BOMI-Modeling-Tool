/**
 */
package se.gu.cse.idxse.bomi.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import se.gu.cse.idxse.bomi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage
 * @generated
 */
public class BomiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BomiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BomiSwitch() {
		if (modelPackage == null) {
			modelPackage = BomiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BomiPackage.BOUNDARY_OBJECT: {
			BoundaryObject boundaryObject = (BoundaryObject) theEObject;
			T result = caseBoundaryObject(boundaryObject);
			if (result == null)
				result = casePurposedElement(boundaryObject);
			if (result == null)
				result = caseNamedElement(boundaryObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = caseNamedElement(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.BO_ROLE_INTERACTION: {
			BORoleInteraction boRoleInteraction = (BORoleInteraction) theEObject;
			T result = caseBORoleInteraction(boRoleInteraction);
			if (result == null)
				result = caseUsageAssociation(boRoleInteraction);
			if (result == null)
				result = caseAssociation(boRoleInteraction);
			if (result == null)
				result = casePurposedElement(boRoleInteraction);
			if (result == null)
				result = caseNamedElement(boRoleInteraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.BOMI_MODEL: {
			BOMIModel bomiModel = (BOMIModel) theEObject;
			T result = caseBOMIModel(bomiModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.METHODOLOGICAL_ISLAND: {
			MethodologicalIsland methodologicalIsland = (MethodologicalIsland) theEObject;
			T result = caseMethodologicalIsland(methodologicalIsland);
			if (result == null)
				result = caseNamedElement(methodologicalIsland);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.USAGE_ASSOCIATION: {
			UsageAssociation usageAssociation = (UsageAssociation) theEObject;
			T result = caseUsageAssociation(usageAssociation);
			if (result == null)
				result = caseAssociation(usageAssociation);
			if (result == null)
				result = casePurposedElement(usageAssociation);
			if (result == null)
				result = caseNamedElement(usageAssociation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.BOMI_COORDINATION: {
			BOMICoordination bomiCoordination = (BOMICoordination) theEObject;
			T result = caseBOMICoordination(bomiCoordination);
			if (result == null)
				result = caseUsageAssociation(bomiCoordination);
			if (result == null)
				result = caseAssociation(bomiCoordination);
			if (result == null)
				result = casePurposedElement(bomiCoordination);
			if (result == null)
				result = caseNamedElement(bomiCoordination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.GOVERNANCE_TEAM: {
			GovernanceTeam governanceTeam = (GovernanceTeam) theEObject;
			T result = caseGovernanceTeam(governanceTeam);
			if (result == null)
				result = caseNamedElement(governanceTeam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.BO_TEAM_GOVERNANCE: {
			BOTeamGovernance boTeamGovernance = (BOTeamGovernance) theEObject;
			T result = caseBOTeamGovernance(boTeamGovernance);
			if (result == null)
				result = caseAssociation(boTeamGovernance);
			if (result == null)
				result = casePurposedElement(boTeamGovernance);
			if (result == null)
				result = caseNamedElement(boTeamGovernance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.ASSOCIATION: {
			Association association = (Association) theEObject;
			T result = caseAssociation(association);
			if (result == null)
				result = casePurposedElement(association);
			if (result == null)
				result = caseNamedElement(association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.DRIVER: {
			Driver driver = (Driver) theEObject;
			T result = caseDriver(driver);
			if (result == null)
				result = caseNamedElement(driver);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BomiPackage.PURPOSED_ELEMENT: {
			PurposedElement purposedElement = (PurposedElement) theEObject;
			T result = casePurposedElement(purposedElement);
			if (result == null)
				result = caseNamedElement(purposedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryObject(BoundaryObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BO Role Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BO Role Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBORoleInteraction(BORoleInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOMI Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOMI Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOMIModel(BOMIModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methodological Island</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methodological Island</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodologicalIsland(MethodologicalIsland object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageAssociation(UsageAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOMI Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOMI Coordination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOMICoordination(BOMICoordination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Governance Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Governance Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGovernanceTeam(GovernanceTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BO Team Governance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BO Team Governance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOTeamGovernance(BOTeamGovernance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriver(Driver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purposed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purposed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposedElement(PurposedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BomiSwitch
