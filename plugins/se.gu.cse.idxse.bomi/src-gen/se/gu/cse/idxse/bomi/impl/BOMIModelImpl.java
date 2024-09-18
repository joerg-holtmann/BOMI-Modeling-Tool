/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.gu.cse.idxse.bomi.BOMICoordination;
import se.gu.cse.idxse.bomi.BOMIModel;
import se.gu.cse.idxse.bomi.BORoleInteraction;
import se.gu.cse.idxse.bomi.BOTeamGovernance;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.BoundaryObject;
import se.gu.cse.idxse.bomi.Driver;
import se.gu.cse.idxse.bomi.GovernanceTeam;
import se.gu.cse.idxse.bomi.MethodologicalIsland;
import se.gu.cse.idxse.bomi.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOMI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getBoRoleInteractions <em>Bo Role Interactions</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getBoundaryObjects <em>Boundary Objects</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getBoMiCoordinations <em>Bo Mi Coordinations</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getMethodologicalIslands <em>Methodological Islands</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getGovernanceTeams <em>Governance Teams</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getBoTeamGovernances <em>Bo Team Governances</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl#getDrivers <em>Drivers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOMIModelImpl extends MinimalEObjectImpl.Container implements BOMIModel {
	/**
	 * The cached value of the '{@link #getBoRoleInteractions() <em>Bo Role Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoRoleInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<BORoleInteraction> boRoleInteractions;

	/**
	 * The cached value of the '{@link #getBoundaryObjects() <em>Boundary Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundaryObject> boundaryObjects;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getBoMiCoordinations() <em>Bo Mi Coordinations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoMiCoordinations()
	 * @generated
	 * @ordered
	 */
	protected EList<BOMICoordination> boMiCoordinations;

	/**
	 * The cached value of the '{@link #getMethodologicalIslands() <em>Methodological Islands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodologicalIslands()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodologicalIsland> methodologicalIslands;

	/**
	 * The cached value of the '{@link #getGovernanceTeams() <em>Governance Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernanceTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<GovernanceTeam> governanceTeams;

	/**
	 * The cached value of the '{@link #getBoTeamGovernances() <em>Bo Team Governances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoTeamGovernances()
	 * @generated
	 * @ordered
	 */
	protected EList<BOTeamGovernance> boTeamGovernances;

	/**
	 * The cached value of the '{@link #getDrivers() <em>Drivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> drivers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.BOMI_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BORoleInteraction> getBoRoleInteractions() {
		if (boRoleInteractions == null) {
			boRoleInteractions = new EObjectContainmentEList<BORoleInteraction>(BORoleInteraction.class, this, BomiPackage.BOMI_MODEL__BO_ROLE_INTERACTIONS);
		}
		return boRoleInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundaryObject> getBoundaryObjects() {
		if (boundaryObjects == null) {
			boundaryObjects = new EObjectContainmentEList<BoundaryObject>(BoundaryObject.class, this, BomiPackage.BOMI_MODEL__BOUNDARY_OBJECTS);
		}
		return boundaryObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, BomiPackage.BOMI_MODEL__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BOMICoordination> getBoMiCoordinations() {
		if (boMiCoordinations == null) {
			boMiCoordinations = new EObjectContainmentEList<BOMICoordination>(BOMICoordination.class, this, BomiPackage.BOMI_MODEL__BO_MI_COORDINATIONS);
		}
		return boMiCoordinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodologicalIsland> getMethodologicalIslands() {
		if (methodologicalIslands == null) {
			methodologicalIslands = new EObjectContainmentEList<MethodologicalIsland>(MethodologicalIsland.class, this, BomiPackage.BOMI_MODEL__METHODOLOGICAL_ISLANDS);
		}
		return methodologicalIslands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GovernanceTeam> getGovernanceTeams() {
		if (governanceTeams == null) {
			governanceTeams = new EObjectContainmentEList<GovernanceTeam>(GovernanceTeam.class, this, BomiPackage.BOMI_MODEL__GOVERNANCE_TEAMS);
		}
		return governanceTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BOTeamGovernance> getBoTeamGovernances() {
		if (boTeamGovernances == null) {
			boTeamGovernances = new EObjectContainmentEList<BOTeamGovernance>(BOTeamGovernance.class, this, BomiPackage.BOMI_MODEL__BO_TEAM_GOVERNANCES);
		}
		return boTeamGovernances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Driver> getDrivers() {
		if (drivers == null) {
			drivers = new EObjectContainmentEList<Driver>(Driver.class, this, BomiPackage.BOMI_MODEL__DRIVERS);
		}
		return drivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BomiPackage.BOMI_MODEL__BO_ROLE_INTERACTIONS:
				return ((InternalEList<?>)getBoRoleInteractions()).basicRemove(otherEnd, msgs);
			case BomiPackage.BOMI_MODEL__BOUNDARY_OBJECTS:
				return ((InternalEList<?>)getBoundaryObjects()).basicRemove(otherEnd, msgs);
			case BomiPackage.BOMI_MODEL__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case BomiPackage.BOMI_MODEL__BO_MI_COORDINATIONS:
				return ((InternalEList<?>)getBoMiCoordinations()).basicRemove(otherEnd, msgs);
			case BomiPackage.BOMI_MODEL__METHODOLOGICAL_ISLANDS:
				return ((InternalEList<?>)getMethodologicalIslands()).basicRemove(otherEnd, msgs);
			case BomiPackage.BOMI_MODEL__GOVERNANCE_TEAMS:
				return ((InternalEList<?>)getGovernanceTeams()).basicRemove(otherEnd, msgs);
			case BomiPackage.BOMI_MODEL__BO_TEAM_GOVERNANCES:
				return ((InternalEList<?>)getBoTeamGovernances()).basicRemove(otherEnd, msgs);
			case BomiPackage.BOMI_MODEL__DRIVERS:
				return ((InternalEList<?>)getDrivers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.BOMI_MODEL__BO_ROLE_INTERACTIONS:
				return getBoRoleInteractions();
			case BomiPackage.BOMI_MODEL__BOUNDARY_OBJECTS:
				return getBoundaryObjects();
			case BomiPackage.BOMI_MODEL__ROLES:
				return getRoles();
			case BomiPackage.BOMI_MODEL__BO_MI_COORDINATIONS:
				return getBoMiCoordinations();
			case BomiPackage.BOMI_MODEL__METHODOLOGICAL_ISLANDS:
				return getMethodologicalIslands();
			case BomiPackage.BOMI_MODEL__GOVERNANCE_TEAMS:
				return getGovernanceTeams();
			case BomiPackage.BOMI_MODEL__BO_TEAM_GOVERNANCES:
				return getBoTeamGovernances();
			case BomiPackage.BOMI_MODEL__DRIVERS:
				return getDrivers();
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
			case BomiPackage.BOMI_MODEL__BO_ROLE_INTERACTIONS:
				getBoRoleInteractions().clear();
				getBoRoleInteractions().addAll((Collection<? extends BORoleInteraction>)newValue);
				return;
			case BomiPackage.BOMI_MODEL__BOUNDARY_OBJECTS:
				getBoundaryObjects().clear();
				getBoundaryObjects().addAll((Collection<? extends BoundaryObject>)newValue);
				return;
			case BomiPackage.BOMI_MODEL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case BomiPackage.BOMI_MODEL__BO_MI_COORDINATIONS:
				getBoMiCoordinations().clear();
				getBoMiCoordinations().addAll((Collection<? extends BOMICoordination>)newValue);
				return;
			case BomiPackage.BOMI_MODEL__METHODOLOGICAL_ISLANDS:
				getMethodologicalIslands().clear();
				getMethodologicalIslands().addAll((Collection<? extends MethodologicalIsland>)newValue);
				return;
			case BomiPackage.BOMI_MODEL__GOVERNANCE_TEAMS:
				getGovernanceTeams().clear();
				getGovernanceTeams().addAll((Collection<? extends GovernanceTeam>)newValue);
				return;
			case BomiPackage.BOMI_MODEL__BO_TEAM_GOVERNANCES:
				getBoTeamGovernances().clear();
				getBoTeamGovernances().addAll((Collection<? extends BOTeamGovernance>)newValue);
				return;
			case BomiPackage.BOMI_MODEL__DRIVERS:
				getDrivers().clear();
				getDrivers().addAll((Collection<? extends Driver>)newValue);
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
			case BomiPackage.BOMI_MODEL__BO_ROLE_INTERACTIONS:
				getBoRoleInteractions().clear();
				return;
			case BomiPackage.BOMI_MODEL__BOUNDARY_OBJECTS:
				getBoundaryObjects().clear();
				return;
			case BomiPackage.BOMI_MODEL__ROLES:
				getRoles().clear();
				return;
			case BomiPackage.BOMI_MODEL__BO_MI_COORDINATIONS:
				getBoMiCoordinations().clear();
				return;
			case BomiPackage.BOMI_MODEL__METHODOLOGICAL_ISLANDS:
				getMethodologicalIslands().clear();
				return;
			case BomiPackage.BOMI_MODEL__GOVERNANCE_TEAMS:
				getGovernanceTeams().clear();
				return;
			case BomiPackage.BOMI_MODEL__BO_TEAM_GOVERNANCES:
				getBoTeamGovernances().clear();
				return;
			case BomiPackage.BOMI_MODEL__DRIVERS:
				getDrivers().clear();
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
			case BomiPackage.BOMI_MODEL__BO_ROLE_INTERACTIONS:
				return boRoleInteractions != null && !boRoleInteractions.isEmpty();
			case BomiPackage.BOMI_MODEL__BOUNDARY_OBJECTS:
				return boundaryObjects != null && !boundaryObjects.isEmpty();
			case BomiPackage.BOMI_MODEL__ROLES:
				return roles != null && !roles.isEmpty();
			case BomiPackage.BOMI_MODEL__BO_MI_COORDINATIONS:
				return boMiCoordinations != null && !boMiCoordinations.isEmpty();
			case BomiPackage.BOMI_MODEL__METHODOLOGICAL_ISLANDS:
				return methodologicalIslands != null && !methodologicalIslands.isEmpty();
			case BomiPackage.BOMI_MODEL__GOVERNANCE_TEAMS:
				return governanceTeams != null && !governanceTeams.isEmpty();
			case BomiPackage.BOMI_MODEL__BO_TEAM_GOVERNANCES:
				return boTeamGovernances != null && !boTeamGovernances.isEmpty();
			case BomiPackage.BOMI_MODEL__DRIVERS:
				return drivers != null && !drivers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BOMIModelImpl
