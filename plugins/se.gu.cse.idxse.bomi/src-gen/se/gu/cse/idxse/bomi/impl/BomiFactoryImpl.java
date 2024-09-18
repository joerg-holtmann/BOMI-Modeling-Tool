/**
 */
package se.gu.cse.idxse.bomi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.gu.cse.idxse.bomi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BomiFactoryImpl extends EFactoryImpl implements BomiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BomiFactory init() {
		try {
			BomiFactory theBomiFactory = (BomiFactory)EPackage.Registry.INSTANCE.getEFactory(BomiPackage.eNS_URI);
			if (theBomiFactory != null) {
				return theBomiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BomiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BomiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BomiPackage.BOUNDARY_OBJECT: return createBoundaryObject();
			case BomiPackage.ROLE: return createRole();
			case BomiPackage.BO_ROLE_INTERACTION: return createBORoleInteraction();
			case BomiPackage.BOMI_MODEL: return createBOMIModel();
			case BomiPackage.METHODOLOGICAL_ISLAND: return createMethodologicalIsland();
			case BomiPackage.BOMI_COORDINATION: return createBOMICoordination();
			case BomiPackage.GOVERNANCE_TEAM: return createGovernanceTeam();
			case BomiPackage.BO_TEAM_GOVERNANCE: return createBOTeamGovernance();
			case BomiPackage.DRIVER: return createDriver();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BomiPackage.BO_SUPER_TYPE:
				return createBOSuperTypeFromString(eDataType, initialValue);
			case BomiPackage.LIFECYCLE_STAGE:
				return createLifecycleStageFromString(eDataType, initialValue);
			case BomiPackage.HIGH_LOW:
				return createHighLowFromString(eDataType, initialValue);
			case BomiPackage.MI_TYPE:
				return createMITypeFromString(eDataType, initialValue);
			case BomiPackage.DISTANCE_TYPE:
				return createDistanceTypeFromString(eDataType, initialValue);
			case BomiPackage.DRIVER_TYPE:
				return createDriverTypeFromString(eDataType, initialValue);
			case BomiPackage.INTERACTION_KIND:
				return createInteractionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BomiPackage.BO_SUPER_TYPE:
				return convertBOSuperTypeToString(eDataType, instanceValue);
			case BomiPackage.LIFECYCLE_STAGE:
				return convertLifecycleStageToString(eDataType, instanceValue);
			case BomiPackage.HIGH_LOW:
				return convertHighLowToString(eDataType, instanceValue);
			case BomiPackage.MI_TYPE:
				return convertMITypeToString(eDataType, instanceValue);
			case BomiPackage.DISTANCE_TYPE:
				return convertDistanceTypeToString(eDataType, instanceValue);
			case BomiPackage.DRIVER_TYPE:
				return convertDriverTypeToString(eDataType, instanceValue);
			case BomiPackage.INTERACTION_KIND:
				return convertInteractionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryObject createBoundaryObject() {
		BoundaryObjectImpl boundaryObject = new BoundaryObjectImpl();
		return boundaryObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BORoleInteraction createBORoleInteraction() {
		BORoleInteractionImpl boRoleInteraction = new BORoleInteractionImpl();
		return boRoleInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BOMIModel createBOMIModel() {
		BOMIModelImpl bomiModel = new BOMIModelImpl();
		return bomiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodologicalIsland createMethodologicalIsland() {
		MethodologicalIslandImpl methodologicalIsland = new MethodologicalIslandImpl();
		return methodologicalIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BOMICoordination createBOMICoordination() {
		BOMICoordinationImpl bomiCoordination = new BOMICoordinationImpl();
		return bomiCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GovernanceTeam createGovernanceTeam() {
		GovernanceTeamImpl governanceTeam = new GovernanceTeamImpl();
		return governanceTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BOTeamGovernance createBOTeamGovernance() {
		BOTeamGovernanceImpl boTeamGovernance = new BOTeamGovernanceImpl();
		return boTeamGovernance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOSuperType createBOSuperTypeFromString(EDataType eDataType, String initialValue) {
		BOSuperType result = BOSuperType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBOSuperTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleStage createLifecycleStageFromString(EDataType eDataType, String initialValue) {
		LifecycleStage result = LifecycleStage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecycleStageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow createHighLowFromString(EDataType eDataType, String initialValue) {
		HighLow result = HighLow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHighLowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIType createMITypeFromString(EDataType eDataType, String initialValue) {
		MIType result = MIType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMITypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceType createDistanceTypeFromString(EDataType eDataType, String initialValue) {
		DistanceType result = DistanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverType createDriverTypeFromString(EDataType eDataType, String initialValue) {
		DriverType result = DriverType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDriverTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionKind createInteractionKindFromString(EDataType eDataType, String initialValue) {
		InteractionKind result = InteractionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BomiPackage getBomiPackage() {
		return (BomiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BomiPackage getPackage() {
		return BomiPackage.eINSTANCE;
	}

} //BomiFactoryImpl
