/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BO Team Governance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getCoordinationMechanism <em>Coordination Mechanism</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getFrequencyOfCoordination <em>Frequency Of Coordination</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getGovernanceTeams <em>Governance Teams</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOTeamGovernance()
 * @model
 * @generated
 */
public interface BOTeamGovernance extends Association {
	/**
	 * Returns the value of the '<em><b>Coordination Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Mechanism</em>' attribute.
	 * @see #setCoordinationMechanism(String)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOTeamGovernance_CoordinationMechanism()
	 * @model
	 * @generated
	 */
	String getCoordinationMechanism();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getCoordinationMechanism <em>Coordination Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Mechanism</em>' attribute.
	 * @see #getCoordinationMechanism()
	 * @generated
	 */
	void setCoordinationMechanism(String value);

	/**
	 * Returns the value of the '<em><b>Frequency Of Coordination</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Of Coordination</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setFrequencyOfCoordination(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOTeamGovernance_FrequencyOfCoordination()
	 * @model
	 * @generated
	 */
	HighLow getFrequencyOfCoordination();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getFrequencyOfCoordination <em>Frequency Of Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Of Coordination</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getFrequencyOfCoordination()
	 * @generated
	 */
	void setFrequencyOfCoordination(HighLow value);

	/**
	 * Returns the value of the '<em><b>Governance Teams</b></em>' reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.GovernanceTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governance Teams</em>' reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOTeamGovernance_GovernanceTeams()
	 * @model
	 * @generated
	 */
	EList<GovernanceTeam> getGovernanceTeams();

} // BOTeamGovernance
