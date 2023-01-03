/**
 */
package se.gu.cse.idxse.bomi.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import se.gu.cse.idxse.bomi.BORoleInteraction;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.MyBoolean;
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
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl#getCreates <em>Creates</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl#getReads <em>Reads</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl#getUpdates <em>Updates</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl#getDeletes <em>Deletes</em>}</li>
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
	 * The default value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected static final MyBoolean RESPONSIBLE_EDEFAULT = MyBoolean.NOT_SET;
	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected MyBoolean responsible = RESPONSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreates() <em>Creates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreates()
	 * @generated
	 * @ordered
	 */
	protected static final MyBoolean CREATES_EDEFAULT = MyBoolean.NOT_SET;

	/**
	 * The cached value of the '{@link #getCreates() <em>Creates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreates()
	 * @generated
	 * @ordered
	 */
	protected MyBoolean creates = CREATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReads() <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReads()
	 * @generated
	 * @ordered
	 */
	protected static final MyBoolean READS_EDEFAULT = MyBoolean.NOT_SET;

	/**
	 * The cached value of the '{@link #getReads() <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReads()
	 * @generated
	 * @ordered
	 */
	protected MyBoolean reads = READS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdates() <em>Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected static final MyBoolean UPDATES_EDEFAULT = MyBoolean.NOT_SET;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected MyBoolean updates = UPDATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeletes() <em>Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletes()
	 * @generated
	 * @ordered
	 */
	protected static final MyBoolean DELETES_EDEFAULT = MyBoolean.NOT_SET;

	/**
	 * The cached value of the '{@link #getDeletes() <em>Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletes()
	 * @generated
	 * @ordered
	 */
	protected MyBoolean deletes = DELETES_EDEFAULT;

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
	public MyBoolean getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(MyBoolean newResponsible) {
		MyBoolean oldResponsible = responsible;
		responsible = newResponsible == null ? RESPONSIBLE_EDEFAULT : newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BO_ROLE_INTERACTION__RESPONSIBLE,
					oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyBoolean getCreates() {
		return creates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreates(MyBoolean newCreates) {
		MyBoolean oldCreates = creates;
		creates = newCreates == null ? CREATES_EDEFAULT : newCreates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BO_ROLE_INTERACTION__CREATES, oldCreates,
					creates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyBoolean getReads() {
		return reads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReads(MyBoolean newReads) {
		MyBoolean oldReads = reads;
		reads = newReads == null ? READS_EDEFAULT : newReads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BO_ROLE_INTERACTION__READS, oldReads,
					reads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyBoolean getUpdates() {
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdates(MyBoolean newUpdates) {
		MyBoolean oldUpdates = updates;
		updates = newUpdates == null ? UPDATES_EDEFAULT : newUpdates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BO_ROLE_INTERACTION__UPDATES, oldUpdates,
					updates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyBoolean getDeletes() {
		return deletes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletes(MyBoolean newDeletes) {
		MyBoolean oldDeletes = deletes;
		deletes = newDeletes == null ? DELETES_EDEFAULT : newDeletes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BO_ROLE_INTERACTION__DELETES, oldDeletes,
					deletes));
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
		case BomiPackage.BO_ROLE_INTERACTION__RESPONSIBLE:
			return getResponsible();
		case BomiPackage.BO_ROLE_INTERACTION__CREATES:
			return getCreates();
		case BomiPackage.BO_ROLE_INTERACTION__READS:
			return getReads();
		case BomiPackage.BO_ROLE_INTERACTION__UPDATES:
			return getUpdates();
		case BomiPackage.BO_ROLE_INTERACTION__DELETES:
			return getDeletes();
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
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__RESPONSIBLE:
			setResponsible((MyBoolean) newValue);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__CREATES:
			setCreates((MyBoolean) newValue);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__READS:
			setReads((MyBoolean) newValue);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__UPDATES:
			setUpdates((MyBoolean) newValue);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__DELETES:
			setDeletes((MyBoolean) newValue);
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
		case BomiPackage.BO_ROLE_INTERACTION__RESPONSIBLE:
			setResponsible(RESPONSIBLE_EDEFAULT);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__CREATES:
			setCreates(CREATES_EDEFAULT);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__READS:
			setReads(READS_EDEFAULT);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__UPDATES:
			setUpdates(UPDATES_EDEFAULT);
			return;
		case BomiPackage.BO_ROLE_INTERACTION__DELETES:
			setDeletes(DELETES_EDEFAULT);
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
		case BomiPackage.BO_ROLE_INTERACTION__RESPONSIBLE:
			return responsible != RESPONSIBLE_EDEFAULT;
		case BomiPackage.BO_ROLE_INTERACTION__CREATES:
			return creates != CREATES_EDEFAULT;
		case BomiPackage.BO_ROLE_INTERACTION__READS:
			return reads != READS_EDEFAULT;
		case BomiPackage.BO_ROLE_INTERACTION__UPDATES:
			return updates != UPDATES_EDEFAULT;
		case BomiPackage.BO_ROLE_INTERACTION__DELETES:
			return deletes != DELETES_EDEFAULT;
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
		result.append(" (responsible: ");
		result.append(responsible);
		result.append(", creates: ");
		result.append(creates);
		result.append(", reads: ");
		result.append(reads);
		result.append(", updates: ");
		result.append(updates);
		result.append(", deletes: ");
		result.append(deletes);
		result.append(')');
		return result.toString();
	}

} //BORoleInteractionImpl
