/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.GovernanceTeam;
import se.gu.cse.idxse.bomi.MethodologicalIsland;
import se.gu.cse.idxse.bomi.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.RoleImpl#getPartOfGovernanceTeams <em>Part Of Governance Teams</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.RoleImpl#getPartOfMIs <em>Part Of MIs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getPartOfGovernanceTeams() <em>Part Of Governance Teams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfGovernanceTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<GovernanceTeam> partOfGovernanceTeams;
	/**
	 * The cached value of the '{@link #getPartOfMIs() <em>Part Of MIs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfMIs()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodologicalIsland> partOfMIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GovernanceTeam> getPartOfGovernanceTeams() {
		if (partOfGovernanceTeams == null) {
			partOfGovernanceTeams = new EObjectResolvingEList<GovernanceTeam>(GovernanceTeam.class, this, BomiPackage.ROLE__PART_OF_GOVERNANCE_TEAMS);
		}
		return partOfGovernanceTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodologicalIsland> getPartOfMIs() {
		if (partOfMIs == null) {
			partOfMIs = new EObjectResolvingEList<MethodologicalIsland>(MethodologicalIsland.class, this, BomiPackage.ROLE__PART_OF_MIS);
		}
		return partOfMIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.ROLE__PART_OF_GOVERNANCE_TEAMS:
				return getPartOfGovernanceTeams();
			case BomiPackage.ROLE__PART_OF_MIS:
				return getPartOfMIs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BomiPackage.ROLE__PART_OF_GOVERNANCE_TEAMS:
				getPartOfGovernanceTeams().clear();
				getPartOfGovernanceTeams().addAll((Collection<? extends GovernanceTeam>)newValue);
				return;
			case BomiPackage.ROLE__PART_OF_MIS:
				getPartOfMIs().clear();
				getPartOfMIs().addAll((Collection<? extends MethodologicalIsland>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BomiPackage.ROLE__PART_OF_GOVERNANCE_TEAMS:
				getPartOfGovernanceTeams().clear();
				return;
			case BomiPackage.ROLE__PART_OF_MIS:
				getPartOfMIs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BomiPackage.ROLE__PART_OF_GOVERNANCE_TEAMS:
				return partOfGovernanceTeams != null && !partOfGovernanceTeams.isEmpty();
			case BomiPackage.ROLE__PART_OF_MIS:
				return partOfMIs != null && !partOfMIs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
