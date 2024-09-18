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
import se.gu.cse.idxse.bomi.MIType;
import se.gu.cse.idxse.bomi.MethodologicalIsland;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Methodological Island</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.MethodologicalIslandImpl#getType <em>Type</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.MethodologicalIslandImpl#getPartOfMIs <em>Part Of MIs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodologicalIslandImpl extends NamedElementImpl implements MethodologicalIsland {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MIType TYPE_EDEFAULT = MIType.NOT_SET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MIType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartOfMIs() <em>Part Of MIs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfMIs()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodologicalIsland> partOfMIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodologicalIslandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.METHODOLOGICAL_ISLAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MIType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MIType newType) {
		MIType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.METHODOLOGICAL_ISLAND__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodologicalIsland> getPartOfMIs() {
		if (partOfMIs == null) {
			partOfMIs = new EObjectResolvingEList<MethodologicalIsland>(MethodologicalIsland.class, this, BomiPackage.METHODOLOGICAL_ISLAND__PART_OF_MIS);
		}
		return partOfMIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.METHODOLOGICAL_ISLAND__TYPE:
				return getType();
			case BomiPackage.METHODOLOGICAL_ISLAND__PART_OF_MIS:
				return getPartOfMIs();
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
			case BomiPackage.METHODOLOGICAL_ISLAND__TYPE:
				setType((MIType)newValue);
				return;
			case BomiPackage.METHODOLOGICAL_ISLAND__PART_OF_MIS:
				getPartOfMIs().clear();
				getPartOfMIs().addAll((Collection<? extends MethodologicalIsland>)newValue);
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
			case BomiPackage.METHODOLOGICAL_ISLAND__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BomiPackage.METHODOLOGICAL_ISLAND__PART_OF_MIS:
				getPartOfMIs().clear();
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
			case BomiPackage.METHODOLOGICAL_ISLAND__TYPE:
				return type != TYPE_EDEFAULT;
			case BomiPackage.METHODOLOGICAL_ISLAND__PART_OF_MIS:
				return partOfMIs != null && !partOfMIs.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MethodologicalIslandImpl
