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

import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.BoundaryObject;

/**
 * This is the item provider adapter for a {@link se.gu.cse.idxse.bomi.BoundaryObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundaryObjectItemProvider extends PurposedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryObjectItemProvider(AdapterFactory adapterFactory) {
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

			addSuperTypePropertyDescriptor(object);
			addLevelOfDetailPropertyDescriptor(object);
			addFrequencyOfChangePropertyDescriptor(object);
			addModularityPropertyDescriptor(object);
			addMaintainabilityPropertyDescriptor(object);
			addPrescriptivePropertyDescriptor(object);
			addLifecycleStagePropertyDescriptor(object);
			addRepresentationFormatPropertyDescriptor(object);
			addToolingPropertyDescriptor(object);
			addVersioningPropertyDescriptor(object);
			addUpToDatePropertyDescriptor(object);
			addInternalConsistencyPropertyDescriptor(object);
			addExternalConsistencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Super Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_superType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_superType_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__SUPER_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Level Of Detail feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelOfDetailPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_levelOfDetail_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_levelOfDetail_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__LEVEL_OF_DETAIL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Frequency Of Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrequencyOfChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_frequencyOfChange_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_frequencyOfChange_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Modularity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModularityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_modularity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_modularity_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__MODULARITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Maintainability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaintainabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_maintainability_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_maintainability_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__MAINTAINABILITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prescriptive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrescriptivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_prescriptive_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_prescriptive_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__PRESCRIPTIVE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lifecycle Stage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifecycleStagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_lifecycleStage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_lifecycleStage_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__LIFECYCLE_STAGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Representation Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentationFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BoundaryObject_representationFormat_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_representationFormat_feature",
						"_UI_BoundaryObject_type"),
				BomiPackage.Literals.BOUNDARY_OBJECT__REPRESENTATION_FORMAT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tooling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_tooling_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_tooling_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__TOOLING, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Versioning feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersioningPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_versioning_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_versioning_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__VERSIONING, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Up To Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpToDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BoundaryObject_upToDate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_upToDate_feature",
								"_UI_BoundaryObject_type"),
						BomiPackage.Literals.BOUNDARY_OBJECT__UP_TO_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Internal Consistency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalConsistencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BoundaryObject_internalConsistency_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_internalConsistency_feature",
						"_UI_BoundaryObject_type"),
				BomiPackage.Literals.BOUNDARY_OBJECT__INTERNAL_CONSISTENCY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the External Consistency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalConsistencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BoundaryObject_externalConsistency_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BoundaryObject_externalConsistency_feature",
						"_UI_BoundaryObject_type"),
				BomiPackage.Literals.BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BoundaryObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BoundaryObject"));
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
		String label = ((BoundaryObject) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BoundaryObject_type")
				: getString("_UI_BoundaryObject_type") + " " + label;
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

		switch (notification.getFeatureID(BoundaryObject.class)) {
		case BomiPackage.BOUNDARY_OBJECT__SUPER_TYPE:
		case BomiPackage.BOUNDARY_OBJECT__LEVEL_OF_DETAIL:
		case BomiPackage.BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE:
		case BomiPackage.BOUNDARY_OBJECT__MODULARITY:
		case BomiPackage.BOUNDARY_OBJECT__MAINTAINABILITY:
		case BomiPackage.BOUNDARY_OBJECT__PRESCRIPTIVE:
		case BomiPackage.BOUNDARY_OBJECT__LIFECYCLE_STAGE:
		case BomiPackage.BOUNDARY_OBJECT__REPRESENTATION_FORMAT:
		case BomiPackage.BOUNDARY_OBJECT__TOOLING:
		case BomiPackage.BOUNDARY_OBJECT__VERSIONING:
		case BomiPackage.BOUNDARY_OBJECT__UP_TO_DATE:
		case BomiPackage.BOUNDARY_OBJECT__INTERNAL_CONSISTENCY:
		case BomiPackage.BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY:
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
