/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.Association#getBoundaryObjects <em>Boundary Objects</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getAssociation()
 * @model abstract="true"
 * @generated
 */
public interface Association extends PurposedElement {
	/**
	 * Returns the value of the '<em><b>Boundary Objects</b></em>' reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.BoundaryObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Objects</em>' reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getAssociation_BoundaryObjects()
	 * @model
	 * @generated
	 */
	EList<BoundaryObject> getBoundaryObjects();

} // Association
