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
import se.gu.cse.idxse.bomi.DriverType;
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
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDriverTypes <em>Driver Types</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDistanceTypes <em>Distance Types</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDistanceSize <em>Distance Size</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.DriverImpl#getDrivesMIs <em>Drives MIs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends NamedElementImpl implements Driver {
	/**
	 * The cached value of the '{@link #getDriverTypes() <em>Driver Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DriverType> driverTypes;

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
	public EList<DriverType> getDriverTypes() {
		if (driverTypes == null) {
			driverTypes = new EDataTypeUniqueEList<DriverType>(DriverType.class, this, BomiPackage.DRIVER__DRIVER_TYPES);
		}
		return driverTypes;
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
			case BomiPackage.DRIVER__DRIVER_TYPES:
				return getDriverTypes();
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
			case BomiPackage.DRIVER__DRIVER_TYPES:
				getDriverTypes().clear();
				getDriverTypes().addAll((Collection<? extends DriverType>)newValue);
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
			case BomiPackage.DRIVER__DRIVER_TYPES:
				getDriverTypes().clear();
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
			case BomiPackage.DRIVER__DRIVER_TYPES:
				return driverTypes != null && !driverTypes.isEmpty();
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
		result.append(" (driverTypes: ");
		result.append(driverTypes);
		result.append(", distanceTypes: ");
		result.append(distanceTypes);
		result.append(", distanceSize: ");
		result.append(distanceSize);
		result.append(')');
		return result.toString();
	}

} //DriverImpl
