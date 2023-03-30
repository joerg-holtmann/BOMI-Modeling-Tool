/**
 */
package se.gu.cse.idxse.bomi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.gu.cse.idxse.bomi.BOSuperTypes;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.BoundaryObject;
import se.gu.cse.idxse.bomi.HighLow;
import se.gu.cse.idxse.bomi.LifecycleStage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getLevelOfDetail <em>Level Of Detail</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getFrequencyOfChange <em>Frequency Of Change</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getModularity <em>Modularity</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getMaintainability <em>Maintainability</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getPrescriptive <em>Prescriptive</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getLifecycleStage <em>Lifecycle Stage</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getRepresentationFormat <em>Representation Format</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getTooling <em>Tooling</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getUpToDate <em>Up To Date</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getInternalConsistency <em>Internal Consistency</em>}</li>
 *   <li>{@link se.gu.cse.idxse.bomi.impl.BoundaryObjectImpl#getExternalConsistency <em>External Consistency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundaryObjectImpl extends PurposedElementImpl implements BoundaryObject {
	/**
	 * The default value of the '{@link #getSuperType() <em>Super Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected static final BOSuperTypes SUPER_TYPE_EDEFAULT = BOSuperTypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected BOSuperTypes superType = SUPER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelOfDetail() <em>Level Of Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfDetail()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow LEVEL_OF_DETAIL_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getLevelOfDetail() <em>Level Of Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfDetail()
	 * @generated
	 * @ordered
	 */
	protected HighLow levelOfDetail = LEVEL_OF_DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequencyOfChange() <em>Frequency Of Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyOfChange()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow FREQUENCY_OF_CHANGE_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getFrequencyOfChange() <em>Frequency Of Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyOfChange()
	 * @generated
	 * @ordered
	 */
	protected HighLow frequencyOfChange = FREQUENCY_OF_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModularity() <em>Modularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModularity()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow MODULARITY_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getModularity() <em>Modularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModularity()
	 * @generated
	 * @ordered
	 */
	protected HighLow modularity = MODULARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintainability() <em>Maintainability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainability()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow MAINTAINABILITY_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getMaintainability() <em>Maintainability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainability()
	 * @generated
	 * @ordered
	 */
	protected HighLow maintainability = MAINTAINABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrescriptive() <em>Prescriptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptive()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow PRESCRIPTIVE_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getPrescriptive() <em>Prescriptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptive()
	 * @generated
	 * @ordered
	 */
	protected HighLow prescriptive = PRESCRIPTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifecycleStage() <em>Lifecycle Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStage()
	 * @generated
	 * @ordered
	 */
	protected static final LifecycleStage LIFECYCLE_STAGE_EDEFAULT = LifecycleStage.NOT_SET;

	/**
	 * The cached value of the '{@link #getLifecycleStage() <em>Lifecycle Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStage()
	 * @generated
	 * @ordered
	 */
	protected LifecycleStage lifecycleStage = LIFECYCLE_STAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationFormat() <em>Representation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationFormat() <em>Representation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationFormat()
	 * @generated
	 * @ordered
	 */
	protected String representationFormat = REPRESENTATION_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTooling() <em>Tooling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooling()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooling() <em>Tooling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooling()
	 * @generated
	 * @ordered
	 */
	protected String tooling = TOOLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersioning() <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected String versioning = VERSIONING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpToDate() <em>Up To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpToDate()
	 * @generated
	 * @ordered
	 */
	protected static final String UP_TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpToDate() <em>Up To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpToDate()
	 * @generated
	 * @ordered
	 */
	protected String upToDate = UP_TO_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalConsistency() <em>Internal Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConsistency()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow INTERNAL_CONSISTENCY_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getInternalConsistency() <em>Internal Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConsistency()
	 * @generated
	 * @ordered
	 */
	protected HighLow internalConsistency = INTERNAL_CONSISTENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalConsistency() <em>External Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalConsistency()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow EXTERNAL_CONSISTENCY_EDEFAULT = HighLow.NOT_SET;

	/**
	 * The cached value of the '{@link #getExternalConsistency() <em>External Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalConsistency()
	 * @generated
	 * @ordered
	 */
	protected HighLow externalConsistency = EXTERNAL_CONSISTENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomiPackage.Literals.BOUNDARY_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOSuperTypes getSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(BOSuperTypes newSuperType) {
		BOSuperTypes oldSuperType = superType;
		superType = newSuperType == null ? SUPER_TYPE_EDEFAULT : newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getLevelOfDetail() {
		return levelOfDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOfDetail(HighLow newLevelOfDetail) {
		HighLow oldLevelOfDetail = levelOfDetail;
		levelOfDetail = newLevelOfDetail == null ? LEVEL_OF_DETAIL_EDEFAULT : newLevelOfDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__LEVEL_OF_DETAIL, oldLevelOfDetail, levelOfDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getFrequencyOfChange() {
		return frequencyOfChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyOfChange(HighLow newFrequencyOfChange) {
		HighLow oldFrequencyOfChange = frequencyOfChange;
		frequencyOfChange = newFrequencyOfChange == null ? FREQUENCY_OF_CHANGE_EDEFAULT : newFrequencyOfChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE, oldFrequencyOfChange, frequencyOfChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getModularity() {
		return modularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModularity(HighLow newModularity) {
		HighLow oldModularity = modularity;
		modularity = newModularity == null ? MODULARITY_EDEFAULT : newModularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__MODULARITY, oldModularity, modularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getMaintainability() {
		return maintainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainability(HighLow newMaintainability) {
		HighLow oldMaintainability = maintainability;
		maintainability = newMaintainability == null ? MAINTAINABILITY_EDEFAULT : newMaintainability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__MAINTAINABILITY, oldMaintainability, maintainability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getPrescriptive() {
		return prescriptive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptive(HighLow newPrescriptive) {
		HighLow oldPrescriptive = prescriptive;
		prescriptive = newPrescriptive == null ? PRESCRIPTIVE_EDEFAULT : newPrescriptive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__PRESCRIPTIVE, oldPrescriptive, prescriptive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleStage getLifecycleStage() {
		return lifecycleStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycleStage(LifecycleStage newLifecycleStage) {
		LifecycleStage oldLifecycleStage = lifecycleStage;
		lifecycleStage = newLifecycleStage == null ? LIFECYCLE_STAGE_EDEFAULT : newLifecycleStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__LIFECYCLE_STAGE, oldLifecycleStage, lifecycleStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationFormat() {
		return representationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationFormat(String newRepresentationFormat) {
		String oldRepresentationFormat = representationFormat;
		representationFormat = newRepresentationFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__REPRESENTATION_FORMAT, oldRepresentationFormat, representationFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooling() {
		return tooling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooling(String newTooling) {
		String oldTooling = tooling;
		tooling = newTooling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__TOOLING, oldTooling, tooling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioning(String newVersioning) {
		String oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__VERSIONING, oldVersioning, versioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpToDate() {
		return upToDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpToDate(String newUpToDate) {
		String oldUpToDate = upToDate;
		upToDate = newUpToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__UP_TO_DATE, oldUpToDate, upToDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getInternalConsistency() {
		return internalConsistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalConsistency(HighLow newInternalConsistency) {
		HighLow oldInternalConsistency = internalConsistency;
		internalConsistency = newInternalConsistency == null ? INTERNAL_CONSISTENCY_EDEFAULT : newInternalConsistency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__INTERNAL_CONSISTENCY, oldInternalConsistency, internalConsistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow getExternalConsistency() {
		return externalConsistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalConsistency(HighLow newExternalConsistency) {
		HighLow oldExternalConsistency = externalConsistency;
		externalConsistency = newExternalConsistency == null ? EXTERNAL_CONSISTENCY_EDEFAULT : newExternalConsistency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BomiPackage.BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY, oldExternalConsistency, externalConsistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BomiPackage.BOUNDARY_OBJECT__SUPER_TYPE:
				return getSuperType();
			case BomiPackage.BOUNDARY_OBJECT__LEVEL_OF_DETAIL:
				return getLevelOfDetail();
			case BomiPackage.BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE:
				return getFrequencyOfChange();
			case BomiPackage.BOUNDARY_OBJECT__MODULARITY:
				return getModularity();
			case BomiPackage.BOUNDARY_OBJECT__MAINTAINABILITY:
				return getMaintainability();
			case BomiPackage.BOUNDARY_OBJECT__PRESCRIPTIVE:
				return getPrescriptive();
			case BomiPackage.BOUNDARY_OBJECT__LIFECYCLE_STAGE:
				return getLifecycleStage();
			case BomiPackage.BOUNDARY_OBJECT__REPRESENTATION_FORMAT:
				return getRepresentationFormat();
			case BomiPackage.BOUNDARY_OBJECT__TOOLING:
				return getTooling();
			case BomiPackage.BOUNDARY_OBJECT__VERSIONING:
				return getVersioning();
			case BomiPackage.BOUNDARY_OBJECT__UP_TO_DATE:
				return getUpToDate();
			case BomiPackage.BOUNDARY_OBJECT__INTERNAL_CONSISTENCY:
				return getInternalConsistency();
			case BomiPackage.BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY:
				return getExternalConsistency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BomiPackage.BOUNDARY_OBJECT__SUPER_TYPE:
				setSuperType((BOSuperTypes)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__LEVEL_OF_DETAIL:
				setLevelOfDetail((HighLow)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE:
				setFrequencyOfChange((HighLow)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__MODULARITY:
				setModularity((HighLow)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__MAINTAINABILITY:
				setMaintainability((HighLow)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__PRESCRIPTIVE:
				setPrescriptive((HighLow)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__LIFECYCLE_STAGE:
				setLifecycleStage((LifecycleStage)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__REPRESENTATION_FORMAT:
				setRepresentationFormat((String)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__TOOLING:
				setTooling((String)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__VERSIONING:
				setVersioning((String)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__UP_TO_DATE:
				setUpToDate((String)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__INTERNAL_CONSISTENCY:
				setInternalConsistency((HighLow)newValue);
				return;
			case BomiPackage.BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY:
				setExternalConsistency((HighLow)newValue);
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
			case BomiPackage.BOUNDARY_OBJECT__SUPER_TYPE:
				setSuperType(SUPER_TYPE_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__LEVEL_OF_DETAIL:
				setLevelOfDetail(LEVEL_OF_DETAIL_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE:
				setFrequencyOfChange(FREQUENCY_OF_CHANGE_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__MODULARITY:
				setModularity(MODULARITY_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__MAINTAINABILITY:
				setMaintainability(MAINTAINABILITY_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__PRESCRIPTIVE:
				setPrescriptive(PRESCRIPTIVE_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__LIFECYCLE_STAGE:
				setLifecycleStage(LIFECYCLE_STAGE_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__REPRESENTATION_FORMAT:
				setRepresentationFormat(REPRESENTATION_FORMAT_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__TOOLING:
				setTooling(TOOLING_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__VERSIONING:
				setVersioning(VERSIONING_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__UP_TO_DATE:
				setUpToDate(UP_TO_DATE_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__INTERNAL_CONSISTENCY:
				setInternalConsistency(INTERNAL_CONSISTENCY_EDEFAULT);
				return;
			case BomiPackage.BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY:
				setExternalConsistency(EXTERNAL_CONSISTENCY_EDEFAULT);
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
			case BomiPackage.BOUNDARY_OBJECT__SUPER_TYPE:
				return superType != SUPER_TYPE_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__LEVEL_OF_DETAIL:
				return levelOfDetail != LEVEL_OF_DETAIL_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__FREQUENCY_OF_CHANGE:
				return frequencyOfChange != FREQUENCY_OF_CHANGE_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__MODULARITY:
				return modularity != MODULARITY_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__MAINTAINABILITY:
				return maintainability != MAINTAINABILITY_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__PRESCRIPTIVE:
				return prescriptive != PRESCRIPTIVE_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__LIFECYCLE_STAGE:
				return lifecycleStage != LIFECYCLE_STAGE_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__REPRESENTATION_FORMAT:
				return REPRESENTATION_FORMAT_EDEFAULT == null ? representationFormat != null : !REPRESENTATION_FORMAT_EDEFAULT.equals(representationFormat);
			case BomiPackage.BOUNDARY_OBJECT__TOOLING:
				return TOOLING_EDEFAULT == null ? tooling != null : !TOOLING_EDEFAULT.equals(tooling);
			case BomiPackage.BOUNDARY_OBJECT__VERSIONING:
				return VERSIONING_EDEFAULT == null ? versioning != null : !VERSIONING_EDEFAULT.equals(versioning);
			case BomiPackage.BOUNDARY_OBJECT__UP_TO_DATE:
				return UP_TO_DATE_EDEFAULT == null ? upToDate != null : !UP_TO_DATE_EDEFAULT.equals(upToDate);
			case BomiPackage.BOUNDARY_OBJECT__INTERNAL_CONSISTENCY:
				return internalConsistency != INTERNAL_CONSISTENCY_EDEFAULT;
			case BomiPackage.BOUNDARY_OBJECT__EXTERNAL_CONSISTENCY:
				return externalConsistency != EXTERNAL_CONSISTENCY_EDEFAULT;
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
		result.append(" (superType: ");
		result.append(superType);
		result.append(", levelOfDetail: ");
		result.append(levelOfDetail);
		result.append(", frequencyOfChange: ");
		result.append(frequencyOfChange);
		result.append(", modularity: ");
		result.append(modularity);
		result.append(", maintainability: ");
		result.append(maintainability);
		result.append(", prescriptive: ");
		result.append(prescriptive);
		result.append(", lifecycleStage: ");
		result.append(lifecycleStage);
		result.append(", representationFormat: ");
		result.append(representationFormat);
		result.append(", tooling: ");
		result.append(tooling);
		result.append(", versioning: ");
		result.append(versioning);
		result.append(", upToDate: ");
		result.append(upToDate);
		result.append(", internalConsistency: ");
		result.append(internalConsistency);
		result.append(", externalConsistency: ");
		result.append(externalConsistency);
		result.append(')');
		return result.toString();
	}

} //BoundaryObjectImpl
