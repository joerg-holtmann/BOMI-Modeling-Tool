/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDriverType <em>Driver Type</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDistanceType <em>Distance Type</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDistanceSize <em>Distance Size</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDrivesMIs <em>Drives MIs</em>}</li>
 * </ul>
 *
 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Driver Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.DriverTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.DriverTypes
	 * @see #setDriverType(DriverTypes)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DriverType()
	 * @model
	 * @generated
	 */
	DriverTypes getDriverType();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.Driver#getDriverType <em>Driver Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.DriverTypes
	 * @see #getDriverType()
	 * @generated
	 */
	void setDriverType(DriverTypes value);

	/**
	 * Returns the value of the '<em><b>Distance Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.DistanceTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.DistanceTypes
	 * @see #setDistanceType(DistanceTypes)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DistanceType()
	 * @model
	 * @generated
	 */
	DistanceTypes getDistanceType();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.Driver#getDistanceType <em>Distance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Type</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.DistanceTypes
	 * @see #getDistanceType()
	 * @generated
	 */
	void setDistanceType(DistanceTypes value);

	/**
	 * Returns the value of the '<em><b>Distance Size</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Size</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #setDistanceSize(HighLow)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DistanceSize()
	 * @model
	 * @generated
	 */
	HighLow getDistanceSize();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.Driver#getDistanceSize <em>Distance Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Size</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see #getDistanceSize()
	 * @generated
	 */
	void setDistanceSize(HighLow value);

	/**
	 * Returns the value of the '<em><b>Drives MIs</b></em>' reference list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.MethodologicalIsland}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drives MIs</em>' reference list.
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DrivesMIs()
	 * @model
	 * @generated
	 */
	EList<MethodologicalIsland> getDrivesMIs();

} // Driver
