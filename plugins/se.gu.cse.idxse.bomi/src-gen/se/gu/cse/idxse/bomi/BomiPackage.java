/**
 */
package se.gu.cse.idxse.bomi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see se.gu.cse.idxse.bomi.BomiFactory
 * @model kind="package"
 * @generated
 */
public interface BomiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bomi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gu.se/bomi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bomi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BomiPackage eINSTANCE = se.gu.cse.idxse.bomi.impl.BomiPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.NamedElementImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.PurposedElementImpl <em>Purposed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.PurposedElementImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getPurposedElement()
	 * @generated
	 */
	int PURPOSED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSED_ELEMENT__PURPOSE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Purposed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Purposed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl <em>Boundary Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBoundaryObject()
	 * @generated
	 */
	int BOUNDARY_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__NAME = PURPOSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__PURPOSE = PURPOSED_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__SUPER_TYPE = PURPOSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level Of Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__LEVEL_OF_DETAIL = PURPOSED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency Of Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE = PURPOSED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__MODULARITY = PURPOSED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maintainability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__MAINTAINABILITY = PURPOSED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prescriptive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__PRESCRIPTIVE = PURPOSED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lifecycle Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__LIFECYCLE_STAGE = PURPOSED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Representation Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__REPRESENTATION_FORMAT = PURPOSED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tooling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__TOOLING = PURPOSED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Versioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__VERSIONING = PURPOSED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Up To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__UP_TO_DATE = PURPOSED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Internal Consistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__INTERNAL_CONSISTENCY = PURPOSED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>External Consistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY = PURPOSED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Boundary Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT_FEATURE_COUNT = PURPOSED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Boundary Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OBJECT_OPERATION_COUNT = PURPOSED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.RoleImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Part Of Governance Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PART_OF_GOVERNANCE_TEAMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Of MIs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PART_OF_MIS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.AssociationImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = PURPOSED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PURPOSE = PURPOSED_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Boundary Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BOUNDARY_OBJECTS = PURPOSED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = PURPOSED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = PURPOSED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.UsageAssociationImpl <em>Usage Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.UsageAssociationImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getUsageAssociation()
	 * @generated
	 */
	int USAGE_ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION__PURPOSE = ASSOCIATION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Boundary Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION__BOUNDARY_OBJECTS = ASSOCIATION__BOUNDARY_OBJECTS;

	/**
	 * The feature id for the '<em><b>Accessability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION__ACCESSABILITY = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION__STABILITY = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION__CRITICALITY = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fit For Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION__FIT_FOR_PURPOSE = ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Usage Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Usage Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl <em>BO Role Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBORoleInteraction()
	 * @generated
	 */
	int BO_ROLE_INTERACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__NAME = USAGE_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__PURPOSE = USAGE_ASSOCIATION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Boundary Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__BOUNDARY_OBJECTS = USAGE_ASSOCIATION__BOUNDARY_OBJECTS;

	/**
	 * The feature id for the '<em><b>Accessability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__ACCESSABILITY = USAGE_ASSOCIATION__ACCESSABILITY;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__STABILITY = USAGE_ASSOCIATION__STABILITY;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__CRITICALITY = USAGE_ASSOCIATION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Fit For Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__FIT_FOR_PURPOSE = USAGE_ASSOCIATION__FIT_FOR_PURPOSE;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__ROLES = USAGE_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__RESPONSIBLE = USAGE_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__CREATES = USAGE_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__READS = USAGE_ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__UPDATES = USAGE_ASSOCIATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Deletes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION__DELETES = USAGE_ASSOCIATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BO Role Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION_FEATURE_COUNT = USAGE_ASSOCIATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>BO Role Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ROLE_INTERACTION_OPERATION_COUNT = USAGE_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl <em>BOMI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.BOMIModelImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOMIModel()
	 * @generated
	 */
	int BOMI_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Bo Role Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__BO_ROLE_INTERACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Boundary Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__BOUNDARY_OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__ROLES = 2;

	/**
	 * The feature id for the '<em><b>Bo Mi Coordinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__BO_MI_COORDINATIONS = 3;

	/**
	 * The feature id for the '<em><b>Methodological Islands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__METHODOLOGICAL_ISLANDS = 4;

	/**
	 * The feature id for the '<em><b>Governance Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__GOVERNANCE_TEAMS = 5;

	/**
	 * The feature id for the '<em><b>Bo Team Governances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__BO_TEAM_GOVERNANCES = 6;

	/**
	 * The feature id for the '<em><b>Drivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL__DRIVERS = 7;

	/**
	 * The number of structural features of the '<em>BOMI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>BOMI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.MethodologicalIslandImpl <em>Methodological Island</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.MethodologicalIslandImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getMethodologicalIsland()
	 * @generated
	 */
	int METHODOLOGICAL_ISLAND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODOLOGICAL_ISLAND__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODOLOGICAL_ISLAND__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Methodological Island</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODOLOGICAL_ISLAND_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Methodological Island</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODOLOGICAL_ISLAND_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.BOMICoordinationImpl <em>BOMI Coordination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.BOMICoordinationImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOMICoordination()
	 * @generated
	 */
	int BOMI_COORDINATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__NAME = USAGE_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__PURPOSE = USAGE_ASSOCIATION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Boundary Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__BOUNDARY_OBJECTS = USAGE_ASSOCIATION__BOUNDARY_OBJECTS;

	/**
	 * The feature id for the '<em><b>Accessability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__ACCESSABILITY = USAGE_ASSOCIATION__ACCESSABILITY;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__STABILITY = USAGE_ASSOCIATION__STABILITY;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__CRITICALITY = USAGE_ASSOCIATION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Fit For Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__FIT_FOR_PURPOSE = USAGE_ASSOCIATION__FIT_FOR_PURPOSE;

	/**
	 * The feature id for the '<em><b>Methodological Islands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION__METHODOLOGICAL_ISLANDS = USAGE_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BOMI Coordination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION_FEATURE_COUNT = USAGE_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BOMI Coordination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMI_COORDINATION_OPERATION_COUNT = USAGE_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.GovernanceTeamImpl <em>Governance Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.GovernanceTeamImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getGovernanceTeam()
	 * @generated
	 */
	int GOVERNANCE_TEAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_TEAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Governance Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_TEAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Governance Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_TEAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.BOTeamGovernanceImpl <em>BO Team Governance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.BOTeamGovernanceImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOTeamGovernance()
	 * @generated
	 */
	int BO_TEAM_GOVERNANCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE__PURPOSE = ASSOCIATION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Boundary Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE__BOUNDARY_OBJECTS = ASSOCIATION__BOUNDARY_OBJECTS;

	/**
	 * The feature id for the '<em><b>Coordination Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency Of Coordination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Governance Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BO Team Governance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BO Team Governance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_TEAM_GOVERNANCE_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.impl.DriverImpl
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Driver Type Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DRIVER_TYPE_TECHNOLOGY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver Type Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DRIVER_TYPE_PROCESS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver Type Organizational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DRIVER_TYPE_ORGANIZATIONAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distance Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DISTANCE_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distance Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DISTANCE_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Drives MIs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DRIVES_MIS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.BOSuperTypes <em>BO Super Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.BOSuperTypes
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOSuperTypes()
	 * @generated
	 */
	int BO_SUPER_TYPES = 13;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.LifecycleStage <em>Lifecycle Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.LifecycleStage
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getLifecycleStage()
	 * @generated
	 */
	int LIFECYCLE_STAGE = 14;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.HighLow <em>High Low</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getHighLow()
	 * @generated
	 */
	int HIGH_LOW = 15;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.MIType <em>MI Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.MIType
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getMIType()
	 * @generated
	 */
	int MI_TYPE = 16;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.UnsettableBoolean <em>Unsettable Boolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getUnsettableBoolean()
	 * @generated
	 */
	int UNSETTABLE_BOOLEAN = 17;

	/**
	 * The meta object id for the '{@link se.gu.cse.idxse.bomi.DistanceType <em>Distance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.gu.cse.idxse.bomi.DistanceType
	 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getDistanceType()
	 * @generated
	 */
	int DISTANCE_TYPE = 18;

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.BoundaryObject <em>Boundary Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Object</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject
	 * @generated
	 */
	EClass getBoundaryObject();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Type</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getSuperType()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getLevelOfDetail <em>Level Of Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Of Detail</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getLevelOfDetail()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_LevelOfDetail();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getFrequencyOfChange <em>Frequency Of Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Of Change</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getFrequencyOfChange()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_FrequencyOfChange();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getModularity <em>Modularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modularity</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getModularity()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_Modularity();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getMaintainability <em>Maintainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainability</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getMaintainability()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_Maintainability();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getPrescriptive <em>Prescriptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prescriptive</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getPrescriptive()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_Prescriptive();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getLifecycleStage <em>Lifecycle Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle Stage</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getLifecycleStage()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_LifecycleStage();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getRepresentationFormat <em>Representation Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Format</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getRepresentationFormat()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_RepresentationFormat();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getTooling <em>Tooling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooling</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getTooling()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_Tooling();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getVersioning <em>Versioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versioning</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getVersioning()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_Versioning();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getUpToDate <em>Up To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Up To Date</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getUpToDate()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_UpToDate();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getInternalConsistency <em>Internal Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Consistency</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getInternalConsistency()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_InternalConsistency();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BoundaryObject#getExternalConsistency <em>External Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Consistency</em>'.
	 * @see se.gu.cse.idxse.bomi.BoundaryObject#getExternalConsistency()
	 * @see #getBoundaryObject()
	 * @generated
	 */
	EAttribute getBoundaryObject_ExternalConsistency();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see se.gu.cse.idxse.bomi.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link se.gu.cse.idxse.bomi.Role#getPartOfGovernanceTeams <em>Part Of Governance Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part Of Governance Teams</em>'.
	 * @see se.gu.cse.idxse.bomi.Role#getPartOfGovernanceTeams()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_PartOfGovernanceTeams();

	/**
	 * Returns the meta object for the reference list '{@link se.gu.cse.idxse.bomi.Role#getPartOfMIs <em>Part Of MIs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part Of MIs</em>'.
	 * @see se.gu.cse.idxse.bomi.Role#getPartOfMIs()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_PartOfMIs();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see se.gu.cse.idxse.bomi.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.gu.cse.idxse.bomi.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.BORoleInteraction <em>BO Role Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BO Role Interaction</em>'.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction
	 * @generated
	 */
	EClass getBORoleInteraction();

	/**
	 * Returns the meta object for the reference list '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction#getRoles()
	 * @see #getBORoleInteraction()
	 * @generated
	 */
	EReference getBORoleInteraction_Roles();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible</em>'.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction#getResponsible()
	 * @see #getBORoleInteraction()
	 * @generated
	 */
	EAttribute getBORoleInteraction_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getCreates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creates</em>'.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction#getCreates()
	 * @see #getBORoleInteraction()
	 * @generated
	 */
	EAttribute getBORoleInteraction_Creates();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getReads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reads</em>'.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction#getReads()
	 * @see #getBORoleInteraction()
	 * @generated
	 */
	EAttribute getBORoleInteraction_Reads();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updates</em>'.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction#getUpdates()
	 * @see #getBORoleInteraction()
	 * @generated
	 */
	EAttribute getBORoleInteraction_Updates();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BORoleInteraction#getDeletes <em>Deletes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deletes</em>'.
	 * @see se.gu.cse.idxse.bomi.BORoleInteraction#getDeletes()
	 * @see #getBORoleInteraction()
	 * @generated
	 */
	EAttribute getBORoleInteraction_Deletes();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.BOMIModel <em>BOMI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOMI Model</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel
	 * @generated
	 */
	EClass getBOMIModel();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getBoRoleInteractions <em>Bo Role Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bo Role Interactions</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getBoRoleInteractions()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_BoRoleInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getBoundaryObjects <em>Boundary Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boundary Objects</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getBoundaryObjects()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_BoundaryObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getRoles()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getBoMiCoordinations <em>Bo Mi Coordinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bo Mi Coordinations</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getBoMiCoordinations()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_BoMiCoordinations();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getMethodologicalIslands <em>Methodological Islands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodological Islands</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getMethodologicalIslands()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_MethodologicalIslands();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getGovernanceTeams <em>Governance Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Governance Teams</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getGovernanceTeams()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_GovernanceTeams();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getBoTeamGovernances <em>Bo Team Governances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bo Team Governances</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getBoTeamGovernances()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_BoTeamGovernances();

	/**
	 * Returns the meta object for the containment reference list '{@link se.gu.cse.idxse.bomi.BOMIModel#getDrivers <em>Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drivers</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMIModel#getDrivers()
	 * @see #getBOMIModel()
	 * @generated
	 */
	EReference getBOMIModel_Drivers();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.MethodologicalIsland <em>Methodological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methodological Island</em>'.
	 * @see se.gu.cse.idxse.bomi.MethodologicalIsland
	 * @generated
	 */
	EClass getMethodologicalIsland();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.MethodologicalIsland#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.gu.cse.idxse.bomi.MethodologicalIsland#getType()
	 * @see #getMethodologicalIsland()
	 * @generated
	 */
	EAttribute getMethodologicalIsland_Type();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.UsageAssociation <em>Usage Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Association</em>'.
	 * @see se.gu.cse.idxse.bomi.UsageAssociation
	 * @generated
	 */
	EClass getUsageAssociation();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.UsageAssociation#getAccessability <em>Accessability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessability</em>'.
	 * @see se.gu.cse.idxse.bomi.UsageAssociation#getAccessability()
	 * @see #getUsageAssociation()
	 * @generated
	 */
	EAttribute getUsageAssociation_Accessability();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.UsageAssociation#getStability <em>Stability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stability</em>'.
	 * @see se.gu.cse.idxse.bomi.UsageAssociation#getStability()
	 * @see #getUsageAssociation()
	 * @generated
	 */
	EAttribute getUsageAssociation_Stability();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.UsageAssociation#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see se.gu.cse.idxse.bomi.UsageAssociation#getCriticality()
	 * @see #getUsageAssociation()
	 * @generated
	 */
	EAttribute getUsageAssociation_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.UsageAssociation#getFitForPurpose <em>Fit For Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fit For Purpose</em>'.
	 * @see se.gu.cse.idxse.bomi.UsageAssociation#getFitForPurpose()
	 * @see #getUsageAssociation()
	 * @generated
	 */
	EAttribute getUsageAssociation_FitForPurpose();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.BOMICoordination <em>BOMI Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOMI Coordination</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMICoordination
	 * @generated
	 */
	EClass getBOMICoordination();

	/**
	 * Returns the meta object for the reference list '{@link se.gu.cse.idxse.bomi.BOMICoordination#getMethodologicalIslands <em>Methodological Islands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methodological Islands</em>'.
	 * @see se.gu.cse.idxse.bomi.BOMICoordination#getMethodologicalIslands()
	 * @see #getBOMICoordination()
	 * @generated
	 */
	EReference getBOMICoordination_MethodologicalIslands();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.GovernanceTeam <em>Governance Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Governance Team</em>'.
	 * @see se.gu.cse.idxse.bomi.GovernanceTeam
	 * @generated
	 */
	EClass getGovernanceTeam();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.BOTeamGovernance <em>BO Team Governance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BO Team Governance</em>'.
	 * @see se.gu.cse.idxse.bomi.BOTeamGovernance
	 * @generated
	 */
	EClass getBOTeamGovernance();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getCoordinationMechanism <em>Coordination Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordination Mechanism</em>'.
	 * @see se.gu.cse.idxse.bomi.BOTeamGovernance#getCoordinationMechanism()
	 * @see #getBOTeamGovernance()
	 * @generated
	 */
	EAttribute getBOTeamGovernance_CoordinationMechanism();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getFrequencyOfCoordination <em>Frequency Of Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Of Coordination</em>'.
	 * @see se.gu.cse.idxse.bomi.BOTeamGovernance#getFrequencyOfCoordination()
	 * @see #getBOTeamGovernance()
	 * @generated
	 */
	EAttribute getBOTeamGovernance_FrequencyOfCoordination();

	/**
	 * Returns the meta object for the reference list '{@link se.gu.cse.idxse.bomi.BOTeamGovernance#getGovernanceTeams <em>Governance Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governance Teams</em>'.
	 * @see se.gu.cse.idxse.bomi.BOTeamGovernance#getGovernanceTeams()
	 * @see #getBOTeamGovernance()
	 * @generated
	 */
	EReference getBOTeamGovernance_GovernanceTeams();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see se.gu.cse.idxse.bomi.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link se.gu.cse.idxse.bomi.Association#getBoundaryObjects <em>Boundary Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boundary Objects</em>'.
	 * @see se.gu.cse.idxse.bomi.Association#getBoundaryObjects()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_BoundaryObjects();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see se.gu.cse.idxse.bomi.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeTechnology <em>Driver Type Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Type Technology</em>'.
	 * @see se.gu.cse.idxse.bomi.Driver#getDriverTypeTechnology()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_DriverTypeTechnology();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeProcess <em>Driver Type Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Type Process</em>'.
	 * @see se.gu.cse.idxse.bomi.Driver#getDriverTypeProcess()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_DriverTypeProcess();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.Driver#getDriverTypeOrganizational <em>Driver Type Organizational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Type Organizational</em>'.
	 * @see se.gu.cse.idxse.bomi.Driver#getDriverTypeOrganizational()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_DriverTypeOrganizational();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.Driver#getDistanceSize <em>Distance Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Size</em>'.
	 * @see se.gu.cse.idxse.bomi.Driver#getDistanceSize()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_DistanceSize();

	/**
	 * Returns the meta object for the reference list '{@link se.gu.cse.idxse.bomi.Driver#getDrivesMIs <em>Drives MIs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Drives MIs</em>'.
	 * @see se.gu.cse.idxse.bomi.Driver#getDrivesMIs()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_DrivesMIs();

	/**
	 * Returns the meta object for the attribute list '{@link se.gu.cse.idxse.bomi.Driver#getDistanceTypes <em>Distance Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Distance Types</em>'.
	 * @see se.gu.cse.idxse.bomi.Driver#getDistanceTypes()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_DistanceTypes();

	/**
	 * Returns the meta object for class '{@link se.gu.cse.idxse.bomi.PurposedElement <em>Purposed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purposed Element</em>'.
	 * @see se.gu.cse.idxse.bomi.PurposedElement
	 * @generated
	 */
	EClass getPurposedElement();

	/**
	 * Returns the meta object for the attribute '{@link se.gu.cse.idxse.bomi.PurposedElement#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see se.gu.cse.idxse.bomi.PurposedElement#getPurpose()
	 * @see #getPurposedElement()
	 * @generated
	 */
	EAttribute getPurposedElement_Purpose();

	/**
	 * Returns the meta object for enum '{@link se.gu.cse.idxse.bomi.BOSuperTypes <em>BO Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BO Super Types</em>'.
	 * @see se.gu.cse.idxse.bomi.BOSuperTypes
	 * @generated
	 */
	EEnum getBOSuperTypes();

	/**
	 * Returns the meta object for enum '{@link se.gu.cse.idxse.bomi.LifecycleStage <em>Lifecycle Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle Stage</em>'.
	 * @see se.gu.cse.idxse.bomi.LifecycleStage
	 * @generated
	 */
	EEnum getLifecycleStage();

	/**
	 * Returns the meta object for enum '{@link se.gu.cse.idxse.bomi.HighLow <em>High Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>High Low</em>'.
	 * @see se.gu.cse.idxse.bomi.HighLow
	 * @generated
	 */
	EEnum getHighLow();

	/**
	 * Returns the meta object for enum '{@link se.gu.cse.idxse.bomi.MIType <em>MI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MI Type</em>'.
	 * @see se.gu.cse.idxse.bomi.MIType
	 * @generated
	 */
	EEnum getMIType();

	/**
	 * Returns the meta object for enum '{@link se.gu.cse.idxse.bomi.UnsettableBoolean <em>Unsettable Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unsettable Boolean</em>'.
	 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
	 * @generated
	 */
	EEnum getUnsettableBoolean();

	/**
	 * Returns the meta object for enum '{@link se.gu.cse.idxse.bomi.DistanceType <em>Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance Type</em>'.
	 * @see se.gu.cse.idxse.bomi.DistanceType
	 * @generated
	 */
	EEnum getDistanceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BomiFactory getBomiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl <em>Boundary Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBoundaryObject()
		 * @generated
		 */
		EClass BOUNDARY_OBJECT = eINSTANCE.getBoundaryObject();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__SUPER_TYPE = eINSTANCE.getBoundaryObject_SuperType();

		/**
		 * The meta object literal for the '<em><b>Level Of Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__LEVEL_OF_DETAIL = eINSTANCE.getBoundaryObject_LevelOfDetail();

		/**
		 * The meta object literal for the '<em><b>Frequency Of Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE = eINSTANCE.getBoundaryObject_FrequencyOfChange();

		/**
		 * The meta object literal for the '<em><b>Modularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__MODULARITY = eINSTANCE.getBoundaryObject_Modularity();

		/**
		 * The meta object literal for the '<em><b>Maintainability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__MAINTAINABILITY = eINSTANCE.getBoundaryObject_Maintainability();

		/**
		 * The meta object literal for the '<em><b>Prescriptive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__PRESCRIPTIVE = eINSTANCE.getBoundaryObject_Prescriptive();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__LIFECYCLE_STAGE = eINSTANCE.getBoundaryObject_LifecycleStage();

		/**
		 * The meta object literal for the '<em><b>Representation Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__REPRESENTATION_FORMAT = eINSTANCE.getBoundaryObject_RepresentationFormat();

		/**
		 * The meta object literal for the '<em><b>Tooling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__TOOLING = eINSTANCE.getBoundaryObject_Tooling();

		/**
		 * The meta object literal for the '<em><b>Versioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__VERSIONING = eINSTANCE.getBoundaryObject_Versioning();

		/**
		 * The meta object literal for the '<em><b>Up To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__UP_TO_DATE = eINSTANCE.getBoundaryObject_UpToDate();

		/**
		 * The meta object literal for the '<em><b>Internal Consistency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__INTERNAL_CONSISTENCY = eINSTANCE.getBoundaryObject_InternalConsistency();

		/**
		 * The meta object literal for the '<em><b>External Consistency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY = eINSTANCE.getBoundaryObject_ExternalConsistency();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.RoleImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Part Of Governance Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PART_OF_GOVERNANCE_TEAMS = eINSTANCE.getRole_PartOfGovernanceTeams();

		/**
		 * The meta object literal for the '<em><b>Part Of MIs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PART_OF_MIS = eINSTANCE.getRole_PartOfMIs();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.NamedElementImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl <em>BO Role Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.BORoleInteractionImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBORoleInteraction()
		 * @generated
		 */
		EClass BO_ROLE_INTERACTION = eINSTANCE.getBORoleInteraction();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_ROLE_INTERACTION__ROLES = eINSTANCE.getBORoleInteraction_Roles();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BO_ROLE_INTERACTION__RESPONSIBLE = eINSTANCE.getBORoleInteraction_Responsible();

		/**
		 * The meta object literal for the '<em><b>Creates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BO_ROLE_INTERACTION__CREATES = eINSTANCE.getBORoleInteraction_Creates();

		/**
		 * The meta object literal for the '<em><b>Reads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BO_ROLE_INTERACTION__READS = eINSTANCE.getBORoleInteraction_Reads();

		/**
		 * The meta object literal for the '<em><b>Updates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BO_ROLE_INTERACTION__UPDATES = eINSTANCE.getBORoleInteraction_Updates();

		/**
		 * The meta object literal for the '<em><b>Deletes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BO_ROLE_INTERACTION__DELETES = eINSTANCE.getBORoleInteraction_Deletes();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.BOMIModelImpl <em>BOMI Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.BOMIModelImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOMIModel()
		 * @generated
		 */
		EClass BOMI_MODEL = eINSTANCE.getBOMIModel();

		/**
		 * The meta object literal for the '<em><b>Bo Role Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__BO_ROLE_INTERACTIONS = eINSTANCE.getBOMIModel_BoRoleInteractions();

		/**
		 * The meta object literal for the '<em><b>Boundary Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__BOUNDARY_OBJECTS = eINSTANCE.getBOMIModel_BoundaryObjects();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__ROLES = eINSTANCE.getBOMIModel_Roles();

		/**
		 * The meta object literal for the '<em><b>Bo Mi Coordinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__BO_MI_COORDINATIONS = eINSTANCE.getBOMIModel_BoMiCoordinations();

		/**
		 * The meta object literal for the '<em><b>Methodological Islands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__METHODOLOGICAL_ISLANDS = eINSTANCE.getBOMIModel_MethodologicalIslands();

		/**
		 * The meta object literal for the '<em><b>Governance Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__GOVERNANCE_TEAMS = eINSTANCE.getBOMIModel_GovernanceTeams();

		/**
		 * The meta object literal for the '<em><b>Bo Team Governances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__BO_TEAM_GOVERNANCES = eINSTANCE.getBOMIModel_BoTeamGovernances();

		/**
		 * The meta object literal for the '<em><b>Drivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_MODEL__DRIVERS = eINSTANCE.getBOMIModel_Drivers();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.MethodologicalIslandImpl <em>Methodological Island</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.MethodologicalIslandImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getMethodologicalIsland()
		 * @generated
		 */
		EClass METHODOLOGICAL_ISLAND = eINSTANCE.getMethodologicalIsland();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODOLOGICAL_ISLAND__TYPE = eINSTANCE.getMethodologicalIsland_Type();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.UsageAssociationImpl <em>Usage Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.UsageAssociationImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getUsageAssociation()
		 * @generated
		 */
		EClass USAGE_ASSOCIATION = eINSTANCE.getUsageAssociation();

		/**
		 * The meta object literal for the '<em><b>Accessability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_ASSOCIATION__ACCESSABILITY = eINSTANCE.getUsageAssociation_Accessability();

		/**
		 * The meta object literal for the '<em><b>Stability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_ASSOCIATION__STABILITY = eINSTANCE.getUsageAssociation_Stability();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_ASSOCIATION__CRITICALITY = eINSTANCE.getUsageAssociation_Criticality();

		/**
		 * The meta object literal for the '<em><b>Fit For Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_ASSOCIATION__FIT_FOR_PURPOSE = eINSTANCE.getUsageAssociation_FitForPurpose();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.BOMICoordinationImpl <em>BOMI Coordination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.BOMICoordinationImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOMICoordination()
		 * @generated
		 */
		EClass BOMI_COORDINATION = eINSTANCE.getBOMICoordination();

		/**
		 * The meta object literal for the '<em><b>Methodological Islands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOMI_COORDINATION__METHODOLOGICAL_ISLANDS = eINSTANCE.getBOMICoordination_MethodologicalIslands();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.GovernanceTeamImpl <em>Governance Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.GovernanceTeamImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getGovernanceTeam()
		 * @generated
		 */
		EClass GOVERNANCE_TEAM = eINSTANCE.getGovernanceTeam();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.BOTeamGovernanceImpl <em>BO Team Governance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.BOTeamGovernanceImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOTeamGovernance()
		 * @generated
		 */
		EClass BO_TEAM_GOVERNANCE = eINSTANCE.getBOTeamGovernance();

		/**
		 * The meta object literal for the '<em><b>Coordination Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BO_TEAM_GOVERNANCE__COORDINATION_MECHANISM = eINSTANCE.getBOTeamGovernance_CoordinationMechanism();

		/**
		 * The meta object literal for the '<em><b>Frequency Of Coordination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BO_TEAM_GOVERNANCE__FREQUENCY_OF_COORDINATION = eINSTANCE.getBOTeamGovernance_FrequencyOfCoordination();

		/**
		 * The meta object literal for the '<em><b>Governance Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_TEAM_GOVERNANCE__GOVERNANCE_TEAMS = eINSTANCE.getBOTeamGovernance_GovernanceTeams();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.AssociationImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Boundary Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__BOUNDARY_OBJECTS = eINSTANCE.getAssociation_BoundaryObjects();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.DriverImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Driver Type Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__DRIVER_TYPE_TECHNOLOGY = eINSTANCE.getDriver_DriverTypeTechnology();

		/**
		 * The meta object literal for the '<em><b>Driver Type Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__DRIVER_TYPE_PROCESS = eINSTANCE.getDriver_DriverTypeProcess();

		/**
		 * The meta object literal for the '<em><b>Driver Type Organizational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__DRIVER_TYPE_ORGANIZATIONAL = eINSTANCE.getDriver_DriverTypeOrganizational();

		/**
		 * The meta object literal for the '<em><b>Distance Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__DISTANCE_SIZE = eINSTANCE.getDriver_DistanceSize();

		/**
		 * The meta object literal for the '<em><b>Drives MIs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__DRIVES_MIS = eINSTANCE.getDriver_DrivesMIs();

		/**
		 * The meta object literal for the '<em><b>Distance Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__DISTANCE_TYPES = eINSTANCE.getDriver_DistanceTypes();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.impl.PurposedElementImpl <em>Purposed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.impl.PurposedElementImpl
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getPurposedElement()
		 * @generated
		 */
		EClass PURPOSED_ELEMENT = eINSTANCE.getPurposedElement();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSED_ELEMENT__PURPOSE = eINSTANCE.getPurposedElement_Purpose();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.BOSuperTypes <em>BO Super Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.BOSuperTypes
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getBOSuperTypes()
		 * @generated
		 */
		EEnum BO_SUPER_TYPES = eINSTANCE.getBOSuperTypes();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.LifecycleStage <em>Lifecycle Stage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.LifecycleStage
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getLifecycleStage()
		 * @generated
		 */
		EEnum LIFECYCLE_STAGE = eINSTANCE.getLifecycleStage();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.HighLow <em>High Low</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.HighLow
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getHighLow()
		 * @generated
		 */
		EEnum HIGH_LOW = eINSTANCE.getHighLow();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.MIType <em>MI Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.MIType
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getMIType()
		 * @generated
		 */
		EEnum MI_TYPE = eINSTANCE.getMIType();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.UnsettableBoolean <em>Unsettable Boolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.UnsettableBoolean
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getUnsettableBoolean()
		 * @generated
		 */
		EEnum UNSETTABLE_BOOLEAN = eINSTANCE.getUnsettableBoolean();

		/**
		 * The meta object literal for the '{@link se.gu.cse.idxse.bomi.DistanceType <em>Distance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.gu.cse.idxse.bomi.DistanceType
		 * @see se.gu.cse.idxse.bomi.impl.BomiPackageImpl#getDistanceType()
		 * @generated
		 */
		EEnum DISTANCE_TYPE = eINSTANCE.getDistanceType();

	}

} //BomiPackage
