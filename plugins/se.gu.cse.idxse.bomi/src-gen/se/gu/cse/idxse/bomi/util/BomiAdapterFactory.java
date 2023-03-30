/**
 */
package se.gu.cse.idxse.bomi.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.gu.cse.idxse.bomi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage
 * @generated
 */
public class BomiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BomiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BomiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BomiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BomiSwitch<Adapter> modelSwitch = new BomiSwitch<Adapter>() {
			@Override
			public Adapter caseBoundaryObject(BoundaryObject object) {
				return createBoundaryObjectAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseBORoleInteraction(BORoleInteraction object) {
				return createBORoleInteractionAdapter();
			}
			@Override
			public Adapter caseBOMIModel(BOMIModel object) {
				return createBOMIModelAdapter();
			}
			@Override
			public Adapter caseMethodologicalIsland(MethodologicalIsland object) {
				return createMethodologicalIslandAdapter();
			}
			@Override
			public Adapter caseUsageAssociation(UsageAssociation object) {
				return createUsageAssociationAdapter();
			}
			@Override
			public Adapter caseBOMICoordination(BOMICoordination object) {
				return createBOMICoordinationAdapter();
			}
			@Override
			public Adapter caseGovernanceTeam(GovernanceTeam object) {
				return createGovernanceTeamAdapter();
			}
			@Override
			public Adapter caseBOTeamGovernance(BOTeamGovernance object) {
				return createBOTeamGovernanceAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseDriver(Driver object) {
				return createDriverAdapter();
			}
			@Override
			public Adapter casePurposedElement(PurposedElement object) {
				return createPurposedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.BoundaryObject <em>Boundary Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject
	 * @generated
	 */
	public Adapter createBoundaryObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.BORoleInteraction <em>BO Role Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction
	 * @generated
	 */
	public Adapter createBORoleInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.BOMIModel <em>BOMI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.BOMIModel
	 * @generated
	 */
	public Adapter createBOMIModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.MethodologicalIsland <em>Methodological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.MethodologicalIsland
	 * @generated
	 */
	public Adapter createMethodologicalIslandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.UsageAssociation <em>Usage Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.UsageAssociation
	 * @generated
	 */
	public Adapter createUsageAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.BOMICoordination <em>BOMI Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.BOMICoordination
	 * @generated
	 */
	public Adapter createBOMICoordinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.GovernanceTeam <em>Governance Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.GovernanceTeam
	 * @generated
	 */
	public Adapter createGovernanceTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.BOTeamGovernance <em>BO Team Governance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.BOTeamGovernance
	 * @generated
	 */
	public Adapter createBOTeamGovernanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.Driver
	 * @generated
	 */
	public Adapter createDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.gu.cse.idxse.bomi.PurposedElement <em>Purposed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.gu.cse.idxse.bomi.PurposedElement
	 * @generated
	 */
	public Adapter createPurposedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BomiAdapterFactory
