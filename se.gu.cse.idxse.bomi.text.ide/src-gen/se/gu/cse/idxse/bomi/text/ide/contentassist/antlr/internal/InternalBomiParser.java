package se.gu.cse.idxse.bomi.text.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import se.gu.cse.idxse.bomi.text.services.BomiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBomiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NOT_SET'", "'High'", "'Medium'", "'Low'", "'True'", "'False'", "'Standard'", "'Technology'", "'Task'", "'Planning'", "'Value'", "'Product'", "'Other'", "'Operation'", "'Deprecate'", "'Retire'", "'Teams'", "'Silos'", "'Departments'", "'Organizations'", "'Process'", "'Organizational'", "'Cultural'", "'Geographical'", "'boundaryObjects'", "'{'", "'}'", "','", "'methodologicalIslands'", "'governanceTeams'", "'roles'", "'drivers'", "'BoundaryObject'", "'superType'", "'purpose'", "'levelOfDetail'", "'frequencyOfChange'", "'modularity'", "'maintainability'", "'prescriptive'", "'lifecycleStage'", "'representationFormat'", "'tooling'", "'versioning'", "'upToDate'", "'internalConsistency'", "'externalConsistency'", "'MethodologicalIsland'", "'type'", "'GovernanceTeam'", "'Role'", "'partOfGovernanceTeams'", "'('", "')'", "'partOfMIs'", "'Driver'", "'driverType'", "'distanceType'", "'distanceSize'", "'drivesMIs'", "'BOMICoordination'", "'accessability'", "'stability'", "'criticality'", "'fitForPurpose'", "'BORoleInteraction'", "'responsible'", "'creates'", "'reads'", "'updates'", "'deletes'", "'BOTeamGovernance'", "'coordinationMechanism'", "'frequencyOfCoordination'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBomiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBomiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBomiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBomi.g"; }


    	private BomiGrammarAccess grammarAccess;

    	public void setGrammarAccess(BomiGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBOMIModel"
    // InternalBomi.g:53:1: entryRuleBOMIModel : ruleBOMIModel EOF ;
    public final void entryRuleBOMIModel() throws RecognitionException {
        try {
            // InternalBomi.g:54:1: ( ruleBOMIModel EOF )
            // InternalBomi.g:55:1: ruleBOMIModel EOF
            {
             before(grammarAccess.getBOMIModelRule()); 
            pushFollow(FOLLOW_1);
            ruleBOMIModel();

            state._fsp--;

             after(grammarAccess.getBOMIModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOMIModel"


    // $ANTLR start "ruleBOMIModel"
    // InternalBomi.g:62:1: ruleBOMIModel : ( ( rule__BOMIModel__Group__0 ) ) ;
    public final void ruleBOMIModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:66:2: ( ( ( rule__BOMIModel__Group__0 ) ) )
            // InternalBomi.g:67:2: ( ( rule__BOMIModel__Group__0 ) )
            {
            // InternalBomi.g:67:2: ( ( rule__BOMIModel__Group__0 ) )
            // InternalBomi.g:68:3: ( rule__BOMIModel__Group__0 )
            {
             before(grammarAccess.getBOMIModelAccess().getGroup()); 
            // InternalBomi.g:69:3: ( rule__BOMIModel__Group__0 )
            // InternalBomi.g:69:4: rule__BOMIModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOMIModel"


    // $ANTLR start "entryRuleBoundaryObject"
    // InternalBomi.g:78:1: entryRuleBoundaryObject : ruleBoundaryObject EOF ;
    public final void entryRuleBoundaryObject() throws RecognitionException {
        try {
            // InternalBomi.g:79:1: ( ruleBoundaryObject EOF )
            // InternalBomi.g:80:1: ruleBoundaryObject EOF
            {
             before(grammarAccess.getBoundaryObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundaryObject();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundaryObject"


    // $ANTLR start "ruleBoundaryObject"
    // InternalBomi.g:87:1: ruleBoundaryObject : ( ( rule__BoundaryObject__Group__0 ) ) ;
    public final void ruleBoundaryObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:91:2: ( ( ( rule__BoundaryObject__Group__0 ) ) )
            // InternalBomi.g:92:2: ( ( rule__BoundaryObject__Group__0 ) )
            {
            // InternalBomi.g:92:2: ( ( rule__BoundaryObject__Group__0 ) )
            // InternalBomi.g:93:3: ( rule__BoundaryObject__Group__0 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup()); 
            // InternalBomi.g:94:3: ( rule__BoundaryObject__Group__0 )
            // InternalBomi.g:94:4: rule__BoundaryObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundaryObject"


    // $ANTLR start "entryRuleMethodologicalIsland"
    // InternalBomi.g:103:1: entryRuleMethodologicalIsland : ruleMethodologicalIsland EOF ;
    public final void entryRuleMethodologicalIsland() throws RecognitionException {
        try {
            // InternalBomi.g:104:1: ( ruleMethodologicalIsland EOF )
            // InternalBomi.g:105:1: ruleMethodologicalIsland EOF
            {
             before(grammarAccess.getMethodologicalIslandRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodologicalIsland();

            state._fsp--;

             after(grammarAccess.getMethodologicalIslandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodologicalIsland"


    // $ANTLR start "ruleMethodologicalIsland"
    // InternalBomi.g:112:1: ruleMethodologicalIsland : ( ( rule__MethodologicalIsland__Group__0 ) ) ;
    public final void ruleMethodologicalIsland() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:116:2: ( ( ( rule__MethodologicalIsland__Group__0 ) ) )
            // InternalBomi.g:117:2: ( ( rule__MethodologicalIsland__Group__0 ) )
            {
            // InternalBomi.g:117:2: ( ( rule__MethodologicalIsland__Group__0 ) )
            // InternalBomi.g:118:3: ( rule__MethodologicalIsland__Group__0 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getGroup()); 
            // InternalBomi.g:119:3: ( rule__MethodologicalIsland__Group__0 )
            // InternalBomi.g:119:4: rule__MethodologicalIsland__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodologicalIslandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodologicalIsland"


    // $ANTLR start "entryRuleGovernanceTeam"
    // InternalBomi.g:128:1: entryRuleGovernanceTeam : ruleGovernanceTeam EOF ;
    public final void entryRuleGovernanceTeam() throws RecognitionException {
        try {
            // InternalBomi.g:129:1: ( ruleGovernanceTeam EOF )
            // InternalBomi.g:130:1: ruleGovernanceTeam EOF
            {
             before(grammarAccess.getGovernanceTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleGovernanceTeam();

            state._fsp--;

             after(grammarAccess.getGovernanceTeamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGovernanceTeam"


    // $ANTLR start "ruleGovernanceTeam"
    // InternalBomi.g:137:1: ruleGovernanceTeam : ( ( rule__GovernanceTeam__Group__0 ) ) ;
    public final void ruleGovernanceTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:141:2: ( ( ( rule__GovernanceTeam__Group__0 ) ) )
            // InternalBomi.g:142:2: ( ( rule__GovernanceTeam__Group__0 ) )
            {
            // InternalBomi.g:142:2: ( ( rule__GovernanceTeam__Group__0 ) )
            // InternalBomi.g:143:3: ( rule__GovernanceTeam__Group__0 )
            {
             before(grammarAccess.getGovernanceTeamAccess().getGroup()); 
            // InternalBomi.g:144:3: ( rule__GovernanceTeam__Group__0 )
            // InternalBomi.g:144:4: rule__GovernanceTeam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GovernanceTeam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGovernanceTeamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGovernanceTeam"


    // $ANTLR start "entryRuleRole"
    // InternalBomi.g:153:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalBomi.g:154:1: ( ruleRole EOF )
            // InternalBomi.g:155:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalBomi.g:162:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:166:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalBomi.g:167:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalBomi.g:167:2: ( ( rule__Role__Group__0 ) )
            // InternalBomi.g:168:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalBomi.g:169:3: ( rule__Role__Group__0 )
            // InternalBomi.g:169:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleDriver"
    // InternalBomi.g:178:1: entryRuleDriver : ruleDriver EOF ;
    public final void entryRuleDriver() throws RecognitionException {
        try {
            // InternalBomi.g:179:1: ( ruleDriver EOF )
            // InternalBomi.g:180:1: ruleDriver EOF
            {
             before(grammarAccess.getDriverRule()); 
            pushFollow(FOLLOW_1);
            ruleDriver();

            state._fsp--;

             after(grammarAccess.getDriverRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDriver"


    // $ANTLR start "ruleDriver"
    // InternalBomi.g:187:1: ruleDriver : ( ( rule__Driver__Group__0 ) ) ;
    public final void ruleDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:191:2: ( ( ( rule__Driver__Group__0 ) ) )
            // InternalBomi.g:192:2: ( ( rule__Driver__Group__0 ) )
            {
            // InternalBomi.g:192:2: ( ( rule__Driver__Group__0 ) )
            // InternalBomi.g:193:3: ( rule__Driver__Group__0 )
            {
             before(grammarAccess.getDriverAccess().getGroup()); 
            // InternalBomi.g:194:3: ( rule__Driver__Group__0 )
            // InternalBomi.g:194:4: rule__Driver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDriver"


    // $ANTLR start "entryRuleBOMICoordination"
    // InternalBomi.g:203:1: entryRuleBOMICoordination : ruleBOMICoordination EOF ;
    public final void entryRuleBOMICoordination() throws RecognitionException {
        try {
            // InternalBomi.g:204:1: ( ruleBOMICoordination EOF )
            // InternalBomi.g:205:1: ruleBOMICoordination EOF
            {
             before(grammarAccess.getBOMICoordinationRule()); 
            pushFollow(FOLLOW_1);
            ruleBOMICoordination();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOMICoordination"


    // $ANTLR start "ruleBOMICoordination"
    // InternalBomi.g:212:1: ruleBOMICoordination : ( ( rule__BOMICoordination__Group__0 ) ) ;
    public final void ruleBOMICoordination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:216:2: ( ( ( rule__BOMICoordination__Group__0 ) ) )
            // InternalBomi.g:217:2: ( ( rule__BOMICoordination__Group__0 ) )
            {
            // InternalBomi.g:217:2: ( ( rule__BOMICoordination__Group__0 ) )
            // InternalBomi.g:218:3: ( rule__BOMICoordination__Group__0 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup()); 
            // InternalBomi.g:219:3: ( rule__BOMICoordination__Group__0 )
            // InternalBomi.g:219:4: rule__BOMICoordination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOMICoordination"


    // $ANTLR start "entryRuleBORoleInteraction"
    // InternalBomi.g:228:1: entryRuleBORoleInteraction : ruleBORoleInteraction EOF ;
    public final void entryRuleBORoleInteraction() throws RecognitionException {
        try {
            // InternalBomi.g:229:1: ( ruleBORoleInteraction EOF )
            // InternalBomi.g:230:1: ruleBORoleInteraction EOF
            {
             before(grammarAccess.getBORoleInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleBORoleInteraction();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBORoleInteraction"


    // $ANTLR start "ruleBORoleInteraction"
    // InternalBomi.g:237:1: ruleBORoleInteraction : ( ( rule__BORoleInteraction__Group__0 ) ) ;
    public final void ruleBORoleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:241:2: ( ( ( rule__BORoleInteraction__Group__0 ) ) )
            // InternalBomi.g:242:2: ( ( rule__BORoleInteraction__Group__0 ) )
            {
            // InternalBomi.g:242:2: ( ( rule__BORoleInteraction__Group__0 ) )
            // InternalBomi.g:243:3: ( rule__BORoleInteraction__Group__0 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup()); 
            // InternalBomi.g:244:3: ( rule__BORoleInteraction__Group__0 )
            // InternalBomi.g:244:4: rule__BORoleInteraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBORoleInteraction"


    // $ANTLR start "entryRuleBOTeamGovernance"
    // InternalBomi.g:253:1: entryRuleBOTeamGovernance : ruleBOTeamGovernance EOF ;
    public final void entryRuleBOTeamGovernance() throws RecognitionException {
        try {
            // InternalBomi.g:254:1: ( ruleBOTeamGovernance EOF )
            // InternalBomi.g:255:1: ruleBOTeamGovernance EOF
            {
             before(grammarAccess.getBOTeamGovernanceRule()); 
            pushFollow(FOLLOW_1);
            ruleBOTeamGovernance();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOTeamGovernance"


    // $ANTLR start "ruleBOTeamGovernance"
    // InternalBomi.g:262:1: ruleBOTeamGovernance : ( ( rule__BOTeamGovernance__Group__0 ) ) ;
    public final void ruleBOTeamGovernance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:266:2: ( ( ( rule__BOTeamGovernance__Group__0 ) ) )
            // InternalBomi.g:267:2: ( ( rule__BOTeamGovernance__Group__0 ) )
            {
            // InternalBomi.g:267:2: ( ( rule__BOTeamGovernance__Group__0 ) )
            // InternalBomi.g:268:3: ( rule__BOTeamGovernance__Group__0 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup()); 
            // InternalBomi.g:269:3: ( rule__BOTeamGovernance__Group__0 )
            // InternalBomi.g:269:4: rule__BOTeamGovernance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOTeamGovernance"


    // $ANTLR start "entryRuleEString"
    // InternalBomi.g:278:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBomi.g:279:1: ( ruleEString EOF )
            // InternalBomi.g:280:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBomi.g:287:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:291:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBomi.g:292:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBomi.g:292:2: ( ( rule__EString__Alternatives ) )
            // InternalBomi.g:293:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBomi.g:294:3: ( rule__EString__Alternatives )
            // InternalBomi.g:294:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleHighLow"
    // InternalBomi.g:303:1: ruleHighLow : ( ( rule__HighLow__Alternatives ) ) ;
    public final void ruleHighLow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:307:1: ( ( ( rule__HighLow__Alternatives ) ) )
            // InternalBomi.g:308:2: ( ( rule__HighLow__Alternatives ) )
            {
            // InternalBomi.g:308:2: ( ( rule__HighLow__Alternatives ) )
            // InternalBomi.g:309:3: ( rule__HighLow__Alternatives )
            {
             before(grammarAccess.getHighLowAccess().getAlternatives()); 
            // InternalBomi.g:310:3: ( rule__HighLow__Alternatives )
            // InternalBomi.g:310:4: rule__HighLow__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HighLow__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHighLowAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHighLow"


    // $ANTLR start "ruleMyBoolean"
    // InternalBomi.g:319:1: ruleMyBoolean : ( ( rule__MyBoolean__Alternatives ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:323:1: ( ( ( rule__MyBoolean__Alternatives ) ) )
            // InternalBomi.g:324:2: ( ( rule__MyBoolean__Alternatives ) )
            {
            // InternalBomi.g:324:2: ( ( rule__MyBoolean__Alternatives ) )
            // InternalBomi.g:325:3: ( rule__MyBoolean__Alternatives )
            {
             before(grammarAccess.getMyBooleanAccess().getAlternatives()); 
            // InternalBomi.g:326:3: ( rule__MyBoolean__Alternatives )
            // InternalBomi.g:326:4: rule__MyBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MyBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "ruleBOSuperTypes"
    // InternalBomi.g:335:1: ruleBOSuperTypes : ( ( rule__BOSuperTypes__Alternatives ) ) ;
    public final void ruleBOSuperTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:339:1: ( ( ( rule__BOSuperTypes__Alternatives ) ) )
            // InternalBomi.g:340:2: ( ( rule__BOSuperTypes__Alternatives ) )
            {
            // InternalBomi.g:340:2: ( ( rule__BOSuperTypes__Alternatives ) )
            // InternalBomi.g:341:3: ( rule__BOSuperTypes__Alternatives )
            {
             before(grammarAccess.getBOSuperTypesAccess().getAlternatives()); 
            // InternalBomi.g:342:3: ( rule__BOSuperTypes__Alternatives )
            // InternalBomi.g:342:4: rule__BOSuperTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOSuperTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOSuperTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOSuperTypes"


    // $ANTLR start "ruleLifecycleStage"
    // InternalBomi.g:351:1: ruleLifecycleStage : ( ( rule__LifecycleStage__Alternatives ) ) ;
    public final void ruleLifecycleStage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:355:1: ( ( ( rule__LifecycleStage__Alternatives ) ) )
            // InternalBomi.g:356:2: ( ( rule__LifecycleStage__Alternatives ) )
            {
            // InternalBomi.g:356:2: ( ( rule__LifecycleStage__Alternatives ) )
            // InternalBomi.g:357:3: ( rule__LifecycleStage__Alternatives )
            {
             before(grammarAccess.getLifecycleStageAccess().getAlternatives()); 
            // InternalBomi.g:358:3: ( rule__LifecycleStage__Alternatives )
            // InternalBomi.g:358:4: rule__LifecycleStage__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LifecycleStage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLifecycleStageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLifecycleStage"


    // $ANTLR start "ruleMIType"
    // InternalBomi.g:367:1: ruleMIType : ( ( rule__MIType__Alternatives ) ) ;
    public final void ruleMIType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:371:1: ( ( ( rule__MIType__Alternatives ) ) )
            // InternalBomi.g:372:2: ( ( rule__MIType__Alternatives ) )
            {
            // InternalBomi.g:372:2: ( ( rule__MIType__Alternatives ) )
            // InternalBomi.g:373:3: ( rule__MIType__Alternatives )
            {
             before(grammarAccess.getMITypeAccess().getAlternatives()); 
            // InternalBomi.g:374:3: ( rule__MIType__Alternatives )
            // InternalBomi.g:374:4: rule__MIType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MIType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMITypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMIType"


    // $ANTLR start "ruleDriverTypes"
    // InternalBomi.g:383:1: ruleDriverTypes : ( ( rule__DriverTypes__Alternatives ) ) ;
    public final void ruleDriverTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:387:1: ( ( ( rule__DriverTypes__Alternatives ) ) )
            // InternalBomi.g:388:2: ( ( rule__DriverTypes__Alternatives ) )
            {
            // InternalBomi.g:388:2: ( ( rule__DriverTypes__Alternatives ) )
            // InternalBomi.g:389:3: ( rule__DriverTypes__Alternatives )
            {
             before(grammarAccess.getDriverTypesAccess().getAlternatives()); 
            // InternalBomi.g:390:3: ( rule__DriverTypes__Alternatives )
            // InternalBomi.g:390:4: rule__DriverTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DriverTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDriverTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDriverTypes"


    // $ANTLR start "ruleDistanceTypes"
    // InternalBomi.g:399:1: ruleDistanceTypes : ( ( rule__DistanceTypes__Alternatives ) ) ;
    public final void ruleDistanceTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:403:1: ( ( ( rule__DistanceTypes__Alternatives ) ) )
            // InternalBomi.g:404:2: ( ( rule__DistanceTypes__Alternatives ) )
            {
            // InternalBomi.g:404:2: ( ( rule__DistanceTypes__Alternatives ) )
            // InternalBomi.g:405:3: ( rule__DistanceTypes__Alternatives )
            {
             before(grammarAccess.getDistanceTypesAccess().getAlternatives()); 
            // InternalBomi.g:406:3: ( rule__DistanceTypes__Alternatives )
            // InternalBomi.g:406:4: rule__DistanceTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DistanceTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistanceTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistanceTypes"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBomi.g:414:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:418:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBomi.g:419:2: ( RULE_STRING )
                    {
                    // InternalBomi.g:419:2: ( RULE_STRING )
                    // InternalBomi.g:420:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:425:2: ( RULE_ID )
                    {
                    // InternalBomi.g:425:2: ( RULE_ID )
                    // InternalBomi.g:426:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__HighLow__Alternatives"
    // InternalBomi.g:435:1: rule__HighLow__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) );
    public final void rule__HighLow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:439:1: ( ( ( 'NOT_SET' ) ) | ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBomi.g:440:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:440:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:441:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:442:3: ( 'NOT_SET' )
                    // InternalBomi.g:442:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:446:2: ( ( 'High' ) )
                    {
                    // InternalBomi.g:446:2: ( ( 'High' ) )
                    // InternalBomi.g:447:3: ( 'High' )
                    {
                     before(grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:448:3: ( 'High' )
                    // InternalBomi.g:448:4: 'High'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:452:2: ( ( 'Medium' ) )
                    {
                    // InternalBomi.g:452:2: ( ( 'Medium' ) )
                    // InternalBomi.g:453:3: ( 'Medium' )
                    {
                     before(grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:454:3: ( 'Medium' )
                    // InternalBomi.g:454:4: 'Medium'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:458:2: ( ( 'Low' ) )
                    {
                    // InternalBomi.g:458:2: ( ( 'Low' ) )
                    // InternalBomi.g:459:3: ( 'Low' )
                    {
                     before(grammarAccess.getHighLowAccess().getLowEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:460:3: ( 'Low' )
                    // InternalBomi.g:460:4: 'Low'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getLowEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighLow__Alternatives"


    // $ANTLR start "rule__MyBoolean__Alternatives"
    // InternalBomi.g:468:1: rule__MyBoolean__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'True' ) ) | ( ( 'False' ) ) );
    public final void rule__MyBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:472:1: ( ( ( 'NOT_SET' ) ) | ( ( 'True' ) ) | ( ( 'False' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBomi.g:473:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:473:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:474:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getMyBooleanAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:475:3: ( 'NOT_SET' )
                    // InternalBomi.g:475:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMyBooleanAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:479:2: ( ( 'True' ) )
                    {
                    // InternalBomi.g:479:2: ( ( 'True' ) )
                    // InternalBomi.g:480:3: ( 'True' )
                    {
                     before(grammarAccess.getMyBooleanAccess().getTrueEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:481:3: ( 'True' )
                    // InternalBomi.g:481:4: 'True'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMyBooleanAccess().getTrueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:485:2: ( ( 'False' ) )
                    {
                    // InternalBomi.g:485:2: ( ( 'False' ) )
                    // InternalBomi.g:486:3: ( 'False' )
                    {
                     before(grammarAccess.getMyBooleanAccess().getFalseEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:487:3: ( 'False' )
                    // InternalBomi.g:487:4: 'False'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMyBooleanAccess().getFalseEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Alternatives"


    // $ANTLR start "rule__BOSuperTypes__Alternatives"
    // InternalBomi.g:495:1: rule__BOSuperTypes__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Standard' ) ) | ( ( 'Technology' ) ) | ( ( 'Task' ) ) | ( ( 'Planning' ) ) | ( ( 'Value' ) ) | ( ( 'Product' ) ) | ( ( 'Other' ) ) );
    public final void rule__BOSuperTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:499:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Standard' ) ) | ( ( 'Technology' ) ) | ( ( 'Task' ) ) | ( ( 'Planning' ) ) | ( ( 'Value' ) ) | ( ( 'Product' ) ) | ( ( 'Other' ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            case 21:
                {
                alt4=6;
                }
                break;
            case 22:
                {
                alt4=7;
                }
                break;
            case 23:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBomi.g:500:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:500:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:501:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:502:3: ( 'NOT_SET' )
                    // InternalBomi.g:502:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:506:2: ( ( 'Standard' ) )
                    {
                    // InternalBomi.g:506:2: ( ( 'Standard' ) )
                    // InternalBomi.g:507:3: ( 'Standard' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:508:3: ( 'Standard' )
                    // InternalBomi.g:508:4: 'Standard'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:512:2: ( ( 'Technology' ) )
                    {
                    // InternalBomi.g:512:2: ( ( 'Technology' ) )
                    // InternalBomi.g:513:3: ( 'Technology' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:514:3: ( 'Technology' )
                    // InternalBomi.g:514:4: 'Technology'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:518:2: ( ( 'Task' ) )
                    {
                    // InternalBomi.g:518:2: ( ( 'Task' ) )
                    // InternalBomi.g:519:3: ( 'Task' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:520:3: ( 'Task' )
                    // InternalBomi.g:520:4: 'Task'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:524:2: ( ( 'Planning' ) )
                    {
                    // InternalBomi.g:524:2: ( ( 'Planning' ) )
                    // InternalBomi.g:525:3: ( 'Planning' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:526:3: ( 'Planning' )
                    // InternalBomi.g:526:4: 'Planning'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBomi.g:530:2: ( ( 'Value' ) )
                    {
                    // InternalBomi.g:530:2: ( ( 'Value' ) )
                    // InternalBomi.g:531:3: ( 'Value' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5()); 
                    // InternalBomi.g:532:3: ( 'Value' )
                    // InternalBomi.g:532:4: 'Value'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBomi.g:536:2: ( ( 'Product' ) )
                    {
                    // InternalBomi.g:536:2: ( ( 'Product' ) )
                    // InternalBomi.g:537:3: ( 'Product' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6()); 
                    // InternalBomi.g:538:3: ( 'Product' )
                    // InternalBomi.g:538:4: 'Product'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBomi.g:542:2: ( ( 'Other' ) )
                    {
                    // InternalBomi.g:542:2: ( ( 'Other' ) )
                    // InternalBomi.g:543:3: ( 'Other' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getOtherEnumLiteralDeclaration_7()); 
                    // InternalBomi.g:544:3: ( 'Other' )
                    // InternalBomi.g:544:4: 'Other'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getOtherEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOSuperTypes__Alternatives"


    // $ANTLR start "rule__LifecycleStage__Alternatives"
    // InternalBomi.g:552:1: rule__LifecycleStage__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Planning' ) ) | ( ( 'Operation' ) ) | ( ( 'Deprecate' ) ) | ( ( 'Retire' ) ) );
    public final void rule__LifecycleStage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:556:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Planning' ) ) | ( ( 'Operation' ) ) | ( ( 'Deprecate' ) ) | ( ( 'Retire' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBomi.g:557:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:557:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:558:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:559:3: ( 'NOT_SET' )
                    // InternalBomi.g:559:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:563:2: ( ( 'Planning' ) )
                    {
                    // InternalBomi.g:563:2: ( ( 'Planning' ) )
                    // InternalBomi.g:564:3: ( 'Planning' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:565:3: ( 'Planning' )
                    // InternalBomi.g:565:4: 'Planning'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:569:2: ( ( 'Operation' ) )
                    {
                    // InternalBomi.g:569:2: ( ( 'Operation' ) )
                    // InternalBomi.g:570:3: ( 'Operation' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:571:3: ( 'Operation' )
                    // InternalBomi.g:571:4: 'Operation'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:575:2: ( ( 'Deprecate' ) )
                    {
                    // InternalBomi.g:575:2: ( ( 'Deprecate' ) )
                    // InternalBomi.g:576:3: ( 'Deprecate' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:577:3: ( 'Deprecate' )
                    // InternalBomi.g:577:4: 'Deprecate'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:581:2: ( ( 'Retire' ) )
                    {
                    // InternalBomi.g:581:2: ( ( 'Retire' ) )
                    // InternalBomi.g:582:3: ( 'Retire' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getRetireEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:583:3: ( 'Retire' )
                    // InternalBomi.g:583:4: 'Retire'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getRetireEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifecycleStage__Alternatives"


    // $ANTLR start "rule__MIType__Alternatives"
    // InternalBomi.g:591:1: rule__MIType__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Teams' ) ) | ( ( 'Silos' ) ) | ( ( 'Departments' ) ) | ( ( 'Organizations' ) ) );
    public final void rule__MIType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:595:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Teams' ) ) | ( ( 'Silos' ) ) | ( ( 'Departments' ) ) | ( ( 'Organizations' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 29:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBomi.g:596:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:596:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:597:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:598:3: ( 'NOT_SET' )
                    // InternalBomi.g:598:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:602:2: ( ( 'Teams' ) )
                    {
                    // InternalBomi.g:602:2: ( ( 'Teams' ) )
                    // InternalBomi.g:603:3: ( 'Teams' )
                    {
                     before(grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:604:3: ( 'Teams' )
                    // InternalBomi.g:604:4: 'Teams'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:608:2: ( ( 'Silos' ) )
                    {
                    // InternalBomi.g:608:2: ( ( 'Silos' ) )
                    // InternalBomi.g:609:3: ( 'Silos' )
                    {
                     before(grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:610:3: ( 'Silos' )
                    // InternalBomi.g:610:4: 'Silos'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:614:2: ( ( 'Departments' ) )
                    {
                    // InternalBomi.g:614:2: ( ( 'Departments' ) )
                    // InternalBomi.g:615:3: ( 'Departments' )
                    {
                     before(grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:616:3: ( 'Departments' )
                    // InternalBomi.g:616:4: 'Departments'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:620:2: ( ( 'Organizations' ) )
                    {
                    // InternalBomi.g:620:2: ( ( 'Organizations' ) )
                    // InternalBomi.g:621:3: ( 'Organizations' )
                    {
                     before(grammarAccess.getMITypeAccess().getOrganizationsEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:622:3: ( 'Organizations' )
                    // InternalBomi.g:622:4: 'Organizations'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getOrganizationsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIType__Alternatives"


    // $ANTLR start "rule__DriverTypes__Alternatives"
    // InternalBomi.g:630:1: rule__DriverTypes__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Technology' ) ) | ( ( 'Process' ) ) | ( ( 'Organizational' ) ) );
    public final void rule__DriverTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:634:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Technology' ) ) | ( ( 'Process' ) ) | ( ( 'Organizational' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBomi.g:635:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:635:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:636:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:637:3: ( 'NOT_SET' )
                    // InternalBomi.g:637:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDriverTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:641:2: ( ( 'Technology' ) )
                    {
                    // InternalBomi.g:641:2: ( ( 'Technology' ) )
                    // InternalBomi.g:642:3: ( 'Technology' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getTechnologyEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:643:3: ( 'Technology' )
                    // InternalBomi.g:643:4: 'Technology'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDriverTypesAccess().getTechnologyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:647:2: ( ( 'Process' ) )
                    {
                    // InternalBomi.g:647:2: ( ( 'Process' ) )
                    // InternalBomi.g:648:3: ( 'Process' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getProcessEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:649:3: ( 'Process' )
                    // InternalBomi.g:649:4: 'Process'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDriverTypesAccess().getProcessEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:653:2: ( ( 'Organizational' ) )
                    {
                    // InternalBomi.g:653:2: ( ( 'Organizational' ) )
                    // InternalBomi.g:654:3: ( 'Organizational' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getOrganizationalEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:655:3: ( 'Organizational' )
                    // InternalBomi.g:655:4: 'Organizational'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDriverTypesAccess().getOrganizationalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriverTypes__Alternatives"


    // $ANTLR start "rule__DistanceTypes__Alternatives"
    // InternalBomi.g:663:1: rule__DistanceTypes__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Cultural' ) ) | ( ( 'Geographical' ) ) | ( ( 'Organizational' ) ) );
    public final void rule__DistanceTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:667:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Cultural' ) ) | ( ( 'Geographical' ) ) | ( ( 'Organizational' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBomi.g:668:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:668:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:669:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:670:3: ( 'NOT_SET' )
                    // InternalBomi.g:670:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:674:2: ( ( 'Cultural' ) )
                    {
                    // InternalBomi.g:674:2: ( ( 'Cultural' ) )
                    // InternalBomi.g:675:3: ( 'Cultural' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getCulturalEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:676:3: ( 'Cultural' )
                    // InternalBomi.g:676:4: 'Cultural'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceTypesAccess().getCulturalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:680:2: ( ( 'Geographical' ) )
                    {
                    // InternalBomi.g:680:2: ( ( 'Geographical' ) )
                    // InternalBomi.g:681:3: ( 'Geographical' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getGeographicalEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:682:3: ( 'Geographical' )
                    // InternalBomi.g:682:4: 'Geographical'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceTypesAccess().getGeographicalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:686:2: ( ( 'Organizational' ) )
                    {
                    // InternalBomi.g:686:2: ( ( 'Organizational' ) )
                    // InternalBomi.g:687:3: ( 'Organizational' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getOrganizationalEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:688:3: ( 'Organizational' )
                    // InternalBomi.g:688:4: 'Organizational'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceTypesAccess().getOrganizationalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceTypes__Alternatives"


    // $ANTLR start "rule__BOMIModel__Group__0"
    // InternalBomi.g:696:1: rule__BOMIModel__Group__0 : rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1 ;
    public final void rule__BOMIModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:700:1: ( rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1 )
            // InternalBomi.g:701:2: rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__0"


    // $ANTLR start "rule__BOMIModel__Group__0__Impl"
    // InternalBomi.g:708:1: rule__BOMIModel__Group__0__Impl : ( () ) ;
    public final void rule__BOMIModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:712:1: ( ( () ) )
            // InternalBomi.g:713:1: ( () )
            {
            // InternalBomi.g:713:1: ( () )
            // InternalBomi.g:714:2: ()
            {
             before(grammarAccess.getBOMIModelAccess().getBOMIModelAction_0()); 
            // InternalBomi.g:715:2: ()
            // InternalBomi.g:715:3: 
            {
            }

             after(grammarAccess.getBOMIModelAccess().getBOMIModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group__1"
    // InternalBomi.g:723:1: rule__BOMIModel__Group__1 : rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2 ;
    public final void rule__BOMIModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:727:1: ( rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2 )
            // InternalBomi.g:728:2: rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__1"


    // $ANTLR start "rule__BOMIModel__Group__1__Impl"
    // InternalBomi.g:735:1: rule__BOMIModel__Group__1__Impl : ( ( rule__BOMIModel__Group_1__0 )? ) ;
    public final void rule__BOMIModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:739:1: ( ( ( rule__BOMIModel__Group_1__0 )? ) )
            // InternalBomi.g:740:1: ( ( rule__BOMIModel__Group_1__0 )? )
            {
            // InternalBomi.g:740:1: ( ( rule__BOMIModel__Group_1__0 )? )
            // InternalBomi.g:741:2: ( rule__BOMIModel__Group_1__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_1()); 
            // InternalBomi.g:742:2: ( rule__BOMIModel__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBomi.g:742:3: rule__BOMIModel__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group__2"
    // InternalBomi.g:750:1: rule__BOMIModel__Group__2 : rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3 ;
    public final void rule__BOMIModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:754:1: ( rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3 )
            // InternalBomi.g:755:2: rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__2"


    // $ANTLR start "rule__BOMIModel__Group__2__Impl"
    // InternalBomi.g:762:1: rule__BOMIModel__Group__2__Impl : ( ( rule__BOMIModel__Group_2__0 )? ) ;
    public final void rule__BOMIModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:766:1: ( ( ( rule__BOMIModel__Group_2__0 )? ) )
            // InternalBomi.g:767:1: ( ( rule__BOMIModel__Group_2__0 )? )
            {
            // InternalBomi.g:767:1: ( ( rule__BOMIModel__Group_2__0 )? )
            // InternalBomi.g:768:2: ( rule__BOMIModel__Group_2__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_2()); 
            // InternalBomi.g:769:2: ( rule__BOMIModel__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBomi.g:769:3: rule__BOMIModel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group__3"
    // InternalBomi.g:777:1: rule__BOMIModel__Group__3 : rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4 ;
    public final void rule__BOMIModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:781:1: ( rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4 )
            // InternalBomi.g:782:2: rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__3"


    // $ANTLR start "rule__BOMIModel__Group__3__Impl"
    // InternalBomi.g:789:1: rule__BOMIModel__Group__3__Impl : ( ( rule__BOMIModel__Group_3__0 )? ) ;
    public final void rule__BOMIModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:793:1: ( ( ( rule__BOMIModel__Group_3__0 )? ) )
            // InternalBomi.g:794:1: ( ( rule__BOMIModel__Group_3__0 )? )
            {
            // InternalBomi.g:794:1: ( ( rule__BOMIModel__Group_3__0 )? )
            // InternalBomi.g:795:2: ( rule__BOMIModel__Group_3__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_3()); 
            // InternalBomi.g:796:2: ( rule__BOMIModel__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBomi.g:796:3: rule__BOMIModel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group__4"
    // InternalBomi.g:804:1: rule__BOMIModel__Group__4 : rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5 ;
    public final void rule__BOMIModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:808:1: ( rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5 )
            // InternalBomi.g:809:2: rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__4"


    // $ANTLR start "rule__BOMIModel__Group__4__Impl"
    // InternalBomi.g:816:1: rule__BOMIModel__Group__4__Impl : ( ( rule__BOMIModel__Group_4__0 )? ) ;
    public final void rule__BOMIModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:820:1: ( ( ( rule__BOMIModel__Group_4__0 )? ) )
            // InternalBomi.g:821:1: ( ( rule__BOMIModel__Group_4__0 )? )
            {
            // InternalBomi.g:821:1: ( ( rule__BOMIModel__Group_4__0 )? )
            // InternalBomi.g:822:2: ( rule__BOMIModel__Group_4__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_4()); 
            // InternalBomi.g:823:2: ( rule__BOMIModel__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBomi.g:823:3: rule__BOMIModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group__5"
    // InternalBomi.g:831:1: rule__BOMIModel__Group__5 : rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6 ;
    public final void rule__BOMIModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:835:1: ( rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6 )
            // InternalBomi.g:836:2: rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__5"


    // $ANTLR start "rule__BOMIModel__Group__5__Impl"
    // InternalBomi.g:843:1: rule__BOMIModel__Group__5__Impl : ( ( rule__BOMIModel__Group_5__0 )? ) ;
    public final void rule__BOMIModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:847:1: ( ( ( rule__BOMIModel__Group_5__0 )? ) )
            // InternalBomi.g:848:1: ( ( rule__BOMIModel__Group_5__0 )? )
            {
            // InternalBomi.g:848:1: ( ( rule__BOMIModel__Group_5__0 )? )
            // InternalBomi.g:849:2: ( rule__BOMIModel__Group_5__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_5()); 
            // InternalBomi.g:850:2: ( rule__BOMIModel__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBomi.g:850:3: rule__BOMIModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__5__Impl"


    // $ANTLR start "rule__BOMIModel__Group__6"
    // InternalBomi.g:858:1: rule__BOMIModel__Group__6 : rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7 ;
    public final void rule__BOMIModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:862:1: ( rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7 )
            // InternalBomi.g:863:2: rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__6"


    // $ANTLR start "rule__BOMIModel__Group__6__Impl"
    // InternalBomi.g:870:1: rule__BOMIModel__Group__6__Impl : ( ( rule__BOMIModel__Group_6__0 )? ) ;
    public final void rule__BOMIModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:874:1: ( ( ( rule__BOMIModel__Group_6__0 )? ) )
            // InternalBomi.g:875:1: ( ( rule__BOMIModel__Group_6__0 )? )
            {
            // InternalBomi.g:875:1: ( ( rule__BOMIModel__Group_6__0 )? )
            // InternalBomi.g:876:2: ( rule__BOMIModel__Group_6__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_6()); 
            // InternalBomi.g:877:2: ( rule__BOMIModel__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==71) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBomi.g:877:3: rule__BOMIModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__6__Impl"


    // $ANTLR start "rule__BOMIModel__Group__7"
    // InternalBomi.g:885:1: rule__BOMIModel__Group__7 : rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8 ;
    public final void rule__BOMIModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:889:1: ( rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8 )
            // InternalBomi.g:890:2: rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__BOMIModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__7"


    // $ANTLR start "rule__BOMIModel__Group__7__Impl"
    // InternalBomi.g:897:1: rule__BOMIModel__Group__7__Impl : ( ( rule__BOMIModel__Group_7__0 )? ) ;
    public final void rule__BOMIModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:901:1: ( ( ( rule__BOMIModel__Group_7__0 )? ) )
            // InternalBomi.g:902:1: ( ( rule__BOMIModel__Group_7__0 )? )
            {
            // InternalBomi.g:902:1: ( ( rule__BOMIModel__Group_7__0 )? )
            // InternalBomi.g:903:2: ( rule__BOMIModel__Group_7__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_7()); 
            // InternalBomi.g:904:2: ( rule__BOMIModel__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==76) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBomi.g:904:3: rule__BOMIModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__7__Impl"


    // $ANTLR start "rule__BOMIModel__Group__8"
    // InternalBomi.g:912:1: rule__BOMIModel__Group__8 : rule__BOMIModel__Group__8__Impl ;
    public final void rule__BOMIModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:916:1: ( rule__BOMIModel__Group__8__Impl )
            // InternalBomi.g:917:2: rule__BOMIModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__8"


    // $ANTLR start "rule__BOMIModel__Group__8__Impl"
    // InternalBomi.g:923:1: rule__BOMIModel__Group__8__Impl : ( ( rule__BOMIModel__Group_8__0 )? ) ;
    public final void rule__BOMIModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:927:1: ( ( ( rule__BOMIModel__Group_8__0 )? ) )
            // InternalBomi.g:928:1: ( ( rule__BOMIModel__Group_8__0 )? )
            {
            // InternalBomi.g:928:1: ( ( rule__BOMIModel__Group_8__0 )? )
            // InternalBomi.g:929:2: ( rule__BOMIModel__Group_8__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_8()); 
            // InternalBomi.g:930:2: ( rule__BOMIModel__Group_8__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==82) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBomi.g:930:3: rule__BOMIModel__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMIModel__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMIModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group__8__Impl"


    // $ANTLR start "rule__BOMIModel__Group_1__0"
    // InternalBomi.g:939:1: rule__BOMIModel__Group_1__0 : rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1 ;
    public final void rule__BOMIModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:943:1: ( rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1 )
            // InternalBomi.g:944:2: rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__BOMIModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__0"


    // $ANTLR start "rule__BOMIModel__Group_1__0__Impl"
    // InternalBomi.g:951:1: rule__BOMIModel__Group_1__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOMIModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:955:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:956:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:956:1: ( 'boundaryObjects' )
            // InternalBomi.g:957:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_1__1"
    // InternalBomi.g:966:1: rule__BOMIModel__Group_1__1 : rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2 ;
    public final void rule__BOMIModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:970:1: ( rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2 )
            // InternalBomi.g:971:2: rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__BOMIModel__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__1"


    // $ANTLR start "rule__BOMIModel__Group_1__1__Impl"
    // InternalBomi.g:978:1: rule__BOMIModel__Group_1__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:982:1: ( ( '{' ) )
            // InternalBomi.g:983:1: ( '{' )
            {
            // InternalBomi.g:983:1: ( '{' )
            // InternalBomi.g:984:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_1__2"
    // InternalBomi.g:993:1: rule__BOMIModel__Group_1__2 : rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3 ;
    public final void rule__BOMIModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:997:1: ( rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3 )
            // InternalBomi.g:998:2: rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__2"


    // $ANTLR start "rule__BOMIModel__Group_1__2__Impl"
    // InternalBomi.g:1005:1: rule__BOMIModel__Group_1__2__Impl : ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) ) ;
    public final void rule__BOMIModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1009:1: ( ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) ) )
            // InternalBomi.g:1010:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) )
            {
            // InternalBomi.g:1010:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) )
            // InternalBomi.g:1011:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_1_2()); 
            // InternalBomi.g:1012:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 )
            // InternalBomi.g:1012:3: rule__BOMIModel__BoundaryObjectsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoundaryObjectsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_1__3"
    // InternalBomi.g:1020:1: rule__BOMIModel__Group_1__3 : rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4 ;
    public final void rule__BOMIModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1024:1: ( rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4 )
            // InternalBomi.g:1025:2: rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__3"


    // $ANTLR start "rule__BOMIModel__Group_1__3__Impl"
    // InternalBomi.g:1032:1: rule__BOMIModel__Group_1__3__Impl : ( ( rule__BOMIModel__Group_1_3__0 )* ) ;
    public final void rule__BOMIModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1036:1: ( ( ( rule__BOMIModel__Group_1_3__0 )* ) )
            // InternalBomi.g:1037:1: ( ( rule__BOMIModel__Group_1_3__0 )* )
            {
            // InternalBomi.g:1037:1: ( ( rule__BOMIModel__Group_1_3__0 )* )
            // InternalBomi.g:1038:2: ( rule__BOMIModel__Group_1_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_1_3()); 
            // InternalBomi.g:1039:2: ( rule__BOMIModel__Group_1_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBomi.g:1039:3: rule__BOMIModel__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_1__4"
    // InternalBomi.g:1047:1: rule__BOMIModel__Group_1__4 : rule__BOMIModel__Group_1__4__Impl ;
    public final void rule__BOMIModel__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1051:1: ( rule__BOMIModel__Group_1__4__Impl )
            // InternalBomi.g:1052:2: rule__BOMIModel__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__4"


    // $ANTLR start "rule__BOMIModel__Group_1__4__Impl"
    // InternalBomi.g:1058:1: rule__BOMIModel__Group_1__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1062:1: ( ( '}' ) )
            // InternalBomi.g:1063:1: ( '}' )
            {
            // InternalBomi.g:1063:1: ( '}' )
            // InternalBomi.g:1064:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_1_3__0"
    // InternalBomi.g:1074:1: rule__BOMIModel__Group_1_3__0 : rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1 ;
    public final void rule__BOMIModel__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1078:1: ( rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1 )
            // InternalBomi.g:1079:2: rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__BOMIModel__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1_3__0"


    // $ANTLR start "rule__BOMIModel__Group_1_3__0__Impl"
    // InternalBomi.g:1086:1: rule__BOMIModel__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1090:1: ( ( ',' ) )
            // InternalBomi.g:1091:1: ( ',' )
            {
            // InternalBomi.g:1091:1: ( ',' )
            // InternalBomi.g:1092:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_1_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_1_3__1"
    // InternalBomi.g:1101:1: rule__BOMIModel__Group_1_3__1 : rule__BOMIModel__Group_1_3__1__Impl ;
    public final void rule__BOMIModel__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1105:1: ( rule__BOMIModel__Group_1_3__1__Impl )
            // InternalBomi.g:1106:2: rule__BOMIModel__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1_3__1"


    // $ANTLR start "rule__BOMIModel__Group_1_3__1__Impl"
    // InternalBomi.g:1112:1: rule__BOMIModel__Group_1_3__1__Impl : ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) ) ;
    public final void rule__BOMIModel__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1116:1: ( ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) ) )
            // InternalBomi.g:1117:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) )
            {
            // InternalBomi.g:1117:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) )
            // InternalBomi.g:1118:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_1_3_1()); 
            // InternalBomi.g:1119:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 )
            // InternalBomi.g:1119:3: rule__BOMIModel__BoundaryObjectsAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoundaryObjectsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_1_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_2__0"
    // InternalBomi.g:1128:1: rule__BOMIModel__Group_2__0 : rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1 ;
    public final void rule__BOMIModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1132:1: ( rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1 )
            // InternalBomi.g:1133:2: rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__BOMIModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__0"


    // $ANTLR start "rule__BOMIModel__Group_2__0__Impl"
    // InternalBomi.g:1140:1: rule__BOMIModel__Group_2__0__Impl : ( 'methodologicalIslands' ) ;
    public final void rule__BOMIModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1144:1: ( ( 'methodologicalIslands' ) )
            // InternalBomi.g:1145:1: ( 'methodologicalIslands' )
            {
            // InternalBomi.g:1145:1: ( 'methodologicalIslands' )
            // InternalBomi.g:1146:2: 'methodologicalIslands'
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_2__1"
    // InternalBomi.g:1155:1: rule__BOMIModel__Group_2__1 : rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2 ;
    public final void rule__BOMIModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1159:1: ( rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2 )
            // InternalBomi.g:1160:2: rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__BOMIModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__1"


    // $ANTLR start "rule__BOMIModel__Group_2__1__Impl"
    // InternalBomi.g:1167:1: rule__BOMIModel__Group_2__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1171:1: ( ( '{' ) )
            // InternalBomi.g:1172:1: ( '{' )
            {
            // InternalBomi.g:1172:1: ( '{' )
            // InternalBomi.g:1173:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_2__2"
    // InternalBomi.g:1182:1: rule__BOMIModel__Group_2__2 : rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3 ;
    public final void rule__BOMIModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1186:1: ( rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3 )
            // InternalBomi.g:1187:2: rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__2"


    // $ANTLR start "rule__BOMIModel__Group_2__2__Impl"
    // InternalBomi.g:1194:1: rule__BOMIModel__Group_2__2__Impl : ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) ) ;
    public final void rule__BOMIModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1198:1: ( ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) ) )
            // InternalBomi.g:1199:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) )
            {
            // InternalBomi.g:1199:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) )
            // InternalBomi.g:1200:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_2_2()); 
            // InternalBomi.g:1201:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 )
            // InternalBomi.g:1201:3: rule__BOMIModel__MethodologicalIslandsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__MethodologicalIslandsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_2__3"
    // InternalBomi.g:1209:1: rule__BOMIModel__Group_2__3 : rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4 ;
    public final void rule__BOMIModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1213:1: ( rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4 )
            // InternalBomi.g:1214:2: rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__3"


    // $ANTLR start "rule__BOMIModel__Group_2__3__Impl"
    // InternalBomi.g:1221:1: rule__BOMIModel__Group_2__3__Impl : ( ( rule__BOMIModel__Group_2_3__0 )* ) ;
    public final void rule__BOMIModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1225:1: ( ( ( rule__BOMIModel__Group_2_3__0 )* ) )
            // InternalBomi.g:1226:1: ( ( rule__BOMIModel__Group_2_3__0 )* )
            {
            // InternalBomi.g:1226:1: ( ( rule__BOMIModel__Group_2_3__0 )* )
            // InternalBomi.g:1227:2: ( rule__BOMIModel__Group_2_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_2_3()); 
            // InternalBomi.g:1228:2: ( rule__BOMIModel__Group_2_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBomi.g:1228:3: rule__BOMIModel__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_2__4"
    // InternalBomi.g:1236:1: rule__BOMIModel__Group_2__4 : rule__BOMIModel__Group_2__4__Impl ;
    public final void rule__BOMIModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1240:1: ( rule__BOMIModel__Group_2__4__Impl )
            // InternalBomi.g:1241:2: rule__BOMIModel__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__4"


    // $ANTLR start "rule__BOMIModel__Group_2__4__Impl"
    // InternalBomi.g:1247:1: rule__BOMIModel__Group_2__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1251:1: ( ( '}' ) )
            // InternalBomi.g:1252:1: ( '}' )
            {
            // InternalBomi.g:1252:1: ( '}' )
            // InternalBomi.g:1253:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_2_3__0"
    // InternalBomi.g:1263:1: rule__BOMIModel__Group_2_3__0 : rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1 ;
    public final void rule__BOMIModel__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1267:1: ( rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1 )
            // InternalBomi.g:1268:2: rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1
            {
            pushFollow(FOLLOW_8);
            rule__BOMIModel__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2_3__0"


    // $ANTLR start "rule__BOMIModel__Group_2_3__0__Impl"
    // InternalBomi.g:1275:1: rule__BOMIModel__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1279:1: ( ( ',' ) )
            // InternalBomi.g:1280:1: ( ',' )
            {
            // InternalBomi.g:1280:1: ( ',' )
            // InternalBomi.g:1281:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_2_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_2_3__1"
    // InternalBomi.g:1290:1: rule__BOMIModel__Group_2_3__1 : rule__BOMIModel__Group_2_3__1__Impl ;
    public final void rule__BOMIModel__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1294:1: ( rule__BOMIModel__Group_2_3__1__Impl )
            // InternalBomi.g:1295:2: rule__BOMIModel__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2_3__1"


    // $ANTLR start "rule__BOMIModel__Group_2_3__1__Impl"
    // InternalBomi.g:1301:1: rule__BOMIModel__Group_2_3__1__Impl : ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) ) ;
    public final void rule__BOMIModel__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1305:1: ( ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) ) )
            // InternalBomi.g:1306:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) )
            {
            // InternalBomi.g:1306:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) )
            // InternalBomi.g:1307:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_2_3_1()); 
            // InternalBomi.g:1308:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 )
            // InternalBomi.g:1308:3: rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_2_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_3__0"
    // InternalBomi.g:1317:1: rule__BOMIModel__Group_3__0 : rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1 ;
    public final void rule__BOMIModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1321:1: ( rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1 )
            // InternalBomi.g:1322:2: rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__BOMIModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__0"


    // $ANTLR start "rule__BOMIModel__Group_3__0__Impl"
    // InternalBomi.g:1329:1: rule__BOMIModel__Group_3__0__Impl : ( 'governanceTeams' ) ;
    public final void rule__BOMIModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1333:1: ( ( 'governanceTeams' ) )
            // InternalBomi.g:1334:1: ( 'governanceTeams' )
            {
            // InternalBomi.g:1334:1: ( 'governanceTeams' )
            // InternalBomi.g:1335:2: 'governanceTeams'
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_3__1"
    // InternalBomi.g:1344:1: rule__BOMIModel__Group_3__1 : rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2 ;
    public final void rule__BOMIModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1348:1: ( rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2 )
            // InternalBomi.g:1349:2: rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__BOMIModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__1"


    // $ANTLR start "rule__BOMIModel__Group_3__1__Impl"
    // InternalBomi.g:1356:1: rule__BOMIModel__Group_3__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1360:1: ( ( '{' ) )
            // InternalBomi.g:1361:1: ( '{' )
            {
            // InternalBomi.g:1361:1: ( '{' )
            // InternalBomi.g:1362:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_3__2"
    // InternalBomi.g:1371:1: rule__BOMIModel__Group_3__2 : rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3 ;
    public final void rule__BOMIModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1375:1: ( rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3 )
            // InternalBomi.g:1376:2: rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__2"


    // $ANTLR start "rule__BOMIModel__Group_3__2__Impl"
    // InternalBomi.g:1383:1: rule__BOMIModel__Group_3__2__Impl : ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) ) ;
    public final void rule__BOMIModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1387:1: ( ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) ) )
            // InternalBomi.g:1388:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) )
            {
            // InternalBomi.g:1388:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) )
            // InternalBomi.g:1389:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_3_2()); 
            // InternalBomi.g:1390:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 )
            // InternalBomi.g:1390:3: rule__BOMIModel__GovernanceTeamsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__GovernanceTeamsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_3__3"
    // InternalBomi.g:1398:1: rule__BOMIModel__Group_3__3 : rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4 ;
    public final void rule__BOMIModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1402:1: ( rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4 )
            // InternalBomi.g:1403:2: rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__3"


    // $ANTLR start "rule__BOMIModel__Group_3__3__Impl"
    // InternalBomi.g:1410:1: rule__BOMIModel__Group_3__3__Impl : ( ( rule__BOMIModel__Group_3_3__0 )* ) ;
    public final void rule__BOMIModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1414:1: ( ( ( rule__BOMIModel__Group_3_3__0 )* ) )
            // InternalBomi.g:1415:1: ( ( rule__BOMIModel__Group_3_3__0 )* )
            {
            // InternalBomi.g:1415:1: ( ( rule__BOMIModel__Group_3_3__0 )* )
            // InternalBomi.g:1416:2: ( rule__BOMIModel__Group_3_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_3_3()); 
            // InternalBomi.g:1417:2: ( rule__BOMIModel__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBomi.g:1417:3: rule__BOMIModel__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_3__4"
    // InternalBomi.g:1425:1: rule__BOMIModel__Group_3__4 : rule__BOMIModel__Group_3__4__Impl ;
    public final void rule__BOMIModel__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1429:1: ( rule__BOMIModel__Group_3__4__Impl )
            // InternalBomi.g:1430:2: rule__BOMIModel__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__4"


    // $ANTLR start "rule__BOMIModel__Group_3__4__Impl"
    // InternalBomi.g:1436:1: rule__BOMIModel__Group_3__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1440:1: ( ( '}' ) )
            // InternalBomi.g:1441:1: ( '}' )
            {
            // InternalBomi.g:1441:1: ( '}' )
            // InternalBomi.g:1442:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_3_3__0"
    // InternalBomi.g:1452:1: rule__BOMIModel__Group_3_3__0 : rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1 ;
    public final void rule__BOMIModel__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1456:1: ( rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1 )
            // InternalBomi.g:1457:2: rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
            rule__BOMIModel__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3_3__0"


    // $ANTLR start "rule__BOMIModel__Group_3_3__0__Impl"
    // InternalBomi.g:1464:1: rule__BOMIModel__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1468:1: ( ( ',' ) )
            // InternalBomi.g:1469:1: ( ',' )
            {
            // InternalBomi.g:1469:1: ( ',' )
            // InternalBomi.g:1470:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_3_3__1"
    // InternalBomi.g:1479:1: rule__BOMIModel__Group_3_3__1 : rule__BOMIModel__Group_3_3__1__Impl ;
    public final void rule__BOMIModel__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1483:1: ( rule__BOMIModel__Group_3_3__1__Impl )
            // InternalBomi.g:1484:2: rule__BOMIModel__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3_3__1"


    // $ANTLR start "rule__BOMIModel__Group_3_3__1__Impl"
    // InternalBomi.g:1490:1: rule__BOMIModel__Group_3_3__1__Impl : ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) ) ;
    public final void rule__BOMIModel__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1494:1: ( ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) ) )
            // InternalBomi.g:1495:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) )
            {
            // InternalBomi.g:1495:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) )
            // InternalBomi.g:1496:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_3_3_1()); 
            // InternalBomi.g:1497:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 )
            // InternalBomi.g:1497:3: rule__BOMIModel__GovernanceTeamsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__GovernanceTeamsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_3_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_4__0"
    // InternalBomi.g:1506:1: rule__BOMIModel__Group_4__0 : rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1 ;
    public final void rule__BOMIModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1510:1: ( rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1 )
            // InternalBomi.g:1511:2: rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__BOMIModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__0"


    // $ANTLR start "rule__BOMIModel__Group_4__0__Impl"
    // InternalBomi.g:1518:1: rule__BOMIModel__Group_4__0__Impl : ( 'roles' ) ;
    public final void rule__BOMIModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1522:1: ( ( 'roles' ) )
            // InternalBomi.g:1523:1: ( 'roles' )
            {
            // InternalBomi.g:1523:1: ( 'roles' )
            // InternalBomi.g:1524:2: 'roles'
            {
             before(grammarAccess.getBOMIModelAccess().getRolesKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRolesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_4__1"
    // InternalBomi.g:1533:1: rule__BOMIModel__Group_4__1 : rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2 ;
    public final void rule__BOMIModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1537:1: ( rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2 )
            // InternalBomi.g:1538:2: rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__BOMIModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__1"


    // $ANTLR start "rule__BOMIModel__Group_4__1__Impl"
    // InternalBomi.g:1545:1: rule__BOMIModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1549:1: ( ( '{' ) )
            // InternalBomi.g:1550:1: ( '{' )
            {
            // InternalBomi.g:1550:1: ( '{' )
            // InternalBomi.g:1551:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_4__2"
    // InternalBomi.g:1560:1: rule__BOMIModel__Group_4__2 : rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3 ;
    public final void rule__BOMIModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1564:1: ( rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3 )
            // InternalBomi.g:1565:2: rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__2"


    // $ANTLR start "rule__BOMIModel__Group_4__2__Impl"
    // InternalBomi.g:1572:1: rule__BOMIModel__Group_4__2__Impl : ( ( rule__BOMIModel__RolesAssignment_4_2 ) ) ;
    public final void rule__BOMIModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1576:1: ( ( ( rule__BOMIModel__RolesAssignment_4_2 ) ) )
            // InternalBomi.g:1577:1: ( ( rule__BOMIModel__RolesAssignment_4_2 ) )
            {
            // InternalBomi.g:1577:1: ( ( rule__BOMIModel__RolesAssignment_4_2 ) )
            // InternalBomi.g:1578:2: ( rule__BOMIModel__RolesAssignment_4_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getRolesAssignment_4_2()); 
            // InternalBomi.g:1579:2: ( rule__BOMIModel__RolesAssignment_4_2 )
            // InternalBomi.g:1579:3: rule__BOMIModel__RolesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__RolesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getRolesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_4__3"
    // InternalBomi.g:1587:1: rule__BOMIModel__Group_4__3 : rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4 ;
    public final void rule__BOMIModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1591:1: ( rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4 )
            // InternalBomi.g:1592:2: rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__3"


    // $ANTLR start "rule__BOMIModel__Group_4__3__Impl"
    // InternalBomi.g:1599:1: rule__BOMIModel__Group_4__3__Impl : ( ( rule__BOMIModel__Group_4_3__0 )* ) ;
    public final void rule__BOMIModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1603:1: ( ( ( rule__BOMIModel__Group_4_3__0 )* ) )
            // InternalBomi.g:1604:1: ( ( rule__BOMIModel__Group_4_3__0 )* )
            {
            // InternalBomi.g:1604:1: ( ( rule__BOMIModel__Group_4_3__0 )* )
            // InternalBomi.g:1605:2: ( rule__BOMIModel__Group_4_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_4_3()); 
            // InternalBomi.g:1606:2: ( rule__BOMIModel__Group_4_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBomi.g:1606:3: rule__BOMIModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_4__4"
    // InternalBomi.g:1614:1: rule__BOMIModel__Group_4__4 : rule__BOMIModel__Group_4__4__Impl ;
    public final void rule__BOMIModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1618:1: ( rule__BOMIModel__Group_4__4__Impl )
            // InternalBomi.g:1619:2: rule__BOMIModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__4"


    // $ANTLR start "rule__BOMIModel__Group_4__4__Impl"
    // InternalBomi.g:1625:1: rule__BOMIModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1629:1: ( ( '}' ) )
            // InternalBomi.g:1630:1: ( '}' )
            {
            // InternalBomi.g:1630:1: ( '}' )
            // InternalBomi.g:1631:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_4_3__0"
    // InternalBomi.g:1641:1: rule__BOMIModel__Group_4_3__0 : rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1 ;
    public final void rule__BOMIModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1645:1: ( rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1 )
            // InternalBomi.g:1646:2: rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
            rule__BOMIModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4_3__0"


    // $ANTLR start "rule__BOMIModel__Group_4_3__0__Impl"
    // InternalBomi.g:1653:1: rule__BOMIModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1657:1: ( ( ',' ) )
            // InternalBomi.g:1658:1: ( ',' )
            {
            // InternalBomi.g:1658:1: ( ',' )
            // InternalBomi.g:1659:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_4_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_4_3__1"
    // InternalBomi.g:1668:1: rule__BOMIModel__Group_4_3__1 : rule__BOMIModel__Group_4_3__1__Impl ;
    public final void rule__BOMIModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1672:1: ( rule__BOMIModel__Group_4_3__1__Impl )
            // InternalBomi.g:1673:2: rule__BOMIModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4_3__1"


    // $ANTLR start "rule__BOMIModel__Group_4_3__1__Impl"
    // InternalBomi.g:1679:1: rule__BOMIModel__Group_4_3__1__Impl : ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) ) ;
    public final void rule__BOMIModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1683:1: ( ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) ) )
            // InternalBomi.g:1684:1: ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) )
            {
            // InternalBomi.g:1684:1: ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) )
            // InternalBomi.g:1685:2: ( rule__BOMIModel__RolesAssignment_4_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getRolesAssignment_4_3_1()); 
            // InternalBomi.g:1686:2: ( rule__BOMIModel__RolesAssignment_4_3_1 )
            // InternalBomi.g:1686:3: rule__BOMIModel__RolesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__RolesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getRolesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_5__0"
    // InternalBomi.g:1695:1: rule__BOMIModel__Group_5__0 : rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1 ;
    public final void rule__BOMIModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1699:1: ( rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1 )
            // InternalBomi.g:1700:2: rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__BOMIModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__0"


    // $ANTLR start "rule__BOMIModel__Group_5__0__Impl"
    // InternalBomi.g:1707:1: rule__BOMIModel__Group_5__0__Impl : ( 'drivers' ) ;
    public final void rule__BOMIModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1711:1: ( ( 'drivers' ) )
            // InternalBomi.g:1712:1: ( 'drivers' )
            {
            // InternalBomi.g:1712:1: ( 'drivers' )
            // InternalBomi.g:1713:2: 'drivers'
            {
             before(grammarAccess.getBOMIModelAccess().getDriversKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getDriversKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_5__1"
    // InternalBomi.g:1722:1: rule__BOMIModel__Group_5__1 : rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2 ;
    public final void rule__BOMIModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1726:1: ( rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2 )
            // InternalBomi.g:1727:2: rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__BOMIModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__1"


    // $ANTLR start "rule__BOMIModel__Group_5__1__Impl"
    // InternalBomi.g:1734:1: rule__BOMIModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1738:1: ( ( '{' ) )
            // InternalBomi.g:1739:1: ( '{' )
            {
            // InternalBomi.g:1739:1: ( '{' )
            // InternalBomi.g:1740:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_5__2"
    // InternalBomi.g:1749:1: rule__BOMIModel__Group_5__2 : rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3 ;
    public final void rule__BOMIModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1753:1: ( rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3 )
            // InternalBomi.g:1754:2: rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__2"


    // $ANTLR start "rule__BOMIModel__Group_5__2__Impl"
    // InternalBomi.g:1761:1: rule__BOMIModel__Group_5__2__Impl : ( ( rule__BOMIModel__DriversAssignment_5_2 ) ) ;
    public final void rule__BOMIModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1765:1: ( ( ( rule__BOMIModel__DriversAssignment_5_2 ) ) )
            // InternalBomi.g:1766:1: ( ( rule__BOMIModel__DriversAssignment_5_2 ) )
            {
            // InternalBomi.g:1766:1: ( ( rule__BOMIModel__DriversAssignment_5_2 ) )
            // InternalBomi.g:1767:2: ( rule__BOMIModel__DriversAssignment_5_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getDriversAssignment_5_2()); 
            // InternalBomi.g:1768:2: ( rule__BOMIModel__DriversAssignment_5_2 )
            // InternalBomi.g:1768:3: rule__BOMIModel__DriversAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__DriversAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getDriversAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_5__3"
    // InternalBomi.g:1776:1: rule__BOMIModel__Group_5__3 : rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4 ;
    public final void rule__BOMIModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1780:1: ( rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4 )
            // InternalBomi.g:1781:2: rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__3"


    // $ANTLR start "rule__BOMIModel__Group_5__3__Impl"
    // InternalBomi.g:1788:1: rule__BOMIModel__Group_5__3__Impl : ( ( rule__BOMIModel__Group_5_3__0 )* ) ;
    public final void rule__BOMIModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1792:1: ( ( ( rule__BOMIModel__Group_5_3__0 )* ) )
            // InternalBomi.g:1793:1: ( ( rule__BOMIModel__Group_5_3__0 )* )
            {
            // InternalBomi.g:1793:1: ( ( rule__BOMIModel__Group_5_3__0 )* )
            // InternalBomi.g:1794:2: ( rule__BOMIModel__Group_5_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_5_3()); 
            // InternalBomi.g:1795:2: ( rule__BOMIModel__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBomi.g:1795:3: rule__BOMIModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_5__4"
    // InternalBomi.g:1803:1: rule__BOMIModel__Group_5__4 : rule__BOMIModel__Group_5__4__Impl ;
    public final void rule__BOMIModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1807:1: ( rule__BOMIModel__Group_5__4__Impl )
            // InternalBomi.g:1808:2: rule__BOMIModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__4"


    // $ANTLR start "rule__BOMIModel__Group_5__4__Impl"
    // InternalBomi.g:1814:1: rule__BOMIModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1818:1: ( ( '}' ) )
            // InternalBomi.g:1819:1: ( '}' )
            {
            // InternalBomi.g:1819:1: ( '}' )
            // InternalBomi.g:1820:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_5_3__0"
    // InternalBomi.g:1830:1: rule__BOMIModel__Group_5_3__0 : rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1 ;
    public final void rule__BOMIModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1834:1: ( rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1 )
            // InternalBomi.g:1835:2: rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__BOMIModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5_3__0"


    // $ANTLR start "rule__BOMIModel__Group_5_3__0__Impl"
    // InternalBomi.g:1842:1: rule__BOMIModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1846:1: ( ( ',' ) )
            // InternalBomi.g:1847:1: ( ',' )
            {
            // InternalBomi.g:1847:1: ( ',' )
            // InternalBomi.g:1848:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_5_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_5_3__1"
    // InternalBomi.g:1857:1: rule__BOMIModel__Group_5_3__1 : rule__BOMIModel__Group_5_3__1__Impl ;
    public final void rule__BOMIModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1861:1: ( rule__BOMIModel__Group_5_3__1__Impl )
            // InternalBomi.g:1862:2: rule__BOMIModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5_3__1"


    // $ANTLR start "rule__BOMIModel__Group_5_3__1__Impl"
    // InternalBomi.g:1868:1: rule__BOMIModel__Group_5_3__1__Impl : ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) ) ;
    public final void rule__BOMIModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1872:1: ( ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) ) )
            // InternalBomi.g:1873:1: ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) )
            {
            // InternalBomi.g:1873:1: ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) )
            // InternalBomi.g:1874:2: ( rule__BOMIModel__DriversAssignment_5_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getDriversAssignment_5_3_1()); 
            // InternalBomi.g:1875:2: ( rule__BOMIModel__DriversAssignment_5_3_1 )
            // InternalBomi.g:1875:3: rule__BOMIModel__DriversAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__DriversAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getDriversAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6__0"
    // InternalBomi.g:1884:1: rule__BOMIModel__Group_6__0 : rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1 ;
    public final void rule__BOMIModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1888:1: ( rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1 )
            // InternalBomi.g:1889:2: rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__BOMIModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__0"


    // $ANTLR start "rule__BOMIModel__Group_6__0__Impl"
    // InternalBomi.g:1896:1: rule__BOMIModel__Group_6__0__Impl : ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) ) ;
    public final void rule__BOMIModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1900:1: ( ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) ) )
            // InternalBomi.g:1901:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) )
            {
            // InternalBomi.g:1901:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) )
            // InternalBomi.g:1902:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_6_0()); 
            // InternalBomi.g:1903:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 )
            // InternalBomi.g:1903:3: rule__BOMIModel__BoMiCoordinationsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoMiCoordinationsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6__1"
    // InternalBomi.g:1911:1: rule__BOMIModel__Group_6__1 : rule__BOMIModel__Group_6__1__Impl ;
    public final void rule__BOMIModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1915:1: ( rule__BOMIModel__Group_6__1__Impl )
            // InternalBomi.g:1916:2: rule__BOMIModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__1"


    // $ANTLR start "rule__BOMIModel__Group_6__1__Impl"
    // InternalBomi.g:1922:1: rule__BOMIModel__Group_6__1__Impl : ( ( rule__BOMIModel__Group_6_1__0 )* ) ;
    public final void rule__BOMIModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1926:1: ( ( ( rule__BOMIModel__Group_6_1__0 )* ) )
            // InternalBomi.g:1927:1: ( ( rule__BOMIModel__Group_6_1__0 )* )
            {
            // InternalBomi.g:1927:1: ( ( rule__BOMIModel__Group_6_1__0 )* )
            // InternalBomi.g:1928:2: ( rule__BOMIModel__Group_6_1__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_6_1()); 
            // InternalBomi.g:1929:2: ( rule__BOMIModel__Group_6_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBomi.g:1929:3: rule__BOMIModel__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6_1__0"
    // InternalBomi.g:1938:1: rule__BOMIModel__Group_6_1__0 : rule__BOMIModel__Group_6_1__0__Impl rule__BOMIModel__Group_6_1__1 ;
    public final void rule__BOMIModel__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1942:1: ( rule__BOMIModel__Group_6_1__0__Impl rule__BOMIModel__Group_6_1__1 )
            // InternalBomi.g:1943:2: rule__BOMIModel__Group_6_1__0__Impl rule__BOMIModel__Group_6_1__1
            {
            pushFollow(FOLLOW_13);
            rule__BOMIModel__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_1__0"


    // $ANTLR start "rule__BOMIModel__Group_6_1__0__Impl"
    // InternalBomi.g:1950:1: rule__BOMIModel__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1954:1: ( ( ',' ) )
            // InternalBomi.g:1955:1: ( ',' )
            {
            // InternalBomi.g:1955:1: ( ',' )
            // InternalBomi.g:1956:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_6_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_1__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6_1__1"
    // InternalBomi.g:1965:1: rule__BOMIModel__Group_6_1__1 : rule__BOMIModel__Group_6_1__1__Impl ;
    public final void rule__BOMIModel__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1969:1: ( rule__BOMIModel__Group_6_1__1__Impl )
            // InternalBomi.g:1970:2: rule__BOMIModel__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_1__1"


    // $ANTLR start "rule__BOMIModel__Group_6_1__1__Impl"
    // InternalBomi.g:1976:1: rule__BOMIModel__Group_6_1__1__Impl : ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) ) ;
    public final void rule__BOMIModel__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1980:1: ( ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) ) )
            // InternalBomi.g:1981:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) )
            {
            // InternalBomi.g:1981:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) )
            // InternalBomi.g:1982:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_6_1_1()); 
            // InternalBomi.g:1983:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 )
            // InternalBomi.g:1983:3: rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_1__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7__0"
    // InternalBomi.g:1992:1: rule__BOMIModel__Group_7__0 : rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1 ;
    public final void rule__BOMIModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1996:1: ( rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1 )
            // InternalBomi.g:1997:2: rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__BOMIModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__0"


    // $ANTLR start "rule__BOMIModel__Group_7__0__Impl"
    // InternalBomi.g:2004:1: rule__BOMIModel__Group_7__0__Impl : ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) ) ;
    public final void rule__BOMIModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2008:1: ( ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) ) )
            // InternalBomi.g:2009:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) )
            {
            // InternalBomi.g:2009:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) )
            // InternalBomi.g:2010:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_7_0()); 
            // InternalBomi.g:2011:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 )
            // InternalBomi.g:2011:3: rule__BOMIModel__BoRoleInteractionsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoRoleInteractionsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7__1"
    // InternalBomi.g:2019:1: rule__BOMIModel__Group_7__1 : rule__BOMIModel__Group_7__1__Impl ;
    public final void rule__BOMIModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2023:1: ( rule__BOMIModel__Group_7__1__Impl )
            // InternalBomi.g:2024:2: rule__BOMIModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__1"


    // $ANTLR start "rule__BOMIModel__Group_7__1__Impl"
    // InternalBomi.g:2030:1: rule__BOMIModel__Group_7__1__Impl : ( ( rule__BOMIModel__Group_7_1__0 )* ) ;
    public final void rule__BOMIModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2034:1: ( ( ( rule__BOMIModel__Group_7_1__0 )* ) )
            // InternalBomi.g:2035:1: ( ( rule__BOMIModel__Group_7_1__0 )* )
            {
            // InternalBomi.g:2035:1: ( ( rule__BOMIModel__Group_7_1__0 )* )
            // InternalBomi.g:2036:2: ( rule__BOMIModel__Group_7_1__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_7_1()); 
            // InternalBomi.g:2037:2: ( rule__BOMIModel__Group_7_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBomi.g:2037:3: rule__BOMIModel__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7_1__0"
    // InternalBomi.g:2046:1: rule__BOMIModel__Group_7_1__0 : rule__BOMIModel__Group_7_1__0__Impl rule__BOMIModel__Group_7_1__1 ;
    public final void rule__BOMIModel__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2050:1: ( rule__BOMIModel__Group_7_1__0__Impl rule__BOMIModel__Group_7_1__1 )
            // InternalBomi.g:2051:2: rule__BOMIModel__Group_7_1__0__Impl rule__BOMIModel__Group_7_1__1
            {
            pushFollow(FOLLOW_14);
            rule__BOMIModel__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_1__0"


    // $ANTLR start "rule__BOMIModel__Group_7_1__0__Impl"
    // InternalBomi.g:2058:1: rule__BOMIModel__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2062:1: ( ( ',' ) )
            // InternalBomi.g:2063:1: ( ',' )
            {
            // InternalBomi.g:2063:1: ( ',' )
            // InternalBomi.g:2064:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_7_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_1__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7_1__1"
    // InternalBomi.g:2073:1: rule__BOMIModel__Group_7_1__1 : rule__BOMIModel__Group_7_1__1__Impl ;
    public final void rule__BOMIModel__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2077:1: ( rule__BOMIModel__Group_7_1__1__Impl )
            // InternalBomi.g:2078:2: rule__BOMIModel__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_1__1"


    // $ANTLR start "rule__BOMIModel__Group_7_1__1__Impl"
    // InternalBomi.g:2084:1: rule__BOMIModel__Group_7_1__1__Impl : ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) ) ;
    public final void rule__BOMIModel__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2088:1: ( ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) ) )
            // InternalBomi.g:2089:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) )
            {
            // InternalBomi.g:2089:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) )
            // InternalBomi.g:2090:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_7_1_1()); 
            // InternalBomi.g:2091:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 )
            // InternalBomi.g:2091:3: rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_1__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8__0"
    // InternalBomi.g:2100:1: rule__BOMIModel__Group_8__0 : rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1 ;
    public final void rule__BOMIModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2104:1: ( rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1 )
            // InternalBomi.g:2105:2: rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__BOMIModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__0"


    // $ANTLR start "rule__BOMIModel__Group_8__0__Impl"
    // InternalBomi.g:2112:1: rule__BOMIModel__Group_8__0__Impl : ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) ) ;
    public final void rule__BOMIModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2116:1: ( ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) ) )
            // InternalBomi.g:2117:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) )
            {
            // InternalBomi.g:2117:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) )
            // InternalBomi.g:2118:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_8_0()); 
            // InternalBomi.g:2119:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 )
            // InternalBomi.g:2119:3: rule__BOMIModel__BoTeamGovernancesAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoTeamGovernancesAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8__1"
    // InternalBomi.g:2127:1: rule__BOMIModel__Group_8__1 : rule__BOMIModel__Group_8__1__Impl ;
    public final void rule__BOMIModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2131:1: ( rule__BOMIModel__Group_8__1__Impl )
            // InternalBomi.g:2132:2: rule__BOMIModel__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__1"


    // $ANTLR start "rule__BOMIModel__Group_8__1__Impl"
    // InternalBomi.g:2138:1: rule__BOMIModel__Group_8__1__Impl : ( ( rule__BOMIModel__Group_8_1__0 )* ) ;
    public final void rule__BOMIModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2142:1: ( ( ( rule__BOMIModel__Group_8_1__0 )* ) )
            // InternalBomi.g:2143:1: ( ( rule__BOMIModel__Group_8_1__0 )* )
            {
            // InternalBomi.g:2143:1: ( ( rule__BOMIModel__Group_8_1__0 )* )
            // InternalBomi.g:2144:2: ( rule__BOMIModel__Group_8_1__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_8_1()); 
            // InternalBomi.g:2145:2: ( rule__BOMIModel__Group_8_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBomi.g:2145:3: rule__BOMIModel__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8_1__0"
    // InternalBomi.g:2154:1: rule__BOMIModel__Group_8_1__0 : rule__BOMIModel__Group_8_1__0__Impl rule__BOMIModel__Group_8_1__1 ;
    public final void rule__BOMIModel__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2158:1: ( rule__BOMIModel__Group_8_1__0__Impl rule__BOMIModel__Group_8_1__1 )
            // InternalBomi.g:2159:2: rule__BOMIModel__Group_8_1__0__Impl rule__BOMIModel__Group_8_1__1
            {
            pushFollow(FOLLOW_15);
            rule__BOMIModel__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_1__0"


    // $ANTLR start "rule__BOMIModel__Group_8_1__0__Impl"
    // InternalBomi.g:2166:1: rule__BOMIModel__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2170:1: ( ( ',' ) )
            // InternalBomi.g:2171:1: ( ',' )
            {
            // InternalBomi.g:2171:1: ( ',' )
            // InternalBomi.g:2172:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_8_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_1__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8_1__1"
    // InternalBomi.g:2181:1: rule__BOMIModel__Group_8_1__1 : rule__BOMIModel__Group_8_1__1__Impl ;
    public final void rule__BOMIModel__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2185:1: ( rule__BOMIModel__Group_8_1__1__Impl )
            // InternalBomi.g:2186:2: rule__BOMIModel__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_1__1"


    // $ANTLR start "rule__BOMIModel__Group_8_1__1__Impl"
    // InternalBomi.g:2192:1: rule__BOMIModel__Group_8_1__1__Impl : ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) ) ;
    public final void rule__BOMIModel__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2196:1: ( ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) ) )
            // InternalBomi.g:2197:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) )
            {
            // InternalBomi.g:2197:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) )
            // InternalBomi.g:2198:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_8_1_1()); 
            // InternalBomi.g:2199:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 )
            // InternalBomi.g:2199:3: rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_1__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__0"
    // InternalBomi.g:2208:1: rule__BoundaryObject__Group__0 : rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1 ;
    public final void rule__BoundaryObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2212:1: ( rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1 )
            // InternalBomi.g:2213:2: rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BoundaryObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__0"


    // $ANTLR start "rule__BoundaryObject__Group__0__Impl"
    // InternalBomi.g:2220:1: rule__BoundaryObject__Group__0__Impl : ( () ) ;
    public final void rule__BoundaryObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2224:1: ( ( () ) )
            // InternalBomi.g:2225:1: ( () )
            {
            // InternalBomi.g:2225:1: ( () )
            // InternalBomi.g:2226:2: ()
            {
             before(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectAction_0()); 
            // InternalBomi.g:2227:2: ()
            // InternalBomi.g:2227:3: 
            {
            }

             after(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__1"
    // InternalBomi.g:2235:1: rule__BoundaryObject__Group__1 : rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2 ;
    public final void rule__BoundaryObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2239:1: ( rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2 )
            // InternalBomi.g:2240:2: rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__BoundaryObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__1"


    // $ANTLR start "rule__BoundaryObject__Group__1__Impl"
    // InternalBomi.g:2247:1: rule__BoundaryObject__Group__1__Impl : ( 'BoundaryObject' ) ;
    public final void rule__BoundaryObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2251:1: ( ( 'BoundaryObject' ) )
            // InternalBomi.g:2252:1: ( 'BoundaryObject' )
            {
            // InternalBomi.g:2252:1: ( 'BoundaryObject' )
            // InternalBomi.g:2253:2: 'BoundaryObject'
            {
             before(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__2"
    // InternalBomi.g:2262:1: rule__BoundaryObject__Group__2 : rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3 ;
    public final void rule__BoundaryObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2266:1: ( rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3 )
            // InternalBomi.g:2267:2: rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BoundaryObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__2"


    // $ANTLR start "rule__BoundaryObject__Group__2__Impl"
    // InternalBomi.g:2274:1: rule__BoundaryObject__Group__2__Impl : ( ( rule__BoundaryObject__NameAssignment_2 ) ) ;
    public final void rule__BoundaryObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2278:1: ( ( ( rule__BoundaryObject__NameAssignment_2 ) ) )
            // InternalBomi.g:2279:1: ( ( rule__BoundaryObject__NameAssignment_2 ) )
            {
            // InternalBomi.g:2279:1: ( ( rule__BoundaryObject__NameAssignment_2 ) )
            // InternalBomi.g:2280:2: ( rule__BoundaryObject__NameAssignment_2 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getNameAssignment_2()); 
            // InternalBomi.g:2281:2: ( rule__BoundaryObject__NameAssignment_2 )
            // InternalBomi.g:2281:3: rule__BoundaryObject__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__2__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__3"
    // InternalBomi.g:2289:1: rule__BoundaryObject__Group__3 : rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4 ;
    public final void rule__BoundaryObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2293:1: ( rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4 )
            // InternalBomi.g:2294:2: rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__3"


    // $ANTLR start "rule__BoundaryObject__Group__3__Impl"
    // InternalBomi.g:2301:1: rule__BoundaryObject__Group__3__Impl : ( '{' ) ;
    public final void rule__BoundaryObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2305:1: ( ( '{' ) )
            // InternalBomi.g:2306:1: ( '{' )
            {
            // InternalBomi.g:2306:1: ( '{' )
            // InternalBomi.g:2307:2: '{'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__3__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__4"
    // InternalBomi.g:2316:1: rule__BoundaryObject__Group__4 : rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5 ;
    public final void rule__BoundaryObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2320:1: ( rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5 )
            // InternalBomi.g:2321:2: rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__4"


    // $ANTLR start "rule__BoundaryObject__Group__4__Impl"
    // InternalBomi.g:2328:1: rule__BoundaryObject__Group__4__Impl : ( ( rule__BoundaryObject__Group_4__0 )? ) ;
    public final void rule__BoundaryObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2332:1: ( ( ( rule__BoundaryObject__Group_4__0 )? ) )
            // InternalBomi.g:2333:1: ( ( rule__BoundaryObject__Group_4__0 )? )
            {
            // InternalBomi.g:2333:1: ( ( rule__BoundaryObject__Group_4__0 )? )
            // InternalBomi.g:2334:2: ( rule__BoundaryObject__Group_4__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_4()); 
            // InternalBomi.g:2335:2: ( rule__BoundaryObject__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBomi.g:2335:3: rule__BoundaryObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__4__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__5"
    // InternalBomi.g:2343:1: rule__BoundaryObject__Group__5 : rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6 ;
    public final void rule__BoundaryObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2347:1: ( rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6 )
            // InternalBomi.g:2348:2: rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__5"


    // $ANTLR start "rule__BoundaryObject__Group__5__Impl"
    // InternalBomi.g:2355:1: rule__BoundaryObject__Group__5__Impl : ( ( rule__BoundaryObject__Group_5__0 )? ) ;
    public final void rule__BoundaryObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2359:1: ( ( ( rule__BoundaryObject__Group_5__0 )? ) )
            // InternalBomi.g:2360:1: ( ( rule__BoundaryObject__Group_5__0 )? )
            {
            // InternalBomi.g:2360:1: ( ( rule__BoundaryObject__Group_5__0 )? )
            // InternalBomi.g:2361:2: ( rule__BoundaryObject__Group_5__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_5()); 
            // InternalBomi.g:2362:2: ( rule__BoundaryObject__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBomi.g:2362:3: rule__BoundaryObject__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__5__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__6"
    // InternalBomi.g:2370:1: rule__BoundaryObject__Group__6 : rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7 ;
    public final void rule__BoundaryObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2374:1: ( rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7 )
            // InternalBomi.g:2375:2: rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__6"


    // $ANTLR start "rule__BoundaryObject__Group__6__Impl"
    // InternalBomi.g:2382:1: rule__BoundaryObject__Group__6__Impl : ( ( rule__BoundaryObject__Group_6__0 )? ) ;
    public final void rule__BoundaryObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2386:1: ( ( ( rule__BoundaryObject__Group_6__0 )? ) )
            // InternalBomi.g:2387:1: ( ( rule__BoundaryObject__Group_6__0 )? )
            {
            // InternalBomi.g:2387:1: ( ( rule__BoundaryObject__Group_6__0 )? )
            // InternalBomi.g:2388:2: ( rule__BoundaryObject__Group_6__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_6()); 
            // InternalBomi.g:2389:2: ( rule__BoundaryObject__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBomi.g:2389:3: rule__BoundaryObject__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__6__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__7"
    // InternalBomi.g:2397:1: rule__BoundaryObject__Group__7 : rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8 ;
    public final void rule__BoundaryObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2401:1: ( rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8 )
            // InternalBomi.g:2402:2: rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__7"


    // $ANTLR start "rule__BoundaryObject__Group__7__Impl"
    // InternalBomi.g:2409:1: rule__BoundaryObject__Group__7__Impl : ( ( rule__BoundaryObject__Group_7__0 )? ) ;
    public final void rule__BoundaryObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2413:1: ( ( ( rule__BoundaryObject__Group_7__0 )? ) )
            // InternalBomi.g:2414:1: ( ( rule__BoundaryObject__Group_7__0 )? )
            {
            // InternalBomi.g:2414:1: ( ( rule__BoundaryObject__Group_7__0 )? )
            // InternalBomi.g:2415:2: ( rule__BoundaryObject__Group_7__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_7()); 
            // InternalBomi.g:2416:2: ( rule__BoundaryObject__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBomi.g:2416:3: rule__BoundaryObject__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__7__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__8"
    // InternalBomi.g:2424:1: rule__BoundaryObject__Group__8 : rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9 ;
    public final void rule__BoundaryObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2428:1: ( rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9 )
            // InternalBomi.g:2429:2: rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__8"


    // $ANTLR start "rule__BoundaryObject__Group__8__Impl"
    // InternalBomi.g:2436:1: rule__BoundaryObject__Group__8__Impl : ( ( rule__BoundaryObject__Group_8__0 )? ) ;
    public final void rule__BoundaryObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2440:1: ( ( ( rule__BoundaryObject__Group_8__0 )? ) )
            // InternalBomi.g:2441:1: ( ( rule__BoundaryObject__Group_8__0 )? )
            {
            // InternalBomi.g:2441:1: ( ( rule__BoundaryObject__Group_8__0 )? )
            // InternalBomi.g:2442:2: ( rule__BoundaryObject__Group_8__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_8()); 
            // InternalBomi.g:2443:2: ( rule__BoundaryObject__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBomi.g:2443:3: rule__BoundaryObject__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__8__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__9"
    // InternalBomi.g:2451:1: rule__BoundaryObject__Group__9 : rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10 ;
    public final void rule__BoundaryObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2455:1: ( rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10 )
            // InternalBomi.g:2456:2: rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__9"


    // $ANTLR start "rule__BoundaryObject__Group__9__Impl"
    // InternalBomi.g:2463:1: rule__BoundaryObject__Group__9__Impl : ( ( rule__BoundaryObject__Group_9__0 )? ) ;
    public final void rule__BoundaryObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2467:1: ( ( ( rule__BoundaryObject__Group_9__0 )? ) )
            // InternalBomi.g:2468:1: ( ( rule__BoundaryObject__Group_9__0 )? )
            {
            // InternalBomi.g:2468:1: ( ( rule__BoundaryObject__Group_9__0 )? )
            // InternalBomi.g:2469:2: ( rule__BoundaryObject__Group_9__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_9()); 
            // InternalBomi.g:2470:2: ( rule__BoundaryObject__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBomi.g:2470:3: rule__BoundaryObject__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__9__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__10"
    // InternalBomi.g:2478:1: rule__BoundaryObject__Group__10 : rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11 ;
    public final void rule__BoundaryObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2482:1: ( rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11 )
            // InternalBomi.g:2483:2: rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__10"


    // $ANTLR start "rule__BoundaryObject__Group__10__Impl"
    // InternalBomi.g:2490:1: rule__BoundaryObject__Group__10__Impl : ( ( rule__BoundaryObject__Group_10__0 )? ) ;
    public final void rule__BoundaryObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2494:1: ( ( ( rule__BoundaryObject__Group_10__0 )? ) )
            // InternalBomi.g:2495:1: ( ( rule__BoundaryObject__Group_10__0 )? )
            {
            // InternalBomi.g:2495:1: ( ( rule__BoundaryObject__Group_10__0 )? )
            // InternalBomi.g:2496:2: ( rule__BoundaryObject__Group_10__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_10()); 
            // InternalBomi.g:2497:2: ( rule__BoundaryObject__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBomi.g:2497:3: rule__BoundaryObject__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__10__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__11"
    // InternalBomi.g:2505:1: rule__BoundaryObject__Group__11 : rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12 ;
    public final void rule__BoundaryObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2509:1: ( rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12 )
            // InternalBomi.g:2510:2: rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__11"


    // $ANTLR start "rule__BoundaryObject__Group__11__Impl"
    // InternalBomi.g:2517:1: rule__BoundaryObject__Group__11__Impl : ( ( rule__BoundaryObject__Group_11__0 )? ) ;
    public final void rule__BoundaryObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2521:1: ( ( ( rule__BoundaryObject__Group_11__0 )? ) )
            // InternalBomi.g:2522:1: ( ( rule__BoundaryObject__Group_11__0 )? )
            {
            // InternalBomi.g:2522:1: ( ( rule__BoundaryObject__Group_11__0 )? )
            // InternalBomi.g:2523:2: ( rule__BoundaryObject__Group_11__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_11()); 
            // InternalBomi.g:2524:2: ( rule__BoundaryObject__Group_11__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBomi.g:2524:3: rule__BoundaryObject__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__11__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__12"
    // InternalBomi.g:2532:1: rule__BoundaryObject__Group__12 : rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13 ;
    public final void rule__BoundaryObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2536:1: ( rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13 )
            // InternalBomi.g:2537:2: rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__12"


    // $ANTLR start "rule__BoundaryObject__Group__12__Impl"
    // InternalBomi.g:2544:1: rule__BoundaryObject__Group__12__Impl : ( ( rule__BoundaryObject__Group_12__0 )? ) ;
    public final void rule__BoundaryObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2548:1: ( ( ( rule__BoundaryObject__Group_12__0 )? ) )
            // InternalBomi.g:2549:1: ( ( rule__BoundaryObject__Group_12__0 )? )
            {
            // InternalBomi.g:2549:1: ( ( rule__BoundaryObject__Group_12__0 )? )
            // InternalBomi.g:2550:2: ( rule__BoundaryObject__Group_12__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_12()); 
            // InternalBomi.g:2551:2: ( rule__BoundaryObject__Group_12__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBomi.g:2551:3: rule__BoundaryObject__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__12__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__13"
    // InternalBomi.g:2559:1: rule__BoundaryObject__Group__13 : rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14 ;
    public final void rule__BoundaryObject__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2563:1: ( rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14 )
            // InternalBomi.g:2564:2: rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__13"


    // $ANTLR start "rule__BoundaryObject__Group__13__Impl"
    // InternalBomi.g:2571:1: rule__BoundaryObject__Group__13__Impl : ( ( rule__BoundaryObject__Group_13__0 )? ) ;
    public final void rule__BoundaryObject__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2575:1: ( ( ( rule__BoundaryObject__Group_13__0 )? ) )
            // InternalBomi.g:2576:1: ( ( rule__BoundaryObject__Group_13__0 )? )
            {
            // InternalBomi.g:2576:1: ( ( rule__BoundaryObject__Group_13__0 )? )
            // InternalBomi.g:2577:2: ( rule__BoundaryObject__Group_13__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_13()); 
            // InternalBomi.g:2578:2: ( rule__BoundaryObject__Group_13__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBomi.g:2578:3: rule__BoundaryObject__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__13__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__14"
    // InternalBomi.g:2586:1: rule__BoundaryObject__Group__14 : rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15 ;
    public final void rule__BoundaryObject__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2590:1: ( rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15 )
            // InternalBomi.g:2591:2: rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__14"


    // $ANTLR start "rule__BoundaryObject__Group__14__Impl"
    // InternalBomi.g:2598:1: rule__BoundaryObject__Group__14__Impl : ( ( rule__BoundaryObject__Group_14__0 )? ) ;
    public final void rule__BoundaryObject__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2602:1: ( ( ( rule__BoundaryObject__Group_14__0 )? ) )
            // InternalBomi.g:2603:1: ( ( rule__BoundaryObject__Group_14__0 )? )
            {
            // InternalBomi.g:2603:1: ( ( rule__BoundaryObject__Group_14__0 )? )
            // InternalBomi.g:2604:2: ( rule__BoundaryObject__Group_14__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_14()); 
            // InternalBomi.g:2605:2: ( rule__BoundaryObject__Group_14__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBomi.g:2605:3: rule__BoundaryObject__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__14__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__15"
    // InternalBomi.g:2613:1: rule__BoundaryObject__Group__15 : rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16 ;
    public final void rule__BoundaryObject__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2617:1: ( rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16 )
            // InternalBomi.g:2618:2: rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__15"


    // $ANTLR start "rule__BoundaryObject__Group__15__Impl"
    // InternalBomi.g:2625:1: rule__BoundaryObject__Group__15__Impl : ( ( rule__BoundaryObject__Group_15__0 )? ) ;
    public final void rule__BoundaryObject__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2629:1: ( ( ( rule__BoundaryObject__Group_15__0 )? ) )
            // InternalBomi.g:2630:1: ( ( rule__BoundaryObject__Group_15__0 )? )
            {
            // InternalBomi.g:2630:1: ( ( rule__BoundaryObject__Group_15__0 )? )
            // InternalBomi.g:2631:2: ( rule__BoundaryObject__Group_15__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_15()); 
            // InternalBomi.g:2632:2: ( rule__BoundaryObject__Group_15__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBomi.g:2632:3: rule__BoundaryObject__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__15__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__16"
    // InternalBomi.g:2640:1: rule__BoundaryObject__Group__16 : rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17 ;
    public final void rule__BoundaryObject__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2644:1: ( rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17 )
            // InternalBomi.g:2645:2: rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__16"


    // $ANTLR start "rule__BoundaryObject__Group__16__Impl"
    // InternalBomi.g:2652:1: rule__BoundaryObject__Group__16__Impl : ( ( rule__BoundaryObject__Group_16__0 )? ) ;
    public final void rule__BoundaryObject__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2656:1: ( ( ( rule__BoundaryObject__Group_16__0 )? ) )
            // InternalBomi.g:2657:1: ( ( rule__BoundaryObject__Group_16__0 )? )
            {
            // InternalBomi.g:2657:1: ( ( rule__BoundaryObject__Group_16__0 )? )
            // InternalBomi.g:2658:2: ( rule__BoundaryObject__Group_16__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_16()); 
            // InternalBomi.g:2659:2: ( rule__BoundaryObject__Group_16__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==56) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBomi.g:2659:3: rule__BoundaryObject__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__16__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__17"
    // InternalBomi.g:2667:1: rule__BoundaryObject__Group__17 : rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18 ;
    public final void rule__BoundaryObject__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2671:1: ( rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18 )
            // InternalBomi.g:2672:2: rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18
            {
            pushFollow(FOLLOW_17);
            rule__BoundaryObject__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__17"


    // $ANTLR start "rule__BoundaryObject__Group__17__Impl"
    // InternalBomi.g:2679:1: rule__BoundaryObject__Group__17__Impl : ( ( rule__BoundaryObject__Group_17__0 )? ) ;
    public final void rule__BoundaryObject__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2683:1: ( ( ( rule__BoundaryObject__Group_17__0 )? ) )
            // InternalBomi.g:2684:1: ( ( rule__BoundaryObject__Group_17__0 )? )
            {
            // InternalBomi.g:2684:1: ( ( rule__BoundaryObject__Group_17__0 )? )
            // InternalBomi.g:2685:2: ( rule__BoundaryObject__Group_17__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_17()); 
            // InternalBomi.g:2686:2: ( rule__BoundaryObject__Group_17__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBomi.g:2686:3: rule__BoundaryObject__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundaryObject__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoundaryObjectAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__17__Impl"


    // $ANTLR start "rule__BoundaryObject__Group__18"
    // InternalBomi.g:2694:1: rule__BoundaryObject__Group__18 : rule__BoundaryObject__Group__18__Impl ;
    public final void rule__BoundaryObject__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2698:1: ( rule__BoundaryObject__Group__18__Impl )
            // InternalBomi.g:2699:2: rule__BoundaryObject__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__18"


    // $ANTLR start "rule__BoundaryObject__Group__18__Impl"
    // InternalBomi.g:2705:1: rule__BoundaryObject__Group__18__Impl : ( '}' ) ;
    public final void rule__BoundaryObject__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2709:1: ( ( '}' ) )
            // InternalBomi.g:2710:1: ( '}' )
            {
            // InternalBomi.g:2710:1: ( '}' )
            // InternalBomi.g:2711:2: '}'
            {
             before(grammarAccess.getBoundaryObjectAccess().getRightCurlyBracketKeyword_18()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group__18__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_4__0"
    // InternalBomi.g:2721:1: rule__BoundaryObject__Group_4__0 : rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1 ;
    public final void rule__BoundaryObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2725:1: ( rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1 )
            // InternalBomi.g:2726:2: rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__BoundaryObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_4__0"


    // $ANTLR start "rule__BoundaryObject__Group_4__0__Impl"
    // InternalBomi.g:2733:1: rule__BoundaryObject__Group_4__0__Impl : ( 'superType' ) ;
    public final void rule__BoundaryObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2737:1: ( ( 'superType' ) )
            // InternalBomi.g:2738:1: ( 'superType' )
            {
            // InternalBomi.g:2738:1: ( 'superType' )
            // InternalBomi.g:2739:2: 'superType'
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getSuperTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_4__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_4__1"
    // InternalBomi.g:2748:1: rule__BoundaryObject__Group_4__1 : rule__BoundaryObject__Group_4__1__Impl ;
    public final void rule__BoundaryObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2752:1: ( rule__BoundaryObject__Group_4__1__Impl )
            // InternalBomi.g:2753:2: rule__BoundaryObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_4__1"


    // $ANTLR start "rule__BoundaryObject__Group_4__1__Impl"
    // InternalBomi.g:2759:1: rule__BoundaryObject__Group_4__1__Impl : ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__BoundaryObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2763:1: ( ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) ) )
            // InternalBomi.g:2764:1: ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) )
            {
            // InternalBomi.g:2764:1: ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) )
            // InternalBomi.g:2765:2: ( rule__BoundaryObject__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeAssignment_4_1()); 
            // InternalBomi.g:2766:2: ( rule__BoundaryObject__SuperTypeAssignment_4_1 )
            // InternalBomi.g:2766:3: rule__BoundaryObject__SuperTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__SuperTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getSuperTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_4__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_5__0"
    // InternalBomi.g:2775:1: rule__BoundaryObject__Group_5__0 : rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1 ;
    public final void rule__BoundaryObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2779:1: ( rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1 )
            // InternalBomi.g:2780:2: rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__BoundaryObject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_5__0"


    // $ANTLR start "rule__BoundaryObject__Group_5__0__Impl"
    // InternalBomi.g:2787:1: rule__BoundaryObject__Group_5__0__Impl : ( 'purpose' ) ;
    public final void rule__BoundaryObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2791:1: ( ( 'purpose' ) )
            // InternalBomi.g:2792:1: ( 'purpose' )
            {
            // InternalBomi.g:2792:1: ( 'purpose' )
            // InternalBomi.g:2793:2: 'purpose'
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getPurposeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_5__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_5__1"
    // InternalBomi.g:2802:1: rule__BoundaryObject__Group_5__1 : rule__BoundaryObject__Group_5__1__Impl ;
    public final void rule__BoundaryObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2806:1: ( rule__BoundaryObject__Group_5__1__Impl )
            // InternalBomi.g:2807:2: rule__BoundaryObject__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_5__1"


    // $ANTLR start "rule__BoundaryObject__Group_5__1__Impl"
    // InternalBomi.g:2813:1: rule__BoundaryObject__Group_5__1__Impl : ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) ) ;
    public final void rule__BoundaryObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2817:1: ( ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) ) )
            // InternalBomi.g:2818:1: ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) )
            {
            // InternalBomi.g:2818:1: ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) )
            // InternalBomi.g:2819:2: ( rule__BoundaryObject__PurposeAssignment_5_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeAssignment_5_1()); 
            // InternalBomi.g:2820:2: ( rule__BoundaryObject__PurposeAssignment_5_1 )
            // InternalBomi.g:2820:3: rule__BoundaryObject__PurposeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__PurposeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getPurposeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_5__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_6__0"
    // InternalBomi.g:2829:1: rule__BoundaryObject__Group_6__0 : rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1 ;
    public final void rule__BoundaryObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2833:1: ( rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1 )
            // InternalBomi.g:2834:2: rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__BoundaryObject__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_6__0"


    // $ANTLR start "rule__BoundaryObject__Group_6__0__Impl"
    // InternalBomi.g:2841:1: rule__BoundaryObject__Group_6__0__Impl : ( 'levelOfDetail' ) ;
    public final void rule__BoundaryObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2845:1: ( ( 'levelOfDetail' ) )
            // InternalBomi.g:2846:1: ( 'levelOfDetail' )
            {
            // InternalBomi.g:2846:1: ( 'levelOfDetail' )
            // InternalBomi.g:2847:2: 'levelOfDetail'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_6__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_6__1"
    // InternalBomi.g:2856:1: rule__BoundaryObject__Group_6__1 : rule__BoundaryObject__Group_6__1__Impl ;
    public final void rule__BoundaryObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2860:1: ( rule__BoundaryObject__Group_6__1__Impl )
            // InternalBomi.g:2861:2: rule__BoundaryObject__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_6__1"


    // $ANTLR start "rule__BoundaryObject__Group_6__1__Impl"
    // InternalBomi.g:2867:1: rule__BoundaryObject__Group_6__1__Impl : ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) ) ;
    public final void rule__BoundaryObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2871:1: ( ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) ) )
            // InternalBomi.g:2872:1: ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) )
            {
            // InternalBomi.g:2872:1: ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) )
            // InternalBomi.g:2873:2: ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailAssignment_6_1()); 
            // InternalBomi.g:2874:2: ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 )
            // InternalBomi.g:2874:3: rule__BoundaryObject__LevelOfDetailAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__LevelOfDetailAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_6__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_7__0"
    // InternalBomi.g:2883:1: rule__BoundaryObject__Group_7__0 : rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1 ;
    public final void rule__BoundaryObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2887:1: ( rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1 )
            // InternalBomi.g:2888:2: rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__BoundaryObject__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_7__0"


    // $ANTLR start "rule__BoundaryObject__Group_7__0__Impl"
    // InternalBomi.g:2895:1: rule__BoundaryObject__Group_7__0__Impl : ( 'frequencyOfChange' ) ;
    public final void rule__BoundaryObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2899:1: ( ( 'frequencyOfChange' ) )
            // InternalBomi.g:2900:1: ( 'frequencyOfChange' )
            {
            // InternalBomi.g:2900:1: ( 'frequencyOfChange' )
            // InternalBomi.g:2901:2: 'frequencyOfChange'
            {
             before(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_7__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_7__1"
    // InternalBomi.g:2910:1: rule__BoundaryObject__Group_7__1 : rule__BoundaryObject__Group_7__1__Impl ;
    public final void rule__BoundaryObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2914:1: ( rule__BoundaryObject__Group_7__1__Impl )
            // InternalBomi.g:2915:2: rule__BoundaryObject__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_7__1"


    // $ANTLR start "rule__BoundaryObject__Group_7__1__Impl"
    // InternalBomi.g:2921:1: rule__BoundaryObject__Group_7__1__Impl : ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) ) ;
    public final void rule__BoundaryObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2925:1: ( ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) ) )
            // InternalBomi.g:2926:1: ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) )
            {
            // InternalBomi.g:2926:1: ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) )
            // InternalBomi.g:2927:2: ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeAssignment_7_1()); 
            // InternalBomi.g:2928:2: ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 )
            // InternalBomi.g:2928:3: rule__BoundaryObject__FrequencyOfChangeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__FrequencyOfChangeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_7__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_8__0"
    // InternalBomi.g:2937:1: rule__BoundaryObject__Group_8__0 : rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1 ;
    public final void rule__BoundaryObject__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2941:1: ( rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1 )
            // InternalBomi.g:2942:2: rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__BoundaryObject__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_8__0"


    // $ANTLR start "rule__BoundaryObject__Group_8__0__Impl"
    // InternalBomi.g:2949:1: rule__BoundaryObject__Group_8__0__Impl : ( 'modularity' ) ;
    public final void rule__BoundaryObject__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2953:1: ( ( 'modularity' ) )
            // InternalBomi.g:2954:1: ( 'modularity' )
            {
            // InternalBomi.g:2954:1: ( 'modularity' )
            // InternalBomi.g:2955:2: 'modularity'
            {
             before(grammarAccess.getBoundaryObjectAccess().getModularityKeyword_8_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getModularityKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_8__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_8__1"
    // InternalBomi.g:2964:1: rule__BoundaryObject__Group_8__1 : rule__BoundaryObject__Group_8__1__Impl ;
    public final void rule__BoundaryObject__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2968:1: ( rule__BoundaryObject__Group_8__1__Impl )
            // InternalBomi.g:2969:2: rule__BoundaryObject__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_8__1"


    // $ANTLR start "rule__BoundaryObject__Group_8__1__Impl"
    // InternalBomi.g:2975:1: rule__BoundaryObject__Group_8__1__Impl : ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) ) ;
    public final void rule__BoundaryObject__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2979:1: ( ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) ) )
            // InternalBomi.g:2980:1: ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) )
            {
            // InternalBomi.g:2980:1: ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) )
            // InternalBomi.g:2981:2: ( rule__BoundaryObject__ModularityAssignment_8_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getModularityAssignment_8_1()); 
            // InternalBomi.g:2982:2: ( rule__BoundaryObject__ModularityAssignment_8_1 )
            // InternalBomi.g:2982:3: rule__BoundaryObject__ModularityAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__ModularityAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getModularityAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_8__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_9__0"
    // InternalBomi.g:2991:1: rule__BoundaryObject__Group_9__0 : rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1 ;
    public final void rule__BoundaryObject__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2995:1: ( rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1 )
            // InternalBomi.g:2996:2: rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1
            {
            pushFollow(FOLLOW_19);
            rule__BoundaryObject__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_9__0"


    // $ANTLR start "rule__BoundaryObject__Group_9__0__Impl"
    // InternalBomi.g:3003:1: rule__BoundaryObject__Group_9__0__Impl : ( 'maintainability' ) ;
    public final void rule__BoundaryObject__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3007:1: ( ( 'maintainability' ) )
            // InternalBomi.g:3008:1: ( 'maintainability' )
            {
            // InternalBomi.g:3008:1: ( 'maintainability' )
            // InternalBomi.g:3009:2: 'maintainability'
            {
             before(grammarAccess.getBoundaryObjectAccess().getMaintainabilityKeyword_9_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getMaintainabilityKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_9__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_9__1"
    // InternalBomi.g:3018:1: rule__BoundaryObject__Group_9__1 : rule__BoundaryObject__Group_9__1__Impl ;
    public final void rule__BoundaryObject__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3022:1: ( rule__BoundaryObject__Group_9__1__Impl )
            // InternalBomi.g:3023:2: rule__BoundaryObject__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_9__1"


    // $ANTLR start "rule__BoundaryObject__Group_9__1__Impl"
    // InternalBomi.g:3029:1: rule__BoundaryObject__Group_9__1__Impl : ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) ) ;
    public final void rule__BoundaryObject__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3033:1: ( ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) ) )
            // InternalBomi.g:3034:1: ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) )
            {
            // InternalBomi.g:3034:1: ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) )
            // InternalBomi.g:3035:2: ( rule__BoundaryObject__MaintainabilityAssignment_9_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getMaintainabilityAssignment_9_1()); 
            // InternalBomi.g:3036:2: ( rule__BoundaryObject__MaintainabilityAssignment_9_1 )
            // InternalBomi.g:3036:3: rule__BoundaryObject__MaintainabilityAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__MaintainabilityAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getMaintainabilityAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_9__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_10__0"
    // InternalBomi.g:3045:1: rule__BoundaryObject__Group_10__0 : rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1 ;
    public final void rule__BoundaryObject__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3049:1: ( rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1 )
            // InternalBomi.g:3050:2: rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1
            {
            pushFollow(FOLLOW_19);
            rule__BoundaryObject__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_10__0"


    // $ANTLR start "rule__BoundaryObject__Group_10__0__Impl"
    // InternalBomi.g:3057:1: rule__BoundaryObject__Group_10__0__Impl : ( 'prescriptive' ) ;
    public final void rule__BoundaryObject__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3061:1: ( ( 'prescriptive' ) )
            // InternalBomi.g:3062:1: ( 'prescriptive' )
            {
            // InternalBomi.g:3062:1: ( 'prescriptive' )
            // InternalBomi.g:3063:2: 'prescriptive'
            {
             before(grammarAccess.getBoundaryObjectAccess().getPrescriptiveKeyword_10_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getPrescriptiveKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_10__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_10__1"
    // InternalBomi.g:3072:1: rule__BoundaryObject__Group_10__1 : rule__BoundaryObject__Group_10__1__Impl ;
    public final void rule__BoundaryObject__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3076:1: ( rule__BoundaryObject__Group_10__1__Impl )
            // InternalBomi.g:3077:2: rule__BoundaryObject__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_10__1"


    // $ANTLR start "rule__BoundaryObject__Group_10__1__Impl"
    // InternalBomi.g:3083:1: rule__BoundaryObject__Group_10__1__Impl : ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) ) ;
    public final void rule__BoundaryObject__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3087:1: ( ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) ) )
            // InternalBomi.g:3088:1: ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) )
            {
            // InternalBomi.g:3088:1: ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) )
            // InternalBomi.g:3089:2: ( rule__BoundaryObject__PrescriptiveAssignment_10_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getPrescriptiveAssignment_10_1()); 
            // InternalBomi.g:3090:2: ( rule__BoundaryObject__PrescriptiveAssignment_10_1 )
            // InternalBomi.g:3090:3: rule__BoundaryObject__PrescriptiveAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__PrescriptiveAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getPrescriptiveAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_10__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_11__0"
    // InternalBomi.g:3099:1: rule__BoundaryObject__Group_11__0 : rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1 ;
    public final void rule__BoundaryObject__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3103:1: ( rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1 )
            // InternalBomi.g:3104:2: rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1
            {
            pushFollow(FOLLOW_20);
            rule__BoundaryObject__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_11__0"


    // $ANTLR start "rule__BoundaryObject__Group_11__0__Impl"
    // InternalBomi.g:3111:1: rule__BoundaryObject__Group_11__0__Impl : ( 'lifecycleStage' ) ;
    public final void rule__BoundaryObject__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3115:1: ( ( 'lifecycleStage' ) )
            // InternalBomi.g:3116:1: ( 'lifecycleStage' )
            {
            // InternalBomi.g:3116:1: ( 'lifecycleStage' )
            // InternalBomi.g:3117:2: 'lifecycleStage'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLifecycleStageKeyword_11_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getLifecycleStageKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_11__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_11__1"
    // InternalBomi.g:3126:1: rule__BoundaryObject__Group_11__1 : rule__BoundaryObject__Group_11__1__Impl ;
    public final void rule__BoundaryObject__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3130:1: ( rule__BoundaryObject__Group_11__1__Impl )
            // InternalBomi.g:3131:2: rule__BoundaryObject__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_11__1"


    // $ANTLR start "rule__BoundaryObject__Group_11__1__Impl"
    // InternalBomi.g:3137:1: rule__BoundaryObject__Group_11__1__Impl : ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) ) ;
    public final void rule__BoundaryObject__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3141:1: ( ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) ) )
            // InternalBomi.g:3142:1: ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) )
            {
            // InternalBomi.g:3142:1: ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) )
            // InternalBomi.g:3143:2: ( rule__BoundaryObject__LifecycleStageAssignment_11_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getLifecycleStageAssignment_11_1()); 
            // InternalBomi.g:3144:2: ( rule__BoundaryObject__LifecycleStageAssignment_11_1 )
            // InternalBomi.g:3144:3: rule__BoundaryObject__LifecycleStageAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__LifecycleStageAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getLifecycleStageAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_11__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_12__0"
    // InternalBomi.g:3153:1: rule__BoundaryObject__Group_12__0 : rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1 ;
    public final void rule__BoundaryObject__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3157:1: ( rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1 )
            // InternalBomi.g:3158:2: rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1
            {
            pushFollow(FOLLOW_16);
            rule__BoundaryObject__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_12__0"


    // $ANTLR start "rule__BoundaryObject__Group_12__0__Impl"
    // InternalBomi.g:3165:1: rule__BoundaryObject__Group_12__0__Impl : ( 'representationFormat' ) ;
    public final void rule__BoundaryObject__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3169:1: ( ( 'representationFormat' ) )
            // InternalBomi.g:3170:1: ( 'representationFormat' )
            {
            // InternalBomi.g:3170:1: ( 'representationFormat' )
            // InternalBomi.g:3171:2: 'representationFormat'
            {
             before(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatKeyword_12_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_12__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_12__1"
    // InternalBomi.g:3180:1: rule__BoundaryObject__Group_12__1 : rule__BoundaryObject__Group_12__1__Impl ;
    public final void rule__BoundaryObject__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3184:1: ( rule__BoundaryObject__Group_12__1__Impl )
            // InternalBomi.g:3185:2: rule__BoundaryObject__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_12__1"


    // $ANTLR start "rule__BoundaryObject__Group_12__1__Impl"
    // InternalBomi.g:3191:1: rule__BoundaryObject__Group_12__1__Impl : ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) ) ;
    public final void rule__BoundaryObject__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3195:1: ( ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) ) )
            // InternalBomi.g:3196:1: ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) )
            {
            // InternalBomi.g:3196:1: ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) )
            // InternalBomi.g:3197:2: ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatAssignment_12_1()); 
            // InternalBomi.g:3198:2: ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 )
            // InternalBomi.g:3198:3: rule__BoundaryObject__RepresentationFormatAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__RepresentationFormatAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_12__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_13__0"
    // InternalBomi.g:3207:1: rule__BoundaryObject__Group_13__0 : rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1 ;
    public final void rule__BoundaryObject__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3211:1: ( rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1 )
            // InternalBomi.g:3212:2: rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1
            {
            pushFollow(FOLLOW_16);
            rule__BoundaryObject__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_13__0"


    // $ANTLR start "rule__BoundaryObject__Group_13__0__Impl"
    // InternalBomi.g:3219:1: rule__BoundaryObject__Group_13__0__Impl : ( 'tooling' ) ;
    public final void rule__BoundaryObject__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3223:1: ( ( 'tooling' ) )
            // InternalBomi.g:3224:1: ( 'tooling' )
            {
            // InternalBomi.g:3224:1: ( 'tooling' )
            // InternalBomi.g:3225:2: 'tooling'
            {
             before(grammarAccess.getBoundaryObjectAccess().getToolingKeyword_13_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getToolingKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_13__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_13__1"
    // InternalBomi.g:3234:1: rule__BoundaryObject__Group_13__1 : rule__BoundaryObject__Group_13__1__Impl ;
    public final void rule__BoundaryObject__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3238:1: ( rule__BoundaryObject__Group_13__1__Impl )
            // InternalBomi.g:3239:2: rule__BoundaryObject__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_13__1"


    // $ANTLR start "rule__BoundaryObject__Group_13__1__Impl"
    // InternalBomi.g:3245:1: rule__BoundaryObject__Group_13__1__Impl : ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) ) ;
    public final void rule__BoundaryObject__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3249:1: ( ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) ) )
            // InternalBomi.g:3250:1: ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) )
            {
            // InternalBomi.g:3250:1: ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) )
            // InternalBomi.g:3251:2: ( rule__BoundaryObject__ToolingAssignment_13_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getToolingAssignment_13_1()); 
            // InternalBomi.g:3252:2: ( rule__BoundaryObject__ToolingAssignment_13_1 )
            // InternalBomi.g:3252:3: rule__BoundaryObject__ToolingAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__ToolingAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getToolingAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_13__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_14__0"
    // InternalBomi.g:3261:1: rule__BoundaryObject__Group_14__0 : rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1 ;
    public final void rule__BoundaryObject__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3265:1: ( rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1 )
            // InternalBomi.g:3266:2: rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1
            {
            pushFollow(FOLLOW_16);
            rule__BoundaryObject__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_14__0"


    // $ANTLR start "rule__BoundaryObject__Group_14__0__Impl"
    // InternalBomi.g:3273:1: rule__BoundaryObject__Group_14__0__Impl : ( 'versioning' ) ;
    public final void rule__BoundaryObject__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3277:1: ( ( 'versioning' ) )
            // InternalBomi.g:3278:1: ( 'versioning' )
            {
            // InternalBomi.g:3278:1: ( 'versioning' )
            // InternalBomi.g:3279:2: 'versioning'
            {
             before(grammarAccess.getBoundaryObjectAccess().getVersioningKeyword_14_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getVersioningKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_14__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_14__1"
    // InternalBomi.g:3288:1: rule__BoundaryObject__Group_14__1 : rule__BoundaryObject__Group_14__1__Impl ;
    public final void rule__BoundaryObject__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3292:1: ( rule__BoundaryObject__Group_14__1__Impl )
            // InternalBomi.g:3293:2: rule__BoundaryObject__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_14__1"


    // $ANTLR start "rule__BoundaryObject__Group_14__1__Impl"
    // InternalBomi.g:3299:1: rule__BoundaryObject__Group_14__1__Impl : ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) ) ;
    public final void rule__BoundaryObject__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3303:1: ( ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) ) )
            // InternalBomi.g:3304:1: ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) )
            {
            // InternalBomi.g:3304:1: ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) )
            // InternalBomi.g:3305:2: ( rule__BoundaryObject__VersioningAssignment_14_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getVersioningAssignment_14_1()); 
            // InternalBomi.g:3306:2: ( rule__BoundaryObject__VersioningAssignment_14_1 )
            // InternalBomi.g:3306:3: rule__BoundaryObject__VersioningAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__VersioningAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getVersioningAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_14__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_15__0"
    // InternalBomi.g:3315:1: rule__BoundaryObject__Group_15__0 : rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1 ;
    public final void rule__BoundaryObject__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3319:1: ( rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1 )
            // InternalBomi.g:3320:2: rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1
            {
            pushFollow(FOLLOW_16);
            rule__BoundaryObject__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_15__0"


    // $ANTLR start "rule__BoundaryObject__Group_15__0__Impl"
    // InternalBomi.g:3327:1: rule__BoundaryObject__Group_15__0__Impl : ( 'upToDate' ) ;
    public final void rule__BoundaryObject__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3331:1: ( ( 'upToDate' ) )
            // InternalBomi.g:3332:1: ( 'upToDate' )
            {
            // InternalBomi.g:3332:1: ( 'upToDate' )
            // InternalBomi.g:3333:2: 'upToDate'
            {
             before(grammarAccess.getBoundaryObjectAccess().getUpToDateKeyword_15_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getUpToDateKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_15__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_15__1"
    // InternalBomi.g:3342:1: rule__BoundaryObject__Group_15__1 : rule__BoundaryObject__Group_15__1__Impl ;
    public final void rule__BoundaryObject__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3346:1: ( rule__BoundaryObject__Group_15__1__Impl )
            // InternalBomi.g:3347:2: rule__BoundaryObject__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_15__1"


    // $ANTLR start "rule__BoundaryObject__Group_15__1__Impl"
    // InternalBomi.g:3353:1: rule__BoundaryObject__Group_15__1__Impl : ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) ) ;
    public final void rule__BoundaryObject__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3357:1: ( ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) ) )
            // InternalBomi.g:3358:1: ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) )
            {
            // InternalBomi.g:3358:1: ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) )
            // InternalBomi.g:3359:2: ( rule__BoundaryObject__UpToDateAssignment_15_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getUpToDateAssignment_15_1()); 
            // InternalBomi.g:3360:2: ( rule__BoundaryObject__UpToDateAssignment_15_1 )
            // InternalBomi.g:3360:3: rule__BoundaryObject__UpToDateAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__UpToDateAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getUpToDateAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_15__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_16__0"
    // InternalBomi.g:3369:1: rule__BoundaryObject__Group_16__0 : rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1 ;
    public final void rule__BoundaryObject__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3373:1: ( rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1 )
            // InternalBomi.g:3374:2: rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1
            {
            pushFollow(FOLLOW_19);
            rule__BoundaryObject__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_16__0"


    // $ANTLR start "rule__BoundaryObject__Group_16__0__Impl"
    // InternalBomi.g:3381:1: rule__BoundaryObject__Group_16__0__Impl : ( 'internalConsistency' ) ;
    public final void rule__BoundaryObject__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3385:1: ( ( 'internalConsistency' ) )
            // InternalBomi.g:3386:1: ( 'internalConsistency' )
            {
            // InternalBomi.g:3386:1: ( 'internalConsistency' )
            // InternalBomi.g:3387:2: 'internalConsistency'
            {
             before(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyKeyword_16_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_16__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_16__1"
    // InternalBomi.g:3396:1: rule__BoundaryObject__Group_16__1 : rule__BoundaryObject__Group_16__1__Impl ;
    public final void rule__BoundaryObject__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3400:1: ( rule__BoundaryObject__Group_16__1__Impl )
            // InternalBomi.g:3401:2: rule__BoundaryObject__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_16__1"


    // $ANTLR start "rule__BoundaryObject__Group_16__1__Impl"
    // InternalBomi.g:3407:1: rule__BoundaryObject__Group_16__1__Impl : ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) ) ;
    public final void rule__BoundaryObject__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3411:1: ( ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) ) )
            // InternalBomi.g:3412:1: ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) )
            {
            // InternalBomi.g:3412:1: ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) )
            // InternalBomi.g:3413:2: ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyAssignment_16_1()); 
            // InternalBomi.g:3414:2: ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 )
            // InternalBomi.g:3414:3: rule__BoundaryObject__InternalConsistencyAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__InternalConsistencyAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_16__1__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_17__0"
    // InternalBomi.g:3423:1: rule__BoundaryObject__Group_17__0 : rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1 ;
    public final void rule__BoundaryObject__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3427:1: ( rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1 )
            // InternalBomi.g:3428:2: rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1
            {
            pushFollow(FOLLOW_19);
            rule__BoundaryObject__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_17__0"


    // $ANTLR start "rule__BoundaryObject__Group_17__0__Impl"
    // InternalBomi.g:3435:1: rule__BoundaryObject__Group_17__0__Impl : ( 'externalConsistency' ) ;
    public final void rule__BoundaryObject__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3439:1: ( ( 'externalConsistency' ) )
            // InternalBomi.g:3440:1: ( 'externalConsistency' )
            {
            // InternalBomi.g:3440:1: ( 'externalConsistency' )
            // InternalBomi.g:3441:2: 'externalConsistency'
            {
             before(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyKeyword_17_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_17__0__Impl"


    // $ANTLR start "rule__BoundaryObject__Group_17__1"
    // InternalBomi.g:3450:1: rule__BoundaryObject__Group_17__1 : rule__BoundaryObject__Group_17__1__Impl ;
    public final void rule__BoundaryObject__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3454:1: ( rule__BoundaryObject__Group_17__1__Impl )
            // InternalBomi.g:3455:2: rule__BoundaryObject__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_17__1"


    // $ANTLR start "rule__BoundaryObject__Group_17__1__Impl"
    // InternalBomi.g:3461:1: rule__BoundaryObject__Group_17__1__Impl : ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) ) ;
    public final void rule__BoundaryObject__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3465:1: ( ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) ) )
            // InternalBomi.g:3466:1: ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) )
            {
            // InternalBomi.g:3466:1: ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) )
            // InternalBomi.g:3467:2: ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyAssignment_17_1()); 
            // InternalBomi.g:3468:2: ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 )
            // InternalBomi.g:3468:3: rule__BoundaryObject__ExternalConsistencyAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__ExternalConsistencyAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__Group_17__1__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group__0"
    // InternalBomi.g:3477:1: rule__MethodologicalIsland__Group__0 : rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1 ;
    public final void rule__MethodologicalIsland__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3481:1: ( rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1 )
            // InternalBomi.g:3482:2: rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MethodologicalIsland__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__0"


    // $ANTLR start "rule__MethodologicalIsland__Group__0__Impl"
    // InternalBomi.g:3489:1: rule__MethodologicalIsland__Group__0__Impl : ( () ) ;
    public final void rule__MethodologicalIsland__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3493:1: ( ( () ) )
            // InternalBomi.g:3494:1: ( () )
            {
            // InternalBomi.g:3494:1: ( () )
            // InternalBomi.g:3495:2: ()
            {
             before(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandAction_0()); 
            // InternalBomi.g:3496:2: ()
            // InternalBomi.g:3496:3: 
            {
            }

             after(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__0__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group__1"
    // InternalBomi.g:3504:1: rule__MethodologicalIsland__Group__1 : rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2 ;
    public final void rule__MethodologicalIsland__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3508:1: ( rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2 )
            // InternalBomi.g:3509:2: rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MethodologicalIsland__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__1"


    // $ANTLR start "rule__MethodologicalIsland__Group__1__Impl"
    // InternalBomi.g:3516:1: rule__MethodologicalIsland__Group__1__Impl : ( 'MethodologicalIsland' ) ;
    public final void rule__MethodologicalIsland__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3520:1: ( ( 'MethodologicalIsland' ) )
            // InternalBomi.g:3521:1: ( 'MethodologicalIsland' )
            {
            // InternalBomi.g:3521:1: ( 'MethodologicalIsland' )
            // InternalBomi.g:3522:2: 'MethodologicalIsland'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__1__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group__2"
    // InternalBomi.g:3531:1: rule__MethodologicalIsland__Group__2 : rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3 ;
    public final void rule__MethodologicalIsland__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3535:1: ( rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3 )
            // InternalBomi.g:3536:2: rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MethodologicalIsland__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__2"


    // $ANTLR start "rule__MethodologicalIsland__Group__2__Impl"
    // InternalBomi.g:3543:1: rule__MethodologicalIsland__Group__2__Impl : ( ( rule__MethodologicalIsland__NameAssignment_2 ) ) ;
    public final void rule__MethodologicalIsland__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3547:1: ( ( ( rule__MethodologicalIsland__NameAssignment_2 ) ) )
            // InternalBomi.g:3548:1: ( ( rule__MethodologicalIsland__NameAssignment_2 ) )
            {
            // InternalBomi.g:3548:1: ( ( rule__MethodologicalIsland__NameAssignment_2 ) )
            // InternalBomi.g:3549:2: ( rule__MethodologicalIsland__NameAssignment_2 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getNameAssignment_2()); 
            // InternalBomi.g:3550:2: ( rule__MethodologicalIsland__NameAssignment_2 )
            // InternalBomi.g:3550:3: rule__MethodologicalIsland__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodologicalIslandAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__2__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group__3"
    // InternalBomi.g:3558:1: rule__MethodologicalIsland__Group__3 : rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4 ;
    public final void rule__MethodologicalIsland__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3562:1: ( rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4 )
            // InternalBomi.g:3563:2: rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__MethodologicalIsland__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__3"


    // $ANTLR start "rule__MethodologicalIsland__Group__3__Impl"
    // InternalBomi.g:3570:1: rule__MethodologicalIsland__Group__3__Impl : ( '{' ) ;
    public final void rule__MethodologicalIsland__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3574:1: ( ( '{' ) )
            // InternalBomi.g:3575:1: ( '{' )
            {
            // InternalBomi.g:3575:1: ( '{' )
            // InternalBomi.g:3576:2: '{'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMethodologicalIslandAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__3__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group__4"
    // InternalBomi.g:3585:1: rule__MethodologicalIsland__Group__4 : rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5 ;
    public final void rule__MethodologicalIsland__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3589:1: ( rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5 )
            // InternalBomi.g:3590:2: rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__MethodologicalIsland__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__4"


    // $ANTLR start "rule__MethodologicalIsland__Group__4__Impl"
    // InternalBomi.g:3597:1: rule__MethodologicalIsland__Group__4__Impl : ( ( rule__MethodologicalIsland__Group_4__0 )? ) ;
    public final void rule__MethodologicalIsland__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3601:1: ( ( ( rule__MethodologicalIsland__Group_4__0 )? ) )
            // InternalBomi.g:3602:1: ( ( rule__MethodologicalIsland__Group_4__0 )? )
            {
            // InternalBomi.g:3602:1: ( ( rule__MethodologicalIsland__Group_4__0 )? )
            // InternalBomi.g:3603:2: ( rule__MethodologicalIsland__Group_4__0 )?
            {
             before(grammarAccess.getMethodologicalIslandAccess().getGroup_4()); 
            // InternalBomi.g:3604:2: ( rule__MethodologicalIsland__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==59) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBomi.g:3604:3: rule__MethodologicalIsland__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodologicalIsland__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodologicalIslandAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__4__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group__5"
    // InternalBomi.g:3612:1: rule__MethodologicalIsland__Group__5 : rule__MethodologicalIsland__Group__5__Impl ;
    public final void rule__MethodologicalIsland__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3616:1: ( rule__MethodologicalIsland__Group__5__Impl )
            // InternalBomi.g:3617:2: rule__MethodologicalIsland__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__5"


    // $ANTLR start "rule__MethodologicalIsland__Group__5__Impl"
    // InternalBomi.g:3623:1: rule__MethodologicalIsland__Group__5__Impl : ( '}' ) ;
    public final void rule__MethodologicalIsland__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3627:1: ( ( '}' ) )
            // InternalBomi.g:3628:1: ( '}' )
            {
            // InternalBomi.g:3628:1: ( '}' )
            // InternalBomi.g:3629:2: '}'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMethodologicalIslandAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group__5__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group_4__0"
    // InternalBomi.g:3639:1: rule__MethodologicalIsland__Group_4__0 : rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1 ;
    public final void rule__MethodologicalIsland__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3643:1: ( rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1 )
            // InternalBomi.g:3644:2: rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__MethodologicalIsland__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group_4__0"


    // $ANTLR start "rule__MethodologicalIsland__Group_4__0__Impl"
    // InternalBomi.g:3651:1: rule__MethodologicalIsland__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__MethodologicalIsland__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3655:1: ( ( 'type' ) )
            // InternalBomi.g:3656:1: ( 'type' )
            {
            // InternalBomi.g:3656:1: ( 'type' )
            // InternalBomi.g:3657:2: 'type'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getTypeKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMethodologicalIslandAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group_4__0__Impl"


    // $ANTLR start "rule__MethodologicalIsland__Group_4__1"
    // InternalBomi.g:3666:1: rule__MethodologicalIsland__Group_4__1 : rule__MethodologicalIsland__Group_4__1__Impl ;
    public final void rule__MethodologicalIsland__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3670:1: ( rule__MethodologicalIsland__Group_4__1__Impl )
            // InternalBomi.g:3671:2: rule__MethodologicalIsland__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group_4__1"


    // $ANTLR start "rule__MethodologicalIsland__Group_4__1__Impl"
    // InternalBomi.g:3677:1: rule__MethodologicalIsland__Group_4__1__Impl : ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) ) ;
    public final void rule__MethodologicalIsland__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3681:1: ( ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) ) )
            // InternalBomi.g:3682:1: ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) )
            {
            // InternalBomi.g:3682:1: ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) )
            // InternalBomi.g:3683:2: ( rule__MethodologicalIsland__TypeAssignment_4_1 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getTypeAssignment_4_1()); 
            // InternalBomi.g:3684:2: ( rule__MethodologicalIsland__TypeAssignment_4_1 )
            // InternalBomi.g:3684:3: rule__MethodologicalIsland__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodologicalIsland__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodologicalIslandAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__Group_4__1__Impl"


    // $ANTLR start "rule__GovernanceTeam__Group__0"
    // InternalBomi.g:3693:1: rule__GovernanceTeam__Group__0 : rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1 ;
    public final void rule__GovernanceTeam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3697:1: ( rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1 )
            // InternalBomi.g:3698:2: rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GovernanceTeam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GovernanceTeam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GovernanceTeam__Group__0"


    // $ANTLR start "rule__GovernanceTeam__Group__0__Impl"
    // InternalBomi.g:3705:1: rule__GovernanceTeam__Group__0__Impl : ( () ) ;
    public final void rule__GovernanceTeam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3709:1: ( ( () ) )
            // InternalBomi.g:3710:1: ( () )
            {
            // InternalBomi.g:3710:1: ( () )
            // InternalBomi.g:3711:2: ()
            {
             before(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamAction_0()); 
            // InternalBomi.g:3712:2: ()
            // InternalBomi.g:3712:3: 
            {
            }

             after(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GovernanceTeam__Group__0__Impl"


    // $ANTLR start "rule__GovernanceTeam__Group__1"
    // InternalBomi.g:3720:1: rule__GovernanceTeam__Group__1 : rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2 ;
    public final void rule__GovernanceTeam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3724:1: ( rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2 )
            // InternalBomi.g:3725:2: rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__GovernanceTeam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GovernanceTeam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GovernanceTeam__Group__1"


    // $ANTLR start "rule__GovernanceTeam__Group__1__Impl"
    // InternalBomi.g:3732:1: rule__GovernanceTeam__Group__1__Impl : ( 'GovernanceTeam' ) ;
    public final void rule__GovernanceTeam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3736:1: ( ( 'GovernanceTeam' ) )
            // InternalBomi.g:3737:1: ( 'GovernanceTeam' )
            {
            // InternalBomi.g:3737:1: ( 'GovernanceTeam' )
            // InternalBomi.g:3738:2: 'GovernanceTeam'
            {
             before(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GovernanceTeam__Group__1__Impl"


    // $ANTLR start "rule__GovernanceTeam__Group__2"
    // InternalBomi.g:3747:1: rule__GovernanceTeam__Group__2 : rule__GovernanceTeam__Group__2__Impl ;
    public final void rule__GovernanceTeam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3751:1: ( rule__GovernanceTeam__Group__2__Impl )
            // InternalBomi.g:3752:2: rule__GovernanceTeam__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GovernanceTeam__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GovernanceTeam__Group__2"


    // $ANTLR start "rule__GovernanceTeam__Group__2__Impl"
    // InternalBomi.g:3758:1: rule__GovernanceTeam__Group__2__Impl : ( ( rule__GovernanceTeam__NameAssignment_2 ) ) ;
    public final void rule__GovernanceTeam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3762:1: ( ( ( rule__GovernanceTeam__NameAssignment_2 ) ) )
            // InternalBomi.g:3763:1: ( ( rule__GovernanceTeam__NameAssignment_2 ) )
            {
            // InternalBomi.g:3763:1: ( ( rule__GovernanceTeam__NameAssignment_2 ) )
            // InternalBomi.g:3764:2: ( rule__GovernanceTeam__NameAssignment_2 )
            {
             before(grammarAccess.getGovernanceTeamAccess().getNameAssignment_2()); 
            // InternalBomi.g:3765:2: ( rule__GovernanceTeam__NameAssignment_2 )
            // InternalBomi.g:3765:3: rule__GovernanceTeam__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GovernanceTeam__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGovernanceTeamAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GovernanceTeam__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalBomi.g:3774:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3778:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalBomi.g:3779:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalBomi.g:3786:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3790:1: ( ( () ) )
            // InternalBomi.g:3791:1: ( () )
            {
            // InternalBomi.g:3791:1: ( () )
            // InternalBomi.g:3792:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalBomi.g:3793:2: ()
            // InternalBomi.g:3793:3: 
            {
            }

             after(grammarAccess.getRoleAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalBomi.g:3801:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3805:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalBomi.g:3806:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalBomi.g:3813:1: rule__Role__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3817:1: ( ( 'Role' ) )
            // InternalBomi.g:3818:1: ( 'Role' )
            {
            // InternalBomi.g:3818:1: ( 'Role' )
            // InternalBomi.g:3819:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalBomi.g:3828:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3832:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalBomi.g:3833:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalBomi.g:3840:1: rule__Role__Group__2__Impl : ( ( rule__Role__NameAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3844:1: ( ( ( rule__Role__NameAssignment_2 ) ) )
            // InternalBomi.g:3845:1: ( ( rule__Role__NameAssignment_2 ) )
            {
            // InternalBomi.g:3845:1: ( ( rule__Role__NameAssignment_2 ) )
            // InternalBomi.g:3846:2: ( rule__Role__NameAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_2()); 
            // InternalBomi.g:3847:2: ( rule__Role__NameAssignment_2 )
            // InternalBomi.g:3847:3: rule__Role__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalBomi.g:3855:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3859:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalBomi.g:3860:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalBomi.g:3867:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3871:1: ( ( '{' ) )
            // InternalBomi.g:3872:1: ( '{' )
            {
            // InternalBomi.g:3872:1: ( '{' )
            // InternalBomi.g:3873:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalBomi.g:3882:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3886:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalBomi.g:3887:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalBomi.g:3894:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )? ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3898:1: ( ( ( rule__Role__Group_4__0 )? ) )
            // InternalBomi.g:3899:1: ( ( rule__Role__Group_4__0 )? )
            {
            // InternalBomi.g:3899:1: ( ( rule__Role__Group_4__0 )? )
            // InternalBomi.g:3900:2: ( rule__Role__Group_4__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // InternalBomi.g:3901:2: ( rule__Role__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==62) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBomi.g:3901:3: rule__Role__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // InternalBomi.g:3909:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3913:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // InternalBomi.g:3914:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalBomi.g:3921:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )? ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3925:1: ( ( ( rule__Role__Group_5__0 )? ) )
            // InternalBomi.g:3926:1: ( ( rule__Role__Group_5__0 )? )
            {
            // InternalBomi.g:3926:1: ( ( rule__Role__Group_5__0 )? )
            // InternalBomi.g:3927:2: ( rule__Role__Group_5__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // InternalBomi.g:3928:2: ( rule__Role__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBomi.g:3928:3: rule__Role__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__6"
    // InternalBomi.g:3936:1: rule__Role__Group__6 : rule__Role__Group__6__Impl ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3940:1: ( rule__Role__Group__6__Impl )
            // InternalBomi.g:3941:2: rule__Role__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6"


    // $ANTLR start "rule__Role__Group__6__Impl"
    // InternalBomi.g:3947:1: rule__Role__Group__6__Impl : ( '}' ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3951:1: ( ( '}' ) )
            // InternalBomi.g:3952:1: ( '}' )
            {
            // InternalBomi.g:3952:1: ( '}' )
            // InternalBomi.g:3953:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6__Impl"


    // $ANTLR start "rule__Role__Group_4__0"
    // InternalBomi.g:3963:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3967:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // InternalBomi.g:3968:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0"


    // $ANTLR start "rule__Role__Group_4__0__Impl"
    // InternalBomi.g:3975:1: rule__Role__Group_4__0__Impl : ( 'partOfGovernanceTeams' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3979:1: ( ( 'partOfGovernanceTeams' ) )
            // InternalBomi.g:3980:1: ( 'partOfGovernanceTeams' )
            {
            // InternalBomi.g:3980:1: ( 'partOfGovernanceTeams' )
            // InternalBomi.g:3981:2: 'partOfGovernanceTeams'
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsKeyword_4_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0__Impl"


    // $ANTLR start "rule__Role__Group_4__1"
    // InternalBomi.g:3990:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl rule__Role__Group_4__2 ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3994:1: ( rule__Role__Group_4__1__Impl rule__Role__Group_4__2 )
            // InternalBomi.g:3995:2: rule__Role__Group_4__1__Impl rule__Role__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1"


    // $ANTLR start "rule__Role__Group_4__1__Impl"
    // InternalBomi.g:4002:1: rule__Role__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4006:1: ( ( '(' ) )
            // InternalBomi.g:4007:1: ( '(' )
            {
            // InternalBomi.g:4007:1: ( '(' )
            // InternalBomi.g:4008:2: '('
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1__Impl"


    // $ANTLR start "rule__Role__Group_4__2"
    // InternalBomi.g:4017:1: rule__Role__Group_4__2 : rule__Role__Group_4__2__Impl rule__Role__Group_4__3 ;
    public final void rule__Role__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4021:1: ( rule__Role__Group_4__2__Impl rule__Role__Group_4__3 )
            // InternalBomi.g:4022:2: rule__Role__Group_4__2__Impl rule__Role__Group_4__3
            {
            pushFollow(FOLLOW_25);
            rule__Role__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__2"


    // $ANTLR start "rule__Role__Group_4__2__Impl"
    // InternalBomi.g:4029:1: rule__Role__Group_4__2__Impl : ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) ) ;
    public final void rule__Role__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4033:1: ( ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) ) )
            // InternalBomi.g:4034:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) )
            {
            // InternalBomi.g:4034:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) )
            // InternalBomi.g:4035:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_2()); 
            // InternalBomi.g:4036:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 )
            // InternalBomi.g:4036:3: rule__Role__PartOfGovernanceTeamsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__PartOfGovernanceTeamsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__2__Impl"


    // $ANTLR start "rule__Role__Group_4__3"
    // InternalBomi.g:4044:1: rule__Role__Group_4__3 : rule__Role__Group_4__3__Impl rule__Role__Group_4__4 ;
    public final void rule__Role__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4048:1: ( rule__Role__Group_4__3__Impl rule__Role__Group_4__4 )
            // InternalBomi.g:4049:2: rule__Role__Group_4__3__Impl rule__Role__Group_4__4
            {
            pushFollow(FOLLOW_25);
            rule__Role__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__3"


    // $ANTLR start "rule__Role__Group_4__3__Impl"
    // InternalBomi.g:4056:1: rule__Role__Group_4__3__Impl : ( ( rule__Role__Group_4_3__0 )* ) ;
    public final void rule__Role__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4060:1: ( ( ( rule__Role__Group_4_3__0 )* ) )
            // InternalBomi.g:4061:1: ( ( rule__Role__Group_4_3__0 )* )
            {
            // InternalBomi.g:4061:1: ( ( rule__Role__Group_4_3__0 )* )
            // InternalBomi.g:4062:2: ( rule__Role__Group_4_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4_3()); 
            // InternalBomi.g:4063:2: ( rule__Role__Group_4_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==38) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBomi.g:4063:3: rule__Role__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Role__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__3__Impl"


    // $ANTLR start "rule__Role__Group_4__4"
    // InternalBomi.g:4071:1: rule__Role__Group_4__4 : rule__Role__Group_4__4__Impl ;
    public final void rule__Role__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4075:1: ( rule__Role__Group_4__4__Impl )
            // InternalBomi.g:4076:2: rule__Role__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__4"


    // $ANTLR start "rule__Role__Group_4__4__Impl"
    // InternalBomi.g:4082:1: rule__Role__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Role__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4086:1: ( ( ')' ) )
            // InternalBomi.g:4087:1: ( ')' )
            {
            // InternalBomi.g:4087:1: ( ')' )
            // InternalBomi.g:4088:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__4__Impl"


    // $ANTLR start "rule__Role__Group_4_3__0"
    // InternalBomi.g:4098:1: rule__Role__Group_4_3__0 : rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 ;
    public final void rule__Role__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4102:1: ( rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 )
            // InternalBomi.g:4103:2: rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4_3__0"


    // $ANTLR start "rule__Role__Group_4_3__0__Impl"
    // InternalBomi.g:4110:1: rule__Role__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4114:1: ( ( ',' ) )
            // InternalBomi.g:4115:1: ( ',' )
            {
            // InternalBomi.g:4115:1: ( ',' )
            // InternalBomi.g:4116:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_4_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4_3__0__Impl"


    // $ANTLR start "rule__Role__Group_4_3__1"
    // InternalBomi.g:4125:1: rule__Role__Group_4_3__1 : rule__Role__Group_4_3__1__Impl ;
    public final void rule__Role__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4129:1: ( rule__Role__Group_4_3__1__Impl )
            // InternalBomi.g:4130:2: rule__Role__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4_3__1"


    // $ANTLR start "rule__Role__Group_4_3__1__Impl"
    // InternalBomi.g:4136:1: rule__Role__Group_4_3__1__Impl : ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) ) ;
    public final void rule__Role__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4140:1: ( ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) ) )
            // InternalBomi.g:4141:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) )
            {
            // InternalBomi.g:4141:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) )
            // InternalBomi.g:4142:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_3_1()); 
            // InternalBomi.g:4143:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 )
            // InternalBomi.g:4143:3: rule__Role__PartOfGovernanceTeamsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__PartOfGovernanceTeamsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4_3__1__Impl"


    // $ANTLR start "rule__Role__Group_5__0"
    // InternalBomi.g:4152:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4156:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // InternalBomi.g:4157:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__0"


    // $ANTLR start "rule__Role__Group_5__0__Impl"
    // InternalBomi.g:4164:1: rule__Role__Group_5__0__Impl : ( 'partOfMIs' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4168:1: ( ( 'partOfMIs' ) )
            // InternalBomi.g:4169:1: ( 'partOfMIs' )
            {
            // InternalBomi.g:4169:1: ( 'partOfMIs' )
            // InternalBomi.g:4170:2: 'partOfMIs'
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getPartOfMIsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__0__Impl"


    // $ANTLR start "rule__Role__Group_5__1"
    // InternalBomi.g:4179:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl rule__Role__Group_5__2 ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4183:1: ( rule__Role__Group_5__1__Impl rule__Role__Group_5__2 )
            // InternalBomi.g:4184:2: rule__Role__Group_5__1__Impl rule__Role__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__1"


    // $ANTLR start "rule__Role__Group_5__1__Impl"
    // InternalBomi.g:4191:1: rule__Role__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4195:1: ( ( '(' ) )
            // InternalBomi.g:4196:1: ( '(' )
            {
            // InternalBomi.g:4196:1: ( '(' )
            // InternalBomi.g:4197:2: '('
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__1__Impl"


    // $ANTLR start "rule__Role__Group_5__2"
    // InternalBomi.g:4206:1: rule__Role__Group_5__2 : rule__Role__Group_5__2__Impl rule__Role__Group_5__3 ;
    public final void rule__Role__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4210:1: ( rule__Role__Group_5__2__Impl rule__Role__Group_5__3 )
            // InternalBomi.g:4211:2: rule__Role__Group_5__2__Impl rule__Role__Group_5__3
            {
            pushFollow(FOLLOW_25);
            rule__Role__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__2"


    // $ANTLR start "rule__Role__Group_5__2__Impl"
    // InternalBomi.g:4218:1: rule__Role__Group_5__2__Impl : ( ( rule__Role__PartOfMIsAssignment_5_2 ) ) ;
    public final void rule__Role__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4222:1: ( ( ( rule__Role__PartOfMIsAssignment_5_2 ) ) )
            // InternalBomi.g:4223:1: ( ( rule__Role__PartOfMIsAssignment_5_2 ) )
            {
            // InternalBomi.g:4223:1: ( ( rule__Role__PartOfMIsAssignment_5_2 ) )
            // InternalBomi.g:4224:2: ( rule__Role__PartOfMIsAssignment_5_2 )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_2()); 
            // InternalBomi.g:4225:2: ( rule__Role__PartOfMIsAssignment_5_2 )
            // InternalBomi.g:4225:3: rule__Role__PartOfMIsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__PartOfMIsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__2__Impl"


    // $ANTLR start "rule__Role__Group_5__3"
    // InternalBomi.g:4233:1: rule__Role__Group_5__3 : rule__Role__Group_5__3__Impl rule__Role__Group_5__4 ;
    public final void rule__Role__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4237:1: ( rule__Role__Group_5__3__Impl rule__Role__Group_5__4 )
            // InternalBomi.g:4238:2: rule__Role__Group_5__3__Impl rule__Role__Group_5__4
            {
            pushFollow(FOLLOW_25);
            rule__Role__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__3"


    // $ANTLR start "rule__Role__Group_5__3__Impl"
    // InternalBomi.g:4245:1: rule__Role__Group_5__3__Impl : ( ( rule__Role__Group_5_3__0 )* ) ;
    public final void rule__Role__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4249:1: ( ( ( rule__Role__Group_5_3__0 )* ) )
            // InternalBomi.g:4250:1: ( ( rule__Role__Group_5_3__0 )* )
            {
            // InternalBomi.g:4250:1: ( ( rule__Role__Group_5_3__0 )* )
            // InternalBomi.g:4251:2: ( rule__Role__Group_5_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5_3()); 
            // InternalBomi.g:4252:2: ( rule__Role__Group_5_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==38) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBomi.g:4252:3: rule__Role__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Role__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__3__Impl"


    // $ANTLR start "rule__Role__Group_5__4"
    // InternalBomi.g:4260:1: rule__Role__Group_5__4 : rule__Role__Group_5__4__Impl ;
    public final void rule__Role__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4264:1: ( rule__Role__Group_5__4__Impl )
            // InternalBomi.g:4265:2: rule__Role__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__4"


    // $ANTLR start "rule__Role__Group_5__4__Impl"
    // InternalBomi.g:4271:1: rule__Role__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Role__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4275:1: ( ( ')' ) )
            // InternalBomi.g:4276:1: ( ')' )
            {
            // InternalBomi.g:4276:1: ( ')' )
            // InternalBomi.g:4277:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_5_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__4__Impl"


    // $ANTLR start "rule__Role__Group_5_3__0"
    // InternalBomi.g:4287:1: rule__Role__Group_5_3__0 : rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 ;
    public final void rule__Role__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4291:1: ( rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 )
            // InternalBomi.g:4292:2: rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5_3__0"


    // $ANTLR start "rule__Role__Group_5_3__0__Impl"
    // InternalBomi.g:4299:1: rule__Role__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4303:1: ( ( ',' ) )
            // InternalBomi.g:4304:1: ( ',' )
            {
            // InternalBomi.g:4304:1: ( ',' )
            // InternalBomi.g:4305:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_5_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5_3__0__Impl"


    // $ANTLR start "rule__Role__Group_5_3__1"
    // InternalBomi.g:4314:1: rule__Role__Group_5_3__1 : rule__Role__Group_5_3__1__Impl ;
    public final void rule__Role__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4318:1: ( rule__Role__Group_5_3__1__Impl )
            // InternalBomi.g:4319:2: rule__Role__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5_3__1"


    // $ANTLR start "rule__Role__Group_5_3__1__Impl"
    // InternalBomi.g:4325:1: rule__Role__Group_5_3__1__Impl : ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) ) ;
    public final void rule__Role__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4329:1: ( ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) ) )
            // InternalBomi.g:4330:1: ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) )
            {
            // InternalBomi.g:4330:1: ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) )
            // InternalBomi.g:4331:2: ( rule__Role__PartOfMIsAssignment_5_3_1 )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_3_1()); 
            // InternalBomi.g:4332:2: ( rule__Role__PartOfMIsAssignment_5_3_1 )
            // InternalBomi.g:4332:3: rule__Role__PartOfMIsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__PartOfMIsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5_3__1__Impl"


    // $ANTLR start "rule__Driver__Group__0"
    // InternalBomi.g:4341:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4345:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalBomi.g:4346:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Driver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__0"


    // $ANTLR start "rule__Driver__Group__0__Impl"
    // InternalBomi.g:4353:1: rule__Driver__Group__0__Impl : ( () ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4357:1: ( ( () ) )
            // InternalBomi.g:4358:1: ( () )
            {
            // InternalBomi.g:4358:1: ( () )
            // InternalBomi.g:4359:2: ()
            {
             before(grammarAccess.getDriverAccess().getDriverAction_0()); 
            // InternalBomi.g:4360:2: ()
            // InternalBomi.g:4360:3: 
            {
            }

             after(grammarAccess.getDriverAccess().getDriverAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__0__Impl"


    // $ANTLR start "rule__Driver__Group__1"
    // InternalBomi.g:4368:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4372:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalBomi.g:4373:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Driver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__1"


    // $ANTLR start "rule__Driver__Group__1__Impl"
    // InternalBomi.g:4380:1: rule__Driver__Group__1__Impl : ( 'Driver' ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4384:1: ( ( 'Driver' ) )
            // InternalBomi.g:4385:1: ( 'Driver' )
            {
            // InternalBomi.g:4385:1: ( 'Driver' )
            // InternalBomi.g:4386:2: 'Driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__1__Impl"


    // $ANTLR start "rule__Driver__Group__2"
    // InternalBomi.g:4395:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4399:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalBomi.g:4400:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Driver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__2"


    // $ANTLR start "rule__Driver__Group__2__Impl"
    // InternalBomi.g:4407:1: rule__Driver__Group__2__Impl : ( ( rule__Driver__NameAssignment_2 ) ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4411:1: ( ( ( rule__Driver__NameAssignment_2 ) ) )
            // InternalBomi.g:4412:1: ( ( rule__Driver__NameAssignment_2 ) )
            {
            // InternalBomi.g:4412:1: ( ( rule__Driver__NameAssignment_2 ) )
            // InternalBomi.g:4413:2: ( rule__Driver__NameAssignment_2 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_2()); 
            // InternalBomi.g:4414:2: ( rule__Driver__NameAssignment_2 )
            // InternalBomi.g:4414:3: rule__Driver__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Driver__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__2__Impl"


    // $ANTLR start "rule__Driver__Group__3"
    // InternalBomi.g:4422:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4426:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalBomi.g:4427:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Driver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__3"


    // $ANTLR start "rule__Driver__Group__3__Impl"
    // InternalBomi.g:4434:1: rule__Driver__Group__3__Impl : ( '{' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4438:1: ( ( '{' ) )
            // InternalBomi.g:4439:1: ( '{' )
            {
            // InternalBomi.g:4439:1: ( '{' )
            // InternalBomi.g:4440:2: '{'
            {
             before(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__3__Impl"


    // $ANTLR start "rule__Driver__Group__4"
    // InternalBomi.g:4449:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4453:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalBomi.g:4454:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Driver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__4"


    // $ANTLR start "rule__Driver__Group__4__Impl"
    // InternalBomi.g:4461:1: rule__Driver__Group__4__Impl : ( ( rule__Driver__Group_4__0 )? ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4465:1: ( ( ( rule__Driver__Group_4__0 )? ) )
            // InternalBomi.g:4466:1: ( ( rule__Driver__Group_4__0 )? )
            {
            // InternalBomi.g:4466:1: ( ( rule__Driver__Group_4__0 )? )
            // InternalBomi.g:4467:2: ( rule__Driver__Group_4__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_4()); 
            // InternalBomi.g:4468:2: ( rule__Driver__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==67) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBomi.g:4468:3: rule__Driver__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__4__Impl"


    // $ANTLR start "rule__Driver__Group__5"
    // InternalBomi.g:4476:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4480:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalBomi.g:4481:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Driver__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__5"


    // $ANTLR start "rule__Driver__Group__5__Impl"
    // InternalBomi.g:4488:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__Group_5__0 )? ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4492:1: ( ( ( rule__Driver__Group_5__0 )? ) )
            // InternalBomi.g:4493:1: ( ( rule__Driver__Group_5__0 )? )
            {
            // InternalBomi.g:4493:1: ( ( rule__Driver__Group_5__0 )? )
            // InternalBomi.g:4494:2: ( rule__Driver__Group_5__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_5()); 
            // InternalBomi.g:4495:2: ( rule__Driver__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==68) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBomi.g:4495:3: rule__Driver__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__5__Impl"


    // $ANTLR start "rule__Driver__Group__6"
    // InternalBomi.g:4503:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl rule__Driver__Group__7 ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4507:1: ( rule__Driver__Group__6__Impl rule__Driver__Group__7 )
            // InternalBomi.g:4508:2: rule__Driver__Group__6__Impl rule__Driver__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Driver__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__6"


    // $ANTLR start "rule__Driver__Group__6__Impl"
    // InternalBomi.g:4515:1: rule__Driver__Group__6__Impl : ( ( rule__Driver__Group_6__0 )? ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4519:1: ( ( ( rule__Driver__Group_6__0 )? ) )
            // InternalBomi.g:4520:1: ( ( rule__Driver__Group_6__0 )? )
            {
            // InternalBomi.g:4520:1: ( ( rule__Driver__Group_6__0 )? )
            // InternalBomi.g:4521:2: ( rule__Driver__Group_6__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_6()); 
            // InternalBomi.g:4522:2: ( rule__Driver__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==69) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBomi.g:4522:3: rule__Driver__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__6__Impl"


    // $ANTLR start "rule__Driver__Group__7"
    // InternalBomi.g:4530:1: rule__Driver__Group__7 : rule__Driver__Group__7__Impl rule__Driver__Group__8 ;
    public final void rule__Driver__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4534:1: ( rule__Driver__Group__7__Impl rule__Driver__Group__8 )
            // InternalBomi.g:4535:2: rule__Driver__Group__7__Impl rule__Driver__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Driver__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__7"


    // $ANTLR start "rule__Driver__Group__7__Impl"
    // InternalBomi.g:4542:1: rule__Driver__Group__7__Impl : ( ( rule__Driver__Group_7__0 )? ) ;
    public final void rule__Driver__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4546:1: ( ( ( rule__Driver__Group_7__0 )? ) )
            // InternalBomi.g:4547:1: ( ( rule__Driver__Group_7__0 )? )
            {
            // InternalBomi.g:4547:1: ( ( rule__Driver__Group_7__0 )? )
            // InternalBomi.g:4548:2: ( rule__Driver__Group_7__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_7()); 
            // InternalBomi.g:4549:2: ( rule__Driver__Group_7__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBomi.g:4549:3: rule__Driver__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__7__Impl"


    // $ANTLR start "rule__Driver__Group__8"
    // InternalBomi.g:4557:1: rule__Driver__Group__8 : rule__Driver__Group__8__Impl ;
    public final void rule__Driver__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4561:1: ( rule__Driver__Group__8__Impl )
            // InternalBomi.g:4562:2: rule__Driver__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__8"


    // $ANTLR start "rule__Driver__Group__8__Impl"
    // InternalBomi.g:4568:1: rule__Driver__Group__8__Impl : ( '}' ) ;
    public final void rule__Driver__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4572:1: ( ( '}' ) )
            // InternalBomi.g:4573:1: ( '}' )
            {
            // InternalBomi.g:4573:1: ( '}' )
            // InternalBomi.g:4574:2: '}'
            {
             before(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__8__Impl"


    // $ANTLR start "rule__Driver__Group_4__0"
    // InternalBomi.g:4584:1: rule__Driver__Group_4__0 : rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1 ;
    public final void rule__Driver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4588:1: ( rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1 )
            // InternalBomi.g:4589:2: rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__Driver__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_4__0"


    // $ANTLR start "rule__Driver__Group_4__0__Impl"
    // InternalBomi.g:4596:1: rule__Driver__Group_4__0__Impl : ( 'driverType' ) ;
    public final void rule__Driver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4600:1: ( ( 'driverType' ) )
            // InternalBomi.g:4601:1: ( 'driverType' )
            {
            // InternalBomi.g:4601:1: ( 'driverType' )
            // InternalBomi.g:4602:2: 'driverType'
            {
             before(grammarAccess.getDriverAccess().getDriverTypeKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_4__0__Impl"


    // $ANTLR start "rule__Driver__Group_4__1"
    // InternalBomi.g:4611:1: rule__Driver__Group_4__1 : rule__Driver__Group_4__1__Impl ;
    public final void rule__Driver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4615:1: ( rule__Driver__Group_4__1__Impl )
            // InternalBomi.g:4616:2: rule__Driver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_4__1"


    // $ANTLR start "rule__Driver__Group_4__1__Impl"
    // InternalBomi.g:4622:1: rule__Driver__Group_4__1__Impl : ( ( rule__Driver__DriverTypeAssignment_4_1 ) ) ;
    public final void rule__Driver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4626:1: ( ( ( rule__Driver__DriverTypeAssignment_4_1 ) ) )
            // InternalBomi.g:4627:1: ( ( rule__Driver__DriverTypeAssignment_4_1 ) )
            {
            // InternalBomi.g:4627:1: ( ( rule__Driver__DriverTypeAssignment_4_1 ) )
            // InternalBomi.g:4628:2: ( rule__Driver__DriverTypeAssignment_4_1 )
            {
             before(grammarAccess.getDriverAccess().getDriverTypeAssignment_4_1()); 
            // InternalBomi.g:4629:2: ( rule__Driver__DriverTypeAssignment_4_1 )
            // InternalBomi.g:4629:3: rule__Driver__DriverTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DriverTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDriverTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_4__1__Impl"


    // $ANTLR start "rule__Driver__Group_5__0"
    // InternalBomi.g:4638:1: rule__Driver__Group_5__0 : rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1 ;
    public final void rule__Driver__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4642:1: ( rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1 )
            // InternalBomi.g:4643:2: rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__Driver__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_5__0"


    // $ANTLR start "rule__Driver__Group_5__0__Impl"
    // InternalBomi.g:4650:1: rule__Driver__Group_5__0__Impl : ( 'distanceType' ) ;
    public final void rule__Driver__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4654:1: ( ( 'distanceType' ) )
            // InternalBomi.g:4655:1: ( 'distanceType' )
            {
            // InternalBomi.g:4655:1: ( 'distanceType' )
            // InternalBomi.g:4656:2: 'distanceType'
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeKeyword_5_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDistanceTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_5__0__Impl"


    // $ANTLR start "rule__Driver__Group_5__1"
    // InternalBomi.g:4665:1: rule__Driver__Group_5__1 : rule__Driver__Group_5__1__Impl ;
    public final void rule__Driver__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4669:1: ( rule__Driver__Group_5__1__Impl )
            // InternalBomi.g:4670:2: rule__Driver__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_5__1"


    // $ANTLR start "rule__Driver__Group_5__1__Impl"
    // InternalBomi.g:4676:1: rule__Driver__Group_5__1__Impl : ( ( rule__Driver__DistanceTypeAssignment_5_1 ) ) ;
    public final void rule__Driver__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4680:1: ( ( ( rule__Driver__DistanceTypeAssignment_5_1 ) ) )
            // InternalBomi.g:4681:1: ( ( rule__Driver__DistanceTypeAssignment_5_1 ) )
            {
            // InternalBomi.g:4681:1: ( ( rule__Driver__DistanceTypeAssignment_5_1 ) )
            // InternalBomi.g:4682:2: ( rule__Driver__DistanceTypeAssignment_5_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeAssignment_5_1()); 
            // InternalBomi.g:4683:2: ( rule__Driver__DistanceTypeAssignment_5_1 )
            // InternalBomi.g:4683:3: rule__Driver__DistanceTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DistanceTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDistanceTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_5__1__Impl"


    // $ANTLR start "rule__Driver__Group_6__0"
    // InternalBomi.g:4692:1: rule__Driver__Group_6__0 : rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1 ;
    public final void rule__Driver__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4696:1: ( rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1 )
            // InternalBomi.g:4697:2: rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Driver__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_6__0"


    // $ANTLR start "rule__Driver__Group_6__0__Impl"
    // InternalBomi.g:4704:1: rule__Driver__Group_6__0__Impl : ( 'distanceSize' ) ;
    public final void rule__Driver__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4708:1: ( ( 'distanceSize' ) )
            // InternalBomi.g:4709:1: ( 'distanceSize' )
            {
            // InternalBomi.g:4709:1: ( 'distanceSize' )
            // InternalBomi.g:4710:2: 'distanceSize'
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeKeyword_6_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDistanceSizeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_6__0__Impl"


    // $ANTLR start "rule__Driver__Group_6__1"
    // InternalBomi.g:4719:1: rule__Driver__Group_6__1 : rule__Driver__Group_6__1__Impl ;
    public final void rule__Driver__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4723:1: ( rule__Driver__Group_6__1__Impl )
            // InternalBomi.g:4724:2: rule__Driver__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_6__1"


    // $ANTLR start "rule__Driver__Group_6__1__Impl"
    // InternalBomi.g:4730:1: rule__Driver__Group_6__1__Impl : ( ( rule__Driver__DistanceSizeAssignment_6_1 ) ) ;
    public final void rule__Driver__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4734:1: ( ( ( rule__Driver__DistanceSizeAssignment_6_1 ) ) )
            // InternalBomi.g:4735:1: ( ( rule__Driver__DistanceSizeAssignment_6_1 ) )
            {
            // InternalBomi.g:4735:1: ( ( rule__Driver__DistanceSizeAssignment_6_1 ) )
            // InternalBomi.g:4736:2: ( rule__Driver__DistanceSizeAssignment_6_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeAssignment_6_1()); 
            // InternalBomi.g:4737:2: ( rule__Driver__DistanceSizeAssignment_6_1 )
            // InternalBomi.g:4737:3: rule__Driver__DistanceSizeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DistanceSizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDistanceSizeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_6__1__Impl"


    // $ANTLR start "rule__Driver__Group_7__0"
    // InternalBomi.g:4746:1: rule__Driver__Group_7__0 : rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1 ;
    public final void rule__Driver__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4750:1: ( rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1 )
            // InternalBomi.g:4751:2: rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__Driver__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__0"


    // $ANTLR start "rule__Driver__Group_7__0__Impl"
    // InternalBomi.g:4758:1: rule__Driver__Group_7__0__Impl : ( 'drivesMIs' ) ;
    public final void rule__Driver__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4762:1: ( ( 'drivesMIs' ) )
            // InternalBomi.g:4763:1: ( 'drivesMIs' )
            {
            // InternalBomi.g:4763:1: ( 'drivesMIs' )
            // InternalBomi.g:4764:2: 'drivesMIs'
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsKeyword_7_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDrivesMIsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__0__Impl"


    // $ANTLR start "rule__Driver__Group_7__1"
    // InternalBomi.g:4773:1: rule__Driver__Group_7__1 : rule__Driver__Group_7__1__Impl rule__Driver__Group_7__2 ;
    public final void rule__Driver__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4777:1: ( rule__Driver__Group_7__1__Impl rule__Driver__Group_7__2 )
            // InternalBomi.g:4778:2: rule__Driver__Group_7__1__Impl rule__Driver__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__Driver__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__1"


    // $ANTLR start "rule__Driver__Group_7__1__Impl"
    // InternalBomi.g:4785:1: rule__Driver__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Driver__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4789:1: ( ( '(' ) )
            // InternalBomi.g:4790:1: ( '(' )
            {
            // InternalBomi.g:4790:1: ( '(' )
            // InternalBomi.g:4791:2: '('
            {
             before(grammarAccess.getDriverAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__1__Impl"


    // $ANTLR start "rule__Driver__Group_7__2"
    // InternalBomi.g:4800:1: rule__Driver__Group_7__2 : rule__Driver__Group_7__2__Impl rule__Driver__Group_7__3 ;
    public final void rule__Driver__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4804:1: ( rule__Driver__Group_7__2__Impl rule__Driver__Group_7__3 )
            // InternalBomi.g:4805:2: rule__Driver__Group_7__2__Impl rule__Driver__Group_7__3
            {
            pushFollow(FOLLOW_25);
            rule__Driver__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__2"


    // $ANTLR start "rule__Driver__Group_7__2__Impl"
    // InternalBomi.g:4812:1: rule__Driver__Group_7__2__Impl : ( ( rule__Driver__DrivesMIsAssignment_7_2 ) ) ;
    public final void rule__Driver__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4816:1: ( ( ( rule__Driver__DrivesMIsAssignment_7_2 ) ) )
            // InternalBomi.g:4817:1: ( ( rule__Driver__DrivesMIsAssignment_7_2 ) )
            {
            // InternalBomi.g:4817:1: ( ( rule__Driver__DrivesMIsAssignment_7_2 ) )
            // InternalBomi.g:4818:2: ( rule__Driver__DrivesMIsAssignment_7_2 )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsAssignment_7_2()); 
            // InternalBomi.g:4819:2: ( rule__Driver__DrivesMIsAssignment_7_2 )
            // InternalBomi.g:4819:3: rule__Driver__DrivesMIsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DrivesMIsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDrivesMIsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__2__Impl"


    // $ANTLR start "rule__Driver__Group_7__3"
    // InternalBomi.g:4827:1: rule__Driver__Group_7__3 : rule__Driver__Group_7__3__Impl rule__Driver__Group_7__4 ;
    public final void rule__Driver__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4831:1: ( rule__Driver__Group_7__3__Impl rule__Driver__Group_7__4 )
            // InternalBomi.g:4832:2: rule__Driver__Group_7__3__Impl rule__Driver__Group_7__4
            {
            pushFollow(FOLLOW_25);
            rule__Driver__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__3"


    // $ANTLR start "rule__Driver__Group_7__3__Impl"
    // InternalBomi.g:4839:1: rule__Driver__Group_7__3__Impl : ( ( rule__Driver__Group_7_3__0 )* ) ;
    public final void rule__Driver__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4843:1: ( ( ( rule__Driver__Group_7_3__0 )* ) )
            // InternalBomi.g:4844:1: ( ( rule__Driver__Group_7_3__0 )* )
            {
            // InternalBomi.g:4844:1: ( ( rule__Driver__Group_7_3__0 )* )
            // InternalBomi.g:4845:2: ( rule__Driver__Group_7_3__0 )*
            {
             before(grammarAccess.getDriverAccess().getGroup_7_3()); 
            // InternalBomi.g:4846:2: ( rule__Driver__Group_7_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==38) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBomi.g:4846:3: rule__Driver__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Driver__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getDriverAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__3__Impl"


    // $ANTLR start "rule__Driver__Group_7__4"
    // InternalBomi.g:4854:1: rule__Driver__Group_7__4 : rule__Driver__Group_7__4__Impl ;
    public final void rule__Driver__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4858:1: ( rule__Driver__Group_7__4__Impl )
            // InternalBomi.g:4859:2: rule__Driver__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__4"


    // $ANTLR start "rule__Driver__Group_7__4__Impl"
    // InternalBomi.g:4865:1: rule__Driver__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Driver__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4869:1: ( ( ')' ) )
            // InternalBomi.g:4870:1: ( ')' )
            {
            // InternalBomi.g:4870:1: ( ')' )
            // InternalBomi.g:4871:2: ')'
            {
             before(grammarAccess.getDriverAccess().getRightParenthesisKeyword_7_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7__4__Impl"


    // $ANTLR start "rule__Driver__Group_7_3__0"
    // InternalBomi.g:4881:1: rule__Driver__Group_7_3__0 : rule__Driver__Group_7_3__0__Impl rule__Driver__Group_7_3__1 ;
    public final void rule__Driver__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4885:1: ( rule__Driver__Group_7_3__0__Impl rule__Driver__Group_7_3__1 )
            // InternalBomi.g:4886:2: rule__Driver__Group_7_3__0__Impl rule__Driver__Group_7_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Driver__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7_3__0"


    // $ANTLR start "rule__Driver__Group_7_3__0__Impl"
    // InternalBomi.g:4893:1: rule__Driver__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Driver__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4897:1: ( ( ',' ) )
            // InternalBomi.g:4898:1: ( ',' )
            {
            // InternalBomi.g:4898:1: ( ',' )
            // InternalBomi.g:4899:2: ','
            {
             before(grammarAccess.getDriverAccess().getCommaKeyword_7_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7_3__0__Impl"


    // $ANTLR start "rule__Driver__Group_7_3__1"
    // InternalBomi.g:4908:1: rule__Driver__Group_7_3__1 : rule__Driver__Group_7_3__1__Impl ;
    public final void rule__Driver__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4912:1: ( rule__Driver__Group_7_3__1__Impl )
            // InternalBomi.g:4913:2: rule__Driver__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7_3__1"


    // $ANTLR start "rule__Driver__Group_7_3__1__Impl"
    // InternalBomi.g:4919:1: rule__Driver__Group_7_3__1__Impl : ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) ) ;
    public final void rule__Driver__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4923:1: ( ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) ) )
            // InternalBomi.g:4924:1: ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) )
            {
            // InternalBomi.g:4924:1: ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) )
            // InternalBomi.g:4925:2: ( rule__Driver__DrivesMIsAssignment_7_3_1 )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsAssignment_7_3_1()); 
            // InternalBomi.g:4926:2: ( rule__Driver__DrivesMIsAssignment_7_3_1 )
            // InternalBomi.g:4926:3: rule__Driver__DrivesMIsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DrivesMIsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDrivesMIsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_7_3__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__0"
    // InternalBomi.g:4935:1: rule__BOMICoordination__Group__0 : rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1 ;
    public final void rule__BOMICoordination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4939:1: ( rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1 )
            // InternalBomi.g:4940:2: rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BOMICoordination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__0"


    // $ANTLR start "rule__BOMICoordination__Group__0__Impl"
    // InternalBomi.g:4947:1: rule__BOMICoordination__Group__0__Impl : ( () ) ;
    public final void rule__BOMICoordination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4951:1: ( ( () ) )
            // InternalBomi.g:4952:1: ( () )
            {
            // InternalBomi.g:4952:1: ( () )
            // InternalBomi.g:4953:2: ()
            {
             before(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationAction_0()); 
            // InternalBomi.g:4954:2: ()
            // InternalBomi.g:4954:3: 
            {
            }

             after(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__1"
    // InternalBomi.g:4962:1: rule__BOMICoordination__Group__1 : rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2 ;
    public final void rule__BOMICoordination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4966:1: ( rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2 )
            // InternalBomi.g:4967:2: rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__BOMICoordination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__1"


    // $ANTLR start "rule__BOMICoordination__Group__1__Impl"
    // InternalBomi.g:4974:1: rule__BOMICoordination__Group__1__Impl : ( 'BOMICoordination' ) ;
    public final void rule__BOMICoordination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4978:1: ( ( 'BOMICoordination' ) )
            // InternalBomi.g:4979:1: ( 'BOMICoordination' )
            {
            // InternalBomi.g:4979:1: ( 'BOMICoordination' )
            // InternalBomi.g:4980:2: 'BOMICoordination'
            {
             before(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__2"
    // InternalBomi.g:4989:1: rule__BOMICoordination__Group__2 : rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3 ;
    public final void rule__BOMICoordination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4993:1: ( rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3 )
            // InternalBomi.g:4994:2: rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BOMICoordination__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__2"


    // $ANTLR start "rule__BOMICoordination__Group__2__Impl"
    // InternalBomi.g:5001:1: rule__BOMICoordination__Group__2__Impl : ( ( rule__BOMICoordination__NameAssignment_2 ) ) ;
    public final void rule__BOMICoordination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5005:1: ( ( ( rule__BOMICoordination__NameAssignment_2 ) ) )
            // InternalBomi.g:5006:1: ( ( rule__BOMICoordination__NameAssignment_2 ) )
            {
            // InternalBomi.g:5006:1: ( ( rule__BOMICoordination__NameAssignment_2 ) )
            // InternalBomi.g:5007:2: ( rule__BOMICoordination__NameAssignment_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getNameAssignment_2()); 
            // InternalBomi.g:5008:2: ( rule__BOMICoordination__NameAssignment_2 )
            // InternalBomi.g:5008:3: rule__BOMICoordination__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__2__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__3"
    // InternalBomi.g:5016:1: rule__BOMICoordination__Group__3 : rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4 ;
    public final void rule__BOMICoordination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5020:1: ( rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4 )
            // InternalBomi.g:5021:2: rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__3"


    // $ANTLR start "rule__BOMICoordination__Group__3__Impl"
    // InternalBomi.g:5028:1: rule__BOMICoordination__Group__3__Impl : ( '{' ) ;
    public final void rule__BOMICoordination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5032:1: ( ( '{' ) )
            // InternalBomi.g:5033:1: ( '{' )
            {
            // InternalBomi.g:5033:1: ( '{' )
            // InternalBomi.g:5034:2: '{'
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__3__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__4"
    // InternalBomi.g:5043:1: rule__BOMICoordination__Group__4 : rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5 ;
    public final void rule__BOMICoordination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5047:1: ( rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5 )
            // InternalBomi.g:5048:2: rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__4"


    // $ANTLR start "rule__BOMICoordination__Group__4__Impl"
    // InternalBomi.g:5055:1: rule__BOMICoordination__Group__4__Impl : ( ( rule__BOMICoordination__Group_4__0 )? ) ;
    public final void rule__BOMICoordination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5059:1: ( ( ( rule__BOMICoordination__Group_4__0 )? ) )
            // InternalBomi.g:5060:1: ( ( rule__BOMICoordination__Group_4__0 )? )
            {
            // InternalBomi.g:5060:1: ( ( rule__BOMICoordination__Group_4__0 )? )
            // InternalBomi.g:5061:2: ( rule__BOMICoordination__Group_4__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_4()); 
            // InternalBomi.g:5062:2: ( rule__BOMICoordination__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBomi.g:5062:3: rule__BOMICoordination__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMICoordination__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__4__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__5"
    // InternalBomi.g:5070:1: rule__BOMICoordination__Group__5 : rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6 ;
    public final void rule__BOMICoordination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5074:1: ( rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6 )
            // InternalBomi.g:5075:2: rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__5"


    // $ANTLR start "rule__BOMICoordination__Group__5__Impl"
    // InternalBomi.g:5082:1: rule__BOMICoordination__Group__5__Impl : ( ( rule__BOMICoordination__Group_5__0 )? ) ;
    public final void rule__BOMICoordination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5086:1: ( ( ( rule__BOMICoordination__Group_5__0 )? ) )
            // InternalBomi.g:5087:1: ( ( rule__BOMICoordination__Group_5__0 )? )
            {
            // InternalBomi.g:5087:1: ( ( rule__BOMICoordination__Group_5__0 )? )
            // InternalBomi.g:5088:2: ( rule__BOMICoordination__Group_5__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_5()); 
            // InternalBomi.g:5089:2: ( rule__BOMICoordination__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBomi.g:5089:3: rule__BOMICoordination__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMICoordination__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__5__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__6"
    // InternalBomi.g:5097:1: rule__BOMICoordination__Group__6 : rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7 ;
    public final void rule__BOMICoordination__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5101:1: ( rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7 )
            // InternalBomi.g:5102:2: rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__6"


    // $ANTLR start "rule__BOMICoordination__Group__6__Impl"
    // InternalBomi.g:5109:1: rule__BOMICoordination__Group__6__Impl : ( ( rule__BOMICoordination__Group_6__0 )? ) ;
    public final void rule__BOMICoordination__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5113:1: ( ( ( rule__BOMICoordination__Group_6__0 )? ) )
            // InternalBomi.g:5114:1: ( ( rule__BOMICoordination__Group_6__0 )? )
            {
            // InternalBomi.g:5114:1: ( ( rule__BOMICoordination__Group_6__0 )? )
            // InternalBomi.g:5115:2: ( rule__BOMICoordination__Group_6__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_6()); 
            // InternalBomi.g:5116:2: ( rule__BOMICoordination__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==73) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBomi.g:5116:3: rule__BOMICoordination__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMICoordination__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__6__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__7"
    // InternalBomi.g:5124:1: rule__BOMICoordination__Group__7 : rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8 ;
    public final void rule__BOMICoordination__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5128:1: ( rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8 )
            // InternalBomi.g:5129:2: rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__7"


    // $ANTLR start "rule__BOMICoordination__Group__7__Impl"
    // InternalBomi.g:5136:1: rule__BOMICoordination__Group__7__Impl : ( ( rule__BOMICoordination__Group_7__0 )? ) ;
    public final void rule__BOMICoordination__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5140:1: ( ( ( rule__BOMICoordination__Group_7__0 )? ) )
            // InternalBomi.g:5141:1: ( ( rule__BOMICoordination__Group_7__0 )? )
            {
            // InternalBomi.g:5141:1: ( ( rule__BOMICoordination__Group_7__0 )? )
            // InternalBomi.g:5142:2: ( rule__BOMICoordination__Group_7__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_7()); 
            // InternalBomi.g:5143:2: ( rule__BOMICoordination__Group_7__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==74) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBomi.g:5143:3: rule__BOMICoordination__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMICoordination__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__7__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__8"
    // InternalBomi.g:5151:1: rule__BOMICoordination__Group__8 : rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9 ;
    public final void rule__BOMICoordination__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5155:1: ( rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9 )
            // InternalBomi.g:5156:2: rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__8"


    // $ANTLR start "rule__BOMICoordination__Group__8__Impl"
    // InternalBomi.g:5163:1: rule__BOMICoordination__Group__8__Impl : ( ( rule__BOMICoordination__Group_8__0 )? ) ;
    public final void rule__BOMICoordination__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5167:1: ( ( ( rule__BOMICoordination__Group_8__0 )? ) )
            // InternalBomi.g:5168:1: ( ( rule__BOMICoordination__Group_8__0 )? )
            {
            // InternalBomi.g:5168:1: ( ( rule__BOMICoordination__Group_8__0 )? )
            // InternalBomi.g:5169:2: ( rule__BOMICoordination__Group_8__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_8()); 
            // InternalBomi.g:5170:2: ( rule__BOMICoordination__Group_8__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==75) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBomi.g:5170:3: rule__BOMICoordination__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMICoordination__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__8__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__9"
    // InternalBomi.g:5178:1: rule__BOMICoordination__Group__9 : rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10 ;
    public final void rule__BOMICoordination__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5182:1: ( rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10 )
            // InternalBomi.g:5183:2: rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__9"


    // $ANTLR start "rule__BOMICoordination__Group__9__Impl"
    // InternalBomi.g:5190:1: rule__BOMICoordination__Group__9__Impl : ( ( rule__BOMICoordination__Group_9__0 )? ) ;
    public final void rule__BOMICoordination__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5194:1: ( ( ( rule__BOMICoordination__Group_9__0 )? ) )
            // InternalBomi.g:5195:1: ( ( rule__BOMICoordination__Group_9__0 )? )
            {
            // InternalBomi.g:5195:1: ( ( rule__BOMICoordination__Group_9__0 )? )
            // InternalBomi.g:5196:2: ( rule__BOMICoordination__Group_9__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_9()); 
            // InternalBomi.g:5197:2: ( rule__BOMICoordination__Group_9__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==35) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBomi.g:5197:3: rule__BOMICoordination__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMICoordination__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__9__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__10"
    // InternalBomi.g:5205:1: rule__BOMICoordination__Group__10 : rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11 ;
    public final void rule__BOMICoordination__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5209:1: ( rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11 )
            // InternalBomi.g:5210:2: rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__BOMICoordination__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__10"


    // $ANTLR start "rule__BOMICoordination__Group__10__Impl"
    // InternalBomi.g:5217:1: rule__BOMICoordination__Group__10__Impl : ( ( rule__BOMICoordination__Group_10__0 )? ) ;
    public final void rule__BOMICoordination__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5221:1: ( ( ( rule__BOMICoordination__Group_10__0 )? ) )
            // InternalBomi.g:5222:1: ( ( rule__BOMICoordination__Group_10__0 )? )
            {
            // InternalBomi.g:5222:1: ( ( rule__BOMICoordination__Group_10__0 )? )
            // InternalBomi.g:5223:2: ( rule__BOMICoordination__Group_10__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_10()); 
            // InternalBomi.g:5224:2: ( rule__BOMICoordination__Group_10__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBomi.g:5224:3: rule__BOMICoordination__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOMICoordination__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOMICoordinationAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__10__Impl"


    // $ANTLR start "rule__BOMICoordination__Group__11"
    // InternalBomi.g:5232:1: rule__BOMICoordination__Group__11 : rule__BOMICoordination__Group__11__Impl ;
    public final void rule__BOMICoordination__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5236:1: ( rule__BOMICoordination__Group__11__Impl )
            // InternalBomi.g:5237:2: rule__BOMICoordination__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__11"


    // $ANTLR start "rule__BOMICoordination__Group__11__Impl"
    // InternalBomi.g:5243:1: rule__BOMICoordination__Group__11__Impl : ( '}' ) ;
    public final void rule__BOMICoordination__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5247:1: ( ( '}' ) )
            // InternalBomi.g:5248:1: ( '}' )
            {
            // InternalBomi.g:5248:1: ( '}' )
            // InternalBomi.g:5249:2: '}'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group__11__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_4__0"
    // InternalBomi.g:5259:1: rule__BOMICoordination__Group_4__0 : rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1 ;
    public final void rule__BOMICoordination__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5263:1: ( rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1 )
            // InternalBomi.g:5264:2: rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__BOMICoordination__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_4__0"


    // $ANTLR start "rule__BOMICoordination__Group_4__0__Impl"
    // InternalBomi.g:5271:1: rule__BOMICoordination__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BOMICoordination__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5275:1: ( ( 'purpose' ) )
            // InternalBomi.g:5276:1: ( 'purpose' )
            {
            // InternalBomi.g:5276:1: ( 'purpose' )
            // InternalBomi.g:5277:2: 'purpose'
            {
             before(grammarAccess.getBOMICoordinationAccess().getPurposeKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getPurposeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_4__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_4__1"
    // InternalBomi.g:5286:1: rule__BOMICoordination__Group_4__1 : rule__BOMICoordination__Group_4__1__Impl ;
    public final void rule__BOMICoordination__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5290:1: ( rule__BOMICoordination__Group_4__1__Impl )
            // InternalBomi.g:5291:2: rule__BOMICoordination__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_4__1"


    // $ANTLR start "rule__BOMICoordination__Group_4__1__Impl"
    // InternalBomi.g:5297:1: rule__BOMICoordination__Group_4__1__Impl : ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) ) ;
    public final void rule__BOMICoordination__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5301:1: ( ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:5302:1: ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:5302:1: ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) )
            // InternalBomi.g:5303:2: ( rule__BOMICoordination__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:5304:2: ( rule__BOMICoordination__PurposeAssignment_4_1 )
            // InternalBomi.g:5304:3: rule__BOMICoordination__PurposeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__PurposeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getPurposeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_4__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_5__0"
    // InternalBomi.g:5313:1: rule__BOMICoordination__Group_5__0 : rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1 ;
    public final void rule__BOMICoordination__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5317:1: ( rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1 )
            // InternalBomi.g:5318:2: rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__BOMICoordination__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_5__0"


    // $ANTLR start "rule__BOMICoordination__Group_5__0__Impl"
    // InternalBomi.g:5325:1: rule__BOMICoordination__Group_5__0__Impl : ( 'accessability' ) ;
    public final void rule__BOMICoordination__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5329:1: ( ( 'accessability' ) )
            // InternalBomi.g:5330:1: ( 'accessability' )
            {
            // InternalBomi.g:5330:1: ( 'accessability' )
            // InternalBomi.g:5331:2: 'accessability'
            {
             before(grammarAccess.getBOMICoordinationAccess().getAccessabilityKeyword_5_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getAccessabilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_5__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_5__1"
    // InternalBomi.g:5340:1: rule__BOMICoordination__Group_5__1 : rule__BOMICoordination__Group_5__1__Impl ;
    public final void rule__BOMICoordination__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5344:1: ( rule__BOMICoordination__Group_5__1__Impl )
            // InternalBomi.g:5345:2: rule__BOMICoordination__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_5__1"


    // $ANTLR start "rule__BOMICoordination__Group_5__1__Impl"
    // InternalBomi.g:5351:1: rule__BOMICoordination__Group_5__1__Impl : ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) ) ;
    public final void rule__BOMICoordination__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5355:1: ( ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) ) )
            // InternalBomi.g:5356:1: ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) )
            {
            // InternalBomi.g:5356:1: ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) )
            // InternalBomi.g:5357:2: ( rule__BOMICoordination__AccessabilityAssignment_5_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getAccessabilityAssignment_5_1()); 
            // InternalBomi.g:5358:2: ( rule__BOMICoordination__AccessabilityAssignment_5_1 )
            // InternalBomi.g:5358:3: rule__BOMICoordination__AccessabilityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__AccessabilityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getAccessabilityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_5__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_6__0"
    // InternalBomi.g:5367:1: rule__BOMICoordination__Group_6__0 : rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1 ;
    public final void rule__BOMICoordination__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5371:1: ( rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1 )
            // InternalBomi.g:5372:2: rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__BOMICoordination__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_6__0"


    // $ANTLR start "rule__BOMICoordination__Group_6__0__Impl"
    // InternalBomi.g:5379:1: rule__BOMICoordination__Group_6__0__Impl : ( 'stability' ) ;
    public final void rule__BOMICoordination__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5383:1: ( ( 'stability' ) )
            // InternalBomi.g:5384:1: ( 'stability' )
            {
            // InternalBomi.g:5384:1: ( 'stability' )
            // InternalBomi.g:5385:2: 'stability'
            {
             before(grammarAccess.getBOMICoordinationAccess().getStabilityKeyword_6_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getStabilityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_6__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_6__1"
    // InternalBomi.g:5394:1: rule__BOMICoordination__Group_6__1 : rule__BOMICoordination__Group_6__1__Impl ;
    public final void rule__BOMICoordination__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5398:1: ( rule__BOMICoordination__Group_6__1__Impl )
            // InternalBomi.g:5399:2: rule__BOMICoordination__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_6__1"


    // $ANTLR start "rule__BOMICoordination__Group_6__1__Impl"
    // InternalBomi.g:5405:1: rule__BOMICoordination__Group_6__1__Impl : ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) ) ;
    public final void rule__BOMICoordination__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5409:1: ( ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) ) )
            // InternalBomi.g:5410:1: ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) )
            {
            // InternalBomi.g:5410:1: ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) )
            // InternalBomi.g:5411:2: ( rule__BOMICoordination__StabilityAssignment_6_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getStabilityAssignment_6_1()); 
            // InternalBomi.g:5412:2: ( rule__BOMICoordination__StabilityAssignment_6_1 )
            // InternalBomi.g:5412:3: rule__BOMICoordination__StabilityAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__StabilityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getStabilityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_6__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_7__0"
    // InternalBomi.g:5421:1: rule__BOMICoordination__Group_7__0 : rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1 ;
    public final void rule__BOMICoordination__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5425:1: ( rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1 )
            // InternalBomi.g:5426:2: rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__BOMICoordination__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_7__0"


    // $ANTLR start "rule__BOMICoordination__Group_7__0__Impl"
    // InternalBomi.g:5433:1: rule__BOMICoordination__Group_7__0__Impl : ( 'criticality' ) ;
    public final void rule__BOMICoordination__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5437:1: ( ( 'criticality' ) )
            // InternalBomi.g:5438:1: ( 'criticality' )
            {
            // InternalBomi.g:5438:1: ( 'criticality' )
            // InternalBomi.g:5439:2: 'criticality'
            {
             before(grammarAccess.getBOMICoordinationAccess().getCriticalityKeyword_7_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getCriticalityKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_7__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_7__1"
    // InternalBomi.g:5448:1: rule__BOMICoordination__Group_7__1 : rule__BOMICoordination__Group_7__1__Impl ;
    public final void rule__BOMICoordination__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5452:1: ( rule__BOMICoordination__Group_7__1__Impl )
            // InternalBomi.g:5453:2: rule__BOMICoordination__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_7__1"


    // $ANTLR start "rule__BOMICoordination__Group_7__1__Impl"
    // InternalBomi.g:5459:1: rule__BOMICoordination__Group_7__1__Impl : ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) ) ;
    public final void rule__BOMICoordination__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5463:1: ( ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) ) )
            // InternalBomi.g:5464:1: ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) )
            {
            // InternalBomi.g:5464:1: ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) )
            // InternalBomi.g:5465:2: ( rule__BOMICoordination__CriticalityAssignment_7_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getCriticalityAssignment_7_1()); 
            // InternalBomi.g:5466:2: ( rule__BOMICoordination__CriticalityAssignment_7_1 )
            // InternalBomi.g:5466:3: rule__BOMICoordination__CriticalityAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__CriticalityAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getCriticalityAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_7__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_8__0"
    // InternalBomi.g:5475:1: rule__BOMICoordination__Group_8__0 : rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1 ;
    public final void rule__BOMICoordination__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5479:1: ( rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1 )
            // InternalBomi.g:5480:2: rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__BOMICoordination__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_8__0"


    // $ANTLR start "rule__BOMICoordination__Group_8__0__Impl"
    // InternalBomi.g:5487:1: rule__BOMICoordination__Group_8__0__Impl : ( 'fitForPurpose' ) ;
    public final void rule__BOMICoordination__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5491:1: ( ( 'fitForPurpose' ) )
            // InternalBomi.g:5492:1: ( 'fitForPurpose' )
            {
            // InternalBomi.g:5492:1: ( 'fitForPurpose' )
            // InternalBomi.g:5493:2: 'fitForPurpose'
            {
             before(grammarAccess.getBOMICoordinationAccess().getFitForPurposeKeyword_8_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getFitForPurposeKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_8__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_8__1"
    // InternalBomi.g:5502:1: rule__BOMICoordination__Group_8__1 : rule__BOMICoordination__Group_8__1__Impl ;
    public final void rule__BOMICoordination__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5506:1: ( rule__BOMICoordination__Group_8__1__Impl )
            // InternalBomi.g:5507:2: rule__BOMICoordination__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_8__1"


    // $ANTLR start "rule__BOMICoordination__Group_8__1__Impl"
    // InternalBomi.g:5513:1: rule__BOMICoordination__Group_8__1__Impl : ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) ) ;
    public final void rule__BOMICoordination__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5517:1: ( ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) ) )
            // InternalBomi.g:5518:1: ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) )
            {
            // InternalBomi.g:5518:1: ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) )
            // InternalBomi.g:5519:2: ( rule__BOMICoordination__FitForPurposeAssignment_8_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getFitForPurposeAssignment_8_1()); 
            // InternalBomi.g:5520:2: ( rule__BOMICoordination__FitForPurposeAssignment_8_1 )
            // InternalBomi.g:5520:3: rule__BOMICoordination__FitForPurposeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__FitForPurposeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getFitForPurposeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_8__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_9__0"
    // InternalBomi.g:5529:1: rule__BOMICoordination__Group_9__0 : rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1 ;
    public final void rule__BOMICoordination__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5533:1: ( rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1 )
            // InternalBomi.g:5534:2: rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1
            {
            pushFollow(FOLLOW_24);
            rule__BOMICoordination__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__0"


    // $ANTLR start "rule__BOMICoordination__Group_9__0__Impl"
    // InternalBomi.g:5541:1: rule__BOMICoordination__Group_9__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOMICoordination__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5545:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:5546:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:5546:1: ( 'boundaryObjects' )
            // InternalBomi.g:5547:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_9__1"
    // InternalBomi.g:5556:1: rule__BOMICoordination__Group_9__1 : rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2 ;
    public final void rule__BOMICoordination__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5560:1: ( rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2 )
            // InternalBomi.g:5561:2: rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2
            {
            pushFollow(FOLLOW_16);
            rule__BOMICoordination__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__1"


    // $ANTLR start "rule__BOMICoordination__Group_9__1__Impl"
    // InternalBomi.g:5568:1: rule__BOMICoordination__Group_9__1__Impl : ( '(' ) ;
    public final void rule__BOMICoordination__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5572:1: ( ( '(' ) )
            // InternalBomi.g:5573:1: ( '(' )
            {
            // InternalBomi.g:5573:1: ( '(' )
            // InternalBomi.g:5574:2: '('
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_9__2"
    // InternalBomi.g:5583:1: rule__BOMICoordination__Group_9__2 : rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3 ;
    public final void rule__BOMICoordination__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5587:1: ( rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3 )
            // InternalBomi.g:5588:2: rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3
            {
            pushFollow(FOLLOW_25);
            rule__BOMICoordination__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__2"


    // $ANTLR start "rule__BOMICoordination__Group_9__2__Impl"
    // InternalBomi.g:5595:1: rule__BOMICoordination__Group_9__2__Impl : ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) ) ;
    public final void rule__BOMICoordination__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5599:1: ( ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) ) )
            // InternalBomi.g:5600:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) )
            {
            // InternalBomi.g:5600:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) )
            // InternalBomi.g:5601:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_2()); 
            // InternalBomi.g:5602:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 )
            // InternalBomi.g:5602:3: rule__BOMICoordination__BoundaryObjectsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__BoundaryObjectsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__2__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_9__3"
    // InternalBomi.g:5610:1: rule__BOMICoordination__Group_9__3 : rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4 ;
    public final void rule__BOMICoordination__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5614:1: ( rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4 )
            // InternalBomi.g:5615:2: rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4
            {
            pushFollow(FOLLOW_25);
            rule__BOMICoordination__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__3"


    // $ANTLR start "rule__BOMICoordination__Group_9__3__Impl"
    // InternalBomi.g:5622:1: rule__BOMICoordination__Group_9__3__Impl : ( ( rule__BOMICoordination__Group_9_3__0 )* ) ;
    public final void rule__BOMICoordination__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5626:1: ( ( ( rule__BOMICoordination__Group_9_3__0 )* ) )
            // InternalBomi.g:5627:1: ( ( rule__BOMICoordination__Group_9_3__0 )* )
            {
            // InternalBomi.g:5627:1: ( ( rule__BOMICoordination__Group_9_3__0 )* )
            // InternalBomi.g:5628:2: ( rule__BOMICoordination__Group_9_3__0 )*
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_9_3()); 
            // InternalBomi.g:5629:2: ( rule__BOMICoordination__Group_9_3__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==38) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalBomi.g:5629:3: rule__BOMICoordination__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMICoordination__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getBOMICoordinationAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__3__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_9__4"
    // InternalBomi.g:5637:1: rule__BOMICoordination__Group_9__4 : rule__BOMICoordination__Group_9__4__Impl ;
    public final void rule__BOMICoordination__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5641:1: ( rule__BOMICoordination__Group_9__4__Impl )
            // InternalBomi.g:5642:2: rule__BOMICoordination__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__4"


    // $ANTLR start "rule__BOMICoordination__Group_9__4__Impl"
    // InternalBomi.g:5648:1: rule__BOMICoordination__Group_9__4__Impl : ( ')' ) ;
    public final void rule__BOMICoordination__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5652:1: ( ( ')' ) )
            // InternalBomi.g:5653:1: ( ')' )
            {
            // InternalBomi.g:5653:1: ( ')' )
            // InternalBomi.g:5654:2: ')'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_9_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9__4__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_9_3__0"
    // InternalBomi.g:5664:1: rule__BOMICoordination__Group_9_3__0 : rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1 ;
    public final void rule__BOMICoordination__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5668:1: ( rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1 )
            // InternalBomi.g:5669:2: rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BOMICoordination__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9_3__0"


    // $ANTLR start "rule__BOMICoordination__Group_9_3__0__Impl"
    // InternalBomi.g:5676:1: rule__BOMICoordination__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__BOMICoordination__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5680:1: ( ( ',' ) )
            // InternalBomi.g:5681:1: ( ',' )
            {
            // InternalBomi.g:5681:1: ( ',' )
            // InternalBomi.g:5682:2: ','
            {
             before(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_9_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9_3__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_9_3__1"
    // InternalBomi.g:5691:1: rule__BOMICoordination__Group_9_3__1 : rule__BOMICoordination__Group_9_3__1__Impl ;
    public final void rule__BOMICoordination__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5695:1: ( rule__BOMICoordination__Group_9_3__1__Impl )
            // InternalBomi.g:5696:2: rule__BOMICoordination__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9_3__1"


    // $ANTLR start "rule__BOMICoordination__Group_9_3__1__Impl"
    // InternalBomi.g:5702:1: rule__BOMICoordination__Group_9_3__1__Impl : ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) ) ;
    public final void rule__BOMICoordination__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5706:1: ( ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) ) )
            // InternalBomi.g:5707:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) )
            {
            // InternalBomi.g:5707:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) )
            // InternalBomi.g:5708:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_3_1()); 
            // InternalBomi.g:5709:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 )
            // InternalBomi.g:5709:3: rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_9_3__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_10__0"
    // InternalBomi.g:5718:1: rule__BOMICoordination__Group_10__0 : rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1 ;
    public final void rule__BOMICoordination__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5722:1: ( rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1 )
            // InternalBomi.g:5723:2: rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1
            {
            pushFollow(FOLLOW_24);
            rule__BOMICoordination__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__0"


    // $ANTLR start "rule__BOMICoordination__Group_10__0__Impl"
    // InternalBomi.g:5730:1: rule__BOMICoordination__Group_10__0__Impl : ( 'methodologicalIslands' ) ;
    public final void rule__BOMICoordination__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5734:1: ( ( 'methodologicalIslands' ) )
            // InternalBomi.g:5735:1: ( 'methodologicalIslands' )
            {
            // InternalBomi.g:5735:1: ( 'methodologicalIslands' )
            // InternalBomi.g:5736:2: 'methodologicalIslands'
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsKeyword_10_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_10__1"
    // InternalBomi.g:5745:1: rule__BOMICoordination__Group_10__1 : rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2 ;
    public final void rule__BOMICoordination__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5749:1: ( rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2 )
            // InternalBomi.g:5750:2: rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2
            {
            pushFollow(FOLLOW_16);
            rule__BOMICoordination__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__1"


    // $ANTLR start "rule__BOMICoordination__Group_10__1__Impl"
    // InternalBomi.g:5757:1: rule__BOMICoordination__Group_10__1__Impl : ( '(' ) ;
    public final void rule__BOMICoordination__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5761:1: ( ( '(' ) )
            // InternalBomi.g:5762:1: ( '(' )
            {
            // InternalBomi.g:5762:1: ( '(' )
            // InternalBomi.g:5763:2: '('
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__1__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_10__2"
    // InternalBomi.g:5772:1: rule__BOMICoordination__Group_10__2 : rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3 ;
    public final void rule__BOMICoordination__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5776:1: ( rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3 )
            // InternalBomi.g:5777:2: rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3
            {
            pushFollow(FOLLOW_25);
            rule__BOMICoordination__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__2"


    // $ANTLR start "rule__BOMICoordination__Group_10__2__Impl"
    // InternalBomi.g:5784:1: rule__BOMICoordination__Group_10__2__Impl : ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) ) ;
    public final void rule__BOMICoordination__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5788:1: ( ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) ) )
            // InternalBomi.g:5789:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) )
            {
            // InternalBomi.g:5789:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) )
            // InternalBomi.g:5790:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_2()); 
            // InternalBomi.g:5791:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 )
            // InternalBomi.g:5791:3: rule__BOMICoordination__MethodologicalIslandsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__MethodologicalIslandsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__2__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_10__3"
    // InternalBomi.g:5799:1: rule__BOMICoordination__Group_10__3 : rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4 ;
    public final void rule__BOMICoordination__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5803:1: ( rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4 )
            // InternalBomi.g:5804:2: rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4
            {
            pushFollow(FOLLOW_25);
            rule__BOMICoordination__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__3"


    // $ANTLR start "rule__BOMICoordination__Group_10__3__Impl"
    // InternalBomi.g:5811:1: rule__BOMICoordination__Group_10__3__Impl : ( ( rule__BOMICoordination__Group_10_3__0 )* ) ;
    public final void rule__BOMICoordination__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5815:1: ( ( ( rule__BOMICoordination__Group_10_3__0 )* ) )
            // InternalBomi.g:5816:1: ( ( rule__BOMICoordination__Group_10_3__0 )* )
            {
            // InternalBomi.g:5816:1: ( ( rule__BOMICoordination__Group_10_3__0 )* )
            // InternalBomi.g:5817:2: ( rule__BOMICoordination__Group_10_3__0 )*
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_10_3()); 
            // InternalBomi.g:5818:2: ( rule__BOMICoordination__Group_10_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==38) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBomi.g:5818:3: rule__BOMICoordination__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMICoordination__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getBOMICoordinationAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__3__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_10__4"
    // InternalBomi.g:5826:1: rule__BOMICoordination__Group_10__4 : rule__BOMICoordination__Group_10__4__Impl ;
    public final void rule__BOMICoordination__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5830:1: ( rule__BOMICoordination__Group_10__4__Impl )
            // InternalBomi.g:5831:2: rule__BOMICoordination__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__4"


    // $ANTLR start "rule__BOMICoordination__Group_10__4__Impl"
    // InternalBomi.g:5837:1: rule__BOMICoordination__Group_10__4__Impl : ( ')' ) ;
    public final void rule__BOMICoordination__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5841:1: ( ( ')' ) )
            // InternalBomi.g:5842:1: ( ')' )
            {
            // InternalBomi.g:5842:1: ( ')' )
            // InternalBomi.g:5843:2: ')'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_10_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10__4__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_10_3__0"
    // InternalBomi.g:5853:1: rule__BOMICoordination__Group_10_3__0 : rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1 ;
    public final void rule__BOMICoordination__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5857:1: ( rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1 )
            // InternalBomi.g:5858:2: rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BOMICoordination__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10_3__0"


    // $ANTLR start "rule__BOMICoordination__Group_10_3__0__Impl"
    // InternalBomi.g:5865:1: rule__BOMICoordination__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__BOMICoordination__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5869:1: ( ( ',' ) )
            // InternalBomi.g:5870:1: ( ',' )
            {
            // InternalBomi.g:5870:1: ( ',' )
            // InternalBomi.g:5871:2: ','
            {
             before(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_10_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10_3__0__Impl"


    // $ANTLR start "rule__BOMICoordination__Group_10_3__1"
    // InternalBomi.g:5880:1: rule__BOMICoordination__Group_10_3__1 : rule__BOMICoordination__Group_10_3__1__Impl ;
    public final void rule__BOMICoordination__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5884:1: ( rule__BOMICoordination__Group_10_3__1__Impl )
            // InternalBomi.g:5885:2: rule__BOMICoordination__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10_3__1"


    // $ANTLR start "rule__BOMICoordination__Group_10_3__1__Impl"
    // InternalBomi.g:5891:1: rule__BOMICoordination__Group_10_3__1__Impl : ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) ) ;
    public final void rule__BOMICoordination__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5895:1: ( ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) ) )
            // InternalBomi.g:5896:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) )
            {
            // InternalBomi.g:5896:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) )
            // InternalBomi.g:5897:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_3_1()); 
            // InternalBomi.g:5898:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 )
            // InternalBomi.g:5898:3: rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__Group_10_3__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__0"
    // InternalBomi.g:5907:1: rule__BORoleInteraction__Group__0 : rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1 ;
    public final void rule__BORoleInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5911:1: ( rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1 )
            // InternalBomi.g:5912:2: rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BORoleInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__0"


    // $ANTLR start "rule__BORoleInteraction__Group__0__Impl"
    // InternalBomi.g:5919:1: rule__BORoleInteraction__Group__0__Impl : ( () ) ;
    public final void rule__BORoleInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5923:1: ( ( () ) )
            // InternalBomi.g:5924:1: ( () )
            {
            // InternalBomi.g:5924:1: ( () )
            // InternalBomi.g:5925:2: ()
            {
             before(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionAction_0()); 
            // InternalBomi.g:5926:2: ()
            // InternalBomi.g:5926:3: 
            {
            }

             after(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__1"
    // InternalBomi.g:5934:1: rule__BORoleInteraction__Group__1 : rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2 ;
    public final void rule__BORoleInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5938:1: ( rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2 )
            // InternalBomi.g:5939:2: rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__1"


    // $ANTLR start "rule__BORoleInteraction__Group__1__Impl"
    // InternalBomi.g:5946:1: rule__BORoleInteraction__Group__1__Impl : ( 'BORoleInteraction' ) ;
    public final void rule__BORoleInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5950:1: ( ( 'BORoleInteraction' ) )
            // InternalBomi.g:5951:1: ( 'BORoleInteraction' )
            {
            // InternalBomi.g:5951:1: ( 'BORoleInteraction' )
            // InternalBomi.g:5952:2: 'BORoleInteraction'
            {
             before(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__2"
    // InternalBomi.g:5961:1: rule__BORoleInteraction__Group__2 : rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3 ;
    public final void rule__BORoleInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5965:1: ( rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3 )
            // InternalBomi.g:5966:2: rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BORoleInteraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__2"


    // $ANTLR start "rule__BORoleInteraction__Group__2__Impl"
    // InternalBomi.g:5973:1: rule__BORoleInteraction__Group__2__Impl : ( ( rule__BORoleInteraction__NameAssignment_2 ) ) ;
    public final void rule__BORoleInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5977:1: ( ( ( rule__BORoleInteraction__NameAssignment_2 ) ) )
            // InternalBomi.g:5978:1: ( ( rule__BORoleInteraction__NameAssignment_2 ) )
            {
            // InternalBomi.g:5978:1: ( ( rule__BORoleInteraction__NameAssignment_2 ) )
            // InternalBomi.g:5979:2: ( rule__BORoleInteraction__NameAssignment_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getNameAssignment_2()); 
            // InternalBomi.g:5980:2: ( rule__BORoleInteraction__NameAssignment_2 )
            // InternalBomi.g:5980:3: rule__BORoleInteraction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__2__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__3"
    // InternalBomi.g:5988:1: rule__BORoleInteraction__Group__3 : rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4 ;
    public final void rule__BORoleInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5992:1: ( rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4 )
            // InternalBomi.g:5993:2: rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__3"


    // $ANTLR start "rule__BORoleInteraction__Group__3__Impl"
    // InternalBomi.g:6000:1: rule__BORoleInteraction__Group__3__Impl : ( '{' ) ;
    public final void rule__BORoleInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6004:1: ( ( '{' ) )
            // InternalBomi.g:6005:1: ( '{' )
            {
            // InternalBomi.g:6005:1: ( '{' )
            // InternalBomi.g:6006:2: '{'
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__3__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__4"
    // InternalBomi.g:6015:1: rule__BORoleInteraction__Group__4 : rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5 ;
    public final void rule__BORoleInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6019:1: ( rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5 )
            // InternalBomi.g:6020:2: rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__4"


    // $ANTLR start "rule__BORoleInteraction__Group__4__Impl"
    // InternalBomi.g:6027:1: rule__BORoleInteraction__Group__4__Impl : ( ( rule__BORoleInteraction__Group_4__0 )? ) ;
    public final void rule__BORoleInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6031:1: ( ( ( rule__BORoleInteraction__Group_4__0 )? ) )
            // InternalBomi.g:6032:1: ( ( rule__BORoleInteraction__Group_4__0 )? )
            {
            // InternalBomi.g:6032:1: ( ( rule__BORoleInteraction__Group_4__0 )? )
            // InternalBomi.g:6033:2: ( rule__BORoleInteraction__Group_4__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_4()); 
            // InternalBomi.g:6034:2: ( rule__BORoleInteraction__Group_4__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==45) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBomi.g:6034:3: rule__BORoleInteraction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__4__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__5"
    // InternalBomi.g:6042:1: rule__BORoleInteraction__Group__5 : rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6 ;
    public final void rule__BORoleInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6046:1: ( rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6 )
            // InternalBomi.g:6047:2: rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__5"


    // $ANTLR start "rule__BORoleInteraction__Group__5__Impl"
    // InternalBomi.g:6054:1: rule__BORoleInteraction__Group__5__Impl : ( ( rule__BORoleInteraction__Group_5__0 )? ) ;
    public final void rule__BORoleInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6058:1: ( ( ( rule__BORoleInteraction__Group_5__0 )? ) )
            // InternalBomi.g:6059:1: ( ( rule__BORoleInteraction__Group_5__0 )? )
            {
            // InternalBomi.g:6059:1: ( ( rule__BORoleInteraction__Group_5__0 )? )
            // InternalBomi.g:6060:2: ( rule__BORoleInteraction__Group_5__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_5()); 
            // InternalBomi.g:6061:2: ( rule__BORoleInteraction__Group_5__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBomi.g:6061:3: rule__BORoleInteraction__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__5__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__6"
    // InternalBomi.g:6069:1: rule__BORoleInteraction__Group__6 : rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7 ;
    public final void rule__BORoleInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6073:1: ( rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7 )
            // InternalBomi.g:6074:2: rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__6"


    // $ANTLR start "rule__BORoleInteraction__Group__6__Impl"
    // InternalBomi.g:6081:1: rule__BORoleInteraction__Group__6__Impl : ( ( rule__BORoleInteraction__Group_6__0 )? ) ;
    public final void rule__BORoleInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6085:1: ( ( ( rule__BORoleInteraction__Group_6__0 )? ) )
            // InternalBomi.g:6086:1: ( ( rule__BORoleInteraction__Group_6__0 )? )
            {
            // InternalBomi.g:6086:1: ( ( rule__BORoleInteraction__Group_6__0 )? )
            // InternalBomi.g:6087:2: ( rule__BORoleInteraction__Group_6__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_6()); 
            // InternalBomi.g:6088:2: ( rule__BORoleInteraction__Group_6__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==73) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBomi.g:6088:3: rule__BORoleInteraction__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__6__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__7"
    // InternalBomi.g:6096:1: rule__BORoleInteraction__Group__7 : rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8 ;
    public final void rule__BORoleInteraction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6100:1: ( rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8 )
            // InternalBomi.g:6101:2: rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__7"


    // $ANTLR start "rule__BORoleInteraction__Group__7__Impl"
    // InternalBomi.g:6108:1: rule__BORoleInteraction__Group__7__Impl : ( ( rule__BORoleInteraction__Group_7__0 )? ) ;
    public final void rule__BORoleInteraction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6112:1: ( ( ( rule__BORoleInteraction__Group_7__0 )? ) )
            // InternalBomi.g:6113:1: ( ( rule__BORoleInteraction__Group_7__0 )? )
            {
            // InternalBomi.g:6113:1: ( ( rule__BORoleInteraction__Group_7__0 )? )
            // InternalBomi.g:6114:2: ( rule__BORoleInteraction__Group_7__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_7()); 
            // InternalBomi.g:6115:2: ( rule__BORoleInteraction__Group_7__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==74) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBomi.g:6115:3: rule__BORoleInteraction__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__7__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__8"
    // InternalBomi.g:6123:1: rule__BORoleInteraction__Group__8 : rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9 ;
    public final void rule__BORoleInteraction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6127:1: ( rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9 )
            // InternalBomi.g:6128:2: rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__8"


    // $ANTLR start "rule__BORoleInteraction__Group__8__Impl"
    // InternalBomi.g:6135:1: rule__BORoleInteraction__Group__8__Impl : ( ( rule__BORoleInteraction__Group_8__0 )? ) ;
    public final void rule__BORoleInteraction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6139:1: ( ( ( rule__BORoleInteraction__Group_8__0 )? ) )
            // InternalBomi.g:6140:1: ( ( rule__BORoleInteraction__Group_8__0 )? )
            {
            // InternalBomi.g:6140:1: ( ( rule__BORoleInteraction__Group_8__0 )? )
            // InternalBomi.g:6141:2: ( rule__BORoleInteraction__Group_8__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_8()); 
            // InternalBomi.g:6142:2: ( rule__BORoleInteraction__Group_8__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==75) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBomi.g:6142:3: rule__BORoleInteraction__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__8__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__9"
    // InternalBomi.g:6150:1: rule__BORoleInteraction__Group__9 : rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10 ;
    public final void rule__BORoleInteraction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6154:1: ( rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10 )
            // InternalBomi.g:6155:2: rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__9"


    // $ANTLR start "rule__BORoleInteraction__Group__9__Impl"
    // InternalBomi.g:6162:1: rule__BORoleInteraction__Group__9__Impl : ( ( rule__BORoleInteraction__Group_9__0 )? ) ;
    public final void rule__BORoleInteraction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6166:1: ( ( ( rule__BORoleInteraction__Group_9__0 )? ) )
            // InternalBomi.g:6167:1: ( ( rule__BORoleInteraction__Group_9__0 )? )
            {
            // InternalBomi.g:6167:1: ( ( rule__BORoleInteraction__Group_9__0 )? )
            // InternalBomi.g:6168:2: ( rule__BORoleInteraction__Group_9__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_9()); 
            // InternalBomi.g:6169:2: ( rule__BORoleInteraction__Group_9__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==77) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBomi.g:6169:3: rule__BORoleInteraction__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__9__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__10"
    // InternalBomi.g:6177:1: rule__BORoleInteraction__Group__10 : rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11 ;
    public final void rule__BORoleInteraction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6181:1: ( rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11 )
            // InternalBomi.g:6182:2: rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__10"


    // $ANTLR start "rule__BORoleInteraction__Group__10__Impl"
    // InternalBomi.g:6189:1: rule__BORoleInteraction__Group__10__Impl : ( ( rule__BORoleInteraction__Group_10__0 )? ) ;
    public final void rule__BORoleInteraction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6193:1: ( ( ( rule__BORoleInteraction__Group_10__0 )? ) )
            // InternalBomi.g:6194:1: ( ( rule__BORoleInteraction__Group_10__0 )? )
            {
            // InternalBomi.g:6194:1: ( ( rule__BORoleInteraction__Group_10__0 )? )
            // InternalBomi.g:6195:2: ( rule__BORoleInteraction__Group_10__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_10()); 
            // InternalBomi.g:6196:2: ( rule__BORoleInteraction__Group_10__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==78) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalBomi.g:6196:3: rule__BORoleInteraction__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__10__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__11"
    // InternalBomi.g:6204:1: rule__BORoleInteraction__Group__11 : rule__BORoleInteraction__Group__11__Impl rule__BORoleInteraction__Group__12 ;
    public final void rule__BORoleInteraction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6208:1: ( rule__BORoleInteraction__Group__11__Impl rule__BORoleInteraction__Group__12 )
            // InternalBomi.g:6209:2: rule__BORoleInteraction__Group__11__Impl rule__BORoleInteraction__Group__12
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__11"


    // $ANTLR start "rule__BORoleInteraction__Group__11__Impl"
    // InternalBomi.g:6216:1: rule__BORoleInteraction__Group__11__Impl : ( ( rule__BORoleInteraction__Group_11__0 )? ) ;
    public final void rule__BORoleInteraction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6220:1: ( ( ( rule__BORoleInteraction__Group_11__0 )? ) )
            // InternalBomi.g:6221:1: ( ( rule__BORoleInteraction__Group_11__0 )? )
            {
            // InternalBomi.g:6221:1: ( ( rule__BORoleInteraction__Group_11__0 )? )
            // InternalBomi.g:6222:2: ( rule__BORoleInteraction__Group_11__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_11()); 
            // InternalBomi.g:6223:2: ( rule__BORoleInteraction__Group_11__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==79) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBomi.g:6223:3: rule__BORoleInteraction__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__11__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__12"
    // InternalBomi.g:6231:1: rule__BORoleInteraction__Group__12 : rule__BORoleInteraction__Group__12__Impl rule__BORoleInteraction__Group__13 ;
    public final void rule__BORoleInteraction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6235:1: ( rule__BORoleInteraction__Group__12__Impl rule__BORoleInteraction__Group__13 )
            // InternalBomi.g:6236:2: rule__BORoleInteraction__Group__12__Impl rule__BORoleInteraction__Group__13
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__12"


    // $ANTLR start "rule__BORoleInteraction__Group__12__Impl"
    // InternalBomi.g:6243:1: rule__BORoleInteraction__Group__12__Impl : ( ( rule__BORoleInteraction__Group_12__0 )? ) ;
    public final void rule__BORoleInteraction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6247:1: ( ( ( rule__BORoleInteraction__Group_12__0 )? ) )
            // InternalBomi.g:6248:1: ( ( rule__BORoleInteraction__Group_12__0 )? )
            {
            // InternalBomi.g:6248:1: ( ( rule__BORoleInteraction__Group_12__0 )? )
            // InternalBomi.g:6249:2: ( rule__BORoleInteraction__Group_12__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_12()); 
            // InternalBomi.g:6250:2: ( rule__BORoleInteraction__Group_12__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==80) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalBomi.g:6250:3: rule__BORoleInteraction__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__12__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__13"
    // InternalBomi.g:6258:1: rule__BORoleInteraction__Group__13 : rule__BORoleInteraction__Group__13__Impl rule__BORoleInteraction__Group__14 ;
    public final void rule__BORoleInteraction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6262:1: ( rule__BORoleInteraction__Group__13__Impl rule__BORoleInteraction__Group__14 )
            // InternalBomi.g:6263:2: rule__BORoleInteraction__Group__13__Impl rule__BORoleInteraction__Group__14
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__13"


    // $ANTLR start "rule__BORoleInteraction__Group__13__Impl"
    // InternalBomi.g:6270:1: rule__BORoleInteraction__Group__13__Impl : ( ( rule__BORoleInteraction__Group_13__0 )? ) ;
    public final void rule__BORoleInteraction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6274:1: ( ( ( rule__BORoleInteraction__Group_13__0 )? ) )
            // InternalBomi.g:6275:1: ( ( rule__BORoleInteraction__Group_13__0 )? )
            {
            // InternalBomi.g:6275:1: ( ( rule__BORoleInteraction__Group_13__0 )? )
            // InternalBomi.g:6276:2: ( rule__BORoleInteraction__Group_13__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_13()); 
            // InternalBomi.g:6277:2: ( rule__BORoleInteraction__Group_13__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==81) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBomi.g:6277:3: rule__BORoleInteraction__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__13__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__14"
    // InternalBomi.g:6285:1: rule__BORoleInteraction__Group__14 : rule__BORoleInteraction__Group__14__Impl rule__BORoleInteraction__Group__15 ;
    public final void rule__BORoleInteraction__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6289:1: ( rule__BORoleInteraction__Group__14__Impl rule__BORoleInteraction__Group__15 )
            // InternalBomi.g:6290:2: rule__BORoleInteraction__Group__14__Impl rule__BORoleInteraction__Group__15
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__14"


    // $ANTLR start "rule__BORoleInteraction__Group__14__Impl"
    // InternalBomi.g:6297:1: rule__BORoleInteraction__Group__14__Impl : ( ( rule__BORoleInteraction__Group_14__0 )? ) ;
    public final void rule__BORoleInteraction__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6301:1: ( ( ( rule__BORoleInteraction__Group_14__0 )? ) )
            // InternalBomi.g:6302:1: ( ( rule__BORoleInteraction__Group_14__0 )? )
            {
            // InternalBomi.g:6302:1: ( ( rule__BORoleInteraction__Group_14__0 )? )
            // InternalBomi.g:6303:2: ( rule__BORoleInteraction__Group_14__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_14()); 
            // InternalBomi.g:6304:2: ( rule__BORoleInteraction__Group_14__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==35) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBomi.g:6304:3: rule__BORoleInteraction__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__14__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__15"
    // InternalBomi.g:6312:1: rule__BORoleInteraction__Group__15 : rule__BORoleInteraction__Group__15__Impl rule__BORoleInteraction__Group__16 ;
    public final void rule__BORoleInteraction__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6316:1: ( rule__BORoleInteraction__Group__15__Impl rule__BORoleInteraction__Group__16 )
            // InternalBomi.g:6317:2: rule__BORoleInteraction__Group__15__Impl rule__BORoleInteraction__Group__16
            {
            pushFollow(FOLLOW_30);
            rule__BORoleInteraction__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__15"


    // $ANTLR start "rule__BORoleInteraction__Group__15__Impl"
    // InternalBomi.g:6324:1: rule__BORoleInteraction__Group__15__Impl : ( ( rule__BORoleInteraction__Group_15__0 )? ) ;
    public final void rule__BORoleInteraction__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6328:1: ( ( ( rule__BORoleInteraction__Group_15__0 )? ) )
            // InternalBomi.g:6329:1: ( ( rule__BORoleInteraction__Group_15__0 )? )
            {
            // InternalBomi.g:6329:1: ( ( rule__BORoleInteraction__Group_15__0 )? )
            // InternalBomi.g:6330:2: ( rule__BORoleInteraction__Group_15__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_15()); 
            // InternalBomi.g:6331:2: ( rule__BORoleInteraction__Group_15__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==41) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalBomi.g:6331:3: rule__BORoleInteraction__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BORoleInteraction__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBORoleInteractionAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__15__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__16"
    // InternalBomi.g:6339:1: rule__BORoleInteraction__Group__16 : rule__BORoleInteraction__Group__16__Impl ;
    public final void rule__BORoleInteraction__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6343:1: ( rule__BORoleInteraction__Group__16__Impl )
            // InternalBomi.g:6344:2: rule__BORoleInteraction__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__16"


    // $ANTLR start "rule__BORoleInteraction__Group__16__Impl"
    // InternalBomi.g:6350:1: rule__BORoleInteraction__Group__16__Impl : ( '}' ) ;
    public final void rule__BORoleInteraction__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6354:1: ( ( '}' ) )
            // InternalBomi.g:6355:1: ( '}' )
            {
            // InternalBomi.g:6355:1: ( '}' )
            // InternalBomi.g:6356:2: '}'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightCurlyBracketKeyword_16()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group__16__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_4__0"
    // InternalBomi.g:6366:1: rule__BORoleInteraction__Group_4__0 : rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1 ;
    public final void rule__BORoleInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6370:1: ( rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1 )
            // InternalBomi.g:6371:2: rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_4__0"


    // $ANTLR start "rule__BORoleInteraction__Group_4__0__Impl"
    // InternalBomi.g:6378:1: rule__BORoleInteraction__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BORoleInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6382:1: ( ( 'purpose' ) )
            // InternalBomi.g:6383:1: ( 'purpose' )
            {
            // InternalBomi.g:6383:1: ( 'purpose' )
            // InternalBomi.g:6384:2: 'purpose'
            {
             before(grammarAccess.getBORoleInteractionAccess().getPurposeKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getPurposeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_4__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_4__1"
    // InternalBomi.g:6393:1: rule__BORoleInteraction__Group_4__1 : rule__BORoleInteraction__Group_4__1__Impl ;
    public final void rule__BORoleInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6397:1: ( rule__BORoleInteraction__Group_4__1__Impl )
            // InternalBomi.g:6398:2: rule__BORoleInteraction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_4__1"


    // $ANTLR start "rule__BORoleInteraction__Group_4__1__Impl"
    // InternalBomi.g:6404:1: rule__BORoleInteraction__Group_4__1__Impl : ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) ) ;
    public final void rule__BORoleInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6408:1: ( ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:6409:1: ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:6409:1: ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) )
            // InternalBomi.g:6410:2: ( rule__BORoleInteraction__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:6411:2: ( rule__BORoleInteraction__PurposeAssignment_4_1 )
            // InternalBomi.g:6411:3: rule__BORoleInteraction__PurposeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__PurposeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getPurposeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_4__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_5__0"
    // InternalBomi.g:6420:1: rule__BORoleInteraction__Group_5__0 : rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1 ;
    public final void rule__BORoleInteraction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6424:1: ( rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1 )
            // InternalBomi.g:6425:2: rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__BORoleInteraction__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_5__0"


    // $ANTLR start "rule__BORoleInteraction__Group_5__0__Impl"
    // InternalBomi.g:6432:1: rule__BORoleInteraction__Group_5__0__Impl : ( 'accessability' ) ;
    public final void rule__BORoleInteraction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6436:1: ( ( 'accessability' ) )
            // InternalBomi.g:6437:1: ( 'accessability' )
            {
            // InternalBomi.g:6437:1: ( 'accessability' )
            // InternalBomi.g:6438:2: 'accessability'
            {
             before(grammarAccess.getBORoleInteractionAccess().getAccessabilityKeyword_5_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getAccessabilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_5__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_5__1"
    // InternalBomi.g:6447:1: rule__BORoleInteraction__Group_5__1 : rule__BORoleInteraction__Group_5__1__Impl ;
    public final void rule__BORoleInteraction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6451:1: ( rule__BORoleInteraction__Group_5__1__Impl )
            // InternalBomi.g:6452:2: rule__BORoleInteraction__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_5__1"


    // $ANTLR start "rule__BORoleInteraction__Group_5__1__Impl"
    // InternalBomi.g:6458:1: rule__BORoleInteraction__Group_5__1__Impl : ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) ) ;
    public final void rule__BORoleInteraction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6462:1: ( ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) ) )
            // InternalBomi.g:6463:1: ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) )
            {
            // InternalBomi.g:6463:1: ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) )
            // InternalBomi.g:6464:2: ( rule__BORoleInteraction__AccessabilityAssignment_5_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getAccessabilityAssignment_5_1()); 
            // InternalBomi.g:6465:2: ( rule__BORoleInteraction__AccessabilityAssignment_5_1 )
            // InternalBomi.g:6465:3: rule__BORoleInteraction__AccessabilityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__AccessabilityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getAccessabilityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_5__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_6__0"
    // InternalBomi.g:6474:1: rule__BORoleInteraction__Group_6__0 : rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1 ;
    public final void rule__BORoleInteraction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6478:1: ( rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1 )
            // InternalBomi.g:6479:2: rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__BORoleInteraction__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_6__0"


    // $ANTLR start "rule__BORoleInteraction__Group_6__0__Impl"
    // InternalBomi.g:6486:1: rule__BORoleInteraction__Group_6__0__Impl : ( 'stability' ) ;
    public final void rule__BORoleInteraction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6490:1: ( ( 'stability' ) )
            // InternalBomi.g:6491:1: ( 'stability' )
            {
            // InternalBomi.g:6491:1: ( 'stability' )
            // InternalBomi.g:6492:2: 'stability'
            {
             before(grammarAccess.getBORoleInteractionAccess().getStabilityKeyword_6_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getStabilityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_6__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_6__1"
    // InternalBomi.g:6501:1: rule__BORoleInteraction__Group_6__1 : rule__BORoleInteraction__Group_6__1__Impl ;
    public final void rule__BORoleInteraction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6505:1: ( rule__BORoleInteraction__Group_6__1__Impl )
            // InternalBomi.g:6506:2: rule__BORoleInteraction__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_6__1"


    // $ANTLR start "rule__BORoleInteraction__Group_6__1__Impl"
    // InternalBomi.g:6512:1: rule__BORoleInteraction__Group_6__1__Impl : ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) ) ;
    public final void rule__BORoleInteraction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6516:1: ( ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) ) )
            // InternalBomi.g:6517:1: ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) )
            {
            // InternalBomi.g:6517:1: ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) )
            // InternalBomi.g:6518:2: ( rule__BORoleInteraction__StabilityAssignment_6_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getStabilityAssignment_6_1()); 
            // InternalBomi.g:6519:2: ( rule__BORoleInteraction__StabilityAssignment_6_1 )
            // InternalBomi.g:6519:3: rule__BORoleInteraction__StabilityAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__StabilityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getStabilityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_6__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_7__0"
    // InternalBomi.g:6528:1: rule__BORoleInteraction__Group_7__0 : rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1 ;
    public final void rule__BORoleInteraction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6532:1: ( rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1 )
            // InternalBomi.g:6533:2: rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__BORoleInteraction__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_7__0"


    // $ANTLR start "rule__BORoleInteraction__Group_7__0__Impl"
    // InternalBomi.g:6540:1: rule__BORoleInteraction__Group_7__0__Impl : ( 'criticality' ) ;
    public final void rule__BORoleInteraction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6544:1: ( ( 'criticality' ) )
            // InternalBomi.g:6545:1: ( 'criticality' )
            {
            // InternalBomi.g:6545:1: ( 'criticality' )
            // InternalBomi.g:6546:2: 'criticality'
            {
             before(grammarAccess.getBORoleInteractionAccess().getCriticalityKeyword_7_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getCriticalityKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_7__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_7__1"
    // InternalBomi.g:6555:1: rule__BORoleInteraction__Group_7__1 : rule__BORoleInteraction__Group_7__1__Impl ;
    public final void rule__BORoleInteraction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6559:1: ( rule__BORoleInteraction__Group_7__1__Impl )
            // InternalBomi.g:6560:2: rule__BORoleInteraction__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_7__1"


    // $ANTLR start "rule__BORoleInteraction__Group_7__1__Impl"
    // InternalBomi.g:6566:1: rule__BORoleInteraction__Group_7__1__Impl : ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) ) ;
    public final void rule__BORoleInteraction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6570:1: ( ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) ) )
            // InternalBomi.g:6571:1: ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) )
            {
            // InternalBomi.g:6571:1: ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) )
            // InternalBomi.g:6572:2: ( rule__BORoleInteraction__CriticalityAssignment_7_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getCriticalityAssignment_7_1()); 
            // InternalBomi.g:6573:2: ( rule__BORoleInteraction__CriticalityAssignment_7_1 )
            // InternalBomi.g:6573:3: rule__BORoleInteraction__CriticalityAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__CriticalityAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getCriticalityAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_7__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_8__0"
    // InternalBomi.g:6582:1: rule__BORoleInteraction__Group_8__0 : rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1 ;
    public final void rule__BORoleInteraction__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6586:1: ( rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1 )
            // InternalBomi.g:6587:2: rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__BORoleInteraction__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_8__0"


    // $ANTLR start "rule__BORoleInteraction__Group_8__0__Impl"
    // InternalBomi.g:6594:1: rule__BORoleInteraction__Group_8__0__Impl : ( 'fitForPurpose' ) ;
    public final void rule__BORoleInteraction__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6598:1: ( ( 'fitForPurpose' ) )
            // InternalBomi.g:6599:1: ( 'fitForPurpose' )
            {
            // InternalBomi.g:6599:1: ( 'fitForPurpose' )
            // InternalBomi.g:6600:2: 'fitForPurpose'
            {
             before(grammarAccess.getBORoleInteractionAccess().getFitForPurposeKeyword_8_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getFitForPurposeKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_8__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_8__1"
    // InternalBomi.g:6609:1: rule__BORoleInteraction__Group_8__1 : rule__BORoleInteraction__Group_8__1__Impl ;
    public final void rule__BORoleInteraction__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6613:1: ( rule__BORoleInteraction__Group_8__1__Impl )
            // InternalBomi.g:6614:2: rule__BORoleInteraction__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_8__1"


    // $ANTLR start "rule__BORoleInteraction__Group_8__1__Impl"
    // InternalBomi.g:6620:1: rule__BORoleInteraction__Group_8__1__Impl : ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) ) ;
    public final void rule__BORoleInteraction__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6624:1: ( ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) ) )
            // InternalBomi.g:6625:1: ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) )
            {
            // InternalBomi.g:6625:1: ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) )
            // InternalBomi.g:6626:2: ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getFitForPurposeAssignment_8_1()); 
            // InternalBomi.g:6627:2: ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 )
            // InternalBomi.g:6627:3: rule__BORoleInteraction__FitForPurposeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__FitForPurposeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getFitForPurposeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_8__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_9__0"
    // InternalBomi.g:6636:1: rule__BORoleInteraction__Group_9__0 : rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1 ;
    public final void rule__BORoleInteraction__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6640:1: ( rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1 )
            // InternalBomi.g:6641:2: rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1
            {
            pushFollow(FOLLOW_31);
            rule__BORoleInteraction__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__0"


    // $ANTLR start "rule__BORoleInteraction__Group_9__0__Impl"
    // InternalBomi.g:6648:1: rule__BORoleInteraction__Group_9__0__Impl : ( 'responsible' ) ;
    public final void rule__BORoleInteraction__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6652:1: ( ( 'responsible' ) )
            // InternalBomi.g:6653:1: ( 'responsible' )
            {
            // InternalBomi.g:6653:1: ( 'responsible' )
            // InternalBomi.g:6654:2: 'responsible'
            {
             before(grammarAccess.getBORoleInteractionAccess().getResponsibleKeyword_9_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getResponsibleKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_9__1"
    // InternalBomi.g:6663:1: rule__BORoleInteraction__Group_9__1 : rule__BORoleInteraction__Group_9__1__Impl ;
    public final void rule__BORoleInteraction__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6667:1: ( rule__BORoleInteraction__Group_9__1__Impl )
            // InternalBomi.g:6668:2: rule__BORoleInteraction__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__1"


    // $ANTLR start "rule__BORoleInteraction__Group_9__1__Impl"
    // InternalBomi.g:6674:1: rule__BORoleInteraction__Group_9__1__Impl : ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) ) ;
    public final void rule__BORoleInteraction__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6678:1: ( ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) ) )
            // InternalBomi.g:6679:1: ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) )
            {
            // InternalBomi.g:6679:1: ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) )
            // InternalBomi.g:6680:2: ( rule__BORoleInteraction__ResponsibleAssignment_9_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getResponsibleAssignment_9_1()); 
            // InternalBomi.g:6681:2: ( rule__BORoleInteraction__ResponsibleAssignment_9_1 )
            // InternalBomi.g:6681:3: rule__BORoleInteraction__ResponsibleAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__ResponsibleAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getResponsibleAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_10__0"
    // InternalBomi.g:6690:1: rule__BORoleInteraction__Group_10__0 : rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1 ;
    public final void rule__BORoleInteraction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6694:1: ( rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1 )
            // InternalBomi.g:6695:2: rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1
            {
            pushFollow(FOLLOW_31);
            rule__BORoleInteraction__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__0"


    // $ANTLR start "rule__BORoleInteraction__Group_10__0__Impl"
    // InternalBomi.g:6702:1: rule__BORoleInteraction__Group_10__0__Impl : ( 'creates' ) ;
    public final void rule__BORoleInteraction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6706:1: ( ( 'creates' ) )
            // InternalBomi.g:6707:1: ( 'creates' )
            {
            // InternalBomi.g:6707:1: ( 'creates' )
            // InternalBomi.g:6708:2: 'creates'
            {
             before(grammarAccess.getBORoleInteractionAccess().getCreatesKeyword_10_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getCreatesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_10__1"
    // InternalBomi.g:6717:1: rule__BORoleInteraction__Group_10__1 : rule__BORoleInteraction__Group_10__1__Impl ;
    public final void rule__BORoleInteraction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6721:1: ( rule__BORoleInteraction__Group_10__1__Impl )
            // InternalBomi.g:6722:2: rule__BORoleInteraction__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__1"


    // $ANTLR start "rule__BORoleInteraction__Group_10__1__Impl"
    // InternalBomi.g:6728:1: rule__BORoleInteraction__Group_10__1__Impl : ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) ) ;
    public final void rule__BORoleInteraction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6732:1: ( ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) ) )
            // InternalBomi.g:6733:1: ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) )
            {
            // InternalBomi.g:6733:1: ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) )
            // InternalBomi.g:6734:2: ( rule__BORoleInteraction__CreatesAssignment_10_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getCreatesAssignment_10_1()); 
            // InternalBomi.g:6735:2: ( rule__BORoleInteraction__CreatesAssignment_10_1 )
            // InternalBomi.g:6735:3: rule__BORoleInteraction__CreatesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__CreatesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getCreatesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_11__0"
    // InternalBomi.g:6744:1: rule__BORoleInteraction__Group_11__0 : rule__BORoleInteraction__Group_11__0__Impl rule__BORoleInteraction__Group_11__1 ;
    public final void rule__BORoleInteraction__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6748:1: ( rule__BORoleInteraction__Group_11__0__Impl rule__BORoleInteraction__Group_11__1 )
            // InternalBomi.g:6749:2: rule__BORoleInteraction__Group_11__0__Impl rule__BORoleInteraction__Group_11__1
            {
            pushFollow(FOLLOW_31);
            rule__BORoleInteraction__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_11__0"


    // $ANTLR start "rule__BORoleInteraction__Group_11__0__Impl"
    // InternalBomi.g:6756:1: rule__BORoleInteraction__Group_11__0__Impl : ( 'reads' ) ;
    public final void rule__BORoleInteraction__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6760:1: ( ( 'reads' ) )
            // InternalBomi.g:6761:1: ( 'reads' )
            {
            // InternalBomi.g:6761:1: ( 'reads' )
            // InternalBomi.g:6762:2: 'reads'
            {
             before(grammarAccess.getBORoleInteractionAccess().getReadsKeyword_11_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getReadsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_11__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_11__1"
    // InternalBomi.g:6771:1: rule__BORoleInteraction__Group_11__1 : rule__BORoleInteraction__Group_11__1__Impl ;
    public final void rule__BORoleInteraction__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6775:1: ( rule__BORoleInteraction__Group_11__1__Impl )
            // InternalBomi.g:6776:2: rule__BORoleInteraction__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_11__1"


    // $ANTLR start "rule__BORoleInteraction__Group_11__1__Impl"
    // InternalBomi.g:6782:1: rule__BORoleInteraction__Group_11__1__Impl : ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) ) ;
    public final void rule__BORoleInteraction__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6786:1: ( ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) ) )
            // InternalBomi.g:6787:1: ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) )
            {
            // InternalBomi.g:6787:1: ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) )
            // InternalBomi.g:6788:2: ( rule__BORoleInteraction__ReadsAssignment_11_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getReadsAssignment_11_1()); 
            // InternalBomi.g:6789:2: ( rule__BORoleInteraction__ReadsAssignment_11_1 )
            // InternalBomi.g:6789:3: rule__BORoleInteraction__ReadsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__ReadsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getReadsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_11__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_12__0"
    // InternalBomi.g:6798:1: rule__BORoleInteraction__Group_12__0 : rule__BORoleInteraction__Group_12__0__Impl rule__BORoleInteraction__Group_12__1 ;
    public final void rule__BORoleInteraction__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6802:1: ( rule__BORoleInteraction__Group_12__0__Impl rule__BORoleInteraction__Group_12__1 )
            // InternalBomi.g:6803:2: rule__BORoleInteraction__Group_12__0__Impl rule__BORoleInteraction__Group_12__1
            {
            pushFollow(FOLLOW_31);
            rule__BORoleInteraction__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_12__0"


    // $ANTLR start "rule__BORoleInteraction__Group_12__0__Impl"
    // InternalBomi.g:6810:1: rule__BORoleInteraction__Group_12__0__Impl : ( 'updates' ) ;
    public final void rule__BORoleInteraction__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6814:1: ( ( 'updates' ) )
            // InternalBomi.g:6815:1: ( 'updates' )
            {
            // InternalBomi.g:6815:1: ( 'updates' )
            // InternalBomi.g:6816:2: 'updates'
            {
             before(grammarAccess.getBORoleInteractionAccess().getUpdatesKeyword_12_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getUpdatesKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_12__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_12__1"
    // InternalBomi.g:6825:1: rule__BORoleInteraction__Group_12__1 : rule__BORoleInteraction__Group_12__1__Impl ;
    public final void rule__BORoleInteraction__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6829:1: ( rule__BORoleInteraction__Group_12__1__Impl )
            // InternalBomi.g:6830:2: rule__BORoleInteraction__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_12__1"


    // $ANTLR start "rule__BORoleInteraction__Group_12__1__Impl"
    // InternalBomi.g:6836:1: rule__BORoleInteraction__Group_12__1__Impl : ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) ) ;
    public final void rule__BORoleInteraction__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6840:1: ( ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) ) )
            // InternalBomi.g:6841:1: ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) )
            {
            // InternalBomi.g:6841:1: ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) )
            // InternalBomi.g:6842:2: ( rule__BORoleInteraction__UpdatesAssignment_12_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getUpdatesAssignment_12_1()); 
            // InternalBomi.g:6843:2: ( rule__BORoleInteraction__UpdatesAssignment_12_1 )
            // InternalBomi.g:6843:3: rule__BORoleInteraction__UpdatesAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__UpdatesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getUpdatesAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_12__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_13__0"
    // InternalBomi.g:6852:1: rule__BORoleInteraction__Group_13__0 : rule__BORoleInteraction__Group_13__0__Impl rule__BORoleInteraction__Group_13__1 ;
    public final void rule__BORoleInteraction__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6856:1: ( rule__BORoleInteraction__Group_13__0__Impl rule__BORoleInteraction__Group_13__1 )
            // InternalBomi.g:6857:2: rule__BORoleInteraction__Group_13__0__Impl rule__BORoleInteraction__Group_13__1
            {
            pushFollow(FOLLOW_31);
            rule__BORoleInteraction__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_13__0"


    // $ANTLR start "rule__BORoleInteraction__Group_13__0__Impl"
    // InternalBomi.g:6864:1: rule__BORoleInteraction__Group_13__0__Impl : ( 'deletes' ) ;
    public final void rule__BORoleInteraction__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6868:1: ( ( 'deletes' ) )
            // InternalBomi.g:6869:1: ( 'deletes' )
            {
            // InternalBomi.g:6869:1: ( 'deletes' )
            // InternalBomi.g:6870:2: 'deletes'
            {
             before(grammarAccess.getBORoleInteractionAccess().getDeletesKeyword_13_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getDeletesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_13__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_13__1"
    // InternalBomi.g:6879:1: rule__BORoleInteraction__Group_13__1 : rule__BORoleInteraction__Group_13__1__Impl ;
    public final void rule__BORoleInteraction__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6883:1: ( rule__BORoleInteraction__Group_13__1__Impl )
            // InternalBomi.g:6884:2: rule__BORoleInteraction__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_13__1"


    // $ANTLR start "rule__BORoleInteraction__Group_13__1__Impl"
    // InternalBomi.g:6890:1: rule__BORoleInteraction__Group_13__1__Impl : ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) ) ;
    public final void rule__BORoleInteraction__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6894:1: ( ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) ) )
            // InternalBomi.g:6895:1: ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) )
            {
            // InternalBomi.g:6895:1: ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) )
            // InternalBomi.g:6896:2: ( rule__BORoleInteraction__DeletesAssignment_13_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getDeletesAssignment_13_1()); 
            // InternalBomi.g:6897:2: ( rule__BORoleInteraction__DeletesAssignment_13_1 )
            // InternalBomi.g:6897:3: rule__BORoleInteraction__DeletesAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__DeletesAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getDeletesAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_13__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_14__0"
    // InternalBomi.g:6906:1: rule__BORoleInteraction__Group_14__0 : rule__BORoleInteraction__Group_14__0__Impl rule__BORoleInteraction__Group_14__1 ;
    public final void rule__BORoleInteraction__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6910:1: ( rule__BORoleInteraction__Group_14__0__Impl rule__BORoleInteraction__Group_14__1 )
            // InternalBomi.g:6911:2: rule__BORoleInteraction__Group_14__0__Impl rule__BORoleInteraction__Group_14__1
            {
            pushFollow(FOLLOW_24);
            rule__BORoleInteraction__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__0"


    // $ANTLR start "rule__BORoleInteraction__Group_14__0__Impl"
    // InternalBomi.g:6918:1: rule__BORoleInteraction__Group_14__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BORoleInteraction__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6922:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:6923:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:6923:1: ( 'boundaryObjects' )
            // InternalBomi.g:6924:2: 'boundaryObjects'
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsKeyword_14_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_14__1"
    // InternalBomi.g:6933:1: rule__BORoleInteraction__Group_14__1 : rule__BORoleInteraction__Group_14__1__Impl rule__BORoleInteraction__Group_14__2 ;
    public final void rule__BORoleInteraction__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6937:1: ( rule__BORoleInteraction__Group_14__1__Impl rule__BORoleInteraction__Group_14__2 )
            // InternalBomi.g:6938:2: rule__BORoleInteraction__Group_14__1__Impl rule__BORoleInteraction__Group_14__2
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__1"


    // $ANTLR start "rule__BORoleInteraction__Group_14__1__Impl"
    // InternalBomi.g:6945:1: rule__BORoleInteraction__Group_14__1__Impl : ( '(' ) ;
    public final void rule__BORoleInteraction__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6949:1: ( ( '(' ) )
            // InternalBomi.g:6950:1: ( '(' )
            {
            // InternalBomi.g:6950:1: ( '(' )
            // InternalBomi.g:6951:2: '('
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_14__2"
    // InternalBomi.g:6960:1: rule__BORoleInteraction__Group_14__2 : rule__BORoleInteraction__Group_14__2__Impl rule__BORoleInteraction__Group_14__3 ;
    public final void rule__BORoleInteraction__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6964:1: ( rule__BORoleInteraction__Group_14__2__Impl rule__BORoleInteraction__Group_14__3 )
            // InternalBomi.g:6965:2: rule__BORoleInteraction__Group_14__2__Impl rule__BORoleInteraction__Group_14__3
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__2"


    // $ANTLR start "rule__BORoleInteraction__Group_14__2__Impl"
    // InternalBomi.g:6972:1: rule__BORoleInteraction__Group_14__2__Impl : ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) ) ;
    public final void rule__BORoleInteraction__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6976:1: ( ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) ) )
            // InternalBomi.g:6977:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) )
            {
            // InternalBomi.g:6977:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) )
            // InternalBomi.g:6978:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_14_2()); 
            // InternalBomi.g:6979:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 )
            // InternalBomi.g:6979:3: rule__BORoleInteraction__BoundaryObjectsAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__BoundaryObjectsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__2__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_14__3"
    // InternalBomi.g:6987:1: rule__BORoleInteraction__Group_14__3 : rule__BORoleInteraction__Group_14__3__Impl rule__BORoleInteraction__Group_14__4 ;
    public final void rule__BORoleInteraction__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6991:1: ( rule__BORoleInteraction__Group_14__3__Impl rule__BORoleInteraction__Group_14__4 )
            // InternalBomi.g:6992:2: rule__BORoleInteraction__Group_14__3__Impl rule__BORoleInteraction__Group_14__4
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__3"


    // $ANTLR start "rule__BORoleInteraction__Group_14__3__Impl"
    // InternalBomi.g:6999:1: rule__BORoleInteraction__Group_14__3__Impl : ( ( rule__BORoleInteraction__Group_14_3__0 )* ) ;
    public final void rule__BORoleInteraction__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7003:1: ( ( ( rule__BORoleInteraction__Group_14_3__0 )* ) )
            // InternalBomi.g:7004:1: ( ( rule__BORoleInteraction__Group_14_3__0 )* )
            {
            // InternalBomi.g:7004:1: ( ( rule__BORoleInteraction__Group_14_3__0 )* )
            // InternalBomi.g:7005:2: ( rule__BORoleInteraction__Group_14_3__0 )*
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_14_3()); 
            // InternalBomi.g:7006:2: ( rule__BORoleInteraction__Group_14_3__0 )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==38) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalBomi.g:7006:3: rule__BORoleInteraction__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BORoleInteraction__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

             after(grammarAccess.getBORoleInteractionAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__3__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_14__4"
    // InternalBomi.g:7014:1: rule__BORoleInteraction__Group_14__4 : rule__BORoleInteraction__Group_14__4__Impl ;
    public final void rule__BORoleInteraction__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7018:1: ( rule__BORoleInteraction__Group_14__4__Impl )
            // InternalBomi.g:7019:2: rule__BORoleInteraction__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__4"


    // $ANTLR start "rule__BORoleInteraction__Group_14__4__Impl"
    // InternalBomi.g:7025:1: rule__BORoleInteraction__Group_14__4__Impl : ( ')' ) ;
    public final void rule__BORoleInteraction__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7029:1: ( ( ')' ) )
            // InternalBomi.g:7030:1: ( ')' )
            {
            // InternalBomi.g:7030:1: ( ')' )
            // InternalBomi.g:7031:2: ')'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_14_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14__4__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_14_3__0"
    // InternalBomi.g:7041:1: rule__BORoleInteraction__Group_14_3__0 : rule__BORoleInteraction__Group_14_3__0__Impl rule__BORoleInteraction__Group_14_3__1 ;
    public final void rule__BORoleInteraction__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7045:1: ( rule__BORoleInteraction__Group_14_3__0__Impl rule__BORoleInteraction__Group_14_3__1 )
            // InternalBomi.g:7046:2: rule__BORoleInteraction__Group_14_3__0__Impl rule__BORoleInteraction__Group_14_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14_3__0"


    // $ANTLR start "rule__BORoleInteraction__Group_14_3__0__Impl"
    // InternalBomi.g:7053:1: rule__BORoleInteraction__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__BORoleInteraction__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7057:1: ( ( ',' ) )
            // InternalBomi.g:7058:1: ( ',' )
            {
            // InternalBomi.g:7058:1: ( ',' )
            // InternalBomi.g:7059:2: ','
            {
             before(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_14_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14_3__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_14_3__1"
    // InternalBomi.g:7068:1: rule__BORoleInteraction__Group_14_3__1 : rule__BORoleInteraction__Group_14_3__1__Impl ;
    public final void rule__BORoleInteraction__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7072:1: ( rule__BORoleInteraction__Group_14_3__1__Impl )
            // InternalBomi.g:7073:2: rule__BORoleInteraction__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14_3__1"


    // $ANTLR start "rule__BORoleInteraction__Group_14_3__1__Impl"
    // InternalBomi.g:7079:1: rule__BORoleInteraction__Group_14_3__1__Impl : ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) ) ;
    public final void rule__BORoleInteraction__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7083:1: ( ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) ) )
            // InternalBomi.g:7084:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) )
            {
            // InternalBomi.g:7084:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) )
            // InternalBomi.g:7085:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_14_3_1()); 
            // InternalBomi.g:7086:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 )
            // InternalBomi.g:7086:3: rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_14_3__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_15__0"
    // InternalBomi.g:7095:1: rule__BORoleInteraction__Group_15__0 : rule__BORoleInteraction__Group_15__0__Impl rule__BORoleInteraction__Group_15__1 ;
    public final void rule__BORoleInteraction__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7099:1: ( rule__BORoleInteraction__Group_15__0__Impl rule__BORoleInteraction__Group_15__1 )
            // InternalBomi.g:7100:2: rule__BORoleInteraction__Group_15__0__Impl rule__BORoleInteraction__Group_15__1
            {
            pushFollow(FOLLOW_24);
            rule__BORoleInteraction__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__0"


    // $ANTLR start "rule__BORoleInteraction__Group_15__0__Impl"
    // InternalBomi.g:7107:1: rule__BORoleInteraction__Group_15__0__Impl : ( 'roles' ) ;
    public final void rule__BORoleInteraction__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7111:1: ( ( 'roles' ) )
            // InternalBomi.g:7112:1: ( 'roles' )
            {
            // InternalBomi.g:7112:1: ( 'roles' )
            // InternalBomi.g:7113:2: 'roles'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesKeyword_15_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRolesKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_15__1"
    // InternalBomi.g:7122:1: rule__BORoleInteraction__Group_15__1 : rule__BORoleInteraction__Group_15__1__Impl rule__BORoleInteraction__Group_15__2 ;
    public final void rule__BORoleInteraction__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7126:1: ( rule__BORoleInteraction__Group_15__1__Impl rule__BORoleInteraction__Group_15__2 )
            // InternalBomi.g:7127:2: rule__BORoleInteraction__Group_15__1__Impl rule__BORoleInteraction__Group_15__2
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__1"


    // $ANTLR start "rule__BORoleInteraction__Group_15__1__Impl"
    // InternalBomi.g:7134:1: rule__BORoleInteraction__Group_15__1__Impl : ( '(' ) ;
    public final void rule__BORoleInteraction__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7138:1: ( ( '(' ) )
            // InternalBomi.g:7139:1: ( '(' )
            {
            // InternalBomi.g:7139:1: ( '(' )
            // InternalBomi.g:7140:2: '('
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_15_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_15__2"
    // InternalBomi.g:7149:1: rule__BORoleInteraction__Group_15__2 : rule__BORoleInteraction__Group_15__2__Impl rule__BORoleInteraction__Group_15__3 ;
    public final void rule__BORoleInteraction__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7153:1: ( rule__BORoleInteraction__Group_15__2__Impl rule__BORoleInteraction__Group_15__3 )
            // InternalBomi.g:7154:2: rule__BORoleInteraction__Group_15__2__Impl rule__BORoleInteraction__Group_15__3
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__2"


    // $ANTLR start "rule__BORoleInteraction__Group_15__2__Impl"
    // InternalBomi.g:7161:1: rule__BORoleInteraction__Group_15__2__Impl : ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) ) ;
    public final void rule__BORoleInteraction__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7165:1: ( ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) ) )
            // InternalBomi.g:7166:1: ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) )
            {
            // InternalBomi.g:7166:1: ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) )
            // InternalBomi.g:7167:2: ( rule__BORoleInteraction__RolesAssignment_15_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_15_2()); 
            // InternalBomi.g:7168:2: ( rule__BORoleInteraction__RolesAssignment_15_2 )
            // InternalBomi.g:7168:3: rule__BORoleInteraction__RolesAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__RolesAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__2__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_15__3"
    // InternalBomi.g:7176:1: rule__BORoleInteraction__Group_15__3 : rule__BORoleInteraction__Group_15__3__Impl rule__BORoleInteraction__Group_15__4 ;
    public final void rule__BORoleInteraction__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7180:1: ( rule__BORoleInteraction__Group_15__3__Impl rule__BORoleInteraction__Group_15__4 )
            // InternalBomi.g:7181:2: rule__BORoleInteraction__Group_15__3__Impl rule__BORoleInteraction__Group_15__4
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__3"


    // $ANTLR start "rule__BORoleInteraction__Group_15__3__Impl"
    // InternalBomi.g:7188:1: rule__BORoleInteraction__Group_15__3__Impl : ( ( rule__BORoleInteraction__Group_15_3__0 )* ) ;
    public final void rule__BORoleInteraction__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7192:1: ( ( ( rule__BORoleInteraction__Group_15_3__0 )* ) )
            // InternalBomi.g:7193:1: ( ( rule__BORoleInteraction__Group_15_3__0 )* )
            {
            // InternalBomi.g:7193:1: ( ( rule__BORoleInteraction__Group_15_3__0 )* )
            // InternalBomi.g:7194:2: ( rule__BORoleInteraction__Group_15_3__0 )*
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_15_3()); 
            // InternalBomi.g:7195:2: ( rule__BORoleInteraction__Group_15_3__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==38) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalBomi.g:7195:3: rule__BORoleInteraction__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BORoleInteraction__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

             after(grammarAccess.getBORoleInteractionAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__3__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_15__4"
    // InternalBomi.g:7203:1: rule__BORoleInteraction__Group_15__4 : rule__BORoleInteraction__Group_15__4__Impl ;
    public final void rule__BORoleInteraction__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7207:1: ( rule__BORoleInteraction__Group_15__4__Impl )
            // InternalBomi.g:7208:2: rule__BORoleInteraction__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__4"


    // $ANTLR start "rule__BORoleInteraction__Group_15__4__Impl"
    // InternalBomi.g:7214:1: rule__BORoleInteraction__Group_15__4__Impl : ( ')' ) ;
    public final void rule__BORoleInteraction__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7218:1: ( ( ')' ) )
            // InternalBomi.g:7219:1: ( ')' )
            {
            // InternalBomi.g:7219:1: ( ')' )
            // InternalBomi.g:7220:2: ')'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_15_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15__4__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_15_3__0"
    // InternalBomi.g:7230:1: rule__BORoleInteraction__Group_15_3__0 : rule__BORoleInteraction__Group_15_3__0__Impl rule__BORoleInteraction__Group_15_3__1 ;
    public final void rule__BORoleInteraction__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7234:1: ( rule__BORoleInteraction__Group_15_3__0__Impl rule__BORoleInteraction__Group_15_3__1 )
            // InternalBomi.g:7235:2: rule__BORoleInteraction__Group_15_3__0__Impl rule__BORoleInteraction__Group_15_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_15_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15_3__0"


    // $ANTLR start "rule__BORoleInteraction__Group_15_3__0__Impl"
    // InternalBomi.g:7242:1: rule__BORoleInteraction__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__BORoleInteraction__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7246:1: ( ( ',' ) )
            // InternalBomi.g:7247:1: ( ',' )
            {
            // InternalBomi.g:7247:1: ( ',' )
            // InternalBomi.g:7248:2: ','
            {
             before(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_15_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15_3__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_15_3__1"
    // InternalBomi.g:7257:1: rule__BORoleInteraction__Group_15_3__1 : rule__BORoleInteraction__Group_15_3__1__Impl ;
    public final void rule__BORoleInteraction__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7261:1: ( rule__BORoleInteraction__Group_15_3__1__Impl )
            // InternalBomi.g:7262:2: rule__BORoleInteraction__Group_15_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_15_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15_3__1"


    // $ANTLR start "rule__BORoleInteraction__Group_15_3__1__Impl"
    // InternalBomi.g:7268:1: rule__BORoleInteraction__Group_15_3__1__Impl : ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) ) ;
    public final void rule__BORoleInteraction__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7272:1: ( ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) ) )
            // InternalBomi.g:7273:1: ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) )
            {
            // InternalBomi.g:7273:1: ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) )
            // InternalBomi.g:7274:2: ( rule__BORoleInteraction__RolesAssignment_15_3_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_15_3_1()); 
            // InternalBomi.g:7275:2: ( rule__BORoleInteraction__RolesAssignment_15_3_1 )
            // InternalBomi.g:7275:3: rule__BORoleInteraction__RolesAssignment_15_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__RolesAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_15_3__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__0"
    // InternalBomi.g:7284:1: rule__BOTeamGovernance__Group__0 : rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1 ;
    public final void rule__BOTeamGovernance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7288:1: ( rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1 )
            // InternalBomi.g:7289:2: rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BOTeamGovernance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__0"


    // $ANTLR start "rule__BOTeamGovernance__Group__0__Impl"
    // InternalBomi.g:7296:1: rule__BOTeamGovernance__Group__0__Impl : ( () ) ;
    public final void rule__BOTeamGovernance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7300:1: ( ( () ) )
            // InternalBomi.g:7301:1: ( () )
            {
            // InternalBomi.g:7301:1: ( () )
            // InternalBomi.g:7302:2: ()
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceAction_0()); 
            // InternalBomi.g:7303:2: ()
            // InternalBomi.g:7303:3: 
            {
            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__1"
    // InternalBomi.g:7311:1: rule__BOTeamGovernance__Group__1 : rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2 ;
    public final void rule__BOTeamGovernance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7315:1: ( rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2 )
            // InternalBomi.g:7316:2: rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__BOTeamGovernance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__1"


    // $ANTLR start "rule__BOTeamGovernance__Group__1__Impl"
    // InternalBomi.g:7323:1: rule__BOTeamGovernance__Group__1__Impl : ( 'BOTeamGovernance' ) ;
    public final void rule__BOTeamGovernance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7327:1: ( ( 'BOTeamGovernance' ) )
            // InternalBomi.g:7328:1: ( 'BOTeamGovernance' )
            {
            // InternalBomi.g:7328:1: ( 'BOTeamGovernance' )
            // InternalBomi.g:7329:2: 'BOTeamGovernance'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceKeyword_1()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__2"
    // InternalBomi.g:7338:1: rule__BOTeamGovernance__Group__2 : rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3 ;
    public final void rule__BOTeamGovernance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7342:1: ( rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3 )
            // InternalBomi.g:7343:2: rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BOTeamGovernance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__2"


    // $ANTLR start "rule__BOTeamGovernance__Group__2__Impl"
    // InternalBomi.g:7350:1: rule__BOTeamGovernance__Group__2__Impl : ( ( rule__BOTeamGovernance__NameAssignment_2 ) ) ;
    public final void rule__BOTeamGovernance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7354:1: ( ( ( rule__BOTeamGovernance__NameAssignment_2 ) ) )
            // InternalBomi.g:7355:1: ( ( rule__BOTeamGovernance__NameAssignment_2 ) )
            {
            // InternalBomi.g:7355:1: ( ( rule__BOTeamGovernance__NameAssignment_2 ) )
            // InternalBomi.g:7356:2: ( rule__BOTeamGovernance__NameAssignment_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getNameAssignment_2()); 
            // InternalBomi.g:7357:2: ( rule__BOTeamGovernance__NameAssignment_2 )
            // InternalBomi.g:7357:3: rule__BOTeamGovernance__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__2__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__3"
    // InternalBomi.g:7365:1: rule__BOTeamGovernance__Group__3 : rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4 ;
    public final void rule__BOTeamGovernance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7369:1: ( rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4 )
            // InternalBomi.g:7370:2: rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__BOTeamGovernance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__3"


    // $ANTLR start "rule__BOTeamGovernance__Group__3__Impl"
    // InternalBomi.g:7377:1: rule__BOTeamGovernance__Group__3__Impl : ( '{' ) ;
    public final void rule__BOTeamGovernance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7381:1: ( ( '{' ) )
            // InternalBomi.g:7382:1: ( '{' )
            {
            // InternalBomi.g:7382:1: ( '{' )
            // InternalBomi.g:7383:2: '{'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__3__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__4"
    // InternalBomi.g:7392:1: rule__BOTeamGovernance__Group__4 : rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5 ;
    public final void rule__BOTeamGovernance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7396:1: ( rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5 )
            // InternalBomi.g:7397:2: rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__BOTeamGovernance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__4"


    // $ANTLR start "rule__BOTeamGovernance__Group__4__Impl"
    // InternalBomi.g:7404:1: rule__BOTeamGovernance__Group__4__Impl : ( ( rule__BOTeamGovernance__Group_4__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7408:1: ( ( ( rule__BOTeamGovernance__Group_4__0 )? ) )
            // InternalBomi.g:7409:1: ( ( rule__BOTeamGovernance__Group_4__0 )? )
            {
            // InternalBomi.g:7409:1: ( ( rule__BOTeamGovernance__Group_4__0 )? )
            // InternalBomi.g:7410:2: ( rule__BOTeamGovernance__Group_4__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_4()); 
            // InternalBomi.g:7411:2: ( rule__BOTeamGovernance__Group_4__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==45) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBomi.g:7411:3: rule__BOTeamGovernance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOTeamGovernance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__4__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__5"
    // InternalBomi.g:7419:1: rule__BOTeamGovernance__Group__5 : rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6 ;
    public final void rule__BOTeamGovernance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7423:1: ( rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6 )
            // InternalBomi.g:7424:2: rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__BOTeamGovernance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__5"


    // $ANTLR start "rule__BOTeamGovernance__Group__5__Impl"
    // InternalBomi.g:7431:1: rule__BOTeamGovernance__Group__5__Impl : ( ( rule__BOTeamGovernance__Group_5__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7435:1: ( ( ( rule__BOTeamGovernance__Group_5__0 )? ) )
            // InternalBomi.g:7436:1: ( ( rule__BOTeamGovernance__Group_5__0 )? )
            {
            // InternalBomi.g:7436:1: ( ( rule__BOTeamGovernance__Group_5__0 )? )
            // InternalBomi.g:7437:2: ( rule__BOTeamGovernance__Group_5__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_5()); 
            // InternalBomi.g:7438:2: ( rule__BOTeamGovernance__Group_5__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==83) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalBomi.g:7438:3: rule__BOTeamGovernance__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOTeamGovernance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__5__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__6"
    // InternalBomi.g:7446:1: rule__BOTeamGovernance__Group__6 : rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7 ;
    public final void rule__BOTeamGovernance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7450:1: ( rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7 )
            // InternalBomi.g:7451:2: rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__BOTeamGovernance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__6"


    // $ANTLR start "rule__BOTeamGovernance__Group__6__Impl"
    // InternalBomi.g:7458:1: rule__BOTeamGovernance__Group__6__Impl : ( ( rule__BOTeamGovernance__Group_6__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7462:1: ( ( ( rule__BOTeamGovernance__Group_6__0 )? ) )
            // InternalBomi.g:7463:1: ( ( rule__BOTeamGovernance__Group_6__0 )? )
            {
            // InternalBomi.g:7463:1: ( ( rule__BOTeamGovernance__Group_6__0 )? )
            // InternalBomi.g:7464:2: ( rule__BOTeamGovernance__Group_6__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_6()); 
            // InternalBomi.g:7465:2: ( rule__BOTeamGovernance__Group_6__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==84) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalBomi.g:7465:3: rule__BOTeamGovernance__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOTeamGovernance__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__6__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__7"
    // InternalBomi.g:7473:1: rule__BOTeamGovernance__Group__7 : rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8 ;
    public final void rule__BOTeamGovernance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7477:1: ( rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8 )
            // InternalBomi.g:7478:2: rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__BOTeamGovernance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__7"


    // $ANTLR start "rule__BOTeamGovernance__Group__7__Impl"
    // InternalBomi.g:7485:1: rule__BOTeamGovernance__Group__7__Impl : ( ( rule__BOTeamGovernance__Group_7__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7489:1: ( ( ( rule__BOTeamGovernance__Group_7__0 )? ) )
            // InternalBomi.g:7490:1: ( ( rule__BOTeamGovernance__Group_7__0 )? )
            {
            // InternalBomi.g:7490:1: ( ( rule__BOTeamGovernance__Group_7__0 )? )
            // InternalBomi.g:7491:2: ( rule__BOTeamGovernance__Group_7__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_7()); 
            // InternalBomi.g:7492:2: ( rule__BOTeamGovernance__Group_7__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==40) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalBomi.g:7492:3: rule__BOTeamGovernance__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOTeamGovernance__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__7__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__8"
    // InternalBomi.g:7500:1: rule__BOTeamGovernance__Group__8 : rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9 ;
    public final void rule__BOTeamGovernance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7504:1: ( rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9 )
            // InternalBomi.g:7505:2: rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9
            {
            pushFollow(FOLLOW_32);
            rule__BOTeamGovernance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__8"


    // $ANTLR start "rule__BOTeamGovernance__Group__8__Impl"
    // InternalBomi.g:7512:1: rule__BOTeamGovernance__Group__8__Impl : ( ( rule__BOTeamGovernance__Group_8__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7516:1: ( ( ( rule__BOTeamGovernance__Group_8__0 )? ) )
            // InternalBomi.g:7517:1: ( ( rule__BOTeamGovernance__Group_8__0 )? )
            {
            // InternalBomi.g:7517:1: ( ( rule__BOTeamGovernance__Group_8__0 )? )
            // InternalBomi.g:7518:2: ( rule__BOTeamGovernance__Group_8__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_8()); 
            // InternalBomi.g:7519:2: ( rule__BOTeamGovernance__Group_8__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==35) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalBomi.g:7519:3: rule__BOTeamGovernance__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOTeamGovernance__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__8__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__9"
    // InternalBomi.g:7527:1: rule__BOTeamGovernance__Group__9 : rule__BOTeamGovernance__Group__9__Impl ;
    public final void rule__BOTeamGovernance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7531:1: ( rule__BOTeamGovernance__Group__9__Impl )
            // InternalBomi.g:7532:2: rule__BOTeamGovernance__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__9"


    // $ANTLR start "rule__BOTeamGovernance__Group__9__Impl"
    // InternalBomi.g:7538:1: rule__BOTeamGovernance__Group__9__Impl : ( '}' ) ;
    public final void rule__BOTeamGovernance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7542:1: ( ( '}' ) )
            // InternalBomi.g:7543:1: ( '}' )
            {
            // InternalBomi.g:7543:1: ( '}' )
            // InternalBomi.g:7544:2: '}'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group__9__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_4__0"
    // InternalBomi.g:7554:1: rule__BOTeamGovernance__Group_4__0 : rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1 ;
    public final void rule__BOTeamGovernance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7558:1: ( rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1 )
            // InternalBomi.g:7559:2: rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__BOTeamGovernance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_4__0"


    // $ANTLR start "rule__BOTeamGovernance__Group_4__0__Impl"
    // InternalBomi.g:7566:1: rule__BOTeamGovernance__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BOTeamGovernance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7570:1: ( ( 'purpose' ) )
            // InternalBomi.g:7571:1: ( 'purpose' )
            {
            // InternalBomi.g:7571:1: ( 'purpose' )
            // InternalBomi.g:7572:2: 'purpose'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getPurposeKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getPurposeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_4__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_4__1"
    // InternalBomi.g:7581:1: rule__BOTeamGovernance__Group_4__1 : rule__BOTeamGovernance__Group_4__1__Impl ;
    public final void rule__BOTeamGovernance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7585:1: ( rule__BOTeamGovernance__Group_4__1__Impl )
            // InternalBomi.g:7586:2: rule__BOTeamGovernance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_4__1"


    // $ANTLR start "rule__BOTeamGovernance__Group_4__1__Impl"
    // InternalBomi.g:7592:1: rule__BOTeamGovernance__Group_4__1__Impl : ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7596:1: ( ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:7597:1: ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:7597:1: ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) )
            // InternalBomi.g:7598:2: ( rule__BOTeamGovernance__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:7599:2: ( rule__BOTeamGovernance__PurposeAssignment_4_1 )
            // InternalBomi.g:7599:3: rule__BOTeamGovernance__PurposeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__PurposeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getPurposeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_4__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_5__0"
    // InternalBomi.g:7608:1: rule__BOTeamGovernance__Group_5__0 : rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1 ;
    public final void rule__BOTeamGovernance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7612:1: ( rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1 )
            // InternalBomi.g:7613:2: rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__BOTeamGovernance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_5__0"


    // $ANTLR start "rule__BOTeamGovernance__Group_5__0__Impl"
    // InternalBomi.g:7620:1: rule__BOTeamGovernance__Group_5__0__Impl : ( 'coordinationMechanism' ) ;
    public final void rule__BOTeamGovernance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7624:1: ( ( 'coordinationMechanism' ) )
            // InternalBomi.g:7625:1: ( 'coordinationMechanism' )
            {
            // InternalBomi.g:7625:1: ( 'coordinationMechanism' )
            // InternalBomi.g:7626:2: 'coordinationMechanism'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismKeyword_5_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_5__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_5__1"
    // InternalBomi.g:7635:1: rule__BOTeamGovernance__Group_5__1 : rule__BOTeamGovernance__Group_5__1__Impl ;
    public final void rule__BOTeamGovernance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7639:1: ( rule__BOTeamGovernance__Group_5__1__Impl )
            // InternalBomi.g:7640:2: rule__BOTeamGovernance__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_5__1"


    // $ANTLR start "rule__BOTeamGovernance__Group_5__1__Impl"
    // InternalBomi.g:7646:1: rule__BOTeamGovernance__Group_5__1__Impl : ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7650:1: ( ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) ) )
            // InternalBomi.g:7651:1: ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) )
            {
            // InternalBomi.g:7651:1: ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) )
            // InternalBomi.g:7652:2: ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismAssignment_5_1()); 
            // InternalBomi.g:7653:2: ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 )
            // InternalBomi.g:7653:3: rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_5__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_6__0"
    // InternalBomi.g:7662:1: rule__BOTeamGovernance__Group_6__0 : rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1 ;
    public final void rule__BOTeamGovernance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7666:1: ( rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1 )
            // InternalBomi.g:7667:2: rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__BOTeamGovernance__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_6__0"


    // $ANTLR start "rule__BOTeamGovernance__Group_6__0__Impl"
    // InternalBomi.g:7674:1: rule__BOTeamGovernance__Group_6__0__Impl : ( 'frequencyOfCoordination' ) ;
    public final void rule__BOTeamGovernance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7678:1: ( ( 'frequencyOfCoordination' ) )
            // InternalBomi.g:7679:1: ( 'frequencyOfCoordination' )
            {
            // InternalBomi.g:7679:1: ( 'frequencyOfCoordination' )
            // InternalBomi.g:7680:2: 'frequencyOfCoordination'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationKeyword_6_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_6__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_6__1"
    // InternalBomi.g:7689:1: rule__BOTeamGovernance__Group_6__1 : rule__BOTeamGovernance__Group_6__1__Impl ;
    public final void rule__BOTeamGovernance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7693:1: ( rule__BOTeamGovernance__Group_6__1__Impl )
            // InternalBomi.g:7694:2: rule__BOTeamGovernance__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_6__1"


    // $ANTLR start "rule__BOTeamGovernance__Group_6__1__Impl"
    // InternalBomi.g:7700:1: rule__BOTeamGovernance__Group_6__1__Impl : ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7704:1: ( ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) ) )
            // InternalBomi.g:7705:1: ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) )
            {
            // InternalBomi.g:7705:1: ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) )
            // InternalBomi.g:7706:2: ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationAssignment_6_1()); 
            // InternalBomi.g:7707:2: ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 )
            // InternalBomi.g:7707:3: rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_6__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__0"
    // InternalBomi.g:7716:1: rule__BOTeamGovernance__Group_7__0 : rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1 ;
    public final void rule__BOTeamGovernance__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7720:1: ( rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1 )
            // InternalBomi.g:7721:2: rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__BOTeamGovernance__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__0"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__0__Impl"
    // InternalBomi.g:7728:1: rule__BOTeamGovernance__Group_7__0__Impl : ( 'governanceTeams' ) ;
    public final void rule__BOTeamGovernance__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7732:1: ( ( 'governanceTeams' ) )
            // InternalBomi.g:7733:1: ( 'governanceTeams' )
            {
            // InternalBomi.g:7733:1: ( 'governanceTeams' )
            // InternalBomi.g:7734:2: 'governanceTeams'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__1"
    // InternalBomi.g:7743:1: rule__BOTeamGovernance__Group_7__1 : rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2 ;
    public final void rule__BOTeamGovernance__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7747:1: ( rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2 )
            // InternalBomi.g:7748:2: rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__BOTeamGovernance__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__1"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__1__Impl"
    // InternalBomi.g:7755:1: rule__BOTeamGovernance__Group_7__1__Impl : ( '(' ) ;
    public final void rule__BOTeamGovernance__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7759:1: ( ( '(' ) )
            // InternalBomi.g:7760:1: ( '(' )
            {
            // InternalBomi.g:7760:1: ( '(' )
            // InternalBomi.g:7761:2: '('
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__2"
    // InternalBomi.g:7770:1: rule__BOTeamGovernance__Group_7__2 : rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3 ;
    public final void rule__BOTeamGovernance__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7774:1: ( rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3 )
            // InternalBomi.g:7775:2: rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3
            {
            pushFollow(FOLLOW_25);
            rule__BOTeamGovernance__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__2"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__2__Impl"
    // InternalBomi.g:7782:1: rule__BOTeamGovernance__Group_7__2__Impl : ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) ) ;
    public final void rule__BOTeamGovernance__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7786:1: ( ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) ) )
            // InternalBomi.g:7787:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) )
            {
            // InternalBomi.g:7787:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) )
            // InternalBomi.g:7788:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_7_2()); 
            // InternalBomi.g:7789:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 )
            // InternalBomi.g:7789:3: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__2__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__3"
    // InternalBomi.g:7797:1: rule__BOTeamGovernance__Group_7__3 : rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4 ;
    public final void rule__BOTeamGovernance__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7801:1: ( rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4 )
            // InternalBomi.g:7802:2: rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4
            {
            pushFollow(FOLLOW_25);
            rule__BOTeamGovernance__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__3"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__3__Impl"
    // InternalBomi.g:7809:1: rule__BOTeamGovernance__Group_7__3__Impl : ( ( rule__BOTeamGovernance__Group_7_3__0 )* ) ;
    public final void rule__BOTeamGovernance__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7813:1: ( ( ( rule__BOTeamGovernance__Group_7_3__0 )* ) )
            // InternalBomi.g:7814:1: ( ( rule__BOTeamGovernance__Group_7_3__0 )* )
            {
            // InternalBomi.g:7814:1: ( ( rule__BOTeamGovernance__Group_7_3__0 )* )
            // InternalBomi.g:7815:2: ( rule__BOTeamGovernance__Group_7_3__0 )*
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_7_3()); 
            // InternalBomi.g:7816:2: ( rule__BOTeamGovernance__Group_7_3__0 )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==38) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalBomi.g:7816:3: rule__BOTeamGovernance__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOTeamGovernance__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__3__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__4"
    // InternalBomi.g:7824:1: rule__BOTeamGovernance__Group_7__4 : rule__BOTeamGovernance__Group_7__4__Impl ;
    public final void rule__BOTeamGovernance__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7828:1: ( rule__BOTeamGovernance__Group_7__4__Impl )
            // InternalBomi.g:7829:2: rule__BOTeamGovernance__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__4"


    // $ANTLR start "rule__BOTeamGovernance__Group_7__4__Impl"
    // InternalBomi.g:7835:1: rule__BOTeamGovernance__Group_7__4__Impl : ( ')' ) ;
    public final void rule__BOTeamGovernance__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7839:1: ( ( ')' ) )
            // InternalBomi.g:7840:1: ( ')' )
            {
            // InternalBomi.g:7840:1: ( ')' )
            // InternalBomi.g:7841:2: ')'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_7_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7__4__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_7_3__0"
    // InternalBomi.g:7851:1: rule__BOTeamGovernance__Group_7_3__0 : rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1 ;
    public final void rule__BOTeamGovernance__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7855:1: ( rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1 )
            // InternalBomi.g:7856:2: rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BOTeamGovernance__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7_3__0"


    // $ANTLR start "rule__BOTeamGovernance__Group_7_3__0__Impl"
    // InternalBomi.g:7863:1: rule__BOTeamGovernance__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BOTeamGovernance__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7867:1: ( ( ',' ) )
            // InternalBomi.g:7868:1: ( ',' )
            {
            // InternalBomi.g:7868:1: ( ',' )
            // InternalBomi.g:7869:2: ','
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_7_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7_3__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_7_3__1"
    // InternalBomi.g:7878:1: rule__BOTeamGovernance__Group_7_3__1 : rule__BOTeamGovernance__Group_7_3__1__Impl ;
    public final void rule__BOTeamGovernance__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7882:1: ( rule__BOTeamGovernance__Group_7_3__1__Impl )
            // InternalBomi.g:7883:2: rule__BOTeamGovernance__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7_3__1"


    // $ANTLR start "rule__BOTeamGovernance__Group_7_3__1__Impl"
    // InternalBomi.g:7889:1: rule__BOTeamGovernance__Group_7_3__1__Impl : ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7893:1: ( ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) ) )
            // InternalBomi.g:7894:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) )
            {
            // InternalBomi.g:7894:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) )
            // InternalBomi.g:7895:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_7_3_1()); 
            // InternalBomi.g:7896:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 )
            // InternalBomi.g:7896:3: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_7_3__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__0"
    // InternalBomi.g:7905:1: rule__BOTeamGovernance__Group_8__0 : rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1 ;
    public final void rule__BOTeamGovernance__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7909:1: ( rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1 )
            // InternalBomi.g:7910:2: rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1
            {
            pushFollow(FOLLOW_24);
            rule__BOTeamGovernance__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__0"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__0__Impl"
    // InternalBomi.g:7917:1: rule__BOTeamGovernance__Group_8__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOTeamGovernance__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7921:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:7922:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:7922:1: ( 'boundaryObjects' )
            // InternalBomi.g:7923:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__1"
    // InternalBomi.g:7932:1: rule__BOTeamGovernance__Group_8__1 : rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2 ;
    public final void rule__BOTeamGovernance__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7936:1: ( rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2 )
            // InternalBomi.g:7937:2: rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2
            {
            pushFollow(FOLLOW_16);
            rule__BOTeamGovernance__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__1"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__1__Impl"
    // InternalBomi.g:7944:1: rule__BOTeamGovernance__Group_8__1__Impl : ( '(' ) ;
    public final void rule__BOTeamGovernance__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7948:1: ( ( '(' ) )
            // InternalBomi.g:7949:1: ( '(' )
            {
            // InternalBomi.g:7949:1: ( '(' )
            // InternalBomi.g:7950:2: '('
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__2"
    // InternalBomi.g:7959:1: rule__BOTeamGovernance__Group_8__2 : rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3 ;
    public final void rule__BOTeamGovernance__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7963:1: ( rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3 )
            // InternalBomi.g:7964:2: rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3
            {
            pushFollow(FOLLOW_25);
            rule__BOTeamGovernance__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__2"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__2__Impl"
    // InternalBomi.g:7971:1: rule__BOTeamGovernance__Group_8__2__Impl : ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) ) ;
    public final void rule__BOTeamGovernance__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7975:1: ( ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) ) )
            // InternalBomi.g:7976:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) )
            {
            // InternalBomi.g:7976:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) )
            // InternalBomi.g:7977:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_8_2()); 
            // InternalBomi.g:7978:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 )
            // InternalBomi.g:7978:3: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__2__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__3"
    // InternalBomi.g:7986:1: rule__BOTeamGovernance__Group_8__3 : rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4 ;
    public final void rule__BOTeamGovernance__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7990:1: ( rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4 )
            // InternalBomi.g:7991:2: rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4
            {
            pushFollow(FOLLOW_25);
            rule__BOTeamGovernance__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__3"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__3__Impl"
    // InternalBomi.g:7998:1: rule__BOTeamGovernance__Group_8__3__Impl : ( ( rule__BOTeamGovernance__Group_8_3__0 )* ) ;
    public final void rule__BOTeamGovernance__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8002:1: ( ( ( rule__BOTeamGovernance__Group_8_3__0 )* ) )
            // InternalBomi.g:8003:1: ( ( rule__BOTeamGovernance__Group_8_3__0 )* )
            {
            // InternalBomi.g:8003:1: ( ( rule__BOTeamGovernance__Group_8_3__0 )* )
            // InternalBomi.g:8004:2: ( rule__BOTeamGovernance__Group_8_3__0 )*
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_8_3()); 
            // InternalBomi.g:8005:2: ( rule__BOTeamGovernance__Group_8_3__0 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==38) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalBomi.g:8005:3: rule__BOTeamGovernance__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOTeamGovernance__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

             after(grammarAccess.getBOTeamGovernanceAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__3__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__4"
    // InternalBomi.g:8013:1: rule__BOTeamGovernance__Group_8__4 : rule__BOTeamGovernance__Group_8__4__Impl ;
    public final void rule__BOTeamGovernance__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8017:1: ( rule__BOTeamGovernance__Group_8__4__Impl )
            // InternalBomi.g:8018:2: rule__BOTeamGovernance__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__4"


    // $ANTLR start "rule__BOTeamGovernance__Group_8__4__Impl"
    // InternalBomi.g:8024:1: rule__BOTeamGovernance__Group_8__4__Impl : ( ')' ) ;
    public final void rule__BOTeamGovernance__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8028:1: ( ( ')' ) )
            // InternalBomi.g:8029:1: ( ')' )
            {
            // InternalBomi.g:8029:1: ( ')' )
            // InternalBomi.g:8030:2: ')'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_8_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8__4__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_8_3__0"
    // InternalBomi.g:8040:1: rule__BOTeamGovernance__Group_8_3__0 : rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1 ;
    public final void rule__BOTeamGovernance__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8044:1: ( rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1 )
            // InternalBomi.g:8045:2: rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BOTeamGovernance__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8_3__0"


    // $ANTLR start "rule__BOTeamGovernance__Group_8_3__0__Impl"
    // InternalBomi.g:8052:1: rule__BOTeamGovernance__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__BOTeamGovernance__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8056:1: ( ( ',' ) )
            // InternalBomi.g:8057:1: ( ',' )
            {
            // InternalBomi.g:8057:1: ( ',' )
            // InternalBomi.g:8058:2: ','
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_8_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8_3__0__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group_8_3__1"
    // InternalBomi.g:8067:1: rule__BOTeamGovernance__Group_8_3__1 : rule__BOTeamGovernance__Group_8_3__1__Impl ;
    public final void rule__BOTeamGovernance__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8071:1: ( rule__BOTeamGovernance__Group_8_3__1__Impl )
            // InternalBomi.g:8072:2: rule__BOTeamGovernance__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8_3__1"


    // $ANTLR start "rule__BOTeamGovernance__Group_8_3__1__Impl"
    // InternalBomi.g:8078:1: rule__BOTeamGovernance__Group_8_3__1__Impl : ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8082:1: ( ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) ) )
            // InternalBomi.g:8083:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) )
            {
            // InternalBomi.g:8083:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) )
            // InternalBomi.g:8084:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_8_3_1()); 
            // InternalBomi.g:8085:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 )
            // InternalBomi.g:8085:3: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__Group_8_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__BoundaryObjectsAssignment_1_2"
    // InternalBomi.g:8094:1: rule__BOMIModel__BoundaryObjectsAssignment_1_2 : ( ruleBoundaryObject ) ;
    public final void rule__BOMIModel__BoundaryObjectsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8098:1: ( ( ruleBoundaryObject ) )
            // InternalBomi.g:8099:2: ( ruleBoundaryObject )
            {
            // InternalBomi.g:8099:2: ( ruleBoundaryObject )
            // InternalBomi.g:8100:3: ruleBoundaryObject
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundaryObject();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoundaryObjectsAssignment_1_2"


    // $ANTLR start "rule__BOMIModel__BoundaryObjectsAssignment_1_3_1"
    // InternalBomi.g:8109:1: rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 : ( ruleBoundaryObject ) ;
    public final void rule__BOMIModel__BoundaryObjectsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8113:1: ( ( ruleBoundaryObject ) )
            // InternalBomi.g:8114:2: ( ruleBoundaryObject )
            {
            // InternalBomi.g:8114:2: ( ruleBoundaryObject )
            // InternalBomi.g:8115:3: ruleBoundaryObject
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundaryObject();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoundaryObjectsAssignment_1_3_1"


    // $ANTLR start "rule__BOMIModel__MethodologicalIslandsAssignment_2_2"
    // InternalBomi.g:8124:1: rule__BOMIModel__MethodologicalIslandsAssignment_2_2 : ( ruleMethodologicalIsland ) ;
    public final void rule__BOMIModel__MethodologicalIslandsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8128:1: ( ( ruleMethodologicalIsland ) )
            // InternalBomi.g:8129:2: ( ruleMethodologicalIsland )
            {
            // InternalBomi.g:8129:2: ( ruleMethodologicalIsland )
            // InternalBomi.g:8130:3: ruleMethodologicalIsland
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodologicalIsland();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__MethodologicalIslandsAssignment_2_2"


    // $ANTLR start "rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1"
    // InternalBomi.g:8139:1: rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 : ( ruleMethodologicalIsland ) ;
    public final void rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8143:1: ( ( ruleMethodologicalIsland ) )
            // InternalBomi.g:8144:2: ( ruleMethodologicalIsland )
            {
            // InternalBomi.g:8144:2: ( ruleMethodologicalIsland )
            // InternalBomi.g:8145:3: ruleMethodologicalIsland
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodologicalIsland();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1"


    // $ANTLR start "rule__BOMIModel__GovernanceTeamsAssignment_3_2"
    // InternalBomi.g:8154:1: rule__BOMIModel__GovernanceTeamsAssignment_3_2 : ( ruleGovernanceTeam ) ;
    public final void rule__BOMIModel__GovernanceTeamsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8158:1: ( ( ruleGovernanceTeam ) )
            // InternalBomi.g:8159:2: ( ruleGovernanceTeam )
            {
            // InternalBomi.g:8159:2: ( ruleGovernanceTeam )
            // InternalBomi.g:8160:3: ruleGovernanceTeam
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGovernanceTeam();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__GovernanceTeamsAssignment_3_2"


    // $ANTLR start "rule__BOMIModel__GovernanceTeamsAssignment_3_3_1"
    // InternalBomi.g:8169:1: rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 : ( ruleGovernanceTeam ) ;
    public final void rule__BOMIModel__GovernanceTeamsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8173:1: ( ( ruleGovernanceTeam ) )
            // InternalBomi.g:8174:2: ( ruleGovernanceTeam )
            {
            // InternalBomi.g:8174:2: ( ruleGovernanceTeam )
            // InternalBomi.g:8175:3: ruleGovernanceTeam
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGovernanceTeam();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__GovernanceTeamsAssignment_3_3_1"


    // $ANTLR start "rule__BOMIModel__RolesAssignment_4_2"
    // InternalBomi.g:8184:1: rule__BOMIModel__RolesAssignment_4_2 : ( ruleRole ) ;
    public final void rule__BOMIModel__RolesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8188:1: ( ( ruleRole ) )
            // InternalBomi.g:8189:2: ( ruleRole )
            {
            // InternalBomi.g:8189:2: ( ruleRole )
            // InternalBomi.g:8190:3: ruleRole
            {
             before(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__RolesAssignment_4_2"


    // $ANTLR start "rule__BOMIModel__RolesAssignment_4_3_1"
    // InternalBomi.g:8199:1: rule__BOMIModel__RolesAssignment_4_3_1 : ( ruleRole ) ;
    public final void rule__BOMIModel__RolesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8203:1: ( ( ruleRole ) )
            // InternalBomi.g:8204:2: ( ruleRole )
            {
            // InternalBomi.g:8204:2: ( ruleRole )
            // InternalBomi.g:8205:3: ruleRole
            {
             before(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__RolesAssignment_4_3_1"


    // $ANTLR start "rule__BOMIModel__DriversAssignment_5_2"
    // InternalBomi.g:8214:1: rule__BOMIModel__DriversAssignment_5_2 : ( ruleDriver ) ;
    public final void rule__BOMIModel__DriversAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8218:1: ( ( ruleDriver ) )
            // InternalBomi.g:8219:2: ( ruleDriver )
            {
            // InternalBomi.g:8219:2: ( ruleDriver )
            // InternalBomi.g:8220:3: ruleDriver
            {
             before(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDriver();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__DriversAssignment_5_2"


    // $ANTLR start "rule__BOMIModel__DriversAssignment_5_3_1"
    // InternalBomi.g:8229:1: rule__BOMIModel__DriversAssignment_5_3_1 : ( ruleDriver ) ;
    public final void rule__BOMIModel__DriversAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8233:1: ( ( ruleDriver ) )
            // InternalBomi.g:8234:2: ( ruleDriver )
            {
            // InternalBomi.g:8234:2: ( ruleDriver )
            // InternalBomi.g:8235:3: ruleDriver
            {
             before(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDriver();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__DriversAssignment_5_3_1"


    // $ANTLR start "rule__BOMIModel__BoMiCoordinationsAssignment_6_0"
    // InternalBomi.g:8244:1: rule__BOMIModel__BoMiCoordinationsAssignment_6_0 : ( ruleBOMICoordination ) ;
    public final void rule__BOMIModel__BoMiCoordinationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8248:1: ( ( ruleBOMICoordination ) )
            // InternalBomi.g:8249:2: ( ruleBOMICoordination )
            {
            // InternalBomi.g:8249:2: ( ruleBOMICoordination )
            // InternalBomi.g:8250:3: ruleBOMICoordination
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBOMICoordination();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoMiCoordinationsAssignment_6_0"


    // $ANTLR start "rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1"
    // InternalBomi.g:8259:1: rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 : ( ruleBOMICoordination ) ;
    public final void rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8263:1: ( ( ruleBOMICoordination ) )
            // InternalBomi.g:8264:2: ( ruleBOMICoordination )
            {
            // InternalBomi.g:8264:2: ( ruleBOMICoordination )
            // InternalBomi.g:8265:3: ruleBOMICoordination
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBOMICoordination();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1"


    // $ANTLR start "rule__BOMIModel__BoRoleInteractionsAssignment_7_0"
    // InternalBomi.g:8274:1: rule__BOMIModel__BoRoleInteractionsAssignment_7_0 : ( ruleBORoleInteraction ) ;
    public final void rule__BOMIModel__BoRoleInteractionsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8278:1: ( ( ruleBORoleInteraction ) )
            // InternalBomi.g:8279:2: ( ruleBORoleInteraction )
            {
            // InternalBomi.g:8279:2: ( ruleBORoleInteraction )
            // InternalBomi.g:8280:3: ruleBORoleInteraction
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBORoleInteraction();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoRoleInteractionsAssignment_7_0"


    // $ANTLR start "rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1"
    // InternalBomi.g:8289:1: rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 : ( ruleBORoleInteraction ) ;
    public final void rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8293:1: ( ( ruleBORoleInteraction ) )
            // InternalBomi.g:8294:2: ( ruleBORoleInteraction )
            {
            // InternalBomi.g:8294:2: ( ruleBORoleInteraction )
            // InternalBomi.g:8295:3: ruleBORoleInteraction
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBORoleInteraction();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1"


    // $ANTLR start "rule__BOMIModel__BoTeamGovernancesAssignment_8_0"
    // InternalBomi.g:8304:1: rule__BOMIModel__BoTeamGovernancesAssignment_8_0 : ( ruleBOTeamGovernance ) ;
    public final void rule__BOMIModel__BoTeamGovernancesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8308:1: ( ( ruleBOTeamGovernance ) )
            // InternalBomi.g:8309:2: ( ruleBOTeamGovernance )
            {
            // InternalBomi.g:8309:2: ( ruleBOTeamGovernance )
            // InternalBomi.g:8310:3: ruleBOTeamGovernance
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBOTeamGovernance();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoTeamGovernancesAssignment_8_0"


    // $ANTLR start "rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1"
    // InternalBomi.g:8319:1: rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 : ( ruleBOTeamGovernance ) ;
    public final void rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8323:1: ( ( ruleBOTeamGovernance ) )
            // InternalBomi.g:8324:2: ( ruleBOTeamGovernance )
            {
            // InternalBomi.g:8324:2: ( ruleBOTeamGovernance )
            // InternalBomi.g:8325:3: ruleBOTeamGovernance
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBOTeamGovernance();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1"


    // $ANTLR start "rule__BoundaryObject__NameAssignment_2"
    // InternalBomi.g:8334:1: rule__BoundaryObject__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BoundaryObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8338:1: ( ( ruleEString ) )
            // InternalBomi.g:8339:2: ( ruleEString )
            {
            // InternalBomi.g:8339:2: ( ruleEString )
            // InternalBomi.g:8340:3: ruleEString
            {
             before(grammarAccess.getBoundaryObjectAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__NameAssignment_2"


    // $ANTLR start "rule__BoundaryObject__SuperTypeAssignment_4_1"
    // InternalBomi.g:8349:1: rule__BoundaryObject__SuperTypeAssignment_4_1 : ( ruleBOSuperTypes ) ;
    public final void rule__BoundaryObject__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8353:1: ( ( ruleBOSuperTypes ) )
            // InternalBomi.g:8354:2: ( ruleBOSuperTypes )
            {
            // InternalBomi.g:8354:2: ( ruleBOSuperTypes )
            // InternalBomi.g:8355:3: ruleBOSuperTypes
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeBOSuperTypesEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBOSuperTypes();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getSuperTypeBOSuperTypesEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__SuperTypeAssignment_4_1"


    // $ANTLR start "rule__BoundaryObject__PurposeAssignment_5_1"
    // InternalBomi.g:8364:1: rule__BoundaryObject__PurposeAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__PurposeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8368:1: ( ( ruleEString ) )
            // InternalBomi.g:8369:2: ( ruleEString )
            {
            // InternalBomi.g:8369:2: ( ruleEString )
            // InternalBomi.g:8370:3: ruleEString
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getPurposeEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__PurposeAssignment_5_1"


    // $ANTLR start "rule__BoundaryObject__LevelOfDetailAssignment_6_1"
    // InternalBomi.g:8379:1: rule__BoundaryObject__LevelOfDetailAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__LevelOfDetailAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8383:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8384:2: ( ruleHighLow )
            {
            // InternalBomi.g:8384:2: ( ruleHighLow )
            // InternalBomi.g:8385:3: ruleHighLow
            {
             before(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailHighLowEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailHighLowEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__LevelOfDetailAssignment_6_1"


    // $ANTLR start "rule__BoundaryObject__FrequencyOfChangeAssignment_7_1"
    // InternalBomi.g:8394:1: rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__FrequencyOfChangeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8398:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8399:2: ( ruleHighLow )
            {
            // InternalBomi.g:8399:2: ( ruleHighLow )
            // InternalBomi.g:8400:3: ruleHighLow
            {
             before(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeHighLowEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeHighLowEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__FrequencyOfChangeAssignment_7_1"


    // $ANTLR start "rule__BoundaryObject__ModularityAssignment_8_1"
    // InternalBomi.g:8409:1: rule__BoundaryObject__ModularityAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__ModularityAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8413:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8414:2: ( ruleHighLow )
            {
            // InternalBomi.g:8414:2: ( ruleHighLow )
            // InternalBomi.g:8415:3: ruleHighLow
            {
             before(grammarAccess.getBoundaryObjectAccess().getModularityHighLowEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getModularityHighLowEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__ModularityAssignment_8_1"


    // $ANTLR start "rule__BoundaryObject__MaintainabilityAssignment_9_1"
    // InternalBomi.g:8424:1: rule__BoundaryObject__MaintainabilityAssignment_9_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__MaintainabilityAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8428:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8429:2: ( ruleHighLow )
            {
            // InternalBomi.g:8429:2: ( ruleHighLow )
            // InternalBomi.g:8430:3: ruleHighLow
            {
             before(grammarAccess.getBoundaryObjectAccess().getMaintainabilityHighLowEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getMaintainabilityHighLowEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__MaintainabilityAssignment_9_1"


    // $ANTLR start "rule__BoundaryObject__PrescriptiveAssignment_10_1"
    // InternalBomi.g:8439:1: rule__BoundaryObject__PrescriptiveAssignment_10_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__PrescriptiveAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8443:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8444:2: ( ruleHighLow )
            {
            // InternalBomi.g:8444:2: ( ruleHighLow )
            // InternalBomi.g:8445:3: ruleHighLow
            {
             before(grammarAccess.getBoundaryObjectAccess().getPrescriptiveHighLowEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getPrescriptiveHighLowEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__PrescriptiveAssignment_10_1"


    // $ANTLR start "rule__BoundaryObject__LifecycleStageAssignment_11_1"
    // InternalBomi.g:8454:1: rule__BoundaryObject__LifecycleStageAssignment_11_1 : ( ruleLifecycleStage ) ;
    public final void rule__BoundaryObject__LifecycleStageAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8458:1: ( ( ruleLifecycleStage ) )
            // InternalBomi.g:8459:2: ( ruleLifecycleStage )
            {
            // InternalBomi.g:8459:2: ( ruleLifecycleStage )
            // InternalBomi.g:8460:3: ruleLifecycleStage
            {
             before(grammarAccess.getBoundaryObjectAccess().getLifecycleStageLifecycleStageEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLifecycleStage();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getLifecycleStageLifecycleStageEnumRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__LifecycleStageAssignment_11_1"


    // $ANTLR start "rule__BoundaryObject__RepresentationFormatAssignment_12_1"
    // InternalBomi.g:8469:1: rule__BoundaryObject__RepresentationFormatAssignment_12_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__RepresentationFormatAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8473:1: ( ( ruleEString ) )
            // InternalBomi.g:8474:2: ( ruleEString )
            {
            // InternalBomi.g:8474:2: ( ruleEString )
            // InternalBomi.g:8475:3: ruleEString
            {
             before(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatEStringParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatEStringParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__RepresentationFormatAssignment_12_1"


    // $ANTLR start "rule__BoundaryObject__ToolingAssignment_13_1"
    // InternalBomi.g:8484:1: rule__BoundaryObject__ToolingAssignment_13_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__ToolingAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8488:1: ( ( ruleEString ) )
            // InternalBomi.g:8489:2: ( ruleEString )
            {
            // InternalBomi.g:8489:2: ( ruleEString )
            // InternalBomi.g:8490:3: ruleEString
            {
             before(grammarAccess.getBoundaryObjectAccess().getToolingEStringParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getToolingEStringParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__ToolingAssignment_13_1"


    // $ANTLR start "rule__BoundaryObject__VersioningAssignment_14_1"
    // InternalBomi.g:8499:1: rule__BoundaryObject__VersioningAssignment_14_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__VersioningAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8503:1: ( ( ruleEString ) )
            // InternalBomi.g:8504:2: ( ruleEString )
            {
            // InternalBomi.g:8504:2: ( ruleEString )
            // InternalBomi.g:8505:3: ruleEString
            {
             before(grammarAccess.getBoundaryObjectAccess().getVersioningEStringParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getVersioningEStringParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__VersioningAssignment_14_1"


    // $ANTLR start "rule__BoundaryObject__UpToDateAssignment_15_1"
    // InternalBomi.g:8514:1: rule__BoundaryObject__UpToDateAssignment_15_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__UpToDateAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8518:1: ( ( ruleEString ) )
            // InternalBomi.g:8519:2: ( ruleEString )
            {
            // InternalBomi.g:8519:2: ( ruleEString )
            // InternalBomi.g:8520:3: ruleEString
            {
             before(grammarAccess.getBoundaryObjectAccess().getUpToDateEStringParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getUpToDateEStringParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__UpToDateAssignment_15_1"


    // $ANTLR start "rule__BoundaryObject__InternalConsistencyAssignment_16_1"
    // InternalBomi.g:8529:1: rule__BoundaryObject__InternalConsistencyAssignment_16_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__InternalConsistencyAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8533:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8534:2: ( ruleHighLow )
            {
            // InternalBomi.g:8534:2: ( ruleHighLow )
            // InternalBomi.g:8535:3: ruleHighLow
            {
             before(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyHighLowEnumRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyHighLowEnumRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__InternalConsistencyAssignment_16_1"


    // $ANTLR start "rule__BoundaryObject__ExternalConsistencyAssignment_17_1"
    // InternalBomi.g:8544:1: rule__BoundaryObject__ExternalConsistencyAssignment_17_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__ExternalConsistencyAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8548:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8549:2: ( ruleHighLow )
            {
            // InternalBomi.g:8549:2: ( ruleHighLow )
            // InternalBomi.g:8550:3: ruleHighLow
            {
             before(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyHighLowEnumRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyHighLowEnumRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__ExternalConsistencyAssignment_17_1"


    // $ANTLR start "rule__MethodologicalIsland__NameAssignment_2"
    // InternalBomi.g:8559:1: rule__MethodologicalIsland__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MethodologicalIsland__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8563:1: ( ( ruleEString ) )
            // InternalBomi.g:8564:2: ( ruleEString )
            {
            // InternalBomi.g:8564:2: ( ruleEString )
            // InternalBomi.g:8565:3: ruleEString
            {
             before(grammarAccess.getMethodologicalIslandAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodologicalIslandAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__NameAssignment_2"


    // $ANTLR start "rule__MethodologicalIsland__TypeAssignment_4_1"
    // InternalBomi.g:8574:1: rule__MethodologicalIsland__TypeAssignment_4_1 : ( ruleMIType ) ;
    public final void rule__MethodologicalIsland__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8578:1: ( ( ruleMIType ) )
            // InternalBomi.g:8579:2: ( ruleMIType )
            {
            // InternalBomi.g:8579:2: ( ruleMIType )
            // InternalBomi.g:8580:3: ruleMIType
            {
             before(grammarAccess.getMethodologicalIslandAccess().getTypeMITypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMIType();

            state._fsp--;

             after(grammarAccess.getMethodologicalIslandAccess().getTypeMITypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodologicalIsland__TypeAssignment_4_1"


    // $ANTLR start "rule__GovernanceTeam__NameAssignment_2"
    // InternalBomi.g:8589:1: rule__GovernanceTeam__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__GovernanceTeam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8593:1: ( ( ruleEString ) )
            // InternalBomi.g:8594:2: ( ruleEString )
            {
            // InternalBomi.g:8594:2: ( ruleEString )
            // InternalBomi.g:8595:3: ruleEString
            {
             before(grammarAccess.getGovernanceTeamAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGovernanceTeamAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GovernanceTeam__NameAssignment_2"


    // $ANTLR start "rule__Role__NameAssignment_2"
    // InternalBomi.g:8604:1: rule__Role__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8608:1: ( ( ruleEString ) )
            // InternalBomi.g:8609:2: ( ruleEString )
            {
            // InternalBomi.g:8609:2: ( ruleEString )
            // InternalBomi.g:8610:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_2"


    // $ANTLR start "rule__Role__PartOfGovernanceTeamsAssignment_4_2"
    // InternalBomi.g:8619:1: rule__Role__PartOfGovernanceTeamsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfGovernanceTeamsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8623:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8624:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8624:2: ( ( ruleEString ) )
            // InternalBomi.g:8625:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_2_0()); 
            // InternalBomi.g:8626:3: ( ruleEString )
            // InternalBomi.g:8627:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__PartOfGovernanceTeamsAssignment_4_2"


    // $ANTLR start "rule__Role__PartOfGovernanceTeamsAssignment_4_3_1"
    // InternalBomi.g:8638:1: rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfGovernanceTeamsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8642:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8643:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8643:2: ( ( ruleEString ) )
            // InternalBomi.g:8644:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_3_1_0()); 
            // InternalBomi.g:8645:3: ( ruleEString )
            // InternalBomi.g:8646:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__PartOfGovernanceTeamsAssignment_4_3_1"


    // $ANTLR start "rule__Role__PartOfMIsAssignment_5_2"
    // InternalBomi.g:8657:1: rule__Role__PartOfMIsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfMIsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8661:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8662:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8662:2: ( ( ruleEString ) )
            // InternalBomi.g:8663:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_2_0()); 
            // InternalBomi.g:8664:3: ( ruleEString )
            // InternalBomi.g:8665:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__PartOfMIsAssignment_5_2"


    // $ANTLR start "rule__Role__PartOfMIsAssignment_5_3_1"
    // InternalBomi.g:8676:1: rule__Role__PartOfMIsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfMIsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8680:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8681:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8681:2: ( ( ruleEString ) )
            // InternalBomi.g:8682:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_3_1_0()); 
            // InternalBomi.g:8683:3: ( ruleEString )
            // InternalBomi.g:8684:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__PartOfMIsAssignment_5_3_1"


    // $ANTLR start "rule__Driver__NameAssignment_2"
    // InternalBomi.g:8695:1: rule__Driver__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Driver__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8699:1: ( ( ruleEString ) )
            // InternalBomi.g:8700:2: ( ruleEString )
            {
            // InternalBomi.g:8700:2: ( ruleEString )
            // InternalBomi.g:8701:3: ruleEString
            {
             before(grammarAccess.getDriverAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__NameAssignment_2"


    // $ANTLR start "rule__Driver__DriverTypeAssignment_4_1"
    // InternalBomi.g:8710:1: rule__Driver__DriverTypeAssignment_4_1 : ( ruleDriverTypes ) ;
    public final void rule__Driver__DriverTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8714:1: ( ( ruleDriverTypes ) )
            // InternalBomi.g:8715:2: ( ruleDriverTypes )
            {
            // InternalBomi.g:8715:2: ( ruleDriverTypes )
            // InternalBomi.g:8716:3: ruleDriverTypes
            {
             before(grammarAccess.getDriverAccess().getDriverTypeDriverTypesEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDriverTypes();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDriverTypeDriverTypesEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DriverTypeAssignment_4_1"


    // $ANTLR start "rule__Driver__DistanceTypeAssignment_5_1"
    // InternalBomi.g:8725:1: rule__Driver__DistanceTypeAssignment_5_1 : ( ruleDistanceTypes ) ;
    public final void rule__Driver__DistanceTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8729:1: ( ( ruleDistanceTypes ) )
            // InternalBomi.g:8730:2: ( ruleDistanceTypes )
            {
            // InternalBomi.g:8730:2: ( ruleDistanceTypes )
            // InternalBomi.g:8731:3: ruleDistanceTypes
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeDistanceTypesEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceTypes();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDistanceTypeDistanceTypesEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DistanceTypeAssignment_5_1"


    // $ANTLR start "rule__Driver__DistanceSizeAssignment_6_1"
    // InternalBomi.g:8740:1: rule__Driver__DistanceSizeAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__Driver__DistanceSizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8744:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8745:2: ( ruleHighLow )
            {
            // InternalBomi.g:8745:2: ( ruleHighLow )
            // InternalBomi.g:8746:3: ruleHighLow
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeHighLowEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDistanceSizeHighLowEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DistanceSizeAssignment_6_1"


    // $ANTLR start "rule__Driver__DrivesMIsAssignment_7_2"
    // InternalBomi.g:8755:1: rule__Driver__DrivesMIsAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Driver__DrivesMIsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8759:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8760:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8760:2: ( ( ruleEString ) )
            // InternalBomi.g:8761:3: ( ruleEString )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_2_0()); 
            // InternalBomi.g:8762:3: ( ruleEString )
            // InternalBomi.g:8763:4: ruleEString
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DrivesMIsAssignment_7_2"


    // $ANTLR start "rule__Driver__DrivesMIsAssignment_7_3_1"
    // InternalBomi.g:8774:1: rule__Driver__DrivesMIsAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Driver__DrivesMIsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8778:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8779:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8779:2: ( ( ruleEString ) )
            // InternalBomi.g:8780:3: ( ruleEString )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_3_1_0()); 
            // InternalBomi.g:8781:3: ( ruleEString )
            // InternalBomi.g:8782:4: ruleEString
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DrivesMIsAssignment_7_3_1"


    // $ANTLR start "rule__BOMICoordination__NameAssignment_2"
    // InternalBomi.g:8793:1: rule__BOMICoordination__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BOMICoordination__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8797:1: ( ( ruleEString ) )
            // InternalBomi.g:8798:2: ( ruleEString )
            {
            // InternalBomi.g:8798:2: ( ruleEString )
            // InternalBomi.g:8799:3: ruleEString
            {
             before(grammarAccess.getBOMICoordinationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__NameAssignment_2"


    // $ANTLR start "rule__BOMICoordination__PurposeAssignment_4_1"
    // InternalBomi.g:8808:1: rule__BOMICoordination__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BOMICoordination__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8812:1: ( ( ruleEString ) )
            // InternalBomi.g:8813:2: ( ruleEString )
            {
            // InternalBomi.g:8813:2: ( ruleEString )
            // InternalBomi.g:8814:3: ruleEString
            {
             before(grammarAccess.getBOMICoordinationAccess().getPurposeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getPurposeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__PurposeAssignment_4_1"


    // $ANTLR start "rule__BOMICoordination__AccessabilityAssignment_5_1"
    // InternalBomi.g:8823:1: rule__BOMICoordination__AccessabilityAssignment_5_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__AccessabilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8827:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8828:2: ( ruleHighLow )
            {
            // InternalBomi.g:8828:2: ( ruleHighLow )
            // InternalBomi.g:8829:3: ruleHighLow
            {
             before(grammarAccess.getBOMICoordinationAccess().getAccessabilityHighLowEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getAccessabilityHighLowEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__AccessabilityAssignment_5_1"


    // $ANTLR start "rule__BOMICoordination__StabilityAssignment_6_1"
    // InternalBomi.g:8838:1: rule__BOMICoordination__StabilityAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__StabilityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8842:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8843:2: ( ruleHighLow )
            {
            // InternalBomi.g:8843:2: ( ruleHighLow )
            // InternalBomi.g:8844:3: ruleHighLow
            {
             before(grammarAccess.getBOMICoordinationAccess().getStabilityHighLowEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getStabilityHighLowEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__StabilityAssignment_6_1"


    // $ANTLR start "rule__BOMICoordination__CriticalityAssignment_7_1"
    // InternalBomi.g:8853:1: rule__BOMICoordination__CriticalityAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__CriticalityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8857:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8858:2: ( ruleHighLow )
            {
            // InternalBomi.g:8858:2: ( ruleHighLow )
            // InternalBomi.g:8859:3: ruleHighLow
            {
             before(grammarAccess.getBOMICoordinationAccess().getCriticalityHighLowEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getCriticalityHighLowEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__CriticalityAssignment_7_1"


    // $ANTLR start "rule__BOMICoordination__FitForPurposeAssignment_8_1"
    // InternalBomi.g:8868:1: rule__BOMICoordination__FitForPurposeAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__FitForPurposeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8872:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8873:2: ( ruleHighLow )
            {
            // InternalBomi.g:8873:2: ( ruleHighLow )
            // InternalBomi.g:8874:3: ruleHighLow
            {
             before(grammarAccess.getBOMICoordinationAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__FitForPurposeAssignment_8_1"


    // $ANTLR start "rule__BOMICoordination__BoundaryObjectsAssignment_9_2"
    // InternalBomi.g:8883:1: rule__BOMICoordination__BoundaryObjectsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__BoundaryObjectsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8887:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8888:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8888:2: ( ( ruleEString ) )
            // InternalBomi.g:8889:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0()); 
            // InternalBomi.g:8890:3: ( ruleEString )
            // InternalBomi.g:8891:4: ruleEString
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__BoundaryObjectsAssignment_9_2"


    // $ANTLR start "rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1"
    // InternalBomi.g:8902:1: rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8906:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8907:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8907:2: ( ( ruleEString ) )
            // InternalBomi.g:8908:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0()); 
            // InternalBomi.g:8909:3: ( ruleEString )
            // InternalBomi.g:8910:4: ruleEString
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1"


    // $ANTLR start "rule__BOMICoordination__MethodologicalIslandsAssignment_10_2"
    // InternalBomi.g:8921:1: rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__MethodologicalIslandsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8925:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8926:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8926:2: ( ( ruleEString ) )
            // InternalBomi.g:8927:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_2_0()); 
            // InternalBomi.g:8928:3: ( ruleEString )
            // InternalBomi.g:8929:4: ruleEString
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__MethodologicalIslandsAssignment_10_2"


    // $ANTLR start "rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1"
    // InternalBomi.g:8940:1: rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8944:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8945:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8945:2: ( ( ruleEString ) )
            // InternalBomi.g:8946:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_3_1_0()); 
            // InternalBomi.g:8947:3: ( ruleEString )
            // InternalBomi.g:8948:4: ruleEString
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1"


    // $ANTLR start "rule__BORoleInteraction__NameAssignment_2"
    // InternalBomi.g:8959:1: rule__BORoleInteraction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BORoleInteraction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8963:1: ( ( ruleEString ) )
            // InternalBomi.g:8964:2: ( ruleEString )
            {
            // InternalBomi.g:8964:2: ( ruleEString )
            // InternalBomi.g:8965:3: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__NameAssignment_2"


    // $ANTLR start "rule__BORoleInteraction__PurposeAssignment_4_1"
    // InternalBomi.g:8974:1: rule__BORoleInteraction__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BORoleInteraction__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8978:1: ( ( ruleEString ) )
            // InternalBomi.g:8979:2: ( ruleEString )
            {
            // InternalBomi.g:8979:2: ( ruleEString )
            // InternalBomi.g:8980:3: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getPurposeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getPurposeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__PurposeAssignment_4_1"


    // $ANTLR start "rule__BORoleInteraction__AccessabilityAssignment_5_1"
    // InternalBomi.g:8989:1: rule__BORoleInteraction__AccessabilityAssignment_5_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__AccessabilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8993:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8994:2: ( ruleHighLow )
            {
            // InternalBomi.g:8994:2: ( ruleHighLow )
            // InternalBomi.g:8995:3: ruleHighLow
            {
             before(grammarAccess.getBORoleInteractionAccess().getAccessabilityHighLowEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getAccessabilityHighLowEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__AccessabilityAssignment_5_1"


    // $ANTLR start "rule__BORoleInteraction__StabilityAssignment_6_1"
    // InternalBomi.g:9004:1: rule__BORoleInteraction__StabilityAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__StabilityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9008:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9009:2: ( ruleHighLow )
            {
            // InternalBomi.g:9009:2: ( ruleHighLow )
            // InternalBomi.g:9010:3: ruleHighLow
            {
             before(grammarAccess.getBORoleInteractionAccess().getStabilityHighLowEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getStabilityHighLowEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__StabilityAssignment_6_1"


    // $ANTLR start "rule__BORoleInteraction__CriticalityAssignment_7_1"
    // InternalBomi.g:9019:1: rule__BORoleInteraction__CriticalityAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__CriticalityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9023:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9024:2: ( ruleHighLow )
            {
            // InternalBomi.g:9024:2: ( ruleHighLow )
            // InternalBomi.g:9025:3: ruleHighLow
            {
             before(grammarAccess.getBORoleInteractionAccess().getCriticalityHighLowEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getCriticalityHighLowEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__CriticalityAssignment_7_1"


    // $ANTLR start "rule__BORoleInteraction__FitForPurposeAssignment_8_1"
    // InternalBomi.g:9034:1: rule__BORoleInteraction__FitForPurposeAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__FitForPurposeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9038:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9039:2: ( ruleHighLow )
            {
            // InternalBomi.g:9039:2: ( ruleHighLow )
            // InternalBomi.g:9040:3: ruleHighLow
            {
             before(grammarAccess.getBORoleInteractionAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__FitForPurposeAssignment_8_1"


    // $ANTLR start "rule__BORoleInteraction__ResponsibleAssignment_9_1"
    // InternalBomi.g:9049:1: rule__BORoleInteraction__ResponsibleAssignment_9_1 : ( ruleMyBoolean ) ;
    public final void rule__BORoleInteraction__ResponsibleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9053:1: ( ( ruleMyBoolean ) )
            // InternalBomi.g:9054:2: ( ruleMyBoolean )
            {
            // InternalBomi.g:9054:2: ( ruleMyBoolean )
            // InternalBomi.g:9055:3: ruleMyBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getResponsibleMyBooleanEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getResponsibleMyBooleanEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__ResponsibleAssignment_9_1"


    // $ANTLR start "rule__BORoleInteraction__CreatesAssignment_10_1"
    // InternalBomi.g:9064:1: rule__BORoleInteraction__CreatesAssignment_10_1 : ( ruleMyBoolean ) ;
    public final void rule__BORoleInteraction__CreatesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9068:1: ( ( ruleMyBoolean ) )
            // InternalBomi.g:9069:2: ( ruleMyBoolean )
            {
            // InternalBomi.g:9069:2: ( ruleMyBoolean )
            // InternalBomi.g:9070:3: ruleMyBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getCreatesMyBooleanEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getCreatesMyBooleanEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__CreatesAssignment_10_1"


    // $ANTLR start "rule__BORoleInteraction__ReadsAssignment_11_1"
    // InternalBomi.g:9079:1: rule__BORoleInteraction__ReadsAssignment_11_1 : ( ruleMyBoolean ) ;
    public final void rule__BORoleInteraction__ReadsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9083:1: ( ( ruleMyBoolean ) )
            // InternalBomi.g:9084:2: ( ruleMyBoolean )
            {
            // InternalBomi.g:9084:2: ( ruleMyBoolean )
            // InternalBomi.g:9085:3: ruleMyBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getReadsMyBooleanEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getReadsMyBooleanEnumRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__ReadsAssignment_11_1"


    // $ANTLR start "rule__BORoleInteraction__UpdatesAssignment_12_1"
    // InternalBomi.g:9094:1: rule__BORoleInteraction__UpdatesAssignment_12_1 : ( ruleMyBoolean ) ;
    public final void rule__BORoleInteraction__UpdatesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9098:1: ( ( ruleMyBoolean ) )
            // InternalBomi.g:9099:2: ( ruleMyBoolean )
            {
            // InternalBomi.g:9099:2: ( ruleMyBoolean )
            // InternalBomi.g:9100:3: ruleMyBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getUpdatesMyBooleanEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getUpdatesMyBooleanEnumRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__UpdatesAssignment_12_1"


    // $ANTLR start "rule__BORoleInteraction__DeletesAssignment_13_1"
    // InternalBomi.g:9109:1: rule__BORoleInteraction__DeletesAssignment_13_1 : ( ruleMyBoolean ) ;
    public final void rule__BORoleInteraction__DeletesAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9113:1: ( ( ruleMyBoolean ) )
            // InternalBomi.g:9114:2: ( ruleMyBoolean )
            {
            // InternalBomi.g:9114:2: ( ruleMyBoolean )
            // InternalBomi.g:9115:3: ruleMyBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getDeletesMyBooleanEnumRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getDeletesMyBooleanEnumRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__DeletesAssignment_13_1"


    // $ANTLR start "rule__BORoleInteraction__BoundaryObjectsAssignment_14_2"
    // InternalBomi.g:9124:1: rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__BoundaryObjectsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9128:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9129:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9129:2: ( ( ruleEString ) )
            // InternalBomi.g:9130:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_2_0()); 
            // InternalBomi.g:9131:3: ( ruleEString )
            // InternalBomi.g:9132:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_14_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_14_2_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__BoundaryObjectsAssignment_14_2"


    // $ANTLR start "rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1"
    // InternalBomi.g:9143:1: rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9147:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9148:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9148:2: ( ( ruleEString ) )
            // InternalBomi.g:9149:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_3_1_0()); 
            // InternalBomi.g:9150:3: ( ruleEString )
            // InternalBomi.g:9151:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_14_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_14_3_1_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1"


    // $ANTLR start "rule__BORoleInteraction__RolesAssignment_15_2"
    // InternalBomi.g:9162:1: rule__BORoleInteraction__RolesAssignment_15_2 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__RolesAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9166:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9167:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9167:2: ( ( ruleEString ) )
            // InternalBomi.g:9168:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_2_0()); 
            // InternalBomi.g:9169:3: ( ruleEString )
            // InternalBomi.g:9170:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_15_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_15_2_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__RolesAssignment_15_2"


    // $ANTLR start "rule__BORoleInteraction__RolesAssignment_15_3_1"
    // InternalBomi.g:9181:1: rule__BORoleInteraction__RolesAssignment_15_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__RolesAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9185:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9186:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9186:2: ( ( ruleEString ) )
            // InternalBomi.g:9187:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_3_1_0()); 
            // InternalBomi.g:9188:3: ( ruleEString )
            // InternalBomi.g:9189:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_15_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_15_3_1_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__RolesAssignment_15_3_1"


    // $ANTLR start "rule__BOTeamGovernance__NameAssignment_2"
    // InternalBomi.g:9200:1: rule__BOTeamGovernance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9204:1: ( ( ruleEString ) )
            // InternalBomi.g:9205:2: ( ruleEString )
            {
            // InternalBomi.g:9205:2: ( ruleEString )
            // InternalBomi.g:9206:3: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__NameAssignment_2"


    // $ANTLR start "rule__BOTeamGovernance__PurposeAssignment_4_1"
    // InternalBomi.g:9215:1: rule__BOTeamGovernance__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9219:1: ( ( ruleEString ) )
            // InternalBomi.g:9220:2: ( ruleEString )
            {
            // InternalBomi.g:9220:2: ( ruleEString )
            // InternalBomi.g:9221:3: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getPurposeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getPurposeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__PurposeAssignment_4_1"


    // $ANTLR start "rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1"
    // InternalBomi.g:9230:1: rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9234:1: ( ( ruleEString ) )
            // InternalBomi.g:9235:2: ( ruleEString )
            {
            // InternalBomi.g:9235:2: ( ruleEString )
            // InternalBomi.g:9236:3: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1"


    // $ANTLR start "rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1"
    // InternalBomi.g:9245:1: rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9249:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9250:2: ( ruleHighLow )
            {
            // InternalBomi.g:9250:2: ( ruleHighLow )
            // InternalBomi.g:9251:3: ruleHighLow
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationHighLowEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationHighLowEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1"


    // $ANTLR start "rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2"
    // InternalBomi.g:9260:1: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9264:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9265:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9265:2: ( ( ruleEString ) )
            // InternalBomi.g:9266:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_2_0()); 
            // InternalBomi.g:9267:3: ( ruleEString )
            // InternalBomi.g:9268:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2"


    // $ANTLR start "rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1"
    // InternalBomi.g:9279:1: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9283:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9284:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9284:2: ( ( ruleEString ) )
            // InternalBomi.g:9285:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_3_1_0()); 
            // InternalBomi.g:9286:3: ( ruleEString )
            // InternalBomi.g:9287:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1"


    // $ANTLR start "rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2"
    // InternalBomi.g:9298:1: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9302:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9303:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9303:2: ( ( ruleEString ) )
            // InternalBomi.g:9304:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_2_0()); 
            // InternalBomi.g:9305:3: ( ruleEString )
            // InternalBomi.g:9306:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2"


    // $ANTLR start "rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1"
    // InternalBomi.g:9317:1: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9321:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9322:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9322:2: ( ( ruleEString ) )
            // InternalBomi.g:9323:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_3_1_0()); 
            // InternalBomi.g:9324:3: ( ruleEString )
            // InternalBomi.g:9325:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000078800000000L,0x0000000000041080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x03FFF02000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000FE0800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007100800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0800002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000078000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x4000002000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180040800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000700000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000020A800000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000222800000000L,0x000000000003EF00L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000018800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000212800000000L,0x0000000000180000L});

}