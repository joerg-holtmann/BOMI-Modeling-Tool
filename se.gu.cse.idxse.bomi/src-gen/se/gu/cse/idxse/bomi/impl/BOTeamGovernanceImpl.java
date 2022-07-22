/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import se.gu.cse.idxse.bomi.BOTeamGovernance;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.GovernanceTeam;
import se.gu.cse.idxse.bomi.HighLow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BO Team Governance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOTeamGovernanceImpl#getCoordinationMechanism <em>Coordination Mechanism</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOTeamGovernanceImpl#getFrequencyOfCoordination <em>Frequency Of Coordination</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOTeamGovernanceImpl#getGovernanceTeams <em>Governance Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOTeamGovernanceImpl extends AssociationImpl implements BOTeamGovernance {
	/**
	 * The default value of the '{@link #getCoordinationMechanism() <em>Coordination Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDINATION_MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinationMechanism() <em>Coordination Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationMechanism()
	 * @generated
	 * @ordered
	 */
	protected String coordinationMechanism = COORDINATION_MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequencyOfCoordination() <em>Frequency Of Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyOfCoordination()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow FREQUENCY_OF_COORDINATION_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getFrequencyOfCoordination() <em>Frequency Of Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyOfCoordination()
	 * @generated
	 * @ordered
	 */
	protected HighLow frequencyOfCoordination = FREQUENCY_OF_COORDINATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGovernanceTeams() <em>Governance Teams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernanceTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<GovernanceTeam> governanceTeams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOTeamGovernanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.BO_TEAM_GOVERNANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordinationMechanism() {
		return coordinationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationMechanism(String newCoordinationMechanism) {
		String oldCoordinationMechanism = coordinationMechanism;
		coordinationMechanism = newCoordinationMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BomiPackage.BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM, oldCoordinationMechanism,
					coordinationMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getFrequencyOfCoordination() {
		return frequencyOfCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyOfCoordination(HighLow newFrequencyOfCoordination) {
		HighLow oldFrequencyOfCoordination = frequencyOfCoordination;
		frequencyOfCoordination = newFrequencyOfCoordination == null ? FREQUENCY_OF_COORDINATION_EDEFAULT
				: newFrequencyOfCoordination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BomiPackage.BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION, oldFrequencyOfCoordination,
					frequencyOfCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GovernanceTeam> getGovernanceTeams() {
		if (governanceTeams == null) {
			governanceTeams = new EObjectResolvingEList<GovernanceTeam>(GovernanceTeam.class, this,
					BomiPackage.BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS);
		}
		return governanceTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BomiPackage.BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM:
			return getCoordinationMechanism();
		case BomiPackage.BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION:
			return getFrequencyOfCoordination();
		case BomiPackage.BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS:
			return getGovernanceTeams();
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
		case BomiPackage.BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM:
			setCoordinationMechanism((String) newValue);
			return;
		case BomiPackage.BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION:
			setFrequencyOfCoordination((HighLow) newValue);
			return;
		case BomiPackage.BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS:
			getGovernanceTeams().clear();
			getGovernanceTeams().addAll((Collection<? extends GovernanceTeam>) newValue);
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
		case BomiPackage.BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM:
			setCoordinationMechanism(COORDINATION_MECHANISM_EDEFAULT);
			return;
		case BomiPackage.BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION:
			setFrequencyOfCoordination(FREQUENCY_OF_COORDINATION_EDEFAULT);
			return;
		case BomiPackage.BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS:
			getGovernanceTeams().clear();
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
		case BomiPackage.BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM:
			return COORDINATION_MECHANISM_EDEFAULT == null ? coordinationMechanism != null
					: !COORDINATION_MECHANISM_EDEFAULT.equals(coordinationMechanism);
		case BomiPackage.BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION:
			return frequencyOfCoordination != FREQUENCY_OF_COORDINATION_EDEFAULT;
		case BomiPackage.BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS:
			return governanceTeams != null && !governanceTeams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (coordinationMechanism: ");
		result.append(coordinationMechanism);
		result.append(", frequencyOfCoordination: ");
		result.append(frequencyOfCoordination);
		result.append(')');
		return result.toString();
	}

} //BOTeamGovernanceImpl
