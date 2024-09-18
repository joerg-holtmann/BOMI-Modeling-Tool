/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import se.gu.cse.idxse.bomi.Association;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.BoundaryObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.AssociationImpl#getBoundaryObjects <em>Boundary Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssociationImpl extends PurposedElementImpl implements Association {
	/**
	 * The cached value of the '{@link #getBoundaryObjects() <em>Boundary Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundaryObject> boundaryObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundaryObject> getBoundaryObjects() {
		if (boundaryObjects == null) {
			boundaryObjects = new EObjectResolvingEList<BoundaryObject>(BoundaryObject.class, this, BomiPackage.ASSOCIATION__BOUNDARY_OBJECTS);
		}
		return boundaryObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.ASSOCIATION__BOUNDARY_OBJECTS:
				return getBoundaryObjects();
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
			case BomiPackage.ASSOCIATION__BOUNDARY_OBJECTS:
				getBoundaryObjects().clear();
				getBoundaryObjects().addAll((Collection<? extends BoundaryObject>)newValue);
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
			case BomiPackage.ASSOCIATION__BOUNDARY_OBJECTS:
				getBoundaryObjects().clear();
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
			case BomiPackage.ASSOCIATION__BOUNDARY_OBJECTS:
				return boundaryObjects != null && !boundaryObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssociationImpl
