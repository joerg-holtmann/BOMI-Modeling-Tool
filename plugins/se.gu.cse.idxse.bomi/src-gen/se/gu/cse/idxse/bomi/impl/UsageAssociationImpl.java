/**
 */
package se.gu.cse.idxse.bomi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.HighLow;
import se.gu.cse.idxse.bomi.UsageAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.UsageAssociationImpl#getAccessability <em>Accessability</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.UsageAssociationImpl#getStability <em>Stability</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.UsageAssociationImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.UsageAssociationImpl#getFitForPurpose <em>Fit For Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UsageAssociationImpl extends AssociationImpl implements UsageAssociation {
	/**
	 * The default value of the '{@link #getAccessability() <em>Accessability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessability()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow ACCESSABILITY_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getAccessability() <em>Accessability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessability()
	 * @generated
	 * @ordered
	 */
	protected HighLow accessability = ACCESSABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStability() <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStability()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow STABILITY_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getStability() <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStability()
	 * @generated
	 * @ordered
	 */
	protected HighLow stability = STABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow CRITICALITY_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected HighLow criticality = CRITICALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFitForPurpose() <em>Fit For Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitForPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow FIT_FOR_PURPOSE_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getFitForPurpose() <em>Fit For Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitForPurpose()
	 * @generated
	 * @ordered
	 */
	protected HighLow fitForPurpose = FIT_FOR_PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.USAGE_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getAccessability() {
		return accessability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessability(HighLow newAccessability) {
		HighLow oldAccessability = accessability;
		accessability = newAccessability == null ? ACCESSABILITY_EDEFAULT : newAccessability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.USAGE_ASSOCIATION__ACCESSABILITY, oldAccessability, accessability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getStability() {
		return stability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStability(HighLow newStability) {
		HighLow oldStability = stability;
		stability = newStability == null ? STABILITY_EDEFAULT : newStability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.USAGE_ASSOCIATION__STABILITY, oldStability, stability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(HighLow newCriticality) {
		HighLow oldCriticality = criticality;
		criticality = newCriticality == null ? CRITICALITY_EDEFAULT : newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.USAGE_ASSOCIATION__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getFitForPurpose() {
		return fitForPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitForPurpose(HighLow newFitForPurpose) {
		HighLow oldFitForPurpose = fitForPurpose;
		fitForPurpose = newFitForPurpose == null ? FIT_FOR_PURPOSE_EDEFAULT : newFitForPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.USAGE_ASSOCIATION__FIT_FOR_PURPOSE, oldFitForPurpose, fitForPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.USAGE_ASSOCIATION__ACCESSABILITY:
				return getAccessability();
			case BomiPackage.USAGE_ASSOCIATION__STABILITY:
				return getStability();
			case BomiPackage.USAGE_ASSOCIATION__CRITICALITY:
				return getCriticality();
			case BomiPackage.USAGE_ASSOCIATION__FIT_FOR_PURPOSE:
				return getFitForPurpose();
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
			case BomiPackage.USAGE_ASSOCIATION__ACCESSABILITY:
				setAccessability((HighLow)newValue);
				return;
			case BomiPackage.USAGE_ASSOCIATION__STABILITY:
				setStability((HighLow)newValue);
				return;
			case BomiPackage.USAGE_ASSOCIATION__CRITICALITY:
				setCriticality((HighLow)newValue);
				return;
			case BomiPackage.USAGE_ASSOCIATION__FIT_FOR_PURPOSE:
				setFitForPurpose((HighLow)newValue);
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
			case BomiPackage.USAGE_ASSOCIATION__ACCESSABILITY:
				setAccessability(ACCESSABILITY_EDEFAULT);
				return;
			case BomiPackage.USAGE_ASSOCIATION__STABILITY:
				setStability(STABILITY_EDEFAULT);
				return;
			case BomiPackage.USAGE_ASSOCIATION__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case BomiPackage.USAGE_ASSOCIATION__FIT_FOR_PURPOSE:
				setFitForPurpose(FIT_FOR_PURPOSE_EDEFAULT);
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
			case BomiPackage.USAGE_ASSOCIATION__ACCESSABILITY:
				return accessability != ACCESSABILITY_EDEFAULT;
			case BomiPackage.USAGE_ASSOCIATION__STABILITY:
				return stability != STABILITY_EDEFAULT;
			case BomiPackage.USAGE_ASSOCIATION__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case BomiPackage.USAGE_ASSOCIATION__FIT_FOR_PURPOSE:
				return fitForPurpose != FIT_FOR_PURPOSE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (accessability: ");
		result.append(accessability);
		result.append(", stability: ");
		result.append(stability);
		result.append(", criticality: ");
		result.append(criticality);
		result.append(", fitForPurpose: ");
		result.append(fitForPurpose);
		result.append(')');
		return result.toString();
	}

} //UsageAssociationImpl
