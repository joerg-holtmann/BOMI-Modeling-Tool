/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.DistanceType;
import se.gu.cse.idxse.bomi.Driver;
import se.gu.cse.idxse.bomi.HighLow;
import se.gu.cse.idxse.bomi.MethodologicalIsland;
import se.gu.cse.idxse.bomi.UnsettableBoolean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDriverTypeTechnology <em>Driver Type Technology</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDriverTypeProcess <em>Driver Type Process</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDriverTypeOrganizational <em>Driver Type Organizational</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDistanceTypes <em>Distance Types</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDistanceSize <em>Distance Size</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDrivesMIs <em>Drives MIs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends NamedElementImpl implements Driver {
	/**
	 * The default value of the '{@link #getDriverTypeTechnology() <em>Driver Type Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverTypeTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final UnsettableBoolean DRIVER_TYPE_TECHNOLOGY_EDEFAULT = UnsettableBoolean.NOT_SET;

	/**
	 * The cached value of the '{@link #getDriverTypeTechnology() <em>Driver Type Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverTypeTechnology()
	 * @generated
	 * @ordered
	 */
	protected UnsettableBoolean driverTypeTechnology = DRIVER_TYPE_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverTypeProcess() <em>Driver Type Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverTypeProcess()
	 * @generated
	 * @ordered
	 */
	protected static final UnsettableBoolean DRIVER_TYPE_PROCESS_EDEFAULT = UnsettableBoolean.NOT_SET;

	/**
	 * The cached value of the '{@link #getDriverTypeProcess() <em>Driver Type Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverTypeProcess()
	 * @generated
	 * @ordered
	 */
	protected UnsettableBoolean driverTypeProcess = DRIVER_TYPE_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverTypeOrganizational() <em>Driver Type Organizational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverTypeOrganizational()
	 * @generated
	 * @ordered
	 */
	protected static final UnsettableBoolean DRIVER_TYPE_ORGANIZATIONAL_EDEFAULT = UnsettableBoolean.NOT_SET;

	/**
	 * The cached value of the '{@link #getDriverTypeOrganizational() <em>Driver Type Organizational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverTypeOrganizational()
	 * @generated
	 * @ordered
	 */
	protected UnsettableBoolean driverTypeOrganizational = DRIVER_TYPE_ORGANIZATIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDistanceTypes() <em>Distance Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DistanceType> distanceTypes;

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
	public UnsettableBoolean getDriverTypeTechnology() {
		return driverTypeTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverTypeTechnology(UnsettableBoolean newDriverTypeTechnology) {
		UnsettableBoolean oldDriverTypeTechnology = driverTypeTechnology;
		driverTypeTechnology = newDriverTypeTechnology == null ? DRIVER_TYPE_TECHNOLOGY_EDEFAULT : newDriverTypeTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.DRIVER__DRIVER_TYPE_TECHNOLOGY, oldDriverTypeTechnology, driverTypeTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsettableBoolean getDriverTypeProcess() {
		return driverTypeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverTypeProcess(UnsettableBoolean newDriverTypeProcess) {
		UnsettableBoolean oldDriverTypeProcess = driverTypeProcess;
		driverTypeProcess = newDriverTypeProcess == null ? DRIVER_TYPE_PROCESS_EDEFAULT : newDriverTypeProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.DRIVER__DRIVER_TYPE_PROCESS, oldDriverTypeProcess, driverTypeProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsettableBoolean getDriverTypeOrganizational() {
		return driverTypeOrganizational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverTypeOrganizational(UnsettableBoolean newDriverTypeOrganizational) {
		UnsettableBoolean oldDriverTypeOrganizational = driverTypeOrganizational;
		driverTypeOrganizational = newDriverTypeOrganizational == null ? DRIVER_TYPE_ORGANIZATIONAL_EDEFAULT : newDriverTypeOrganizational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.DRIVER__DRIVER_TYPE_ORGANIZATIONAL, oldDriverTypeOrganizational, driverTypeOrganizational));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.DRIVER__DISTANCE_SIZE, oldDistanceSize, distanceSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodologicalIsland> getDrivesMIs() {
		if (drivesMIs == null) {
			drivesMIs = new EObjectResolvingEList<MethodologicalIsland>(MethodologicalIsland.class, this, BomiPackage.DRIVER__DRIVES_MIS);
		}
		return drivesMIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistanceType> getDistanceTypes() {
		if (distanceTypes == null) {
			distanceTypes = new EDataTypeUniqueEList<DistanceType>(DistanceType.class, this, BomiPackage.DRIVER__DISTANCE_TYPES);
		}
		return distanceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.DRIVER__DRIVER_TYPE_TECHNOLOGY:
				return getDriverTypeTechnology();
			case BomiPackage.DRIVER__DRIVER_TYPE_PROCESS:
				return getDriverTypeProcess();
			case BomiPackage.DRIVER__DRIVER_TYPE_ORGANIZATIONAL:
				return getDriverTypeOrganizational();
			case BomiPackage.DRIVER__DISTANCE_TYPES:
				return getDistanceTypes();
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
			case BomiPackage.DRIVER__DRIVER_TYPE_TECHNOLOGY:
				setDriverTypeTechnology((UnsettableBoolean)newValue);
				return;
			case BomiPackage.DRIVER__DRIVER_TYPE_PROCESS:
				setDriverTypeProcess((UnsettableBoolean)newValue);
				return;
			case BomiPackage.DRIVER__DRIVER_TYPE_ORGANIZATIONAL:
				setDriverTypeOrganizational((UnsettableBoolean)newValue);
				return;
			case BomiPackage.DRIVER__DISTANCE_TYPES:
				getDistanceTypes().clear();
				getDistanceTypes().addAll((Collection<? extends DistanceType>)newValue);
				return;
			case BomiPackage.DRIVER__DISTANCE_SIZE:
				setDistanceSize((HighLow)newValue);
				return;
			case BomiPackage.DRIVER__DRIVES_MIS:
				getDrivesMIs().clear();
				getDrivesMIs().addAll((Collection<? extends MethodologicalIsland>)newValue);
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
			case BomiPackage.DRIVER__DRIVER_TYPE_TECHNOLOGY:
				setDriverTypeTechnology(DRIVER_TYPE_TECHNOLOGY_EDEFAULT);
				return;
			case BomiPackage.DRIVER__DRIVER_TYPE_PROCESS:
				setDriverTypeProcess(DRIVER_TYPE_PROCESS_EDEFAULT);
				return;
			case BomiPackage.DRIVER__DRIVER_TYPE_ORGANIZATIONAL:
				setDriverTypeOrganizational(DRIVER_TYPE_ORGANIZATIONAL_EDEFAULT);
				return;
			case BomiPackage.DRIVER__DISTANCE_TYPES:
				getDistanceTypes().clear();
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
			case BomiPackage.DRIVER__DRIVER_TYPE_TECHNOLOGY:
				return driverTypeTechnology != DRIVER_TYPE_TECHNOLOGY_EDEFAULT;
			case BomiPackage.DRIVER__DRIVER_TYPE_PROCESS:
				return driverTypeProcess != DRIVER_TYPE_PROCESS_EDEFAULT;
			case BomiPackage.DRIVER__DRIVER_TYPE_ORGANIZATIONAL:
				return driverTypeOrganizational != DRIVER_TYPE_ORGANIZATIONAL_EDEFAULT;
			case BomiPackage.DRIVER__DISTANCE_TYPES:
				return distanceTypes != null && !distanceTypes.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (driverTypeTechnology: ");
		result.append(driverTypeTechnology);
		result.append(", driverTypeProcess: ");
		result.append(driverTypeProcess);
		result.append(", driverTypeOrganizational: ");
		result.append(driverTypeOrganizational);
		result.append(", distanceTypes: ");
		result.append(distanceTypes);
		result.append(", distanceSize: ");
		result.append(distanceSize);
		result.append(')');
		return result.toString();
	}

} //DriverImpl
