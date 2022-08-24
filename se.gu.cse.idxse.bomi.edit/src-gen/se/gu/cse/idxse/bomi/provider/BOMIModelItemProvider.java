/**
 */
package se.gu.cse.idxse.bomi.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.gu.cse.idxse.bomi.BOMIModel;
import se.gu.cse.idxse.bomi.BomiFactory;
import se.gu.cse.idxse.bomi.BomiPackage;

/**
 * This is the item provider adapter for a {@link se.gu.cse.idxse.bomi.BOMIModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BOMIModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMIModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__BO_ROLE_INTERACTIONS);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__BOUNDARY_OBJECTS);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__ROLES);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__BO_MI_COORDINATIONS);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__METHODOLOGICAL_ISLANDS);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__GOVERNANCE_TEAMS);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__BO_TEAM_GOVERNANCES);
			childrenFeatures.add(BomiPackage.Literals.BOMI_MODEL__DRIVERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BOMIModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BOMIModel"));
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
		return getString("_UI_BOMIModel_type");
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

		switch (notification.getFeatureID(BOMIModel.class)) {
		case BomiPackage.BOMI_MODEL__BO_ROLE_INTERACTIONS:
		case BomiPackage.BOMI_MODEL__BOUNDARY_OBJECTS:
		case BomiPackage.BOMI_MODEL__ROLES:
		case BomiPackage.BOMI_MODEL__BO_MI_COORDINATIONS:
		case BomiPackage.BOMI_MODEL__METHODOLOGICAL_ISLANDS:
		case BomiPackage.BOMI_MODEL__GOVERNANCE_TEAMS:
		case BomiPackage.BOMI_MODEL__BO_TEAM_GOVERNANCES:
		case BomiPackage.BOMI_MODEL__DRIVERS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(BomiPackage.Literals.BOMI_MODEL__BO_ROLE_INTERACTIONS,
				BomiFactory.eINSTANCE.createBORoleInteraction()));

		newChildDescriptors.add(createChildParameter(BomiPackage.Literals.BOMI_MODEL__BOUNDARY_OBJECTS,
				BomiFactory.eINSTANCE.createBoundaryObject()));

		newChildDescriptors
				.add(createChildParameter(BomiPackage.Literals.BOMI_MODEL__ROLES, BomiFactory.eINSTANCE.createRole()));

		newChildDescriptors.add(createChildParameter(BomiPackage.Literals.BOMI_MODEL__BO_MI_COORDINATIONS,
				BomiFactory.eINSTANCE.createBOMICoordination()));

		newChildDescriptors.add(createChildParameter(BomiPackage.Literals.BOMI_MODEL__METHODOLOGICAL_ISLANDS,
				BomiFactory.eINSTANCE.createMethodologicalIsland()));

		newChildDescriptors.add(createChildParameter(BomiPackage.Literals.BOMI_MODEL__GOVERNANCE_TEAMS,
				BomiFactory.eINSTANCE.createGovernanceTeam()));

		newChildDescriptors.add(createChildParameter(BomiPackage.Literals.BOMI_MODEL__BO_TEAM_GOVERNANCES,
				BomiFactory.eINSTANCE.createBOTeamGovernance()));

		newChildDescriptors.add(
				createChildParameter(BomiPackage.Literals.BOMI_MODEL__DRIVERS, BomiFactory.eINSTANCE.createDriver()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BomiEditPlugin.INSTANCE;
	}

}
