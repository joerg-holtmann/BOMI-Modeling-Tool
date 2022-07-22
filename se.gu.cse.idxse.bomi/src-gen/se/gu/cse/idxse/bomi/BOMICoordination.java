/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOMI Coordination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.BOMICoordination#getMethodologicalIslands <em>Methodological Islands</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMICoordination()
 * @model
 * @generated
 */
public interface BOMICoordination extends UsageAssociation {
	/**
	 * Returns the value of the '<em><b>Methodological Islands</b></em>' reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.MethodologicalIsland}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodological Islands</em>' reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOMICoordination_MethodologicalIslands()
	 * @model
	 * @generated
	 */
	EList<MethodologicalIsland> getMethodologicalIslands();

} // BOMICoordination
