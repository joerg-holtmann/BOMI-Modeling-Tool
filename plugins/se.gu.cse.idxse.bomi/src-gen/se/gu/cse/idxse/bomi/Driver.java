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
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeTechnology <em>Driver Type Technology</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeProcess <em>Driver Type Process</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeOrganizational <em>Driver Type Organizational</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.Driver#getDistanceTypes <em>Distance Types</em>}</li>
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
	 * Returns the value of the '<em><b>Driver Type Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.UnsettableBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Type Technology</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @see #setDriverTypeTechnology(UnsettableBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DriverTypeTechnology()
	 * @model
	 * @generated
	 */
	UnsettableBoolean getDriverTypeTechnology();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeTechnology <em>Driver Type Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Type Technology</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @see #getDriverTypeTechnology()
	 * @generated
	 */
	void setDriverTypeTechnology(UnsettableBoolean value);

	/**
	 * Returns the value of the '<em><b>Driver Type Process</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.UnsettableBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Type Process</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @see #setDriverTypeProcess(UnsettableBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DriverTypeProcess()
	 * @model
	 * @generated
	 */
	UnsettableBoolean getDriverTypeProcess();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeProcess <em>Driver Type Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Type Process</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @see #getDriverTypeProcess()
	 * @generated
	 */
	void setDriverTypeProcess(UnsettableBoolean value);

	/**
	 * Returns the value of the '<em><b>Driver Type Organizational</b></em>' attribute.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.UnsettableBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Type Organizational</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @see #setDriverTypeOrganizational(UnsettableBoolean)
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DriverTypeOrganizational()
	 * @model
	 * @generated
	 */
	UnsettableBoolean getDriverTypeOrganizational();

	/**
	 * Sets the value of the '{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeOrganizational <em>Driver Type Organizational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Type Organizational</em>' attribute.
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @see #getDriverTypeOrganizational()
	 * @generated
	 */
	void setDriverTypeOrganizational(UnsettableBoolean value);

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

	/**
	 * Returns the value of the '<em><b>Distance Types</b></em>' attribute list.
	 * The list contents are of type {@link se.gu.cse.idxse.bomi.DistanceType}.
	 * The literals are from the enumeration {@link se.gu.cse.idxse.bomi.DistanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Types</em>' attribute list.
	 * @see se.gu.cse.idxse.bomi.DistanceType
	 * @see se.gu.cse.idxse.bomi.BomiPackage#getDriver_DistanceTypes()
	 * @model
	 * @generated
	 */
	EList<DistanceType> getDistanceTypes();

} // Driver
