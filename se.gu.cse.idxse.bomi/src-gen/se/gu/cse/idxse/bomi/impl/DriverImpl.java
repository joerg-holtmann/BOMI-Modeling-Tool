/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.DistanceTypes;
import se.gu.cse.idxse.bomi.Driver;
import se.gu.cse.idxse.bomi.DriverTypes;
import se.gu.cse.idxse.bomi.HighLow;
import se.gu.cse.idxse.bomi.MethodologicalIsland;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDriverType <em>Driver Type</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDistanceType <em>Distance Type</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDistanceSize <em>Distance Size</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDrivesMIs <em>Drives MIs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends NamedElementImpl implements Driver {
	/**
	 * The default value of the '{@link #getDriverType() <em>Driver Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverType()
	 * @generated
	 * @ordered
	 */
	protected static final DriverTypes DRIVER_TYPE_EDEFAULT = DriverTypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getDriverType() <em>Driver Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverType()
	 * @generated
	 * @ordered
	 */
	protected DriverTypes driverType = DRIVER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceType() <em>Distance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceType()
	 * @generated
	 * @ordered
	 */
	protected static final DistanceTypes DISTANCE_TYPE_EDEFAULT = DistanceTypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getDistanceType() <em>Distance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceType()
	 * @generated
	 * @ordered
	 */
	protected DistanceTypes distanceType = DISTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceSize() <em>Distance Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceSize()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow DISTANCE_SIZE_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getDistanceSize() <em>Distance Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceSize()
	 * @generated
	 * @ordered
	 */
	protected HighLow distanceSize = DISTANCE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDrivesMIs() <em>Drives MIs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivesMIs()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodologicalIsland> drivesMIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverTypes getDriverType() {
		return driverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverType(DriverTypes newDriverType) {
		DriverTypes oldDriverType = driverType;
		driverType = newDriverType == null ? DRIVER_TYPE_EDEFAULT : newDriverType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.DRIVER__DRIVER_TYPE, oldDriverType,
					driverType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceTypes getDistanceType() {
		return distanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceType(DistanceTypes newDistanceType) {
		DistanceTypes oldDistanceType = distanceType;
		distanceType = newDistanceType == null ? DISTANCE_TYPE_EDEFAULT : newDistanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.DRIVER__DISTANCE_TYPE, oldDistanceType,
					distanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getDistanceSize() {
		return distanceSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceSize(HighLow newDistanceSize) {
		HighLow oldDistanceSize = distanceSize;
		distanceSize = newDistanceSize == null ? DISTANCE_SIZE_EDEFAULT : newDistanceSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.DRIVER__DISTANCE_SIZE, oldDistanceSize,
					distanceSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodologicalIsland> getDrivesMIs() {
		if (drivesMIs == null) {
			drivesMIs = new EObjectResolvingEList<MethodologicalIsland>(MethodologicalIsland.class, this,
					BomiPackage.DRIVER__DRIVES_MIS);
		}
		return drivesMIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BomiPackage.DRIVER__DRIVER_TYPE:
			return getDriverType();
		case BomiPackage.DRIVER__DISTANCE_TYPE:
			return getDistanceType();
		case BomiPackage.DRIVER__DISTANCE_SIZE:
			return getDistanceSize();
		case BomiPackage.DRIVER__DRIVES_MIS:
			return getDrivesMIs();
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
		case BomiPackage.DRIVER__DRIVER_TYPE:
			setDriverType((DriverTypes) newValue);
			return;
		case BomiPackage.DRIVER__DISTANCE_TYPE:
			setDistanceType((DistanceTypes) newValue);
			return;
		case BomiPackage.DRIVER__DISTANCE_SIZE:
			setDistanceSize((HighLow) newValue);
			return;
		case BomiPackage.DRIVER__DRIVES_MIS:
			getDrivesMIs().clear();
			getDrivesMIs().addAll((Collection<? extends MethodologicalIsland>) newValue);
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
		case BomiPackage.DRIVER__DRIVER_TYPE:
			setDriverType(DRIVER_TYPE_EDEFAULT);
			return;
		case BomiPackage.DRIVER__DISTANCE_TYPE:
			setDistanceType(DISTANCE_TYPE_EDEFAULT);
			return;
		case BomiPackage.DRIVER__DISTANCE_SIZE:
			setDistanceSize(DISTANCE_SIZE_EDEFAULT);
			return;
		case BomiPackage.DRIVER__DRIVES_MIS:
			getDrivesMIs().clear();
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
		case BomiPackage.DRIVER__DRIVER_TYPE:
			return driverType != DRIVER_TYPE_EDEFAULT;
		case BomiPackage.DRIVER__DISTANCE_TYPE:
			return distanceType != DISTANCE_TYPE_EDEFAULT;
		case BomiPackage.DRIVER__DISTANCE_SIZE:
			return distanceSize != DISTANCE_SIZE_EDEFAULT;
		case BomiPackage.DRIVER__DRIVES_MIS:
			return drivesMIs != null && !drivesMIs.isEmpty();
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
		result.append(" (driverType: ");
		result.append(driverType);
		result.append(", distanceType: ");
		result.append(distanceType);
		result.append(", distanceSize: ");
		result.append(distanceSize);
		result.append(')');
		return result.toString();
	}

} //DriverImpl
