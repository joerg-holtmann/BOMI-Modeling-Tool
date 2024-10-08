/**
 */
package se.gu.cse.idxse.bomi.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.gu.cse.idxse.bomi.Association;
import se.gu.cse.idxse.bomi.BOMICoordination;
import se.gu.cse.idxse.bomi.BOMIModel;
import se.gu.cse.idxse.bomi.BORoleInteraction;
import se.gu.cse.idxse.bomi.BOSuperType;
import se.gu.cse.idxse.bomi.BOTeamGovernance;
import se.gu.cse.idxse.bomi.BomiFactory;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.BoundaryObject;
import se.gu.cse.idxse.bomi.DistanceType;
import se.gu.cse.idxse.bomi.Driver;
import se.gu.cse.idxse.bomi.DriverType;
import se.gu.cse.idxse.bomi.GovernanceTeam;
import se.gu.cse.idxse.bomi.HighLow;
import se.gu.cse.idxse.bomi.InteractionKind;
import se.gu.cse.idxse.bomi.LifecycleStage;
import se.gu.cse.idxse.bomi.MIType;
import se.gu.cse.idxse.bomi.MethodologicalIsland;
import se.gu.cse.idxse.bomi.NamedElement;
import se.gu.cse.idxse.bomi.PurposedElement;
import se.gu.cse.idxse.bomi.Role;
import se.gu.cse.idxse.bomi.UsageAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BomiPackageImpl extends EPackageImpl implements BomiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boRoleInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bomiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodologicalIslandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bomiCoordinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass governanceTeamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boTeamGovernanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boSuperTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecycleStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum highLowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum miTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum driverTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.gu.cse.idxse.bomi.BomiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BomiPackageImpl() {
		super(eNS_URI, BomiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BomiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BomiPackage init() {
		if (isInited) return (BomiPackage)EPackage.Registry.INSTANCE.getEPackage(BomiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBomiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BomiPackageImpl theBomiPackage = registeredBomiPackage instanceof BomiPackageImpl ? (BomiPackageImpl)registeredBomiPackage : new BomiPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBomiPackage.createPackageContents();

		// Initialize created meta-data
		theBomiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBomiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BomiPackage.eNS_URI, theBomiPackage);
		return theBomiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundaryObject() {
		return boundaryObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_SuperTypes() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_LevelOfDetail() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_FrequencyOfChange() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_Modularity() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_Maintainability() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_Prescriptive() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_LifecycleStages() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_RepresentationFormat() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_Tooling() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_Versioning() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_UpToDate() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_InternalConsistency() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryObject_ExternalConsistency() {
		return (EAttribute)boundaryObjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_PartOfGovernanceTeams() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_PartOfMIs() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBORoleInteraction() {
		return boRoleInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBORoleInteraction_Roles() {
		return (EReference)boRoleInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBORoleInteraction_InteractionKinds() {
		return (EAttribute)boRoleInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBOMIModel() {
		return bomiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_BoRoleInteractions() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_BoundaryObjects() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_Roles() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_BoMiCoordinations() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_MethodologicalIslands() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_GovernanceTeams() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_BoTeamGovernances() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMIModel_Drivers() {
		return (EReference)bomiModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodologicalIsland() {
		return methodologicalIslandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodologicalIsland_Type() {
		return (EAttribute)methodologicalIslandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodologicalIsland_PartOfMIs() {
		return (EReference)methodologicalIslandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsageAssociation() {
		return usageAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsageAssociation_Accessability() {
		return (EAttribute)usageAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsageAssociation_Stability() {
		return (EAttribute)usageAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsageAssociation_Criticality() {
		return (EAttribute)usageAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsageAssociation_FitForPurpose() {
		return (EAttribute)usageAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBOMICoordination() {
		return bomiCoordinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOMICoordination_MethodologicalIslands() {
		return (EReference)bomiCoordinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGovernanceTeam() {
		return governanceTeamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBOTeamGovernance() {
		return boTeamGovernanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBOTeamGovernance_CoordinationMechanism() {
		return (EAttribute)boTeamGovernanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBOTeamGovernance_FrequencyOfCoordination() {
		return (EAttribute)boTeamGovernanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBOTeamGovernance_GovernanceTeams() {
		return (EReference)boTeamGovernanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_BoundaryObjects() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriver_DriverTypes() {
		return (EAttribute)driverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriver_DistanceSize() {
		return (EAttribute)driverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDriver_DrivesMIs() {
		return (EReference)driverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriver_DistanceTypes() {
		return (EAttribute)driverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPurposedElement() {
		return purposedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPurposedElement_Purpose() {
		return (EAttribute)purposedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBOSuperType() {
		return boSuperTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLifecycleStage() {
		return lifecycleStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHighLow() {
		return highLowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMIType() {
		return miTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDistanceType() {
		return distanceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDriverType() {
		return driverTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInteractionKind() {
		return interactionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BomiFactory getBomiFactory() {
		return (BomiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boundaryObjectEClass = createEClass(BOUNDARY_OBJECT);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__SUPER_TYPES);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__LEVEL_OF_DETAIL);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__MODULARITY);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__MAINTAINABILITY);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__PRESCRIPTIVE);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__LIFECYCLE_STAGES);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__REPRESENTATION_FORMAT);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__TOOLING);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__VERSIONING);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__UP_TO_DATE);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__INTERNAL_CONSISTENCY);
		createEAttribute(boundaryObjectEClass, BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PART_OF_GOVERNANCE_TEAMS);
		createEReference(roleEClass, ROLE__PART_OF_MIS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		boRoleInteractionEClass = createEClass(BO_ROLE_INTERACTION);
		createEReference(boRoleInteractionEClass, BO_ROLE_INTERACTION__ROLES);
		createEAttribute(boRoleInteractionEClass, BO_ROLE_INTERACTION__INTERACTION_KINDS);

		bomiModelEClass = createEClass(BOMI_MODEL);
		createEReference(bomiModelEClass, BOMI_MODEL__BO_ROLE_INTERACTIONS);
		createEReference(bomiModelEClass, BOMI_MODEL__BOUNDARY_OBJECTS);
		createEReference(bomiModelEClass, BOMI_MODEL__ROLES);
		createEReference(bomiModelEClass, BOMI_MODEL__BO_MI_COORDINATIONS);
		createEReference(bomiModelEClass, BOMI_MODEL__METHODOLOGICAL_ISLANDS);
		createEReference(bomiModelEClass, BOMI_MODEL__GOVERNANCE_TEAMS);
		createEReference(bomiModelEClass, BOMI_MODEL__BO_TEAM_GOVERNANCES);
		createEReference(bomiModelEClass, BOMI_MODEL__DRIVERS);

		methodologicalIslandEClass = createEClass(METHODOLOGICAL_ISLAND);
		createEAttribute(methodologicalIslandEClass, METHODOLOGICAL_ISLAND__TYPE);
		createEReference(methodologicalIslandEClass, METHODOLOGICAL_ISLAND__PART_OF_MIS);

		usageAssociationEClass = createEClass(USAGE_ASSOCIATION);
		createEAttribute(usageAssociationEClass, USAGE_ASSOCIATION__ACCESSABILITY);
		createEAttribute(usageAssociationEClass, USAGE_ASSOCIATION__STABILITY);
		createEAttribute(usageAssociationEClass, USAGE_ASSOCIATION__CRITICALITY);
		createEAttribute(usageAssociationEClass, USAGE_ASSOCIATION__FIT_FOR_PURPOSE);

		bomiCoordinationEClass = createEClass(BOMI_COORDINATION);
		createEReference(bomiCoordinationEClass, BOMI_COORDINATION__METHODOLOGICAL_ISLANDS);

		governanceTeamEClass = createEClass(GOVERNANCE_TEAM);

		boTeamGovernanceEClass = createEClass(BO_TEAM_GOVERNANCE);
		createEAttribute(boTeamGovernanceEClass, BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM);
		createEAttribute(boTeamGovernanceEClass, BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION);
		createEReference(boTeamGovernanceEClass, BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__BOUNDARY_OBJECTS);

		driverEClass = createEClass(DRIVER);
		createEAttribute(driverEClass, DRIVER__DRIVER_TYPES);
		createEAttribute(driverEClass, DRIVER__DISTANCE_TYPES);
		createEAttribute(driverEClass, DRIVER__DISTANCE_SIZE);
		createEReference(driverEClass, DRIVER__DRIVES_MIS);

		purposedElementEClass = createEClass(PURPOSED_ELEMENT);
		createEAttribute(purposedElementEClass, PURPOSED_ELEMENT__PURPOSE);

		// Create enums
		boSuperTypeEEnum = createEEnum(BO_SUPER_TYPE);
		lifecycleStageEEnum = createEEnum(LIFECYCLE_STAGE);
		highLowEEnum = createEEnum(HIGH_LOW);
		miTypeEEnum = createEEnum(MI_TYPE);
		distanceTypeEEnum = createEEnum(DISTANCE_TYPE);
		driverTypeEEnum = createEEnum(DRIVER_TYPE);
		interactionKindEEnum = createEEnum(INTERACTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boundaryObjectEClass.getESuperTypes().add(this.getPurposedElement());
		roleEClass.getESuperTypes().add(this.getNamedElement());
		boRoleInteractionEClass.getESuperTypes().add(this.getUsageAssociation());
		methodologicalIslandEClass.getESuperTypes().add(this.getNamedElement());
		usageAssociationEClass.getESuperTypes().add(this.getAssociation());
		bomiCoordinationEClass.getESuperTypes().add(this.getUsageAssociation());
		governanceTeamEClass.getESuperTypes().add(this.getNamedElement());
		boTeamGovernanceEClass.getESuperTypes().add(this.getAssociation());
		associationEClass.getESuperTypes().add(this.getPurposedElement());
		driverEClass.getESuperTypes().add(this.getNamedElement());
		purposedElementEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(boundaryObjectEClass, BoundaryObject.class, "BoundaryObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundaryObject_SuperTypes(), this.getBOSuperType(), "superTypes", null, 0, -1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_LevelOfDetail(), this.getHighLow(), "levelOfDetail", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_FrequencyOfChange(), this.getHighLow(), "frequencyOfChange", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_Modularity(), this.getHighLow(), "modularity", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_Maintainability(), this.getHighLow(), "maintainability", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_Prescriptive(), this.getHighLow(), "prescriptive", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_LifecycleStages(), this.getLifecycleStage(), "lifecycleStages", null, 0, -1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_RepresentationFormat(), ecorePackage.getEString(), "representationFormat", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_Tooling(), ecorePackage.getEString(), "tooling", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_Versioning(), ecorePackage.getEString(), "versioning", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_UpToDate(), ecorePackage.getEString(), "upToDate", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_InternalConsistency(), this.getHighLow(), "internalConsistency", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryObject_ExternalConsistency(), this.getHighLow(), "externalConsistency", null, 0, 1, BoundaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_PartOfGovernanceTeams(), this.getGovernanceTeam(), null, "partOfGovernanceTeams", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_PartOfMIs(), this.getMethodologicalIsland(), null, "partOfMIs", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boRoleInteractionEClass, BORoleInteraction.class, "BORoleInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBORoleInteraction_Roles(), this.getRole(), null, "roles", null, 0, -1, BORoleInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBORoleInteraction_InteractionKinds(), this.getInteractionKind(), "interactionKinds", null, 0, -1, BORoleInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bomiModelEClass, BOMIModel.class, "BOMIModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOMIModel_BoRoleInteractions(), this.getBORoleInteraction(), null, "boRoleInteractions", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMIModel_BoundaryObjects(), this.getBoundaryObject(), null, "boundaryObjects", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMIModel_Roles(), this.getRole(), null, "roles", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMIModel_BoMiCoordinations(), this.getBOMICoordination(), null, "boMiCoordinations", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMIModel_MethodologicalIslands(), this.getMethodologicalIsland(), null, "methodologicalIslands", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMIModel_GovernanceTeams(), this.getGovernanceTeam(), null, "governanceTeams", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMIModel_BoTeamGovernances(), this.getBOTeamGovernance(), null, "boTeamGovernances", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMIModel_Drivers(), this.getDriver(), null, "drivers", null, 0, -1, BOMIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodologicalIslandEClass, MethodologicalIsland.class, "MethodologicalIsland", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodologicalIsland_Type(), this.getMIType(), "type", null, 0, 1, MethodologicalIsland.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodologicalIsland_PartOfMIs(), this.getMethodologicalIsland(), null, "partOfMIs", null, 0, -1, MethodologicalIsland.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageAssociationEClass, UsageAssociation.class, "UsageAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsageAssociation_Accessability(), this.getHighLow(), "accessability", null, 0, 1, UsageAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageAssociation_Stability(), this.getHighLow(), "stability", null, 0, 1, UsageAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageAssociation_Criticality(), this.getHighLow(), "criticality", null, 0, 1, UsageAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageAssociation_FitForPurpose(), this.getHighLow(), "fitForPurpose", null, 0, 1, UsageAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bomiCoordinationEClass, BOMICoordination.class, "BOMICoordination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOMICoordination_MethodologicalIslands(), this.getMethodologicalIsland(), null, "methodologicalIslands", null, 0, -1, BOMICoordination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(governanceTeamEClass, GovernanceTeam.class, "GovernanceTeam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boTeamGovernanceEClass, BOTeamGovernance.class, "BOTeamGovernance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBOTeamGovernance_CoordinationMechanism(), ecorePackage.getEString(), "coordinationMechanism", null, 0, 1, BOTeamGovernance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBOTeamGovernance_FrequencyOfCoordination(), this.getHighLow(), "frequencyOfCoordination", null, 0, 1, BOTeamGovernance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOTeamGovernance_GovernanceTeams(), this.getGovernanceTeam(), null, "governanceTeams", null, 0, -1, BOTeamGovernance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_BoundaryObjects(), this.getBoundaryObject(), null, "boundaryObjects", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDriver_DriverTypes(), this.getDriverType(), "driverTypes", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriver_DistanceTypes(), this.getDistanceType(), "distanceTypes", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriver_DistanceSize(), this.getHighLow(), "distanceSize", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDriver_DrivesMIs(), this.getMethodologicalIsland(), null, "drivesMIs", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(purposedElementEClass, PurposedElement.class, "PurposedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurposedElement_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, PurposedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(boSuperTypeEEnum, BOSuperType.class, "BOSuperType");
		addEEnumLiteral(boSuperTypeEEnum, BOSuperType.STANDARD);
		addEEnumLiteral(boSuperTypeEEnum, BOSuperType.TECHNOLOGY);
		addEEnumLiteral(boSuperTypeEEnum, BOSuperType.TASK);
		addEEnumLiteral(boSuperTypeEEnum, BOSuperType.PLANNING);
		addEEnumLiteral(boSuperTypeEEnum, BOSuperType.VALUE);
		addEEnumLiteral(boSuperTypeEEnum, BOSuperType.PRODUCT);
		addEEnumLiteral(boSuperTypeEEnum, BOSuperType.OTHER);

		initEEnum(lifecycleStageEEnum, LifecycleStage.class, "LifecycleStage");
		addEEnumLiteral(lifecycleStageEEnum, LifecycleStage.PLANNING);
		addEEnumLiteral(lifecycleStageEEnum, LifecycleStage.OPERATION);
		addEEnumLiteral(lifecycleStageEEnum, LifecycleStage.DEPRECATE);
		addEEnumLiteral(lifecycleStageEEnum, LifecycleStage.RETIRE);

		initEEnum(highLowEEnum, HighLow.class, "HighLow");
		addEEnumLiteral(highLowEEnum, HighLow.NOT_SET);
		addEEnumLiteral(highLowEEnum, HighLow.HIGH);
		addEEnumLiteral(highLowEEnum, HighLow.MEDIUM);
		addEEnumLiteral(highLowEEnum, HighLow.LOW);

		initEEnum(miTypeEEnum, MIType.class, "MIType");
		addEEnumLiteral(miTypeEEnum, MIType.NOT_SET);
		addEEnumLiteral(miTypeEEnum, MIType.TEAMS);
		addEEnumLiteral(miTypeEEnum, MIType.SILOS_RELEASE_TRAINS);
		addEEnumLiteral(miTypeEEnum, MIType.DEPARTMENTS);
		addEEnumLiteral(miTypeEEnum, MIType.ORGANIZATIONS);

		initEEnum(distanceTypeEEnum, DistanceType.class, "DistanceType");
		addEEnumLiteral(distanceTypeEEnum, DistanceType.CULTURAL);
		addEEnumLiteral(distanceTypeEEnum, DistanceType.GEOGRAPHICAL);
		addEEnumLiteral(distanceTypeEEnum, DistanceType.ORGANIZATIONAL);

		initEEnum(driverTypeEEnum, DriverType.class, "DriverType");
		addEEnumLiteral(driverTypeEEnum, DriverType.TECHNOLOGY);
		addEEnumLiteral(driverTypeEEnum, DriverType.PROCESS);
		addEEnumLiteral(driverTypeEEnum, DriverType.ORGANIZATIONAL);

		initEEnum(interactionKindEEnum, InteractionKind.class, "InteractionKind");
		addEEnumLiteral(interactionKindEEnum, InteractionKind.IS_RESPONSIBLE_FOR);
		addEEnumLiteral(interactionKindEEnum, InteractionKind.CREATES);
		addEEnumLiteral(interactionKindEEnum, InteractionKind.READS);
		addEEnumLiteral(interactionKindEEnum, InteractionKind.UPDATES);
		addEEnumLiteral(interactionKindEEnum, InteractionKind.DELETES);

		// Create resource
		createResource(eNS_URI);
	}

} //BomiPackageImpl
