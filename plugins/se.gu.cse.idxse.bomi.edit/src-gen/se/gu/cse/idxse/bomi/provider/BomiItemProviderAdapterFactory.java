/**
 */
package se.gu.cse.idxse.bomi.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import se.gu.cse.idxse.bomi.util.BomiAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BomiItemProviderAdapterFactory extends BomiAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BomiItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.BoundaryObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryObjectItemProvider boundaryObjectItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.BoundaryObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundaryObjectAdapter() {
		if (boundaryObjectItemProvider == null) {
			boundaryObjectItemProvider = new BoundaryObjectItemProvider(this);
		}

		return boundaryObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.BORoleInteraction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BORoleInteractionItemProvider boRoleInteractionItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.BORoleInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBORoleInteractionAdapter() {
		if (boRoleInteractionItemProvider == null) {
			boRoleInteractionItemProvider = new BORoleInteractionItemProvider(this);
		}

		return boRoleInteractionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.BOMIModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMIModelItemProvider bomiModelItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.BOMIModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBOMIModelAdapter() {
		if (bomiModelItemProvider == null) {
			bomiModelItemProvider = new BOMIModelItemProvider(this);
		}

		return bomiModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.MethodologicalIsland} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodologicalIslandItemProvider methodologicalIslandItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.MethodologicalIsland}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodologicalIslandAdapter() {
		if (methodologicalIslandItemProvider == null) {
			methodologicalIslandItemProvider = new MethodologicalIslandItemProvider(this);
		}

		return methodologicalIslandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.BOMICoordination} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMICoordinationItemProvider bomiCoordinationItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.BOMICoordination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBOMICoordinationAdapter() {
		if (bomiCoordinationItemProvider == null) {
			bomiCoordinationItemProvider = new BOMICoordinationItemProvider(this);
		}

		return bomiCoordinationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.GovernanceTeam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GovernanceTeamItemProvider governanceTeamItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.GovernanceTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGovernanceTeamAdapter() {
		if (governanceTeamItemProvider == null) {
			governanceTeamItemProvider = new GovernanceTeamItemProvider(this);
		}

		return governanceTeamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.BOTeamGovernance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOTeamGovernanceItemProvider boTeamGovernanceItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.BOTeamGovernance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBOTeamGovernanceAdapter() {
		if (boTeamGovernanceItemProvider == null) {
			boTeamGovernanceItemProvider = new BOTeamGovernanceItemProvider(this);
		}

		return boTeamGovernanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.gu.cse.idxse.bomi.Driver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverItemProvider driverItemProvider;

	/**
	 * This creates an adapter for a {@link se.gu.cse.idxse.bomi.Driver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDriverAdapter() {
		if (driverItemProvider == null) {
			driverItemProvider = new DriverItemProvider(this);
		}

		return driverItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (boundaryObjectItemProvider != null) boundaryObjectItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (boRoleInteractionItemProvider != null) boRoleInteractionItemProvider.dispose();
		if (bomiModelItemProvider != null) bomiModelItemProvider.dispose();
		if (methodologicalIslandItemProvider != null) methodologicalIslandItemProvider.dispose();
		if (bomiCoordinationItemProvider != null) bomiCoordinationItemProvider.dispose();
		if (governanceTeamItemProvider != null) governanceTeamItemProvider.dispose();
		if (boTeamGovernanceItemProvider != null) boTeamGovernanceItemProvider.dispose();
		if (driverItemProvider != null) driverItemProvider.dispose();
	}

}