/*
 * generated by Xtext 2.28.0
 */
package se.gu.cse.idxse.bomi.text.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import se.gu.cse.idxse.bomi.BOMICoordination;
import se.gu.cse.idxse.bomi.BOMIModel;
import se.gu.cse.idxse.bomi.BORoleInteraction;
import se.gu.cse.idxse.bomi.BOTeamGovernance;
import se.gu.cse.idxse.bomi.BomiPackage;
import se.gu.cse.idxse.bomi.BoundaryObject;
import se.gu.cse.idxse.bomi.Driver;
import se.gu.cse.idxse.bomi.GovernanceTeam;
import se.gu.cse.idxse.bomi.MethodologicalIsland;
import se.gu.cse.idxse.bomi.Role;
import se.gu.cse.idxse.bomi.text.services.BomiGrammarAccess;

@SuppressWarnings("all")
public class BomiSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BomiGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BomiPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BomiPackage.BOMI_COORDINATION:
				sequence_BOMICoordination(context, (BOMICoordination) semanticObject); 
				return; 
			case BomiPackage.BOMI_MODEL:
				sequence_BOMIModel(context, (BOMIModel) semanticObject); 
				return; 
			case BomiPackage.BO_ROLE_INTERACTION:
				sequence_BORoleInteraction(context, (BORoleInteraction) semanticObject); 
				return; 
			case BomiPackage.BO_TEAM_GOVERNANCE:
				sequence_BOTeamGovernance(context, (BOTeamGovernance) semanticObject); 
				return; 
			case BomiPackage.BOUNDARY_OBJECT:
				sequence_BoundaryObject(context, (BoundaryObject) semanticObject); 
				return; 
			case BomiPackage.DRIVER:
				sequence_Driver(context, (Driver) semanticObject); 
				return; 
			case BomiPackage.GOVERNANCE_TEAM:
				sequence_GovernanceTeam(context, (GovernanceTeam) semanticObject); 
				return; 
			case BomiPackage.METHODOLOGICAL_ISLAND:
				sequence_MethodologicalIsland(context, (MethodologicalIsland) semanticObject); 
				return; 
			case BomiPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     BOMICoordination returns BOMICoordination
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         purpose=EString? 
	 *         accessability=HighLow? 
	 *         stability=HighLow? 
	 *         criticality=HighLow? 
	 *         fitForPurpose=HighLow? 
	 *         (boundaryObjects+=[BoundaryObject|EString] boundaryObjects+=[BoundaryObject|EString]*)? 
	 *         (methodologicalIslands+=[MethodologicalIsland|EString] methodologicalIslands+=[MethodologicalIsland|EString]*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_BOMICoordination(ISerializationContext context, BOMICoordination semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BOMIModel returns BOMIModel
	 *
	 * Constraint:
	 *     (
	 *         (boundaryObjects+=BoundaryObject boundaryObjects+=BoundaryObject*)? 
	 *         (methodologicalIslands+=MethodologicalIsland methodologicalIslands+=MethodologicalIsland*)? 
	 *         (governanceTeams+=GovernanceTeam governanceTeams+=GovernanceTeam*)? 
	 *         (roles+=Role roles+=Role*)? 
	 *         (drivers+=Driver drivers+=Driver*)? 
	 *         (boMiCoordinations+=BOMICoordination boMiCoordinations+=BOMICoordination*)? 
	 *         (boRoleInteractions+=BORoleInteraction boRoleInteractions+=BORoleInteraction*)? 
	 *         (boTeamGovernances+=BOTeamGovernance boTeamGovernances+=BOTeamGovernance*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_BOMIModel(ISerializationContext context, BOMIModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BORoleInteraction returns BORoleInteraction
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         purpose=EString? 
	 *         accessability=HighLow? 
	 *         stability=HighLow? 
	 *         criticality=HighLow? 
	 *         fitForPurpose=HighLow? 
	 *         (boundaryObjects+=[BoundaryObject|EString] boundaryObjects+=[BoundaryObject|EString]*)? 
	 *         (roles+=[Role|EString] roles+=[Role|EString]*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_BORoleInteraction(ISerializationContext context, BORoleInteraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BOTeamGovernance returns BOTeamGovernance
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         purpose=EString? 
	 *         coordinationMechanism=EString? 
	 *         frequencyOfCoordination=HighLow? 
	 *         (governanceTeams+=[GovernanceTeam|EString] governanceTeams+=[GovernanceTeam|EString]*)? 
	 *         (boundaryObjects+=[BoundaryObject|EString] boundaryObjects+=[BoundaryObject|EString]*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_BOTeamGovernance(ISerializationContext context, BOTeamGovernance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BoundaryObject returns BoundaryObject
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         superType=BOSuperTypes? 
	 *         purpose=EString? 
	 *         levelOfDetail=HighLow? 
	 *         frequencyOfChange=HighLow? 
	 *         modularity=HighLow? 
	 *         maintainability=HighLow? 
	 *         prescriptive=HighLow? 
	 *         lifecycleStage=LifecycleStage? 
	 *         representationFormat=EString? 
	 *         tooling=EString? 
	 *         versioning=EString? 
	 *         upToDate=EString? 
	 *         internalConsistency=HighLow? 
	 *         externalConsistency=HighLow?
	 *     )
	 * </pre>
	 */
	protected void sequence_BoundaryObject(ISerializationContext context, BoundaryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Driver returns Driver
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         driverType=DriverTypes? 
	 *         distanceType=DistanceTypes? 
	 *         distanceSize=HighLow? 
	 *         (drivesMIs+=[MethodologicalIsland|EString] drivesMIs+=[MethodologicalIsland|EString]*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Driver(ISerializationContext context, Driver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GovernanceTeam returns GovernanceTeam
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_GovernanceTeam(ISerializationContext context, GovernanceTeam semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BomiPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BomiPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGovernanceTeamAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MethodologicalIsland returns MethodologicalIsland
	 *
	 * Constraint:
	 *     (name=EString type=MIType?)
	 * </pre>
	 */
	protected void sequence_MethodologicalIsland(ISerializationContext context, MethodologicalIsland semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (partOfGovernanceTeams+=[GovernanceTeam|EString] partOfGovernanceTeams+=[GovernanceTeam|EString]*)? 
	 *         (partOfMIs+=[MethodologicalIsland|EString] partOfMIs+=[MethodologicalIsland|EString]*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
