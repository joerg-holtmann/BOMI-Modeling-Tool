/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import se.gu.cse.idxse.bomi.BORoleInteraction;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.InteractionKind;
import se.gu.cse.idxse.bomi.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BO Role Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl#getInteractionKinds <em>Interaction Kinds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BORoleInteractionImpl extends UsageAssociationImpl implements BORoleInteraction {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getInteractionKinds() <em>Interaction Kinds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionKinds()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionKind> interactionKinds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BORoleInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.BO_ROLE_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<Role>(Role.class, this, BomiPackage.BO_ROLE_INTERACTION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionKind> getInteractionKinds() {
		if (interactionKinds == null) {
			interactionKinds = new EDataTypeUniqueEList<InteractionKind>(InteractionKind.class, this, BomiPackage.BO_ROLE_INTERACTION__INTERACTION_KINDS);
		}
		return interactionKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.BO_ROLE_INTERACTION__ROLES:
				return getRoles();
			case BomiPackage.BO_ROLE_INTERACTION__INTERACTION_KINDS:
				return getInteractionKinds();
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
			case BomiPackage.BO_ROLE_INTERACTION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case BomiPackage.BO_ROLE_INTERACTION__INTERACTION_KINDS:
				getInteractionKinds().clear();
				getInteractionKinds().addAll((Collection<? extends InteractionKind>)newValue);
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
			case BomiPackage.BO_ROLE_INTERACTION__ROLES:
				getRoles().clear();
				return;
			case BomiPackage.BO_ROLE_INTERACTION__INTERACTION_KINDS:
				getInteractionKinds().clear();
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
			case BomiPackage.BO_ROLE_INTERACTION__ROLES:
				return roles != null && !roles.isEmpty();
			case BomiPackage.BO_ROLE_INTERACTION__INTERACTION_KINDS:
				return interactionKinds != null && !interactionKinds.isEmpty();
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
		result.append(" (interactionKinds: ");
		result.append(interactionKinds);
		result.append(')');
		return result.toString();
	}

} //BORoleInteractionImpl
