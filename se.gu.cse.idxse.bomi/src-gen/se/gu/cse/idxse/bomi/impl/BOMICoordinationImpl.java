/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import se.gu.cse.idxse.bomi.BOMICoordination;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.MethodologicalIsland;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOMI Coordination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BOMICoordinationImpl#getMethodologicalIslands <em>Methodological Islands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOMICoordinationImpl extends UsageAssociationImpl implements BOMICoordination {
	/**
	 * The cached value of the '{@link #getMethodologicalIslands() <em>Methodological Islands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodologicalIslands()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodologicalIsland> methodologicalIslands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMICoordinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.BOMI_COORDINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodologicalIsland> getMethodologicalIslands() {
		if (methodologicalIslands == null) {
			methodologicalIslands = new EObjectResolvingEList<MethodologicalIsland>(MethodologicalIsland.class, this,
					BomiPackage.BOMI_COORDINATION__METHODOLOGICAL_ISLANDS);
		}
		return methodologicalIslands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BomiPackage.BOMI_COORDINATION__METHODOLOGICAL_ISLANDS:
			return getMethodologicalIslands();
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
		case BomiPackage.BOMI_COORDINATION__METHODOLOGICAL_ISLANDS:
			getMethodologicalIslands().clear();
			getMethodologicalIslands().addAll((Collection<? extends MethodologicalIsland>) newValue);
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
		case BomiPackage.BOMI_COORDINATION__METHODOLOGICAL_ISLANDS:
			getMethodologicalIslands().clear();
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
		case BomiPackage.BOMI_COORDINATION__METHODOLOGICAL_ISLANDS:
			return methodologicalIslands != null && !methodologicalIslands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BOMICoordinationImpl
