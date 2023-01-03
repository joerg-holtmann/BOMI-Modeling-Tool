/**
 */
package se.gu.cse.idxse.bomi.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import se.gu.cse.idxse.bomi.BORoleInteraction;
import se.gu.cse.idxse.bomi.BomiPackage;

/**
 * This is the item provider adapter for a {@link se.gu.cse.idxse.bomi.BORoleInteraction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BORoleInteractionItemProvider extends UsageAssociationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BORoleInteractionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRolesPropertyDescriptor(object);
			addResponsiblePropertyDescriptor(object);
			addCreatesPropertyDescriptor(object);
			addReadsPropertyDescriptor(object);
			addUpdatesPropertyDescriptor(object);
			addDeletesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BORoleInteraction_roles_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BORoleInteraction_roles_feature",
								"_UI_BORoleInteraction_type"),
						BomiPackage.Literals.BO_ROLE_INTERACTION__ROLES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Responsible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BORoleInteraction_responsible_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BORoleInteraction_responsible_feature",
								"_UI_BORoleInteraction_type"),
						BomiPackage.Literals.BO_ROLE_INTERACTION__RESPONSIBLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Creates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BORoleInteraction_creates_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BORoleInteraction_creates_feature",
								"_UI_BORoleInteraction_type"),
						BomiPackage.Literals.BO_ROLE_INTERACTION__CREATES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reads feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BORoleInteraction_reads_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BORoleInteraction_reads_feature",
								"_UI_BORoleInteraction_type"),
						BomiPackage.Literals.BO_ROLE_INTERACTION__READS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Updates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BORoleInteraction_updates_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BORoleInteraction_updates_feature",
								"_UI_BORoleInteraction_type"),
						BomiPackage.Literals.BO_ROLE_INTERACTION__UPDATES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deletes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeletesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BORoleInteraction_deletes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BORoleInteraction_deletes_feature",
								"_UI_BORoleInteraction_type"),
						BomiPackage.Literals.BO_ROLE_INTERACTION__DELETES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BORoleInteraction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BORoleInteraction"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BORoleInteraction) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BORoleInteraction_type")
				: getString("_UI_BORoleInteraction_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BORoleInteraction.class)) {
		case BomiPackage.BO_ROLE_INTERACTION__RESPONSIBLE:
		case BomiPackage.BO_ROLE_INTERACTION__CREATES:
		case BomiPackage.BO_ROLE_INTERACTION__READS:
		case BomiPackage.BO_ROLE_INTERACTION__UPDATES:
		case BomiPackage.BO_ROLE_INTERACTION__DELETES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
