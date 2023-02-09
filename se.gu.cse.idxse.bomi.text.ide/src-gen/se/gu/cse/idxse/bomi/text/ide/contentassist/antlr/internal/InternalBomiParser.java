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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NOT_SET'", "'High'", "'Medium'", "'Low'", "'True'", "'False'", "'Standard'", "'Technology'", "'Task'", "'Planning'", "'Value'", "'Product'", "'Other'", "'Operation'", "'Deprecate'", "'Retire'", "'Teams'", "'Silos'", "'Departments'", "'Organizations'", "'boRoleInteractions'", "'{'", "'}'", "','", "'boundaryObjects'", "'roles'", "'boMiCoordinations'", "'methodologicalIslands'", "'governanceTeams'", "'boTeamGovernances'", "'drivers'", "'BORoleInteraction'", "'purpose'", "'accessability'", "'stability'", "'criticality'", "'fitForPurpose'", "'responsible'", "'creates'", "'reads'", "'updates'", "'deletes'", "'('", "')'", "'BoundaryObject'", "'superType'", "'levelOfDetail'", "'frequencyOfChange'", "'modularity'", "'maintainability'", "'prescriptive'", "'lifecycleStage'", "'representationFormat'", "'tooling'", "'versioning'", "'upToDate'", "'internalConsistency'", "'externalConsistency'", "'Role'", "'partOfGovernanceTeams'", "'partOfMIs'", "'BOMICoordination'", "'MethodologicalIsland'", "'type'", "'GovernanceTeam'", "'BOTeamGovernance'", "'coordinationMechanism'", "'frequencyOfCoordination'", "'Driver'", "'driverTypeTechnology'", "'driverTypeProcess'", "'driverTypeOrganizational'", "'distanceTypeCultural'", "'distanceTypeGeographical'", "'distanceTypeOrganizational'", "'distanceSize'", "'drivesMIs'"
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
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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


    // $ANTLR start "entryRuleBORoleInteraction"
    // InternalBomi.g:78:1: entryRuleBORoleInteraction : ruleBORoleInteraction EOF ;
    public final void entryRuleBORoleInteraction() throws RecognitionException {
        try {
            // InternalBomi.g:79:1: ( ruleBORoleInteraction EOF )
            // InternalBomi.g:80:1: ruleBORoleInteraction EOF
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
    // InternalBomi.g:87:1: ruleBORoleInteraction : ( ( rule__BORoleInteraction__Group__0 ) ) ;
    public final void ruleBORoleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:91:2: ( ( ( rule__BORoleInteraction__Group__0 ) ) )
            // InternalBomi.g:92:2: ( ( rule__BORoleInteraction__Group__0 ) )
            {
            // InternalBomi.g:92:2: ( ( rule__BORoleInteraction__Group__0 ) )
            // InternalBomi.g:93:3: ( rule__BORoleInteraction__Group__0 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup()); 
            // InternalBomi.g:94:3: ( rule__BORoleInteraction__Group__0 )
            // InternalBomi.g:94:4: rule__BORoleInteraction__Group__0
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


    // $ANTLR start "entryRuleBoundaryObject"
    // InternalBomi.g:103:1: entryRuleBoundaryObject : ruleBoundaryObject EOF ;
    public final void entryRuleBoundaryObject() throws RecognitionException {
        try {
            // InternalBomi.g:104:1: ( ruleBoundaryObject EOF )
            // InternalBomi.g:105:1: ruleBoundaryObject EOF
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
    // InternalBomi.g:112:1: ruleBoundaryObject : ( ( rule__BoundaryObject__Group__0 ) ) ;
    public final void ruleBoundaryObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:116:2: ( ( ( rule__BoundaryObject__Group__0 ) ) )
            // InternalBomi.g:117:2: ( ( rule__BoundaryObject__Group__0 ) )
            {
            // InternalBomi.g:117:2: ( ( rule__BoundaryObject__Group__0 ) )
            // InternalBomi.g:118:3: ( rule__BoundaryObject__Group__0 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup()); 
            // InternalBomi.g:119:3: ( rule__BoundaryObject__Group__0 )
            // InternalBomi.g:119:4: rule__BoundaryObject__Group__0
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


    // $ANTLR start "entryRuleRole"
    // InternalBomi.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalBomi.g:129:1: ( ruleRole EOF )
            // InternalBomi.g:130:1: ruleRole EOF
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
    // InternalBomi.g:137:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:141:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalBomi.g:142:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalBomi.g:142:2: ( ( rule__Role__Group__0 ) )
            // InternalBomi.g:143:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalBomi.g:144:3: ( rule__Role__Group__0 )
            // InternalBomi.g:144:4: rule__Role__Group__0
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


    // $ANTLR start "entryRuleBOMICoordination"
    // InternalBomi.g:153:1: entryRuleBOMICoordination : ruleBOMICoordination EOF ;
    public final void entryRuleBOMICoordination() throws RecognitionException {
        try {
            // InternalBomi.g:154:1: ( ruleBOMICoordination EOF )
            // InternalBomi.g:155:1: ruleBOMICoordination EOF
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
    // InternalBomi.g:162:1: ruleBOMICoordination : ( ( rule__BOMICoordination__Group__0 ) ) ;
    public final void ruleBOMICoordination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:166:2: ( ( ( rule__BOMICoordination__Group__0 ) ) )
            // InternalBomi.g:167:2: ( ( rule__BOMICoordination__Group__0 ) )
            {
            // InternalBomi.g:167:2: ( ( rule__BOMICoordination__Group__0 ) )
            // InternalBomi.g:168:3: ( rule__BOMICoordination__Group__0 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup()); 
            // InternalBomi.g:169:3: ( rule__BOMICoordination__Group__0 )
            // InternalBomi.g:169:4: rule__BOMICoordination__Group__0
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


    // $ANTLR start "entryRuleMethodologicalIsland"
    // InternalBomi.g:178:1: entryRuleMethodologicalIsland : ruleMethodologicalIsland EOF ;
    public final void entryRuleMethodologicalIsland() throws RecognitionException {
        try {
            // InternalBomi.g:179:1: ( ruleMethodologicalIsland EOF )
            // InternalBomi.g:180:1: ruleMethodologicalIsland EOF
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
    // InternalBomi.g:187:1: ruleMethodologicalIsland : ( ( rule__MethodologicalIsland__Group__0 ) ) ;
    public final void ruleMethodologicalIsland() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:191:2: ( ( ( rule__MethodologicalIsland__Group__0 ) ) )
            // InternalBomi.g:192:2: ( ( rule__MethodologicalIsland__Group__0 ) )
            {
            // InternalBomi.g:192:2: ( ( rule__MethodologicalIsland__Group__0 ) )
            // InternalBomi.g:193:3: ( rule__MethodologicalIsland__Group__0 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getGroup()); 
            // InternalBomi.g:194:3: ( rule__MethodologicalIsland__Group__0 )
            // InternalBomi.g:194:4: rule__MethodologicalIsland__Group__0
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
    // InternalBomi.g:203:1: entryRuleGovernanceTeam : ruleGovernanceTeam EOF ;
    public final void entryRuleGovernanceTeam() throws RecognitionException {
        try {
            // InternalBomi.g:204:1: ( ruleGovernanceTeam EOF )
            // InternalBomi.g:205:1: ruleGovernanceTeam EOF
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
    // InternalBomi.g:212:1: ruleGovernanceTeam : ( ( rule__GovernanceTeam__Group__0 ) ) ;
    public final void ruleGovernanceTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:216:2: ( ( ( rule__GovernanceTeam__Group__0 ) ) )
            // InternalBomi.g:217:2: ( ( rule__GovernanceTeam__Group__0 ) )
            {
            // InternalBomi.g:217:2: ( ( rule__GovernanceTeam__Group__0 ) )
            // InternalBomi.g:218:3: ( rule__GovernanceTeam__Group__0 )
            {
             before(grammarAccess.getGovernanceTeamAccess().getGroup()); 
            // InternalBomi.g:219:3: ( rule__GovernanceTeam__Group__0 )
            // InternalBomi.g:219:4: rule__GovernanceTeam__Group__0
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


    // $ANTLR start "entryRuleBOTeamGovernance"
    // InternalBomi.g:228:1: entryRuleBOTeamGovernance : ruleBOTeamGovernance EOF ;
    public final void entryRuleBOTeamGovernance() throws RecognitionException {
        try {
            // InternalBomi.g:229:1: ( ruleBOTeamGovernance EOF )
            // InternalBomi.g:230:1: ruleBOTeamGovernance EOF
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
    // InternalBomi.g:237:1: ruleBOTeamGovernance : ( ( rule__BOTeamGovernance__Group__0 ) ) ;
    public final void ruleBOTeamGovernance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:241:2: ( ( ( rule__BOTeamGovernance__Group__0 ) ) )
            // InternalBomi.g:242:2: ( ( rule__BOTeamGovernance__Group__0 ) )
            {
            // InternalBomi.g:242:2: ( ( rule__BOTeamGovernance__Group__0 ) )
            // InternalBomi.g:243:3: ( rule__BOTeamGovernance__Group__0 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup()); 
            // InternalBomi.g:244:3: ( rule__BOTeamGovernance__Group__0 )
            // InternalBomi.g:244:4: rule__BOTeamGovernance__Group__0
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


    // $ANTLR start "entryRuleDriver"
    // InternalBomi.g:253:1: entryRuleDriver : ruleDriver EOF ;
    public final void entryRuleDriver() throws RecognitionException {
        try {
            // InternalBomi.g:254:1: ( ruleDriver EOF )
            // InternalBomi.g:255:1: ruleDriver EOF
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
    // InternalBomi.g:262:1: ruleDriver : ( ( rule__Driver__Group__0 ) ) ;
    public final void ruleDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:266:2: ( ( ( rule__Driver__Group__0 ) ) )
            // InternalBomi.g:267:2: ( ( rule__Driver__Group__0 ) )
            {
            // InternalBomi.g:267:2: ( ( rule__Driver__Group__0 ) )
            // InternalBomi.g:268:3: ( rule__Driver__Group__0 )
            {
             before(grammarAccess.getDriverAccess().getGroup()); 
            // InternalBomi.g:269:3: ( rule__Driver__Group__0 )
            // InternalBomi.g:269:4: rule__Driver__Group__0
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


    // $ANTLR start "ruleUnsettableBoolean"
    // InternalBomi.g:319:1: ruleUnsettableBoolean : ( ( rule__UnsettableBoolean__Alternatives ) ) ;
    public final void ruleUnsettableBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:323:1: ( ( ( rule__UnsettableBoolean__Alternatives ) ) )
            // InternalBomi.g:324:2: ( ( rule__UnsettableBoolean__Alternatives ) )
            {
            // InternalBomi.g:324:2: ( ( rule__UnsettableBoolean__Alternatives ) )
            // InternalBomi.g:325:3: ( rule__UnsettableBoolean__Alternatives )
            {
             before(grammarAccess.getUnsettableBooleanAccess().getAlternatives()); 
            // InternalBomi.g:326:3: ( rule__UnsettableBoolean__Alternatives )
            // InternalBomi.g:326:4: rule__UnsettableBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnsettableBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnsettableBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsettableBoolean"


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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBomi.g:382:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:386:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBomi.g:387:2: ( RULE_STRING )
                    {
                    // InternalBomi.g:387:2: ( RULE_STRING )
                    // InternalBomi.g:388:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:393:2: ( RULE_ID )
                    {
                    // InternalBomi.g:393:2: ( RULE_ID )
                    // InternalBomi.g:394:3: RULE_ID
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
    // InternalBomi.g:403:1: rule__HighLow__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) );
    public final void rule__HighLow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:407:1: ( ( ( 'NOT_SET' ) ) | ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) )
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
                    // InternalBomi.g:408:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:408:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:409:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:410:3: ( 'NOT_SET' )
                    // InternalBomi.g:410:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:414:2: ( ( 'High' ) )
                    {
                    // InternalBomi.g:414:2: ( ( 'High' ) )
                    // InternalBomi.g:415:3: ( 'High' )
                    {
                     before(grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:416:3: ( 'High' )
                    // InternalBomi.g:416:4: 'High'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:420:2: ( ( 'Medium' ) )
                    {
                    // InternalBomi.g:420:2: ( ( 'Medium' ) )
                    // InternalBomi.g:421:3: ( 'Medium' )
                    {
                     before(grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:422:3: ( 'Medium' )
                    // InternalBomi.g:422:4: 'Medium'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:426:2: ( ( 'Low' ) )
                    {
                    // InternalBomi.g:426:2: ( ( 'Low' ) )
                    // InternalBomi.g:427:3: ( 'Low' )
                    {
                     before(grammarAccess.getHighLowAccess().getLowEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:428:3: ( 'Low' )
                    // InternalBomi.g:428:4: 'Low'
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


    // $ANTLR start "rule__UnsettableBoolean__Alternatives"
    // InternalBomi.g:436:1: rule__UnsettableBoolean__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'True' ) ) | ( ( 'False' ) ) );
    public final void rule__UnsettableBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:440:1: ( ( ( 'NOT_SET' ) ) | ( ( 'True' ) ) | ( ( 'False' ) ) )
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
                    // InternalBomi.g:441:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:441:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:442:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getUnsettableBooleanAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:443:3: ( 'NOT_SET' )
                    // InternalBomi.g:443:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnsettableBooleanAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:447:2: ( ( 'True' ) )
                    {
                    // InternalBomi.g:447:2: ( ( 'True' ) )
                    // InternalBomi.g:448:3: ( 'True' )
                    {
                     before(grammarAccess.getUnsettableBooleanAccess().getTrueEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:449:3: ( 'True' )
                    // InternalBomi.g:449:4: 'True'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnsettableBooleanAccess().getTrueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:453:2: ( ( 'False' ) )
                    {
                    // InternalBomi.g:453:2: ( ( 'False' ) )
                    // InternalBomi.g:454:3: ( 'False' )
                    {
                     before(grammarAccess.getUnsettableBooleanAccess().getFalseEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:455:3: ( 'False' )
                    // InternalBomi.g:455:4: 'False'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnsettableBooleanAccess().getFalseEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__UnsettableBoolean__Alternatives"


    // $ANTLR start "rule__BOSuperTypes__Alternatives"
    // InternalBomi.g:463:1: rule__BOSuperTypes__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Standard' ) ) | ( ( 'Technology' ) ) | ( ( 'Task' ) ) | ( ( 'Planning' ) ) | ( ( 'Value' ) ) | ( ( 'Product' ) ) | ( ( 'Other' ) ) );
    public final void rule__BOSuperTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:467:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Standard' ) ) | ( ( 'Technology' ) ) | ( ( 'Task' ) ) | ( ( 'Planning' ) ) | ( ( 'Value' ) ) | ( ( 'Product' ) ) | ( ( 'Other' ) ) )
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
                    // InternalBomi.g:468:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:468:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:469:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:470:3: ( 'NOT_SET' )
                    // InternalBomi.g:470:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:474:2: ( ( 'Standard' ) )
                    {
                    // InternalBomi.g:474:2: ( ( 'Standard' ) )
                    // InternalBomi.g:475:3: ( 'Standard' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:476:3: ( 'Standard' )
                    // InternalBomi.g:476:4: 'Standard'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:480:2: ( ( 'Technology' ) )
                    {
                    // InternalBomi.g:480:2: ( ( 'Technology' ) )
                    // InternalBomi.g:481:3: ( 'Technology' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:482:3: ( 'Technology' )
                    // InternalBomi.g:482:4: 'Technology'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:486:2: ( ( 'Task' ) )
                    {
                    // InternalBomi.g:486:2: ( ( 'Task' ) )
                    // InternalBomi.g:487:3: ( 'Task' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:488:3: ( 'Task' )
                    // InternalBomi.g:488:4: 'Task'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:492:2: ( ( 'Planning' ) )
                    {
                    // InternalBomi.g:492:2: ( ( 'Planning' ) )
                    // InternalBomi.g:493:3: ( 'Planning' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:494:3: ( 'Planning' )
                    // InternalBomi.g:494:4: 'Planning'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBomi.g:498:2: ( ( 'Value' ) )
                    {
                    // InternalBomi.g:498:2: ( ( 'Value' ) )
                    // InternalBomi.g:499:3: ( 'Value' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5()); 
                    // InternalBomi.g:500:3: ( 'Value' )
                    // InternalBomi.g:500:4: 'Value'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBomi.g:504:2: ( ( 'Product' ) )
                    {
                    // InternalBomi.g:504:2: ( ( 'Product' ) )
                    // InternalBomi.g:505:3: ( 'Product' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6()); 
                    // InternalBomi.g:506:3: ( 'Product' )
                    // InternalBomi.g:506:4: 'Product'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBomi.g:510:2: ( ( 'Other' ) )
                    {
                    // InternalBomi.g:510:2: ( ( 'Other' ) )
                    // InternalBomi.g:511:3: ( 'Other' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getOtherEnumLiteralDeclaration_7()); 
                    // InternalBomi.g:512:3: ( 'Other' )
                    // InternalBomi.g:512:4: 'Other'
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
    // InternalBomi.g:520:1: rule__LifecycleStage__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Planning' ) ) | ( ( 'Operation' ) ) | ( ( 'Deprecate' ) ) | ( ( 'Retire' ) ) );
    public final void rule__LifecycleStage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:524:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Planning' ) ) | ( ( 'Operation' ) ) | ( ( 'Deprecate' ) ) | ( ( 'Retire' ) ) )
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
                    // InternalBomi.g:525:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:525:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:526:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:527:3: ( 'NOT_SET' )
                    // InternalBomi.g:527:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:531:2: ( ( 'Planning' ) )
                    {
                    // InternalBomi.g:531:2: ( ( 'Planning' ) )
                    // InternalBomi.g:532:3: ( 'Planning' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:533:3: ( 'Planning' )
                    // InternalBomi.g:533:4: 'Planning'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:537:2: ( ( 'Operation' ) )
                    {
                    // InternalBomi.g:537:2: ( ( 'Operation' ) )
                    // InternalBomi.g:538:3: ( 'Operation' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:539:3: ( 'Operation' )
                    // InternalBomi.g:539:4: 'Operation'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:543:2: ( ( 'Deprecate' ) )
                    {
                    // InternalBomi.g:543:2: ( ( 'Deprecate' ) )
                    // InternalBomi.g:544:3: ( 'Deprecate' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:545:3: ( 'Deprecate' )
                    // InternalBomi.g:545:4: 'Deprecate'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:549:2: ( ( 'Retire' ) )
                    {
                    // InternalBomi.g:549:2: ( ( 'Retire' ) )
                    // InternalBomi.g:550:3: ( 'Retire' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getRetireEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:551:3: ( 'Retire' )
                    // InternalBomi.g:551:4: 'Retire'
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
    // InternalBomi.g:559:1: rule__MIType__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Teams' ) ) | ( ( 'Silos' ) ) | ( ( 'Departments' ) ) | ( ( 'Organizations' ) ) );
    public final void rule__MIType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:563:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Teams' ) ) | ( ( 'Silos' ) ) | ( ( 'Departments' ) ) | ( ( 'Organizations' ) ) )
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
                    // InternalBomi.g:564:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:564:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:565:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:566:3: ( 'NOT_SET' )
                    // InternalBomi.g:566:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:570:2: ( ( 'Teams' ) )
                    {
                    // InternalBomi.g:570:2: ( ( 'Teams' ) )
                    // InternalBomi.g:571:3: ( 'Teams' )
                    {
                     before(grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:572:3: ( 'Teams' )
                    // InternalBomi.g:572:4: 'Teams'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:576:2: ( ( 'Silos' ) )
                    {
                    // InternalBomi.g:576:2: ( ( 'Silos' ) )
                    // InternalBomi.g:577:3: ( 'Silos' )
                    {
                     before(grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:578:3: ( 'Silos' )
                    // InternalBomi.g:578:4: 'Silos'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:582:2: ( ( 'Departments' ) )
                    {
                    // InternalBomi.g:582:2: ( ( 'Departments' ) )
                    // InternalBomi.g:583:3: ( 'Departments' )
                    {
                     before(grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:584:3: ( 'Departments' )
                    // InternalBomi.g:584:4: 'Departments'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:588:2: ( ( 'Organizations' ) )
                    {
                    // InternalBomi.g:588:2: ( ( 'Organizations' ) )
                    // InternalBomi.g:589:3: ( 'Organizations' )
                    {
                     before(grammarAccess.getMITypeAccess().getOrganizationsEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:590:3: ( 'Organizations' )
                    // InternalBomi.g:590:4: 'Organizations'
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


    // $ANTLR start "rule__BOMIModel__Group__0"
    // InternalBomi.g:598:1: rule__BOMIModel__Group__0 : rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1 ;
    public final void rule__BOMIModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:602:1: ( rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1 )
            // InternalBomi.g:603:2: rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1
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
    // InternalBomi.g:610:1: rule__BOMIModel__Group__0__Impl : ( () ) ;
    public final void rule__BOMIModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:614:1: ( ( () ) )
            // InternalBomi.g:615:1: ( () )
            {
            // InternalBomi.g:615:1: ( () )
            // InternalBomi.g:616:2: ()
            {
             before(grammarAccess.getBOMIModelAccess().getBOMIModelAction_0()); 
            // InternalBomi.g:617:2: ()
            // InternalBomi.g:617:3: 
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
    // InternalBomi.g:625:1: rule__BOMIModel__Group__1 : rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2 ;
    public final void rule__BOMIModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:629:1: ( rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2 )
            // InternalBomi.g:630:2: rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2
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
    // InternalBomi.g:637:1: rule__BOMIModel__Group__1__Impl : ( ( rule__BOMIModel__Group_1__0 )? ) ;
    public final void rule__BOMIModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:641:1: ( ( ( rule__BOMIModel__Group_1__0 )? ) )
            // InternalBomi.g:642:1: ( ( rule__BOMIModel__Group_1__0 )? )
            {
            // InternalBomi.g:642:1: ( ( rule__BOMIModel__Group_1__0 )? )
            // InternalBomi.g:643:2: ( rule__BOMIModel__Group_1__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_1()); 
            // InternalBomi.g:644:2: ( rule__BOMIModel__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBomi.g:644:3: rule__BOMIModel__Group_1__0
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
    // InternalBomi.g:652:1: rule__BOMIModel__Group__2 : rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3 ;
    public final void rule__BOMIModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:656:1: ( rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3 )
            // InternalBomi.g:657:2: rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3
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
    // InternalBomi.g:664:1: rule__BOMIModel__Group__2__Impl : ( ( rule__BOMIModel__Group_2__0 )? ) ;
    public final void rule__BOMIModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:668:1: ( ( ( rule__BOMIModel__Group_2__0 )? ) )
            // InternalBomi.g:669:1: ( ( rule__BOMIModel__Group_2__0 )? )
            {
            // InternalBomi.g:669:1: ( ( rule__BOMIModel__Group_2__0 )? )
            // InternalBomi.g:670:2: ( rule__BOMIModel__Group_2__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_2()); 
            // InternalBomi.g:671:2: ( rule__BOMIModel__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBomi.g:671:3: rule__BOMIModel__Group_2__0
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
    // InternalBomi.g:679:1: rule__BOMIModel__Group__3 : rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4 ;
    public final void rule__BOMIModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:683:1: ( rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4 )
            // InternalBomi.g:684:2: rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4
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
    // InternalBomi.g:691:1: rule__BOMIModel__Group__3__Impl : ( ( rule__BOMIModel__Group_3__0 )? ) ;
    public final void rule__BOMIModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:695:1: ( ( ( rule__BOMIModel__Group_3__0 )? ) )
            // InternalBomi.g:696:1: ( ( rule__BOMIModel__Group_3__0 )? )
            {
            // InternalBomi.g:696:1: ( ( rule__BOMIModel__Group_3__0 )? )
            // InternalBomi.g:697:2: ( rule__BOMIModel__Group_3__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_3()); 
            // InternalBomi.g:698:2: ( rule__BOMIModel__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBomi.g:698:3: rule__BOMIModel__Group_3__0
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
    // InternalBomi.g:706:1: rule__BOMIModel__Group__4 : rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5 ;
    public final void rule__BOMIModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:710:1: ( rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5 )
            // InternalBomi.g:711:2: rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5
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
    // InternalBomi.g:718:1: rule__BOMIModel__Group__4__Impl : ( ( rule__BOMIModel__Group_4__0 )? ) ;
    public final void rule__BOMIModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:722:1: ( ( ( rule__BOMIModel__Group_4__0 )? ) )
            // InternalBomi.g:723:1: ( ( rule__BOMIModel__Group_4__0 )? )
            {
            // InternalBomi.g:723:1: ( ( rule__BOMIModel__Group_4__0 )? )
            // InternalBomi.g:724:2: ( rule__BOMIModel__Group_4__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_4()); 
            // InternalBomi.g:725:2: ( rule__BOMIModel__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBomi.g:725:3: rule__BOMIModel__Group_4__0
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
    // InternalBomi.g:733:1: rule__BOMIModel__Group__5 : rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6 ;
    public final void rule__BOMIModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:737:1: ( rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6 )
            // InternalBomi.g:738:2: rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6
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
    // InternalBomi.g:745:1: rule__BOMIModel__Group__5__Impl : ( ( rule__BOMIModel__Group_5__0 )? ) ;
    public final void rule__BOMIModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:749:1: ( ( ( rule__BOMIModel__Group_5__0 )? ) )
            // InternalBomi.g:750:1: ( ( rule__BOMIModel__Group_5__0 )? )
            {
            // InternalBomi.g:750:1: ( ( rule__BOMIModel__Group_5__0 )? )
            // InternalBomi.g:751:2: ( rule__BOMIModel__Group_5__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_5()); 
            // InternalBomi.g:752:2: ( rule__BOMIModel__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBomi.g:752:3: rule__BOMIModel__Group_5__0
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
    // InternalBomi.g:760:1: rule__BOMIModel__Group__6 : rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7 ;
    public final void rule__BOMIModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:764:1: ( rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7 )
            // InternalBomi.g:765:2: rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7
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
    // InternalBomi.g:772:1: rule__BOMIModel__Group__6__Impl : ( ( rule__BOMIModel__Group_6__0 )? ) ;
    public final void rule__BOMIModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:776:1: ( ( ( rule__BOMIModel__Group_6__0 )? ) )
            // InternalBomi.g:777:1: ( ( rule__BOMIModel__Group_6__0 )? )
            {
            // InternalBomi.g:777:1: ( ( rule__BOMIModel__Group_6__0 )? )
            // InternalBomi.g:778:2: ( rule__BOMIModel__Group_6__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_6()); 
            // InternalBomi.g:779:2: ( rule__BOMIModel__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBomi.g:779:3: rule__BOMIModel__Group_6__0
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
    // InternalBomi.g:787:1: rule__BOMIModel__Group__7 : rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8 ;
    public final void rule__BOMIModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:791:1: ( rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8 )
            // InternalBomi.g:792:2: rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8
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
    // InternalBomi.g:799:1: rule__BOMIModel__Group__7__Impl : ( ( rule__BOMIModel__Group_7__0 )? ) ;
    public final void rule__BOMIModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:803:1: ( ( ( rule__BOMIModel__Group_7__0 )? ) )
            // InternalBomi.g:804:1: ( ( rule__BOMIModel__Group_7__0 )? )
            {
            // InternalBomi.g:804:1: ( ( rule__BOMIModel__Group_7__0 )? )
            // InternalBomi.g:805:2: ( rule__BOMIModel__Group_7__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_7()); 
            // InternalBomi.g:806:2: ( rule__BOMIModel__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBomi.g:806:3: rule__BOMIModel__Group_7__0
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
    // InternalBomi.g:814:1: rule__BOMIModel__Group__8 : rule__BOMIModel__Group__8__Impl ;
    public final void rule__BOMIModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:818:1: ( rule__BOMIModel__Group__8__Impl )
            // InternalBomi.g:819:2: rule__BOMIModel__Group__8__Impl
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
    // InternalBomi.g:825:1: rule__BOMIModel__Group__8__Impl : ( ( rule__BOMIModel__Group_8__0 )? ) ;
    public final void rule__BOMIModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:829:1: ( ( ( rule__BOMIModel__Group_8__0 )? ) )
            // InternalBomi.g:830:1: ( ( rule__BOMIModel__Group_8__0 )? )
            {
            // InternalBomi.g:830:1: ( ( rule__BOMIModel__Group_8__0 )? )
            // InternalBomi.g:831:2: ( rule__BOMIModel__Group_8__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_8()); 
            // InternalBomi.g:832:2: ( rule__BOMIModel__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBomi.g:832:3: rule__BOMIModel__Group_8__0
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
    // InternalBomi.g:841:1: rule__BOMIModel__Group_1__0 : rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1 ;
    public final void rule__BOMIModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:845:1: ( rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1 )
            // InternalBomi.g:846:2: rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1
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
    // InternalBomi.g:853:1: rule__BOMIModel__Group_1__0__Impl : ( 'boRoleInteractions' ) ;
    public final void rule__BOMIModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:857:1: ( ( 'boRoleInteractions' ) )
            // InternalBomi.g:858:1: ( 'boRoleInteractions' )
            {
            // InternalBomi.g:858:1: ( 'boRoleInteractions' )
            // InternalBomi.g:859:2: 'boRoleInteractions'
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsKeyword_1_0()); 

            }


            }

        }
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
    // InternalBomi.g:868:1: rule__BOMIModel__Group_1__1 : rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2 ;
    public final void rule__BOMIModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:872:1: ( rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2 )
            // InternalBomi.g:873:2: rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2
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
    // InternalBomi.g:880:1: rule__BOMIModel__Group_1__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:884:1: ( ( '{' ) )
            // InternalBomi.g:885:1: ( '{' )
            {
            // InternalBomi.g:885:1: ( '{' )
            // InternalBomi.g:886:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:895:1: rule__BOMIModel__Group_1__2 : rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3 ;
    public final void rule__BOMIModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:899:1: ( rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3 )
            // InternalBomi.g:900:2: rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3
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
    // InternalBomi.g:907:1: rule__BOMIModel__Group_1__2__Impl : ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_2 ) ) ;
    public final void rule__BOMIModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:911:1: ( ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_2 ) ) )
            // InternalBomi.g:912:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_2 ) )
            {
            // InternalBomi.g:912:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_2 ) )
            // InternalBomi.g:913:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_1_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_1_2()); 
            // InternalBomi.g:914:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_1_2 )
            // InternalBomi.g:914:3: rule__BOMIModel__BoRoleInteractionsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoRoleInteractionsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_1_2()); 

            }


            }

        }
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
    // InternalBomi.g:922:1: rule__BOMIModel__Group_1__3 : rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4 ;
    public final void rule__BOMIModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:926:1: ( rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4 )
            // InternalBomi.g:927:2: rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4
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
    // InternalBomi.g:934:1: rule__BOMIModel__Group_1__3__Impl : ( ( rule__BOMIModel__Group_1_3__0 )* ) ;
    public final void rule__BOMIModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:938:1: ( ( ( rule__BOMIModel__Group_1_3__0 )* ) )
            // InternalBomi.g:939:1: ( ( rule__BOMIModel__Group_1_3__0 )* )
            {
            // InternalBomi.g:939:1: ( ( rule__BOMIModel__Group_1_3__0 )* )
            // InternalBomi.g:940:2: ( rule__BOMIModel__Group_1_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_1_3()); 
            // InternalBomi.g:941:2: ( rule__BOMIModel__Group_1_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBomi.g:941:3: rule__BOMIModel__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalBomi.g:949:1: rule__BOMIModel__Group_1__4 : rule__BOMIModel__Group_1__4__Impl ;
    public final void rule__BOMIModel__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:953:1: ( rule__BOMIModel__Group_1__4__Impl )
            // InternalBomi.g:954:2: rule__BOMIModel__Group_1__4__Impl
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
    // InternalBomi.g:960:1: rule__BOMIModel__Group_1__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:964:1: ( ( '}' ) )
            // InternalBomi.g:965:1: ( '}' )
            {
            // InternalBomi.g:965:1: ( '}' )
            // InternalBomi.g:966:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:976:1: rule__BOMIModel__Group_1_3__0 : rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1 ;
    public final void rule__BOMIModel__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:980:1: ( rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1 )
            // InternalBomi.g:981:2: rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1
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
    // InternalBomi.g:988:1: rule__BOMIModel__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:992:1: ( ( ',' ) )
            // InternalBomi.g:993:1: ( ',' )
            {
            // InternalBomi.g:993:1: ( ',' )
            // InternalBomi.g:994:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_1_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1003:1: rule__BOMIModel__Group_1_3__1 : rule__BOMIModel__Group_1_3__1__Impl ;
    public final void rule__BOMIModel__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1007:1: ( rule__BOMIModel__Group_1_3__1__Impl )
            // InternalBomi.g:1008:2: rule__BOMIModel__Group_1_3__1__Impl
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
    // InternalBomi.g:1014:1: rule__BOMIModel__Group_1_3__1__Impl : ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1 ) ) ;
    public final void rule__BOMIModel__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1018:1: ( ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1 ) ) )
            // InternalBomi.g:1019:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1 ) )
            {
            // InternalBomi.g:1019:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1 ) )
            // InternalBomi.g:1020:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_1_3_1()); 
            // InternalBomi.g:1021:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1 )
            // InternalBomi.g:1021:3: rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_1_3_1()); 

            }


            }

        }
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
    // InternalBomi.g:1030:1: rule__BOMIModel__Group_2__0 : rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1 ;
    public final void rule__BOMIModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1034:1: ( rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1 )
            // InternalBomi.g:1035:2: rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1
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
    // InternalBomi.g:1042:1: rule__BOMIModel__Group_2__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOMIModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1046:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:1047:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:1047:1: ( 'boundaryObjects' )
            // InternalBomi.g:1048:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsKeyword_2_0()); 

            }


            }

        }
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
    // InternalBomi.g:1057:1: rule__BOMIModel__Group_2__1 : rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2 ;
    public final void rule__BOMIModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1061:1: ( rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2 )
            // InternalBomi.g:1062:2: rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2
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
    // InternalBomi.g:1069:1: rule__BOMIModel__Group_2__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1073:1: ( ( '{' ) )
            // InternalBomi.g:1074:1: ( '{' )
            {
            // InternalBomi.g:1074:1: ( '{' )
            // InternalBomi.g:1075:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:1084:1: rule__BOMIModel__Group_2__2 : rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3 ;
    public final void rule__BOMIModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1088:1: ( rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3 )
            // InternalBomi.g:1089:2: rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3
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
    // InternalBomi.g:1096:1: rule__BOMIModel__Group_2__2__Impl : ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_2 ) ) ;
    public final void rule__BOMIModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1100:1: ( ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_2 ) ) )
            // InternalBomi.g:1101:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_2 ) )
            {
            // InternalBomi.g:1101:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_2 ) )
            // InternalBomi.g:1102:2: ( rule__BOMIModel__BoundaryObjectsAssignment_2_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_2_2()); 
            // InternalBomi.g:1103:2: ( rule__BOMIModel__BoundaryObjectsAssignment_2_2 )
            // InternalBomi.g:1103:3: rule__BOMIModel__BoundaryObjectsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoundaryObjectsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_2_2()); 

            }


            }

        }
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
    // InternalBomi.g:1111:1: rule__BOMIModel__Group_2__3 : rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4 ;
    public final void rule__BOMIModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1115:1: ( rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4 )
            // InternalBomi.g:1116:2: rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4
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
    // InternalBomi.g:1123:1: rule__BOMIModel__Group_2__3__Impl : ( ( rule__BOMIModel__Group_2_3__0 )* ) ;
    public final void rule__BOMIModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1127:1: ( ( ( rule__BOMIModel__Group_2_3__0 )* ) )
            // InternalBomi.g:1128:1: ( ( rule__BOMIModel__Group_2_3__0 )* )
            {
            // InternalBomi.g:1128:1: ( ( rule__BOMIModel__Group_2_3__0 )* )
            // InternalBomi.g:1129:2: ( rule__BOMIModel__Group_2_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_2_3()); 
            // InternalBomi.g:1130:2: ( rule__BOMIModel__Group_2_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBomi.g:1130:3: rule__BOMIModel__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBomi.g:1138:1: rule__BOMIModel__Group_2__4 : rule__BOMIModel__Group_2__4__Impl ;
    public final void rule__BOMIModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1142:1: ( rule__BOMIModel__Group_2__4__Impl )
            // InternalBomi.g:1143:2: rule__BOMIModel__Group_2__4__Impl
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
    // InternalBomi.g:1149:1: rule__BOMIModel__Group_2__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1153:1: ( ( '}' ) )
            // InternalBomi.g:1154:1: ( '}' )
            {
            // InternalBomi.g:1154:1: ( '}' )
            // InternalBomi.g:1155:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:1165:1: rule__BOMIModel__Group_2_3__0 : rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1 ;
    public final void rule__BOMIModel__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1169:1: ( rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1 )
            // InternalBomi.g:1170:2: rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1
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
    // InternalBomi.g:1177:1: rule__BOMIModel__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1181:1: ( ( ',' ) )
            // InternalBomi.g:1182:1: ( ',' )
            {
            // InternalBomi.g:1182:1: ( ',' )
            // InternalBomi.g:1183:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_2_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1192:1: rule__BOMIModel__Group_2_3__1 : rule__BOMIModel__Group_2_3__1__Impl ;
    public final void rule__BOMIModel__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1196:1: ( rule__BOMIModel__Group_2_3__1__Impl )
            // InternalBomi.g:1197:2: rule__BOMIModel__Group_2_3__1__Impl
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
    // InternalBomi.g:1203:1: rule__BOMIModel__Group_2_3__1__Impl : ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_3_1 ) ) ;
    public final void rule__BOMIModel__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1207:1: ( ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_3_1 ) ) )
            // InternalBomi.g:1208:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_3_1 ) )
            {
            // InternalBomi.g:1208:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_2_3_1 ) )
            // InternalBomi.g:1209:2: ( rule__BOMIModel__BoundaryObjectsAssignment_2_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_2_3_1()); 
            // InternalBomi.g:1210:2: ( rule__BOMIModel__BoundaryObjectsAssignment_2_3_1 )
            // InternalBomi.g:1210:3: rule__BOMIModel__BoundaryObjectsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoundaryObjectsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_2_3_1()); 

            }


            }

        }
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
    // InternalBomi.g:1219:1: rule__BOMIModel__Group_3__0 : rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1 ;
    public final void rule__BOMIModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1223:1: ( rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1 )
            // InternalBomi.g:1224:2: rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1
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
    // InternalBomi.g:1231:1: rule__BOMIModel__Group_3__0__Impl : ( 'roles' ) ;
    public final void rule__BOMIModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1235:1: ( ( 'roles' ) )
            // InternalBomi.g:1236:1: ( 'roles' )
            {
            // InternalBomi.g:1236:1: ( 'roles' )
            // InternalBomi.g:1237:2: 'roles'
            {
             before(grammarAccess.getBOMIModelAccess().getRolesKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRolesKeyword_3_0()); 

            }


            }

        }
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
    // InternalBomi.g:1246:1: rule__BOMIModel__Group_3__1 : rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2 ;
    public final void rule__BOMIModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1250:1: ( rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2 )
            // InternalBomi.g:1251:2: rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2
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
    // InternalBomi.g:1258:1: rule__BOMIModel__Group_3__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1262:1: ( ( '{' ) )
            // InternalBomi.g:1263:1: ( '{' )
            {
            // InternalBomi.g:1263:1: ( '{' )
            // InternalBomi.g:1264:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:1273:1: rule__BOMIModel__Group_3__2 : rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3 ;
    public final void rule__BOMIModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1277:1: ( rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3 )
            // InternalBomi.g:1278:2: rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3
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
    // InternalBomi.g:1285:1: rule__BOMIModel__Group_3__2__Impl : ( ( rule__BOMIModel__RolesAssignment_3_2 ) ) ;
    public final void rule__BOMIModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1289:1: ( ( ( rule__BOMIModel__RolesAssignment_3_2 ) ) )
            // InternalBomi.g:1290:1: ( ( rule__BOMIModel__RolesAssignment_3_2 ) )
            {
            // InternalBomi.g:1290:1: ( ( rule__BOMIModel__RolesAssignment_3_2 ) )
            // InternalBomi.g:1291:2: ( rule__BOMIModel__RolesAssignment_3_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getRolesAssignment_3_2()); 
            // InternalBomi.g:1292:2: ( rule__BOMIModel__RolesAssignment_3_2 )
            // InternalBomi.g:1292:3: rule__BOMIModel__RolesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__RolesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getRolesAssignment_3_2()); 

            }


            }

        }
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
    // InternalBomi.g:1300:1: rule__BOMIModel__Group_3__3 : rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4 ;
    public final void rule__BOMIModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1304:1: ( rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4 )
            // InternalBomi.g:1305:2: rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4
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
    // InternalBomi.g:1312:1: rule__BOMIModel__Group_3__3__Impl : ( ( rule__BOMIModel__Group_3_3__0 )* ) ;
    public final void rule__BOMIModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1316:1: ( ( ( rule__BOMIModel__Group_3_3__0 )* ) )
            // InternalBomi.g:1317:1: ( ( rule__BOMIModel__Group_3_3__0 )* )
            {
            // InternalBomi.g:1317:1: ( ( rule__BOMIModel__Group_3_3__0 )* )
            // InternalBomi.g:1318:2: ( rule__BOMIModel__Group_3_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_3_3()); 
            // InternalBomi.g:1319:2: ( rule__BOMIModel__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBomi.g:1319:3: rule__BOMIModel__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBomi.g:1327:1: rule__BOMIModel__Group_3__4 : rule__BOMIModel__Group_3__4__Impl ;
    public final void rule__BOMIModel__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1331:1: ( rule__BOMIModel__Group_3__4__Impl )
            // InternalBomi.g:1332:2: rule__BOMIModel__Group_3__4__Impl
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
    // InternalBomi.g:1338:1: rule__BOMIModel__Group_3__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1342:1: ( ( '}' ) )
            // InternalBomi.g:1343:1: ( '}' )
            {
            // InternalBomi.g:1343:1: ( '}' )
            // InternalBomi.g:1344:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:1354:1: rule__BOMIModel__Group_3_3__0 : rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1 ;
    public final void rule__BOMIModel__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1358:1: ( rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1 )
            // InternalBomi.g:1359:2: rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1
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
    // InternalBomi.g:1366:1: rule__BOMIModel__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1370:1: ( ( ',' ) )
            // InternalBomi.g:1371:1: ( ',' )
            {
            // InternalBomi.g:1371:1: ( ',' )
            // InternalBomi.g:1372:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_3_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1381:1: rule__BOMIModel__Group_3_3__1 : rule__BOMIModel__Group_3_3__1__Impl ;
    public final void rule__BOMIModel__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1385:1: ( rule__BOMIModel__Group_3_3__1__Impl )
            // InternalBomi.g:1386:2: rule__BOMIModel__Group_3_3__1__Impl
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
    // InternalBomi.g:1392:1: rule__BOMIModel__Group_3_3__1__Impl : ( ( rule__BOMIModel__RolesAssignment_3_3_1 ) ) ;
    public final void rule__BOMIModel__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1396:1: ( ( ( rule__BOMIModel__RolesAssignment_3_3_1 ) ) )
            // InternalBomi.g:1397:1: ( ( rule__BOMIModel__RolesAssignment_3_3_1 ) )
            {
            // InternalBomi.g:1397:1: ( ( rule__BOMIModel__RolesAssignment_3_3_1 ) )
            // InternalBomi.g:1398:2: ( rule__BOMIModel__RolesAssignment_3_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getRolesAssignment_3_3_1()); 
            // InternalBomi.g:1399:2: ( rule__BOMIModel__RolesAssignment_3_3_1 )
            // InternalBomi.g:1399:3: rule__BOMIModel__RolesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__RolesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getRolesAssignment_3_3_1()); 

            }


            }

        }
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
    // InternalBomi.g:1408:1: rule__BOMIModel__Group_4__0 : rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1 ;
    public final void rule__BOMIModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1412:1: ( rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1 )
            // InternalBomi.g:1413:2: rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1
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
    // InternalBomi.g:1420:1: rule__BOMIModel__Group_4__0__Impl : ( 'boMiCoordinations' ) ;
    public final void rule__BOMIModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1424:1: ( ( 'boMiCoordinations' ) )
            // InternalBomi.g:1425:1: ( 'boMiCoordinations' )
            {
            // InternalBomi.g:1425:1: ( 'boMiCoordinations' )
            // InternalBomi.g:1426:2: 'boMiCoordinations'
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsKeyword_4_0()); 

            }


            }

        }
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
    // InternalBomi.g:1435:1: rule__BOMIModel__Group_4__1 : rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2 ;
    public final void rule__BOMIModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1439:1: ( rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2 )
            // InternalBomi.g:1440:2: rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2
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
    // InternalBomi.g:1447:1: rule__BOMIModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1451:1: ( ( '{' ) )
            // InternalBomi.g:1452:1: ( '{' )
            {
            // InternalBomi.g:1452:1: ( '{' )
            // InternalBomi.g:1453:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:1462:1: rule__BOMIModel__Group_4__2 : rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3 ;
    public final void rule__BOMIModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1466:1: ( rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3 )
            // InternalBomi.g:1467:2: rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3
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
    // InternalBomi.g:1474:1: rule__BOMIModel__Group_4__2__Impl : ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_2 ) ) ;
    public final void rule__BOMIModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1478:1: ( ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_2 ) ) )
            // InternalBomi.g:1479:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_2 ) )
            {
            // InternalBomi.g:1479:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_2 ) )
            // InternalBomi.g:1480:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_4_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_4_2()); 
            // InternalBomi.g:1481:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_4_2 )
            // InternalBomi.g:1481:3: rule__BOMIModel__BoMiCoordinationsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoMiCoordinationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_4_2()); 

            }


            }

        }
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
    // InternalBomi.g:1489:1: rule__BOMIModel__Group_4__3 : rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4 ;
    public final void rule__BOMIModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1493:1: ( rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4 )
            // InternalBomi.g:1494:2: rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4
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
    // InternalBomi.g:1501:1: rule__BOMIModel__Group_4__3__Impl : ( ( rule__BOMIModel__Group_4_3__0 )* ) ;
    public final void rule__BOMIModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1505:1: ( ( ( rule__BOMIModel__Group_4_3__0 )* ) )
            // InternalBomi.g:1506:1: ( ( rule__BOMIModel__Group_4_3__0 )* )
            {
            // InternalBomi.g:1506:1: ( ( rule__BOMIModel__Group_4_3__0 )* )
            // InternalBomi.g:1507:2: ( rule__BOMIModel__Group_4_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_4_3()); 
            // InternalBomi.g:1508:2: ( rule__BOMIModel__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBomi.g:1508:3: rule__BOMIModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBomi.g:1516:1: rule__BOMIModel__Group_4__4 : rule__BOMIModel__Group_4__4__Impl ;
    public final void rule__BOMIModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1520:1: ( rule__BOMIModel__Group_4__4__Impl )
            // InternalBomi.g:1521:2: rule__BOMIModel__Group_4__4__Impl
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
    // InternalBomi.g:1527:1: rule__BOMIModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1531:1: ( ( '}' ) )
            // InternalBomi.g:1532:1: ( '}' )
            {
            // InternalBomi.g:1532:1: ( '}' )
            // InternalBomi.g:1533:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:1543:1: rule__BOMIModel__Group_4_3__0 : rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1 ;
    public final void rule__BOMIModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1547:1: ( rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1 )
            // InternalBomi.g:1548:2: rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1
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
    // InternalBomi.g:1555:1: rule__BOMIModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1559:1: ( ( ',' ) )
            // InternalBomi.g:1560:1: ( ',' )
            {
            // InternalBomi.g:1560:1: ( ',' )
            // InternalBomi.g:1561:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_4_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1570:1: rule__BOMIModel__Group_4_3__1 : rule__BOMIModel__Group_4_3__1__Impl ;
    public final void rule__BOMIModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1574:1: ( rule__BOMIModel__Group_4_3__1__Impl )
            // InternalBomi.g:1575:2: rule__BOMIModel__Group_4_3__1__Impl
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
    // InternalBomi.g:1581:1: rule__BOMIModel__Group_4_3__1__Impl : ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1 ) ) ;
    public final void rule__BOMIModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1585:1: ( ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1 ) ) )
            // InternalBomi.g:1586:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1 ) )
            {
            // InternalBomi.g:1586:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1 ) )
            // InternalBomi.g:1587:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_4_3_1()); 
            // InternalBomi.g:1588:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1 )
            // InternalBomi.g:1588:3: rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_4_3_1()); 

            }


            }

        }
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
    // InternalBomi.g:1597:1: rule__BOMIModel__Group_5__0 : rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1 ;
    public final void rule__BOMIModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1601:1: ( rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1 )
            // InternalBomi.g:1602:2: rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1
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
    // InternalBomi.g:1609:1: rule__BOMIModel__Group_5__0__Impl : ( 'methodologicalIslands' ) ;
    public final void rule__BOMIModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1613:1: ( ( 'methodologicalIslands' ) )
            // InternalBomi.g:1614:1: ( 'methodologicalIslands' )
            {
            // InternalBomi.g:1614:1: ( 'methodologicalIslands' )
            // InternalBomi.g:1615:2: 'methodologicalIslands'
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsKeyword_5_0()); 

            }


            }

        }
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
    // InternalBomi.g:1624:1: rule__BOMIModel__Group_5__1 : rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2 ;
    public final void rule__BOMIModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1628:1: ( rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2 )
            // InternalBomi.g:1629:2: rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2
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
    // InternalBomi.g:1636:1: rule__BOMIModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1640:1: ( ( '{' ) )
            // InternalBomi.g:1641:1: ( '{' )
            {
            // InternalBomi.g:1641:1: ( '{' )
            // InternalBomi.g:1642:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:1651:1: rule__BOMIModel__Group_5__2 : rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3 ;
    public final void rule__BOMIModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1655:1: ( rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3 )
            // InternalBomi.g:1656:2: rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3
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
    // InternalBomi.g:1663:1: rule__BOMIModel__Group_5__2__Impl : ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_2 ) ) ;
    public final void rule__BOMIModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1667:1: ( ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_2 ) ) )
            // InternalBomi.g:1668:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_2 ) )
            {
            // InternalBomi.g:1668:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_2 ) )
            // InternalBomi.g:1669:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_5_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_5_2()); 
            // InternalBomi.g:1670:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_5_2 )
            // InternalBomi.g:1670:3: rule__BOMIModel__MethodologicalIslandsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__MethodologicalIslandsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_5_2()); 

            }


            }

        }
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
    // InternalBomi.g:1678:1: rule__BOMIModel__Group_5__3 : rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4 ;
    public final void rule__BOMIModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1682:1: ( rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4 )
            // InternalBomi.g:1683:2: rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4
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
    // InternalBomi.g:1690:1: rule__BOMIModel__Group_5__3__Impl : ( ( rule__BOMIModel__Group_5_3__0 )* ) ;
    public final void rule__BOMIModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1694:1: ( ( ( rule__BOMIModel__Group_5_3__0 )* ) )
            // InternalBomi.g:1695:1: ( ( rule__BOMIModel__Group_5_3__0 )* )
            {
            // InternalBomi.g:1695:1: ( ( rule__BOMIModel__Group_5_3__0 )* )
            // InternalBomi.g:1696:2: ( rule__BOMIModel__Group_5_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_5_3()); 
            // InternalBomi.g:1697:2: ( rule__BOMIModel__Group_5_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBomi.g:1697:3: rule__BOMIModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBomi.g:1705:1: rule__BOMIModel__Group_5__4 : rule__BOMIModel__Group_5__4__Impl ;
    public final void rule__BOMIModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1709:1: ( rule__BOMIModel__Group_5__4__Impl )
            // InternalBomi.g:1710:2: rule__BOMIModel__Group_5__4__Impl
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
    // InternalBomi.g:1716:1: rule__BOMIModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1720:1: ( ( '}' ) )
            // InternalBomi.g:1721:1: ( '}' )
            {
            // InternalBomi.g:1721:1: ( '}' )
            // InternalBomi.g:1722:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:1732:1: rule__BOMIModel__Group_5_3__0 : rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1 ;
    public final void rule__BOMIModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1736:1: ( rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1 )
            // InternalBomi.g:1737:2: rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1
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
    // InternalBomi.g:1744:1: rule__BOMIModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1748:1: ( ( ',' ) )
            // InternalBomi.g:1749:1: ( ',' )
            {
            // InternalBomi.g:1749:1: ( ',' )
            // InternalBomi.g:1750:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_5_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1759:1: rule__BOMIModel__Group_5_3__1 : rule__BOMIModel__Group_5_3__1__Impl ;
    public final void rule__BOMIModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1763:1: ( rule__BOMIModel__Group_5_3__1__Impl )
            // InternalBomi.g:1764:2: rule__BOMIModel__Group_5_3__1__Impl
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
    // InternalBomi.g:1770:1: rule__BOMIModel__Group_5_3__1__Impl : ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1 ) ) ;
    public final void rule__BOMIModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1774:1: ( ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1 ) ) )
            // InternalBomi.g:1775:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1 ) )
            {
            // InternalBomi.g:1775:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1 ) )
            // InternalBomi.g:1776:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_5_3_1()); 
            // InternalBomi.g:1777:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1 )
            // InternalBomi.g:1777:3: rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_5_3_1()); 

            }


            }

        }
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
    // InternalBomi.g:1786:1: rule__BOMIModel__Group_6__0 : rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1 ;
    public final void rule__BOMIModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1790:1: ( rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1 )
            // InternalBomi.g:1791:2: rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBomi.g:1798:1: rule__BOMIModel__Group_6__0__Impl : ( 'governanceTeams' ) ;
    public final void rule__BOMIModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1802:1: ( ( 'governanceTeams' ) )
            // InternalBomi.g:1803:1: ( 'governanceTeams' )
            {
            // InternalBomi.g:1803:1: ( 'governanceTeams' )
            // InternalBomi.g:1804:2: 'governanceTeams'
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsKeyword_6_0()); 

            }


            }

        }
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
    // InternalBomi.g:1813:1: rule__BOMIModel__Group_6__1 : rule__BOMIModel__Group_6__1__Impl rule__BOMIModel__Group_6__2 ;
    public final void rule__BOMIModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1817:1: ( rule__BOMIModel__Group_6__1__Impl rule__BOMIModel__Group_6__2 )
            // InternalBomi.g:1818:2: rule__BOMIModel__Group_6__1__Impl rule__BOMIModel__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__BOMIModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6__2();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:1825:1: rule__BOMIModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1829:1: ( ( '{' ) )
            // InternalBomi.g:1830:1: ( '{' )
            {
            // InternalBomi.g:1830:1: ( '{' )
            // InternalBomi.g:1831:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BOMIModel__Group_6__2"
    // InternalBomi.g:1840:1: rule__BOMIModel__Group_6__2 : rule__BOMIModel__Group_6__2__Impl rule__BOMIModel__Group_6__3 ;
    public final void rule__BOMIModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1844:1: ( rule__BOMIModel__Group_6__2__Impl rule__BOMIModel__Group_6__3 )
            // InternalBomi.g:1845:2: rule__BOMIModel__Group_6__2__Impl rule__BOMIModel__Group_6__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__2"


    // $ANTLR start "rule__BOMIModel__Group_6__2__Impl"
    // InternalBomi.g:1852:1: rule__BOMIModel__Group_6__2__Impl : ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_2 ) ) ;
    public final void rule__BOMIModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1856:1: ( ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_2 ) ) )
            // InternalBomi.g:1857:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_2 ) )
            {
            // InternalBomi.g:1857:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_2 ) )
            // InternalBomi.g:1858:2: ( rule__BOMIModel__GovernanceTeamsAssignment_6_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_6_2()); 
            // InternalBomi.g:1859:2: ( rule__BOMIModel__GovernanceTeamsAssignment_6_2 )
            // InternalBomi.g:1859:3: rule__BOMIModel__GovernanceTeamsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__GovernanceTeamsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6__3"
    // InternalBomi.g:1867:1: rule__BOMIModel__Group_6__3 : rule__BOMIModel__Group_6__3__Impl rule__BOMIModel__Group_6__4 ;
    public final void rule__BOMIModel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1871:1: ( rule__BOMIModel__Group_6__3__Impl rule__BOMIModel__Group_6__4 )
            // InternalBomi.g:1872:2: rule__BOMIModel__Group_6__3__Impl rule__BOMIModel__Group_6__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__3"


    // $ANTLR start "rule__BOMIModel__Group_6__3__Impl"
    // InternalBomi.g:1879:1: rule__BOMIModel__Group_6__3__Impl : ( ( rule__BOMIModel__Group_6_3__0 )* ) ;
    public final void rule__BOMIModel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1883:1: ( ( ( rule__BOMIModel__Group_6_3__0 )* ) )
            // InternalBomi.g:1884:1: ( ( rule__BOMIModel__Group_6_3__0 )* )
            {
            // InternalBomi.g:1884:1: ( ( rule__BOMIModel__Group_6_3__0 )* )
            // InternalBomi.g:1885:2: ( rule__BOMIModel__Group_6_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_6_3()); 
            // InternalBomi.g:1886:2: ( rule__BOMIModel__Group_6_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBomi.g:1886:3: rule__BOMIModel__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6__4"
    // InternalBomi.g:1894:1: rule__BOMIModel__Group_6__4 : rule__BOMIModel__Group_6__4__Impl ;
    public final void rule__BOMIModel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1898:1: ( rule__BOMIModel__Group_6__4__Impl )
            // InternalBomi.g:1899:2: rule__BOMIModel__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__4"


    // $ANTLR start "rule__BOMIModel__Group_6__4__Impl"
    // InternalBomi.g:1905:1: rule__BOMIModel__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1909:1: ( ( '}' ) )
            // InternalBomi.g:1910:1: ( '}' )
            {
            // InternalBomi.g:1910:1: ( '}' )
            // InternalBomi.g:1911:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6_3__0"
    // InternalBomi.g:1921:1: rule__BOMIModel__Group_6_3__0 : rule__BOMIModel__Group_6_3__0__Impl rule__BOMIModel__Group_6_3__1 ;
    public final void rule__BOMIModel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1925:1: ( rule__BOMIModel__Group_6_3__0__Impl rule__BOMIModel__Group_6_3__1 )
            // InternalBomi.g:1926:2: rule__BOMIModel__Group_6_3__0__Impl rule__BOMIModel__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
            rule__BOMIModel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_3__0"


    // $ANTLR start "rule__BOMIModel__Group_6_3__0__Impl"
    // InternalBomi.g:1933:1: rule__BOMIModel__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1937:1: ( ( ',' ) )
            // InternalBomi.g:1938:1: ( ',' )
            {
            // InternalBomi.g:1938:1: ( ',' )
            // InternalBomi.g:1939:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_6_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_6_3__1"
    // InternalBomi.g:1948:1: rule__BOMIModel__Group_6_3__1 : rule__BOMIModel__Group_6_3__1__Impl ;
    public final void rule__BOMIModel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1952:1: ( rule__BOMIModel__Group_6_3__1__Impl )
            // InternalBomi.g:1953:2: rule__BOMIModel__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_3__1"


    // $ANTLR start "rule__BOMIModel__Group_6_3__1__Impl"
    // InternalBomi.g:1959:1: rule__BOMIModel__Group_6_3__1__Impl : ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_3_1 ) ) ;
    public final void rule__BOMIModel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1963:1: ( ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_3_1 ) ) )
            // InternalBomi.g:1964:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_3_1 ) )
            {
            // InternalBomi.g:1964:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_6_3_1 ) )
            // InternalBomi.g:1965:2: ( rule__BOMIModel__GovernanceTeamsAssignment_6_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_6_3_1()); 
            // InternalBomi.g:1966:2: ( rule__BOMIModel__GovernanceTeamsAssignment_6_3_1 )
            // InternalBomi.g:1966:3: rule__BOMIModel__GovernanceTeamsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__GovernanceTeamsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_6_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7__0"
    // InternalBomi.g:1975:1: rule__BOMIModel__Group_7__0 : rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1 ;
    public final void rule__BOMIModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1979:1: ( rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1 )
            // InternalBomi.g:1980:2: rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBomi.g:1987:1: rule__BOMIModel__Group_7__0__Impl : ( 'boTeamGovernances' ) ;
    public final void rule__BOMIModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1991:1: ( ( 'boTeamGovernances' ) )
            // InternalBomi.g:1992:1: ( 'boTeamGovernances' )
            {
            // InternalBomi.g:1992:1: ( 'boTeamGovernances' )
            // InternalBomi.g:1993:2: 'boTeamGovernances'
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesKeyword_7_0()); 

            }


            }

        }
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
    // InternalBomi.g:2002:1: rule__BOMIModel__Group_7__1 : rule__BOMIModel__Group_7__1__Impl rule__BOMIModel__Group_7__2 ;
    public final void rule__BOMIModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2006:1: ( rule__BOMIModel__Group_7__1__Impl rule__BOMIModel__Group_7__2 )
            // InternalBomi.g:2007:2: rule__BOMIModel__Group_7__1__Impl rule__BOMIModel__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__BOMIModel__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7__2();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:2014:1: rule__BOMIModel__Group_7__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2018:1: ( ( '{' ) )
            // InternalBomi.g:2019:1: ( '{' )
            {
            // InternalBomi.g:2019:1: ( '{' )
            // InternalBomi.g:2020:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BOMIModel__Group_7__2"
    // InternalBomi.g:2029:1: rule__BOMIModel__Group_7__2 : rule__BOMIModel__Group_7__2__Impl rule__BOMIModel__Group_7__3 ;
    public final void rule__BOMIModel__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2033:1: ( rule__BOMIModel__Group_7__2__Impl rule__BOMIModel__Group_7__3 )
            // InternalBomi.g:2034:2: rule__BOMIModel__Group_7__2__Impl rule__BOMIModel__Group_7__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__2"


    // $ANTLR start "rule__BOMIModel__Group_7__2__Impl"
    // InternalBomi.g:2041:1: rule__BOMIModel__Group_7__2__Impl : ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_2 ) ) ;
    public final void rule__BOMIModel__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2045:1: ( ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_2 ) ) )
            // InternalBomi.g:2046:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_2 ) )
            {
            // InternalBomi.g:2046:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_2 ) )
            // InternalBomi.g:2047:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_7_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_7_2()); 
            // InternalBomi.g:2048:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_7_2 )
            // InternalBomi.g:2048:3: rule__BOMIModel__BoTeamGovernancesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoTeamGovernancesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7__3"
    // InternalBomi.g:2056:1: rule__BOMIModel__Group_7__3 : rule__BOMIModel__Group_7__3__Impl rule__BOMIModel__Group_7__4 ;
    public final void rule__BOMIModel__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2060:1: ( rule__BOMIModel__Group_7__3__Impl rule__BOMIModel__Group_7__4 )
            // InternalBomi.g:2061:2: rule__BOMIModel__Group_7__3__Impl rule__BOMIModel__Group_7__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__3"


    // $ANTLR start "rule__BOMIModel__Group_7__3__Impl"
    // InternalBomi.g:2068:1: rule__BOMIModel__Group_7__3__Impl : ( ( rule__BOMIModel__Group_7_3__0 )* ) ;
    public final void rule__BOMIModel__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2072:1: ( ( ( rule__BOMIModel__Group_7_3__0 )* ) )
            // InternalBomi.g:2073:1: ( ( rule__BOMIModel__Group_7_3__0 )* )
            {
            // InternalBomi.g:2073:1: ( ( rule__BOMIModel__Group_7_3__0 )* )
            // InternalBomi.g:2074:2: ( rule__BOMIModel__Group_7_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_7_3()); 
            // InternalBomi.g:2075:2: ( rule__BOMIModel__Group_7_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBomi.g:2075:3: rule__BOMIModel__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7__4"
    // InternalBomi.g:2083:1: rule__BOMIModel__Group_7__4 : rule__BOMIModel__Group_7__4__Impl ;
    public final void rule__BOMIModel__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2087:1: ( rule__BOMIModel__Group_7__4__Impl )
            // InternalBomi.g:2088:2: rule__BOMIModel__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__4"


    // $ANTLR start "rule__BOMIModel__Group_7__4__Impl"
    // InternalBomi.g:2094:1: rule__BOMIModel__Group_7__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2098:1: ( ( '}' ) )
            // InternalBomi.g:2099:1: ( '}' )
            {
            // InternalBomi.g:2099:1: ( '}' )
            // InternalBomi.g:2100:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7_3__0"
    // InternalBomi.g:2110:1: rule__BOMIModel__Group_7_3__0 : rule__BOMIModel__Group_7_3__0__Impl rule__BOMIModel__Group_7_3__1 ;
    public final void rule__BOMIModel__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2114:1: ( rule__BOMIModel__Group_7_3__0__Impl rule__BOMIModel__Group_7_3__1 )
            // InternalBomi.g:2115:2: rule__BOMIModel__Group_7_3__0__Impl rule__BOMIModel__Group_7_3__1
            {
            pushFollow(FOLLOW_13);
            rule__BOMIModel__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_3__0"


    // $ANTLR start "rule__BOMIModel__Group_7_3__0__Impl"
    // InternalBomi.g:2122:1: rule__BOMIModel__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2126:1: ( ( ',' ) )
            // InternalBomi.g:2127:1: ( ',' )
            {
            // InternalBomi.g:2127:1: ( ',' )
            // InternalBomi.g:2128:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_7_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_7_3__1"
    // InternalBomi.g:2137:1: rule__BOMIModel__Group_7_3__1 : rule__BOMIModel__Group_7_3__1__Impl ;
    public final void rule__BOMIModel__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2141:1: ( rule__BOMIModel__Group_7_3__1__Impl )
            // InternalBomi.g:2142:2: rule__BOMIModel__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_3__1"


    // $ANTLR start "rule__BOMIModel__Group_7_3__1__Impl"
    // InternalBomi.g:2148:1: rule__BOMIModel__Group_7_3__1__Impl : ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1 ) ) ;
    public final void rule__BOMIModel__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2152:1: ( ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1 ) ) )
            // InternalBomi.g:2153:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1 ) )
            {
            // InternalBomi.g:2153:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1 ) )
            // InternalBomi.g:2154:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_7_3_1()); 
            // InternalBomi.g:2155:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1 )
            // InternalBomi.g:2155:3: rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_7_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8__0"
    // InternalBomi.g:2164:1: rule__BOMIModel__Group_8__0 : rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1 ;
    public final void rule__BOMIModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2168:1: ( rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1 )
            // InternalBomi.g:2169:2: rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBomi.g:2176:1: rule__BOMIModel__Group_8__0__Impl : ( 'drivers' ) ;
    public final void rule__BOMIModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2180:1: ( ( 'drivers' ) )
            // InternalBomi.g:2181:1: ( 'drivers' )
            {
            // InternalBomi.g:2181:1: ( 'drivers' )
            // InternalBomi.g:2182:2: 'drivers'
            {
             before(grammarAccess.getBOMIModelAccess().getDriversKeyword_8_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getDriversKeyword_8_0()); 

            }


            }

        }
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
    // InternalBomi.g:2191:1: rule__BOMIModel__Group_8__1 : rule__BOMIModel__Group_8__1__Impl rule__BOMIModel__Group_8__2 ;
    public final void rule__BOMIModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2195:1: ( rule__BOMIModel__Group_8__1__Impl rule__BOMIModel__Group_8__2 )
            // InternalBomi.g:2196:2: rule__BOMIModel__Group_8__1__Impl rule__BOMIModel__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__BOMIModel__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8__2();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:2203:1: rule__BOMIModel__Group_8__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2207:1: ( ( '{' ) )
            // InternalBomi.g:2208:1: ( '{' )
            {
            // InternalBomi.g:2208:1: ( '{' )
            // InternalBomi.g:2209:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BOMIModel__Group_8__2"
    // InternalBomi.g:2218:1: rule__BOMIModel__Group_8__2 : rule__BOMIModel__Group_8__2__Impl rule__BOMIModel__Group_8__3 ;
    public final void rule__BOMIModel__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2222:1: ( rule__BOMIModel__Group_8__2__Impl rule__BOMIModel__Group_8__3 )
            // InternalBomi.g:2223:2: rule__BOMIModel__Group_8__2__Impl rule__BOMIModel__Group_8__3
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__2"


    // $ANTLR start "rule__BOMIModel__Group_8__2__Impl"
    // InternalBomi.g:2230:1: rule__BOMIModel__Group_8__2__Impl : ( ( rule__BOMIModel__DriversAssignment_8_2 ) ) ;
    public final void rule__BOMIModel__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2234:1: ( ( ( rule__BOMIModel__DriversAssignment_8_2 ) ) )
            // InternalBomi.g:2235:1: ( ( rule__BOMIModel__DriversAssignment_8_2 ) )
            {
            // InternalBomi.g:2235:1: ( ( rule__BOMIModel__DriversAssignment_8_2 ) )
            // InternalBomi.g:2236:2: ( rule__BOMIModel__DriversAssignment_8_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getDriversAssignment_8_2()); 
            // InternalBomi.g:2237:2: ( rule__BOMIModel__DriversAssignment_8_2 )
            // InternalBomi.g:2237:3: rule__BOMIModel__DriversAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__DriversAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getDriversAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__2__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8__3"
    // InternalBomi.g:2245:1: rule__BOMIModel__Group_8__3 : rule__BOMIModel__Group_8__3__Impl rule__BOMIModel__Group_8__4 ;
    public final void rule__BOMIModel__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2249:1: ( rule__BOMIModel__Group_8__3__Impl rule__BOMIModel__Group_8__4 )
            // InternalBomi.g:2250:2: rule__BOMIModel__Group_8__3__Impl rule__BOMIModel__Group_8__4
            {
            pushFollow(FOLLOW_6);
            rule__BOMIModel__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__3"


    // $ANTLR start "rule__BOMIModel__Group_8__3__Impl"
    // InternalBomi.g:2257:1: rule__BOMIModel__Group_8__3__Impl : ( ( rule__BOMIModel__Group_8_3__0 )* ) ;
    public final void rule__BOMIModel__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2261:1: ( ( ( rule__BOMIModel__Group_8_3__0 )* ) )
            // InternalBomi.g:2262:1: ( ( rule__BOMIModel__Group_8_3__0 )* )
            {
            // InternalBomi.g:2262:1: ( ( rule__BOMIModel__Group_8_3__0 )* )
            // InternalBomi.g:2263:2: ( rule__BOMIModel__Group_8_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_8_3()); 
            // InternalBomi.g:2264:2: ( rule__BOMIModel__Group_8_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBomi.g:2264:3: rule__BOMIModel__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBOMIModelAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__3__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8__4"
    // InternalBomi.g:2272:1: rule__BOMIModel__Group_8__4 : rule__BOMIModel__Group_8__4__Impl ;
    public final void rule__BOMIModel__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2276:1: ( rule__BOMIModel__Group_8__4__Impl )
            // InternalBomi.g:2277:2: rule__BOMIModel__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__4"


    // $ANTLR start "rule__BOMIModel__Group_8__4__Impl"
    // InternalBomi.g:2283:1: rule__BOMIModel__Group_8__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2287:1: ( ( '}' ) )
            // InternalBomi.g:2288:1: ( '}' )
            {
            // InternalBomi.g:2288:1: ( '}' )
            // InternalBomi.g:2289:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8__4__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8_3__0"
    // InternalBomi.g:2299:1: rule__BOMIModel__Group_8_3__0 : rule__BOMIModel__Group_8_3__0__Impl rule__BOMIModel__Group_8_3__1 ;
    public final void rule__BOMIModel__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2303:1: ( rule__BOMIModel__Group_8_3__0__Impl rule__BOMIModel__Group_8_3__1 )
            // InternalBomi.g:2304:2: rule__BOMIModel__Group_8_3__0__Impl rule__BOMIModel__Group_8_3__1
            {
            pushFollow(FOLLOW_14);
            rule__BOMIModel__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_3__0"


    // $ANTLR start "rule__BOMIModel__Group_8_3__0__Impl"
    // InternalBomi.g:2311:1: rule__BOMIModel__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2315:1: ( ( ',' ) )
            // InternalBomi.g:2316:1: ( ',' )
            {
            // InternalBomi.g:2316:1: ( ',' )
            // InternalBomi.g:2317:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_8_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBOMIModelAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_3__0__Impl"


    // $ANTLR start "rule__BOMIModel__Group_8_3__1"
    // InternalBomi.g:2326:1: rule__BOMIModel__Group_8_3__1 : rule__BOMIModel__Group_8_3__1__Impl ;
    public final void rule__BOMIModel__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2330:1: ( rule__BOMIModel__Group_8_3__1__Impl )
            // InternalBomi.g:2331:2: rule__BOMIModel__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_3__1"


    // $ANTLR start "rule__BOMIModel__Group_8_3__1__Impl"
    // InternalBomi.g:2337:1: rule__BOMIModel__Group_8_3__1__Impl : ( ( rule__BOMIModel__DriversAssignment_8_3_1 ) ) ;
    public final void rule__BOMIModel__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2341:1: ( ( ( rule__BOMIModel__DriversAssignment_8_3_1 ) ) )
            // InternalBomi.g:2342:1: ( ( rule__BOMIModel__DriversAssignment_8_3_1 ) )
            {
            // InternalBomi.g:2342:1: ( ( rule__BOMIModel__DriversAssignment_8_3_1 ) )
            // InternalBomi.g:2343:2: ( rule__BOMIModel__DriversAssignment_8_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getDriversAssignment_8_3_1()); 
            // InternalBomi.g:2344:2: ( rule__BOMIModel__DriversAssignment_8_3_1 )
            // InternalBomi.g:2344:3: rule__BOMIModel__DriversAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOMIModel__DriversAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOMIModelAccess().getDriversAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__Group_8_3__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group__0"
    // InternalBomi.g:2353:1: rule__BORoleInteraction__Group__0 : rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1 ;
    public final void rule__BORoleInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2357:1: ( rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1 )
            // InternalBomi.g:2358:2: rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBomi.g:2365:1: rule__BORoleInteraction__Group__0__Impl : ( () ) ;
    public final void rule__BORoleInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2369:1: ( ( () ) )
            // InternalBomi.g:2370:1: ( () )
            {
            // InternalBomi.g:2370:1: ( () )
            // InternalBomi.g:2371:2: ()
            {
             before(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionAction_0()); 
            // InternalBomi.g:2372:2: ()
            // InternalBomi.g:2372:3: 
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
    // InternalBomi.g:2380:1: rule__BORoleInteraction__Group__1 : rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2 ;
    public final void rule__BORoleInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2384:1: ( rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2 )
            // InternalBomi.g:2385:2: rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:2392:1: rule__BORoleInteraction__Group__1__Impl : ( 'BORoleInteraction' ) ;
    public final void rule__BORoleInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2396:1: ( ( 'BORoleInteraction' ) )
            // InternalBomi.g:2397:1: ( 'BORoleInteraction' )
            {
            // InternalBomi.g:2397:1: ( 'BORoleInteraction' )
            // InternalBomi.g:2398:2: 'BORoleInteraction'
            {
             before(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBomi.g:2407:1: rule__BORoleInteraction__Group__2 : rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3 ;
    public final void rule__BORoleInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2411:1: ( rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3 )
            // InternalBomi.g:2412:2: rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3
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
    // InternalBomi.g:2419:1: rule__BORoleInteraction__Group__2__Impl : ( ( rule__BORoleInteraction__NameAssignment_2 ) ) ;
    public final void rule__BORoleInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2423:1: ( ( ( rule__BORoleInteraction__NameAssignment_2 ) ) )
            // InternalBomi.g:2424:1: ( ( rule__BORoleInteraction__NameAssignment_2 ) )
            {
            // InternalBomi.g:2424:1: ( ( rule__BORoleInteraction__NameAssignment_2 ) )
            // InternalBomi.g:2425:2: ( rule__BORoleInteraction__NameAssignment_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getNameAssignment_2()); 
            // InternalBomi.g:2426:2: ( rule__BORoleInteraction__NameAssignment_2 )
            // InternalBomi.g:2426:3: rule__BORoleInteraction__NameAssignment_2
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
    // InternalBomi.g:2434:1: rule__BORoleInteraction__Group__3 : rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4 ;
    public final void rule__BORoleInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2438:1: ( rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4 )
            // InternalBomi.g:2439:2: rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2446:1: rule__BORoleInteraction__Group__3__Impl : ( '{' ) ;
    public final void rule__BORoleInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2450:1: ( ( '{' ) )
            // InternalBomi.g:2451:1: ( '{' )
            {
            // InternalBomi.g:2451:1: ( '{' )
            // InternalBomi.g:2452:2: '{'
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:2461:1: rule__BORoleInteraction__Group__4 : rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5 ;
    public final void rule__BORoleInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2465:1: ( rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5 )
            // InternalBomi.g:2466:2: rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2473:1: rule__BORoleInteraction__Group__4__Impl : ( ( rule__BORoleInteraction__Group_4__0 )? ) ;
    public final void rule__BORoleInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2477:1: ( ( ( rule__BORoleInteraction__Group_4__0 )? ) )
            // InternalBomi.g:2478:1: ( ( rule__BORoleInteraction__Group_4__0 )? )
            {
            // InternalBomi.g:2478:1: ( ( rule__BORoleInteraction__Group_4__0 )? )
            // InternalBomi.g:2479:2: ( rule__BORoleInteraction__Group_4__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_4()); 
            // InternalBomi.g:2480:2: ( rule__BORoleInteraction__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBomi.g:2480:3: rule__BORoleInteraction__Group_4__0
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
    // InternalBomi.g:2488:1: rule__BORoleInteraction__Group__5 : rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6 ;
    public final void rule__BORoleInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2492:1: ( rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6 )
            // InternalBomi.g:2493:2: rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2500:1: rule__BORoleInteraction__Group__5__Impl : ( ( rule__BORoleInteraction__Group_5__0 )? ) ;
    public final void rule__BORoleInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2504:1: ( ( ( rule__BORoleInteraction__Group_5__0 )? ) )
            // InternalBomi.g:2505:1: ( ( rule__BORoleInteraction__Group_5__0 )? )
            {
            // InternalBomi.g:2505:1: ( ( rule__BORoleInteraction__Group_5__0 )? )
            // InternalBomi.g:2506:2: ( rule__BORoleInteraction__Group_5__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_5()); 
            // InternalBomi.g:2507:2: ( rule__BORoleInteraction__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBomi.g:2507:3: rule__BORoleInteraction__Group_5__0
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
    // InternalBomi.g:2515:1: rule__BORoleInteraction__Group__6 : rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7 ;
    public final void rule__BORoleInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2519:1: ( rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7 )
            // InternalBomi.g:2520:2: rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2527:1: rule__BORoleInteraction__Group__6__Impl : ( ( rule__BORoleInteraction__Group_6__0 )? ) ;
    public final void rule__BORoleInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2531:1: ( ( ( rule__BORoleInteraction__Group_6__0 )? ) )
            // InternalBomi.g:2532:1: ( ( rule__BORoleInteraction__Group_6__0 )? )
            {
            // InternalBomi.g:2532:1: ( ( rule__BORoleInteraction__Group_6__0 )? )
            // InternalBomi.g:2533:2: ( rule__BORoleInteraction__Group_6__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_6()); 
            // InternalBomi.g:2534:2: ( rule__BORoleInteraction__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBomi.g:2534:3: rule__BORoleInteraction__Group_6__0
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
    // InternalBomi.g:2542:1: rule__BORoleInteraction__Group__7 : rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8 ;
    public final void rule__BORoleInteraction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2546:1: ( rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8 )
            // InternalBomi.g:2547:2: rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2554:1: rule__BORoleInteraction__Group__7__Impl : ( ( rule__BORoleInteraction__Group_7__0 )? ) ;
    public final void rule__BORoleInteraction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2558:1: ( ( ( rule__BORoleInteraction__Group_7__0 )? ) )
            // InternalBomi.g:2559:1: ( ( rule__BORoleInteraction__Group_7__0 )? )
            {
            // InternalBomi.g:2559:1: ( ( rule__BORoleInteraction__Group_7__0 )? )
            // InternalBomi.g:2560:2: ( rule__BORoleInteraction__Group_7__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_7()); 
            // InternalBomi.g:2561:2: ( rule__BORoleInteraction__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBomi.g:2561:3: rule__BORoleInteraction__Group_7__0
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
    // InternalBomi.g:2569:1: rule__BORoleInteraction__Group__8 : rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9 ;
    public final void rule__BORoleInteraction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2573:1: ( rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9 )
            // InternalBomi.g:2574:2: rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2581:1: rule__BORoleInteraction__Group__8__Impl : ( ( rule__BORoleInteraction__Group_8__0 )? ) ;
    public final void rule__BORoleInteraction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2585:1: ( ( ( rule__BORoleInteraction__Group_8__0 )? ) )
            // InternalBomi.g:2586:1: ( ( rule__BORoleInteraction__Group_8__0 )? )
            {
            // InternalBomi.g:2586:1: ( ( rule__BORoleInteraction__Group_8__0 )? )
            // InternalBomi.g:2587:2: ( rule__BORoleInteraction__Group_8__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_8()); 
            // InternalBomi.g:2588:2: ( rule__BORoleInteraction__Group_8__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBomi.g:2588:3: rule__BORoleInteraction__Group_8__0
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
    // InternalBomi.g:2596:1: rule__BORoleInteraction__Group__9 : rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10 ;
    public final void rule__BORoleInteraction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2600:1: ( rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10 )
            // InternalBomi.g:2601:2: rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2608:1: rule__BORoleInteraction__Group__9__Impl : ( ( rule__BORoleInteraction__Group_9__0 )? ) ;
    public final void rule__BORoleInteraction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2612:1: ( ( ( rule__BORoleInteraction__Group_9__0 )? ) )
            // InternalBomi.g:2613:1: ( ( rule__BORoleInteraction__Group_9__0 )? )
            {
            // InternalBomi.g:2613:1: ( ( rule__BORoleInteraction__Group_9__0 )? )
            // InternalBomi.g:2614:2: ( rule__BORoleInteraction__Group_9__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_9()); 
            // InternalBomi.g:2615:2: ( rule__BORoleInteraction__Group_9__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBomi.g:2615:3: rule__BORoleInteraction__Group_9__0
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
    // InternalBomi.g:2623:1: rule__BORoleInteraction__Group__10 : rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11 ;
    public final void rule__BORoleInteraction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2627:1: ( rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11 )
            // InternalBomi.g:2628:2: rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2635:1: rule__BORoleInteraction__Group__10__Impl : ( ( rule__BORoleInteraction__Group_10__0 )? ) ;
    public final void rule__BORoleInteraction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2639:1: ( ( ( rule__BORoleInteraction__Group_10__0 )? ) )
            // InternalBomi.g:2640:1: ( ( rule__BORoleInteraction__Group_10__0 )? )
            {
            // InternalBomi.g:2640:1: ( ( rule__BORoleInteraction__Group_10__0 )? )
            // InternalBomi.g:2641:2: ( rule__BORoleInteraction__Group_10__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_10()); 
            // InternalBomi.g:2642:2: ( rule__BORoleInteraction__Group_10__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBomi.g:2642:3: rule__BORoleInteraction__Group_10__0
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
    // InternalBomi.g:2650:1: rule__BORoleInteraction__Group__11 : rule__BORoleInteraction__Group__11__Impl rule__BORoleInteraction__Group__12 ;
    public final void rule__BORoleInteraction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2654:1: ( rule__BORoleInteraction__Group__11__Impl rule__BORoleInteraction__Group__12 )
            // InternalBomi.g:2655:2: rule__BORoleInteraction__Group__11__Impl rule__BORoleInteraction__Group__12
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2662:1: rule__BORoleInteraction__Group__11__Impl : ( ( rule__BORoleInteraction__Group_11__0 )? ) ;
    public final void rule__BORoleInteraction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2666:1: ( ( ( rule__BORoleInteraction__Group_11__0 )? ) )
            // InternalBomi.g:2667:1: ( ( rule__BORoleInteraction__Group_11__0 )? )
            {
            // InternalBomi.g:2667:1: ( ( rule__BORoleInteraction__Group_11__0 )? )
            // InternalBomi.g:2668:2: ( rule__BORoleInteraction__Group_11__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_11()); 
            // InternalBomi.g:2669:2: ( rule__BORoleInteraction__Group_11__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBomi.g:2669:3: rule__BORoleInteraction__Group_11__0
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
    // InternalBomi.g:2677:1: rule__BORoleInteraction__Group__12 : rule__BORoleInteraction__Group__12__Impl rule__BORoleInteraction__Group__13 ;
    public final void rule__BORoleInteraction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2681:1: ( rule__BORoleInteraction__Group__12__Impl rule__BORoleInteraction__Group__13 )
            // InternalBomi.g:2682:2: rule__BORoleInteraction__Group__12__Impl rule__BORoleInteraction__Group__13
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2689:1: rule__BORoleInteraction__Group__12__Impl : ( ( rule__BORoleInteraction__Group_12__0 )? ) ;
    public final void rule__BORoleInteraction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2693:1: ( ( ( rule__BORoleInteraction__Group_12__0 )? ) )
            // InternalBomi.g:2694:1: ( ( rule__BORoleInteraction__Group_12__0 )? )
            {
            // InternalBomi.g:2694:1: ( ( rule__BORoleInteraction__Group_12__0 )? )
            // InternalBomi.g:2695:2: ( rule__BORoleInteraction__Group_12__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_12()); 
            // InternalBomi.g:2696:2: ( rule__BORoleInteraction__Group_12__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBomi.g:2696:3: rule__BORoleInteraction__Group_12__0
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
    // InternalBomi.g:2704:1: rule__BORoleInteraction__Group__13 : rule__BORoleInteraction__Group__13__Impl rule__BORoleInteraction__Group__14 ;
    public final void rule__BORoleInteraction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2708:1: ( rule__BORoleInteraction__Group__13__Impl rule__BORoleInteraction__Group__14 )
            // InternalBomi.g:2709:2: rule__BORoleInteraction__Group__13__Impl rule__BORoleInteraction__Group__14
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2716:1: rule__BORoleInteraction__Group__13__Impl : ( ( rule__BORoleInteraction__Group_13__0 )? ) ;
    public final void rule__BORoleInteraction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2720:1: ( ( ( rule__BORoleInteraction__Group_13__0 )? ) )
            // InternalBomi.g:2721:1: ( ( rule__BORoleInteraction__Group_13__0 )? )
            {
            // InternalBomi.g:2721:1: ( ( rule__BORoleInteraction__Group_13__0 )? )
            // InternalBomi.g:2722:2: ( rule__BORoleInteraction__Group_13__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_13()); 
            // InternalBomi.g:2723:2: ( rule__BORoleInteraction__Group_13__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBomi.g:2723:3: rule__BORoleInteraction__Group_13__0
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
    // InternalBomi.g:2731:1: rule__BORoleInteraction__Group__14 : rule__BORoleInteraction__Group__14__Impl rule__BORoleInteraction__Group__15 ;
    public final void rule__BORoleInteraction__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2735:1: ( rule__BORoleInteraction__Group__14__Impl rule__BORoleInteraction__Group__15 )
            // InternalBomi.g:2736:2: rule__BORoleInteraction__Group__14__Impl rule__BORoleInteraction__Group__15
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2743:1: rule__BORoleInteraction__Group__14__Impl : ( ( rule__BORoleInteraction__Group_14__0 )? ) ;
    public final void rule__BORoleInteraction__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2747:1: ( ( ( rule__BORoleInteraction__Group_14__0 )? ) )
            // InternalBomi.g:2748:1: ( ( rule__BORoleInteraction__Group_14__0 )? )
            {
            // InternalBomi.g:2748:1: ( ( rule__BORoleInteraction__Group_14__0 )? )
            // InternalBomi.g:2749:2: ( rule__BORoleInteraction__Group_14__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_14()); 
            // InternalBomi.g:2750:2: ( rule__BORoleInteraction__Group_14__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBomi.g:2750:3: rule__BORoleInteraction__Group_14__0
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
    // InternalBomi.g:2758:1: rule__BORoleInteraction__Group__15 : rule__BORoleInteraction__Group__15__Impl rule__BORoleInteraction__Group__16 ;
    public final void rule__BORoleInteraction__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2762:1: ( rule__BORoleInteraction__Group__15__Impl rule__BORoleInteraction__Group__16 )
            // InternalBomi.g:2763:2: rule__BORoleInteraction__Group__15__Impl rule__BORoleInteraction__Group__16
            {
            pushFollow(FOLLOW_16);
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
    // InternalBomi.g:2770:1: rule__BORoleInteraction__Group__15__Impl : ( ( rule__BORoleInteraction__Group_15__0 )? ) ;
    public final void rule__BORoleInteraction__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2774:1: ( ( ( rule__BORoleInteraction__Group_15__0 )? ) )
            // InternalBomi.g:2775:1: ( ( rule__BORoleInteraction__Group_15__0 )? )
            {
            // InternalBomi.g:2775:1: ( ( rule__BORoleInteraction__Group_15__0 )? )
            // InternalBomi.g:2776:2: ( rule__BORoleInteraction__Group_15__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_15()); 
            // InternalBomi.g:2777:2: ( rule__BORoleInteraction__Group_15__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBomi.g:2777:3: rule__BORoleInteraction__Group_15__0
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
    // InternalBomi.g:2785:1: rule__BORoleInteraction__Group__16 : rule__BORoleInteraction__Group__16__Impl ;
    public final void rule__BORoleInteraction__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2789:1: ( rule__BORoleInteraction__Group__16__Impl )
            // InternalBomi.g:2790:2: rule__BORoleInteraction__Group__16__Impl
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
    // InternalBomi.g:2796:1: rule__BORoleInteraction__Group__16__Impl : ( '}' ) ;
    public final void rule__BORoleInteraction__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2800:1: ( ( '}' ) )
            // InternalBomi.g:2801:1: ( '}' )
            {
            // InternalBomi.g:2801:1: ( '}' )
            // InternalBomi.g:2802:2: '}'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightCurlyBracketKeyword_16()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:2812:1: rule__BORoleInteraction__Group_4__0 : rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1 ;
    public final void rule__BORoleInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2816:1: ( rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1 )
            // InternalBomi.g:2817:2: rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:2824:1: rule__BORoleInteraction__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BORoleInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2828:1: ( ( 'purpose' ) )
            // InternalBomi.g:2829:1: ( 'purpose' )
            {
            // InternalBomi.g:2829:1: ( 'purpose' )
            // InternalBomi.g:2830:2: 'purpose'
            {
             before(grammarAccess.getBORoleInteractionAccess().getPurposeKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBomi.g:2839:1: rule__BORoleInteraction__Group_4__1 : rule__BORoleInteraction__Group_4__1__Impl ;
    public final void rule__BORoleInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2843:1: ( rule__BORoleInteraction__Group_4__1__Impl )
            // InternalBomi.g:2844:2: rule__BORoleInteraction__Group_4__1__Impl
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
    // InternalBomi.g:2850:1: rule__BORoleInteraction__Group_4__1__Impl : ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) ) ;
    public final void rule__BORoleInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2854:1: ( ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:2855:1: ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:2855:1: ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) )
            // InternalBomi.g:2856:2: ( rule__BORoleInteraction__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:2857:2: ( rule__BORoleInteraction__PurposeAssignment_4_1 )
            // InternalBomi.g:2857:3: rule__BORoleInteraction__PurposeAssignment_4_1
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
    // InternalBomi.g:2866:1: rule__BORoleInteraction__Group_5__0 : rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1 ;
    public final void rule__BORoleInteraction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2870:1: ( rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1 )
            // InternalBomi.g:2871:2: rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:2878:1: rule__BORoleInteraction__Group_5__0__Impl : ( 'accessability' ) ;
    public final void rule__BORoleInteraction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2882:1: ( ( 'accessability' ) )
            // InternalBomi.g:2883:1: ( 'accessability' )
            {
            // InternalBomi.g:2883:1: ( 'accessability' )
            // InternalBomi.g:2884:2: 'accessability'
            {
             before(grammarAccess.getBORoleInteractionAccess().getAccessabilityKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBomi.g:2893:1: rule__BORoleInteraction__Group_5__1 : rule__BORoleInteraction__Group_5__1__Impl ;
    public final void rule__BORoleInteraction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2897:1: ( rule__BORoleInteraction__Group_5__1__Impl )
            // InternalBomi.g:2898:2: rule__BORoleInteraction__Group_5__1__Impl
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
    // InternalBomi.g:2904:1: rule__BORoleInteraction__Group_5__1__Impl : ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) ) ;
    public final void rule__BORoleInteraction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2908:1: ( ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) ) )
            // InternalBomi.g:2909:1: ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) )
            {
            // InternalBomi.g:2909:1: ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) )
            // InternalBomi.g:2910:2: ( rule__BORoleInteraction__AccessabilityAssignment_5_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getAccessabilityAssignment_5_1()); 
            // InternalBomi.g:2911:2: ( rule__BORoleInteraction__AccessabilityAssignment_5_1 )
            // InternalBomi.g:2911:3: rule__BORoleInteraction__AccessabilityAssignment_5_1
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
    // InternalBomi.g:2920:1: rule__BORoleInteraction__Group_6__0 : rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1 ;
    public final void rule__BORoleInteraction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2924:1: ( rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1 )
            // InternalBomi.g:2925:2: rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:2932:1: rule__BORoleInteraction__Group_6__0__Impl : ( 'stability' ) ;
    public final void rule__BORoleInteraction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2936:1: ( ( 'stability' ) )
            // InternalBomi.g:2937:1: ( 'stability' )
            {
            // InternalBomi.g:2937:1: ( 'stability' )
            // InternalBomi.g:2938:2: 'stability'
            {
             before(grammarAccess.getBORoleInteractionAccess().getStabilityKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBomi.g:2947:1: rule__BORoleInteraction__Group_6__1 : rule__BORoleInteraction__Group_6__1__Impl ;
    public final void rule__BORoleInteraction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2951:1: ( rule__BORoleInteraction__Group_6__1__Impl )
            // InternalBomi.g:2952:2: rule__BORoleInteraction__Group_6__1__Impl
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
    // InternalBomi.g:2958:1: rule__BORoleInteraction__Group_6__1__Impl : ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) ) ;
    public final void rule__BORoleInteraction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2962:1: ( ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) ) )
            // InternalBomi.g:2963:1: ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) )
            {
            // InternalBomi.g:2963:1: ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) )
            // InternalBomi.g:2964:2: ( rule__BORoleInteraction__StabilityAssignment_6_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getStabilityAssignment_6_1()); 
            // InternalBomi.g:2965:2: ( rule__BORoleInteraction__StabilityAssignment_6_1 )
            // InternalBomi.g:2965:3: rule__BORoleInteraction__StabilityAssignment_6_1
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
    // InternalBomi.g:2974:1: rule__BORoleInteraction__Group_7__0 : rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1 ;
    public final void rule__BORoleInteraction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2978:1: ( rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1 )
            // InternalBomi.g:2979:2: rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:2986:1: rule__BORoleInteraction__Group_7__0__Impl : ( 'criticality' ) ;
    public final void rule__BORoleInteraction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2990:1: ( ( 'criticality' ) )
            // InternalBomi.g:2991:1: ( 'criticality' )
            {
            // InternalBomi.g:2991:1: ( 'criticality' )
            // InternalBomi.g:2992:2: 'criticality'
            {
             before(grammarAccess.getBORoleInteractionAccess().getCriticalityKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBomi.g:3001:1: rule__BORoleInteraction__Group_7__1 : rule__BORoleInteraction__Group_7__1__Impl ;
    public final void rule__BORoleInteraction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3005:1: ( rule__BORoleInteraction__Group_7__1__Impl )
            // InternalBomi.g:3006:2: rule__BORoleInteraction__Group_7__1__Impl
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
    // InternalBomi.g:3012:1: rule__BORoleInteraction__Group_7__1__Impl : ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) ) ;
    public final void rule__BORoleInteraction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3016:1: ( ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) ) )
            // InternalBomi.g:3017:1: ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) )
            {
            // InternalBomi.g:3017:1: ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) )
            // InternalBomi.g:3018:2: ( rule__BORoleInteraction__CriticalityAssignment_7_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getCriticalityAssignment_7_1()); 
            // InternalBomi.g:3019:2: ( rule__BORoleInteraction__CriticalityAssignment_7_1 )
            // InternalBomi.g:3019:3: rule__BORoleInteraction__CriticalityAssignment_7_1
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
    // InternalBomi.g:3028:1: rule__BORoleInteraction__Group_8__0 : rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1 ;
    public final void rule__BORoleInteraction__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3032:1: ( rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1 )
            // InternalBomi.g:3033:2: rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:3040:1: rule__BORoleInteraction__Group_8__0__Impl : ( 'fitForPurpose' ) ;
    public final void rule__BORoleInteraction__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3044:1: ( ( 'fitForPurpose' ) )
            // InternalBomi.g:3045:1: ( 'fitForPurpose' )
            {
            // InternalBomi.g:3045:1: ( 'fitForPurpose' )
            // InternalBomi.g:3046:2: 'fitForPurpose'
            {
             before(grammarAccess.getBORoleInteractionAccess().getFitForPurposeKeyword_8_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBomi.g:3055:1: rule__BORoleInteraction__Group_8__1 : rule__BORoleInteraction__Group_8__1__Impl ;
    public final void rule__BORoleInteraction__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3059:1: ( rule__BORoleInteraction__Group_8__1__Impl )
            // InternalBomi.g:3060:2: rule__BORoleInteraction__Group_8__1__Impl
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
    // InternalBomi.g:3066:1: rule__BORoleInteraction__Group_8__1__Impl : ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) ) ;
    public final void rule__BORoleInteraction__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3070:1: ( ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) ) )
            // InternalBomi.g:3071:1: ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) )
            {
            // InternalBomi.g:3071:1: ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) )
            // InternalBomi.g:3072:2: ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getFitForPurposeAssignment_8_1()); 
            // InternalBomi.g:3073:2: ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 )
            // InternalBomi.g:3073:3: rule__BORoleInteraction__FitForPurposeAssignment_8_1
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
    // InternalBomi.g:3082:1: rule__BORoleInteraction__Group_9__0 : rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1 ;
    public final void rule__BORoleInteraction__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3086:1: ( rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1 )
            // InternalBomi.g:3087:2: rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:3094:1: rule__BORoleInteraction__Group_9__0__Impl : ( 'responsible' ) ;
    public final void rule__BORoleInteraction__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3098:1: ( ( 'responsible' ) )
            // InternalBomi.g:3099:1: ( 'responsible' )
            {
            // InternalBomi.g:3099:1: ( 'responsible' )
            // InternalBomi.g:3100:2: 'responsible'
            {
             before(grammarAccess.getBORoleInteractionAccess().getResponsibleKeyword_9_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBomi.g:3109:1: rule__BORoleInteraction__Group_9__1 : rule__BORoleInteraction__Group_9__1__Impl ;
    public final void rule__BORoleInteraction__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3113:1: ( rule__BORoleInteraction__Group_9__1__Impl )
            // InternalBomi.g:3114:2: rule__BORoleInteraction__Group_9__1__Impl
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
    // InternalBomi.g:3120:1: rule__BORoleInteraction__Group_9__1__Impl : ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) ) ;
    public final void rule__BORoleInteraction__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3124:1: ( ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) ) )
            // InternalBomi.g:3125:1: ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) )
            {
            // InternalBomi.g:3125:1: ( ( rule__BORoleInteraction__ResponsibleAssignment_9_1 ) )
            // InternalBomi.g:3126:2: ( rule__BORoleInteraction__ResponsibleAssignment_9_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getResponsibleAssignment_9_1()); 
            // InternalBomi.g:3127:2: ( rule__BORoleInteraction__ResponsibleAssignment_9_1 )
            // InternalBomi.g:3127:3: rule__BORoleInteraction__ResponsibleAssignment_9_1
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
    // InternalBomi.g:3136:1: rule__BORoleInteraction__Group_10__0 : rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1 ;
    public final void rule__BORoleInteraction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3140:1: ( rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1 )
            // InternalBomi.g:3141:2: rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:3148:1: rule__BORoleInteraction__Group_10__0__Impl : ( 'creates' ) ;
    public final void rule__BORoleInteraction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3152:1: ( ( 'creates' ) )
            // InternalBomi.g:3153:1: ( 'creates' )
            {
            // InternalBomi.g:3153:1: ( 'creates' )
            // InternalBomi.g:3154:2: 'creates'
            {
             before(grammarAccess.getBORoleInteractionAccess().getCreatesKeyword_10_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBomi.g:3163:1: rule__BORoleInteraction__Group_10__1 : rule__BORoleInteraction__Group_10__1__Impl ;
    public final void rule__BORoleInteraction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3167:1: ( rule__BORoleInteraction__Group_10__1__Impl )
            // InternalBomi.g:3168:2: rule__BORoleInteraction__Group_10__1__Impl
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
    // InternalBomi.g:3174:1: rule__BORoleInteraction__Group_10__1__Impl : ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) ) ;
    public final void rule__BORoleInteraction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3178:1: ( ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) ) )
            // InternalBomi.g:3179:1: ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) )
            {
            // InternalBomi.g:3179:1: ( ( rule__BORoleInteraction__CreatesAssignment_10_1 ) )
            // InternalBomi.g:3180:2: ( rule__BORoleInteraction__CreatesAssignment_10_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getCreatesAssignment_10_1()); 
            // InternalBomi.g:3181:2: ( rule__BORoleInteraction__CreatesAssignment_10_1 )
            // InternalBomi.g:3181:3: rule__BORoleInteraction__CreatesAssignment_10_1
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
    // InternalBomi.g:3190:1: rule__BORoleInteraction__Group_11__0 : rule__BORoleInteraction__Group_11__0__Impl rule__BORoleInteraction__Group_11__1 ;
    public final void rule__BORoleInteraction__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3194:1: ( rule__BORoleInteraction__Group_11__0__Impl rule__BORoleInteraction__Group_11__1 )
            // InternalBomi.g:3195:2: rule__BORoleInteraction__Group_11__0__Impl rule__BORoleInteraction__Group_11__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:3202:1: rule__BORoleInteraction__Group_11__0__Impl : ( 'reads' ) ;
    public final void rule__BORoleInteraction__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3206:1: ( ( 'reads' ) )
            // InternalBomi.g:3207:1: ( 'reads' )
            {
            // InternalBomi.g:3207:1: ( 'reads' )
            // InternalBomi.g:3208:2: 'reads'
            {
             before(grammarAccess.getBORoleInteractionAccess().getReadsKeyword_11_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBomi.g:3217:1: rule__BORoleInteraction__Group_11__1 : rule__BORoleInteraction__Group_11__1__Impl ;
    public final void rule__BORoleInteraction__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3221:1: ( rule__BORoleInteraction__Group_11__1__Impl )
            // InternalBomi.g:3222:2: rule__BORoleInteraction__Group_11__1__Impl
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
    // InternalBomi.g:3228:1: rule__BORoleInteraction__Group_11__1__Impl : ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) ) ;
    public final void rule__BORoleInteraction__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3232:1: ( ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) ) )
            // InternalBomi.g:3233:1: ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) )
            {
            // InternalBomi.g:3233:1: ( ( rule__BORoleInteraction__ReadsAssignment_11_1 ) )
            // InternalBomi.g:3234:2: ( rule__BORoleInteraction__ReadsAssignment_11_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getReadsAssignment_11_1()); 
            // InternalBomi.g:3235:2: ( rule__BORoleInteraction__ReadsAssignment_11_1 )
            // InternalBomi.g:3235:3: rule__BORoleInteraction__ReadsAssignment_11_1
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
    // InternalBomi.g:3244:1: rule__BORoleInteraction__Group_12__0 : rule__BORoleInteraction__Group_12__0__Impl rule__BORoleInteraction__Group_12__1 ;
    public final void rule__BORoleInteraction__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3248:1: ( rule__BORoleInteraction__Group_12__0__Impl rule__BORoleInteraction__Group_12__1 )
            // InternalBomi.g:3249:2: rule__BORoleInteraction__Group_12__0__Impl rule__BORoleInteraction__Group_12__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:3256:1: rule__BORoleInteraction__Group_12__0__Impl : ( 'updates' ) ;
    public final void rule__BORoleInteraction__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3260:1: ( ( 'updates' ) )
            // InternalBomi.g:3261:1: ( 'updates' )
            {
            // InternalBomi.g:3261:1: ( 'updates' )
            // InternalBomi.g:3262:2: 'updates'
            {
             before(grammarAccess.getBORoleInteractionAccess().getUpdatesKeyword_12_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBomi.g:3271:1: rule__BORoleInteraction__Group_12__1 : rule__BORoleInteraction__Group_12__1__Impl ;
    public final void rule__BORoleInteraction__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3275:1: ( rule__BORoleInteraction__Group_12__1__Impl )
            // InternalBomi.g:3276:2: rule__BORoleInteraction__Group_12__1__Impl
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
    // InternalBomi.g:3282:1: rule__BORoleInteraction__Group_12__1__Impl : ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) ) ;
    public final void rule__BORoleInteraction__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3286:1: ( ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) ) )
            // InternalBomi.g:3287:1: ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) )
            {
            // InternalBomi.g:3287:1: ( ( rule__BORoleInteraction__UpdatesAssignment_12_1 ) )
            // InternalBomi.g:3288:2: ( rule__BORoleInteraction__UpdatesAssignment_12_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getUpdatesAssignment_12_1()); 
            // InternalBomi.g:3289:2: ( rule__BORoleInteraction__UpdatesAssignment_12_1 )
            // InternalBomi.g:3289:3: rule__BORoleInteraction__UpdatesAssignment_12_1
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
    // InternalBomi.g:3298:1: rule__BORoleInteraction__Group_13__0 : rule__BORoleInteraction__Group_13__0__Impl rule__BORoleInteraction__Group_13__1 ;
    public final void rule__BORoleInteraction__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3302:1: ( rule__BORoleInteraction__Group_13__0__Impl rule__BORoleInteraction__Group_13__1 )
            // InternalBomi.g:3303:2: rule__BORoleInteraction__Group_13__0__Impl rule__BORoleInteraction__Group_13__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:3310:1: rule__BORoleInteraction__Group_13__0__Impl : ( 'deletes' ) ;
    public final void rule__BORoleInteraction__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3314:1: ( ( 'deletes' ) )
            // InternalBomi.g:3315:1: ( 'deletes' )
            {
            // InternalBomi.g:3315:1: ( 'deletes' )
            // InternalBomi.g:3316:2: 'deletes'
            {
             before(grammarAccess.getBORoleInteractionAccess().getDeletesKeyword_13_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBomi.g:3325:1: rule__BORoleInteraction__Group_13__1 : rule__BORoleInteraction__Group_13__1__Impl ;
    public final void rule__BORoleInteraction__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3329:1: ( rule__BORoleInteraction__Group_13__1__Impl )
            // InternalBomi.g:3330:2: rule__BORoleInteraction__Group_13__1__Impl
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
    // InternalBomi.g:3336:1: rule__BORoleInteraction__Group_13__1__Impl : ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) ) ;
    public final void rule__BORoleInteraction__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3340:1: ( ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) ) )
            // InternalBomi.g:3341:1: ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) )
            {
            // InternalBomi.g:3341:1: ( ( rule__BORoleInteraction__DeletesAssignment_13_1 ) )
            // InternalBomi.g:3342:2: ( rule__BORoleInteraction__DeletesAssignment_13_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getDeletesAssignment_13_1()); 
            // InternalBomi.g:3343:2: ( rule__BORoleInteraction__DeletesAssignment_13_1 )
            // InternalBomi.g:3343:3: rule__BORoleInteraction__DeletesAssignment_13_1
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
    // InternalBomi.g:3352:1: rule__BORoleInteraction__Group_14__0 : rule__BORoleInteraction__Group_14__0__Impl rule__BORoleInteraction__Group_14__1 ;
    public final void rule__BORoleInteraction__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3356:1: ( rule__BORoleInteraction__Group_14__0__Impl rule__BORoleInteraction__Group_14__1 )
            // InternalBomi.g:3357:2: rule__BORoleInteraction__Group_14__0__Impl rule__BORoleInteraction__Group_14__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:3364:1: rule__BORoleInteraction__Group_14__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BORoleInteraction__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3368:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:3369:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:3369:1: ( 'boundaryObjects' )
            // InternalBomi.g:3370:2: 'boundaryObjects'
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
    // InternalBomi.g:3379:1: rule__BORoleInteraction__Group_14__1 : rule__BORoleInteraction__Group_14__1__Impl rule__BORoleInteraction__Group_14__2 ;
    public final void rule__BORoleInteraction__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3383:1: ( rule__BORoleInteraction__Group_14__1__Impl rule__BORoleInteraction__Group_14__2 )
            // InternalBomi.g:3384:2: rule__BORoleInteraction__Group_14__1__Impl rule__BORoleInteraction__Group_14__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:3391:1: rule__BORoleInteraction__Group_14__1__Impl : ( '(' ) ;
    public final void rule__BORoleInteraction__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3395:1: ( ( '(' ) )
            // InternalBomi.g:3396:1: ( '(' )
            {
            // InternalBomi.g:3396:1: ( '(' )
            // InternalBomi.g:3397:2: '('
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:3406:1: rule__BORoleInteraction__Group_14__2 : rule__BORoleInteraction__Group_14__2__Impl rule__BORoleInteraction__Group_14__3 ;
    public final void rule__BORoleInteraction__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3410:1: ( rule__BORoleInteraction__Group_14__2__Impl rule__BORoleInteraction__Group_14__3 )
            // InternalBomi.g:3411:2: rule__BORoleInteraction__Group_14__2__Impl rule__BORoleInteraction__Group_14__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:3418:1: rule__BORoleInteraction__Group_14__2__Impl : ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) ) ;
    public final void rule__BORoleInteraction__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3422:1: ( ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) ) )
            // InternalBomi.g:3423:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) )
            {
            // InternalBomi.g:3423:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 ) )
            // InternalBomi.g:3424:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_14_2()); 
            // InternalBomi.g:3425:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 )
            // InternalBomi.g:3425:3: rule__BORoleInteraction__BoundaryObjectsAssignment_14_2
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
    // InternalBomi.g:3433:1: rule__BORoleInteraction__Group_14__3 : rule__BORoleInteraction__Group_14__3__Impl rule__BORoleInteraction__Group_14__4 ;
    public final void rule__BORoleInteraction__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3437:1: ( rule__BORoleInteraction__Group_14__3__Impl rule__BORoleInteraction__Group_14__4 )
            // InternalBomi.g:3438:2: rule__BORoleInteraction__Group_14__3__Impl rule__BORoleInteraction__Group_14__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:3445:1: rule__BORoleInteraction__Group_14__3__Impl : ( ( rule__BORoleInteraction__Group_14_3__0 )* ) ;
    public final void rule__BORoleInteraction__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3449:1: ( ( ( rule__BORoleInteraction__Group_14_3__0 )* ) )
            // InternalBomi.g:3450:1: ( ( rule__BORoleInteraction__Group_14_3__0 )* )
            {
            // InternalBomi.g:3450:1: ( ( rule__BORoleInteraction__Group_14_3__0 )* )
            // InternalBomi.g:3451:2: ( rule__BORoleInteraction__Group_14_3__0 )*
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_14_3()); 
            // InternalBomi.g:3452:2: ( rule__BORoleInteraction__Group_14_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBomi.g:3452:3: rule__BORoleInteraction__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BORoleInteraction__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalBomi.g:3460:1: rule__BORoleInteraction__Group_14__4 : rule__BORoleInteraction__Group_14__4__Impl ;
    public final void rule__BORoleInteraction__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3464:1: ( rule__BORoleInteraction__Group_14__4__Impl )
            // InternalBomi.g:3465:2: rule__BORoleInteraction__Group_14__4__Impl
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
    // InternalBomi.g:3471:1: rule__BORoleInteraction__Group_14__4__Impl : ( ')' ) ;
    public final void rule__BORoleInteraction__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3475:1: ( ( ')' ) )
            // InternalBomi.g:3476:1: ( ')' )
            {
            // InternalBomi.g:3476:1: ( ')' )
            // InternalBomi.g:3477:2: ')'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_14_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:3487:1: rule__BORoleInteraction__Group_14_3__0 : rule__BORoleInteraction__Group_14_3__0__Impl rule__BORoleInteraction__Group_14_3__1 ;
    public final void rule__BORoleInteraction__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3491:1: ( rule__BORoleInteraction__Group_14_3__0__Impl rule__BORoleInteraction__Group_14_3__1 )
            // InternalBomi.g:3492:2: rule__BORoleInteraction__Group_14_3__0__Impl rule__BORoleInteraction__Group_14_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:3499:1: rule__BORoleInteraction__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__BORoleInteraction__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3503:1: ( ( ',' ) )
            // InternalBomi.g:3504:1: ( ',' )
            {
            // InternalBomi.g:3504:1: ( ',' )
            // InternalBomi.g:3505:2: ','
            {
             before(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_14_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:3514:1: rule__BORoleInteraction__Group_14_3__1 : rule__BORoleInteraction__Group_14_3__1__Impl ;
    public final void rule__BORoleInteraction__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3518:1: ( rule__BORoleInteraction__Group_14_3__1__Impl )
            // InternalBomi.g:3519:2: rule__BORoleInteraction__Group_14_3__1__Impl
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
    // InternalBomi.g:3525:1: rule__BORoleInteraction__Group_14_3__1__Impl : ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) ) ;
    public final void rule__BORoleInteraction__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3529:1: ( ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) ) )
            // InternalBomi.g:3530:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) )
            {
            // InternalBomi.g:3530:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 ) )
            // InternalBomi.g:3531:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_14_3_1()); 
            // InternalBomi.g:3532:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 )
            // InternalBomi.g:3532:3: rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1
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
    // InternalBomi.g:3541:1: rule__BORoleInteraction__Group_15__0 : rule__BORoleInteraction__Group_15__0__Impl rule__BORoleInteraction__Group_15__1 ;
    public final void rule__BORoleInteraction__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3545:1: ( rule__BORoleInteraction__Group_15__0__Impl rule__BORoleInteraction__Group_15__1 )
            // InternalBomi.g:3546:2: rule__BORoleInteraction__Group_15__0__Impl rule__BORoleInteraction__Group_15__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:3553:1: rule__BORoleInteraction__Group_15__0__Impl : ( 'roles' ) ;
    public final void rule__BORoleInteraction__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3557:1: ( ( 'roles' ) )
            // InternalBomi.g:3558:1: ( 'roles' )
            {
            // InternalBomi.g:3558:1: ( 'roles' )
            // InternalBomi.g:3559:2: 'roles'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesKeyword_15_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:3568:1: rule__BORoleInteraction__Group_15__1 : rule__BORoleInteraction__Group_15__1__Impl rule__BORoleInteraction__Group_15__2 ;
    public final void rule__BORoleInteraction__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3572:1: ( rule__BORoleInteraction__Group_15__1__Impl rule__BORoleInteraction__Group_15__2 )
            // InternalBomi.g:3573:2: rule__BORoleInteraction__Group_15__1__Impl rule__BORoleInteraction__Group_15__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:3580:1: rule__BORoleInteraction__Group_15__1__Impl : ( '(' ) ;
    public final void rule__BORoleInteraction__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3584:1: ( ( '(' ) )
            // InternalBomi.g:3585:1: ( '(' )
            {
            // InternalBomi.g:3585:1: ( '(' )
            // InternalBomi.g:3586:2: '('
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_15_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:3595:1: rule__BORoleInteraction__Group_15__2 : rule__BORoleInteraction__Group_15__2__Impl rule__BORoleInteraction__Group_15__3 ;
    public final void rule__BORoleInteraction__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3599:1: ( rule__BORoleInteraction__Group_15__2__Impl rule__BORoleInteraction__Group_15__3 )
            // InternalBomi.g:3600:2: rule__BORoleInteraction__Group_15__2__Impl rule__BORoleInteraction__Group_15__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:3607:1: rule__BORoleInteraction__Group_15__2__Impl : ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) ) ;
    public final void rule__BORoleInteraction__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3611:1: ( ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) ) )
            // InternalBomi.g:3612:1: ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) )
            {
            // InternalBomi.g:3612:1: ( ( rule__BORoleInteraction__RolesAssignment_15_2 ) )
            // InternalBomi.g:3613:2: ( rule__BORoleInteraction__RolesAssignment_15_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_15_2()); 
            // InternalBomi.g:3614:2: ( rule__BORoleInteraction__RolesAssignment_15_2 )
            // InternalBomi.g:3614:3: rule__BORoleInteraction__RolesAssignment_15_2
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
    // InternalBomi.g:3622:1: rule__BORoleInteraction__Group_15__3 : rule__BORoleInteraction__Group_15__3__Impl rule__BORoleInteraction__Group_15__4 ;
    public final void rule__BORoleInteraction__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3626:1: ( rule__BORoleInteraction__Group_15__3__Impl rule__BORoleInteraction__Group_15__4 )
            // InternalBomi.g:3627:2: rule__BORoleInteraction__Group_15__3__Impl rule__BORoleInteraction__Group_15__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:3634:1: rule__BORoleInteraction__Group_15__3__Impl : ( ( rule__BORoleInteraction__Group_15_3__0 )* ) ;
    public final void rule__BORoleInteraction__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3638:1: ( ( ( rule__BORoleInteraction__Group_15_3__0 )* ) )
            // InternalBomi.g:3639:1: ( ( rule__BORoleInteraction__Group_15_3__0 )* )
            {
            // InternalBomi.g:3639:1: ( ( rule__BORoleInteraction__Group_15_3__0 )* )
            // InternalBomi.g:3640:2: ( rule__BORoleInteraction__Group_15_3__0 )*
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_15_3()); 
            // InternalBomi.g:3641:2: ( rule__BORoleInteraction__Group_15_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBomi.g:3641:3: rule__BORoleInteraction__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BORoleInteraction__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalBomi.g:3649:1: rule__BORoleInteraction__Group_15__4 : rule__BORoleInteraction__Group_15__4__Impl ;
    public final void rule__BORoleInteraction__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3653:1: ( rule__BORoleInteraction__Group_15__4__Impl )
            // InternalBomi.g:3654:2: rule__BORoleInteraction__Group_15__4__Impl
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
    // InternalBomi.g:3660:1: rule__BORoleInteraction__Group_15__4__Impl : ( ')' ) ;
    public final void rule__BORoleInteraction__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3664:1: ( ( ')' ) )
            // InternalBomi.g:3665:1: ( ')' )
            {
            // InternalBomi.g:3665:1: ( ')' )
            // InternalBomi.g:3666:2: ')'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_15_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:3676:1: rule__BORoleInteraction__Group_15_3__0 : rule__BORoleInteraction__Group_15_3__0__Impl rule__BORoleInteraction__Group_15_3__1 ;
    public final void rule__BORoleInteraction__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3680:1: ( rule__BORoleInteraction__Group_15_3__0__Impl rule__BORoleInteraction__Group_15_3__1 )
            // InternalBomi.g:3681:2: rule__BORoleInteraction__Group_15_3__0__Impl rule__BORoleInteraction__Group_15_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:3688:1: rule__BORoleInteraction__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__BORoleInteraction__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3692:1: ( ( ',' ) )
            // InternalBomi.g:3693:1: ( ',' )
            {
            // InternalBomi.g:3693:1: ( ',' )
            // InternalBomi.g:3694:2: ','
            {
             before(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_15_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:3703:1: rule__BORoleInteraction__Group_15_3__1 : rule__BORoleInteraction__Group_15_3__1__Impl ;
    public final void rule__BORoleInteraction__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3707:1: ( rule__BORoleInteraction__Group_15_3__1__Impl )
            // InternalBomi.g:3708:2: rule__BORoleInteraction__Group_15_3__1__Impl
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
    // InternalBomi.g:3714:1: rule__BORoleInteraction__Group_15_3__1__Impl : ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) ) ;
    public final void rule__BORoleInteraction__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3718:1: ( ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) ) )
            // InternalBomi.g:3719:1: ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) )
            {
            // InternalBomi.g:3719:1: ( ( rule__BORoleInteraction__RolesAssignment_15_3_1 ) )
            // InternalBomi.g:3720:2: ( rule__BORoleInteraction__RolesAssignment_15_3_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_15_3_1()); 
            // InternalBomi.g:3721:2: ( rule__BORoleInteraction__RolesAssignment_15_3_1 )
            // InternalBomi.g:3721:3: rule__BORoleInteraction__RolesAssignment_15_3_1
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


    // $ANTLR start "rule__BoundaryObject__Group__0"
    // InternalBomi.g:3730:1: rule__BoundaryObject__Group__0 : rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1 ;
    public final void rule__BoundaryObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3734:1: ( rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1 )
            // InternalBomi.g:3735:2: rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBomi.g:3742:1: rule__BoundaryObject__Group__0__Impl : ( () ) ;
    public final void rule__BoundaryObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3746:1: ( ( () ) )
            // InternalBomi.g:3747:1: ( () )
            {
            // InternalBomi.g:3747:1: ( () )
            // InternalBomi.g:3748:2: ()
            {
             before(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectAction_0()); 
            // InternalBomi.g:3749:2: ()
            // InternalBomi.g:3749:3: 
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
    // InternalBomi.g:3757:1: rule__BoundaryObject__Group__1 : rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2 ;
    public final void rule__BoundaryObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3761:1: ( rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2 )
            // InternalBomi.g:3762:2: rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:3769:1: rule__BoundaryObject__Group__1__Impl : ( 'BoundaryObject' ) ;
    public final void rule__BoundaryObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3773:1: ( ( 'BoundaryObject' ) )
            // InternalBomi.g:3774:1: ( 'BoundaryObject' )
            {
            // InternalBomi.g:3774:1: ( 'BoundaryObject' )
            // InternalBomi.g:3775:2: 'BoundaryObject'
            {
             before(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBomi.g:3784:1: rule__BoundaryObject__Group__2 : rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3 ;
    public final void rule__BoundaryObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3788:1: ( rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3 )
            // InternalBomi.g:3789:2: rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3
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
    // InternalBomi.g:3796:1: rule__BoundaryObject__Group__2__Impl : ( ( rule__BoundaryObject__NameAssignment_2 ) ) ;
    public final void rule__BoundaryObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3800:1: ( ( ( rule__BoundaryObject__NameAssignment_2 ) ) )
            // InternalBomi.g:3801:1: ( ( rule__BoundaryObject__NameAssignment_2 ) )
            {
            // InternalBomi.g:3801:1: ( ( rule__BoundaryObject__NameAssignment_2 ) )
            // InternalBomi.g:3802:2: ( rule__BoundaryObject__NameAssignment_2 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getNameAssignment_2()); 
            // InternalBomi.g:3803:2: ( rule__BoundaryObject__NameAssignment_2 )
            // InternalBomi.g:3803:3: rule__BoundaryObject__NameAssignment_2
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
    // InternalBomi.g:3811:1: rule__BoundaryObject__Group__3 : rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4 ;
    public final void rule__BoundaryObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3815:1: ( rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4 )
            // InternalBomi.g:3816:2: rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:3823:1: rule__BoundaryObject__Group__3__Impl : ( '{' ) ;
    public final void rule__BoundaryObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3827:1: ( ( '{' ) )
            // InternalBomi.g:3828:1: ( '{' )
            {
            // InternalBomi.g:3828:1: ( '{' )
            // InternalBomi.g:3829:2: '{'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:3838:1: rule__BoundaryObject__Group__4 : rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5 ;
    public final void rule__BoundaryObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3842:1: ( rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5 )
            // InternalBomi.g:3843:2: rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:3850:1: rule__BoundaryObject__Group__4__Impl : ( ( rule__BoundaryObject__Group_4__0 )? ) ;
    public final void rule__BoundaryObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3854:1: ( ( ( rule__BoundaryObject__Group_4__0 )? ) )
            // InternalBomi.g:3855:1: ( ( rule__BoundaryObject__Group_4__0 )? )
            {
            // InternalBomi.g:3855:1: ( ( rule__BoundaryObject__Group_4__0 )? )
            // InternalBomi.g:3856:2: ( rule__BoundaryObject__Group_4__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_4()); 
            // InternalBomi.g:3857:2: ( rule__BoundaryObject__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBomi.g:3857:3: rule__BoundaryObject__Group_4__0
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
    // InternalBomi.g:3865:1: rule__BoundaryObject__Group__5 : rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6 ;
    public final void rule__BoundaryObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3869:1: ( rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6 )
            // InternalBomi.g:3870:2: rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:3877:1: rule__BoundaryObject__Group__5__Impl : ( ( rule__BoundaryObject__Group_5__0 )? ) ;
    public final void rule__BoundaryObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3881:1: ( ( ( rule__BoundaryObject__Group_5__0 )? ) )
            // InternalBomi.g:3882:1: ( ( rule__BoundaryObject__Group_5__0 )? )
            {
            // InternalBomi.g:3882:1: ( ( rule__BoundaryObject__Group_5__0 )? )
            // InternalBomi.g:3883:2: ( rule__BoundaryObject__Group_5__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_5()); 
            // InternalBomi.g:3884:2: ( rule__BoundaryObject__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBomi.g:3884:3: rule__BoundaryObject__Group_5__0
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
    // InternalBomi.g:3892:1: rule__BoundaryObject__Group__6 : rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7 ;
    public final void rule__BoundaryObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3896:1: ( rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7 )
            // InternalBomi.g:3897:2: rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:3904:1: rule__BoundaryObject__Group__6__Impl : ( ( rule__BoundaryObject__Group_6__0 )? ) ;
    public final void rule__BoundaryObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3908:1: ( ( ( rule__BoundaryObject__Group_6__0 )? ) )
            // InternalBomi.g:3909:1: ( ( rule__BoundaryObject__Group_6__0 )? )
            {
            // InternalBomi.g:3909:1: ( ( rule__BoundaryObject__Group_6__0 )? )
            // InternalBomi.g:3910:2: ( rule__BoundaryObject__Group_6__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_6()); 
            // InternalBomi.g:3911:2: ( rule__BoundaryObject__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBomi.g:3911:3: rule__BoundaryObject__Group_6__0
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
    // InternalBomi.g:3919:1: rule__BoundaryObject__Group__7 : rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8 ;
    public final void rule__BoundaryObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3923:1: ( rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8 )
            // InternalBomi.g:3924:2: rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:3931:1: rule__BoundaryObject__Group__7__Impl : ( ( rule__BoundaryObject__Group_7__0 )? ) ;
    public final void rule__BoundaryObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3935:1: ( ( ( rule__BoundaryObject__Group_7__0 )? ) )
            // InternalBomi.g:3936:1: ( ( rule__BoundaryObject__Group_7__0 )? )
            {
            // InternalBomi.g:3936:1: ( ( rule__BoundaryObject__Group_7__0 )? )
            // InternalBomi.g:3937:2: ( rule__BoundaryObject__Group_7__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_7()); 
            // InternalBomi.g:3938:2: ( rule__BoundaryObject__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBomi.g:3938:3: rule__BoundaryObject__Group_7__0
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
    // InternalBomi.g:3946:1: rule__BoundaryObject__Group__8 : rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9 ;
    public final void rule__BoundaryObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3950:1: ( rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9 )
            // InternalBomi.g:3951:2: rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:3958:1: rule__BoundaryObject__Group__8__Impl : ( ( rule__BoundaryObject__Group_8__0 )? ) ;
    public final void rule__BoundaryObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3962:1: ( ( ( rule__BoundaryObject__Group_8__0 )? ) )
            // InternalBomi.g:3963:1: ( ( rule__BoundaryObject__Group_8__0 )? )
            {
            // InternalBomi.g:3963:1: ( ( rule__BoundaryObject__Group_8__0 )? )
            // InternalBomi.g:3964:2: ( rule__BoundaryObject__Group_8__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_8()); 
            // InternalBomi.g:3965:2: ( rule__BoundaryObject__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==59) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBomi.g:3965:3: rule__BoundaryObject__Group_8__0
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
    // InternalBomi.g:3973:1: rule__BoundaryObject__Group__9 : rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10 ;
    public final void rule__BoundaryObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3977:1: ( rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10 )
            // InternalBomi.g:3978:2: rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:3985:1: rule__BoundaryObject__Group__9__Impl : ( ( rule__BoundaryObject__Group_9__0 )? ) ;
    public final void rule__BoundaryObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3989:1: ( ( ( rule__BoundaryObject__Group_9__0 )? ) )
            // InternalBomi.g:3990:1: ( ( rule__BoundaryObject__Group_9__0 )? )
            {
            // InternalBomi.g:3990:1: ( ( rule__BoundaryObject__Group_9__0 )? )
            // InternalBomi.g:3991:2: ( rule__BoundaryObject__Group_9__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_9()); 
            // InternalBomi.g:3992:2: ( rule__BoundaryObject__Group_9__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBomi.g:3992:3: rule__BoundaryObject__Group_9__0
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
    // InternalBomi.g:4000:1: rule__BoundaryObject__Group__10 : rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11 ;
    public final void rule__BoundaryObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4004:1: ( rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11 )
            // InternalBomi.g:4005:2: rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4012:1: rule__BoundaryObject__Group__10__Impl : ( ( rule__BoundaryObject__Group_10__0 )? ) ;
    public final void rule__BoundaryObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4016:1: ( ( ( rule__BoundaryObject__Group_10__0 )? ) )
            // InternalBomi.g:4017:1: ( ( rule__BoundaryObject__Group_10__0 )? )
            {
            // InternalBomi.g:4017:1: ( ( rule__BoundaryObject__Group_10__0 )? )
            // InternalBomi.g:4018:2: ( rule__BoundaryObject__Group_10__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_10()); 
            // InternalBomi.g:4019:2: ( rule__BoundaryObject__Group_10__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==61) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBomi.g:4019:3: rule__BoundaryObject__Group_10__0
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
    // InternalBomi.g:4027:1: rule__BoundaryObject__Group__11 : rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12 ;
    public final void rule__BoundaryObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4031:1: ( rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12 )
            // InternalBomi.g:4032:2: rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4039:1: rule__BoundaryObject__Group__11__Impl : ( ( rule__BoundaryObject__Group_11__0 )? ) ;
    public final void rule__BoundaryObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4043:1: ( ( ( rule__BoundaryObject__Group_11__0 )? ) )
            // InternalBomi.g:4044:1: ( ( rule__BoundaryObject__Group_11__0 )? )
            {
            // InternalBomi.g:4044:1: ( ( rule__BoundaryObject__Group_11__0 )? )
            // InternalBomi.g:4045:2: ( rule__BoundaryObject__Group_11__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_11()); 
            // InternalBomi.g:4046:2: ( rule__BoundaryObject__Group_11__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBomi.g:4046:3: rule__BoundaryObject__Group_11__0
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
    // InternalBomi.g:4054:1: rule__BoundaryObject__Group__12 : rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13 ;
    public final void rule__BoundaryObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4058:1: ( rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13 )
            // InternalBomi.g:4059:2: rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4066:1: rule__BoundaryObject__Group__12__Impl : ( ( rule__BoundaryObject__Group_12__0 )? ) ;
    public final void rule__BoundaryObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4070:1: ( ( ( rule__BoundaryObject__Group_12__0 )? ) )
            // InternalBomi.g:4071:1: ( ( rule__BoundaryObject__Group_12__0 )? )
            {
            // InternalBomi.g:4071:1: ( ( rule__BoundaryObject__Group_12__0 )? )
            // InternalBomi.g:4072:2: ( rule__BoundaryObject__Group_12__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_12()); 
            // InternalBomi.g:4073:2: ( rule__BoundaryObject__Group_12__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==63) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBomi.g:4073:3: rule__BoundaryObject__Group_12__0
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
    // InternalBomi.g:4081:1: rule__BoundaryObject__Group__13 : rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14 ;
    public final void rule__BoundaryObject__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4085:1: ( rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14 )
            // InternalBomi.g:4086:2: rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4093:1: rule__BoundaryObject__Group__13__Impl : ( ( rule__BoundaryObject__Group_13__0 )? ) ;
    public final void rule__BoundaryObject__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4097:1: ( ( ( rule__BoundaryObject__Group_13__0 )? ) )
            // InternalBomi.g:4098:1: ( ( rule__BoundaryObject__Group_13__0 )? )
            {
            // InternalBomi.g:4098:1: ( ( rule__BoundaryObject__Group_13__0 )? )
            // InternalBomi.g:4099:2: ( rule__BoundaryObject__Group_13__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_13()); 
            // InternalBomi.g:4100:2: ( rule__BoundaryObject__Group_13__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==64) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBomi.g:4100:3: rule__BoundaryObject__Group_13__0
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
    // InternalBomi.g:4108:1: rule__BoundaryObject__Group__14 : rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15 ;
    public final void rule__BoundaryObject__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4112:1: ( rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15 )
            // InternalBomi.g:4113:2: rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4120:1: rule__BoundaryObject__Group__14__Impl : ( ( rule__BoundaryObject__Group_14__0 )? ) ;
    public final void rule__BoundaryObject__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4124:1: ( ( ( rule__BoundaryObject__Group_14__0 )? ) )
            // InternalBomi.g:4125:1: ( ( rule__BoundaryObject__Group_14__0 )? )
            {
            // InternalBomi.g:4125:1: ( ( rule__BoundaryObject__Group_14__0 )? )
            // InternalBomi.g:4126:2: ( rule__BoundaryObject__Group_14__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_14()); 
            // InternalBomi.g:4127:2: ( rule__BoundaryObject__Group_14__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==65) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBomi.g:4127:3: rule__BoundaryObject__Group_14__0
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
    // InternalBomi.g:4135:1: rule__BoundaryObject__Group__15 : rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16 ;
    public final void rule__BoundaryObject__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4139:1: ( rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16 )
            // InternalBomi.g:4140:2: rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4147:1: rule__BoundaryObject__Group__15__Impl : ( ( rule__BoundaryObject__Group_15__0 )? ) ;
    public final void rule__BoundaryObject__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4151:1: ( ( ( rule__BoundaryObject__Group_15__0 )? ) )
            // InternalBomi.g:4152:1: ( ( rule__BoundaryObject__Group_15__0 )? )
            {
            // InternalBomi.g:4152:1: ( ( rule__BoundaryObject__Group_15__0 )? )
            // InternalBomi.g:4153:2: ( rule__BoundaryObject__Group_15__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_15()); 
            // InternalBomi.g:4154:2: ( rule__BoundaryObject__Group_15__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==66) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBomi.g:4154:3: rule__BoundaryObject__Group_15__0
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
    // InternalBomi.g:4162:1: rule__BoundaryObject__Group__16 : rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17 ;
    public final void rule__BoundaryObject__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4166:1: ( rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17 )
            // InternalBomi.g:4167:2: rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4174:1: rule__BoundaryObject__Group__16__Impl : ( ( rule__BoundaryObject__Group_16__0 )? ) ;
    public final void rule__BoundaryObject__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4178:1: ( ( ( rule__BoundaryObject__Group_16__0 )? ) )
            // InternalBomi.g:4179:1: ( ( rule__BoundaryObject__Group_16__0 )? )
            {
            // InternalBomi.g:4179:1: ( ( rule__BoundaryObject__Group_16__0 )? )
            // InternalBomi.g:4180:2: ( rule__BoundaryObject__Group_16__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_16()); 
            // InternalBomi.g:4181:2: ( rule__BoundaryObject__Group_16__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==67) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBomi.g:4181:3: rule__BoundaryObject__Group_16__0
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
    // InternalBomi.g:4189:1: rule__BoundaryObject__Group__17 : rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18 ;
    public final void rule__BoundaryObject__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4193:1: ( rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18 )
            // InternalBomi.g:4194:2: rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18
            {
            pushFollow(FOLLOW_21);
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
    // InternalBomi.g:4201:1: rule__BoundaryObject__Group__17__Impl : ( ( rule__BoundaryObject__Group_17__0 )? ) ;
    public final void rule__BoundaryObject__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4205:1: ( ( ( rule__BoundaryObject__Group_17__0 )? ) )
            // InternalBomi.g:4206:1: ( ( rule__BoundaryObject__Group_17__0 )? )
            {
            // InternalBomi.g:4206:1: ( ( rule__BoundaryObject__Group_17__0 )? )
            // InternalBomi.g:4207:2: ( rule__BoundaryObject__Group_17__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_17()); 
            // InternalBomi.g:4208:2: ( rule__BoundaryObject__Group_17__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==68) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBomi.g:4208:3: rule__BoundaryObject__Group_17__0
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
    // InternalBomi.g:4216:1: rule__BoundaryObject__Group__18 : rule__BoundaryObject__Group__18__Impl ;
    public final void rule__BoundaryObject__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4220:1: ( rule__BoundaryObject__Group__18__Impl )
            // InternalBomi.g:4221:2: rule__BoundaryObject__Group__18__Impl
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
    // InternalBomi.g:4227:1: rule__BoundaryObject__Group__18__Impl : ( '}' ) ;
    public final void rule__BoundaryObject__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4231:1: ( ( '}' ) )
            // InternalBomi.g:4232:1: ( '}' )
            {
            // InternalBomi.g:4232:1: ( '}' )
            // InternalBomi.g:4233:2: '}'
            {
             before(grammarAccess.getBoundaryObjectAccess().getRightCurlyBracketKeyword_18()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:4243:1: rule__BoundaryObject__Group_4__0 : rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1 ;
    public final void rule__BoundaryObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4247:1: ( rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1 )
            // InternalBomi.g:4248:2: rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:4255:1: rule__BoundaryObject__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BoundaryObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4259:1: ( ( 'purpose' ) )
            // InternalBomi.g:4260:1: ( 'purpose' )
            {
            // InternalBomi.g:4260:1: ( 'purpose' )
            // InternalBomi.g:4261:2: 'purpose'
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getPurposeKeyword_4_0()); 

            }


            }

        }
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
    // InternalBomi.g:4270:1: rule__BoundaryObject__Group_4__1 : rule__BoundaryObject__Group_4__1__Impl ;
    public final void rule__BoundaryObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4274:1: ( rule__BoundaryObject__Group_4__1__Impl )
            // InternalBomi.g:4275:2: rule__BoundaryObject__Group_4__1__Impl
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
    // InternalBomi.g:4281:1: rule__BoundaryObject__Group_4__1__Impl : ( ( rule__BoundaryObject__PurposeAssignment_4_1 ) ) ;
    public final void rule__BoundaryObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4285:1: ( ( ( rule__BoundaryObject__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:4286:1: ( ( rule__BoundaryObject__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:4286:1: ( ( rule__BoundaryObject__PurposeAssignment_4_1 ) )
            // InternalBomi.g:4287:2: ( rule__BoundaryObject__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:4288:2: ( rule__BoundaryObject__PurposeAssignment_4_1 )
            // InternalBomi.g:4288:3: rule__BoundaryObject__PurposeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__PurposeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getPurposeAssignment_4_1()); 

            }


            }

        }
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
    // InternalBomi.g:4297:1: rule__BoundaryObject__Group_5__0 : rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1 ;
    public final void rule__BoundaryObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4301:1: ( rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1 )
            // InternalBomi.g:4302:2: rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBomi.g:4309:1: rule__BoundaryObject__Group_5__0__Impl : ( 'superType' ) ;
    public final void rule__BoundaryObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4313:1: ( ( 'superType' ) )
            // InternalBomi.g:4314:1: ( 'superType' )
            {
            // InternalBomi.g:4314:1: ( 'superType' )
            // InternalBomi.g:4315:2: 'superType'
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBoundaryObjectAccess().getSuperTypeKeyword_5_0()); 

            }


            }

        }
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
    // InternalBomi.g:4324:1: rule__BoundaryObject__Group_5__1 : rule__BoundaryObject__Group_5__1__Impl ;
    public final void rule__BoundaryObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4328:1: ( rule__BoundaryObject__Group_5__1__Impl )
            // InternalBomi.g:4329:2: rule__BoundaryObject__Group_5__1__Impl
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
    // InternalBomi.g:4335:1: rule__BoundaryObject__Group_5__1__Impl : ( ( rule__BoundaryObject__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__BoundaryObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4339:1: ( ( ( rule__BoundaryObject__SuperTypeAssignment_5_1 ) ) )
            // InternalBomi.g:4340:1: ( ( rule__BoundaryObject__SuperTypeAssignment_5_1 ) )
            {
            // InternalBomi.g:4340:1: ( ( rule__BoundaryObject__SuperTypeAssignment_5_1 ) )
            // InternalBomi.g:4341:2: ( rule__BoundaryObject__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeAssignment_5_1()); 
            // InternalBomi.g:4342:2: ( rule__BoundaryObject__SuperTypeAssignment_5_1 )
            // InternalBomi.g:4342:3: rule__BoundaryObject__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundaryObject__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundaryObjectAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
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
    // InternalBomi.g:4351:1: rule__BoundaryObject__Group_6__0 : rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1 ;
    public final void rule__BoundaryObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4355:1: ( rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1 )
            // InternalBomi.g:4356:2: rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:4363:1: rule__BoundaryObject__Group_6__0__Impl : ( 'levelOfDetail' ) ;
    public final void rule__BoundaryObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4367:1: ( ( 'levelOfDetail' ) )
            // InternalBomi.g:4368:1: ( 'levelOfDetail' )
            {
            // InternalBomi.g:4368:1: ( 'levelOfDetail' )
            // InternalBomi.g:4369:2: 'levelOfDetail'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBomi.g:4378:1: rule__BoundaryObject__Group_6__1 : rule__BoundaryObject__Group_6__1__Impl ;
    public final void rule__BoundaryObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4382:1: ( rule__BoundaryObject__Group_6__1__Impl )
            // InternalBomi.g:4383:2: rule__BoundaryObject__Group_6__1__Impl
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
    // InternalBomi.g:4389:1: rule__BoundaryObject__Group_6__1__Impl : ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) ) ;
    public final void rule__BoundaryObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4393:1: ( ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) ) )
            // InternalBomi.g:4394:1: ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) )
            {
            // InternalBomi.g:4394:1: ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) )
            // InternalBomi.g:4395:2: ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailAssignment_6_1()); 
            // InternalBomi.g:4396:2: ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 )
            // InternalBomi.g:4396:3: rule__BoundaryObject__LevelOfDetailAssignment_6_1
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
    // InternalBomi.g:4405:1: rule__BoundaryObject__Group_7__0 : rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1 ;
    public final void rule__BoundaryObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4409:1: ( rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1 )
            // InternalBomi.g:4410:2: rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:4417:1: rule__BoundaryObject__Group_7__0__Impl : ( 'frequencyOfChange' ) ;
    public final void rule__BoundaryObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4421:1: ( ( 'frequencyOfChange' ) )
            // InternalBomi.g:4422:1: ( 'frequencyOfChange' )
            {
            // InternalBomi.g:4422:1: ( 'frequencyOfChange' )
            // InternalBomi.g:4423:2: 'frequencyOfChange'
            {
             before(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeKeyword_7_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalBomi.g:4432:1: rule__BoundaryObject__Group_7__1 : rule__BoundaryObject__Group_7__1__Impl ;
    public final void rule__BoundaryObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4436:1: ( rule__BoundaryObject__Group_7__1__Impl )
            // InternalBomi.g:4437:2: rule__BoundaryObject__Group_7__1__Impl
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
    // InternalBomi.g:4443:1: rule__BoundaryObject__Group_7__1__Impl : ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) ) ;
    public final void rule__BoundaryObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4447:1: ( ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) ) )
            // InternalBomi.g:4448:1: ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) )
            {
            // InternalBomi.g:4448:1: ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) )
            // InternalBomi.g:4449:2: ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeAssignment_7_1()); 
            // InternalBomi.g:4450:2: ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 )
            // InternalBomi.g:4450:3: rule__BoundaryObject__FrequencyOfChangeAssignment_7_1
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
    // InternalBomi.g:4459:1: rule__BoundaryObject__Group_8__0 : rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1 ;
    public final void rule__BoundaryObject__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4463:1: ( rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1 )
            // InternalBomi.g:4464:2: rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:4471:1: rule__BoundaryObject__Group_8__0__Impl : ( 'modularity' ) ;
    public final void rule__BoundaryObject__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4475:1: ( ( 'modularity' ) )
            // InternalBomi.g:4476:1: ( 'modularity' )
            {
            // InternalBomi.g:4476:1: ( 'modularity' )
            // InternalBomi.g:4477:2: 'modularity'
            {
             before(grammarAccess.getBoundaryObjectAccess().getModularityKeyword_8_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalBomi.g:4486:1: rule__BoundaryObject__Group_8__1 : rule__BoundaryObject__Group_8__1__Impl ;
    public final void rule__BoundaryObject__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4490:1: ( rule__BoundaryObject__Group_8__1__Impl )
            // InternalBomi.g:4491:2: rule__BoundaryObject__Group_8__1__Impl
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
    // InternalBomi.g:4497:1: rule__BoundaryObject__Group_8__1__Impl : ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) ) ;
    public final void rule__BoundaryObject__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4501:1: ( ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) ) )
            // InternalBomi.g:4502:1: ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) )
            {
            // InternalBomi.g:4502:1: ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) )
            // InternalBomi.g:4503:2: ( rule__BoundaryObject__ModularityAssignment_8_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getModularityAssignment_8_1()); 
            // InternalBomi.g:4504:2: ( rule__BoundaryObject__ModularityAssignment_8_1 )
            // InternalBomi.g:4504:3: rule__BoundaryObject__ModularityAssignment_8_1
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
    // InternalBomi.g:4513:1: rule__BoundaryObject__Group_9__0 : rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1 ;
    public final void rule__BoundaryObject__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4517:1: ( rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1 )
            // InternalBomi.g:4518:2: rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:4525:1: rule__BoundaryObject__Group_9__0__Impl : ( 'maintainability' ) ;
    public final void rule__BoundaryObject__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4529:1: ( ( 'maintainability' ) )
            // InternalBomi.g:4530:1: ( 'maintainability' )
            {
            // InternalBomi.g:4530:1: ( 'maintainability' )
            // InternalBomi.g:4531:2: 'maintainability'
            {
             before(grammarAccess.getBoundaryObjectAccess().getMaintainabilityKeyword_9_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalBomi.g:4540:1: rule__BoundaryObject__Group_9__1 : rule__BoundaryObject__Group_9__1__Impl ;
    public final void rule__BoundaryObject__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4544:1: ( rule__BoundaryObject__Group_9__1__Impl )
            // InternalBomi.g:4545:2: rule__BoundaryObject__Group_9__1__Impl
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
    // InternalBomi.g:4551:1: rule__BoundaryObject__Group_9__1__Impl : ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) ) ;
    public final void rule__BoundaryObject__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4555:1: ( ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) ) )
            // InternalBomi.g:4556:1: ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) )
            {
            // InternalBomi.g:4556:1: ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) )
            // InternalBomi.g:4557:2: ( rule__BoundaryObject__MaintainabilityAssignment_9_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getMaintainabilityAssignment_9_1()); 
            // InternalBomi.g:4558:2: ( rule__BoundaryObject__MaintainabilityAssignment_9_1 )
            // InternalBomi.g:4558:3: rule__BoundaryObject__MaintainabilityAssignment_9_1
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
    // InternalBomi.g:4567:1: rule__BoundaryObject__Group_10__0 : rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1 ;
    public final void rule__BoundaryObject__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4571:1: ( rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1 )
            // InternalBomi.g:4572:2: rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:4579:1: rule__BoundaryObject__Group_10__0__Impl : ( 'prescriptive' ) ;
    public final void rule__BoundaryObject__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4583:1: ( ( 'prescriptive' ) )
            // InternalBomi.g:4584:1: ( 'prescriptive' )
            {
            // InternalBomi.g:4584:1: ( 'prescriptive' )
            // InternalBomi.g:4585:2: 'prescriptive'
            {
             before(grammarAccess.getBoundaryObjectAccess().getPrescriptiveKeyword_10_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:4594:1: rule__BoundaryObject__Group_10__1 : rule__BoundaryObject__Group_10__1__Impl ;
    public final void rule__BoundaryObject__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4598:1: ( rule__BoundaryObject__Group_10__1__Impl )
            // InternalBomi.g:4599:2: rule__BoundaryObject__Group_10__1__Impl
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
    // InternalBomi.g:4605:1: rule__BoundaryObject__Group_10__1__Impl : ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) ) ;
    public final void rule__BoundaryObject__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4609:1: ( ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) ) )
            // InternalBomi.g:4610:1: ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) )
            {
            // InternalBomi.g:4610:1: ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) )
            // InternalBomi.g:4611:2: ( rule__BoundaryObject__PrescriptiveAssignment_10_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getPrescriptiveAssignment_10_1()); 
            // InternalBomi.g:4612:2: ( rule__BoundaryObject__PrescriptiveAssignment_10_1 )
            // InternalBomi.g:4612:3: rule__BoundaryObject__PrescriptiveAssignment_10_1
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
    // InternalBomi.g:4621:1: rule__BoundaryObject__Group_11__0 : rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1 ;
    public final void rule__BoundaryObject__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4625:1: ( rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1 )
            // InternalBomi.g:4626:2: rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBomi.g:4633:1: rule__BoundaryObject__Group_11__0__Impl : ( 'lifecycleStage' ) ;
    public final void rule__BoundaryObject__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4637:1: ( ( 'lifecycleStage' ) )
            // InternalBomi.g:4638:1: ( 'lifecycleStage' )
            {
            // InternalBomi.g:4638:1: ( 'lifecycleStage' )
            // InternalBomi.g:4639:2: 'lifecycleStage'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLifecycleStageKeyword_11_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:4648:1: rule__BoundaryObject__Group_11__1 : rule__BoundaryObject__Group_11__1__Impl ;
    public final void rule__BoundaryObject__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4652:1: ( rule__BoundaryObject__Group_11__1__Impl )
            // InternalBomi.g:4653:2: rule__BoundaryObject__Group_11__1__Impl
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
    // InternalBomi.g:4659:1: rule__BoundaryObject__Group_11__1__Impl : ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) ) ;
    public final void rule__BoundaryObject__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4663:1: ( ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) ) )
            // InternalBomi.g:4664:1: ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) )
            {
            // InternalBomi.g:4664:1: ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) )
            // InternalBomi.g:4665:2: ( rule__BoundaryObject__LifecycleStageAssignment_11_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getLifecycleStageAssignment_11_1()); 
            // InternalBomi.g:4666:2: ( rule__BoundaryObject__LifecycleStageAssignment_11_1 )
            // InternalBomi.g:4666:3: rule__BoundaryObject__LifecycleStageAssignment_11_1
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
    // InternalBomi.g:4675:1: rule__BoundaryObject__Group_12__0 : rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1 ;
    public final void rule__BoundaryObject__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4679:1: ( rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1 )
            // InternalBomi.g:4680:2: rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:4687:1: rule__BoundaryObject__Group_12__0__Impl : ( 'representationFormat' ) ;
    public final void rule__BoundaryObject__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4691:1: ( ( 'representationFormat' ) )
            // InternalBomi.g:4692:1: ( 'representationFormat' )
            {
            // InternalBomi.g:4692:1: ( 'representationFormat' )
            // InternalBomi.g:4693:2: 'representationFormat'
            {
             before(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatKeyword_12_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalBomi.g:4702:1: rule__BoundaryObject__Group_12__1 : rule__BoundaryObject__Group_12__1__Impl ;
    public final void rule__BoundaryObject__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4706:1: ( rule__BoundaryObject__Group_12__1__Impl )
            // InternalBomi.g:4707:2: rule__BoundaryObject__Group_12__1__Impl
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
    // InternalBomi.g:4713:1: rule__BoundaryObject__Group_12__1__Impl : ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) ) ;
    public final void rule__BoundaryObject__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4717:1: ( ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) ) )
            // InternalBomi.g:4718:1: ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) )
            {
            // InternalBomi.g:4718:1: ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) )
            // InternalBomi.g:4719:2: ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatAssignment_12_1()); 
            // InternalBomi.g:4720:2: ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 )
            // InternalBomi.g:4720:3: rule__BoundaryObject__RepresentationFormatAssignment_12_1
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
    // InternalBomi.g:4729:1: rule__BoundaryObject__Group_13__0 : rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1 ;
    public final void rule__BoundaryObject__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4733:1: ( rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1 )
            // InternalBomi.g:4734:2: rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:4741:1: rule__BoundaryObject__Group_13__0__Impl : ( 'tooling' ) ;
    public final void rule__BoundaryObject__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4745:1: ( ( 'tooling' ) )
            // InternalBomi.g:4746:1: ( 'tooling' )
            {
            // InternalBomi.g:4746:1: ( 'tooling' )
            // InternalBomi.g:4747:2: 'tooling'
            {
             before(grammarAccess.getBoundaryObjectAccess().getToolingKeyword_13_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalBomi.g:4756:1: rule__BoundaryObject__Group_13__1 : rule__BoundaryObject__Group_13__1__Impl ;
    public final void rule__BoundaryObject__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4760:1: ( rule__BoundaryObject__Group_13__1__Impl )
            // InternalBomi.g:4761:2: rule__BoundaryObject__Group_13__1__Impl
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
    // InternalBomi.g:4767:1: rule__BoundaryObject__Group_13__1__Impl : ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) ) ;
    public final void rule__BoundaryObject__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4771:1: ( ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) ) )
            // InternalBomi.g:4772:1: ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) )
            {
            // InternalBomi.g:4772:1: ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) )
            // InternalBomi.g:4773:2: ( rule__BoundaryObject__ToolingAssignment_13_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getToolingAssignment_13_1()); 
            // InternalBomi.g:4774:2: ( rule__BoundaryObject__ToolingAssignment_13_1 )
            // InternalBomi.g:4774:3: rule__BoundaryObject__ToolingAssignment_13_1
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
    // InternalBomi.g:4783:1: rule__BoundaryObject__Group_14__0 : rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1 ;
    public final void rule__BoundaryObject__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4787:1: ( rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1 )
            // InternalBomi.g:4788:2: rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:4795:1: rule__BoundaryObject__Group_14__0__Impl : ( 'versioning' ) ;
    public final void rule__BoundaryObject__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4799:1: ( ( 'versioning' ) )
            // InternalBomi.g:4800:1: ( 'versioning' )
            {
            // InternalBomi.g:4800:1: ( 'versioning' )
            // InternalBomi.g:4801:2: 'versioning'
            {
             before(grammarAccess.getBoundaryObjectAccess().getVersioningKeyword_14_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalBomi.g:4810:1: rule__BoundaryObject__Group_14__1 : rule__BoundaryObject__Group_14__1__Impl ;
    public final void rule__BoundaryObject__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4814:1: ( rule__BoundaryObject__Group_14__1__Impl )
            // InternalBomi.g:4815:2: rule__BoundaryObject__Group_14__1__Impl
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
    // InternalBomi.g:4821:1: rule__BoundaryObject__Group_14__1__Impl : ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) ) ;
    public final void rule__BoundaryObject__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4825:1: ( ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) ) )
            // InternalBomi.g:4826:1: ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) )
            {
            // InternalBomi.g:4826:1: ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) )
            // InternalBomi.g:4827:2: ( rule__BoundaryObject__VersioningAssignment_14_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getVersioningAssignment_14_1()); 
            // InternalBomi.g:4828:2: ( rule__BoundaryObject__VersioningAssignment_14_1 )
            // InternalBomi.g:4828:3: rule__BoundaryObject__VersioningAssignment_14_1
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
    // InternalBomi.g:4837:1: rule__BoundaryObject__Group_15__0 : rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1 ;
    public final void rule__BoundaryObject__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4841:1: ( rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1 )
            // InternalBomi.g:4842:2: rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:4849:1: rule__BoundaryObject__Group_15__0__Impl : ( 'upToDate' ) ;
    public final void rule__BoundaryObject__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4853:1: ( ( 'upToDate' ) )
            // InternalBomi.g:4854:1: ( 'upToDate' )
            {
            // InternalBomi.g:4854:1: ( 'upToDate' )
            // InternalBomi.g:4855:2: 'upToDate'
            {
             before(grammarAccess.getBoundaryObjectAccess().getUpToDateKeyword_15_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalBomi.g:4864:1: rule__BoundaryObject__Group_15__1 : rule__BoundaryObject__Group_15__1__Impl ;
    public final void rule__BoundaryObject__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4868:1: ( rule__BoundaryObject__Group_15__1__Impl )
            // InternalBomi.g:4869:2: rule__BoundaryObject__Group_15__1__Impl
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
    // InternalBomi.g:4875:1: rule__BoundaryObject__Group_15__1__Impl : ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) ) ;
    public final void rule__BoundaryObject__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4879:1: ( ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) ) )
            // InternalBomi.g:4880:1: ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) )
            {
            // InternalBomi.g:4880:1: ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) )
            // InternalBomi.g:4881:2: ( rule__BoundaryObject__UpToDateAssignment_15_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getUpToDateAssignment_15_1()); 
            // InternalBomi.g:4882:2: ( rule__BoundaryObject__UpToDateAssignment_15_1 )
            // InternalBomi.g:4882:3: rule__BoundaryObject__UpToDateAssignment_15_1
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
    // InternalBomi.g:4891:1: rule__BoundaryObject__Group_16__0 : rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1 ;
    public final void rule__BoundaryObject__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4895:1: ( rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1 )
            // InternalBomi.g:4896:2: rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:4903:1: rule__BoundaryObject__Group_16__0__Impl : ( 'internalConsistency' ) ;
    public final void rule__BoundaryObject__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4907:1: ( ( 'internalConsistency' ) )
            // InternalBomi.g:4908:1: ( 'internalConsistency' )
            {
            // InternalBomi.g:4908:1: ( 'internalConsistency' )
            // InternalBomi.g:4909:2: 'internalConsistency'
            {
             before(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyKeyword_16_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalBomi.g:4918:1: rule__BoundaryObject__Group_16__1 : rule__BoundaryObject__Group_16__1__Impl ;
    public final void rule__BoundaryObject__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4922:1: ( rule__BoundaryObject__Group_16__1__Impl )
            // InternalBomi.g:4923:2: rule__BoundaryObject__Group_16__1__Impl
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
    // InternalBomi.g:4929:1: rule__BoundaryObject__Group_16__1__Impl : ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) ) ;
    public final void rule__BoundaryObject__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4933:1: ( ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) ) )
            // InternalBomi.g:4934:1: ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) )
            {
            // InternalBomi.g:4934:1: ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) )
            // InternalBomi.g:4935:2: ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyAssignment_16_1()); 
            // InternalBomi.g:4936:2: ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 )
            // InternalBomi.g:4936:3: rule__BoundaryObject__InternalConsistencyAssignment_16_1
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
    // InternalBomi.g:4945:1: rule__BoundaryObject__Group_17__0 : rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1 ;
    public final void rule__BoundaryObject__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4949:1: ( rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1 )
            // InternalBomi.g:4950:2: rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:4957:1: rule__BoundaryObject__Group_17__0__Impl : ( 'externalConsistency' ) ;
    public final void rule__BoundaryObject__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4961:1: ( ( 'externalConsistency' ) )
            // InternalBomi.g:4962:1: ( 'externalConsistency' )
            {
            // InternalBomi.g:4962:1: ( 'externalConsistency' )
            // InternalBomi.g:4963:2: 'externalConsistency'
            {
             before(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyKeyword_17_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalBomi.g:4972:1: rule__BoundaryObject__Group_17__1 : rule__BoundaryObject__Group_17__1__Impl ;
    public final void rule__BoundaryObject__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4976:1: ( rule__BoundaryObject__Group_17__1__Impl )
            // InternalBomi.g:4977:2: rule__BoundaryObject__Group_17__1__Impl
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
    // InternalBomi.g:4983:1: rule__BoundaryObject__Group_17__1__Impl : ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) ) ;
    public final void rule__BoundaryObject__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4987:1: ( ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) ) )
            // InternalBomi.g:4988:1: ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) )
            {
            // InternalBomi.g:4988:1: ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) )
            // InternalBomi.g:4989:2: ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyAssignment_17_1()); 
            // InternalBomi.g:4990:2: ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 )
            // InternalBomi.g:4990:3: rule__BoundaryObject__ExternalConsistencyAssignment_17_1
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


    // $ANTLR start "rule__Role__Group__0"
    // InternalBomi.g:4999:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5003:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalBomi.g:5004:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBomi.g:5011:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5015:1: ( ( () ) )
            // InternalBomi.g:5016:1: ( () )
            {
            // InternalBomi.g:5016:1: ( () )
            // InternalBomi.g:5017:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalBomi.g:5018:2: ()
            // InternalBomi.g:5018:3: 
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
    // InternalBomi.g:5026:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5030:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalBomi.g:5031:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:5038:1: rule__Role__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5042:1: ( ( 'Role' ) )
            // InternalBomi.g:5043:1: ( 'Role' )
            {
            // InternalBomi.g:5043:1: ( 'Role' )
            // InternalBomi.g:5044:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalBomi.g:5053:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5057:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalBomi.g:5058:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalBomi.g:5065:1: rule__Role__Group__2__Impl : ( ( rule__Role__NameAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5069:1: ( ( ( rule__Role__NameAssignment_2 ) ) )
            // InternalBomi.g:5070:1: ( ( rule__Role__NameAssignment_2 ) )
            {
            // InternalBomi.g:5070:1: ( ( rule__Role__NameAssignment_2 ) )
            // InternalBomi.g:5071:2: ( rule__Role__NameAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_2()); 
            // InternalBomi.g:5072:2: ( rule__Role__NameAssignment_2 )
            // InternalBomi.g:5072:3: rule__Role__NameAssignment_2
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
    // InternalBomi.g:5080:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5084:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalBomi.g:5085:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalBomi.g:5092:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5096:1: ( ( '{' ) )
            // InternalBomi.g:5097:1: ( '{' )
            {
            // InternalBomi.g:5097:1: ( '{' )
            // InternalBomi.g:5098:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:5107:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5111:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalBomi.g:5112:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalBomi.g:5119:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )? ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5123:1: ( ( ( rule__Role__Group_4__0 )? ) )
            // InternalBomi.g:5124:1: ( ( rule__Role__Group_4__0 )? )
            {
            // InternalBomi.g:5124:1: ( ( rule__Role__Group_4__0 )? )
            // InternalBomi.g:5125:2: ( rule__Role__Group_4__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // InternalBomi.g:5126:2: ( rule__Role__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==70) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBomi.g:5126:3: rule__Role__Group_4__0
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
    // InternalBomi.g:5134:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5138:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // InternalBomi.g:5139:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalBomi.g:5146:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )? ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5150:1: ( ( ( rule__Role__Group_5__0 )? ) )
            // InternalBomi.g:5151:1: ( ( rule__Role__Group_5__0 )? )
            {
            // InternalBomi.g:5151:1: ( ( rule__Role__Group_5__0 )? )
            // InternalBomi.g:5152:2: ( rule__Role__Group_5__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // InternalBomi.g:5153:2: ( rule__Role__Group_5__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==71) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBomi.g:5153:3: rule__Role__Group_5__0
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
    // InternalBomi.g:5161:1: rule__Role__Group__6 : rule__Role__Group__6__Impl ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5165:1: ( rule__Role__Group__6__Impl )
            // InternalBomi.g:5166:2: rule__Role__Group__6__Impl
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
    // InternalBomi.g:5172:1: rule__Role__Group__6__Impl : ( '}' ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5176:1: ( ( '}' ) )
            // InternalBomi.g:5177:1: ( '}' )
            {
            // InternalBomi.g:5177:1: ( '}' )
            // InternalBomi.g:5178:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:5188:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5192:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // InternalBomi.g:5193:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:5200:1: rule__Role__Group_4__0__Impl : ( 'partOfGovernanceTeams' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5204:1: ( ( 'partOfGovernanceTeams' ) )
            // InternalBomi.g:5205:1: ( 'partOfGovernanceTeams' )
            {
            // InternalBomi.g:5205:1: ( 'partOfGovernanceTeams' )
            // InternalBomi.g:5206:2: 'partOfGovernanceTeams'
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalBomi.g:5215:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl rule__Role__Group_4__2 ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5219:1: ( rule__Role__Group_4__1__Impl rule__Role__Group_4__2 )
            // InternalBomi.g:5220:2: rule__Role__Group_4__1__Impl rule__Role__Group_4__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:5227:1: rule__Role__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5231:1: ( ( '(' ) )
            // InternalBomi.g:5232:1: ( '(' )
            {
            // InternalBomi.g:5232:1: ( '(' )
            // InternalBomi.g:5233:2: '('
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:5242:1: rule__Role__Group_4__2 : rule__Role__Group_4__2__Impl rule__Role__Group_4__3 ;
    public final void rule__Role__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5246:1: ( rule__Role__Group_4__2__Impl rule__Role__Group_4__3 )
            // InternalBomi.g:5247:2: rule__Role__Group_4__2__Impl rule__Role__Group_4__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:5254:1: rule__Role__Group_4__2__Impl : ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) ) ;
    public final void rule__Role__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5258:1: ( ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) ) )
            // InternalBomi.g:5259:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) )
            {
            // InternalBomi.g:5259:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) )
            // InternalBomi.g:5260:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_2()); 
            // InternalBomi.g:5261:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 )
            // InternalBomi.g:5261:3: rule__Role__PartOfGovernanceTeamsAssignment_4_2
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
    // InternalBomi.g:5269:1: rule__Role__Group_4__3 : rule__Role__Group_4__3__Impl rule__Role__Group_4__4 ;
    public final void rule__Role__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5273:1: ( rule__Role__Group_4__3__Impl rule__Role__Group_4__4 )
            // InternalBomi.g:5274:2: rule__Role__Group_4__3__Impl rule__Role__Group_4__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:5281:1: rule__Role__Group_4__3__Impl : ( ( rule__Role__Group_4_3__0 )* ) ;
    public final void rule__Role__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5285:1: ( ( ( rule__Role__Group_4_3__0 )* ) )
            // InternalBomi.g:5286:1: ( ( rule__Role__Group_4_3__0 )* )
            {
            // InternalBomi.g:5286:1: ( ( rule__Role__Group_4_3__0 )* )
            // InternalBomi.g:5287:2: ( rule__Role__Group_4_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4_3()); 
            // InternalBomi.g:5288:2: ( rule__Role__Group_4_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==34) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalBomi.g:5288:3: rule__Role__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Role__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalBomi.g:5296:1: rule__Role__Group_4__4 : rule__Role__Group_4__4__Impl ;
    public final void rule__Role__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5300:1: ( rule__Role__Group_4__4__Impl )
            // InternalBomi.g:5301:2: rule__Role__Group_4__4__Impl
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
    // InternalBomi.g:5307:1: rule__Role__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Role__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5311:1: ( ( ')' ) )
            // InternalBomi.g:5312:1: ( ')' )
            {
            // InternalBomi.g:5312:1: ( ')' )
            // InternalBomi.g:5313:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:5323:1: rule__Role__Group_4_3__0 : rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 ;
    public final void rule__Role__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5327:1: ( rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 )
            // InternalBomi.g:5328:2: rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:5335:1: rule__Role__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5339:1: ( ( ',' ) )
            // InternalBomi.g:5340:1: ( ',' )
            {
            // InternalBomi.g:5340:1: ( ',' )
            // InternalBomi.g:5341:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_4_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:5350:1: rule__Role__Group_4_3__1 : rule__Role__Group_4_3__1__Impl ;
    public final void rule__Role__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5354:1: ( rule__Role__Group_4_3__1__Impl )
            // InternalBomi.g:5355:2: rule__Role__Group_4_3__1__Impl
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
    // InternalBomi.g:5361:1: rule__Role__Group_4_3__1__Impl : ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) ) ;
    public final void rule__Role__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5365:1: ( ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) ) )
            // InternalBomi.g:5366:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) )
            {
            // InternalBomi.g:5366:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) )
            // InternalBomi.g:5367:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_3_1()); 
            // InternalBomi.g:5368:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 )
            // InternalBomi.g:5368:3: rule__Role__PartOfGovernanceTeamsAssignment_4_3_1
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
    // InternalBomi.g:5377:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5381:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // InternalBomi.g:5382:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:5389:1: rule__Role__Group_5__0__Impl : ( 'partOfMIs' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5393:1: ( ( 'partOfMIs' ) )
            // InternalBomi.g:5394:1: ( 'partOfMIs' )
            {
            // InternalBomi.g:5394:1: ( 'partOfMIs' )
            // InternalBomi.g:5395:2: 'partOfMIs'
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalBomi.g:5404:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl rule__Role__Group_5__2 ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5408:1: ( rule__Role__Group_5__1__Impl rule__Role__Group_5__2 )
            // InternalBomi.g:5409:2: rule__Role__Group_5__1__Impl rule__Role__Group_5__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:5416:1: rule__Role__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5420:1: ( ( '(' ) )
            // InternalBomi.g:5421:1: ( '(' )
            {
            // InternalBomi.g:5421:1: ( '(' )
            // InternalBomi.g:5422:2: '('
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:5431:1: rule__Role__Group_5__2 : rule__Role__Group_5__2__Impl rule__Role__Group_5__3 ;
    public final void rule__Role__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5435:1: ( rule__Role__Group_5__2__Impl rule__Role__Group_5__3 )
            // InternalBomi.g:5436:2: rule__Role__Group_5__2__Impl rule__Role__Group_5__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:5443:1: rule__Role__Group_5__2__Impl : ( ( rule__Role__PartOfMIsAssignment_5_2 ) ) ;
    public final void rule__Role__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5447:1: ( ( ( rule__Role__PartOfMIsAssignment_5_2 ) ) )
            // InternalBomi.g:5448:1: ( ( rule__Role__PartOfMIsAssignment_5_2 ) )
            {
            // InternalBomi.g:5448:1: ( ( rule__Role__PartOfMIsAssignment_5_2 ) )
            // InternalBomi.g:5449:2: ( rule__Role__PartOfMIsAssignment_5_2 )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_2()); 
            // InternalBomi.g:5450:2: ( rule__Role__PartOfMIsAssignment_5_2 )
            // InternalBomi.g:5450:3: rule__Role__PartOfMIsAssignment_5_2
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
    // InternalBomi.g:5458:1: rule__Role__Group_5__3 : rule__Role__Group_5__3__Impl rule__Role__Group_5__4 ;
    public final void rule__Role__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5462:1: ( rule__Role__Group_5__3__Impl rule__Role__Group_5__4 )
            // InternalBomi.g:5463:2: rule__Role__Group_5__3__Impl rule__Role__Group_5__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:5470:1: rule__Role__Group_5__3__Impl : ( ( rule__Role__Group_5_3__0 )* ) ;
    public final void rule__Role__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5474:1: ( ( ( rule__Role__Group_5_3__0 )* ) )
            // InternalBomi.g:5475:1: ( ( rule__Role__Group_5_3__0 )* )
            {
            // InternalBomi.g:5475:1: ( ( rule__Role__Group_5_3__0 )* )
            // InternalBomi.g:5476:2: ( rule__Role__Group_5_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5_3()); 
            // InternalBomi.g:5477:2: ( rule__Role__Group_5_3__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==34) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalBomi.g:5477:3: rule__Role__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Role__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalBomi.g:5485:1: rule__Role__Group_5__4 : rule__Role__Group_5__4__Impl ;
    public final void rule__Role__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5489:1: ( rule__Role__Group_5__4__Impl )
            // InternalBomi.g:5490:2: rule__Role__Group_5__4__Impl
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
    // InternalBomi.g:5496:1: rule__Role__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Role__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5500:1: ( ( ')' ) )
            // InternalBomi.g:5501:1: ( ')' )
            {
            // InternalBomi.g:5501:1: ( ')' )
            // InternalBomi.g:5502:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_5_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:5512:1: rule__Role__Group_5_3__0 : rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 ;
    public final void rule__Role__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5516:1: ( rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 )
            // InternalBomi.g:5517:2: rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:5524:1: rule__Role__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5528:1: ( ( ',' ) )
            // InternalBomi.g:5529:1: ( ',' )
            {
            // InternalBomi.g:5529:1: ( ',' )
            // InternalBomi.g:5530:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_5_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:5539:1: rule__Role__Group_5_3__1 : rule__Role__Group_5_3__1__Impl ;
    public final void rule__Role__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5543:1: ( rule__Role__Group_5_3__1__Impl )
            // InternalBomi.g:5544:2: rule__Role__Group_5_3__1__Impl
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
    // InternalBomi.g:5550:1: rule__Role__Group_5_3__1__Impl : ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) ) ;
    public final void rule__Role__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5554:1: ( ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) ) )
            // InternalBomi.g:5555:1: ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) )
            {
            // InternalBomi.g:5555:1: ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) )
            // InternalBomi.g:5556:2: ( rule__Role__PartOfMIsAssignment_5_3_1 )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_3_1()); 
            // InternalBomi.g:5557:2: ( rule__Role__PartOfMIsAssignment_5_3_1 )
            // InternalBomi.g:5557:3: rule__Role__PartOfMIsAssignment_5_3_1
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


    // $ANTLR start "rule__BOMICoordination__Group__0"
    // InternalBomi.g:5566:1: rule__BOMICoordination__Group__0 : rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1 ;
    public final void rule__BOMICoordination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5570:1: ( rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1 )
            // InternalBomi.g:5571:2: rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBomi.g:5578:1: rule__BOMICoordination__Group__0__Impl : ( () ) ;
    public final void rule__BOMICoordination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5582:1: ( ( () ) )
            // InternalBomi.g:5583:1: ( () )
            {
            // InternalBomi.g:5583:1: ( () )
            // InternalBomi.g:5584:2: ()
            {
             before(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationAction_0()); 
            // InternalBomi.g:5585:2: ()
            // InternalBomi.g:5585:3: 
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
    // InternalBomi.g:5593:1: rule__BOMICoordination__Group__1 : rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2 ;
    public final void rule__BOMICoordination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5597:1: ( rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2 )
            // InternalBomi.g:5598:2: rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:5605:1: rule__BOMICoordination__Group__1__Impl : ( 'BOMICoordination' ) ;
    public final void rule__BOMICoordination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5609:1: ( ( 'BOMICoordination' ) )
            // InternalBomi.g:5610:1: ( 'BOMICoordination' )
            {
            // InternalBomi.g:5610:1: ( 'BOMICoordination' )
            // InternalBomi.g:5611:2: 'BOMICoordination'
            {
             before(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalBomi.g:5620:1: rule__BOMICoordination__Group__2 : rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3 ;
    public final void rule__BOMICoordination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5624:1: ( rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3 )
            // InternalBomi.g:5625:2: rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3
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
    // InternalBomi.g:5632:1: rule__BOMICoordination__Group__2__Impl : ( ( rule__BOMICoordination__NameAssignment_2 ) ) ;
    public final void rule__BOMICoordination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5636:1: ( ( ( rule__BOMICoordination__NameAssignment_2 ) ) )
            // InternalBomi.g:5637:1: ( ( rule__BOMICoordination__NameAssignment_2 ) )
            {
            // InternalBomi.g:5637:1: ( ( rule__BOMICoordination__NameAssignment_2 ) )
            // InternalBomi.g:5638:2: ( rule__BOMICoordination__NameAssignment_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getNameAssignment_2()); 
            // InternalBomi.g:5639:2: ( rule__BOMICoordination__NameAssignment_2 )
            // InternalBomi.g:5639:3: rule__BOMICoordination__NameAssignment_2
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
    // InternalBomi.g:5647:1: rule__BOMICoordination__Group__3 : rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4 ;
    public final void rule__BOMICoordination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5651:1: ( rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4 )
            // InternalBomi.g:5652:2: rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5659:1: rule__BOMICoordination__Group__3__Impl : ( '{' ) ;
    public final void rule__BOMICoordination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5663:1: ( ( '{' ) )
            // InternalBomi.g:5664:1: ( '{' )
            {
            // InternalBomi.g:5664:1: ( '{' )
            // InternalBomi.g:5665:2: '{'
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:5674:1: rule__BOMICoordination__Group__4 : rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5 ;
    public final void rule__BOMICoordination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5678:1: ( rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5 )
            // InternalBomi.g:5679:2: rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5686:1: rule__BOMICoordination__Group__4__Impl : ( ( rule__BOMICoordination__Group_4__0 )? ) ;
    public final void rule__BOMICoordination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5690:1: ( ( ( rule__BOMICoordination__Group_4__0 )? ) )
            // InternalBomi.g:5691:1: ( ( rule__BOMICoordination__Group_4__0 )? )
            {
            // InternalBomi.g:5691:1: ( ( rule__BOMICoordination__Group_4__0 )? )
            // InternalBomi.g:5692:2: ( rule__BOMICoordination__Group_4__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_4()); 
            // InternalBomi.g:5693:2: ( rule__BOMICoordination__Group_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==43) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBomi.g:5693:3: rule__BOMICoordination__Group_4__0
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
    // InternalBomi.g:5701:1: rule__BOMICoordination__Group__5 : rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6 ;
    public final void rule__BOMICoordination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5705:1: ( rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6 )
            // InternalBomi.g:5706:2: rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5713:1: rule__BOMICoordination__Group__5__Impl : ( ( rule__BOMICoordination__Group_5__0 )? ) ;
    public final void rule__BOMICoordination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5717:1: ( ( ( rule__BOMICoordination__Group_5__0 )? ) )
            // InternalBomi.g:5718:1: ( ( rule__BOMICoordination__Group_5__0 )? )
            {
            // InternalBomi.g:5718:1: ( ( rule__BOMICoordination__Group_5__0 )? )
            // InternalBomi.g:5719:2: ( rule__BOMICoordination__Group_5__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_5()); 
            // InternalBomi.g:5720:2: ( rule__BOMICoordination__Group_5__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==44) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBomi.g:5720:3: rule__BOMICoordination__Group_5__0
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
    // InternalBomi.g:5728:1: rule__BOMICoordination__Group__6 : rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7 ;
    public final void rule__BOMICoordination__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5732:1: ( rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7 )
            // InternalBomi.g:5733:2: rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5740:1: rule__BOMICoordination__Group__6__Impl : ( ( rule__BOMICoordination__Group_6__0 )? ) ;
    public final void rule__BOMICoordination__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5744:1: ( ( ( rule__BOMICoordination__Group_6__0 )? ) )
            // InternalBomi.g:5745:1: ( ( rule__BOMICoordination__Group_6__0 )? )
            {
            // InternalBomi.g:5745:1: ( ( rule__BOMICoordination__Group_6__0 )? )
            // InternalBomi.g:5746:2: ( rule__BOMICoordination__Group_6__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_6()); 
            // InternalBomi.g:5747:2: ( rule__BOMICoordination__Group_6__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==45) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBomi.g:5747:3: rule__BOMICoordination__Group_6__0
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
    // InternalBomi.g:5755:1: rule__BOMICoordination__Group__7 : rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8 ;
    public final void rule__BOMICoordination__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5759:1: ( rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8 )
            // InternalBomi.g:5760:2: rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5767:1: rule__BOMICoordination__Group__7__Impl : ( ( rule__BOMICoordination__Group_7__0 )? ) ;
    public final void rule__BOMICoordination__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5771:1: ( ( ( rule__BOMICoordination__Group_7__0 )? ) )
            // InternalBomi.g:5772:1: ( ( rule__BOMICoordination__Group_7__0 )? )
            {
            // InternalBomi.g:5772:1: ( ( rule__BOMICoordination__Group_7__0 )? )
            // InternalBomi.g:5773:2: ( rule__BOMICoordination__Group_7__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_7()); 
            // InternalBomi.g:5774:2: ( rule__BOMICoordination__Group_7__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==46) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBomi.g:5774:3: rule__BOMICoordination__Group_7__0
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
    // InternalBomi.g:5782:1: rule__BOMICoordination__Group__8 : rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9 ;
    public final void rule__BOMICoordination__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5786:1: ( rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9 )
            // InternalBomi.g:5787:2: rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5794:1: rule__BOMICoordination__Group__8__Impl : ( ( rule__BOMICoordination__Group_8__0 )? ) ;
    public final void rule__BOMICoordination__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5798:1: ( ( ( rule__BOMICoordination__Group_8__0 )? ) )
            // InternalBomi.g:5799:1: ( ( rule__BOMICoordination__Group_8__0 )? )
            {
            // InternalBomi.g:5799:1: ( ( rule__BOMICoordination__Group_8__0 )? )
            // InternalBomi.g:5800:2: ( rule__BOMICoordination__Group_8__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_8()); 
            // InternalBomi.g:5801:2: ( rule__BOMICoordination__Group_8__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBomi.g:5801:3: rule__BOMICoordination__Group_8__0
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
    // InternalBomi.g:5809:1: rule__BOMICoordination__Group__9 : rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10 ;
    public final void rule__BOMICoordination__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5813:1: ( rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10 )
            // InternalBomi.g:5814:2: rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5821:1: rule__BOMICoordination__Group__9__Impl : ( ( rule__BOMICoordination__Group_9__0 )? ) ;
    public final void rule__BOMICoordination__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5825:1: ( ( ( rule__BOMICoordination__Group_9__0 )? ) )
            // InternalBomi.g:5826:1: ( ( rule__BOMICoordination__Group_9__0 )? )
            {
            // InternalBomi.g:5826:1: ( ( rule__BOMICoordination__Group_9__0 )? )
            // InternalBomi.g:5827:2: ( rule__BOMICoordination__Group_9__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_9()); 
            // InternalBomi.g:5828:2: ( rule__BOMICoordination__Group_9__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==35) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBomi.g:5828:3: rule__BOMICoordination__Group_9__0
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
    // InternalBomi.g:5836:1: rule__BOMICoordination__Group__10 : rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11 ;
    public final void rule__BOMICoordination__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5840:1: ( rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11 )
            // InternalBomi.g:5841:2: rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalBomi.g:5848:1: rule__BOMICoordination__Group__10__Impl : ( ( rule__BOMICoordination__Group_10__0 )? ) ;
    public final void rule__BOMICoordination__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5852:1: ( ( ( rule__BOMICoordination__Group_10__0 )? ) )
            // InternalBomi.g:5853:1: ( ( rule__BOMICoordination__Group_10__0 )? )
            {
            // InternalBomi.g:5853:1: ( ( rule__BOMICoordination__Group_10__0 )? )
            // InternalBomi.g:5854:2: ( rule__BOMICoordination__Group_10__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_10()); 
            // InternalBomi.g:5855:2: ( rule__BOMICoordination__Group_10__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==38) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBomi.g:5855:3: rule__BOMICoordination__Group_10__0
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
    // InternalBomi.g:5863:1: rule__BOMICoordination__Group__11 : rule__BOMICoordination__Group__11__Impl ;
    public final void rule__BOMICoordination__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5867:1: ( rule__BOMICoordination__Group__11__Impl )
            // InternalBomi.g:5868:2: rule__BOMICoordination__Group__11__Impl
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
    // InternalBomi.g:5874:1: rule__BOMICoordination__Group__11__Impl : ( '}' ) ;
    public final void rule__BOMICoordination__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5878:1: ( ( '}' ) )
            // InternalBomi.g:5879:1: ( '}' )
            {
            // InternalBomi.g:5879:1: ( '}' )
            // InternalBomi.g:5880:2: '}'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:5890:1: rule__BOMICoordination__Group_4__0 : rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1 ;
    public final void rule__BOMICoordination__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5894:1: ( rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1 )
            // InternalBomi.g:5895:2: rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:5902:1: rule__BOMICoordination__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BOMICoordination__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5906:1: ( ( 'purpose' ) )
            // InternalBomi.g:5907:1: ( 'purpose' )
            {
            // InternalBomi.g:5907:1: ( 'purpose' )
            // InternalBomi.g:5908:2: 'purpose'
            {
             before(grammarAccess.getBOMICoordinationAccess().getPurposeKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBomi.g:5917:1: rule__BOMICoordination__Group_4__1 : rule__BOMICoordination__Group_4__1__Impl ;
    public final void rule__BOMICoordination__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5921:1: ( rule__BOMICoordination__Group_4__1__Impl )
            // InternalBomi.g:5922:2: rule__BOMICoordination__Group_4__1__Impl
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
    // InternalBomi.g:5928:1: rule__BOMICoordination__Group_4__1__Impl : ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) ) ;
    public final void rule__BOMICoordination__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5932:1: ( ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:5933:1: ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:5933:1: ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) )
            // InternalBomi.g:5934:2: ( rule__BOMICoordination__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:5935:2: ( rule__BOMICoordination__PurposeAssignment_4_1 )
            // InternalBomi.g:5935:3: rule__BOMICoordination__PurposeAssignment_4_1
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
    // InternalBomi.g:5944:1: rule__BOMICoordination__Group_5__0 : rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1 ;
    public final void rule__BOMICoordination__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5948:1: ( rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1 )
            // InternalBomi.g:5949:2: rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:5956:1: rule__BOMICoordination__Group_5__0__Impl : ( 'accessability' ) ;
    public final void rule__BOMICoordination__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5960:1: ( ( 'accessability' ) )
            // InternalBomi.g:5961:1: ( 'accessability' )
            {
            // InternalBomi.g:5961:1: ( 'accessability' )
            // InternalBomi.g:5962:2: 'accessability'
            {
             before(grammarAccess.getBOMICoordinationAccess().getAccessabilityKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBomi.g:5971:1: rule__BOMICoordination__Group_5__1 : rule__BOMICoordination__Group_5__1__Impl ;
    public final void rule__BOMICoordination__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5975:1: ( rule__BOMICoordination__Group_5__1__Impl )
            // InternalBomi.g:5976:2: rule__BOMICoordination__Group_5__1__Impl
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
    // InternalBomi.g:5982:1: rule__BOMICoordination__Group_5__1__Impl : ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) ) ;
    public final void rule__BOMICoordination__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5986:1: ( ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) ) )
            // InternalBomi.g:5987:1: ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) )
            {
            // InternalBomi.g:5987:1: ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) )
            // InternalBomi.g:5988:2: ( rule__BOMICoordination__AccessabilityAssignment_5_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getAccessabilityAssignment_5_1()); 
            // InternalBomi.g:5989:2: ( rule__BOMICoordination__AccessabilityAssignment_5_1 )
            // InternalBomi.g:5989:3: rule__BOMICoordination__AccessabilityAssignment_5_1
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
    // InternalBomi.g:5998:1: rule__BOMICoordination__Group_6__0 : rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1 ;
    public final void rule__BOMICoordination__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6002:1: ( rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1 )
            // InternalBomi.g:6003:2: rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:6010:1: rule__BOMICoordination__Group_6__0__Impl : ( 'stability' ) ;
    public final void rule__BOMICoordination__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6014:1: ( ( 'stability' ) )
            // InternalBomi.g:6015:1: ( 'stability' )
            {
            // InternalBomi.g:6015:1: ( 'stability' )
            // InternalBomi.g:6016:2: 'stability'
            {
             before(grammarAccess.getBOMICoordinationAccess().getStabilityKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBomi.g:6025:1: rule__BOMICoordination__Group_6__1 : rule__BOMICoordination__Group_6__1__Impl ;
    public final void rule__BOMICoordination__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6029:1: ( rule__BOMICoordination__Group_6__1__Impl )
            // InternalBomi.g:6030:2: rule__BOMICoordination__Group_6__1__Impl
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
    // InternalBomi.g:6036:1: rule__BOMICoordination__Group_6__1__Impl : ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) ) ;
    public final void rule__BOMICoordination__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6040:1: ( ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) ) )
            // InternalBomi.g:6041:1: ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) )
            {
            // InternalBomi.g:6041:1: ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) )
            // InternalBomi.g:6042:2: ( rule__BOMICoordination__StabilityAssignment_6_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getStabilityAssignment_6_1()); 
            // InternalBomi.g:6043:2: ( rule__BOMICoordination__StabilityAssignment_6_1 )
            // InternalBomi.g:6043:3: rule__BOMICoordination__StabilityAssignment_6_1
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
    // InternalBomi.g:6052:1: rule__BOMICoordination__Group_7__0 : rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1 ;
    public final void rule__BOMICoordination__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6056:1: ( rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1 )
            // InternalBomi.g:6057:2: rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:6064:1: rule__BOMICoordination__Group_7__0__Impl : ( 'criticality' ) ;
    public final void rule__BOMICoordination__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6068:1: ( ( 'criticality' ) )
            // InternalBomi.g:6069:1: ( 'criticality' )
            {
            // InternalBomi.g:6069:1: ( 'criticality' )
            // InternalBomi.g:6070:2: 'criticality'
            {
             before(grammarAccess.getBOMICoordinationAccess().getCriticalityKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBomi.g:6079:1: rule__BOMICoordination__Group_7__1 : rule__BOMICoordination__Group_7__1__Impl ;
    public final void rule__BOMICoordination__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6083:1: ( rule__BOMICoordination__Group_7__1__Impl )
            // InternalBomi.g:6084:2: rule__BOMICoordination__Group_7__1__Impl
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
    // InternalBomi.g:6090:1: rule__BOMICoordination__Group_7__1__Impl : ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) ) ;
    public final void rule__BOMICoordination__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6094:1: ( ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) ) )
            // InternalBomi.g:6095:1: ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) )
            {
            // InternalBomi.g:6095:1: ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) )
            // InternalBomi.g:6096:2: ( rule__BOMICoordination__CriticalityAssignment_7_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getCriticalityAssignment_7_1()); 
            // InternalBomi.g:6097:2: ( rule__BOMICoordination__CriticalityAssignment_7_1 )
            // InternalBomi.g:6097:3: rule__BOMICoordination__CriticalityAssignment_7_1
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
    // InternalBomi.g:6106:1: rule__BOMICoordination__Group_8__0 : rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1 ;
    public final void rule__BOMICoordination__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6110:1: ( rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1 )
            // InternalBomi.g:6111:2: rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:6118:1: rule__BOMICoordination__Group_8__0__Impl : ( 'fitForPurpose' ) ;
    public final void rule__BOMICoordination__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6122:1: ( ( 'fitForPurpose' ) )
            // InternalBomi.g:6123:1: ( 'fitForPurpose' )
            {
            // InternalBomi.g:6123:1: ( 'fitForPurpose' )
            // InternalBomi.g:6124:2: 'fitForPurpose'
            {
             before(grammarAccess.getBOMICoordinationAccess().getFitForPurposeKeyword_8_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBomi.g:6133:1: rule__BOMICoordination__Group_8__1 : rule__BOMICoordination__Group_8__1__Impl ;
    public final void rule__BOMICoordination__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6137:1: ( rule__BOMICoordination__Group_8__1__Impl )
            // InternalBomi.g:6138:2: rule__BOMICoordination__Group_8__1__Impl
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
    // InternalBomi.g:6144:1: rule__BOMICoordination__Group_8__1__Impl : ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) ) ;
    public final void rule__BOMICoordination__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6148:1: ( ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) ) )
            // InternalBomi.g:6149:1: ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) )
            {
            // InternalBomi.g:6149:1: ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) )
            // InternalBomi.g:6150:2: ( rule__BOMICoordination__FitForPurposeAssignment_8_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getFitForPurposeAssignment_8_1()); 
            // InternalBomi.g:6151:2: ( rule__BOMICoordination__FitForPurposeAssignment_8_1 )
            // InternalBomi.g:6151:3: rule__BOMICoordination__FitForPurposeAssignment_8_1
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
    // InternalBomi.g:6160:1: rule__BOMICoordination__Group_9__0 : rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1 ;
    public final void rule__BOMICoordination__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6164:1: ( rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1 )
            // InternalBomi.g:6165:2: rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:6172:1: rule__BOMICoordination__Group_9__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOMICoordination__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6176:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:6177:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:6177:1: ( 'boundaryObjects' )
            // InternalBomi.g:6178:2: 'boundaryObjects'
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
    // InternalBomi.g:6187:1: rule__BOMICoordination__Group_9__1 : rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2 ;
    public final void rule__BOMICoordination__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6191:1: ( rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2 )
            // InternalBomi.g:6192:2: rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:6199:1: rule__BOMICoordination__Group_9__1__Impl : ( '(' ) ;
    public final void rule__BOMICoordination__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6203:1: ( ( '(' ) )
            // InternalBomi.g:6204:1: ( '(' )
            {
            // InternalBomi.g:6204:1: ( '(' )
            // InternalBomi.g:6205:2: '('
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:6214:1: rule__BOMICoordination__Group_9__2 : rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3 ;
    public final void rule__BOMICoordination__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6218:1: ( rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3 )
            // InternalBomi.g:6219:2: rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:6226:1: rule__BOMICoordination__Group_9__2__Impl : ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) ) ;
    public final void rule__BOMICoordination__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6230:1: ( ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) ) )
            // InternalBomi.g:6231:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) )
            {
            // InternalBomi.g:6231:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) )
            // InternalBomi.g:6232:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_2()); 
            // InternalBomi.g:6233:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 )
            // InternalBomi.g:6233:3: rule__BOMICoordination__BoundaryObjectsAssignment_9_2
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
    // InternalBomi.g:6241:1: rule__BOMICoordination__Group_9__3 : rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4 ;
    public final void rule__BOMICoordination__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6245:1: ( rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4 )
            // InternalBomi.g:6246:2: rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:6253:1: rule__BOMICoordination__Group_9__3__Impl : ( ( rule__BOMICoordination__Group_9_3__0 )* ) ;
    public final void rule__BOMICoordination__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6257:1: ( ( ( rule__BOMICoordination__Group_9_3__0 )* ) )
            // InternalBomi.g:6258:1: ( ( rule__BOMICoordination__Group_9_3__0 )* )
            {
            // InternalBomi.g:6258:1: ( ( rule__BOMICoordination__Group_9_3__0 )* )
            // InternalBomi.g:6259:2: ( rule__BOMICoordination__Group_9_3__0 )*
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_9_3()); 
            // InternalBomi.g:6260:2: ( rule__BOMICoordination__Group_9_3__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==34) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalBomi.g:6260:3: rule__BOMICoordination__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMICoordination__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalBomi.g:6268:1: rule__BOMICoordination__Group_9__4 : rule__BOMICoordination__Group_9__4__Impl ;
    public final void rule__BOMICoordination__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6272:1: ( rule__BOMICoordination__Group_9__4__Impl )
            // InternalBomi.g:6273:2: rule__BOMICoordination__Group_9__4__Impl
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
    // InternalBomi.g:6279:1: rule__BOMICoordination__Group_9__4__Impl : ( ')' ) ;
    public final void rule__BOMICoordination__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6283:1: ( ( ')' ) )
            // InternalBomi.g:6284:1: ( ')' )
            {
            // InternalBomi.g:6284:1: ( ')' )
            // InternalBomi.g:6285:2: ')'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_9_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:6295:1: rule__BOMICoordination__Group_9_3__0 : rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1 ;
    public final void rule__BOMICoordination__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6299:1: ( rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1 )
            // InternalBomi.g:6300:2: rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:6307:1: rule__BOMICoordination__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__BOMICoordination__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6311:1: ( ( ',' ) )
            // InternalBomi.g:6312:1: ( ',' )
            {
            // InternalBomi.g:6312:1: ( ',' )
            // InternalBomi.g:6313:2: ','
            {
             before(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_9_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:6322:1: rule__BOMICoordination__Group_9_3__1 : rule__BOMICoordination__Group_9_3__1__Impl ;
    public final void rule__BOMICoordination__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6326:1: ( rule__BOMICoordination__Group_9_3__1__Impl )
            // InternalBomi.g:6327:2: rule__BOMICoordination__Group_9_3__1__Impl
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
    // InternalBomi.g:6333:1: rule__BOMICoordination__Group_9_3__1__Impl : ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) ) ;
    public final void rule__BOMICoordination__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6337:1: ( ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) ) )
            // InternalBomi.g:6338:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) )
            {
            // InternalBomi.g:6338:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) )
            // InternalBomi.g:6339:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_3_1()); 
            // InternalBomi.g:6340:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 )
            // InternalBomi.g:6340:3: rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1
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
    // InternalBomi.g:6349:1: rule__BOMICoordination__Group_10__0 : rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1 ;
    public final void rule__BOMICoordination__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6353:1: ( rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1 )
            // InternalBomi.g:6354:2: rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:6361:1: rule__BOMICoordination__Group_10__0__Impl : ( 'methodologicalIslands' ) ;
    public final void rule__BOMICoordination__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6365:1: ( ( 'methodologicalIslands' ) )
            // InternalBomi.g:6366:1: ( 'methodologicalIslands' )
            {
            // InternalBomi.g:6366:1: ( 'methodologicalIslands' )
            // InternalBomi.g:6367:2: 'methodologicalIslands'
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsKeyword_10_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBomi.g:6376:1: rule__BOMICoordination__Group_10__1 : rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2 ;
    public final void rule__BOMICoordination__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6380:1: ( rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2 )
            // InternalBomi.g:6381:2: rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:6388:1: rule__BOMICoordination__Group_10__1__Impl : ( '(' ) ;
    public final void rule__BOMICoordination__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6392:1: ( ( '(' ) )
            // InternalBomi.g:6393:1: ( '(' )
            {
            // InternalBomi.g:6393:1: ( '(' )
            // InternalBomi.g:6394:2: '('
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:6403:1: rule__BOMICoordination__Group_10__2 : rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3 ;
    public final void rule__BOMICoordination__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6407:1: ( rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3 )
            // InternalBomi.g:6408:2: rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:6415:1: rule__BOMICoordination__Group_10__2__Impl : ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) ) ;
    public final void rule__BOMICoordination__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6419:1: ( ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) ) )
            // InternalBomi.g:6420:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) )
            {
            // InternalBomi.g:6420:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) )
            // InternalBomi.g:6421:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_2()); 
            // InternalBomi.g:6422:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 )
            // InternalBomi.g:6422:3: rule__BOMICoordination__MethodologicalIslandsAssignment_10_2
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
    // InternalBomi.g:6430:1: rule__BOMICoordination__Group_10__3 : rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4 ;
    public final void rule__BOMICoordination__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6434:1: ( rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4 )
            // InternalBomi.g:6435:2: rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:6442:1: rule__BOMICoordination__Group_10__3__Impl : ( ( rule__BOMICoordination__Group_10_3__0 )* ) ;
    public final void rule__BOMICoordination__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6446:1: ( ( ( rule__BOMICoordination__Group_10_3__0 )* ) )
            // InternalBomi.g:6447:1: ( ( rule__BOMICoordination__Group_10_3__0 )* )
            {
            // InternalBomi.g:6447:1: ( ( rule__BOMICoordination__Group_10_3__0 )* )
            // InternalBomi.g:6448:2: ( rule__BOMICoordination__Group_10_3__0 )*
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_10_3()); 
            // InternalBomi.g:6449:2: ( rule__BOMICoordination__Group_10_3__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==34) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalBomi.g:6449:3: rule__BOMICoordination__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMICoordination__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // InternalBomi.g:6457:1: rule__BOMICoordination__Group_10__4 : rule__BOMICoordination__Group_10__4__Impl ;
    public final void rule__BOMICoordination__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6461:1: ( rule__BOMICoordination__Group_10__4__Impl )
            // InternalBomi.g:6462:2: rule__BOMICoordination__Group_10__4__Impl
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
    // InternalBomi.g:6468:1: rule__BOMICoordination__Group_10__4__Impl : ( ')' ) ;
    public final void rule__BOMICoordination__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6472:1: ( ( ')' ) )
            // InternalBomi.g:6473:1: ( ')' )
            {
            // InternalBomi.g:6473:1: ( ')' )
            // InternalBomi.g:6474:2: ')'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_10_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:6484:1: rule__BOMICoordination__Group_10_3__0 : rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1 ;
    public final void rule__BOMICoordination__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6488:1: ( rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1 )
            // InternalBomi.g:6489:2: rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:6496:1: rule__BOMICoordination__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__BOMICoordination__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6500:1: ( ( ',' ) )
            // InternalBomi.g:6501:1: ( ',' )
            {
            // InternalBomi.g:6501:1: ( ',' )
            // InternalBomi.g:6502:2: ','
            {
             before(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_10_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:6511:1: rule__BOMICoordination__Group_10_3__1 : rule__BOMICoordination__Group_10_3__1__Impl ;
    public final void rule__BOMICoordination__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6515:1: ( rule__BOMICoordination__Group_10_3__1__Impl )
            // InternalBomi.g:6516:2: rule__BOMICoordination__Group_10_3__1__Impl
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
    // InternalBomi.g:6522:1: rule__BOMICoordination__Group_10_3__1__Impl : ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) ) ;
    public final void rule__BOMICoordination__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6526:1: ( ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) ) )
            // InternalBomi.g:6527:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) )
            {
            // InternalBomi.g:6527:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) )
            // InternalBomi.g:6528:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_3_1()); 
            // InternalBomi.g:6529:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 )
            // InternalBomi.g:6529:3: rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1
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


    // $ANTLR start "rule__MethodologicalIsland__Group__0"
    // InternalBomi.g:6538:1: rule__MethodologicalIsland__Group__0 : rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1 ;
    public final void rule__MethodologicalIsland__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6542:1: ( rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1 )
            // InternalBomi.g:6543:2: rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBomi.g:6550:1: rule__MethodologicalIsland__Group__0__Impl : ( () ) ;
    public final void rule__MethodologicalIsland__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6554:1: ( ( () ) )
            // InternalBomi.g:6555:1: ( () )
            {
            // InternalBomi.g:6555:1: ( () )
            // InternalBomi.g:6556:2: ()
            {
             before(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandAction_0()); 
            // InternalBomi.g:6557:2: ()
            // InternalBomi.g:6557:3: 
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
    // InternalBomi.g:6565:1: rule__MethodologicalIsland__Group__1 : rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2 ;
    public final void rule__MethodologicalIsland__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6569:1: ( rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2 )
            // InternalBomi.g:6570:2: rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:6577:1: rule__MethodologicalIsland__Group__1__Impl : ( 'MethodologicalIsland' ) ;
    public final void rule__MethodologicalIsland__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6581:1: ( ( 'MethodologicalIsland' ) )
            // InternalBomi.g:6582:1: ( 'MethodologicalIsland' )
            {
            // InternalBomi.g:6582:1: ( 'MethodologicalIsland' )
            // InternalBomi.g:6583:2: 'MethodologicalIsland'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandKeyword_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalBomi.g:6592:1: rule__MethodologicalIsland__Group__2 : rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3 ;
    public final void rule__MethodologicalIsland__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6596:1: ( rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3 )
            // InternalBomi.g:6597:2: rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3
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
    // InternalBomi.g:6604:1: rule__MethodologicalIsland__Group__2__Impl : ( ( rule__MethodologicalIsland__NameAssignment_2 ) ) ;
    public final void rule__MethodologicalIsland__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6608:1: ( ( ( rule__MethodologicalIsland__NameAssignment_2 ) ) )
            // InternalBomi.g:6609:1: ( ( rule__MethodologicalIsland__NameAssignment_2 ) )
            {
            // InternalBomi.g:6609:1: ( ( rule__MethodologicalIsland__NameAssignment_2 ) )
            // InternalBomi.g:6610:2: ( rule__MethodologicalIsland__NameAssignment_2 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getNameAssignment_2()); 
            // InternalBomi.g:6611:2: ( rule__MethodologicalIsland__NameAssignment_2 )
            // InternalBomi.g:6611:3: rule__MethodologicalIsland__NameAssignment_2
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
    // InternalBomi.g:6619:1: rule__MethodologicalIsland__Group__3 : rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4 ;
    public final void rule__MethodologicalIsland__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6623:1: ( rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4 )
            // InternalBomi.g:6624:2: rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalBomi.g:6631:1: rule__MethodologicalIsland__Group__3__Impl : ( '{' ) ;
    public final void rule__MethodologicalIsland__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6635:1: ( ( '{' ) )
            // InternalBomi.g:6636:1: ( '{' )
            {
            // InternalBomi.g:6636:1: ( '{' )
            // InternalBomi.g:6637:2: '{'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:6646:1: rule__MethodologicalIsland__Group__4 : rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5 ;
    public final void rule__MethodologicalIsland__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6650:1: ( rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5 )
            // InternalBomi.g:6651:2: rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalBomi.g:6658:1: rule__MethodologicalIsland__Group__4__Impl : ( ( rule__MethodologicalIsland__Group_4__0 )? ) ;
    public final void rule__MethodologicalIsland__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6662:1: ( ( ( rule__MethodologicalIsland__Group_4__0 )? ) )
            // InternalBomi.g:6663:1: ( ( rule__MethodologicalIsland__Group_4__0 )? )
            {
            // InternalBomi.g:6663:1: ( ( rule__MethodologicalIsland__Group_4__0 )? )
            // InternalBomi.g:6664:2: ( rule__MethodologicalIsland__Group_4__0 )?
            {
             before(grammarAccess.getMethodologicalIslandAccess().getGroup_4()); 
            // InternalBomi.g:6665:2: ( rule__MethodologicalIsland__Group_4__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==74) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalBomi.g:6665:3: rule__MethodologicalIsland__Group_4__0
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
    // InternalBomi.g:6673:1: rule__MethodologicalIsland__Group__5 : rule__MethodologicalIsland__Group__5__Impl ;
    public final void rule__MethodologicalIsland__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6677:1: ( rule__MethodologicalIsland__Group__5__Impl )
            // InternalBomi.g:6678:2: rule__MethodologicalIsland__Group__5__Impl
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
    // InternalBomi.g:6684:1: rule__MethodologicalIsland__Group__5__Impl : ( '}' ) ;
    public final void rule__MethodologicalIsland__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6688:1: ( ( '}' ) )
            // InternalBomi.g:6689:1: ( '}' )
            {
            // InternalBomi.g:6689:1: ( '}' )
            // InternalBomi.g:6690:2: '}'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:6700:1: rule__MethodologicalIsland__Group_4__0 : rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1 ;
    public final void rule__MethodologicalIsland__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6704:1: ( rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1 )
            // InternalBomi.g:6705:2: rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalBomi.g:6712:1: rule__MethodologicalIsland__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__MethodologicalIsland__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6716:1: ( ( 'type' ) )
            // InternalBomi.g:6717:1: ( 'type' )
            {
            // InternalBomi.g:6717:1: ( 'type' )
            // InternalBomi.g:6718:2: 'type'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getTypeKeyword_4_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalBomi.g:6727:1: rule__MethodologicalIsland__Group_4__1 : rule__MethodologicalIsland__Group_4__1__Impl ;
    public final void rule__MethodologicalIsland__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6731:1: ( rule__MethodologicalIsland__Group_4__1__Impl )
            // InternalBomi.g:6732:2: rule__MethodologicalIsland__Group_4__1__Impl
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
    // InternalBomi.g:6738:1: rule__MethodologicalIsland__Group_4__1__Impl : ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) ) ;
    public final void rule__MethodologicalIsland__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6742:1: ( ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) ) )
            // InternalBomi.g:6743:1: ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) )
            {
            // InternalBomi.g:6743:1: ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) )
            // InternalBomi.g:6744:2: ( rule__MethodologicalIsland__TypeAssignment_4_1 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getTypeAssignment_4_1()); 
            // InternalBomi.g:6745:2: ( rule__MethodologicalIsland__TypeAssignment_4_1 )
            // InternalBomi.g:6745:3: rule__MethodologicalIsland__TypeAssignment_4_1
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
    // InternalBomi.g:6754:1: rule__GovernanceTeam__Group__0 : rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1 ;
    public final void rule__GovernanceTeam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6758:1: ( rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1 )
            // InternalBomi.g:6759:2: rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBomi.g:6766:1: rule__GovernanceTeam__Group__0__Impl : ( () ) ;
    public final void rule__GovernanceTeam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6770:1: ( ( () ) )
            // InternalBomi.g:6771:1: ( () )
            {
            // InternalBomi.g:6771:1: ( () )
            // InternalBomi.g:6772:2: ()
            {
             before(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamAction_0()); 
            // InternalBomi.g:6773:2: ()
            // InternalBomi.g:6773:3: 
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
    // InternalBomi.g:6781:1: rule__GovernanceTeam__Group__1 : rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2 ;
    public final void rule__GovernanceTeam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6785:1: ( rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2 )
            // InternalBomi.g:6786:2: rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:6793:1: rule__GovernanceTeam__Group__1__Impl : ( 'GovernanceTeam' ) ;
    public final void rule__GovernanceTeam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6797:1: ( ( 'GovernanceTeam' ) )
            // InternalBomi.g:6798:1: ( 'GovernanceTeam' )
            {
            // InternalBomi.g:6798:1: ( 'GovernanceTeam' )
            // InternalBomi.g:6799:2: 'GovernanceTeam'
            {
             before(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamKeyword_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalBomi.g:6808:1: rule__GovernanceTeam__Group__2 : rule__GovernanceTeam__Group__2__Impl ;
    public final void rule__GovernanceTeam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6812:1: ( rule__GovernanceTeam__Group__2__Impl )
            // InternalBomi.g:6813:2: rule__GovernanceTeam__Group__2__Impl
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
    // InternalBomi.g:6819:1: rule__GovernanceTeam__Group__2__Impl : ( ( rule__GovernanceTeam__NameAssignment_2 ) ) ;
    public final void rule__GovernanceTeam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6823:1: ( ( ( rule__GovernanceTeam__NameAssignment_2 ) ) )
            // InternalBomi.g:6824:1: ( ( rule__GovernanceTeam__NameAssignment_2 ) )
            {
            // InternalBomi.g:6824:1: ( ( rule__GovernanceTeam__NameAssignment_2 ) )
            // InternalBomi.g:6825:2: ( rule__GovernanceTeam__NameAssignment_2 )
            {
             before(grammarAccess.getGovernanceTeamAccess().getNameAssignment_2()); 
            // InternalBomi.g:6826:2: ( rule__GovernanceTeam__NameAssignment_2 )
            // InternalBomi.g:6826:3: rule__GovernanceTeam__NameAssignment_2
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


    // $ANTLR start "rule__BOTeamGovernance__Group__0"
    // InternalBomi.g:6835:1: rule__BOTeamGovernance__Group__0 : rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1 ;
    public final void rule__BOTeamGovernance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6839:1: ( rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1 )
            // InternalBomi.g:6840:2: rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBomi.g:6847:1: rule__BOTeamGovernance__Group__0__Impl : ( () ) ;
    public final void rule__BOTeamGovernance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6851:1: ( ( () ) )
            // InternalBomi.g:6852:1: ( () )
            {
            // InternalBomi.g:6852:1: ( () )
            // InternalBomi.g:6853:2: ()
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceAction_0()); 
            // InternalBomi.g:6854:2: ()
            // InternalBomi.g:6854:3: 
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
    // InternalBomi.g:6862:1: rule__BOTeamGovernance__Group__1 : rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2 ;
    public final void rule__BOTeamGovernance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6866:1: ( rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2 )
            // InternalBomi.g:6867:2: rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:6874:1: rule__BOTeamGovernance__Group__1__Impl : ( 'BOTeamGovernance' ) ;
    public final void rule__BOTeamGovernance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6878:1: ( ( 'BOTeamGovernance' ) )
            // InternalBomi.g:6879:1: ( 'BOTeamGovernance' )
            {
            // InternalBomi.g:6879:1: ( 'BOTeamGovernance' )
            // InternalBomi.g:6880:2: 'BOTeamGovernance'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceKeyword_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalBomi.g:6889:1: rule__BOTeamGovernance__Group__2 : rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3 ;
    public final void rule__BOTeamGovernance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6893:1: ( rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3 )
            // InternalBomi.g:6894:2: rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3
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
    // InternalBomi.g:6901:1: rule__BOTeamGovernance__Group__2__Impl : ( ( rule__BOTeamGovernance__NameAssignment_2 ) ) ;
    public final void rule__BOTeamGovernance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6905:1: ( ( ( rule__BOTeamGovernance__NameAssignment_2 ) ) )
            // InternalBomi.g:6906:1: ( ( rule__BOTeamGovernance__NameAssignment_2 ) )
            {
            // InternalBomi.g:6906:1: ( ( rule__BOTeamGovernance__NameAssignment_2 ) )
            // InternalBomi.g:6907:2: ( rule__BOTeamGovernance__NameAssignment_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getNameAssignment_2()); 
            // InternalBomi.g:6908:2: ( rule__BOTeamGovernance__NameAssignment_2 )
            // InternalBomi.g:6908:3: rule__BOTeamGovernance__NameAssignment_2
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
    // InternalBomi.g:6916:1: rule__BOTeamGovernance__Group__3 : rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4 ;
    public final void rule__BOTeamGovernance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6920:1: ( rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4 )
            // InternalBomi.g:6921:2: rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalBomi.g:6928:1: rule__BOTeamGovernance__Group__3__Impl : ( '{' ) ;
    public final void rule__BOTeamGovernance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6932:1: ( ( '{' ) )
            // InternalBomi.g:6933:1: ( '{' )
            {
            // InternalBomi.g:6933:1: ( '{' )
            // InternalBomi.g:6934:2: '{'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:6943:1: rule__BOTeamGovernance__Group__4 : rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5 ;
    public final void rule__BOTeamGovernance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6947:1: ( rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5 )
            // InternalBomi.g:6948:2: rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalBomi.g:6955:1: rule__BOTeamGovernance__Group__4__Impl : ( ( rule__BOTeamGovernance__Group_4__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6959:1: ( ( ( rule__BOTeamGovernance__Group_4__0 )? ) )
            // InternalBomi.g:6960:1: ( ( rule__BOTeamGovernance__Group_4__0 )? )
            {
            // InternalBomi.g:6960:1: ( ( rule__BOTeamGovernance__Group_4__0 )? )
            // InternalBomi.g:6961:2: ( rule__BOTeamGovernance__Group_4__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_4()); 
            // InternalBomi.g:6962:2: ( rule__BOTeamGovernance__Group_4__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBomi.g:6962:3: rule__BOTeamGovernance__Group_4__0
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
    // InternalBomi.g:6970:1: rule__BOTeamGovernance__Group__5 : rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6 ;
    public final void rule__BOTeamGovernance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6974:1: ( rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6 )
            // InternalBomi.g:6975:2: rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalBomi.g:6982:1: rule__BOTeamGovernance__Group__5__Impl : ( ( rule__BOTeamGovernance__Group_5__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6986:1: ( ( ( rule__BOTeamGovernance__Group_5__0 )? ) )
            // InternalBomi.g:6987:1: ( ( rule__BOTeamGovernance__Group_5__0 )? )
            {
            // InternalBomi.g:6987:1: ( ( rule__BOTeamGovernance__Group_5__0 )? )
            // InternalBomi.g:6988:2: ( rule__BOTeamGovernance__Group_5__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_5()); 
            // InternalBomi.g:6989:2: ( rule__BOTeamGovernance__Group_5__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==77) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalBomi.g:6989:3: rule__BOTeamGovernance__Group_5__0
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
    // InternalBomi.g:6997:1: rule__BOTeamGovernance__Group__6 : rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7 ;
    public final void rule__BOTeamGovernance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7001:1: ( rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7 )
            // InternalBomi.g:7002:2: rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalBomi.g:7009:1: rule__BOTeamGovernance__Group__6__Impl : ( ( rule__BOTeamGovernance__Group_6__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7013:1: ( ( ( rule__BOTeamGovernance__Group_6__0 )? ) )
            // InternalBomi.g:7014:1: ( ( rule__BOTeamGovernance__Group_6__0 )? )
            {
            // InternalBomi.g:7014:1: ( ( rule__BOTeamGovernance__Group_6__0 )? )
            // InternalBomi.g:7015:2: ( rule__BOTeamGovernance__Group_6__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_6()); 
            // InternalBomi.g:7016:2: ( rule__BOTeamGovernance__Group_6__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==78) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBomi.g:7016:3: rule__BOTeamGovernance__Group_6__0
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
    // InternalBomi.g:7024:1: rule__BOTeamGovernance__Group__7 : rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8 ;
    public final void rule__BOTeamGovernance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7028:1: ( rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8 )
            // InternalBomi.g:7029:2: rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalBomi.g:7036:1: rule__BOTeamGovernance__Group__7__Impl : ( ( rule__BOTeamGovernance__Group_7__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7040:1: ( ( ( rule__BOTeamGovernance__Group_7__0 )? ) )
            // InternalBomi.g:7041:1: ( ( rule__BOTeamGovernance__Group_7__0 )? )
            {
            // InternalBomi.g:7041:1: ( ( rule__BOTeamGovernance__Group_7__0 )? )
            // InternalBomi.g:7042:2: ( rule__BOTeamGovernance__Group_7__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_7()); 
            // InternalBomi.g:7043:2: ( rule__BOTeamGovernance__Group_7__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==35) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBomi.g:7043:3: rule__BOTeamGovernance__Group_7__0
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
    // InternalBomi.g:7051:1: rule__BOTeamGovernance__Group__8 : rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9 ;
    public final void rule__BOTeamGovernance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7055:1: ( rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9 )
            // InternalBomi.g:7056:2: rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalBomi.g:7063:1: rule__BOTeamGovernance__Group__8__Impl : ( ( rule__BOTeamGovernance__Group_8__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7067:1: ( ( ( rule__BOTeamGovernance__Group_8__0 )? ) )
            // InternalBomi.g:7068:1: ( ( rule__BOTeamGovernance__Group_8__0 )? )
            {
            // InternalBomi.g:7068:1: ( ( rule__BOTeamGovernance__Group_8__0 )? )
            // InternalBomi.g:7069:2: ( rule__BOTeamGovernance__Group_8__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_8()); 
            // InternalBomi.g:7070:2: ( rule__BOTeamGovernance__Group_8__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==39) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalBomi.g:7070:3: rule__BOTeamGovernance__Group_8__0
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
    // InternalBomi.g:7078:1: rule__BOTeamGovernance__Group__9 : rule__BOTeamGovernance__Group__9__Impl ;
    public final void rule__BOTeamGovernance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7082:1: ( rule__BOTeamGovernance__Group__9__Impl )
            // InternalBomi.g:7083:2: rule__BOTeamGovernance__Group__9__Impl
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
    // InternalBomi.g:7089:1: rule__BOTeamGovernance__Group__9__Impl : ( '}' ) ;
    public final void rule__BOTeamGovernance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7093:1: ( ( '}' ) )
            // InternalBomi.g:7094:1: ( '}' )
            {
            // InternalBomi.g:7094:1: ( '}' )
            // InternalBomi.g:7095:2: '}'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:7105:1: rule__BOTeamGovernance__Group_4__0 : rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1 ;
    public final void rule__BOTeamGovernance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7109:1: ( rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1 )
            // InternalBomi.g:7110:2: rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:7117:1: rule__BOTeamGovernance__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BOTeamGovernance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7121:1: ( ( 'purpose' ) )
            // InternalBomi.g:7122:1: ( 'purpose' )
            {
            // InternalBomi.g:7122:1: ( 'purpose' )
            // InternalBomi.g:7123:2: 'purpose'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getPurposeKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBomi.g:7132:1: rule__BOTeamGovernance__Group_4__1 : rule__BOTeamGovernance__Group_4__1__Impl ;
    public final void rule__BOTeamGovernance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7136:1: ( rule__BOTeamGovernance__Group_4__1__Impl )
            // InternalBomi.g:7137:2: rule__BOTeamGovernance__Group_4__1__Impl
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
    // InternalBomi.g:7143:1: rule__BOTeamGovernance__Group_4__1__Impl : ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7147:1: ( ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:7148:1: ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:7148:1: ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) )
            // InternalBomi.g:7149:2: ( rule__BOTeamGovernance__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:7150:2: ( rule__BOTeamGovernance__PurposeAssignment_4_1 )
            // InternalBomi.g:7150:3: rule__BOTeamGovernance__PurposeAssignment_4_1
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
    // InternalBomi.g:7159:1: rule__BOTeamGovernance__Group_5__0 : rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1 ;
    public final void rule__BOTeamGovernance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7163:1: ( rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1 )
            // InternalBomi.g:7164:2: rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:7171:1: rule__BOTeamGovernance__Group_5__0__Impl : ( 'coordinationMechanism' ) ;
    public final void rule__BOTeamGovernance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7175:1: ( ( 'coordinationMechanism' ) )
            // InternalBomi.g:7176:1: ( 'coordinationMechanism' )
            {
            // InternalBomi.g:7176:1: ( 'coordinationMechanism' )
            // InternalBomi.g:7177:2: 'coordinationMechanism'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismKeyword_5_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalBomi.g:7186:1: rule__BOTeamGovernance__Group_5__1 : rule__BOTeamGovernance__Group_5__1__Impl ;
    public final void rule__BOTeamGovernance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7190:1: ( rule__BOTeamGovernance__Group_5__1__Impl )
            // InternalBomi.g:7191:2: rule__BOTeamGovernance__Group_5__1__Impl
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
    // InternalBomi.g:7197:1: rule__BOTeamGovernance__Group_5__1__Impl : ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7201:1: ( ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) ) )
            // InternalBomi.g:7202:1: ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) )
            {
            // InternalBomi.g:7202:1: ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) )
            // InternalBomi.g:7203:2: ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismAssignment_5_1()); 
            // InternalBomi.g:7204:2: ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 )
            // InternalBomi.g:7204:3: rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1
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
    // InternalBomi.g:7213:1: rule__BOTeamGovernance__Group_6__0 : rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1 ;
    public final void rule__BOTeamGovernance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7217:1: ( rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1 )
            // InternalBomi.g:7218:2: rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBomi.g:7225:1: rule__BOTeamGovernance__Group_6__0__Impl : ( 'frequencyOfCoordination' ) ;
    public final void rule__BOTeamGovernance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7229:1: ( ( 'frequencyOfCoordination' ) )
            // InternalBomi.g:7230:1: ( 'frequencyOfCoordination' )
            {
            // InternalBomi.g:7230:1: ( 'frequencyOfCoordination' )
            // InternalBomi.g:7231:2: 'frequencyOfCoordination'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationKeyword_6_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalBomi.g:7240:1: rule__BOTeamGovernance__Group_6__1 : rule__BOTeamGovernance__Group_6__1__Impl ;
    public final void rule__BOTeamGovernance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7244:1: ( rule__BOTeamGovernance__Group_6__1__Impl )
            // InternalBomi.g:7245:2: rule__BOTeamGovernance__Group_6__1__Impl
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
    // InternalBomi.g:7251:1: rule__BOTeamGovernance__Group_6__1__Impl : ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7255:1: ( ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) ) )
            // InternalBomi.g:7256:1: ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) )
            {
            // InternalBomi.g:7256:1: ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) )
            // InternalBomi.g:7257:2: ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationAssignment_6_1()); 
            // InternalBomi.g:7258:2: ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 )
            // InternalBomi.g:7258:3: rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1
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
    // InternalBomi.g:7267:1: rule__BOTeamGovernance__Group_7__0 : rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1 ;
    public final void rule__BOTeamGovernance__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7271:1: ( rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1 )
            // InternalBomi.g:7272:2: rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:7279:1: rule__BOTeamGovernance__Group_7__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOTeamGovernance__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7283:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:7284:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:7284:1: ( 'boundaryObjects' )
            // InternalBomi.g:7285:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsKeyword_7_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsKeyword_7_0()); 

            }


            }

        }
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
    // InternalBomi.g:7294:1: rule__BOTeamGovernance__Group_7__1 : rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2 ;
    public final void rule__BOTeamGovernance__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7298:1: ( rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2 )
            // InternalBomi.g:7299:2: rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:7306:1: rule__BOTeamGovernance__Group_7__1__Impl : ( '(' ) ;
    public final void rule__BOTeamGovernance__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7310:1: ( ( '(' ) )
            // InternalBomi.g:7311:1: ( '(' )
            {
            // InternalBomi.g:7311:1: ( '(' )
            // InternalBomi.g:7312:2: '('
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:7321:1: rule__BOTeamGovernance__Group_7__2 : rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3 ;
    public final void rule__BOTeamGovernance__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7325:1: ( rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3 )
            // InternalBomi.g:7326:2: rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:7333:1: rule__BOTeamGovernance__Group_7__2__Impl : ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2 ) ) ;
    public final void rule__BOTeamGovernance__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7337:1: ( ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2 ) ) )
            // InternalBomi.g:7338:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2 ) )
            {
            // InternalBomi.g:7338:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2 ) )
            // InternalBomi.g:7339:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_7_2()); 
            // InternalBomi.g:7340:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2 )
            // InternalBomi.g:7340:3: rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_7_2()); 

            }


            }

        }
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
    // InternalBomi.g:7348:1: rule__BOTeamGovernance__Group_7__3 : rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4 ;
    public final void rule__BOTeamGovernance__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7352:1: ( rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4 )
            // InternalBomi.g:7353:2: rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:7360:1: rule__BOTeamGovernance__Group_7__3__Impl : ( ( rule__BOTeamGovernance__Group_7_3__0 )* ) ;
    public final void rule__BOTeamGovernance__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7364:1: ( ( ( rule__BOTeamGovernance__Group_7_3__0 )* ) )
            // InternalBomi.g:7365:1: ( ( rule__BOTeamGovernance__Group_7_3__0 )* )
            {
            // InternalBomi.g:7365:1: ( ( rule__BOTeamGovernance__Group_7_3__0 )* )
            // InternalBomi.g:7366:2: ( rule__BOTeamGovernance__Group_7_3__0 )*
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_7_3()); 
            // InternalBomi.g:7367:2: ( rule__BOTeamGovernance__Group_7_3__0 )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==34) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalBomi.g:7367:3: rule__BOTeamGovernance__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOTeamGovernance__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // InternalBomi.g:7375:1: rule__BOTeamGovernance__Group_7__4 : rule__BOTeamGovernance__Group_7__4__Impl ;
    public final void rule__BOTeamGovernance__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7379:1: ( rule__BOTeamGovernance__Group_7__4__Impl )
            // InternalBomi.g:7380:2: rule__BOTeamGovernance__Group_7__4__Impl
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
    // InternalBomi.g:7386:1: rule__BOTeamGovernance__Group_7__4__Impl : ( ')' ) ;
    public final void rule__BOTeamGovernance__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7390:1: ( ( ')' ) )
            // InternalBomi.g:7391:1: ( ')' )
            {
            // InternalBomi.g:7391:1: ( ')' )
            // InternalBomi.g:7392:2: ')'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_7_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:7402:1: rule__BOTeamGovernance__Group_7_3__0 : rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1 ;
    public final void rule__BOTeamGovernance__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7406:1: ( rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1 )
            // InternalBomi.g:7407:2: rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:7414:1: rule__BOTeamGovernance__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BOTeamGovernance__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7418:1: ( ( ',' ) )
            // InternalBomi.g:7419:1: ( ',' )
            {
            // InternalBomi.g:7419:1: ( ',' )
            // InternalBomi.g:7420:2: ','
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_7_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:7429:1: rule__BOTeamGovernance__Group_7_3__1 : rule__BOTeamGovernance__Group_7_3__1__Impl ;
    public final void rule__BOTeamGovernance__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7433:1: ( rule__BOTeamGovernance__Group_7_3__1__Impl )
            // InternalBomi.g:7434:2: rule__BOTeamGovernance__Group_7_3__1__Impl
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
    // InternalBomi.g:7440:1: rule__BOTeamGovernance__Group_7_3__1__Impl : ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7444:1: ( ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1 ) ) )
            // InternalBomi.g:7445:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1 ) )
            {
            // InternalBomi.g:7445:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1 ) )
            // InternalBomi.g:7446:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_7_3_1()); 
            // InternalBomi.g:7447:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1 )
            // InternalBomi.g:7447:3: rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalBomi.g:7456:1: rule__BOTeamGovernance__Group_8__0 : rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1 ;
    public final void rule__BOTeamGovernance__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7460:1: ( rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1 )
            // InternalBomi.g:7461:2: rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBomi.g:7468:1: rule__BOTeamGovernance__Group_8__0__Impl : ( 'governanceTeams' ) ;
    public final void rule__BOTeamGovernance__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7472:1: ( ( 'governanceTeams' ) )
            // InternalBomi.g:7473:1: ( 'governanceTeams' )
            {
            // InternalBomi.g:7473:1: ( 'governanceTeams' )
            // InternalBomi.g:7474:2: 'governanceTeams'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsKeyword_8_0()); 

            }


            }

        }
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
    // InternalBomi.g:7483:1: rule__BOTeamGovernance__Group_8__1 : rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2 ;
    public final void rule__BOTeamGovernance__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7487:1: ( rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2 )
            // InternalBomi.g:7488:2: rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:7495:1: rule__BOTeamGovernance__Group_8__1__Impl : ( '(' ) ;
    public final void rule__BOTeamGovernance__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7499:1: ( ( '(' ) )
            // InternalBomi.g:7500:1: ( '(' )
            {
            // InternalBomi.g:7500:1: ( '(' )
            // InternalBomi.g:7501:2: '('
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:7510:1: rule__BOTeamGovernance__Group_8__2 : rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3 ;
    public final void rule__BOTeamGovernance__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7514:1: ( rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3 )
            // InternalBomi.g:7515:2: rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:7522:1: rule__BOTeamGovernance__Group_8__2__Impl : ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2 ) ) ;
    public final void rule__BOTeamGovernance__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7526:1: ( ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2 ) ) )
            // InternalBomi.g:7527:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2 ) )
            {
            // InternalBomi.g:7527:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2 ) )
            // InternalBomi.g:7528:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_8_2()); 
            // InternalBomi.g:7529:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2 )
            // InternalBomi.g:7529:3: rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_8_2()); 

            }


            }

        }
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
    // InternalBomi.g:7537:1: rule__BOTeamGovernance__Group_8__3 : rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4 ;
    public final void rule__BOTeamGovernance__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7541:1: ( rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4 )
            // InternalBomi.g:7542:2: rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBomi.g:7549:1: rule__BOTeamGovernance__Group_8__3__Impl : ( ( rule__BOTeamGovernance__Group_8_3__0 )* ) ;
    public final void rule__BOTeamGovernance__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7553:1: ( ( ( rule__BOTeamGovernance__Group_8_3__0 )* ) )
            // InternalBomi.g:7554:1: ( ( rule__BOTeamGovernance__Group_8_3__0 )* )
            {
            // InternalBomi.g:7554:1: ( ( rule__BOTeamGovernance__Group_8_3__0 )* )
            // InternalBomi.g:7555:2: ( rule__BOTeamGovernance__Group_8_3__0 )*
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_8_3()); 
            // InternalBomi.g:7556:2: ( rule__BOTeamGovernance__Group_8_3__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==34) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalBomi.g:7556:3: rule__BOTeamGovernance__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOTeamGovernance__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalBomi.g:7564:1: rule__BOTeamGovernance__Group_8__4 : rule__BOTeamGovernance__Group_8__4__Impl ;
    public final void rule__BOTeamGovernance__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7568:1: ( rule__BOTeamGovernance__Group_8__4__Impl )
            // InternalBomi.g:7569:2: rule__BOTeamGovernance__Group_8__4__Impl
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
    // InternalBomi.g:7575:1: rule__BOTeamGovernance__Group_8__4__Impl : ( ')' ) ;
    public final void rule__BOTeamGovernance__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7579:1: ( ( ')' ) )
            // InternalBomi.g:7580:1: ( ')' )
            {
            // InternalBomi.g:7580:1: ( ')' )
            // InternalBomi.g:7581:2: ')'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_8_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:7591:1: rule__BOTeamGovernance__Group_8_3__0 : rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1 ;
    public final void rule__BOTeamGovernance__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7595:1: ( rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1 )
            // InternalBomi.g:7596:2: rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:7603:1: rule__BOTeamGovernance__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__BOTeamGovernance__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7607:1: ( ( ',' ) )
            // InternalBomi.g:7608:1: ( ',' )
            {
            // InternalBomi.g:7608:1: ( ',' )
            // InternalBomi.g:7609:2: ','
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_8_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:7618:1: rule__BOTeamGovernance__Group_8_3__1 : rule__BOTeamGovernance__Group_8_3__1__Impl ;
    public final void rule__BOTeamGovernance__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7622:1: ( rule__BOTeamGovernance__Group_8_3__1__Impl )
            // InternalBomi.g:7623:2: rule__BOTeamGovernance__Group_8_3__1__Impl
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
    // InternalBomi.g:7629:1: rule__BOTeamGovernance__Group_8_3__1__Impl : ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7633:1: ( ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1 ) ) )
            // InternalBomi.g:7634:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1 ) )
            {
            // InternalBomi.g:7634:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1 ) )
            // InternalBomi.g:7635:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_8_3_1()); 
            // InternalBomi.g:7636:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1 )
            // InternalBomi.g:7636:3: rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_8_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Driver__Group__0"
    // InternalBomi.g:7645:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7649:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalBomi.g:7650:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBomi.g:7657:1: rule__Driver__Group__0__Impl : ( () ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7661:1: ( ( () ) )
            // InternalBomi.g:7662:1: ( () )
            {
            // InternalBomi.g:7662:1: ( () )
            // InternalBomi.g:7663:2: ()
            {
             before(grammarAccess.getDriverAccess().getDriverAction_0()); 
            // InternalBomi.g:7664:2: ()
            // InternalBomi.g:7664:3: 
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
    // InternalBomi.g:7672:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7676:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalBomi.g:7677:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBomi.g:7684:1: rule__Driver__Group__1__Impl : ( 'Driver' ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7688:1: ( ( 'Driver' ) )
            // InternalBomi.g:7689:1: ( 'Driver' )
            {
            // InternalBomi.g:7689:1: ( 'Driver' )
            // InternalBomi.g:7690:2: 'Driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_1()); 
            match(input,79,FOLLOW_2); 
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
    // InternalBomi.g:7699:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7703:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalBomi.g:7704:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
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
    // InternalBomi.g:7711:1: rule__Driver__Group__2__Impl : ( ( rule__Driver__NameAssignment_2 ) ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7715:1: ( ( ( rule__Driver__NameAssignment_2 ) ) )
            // InternalBomi.g:7716:1: ( ( rule__Driver__NameAssignment_2 ) )
            {
            // InternalBomi.g:7716:1: ( ( rule__Driver__NameAssignment_2 ) )
            // InternalBomi.g:7717:2: ( rule__Driver__NameAssignment_2 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_2()); 
            // InternalBomi.g:7718:2: ( rule__Driver__NameAssignment_2 )
            // InternalBomi.g:7718:3: rule__Driver__NameAssignment_2
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
    // InternalBomi.g:7726:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7730:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalBomi.g:7731:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalBomi.g:7738:1: rule__Driver__Group__3__Impl : ( '{' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7742:1: ( ( '{' ) )
            // InternalBomi.g:7743:1: ( '{' )
            {
            // InternalBomi.g:7743:1: ( '{' )
            // InternalBomi.g:7744:2: '{'
            {
             before(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBomi.g:7753:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7757:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalBomi.g:7758:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalBomi.g:7765:1: rule__Driver__Group__4__Impl : ( ( rule__Driver__Group_4__0 )? ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7769:1: ( ( ( rule__Driver__Group_4__0 )? ) )
            // InternalBomi.g:7770:1: ( ( rule__Driver__Group_4__0 )? )
            {
            // InternalBomi.g:7770:1: ( ( rule__Driver__Group_4__0 )? )
            // InternalBomi.g:7771:2: ( rule__Driver__Group_4__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_4()); 
            // InternalBomi.g:7772:2: ( rule__Driver__Group_4__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==80) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBomi.g:7772:3: rule__Driver__Group_4__0
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
    // InternalBomi.g:7780:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7784:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalBomi.g:7785:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalBomi.g:7792:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__Group_5__0 )? ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7796:1: ( ( ( rule__Driver__Group_5__0 )? ) )
            // InternalBomi.g:7797:1: ( ( rule__Driver__Group_5__0 )? )
            {
            // InternalBomi.g:7797:1: ( ( rule__Driver__Group_5__0 )? )
            // InternalBomi.g:7798:2: ( rule__Driver__Group_5__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_5()); 
            // InternalBomi.g:7799:2: ( rule__Driver__Group_5__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==81) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalBomi.g:7799:3: rule__Driver__Group_5__0
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
    // InternalBomi.g:7807:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl rule__Driver__Group__7 ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7811:1: ( rule__Driver__Group__6__Impl rule__Driver__Group__7 )
            // InternalBomi.g:7812:2: rule__Driver__Group__6__Impl rule__Driver__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalBomi.g:7819:1: rule__Driver__Group__6__Impl : ( ( rule__Driver__Group_6__0 )? ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7823:1: ( ( ( rule__Driver__Group_6__0 )? ) )
            // InternalBomi.g:7824:1: ( ( rule__Driver__Group_6__0 )? )
            {
            // InternalBomi.g:7824:1: ( ( rule__Driver__Group_6__0 )? )
            // InternalBomi.g:7825:2: ( rule__Driver__Group_6__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_6()); 
            // InternalBomi.g:7826:2: ( rule__Driver__Group_6__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==82) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalBomi.g:7826:3: rule__Driver__Group_6__0
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
    // InternalBomi.g:7834:1: rule__Driver__Group__7 : rule__Driver__Group__7__Impl rule__Driver__Group__8 ;
    public final void rule__Driver__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7838:1: ( rule__Driver__Group__7__Impl rule__Driver__Group__8 )
            // InternalBomi.g:7839:2: rule__Driver__Group__7__Impl rule__Driver__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalBomi.g:7846:1: rule__Driver__Group__7__Impl : ( ( rule__Driver__Group_7__0 )? ) ;
    public final void rule__Driver__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7850:1: ( ( ( rule__Driver__Group_7__0 )? ) )
            // InternalBomi.g:7851:1: ( ( rule__Driver__Group_7__0 )? )
            {
            // InternalBomi.g:7851:1: ( ( rule__Driver__Group_7__0 )? )
            // InternalBomi.g:7852:2: ( rule__Driver__Group_7__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_7()); 
            // InternalBomi.g:7853:2: ( rule__Driver__Group_7__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==83) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalBomi.g:7853:3: rule__Driver__Group_7__0
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
    // InternalBomi.g:7861:1: rule__Driver__Group__8 : rule__Driver__Group__8__Impl rule__Driver__Group__9 ;
    public final void rule__Driver__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7865:1: ( rule__Driver__Group__8__Impl rule__Driver__Group__9 )
            // InternalBomi.g:7866:2: rule__Driver__Group__8__Impl rule__Driver__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__Driver__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__9();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:7873:1: rule__Driver__Group__8__Impl : ( ( rule__Driver__Group_8__0 )? ) ;
    public final void rule__Driver__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7877:1: ( ( ( rule__Driver__Group_8__0 )? ) )
            // InternalBomi.g:7878:1: ( ( rule__Driver__Group_8__0 )? )
            {
            // InternalBomi.g:7878:1: ( ( rule__Driver__Group_8__0 )? )
            // InternalBomi.g:7879:2: ( rule__Driver__Group_8__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_8()); 
            // InternalBomi.g:7880:2: ( rule__Driver__Group_8__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==84) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalBomi.g:7880:3: rule__Driver__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Driver__Group__9"
    // InternalBomi.g:7888:1: rule__Driver__Group__9 : rule__Driver__Group__9__Impl rule__Driver__Group__10 ;
    public final void rule__Driver__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7892:1: ( rule__Driver__Group__9__Impl rule__Driver__Group__10 )
            // InternalBomi.g:7893:2: rule__Driver__Group__9__Impl rule__Driver__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Driver__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__9"


    // $ANTLR start "rule__Driver__Group__9__Impl"
    // InternalBomi.g:7900:1: rule__Driver__Group__9__Impl : ( ( rule__Driver__Group_9__0 )? ) ;
    public final void rule__Driver__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7904:1: ( ( ( rule__Driver__Group_9__0 )? ) )
            // InternalBomi.g:7905:1: ( ( rule__Driver__Group_9__0 )? )
            {
            // InternalBomi.g:7905:1: ( ( rule__Driver__Group_9__0 )? )
            // InternalBomi.g:7906:2: ( rule__Driver__Group_9__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_9()); 
            // InternalBomi.g:7907:2: ( rule__Driver__Group_9__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==85) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalBomi.g:7907:3: rule__Driver__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__9__Impl"


    // $ANTLR start "rule__Driver__Group__10"
    // InternalBomi.g:7915:1: rule__Driver__Group__10 : rule__Driver__Group__10__Impl rule__Driver__Group__11 ;
    public final void rule__Driver__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7919:1: ( rule__Driver__Group__10__Impl rule__Driver__Group__11 )
            // InternalBomi.g:7920:2: rule__Driver__Group__10__Impl rule__Driver__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__Driver__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__10"


    // $ANTLR start "rule__Driver__Group__10__Impl"
    // InternalBomi.g:7927:1: rule__Driver__Group__10__Impl : ( ( rule__Driver__Group_10__0 )? ) ;
    public final void rule__Driver__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7931:1: ( ( ( rule__Driver__Group_10__0 )? ) )
            // InternalBomi.g:7932:1: ( ( rule__Driver__Group_10__0 )? )
            {
            // InternalBomi.g:7932:1: ( ( rule__Driver__Group_10__0 )? )
            // InternalBomi.g:7933:2: ( rule__Driver__Group_10__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_10()); 
            // InternalBomi.g:7934:2: ( rule__Driver__Group_10__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==86) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalBomi.g:7934:3: rule__Driver__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__10__Impl"


    // $ANTLR start "rule__Driver__Group__11"
    // InternalBomi.g:7942:1: rule__Driver__Group__11 : rule__Driver__Group__11__Impl rule__Driver__Group__12 ;
    public final void rule__Driver__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7946:1: ( rule__Driver__Group__11__Impl rule__Driver__Group__12 )
            // InternalBomi.g:7947:2: rule__Driver__Group__11__Impl rule__Driver__Group__12
            {
            pushFollow(FOLLOW_29);
            rule__Driver__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__11"


    // $ANTLR start "rule__Driver__Group__11__Impl"
    // InternalBomi.g:7954:1: rule__Driver__Group__11__Impl : ( ( rule__Driver__Group_11__0 )? ) ;
    public final void rule__Driver__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7958:1: ( ( ( rule__Driver__Group_11__0 )? ) )
            // InternalBomi.g:7959:1: ( ( rule__Driver__Group_11__0 )? )
            {
            // InternalBomi.g:7959:1: ( ( rule__Driver__Group_11__0 )? )
            // InternalBomi.g:7960:2: ( rule__Driver__Group_11__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_11()); 
            // InternalBomi.g:7961:2: ( rule__Driver__Group_11__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==87) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalBomi.g:7961:3: rule__Driver__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Driver__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriverAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__11__Impl"


    // $ANTLR start "rule__Driver__Group__12"
    // InternalBomi.g:7969:1: rule__Driver__Group__12 : rule__Driver__Group__12__Impl ;
    public final void rule__Driver__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7973:1: ( rule__Driver__Group__12__Impl )
            // InternalBomi.g:7974:2: rule__Driver__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__12"


    // $ANTLR start "rule__Driver__Group__12__Impl"
    // InternalBomi.g:7980:1: rule__Driver__Group__12__Impl : ( '}' ) ;
    public final void rule__Driver__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7984:1: ( ( '}' ) )
            // InternalBomi.g:7985:1: ( '}' )
            {
            // InternalBomi.g:7985:1: ( '}' )
            // InternalBomi.g:7986:2: '}'
            {
             before(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__12__Impl"


    // $ANTLR start "rule__Driver__Group_4__0"
    // InternalBomi.g:7996:1: rule__Driver__Group_4__0 : rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1 ;
    public final void rule__Driver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8000:1: ( rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1 )
            // InternalBomi.g:8001:2: rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:8008:1: rule__Driver__Group_4__0__Impl : ( 'driverTypeTechnology' ) ;
    public final void rule__Driver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8012:1: ( ( 'driverTypeTechnology' ) )
            // InternalBomi.g:8013:1: ( 'driverTypeTechnology' )
            {
            // InternalBomi.g:8013:1: ( 'driverTypeTechnology' )
            // InternalBomi.g:8014:2: 'driverTypeTechnology'
            {
             before(grammarAccess.getDriverAccess().getDriverTypeTechnologyKeyword_4_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverTypeTechnologyKeyword_4_0()); 

            }


            }

        }
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
    // InternalBomi.g:8023:1: rule__Driver__Group_4__1 : rule__Driver__Group_4__1__Impl ;
    public final void rule__Driver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8027:1: ( rule__Driver__Group_4__1__Impl )
            // InternalBomi.g:8028:2: rule__Driver__Group_4__1__Impl
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
    // InternalBomi.g:8034:1: rule__Driver__Group_4__1__Impl : ( ( rule__Driver__DriverTypeTechnologyAssignment_4_1 ) ) ;
    public final void rule__Driver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8038:1: ( ( ( rule__Driver__DriverTypeTechnologyAssignment_4_1 ) ) )
            // InternalBomi.g:8039:1: ( ( rule__Driver__DriverTypeTechnologyAssignment_4_1 ) )
            {
            // InternalBomi.g:8039:1: ( ( rule__Driver__DriverTypeTechnologyAssignment_4_1 ) )
            // InternalBomi.g:8040:2: ( rule__Driver__DriverTypeTechnologyAssignment_4_1 )
            {
             before(grammarAccess.getDriverAccess().getDriverTypeTechnologyAssignment_4_1()); 
            // InternalBomi.g:8041:2: ( rule__Driver__DriverTypeTechnologyAssignment_4_1 )
            // InternalBomi.g:8041:3: rule__Driver__DriverTypeTechnologyAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DriverTypeTechnologyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDriverTypeTechnologyAssignment_4_1()); 

            }


            }

        }
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
    // InternalBomi.g:8050:1: rule__Driver__Group_5__0 : rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1 ;
    public final void rule__Driver__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8054:1: ( rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1 )
            // InternalBomi.g:8055:2: rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:8062:1: rule__Driver__Group_5__0__Impl : ( 'driverTypeProcess' ) ;
    public final void rule__Driver__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8066:1: ( ( 'driverTypeProcess' ) )
            // InternalBomi.g:8067:1: ( 'driverTypeProcess' )
            {
            // InternalBomi.g:8067:1: ( 'driverTypeProcess' )
            // InternalBomi.g:8068:2: 'driverTypeProcess'
            {
             before(grammarAccess.getDriverAccess().getDriverTypeProcessKeyword_5_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverTypeProcessKeyword_5_0()); 

            }


            }

        }
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
    // InternalBomi.g:8077:1: rule__Driver__Group_5__1 : rule__Driver__Group_5__1__Impl ;
    public final void rule__Driver__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8081:1: ( rule__Driver__Group_5__1__Impl )
            // InternalBomi.g:8082:2: rule__Driver__Group_5__1__Impl
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
    // InternalBomi.g:8088:1: rule__Driver__Group_5__1__Impl : ( ( rule__Driver__DriverTypeProcessAssignment_5_1 ) ) ;
    public final void rule__Driver__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8092:1: ( ( ( rule__Driver__DriverTypeProcessAssignment_5_1 ) ) )
            // InternalBomi.g:8093:1: ( ( rule__Driver__DriverTypeProcessAssignment_5_1 ) )
            {
            // InternalBomi.g:8093:1: ( ( rule__Driver__DriverTypeProcessAssignment_5_1 ) )
            // InternalBomi.g:8094:2: ( rule__Driver__DriverTypeProcessAssignment_5_1 )
            {
             before(grammarAccess.getDriverAccess().getDriverTypeProcessAssignment_5_1()); 
            // InternalBomi.g:8095:2: ( rule__Driver__DriverTypeProcessAssignment_5_1 )
            // InternalBomi.g:8095:3: rule__Driver__DriverTypeProcessAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DriverTypeProcessAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDriverTypeProcessAssignment_5_1()); 

            }


            }

        }
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
    // InternalBomi.g:8104:1: rule__Driver__Group_6__0 : rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1 ;
    public final void rule__Driver__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8108:1: ( rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1 )
            // InternalBomi.g:8109:2: rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:8116:1: rule__Driver__Group_6__0__Impl : ( 'driverTypeOrganizational' ) ;
    public final void rule__Driver__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8120:1: ( ( 'driverTypeOrganizational' ) )
            // InternalBomi.g:8121:1: ( 'driverTypeOrganizational' )
            {
            // InternalBomi.g:8121:1: ( 'driverTypeOrganizational' )
            // InternalBomi.g:8122:2: 'driverTypeOrganizational'
            {
             before(grammarAccess.getDriverAccess().getDriverTypeOrganizationalKeyword_6_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverTypeOrganizationalKeyword_6_0()); 

            }


            }

        }
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
    // InternalBomi.g:8131:1: rule__Driver__Group_6__1 : rule__Driver__Group_6__1__Impl ;
    public final void rule__Driver__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8135:1: ( rule__Driver__Group_6__1__Impl )
            // InternalBomi.g:8136:2: rule__Driver__Group_6__1__Impl
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
    // InternalBomi.g:8142:1: rule__Driver__Group_6__1__Impl : ( ( rule__Driver__DriverTypeOrganizationalAssignment_6_1 ) ) ;
    public final void rule__Driver__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8146:1: ( ( ( rule__Driver__DriverTypeOrganizationalAssignment_6_1 ) ) )
            // InternalBomi.g:8147:1: ( ( rule__Driver__DriverTypeOrganizationalAssignment_6_1 ) )
            {
            // InternalBomi.g:8147:1: ( ( rule__Driver__DriverTypeOrganizationalAssignment_6_1 ) )
            // InternalBomi.g:8148:2: ( rule__Driver__DriverTypeOrganizationalAssignment_6_1 )
            {
             before(grammarAccess.getDriverAccess().getDriverTypeOrganizationalAssignment_6_1()); 
            // InternalBomi.g:8149:2: ( rule__Driver__DriverTypeOrganizationalAssignment_6_1 )
            // InternalBomi.g:8149:3: rule__Driver__DriverTypeOrganizationalAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DriverTypeOrganizationalAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDriverTypeOrganizationalAssignment_6_1()); 

            }


            }

        }
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
    // InternalBomi.g:8158:1: rule__Driver__Group_7__0 : rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1 ;
    public final void rule__Driver__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8162:1: ( rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1 )
            // InternalBomi.g:8163:2: rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBomi.g:8170:1: rule__Driver__Group_7__0__Impl : ( 'distanceTypeCultural' ) ;
    public final void rule__Driver__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8174:1: ( ( 'distanceTypeCultural' ) )
            // InternalBomi.g:8175:1: ( 'distanceTypeCultural' )
            {
            // InternalBomi.g:8175:1: ( 'distanceTypeCultural' )
            // InternalBomi.g:8176:2: 'distanceTypeCultural'
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeCulturalKeyword_7_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDistanceTypeCulturalKeyword_7_0()); 

            }


            }

        }
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
    // InternalBomi.g:8185:1: rule__Driver__Group_7__1 : rule__Driver__Group_7__1__Impl ;
    public final void rule__Driver__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8189:1: ( rule__Driver__Group_7__1__Impl )
            // InternalBomi.g:8190:2: rule__Driver__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:8196:1: rule__Driver__Group_7__1__Impl : ( ( rule__Driver__DistanceTypeCulturalAssignment_7_1 ) ) ;
    public final void rule__Driver__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8200:1: ( ( ( rule__Driver__DistanceTypeCulturalAssignment_7_1 ) ) )
            // InternalBomi.g:8201:1: ( ( rule__Driver__DistanceTypeCulturalAssignment_7_1 ) )
            {
            // InternalBomi.g:8201:1: ( ( rule__Driver__DistanceTypeCulturalAssignment_7_1 ) )
            // InternalBomi.g:8202:2: ( rule__Driver__DistanceTypeCulturalAssignment_7_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeCulturalAssignment_7_1()); 
            // InternalBomi.g:8203:2: ( rule__Driver__DistanceTypeCulturalAssignment_7_1 )
            // InternalBomi.g:8203:3: rule__Driver__DistanceTypeCulturalAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DistanceTypeCulturalAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDistanceTypeCulturalAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Driver__Group_8__0"
    // InternalBomi.g:8212:1: rule__Driver__Group_8__0 : rule__Driver__Group_8__0__Impl rule__Driver__Group_8__1 ;
    public final void rule__Driver__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8216:1: ( rule__Driver__Group_8__0__Impl rule__Driver__Group_8__1 )
            // InternalBomi.g:8217:2: rule__Driver__Group_8__0__Impl rule__Driver__Group_8__1
            {
            pushFollow(FOLLOW_18);
            rule__Driver__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_8__0"


    // $ANTLR start "rule__Driver__Group_8__0__Impl"
    // InternalBomi.g:8224:1: rule__Driver__Group_8__0__Impl : ( 'distanceTypeGeographical' ) ;
    public final void rule__Driver__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8228:1: ( ( 'distanceTypeGeographical' ) )
            // InternalBomi.g:8229:1: ( 'distanceTypeGeographical' )
            {
            // InternalBomi.g:8229:1: ( 'distanceTypeGeographical' )
            // InternalBomi.g:8230:2: 'distanceTypeGeographical'
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeGeographicalKeyword_8_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDistanceTypeGeographicalKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_8__0__Impl"


    // $ANTLR start "rule__Driver__Group_8__1"
    // InternalBomi.g:8239:1: rule__Driver__Group_8__1 : rule__Driver__Group_8__1__Impl ;
    public final void rule__Driver__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8243:1: ( rule__Driver__Group_8__1__Impl )
            // InternalBomi.g:8244:2: rule__Driver__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_8__1"


    // $ANTLR start "rule__Driver__Group_8__1__Impl"
    // InternalBomi.g:8250:1: rule__Driver__Group_8__1__Impl : ( ( rule__Driver__DistanceTypeGeographicalAssignment_8_1 ) ) ;
    public final void rule__Driver__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8254:1: ( ( ( rule__Driver__DistanceTypeGeographicalAssignment_8_1 ) ) )
            // InternalBomi.g:8255:1: ( ( rule__Driver__DistanceTypeGeographicalAssignment_8_1 ) )
            {
            // InternalBomi.g:8255:1: ( ( rule__Driver__DistanceTypeGeographicalAssignment_8_1 ) )
            // InternalBomi.g:8256:2: ( rule__Driver__DistanceTypeGeographicalAssignment_8_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeGeographicalAssignment_8_1()); 
            // InternalBomi.g:8257:2: ( rule__Driver__DistanceTypeGeographicalAssignment_8_1 )
            // InternalBomi.g:8257:3: rule__Driver__DistanceTypeGeographicalAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DistanceTypeGeographicalAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDistanceTypeGeographicalAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_8__1__Impl"


    // $ANTLR start "rule__Driver__Group_9__0"
    // InternalBomi.g:8266:1: rule__Driver__Group_9__0 : rule__Driver__Group_9__0__Impl rule__Driver__Group_9__1 ;
    public final void rule__Driver__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8270:1: ( rule__Driver__Group_9__0__Impl rule__Driver__Group_9__1 )
            // InternalBomi.g:8271:2: rule__Driver__Group_9__0__Impl rule__Driver__Group_9__1
            {
            pushFollow(FOLLOW_18);
            rule__Driver__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_9__0"


    // $ANTLR start "rule__Driver__Group_9__0__Impl"
    // InternalBomi.g:8278:1: rule__Driver__Group_9__0__Impl : ( 'distanceTypeOrganizational' ) ;
    public final void rule__Driver__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8282:1: ( ( 'distanceTypeOrganizational' ) )
            // InternalBomi.g:8283:1: ( 'distanceTypeOrganizational' )
            {
            // InternalBomi.g:8283:1: ( 'distanceTypeOrganizational' )
            // InternalBomi.g:8284:2: 'distanceTypeOrganizational'
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeOrganizationalKeyword_9_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDistanceTypeOrganizationalKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_9__0__Impl"


    // $ANTLR start "rule__Driver__Group_9__1"
    // InternalBomi.g:8293:1: rule__Driver__Group_9__1 : rule__Driver__Group_9__1__Impl ;
    public final void rule__Driver__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8297:1: ( rule__Driver__Group_9__1__Impl )
            // InternalBomi.g:8298:2: rule__Driver__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_9__1"


    // $ANTLR start "rule__Driver__Group_9__1__Impl"
    // InternalBomi.g:8304:1: rule__Driver__Group_9__1__Impl : ( ( rule__Driver__DistanceTypeOrganizationalAssignment_9_1 ) ) ;
    public final void rule__Driver__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8308:1: ( ( ( rule__Driver__DistanceTypeOrganizationalAssignment_9_1 ) ) )
            // InternalBomi.g:8309:1: ( ( rule__Driver__DistanceTypeOrganizationalAssignment_9_1 ) )
            {
            // InternalBomi.g:8309:1: ( ( rule__Driver__DistanceTypeOrganizationalAssignment_9_1 ) )
            // InternalBomi.g:8310:2: ( rule__Driver__DistanceTypeOrganizationalAssignment_9_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeOrganizationalAssignment_9_1()); 
            // InternalBomi.g:8311:2: ( rule__Driver__DistanceTypeOrganizationalAssignment_9_1 )
            // InternalBomi.g:8311:3: rule__Driver__DistanceTypeOrganizationalAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DistanceTypeOrganizationalAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDistanceTypeOrganizationalAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_9__1__Impl"


    // $ANTLR start "rule__Driver__Group_10__0"
    // InternalBomi.g:8320:1: rule__Driver__Group_10__0 : rule__Driver__Group_10__0__Impl rule__Driver__Group_10__1 ;
    public final void rule__Driver__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8324:1: ( rule__Driver__Group_10__0__Impl rule__Driver__Group_10__1 )
            // InternalBomi.g:8325:2: rule__Driver__Group_10__0__Impl rule__Driver__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__Driver__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_10__0"


    // $ANTLR start "rule__Driver__Group_10__0__Impl"
    // InternalBomi.g:8332:1: rule__Driver__Group_10__0__Impl : ( 'distanceSize' ) ;
    public final void rule__Driver__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8336:1: ( ( 'distanceSize' ) )
            // InternalBomi.g:8337:1: ( 'distanceSize' )
            {
            // InternalBomi.g:8337:1: ( 'distanceSize' )
            // InternalBomi.g:8338:2: 'distanceSize'
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeKeyword_10_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDistanceSizeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_10__0__Impl"


    // $ANTLR start "rule__Driver__Group_10__1"
    // InternalBomi.g:8347:1: rule__Driver__Group_10__1 : rule__Driver__Group_10__1__Impl ;
    public final void rule__Driver__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8351:1: ( rule__Driver__Group_10__1__Impl )
            // InternalBomi.g:8352:2: rule__Driver__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_10__1"


    // $ANTLR start "rule__Driver__Group_10__1__Impl"
    // InternalBomi.g:8358:1: rule__Driver__Group_10__1__Impl : ( ( rule__Driver__DistanceSizeAssignment_10_1 ) ) ;
    public final void rule__Driver__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8362:1: ( ( ( rule__Driver__DistanceSizeAssignment_10_1 ) ) )
            // InternalBomi.g:8363:1: ( ( rule__Driver__DistanceSizeAssignment_10_1 ) )
            {
            // InternalBomi.g:8363:1: ( ( rule__Driver__DistanceSizeAssignment_10_1 ) )
            // InternalBomi.g:8364:2: ( rule__Driver__DistanceSizeAssignment_10_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeAssignment_10_1()); 
            // InternalBomi.g:8365:2: ( rule__Driver__DistanceSizeAssignment_10_1 )
            // InternalBomi.g:8365:3: rule__Driver__DistanceSizeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DistanceSizeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDistanceSizeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_10__1__Impl"


    // $ANTLR start "rule__Driver__Group_11__0"
    // InternalBomi.g:8374:1: rule__Driver__Group_11__0 : rule__Driver__Group_11__0__Impl rule__Driver__Group_11__1 ;
    public final void rule__Driver__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8378:1: ( rule__Driver__Group_11__0__Impl rule__Driver__Group_11__1 )
            // InternalBomi.g:8379:2: rule__Driver__Group_11__0__Impl rule__Driver__Group_11__1
            {
            pushFollow(FOLLOW_19);
            rule__Driver__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__0"


    // $ANTLR start "rule__Driver__Group_11__0__Impl"
    // InternalBomi.g:8386:1: rule__Driver__Group_11__0__Impl : ( 'drivesMIs' ) ;
    public final void rule__Driver__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8390:1: ( ( 'drivesMIs' ) )
            // InternalBomi.g:8391:1: ( 'drivesMIs' )
            {
            // InternalBomi.g:8391:1: ( 'drivesMIs' )
            // InternalBomi.g:8392:2: 'drivesMIs'
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsKeyword_11_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDrivesMIsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__0__Impl"


    // $ANTLR start "rule__Driver__Group_11__1"
    // InternalBomi.g:8401:1: rule__Driver__Group_11__1 : rule__Driver__Group_11__1__Impl rule__Driver__Group_11__2 ;
    public final void rule__Driver__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8405:1: ( rule__Driver__Group_11__1__Impl rule__Driver__Group_11__2 )
            // InternalBomi.g:8406:2: rule__Driver__Group_11__1__Impl rule__Driver__Group_11__2
            {
            pushFollow(FOLLOW_15);
            rule__Driver__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__1"


    // $ANTLR start "rule__Driver__Group_11__1__Impl"
    // InternalBomi.g:8413:1: rule__Driver__Group_11__1__Impl : ( '(' ) ;
    public final void rule__Driver__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8417:1: ( ( '(' ) )
            // InternalBomi.g:8418:1: ( '(' )
            {
            // InternalBomi.g:8418:1: ( '(' )
            // InternalBomi.g:8419:2: '('
            {
             before(grammarAccess.getDriverAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__1__Impl"


    // $ANTLR start "rule__Driver__Group_11__2"
    // InternalBomi.g:8428:1: rule__Driver__Group_11__2 : rule__Driver__Group_11__2__Impl rule__Driver__Group_11__3 ;
    public final void rule__Driver__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8432:1: ( rule__Driver__Group_11__2__Impl rule__Driver__Group_11__3 )
            // InternalBomi.g:8433:2: rule__Driver__Group_11__2__Impl rule__Driver__Group_11__3
            {
            pushFollow(FOLLOW_20);
            rule__Driver__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__2"


    // $ANTLR start "rule__Driver__Group_11__2__Impl"
    // InternalBomi.g:8440:1: rule__Driver__Group_11__2__Impl : ( ( rule__Driver__DrivesMIsAssignment_11_2 ) ) ;
    public final void rule__Driver__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8444:1: ( ( ( rule__Driver__DrivesMIsAssignment_11_2 ) ) )
            // InternalBomi.g:8445:1: ( ( rule__Driver__DrivesMIsAssignment_11_2 ) )
            {
            // InternalBomi.g:8445:1: ( ( rule__Driver__DrivesMIsAssignment_11_2 ) )
            // InternalBomi.g:8446:2: ( rule__Driver__DrivesMIsAssignment_11_2 )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsAssignment_11_2()); 
            // InternalBomi.g:8447:2: ( rule__Driver__DrivesMIsAssignment_11_2 )
            // InternalBomi.g:8447:3: rule__Driver__DrivesMIsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DrivesMIsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDrivesMIsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__2__Impl"


    // $ANTLR start "rule__Driver__Group_11__3"
    // InternalBomi.g:8455:1: rule__Driver__Group_11__3 : rule__Driver__Group_11__3__Impl rule__Driver__Group_11__4 ;
    public final void rule__Driver__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8459:1: ( rule__Driver__Group_11__3__Impl rule__Driver__Group_11__4 )
            // InternalBomi.g:8460:2: rule__Driver__Group_11__3__Impl rule__Driver__Group_11__4
            {
            pushFollow(FOLLOW_20);
            rule__Driver__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__3"


    // $ANTLR start "rule__Driver__Group_11__3__Impl"
    // InternalBomi.g:8467:1: rule__Driver__Group_11__3__Impl : ( ( rule__Driver__Group_11_3__0 )* ) ;
    public final void rule__Driver__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8471:1: ( ( ( rule__Driver__Group_11_3__0 )* ) )
            // InternalBomi.g:8472:1: ( ( rule__Driver__Group_11_3__0 )* )
            {
            // InternalBomi.g:8472:1: ( ( rule__Driver__Group_11_3__0 )* )
            // InternalBomi.g:8473:2: ( rule__Driver__Group_11_3__0 )*
            {
             before(grammarAccess.getDriverAccess().getGroup_11_3()); 
            // InternalBomi.g:8474:2: ( rule__Driver__Group_11_3__0 )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==34) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalBomi.g:8474:3: rule__Driver__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Driver__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

             after(grammarAccess.getDriverAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__3__Impl"


    // $ANTLR start "rule__Driver__Group_11__4"
    // InternalBomi.g:8482:1: rule__Driver__Group_11__4 : rule__Driver__Group_11__4__Impl ;
    public final void rule__Driver__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8486:1: ( rule__Driver__Group_11__4__Impl )
            // InternalBomi.g:8487:2: rule__Driver__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__4"


    // $ANTLR start "rule__Driver__Group_11__4__Impl"
    // InternalBomi.g:8493:1: rule__Driver__Group_11__4__Impl : ( ')' ) ;
    public final void rule__Driver__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8497:1: ( ( ')' ) )
            // InternalBomi.g:8498:1: ( ')' )
            {
            // InternalBomi.g:8498:1: ( ')' )
            // InternalBomi.g:8499:2: ')'
            {
             before(grammarAccess.getDriverAccess().getRightParenthesisKeyword_11_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11__4__Impl"


    // $ANTLR start "rule__Driver__Group_11_3__0"
    // InternalBomi.g:8509:1: rule__Driver__Group_11_3__0 : rule__Driver__Group_11_3__0__Impl rule__Driver__Group_11_3__1 ;
    public final void rule__Driver__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8513:1: ( rule__Driver__Group_11_3__0__Impl rule__Driver__Group_11_3__1 )
            // InternalBomi.g:8514:2: rule__Driver__Group_11_3__0__Impl rule__Driver__Group_11_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Driver__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11_3__0"


    // $ANTLR start "rule__Driver__Group_11_3__0__Impl"
    // InternalBomi.g:8521:1: rule__Driver__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Driver__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8525:1: ( ( ',' ) )
            // InternalBomi.g:8526:1: ( ',' )
            {
            // InternalBomi.g:8526:1: ( ',' )
            // InternalBomi.g:8527:2: ','
            {
             before(grammarAccess.getDriverAccess().getCommaKeyword_11_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11_3__0__Impl"


    // $ANTLR start "rule__Driver__Group_11_3__1"
    // InternalBomi.g:8536:1: rule__Driver__Group_11_3__1 : rule__Driver__Group_11_3__1__Impl ;
    public final void rule__Driver__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8540:1: ( rule__Driver__Group_11_3__1__Impl )
            // InternalBomi.g:8541:2: rule__Driver__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11_3__1"


    // $ANTLR start "rule__Driver__Group_11_3__1__Impl"
    // InternalBomi.g:8547:1: rule__Driver__Group_11_3__1__Impl : ( ( rule__Driver__DrivesMIsAssignment_11_3_1 ) ) ;
    public final void rule__Driver__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8551:1: ( ( ( rule__Driver__DrivesMIsAssignment_11_3_1 ) ) )
            // InternalBomi.g:8552:1: ( ( rule__Driver__DrivesMIsAssignment_11_3_1 ) )
            {
            // InternalBomi.g:8552:1: ( ( rule__Driver__DrivesMIsAssignment_11_3_1 ) )
            // InternalBomi.g:8553:2: ( rule__Driver__DrivesMIsAssignment_11_3_1 )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsAssignment_11_3_1()); 
            // InternalBomi.g:8554:2: ( rule__Driver__DrivesMIsAssignment_11_3_1 )
            // InternalBomi.g:8554:3: rule__Driver__DrivesMIsAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DrivesMIsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDrivesMIsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group_11_3__1__Impl"


    // $ANTLR start "rule__BOMIModel__BoRoleInteractionsAssignment_1_2"
    // InternalBomi.g:8563:1: rule__BOMIModel__BoRoleInteractionsAssignment_1_2 : ( ruleBORoleInteraction ) ;
    public final void rule__BOMIModel__BoRoleInteractionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8567:1: ( ( ruleBORoleInteraction ) )
            // InternalBomi.g:8568:2: ( ruleBORoleInteraction )
            {
            // InternalBomi.g:8568:2: ( ruleBORoleInteraction )
            // InternalBomi.g:8569:3: ruleBORoleInteraction
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBORoleInteraction();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoRoleInteractionsAssignment_1_2"


    // $ANTLR start "rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1"
    // InternalBomi.g:8578:1: rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1 : ( ruleBORoleInteraction ) ;
    public final void rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8582:1: ( ( ruleBORoleInteraction ) )
            // InternalBomi.g:8583:2: ( ruleBORoleInteraction )
            {
            // InternalBomi.g:8583:2: ( ruleBORoleInteraction )
            // InternalBomi.g:8584:3: ruleBORoleInteraction
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBORoleInteraction();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoRoleInteractionsAssignment_1_3_1"


    // $ANTLR start "rule__BOMIModel__BoundaryObjectsAssignment_2_2"
    // InternalBomi.g:8593:1: rule__BOMIModel__BoundaryObjectsAssignment_2_2 : ( ruleBoundaryObject ) ;
    public final void rule__BOMIModel__BoundaryObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8597:1: ( ( ruleBoundaryObject ) )
            // InternalBomi.g:8598:2: ( ruleBoundaryObject )
            {
            // InternalBomi.g:8598:2: ( ruleBoundaryObject )
            // InternalBomi.g:8599:3: ruleBoundaryObject
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundaryObject();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoundaryObjectsAssignment_2_2"


    // $ANTLR start "rule__BOMIModel__BoundaryObjectsAssignment_2_3_1"
    // InternalBomi.g:8608:1: rule__BOMIModel__BoundaryObjectsAssignment_2_3_1 : ( ruleBoundaryObject ) ;
    public final void rule__BOMIModel__BoundaryObjectsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8612:1: ( ( ruleBoundaryObject ) )
            // InternalBomi.g:8613:2: ( ruleBoundaryObject )
            {
            // InternalBomi.g:8613:2: ( ruleBoundaryObject )
            // InternalBomi.g:8614:3: ruleBoundaryObject
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundaryObject();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoundaryObjectsAssignment_2_3_1"


    // $ANTLR start "rule__BOMIModel__RolesAssignment_3_2"
    // InternalBomi.g:8623:1: rule__BOMIModel__RolesAssignment_3_2 : ( ruleRole ) ;
    public final void rule__BOMIModel__RolesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8627:1: ( ( ruleRole ) )
            // InternalBomi.g:8628:2: ( ruleRole )
            {
            // InternalBomi.g:8628:2: ( ruleRole )
            // InternalBomi.g:8629:3: ruleRole
            {
             before(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__RolesAssignment_3_2"


    // $ANTLR start "rule__BOMIModel__RolesAssignment_3_3_1"
    // InternalBomi.g:8638:1: rule__BOMIModel__RolesAssignment_3_3_1 : ( ruleRole ) ;
    public final void rule__BOMIModel__RolesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8642:1: ( ( ruleRole ) )
            // InternalBomi.g:8643:2: ( ruleRole )
            {
            // InternalBomi.g:8643:2: ( ruleRole )
            // InternalBomi.g:8644:3: ruleRole
            {
             before(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__RolesAssignment_3_3_1"


    // $ANTLR start "rule__BOMIModel__BoMiCoordinationsAssignment_4_2"
    // InternalBomi.g:8653:1: rule__BOMIModel__BoMiCoordinationsAssignment_4_2 : ( ruleBOMICoordination ) ;
    public final void rule__BOMIModel__BoMiCoordinationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8657:1: ( ( ruleBOMICoordination ) )
            // InternalBomi.g:8658:2: ( ruleBOMICoordination )
            {
            // InternalBomi.g:8658:2: ( ruleBOMICoordination )
            // InternalBomi.g:8659:3: ruleBOMICoordination
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOMICoordination();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoMiCoordinationsAssignment_4_2"


    // $ANTLR start "rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1"
    // InternalBomi.g:8668:1: rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1 : ( ruleBOMICoordination ) ;
    public final void rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8672:1: ( ( ruleBOMICoordination ) )
            // InternalBomi.g:8673:2: ( ruleBOMICoordination )
            {
            // InternalBomi.g:8673:2: ( ruleBOMICoordination )
            // InternalBomi.g:8674:3: ruleBOMICoordination
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBOMICoordination();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoMiCoordinationsAssignment_4_3_1"


    // $ANTLR start "rule__BOMIModel__MethodologicalIslandsAssignment_5_2"
    // InternalBomi.g:8683:1: rule__BOMIModel__MethodologicalIslandsAssignment_5_2 : ( ruleMethodologicalIsland ) ;
    public final void rule__BOMIModel__MethodologicalIslandsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8687:1: ( ( ruleMethodologicalIsland ) )
            // InternalBomi.g:8688:2: ( ruleMethodologicalIsland )
            {
            // InternalBomi.g:8688:2: ( ruleMethodologicalIsland )
            // InternalBomi.g:8689:3: ruleMethodologicalIsland
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodologicalIsland();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__MethodologicalIslandsAssignment_5_2"


    // $ANTLR start "rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1"
    // InternalBomi.g:8698:1: rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1 : ( ruleMethodologicalIsland ) ;
    public final void rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8702:1: ( ( ruleMethodologicalIsland ) )
            // InternalBomi.g:8703:2: ( ruleMethodologicalIsland )
            {
            // InternalBomi.g:8703:2: ( ruleMethodologicalIsland )
            // InternalBomi.g:8704:3: ruleMethodologicalIsland
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodologicalIsland();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__MethodologicalIslandsAssignment_5_3_1"


    // $ANTLR start "rule__BOMIModel__GovernanceTeamsAssignment_6_2"
    // InternalBomi.g:8713:1: rule__BOMIModel__GovernanceTeamsAssignment_6_2 : ( ruleGovernanceTeam ) ;
    public final void rule__BOMIModel__GovernanceTeamsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8717:1: ( ( ruleGovernanceTeam ) )
            // InternalBomi.g:8718:2: ( ruleGovernanceTeam )
            {
            // InternalBomi.g:8718:2: ( ruleGovernanceTeam )
            // InternalBomi.g:8719:3: ruleGovernanceTeam
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGovernanceTeam();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__GovernanceTeamsAssignment_6_2"


    // $ANTLR start "rule__BOMIModel__GovernanceTeamsAssignment_6_3_1"
    // InternalBomi.g:8728:1: rule__BOMIModel__GovernanceTeamsAssignment_6_3_1 : ( ruleGovernanceTeam ) ;
    public final void rule__BOMIModel__GovernanceTeamsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8732:1: ( ( ruleGovernanceTeam ) )
            // InternalBomi.g:8733:2: ( ruleGovernanceTeam )
            {
            // InternalBomi.g:8733:2: ( ruleGovernanceTeam )
            // InternalBomi.g:8734:3: ruleGovernanceTeam
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGovernanceTeam();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__GovernanceTeamsAssignment_6_3_1"


    // $ANTLR start "rule__BOMIModel__BoTeamGovernancesAssignment_7_2"
    // InternalBomi.g:8743:1: rule__BOMIModel__BoTeamGovernancesAssignment_7_2 : ( ruleBOTeamGovernance ) ;
    public final void rule__BOMIModel__BoTeamGovernancesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8747:1: ( ( ruleBOTeamGovernance ) )
            // InternalBomi.g:8748:2: ( ruleBOTeamGovernance )
            {
            // InternalBomi.g:8748:2: ( ruleBOTeamGovernance )
            // InternalBomi.g:8749:3: ruleBOTeamGovernance
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOTeamGovernance();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoTeamGovernancesAssignment_7_2"


    // $ANTLR start "rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1"
    // InternalBomi.g:8758:1: rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1 : ( ruleBOTeamGovernance ) ;
    public final void rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8762:1: ( ( ruleBOTeamGovernance ) )
            // InternalBomi.g:8763:2: ( ruleBOTeamGovernance )
            {
            // InternalBomi.g:8763:2: ( ruleBOTeamGovernance )
            // InternalBomi.g:8764:3: ruleBOTeamGovernance
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBOTeamGovernance();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__BoTeamGovernancesAssignment_7_3_1"


    // $ANTLR start "rule__BOMIModel__DriversAssignment_8_2"
    // InternalBomi.g:8773:1: rule__BOMIModel__DriversAssignment_8_2 : ( ruleDriver ) ;
    public final void rule__BOMIModel__DriversAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8777:1: ( ( ruleDriver ) )
            // InternalBomi.g:8778:2: ( ruleDriver )
            {
            // InternalBomi.g:8778:2: ( ruleDriver )
            // InternalBomi.g:8779:3: ruleDriver
            {
             before(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDriver();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__DriversAssignment_8_2"


    // $ANTLR start "rule__BOMIModel__DriversAssignment_8_3_1"
    // InternalBomi.g:8788:1: rule__BOMIModel__DriversAssignment_8_3_1 : ( ruleDriver ) ;
    public final void rule__BOMIModel__DriversAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8792:1: ( ( ruleDriver ) )
            // InternalBomi.g:8793:2: ( ruleDriver )
            {
            // InternalBomi.g:8793:2: ( ruleDriver )
            // InternalBomi.g:8794:3: ruleDriver
            {
             before(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDriver();

            state._fsp--;

             after(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOMIModel__DriversAssignment_8_3_1"


    // $ANTLR start "rule__BORoleInteraction__NameAssignment_2"
    // InternalBomi.g:8803:1: rule__BORoleInteraction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BORoleInteraction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8807:1: ( ( ruleEString ) )
            // InternalBomi.g:8808:2: ( ruleEString )
            {
            // InternalBomi.g:8808:2: ( ruleEString )
            // InternalBomi.g:8809:3: ruleEString
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
    // InternalBomi.g:8818:1: rule__BORoleInteraction__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BORoleInteraction__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8822:1: ( ( ruleEString ) )
            // InternalBomi.g:8823:2: ( ruleEString )
            {
            // InternalBomi.g:8823:2: ( ruleEString )
            // InternalBomi.g:8824:3: ruleEString
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
    // InternalBomi.g:8833:1: rule__BORoleInteraction__AccessabilityAssignment_5_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__AccessabilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8837:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8838:2: ( ruleHighLow )
            {
            // InternalBomi.g:8838:2: ( ruleHighLow )
            // InternalBomi.g:8839:3: ruleHighLow
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
    // InternalBomi.g:8848:1: rule__BORoleInteraction__StabilityAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__StabilityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8852:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8853:2: ( ruleHighLow )
            {
            // InternalBomi.g:8853:2: ( ruleHighLow )
            // InternalBomi.g:8854:3: ruleHighLow
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
    // InternalBomi.g:8863:1: rule__BORoleInteraction__CriticalityAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__CriticalityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8867:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8868:2: ( ruleHighLow )
            {
            // InternalBomi.g:8868:2: ( ruleHighLow )
            // InternalBomi.g:8869:3: ruleHighLow
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
    // InternalBomi.g:8878:1: rule__BORoleInteraction__FitForPurposeAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__FitForPurposeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8882:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8883:2: ( ruleHighLow )
            {
            // InternalBomi.g:8883:2: ( ruleHighLow )
            // InternalBomi.g:8884:3: ruleHighLow
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
    // InternalBomi.g:8893:1: rule__BORoleInteraction__ResponsibleAssignment_9_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__BORoleInteraction__ResponsibleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8897:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:8898:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:8898:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:8899:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getResponsibleUnsettableBooleanEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getResponsibleUnsettableBooleanEnumRuleCall_9_1_0()); 

            }


            }

        }
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
    // InternalBomi.g:8908:1: rule__BORoleInteraction__CreatesAssignment_10_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__BORoleInteraction__CreatesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8912:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:8913:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:8913:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:8914:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getCreatesUnsettableBooleanEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getCreatesUnsettableBooleanEnumRuleCall_10_1_0()); 

            }


            }

        }
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
    // InternalBomi.g:8923:1: rule__BORoleInteraction__ReadsAssignment_11_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__BORoleInteraction__ReadsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8927:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:8928:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:8928:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:8929:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getReadsUnsettableBooleanEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getReadsUnsettableBooleanEnumRuleCall_11_1_0()); 

            }


            }

        }
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
    // InternalBomi.g:8938:1: rule__BORoleInteraction__UpdatesAssignment_12_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__BORoleInteraction__UpdatesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8942:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:8943:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:8943:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:8944:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getUpdatesUnsettableBooleanEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getUpdatesUnsettableBooleanEnumRuleCall_12_1_0()); 

            }


            }

        }
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
    // InternalBomi.g:8953:1: rule__BORoleInteraction__DeletesAssignment_13_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__BORoleInteraction__DeletesAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8957:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:8958:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:8958:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:8959:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getBORoleInteractionAccess().getDeletesUnsettableBooleanEnumRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getDeletesUnsettableBooleanEnumRuleCall_13_1_0()); 

            }


            }

        }
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
    // InternalBomi.g:8968:1: rule__BORoleInteraction__BoundaryObjectsAssignment_14_2 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__BoundaryObjectsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8972:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8973:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8973:2: ( ( ruleEString ) )
            // InternalBomi.g:8974:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_2_0()); 
            // InternalBomi.g:8975:3: ( ruleEString )
            // InternalBomi.g:8976:4: ruleEString
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
    // InternalBomi.g:8987:1: rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__BoundaryObjectsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8991:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8992:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8992:2: ( ( ruleEString ) )
            // InternalBomi.g:8993:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_3_1_0()); 
            // InternalBomi.g:8994:3: ( ruleEString )
            // InternalBomi.g:8995:4: ruleEString
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
    // InternalBomi.g:9006:1: rule__BORoleInteraction__RolesAssignment_15_2 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__RolesAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9010:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9011:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9011:2: ( ( ruleEString ) )
            // InternalBomi.g:9012:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_2_0()); 
            // InternalBomi.g:9013:3: ( ruleEString )
            // InternalBomi.g:9014:4: ruleEString
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
    // InternalBomi.g:9025:1: rule__BORoleInteraction__RolesAssignment_15_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__RolesAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9029:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9030:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9030:2: ( ( ruleEString ) )
            // InternalBomi.g:9031:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_3_1_0()); 
            // InternalBomi.g:9032:3: ( ruleEString )
            // InternalBomi.g:9033:4: ruleEString
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


    // $ANTLR start "rule__BoundaryObject__NameAssignment_2"
    // InternalBomi.g:9044:1: rule__BoundaryObject__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BoundaryObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9048:1: ( ( ruleEString ) )
            // InternalBomi.g:9049:2: ( ruleEString )
            {
            // InternalBomi.g:9049:2: ( ruleEString )
            // InternalBomi.g:9050:3: ruleEString
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


    // $ANTLR start "rule__BoundaryObject__PurposeAssignment_4_1"
    // InternalBomi.g:9059:1: rule__BoundaryObject__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9063:1: ( ( ruleEString ) )
            // InternalBomi.g:9064:2: ( ruleEString )
            {
            // InternalBomi.g:9064:2: ( ruleEString )
            // InternalBomi.g:9065:3: ruleEString
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getPurposeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__PurposeAssignment_4_1"


    // $ANTLR start "rule__BoundaryObject__SuperTypeAssignment_5_1"
    // InternalBomi.g:9074:1: rule__BoundaryObject__SuperTypeAssignment_5_1 : ( ruleBOSuperTypes ) ;
    public final void rule__BoundaryObject__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9078:1: ( ( ruleBOSuperTypes ) )
            // InternalBomi.g:9079:2: ( ruleBOSuperTypes )
            {
            // InternalBomi.g:9079:2: ( ruleBOSuperTypes )
            // InternalBomi.g:9080:3: ruleBOSuperTypes
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeBOSuperTypesEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBOSuperTypes();

            state._fsp--;

             after(grammarAccess.getBoundaryObjectAccess().getSuperTypeBOSuperTypesEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundaryObject__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__BoundaryObject__LevelOfDetailAssignment_6_1"
    // InternalBomi.g:9089:1: rule__BoundaryObject__LevelOfDetailAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__LevelOfDetailAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9093:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9094:2: ( ruleHighLow )
            {
            // InternalBomi.g:9094:2: ( ruleHighLow )
            // InternalBomi.g:9095:3: ruleHighLow
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
    // InternalBomi.g:9104:1: rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__FrequencyOfChangeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9108:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9109:2: ( ruleHighLow )
            {
            // InternalBomi.g:9109:2: ( ruleHighLow )
            // InternalBomi.g:9110:3: ruleHighLow
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
    // InternalBomi.g:9119:1: rule__BoundaryObject__ModularityAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__ModularityAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9123:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9124:2: ( ruleHighLow )
            {
            // InternalBomi.g:9124:2: ( ruleHighLow )
            // InternalBomi.g:9125:3: ruleHighLow
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
    // InternalBomi.g:9134:1: rule__BoundaryObject__MaintainabilityAssignment_9_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__MaintainabilityAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9138:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9139:2: ( ruleHighLow )
            {
            // InternalBomi.g:9139:2: ( ruleHighLow )
            // InternalBomi.g:9140:3: ruleHighLow
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
    // InternalBomi.g:9149:1: rule__BoundaryObject__PrescriptiveAssignment_10_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__PrescriptiveAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9153:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9154:2: ( ruleHighLow )
            {
            // InternalBomi.g:9154:2: ( ruleHighLow )
            // InternalBomi.g:9155:3: ruleHighLow
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
    // InternalBomi.g:9164:1: rule__BoundaryObject__LifecycleStageAssignment_11_1 : ( ruleLifecycleStage ) ;
    public final void rule__BoundaryObject__LifecycleStageAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9168:1: ( ( ruleLifecycleStage ) )
            // InternalBomi.g:9169:2: ( ruleLifecycleStage )
            {
            // InternalBomi.g:9169:2: ( ruleLifecycleStage )
            // InternalBomi.g:9170:3: ruleLifecycleStage
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
    // InternalBomi.g:9179:1: rule__BoundaryObject__RepresentationFormatAssignment_12_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__RepresentationFormatAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9183:1: ( ( ruleEString ) )
            // InternalBomi.g:9184:2: ( ruleEString )
            {
            // InternalBomi.g:9184:2: ( ruleEString )
            // InternalBomi.g:9185:3: ruleEString
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
    // InternalBomi.g:9194:1: rule__BoundaryObject__ToolingAssignment_13_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__ToolingAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9198:1: ( ( ruleEString ) )
            // InternalBomi.g:9199:2: ( ruleEString )
            {
            // InternalBomi.g:9199:2: ( ruleEString )
            // InternalBomi.g:9200:3: ruleEString
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
    // InternalBomi.g:9209:1: rule__BoundaryObject__VersioningAssignment_14_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__VersioningAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9213:1: ( ( ruleEString ) )
            // InternalBomi.g:9214:2: ( ruleEString )
            {
            // InternalBomi.g:9214:2: ( ruleEString )
            // InternalBomi.g:9215:3: ruleEString
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
    // InternalBomi.g:9224:1: rule__BoundaryObject__UpToDateAssignment_15_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__UpToDateAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9228:1: ( ( ruleEString ) )
            // InternalBomi.g:9229:2: ( ruleEString )
            {
            // InternalBomi.g:9229:2: ( ruleEString )
            // InternalBomi.g:9230:3: ruleEString
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
    // InternalBomi.g:9239:1: rule__BoundaryObject__InternalConsistencyAssignment_16_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__InternalConsistencyAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9243:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9244:2: ( ruleHighLow )
            {
            // InternalBomi.g:9244:2: ( ruleHighLow )
            // InternalBomi.g:9245:3: ruleHighLow
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
    // InternalBomi.g:9254:1: rule__BoundaryObject__ExternalConsistencyAssignment_17_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__ExternalConsistencyAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9258:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9259:2: ( ruleHighLow )
            {
            // InternalBomi.g:9259:2: ( ruleHighLow )
            // InternalBomi.g:9260:3: ruleHighLow
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


    // $ANTLR start "rule__Role__NameAssignment_2"
    // InternalBomi.g:9269:1: rule__Role__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9273:1: ( ( ruleEString ) )
            // InternalBomi.g:9274:2: ( ruleEString )
            {
            // InternalBomi.g:9274:2: ( ruleEString )
            // InternalBomi.g:9275:3: ruleEString
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
    // InternalBomi.g:9284:1: rule__Role__PartOfGovernanceTeamsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfGovernanceTeamsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9288:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9289:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9289:2: ( ( ruleEString ) )
            // InternalBomi.g:9290:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_2_0()); 
            // InternalBomi.g:9291:3: ( ruleEString )
            // InternalBomi.g:9292:4: ruleEString
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
    // InternalBomi.g:9303:1: rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfGovernanceTeamsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9307:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9308:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9308:2: ( ( ruleEString ) )
            // InternalBomi.g:9309:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_3_1_0()); 
            // InternalBomi.g:9310:3: ( ruleEString )
            // InternalBomi.g:9311:4: ruleEString
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
    // InternalBomi.g:9322:1: rule__Role__PartOfMIsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfMIsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9326:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9327:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9327:2: ( ( ruleEString ) )
            // InternalBomi.g:9328:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_2_0()); 
            // InternalBomi.g:9329:3: ( ruleEString )
            // InternalBomi.g:9330:4: ruleEString
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
    // InternalBomi.g:9341:1: rule__Role__PartOfMIsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfMIsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9345:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9346:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9346:2: ( ( ruleEString ) )
            // InternalBomi.g:9347:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_3_1_0()); 
            // InternalBomi.g:9348:3: ( ruleEString )
            // InternalBomi.g:9349:4: ruleEString
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


    // $ANTLR start "rule__BOMICoordination__NameAssignment_2"
    // InternalBomi.g:9360:1: rule__BOMICoordination__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BOMICoordination__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9364:1: ( ( ruleEString ) )
            // InternalBomi.g:9365:2: ( ruleEString )
            {
            // InternalBomi.g:9365:2: ( ruleEString )
            // InternalBomi.g:9366:3: ruleEString
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
    // InternalBomi.g:9375:1: rule__BOMICoordination__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BOMICoordination__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9379:1: ( ( ruleEString ) )
            // InternalBomi.g:9380:2: ( ruleEString )
            {
            // InternalBomi.g:9380:2: ( ruleEString )
            // InternalBomi.g:9381:3: ruleEString
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
    // InternalBomi.g:9390:1: rule__BOMICoordination__AccessabilityAssignment_5_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__AccessabilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9394:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9395:2: ( ruleHighLow )
            {
            // InternalBomi.g:9395:2: ( ruleHighLow )
            // InternalBomi.g:9396:3: ruleHighLow
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
    // InternalBomi.g:9405:1: rule__BOMICoordination__StabilityAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__StabilityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9409:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9410:2: ( ruleHighLow )
            {
            // InternalBomi.g:9410:2: ( ruleHighLow )
            // InternalBomi.g:9411:3: ruleHighLow
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
    // InternalBomi.g:9420:1: rule__BOMICoordination__CriticalityAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__CriticalityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9424:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9425:2: ( ruleHighLow )
            {
            // InternalBomi.g:9425:2: ( ruleHighLow )
            // InternalBomi.g:9426:3: ruleHighLow
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
    // InternalBomi.g:9435:1: rule__BOMICoordination__FitForPurposeAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__FitForPurposeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9439:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9440:2: ( ruleHighLow )
            {
            // InternalBomi.g:9440:2: ( ruleHighLow )
            // InternalBomi.g:9441:3: ruleHighLow
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
    // InternalBomi.g:9450:1: rule__BOMICoordination__BoundaryObjectsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__BoundaryObjectsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9454:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9455:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9455:2: ( ( ruleEString ) )
            // InternalBomi.g:9456:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0()); 
            // InternalBomi.g:9457:3: ( ruleEString )
            // InternalBomi.g:9458:4: ruleEString
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
    // InternalBomi.g:9469:1: rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9473:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9474:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9474:2: ( ( ruleEString ) )
            // InternalBomi.g:9475:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0()); 
            // InternalBomi.g:9476:3: ( ruleEString )
            // InternalBomi.g:9477:4: ruleEString
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
    // InternalBomi.g:9488:1: rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__MethodologicalIslandsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9492:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9493:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9493:2: ( ( ruleEString ) )
            // InternalBomi.g:9494:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_2_0()); 
            // InternalBomi.g:9495:3: ( ruleEString )
            // InternalBomi.g:9496:4: ruleEString
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
    // InternalBomi.g:9507:1: rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9511:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9512:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9512:2: ( ( ruleEString ) )
            // InternalBomi.g:9513:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_3_1_0()); 
            // InternalBomi.g:9514:3: ( ruleEString )
            // InternalBomi.g:9515:4: ruleEString
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


    // $ANTLR start "rule__MethodologicalIsland__NameAssignment_2"
    // InternalBomi.g:9526:1: rule__MethodologicalIsland__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MethodologicalIsland__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9530:1: ( ( ruleEString ) )
            // InternalBomi.g:9531:2: ( ruleEString )
            {
            // InternalBomi.g:9531:2: ( ruleEString )
            // InternalBomi.g:9532:3: ruleEString
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
    // InternalBomi.g:9541:1: rule__MethodologicalIsland__TypeAssignment_4_1 : ( ruleMIType ) ;
    public final void rule__MethodologicalIsland__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9545:1: ( ( ruleMIType ) )
            // InternalBomi.g:9546:2: ( ruleMIType )
            {
            // InternalBomi.g:9546:2: ( ruleMIType )
            // InternalBomi.g:9547:3: ruleMIType
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
    // InternalBomi.g:9556:1: rule__GovernanceTeam__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__GovernanceTeam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9560:1: ( ( ruleEString ) )
            // InternalBomi.g:9561:2: ( ruleEString )
            {
            // InternalBomi.g:9561:2: ( ruleEString )
            // InternalBomi.g:9562:3: ruleEString
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


    // $ANTLR start "rule__BOTeamGovernance__NameAssignment_2"
    // InternalBomi.g:9571:1: rule__BOTeamGovernance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9575:1: ( ( ruleEString ) )
            // InternalBomi.g:9576:2: ( ruleEString )
            {
            // InternalBomi.g:9576:2: ( ruleEString )
            // InternalBomi.g:9577:3: ruleEString
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
    // InternalBomi.g:9586:1: rule__BOTeamGovernance__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9590:1: ( ( ruleEString ) )
            // InternalBomi.g:9591:2: ( ruleEString )
            {
            // InternalBomi.g:9591:2: ( ruleEString )
            // InternalBomi.g:9592:3: ruleEString
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
    // InternalBomi.g:9601:1: rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9605:1: ( ( ruleEString ) )
            // InternalBomi.g:9606:2: ( ruleEString )
            {
            // InternalBomi.g:9606:2: ( ruleEString )
            // InternalBomi.g:9607:3: ruleEString
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
    // InternalBomi.g:9616:1: rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9620:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9621:2: ( ruleHighLow )
            {
            // InternalBomi.g:9621:2: ( ruleHighLow )
            // InternalBomi.g:9622:3: ruleHighLow
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


    // $ANTLR start "rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2"
    // InternalBomi.g:9631:1: rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9635:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9636:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9636:2: ( ( ruleEString ) )
            // InternalBomi.g:9637:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_7_2_0()); 
            // InternalBomi.g:9638:3: ( ruleEString )
            // InternalBomi.g:9639:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__BoundaryObjectsAssignment_7_2"


    // $ANTLR start "rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1"
    // InternalBomi.g:9650:1: rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9654:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9655:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9655:2: ( ( ruleEString ) )
            // InternalBomi.g:9656:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_7_3_1_0()); 
            // InternalBomi.g:9657:3: ( ruleEString )
            // InternalBomi.g:9658:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__BoundaryObjectsAssignment_7_3_1"


    // $ANTLR start "rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2"
    // InternalBomi.g:9669:1: rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9673:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9674:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9674:2: ( ( ruleEString ) )
            // InternalBomi.g:9675:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_8_2_0()); 
            // InternalBomi.g:9676:3: ( ruleEString )
            // InternalBomi.g:9677:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__GovernanceTeamsAssignment_8_2"


    // $ANTLR start "rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1"
    // InternalBomi.g:9688:1: rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9692:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9693:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9693:2: ( ( ruleEString ) )
            // InternalBomi.g:9694:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_8_3_1_0()); 
            // InternalBomi.g:9695:3: ( ruleEString )
            // InternalBomi.g:9696:4: ruleEString
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOTeamGovernance__GovernanceTeamsAssignment_8_3_1"


    // $ANTLR start "rule__Driver__NameAssignment_2"
    // InternalBomi.g:9707:1: rule__Driver__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Driver__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9711:1: ( ( ruleEString ) )
            // InternalBomi.g:9712:2: ( ruleEString )
            {
            // InternalBomi.g:9712:2: ( ruleEString )
            // InternalBomi.g:9713:3: ruleEString
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


    // $ANTLR start "rule__Driver__DriverTypeTechnologyAssignment_4_1"
    // InternalBomi.g:9722:1: rule__Driver__DriverTypeTechnologyAssignment_4_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__Driver__DriverTypeTechnologyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9726:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:9727:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:9727:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:9728:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getDriverAccess().getDriverTypeTechnologyUnsettableBooleanEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDriverTypeTechnologyUnsettableBooleanEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DriverTypeTechnologyAssignment_4_1"


    // $ANTLR start "rule__Driver__DriverTypeProcessAssignment_5_1"
    // InternalBomi.g:9737:1: rule__Driver__DriverTypeProcessAssignment_5_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__Driver__DriverTypeProcessAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9741:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:9742:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:9742:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:9743:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getDriverAccess().getDriverTypeProcessUnsettableBooleanEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDriverTypeProcessUnsettableBooleanEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DriverTypeProcessAssignment_5_1"


    // $ANTLR start "rule__Driver__DriverTypeOrganizationalAssignment_6_1"
    // InternalBomi.g:9752:1: rule__Driver__DriverTypeOrganizationalAssignment_6_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__Driver__DriverTypeOrganizationalAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9756:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:9757:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:9757:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:9758:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getDriverAccess().getDriverTypeOrganizationalUnsettableBooleanEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDriverTypeOrganizationalUnsettableBooleanEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DriverTypeOrganizationalAssignment_6_1"


    // $ANTLR start "rule__Driver__DistanceTypeCulturalAssignment_7_1"
    // InternalBomi.g:9767:1: rule__Driver__DistanceTypeCulturalAssignment_7_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__Driver__DistanceTypeCulturalAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9771:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:9772:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:9772:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:9773:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeCulturalUnsettableBooleanEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDistanceTypeCulturalUnsettableBooleanEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DistanceTypeCulturalAssignment_7_1"


    // $ANTLR start "rule__Driver__DistanceTypeGeographicalAssignment_8_1"
    // InternalBomi.g:9782:1: rule__Driver__DistanceTypeGeographicalAssignment_8_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__Driver__DistanceTypeGeographicalAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9786:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:9787:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:9787:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:9788:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeGeographicalUnsettableBooleanEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDistanceTypeGeographicalUnsettableBooleanEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DistanceTypeGeographicalAssignment_8_1"


    // $ANTLR start "rule__Driver__DistanceTypeOrganizationalAssignment_9_1"
    // InternalBomi.g:9797:1: rule__Driver__DistanceTypeOrganizationalAssignment_9_1 : ( ruleUnsettableBoolean ) ;
    public final void rule__Driver__DistanceTypeOrganizationalAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9801:1: ( ( ruleUnsettableBoolean ) )
            // InternalBomi.g:9802:2: ( ruleUnsettableBoolean )
            {
            // InternalBomi.g:9802:2: ( ruleUnsettableBoolean )
            // InternalBomi.g:9803:3: ruleUnsettableBoolean
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeOrganizationalUnsettableBooleanEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsettableBoolean();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDistanceTypeOrganizationalUnsettableBooleanEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DistanceTypeOrganizationalAssignment_9_1"


    // $ANTLR start "rule__Driver__DistanceSizeAssignment_10_1"
    // InternalBomi.g:9812:1: rule__Driver__DistanceSizeAssignment_10_1 : ( ruleHighLow ) ;
    public final void rule__Driver__DistanceSizeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9816:1: ( ( ruleHighLow ) )
            // InternalBomi.g:9817:2: ( ruleHighLow )
            {
            // InternalBomi.g:9817:2: ( ruleHighLow )
            // InternalBomi.g:9818:3: ruleHighLow
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeHighLowEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDistanceSizeHighLowEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DistanceSizeAssignment_10_1"


    // $ANTLR start "rule__Driver__DrivesMIsAssignment_11_2"
    // InternalBomi.g:9827:1: rule__Driver__DrivesMIsAssignment_11_2 : ( ( ruleEString ) ) ;
    public final void rule__Driver__DrivesMIsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9831:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9832:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9832:2: ( ( ruleEString ) )
            // InternalBomi.g:9833:3: ( ruleEString )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_11_2_0()); 
            // InternalBomi.g:9834:3: ( ruleEString )
            // InternalBomi.g:9835:4: ruleEString
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_11_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_11_2_0_1()); 

            }

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DrivesMIsAssignment_11_2"


    // $ANTLR start "rule__Driver__DrivesMIsAssignment_11_3_1"
    // InternalBomi.g:9846:1: rule__Driver__DrivesMIsAssignment_11_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Driver__DrivesMIsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:9850:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:9851:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:9851:2: ( ( ruleEString ) )
            // InternalBomi.g:9852:3: ( ruleEString )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_11_3_1_0()); 
            // InternalBomi.g:9853:3: ( ruleEString )
            // InternalBomi.g:9854:4: ruleEString
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_11_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandEStringParserRuleCall_11_3_1_0_1()); 

            }

             after(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DrivesMIsAssignment_11_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000003F880000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001FF81A00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000018800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFF00080200000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000FE0800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007100800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000F84A00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000078000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000088A00000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L,0x0000000000FF0000L});

}