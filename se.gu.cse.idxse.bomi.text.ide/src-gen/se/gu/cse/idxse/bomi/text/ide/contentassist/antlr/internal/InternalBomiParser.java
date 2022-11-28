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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NOT_SET'", "'High'", "'Medium'", "'Low'", "'Standard'", "'Technology'", "'Task'", "'Planning'", "'Value'", "'Product'", "'Other'", "'Operation'", "'Deprecate'", "'Retire'", "'Teams'", "'Silos'", "'Departments'", "'Organizations'", "'Process'", "'Organizational'", "'Cultural'", "'Geographical'", "'boundaryObjects'", "'{'", "'}'", "','", "'methodologicalIslands'", "'governanceTeams'", "'roles'", "'drivers'", "'BoundaryObject'", "'superType'", "'purpose'", "'levelOfDetail'", "'frequencyOfChange'", "'modularity'", "'maintainability'", "'prescriptive'", "'lifecycleStage'", "'representationFormat'", "'tooling'", "'versioning'", "'upToDate'", "'internalConsistency'", "'externalConsistency'", "'MethodologicalIsland'", "'type'", "'GovernanceTeam'", "'Role'", "'partOfGovernanceTeams'", "'('", "')'", "'partOfMIs'", "'Driver'", "'driverType'", "'distanceType'", "'distanceSize'", "'drivesMIs'", "'BOMICoordination'", "'accessability'", "'stability'", "'criticality'", "'fitForPurpose'", "'BORoleInteraction'", "'BOTeamGovernance'", "'coordinationMechanism'", "'frequencyOfCoordination'"
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
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
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


    // $ANTLR start "ruleBOSuperTypes"
    // InternalBomi.g:319:1: ruleBOSuperTypes : ( ( rule__BOSuperTypes__Alternatives ) ) ;
    public final void ruleBOSuperTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:323:1: ( ( ( rule__BOSuperTypes__Alternatives ) ) )
            // InternalBomi.g:324:2: ( ( rule__BOSuperTypes__Alternatives ) )
            {
            // InternalBomi.g:324:2: ( ( rule__BOSuperTypes__Alternatives ) )
            // InternalBomi.g:325:3: ( rule__BOSuperTypes__Alternatives )
            {
             before(grammarAccess.getBOSuperTypesAccess().getAlternatives()); 
            // InternalBomi.g:326:3: ( rule__BOSuperTypes__Alternatives )
            // InternalBomi.g:326:4: rule__BOSuperTypes__Alternatives
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
    // InternalBomi.g:335:1: ruleLifecycleStage : ( ( rule__LifecycleStage__Alternatives ) ) ;
    public final void ruleLifecycleStage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:339:1: ( ( ( rule__LifecycleStage__Alternatives ) ) )
            // InternalBomi.g:340:2: ( ( rule__LifecycleStage__Alternatives ) )
            {
            // InternalBomi.g:340:2: ( ( rule__LifecycleStage__Alternatives ) )
            // InternalBomi.g:341:3: ( rule__LifecycleStage__Alternatives )
            {
             before(grammarAccess.getLifecycleStageAccess().getAlternatives()); 
            // InternalBomi.g:342:3: ( rule__LifecycleStage__Alternatives )
            // InternalBomi.g:342:4: rule__LifecycleStage__Alternatives
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
    // InternalBomi.g:351:1: ruleMIType : ( ( rule__MIType__Alternatives ) ) ;
    public final void ruleMIType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:355:1: ( ( ( rule__MIType__Alternatives ) ) )
            // InternalBomi.g:356:2: ( ( rule__MIType__Alternatives ) )
            {
            // InternalBomi.g:356:2: ( ( rule__MIType__Alternatives ) )
            // InternalBomi.g:357:3: ( rule__MIType__Alternatives )
            {
             before(grammarAccess.getMITypeAccess().getAlternatives()); 
            // InternalBomi.g:358:3: ( rule__MIType__Alternatives )
            // InternalBomi.g:358:4: rule__MIType__Alternatives
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
    // InternalBomi.g:367:1: ruleDriverTypes : ( ( rule__DriverTypes__Alternatives ) ) ;
    public final void ruleDriverTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:371:1: ( ( ( rule__DriverTypes__Alternatives ) ) )
            // InternalBomi.g:372:2: ( ( rule__DriverTypes__Alternatives ) )
            {
            // InternalBomi.g:372:2: ( ( rule__DriverTypes__Alternatives ) )
            // InternalBomi.g:373:3: ( rule__DriverTypes__Alternatives )
            {
             before(grammarAccess.getDriverTypesAccess().getAlternatives()); 
            // InternalBomi.g:374:3: ( rule__DriverTypes__Alternatives )
            // InternalBomi.g:374:4: rule__DriverTypes__Alternatives
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
    // InternalBomi.g:383:1: ruleDistanceTypes : ( ( rule__DistanceTypes__Alternatives ) ) ;
    public final void ruleDistanceTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:387:1: ( ( ( rule__DistanceTypes__Alternatives ) ) )
            // InternalBomi.g:388:2: ( ( rule__DistanceTypes__Alternatives ) )
            {
            // InternalBomi.g:388:2: ( ( rule__DistanceTypes__Alternatives ) )
            // InternalBomi.g:389:3: ( rule__DistanceTypes__Alternatives )
            {
             before(grammarAccess.getDistanceTypesAccess().getAlternatives()); 
            // InternalBomi.g:390:3: ( rule__DistanceTypes__Alternatives )
            // InternalBomi.g:390:4: rule__DistanceTypes__Alternatives
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
    // InternalBomi.g:398:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:402:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBomi.g:403:2: ( RULE_STRING )
                    {
                    // InternalBomi.g:403:2: ( RULE_STRING )
                    // InternalBomi.g:404:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:409:2: ( RULE_ID )
                    {
                    // InternalBomi.g:409:2: ( RULE_ID )
                    // InternalBomi.g:410:3: RULE_ID
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
    // InternalBomi.g:419:1: rule__HighLow__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) );
    public final void rule__HighLow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:423:1: ( ( ( 'NOT_SET' ) ) | ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) )
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
                    // InternalBomi.g:424:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:424:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:425:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:426:3: ( 'NOT_SET' )
                    // InternalBomi.g:426:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:430:2: ( ( 'High' ) )
                    {
                    // InternalBomi.g:430:2: ( ( 'High' ) )
                    // InternalBomi.g:431:3: ( 'High' )
                    {
                     before(grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:432:3: ( 'High' )
                    // InternalBomi.g:432:4: 'High'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:436:2: ( ( 'Medium' ) )
                    {
                    // InternalBomi.g:436:2: ( ( 'Medium' ) )
                    // InternalBomi.g:437:3: ( 'Medium' )
                    {
                     before(grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:438:3: ( 'Medium' )
                    // InternalBomi.g:438:4: 'Medium'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:442:2: ( ( 'Low' ) )
                    {
                    // InternalBomi.g:442:2: ( ( 'Low' ) )
                    // InternalBomi.g:443:3: ( 'Low' )
                    {
                     before(grammarAccess.getHighLowAccess().getLowEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:444:3: ( 'Low' )
                    // InternalBomi.g:444:4: 'Low'
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


    // $ANTLR start "rule__BOSuperTypes__Alternatives"
    // InternalBomi.g:452:1: rule__BOSuperTypes__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Standard' ) ) | ( ( 'Technology' ) ) | ( ( 'Task' ) ) | ( ( 'Planning' ) ) | ( ( 'Value' ) ) | ( ( 'Product' ) ) | ( ( 'Other' ) ) );
    public final void rule__BOSuperTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:456:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Standard' ) ) | ( ( 'Technology' ) ) | ( ( 'Task' ) ) | ( ( 'Planning' ) ) | ( ( 'Value' ) ) | ( ( 'Product' ) ) | ( ( 'Other' ) ) )
            int alt3=8;
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
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            case 21:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBomi.g:457:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:457:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:458:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:459:3: ( 'NOT_SET' )
                    // InternalBomi.g:459:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:463:2: ( ( 'Standard' ) )
                    {
                    // InternalBomi.g:463:2: ( ( 'Standard' ) )
                    // InternalBomi.g:464:3: ( 'Standard' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:465:3: ( 'Standard' )
                    // InternalBomi.g:465:4: 'Standard'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:469:2: ( ( 'Technology' ) )
                    {
                    // InternalBomi.g:469:2: ( ( 'Technology' ) )
                    // InternalBomi.g:470:3: ( 'Technology' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:471:3: ( 'Technology' )
                    // InternalBomi.g:471:4: 'Technology'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:475:2: ( ( 'Task' ) )
                    {
                    // InternalBomi.g:475:2: ( ( 'Task' ) )
                    // InternalBomi.g:476:3: ( 'Task' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:477:3: ( 'Task' )
                    // InternalBomi.g:477:4: 'Task'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:481:2: ( ( 'Planning' ) )
                    {
                    // InternalBomi.g:481:2: ( ( 'Planning' ) )
                    // InternalBomi.g:482:3: ( 'Planning' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:483:3: ( 'Planning' )
                    // InternalBomi.g:483:4: 'Planning'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBomi.g:487:2: ( ( 'Value' ) )
                    {
                    // InternalBomi.g:487:2: ( ( 'Value' ) )
                    // InternalBomi.g:488:3: ( 'Value' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5()); 
                    // InternalBomi.g:489:3: ( 'Value' )
                    // InternalBomi.g:489:4: 'Value'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBomi.g:493:2: ( ( 'Product' ) )
                    {
                    // InternalBomi.g:493:2: ( ( 'Product' ) )
                    // InternalBomi.g:494:3: ( 'Product' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6()); 
                    // InternalBomi.g:495:3: ( 'Product' )
                    // InternalBomi.g:495:4: 'Product'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBomi.g:499:2: ( ( 'Other' ) )
                    {
                    // InternalBomi.g:499:2: ( ( 'Other' ) )
                    // InternalBomi.g:500:3: ( 'Other' )
                    {
                     before(grammarAccess.getBOSuperTypesAccess().getOtherEnumLiteralDeclaration_7()); 
                    // InternalBomi.g:501:3: ( 'Other' )
                    // InternalBomi.g:501:4: 'Other'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalBomi.g:509:1: rule__LifecycleStage__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Planning' ) ) | ( ( 'Operation' ) ) | ( ( 'Deprecate' ) ) | ( ( 'Retire' ) ) );
    public final void rule__LifecycleStage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:513:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Planning' ) ) | ( ( 'Operation' ) ) | ( ( 'Deprecate' ) ) | ( ( 'Retire' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBomi.g:514:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:514:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:515:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:516:3: ( 'NOT_SET' )
                    // InternalBomi.g:516:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:520:2: ( ( 'Planning' ) )
                    {
                    // InternalBomi.g:520:2: ( ( 'Planning' ) )
                    // InternalBomi.g:521:3: ( 'Planning' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:522:3: ( 'Planning' )
                    // InternalBomi.g:522:4: 'Planning'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:526:2: ( ( 'Operation' ) )
                    {
                    // InternalBomi.g:526:2: ( ( 'Operation' ) )
                    // InternalBomi.g:527:3: ( 'Operation' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:528:3: ( 'Operation' )
                    // InternalBomi.g:528:4: 'Operation'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:532:2: ( ( 'Deprecate' ) )
                    {
                    // InternalBomi.g:532:2: ( ( 'Deprecate' ) )
                    // InternalBomi.g:533:3: ( 'Deprecate' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:534:3: ( 'Deprecate' )
                    // InternalBomi.g:534:4: 'Deprecate'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:538:2: ( ( 'Retire' ) )
                    {
                    // InternalBomi.g:538:2: ( ( 'Retire' ) )
                    // InternalBomi.g:539:3: ( 'Retire' )
                    {
                     before(grammarAccess.getLifecycleStageAccess().getRetireEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:540:3: ( 'Retire' )
                    // InternalBomi.g:540:4: 'Retire'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalBomi.g:548:1: rule__MIType__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Teams' ) ) | ( ( 'Silos' ) ) | ( ( 'Departments' ) ) | ( ( 'Organizations' ) ) );
    public final void rule__MIType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:552:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Teams' ) ) | ( ( 'Silos' ) ) | ( ( 'Departments' ) ) | ( ( 'Organizations' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 28:
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
                    // InternalBomi.g:553:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:553:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:554:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:555:3: ( 'NOT_SET' )
                    // InternalBomi.g:555:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:559:2: ( ( 'Teams' ) )
                    {
                    // InternalBomi.g:559:2: ( ( 'Teams' ) )
                    // InternalBomi.g:560:3: ( 'Teams' )
                    {
                     before(grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:561:3: ( 'Teams' )
                    // InternalBomi.g:561:4: 'Teams'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:565:2: ( ( 'Silos' ) )
                    {
                    // InternalBomi.g:565:2: ( ( 'Silos' ) )
                    // InternalBomi.g:566:3: ( 'Silos' )
                    {
                     before(grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:567:3: ( 'Silos' )
                    // InternalBomi.g:567:4: 'Silos'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:571:2: ( ( 'Departments' ) )
                    {
                    // InternalBomi.g:571:2: ( ( 'Departments' ) )
                    // InternalBomi.g:572:3: ( 'Departments' )
                    {
                     before(grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:573:3: ( 'Departments' )
                    // InternalBomi.g:573:4: 'Departments'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:577:2: ( ( 'Organizations' ) )
                    {
                    // InternalBomi.g:577:2: ( ( 'Organizations' ) )
                    // InternalBomi.g:578:3: ( 'Organizations' )
                    {
                     before(grammarAccess.getMITypeAccess().getOrganizationsEnumLiteralDeclaration_4()); 
                    // InternalBomi.g:579:3: ( 'Organizations' )
                    // InternalBomi.g:579:4: 'Organizations'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalBomi.g:587:1: rule__DriverTypes__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Technology' ) ) | ( ( 'Process' ) ) | ( ( 'Organizational' ) ) );
    public final void rule__DriverTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:591:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Technology' ) ) | ( ( 'Process' ) ) | ( ( 'Organizational' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBomi.g:592:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:592:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:593:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:594:3: ( 'NOT_SET' )
                    // InternalBomi.g:594:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDriverTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:598:2: ( ( 'Technology' ) )
                    {
                    // InternalBomi.g:598:2: ( ( 'Technology' ) )
                    // InternalBomi.g:599:3: ( 'Technology' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getTechnologyEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:600:3: ( 'Technology' )
                    // InternalBomi.g:600:4: 'Technology'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDriverTypesAccess().getTechnologyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:604:2: ( ( 'Process' ) )
                    {
                    // InternalBomi.g:604:2: ( ( 'Process' ) )
                    // InternalBomi.g:605:3: ( 'Process' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getProcessEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:606:3: ( 'Process' )
                    // InternalBomi.g:606:4: 'Process'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDriverTypesAccess().getProcessEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:610:2: ( ( 'Organizational' ) )
                    {
                    // InternalBomi.g:610:2: ( ( 'Organizational' ) )
                    // InternalBomi.g:611:3: ( 'Organizational' )
                    {
                     before(grammarAccess.getDriverTypesAccess().getOrganizationalEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:612:3: ( 'Organizational' )
                    // InternalBomi.g:612:4: 'Organizational'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalBomi.g:620:1: rule__DistanceTypes__Alternatives : ( ( ( 'NOT_SET' ) ) | ( ( 'Cultural' ) ) | ( ( 'Geographical' ) ) | ( ( 'Organizational' ) ) );
    public final void rule__DistanceTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:624:1: ( ( ( 'NOT_SET' ) ) | ( ( 'Cultural' ) ) | ( ( 'Geographical' ) ) | ( ( 'Organizational' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 30:
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
                    // InternalBomi.g:625:2: ( ( 'NOT_SET' ) )
                    {
                    // InternalBomi.g:625:2: ( ( 'NOT_SET' ) )
                    // InternalBomi.g:626:3: ( 'NOT_SET' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 
                    // InternalBomi.g:627:3: ( 'NOT_SET' )
                    // InternalBomi.g:627:4: 'NOT_SET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceTypesAccess().getNOT_SETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:631:2: ( ( 'Cultural' ) )
                    {
                    // InternalBomi.g:631:2: ( ( 'Cultural' ) )
                    // InternalBomi.g:632:3: ( 'Cultural' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getCulturalEnumLiteralDeclaration_1()); 
                    // InternalBomi.g:633:3: ( 'Cultural' )
                    // InternalBomi.g:633:4: 'Cultural'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceTypesAccess().getCulturalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:637:2: ( ( 'Geographical' ) )
                    {
                    // InternalBomi.g:637:2: ( ( 'Geographical' ) )
                    // InternalBomi.g:638:3: ( 'Geographical' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getGeographicalEnumLiteralDeclaration_2()); 
                    // InternalBomi.g:639:3: ( 'Geographical' )
                    // InternalBomi.g:639:4: 'Geographical'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceTypesAccess().getGeographicalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:643:2: ( ( 'Organizational' ) )
                    {
                    // InternalBomi.g:643:2: ( ( 'Organizational' ) )
                    // InternalBomi.g:644:3: ( 'Organizational' )
                    {
                     before(grammarAccess.getDistanceTypesAccess().getOrganizationalEnumLiteralDeclaration_3()); 
                    // InternalBomi.g:645:3: ( 'Organizational' )
                    // InternalBomi.g:645:4: 'Organizational'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalBomi.g:653:1: rule__BOMIModel__Group__0 : rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1 ;
    public final void rule__BOMIModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:657:1: ( rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1 )
            // InternalBomi.g:658:2: rule__BOMIModel__Group__0__Impl rule__BOMIModel__Group__1
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
    // InternalBomi.g:665:1: rule__BOMIModel__Group__0__Impl : ( () ) ;
    public final void rule__BOMIModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:669:1: ( ( () ) )
            // InternalBomi.g:670:1: ( () )
            {
            // InternalBomi.g:670:1: ( () )
            // InternalBomi.g:671:2: ()
            {
             before(grammarAccess.getBOMIModelAccess().getBOMIModelAction_0()); 
            // InternalBomi.g:672:2: ()
            // InternalBomi.g:672:3: 
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
    // InternalBomi.g:680:1: rule__BOMIModel__Group__1 : rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2 ;
    public final void rule__BOMIModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:684:1: ( rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2 )
            // InternalBomi.g:685:2: rule__BOMIModel__Group__1__Impl rule__BOMIModel__Group__2
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
    // InternalBomi.g:692:1: rule__BOMIModel__Group__1__Impl : ( ( rule__BOMIModel__Group_1__0 )? ) ;
    public final void rule__BOMIModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:696:1: ( ( ( rule__BOMIModel__Group_1__0 )? ) )
            // InternalBomi.g:697:1: ( ( rule__BOMIModel__Group_1__0 )? )
            {
            // InternalBomi.g:697:1: ( ( rule__BOMIModel__Group_1__0 )? )
            // InternalBomi.g:698:2: ( rule__BOMIModel__Group_1__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_1()); 
            // InternalBomi.g:699:2: ( rule__BOMIModel__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBomi.g:699:3: rule__BOMIModel__Group_1__0
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
    // InternalBomi.g:707:1: rule__BOMIModel__Group__2 : rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3 ;
    public final void rule__BOMIModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:711:1: ( rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3 )
            // InternalBomi.g:712:2: rule__BOMIModel__Group__2__Impl rule__BOMIModel__Group__3
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
    // InternalBomi.g:719:1: rule__BOMIModel__Group__2__Impl : ( ( rule__BOMIModel__Group_2__0 )? ) ;
    public final void rule__BOMIModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:723:1: ( ( ( rule__BOMIModel__Group_2__0 )? ) )
            // InternalBomi.g:724:1: ( ( rule__BOMIModel__Group_2__0 )? )
            {
            // InternalBomi.g:724:1: ( ( rule__BOMIModel__Group_2__0 )? )
            // InternalBomi.g:725:2: ( rule__BOMIModel__Group_2__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_2()); 
            // InternalBomi.g:726:2: ( rule__BOMIModel__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBomi.g:726:3: rule__BOMIModel__Group_2__0
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
    // InternalBomi.g:734:1: rule__BOMIModel__Group__3 : rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4 ;
    public final void rule__BOMIModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:738:1: ( rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4 )
            // InternalBomi.g:739:2: rule__BOMIModel__Group__3__Impl rule__BOMIModel__Group__4
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
    // InternalBomi.g:746:1: rule__BOMIModel__Group__3__Impl : ( ( rule__BOMIModel__Group_3__0 )? ) ;
    public final void rule__BOMIModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:750:1: ( ( ( rule__BOMIModel__Group_3__0 )? ) )
            // InternalBomi.g:751:1: ( ( rule__BOMIModel__Group_3__0 )? )
            {
            // InternalBomi.g:751:1: ( ( rule__BOMIModel__Group_3__0 )? )
            // InternalBomi.g:752:2: ( rule__BOMIModel__Group_3__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_3()); 
            // InternalBomi.g:753:2: ( rule__BOMIModel__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBomi.g:753:3: rule__BOMIModel__Group_3__0
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
    // InternalBomi.g:761:1: rule__BOMIModel__Group__4 : rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5 ;
    public final void rule__BOMIModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:765:1: ( rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5 )
            // InternalBomi.g:766:2: rule__BOMIModel__Group__4__Impl rule__BOMIModel__Group__5
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
    // InternalBomi.g:773:1: rule__BOMIModel__Group__4__Impl : ( ( rule__BOMIModel__Group_4__0 )? ) ;
    public final void rule__BOMIModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:777:1: ( ( ( rule__BOMIModel__Group_4__0 )? ) )
            // InternalBomi.g:778:1: ( ( rule__BOMIModel__Group_4__0 )? )
            {
            // InternalBomi.g:778:1: ( ( rule__BOMIModel__Group_4__0 )? )
            // InternalBomi.g:779:2: ( rule__BOMIModel__Group_4__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_4()); 
            // InternalBomi.g:780:2: ( rule__BOMIModel__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBomi.g:780:3: rule__BOMIModel__Group_4__0
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
    // InternalBomi.g:788:1: rule__BOMIModel__Group__5 : rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6 ;
    public final void rule__BOMIModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:792:1: ( rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6 )
            // InternalBomi.g:793:2: rule__BOMIModel__Group__5__Impl rule__BOMIModel__Group__6
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
    // InternalBomi.g:800:1: rule__BOMIModel__Group__5__Impl : ( ( rule__BOMIModel__Group_5__0 )? ) ;
    public final void rule__BOMIModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:804:1: ( ( ( rule__BOMIModel__Group_5__0 )? ) )
            // InternalBomi.g:805:1: ( ( rule__BOMIModel__Group_5__0 )? )
            {
            // InternalBomi.g:805:1: ( ( rule__BOMIModel__Group_5__0 )? )
            // InternalBomi.g:806:2: ( rule__BOMIModel__Group_5__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_5()); 
            // InternalBomi.g:807:2: ( rule__BOMIModel__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBomi.g:807:3: rule__BOMIModel__Group_5__0
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
    // InternalBomi.g:815:1: rule__BOMIModel__Group__6 : rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7 ;
    public final void rule__BOMIModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:819:1: ( rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7 )
            // InternalBomi.g:820:2: rule__BOMIModel__Group__6__Impl rule__BOMIModel__Group__7
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
    // InternalBomi.g:827:1: rule__BOMIModel__Group__6__Impl : ( ( rule__BOMIModel__Group_6__0 )? ) ;
    public final void rule__BOMIModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:831:1: ( ( ( rule__BOMIModel__Group_6__0 )? ) )
            // InternalBomi.g:832:1: ( ( rule__BOMIModel__Group_6__0 )? )
            {
            // InternalBomi.g:832:1: ( ( rule__BOMIModel__Group_6__0 )? )
            // InternalBomi.g:833:2: ( rule__BOMIModel__Group_6__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_6()); 
            // InternalBomi.g:834:2: ( rule__BOMIModel__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==69) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBomi.g:834:3: rule__BOMIModel__Group_6__0
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
    // InternalBomi.g:842:1: rule__BOMIModel__Group__7 : rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8 ;
    public final void rule__BOMIModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:846:1: ( rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8 )
            // InternalBomi.g:847:2: rule__BOMIModel__Group__7__Impl rule__BOMIModel__Group__8
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
    // InternalBomi.g:854:1: rule__BOMIModel__Group__7__Impl : ( ( rule__BOMIModel__Group_7__0 )? ) ;
    public final void rule__BOMIModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:858:1: ( ( ( rule__BOMIModel__Group_7__0 )? ) )
            // InternalBomi.g:859:1: ( ( rule__BOMIModel__Group_7__0 )? )
            {
            // InternalBomi.g:859:1: ( ( rule__BOMIModel__Group_7__0 )? )
            // InternalBomi.g:860:2: ( rule__BOMIModel__Group_7__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_7()); 
            // InternalBomi.g:861:2: ( rule__BOMIModel__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==74) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBomi.g:861:3: rule__BOMIModel__Group_7__0
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
    // InternalBomi.g:869:1: rule__BOMIModel__Group__8 : rule__BOMIModel__Group__8__Impl ;
    public final void rule__BOMIModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:873:1: ( rule__BOMIModel__Group__8__Impl )
            // InternalBomi.g:874:2: rule__BOMIModel__Group__8__Impl
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
    // InternalBomi.g:880:1: rule__BOMIModel__Group__8__Impl : ( ( rule__BOMIModel__Group_8__0 )? ) ;
    public final void rule__BOMIModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:884:1: ( ( ( rule__BOMIModel__Group_8__0 )? ) )
            // InternalBomi.g:885:1: ( ( rule__BOMIModel__Group_8__0 )? )
            {
            // InternalBomi.g:885:1: ( ( rule__BOMIModel__Group_8__0 )? )
            // InternalBomi.g:886:2: ( rule__BOMIModel__Group_8__0 )?
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_8()); 
            // InternalBomi.g:887:2: ( rule__BOMIModel__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==75) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBomi.g:887:3: rule__BOMIModel__Group_8__0
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
    // InternalBomi.g:896:1: rule__BOMIModel__Group_1__0 : rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1 ;
    public final void rule__BOMIModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:900:1: ( rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1 )
            // InternalBomi.g:901:2: rule__BOMIModel__Group_1__0__Impl rule__BOMIModel__Group_1__1
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
    // InternalBomi.g:908:1: rule__BOMIModel__Group_1__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOMIModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:912:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:913:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:913:1: ( 'boundaryObjects' )
            // InternalBomi.g:914:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:923:1: rule__BOMIModel__Group_1__1 : rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2 ;
    public final void rule__BOMIModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:927:1: ( rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2 )
            // InternalBomi.g:928:2: rule__BOMIModel__Group_1__1__Impl rule__BOMIModel__Group_1__2
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
    // InternalBomi.g:935:1: rule__BOMIModel__Group_1__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:939:1: ( ( '{' ) )
            // InternalBomi.g:940:1: ( '{' )
            {
            // InternalBomi.g:940:1: ( '{' )
            // InternalBomi.g:941:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:950:1: rule__BOMIModel__Group_1__2 : rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3 ;
    public final void rule__BOMIModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:954:1: ( rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3 )
            // InternalBomi.g:955:2: rule__BOMIModel__Group_1__2__Impl rule__BOMIModel__Group_1__3
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
    // InternalBomi.g:962:1: rule__BOMIModel__Group_1__2__Impl : ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) ) ;
    public final void rule__BOMIModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:966:1: ( ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) ) )
            // InternalBomi.g:967:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) )
            {
            // InternalBomi.g:967:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 ) )
            // InternalBomi.g:968:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_1_2()); 
            // InternalBomi.g:969:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_2 )
            // InternalBomi.g:969:3: rule__BOMIModel__BoundaryObjectsAssignment_1_2
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
    // InternalBomi.g:977:1: rule__BOMIModel__Group_1__3 : rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4 ;
    public final void rule__BOMIModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:981:1: ( rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4 )
            // InternalBomi.g:982:2: rule__BOMIModel__Group_1__3__Impl rule__BOMIModel__Group_1__4
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
    // InternalBomi.g:989:1: rule__BOMIModel__Group_1__3__Impl : ( ( rule__BOMIModel__Group_1_3__0 )* ) ;
    public final void rule__BOMIModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:993:1: ( ( ( rule__BOMIModel__Group_1_3__0 )* ) )
            // InternalBomi.g:994:1: ( ( rule__BOMIModel__Group_1_3__0 )* )
            {
            // InternalBomi.g:994:1: ( ( rule__BOMIModel__Group_1_3__0 )* )
            // InternalBomi.g:995:2: ( rule__BOMIModel__Group_1_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_1_3()); 
            // InternalBomi.g:996:2: ( rule__BOMIModel__Group_1_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBomi.g:996:3: rule__BOMIModel__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBomi.g:1004:1: rule__BOMIModel__Group_1__4 : rule__BOMIModel__Group_1__4__Impl ;
    public final void rule__BOMIModel__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1008:1: ( rule__BOMIModel__Group_1__4__Impl )
            // InternalBomi.g:1009:2: rule__BOMIModel__Group_1__4__Impl
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
    // InternalBomi.g:1015:1: rule__BOMIModel__Group_1__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1019:1: ( ( '}' ) )
            // InternalBomi.g:1020:1: ( '}' )
            {
            // InternalBomi.g:1020:1: ( '}' )
            // InternalBomi.g:1021:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:1031:1: rule__BOMIModel__Group_1_3__0 : rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1 ;
    public final void rule__BOMIModel__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1035:1: ( rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1 )
            // InternalBomi.g:1036:2: rule__BOMIModel__Group_1_3__0__Impl rule__BOMIModel__Group_1_3__1
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
    // InternalBomi.g:1043:1: rule__BOMIModel__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1047:1: ( ( ',' ) )
            // InternalBomi.g:1048:1: ( ',' )
            {
            // InternalBomi.g:1048:1: ( ',' )
            // InternalBomi.g:1049:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_1_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:1058:1: rule__BOMIModel__Group_1_3__1 : rule__BOMIModel__Group_1_3__1__Impl ;
    public final void rule__BOMIModel__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1062:1: ( rule__BOMIModel__Group_1_3__1__Impl )
            // InternalBomi.g:1063:2: rule__BOMIModel__Group_1_3__1__Impl
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
    // InternalBomi.g:1069:1: rule__BOMIModel__Group_1_3__1__Impl : ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) ) ;
    public final void rule__BOMIModel__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1073:1: ( ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) ) )
            // InternalBomi.g:1074:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) )
            {
            // InternalBomi.g:1074:1: ( ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 ) )
            // InternalBomi.g:1075:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoundaryObjectsAssignment_1_3_1()); 
            // InternalBomi.g:1076:2: ( rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 )
            // InternalBomi.g:1076:3: rule__BOMIModel__BoundaryObjectsAssignment_1_3_1
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
    // InternalBomi.g:1085:1: rule__BOMIModel__Group_2__0 : rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1 ;
    public final void rule__BOMIModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1089:1: ( rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1 )
            // InternalBomi.g:1090:2: rule__BOMIModel__Group_2__0__Impl rule__BOMIModel__Group_2__1
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
    // InternalBomi.g:1097:1: rule__BOMIModel__Group_2__0__Impl : ( 'methodologicalIslands' ) ;
    public final void rule__BOMIModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1101:1: ( ( 'methodologicalIslands' ) )
            // InternalBomi.g:1102:1: ( 'methodologicalIslands' )
            {
            // InternalBomi.g:1102:1: ( 'methodologicalIslands' )
            // InternalBomi.g:1103:2: 'methodologicalIslands'
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBomi.g:1112:1: rule__BOMIModel__Group_2__1 : rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2 ;
    public final void rule__BOMIModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1116:1: ( rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2 )
            // InternalBomi.g:1117:2: rule__BOMIModel__Group_2__1__Impl rule__BOMIModel__Group_2__2
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
    // InternalBomi.g:1124:1: rule__BOMIModel__Group_2__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1128:1: ( ( '{' ) )
            // InternalBomi.g:1129:1: ( '{' )
            {
            // InternalBomi.g:1129:1: ( '{' )
            // InternalBomi.g:1130:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1139:1: rule__BOMIModel__Group_2__2 : rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3 ;
    public final void rule__BOMIModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1143:1: ( rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3 )
            // InternalBomi.g:1144:2: rule__BOMIModel__Group_2__2__Impl rule__BOMIModel__Group_2__3
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
    // InternalBomi.g:1151:1: rule__BOMIModel__Group_2__2__Impl : ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) ) ;
    public final void rule__BOMIModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1155:1: ( ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) ) )
            // InternalBomi.g:1156:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) )
            {
            // InternalBomi.g:1156:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 ) )
            // InternalBomi.g:1157:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_2_2()); 
            // InternalBomi.g:1158:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_2 )
            // InternalBomi.g:1158:3: rule__BOMIModel__MethodologicalIslandsAssignment_2_2
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
    // InternalBomi.g:1166:1: rule__BOMIModel__Group_2__3 : rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4 ;
    public final void rule__BOMIModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1170:1: ( rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4 )
            // InternalBomi.g:1171:2: rule__BOMIModel__Group_2__3__Impl rule__BOMIModel__Group_2__4
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
    // InternalBomi.g:1178:1: rule__BOMIModel__Group_2__3__Impl : ( ( rule__BOMIModel__Group_2_3__0 )* ) ;
    public final void rule__BOMIModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1182:1: ( ( ( rule__BOMIModel__Group_2_3__0 )* ) )
            // InternalBomi.g:1183:1: ( ( rule__BOMIModel__Group_2_3__0 )* )
            {
            // InternalBomi.g:1183:1: ( ( rule__BOMIModel__Group_2_3__0 )* )
            // InternalBomi.g:1184:2: ( rule__BOMIModel__Group_2_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_2_3()); 
            // InternalBomi.g:1185:2: ( rule__BOMIModel__Group_2_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBomi.g:1185:3: rule__BOMIModel__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBomi.g:1193:1: rule__BOMIModel__Group_2__4 : rule__BOMIModel__Group_2__4__Impl ;
    public final void rule__BOMIModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1197:1: ( rule__BOMIModel__Group_2__4__Impl )
            // InternalBomi.g:1198:2: rule__BOMIModel__Group_2__4__Impl
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
    // InternalBomi.g:1204:1: rule__BOMIModel__Group_2__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1208:1: ( ( '}' ) )
            // InternalBomi.g:1209:1: ( '}' )
            {
            // InternalBomi.g:1209:1: ( '}' )
            // InternalBomi.g:1210:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:1220:1: rule__BOMIModel__Group_2_3__0 : rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1 ;
    public final void rule__BOMIModel__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1224:1: ( rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1 )
            // InternalBomi.g:1225:2: rule__BOMIModel__Group_2_3__0__Impl rule__BOMIModel__Group_2_3__1
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
    // InternalBomi.g:1232:1: rule__BOMIModel__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1236:1: ( ( ',' ) )
            // InternalBomi.g:1237:1: ( ',' )
            {
            // InternalBomi.g:1237:1: ( ',' )
            // InternalBomi.g:1238:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_2_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:1247:1: rule__BOMIModel__Group_2_3__1 : rule__BOMIModel__Group_2_3__1__Impl ;
    public final void rule__BOMIModel__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1251:1: ( rule__BOMIModel__Group_2_3__1__Impl )
            // InternalBomi.g:1252:2: rule__BOMIModel__Group_2_3__1__Impl
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
    // InternalBomi.g:1258:1: rule__BOMIModel__Group_2_3__1__Impl : ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) ) ;
    public final void rule__BOMIModel__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1262:1: ( ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) ) )
            // InternalBomi.g:1263:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) )
            {
            // InternalBomi.g:1263:1: ( ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 ) )
            // InternalBomi.g:1264:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsAssignment_2_3_1()); 
            // InternalBomi.g:1265:2: ( rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 )
            // InternalBomi.g:1265:3: rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1
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
    // InternalBomi.g:1274:1: rule__BOMIModel__Group_3__0 : rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1 ;
    public final void rule__BOMIModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1278:1: ( rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1 )
            // InternalBomi.g:1279:2: rule__BOMIModel__Group_3__0__Impl rule__BOMIModel__Group_3__1
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
    // InternalBomi.g:1286:1: rule__BOMIModel__Group_3__0__Impl : ( 'governanceTeams' ) ;
    public final void rule__BOMIModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1290:1: ( ( 'governanceTeams' ) )
            // InternalBomi.g:1291:1: ( 'governanceTeams' )
            {
            // InternalBomi.g:1291:1: ( 'governanceTeams' )
            // InternalBomi.g:1292:2: 'governanceTeams'
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBomi.g:1301:1: rule__BOMIModel__Group_3__1 : rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2 ;
    public final void rule__BOMIModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1305:1: ( rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2 )
            // InternalBomi.g:1306:2: rule__BOMIModel__Group_3__1__Impl rule__BOMIModel__Group_3__2
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
    // InternalBomi.g:1313:1: rule__BOMIModel__Group_3__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1317:1: ( ( '{' ) )
            // InternalBomi.g:1318:1: ( '{' )
            {
            // InternalBomi.g:1318:1: ( '{' )
            // InternalBomi.g:1319:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1328:1: rule__BOMIModel__Group_3__2 : rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3 ;
    public final void rule__BOMIModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1332:1: ( rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3 )
            // InternalBomi.g:1333:2: rule__BOMIModel__Group_3__2__Impl rule__BOMIModel__Group_3__3
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
    // InternalBomi.g:1340:1: rule__BOMIModel__Group_3__2__Impl : ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) ) ;
    public final void rule__BOMIModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1344:1: ( ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) ) )
            // InternalBomi.g:1345:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) )
            {
            // InternalBomi.g:1345:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 ) )
            // InternalBomi.g:1346:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_3_2()); 
            // InternalBomi.g:1347:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_2 )
            // InternalBomi.g:1347:3: rule__BOMIModel__GovernanceTeamsAssignment_3_2
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
    // InternalBomi.g:1355:1: rule__BOMIModel__Group_3__3 : rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4 ;
    public final void rule__BOMIModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1359:1: ( rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4 )
            // InternalBomi.g:1360:2: rule__BOMIModel__Group_3__3__Impl rule__BOMIModel__Group_3__4
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
    // InternalBomi.g:1367:1: rule__BOMIModel__Group_3__3__Impl : ( ( rule__BOMIModel__Group_3_3__0 )* ) ;
    public final void rule__BOMIModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1371:1: ( ( ( rule__BOMIModel__Group_3_3__0 )* ) )
            // InternalBomi.g:1372:1: ( ( rule__BOMIModel__Group_3_3__0 )* )
            {
            // InternalBomi.g:1372:1: ( ( rule__BOMIModel__Group_3_3__0 )* )
            // InternalBomi.g:1373:2: ( rule__BOMIModel__Group_3_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_3_3()); 
            // InternalBomi.g:1374:2: ( rule__BOMIModel__Group_3_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBomi.g:1374:3: rule__BOMIModel__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBomi.g:1382:1: rule__BOMIModel__Group_3__4 : rule__BOMIModel__Group_3__4__Impl ;
    public final void rule__BOMIModel__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1386:1: ( rule__BOMIModel__Group_3__4__Impl )
            // InternalBomi.g:1387:2: rule__BOMIModel__Group_3__4__Impl
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
    // InternalBomi.g:1393:1: rule__BOMIModel__Group_3__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1397:1: ( ( '}' ) )
            // InternalBomi.g:1398:1: ( '}' )
            {
            // InternalBomi.g:1398:1: ( '}' )
            // InternalBomi.g:1399:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:1409:1: rule__BOMIModel__Group_3_3__0 : rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1 ;
    public final void rule__BOMIModel__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1413:1: ( rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1 )
            // InternalBomi.g:1414:2: rule__BOMIModel__Group_3_3__0__Impl rule__BOMIModel__Group_3_3__1
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
    // InternalBomi.g:1421:1: rule__BOMIModel__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1425:1: ( ( ',' ) )
            // InternalBomi.g:1426:1: ( ',' )
            {
            // InternalBomi.g:1426:1: ( ',' )
            // InternalBomi.g:1427:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_3_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:1436:1: rule__BOMIModel__Group_3_3__1 : rule__BOMIModel__Group_3_3__1__Impl ;
    public final void rule__BOMIModel__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1440:1: ( rule__BOMIModel__Group_3_3__1__Impl )
            // InternalBomi.g:1441:2: rule__BOMIModel__Group_3_3__1__Impl
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
    // InternalBomi.g:1447:1: rule__BOMIModel__Group_3_3__1__Impl : ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) ) ;
    public final void rule__BOMIModel__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1451:1: ( ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) ) )
            // InternalBomi.g:1452:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) )
            {
            // InternalBomi.g:1452:1: ( ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 ) )
            // InternalBomi.g:1453:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getGovernanceTeamsAssignment_3_3_1()); 
            // InternalBomi.g:1454:2: ( rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 )
            // InternalBomi.g:1454:3: rule__BOMIModel__GovernanceTeamsAssignment_3_3_1
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
    // InternalBomi.g:1463:1: rule__BOMIModel__Group_4__0 : rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1 ;
    public final void rule__BOMIModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1467:1: ( rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1 )
            // InternalBomi.g:1468:2: rule__BOMIModel__Group_4__0__Impl rule__BOMIModel__Group_4__1
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
    // InternalBomi.g:1475:1: rule__BOMIModel__Group_4__0__Impl : ( 'roles' ) ;
    public final void rule__BOMIModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1479:1: ( ( 'roles' ) )
            // InternalBomi.g:1480:1: ( 'roles' )
            {
            // InternalBomi.g:1480:1: ( 'roles' )
            // InternalBomi.g:1481:2: 'roles'
            {
             before(grammarAccess.getBOMIModelAccess().getRolesKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBomi.g:1490:1: rule__BOMIModel__Group_4__1 : rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2 ;
    public final void rule__BOMIModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1494:1: ( rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2 )
            // InternalBomi.g:1495:2: rule__BOMIModel__Group_4__1__Impl rule__BOMIModel__Group_4__2
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
    // InternalBomi.g:1502:1: rule__BOMIModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1506:1: ( ( '{' ) )
            // InternalBomi.g:1507:1: ( '{' )
            {
            // InternalBomi.g:1507:1: ( '{' )
            // InternalBomi.g:1508:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1517:1: rule__BOMIModel__Group_4__2 : rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3 ;
    public final void rule__BOMIModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1521:1: ( rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3 )
            // InternalBomi.g:1522:2: rule__BOMIModel__Group_4__2__Impl rule__BOMIModel__Group_4__3
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
    // InternalBomi.g:1529:1: rule__BOMIModel__Group_4__2__Impl : ( ( rule__BOMIModel__RolesAssignment_4_2 ) ) ;
    public final void rule__BOMIModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1533:1: ( ( ( rule__BOMIModel__RolesAssignment_4_2 ) ) )
            // InternalBomi.g:1534:1: ( ( rule__BOMIModel__RolesAssignment_4_2 ) )
            {
            // InternalBomi.g:1534:1: ( ( rule__BOMIModel__RolesAssignment_4_2 ) )
            // InternalBomi.g:1535:2: ( rule__BOMIModel__RolesAssignment_4_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getRolesAssignment_4_2()); 
            // InternalBomi.g:1536:2: ( rule__BOMIModel__RolesAssignment_4_2 )
            // InternalBomi.g:1536:3: rule__BOMIModel__RolesAssignment_4_2
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
    // InternalBomi.g:1544:1: rule__BOMIModel__Group_4__3 : rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4 ;
    public final void rule__BOMIModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1548:1: ( rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4 )
            // InternalBomi.g:1549:2: rule__BOMIModel__Group_4__3__Impl rule__BOMIModel__Group_4__4
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
    // InternalBomi.g:1556:1: rule__BOMIModel__Group_4__3__Impl : ( ( rule__BOMIModel__Group_4_3__0 )* ) ;
    public final void rule__BOMIModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1560:1: ( ( ( rule__BOMIModel__Group_4_3__0 )* ) )
            // InternalBomi.g:1561:1: ( ( rule__BOMIModel__Group_4_3__0 )* )
            {
            // InternalBomi.g:1561:1: ( ( rule__BOMIModel__Group_4_3__0 )* )
            // InternalBomi.g:1562:2: ( rule__BOMIModel__Group_4_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_4_3()); 
            // InternalBomi.g:1563:2: ( rule__BOMIModel__Group_4_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBomi.g:1563:3: rule__BOMIModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBomi.g:1571:1: rule__BOMIModel__Group_4__4 : rule__BOMIModel__Group_4__4__Impl ;
    public final void rule__BOMIModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1575:1: ( rule__BOMIModel__Group_4__4__Impl )
            // InternalBomi.g:1576:2: rule__BOMIModel__Group_4__4__Impl
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
    // InternalBomi.g:1582:1: rule__BOMIModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1586:1: ( ( '}' ) )
            // InternalBomi.g:1587:1: ( '}' )
            {
            // InternalBomi.g:1587:1: ( '}' )
            // InternalBomi.g:1588:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:1598:1: rule__BOMIModel__Group_4_3__0 : rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1 ;
    public final void rule__BOMIModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1602:1: ( rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1 )
            // InternalBomi.g:1603:2: rule__BOMIModel__Group_4_3__0__Impl rule__BOMIModel__Group_4_3__1
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
    // InternalBomi.g:1610:1: rule__BOMIModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1614:1: ( ( ',' ) )
            // InternalBomi.g:1615:1: ( ',' )
            {
            // InternalBomi.g:1615:1: ( ',' )
            // InternalBomi.g:1616:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_4_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:1625:1: rule__BOMIModel__Group_4_3__1 : rule__BOMIModel__Group_4_3__1__Impl ;
    public final void rule__BOMIModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1629:1: ( rule__BOMIModel__Group_4_3__1__Impl )
            // InternalBomi.g:1630:2: rule__BOMIModel__Group_4_3__1__Impl
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
    // InternalBomi.g:1636:1: rule__BOMIModel__Group_4_3__1__Impl : ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) ) ;
    public final void rule__BOMIModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1640:1: ( ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) ) )
            // InternalBomi.g:1641:1: ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) )
            {
            // InternalBomi.g:1641:1: ( ( rule__BOMIModel__RolesAssignment_4_3_1 ) )
            // InternalBomi.g:1642:2: ( rule__BOMIModel__RolesAssignment_4_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getRolesAssignment_4_3_1()); 
            // InternalBomi.g:1643:2: ( rule__BOMIModel__RolesAssignment_4_3_1 )
            // InternalBomi.g:1643:3: rule__BOMIModel__RolesAssignment_4_3_1
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
    // InternalBomi.g:1652:1: rule__BOMIModel__Group_5__0 : rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1 ;
    public final void rule__BOMIModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1656:1: ( rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1 )
            // InternalBomi.g:1657:2: rule__BOMIModel__Group_5__0__Impl rule__BOMIModel__Group_5__1
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
    // InternalBomi.g:1664:1: rule__BOMIModel__Group_5__0__Impl : ( 'drivers' ) ;
    public final void rule__BOMIModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1668:1: ( ( 'drivers' ) )
            // InternalBomi.g:1669:1: ( 'drivers' )
            {
            // InternalBomi.g:1669:1: ( 'drivers' )
            // InternalBomi.g:1670:2: 'drivers'
            {
             before(grammarAccess.getBOMIModelAccess().getDriversKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBomi.g:1679:1: rule__BOMIModel__Group_5__1 : rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2 ;
    public final void rule__BOMIModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1683:1: ( rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2 )
            // InternalBomi.g:1684:2: rule__BOMIModel__Group_5__1__Impl rule__BOMIModel__Group_5__2
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
    // InternalBomi.g:1691:1: rule__BOMIModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BOMIModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1695:1: ( ( '{' ) )
            // InternalBomi.g:1696:1: ( '{' )
            {
            // InternalBomi.g:1696:1: ( '{' )
            // InternalBomi.g:1697:2: '{'
            {
             before(grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:1706:1: rule__BOMIModel__Group_5__2 : rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3 ;
    public final void rule__BOMIModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1710:1: ( rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3 )
            // InternalBomi.g:1711:2: rule__BOMIModel__Group_5__2__Impl rule__BOMIModel__Group_5__3
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
    // InternalBomi.g:1718:1: rule__BOMIModel__Group_5__2__Impl : ( ( rule__BOMIModel__DriversAssignment_5_2 ) ) ;
    public final void rule__BOMIModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1722:1: ( ( ( rule__BOMIModel__DriversAssignment_5_2 ) ) )
            // InternalBomi.g:1723:1: ( ( rule__BOMIModel__DriversAssignment_5_2 ) )
            {
            // InternalBomi.g:1723:1: ( ( rule__BOMIModel__DriversAssignment_5_2 ) )
            // InternalBomi.g:1724:2: ( rule__BOMIModel__DriversAssignment_5_2 )
            {
             before(grammarAccess.getBOMIModelAccess().getDriversAssignment_5_2()); 
            // InternalBomi.g:1725:2: ( rule__BOMIModel__DriversAssignment_5_2 )
            // InternalBomi.g:1725:3: rule__BOMIModel__DriversAssignment_5_2
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
    // InternalBomi.g:1733:1: rule__BOMIModel__Group_5__3 : rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4 ;
    public final void rule__BOMIModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1737:1: ( rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4 )
            // InternalBomi.g:1738:2: rule__BOMIModel__Group_5__3__Impl rule__BOMIModel__Group_5__4
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
    // InternalBomi.g:1745:1: rule__BOMIModel__Group_5__3__Impl : ( ( rule__BOMIModel__Group_5_3__0 )* ) ;
    public final void rule__BOMIModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1749:1: ( ( ( rule__BOMIModel__Group_5_3__0 )* ) )
            // InternalBomi.g:1750:1: ( ( rule__BOMIModel__Group_5_3__0 )* )
            {
            // InternalBomi.g:1750:1: ( ( rule__BOMIModel__Group_5_3__0 )* )
            // InternalBomi.g:1751:2: ( rule__BOMIModel__Group_5_3__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_5_3()); 
            // InternalBomi.g:1752:2: ( rule__BOMIModel__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBomi.g:1752:3: rule__BOMIModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBomi.g:1760:1: rule__BOMIModel__Group_5__4 : rule__BOMIModel__Group_5__4__Impl ;
    public final void rule__BOMIModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1764:1: ( rule__BOMIModel__Group_5__4__Impl )
            // InternalBomi.g:1765:2: rule__BOMIModel__Group_5__4__Impl
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
    // InternalBomi.g:1771:1: rule__BOMIModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BOMIModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1775:1: ( ( '}' ) )
            // InternalBomi.g:1776:1: ( '}' )
            {
            // InternalBomi.g:1776:1: ( '}' )
            // InternalBomi.g:1777:2: '}'
            {
             before(grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:1787:1: rule__BOMIModel__Group_5_3__0 : rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1 ;
    public final void rule__BOMIModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1791:1: ( rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1 )
            // InternalBomi.g:1792:2: rule__BOMIModel__Group_5_3__0__Impl rule__BOMIModel__Group_5_3__1
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
    // InternalBomi.g:1799:1: rule__BOMIModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1803:1: ( ( ',' ) )
            // InternalBomi.g:1804:1: ( ',' )
            {
            // InternalBomi.g:1804:1: ( ',' )
            // InternalBomi.g:1805:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_5_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:1814:1: rule__BOMIModel__Group_5_3__1 : rule__BOMIModel__Group_5_3__1__Impl ;
    public final void rule__BOMIModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1818:1: ( rule__BOMIModel__Group_5_3__1__Impl )
            // InternalBomi.g:1819:2: rule__BOMIModel__Group_5_3__1__Impl
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
    // InternalBomi.g:1825:1: rule__BOMIModel__Group_5_3__1__Impl : ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) ) ;
    public final void rule__BOMIModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1829:1: ( ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) ) )
            // InternalBomi.g:1830:1: ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) )
            {
            // InternalBomi.g:1830:1: ( ( rule__BOMIModel__DriversAssignment_5_3_1 ) )
            // InternalBomi.g:1831:2: ( rule__BOMIModel__DriversAssignment_5_3_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getDriversAssignment_5_3_1()); 
            // InternalBomi.g:1832:2: ( rule__BOMIModel__DriversAssignment_5_3_1 )
            // InternalBomi.g:1832:3: rule__BOMIModel__DriversAssignment_5_3_1
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
    // InternalBomi.g:1841:1: rule__BOMIModel__Group_6__0 : rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1 ;
    public final void rule__BOMIModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1845:1: ( rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1 )
            // InternalBomi.g:1846:2: rule__BOMIModel__Group_6__0__Impl rule__BOMIModel__Group_6__1
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
    // InternalBomi.g:1853:1: rule__BOMIModel__Group_6__0__Impl : ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) ) ;
    public final void rule__BOMIModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1857:1: ( ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) ) )
            // InternalBomi.g:1858:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) )
            {
            // InternalBomi.g:1858:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 ) )
            // InternalBomi.g:1859:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_6_0()); 
            // InternalBomi.g:1860:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_0 )
            // InternalBomi.g:1860:3: rule__BOMIModel__BoMiCoordinationsAssignment_6_0
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
    // InternalBomi.g:1868:1: rule__BOMIModel__Group_6__1 : rule__BOMIModel__Group_6__1__Impl ;
    public final void rule__BOMIModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1872:1: ( rule__BOMIModel__Group_6__1__Impl )
            // InternalBomi.g:1873:2: rule__BOMIModel__Group_6__1__Impl
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
    // InternalBomi.g:1879:1: rule__BOMIModel__Group_6__1__Impl : ( ( rule__BOMIModel__Group_6_1__0 )* ) ;
    public final void rule__BOMIModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1883:1: ( ( ( rule__BOMIModel__Group_6_1__0 )* ) )
            // InternalBomi.g:1884:1: ( ( rule__BOMIModel__Group_6_1__0 )* )
            {
            // InternalBomi.g:1884:1: ( ( rule__BOMIModel__Group_6_1__0 )* )
            // InternalBomi.g:1885:2: ( rule__BOMIModel__Group_6_1__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_6_1()); 
            // InternalBomi.g:1886:2: ( rule__BOMIModel__Group_6_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBomi.g:1886:3: rule__BOMIModel__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBomi.g:1895:1: rule__BOMIModel__Group_6_1__0 : rule__BOMIModel__Group_6_1__0__Impl rule__BOMIModel__Group_6_1__1 ;
    public final void rule__BOMIModel__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1899:1: ( rule__BOMIModel__Group_6_1__0__Impl rule__BOMIModel__Group_6_1__1 )
            // InternalBomi.g:1900:2: rule__BOMIModel__Group_6_1__0__Impl rule__BOMIModel__Group_6_1__1
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
    // InternalBomi.g:1907:1: rule__BOMIModel__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1911:1: ( ( ',' ) )
            // InternalBomi.g:1912:1: ( ',' )
            {
            // InternalBomi.g:1912:1: ( ',' )
            // InternalBomi.g:1913:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_6_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:1922:1: rule__BOMIModel__Group_6_1__1 : rule__BOMIModel__Group_6_1__1__Impl ;
    public final void rule__BOMIModel__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1926:1: ( rule__BOMIModel__Group_6_1__1__Impl )
            // InternalBomi.g:1927:2: rule__BOMIModel__Group_6_1__1__Impl
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
    // InternalBomi.g:1933:1: rule__BOMIModel__Group_6_1__1__Impl : ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) ) ;
    public final void rule__BOMIModel__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1937:1: ( ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) ) )
            // InternalBomi.g:1938:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) )
            {
            // InternalBomi.g:1938:1: ( ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 ) )
            // InternalBomi.g:1939:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsAssignment_6_1_1()); 
            // InternalBomi.g:1940:2: ( rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 )
            // InternalBomi.g:1940:3: rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1
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
    // InternalBomi.g:1949:1: rule__BOMIModel__Group_7__0 : rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1 ;
    public final void rule__BOMIModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1953:1: ( rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1 )
            // InternalBomi.g:1954:2: rule__BOMIModel__Group_7__0__Impl rule__BOMIModel__Group_7__1
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
    // InternalBomi.g:1961:1: rule__BOMIModel__Group_7__0__Impl : ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) ) ;
    public final void rule__BOMIModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1965:1: ( ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) ) )
            // InternalBomi.g:1966:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) )
            {
            // InternalBomi.g:1966:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 ) )
            // InternalBomi.g:1967:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_7_0()); 
            // InternalBomi.g:1968:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_0 )
            // InternalBomi.g:1968:3: rule__BOMIModel__BoRoleInteractionsAssignment_7_0
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
    // InternalBomi.g:1976:1: rule__BOMIModel__Group_7__1 : rule__BOMIModel__Group_7__1__Impl ;
    public final void rule__BOMIModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1980:1: ( rule__BOMIModel__Group_7__1__Impl )
            // InternalBomi.g:1981:2: rule__BOMIModel__Group_7__1__Impl
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
    // InternalBomi.g:1987:1: rule__BOMIModel__Group_7__1__Impl : ( ( rule__BOMIModel__Group_7_1__0 )* ) ;
    public final void rule__BOMIModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:1991:1: ( ( ( rule__BOMIModel__Group_7_1__0 )* ) )
            // InternalBomi.g:1992:1: ( ( rule__BOMIModel__Group_7_1__0 )* )
            {
            // InternalBomi.g:1992:1: ( ( rule__BOMIModel__Group_7_1__0 )* )
            // InternalBomi.g:1993:2: ( rule__BOMIModel__Group_7_1__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_7_1()); 
            // InternalBomi.g:1994:2: ( rule__BOMIModel__Group_7_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBomi.g:1994:3: rule__BOMIModel__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBomi.g:2003:1: rule__BOMIModel__Group_7_1__0 : rule__BOMIModel__Group_7_1__0__Impl rule__BOMIModel__Group_7_1__1 ;
    public final void rule__BOMIModel__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2007:1: ( rule__BOMIModel__Group_7_1__0__Impl rule__BOMIModel__Group_7_1__1 )
            // InternalBomi.g:2008:2: rule__BOMIModel__Group_7_1__0__Impl rule__BOMIModel__Group_7_1__1
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
    // InternalBomi.g:2015:1: rule__BOMIModel__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2019:1: ( ( ',' ) )
            // InternalBomi.g:2020:1: ( ',' )
            {
            // InternalBomi.g:2020:1: ( ',' )
            // InternalBomi.g:2021:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_7_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:2030:1: rule__BOMIModel__Group_7_1__1 : rule__BOMIModel__Group_7_1__1__Impl ;
    public final void rule__BOMIModel__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2034:1: ( rule__BOMIModel__Group_7_1__1__Impl )
            // InternalBomi.g:2035:2: rule__BOMIModel__Group_7_1__1__Impl
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
    // InternalBomi.g:2041:1: rule__BOMIModel__Group_7_1__1__Impl : ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) ) ;
    public final void rule__BOMIModel__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2045:1: ( ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) ) )
            // InternalBomi.g:2046:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) )
            {
            // InternalBomi.g:2046:1: ( ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 ) )
            // InternalBomi.g:2047:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsAssignment_7_1_1()); 
            // InternalBomi.g:2048:2: ( rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 )
            // InternalBomi.g:2048:3: rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1
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
    // InternalBomi.g:2057:1: rule__BOMIModel__Group_8__0 : rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1 ;
    public final void rule__BOMIModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2061:1: ( rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1 )
            // InternalBomi.g:2062:2: rule__BOMIModel__Group_8__0__Impl rule__BOMIModel__Group_8__1
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
    // InternalBomi.g:2069:1: rule__BOMIModel__Group_8__0__Impl : ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) ) ;
    public final void rule__BOMIModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2073:1: ( ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) ) )
            // InternalBomi.g:2074:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) )
            {
            // InternalBomi.g:2074:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 ) )
            // InternalBomi.g:2075:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_8_0()); 
            // InternalBomi.g:2076:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_0 )
            // InternalBomi.g:2076:3: rule__BOMIModel__BoTeamGovernancesAssignment_8_0
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
    // InternalBomi.g:2084:1: rule__BOMIModel__Group_8__1 : rule__BOMIModel__Group_8__1__Impl ;
    public final void rule__BOMIModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2088:1: ( rule__BOMIModel__Group_8__1__Impl )
            // InternalBomi.g:2089:2: rule__BOMIModel__Group_8__1__Impl
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
    // InternalBomi.g:2095:1: rule__BOMIModel__Group_8__1__Impl : ( ( rule__BOMIModel__Group_8_1__0 )* ) ;
    public final void rule__BOMIModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2099:1: ( ( ( rule__BOMIModel__Group_8_1__0 )* ) )
            // InternalBomi.g:2100:1: ( ( rule__BOMIModel__Group_8_1__0 )* )
            {
            // InternalBomi.g:2100:1: ( ( rule__BOMIModel__Group_8_1__0 )* )
            // InternalBomi.g:2101:2: ( rule__BOMIModel__Group_8_1__0 )*
            {
             before(grammarAccess.getBOMIModelAccess().getGroup_8_1()); 
            // InternalBomi.g:2102:2: ( rule__BOMIModel__Group_8_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBomi.g:2102:3: rule__BOMIModel__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMIModel__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBomi.g:2111:1: rule__BOMIModel__Group_8_1__0 : rule__BOMIModel__Group_8_1__0__Impl rule__BOMIModel__Group_8_1__1 ;
    public final void rule__BOMIModel__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2115:1: ( rule__BOMIModel__Group_8_1__0__Impl rule__BOMIModel__Group_8_1__1 )
            // InternalBomi.g:2116:2: rule__BOMIModel__Group_8_1__0__Impl rule__BOMIModel__Group_8_1__1
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
    // InternalBomi.g:2123:1: rule__BOMIModel__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__BOMIModel__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2127:1: ( ( ',' ) )
            // InternalBomi.g:2128:1: ( ',' )
            {
            // InternalBomi.g:2128:1: ( ',' )
            // InternalBomi.g:2129:2: ','
            {
             before(grammarAccess.getBOMIModelAccess().getCommaKeyword_8_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:2138:1: rule__BOMIModel__Group_8_1__1 : rule__BOMIModel__Group_8_1__1__Impl ;
    public final void rule__BOMIModel__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2142:1: ( rule__BOMIModel__Group_8_1__1__Impl )
            // InternalBomi.g:2143:2: rule__BOMIModel__Group_8_1__1__Impl
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
    // InternalBomi.g:2149:1: rule__BOMIModel__Group_8_1__1__Impl : ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) ) ;
    public final void rule__BOMIModel__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2153:1: ( ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) ) )
            // InternalBomi.g:2154:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) )
            {
            // InternalBomi.g:2154:1: ( ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 ) )
            // InternalBomi.g:2155:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 )
            {
             before(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesAssignment_8_1_1()); 
            // InternalBomi.g:2156:2: ( rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 )
            // InternalBomi.g:2156:3: rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1
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
    // InternalBomi.g:2165:1: rule__BoundaryObject__Group__0 : rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1 ;
    public final void rule__BoundaryObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2169:1: ( rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1 )
            // InternalBomi.g:2170:2: rule__BoundaryObject__Group__0__Impl rule__BoundaryObject__Group__1
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
    // InternalBomi.g:2177:1: rule__BoundaryObject__Group__0__Impl : ( () ) ;
    public final void rule__BoundaryObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2181:1: ( ( () ) )
            // InternalBomi.g:2182:1: ( () )
            {
            // InternalBomi.g:2182:1: ( () )
            // InternalBomi.g:2183:2: ()
            {
             before(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectAction_0()); 
            // InternalBomi.g:2184:2: ()
            // InternalBomi.g:2184:3: 
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
    // InternalBomi.g:2192:1: rule__BoundaryObject__Group__1 : rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2 ;
    public final void rule__BoundaryObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2196:1: ( rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2 )
            // InternalBomi.g:2197:2: rule__BoundaryObject__Group__1__Impl rule__BoundaryObject__Group__2
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
    // InternalBomi.g:2204:1: rule__BoundaryObject__Group__1__Impl : ( 'BoundaryObject' ) ;
    public final void rule__BoundaryObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2208:1: ( ( 'BoundaryObject' ) )
            // InternalBomi.g:2209:1: ( 'BoundaryObject' )
            {
            // InternalBomi.g:2209:1: ( 'BoundaryObject' )
            // InternalBomi.g:2210:2: 'BoundaryObject'
            {
             before(grammarAccess.getBoundaryObjectAccess().getBoundaryObjectKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBomi.g:2219:1: rule__BoundaryObject__Group__2 : rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3 ;
    public final void rule__BoundaryObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2223:1: ( rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3 )
            // InternalBomi.g:2224:2: rule__BoundaryObject__Group__2__Impl rule__BoundaryObject__Group__3
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
    // InternalBomi.g:2231:1: rule__BoundaryObject__Group__2__Impl : ( ( rule__BoundaryObject__NameAssignment_2 ) ) ;
    public final void rule__BoundaryObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2235:1: ( ( ( rule__BoundaryObject__NameAssignment_2 ) ) )
            // InternalBomi.g:2236:1: ( ( rule__BoundaryObject__NameAssignment_2 ) )
            {
            // InternalBomi.g:2236:1: ( ( rule__BoundaryObject__NameAssignment_2 ) )
            // InternalBomi.g:2237:2: ( rule__BoundaryObject__NameAssignment_2 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getNameAssignment_2()); 
            // InternalBomi.g:2238:2: ( rule__BoundaryObject__NameAssignment_2 )
            // InternalBomi.g:2238:3: rule__BoundaryObject__NameAssignment_2
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
    // InternalBomi.g:2246:1: rule__BoundaryObject__Group__3 : rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4 ;
    public final void rule__BoundaryObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2250:1: ( rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4 )
            // InternalBomi.g:2251:2: rule__BoundaryObject__Group__3__Impl rule__BoundaryObject__Group__4
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
    // InternalBomi.g:2258:1: rule__BoundaryObject__Group__3__Impl : ( '{' ) ;
    public final void rule__BoundaryObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2262:1: ( ( '{' ) )
            // InternalBomi.g:2263:1: ( '{' )
            {
            // InternalBomi.g:2263:1: ( '{' )
            // InternalBomi.g:2264:2: '{'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:2273:1: rule__BoundaryObject__Group__4 : rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5 ;
    public final void rule__BoundaryObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2277:1: ( rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5 )
            // InternalBomi.g:2278:2: rule__BoundaryObject__Group__4__Impl rule__BoundaryObject__Group__5
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
    // InternalBomi.g:2285:1: rule__BoundaryObject__Group__4__Impl : ( ( rule__BoundaryObject__Group_4__0 )? ) ;
    public final void rule__BoundaryObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2289:1: ( ( ( rule__BoundaryObject__Group_4__0 )? ) )
            // InternalBomi.g:2290:1: ( ( rule__BoundaryObject__Group_4__0 )? )
            {
            // InternalBomi.g:2290:1: ( ( rule__BoundaryObject__Group_4__0 )? )
            // InternalBomi.g:2291:2: ( rule__BoundaryObject__Group_4__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_4()); 
            // InternalBomi.g:2292:2: ( rule__BoundaryObject__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBomi.g:2292:3: rule__BoundaryObject__Group_4__0
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
    // InternalBomi.g:2300:1: rule__BoundaryObject__Group__5 : rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6 ;
    public final void rule__BoundaryObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2304:1: ( rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6 )
            // InternalBomi.g:2305:2: rule__BoundaryObject__Group__5__Impl rule__BoundaryObject__Group__6
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
    // InternalBomi.g:2312:1: rule__BoundaryObject__Group__5__Impl : ( ( rule__BoundaryObject__Group_5__0 )? ) ;
    public final void rule__BoundaryObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2316:1: ( ( ( rule__BoundaryObject__Group_5__0 )? ) )
            // InternalBomi.g:2317:1: ( ( rule__BoundaryObject__Group_5__0 )? )
            {
            // InternalBomi.g:2317:1: ( ( rule__BoundaryObject__Group_5__0 )? )
            // InternalBomi.g:2318:2: ( rule__BoundaryObject__Group_5__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_5()); 
            // InternalBomi.g:2319:2: ( rule__BoundaryObject__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBomi.g:2319:3: rule__BoundaryObject__Group_5__0
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
    // InternalBomi.g:2327:1: rule__BoundaryObject__Group__6 : rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7 ;
    public final void rule__BoundaryObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2331:1: ( rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7 )
            // InternalBomi.g:2332:2: rule__BoundaryObject__Group__6__Impl rule__BoundaryObject__Group__7
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
    // InternalBomi.g:2339:1: rule__BoundaryObject__Group__6__Impl : ( ( rule__BoundaryObject__Group_6__0 )? ) ;
    public final void rule__BoundaryObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2343:1: ( ( ( rule__BoundaryObject__Group_6__0 )? ) )
            // InternalBomi.g:2344:1: ( ( rule__BoundaryObject__Group_6__0 )? )
            {
            // InternalBomi.g:2344:1: ( ( rule__BoundaryObject__Group_6__0 )? )
            // InternalBomi.g:2345:2: ( rule__BoundaryObject__Group_6__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_6()); 
            // InternalBomi.g:2346:2: ( rule__BoundaryObject__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBomi.g:2346:3: rule__BoundaryObject__Group_6__0
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
    // InternalBomi.g:2354:1: rule__BoundaryObject__Group__7 : rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8 ;
    public final void rule__BoundaryObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2358:1: ( rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8 )
            // InternalBomi.g:2359:2: rule__BoundaryObject__Group__7__Impl rule__BoundaryObject__Group__8
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
    // InternalBomi.g:2366:1: rule__BoundaryObject__Group__7__Impl : ( ( rule__BoundaryObject__Group_7__0 )? ) ;
    public final void rule__BoundaryObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2370:1: ( ( ( rule__BoundaryObject__Group_7__0 )? ) )
            // InternalBomi.g:2371:1: ( ( rule__BoundaryObject__Group_7__0 )? )
            {
            // InternalBomi.g:2371:1: ( ( rule__BoundaryObject__Group_7__0 )? )
            // InternalBomi.g:2372:2: ( rule__BoundaryObject__Group_7__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_7()); 
            // InternalBomi.g:2373:2: ( rule__BoundaryObject__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBomi.g:2373:3: rule__BoundaryObject__Group_7__0
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
    // InternalBomi.g:2381:1: rule__BoundaryObject__Group__8 : rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9 ;
    public final void rule__BoundaryObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2385:1: ( rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9 )
            // InternalBomi.g:2386:2: rule__BoundaryObject__Group__8__Impl rule__BoundaryObject__Group__9
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
    // InternalBomi.g:2393:1: rule__BoundaryObject__Group__8__Impl : ( ( rule__BoundaryObject__Group_8__0 )? ) ;
    public final void rule__BoundaryObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2397:1: ( ( ( rule__BoundaryObject__Group_8__0 )? ) )
            // InternalBomi.g:2398:1: ( ( rule__BoundaryObject__Group_8__0 )? )
            {
            // InternalBomi.g:2398:1: ( ( rule__BoundaryObject__Group_8__0 )? )
            // InternalBomi.g:2399:2: ( rule__BoundaryObject__Group_8__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_8()); 
            // InternalBomi.g:2400:2: ( rule__BoundaryObject__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBomi.g:2400:3: rule__BoundaryObject__Group_8__0
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
    // InternalBomi.g:2408:1: rule__BoundaryObject__Group__9 : rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10 ;
    public final void rule__BoundaryObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2412:1: ( rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10 )
            // InternalBomi.g:2413:2: rule__BoundaryObject__Group__9__Impl rule__BoundaryObject__Group__10
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
    // InternalBomi.g:2420:1: rule__BoundaryObject__Group__9__Impl : ( ( rule__BoundaryObject__Group_9__0 )? ) ;
    public final void rule__BoundaryObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2424:1: ( ( ( rule__BoundaryObject__Group_9__0 )? ) )
            // InternalBomi.g:2425:1: ( ( rule__BoundaryObject__Group_9__0 )? )
            {
            // InternalBomi.g:2425:1: ( ( rule__BoundaryObject__Group_9__0 )? )
            // InternalBomi.g:2426:2: ( rule__BoundaryObject__Group_9__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_9()); 
            // InternalBomi.g:2427:2: ( rule__BoundaryObject__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBomi.g:2427:3: rule__BoundaryObject__Group_9__0
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
    // InternalBomi.g:2435:1: rule__BoundaryObject__Group__10 : rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11 ;
    public final void rule__BoundaryObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2439:1: ( rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11 )
            // InternalBomi.g:2440:2: rule__BoundaryObject__Group__10__Impl rule__BoundaryObject__Group__11
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
    // InternalBomi.g:2447:1: rule__BoundaryObject__Group__10__Impl : ( ( rule__BoundaryObject__Group_10__0 )? ) ;
    public final void rule__BoundaryObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2451:1: ( ( ( rule__BoundaryObject__Group_10__0 )? ) )
            // InternalBomi.g:2452:1: ( ( rule__BoundaryObject__Group_10__0 )? )
            {
            // InternalBomi.g:2452:1: ( ( rule__BoundaryObject__Group_10__0 )? )
            // InternalBomi.g:2453:2: ( rule__BoundaryObject__Group_10__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_10()); 
            // InternalBomi.g:2454:2: ( rule__BoundaryObject__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBomi.g:2454:3: rule__BoundaryObject__Group_10__0
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
    // InternalBomi.g:2462:1: rule__BoundaryObject__Group__11 : rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12 ;
    public final void rule__BoundaryObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2466:1: ( rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12 )
            // InternalBomi.g:2467:2: rule__BoundaryObject__Group__11__Impl rule__BoundaryObject__Group__12
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
    // InternalBomi.g:2474:1: rule__BoundaryObject__Group__11__Impl : ( ( rule__BoundaryObject__Group_11__0 )? ) ;
    public final void rule__BoundaryObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2478:1: ( ( ( rule__BoundaryObject__Group_11__0 )? ) )
            // InternalBomi.g:2479:1: ( ( rule__BoundaryObject__Group_11__0 )? )
            {
            // InternalBomi.g:2479:1: ( ( rule__BoundaryObject__Group_11__0 )? )
            // InternalBomi.g:2480:2: ( rule__BoundaryObject__Group_11__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_11()); 
            // InternalBomi.g:2481:2: ( rule__BoundaryObject__Group_11__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBomi.g:2481:3: rule__BoundaryObject__Group_11__0
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
    // InternalBomi.g:2489:1: rule__BoundaryObject__Group__12 : rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13 ;
    public final void rule__BoundaryObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2493:1: ( rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13 )
            // InternalBomi.g:2494:2: rule__BoundaryObject__Group__12__Impl rule__BoundaryObject__Group__13
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
    // InternalBomi.g:2501:1: rule__BoundaryObject__Group__12__Impl : ( ( rule__BoundaryObject__Group_12__0 )? ) ;
    public final void rule__BoundaryObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2505:1: ( ( ( rule__BoundaryObject__Group_12__0 )? ) )
            // InternalBomi.g:2506:1: ( ( rule__BoundaryObject__Group_12__0 )? )
            {
            // InternalBomi.g:2506:1: ( ( rule__BoundaryObject__Group_12__0 )? )
            // InternalBomi.g:2507:2: ( rule__BoundaryObject__Group_12__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_12()); 
            // InternalBomi.g:2508:2: ( rule__BoundaryObject__Group_12__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBomi.g:2508:3: rule__BoundaryObject__Group_12__0
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
    // InternalBomi.g:2516:1: rule__BoundaryObject__Group__13 : rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14 ;
    public final void rule__BoundaryObject__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2520:1: ( rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14 )
            // InternalBomi.g:2521:2: rule__BoundaryObject__Group__13__Impl rule__BoundaryObject__Group__14
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
    // InternalBomi.g:2528:1: rule__BoundaryObject__Group__13__Impl : ( ( rule__BoundaryObject__Group_13__0 )? ) ;
    public final void rule__BoundaryObject__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2532:1: ( ( ( rule__BoundaryObject__Group_13__0 )? ) )
            // InternalBomi.g:2533:1: ( ( rule__BoundaryObject__Group_13__0 )? )
            {
            // InternalBomi.g:2533:1: ( ( rule__BoundaryObject__Group_13__0 )? )
            // InternalBomi.g:2534:2: ( rule__BoundaryObject__Group_13__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_13()); 
            // InternalBomi.g:2535:2: ( rule__BoundaryObject__Group_13__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBomi.g:2535:3: rule__BoundaryObject__Group_13__0
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
    // InternalBomi.g:2543:1: rule__BoundaryObject__Group__14 : rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15 ;
    public final void rule__BoundaryObject__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2547:1: ( rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15 )
            // InternalBomi.g:2548:2: rule__BoundaryObject__Group__14__Impl rule__BoundaryObject__Group__15
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
    // InternalBomi.g:2555:1: rule__BoundaryObject__Group__14__Impl : ( ( rule__BoundaryObject__Group_14__0 )? ) ;
    public final void rule__BoundaryObject__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2559:1: ( ( ( rule__BoundaryObject__Group_14__0 )? ) )
            // InternalBomi.g:2560:1: ( ( rule__BoundaryObject__Group_14__0 )? )
            {
            // InternalBomi.g:2560:1: ( ( rule__BoundaryObject__Group_14__0 )? )
            // InternalBomi.g:2561:2: ( rule__BoundaryObject__Group_14__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_14()); 
            // InternalBomi.g:2562:2: ( rule__BoundaryObject__Group_14__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBomi.g:2562:3: rule__BoundaryObject__Group_14__0
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
    // InternalBomi.g:2570:1: rule__BoundaryObject__Group__15 : rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16 ;
    public final void rule__BoundaryObject__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2574:1: ( rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16 )
            // InternalBomi.g:2575:2: rule__BoundaryObject__Group__15__Impl rule__BoundaryObject__Group__16
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
    // InternalBomi.g:2582:1: rule__BoundaryObject__Group__15__Impl : ( ( rule__BoundaryObject__Group_15__0 )? ) ;
    public final void rule__BoundaryObject__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2586:1: ( ( ( rule__BoundaryObject__Group_15__0 )? ) )
            // InternalBomi.g:2587:1: ( ( rule__BoundaryObject__Group_15__0 )? )
            {
            // InternalBomi.g:2587:1: ( ( rule__BoundaryObject__Group_15__0 )? )
            // InternalBomi.g:2588:2: ( rule__BoundaryObject__Group_15__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_15()); 
            // InternalBomi.g:2589:2: ( rule__BoundaryObject__Group_15__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBomi.g:2589:3: rule__BoundaryObject__Group_15__0
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
    // InternalBomi.g:2597:1: rule__BoundaryObject__Group__16 : rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17 ;
    public final void rule__BoundaryObject__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2601:1: ( rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17 )
            // InternalBomi.g:2602:2: rule__BoundaryObject__Group__16__Impl rule__BoundaryObject__Group__17
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
    // InternalBomi.g:2609:1: rule__BoundaryObject__Group__16__Impl : ( ( rule__BoundaryObject__Group_16__0 )? ) ;
    public final void rule__BoundaryObject__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2613:1: ( ( ( rule__BoundaryObject__Group_16__0 )? ) )
            // InternalBomi.g:2614:1: ( ( rule__BoundaryObject__Group_16__0 )? )
            {
            // InternalBomi.g:2614:1: ( ( rule__BoundaryObject__Group_16__0 )? )
            // InternalBomi.g:2615:2: ( rule__BoundaryObject__Group_16__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_16()); 
            // InternalBomi.g:2616:2: ( rule__BoundaryObject__Group_16__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBomi.g:2616:3: rule__BoundaryObject__Group_16__0
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
    // InternalBomi.g:2624:1: rule__BoundaryObject__Group__17 : rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18 ;
    public final void rule__BoundaryObject__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2628:1: ( rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18 )
            // InternalBomi.g:2629:2: rule__BoundaryObject__Group__17__Impl rule__BoundaryObject__Group__18
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
    // InternalBomi.g:2636:1: rule__BoundaryObject__Group__17__Impl : ( ( rule__BoundaryObject__Group_17__0 )? ) ;
    public final void rule__BoundaryObject__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2640:1: ( ( ( rule__BoundaryObject__Group_17__0 )? ) )
            // InternalBomi.g:2641:1: ( ( rule__BoundaryObject__Group_17__0 )? )
            {
            // InternalBomi.g:2641:1: ( ( rule__BoundaryObject__Group_17__0 )? )
            // InternalBomi.g:2642:2: ( rule__BoundaryObject__Group_17__0 )?
            {
             before(grammarAccess.getBoundaryObjectAccess().getGroup_17()); 
            // InternalBomi.g:2643:2: ( rule__BoundaryObject__Group_17__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBomi.g:2643:3: rule__BoundaryObject__Group_17__0
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
    // InternalBomi.g:2651:1: rule__BoundaryObject__Group__18 : rule__BoundaryObject__Group__18__Impl ;
    public final void rule__BoundaryObject__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2655:1: ( rule__BoundaryObject__Group__18__Impl )
            // InternalBomi.g:2656:2: rule__BoundaryObject__Group__18__Impl
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
    // InternalBomi.g:2662:1: rule__BoundaryObject__Group__18__Impl : ( '}' ) ;
    public final void rule__BoundaryObject__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2666:1: ( ( '}' ) )
            // InternalBomi.g:2667:1: ( '}' )
            {
            // InternalBomi.g:2667:1: ( '}' )
            // InternalBomi.g:2668:2: '}'
            {
             before(grammarAccess.getBoundaryObjectAccess().getRightCurlyBracketKeyword_18()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:2678:1: rule__BoundaryObject__Group_4__0 : rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1 ;
    public final void rule__BoundaryObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2682:1: ( rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1 )
            // InternalBomi.g:2683:2: rule__BoundaryObject__Group_4__0__Impl rule__BoundaryObject__Group_4__1
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
    // InternalBomi.g:2690:1: rule__BoundaryObject__Group_4__0__Impl : ( 'superType' ) ;
    public final void rule__BoundaryObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2694:1: ( ( 'superType' ) )
            // InternalBomi.g:2695:1: ( 'superType' )
            {
            // InternalBomi.g:2695:1: ( 'superType' )
            // InternalBomi.g:2696:2: 'superType'
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBomi.g:2705:1: rule__BoundaryObject__Group_4__1 : rule__BoundaryObject__Group_4__1__Impl ;
    public final void rule__BoundaryObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2709:1: ( rule__BoundaryObject__Group_4__1__Impl )
            // InternalBomi.g:2710:2: rule__BoundaryObject__Group_4__1__Impl
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
    // InternalBomi.g:2716:1: rule__BoundaryObject__Group_4__1__Impl : ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__BoundaryObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2720:1: ( ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) ) )
            // InternalBomi.g:2721:1: ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) )
            {
            // InternalBomi.g:2721:1: ( ( rule__BoundaryObject__SuperTypeAssignment_4_1 ) )
            // InternalBomi.g:2722:2: ( rule__BoundaryObject__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getSuperTypeAssignment_4_1()); 
            // InternalBomi.g:2723:2: ( rule__BoundaryObject__SuperTypeAssignment_4_1 )
            // InternalBomi.g:2723:3: rule__BoundaryObject__SuperTypeAssignment_4_1
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
    // InternalBomi.g:2732:1: rule__BoundaryObject__Group_5__0 : rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1 ;
    public final void rule__BoundaryObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2736:1: ( rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1 )
            // InternalBomi.g:2737:2: rule__BoundaryObject__Group_5__0__Impl rule__BoundaryObject__Group_5__1
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
    // InternalBomi.g:2744:1: rule__BoundaryObject__Group_5__0__Impl : ( 'purpose' ) ;
    public final void rule__BoundaryObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2748:1: ( ( 'purpose' ) )
            // InternalBomi.g:2749:1: ( 'purpose' )
            {
            // InternalBomi.g:2749:1: ( 'purpose' )
            // InternalBomi.g:2750:2: 'purpose'
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBomi.g:2759:1: rule__BoundaryObject__Group_5__1 : rule__BoundaryObject__Group_5__1__Impl ;
    public final void rule__BoundaryObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2763:1: ( rule__BoundaryObject__Group_5__1__Impl )
            // InternalBomi.g:2764:2: rule__BoundaryObject__Group_5__1__Impl
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
    // InternalBomi.g:2770:1: rule__BoundaryObject__Group_5__1__Impl : ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) ) ;
    public final void rule__BoundaryObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2774:1: ( ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) ) )
            // InternalBomi.g:2775:1: ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) )
            {
            // InternalBomi.g:2775:1: ( ( rule__BoundaryObject__PurposeAssignment_5_1 ) )
            // InternalBomi.g:2776:2: ( rule__BoundaryObject__PurposeAssignment_5_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getPurposeAssignment_5_1()); 
            // InternalBomi.g:2777:2: ( rule__BoundaryObject__PurposeAssignment_5_1 )
            // InternalBomi.g:2777:3: rule__BoundaryObject__PurposeAssignment_5_1
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
    // InternalBomi.g:2786:1: rule__BoundaryObject__Group_6__0 : rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1 ;
    public final void rule__BoundaryObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2790:1: ( rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1 )
            // InternalBomi.g:2791:2: rule__BoundaryObject__Group_6__0__Impl rule__BoundaryObject__Group_6__1
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
    // InternalBomi.g:2798:1: rule__BoundaryObject__Group_6__0__Impl : ( 'levelOfDetail' ) ;
    public final void rule__BoundaryObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2802:1: ( ( 'levelOfDetail' ) )
            // InternalBomi.g:2803:1: ( 'levelOfDetail' )
            {
            // InternalBomi.g:2803:1: ( 'levelOfDetail' )
            // InternalBomi.g:2804:2: 'levelOfDetail'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBomi.g:2813:1: rule__BoundaryObject__Group_6__1 : rule__BoundaryObject__Group_6__1__Impl ;
    public final void rule__BoundaryObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2817:1: ( rule__BoundaryObject__Group_6__1__Impl )
            // InternalBomi.g:2818:2: rule__BoundaryObject__Group_6__1__Impl
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
    // InternalBomi.g:2824:1: rule__BoundaryObject__Group_6__1__Impl : ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) ) ;
    public final void rule__BoundaryObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2828:1: ( ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) ) )
            // InternalBomi.g:2829:1: ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) )
            {
            // InternalBomi.g:2829:1: ( ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 ) )
            // InternalBomi.g:2830:2: ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailAssignment_6_1()); 
            // InternalBomi.g:2831:2: ( rule__BoundaryObject__LevelOfDetailAssignment_6_1 )
            // InternalBomi.g:2831:3: rule__BoundaryObject__LevelOfDetailAssignment_6_1
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
    // InternalBomi.g:2840:1: rule__BoundaryObject__Group_7__0 : rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1 ;
    public final void rule__BoundaryObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2844:1: ( rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1 )
            // InternalBomi.g:2845:2: rule__BoundaryObject__Group_7__0__Impl rule__BoundaryObject__Group_7__1
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
    // InternalBomi.g:2852:1: rule__BoundaryObject__Group_7__0__Impl : ( 'frequencyOfChange' ) ;
    public final void rule__BoundaryObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2856:1: ( ( 'frequencyOfChange' ) )
            // InternalBomi.g:2857:1: ( 'frequencyOfChange' )
            {
            // InternalBomi.g:2857:1: ( 'frequencyOfChange' )
            // InternalBomi.g:2858:2: 'frequencyOfChange'
            {
             before(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBomi.g:2867:1: rule__BoundaryObject__Group_7__1 : rule__BoundaryObject__Group_7__1__Impl ;
    public final void rule__BoundaryObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2871:1: ( rule__BoundaryObject__Group_7__1__Impl )
            // InternalBomi.g:2872:2: rule__BoundaryObject__Group_7__1__Impl
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
    // InternalBomi.g:2878:1: rule__BoundaryObject__Group_7__1__Impl : ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) ) ;
    public final void rule__BoundaryObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2882:1: ( ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) ) )
            // InternalBomi.g:2883:1: ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) )
            {
            // InternalBomi.g:2883:1: ( ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 ) )
            // InternalBomi.g:2884:2: ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeAssignment_7_1()); 
            // InternalBomi.g:2885:2: ( rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 )
            // InternalBomi.g:2885:3: rule__BoundaryObject__FrequencyOfChangeAssignment_7_1
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
    // InternalBomi.g:2894:1: rule__BoundaryObject__Group_8__0 : rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1 ;
    public final void rule__BoundaryObject__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2898:1: ( rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1 )
            // InternalBomi.g:2899:2: rule__BoundaryObject__Group_8__0__Impl rule__BoundaryObject__Group_8__1
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
    // InternalBomi.g:2906:1: rule__BoundaryObject__Group_8__0__Impl : ( 'modularity' ) ;
    public final void rule__BoundaryObject__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2910:1: ( ( 'modularity' ) )
            // InternalBomi.g:2911:1: ( 'modularity' )
            {
            // InternalBomi.g:2911:1: ( 'modularity' )
            // InternalBomi.g:2912:2: 'modularity'
            {
             before(grammarAccess.getBoundaryObjectAccess().getModularityKeyword_8_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBomi.g:2921:1: rule__BoundaryObject__Group_8__1 : rule__BoundaryObject__Group_8__1__Impl ;
    public final void rule__BoundaryObject__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2925:1: ( rule__BoundaryObject__Group_8__1__Impl )
            // InternalBomi.g:2926:2: rule__BoundaryObject__Group_8__1__Impl
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
    // InternalBomi.g:2932:1: rule__BoundaryObject__Group_8__1__Impl : ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) ) ;
    public final void rule__BoundaryObject__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2936:1: ( ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) ) )
            // InternalBomi.g:2937:1: ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) )
            {
            // InternalBomi.g:2937:1: ( ( rule__BoundaryObject__ModularityAssignment_8_1 ) )
            // InternalBomi.g:2938:2: ( rule__BoundaryObject__ModularityAssignment_8_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getModularityAssignment_8_1()); 
            // InternalBomi.g:2939:2: ( rule__BoundaryObject__ModularityAssignment_8_1 )
            // InternalBomi.g:2939:3: rule__BoundaryObject__ModularityAssignment_8_1
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
    // InternalBomi.g:2948:1: rule__BoundaryObject__Group_9__0 : rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1 ;
    public final void rule__BoundaryObject__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2952:1: ( rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1 )
            // InternalBomi.g:2953:2: rule__BoundaryObject__Group_9__0__Impl rule__BoundaryObject__Group_9__1
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
    // InternalBomi.g:2960:1: rule__BoundaryObject__Group_9__0__Impl : ( 'maintainability' ) ;
    public final void rule__BoundaryObject__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2964:1: ( ( 'maintainability' ) )
            // InternalBomi.g:2965:1: ( 'maintainability' )
            {
            // InternalBomi.g:2965:1: ( 'maintainability' )
            // InternalBomi.g:2966:2: 'maintainability'
            {
             before(grammarAccess.getBoundaryObjectAccess().getMaintainabilityKeyword_9_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBomi.g:2975:1: rule__BoundaryObject__Group_9__1 : rule__BoundaryObject__Group_9__1__Impl ;
    public final void rule__BoundaryObject__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2979:1: ( rule__BoundaryObject__Group_9__1__Impl )
            // InternalBomi.g:2980:2: rule__BoundaryObject__Group_9__1__Impl
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
    // InternalBomi.g:2986:1: rule__BoundaryObject__Group_9__1__Impl : ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) ) ;
    public final void rule__BoundaryObject__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:2990:1: ( ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) ) )
            // InternalBomi.g:2991:1: ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) )
            {
            // InternalBomi.g:2991:1: ( ( rule__BoundaryObject__MaintainabilityAssignment_9_1 ) )
            // InternalBomi.g:2992:2: ( rule__BoundaryObject__MaintainabilityAssignment_9_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getMaintainabilityAssignment_9_1()); 
            // InternalBomi.g:2993:2: ( rule__BoundaryObject__MaintainabilityAssignment_9_1 )
            // InternalBomi.g:2993:3: rule__BoundaryObject__MaintainabilityAssignment_9_1
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
    // InternalBomi.g:3002:1: rule__BoundaryObject__Group_10__0 : rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1 ;
    public final void rule__BoundaryObject__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3006:1: ( rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1 )
            // InternalBomi.g:3007:2: rule__BoundaryObject__Group_10__0__Impl rule__BoundaryObject__Group_10__1
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
    // InternalBomi.g:3014:1: rule__BoundaryObject__Group_10__0__Impl : ( 'prescriptive' ) ;
    public final void rule__BoundaryObject__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3018:1: ( ( 'prescriptive' ) )
            // InternalBomi.g:3019:1: ( 'prescriptive' )
            {
            // InternalBomi.g:3019:1: ( 'prescriptive' )
            // InternalBomi.g:3020:2: 'prescriptive'
            {
             before(grammarAccess.getBoundaryObjectAccess().getPrescriptiveKeyword_10_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBomi.g:3029:1: rule__BoundaryObject__Group_10__1 : rule__BoundaryObject__Group_10__1__Impl ;
    public final void rule__BoundaryObject__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3033:1: ( rule__BoundaryObject__Group_10__1__Impl )
            // InternalBomi.g:3034:2: rule__BoundaryObject__Group_10__1__Impl
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
    // InternalBomi.g:3040:1: rule__BoundaryObject__Group_10__1__Impl : ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) ) ;
    public final void rule__BoundaryObject__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3044:1: ( ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) ) )
            // InternalBomi.g:3045:1: ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) )
            {
            // InternalBomi.g:3045:1: ( ( rule__BoundaryObject__PrescriptiveAssignment_10_1 ) )
            // InternalBomi.g:3046:2: ( rule__BoundaryObject__PrescriptiveAssignment_10_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getPrescriptiveAssignment_10_1()); 
            // InternalBomi.g:3047:2: ( rule__BoundaryObject__PrescriptiveAssignment_10_1 )
            // InternalBomi.g:3047:3: rule__BoundaryObject__PrescriptiveAssignment_10_1
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
    // InternalBomi.g:3056:1: rule__BoundaryObject__Group_11__0 : rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1 ;
    public final void rule__BoundaryObject__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3060:1: ( rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1 )
            // InternalBomi.g:3061:2: rule__BoundaryObject__Group_11__0__Impl rule__BoundaryObject__Group_11__1
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
    // InternalBomi.g:3068:1: rule__BoundaryObject__Group_11__0__Impl : ( 'lifecycleStage' ) ;
    public final void rule__BoundaryObject__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3072:1: ( ( 'lifecycleStage' ) )
            // InternalBomi.g:3073:1: ( 'lifecycleStage' )
            {
            // InternalBomi.g:3073:1: ( 'lifecycleStage' )
            // InternalBomi.g:3074:2: 'lifecycleStage'
            {
             before(grammarAccess.getBoundaryObjectAccess().getLifecycleStageKeyword_11_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBomi.g:3083:1: rule__BoundaryObject__Group_11__1 : rule__BoundaryObject__Group_11__1__Impl ;
    public final void rule__BoundaryObject__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3087:1: ( rule__BoundaryObject__Group_11__1__Impl )
            // InternalBomi.g:3088:2: rule__BoundaryObject__Group_11__1__Impl
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
    // InternalBomi.g:3094:1: rule__BoundaryObject__Group_11__1__Impl : ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) ) ;
    public final void rule__BoundaryObject__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3098:1: ( ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) ) )
            // InternalBomi.g:3099:1: ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) )
            {
            // InternalBomi.g:3099:1: ( ( rule__BoundaryObject__LifecycleStageAssignment_11_1 ) )
            // InternalBomi.g:3100:2: ( rule__BoundaryObject__LifecycleStageAssignment_11_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getLifecycleStageAssignment_11_1()); 
            // InternalBomi.g:3101:2: ( rule__BoundaryObject__LifecycleStageAssignment_11_1 )
            // InternalBomi.g:3101:3: rule__BoundaryObject__LifecycleStageAssignment_11_1
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
    // InternalBomi.g:3110:1: rule__BoundaryObject__Group_12__0 : rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1 ;
    public final void rule__BoundaryObject__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3114:1: ( rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1 )
            // InternalBomi.g:3115:2: rule__BoundaryObject__Group_12__0__Impl rule__BoundaryObject__Group_12__1
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
    // InternalBomi.g:3122:1: rule__BoundaryObject__Group_12__0__Impl : ( 'representationFormat' ) ;
    public final void rule__BoundaryObject__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3126:1: ( ( 'representationFormat' ) )
            // InternalBomi.g:3127:1: ( 'representationFormat' )
            {
            // InternalBomi.g:3127:1: ( 'representationFormat' )
            // InternalBomi.g:3128:2: 'representationFormat'
            {
             before(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatKeyword_12_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBomi.g:3137:1: rule__BoundaryObject__Group_12__1 : rule__BoundaryObject__Group_12__1__Impl ;
    public final void rule__BoundaryObject__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3141:1: ( rule__BoundaryObject__Group_12__1__Impl )
            // InternalBomi.g:3142:2: rule__BoundaryObject__Group_12__1__Impl
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
    // InternalBomi.g:3148:1: rule__BoundaryObject__Group_12__1__Impl : ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) ) ;
    public final void rule__BoundaryObject__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3152:1: ( ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) ) )
            // InternalBomi.g:3153:1: ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) )
            {
            // InternalBomi.g:3153:1: ( ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 ) )
            // InternalBomi.g:3154:2: ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatAssignment_12_1()); 
            // InternalBomi.g:3155:2: ( rule__BoundaryObject__RepresentationFormatAssignment_12_1 )
            // InternalBomi.g:3155:3: rule__BoundaryObject__RepresentationFormatAssignment_12_1
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
    // InternalBomi.g:3164:1: rule__BoundaryObject__Group_13__0 : rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1 ;
    public final void rule__BoundaryObject__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3168:1: ( rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1 )
            // InternalBomi.g:3169:2: rule__BoundaryObject__Group_13__0__Impl rule__BoundaryObject__Group_13__1
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
    // InternalBomi.g:3176:1: rule__BoundaryObject__Group_13__0__Impl : ( 'tooling' ) ;
    public final void rule__BoundaryObject__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3180:1: ( ( 'tooling' ) )
            // InternalBomi.g:3181:1: ( 'tooling' )
            {
            // InternalBomi.g:3181:1: ( 'tooling' )
            // InternalBomi.g:3182:2: 'tooling'
            {
             before(grammarAccess.getBoundaryObjectAccess().getToolingKeyword_13_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBomi.g:3191:1: rule__BoundaryObject__Group_13__1 : rule__BoundaryObject__Group_13__1__Impl ;
    public final void rule__BoundaryObject__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3195:1: ( rule__BoundaryObject__Group_13__1__Impl )
            // InternalBomi.g:3196:2: rule__BoundaryObject__Group_13__1__Impl
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
    // InternalBomi.g:3202:1: rule__BoundaryObject__Group_13__1__Impl : ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) ) ;
    public final void rule__BoundaryObject__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3206:1: ( ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) ) )
            // InternalBomi.g:3207:1: ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) )
            {
            // InternalBomi.g:3207:1: ( ( rule__BoundaryObject__ToolingAssignment_13_1 ) )
            // InternalBomi.g:3208:2: ( rule__BoundaryObject__ToolingAssignment_13_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getToolingAssignment_13_1()); 
            // InternalBomi.g:3209:2: ( rule__BoundaryObject__ToolingAssignment_13_1 )
            // InternalBomi.g:3209:3: rule__BoundaryObject__ToolingAssignment_13_1
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
    // InternalBomi.g:3218:1: rule__BoundaryObject__Group_14__0 : rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1 ;
    public final void rule__BoundaryObject__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3222:1: ( rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1 )
            // InternalBomi.g:3223:2: rule__BoundaryObject__Group_14__0__Impl rule__BoundaryObject__Group_14__1
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
    // InternalBomi.g:3230:1: rule__BoundaryObject__Group_14__0__Impl : ( 'versioning' ) ;
    public final void rule__BoundaryObject__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3234:1: ( ( 'versioning' ) )
            // InternalBomi.g:3235:1: ( 'versioning' )
            {
            // InternalBomi.g:3235:1: ( 'versioning' )
            // InternalBomi.g:3236:2: 'versioning'
            {
             before(grammarAccess.getBoundaryObjectAccess().getVersioningKeyword_14_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBomi.g:3245:1: rule__BoundaryObject__Group_14__1 : rule__BoundaryObject__Group_14__1__Impl ;
    public final void rule__BoundaryObject__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3249:1: ( rule__BoundaryObject__Group_14__1__Impl )
            // InternalBomi.g:3250:2: rule__BoundaryObject__Group_14__1__Impl
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
    // InternalBomi.g:3256:1: rule__BoundaryObject__Group_14__1__Impl : ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) ) ;
    public final void rule__BoundaryObject__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3260:1: ( ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) ) )
            // InternalBomi.g:3261:1: ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) )
            {
            // InternalBomi.g:3261:1: ( ( rule__BoundaryObject__VersioningAssignment_14_1 ) )
            // InternalBomi.g:3262:2: ( rule__BoundaryObject__VersioningAssignment_14_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getVersioningAssignment_14_1()); 
            // InternalBomi.g:3263:2: ( rule__BoundaryObject__VersioningAssignment_14_1 )
            // InternalBomi.g:3263:3: rule__BoundaryObject__VersioningAssignment_14_1
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
    // InternalBomi.g:3272:1: rule__BoundaryObject__Group_15__0 : rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1 ;
    public final void rule__BoundaryObject__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3276:1: ( rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1 )
            // InternalBomi.g:3277:2: rule__BoundaryObject__Group_15__0__Impl rule__BoundaryObject__Group_15__1
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
    // InternalBomi.g:3284:1: rule__BoundaryObject__Group_15__0__Impl : ( 'upToDate' ) ;
    public final void rule__BoundaryObject__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3288:1: ( ( 'upToDate' ) )
            // InternalBomi.g:3289:1: ( 'upToDate' )
            {
            // InternalBomi.g:3289:1: ( 'upToDate' )
            // InternalBomi.g:3290:2: 'upToDate'
            {
             before(grammarAccess.getBoundaryObjectAccess().getUpToDateKeyword_15_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBomi.g:3299:1: rule__BoundaryObject__Group_15__1 : rule__BoundaryObject__Group_15__1__Impl ;
    public final void rule__BoundaryObject__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3303:1: ( rule__BoundaryObject__Group_15__1__Impl )
            // InternalBomi.g:3304:2: rule__BoundaryObject__Group_15__1__Impl
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
    // InternalBomi.g:3310:1: rule__BoundaryObject__Group_15__1__Impl : ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) ) ;
    public final void rule__BoundaryObject__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3314:1: ( ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) ) )
            // InternalBomi.g:3315:1: ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) )
            {
            // InternalBomi.g:3315:1: ( ( rule__BoundaryObject__UpToDateAssignment_15_1 ) )
            // InternalBomi.g:3316:2: ( rule__BoundaryObject__UpToDateAssignment_15_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getUpToDateAssignment_15_1()); 
            // InternalBomi.g:3317:2: ( rule__BoundaryObject__UpToDateAssignment_15_1 )
            // InternalBomi.g:3317:3: rule__BoundaryObject__UpToDateAssignment_15_1
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
    // InternalBomi.g:3326:1: rule__BoundaryObject__Group_16__0 : rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1 ;
    public final void rule__BoundaryObject__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3330:1: ( rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1 )
            // InternalBomi.g:3331:2: rule__BoundaryObject__Group_16__0__Impl rule__BoundaryObject__Group_16__1
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
    // InternalBomi.g:3338:1: rule__BoundaryObject__Group_16__0__Impl : ( 'internalConsistency' ) ;
    public final void rule__BoundaryObject__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3342:1: ( ( 'internalConsistency' ) )
            // InternalBomi.g:3343:1: ( 'internalConsistency' )
            {
            // InternalBomi.g:3343:1: ( 'internalConsistency' )
            // InternalBomi.g:3344:2: 'internalConsistency'
            {
             before(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyKeyword_16_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBomi.g:3353:1: rule__BoundaryObject__Group_16__1 : rule__BoundaryObject__Group_16__1__Impl ;
    public final void rule__BoundaryObject__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3357:1: ( rule__BoundaryObject__Group_16__1__Impl )
            // InternalBomi.g:3358:2: rule__BoundaryObject__Group_16__1__Impl
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
    // InternalBomi.g:3364:1: rule__BoundaryObject__Group_16__1__Impl : ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) ) ;
    public final void rule__BoundaryObject__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3368:1: ( ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) ) )
            // InternalBomi.g:3369:1: ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) )
            {
            // InternalBomi.g:3369:1: ( ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 ) )
            // InternalBomi.g:3370:2: ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyAssignment_16_1()); 
            // InternalBomi.g:3371:2: ( rule__BoundaryObject__InternalConsistencyAssignment_16_1 )
            // InternalBomi.g:3371:3: rule__BoundaryObject__InternalConsistencyAssignment_16_1
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
    // InternalBomi.g:3380:1: rule__BoundaryObject__Group_17__0 : rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1 ;
    public final void rule__BoundaryObject__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3384:1: ( rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1 )
            // InternalBomi.g:3385:2: rule__BoundaryObject__Group_17__0__Impl rule__BoundaryObject__Group_17__1
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
    // InternalBomi.g:3392:1: rule__BoundaryObject__Group_17__0__Impl : ( 'externalConsistency' ) ;
    public final void rule__BoundaryObject__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3396:1: ( ( 'externalConsistency' ) )
            // InternalBomi.g:3397:1: ( 'externalConsistency' )
            {
            // InternalBomi.g:3397:1: ( 'externalConsistency' )
            // InternalBomi.g:3398:2: 'externalConsistency'
            {
             before(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyKeyword_17_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBomi.g:3407:1: rule__BoundaryObject__Group_17__1 : rule__BoundaryObject__Group_17__1__Impl ;
    public final void rule__BoundaryObject__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3411:1: ( rule__BoundaryObject__Group_17__1__Impl )
            // InternalBomi.g:3412:2: rule__BoundaryObject__Group_17__1__Impl
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
    // InternalBomi.g:3418:1: rule__BoundaryObject__Group_17__1__Impl : ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) ) ;
    public final void rule__BoundaryObject__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3422:1: ( ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) ) )
            // InternalBomi.g:3423:1: ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) )
            {
            // InternalBomi.g:3423:1: ( ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 ) )
            // InternalBomi.g:3424:2: ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 )
            {
             before(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyAssignment_17_1()); 
            // InternalBomi.g:3425:2: ( rule__BoundaryObject__ExternalConsistencyAssignment_17_1 )
            // InternalBomi.g:3425:3: rule__BoundaryObject__ExternalConsistencyAssignment_17_1
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
    // InternalBomi.g:3434:1: rule__MethodologicalIsland__Group__0 : rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1 ;
    public final void rule__MethodologicalIsland__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3438:1: ( rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1 )
            // InternalBomi.g:3439:2: rule__MethodologicalIsland__Group__0__Impl rule__MethodologicalIsland__Group__1
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
    // InternalBomi.g:3446:1: rule__MethodologicalIsland__Group__0__Impl : ( () ) ;
    public final void rule__MethodologicalIsland__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3450:1: ( ( () ) )
            // InternalBomi.g:3451:1: ( () )
            {
            // InternalBomi.g:3451:1: ( () )
            // InternalBomi.g:3452:2: ()
            {
             before(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandAction_0()); 
            // InternalBomi.g:3453:2: ()
            // InternalBomi.g:3453:3: 
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
    // InternalBomi.g:3461:1: rule__MethodologicalIsland__Group__1 : rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2 ;
    public final void rule__MethodologicalIsland__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3465:1: ( rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2 )
            // InternalBomi.g:3466:2: rule__MethodologicalIsland__Group__1__Impl rule__MethodologicalIsland__Group__2
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
    // InternalBomi.g:3473:1: rule__MethodologicalIsland__Group__1__Impl : ( 'MethodologicalIsland' ) ;
    public final void rule__MethodologicalIsland__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3477:1: ( ( 'MethodologicalIsland' ) )
            // InternalBomi.g:3478:1: ( 'MethodologicalIsland' )
            {
            // InternalBomi.g:3478:1: ( 'MethodologicalIsland' )
            // InternalBomi.g:3479:2: 'MethodologicalIsland'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBomi.g:3488:1: rule__MethodologicalIsland__Group__2 : rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3 ;
    public final void rule__MethodologicalIsland__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3492:1: ( rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3 )
            // InternalBomi.g:3493:2: rule__MethodologicalIsland__Group__2__Impl rule__MethodologicalIsland__Group__3
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
    // InternalBomi.g:3500:1: rule__MethodologicalIsland__Group__2__Impl : ( ( rule__MethodologicalIsland__NameAssignment_2 ) ) ;
    public final void rule__MethodologicalIsland__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3504:1: ( ( ( rule__MethodologicalIsland__NameAssignment_2 ) ) )
            // InternalBomi.g:3505:1: ( ( rule__MethodologicalIsland__NameAssignment_2 ) )
            {
            // InternalBomi.g:3505:1: ( ( rule__MethodologicalIsland__NameAssignment_2 ) )
            // InternalBomi.g:3506:2: ( rule__MethodologicalIsland__NameAssignment_2 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getNameAssignment_2()); 
            // InternalBomi.g:3507:2: ( rule__MethodologicalIsland__NameAssignment_2 )
            // InternalBomi.g:3507:3: rule__MethodologicalIsland__NameAssignment_2
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
    // InternalBomi.g:3515:1: rule__MethodologicalIsland__Group__3 : rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4 ;
    public final void rule__MethodologicalIsland__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3519:1: ( rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4 )
            // InternalBomi.g:3520:2: rule__MethodologicalIsland__Group__3__Impl rule__MethodologicalIsland__Group__4
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
    // InternalBomi.g:3527:1: rule__MethodologicalIsland__Group__3__Impl : ( '{' ) ;
    public final void rule__MethodologicalIsland__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3531:1: ( ( '{' ) )
            // InternalBomi.g:3532:1: ( '{' )
            {
            // InternalBomi.g:3532:1: ( '{' )
            // InternalBomi.g:3533:2: '{'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:3542:1: rule__MethodologicalIsland__Group__4 : rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5 ;
    public final void rule__MethodologicalIsland__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3546:1: ( rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5 )
            // InternalBomi.g:3547:2: rule__MethodologicalIsland__Group__4__Impl rule__MethodologicalIsland__Group__5
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
    // InternalBomi.g:3554:1: rule__MethodologicalIsland__Group__4__Impl : ( ( rule__MethodologicalIsland__Group_4__0 )? ) ;
    public final void rule__MethodologicalIsland__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3558:1: ( ( ( rule__MethodologicalIsland__Group_4__0 )? ) )
            // InternalBomi.g:3559:1: ( ( rule__MethodologicalIsland__Group_4__0 )? )
            {
            // InternalBomi.g:3559:1: ( ( rule__MethodologicalIsland__Group_4__0 )? )
            // InternalBomi.g:3560:2: ( rule__MethodologicalIsland__Group_4__0 )?
            {
             before(grammarAccess.getMethodologicalIslandAccess().getGroup_4()); 
            // InternalBomi.g:3561:2: ( rule__MethodologicalIsland__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBomi.g:3561:3: rule__MethodologicalIsland__Group_4__0
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
    // InternalBomi.g:3569:1: rule__MethodologicalIsland__Group__5 : rule__MethodologicalIsland__Group__5__Impl ;
    public final void rule__MethodologicalIsland__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3573:1: ( rule__MethodologicalIsland__Group__5__Impl )
            // InternalBomi.g:3574:2: rule__MethodologicalIsland__Group__5__Impl
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
    // InternalBomi.g:3580:1: rule__MethodologicalIsland__Group__5__Impl : ( '}' ) ;
    public final void rule__MethodologicalIsland__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3584:1: ( ( '}' ) )
            // InternalBomi.g:3585:1: ( '}' )
            {
            // InternalBomi.g:3585:1: ( '}' )
            // InternalBomi.g:3586:2: '}'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:3596:1: rule__MethodologicalIsland__Group_4__0 : rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1 ;
    public final void rule__MethodologicalIsland__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3600:1: ( rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1 )
            // InternalBomi.g:3601:2: rule__MethodologicalIsland__Group_4__0__Impl rule__MethodologicalIsland__Group_4__1
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
    // InternalBomi.g:3608:1: rule__MethodologicalIsland__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__MethodologicalIsland__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3612:1: ( ( 'type' ) )
            // InternalBomi.g:3613:1: ( 'type' )
            {
            // InternalBomi.g:3613:1: ( 'type' )
            // InternalBomi.g:3614:2: 'type'
            {
             before(grammarAccess.getMethodologicalIslandAccess().getTypeKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBomi.g:3623:1: rule__MethodologicalIsland__Group_4__1 : rule__MethodologicalIsland__Group_4__1__Impl ;
    public final void rule__MethodologicalIsland__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3627:1: ( rule__MethodologicalIsland__Group_4__1__Impl )
            // InternalBomi.g:3628:2: rule__MethodologicalIsland__Group_4__1__Impl
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
    // InternalBomi.g:3634:1: rule__MethodologicalIsland__Group_4__1__Impl : ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) ) ;
    public final void rule__MethodologicalIsland__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3638:1: ( ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) ) )
            // InternalBomi.g:3639:1: ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) )
            {
            // InternalBomi.g:3639:1: ( ( rule__MethodologicalIsland__TypeAssignment_4_1 ) )
            // InternalBomi.g:3640:2: ( rule__MethodologicalIsland__TypeAssignment_4_1 )
            {
             before(grammarAccess.getMethodologicalIslandAccess().getTypeAssignment_4_1()); 
            // InternalBomi.g:3641:2: ( rule__MethodologicalIsland__TypeAssignment_4_1 )
            // InternalBomi.g:3641:3: rule__MethodologicalIsland__TypeAssignment_4_1
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
    // InternalBomi.g:3650:1: rule__GovernanceTeam__Group__0 : rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1 ;
    public final void rule__GovernanceTeam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3654:1: ( rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1 )
            // InternalBomi.g:3655:2: rule__GovernanceTeam__Group__0__Impl rule__GovernanceTeam__Group__1
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
    // InternalBomi.g:3662:1: rule__GovernanceTeam__Group__0__Impl : ( () ) ;
    public final void rule__GovernanceTeam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3666:1: ( ( () ) )
            // InternalBomi.g:3667:1: ( () )
            {
            // InternalBomi.g:3667:1: ( () )
            // InternalBomi.g:3668:2: ()
            {
             before(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamAction_0()); 
            // InternalBomi.g:3669:2: ()
            // InternalBomi.g:3669:3: 
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
    // InternalBomi.g:3677:1: rule__GovernanceTeam__Group__1 : rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2 ;
    public final void rule__GovernanceTeam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3681:1: ( rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2 )
            // InternalBomi.g:3682:2: rule__GovernanceTeam__Group__1__Impl rule__GovernanceTeam__Group__2
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
    // InternalBomi.g:3689:1: rule__GovernanceTeam__Group__1__Impl : ( 'GovernanceTeam' ) ;
    public final void rule__GovernanceTeam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3693:1: ( ( 'GovernanceTeam' ) )
            // InternalBomi.g:3694:1: ( 'GovernanceTeam' )
            {
            // InternalBomi.g:3694:1: ( 'GovernanceTeam' )
            // InternalBomi.g:3695:2: 'GovernanceTeam'
            {
             before(grammarAccess.getGovernanceTeamAccess().getGovernanceTeamKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalBomi.g:3704:1: rule__GovernanceTeam__Group__2 : rule__GovernanceTeam__Group__2__Impl ;
    public final void rule__GovernanceTeam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3708:1: ( rule__GovernanceTeam__Group__2__Impl )
            // InternalBomi.g:3709:2: rule__GovernanceTeam__Group__2__Impl
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
    // InternalBomi.g:3715:1: rule__GovernanceTeam__Group__2__Impl : ( ( rule__GovernanceTeam__NameAssignment_2 ) ) ;
    public final void rule__GovernanceTeam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3719:1: ( ( ( rule__GovernanceTeam__NameAssignment_2 ) ) )
            // InternalBomi.g:3720:1: ( ( rule__GovernanceTeam__NameAssignment_2 ) )
            {
            // InternalBomi.g:3720:1: ( ( rule__GovernanceTeam__NameAssignment_2 ) )
            // InternalBomi.g:3721:2: ( rule__GovernanceTeam__NameAssignment_2 )
            {
             before(grammarAccess.getGovernanceTeamAccess().getNameAssignment_2()); 
            // InternalBomi.g:3722:2: ( rule__GovernanceTeam__NameAssignment_2 )
            // InternalBomi.g:3722:3: rule__GovernanceTeam__NameAssignment_2
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
    // InternalBomi.g:3731:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3735:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalBomi.g:3736:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalBomi.g:3743:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3747:1: ( ( () ) )
            // InternalBomi.g:3748:1: ( () )
            {
            // InternalBomi.g:3748:1: ( () )
            // InternalBomi.g:3749:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalBomi.g:3750:2: ()
            // InternalBomi.g:3750:3: 
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
    // InternalBomi.g:3758:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3762:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalBomi.g:3763:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalBomi.g:3770:1: rule__Role__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3774:1: ( ( 'Role' ) )
            // InternalBomi.g:3775:1: ( 'Role' )
            {
            // InternalBomi.g:3775:1: ( 'Role' )
            // InternalBomi.g:3776:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalBomi.g:3785:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3789:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalBomi.g:3790:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalBomi.g:3797:1: rule__Role__Group__2__Impl : ( ( rule__Role__NameAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3801:1: ( ( ( rule__Role__NameAssignment_2 ) ) )
            // InternalBomi.g:3802:1: ( ( rule__Role__NameAssignment_2 ) )
            {
            // InternalBomi.g:3802:1: ( ( rule__Role__NameAssignment_2 ) )
            // InternalBomi.g:3803:2: ( rule__Role__NameAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_2()); 
            // InternalBomi.g:3804:2: ( rule__Role__NameAssignment_2 )
            // InternalBomi.g:3804:3: rule__Role__NameAssignment_2
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
    // InternalBomi.g:3812:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3816:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalBomi.g:3817:2: rule__Role__Group__3__Impl rule__Role__Group__4
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
    // InternalBomi.g:3824:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3828:1: ( ( '{' ) )
            // InternalBomi.g:3829:1: ( '{' )
            {
            // InternalBomi.g:3829:1: ( '{' )
            // InternalBomi.g:3830:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:3839:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3843:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalBomi.g:3844:2: rule__Role__Group__4__Impl rule__Role__Group__5
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
    // InternalBomi.g:3851:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )? ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3855:1: ( ( ( rule__Role__Group_4__0 )? ) )
            // InternalBomi.g:3856:1: ( ( rule__Role__Group_4__0 )? )
            {
            // InternalBomi.g:3856:1: ( ( rule__Role__Group_4__0 )? )
            // InternalBomi.g:3857:2: ( rule__Role__Group_4__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // InternalBomi.g:3858:2: ( rule__Role__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBomi.g:3858:3: rule__Role__Group_4__0
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
    // InternalBomi.g:3866:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3870:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // InternalBomi.g:3871:2: rule__Role__Group__5__Impl rule__Role__Group__6
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
    // InternalBomi.g:3878:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )? ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3882:1: ( ( ( rule__Role__Group_5__0 )? ) )
            // InternalBomi.g:3883:1: ( ( rule__Role__Group_5__0 )? )
            {
            // InternalBomi.g:3883:1: ( ( rule__Role__Group_5__0 )? )
            // InternalBomi.g:3884:2: ( rule__Role__Group_5__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // InternalBomi.g:3885:2: ( rule__Role__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBomi.g:3885:3: rule__Role__Group_5__0
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
    // InternalBomi.g:3893:1: rule__Role__Group__6 : rule__Role__Group__6__Impl ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3897:1: ( rule__Role__Group__6__Impl )
            // InternalBomi.g:3898:2: rule__Role__Group__6__Impl
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
    // InternalBomi.g:3904:1: rule__Role__Group__6__Impl : ( '}' ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3908:1: ( ( '}' ) )
            // InternalBomi.g:3909:1: ( '}' )
            {
            // InternalBomi.g:3909:1: ( '}' )
            // InternalBomi.g:3910:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:3920:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3924:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // InternalBomi.g:3925:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
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
    // InternalBomi.g:3932:1: rule__Role__Group_4__0__Impl : ( 'partOfGovernanceTeams' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3936:1: ( ( 'partOfGovernanceTeams' ) )
            // InternalBomi.g:3937:1: ( 'partOfGovernanceTeams' )
            {
            // InternalBomi.g:3937:1: ( 'partOfGovernanceTeams' )
            // InternalBomi.g:3938:2: 'partOfGovernanceTeams'
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsKeyword_4_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalBomi.g:3947:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl rule__Role__Group_4__2 ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3951:1: ( rule__Role__Group_4__1__Impl rule__Role__Group_4__2 )
            // InternalBomi.g:3952:2: rule__Role__Group_4__1__Impl rule__Role__Group_4__2
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
    // InternalBomi.g:3959:1: rule__Role__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3963:1: ( ( '(' ) )
            // InternalBomi.g:3964:1: ( '(' )
            {
            // InternalBomi.g:3964:1: ( '(' )
            // InternalBomi.g:3965:2: '('
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:3974:1: rule__Role__Group_4__2 : rule__Role__Group_4__2__Impl rule__Role__Group_4__3 ;
    public final void rule__Role__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3978:1: ( rule__Role__Group_4__2__Impl rule__Role__Group_4__3 )
            // InternalBomi.g:3979:2: rule__Role__Group_4__2__Impl rule__Role__Group_4__3
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
    // InternalBomi.g:3986:1: rule__Role__Group_4__2__Impl : ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) ) ;
    public final void rule__Role__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:3990:1: ( ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) ) )
            // InternalBomi.g:3991:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) )
            {
            // InternalBomi.g:3991:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 ) )
            // InternalBomi.g:3992:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_2()); 
            // InternalBomi.g:3993:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_2 )
            // InternalBomi.g:3993:3: rule__Role__PartOfGovernanceTeamsAssignment_4_2
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
    // InternalBomi.g:4001:1: rule__Role__Group_4__3 : rule__Role__Group_4__3__Impl rule__Role__Group_4__4 ;
    public final void rule__Role__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4005:1: ( rule__Role__Group_4__3__Impl rule__Role__Group_4__4 )
            // InternalBomi.g:4006:2: rule__Role__Group_4__3__Impl rule__Role__Group_4__4
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
    // InternalBomi.g:4013:1: rule__Role__Group_4__3__Impl : ( ( rule__Role__Group_4_3__0 )* ) ;
    public final void rule__Role__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4017:1: ( ( ( rule__Role__Group_4_3__0 )* ) )
            // InternalBomi.g:4018:1: ( ( rule__Role__Group_4_3__0 )* )
            {
            // InternalBomi.g:4018:1: ( ( rule__Role__Group_4_3__0 )* )
            // InternalBomi.g:4019:2: ( rule__Role__Group_4_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4_3()); 
            // InternalBomi.g:4020:2: ( rule__Role__Group_4_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==36) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBomi.g:4020:3: rule__Role__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Role__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalBomi.g:4028:1: rule__Role__Group_4__4 : rule__Role__Group_4__4__Impl ;
    public final void rule__Role__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4032:1: ( rule__Role__Group_4__4__Impl )
            // InternalBomi.g:4033:2: rule__Role__Group_4__4__Impl
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
    // InternalBomi.g:4039:1: rule__Role__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Role__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4043:1: ( ( ')' ) )
            // InternalBomi.g:4044:1: ( ')' )
            {
            // InternalBomi.g:4044:1: ( ')' )
            // InternalBomi.g:4045:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:4055:1: rule__Role__Group_4_3__0 : rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 ;
    public final void rule__Role__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4059:1: ( rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1 )
            // InternalBomi.g:4060:2: rule__Role__Group_4_3__0__Impl rule__Role__Group_4_3__1
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
    // InternalBomi.g:4067:1: rule__Role__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4071:1: ( ( ',' ) )
            // InternalBomi.g:4072:1: ( ',' )
            {
            // InternalBomi.g:4072:1: ( ',' )
            // InternalBomi.g:4073:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_4_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:4082:1: rule__Role__Group_4_3__1 : rule__Role__Group_4_3__1__Impl ;
    public final void rule__Role__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4086:1: ( rule__Role__Group_4_3__1__Impl )
            // InternalBomi.g:4087:2: rule__Role__Group_4_3__1__Impl
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
    // InternalBomi.g:4093:1: rule__Role__Group_4_3__1__Impl : ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) ) ;
    public final void rule__Role__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4097:1: ( ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) ) )
            // InternalBomi.g:4098:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) )
            {
            // InternalBomi.g:4098:1: ( ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 ) )
            // InternalBomi.g:4099:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsAssignment_4_3_1()); 
            // InternalBomi.g:4100:2: ( rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 )
            // InternalBomi.g:4100:3: rule__Role__PartOfGovernanceTeamsAssignment_4_3_1
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
    // InternalBomi.g:4109:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4113:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // InternalBomi.g:4114:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
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
    // InternalBomi.g:4121:1: rule__Role__Group_5__0__Impl : ( 'partOfMIs' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4125:1: ( ( 'partOfMIs' ) )
            // InternalBomi.g:4126:1: ( 'partOfMIs' )
            {
            // InternalBomi.g:4126:1: ( 'partOfMIs' )
            // InternalBomi.g:4127:2: 'partOfMIs'
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsKeyword_5_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalBomi.g:4136:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl rule__Role__Group_5__2 ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4140:1: ( rule__Role__Group_5__1__Impl rule__Role__Group_5__2 )
            // InternalBomi.g:4141:2: rule__Role__Group_5__1__Impl rule__Role__Group_5__2
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
    // InternalBomi.g:4148:1: rule__Role__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4152:1: ( ( '(' ) )
            // InternalBomi.g:4153:1: ( '(' )
            {
            // InternalBomi.g:4153:1: ( '(' )
            // InternalBomi.g:4154:2: '('
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:4163:1: rule__Role__Group_5__2 : rule__Role__Group_5__2__Impl rule__Role__Group_5__3 ;
    public final void rule__Role__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4167:1: ( rule__Role__Group_5__2__Impl rule__Role__Group_5__3 )
            // InternalBomi.g:4168:2: rule__Role__Group_5__2__Impl rule__Role__Group_5__3
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
    // InternalBomi.g:4175:1: rule__Role__Group_5__2__Impl : ( ( rule__Role__PartOfMIsAssignment_5_2 ) ) ;
    public final void rule__Role__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4179:1: ( ( ( rule__Role__PartOfMIsAssignment_5_2 ) ) )
            // InternalBomi.g:4180:1: ( ( rule__Role__PartOfMIsAssignment_5_2 ) )
            {
            // InternalBomi.g:4180:1: ( ( rule__Role__PartOfMIsAssignment_5_2 ) )
            // InternalBomi.g:4181:2: ( rule__Role__PartOfMIsAssignment_5_2 )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_2()); 
            // InternalBomi.g:4182:2: ( rule__Role__PartOfMIsAssignment_5_2 )
            // InternalBomi.g:4182:3: rule__Role__PartOfMIsAssignment_5_2
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
    // InternalBomi.g:4190:1: rule__Role__Group_5__3 : rule__Role__Group_5__3__Impl rule__Role__Group_5__4 ;
    public final void rule__Role__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4194:1: ( rule__Role__Group_5__3__Impl rule__Role__Group_5__4 )
            // InternalBomi.g:4195:2: rule__Role__Group_5__3__Impl rule__Role__Group_5__4
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
    // InternalBomi.g:4202:1: rule__Role__Group_5__3__Impl : ( ( rule__Role__Group_5_3__0 )* ) ;
    public final void rule__Role__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4206:1: ( ( ( rule__Role__Group_5_3__0 )* ) )
            // InternalBomi.g:4207:1: ( ( rule__Role__Group_5_3__0 )* )
            {
            // InternalBomi.g:4207:1: ( ( rule__Role__Group_5_3__0 )* )
            // InternalBomi.g:4208:2: ( rule__Role__Group_5_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5_3()); 
            // InternalBomi.g:4209:2: ( rule__Role__Group_5_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==36) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBomi.g:4209:3: rule__Role__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Role__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalBomi.g:4217:1: rule__Role__Group_5__4 : rule__Role__Group_5__4__Impl ;
    public final void rule__Role__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4221:1: ( rule__Role__Group_5__4__Impl )
            // InternalBomi.g:4222:2: rule__Role__Group_5__4__Impl
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
    // InternalBomi.g:4228:1: rule__Role__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Role__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4232:1: ( ( ')' ) )
            // InternalBomi.g:4233:1: ( ')' )
            {
            // InternalBomi.g:4233:1: ( ')' )
            // InternalBomi.g:4234:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_5_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:4244:1: rule__Role__Group_5_3__0 : rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 ;
    public final void rule__Role__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4248:1: ( rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1 )
            // InternalBomi.g:4249:2: rule__Role__Group_5_3__0__Impl rule__Role__Group_5_3__1
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
    // InternalBomi.g:4256:1: rule__Role__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4260:1: ( ( ',' ) )
            // InternalBomi.g:4261:1: ( ',' )
            {
            // InternalBomi.g:4261:1: ( ',' )
            // InternalBomi.g:4262:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_5_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:4271:1: rule__Role__Group_5_3__1 : rule__Role__Group_5_3__1__Impl ;
    public final void rule__Role__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4275:1: ( rule__Role__Group_5_3__1__Impl )
            // InternalBomi.g:4276:2: rule__Role__Group_5_3__1__Impl
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
    // InternalBomi.g:4282:1: rule__Role__Group_5_3__1__Impl : ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) ) ;
    public final void rule__Role__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4286:1: ( ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) ) )
            // InternalBomi.g:4287:1: ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) )
            {
            // InternalBomi.g:4287:1: ( ( rule__Role__PartOfMIsAssignment_5_3_1 ) )
            // InternalBomi.g:4288:2: ( rule__Role__PartOfMIsAssignment_5_3_1 )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsAssignment_5_3_1()); 
            // InternalBomi.g:4289:2: ( rule__Role__PartOfMIsAssignment_5_3_1 )
            // InternalBomi.g:4289:3: rule__Role__PartOfMIsAssignment_5_3_1
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
    // InternalBomi.g:4298:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4302:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalBomi.g:4303:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
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
    // InternalBomi.g:4310:1: rule__Driver__Group__0__Impl : ( () ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4314:1: ( ( () ) )
            // InternalBomi.g:4315:1: ( () )
            {
            // InternalBomi.g:4315:1: ( () )
            // InternalBomi.g:4316:2: ()
            {
             before(grammarAccess.getDriverAccess().getDriverAction_0()); 
            // InternalBomi.g:4317:2: ()
            // InternalBomi.g:4317:3: 
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
    // InternalBomi.g:4325:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4329:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalBomi.g:4330:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
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
    // InternalBomi.g:4337:1: rule__Driver__Group__1__Impl : ( 'Driver' ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4341:1: ( ( 'Driver' ) )
            // InternalBomi.g:4342:1: ( 'Driver' )
            {
            // InternalBomi.g:4342:1: ( 'Driver' )
            // InternalBomi.g:4343:2: 'Driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalBomi.g:4352:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4356:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalBomi.g:4357:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
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
    // InternalBomi.g:4364:1: rule__Driver__Group__2__Impl : ( ( rule__Driver__NameAssignment_2 ) ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4368:1: ( ( ( rule__Driver__NameAssignment_2 ) ) )
            // InternalBomi.g:4369:1: ( ( rule__Driver__NameAssignment_2 ) )
            {
            // InternalBomi.g:4369:1: ( ( rule__Driver__NameAssignment_2 ) )
            // InternalBomi.g:4370:2: ( rule__Driver__NameAssignment_2 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_2()); 
            // InternalBomi.g:4371:2: ( rule__Driver__NameAssignment_2 )
            // InternalBomi.g:4371:3: rule__Driver__NameAssignment_2
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
    // InternalBomi.g:4379:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4383:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalBomi.g:4384:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
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
    // InternalBomi.g:4391:1: rule__Driver__Group__3__Impl : ( '{' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4395:1: ( ( '{' ) )
            // InternalBomi.g:4396:1: ( '{' )
            {
            // InternalBomi.g:4396:1: ( '{' )
            // InternalBomi.g:4397:2: '{'
            {
             before(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:4406:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4410:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalBomi.g:4411:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
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
    // InternalBomi.g:4418:1: rule__Driver__Group__4__Impl : ( ( rule__Driver__Group_4__0 )? ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4422:1: ( ( ( rule__Driver__Group_4__0 )? ) )
            // InternalBomi.g:4423:1: ( ( rule__Driver__Group_4__0 )? )
            {
            // InternalBomi.g:4423:1: ( ( rule__Driver__Group_4__0 )? )
            // InternalBomi.g:4424:2: ( rule__Driver__Group_4__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_4()); 
            // InternalBomi.g:4425:2: ( rule__Driver__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBomi.g:4425:3: rule__Driver__Group_4__0
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
    // InternalBomi.g:4433:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4437:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalBomi.g:4438:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
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
    // InternalBomi.g:4445:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__Group_5__0 )? ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4449:1: ( ( ( rule__Driver__Group_5__0 )? ) )
            // InternalBomi.g:4450:1: ( ( rule__Driver__Group_5__0 )? )
            {
            // InternalBomi.g:4450:1: ( ( rule__Driver__Group_5__0 )? )
            // InternalBomi.g:4451:2: ( rule__Driver__Group_5__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_5()); 
            // InternalBomi.g:4452:2: ( rule__Driver__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBomi.g:4452:3: rule__Driver__Group_5__0
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
    // InternalBomi.g:4460:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl rule__Driver__Group__7 ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4464:1: ( rule__Driver__Group__6__Impl rule__Driver__Group__7 )
            // InternalBomi.g:4465:2: rule__Driver__Group__6__Impl rule__Driver__Group__7
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
    // InternalBomi.g:4472:1: rule__Driver__Group__6__Impl : ( ( rule__Driver__Group_6__0 )? ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4476:1: ( ( ( rule__Driver__Group_6__0 )? ) )
            // InternalBomi.g:4477:1: ( ( rule__Driver__Group_6__0 )? )
            {
            // InternalBomi.g:4477:1: ( ( rule__Driver__Group_6__0 )? )
            // InternalBomi.g:4478:2: ( rule__Driver__Group_6__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_6()); 
            // InternalBomi.g:4479:2: ( rule__Driver__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBomi.g:4479:3: rule__Driver__Group_6__0
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
    // InternalBomi.g:4487:1: rule__Driver__Group__7 : rule__Driver__Group__7__Impl rule__Driver__Group__8 ;
    public final void rule__Driver__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4491:1: ( rule__Driver__Group__7__Impl rule__Driver__Group__8 )
            // InternalBomi.g:4492:2: rule__Driver__Group__7__Impl rule__Driver__Group__8
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
    // InternalBomi.g:4499:1: rule__Driver__Group__7__Impl : ( ( rule__Driver__Group_7__0 )? ) ;
    public final void rule__Driver__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4503:1: ( ( ( rule__Driver__Group_7__0 )? ) )
            // InternalBomi.g:4504:1: ( ( rule__Driver__Group_7__0 )? )
            {
            // InternalBomi.g:4504:1: ( ( rule__Driver__Group_7__0 )? )
            // InternalBomi.g:4505:2: ( rule__Driver__Group_7__0 )?
            {
             before(grammarAccess.getDriverAccess().getGroup_7()); 
            // InternalBomi.g:4506:2: ( rule__Driver__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBomi.g:4506:3: rule__Driver__Group_7__0
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
    // InternalBomi.g:4514:1: rule__Driver__Group__8 : rule__Driver__Group__8__Impl ;
    public final void rule__Driver__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4518:1: ( rule__Driver__Group__8__Impl )
            // InternalBomi.g:4519:2: rule__Driver__Group__8__Impl
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
    // InternalBomi.g:4525:1: rule__Driver__Group__8__Impl : ( '}' ) ;
    public final void rule__Driver__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4529:1: ( ( '}' ) )
            // InternalBomi.g:4530:1: ( '}' )
            {
            // InternalBomi.g:4530:1: ( '}' )
            // InternalBomi.g:4531:2: '}'
            {
             before(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_8()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:4541:1: rule__Driver__Group_4__0 : rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1 ;
    public final void rule__Driver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4545:1: ( rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1 )
            // InternalBomi.g:4546:2: rule__Driver__Group_4__0__Impl rule__Driver__Group_4__1
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
    // InternalBomi.g:4553:1: rule__Driver__Group_4__0__Impl : ( 'driverType' ) ;
    public final void rule__Driver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4557:1: ( ( 'driverType' ) )
            // InternalBomi.g:4558:1: ( 'driverType' )
            {
            // InternalBomi.g:4558:1: ( 'driverType' )
            // InternalBomi.g:4559:2: 'driverType'
            {
             before(grammarAccess.getDriverAccess().getDriverTypeKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalBomi.g:4568:1: rule__Driver__Group_4__1 : rule__Driver__Group_4__1__Impl ;
    public final void rule__Driver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4572:1: ( rule__Driver__Group_4__1__Impl )
            // InternalBomi.g:4573:2: rule__Driver__Group_4__1__Impl
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
    // InternalBomi.g:4579:1: rule__Driver__Group_4__1__Impl : ( ( rule__Driver__DriverTypeAssignment_4_1 ) ) ;
    public final void rule__Driver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4583:1: ( ( ( rule__Driver__DriverTypeAssignment_4_1 ) ) )
            // InternalBomi.g:4584:1: ( ( rule__Driver__DriverTypeAssignment_4_1 ) )
            {
            // InternalBomi.g:4584:1: ( ( rule__Driver__DriverTypeAssignment_4_1 ) )
            // InternalBomi.g:4585:2: ( rule__Driver__DriverTypeAssignment_4_1 )
            {
             before(grammarAccess.getDriverAccess().getDriverTypeAssignment_4_1()); 
            // InternalBomi.g:4586:2: ( rule__Driver__DriverTypeAssignment_4_1 )
            // InternalBomi.g:4586:3: rule__Driver__DriverTypeAssignment_4_1
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
    // InternalBomi.g:4595:1: rule__Driver__Group_5__0 : rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1 ;
    public final void rule__Driver__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4599:1: ( rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1 )
            // InternalBomi.g:4600:2: rule__Driver__Group_5__0__Impl rule__Driver__Group_5__1
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
    // InternalBomi.g:4607:1: rule__Driver__Group_5__0__Impl : ( 'distanceType' ) ;
    public final void rule__Driver__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4611:1: ( ( 'distanceType' ) )
            // InternalBomi.g:4612:1: ( 'distanceType' )
            {
            // InternalBomi.g:4612:1: ( 'distanceType' )
            // InternalBomi.g:4613:2: 'distanceType'
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeKeyword_5_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalBomi.g:4622:1: rule__Driver__Group_5__1 : rule__Driver__Group_5__1__Impl ;
    public final void rule__Driver__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4626:1: ( rule__Driver__Group_5__1__Impl )
            // InternalBomi.g:4627:2: rule__Driver__Group_5__1__Impl
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
    // InternalBomi.g:4633:1: rule__Driver__Group_5__1__Impl : ( ( rule__Driver__DistanceTypeAssignment_5_1 ) ) ;
    public final void rule__Driver__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4637:1: ( ( ( rule__Driver__DistanceTypeAssignment_5_1 ) ) )
            // InternalBomi.g:4638:1: ( ( rule__Driver__DistanceTypeAssignment_5_1 ) )
            {
            // InternalBomi.g:4638:1: ( ( rule__Driver__DistanceTypeAssignment_5_1 ) )
            // InternalBomi.g:4639:2: ( rule__Driver__DistanceTypeAssignment_5_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceTypeAssignment_5_1()); 
            // InternalBomi.g:4640:2: ( rule__Driver__DistanceTypeAssignment_5_1 )
            // InternalBomi.g:4640:3: rule__Driver__DistanceTypeAssignment_5_1
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
    // InternalBomi.g:4649:1: rule__Driver__Group_6__0 : rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1 ;
    public final void rule__Driver__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4653:1: ( rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1 )
            // InternalBomi.g:4654:2: rule__Driver__Group_6__0__Impl rule__Driver__Group_6__1
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
    // InternalBomi.g:4661:1: rule__Driver__Group_6__0__Impl : ( 'distanceSize' ) ;
    public final void rule__Driver__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4665:1: ( ( 'distanceSize' ) )
            // InternalBomi.g:4666:1: ( 'distanceSize' )
            {
            // InternalBomi.g:4666:1: ( 'distanceSize' )
            // InternalBomi.g:4667:2: 'distanceSize'
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeKeyword_6_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalBomi.g:4676:1: rule__Driver__Group_6__1 : rule__Driver__Group_6__1__Impl ;
    public final void rule__Driver__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4680:1: ( rule__Driver__Group_6__1__Impl )
            // InternalBomi.g:4681:2: rule__Driver__Group_6__1__Impl
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
    // InternalBomi.g:4687:1: rule__Driver__Group_6__1__Impl : ( ( rule__Driver__DistanceSizeAssignment_6_1 ) ) ;
    public final void rule__Driver__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4691:1: ( ( ( rule__Driver__DistanceSizeAssignment_6_1 ) ) )
            // InternalBomi.g:4692:1: ( ( rule__Driver__DistanceSizeAssignment_6_1 ) )
            {
            // InternalBomi.g:4692:1: ( ( rule__Driver__DistanceSizeAssignment_6_1 ) )
            // InternalBomi.g:4693:2: ( rule__Driver__DistanceSizeAssignment_6_1 )
            {
             before(grammarAccess.getDriverAccess().getDistanceSizeAssignment_6_1()); 
            // InternalBomi.g:4694:2: ( rule__Driver__DistanceSizeAssignment_6_1 )
            // InternalBomi.g:4694:3: rule__Driver__DistanceSizeAssignment_6_1
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
    // InternalBomi.g:4703:1: rule__Driver__Group_7__0 : rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1 ;
    public final void rule__Driver__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4707:1: ( rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1 )
            // InternalBomi.g:4708:2: rule__Driver__Group_7__0__Impl rule__Driver__Group_7__1
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
    // InternalBomi.g:4715:1: rule__Driver__Group_7__0__Impl : ( 'drivesMIs' ) ;
    public final void rule__Driver__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4719:1: ( ( 'drivesMIs' ) )
            // InternalBomi.g:4720:1: ( 'drivesMIs' )
            {
            // InternalBomi.g:4720:1: ( 'drivesMIs' )
            // InternalBomi.g:4721:2: 'drivesMIs'
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsKeyword_7_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalBomi.g:4730:1: rule__Driver__Group_7__1 : rule__Driver__Group_7__1__Impl rule__Driver__Group_7__2 ;
    public final void rule__Driver__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4734:1: ( rule__Driver__Group_7__1__Impl rule__Driver__Group_7__2 )
            // InternalBomi.g:4735:2: rule__Driver__Group_7__1__Impl rule__Driver__Group_7__2
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
    // InternalBomi.g:4742:1: rule__Driver__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Driver__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4746:1: ( ( '(' ) )
            // InternalBomi.g:4747:1: ( '(' )
            {
            // InternalBomi.g:4747:1: ( '(' )
            // InternalBomi.g:4748:2: '('
            {
             before(grammarAccess.getDriverAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:4757:1: rule__Driver__Group_7__2 : rule__Driver__Group_7__2__Impl rule__Driver__Group_7__3 ;
    public final void rule__Driver__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4761:1: ( rule__Driver__Group_7__2__Impl rule__Driver__Group_7__3 )
            // InternalBomi.g:4762:2: rule__Driver__Group_7__2__Impl rule__Driver__Group_7__3
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
    // InternalBomi.g:4769:1: rule__Driver__Group_7__2__Impl : ( ( rule__Driver__DrivesMIsAssignment_7_2 ) ) ;
    public final void rule__Driver__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4773:1: ( ( ( rule__Driver__DrivesMIsAssignment_7_2 ) ) )
            // InternalBomi.g:4774:1: ( ( rule__Driver__DrivesMIsAssignment_7_2 ) )
            {
            // InternalBomi.g:4774:1: ( ( rule__Driver__DrivesMIsAssignment_7_2 ) )
            // InternalBomi.g:4775:2: ( rule__Driver__DrivesMIsAssignment_7_2 )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsAssignment_7_2()); 
            // InternalBomi.g:4776:2: ( rule__Driver__DrivesMIsAssignment_7_2 )
            // InternalBomi.g:4776:3: rule__Driver__DrivesMIsAssignment_7_2
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
    // InternalBomi.g:4784:1: rule__Driver__Group_7__3 : rule__Driver__Group_7__3__Impl rule__Driver__Group_7__4 ;
    public final void rule__Driver__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4788:1: ( rule__Driver__Group_7__3__Impl rule__Driver__Group_7__4 )
            // InternalBomi.g:4789:2: rule__Driver__Group_7__3__Impl rule__Driver__Group_7__4
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
    // InternalBomi.g:4796:1: rule__Driver__Group_7__3__Impl : ( ( rule__Driver__Group_7_3__0 )* ) ;
    public final void rule__Driver__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4800:1: ( ( ( rule__Driver__Group_7_3__0 )* ) )
            // InternalBomi.g:4801:1: ( ( rule__Driver__Group_7_3__0 )* )
            {
            // InternalBomi.g:4801:1: ( ( rule__Driver__Group_7_3__0 )* )
            // InternalBomi.g:4802:2: ( rule__Driver__Group_7_3__0 )*
            {
             before(grammarAccess.getDriverAccess().getGroup_7_3()); 
            // InternalBomi.g:4803:2: ( rule__Driver__Group_7_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==36) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBomi.g:4803:3: rule__Driver__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Driver__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalBomi.g:4811:1: rule__Driver__Group_7__4 : rule__Driver__Group_7__4__Impl ;
    public final void rule__Driver__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4815:1: ( rule__Driver__Group_7__4__Impl )
            // InternalBomi.g:4816:2: rule__Driver__Group_7__4__Impl
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
    // InternalBomi.g:4822:1: rule__Driver__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Driver__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4826:1: ( ( ')' ) )
            // InternalBomi.g:4827:1: ( ')' )
            {
            // InternalBomi.g:4827:1: ( ')' )
            // InternalBomi.g:4828:2: ')'
            {
             before(grammarAccess.getDriverAccess().getRightParenthesisKeyword_7_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:4838:1: rule__Driver__Group_7_3__0 : rule__Driver__Group_7_3__0__Impl rule__Driver__Group_7_3__1 ;
    public final void rule__Driver__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4842:1: ( rule__Driver__Group_7_3__0__Impl rule__Driver__Group_7_3__1 )
            // InternalBomi.g:4843:2: rule__Driver__Group_7_3__0__Impl rule__Driver__Group_7_3__1
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
    // InternalBomi.g:4850:1: rule__Driver__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Driver__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4854:1: ( ( ',' ) )
            // InternalBomi.g:4855:1: ( ',' )
            {
            // InternalBomi.g:4855:1: ( ',' )
            // InternalBomi.g:4856:2: ','
            {
             before(grammarAccess.getDriverAccess().getCommaKeyword_7_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:4865:1: rule__Driver__Group_7_3__1 : rule__Driver__Group_7_3__1__Impl ;
    public final void rule__Driver__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4869:1: ( rule__Driver__Group_7_3__1__Impl )
            // InternalBomi.g:4870:2: rule__Driver__Group_7_3__1__Impl
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
    // InternalBomi.g:4876:1: rule__Driver__Group_7_3__1__Impl : ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) ) ;
    public final void rule__Driver__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4880:1: ( ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) ) )
            // InternalBomi.g:4881:1: ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) )
            {
            // InternalBomi.g:4881:1: ( ( rule__Driver__DrivesMIsAssignment_7_3_1 ) )
            // InternalBomi.g:4882:2: ( rule__Driver__DrivesMIsAssignment_7_3_1 )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsAssignment_7_3_1()); 
            // InternalBomi.g:4883:2: ( rule__Driver__DrivesMIsAssignment_7_3_1 )
            // InternalBomi.g:4883:3: rule__Driver__DrivesMIsAssignment_7_3_1
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
    // InternalBomi.g:4892:1: rule__BOMICoordination__Group__0 : rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1 ;
    public final void rule__BOMICoordination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4896:1: ( rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1 )
            // InternalBomi.g:4897:2: rule__BOMICoordination__Group__0__Impl rule__BOMICoordination__Group__1
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
    // InternalBomi.g:4904:1: rule__BOMICoordination__Group__0__Impl : ( () ) ;
    public final void rule__BOMICoordination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4908:1: ( ( () ) )
            // InternalBomi.g:4909:1: ( () )
            {
            // InternalBomi.g:4909:1: ( () )
            // InternalBomi.g:4910:2: ()
            {
             before(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationAction_0()); 
            // InternalBomi.g:4911:2: ()
            // InternalBomi.g:4911:3: 
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
    // InternalBomi.g:4919:1: rule__BOMICoordination__Group__1 : rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2 ;
    public final void rule__BOMICoordination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4923:1: ( rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2 )
            // InternalBomi.g:4924:2: rule__BOMICoordination__Group__1__Impl rule__BOMICoordination__Group__2
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
    // InternalBomi.g:4931:1: rule__BOMICoordination__Group__1__Impl : ( 'BOMICoordination' ) ;
    public final void rule__BOMICoordination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4935:1: ( ( 'BOMICoordination' ) )
            // InternalBomi.g:4936:1: ( 'BOMICoordination' )
            {
            // InternalBomi.g:4936:1: ( 'BOMICoordination' )
            // InternalBomi.g:4937:2: 'BOMICoordination'
            {
             before(grammarAccess.getBOMICoordinationAccess().getBOMICoordinationKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalBomi.g:4946:1: rule__BOMICoordination__Group__2 : rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3 ;
    public final void rule__BOMICoordination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4950:1: ( rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3 )
            // InternalBomi.g:4951:2: rule__BOMICoordination__Group__2__Impl rule__BOMICoordination__Group__3
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
    // InternalBomi.g:4958:1: rule__BOMICoordination__Group__2__Impl : ( ( rule__BOMICoordination__NameAssignment_2 ) ) ;
    public final void rule__BOMICoordination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4962:1: ( ( ( rule__BOMICoordination__NameAssignment_2 ) ) )
            // InternalBomi.g:4963:1: ( ( rule__BOMICoordination__NameAssignment_2 ) )
            {
            // InternalBomi.g:4963:1: ( ( rule__BOMICoordination__NameAssignment_2 ) )
            // InternalBomi.g:4964:2: ( rule__BOMICoordination__NameAssignment_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getNameAssignment_2()); 
            // InternalBomi.g:4965:2: ( rule__BOMICoordination__NameAssignment_2 )
            // InternalBomi.g:4965:3: rule__BOMICoordination__NameAssignment_2
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
    // InternalBomi.g:4973:1: rule__BOMICoordination__Group__3 : rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4 ;
    public final void rule__BOMICoordination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4977:1: ( rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4 )
            // InternalBomi.g:4978:2: rule__BOMICoordination__Group__3__Impl rule__BOMICoordination__Group__4
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
    // InternalBomi.g:4985:1: rule__BOMICoordination__Group__3__Impl : ( '{' ) ;
    public final void rule__BOMICoordination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:4989:1: ( ( '{' ) )
            // InternalBomi.g:4990:1: ( '{' )
            {
            // InternalBomi.g:4990:1: ( '{' )
            // InternalBomi.g:4991:2: '{'
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:5000:1: rule__BOMICoordination__Group__4 : rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5 ;
    public final void rule__BOMICoordination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5004:1: ( rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5 )
            // InternalBomi.g:5005:2: rule__BOMICoordination__Group__4__Impl rule__BOMICoordination__Group__5
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
    // InternalBomi.g:5012:1: rule__BOMICoordination__Group__4__Impl : ( ( rule__BOMICoordination__Group_4__0 )? ) ;
    public final void rule__BOMICoordination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5016:1: ( ( ( rule__BOMICoordination__Group_4__0 )? ) )
            // InternalBomi.g:5017:1: ( ( rule__BOMICoordination__Group_4__0 )? )
            {
            // InternalBomi.g:5017:1: ( ( rule__BOMICoordination__Group_4__0 )? )
            // InternalBomi.g:5018:2: ( rule__BOMICoordination__Group_4__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_4()); 
            // InternalBomi.g:5019:2: ( rule__BOMICoordination__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBomi.g:5019:3: rule__BOMICoordination__Group_4__0
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
    // InternalBomi.g:5027:1: rule__BOMICoordination__Group__5 : rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6 ;
    public final void rule__BOMICoordination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5031:1: ( rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6 )
            // InternalBomi.g:5032:2: rule__BOMICoordination__Group__5__Impl rule__BOMICoordination__Group__6
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
    // InternalBomi.g:5039:1: rule__BOMICoordination__Group__5__Impl : ( ( rule__BOMICoordination__Group_5__0 )? ) ;
    public final void rule__BOMICoordination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5043:1: ( ( ( rule__BOMICoordination__Group_5__0 )? ) )
            // InternalBomi.g:5044:1: ( ( rule__BOMICoordination__Group_5__0 )? )
            {
            // InternalBomi.g:5044:1: ( ( rule__BOMICoordination__Group_5__0 )? )
            // InternalBomi.g:5045:2: ( rule__BOMICoordination__Group_5__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_5()); 
            // InternalBomi.g:5046:2: ( rule__BOMICoordination__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==70) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBomi.g:5046:3: rule__BOMICoordination__Group_5__0
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
    // InternalBomi.g:5054:1: rule__BOMICoordination__Group__6 : rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7 ;
    public final void rule__BOMICoordination__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5058:1: ( rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7 )
            // InternalBomi.g:5059:2: rule__BOMICoordination__Group__6__Impl rule__BOMICoordination__Group__7
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
    // InternalBomi.g:5066:1: rule__BOMICoordination__Group__6__Impl : ( ( rule__BOMICoordination__Group_6__0 )? ) ;
    public final void rule__BOMICoordination__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5070:1: ( ( ( rule__BOMICoordination__Group_6__0 )? ) )
            // InternalBomi.g:5071:1: ( ( rule__BOMICoordination__Group_6__0 )? )
            {
            // InternalBomi.g:5071:1: ( ( rule__BOMICoordination__Group_6__0 )? )
            // InternalBomi.g:5072:2: ( rule__BOMICoordination__Group_6__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_6()); 
            // InternalBomi.g:5073:2: ( rule__BOMICoordination__Group_6__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBomi.g:5073:3: rule__BOMICoordination__Group_6__0
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
    // InternalBomi.g:5081:1: rule__BOMICoordination__Group__7 : rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8 ;
    public final void rule__BOMICoordination__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5085:1: ( rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8 )
            // InternalBomi.g:5086:2: rule__BOMICoordination__Group__7__Impl rule__BOMICoordination__Group__8
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
    // InternalBomi.g:5093:1: rule__BOMICoordination__Group__7__Impl : ( ( rule__BOMICoordination__Group_7__0 )? ) ;
    public final void rule__BOMICoordination__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5097:1: ( ( ( rule__BOMICoordination__Group_7__0 )? ) )
            // InternalBomi.g:5098:1: ( ( rule__BOMICoordination__Group_7__0 )? )
            {
            // InternalBomi.g:5098:1: ( ( rule__BOMICoordination__Group_7__0 )? )
            // InternalBomi.g:5099:2: ( rule__BOMICoordination__Group_7__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_7()); 
            // InternalBomi.g:5100:2: ( rule__BOMICoordination__Group_7__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==72) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBomi.g:5100:3: rule__BOMICoordination__Group_7__0
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
    // InternalBomi.g:5108:1: rule__BOMICoordination__Group__8 : rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9 ;
    public final void rule__BOMICoordination__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5112:1: ( rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9 )
            // InternalBomi.g:5113:2: rule__BOMICoordination__Group__8__Impl rule__BOMICoordination__Group__9
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
    // InternalBomi.g:5120:1: rule__BOMICoordination__Group__8__Impl : ( ( rule__BOMICoordination__Group_8__0 )? ) ;
    public final void rule__BOMICoordination__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5124:1: ( ( ( rule__BOMICoordination__Group_8__0 )? ) )
            // InternalBomi.g:5125:1: ( ( rule__BOMICoordination__Group_8__0 )? )
            {
            // InternalBomi.g:5125:1: ( ( rule__BOMICoordination__Group_8__0 )? )
            // InternalBomi.g:5126:2: ( rule__BOMICoordination__Group_8__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_8()); 
            // InternalBomi.g:5127:2: ( rule__BOMICoordination__Group_8__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBomi.g:5127:3: rule__BOMICoordination__Group_8__0
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
    // InternalBomi.g:5135:1: rule__BOMICoordination__Group__9 : rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10 ;
    public final void rule__BOMICoordination__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5139:1: ( rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10 )
            // InternalBomi.g:5140:2: rule__BOMICoordination__Group__9__Impl rule__BOMICoordination__Group__10
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
    // InternalBomi.g:5147:1: rule__BOMICoordination__Group__9__Impl : ( ( rule__BOMICoordination__Group_9__0 )? ) ;
    public final void rule__BOMICoordination__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5151:1: ( ( ( rule__BOMICoordination__Group_9__0 )? ) )
            // InternalBomi.g:5152:1: ( ( rule__BOMICoordination__Group_9__0 )? )
            {
            // InternalBomi.g:5152:1: ( ( rule__BOMICoordination__Group_9__0 )? )
            // InternalBomi.g:5153:2: ( rule__BOMICoordination__Group_9__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_9()); 
            // InternalBomi.g:5154:2: ( rule__BOMICoordination__Group_9__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==33) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBomi.g:5154:3: rule__BOMICoordination__Group_9__0
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
    // InternalBomi.g:5162:1: rule__BOMICoordination__Group__10 : rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11 ;
    public final void rule__BOMICoordination__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5166:1: ( rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11 )
            // InternalBomi.g:5167:2: rule__BOMICoordination__Group__10__Impl rule__BOMICoordination__Group__11
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
    // InternalBomi.g:5174:1: rule__BOMICoordination__Group__10__Impl : ( ( rule__BOMICoordination__Group_10__0 )? ) ;
    public final void rule__BOMICoordination__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5178:1: ( ( ( rule__BOMICoordination__Group_10__0 )? ) )
            // InternalBomi.g:5179:1: ( ( rule__BOMICoordination__Group_10__0 )? )
            {
            // InternalBomi.g:5179:1: ( ( rule__BOMICoordination__Group_10__0 )? )
            // InternalBomi.g:5180:2: ( rule__BOMICoordination__Group_10__0 )?
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_10()); 
            // InternalBomi.g:5181:2: ( rule__BOMICoordination__Group_10__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==37) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBomi.g:5181:3: rule__BOMICoordination__Group_10__0
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
    // InternalBomi.g:5189:1: rule__BOMICoordination__Group__11 : rule__BOMICoordination__Group__11__Impl ;
    public final void rule__BOMICoordination__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5193:1: ( rule__BOMICoordination__Group__11__Impl )
            // InternalBomi.g:5194:2: rule__BOMICoordination__Group__11__Impl
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
    // InternalBomi.g:5200:1: rule__BOMICoordination__Group__11__Impl : ( '}' ) ;
    public final void rule__BOMICoordination__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5204:1: ( ( '}' ) )
            // InternalBomi.g:5205:1: ( '}' )
            {
            // InternalBomi.g:5205:1: ( '}' )
            // InternalBomi.g:5206:2: '}'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:5216:1: rule__BOMICoordination__Group_4__0 : rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1 ;
    public final void rule__BOMICoordination__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5220:1: ( rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1 )
            // InternalBomi.g:5221:2: rule__BOMICoordination__Group_4__0__Impl rule__BOMICoordination__Group_4__1
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
    // InternalBomi.g:5228:1: rule__BOMICoordination__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BOMICoordination__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5232:1: ( ( 'purpose' ) )
            // InternalBomi.g:5233:1: ( 'purpose' )
            {
            // InternalBomi.g:5233:1: ( 'purpose' )
            // InternalBomi.g:5234:2: 'purpose'
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
    // InternalBomi.g:5243:1: rule__BOMICoordination__Group_4__1 : rule__BOMICoordination__Group_4__1__Impl ;
    public final void rule__BOMICoordination__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5247:1: ( rule__BOMICoordination__Group_4__1__Impl )
            // InternalBomi.g:5248:2: rule__BOMICoordination__Group_4__1__Impl
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
    // InternalBomi.g:5254:1: rule__BOMICoordination__Group_4__1__Impl : ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) ) ;
    public final void rule__BOMICoordination__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5258:1: ( ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:5259:1: ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:5259:1: ( ( rule__BOMICoordination__PurposeAssignment_4_1 ) )
            // InternalBomi.g:5260:2: ( rule__BOMICoordination__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:5261:2: ( rule__BOMICoordination__PurposeAssignment_4_1 )
            // InternalBomi.g:5261:3: rule__BOMICoordination__PurposeAssignment_4_1
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
    // InternalBomi.g:5270:1: rule__BOMICoordination__Group_5__0 : rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1 ;
    public final void rule__BOMICoordination__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5274:1: ( rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1 )
            // InternalBomi.g:5275:2: rule__BOMICoordination__Group_5__0__Impl rule__BOMICoordination__Group_5__1
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
    // InternalBomi.g:5282:1: rule__BOMICoordination__Group_5__0__Impl : ( 'accessability' ) ;
    public final void rule__BOMICoordination__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5286:1: ( ( 'accessability' ) )
            // InternalBomi.g:5287:1: ( 'accessability' )
            {
            // InternalBomi.g:5287:1: ( 'accessability' )
            // InternalBomi.g:5288:2: 'accessability'
            {
             before(grammarAccess.getBOMICoordinationAccess().getAccessabilityKeyword_5_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalBomi.g:5297:1: rule__BOMICoordination__Group_5__1 : rule__BOMICoordination__Group_5__1__Impl ;
    public final void rule__BOMICoordination__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5301:1: ( rule__BOMICoordination__Group_5__1__Impl )
            // InternalBomi.g:5302:2: rule__BOMICoordination__Group_5__1__Impl
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
    // InternalBomi.g:5308:1: rule__BOMICoordination__Group_5__1__Impl : ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) ) ;
    public final void rule__BOMICoordination__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5312:1: ( ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) ) )
            // InternalBomi.g:5313:1: ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) )
            {
            // InternalBomi.g:5313:1: ( ( rule__BOMICoordination__AccessabilityAssignment_5_1 ) )
            // InternalBomi.g:5314:2: ( rule__BOMICoordination__AccessabilityAssignment_5_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getAccessabilityAssignment_5_1()); 
            // InternalBomi.g:5315:2: ( rule__BOMICoordination__AccessabilityAssignment_5_1 )
            // InternalBomi.g:5315:3: rule__BOMICoordination__AccessabilityAssignment_5_1
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
    // InternalBomi.g:5324:1: rule__BOMICoordination__Group_6__0 : rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1 ;
    public final void rule__BOMICoordination__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5328:1: ( rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1 )
            // InternalBomi.g:5329:2: rule__BOMICoordination__Group_6__0__Impl rule__BOMICoordination__Group_6__1
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
    // InternalBomi.g:5336:1: rule__BOMICoordination__Group_6__0__Impl : ( 'stability' ) ;
    public final void rule__BOMICoordination__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5340:1: ( ( 'stability' ) )
            // InternalBomi.g:5341:1: ( 'stability' )
            {
            // InternalBomi.g:5341:1: ( 'stability' )
            // InternalBomi.g:5342:2: 'stability'
            {
             before(grammarAccess.getBOMICoordinationAccess().getStabilityKeyword_6_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalBomi.g:5351:1: rule__BOMICoordination__Group_6__1 : rule__BOMICoordination__Group_6__1__Impl ;
    public final void rule__BOMICoordination__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5355:1: ( rule__BOMICoordination__Group_6__1__Impl )
            // InternalBomi.g:5356:2: rule__BOMICoordination__Group_6__1__Impl
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
    // InternalBomi.g:5362:1: rule__BOMICoordination__Group_6__1__Impl : ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) ) ;
    public final void rule__BOMICoordination__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5366:1: ( ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) ) )
            // InternalBomi.g:5367:1: ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) )
            {
            // InternalBomi.g:5367:1: ( ( rule__BOMICoordination__StabilityAssignment_6_1 ) )
            // InternalBomi.g:5368:2: ( rule__BOMICoordination__StabilityAssignment_6_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getStabilityAssignment_6_1()); 
            // InternalBomi.g:5369:2: ( rule__BOMICoordination__StabilityAssignment_6_1 )
            // InternalBomi.g:5369:3: rule__BOMICoordination__StabilityAssignment_6_1
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
    // InternalBomi.g:5378:1: rule__BOMICoordination__Group_7__0 : rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1 ;
    public final void rule__BOMICoordination__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5382:1: ( rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1 )
            // InternalBomi.g:5383:2: rule__BOMICoordination__Group_7__0__Impl rule__BOMICoordination__Group_7__1
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
    // InternalBomi.g:5390:1: rule__BOMICoordination__Group_7__0__Impl : ( 'criticality' ) ;
    public final void rule__BOMICoordination__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5394:1: ( ( 'criticality' ) )
            // InternalBomi.g:5395:1: ( 'criticality' )
            {
            // InternalBomi.g:5395:1: ( 'criticality' )
            // InternalBomi.g:5396:2: 'criticality'
            {
             before(grammarAccess.getBOMICoordinationAccess().getCriticalityKeyword_7_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalBomi.g:5405:1: rule__BOMICoordination__Group_7__1 : rule__BOMICoordination__Group_7__1__Impl ;
    public final void rule__BOMICoordination__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5409:1: ( rule__BOMICoordination__Group_7__1__Impl )
            // InternalBomi.g:5410:2: rule__BOMICoordination__Group_7__1__Impl
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
    // InternalBomi.g:5416:1: rule__BOMICoordination__Group_7__1__Impl : ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) ) ;
    public final void rule__BOMICoordination__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5420:1: ( ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) ) )
            // InternalBomi.g:5421:1: ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) )
            {
            // InternalBomi.g:5421:1: ( ( rule__BOMICoordination__CriticalityAssignment_7_1 ) )
            // InternalBomi.g:5422:2: ( rule__BOMICoordination__CriticalityAssignment_7_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getCriticalityAssignment_7_1()); 
            // InternalBomi.g:5423:2: ( rule__BOMICoordination__CriticalityAssignment_7_1 )
            // InternalBomi.g:5423:3: rule__BOMICoordination__CriticalityAssignment_7_1
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
    // InternalBomi.g:5432:1: rule__BOMICoordination__Group_8__0 : rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1 ;
    public final void rule__BOMICoordination__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5436:1: ( rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1 )
            // InternalBomi.g:5437:2: rule__BOMICoordination__Group_8__0__Impl rule__BOMICoordination__Group_8__1
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
    // InternalBomi.g:5444:1: rule__BOMICoordination__Group_8__0__Impl : ( 'fitForPurpose' ) ;
    public final void rule__BOMICoordination__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5448:1: ( ( 'fitForPurpose' ) )
            // InternalBomi.g:5449:1: ( 'fitForPurpose' )
            {
            // InternalBomi.g:5449:1: ( 'fitForPurpose' )
            // InternalBomi.g:5450:2: 'fitForPurpose'
            {
             before(grammarAccess.getBOMICoordinationAccess().getFitForPurposeKeyword_8_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalBomi.g:5459:1: rule__BOMICoordination__Group_8__1 : rule__BOMICoordination__Group_8__1__Impl ;
    public final void rule__BOMICoordination__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5463:1: ( rule__BOMICoordination__Group_8__1__Impl )
            // InternalBomi.g:5464:2: rule__BOMICoordination__Group_8__1__Impl
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
    // InternalBomi.g:5470:1: rule__BOMICoordination__Group_8__1__Impl : ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) ) ;
    public final void rule__BOMICoordination__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5474:1: ( ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) ) )
            // InternalBomi.g:5475:1: ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) )
            {
            // InternalBomi.g:5475:1: ( ( rule__BOMICoordination__FitForPurposeAssignment_8_1 ) )
            // InternalBomi.g:5476:2: ( rule__BOMICoordination__FitForPurposeAssignment_8_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getFitForPurposeAssignment_8_1()); 
            // InternalBomi.g:5477:2: ( rule__BOMICoordination__FitForPurposeAssignment_8_1 )
            // InternalBomi.g:5477:3: rule__BOMICoordination__FitForPurposeAssignment_8_1
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
    // InternalBomi.g:5486:1: rule__BOMICoordination__Group_9__0 : rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1 ;
    public final void rule__BOMICoordination__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5490:1: ( rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1 )
            // InternalBomi.g:5491:2: rule__BOMICoordination__Group_9__0__Impl rule__BOMICoordination__Group_9__1
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
    // InternalBomi.g:5498:1: rule__BOMICoordination__Group_9__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOMICoordination__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5502:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:5503:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:5503:1: ( 'boundaryObjects' )
            // InternalBomi.g:5504:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsKeyword_9_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:5513:1: rule__BOMICoordination__Group_9__1 : rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2 ;
    public final void rule__BOMICoordination__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5517:1: ( rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2 )
            // InternalBomi.g:5518:2: rule__BOMICoordination__Group_9__1__Impl rule__BOMICoordination__Group_9__2
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
    // InternalBomi.g:5525:1: rule__BOMICoordination__Group_9__1__Impl : ( '(' ) ;
    public final void rule__BOMICoordination__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5529:1: ( ( '(' ) )
            // InternalBomi.g:5530:1: ( '(' )
            {
            // InternalBomi.g:5530:1: ( '(' )
            // InternalBomi.g:5531:2: '('
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:5540:1: rule__BOMICoordination__Group_9__2 : rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3 ;
    public final void rule__BOMICoordination__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5544:1: ( rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3 )
            // InternalBomi.g:5545:2: rule__BOMICoordination__Group_9__2__Impl rule__BOMICoordination__Group_9__3
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
    // InternalBomi.g:5552:1: rule__BOMICoordination__Group_9__2__Impl : ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) ) ;
    public final void rule__BOMICoordination__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5556:1: ( ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) ) )
            // InternalBomi.g:5557:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) )
            {
            // InternalBomi.g:5557:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 ) )
            // InternalBomi.g:5558:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_2()); 
            // InternalBomi.g:5559:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_2 )
            // InternalBomi.g:5559:3: rule__BOMICoordination__BoundaryObjectsAssignment_9_2
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
    // InternalBomi.g:5567:1: rule__BOMICoordination__Group_9__3 : rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4 ;
    public final void rule__BOMICoordination__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5571:1: ( rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4 )
            // InternalBomi.g:5572:2: rule__BOMICoordination__Group_9__3__Impl rule__BOMICoordination__Group_9__4
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
    // InternalBomi.g:5579:1: rule__BOMICoordination__Group_9__3__Impl : ( ( rule__BOMICoordination__Group_9_3__0 )* ) ;
    public final void rule__BOMICoordination__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5583:1: ( ( ( rule__BOMICoordination__Group_9_3__0 )* ) )
            // InternalBomi.g:5584:1: ( ( rule__BOMICoordination__Group_9_3__0 )* )
            {
            // InternalBomi.g:5584:1: ( ( rule__BOMICoordination__Group_9_3__0 )* )
            // InternalBomi.g:5585:2: ( rule__BOMICoordination__Group_9_3__0 )*
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_9_3()); 
            // InternalBomi.g:5586:2: ( rule__BOMICoordination__Group_9_3__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==36) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalBomi.g:5586:3: rule__BOMICoordination__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMICoordination__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalBomi.g:5594:1: rule__BOMICoordination__Group_9__4 : rule__BOMICoordination__Group_9__4__Impl ;
    public final void rule__BOMICoordination__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5598:1: ( rule__BOMICoordination__Group_9__4__Impl )
            // InternalBomi.g:5599:2: rule__BOMICoordination__Group_9__4__Impl
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
    // InternalBomi.g:5605:1: rule__BOMICoordination__Group_9__4__Impl : ( ')' ) ;
    public final void rule__BOMICoordination__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5609:1: ( ( ')' ) )
            // InternalBomi.g:5610:1: ( ')' )
            {
            // InternalBomi.g:5610:1: ( ')' )
            // InternalBomi.g:5611:2: ')'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_9_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:5621:1: rule__BOMICoordination__Group_9_3__0 : rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1 ;
    public final void rule__BOMICoordination__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5625:1: ( rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1 )
            // InternalBomi.g:5626:2: rule__BOMICoordination__Group_9_3__0__Impl rule__BOMICoordination__Group_9_3__1
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
    // InternalBomi.g:5633:1: rule__BOMICoordination__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__BOMICoordination__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5637:1: ( ( ',' ) )
            // InternalBomi.g:5638:1: ( ',' )
            {
            // InternalBomi.g:5638:1: ( ',' )
            // InternalBomi.g:5639:2: ','
            {
             before(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_9_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:5648:1: rule__BOMICoordination__Group_9_3__1 : rule__BOMICoordination__Group_9_3__1__Impl ;
    public final void rule__BOMICoordination__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5652:1: ( rule__BOMICoordination__Group_9_3__1__Impl )
            // InternalBomi.g:5653:2: rule__BOMICoordination__Group_9_3__1__Impl
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
    // InternalBomi.g:5659:1: rule__BOMICoordination__Group_9_3__1__Impl : ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) ) ;
    public final void rule__BOMICoordination__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5663:1: ( ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) ) )
            // InternalBomi.g:5664:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) )
            {
            // InternalBomi.g:5664:1: ( ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 ) )
            // InternalBomi.g:5665:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsAssignment_9_3_1()); 
            // InternalBomi.g:5666:2: ( rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 )
            // InternalBomi.g:5666:3: rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1
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
    // InternalBomi.g:5675:1: rule__BOMICoordination__Group_10__0 : rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1 ;
    public final void rule__BOMICoordination__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5679:1: ( rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1 )
            // InternalBomi.g:5680:2: rule__BOMICoordination__Group_10__0__Impl rule__BOMICoordination__Group_10__1
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
    // InternalBomi.g:5687:1: rule__BOMICoordination__Group_10__0__Impl : ( 'methodologicalIslands' ) ;
    public final void rule__BOMICoordination__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5691:1: ( ( 'methodologicalIslands' ) )
            // InternalBomi.g:5692:1: ( 'methodologicalIslands' )
            {
            // InternalBomi.g:5692:1: ( 'methodologicalIslands' )
            // InternalBomi.g:5693:2: 'methodologicalIslands'
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsKeyword_10_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBomi.g:5702:1: rule__BOMICoordination__Group_10__1 : rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2 ;
    public final void rule__BOMICoordination__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5706:1: ( rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2 )
            // InternalBomi.g:5707:2: rule__BOMICoordination__Group_10__1__Impl rule__BOMICoordination__Group_10__2
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
    // InternalBomi.g:5714:1: rule__BOMICoordination__Group_10__1__Impl : ( '(' ) ;
    public final void rule__BOMICoordination__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5718:1: ( ( '(' ) )
            // InternalBomi.g:5719:1: ( '(' )
            {
            // InternalBomi.g:5719:1: ( '(' )
            // InternalBomi.g:5720:2: '('
            {
             before(grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:5729:1: rule__BOMICoordination__Group_10__2 : rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3 ;
    public final void rule__BOMICoordination__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5733:1: ( rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3 )
            // InternalBomi.g:5734:2: rule__BOMICoordination__Group_10__2__Impl rule__BOMICoordination__Group_10__3
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
    // InternalBomi.g:5741:1: rule__BOMICoordination__Group_10__2__Impl : ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) ) ;
    public final void rule__BOMICoordination__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5745:1: ( ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) ) )
            // InternalBomi.g:5746:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) )
            {
            // InternalBomi.g:5746:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 ) )
            // InternalBomi.g:5747:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_2()); 
            // InternalBomi.g:5748:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 )
            // InternalBomi.g:5748:3: rule__BOMICoordination__MethodologicalIslandsAssignment_10_2
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
    // InternalBomi.g:5756:1: rule__BOMICoordination__Group_10__3 : rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4 ;
    public final void rule__BOMICoordination__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5760:1: ( rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4 )
            // InternalBomi.g:5761:2: rule__BOMICoordination__Group_10__3__Impl rule__BOMICoordination__Group_10__4
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
    // InternalBomi.g:5768:1: rule__BOMICoordination__Group_10__3__Impl : ( ( rule__BOMICoordination__Group_10_3__0 )* ) ;
    public final void rule__BOMICoordination__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5772:1: ( ( ( rule__BOMICoordination__Group_10_3__0 )* ) )
            // InternalBomi.g:5773:1: ( ( rule__BOMICoordination__Group_10_3__0 )* )
            {
            // InternalBomi.g:5773:1: ( ( rule__BOMICoordination__Group_10_3__0 )* )
            // InternalBomi.g:5774:2: ( rule__BOMICoordination__Group_10_3__0 )*
            {
             before(grammarAccess.getBOMICoordinationAccess().getGroup_10_3()); 
            // InternalBomi.g:5775:2: ( rule__BOMICoordination__Group_10_3__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==36) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalBomi.g:5775:3: rule__BOMICoordination__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOMICoordination__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalBomi.g:5783:1: rule__BOMICoordination__Group_10__4 : rule__BOMICoordination__Group_10__4__Impl ;
    public final void rule__BOMICoordination__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5787:1: ( rule__BOMICoordination__Group_10__4__Impl )
            // InternalBomi.g:5788:2: rule__BOMICoordination__Group_10__4__Impl
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
    // InternalBomi.g:5794:1: rule__BOMICoordination__Group_10__4__Impl : ( ')' ) ;
    public final void rule__BOMICoordination__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5798:1: ( ( ')' ) )
            // InternalBomi.g:5799:1: ( ')' )
            {
            // InternalBomi.g:5799:1: ( ')' )
            // InternalBomi.g:5800:2: ')'
            {
             before(grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_10_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:5810:1: rule__BOMICoordination__Group_10_3__0 : rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1 ;
    public final void rule__BOMICoordination__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5814:1: ( rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1 )
            // InternalBomi.g:5815:2: rule__BOMICoordination__Group_10_3__0__Impl rule__BOMICoordination__Group_10_3__1
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
    // InternalBomi.g:5822:1: rule__BOMICoordination__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__BOMICoordination__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5826:1: ( ( ',' ) )
            // InternalBomi.g:5827:1: ( ',' )
            {
            // InternalBomi.g:5827:1: ( ',' )
            // InternalBomi.g:5828:2: ','
            {
             before(grammarAccess.getBOMICoordinationAccess().getCommaKeyword_10_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:5837:1: rule__BOMICoordination__Group_10_3__1 : rule__BOMICoordination__Group_10_3__1__Impl ;
    public final void rule__BOMICoordination__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5841:1: ( rule__BOMICoordination__Group_10_3__1__Impl )
            // InternalBomi.g:5842:2: rule__BOMICoordination__Group_10_3__1__Impl
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
    // InternalBomi.g:5848:1: rule__BOMICoordination__Group_10_3__1__Impl : ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) ) ;
    public final void rule__BOMICoordination__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5852:1: ( ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) ) )
            // InternalBomi.g:5853:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) )
            {
            // InternalBomi.g:5853:1: ( ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 ) )
            // InternalBomi.g:5854:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsAssignment_10_3_1()); 
            // InternalBomi.g:5855:2: ( rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 )
            // InternalBomi.g:5855:3: rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1
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
    // InternalBomi.g:5864:1: rule__BORoleInteraction__Group__0 : rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1 ;
    public final void rule__BORoleInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5868:1: ( rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1 )
            // InternalBomi.g:5869:2: rule__BORoleInteraction__Group__0__Impl rule__BORoleInteraction__Group__1
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
    // InternalBomi.g:5876:1: rule__BORoleInteraction__Group__0__Impl : ( () ) ;
    public final void rule__BORoleInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5880:1: ( ( () ) )
            // InternalBomi.g:5881:1: ( () )
            {
            // InternalBomi.g:5881:1: ( () )
            // InternalBomi.g:5882:2: ()
            {
             before(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionAction_0()); 
            // InternalBomi.g:5883:2: ()
            // InternalBomi.g:5883:3: 
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
    // InternalBomi.g:5891:1: rule__BORoleInteraction__Group__1 : rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2 ;
    public final void rule__BORoleInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5895:1: ( rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2 )
            // InternalBomi.g:5896:2: rule__BORoleInteraction__Group__1__Impl rule__BORoleInteraction__Group__2
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
    // InternalBomi.g:5903:1: rule__BORoleInteraction__Group__1__Impl : ( 'BORoleInteraction' ) ;
    public final void rule__BORoleInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5907:1: ( ( 'BORoleInteraction' ) )
            // InternalBomi.g:5908:1: ( 'BORoleInteraction' )
            {
            // InternalBomi.g:5908:1: ( 'BORoleInteraction' )
            // InternalBomi.g:5909:2: 'BORoleInteraction'
            {
             before(grammarAccess.getBORoleInteractionAccess().getBORoleInteractionKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalBomi.g:5918:1: rule__BORoleInteraction__Group__2 : rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3 ;
    public final void rule__BORoleInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5922:1: ( rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3 )
            // InternalBomi.g:5923:2: rule__BORoleInteraction__Group__2__Impl rule__BORoleInteraction__Group__3
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
    // InternalBomi.g:5930:1: rule__BORoleInteraction__Group__2__Impl : ( ( rule__BORoleInteraction__NameAssignment_2 ) ) ;
    public final void rule__BORoleInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5934:1: ( ( ( rule__BORoleInteraction__NameAssignment_2 ) ) )
            // InternalBomi.g:5935:1: ( ( rule__BORoleInteraction__NameAssignment_2 ) )
            {
            // InternalBomi.g:5935:1: ( ( rule__BORoleInteraction__NameAssignment_2 ) )
            // InternalBomi.g:5936:2: ( rule__BORoleInteraction__NameAssignment_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getNameAssignment_2()); 
            // InternalBomi.g:5937:2: ( rule__BORoleInteraction__NameAssignment_2 )
            // InternalBomi.g:5937:3: rule__BORoleInteraction__NameAssignment_2
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
    // InternalBomi.g:5945:1: rule__BORoleInteraction__Group__3 : rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4 ;
    public final void rule__BORoleInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5949:1: ( rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4 )
            // InternalBomi.g:5950:2: rule__BORoleInteraction__Group__3__Impl rule__BORoleInteraction__Group__4
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
    // InternalBomi.g:5957:1: rule__BORoleInteraction__Group__3__Impl : ( '{' ) ;
    public final void rule__BORoleInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5961:1: ( ( '{' ) )
            // InternalBomi.g:5962:1: ( '{' )
            {
            // InternalBomi.g:5962:1: ( '{' )
            // InternalBomi.g:5963:2: '{'
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:5972:1: rule__BORoleInteraction__Group__4 : rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5 ;
    public final void rule__BORoleInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5976:1: ( rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5 )
            // InternalBomi.g:5977:2: rule__BORoleInteraction__Group__4__Impl rule__BORoleInteraction__Group__5
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
    // InternalBomi.g:5984:1: rule__BORoleInteraction__Group__4__Impl : ( ( rule__BORoleInteraction__Group_4__0 )? ) ;
    public final void rule__BORoleInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:5988:1: ( ( ( rule__BORoleInteraction__Group_4__0 )? ) )
            // InternalBomi.g:5989:1: ( ( rule__BORoleInteraction__Group_4__0 )? )
            {
            // InternalBomi.g:5989:1: ( ( rule__BORoleInteraction__Group_4__0 )? )
            // InternalBomi.g:5990:2: ( rule__BORoleInteraction__Group_4__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_4()); 
            // InternalBomi.g:5991:2: ( rule__BORoleInteraction__Group_4__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==43) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBomi.g:5991:3: rule__BORoleInteraction__Group_4__0
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
    // InternalBomi.g:5999:1: rule__BORoleInteraction__Group__5 : rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6 ;
    public final void rule__BORoleInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6003:1: ( rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6 )
            // InternalBomi.g:6004:2: rule__BORoleInteraction__Group__5__Impl rule__BORoleInteraction__Group__6
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
    // InternalBomi.g:6011:1: rule__BORoleInteraction__Group__5__Impl : ( ( rule__BORoleInteraction__Group_5__0 )? ) ;
    public final void rule__BORoleInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6015:1: ( ( ( rule__BORoleInteraction__Group_5__0 )? ) )
            // InternalBomi.g:6016:1: ( ( rule__BORoleInteraction__Group_5__0 )? )
            {
            // InternalBomi.g:6016:1: ( ( rule__BORoleInteraction__Group_5__0 )? )
            // InternalBomi.g:6017:2: ( rule__BORoleInteraction__Group_5__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_5()); 
            // InternalBomi.g:6018:2: ( rule__BORoleInteraction__Group_5__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==70) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBomi.g:6018:3: rule__BORoleInteraction__Group_5__0
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
    // InternalBomi.g:6026:1: rule__BORoleInteraction__Group__6 : rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7 ;
    public final void rule__BORoleInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6030:1: ( rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7 )
            // InternalBomi.g:6031:2: rule__BORoleInteraction__Group__6__Impl rule__BORoleInteraction__Group__7
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
    // InternalBomi.g:6038:1: rule__BORoleInteraction__Group__6__Impl : ( ( rule__BORoleInteraction__Group_6__0 )? ) ;
    public final void rule__BORoleInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6042:1: ( ( ( rule__BORoleInteraction__Group_6__0 )? ) )
            // InternalBomi.g:6043:1: ( ( rule__BORoleInteraction__Group_6__0 )? )
            {
            // InternalBomi.g:6043:1: ( ( rule__BORoleInteraction__Group_6__0 )? )
            // InternalBomi.g:6044:2: ( rule__BORoleInteraction__Group_6__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_6()); 
            // InternalBomi.g:6045:2: ( rule__BORoleInteraction__Group_6__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==71) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBomi.g:6045:3: rule__BORoleInteraction__Group_6__0
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
    // InternalBomi.g:6053:1: rule__BORoleInteraction__Group__7 : rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8 ;
    public final void rule__BORoleInteraction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6057:1: ( rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8 )
            // InternalBomi.g:6058:2: rule__BORoleInteraction__Group__7__Impl rule__BORoleInteraction__Group__8
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
    // InternalBomi.g:6065:1: rule__BORoleInteraction__Group__7__Impl : ( ( rule__BORoleInteraction__Group_7__0 )? ) ;
    public final void rule__BORoleInteraction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6069:1: ( ( ( rule__BORoleInteraction__Group_7__0 )? ) )
            // InternalBomi.g:6070:1: ( ( rule__BORoleInteraction__Group_7__0 )? )
            {
            // InternalBomi.g:6070:1: ( ( rule__BORoleInteraction__Group_7__0 )? )
            // InternalBomi.g:6071:2: ( rule__BORoleInteraction__Group_7__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_7()); 
            // InternalBomi.g:6072:2: ( rule__BORoleInteraction__Group_7__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==72) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBomi.g:6072:3: rule__BORoleInteraction__Group_7__0
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
    // InternalBomi.g:6080:1: rule__BORoleInteraction__Group__8 : rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9 ;
    public final void rule__BORoleInteraction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6084:1: ( rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9 )
            // InternalBomi.g:6085:2: rule__BORoleInteraction__Group__8__Impl rule__BORoleInteraction__Group__9
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
    // InternalBomi.g:6092:1: rule__BORoleInteraction__Group__8__Impl : ( ( rule__BORoleInteraction__Group_8__0 )? ) ;
    public final void rule__BORoleInteraction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6096:1: ( ( ( rule__BORoleInteraction__Group_8__0 )? ) )
            // InternalBomi.g:6097:1: ( ( rule__BORoleInteraction__Group_8__0 )? )
            {
            // InternalBomi.g:6097:1: ( ( rule__BORoleInteraction__Group_8__0 )? )
            // InternalBomi.g:6098:2: ( rule__BORoleInteraction__Group_8__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_8()); 
            // InternalBomi.g:6099:2: ( rule__BORoleInteraction__Group_8__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==73) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBomi.g:6099:3: rule__BORoleInteraction__Group_8__0
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
    // InternalBomi.g:6107:1: rule__BORoleInteraction__Group__9 : rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10 ;
    public final void rule__BORoleInteraction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6111:1: ( rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10 )
            // InternalBomi.g:6112:2: rule__BORoleInteraction__Group__9__Impl rule__BORoleInteraction__Group__10
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
    // InternalBomi.g:6119:1: rule__BORoleInteraction__Group__9__Impl : ( ( rule__BORoleInteraction__Group_9__0 )? ) ;
    public final void rule__BORoleInteraction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6123:1: ( ( ( rule__BORoleInteraction__Group_9__0 )? ) )
            // InternalBomi.g:6124:1: ( ( rule__BORoleInteraction__Group_9__0 )? )
            {
            // InternalBomi.g:6124:1: ( ( rule__BORoleInteraction__Group_9__0 )? )
            // InternalBomi.g:6125:2: ( rule__BORoleInteraction__Group_9__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_9()); 
            // InternalBomi.g:6126:2: ( rule__BORoleInteraction__Group_9__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==33) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBomi.g:6126:3: rule__BORoleInteraction__Group_9__0
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
    // InternalBomi.g:6134:1: rule__BORoleInteraction__Group__10 : rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11 ;
    public final void rule__BORoleInteraction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6138:1: ( rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11 )
            // InternalBomi.g:6139:2: rule__BORoleInteraction__Group__10__Impl rule__BORoleInteraction__Group__11
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
    // InternalBomi.g:6146:1: rule__BORoleInteraction__Group__10__Impl : ( ( rule__BORoleInteraction__Group_10__0 )? ) ;
    public final void rule__BORoleInteraction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6150:1: ( ( ( rule__BORoleInteraction__Group_10__0 )? ) )
            // InternalBomi.g:6151:1: ( ( rule__BORoleInteraction__Group_10__0 )? )
            {
            // InternalBomi.g:6151:1: ( ( rule__BORoleInteraction__Group_10__0 )? )
            // InternalBomi.g:6152:2: ( rule__BORoleInteraction__Group_10__0 )?
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_10()); 
            // InternalBomi.g:6153:2: ( rule__BORoleInteraction__Group_10__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==39) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBomi.g:6153:3: rule__BORoleInteraction__Group_10__0
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
    // InternalBomi.g:6161:1: rule__BORoleInteraction__Group__11 : rule__BORoleInteraction__Group__11__Impl ;
    public final void rule__BORoleInteraction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6165:1: ( rule__BORoleInteraction__Group__11__Impl )
            // InternalBomi.g:6166:2: rule__BORoleInteraction__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:6172:1: rule__BORoleInteraction__Group__11__Impl : ( '}' ) ;
    public final void rule__BORoleInteraction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6176:1: ( ( '}' ) )
            // InternalBomi.g:6177:1: ( '}' )
            {
            // InternalBomi.g:6177:1: ( '}' )
            // InternalBomi.g:6178:2: '}'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__BORoleInteraction__Group_4__0"
    // InternalBomi.g:6188:1: rule__BORoleInteraction__Group_4__0 : rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1 ;
    public final void rule__BORoleInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6192:1: ( rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1 )
            // InternalBomi.g:6193:2: rule__BORoleInteraction__Group_4__0__Impl rule__BORoleInteraction__Group_4__1
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
    // InternalBomi.g:6200:1: rule__BORoleInteraction__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BORoleInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6204:1: ( ( 'purpose' ) )
            // InternalBomi.g:6205:1: ( 'purpose' )
            {
            // InternalBomi.g:6205:1: ( 'purpose' )
            // InternalBomi.g:6206:2: 'purpose'
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
    // InternalBomi.g:6215:1: rule__BORoleInteraction__Group_4__1 : rule__BORoleInteraction__Group_4__1__Impl ;
    public final void rule__BORoleInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6219:1: ( rule__BORoleInteraction__Group_4__1__Impl )
            // InternalBomi.g:6220:2: rule__BORoleInteraction__Group_4__1__Impl
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
    // InternalBomi.g:6226:1: rule__BORoleInteraction__Group_4__1__Impl : ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) ) ;
    public final void rule__BORoleInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6230:1: ( ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:6231:1: ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:6231:1: ( ( rule__BORoleInteraction__PurposeAssignment_4_1 ) )
            // InternalBomi.g:6232:2: ( rule__BORoleInteraction__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:6233:2: ( rule__BORoleInteraction__PurposeAssignment_4_1 )
            // InternalBomi.g:6233:3: rule__BORoleInteraction__PurposeAssignment_4_1
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
    // InternalBomi.g:6242:1: rule__BORoleInteraction__Group_5__0 : rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1 ;
    public final void rule__BORoleInteraction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6246:1: ( rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1 )
            // InternalBomi.g:6247:2: rule__BORoleInteraction__Group_5__0__Impl rule__BORoleInteraction__Group_5__1
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
    // InternalBomi.g:6254:1: rule__BORoleInteraction__Group_5__0__Impl : ( 'accessability' ) ;
    public final void rule__BORoleInteraction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6258:1: ( ( 'accessability' ) )
            // InternalBomi.g:6259:1: ( 'accessability' )
            {
            // InternalBomi.g:6259:1: ( 'accessability' )
            // InternalBomi.g:6260:2: 'accessability'
            {
             before(grammarAccess.getBORoleInteractionAccess().getAccessabilityKeyword_5_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalBomi.g:6269:1: rule__BORoleInteraction__Group_5__1 : rule__BORoleInteraction__Group_5__1__Impl ;
    public final void rule__BORoleInteraction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6273:1: ( rule__BORoleInteraction__Group_5__1__Impl )
            // InternalBomi.g:6274:2: rule__BORoleInteraction__Group_5__1__Impl
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
    // InternalBomi.g:6280:1: rule__BORoleInteraction__Group_5__1__Impl : ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) ) ;
    public final void rule__BORoleInteraction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6284:1: ( ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) ) )
            // InternalBomi.g:6285:1: ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) )
            {
            // InternalBomi.g:6285:1: ( ( rule__BORoleInteraction__AccessabilityAssignment_5_1 ) )
            // InternalBomi.g:6286:2: ( rule__BORoleInteraction__AccessabilityAssignment_5_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getAccessabilityAssignment_5_1()); 
            // InternalBomi.g:6287:2: ( rule__BORoleInteraction__AccessabilityAssignment_5_1 )
            // InternalBomi.g:6287:3: rule__BORoleInteraction__AccessabilityAssignment_5_1
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
    // InternalBomi.g:6296:1: rule__BORoleInteraction__Group_6__0 : rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1 ;
    public final void rule__BORoleInteraction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6300:1: ( rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1 )
            // InternalBomi.g:6301:2: rule__BORoleInteraction__Group_6__0__Impl rule__BORoleInteraction__Group_6__1
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
    // InternalBomi.g:6308:1: rule__BORoleInteraction__Group_6__0__Impl : ( 'stability' ) ;
    public final void rule__BORoleInteraction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6312:1: ( ( 'stability' ) )
            // InternalBomi.g:6313:1: ( 'stability' )
            {
            // InternalBomi.g:6313:1: ( 'stability' )
            // InternalBomi.g:6314:2: 'stability'
            {
             before(grammarAccess.getBORoleInteractionAccess().getStabilityKeyword_6_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalBomi.g:6323:1: rule__BORoleInteraction__Group_6__1 : rule__BORoleInteraction__Group_6__1__Impl ;
    public final void rule__BORoleInteraction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6327:1: ( rule__BORoleInteraction__Group_6__1__Impl )
            // InternalBomi.g:6328:2: rule__BORoleInteraction__Group_6__1__Impl
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
    // InternalBomi.g:6334:1: rule__BORoleInteraction__Group_6__1__Impl : ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) ) ;
    public final void rule__BORoleInteraction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6338:1: ( ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) ) )
            // InternalBomi.g:6339:1: ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) )
            {
            // InternalBomi.g:6339:1: ( ( rule__BORoleInteraction__StabilityAssignment_6_1 ) )
            // InternalBomi.g:6340:2: ( rule__BORoleInteraction__StabilityAssignment_6_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getStabilityAssignment_6_1()); 
            // InternalBomi.g:6341:2: ( rule__BORoleInteraction__StabilityAssignment_6_1 )
            // InternalBomi.g:6341:3: rule__BORoleInteraction__StabilityAssignment_6_1
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
    // InternalBomi.g:6350:1: rule__BORoleInteraction__Group_7__0 : rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1 ;
    public final void rule__BORoleInteraction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6354:1: ( rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1 )
            // InternalBomi.g:6355:2: rule__BORoleInteraction__Group_7__0__Impl rule__BORoleInteraction__Group_7__1
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
    // InternalBomi.g:6362:1: rule__BORoleInteraction__Group_7__0__Impl : ( 'criticality' ) ;
    public final void rule__BORoleInteraction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6366:1: ( ( 'criticality' ) )
            // InternalBomi.g:6367:1: ( 'criticality' )
            {
            // InternalBomi.g:6367:1: ( 'criticality' )
            // InternalBomi.g:6368:2: 'criticality'
            {
             before(grammarAccess.getBORoleInteractionAccess().getCriticalityKeyword_7_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalBomi.g:6377:1: rule__BORoleInteraction__Group_7__1 : rule__BORoleInteraction__Group_7__1__Impl ;
    public final void rule__BORoleInteraction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6381:1: ( rule__BORoleInteraction__Group_7__1__Impl )
            // InternalBomi.g:6382:2: rule__BORoleInteraction__Group_7__1__Impl
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
    // InternalBomi.g:6388:1: rule__BORoleInteraction__Group_7__1__Impl : ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) ) ;
    public final void rule__BORoleInteraction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6392:1: ( ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) ) )
            // InternalBomi.g:6393:1: ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) )
            {
            // InternalBomi.g:6393:1: ( ( rule__BORoleInteraction__CriticalityAssignment_7_1 ) )
            // InternalBomi.g:6394:2: ( rule__BORoleInteraction__CriticalityAssignment_7_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getCriticalityAssignment_7_1()); 
            // InternalBomi.g:6395:2: ( rule__BORoleInteraction__CriticalityAssignment_7_1 )
            // InternalBomi.g:6395:3: rule__BORoleInteraction__CriticalityAssignment_7_1
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
    // InternalBomi.g:6404:1: rule__BORoleInteraction__Group_8__0 : rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1 ;
    public final void rule__BORoleInteraction__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6408:1: ( rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1 )
            // InternalBomi.g:6409:2: rule__BORoleInteraction__Group_8__0__Impl rule__BORoleInteraction__Group_8__1
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
    // InternalBomi.g:6416:1: rule__BORoleInteraction__Group_8__0__Impl : ( 'fitForPurpose' ) ;
    public final void rule__BORoleInteraction__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6420:1: ( ( 'fitForPurpose' ) )
            // InternalBomi.g:6421:1: ( 'fitForPurpose' )
            {
            // InternalBomi.g:6421:1: ( 'fitForPurpose' )
            // InternalBomi.g:6422:2: 'fitForPurpose'
            {
             before(grammarAccess.getBORoleInteractionAccess().getFitForPurposeKeyword_8_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalBomi.g:6431:1: rule__BORoleInteraction__Group_8__1 : rule__BORoleInteraction__Group_8__1__Impl ;
    public final void rule__BORoleInteraction__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6435:1: ( rule__BORoleInteraction__Group_8__1__Impl )
            // InternalBomi.g:6436:2: rule__BORoleInteraction__Group_8__1__Impl
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
    // InternalBomi.g:6442:1: rule__BORoleInteraction__Group_8__1__Impl : ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) ) ;
    public final void rule__BORoleInteraction__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6446:1: ( ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) ) )
            // InternalBomi.g:6447:1: ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) )
            {
            // InternalBomi.g:6447:1: ( ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 ) )
            // InternalBomi.g:6448:2: ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getFitForPurposeAssignment_8_1()); 
            // InternalBomi.g:6449:2: ( rule__BORoleInteraction__FitForPurposeAssignment_8_1 )
            // InternalBomi.g:6449:3: rule__BORoleInteraction__FitForPurposeAssignment_8_1
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
    // InternalBomi.g:6458:1: rule__BORoleInteraction__Group_9__0 : rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1 ;
    public final void rule__BORoleInteraction__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6462:1: ( rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1 )
            // InternalBomi.g:6463:2: rule__BORoleInteraction__Group_9__0__Impl rule__BORoleInteraction__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBomi.g:6470:1: rule__BORoleInteraction__Group_9__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BORoleInteraction__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6474:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:6475:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:6475:1: ( 'boundaryObjects' )
            // InternalBomi.g:6476:2: 'boundaryObjects'
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsKeyword_9_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsKeyword_9_0()); 

            }


            }

        }
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
    // InternalBomi.g:6485:1: rule__BORoleInteraction__Group_9__1 : rule__BORoleInteraction__Group_9__1__Impl rule__BORoleInteraction__Group_9__2 ;
    public final void rule__BORoleInteraction__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6489:1: ( rule__BORoleInteraction__Group_9__1__Impl rule__BORoleInteraction__Group_9__2 )
            // InternalBomi.g:6490:2: rule__BORoleInteraction__Group_9__1__Impl rule__BORoleInteraction__Group_9__2
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9__2();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:6497:1: rule__BORoleInteraction__Group_9__1__Impl : ( '(' ) ;
    public final void rule__BORoleInteraction__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6501:1: ( ( '(' ) )
            // InternalBomi.g:6502:1: ( '(' )
            {
            // InternalBomi.g:6502:1: ( '(' )
            // InternalBomi.g:6503:2: '('
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BORoleInteraction__Group_9__2"
    // InternalBomi.g:6512:1: rule__BORoleInteraction__Group_9__2 : rule__BORoleInteraction__Group_9__2__Impl rule__BORoleInteraction__Group_9__3 ;
    public final void rule__BORoleInteraction__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6516:1: ( rule__BORoleInteraction__Group_9__2__Impl rule__BORoleInteraction__Group_9__3 )
            // InternalBomi.g:6517:2: rule__BORoleInteraction__Group_9__2__Impl rule__BORoleInteraction__Group_9__3
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__2"


    // $ANTLR start "rule__BORoleInteraction__Group_9__2__Impl"
    // InternalBomi.g:6524:1: rule__BORoleInteraction__Group_9__2__Impl : ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_2 ) ) ;
    public final void rule__BORoleInteraction__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6528:1: ( ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_2 ) ) )
            // InternalBomi.g:6529:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_2 ) )
            {
            // InternalBomi.g:6529:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_2 ) )
            // InternalBomi.g:6530:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_9_2()); 
            // InternalBomi.g:6531:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_2 )
            // InternalBomi.g:6531:3: rule__BORoleInteraction__BoundaryObjectsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__BoundaryObjectsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__2__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_9__3"
    // InternalBomi.g:6539:1: rule__BORoleInteraction__Group_9__3 : rule__BORoleInteraction__Group_9__3__Impl rule__BORoleInteraction__Group_9__4 ;
    public final void rule__BORoleInteraction__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6543:1: ( rule__BORoleInteraction__Group_9__3__Impl rule__BORoleInteraction__Group_9__4 )
            // InternalBomi.g:6544:2: rule__BORoleInteraction__Group_9__3__Impl rule__BORoleInteraction__Group_9__4
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__3"


    // $ANTLR start "rule__BORoleInteraction__Group_9__3__Impl"
    // InternalBomi.g:6551:1: rule__BORoleInteraction__Group_9__3__Impl : ( ( rule__BORoleInteraction__Group_9_3__0 )* ) ;
    public final void rule__BORoleInteraction__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6555:1: ( ( ( rule__BORoleInteraction__Group_9_3__0 )* ) )
            // InternalBomi.g:6556:1: ( ( rule__BORoleInteraction__Group_9_3__0 )* )
            {
            // InternalBomi.g:6556:1: ( ( rule__BORoleInteraction__Group_9_3__0 )* )
            // InternalBomi.g:6557:2: ( rule__BORoleInteraction__Group_9_3__0 )*
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_9_3()); 
            // InternalBomi.g:6558:2: ( rule__BORoleInteraction__Group_9_3__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==36) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalBomi.g:6558:3: rule__BORoleInteraction__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BORoleInteraction__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getBORoleInteractionAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__3__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_9__4"
    // InternalBomi.g:6566:1: rule__BORoleInteraction__Group_9__4 : rule__BORoleInteraction__Group_9__4__Impl ;
    public final void rule__BORoleInteraction__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6570:1: ( rule__BORoleInteraction__Group_9__4__Impl )
            // InternalBomi.g:6571:2: rule__BORoleInteraction__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__4"


    // $ANTLR start "rule__BORoleInteraction__Group_9__4__Impl"
    // InternalBomi.g:6577:1: rule__BORoleInteraction__Group_9__4__Impl : ( ')' ) ;
    public final void rule__BORoleInteraction__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6581:1: ( ( ')' ) )
            // InternalBomi.g:6582:1: ( ')' )
            {
            // InternalBomi.g:6582:1: ( ')' )
            // InternalBomi.g:6583:2: ')'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_9_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9__4__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_9_3__0"
    // InternalBomi.g:6593:1: rule__BORoleInteraction__Group_9_3__0 : rule__BORoleInteraction__Group_9_3__0__Impl rule__BORoleInteraction__Group_9_3__1 ;
    public final void rule__BORoleInteraction__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6597:1: ( rule__BORoleInteraction__Group_9_3__0__Impl rule__BORoleInteraction__Group_9_3__1 )
            // InternalBomi.g:6598:2: rule__BORoleInteraction__Group_9_3__0__Impl rule__BORoleInteraction__Group_9_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9_3__0"


    // $ANTLR start "rule__BORoleInteraction__Group_9_3__0__Impl"
    // InternalBomi.g:6605:1: rule__BORoleInteraction__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__BORoleInteraction__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6609:1: ( ( ',' ) )
            // InternalBomi.g:6610:1: ( ',' )
            {
            // InternalBomi.g:6610:1: ( ',' )
            // InternalBomi.g:6611:2: ','
            {
             before(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_9_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9_3__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_9_3__1"
    // InternalBomi.g:6620:1: rule__BORoleInteraction__Group_9_3__1 : rule__BORoleInteraction__Group_9_3__1__Impl ;
    public final void rule__BORoleInteraction__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6624:1: ( rule__BORoleInteraction__Group_9_3__1__Impl )
            // InternalBomi.g:6625:2: rule__BORoleInteraction__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9_3__1"


    // $ANTLR start "rule__BORoleInteraction__Group_9_3__1__Impl"
    // InternalBomi.g:6631:1: rule__BORoleInteraction__Group_9_3__1__Impl : ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1 ) ) ;
    public final void rule__BORoleInteraction__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6635:1: ( ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1 ) ) )
            // InternalBomi.g:6636:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1 ) )
            {
            // InternalBomi.g:6636:1: ( ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1 ) )
            // InternalBomi.g:6637:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_9_3_1()); 
            // InternalBomi.g:6638:2: ( rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1 )
            // InternalBomi.g:6638:3: rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_9_3__1__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_10__0"
    // InternalBomi.g:6647:1: rule__BORoleInteraction__Group_10__0 : rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1 ;
    public final void rule__BORoleInteraction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6651:1: ( rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1 )
            // InternalBomi.g:6652:2: rule__BORoleInteraction__Group_10__0__Impl rule__BORoleInteraction__Group_10__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBomi.g:6659:1: rule__BORoleInteraction__Group_10__0__Impl : ( 'roles' ) ;
    public final void rule__BORoleInteraction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6663:1: ( ( 'roles' ) )
            // InternalBomi.g:6664:1: ( 'roles' )
            {
            // InternalBomi.g:6664:1: ( 'roles' )
            // InternalBomi.g:6665:2: 'roles'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesKeyword_10_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRolesKeyword_10_0()); 

            }


            }

        }
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
    // InternalBomi.g:6674:1: rule__BORoleInteraction__Group_10__1 : rule__BORoleInteraction__Group_10__1__Impl rule__BORoleInteraction__Group_10__2 ;
    public final void rule__BORoleInteraction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6678:1: ( rule__BORoleInteraction__Group_10__1__Impl rule__BORoleInteraction__Group_10__2 )
            // InternalBomi.g:6679:2: rule__BORoleInteraction__Group_10__1__Impl rule__BORoleInteraction__Group_10__2
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10__2();

            state._fsp--;


            }

        }
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
    // InternalBomi.g:6686:1: rule__BORoleInteraction__Group_10__1__Impl : ( '(' ) ;
    public final void rule__BORoleInteraction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6690:1: ( ( '(' ) )
            // InternalBomi.g:6691:1: ( '(' )
            {
            // InternalBomi.g:6691:1: ( '(' )
            // InternalBomi.g:6692:2: '('
            {
             before(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BORoleInteraction__Group_10__2"
    // InternalBomi.g:6701:1: rule__BORoleInteraction__Group_10__2 : rule__BORoleInteraction__Group_10__2__Impl rule__BORoleInteraction__Group_10__3 ;
    public final void rule__BORoleInteraction__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6705:1: ( rule__BORoleInteraction__Group_10__2__Impl rule__BORoleInteraction__Group_10__3 )
            // InternalBomi.g:6706:2: rule__BORoleInteraction__Group_10__2__Impl rule__BORoleInteraction__Group_10__3
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__2"


    // $ANTLR start "rule__BORoleInteraction__Group_10__2__Impl"
    // InternalBomi.g:6713:1: rule__BORoleInteraction__Group_10__2__Impl : ( ( rule__BORoleInteraction__RolesAssignment_10_2 ) ) ;
    public final void rule__BORoleInteraction__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6717:1: ( ( ( rule__BORoleInteraction__RolesAssignment_10_2 ) ) )
            // InternalBomi.g:6718:1: ( ( rule__BORoleInteraction__RolesAssignment_10_2 ) )
            {
            // InternalBomi.g:6718:1: ( ( rule__BORoleInteraction__RolesAssignment_10_2 ) )
            // InternalBomi.g:6719:2: ( rule__BORoleInteraction__RolesAssignment_10_2 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_10_2()); 
            // InternalBomi.g:6720:2: ( rule__BORoleInteraction__RolesAssignment_10_2 )
            // InternalBomi.g:6720:3: rule__BORoleInteraction__RolesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__RolesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__2__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_10__3"
    // InternalBomi.g:6728:1: rule__BORoleInteraction__Group_10__3 : rule__BORoleInteraction__Group_10__3__Impl rule__BORoleInteraction__Group_10__4 ;
    public final void rule__BORoleInteraction__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6732:1: ( rule__BORoleInteraction__Group_10__3__Impl rule__BORoleInteraction__Group_10__4 )
            // InternalBomi.g:6733:2: rule__BORoleInteraction__Group_10__3__Impl rule__BORoleInteraction__Group_10__4
            {
            pushFollow(FOLLOW_25);
            rule__BORoleInteraction__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__3"


    // $ANTLR start "rule__BORoleInteraction__Group_10__3__Impl"
    // InternalBomi.g:6740:1: rule__BORoleInteraction__Group_10__3__Impl : ( ( rule__BORoleInteraction__Group_10_3__0 )* ) ;
    public final void rule__BORoleInteraction__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6744:1: ( ( ( rule__BORoleInteraction__Group_10_3__0 )* ) )
            // InternalBomi.g:6745:1: ( ( rule__BORoleInteraction__Group_10_3__0 )* )
            {
            // InternalBomi.g:6745:1: ( ( rule__BORoleInteraction__Group_10_3__0 )* )
            // InternalBomi.g:6746:2: ( rule__BORoleInteraction__Group_10_3__0 )*
            {
             before(grammarAccess.getBORoleInteractionAccess().getGroup_10_3()); 
            // InternalBomi.g:6747:2: ( rule__BORoleInteraction__Group_10_3__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==36) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalBomi.g:6747:3: rule__BORoleInteraction__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BORoleInteraction__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getBORoleInteractionAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__3__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_10__4"
    // InternalBomi.g:6755:1: rule__BORoleInteraction__Group_10__4 : rule__BORoleInteraction__Group_10__4__Impl ;
    public final void rule__BORoleInteraction__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6759:1: ( rule__BORoleInteraction__Group_10__4__Impl )
            // InternalBomi.g:6760:2: rule__BORoleInteraction__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__4"


    // $ANTLR start "rule__BORoleInteraction__Group_10__4__Impl"
    // InternalBomi.g:6766:1: rule__BORoleInteraction__Group_10__4__Impl : ( ')' ) ;
    public final void rule__BORoleInteraction__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6770:1: ( ( ')' ) )
            // InternalBomi.g:6771:1: ( ')' )
            {
            // InternalBomi.g:6771:1: ( ')' )
            // InternalBomi.g:6772:2: ')'
            {
             before(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_10_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10__4__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_10_3__0"
    // InternalBomi.g:6782:1: rule__BORoleInteraction__Group_10_3__0 : rule__BORoleInteraction__Group_10_3__0__Impl rule__BORoleInteraction__Group_10_3__1 ;
    public final void rule__BORoleInteraction__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6786:1: ( rule__BORoleInteraction__Group_10_3__0__Impl rule__BORoleInteraction__Group_10_3__1 )
            // InternalBomi.g:6787:2: rule__BORoleInteraction__Group_10_3__0__Impl rule__BORoleInteraction__Group_10_3__1
            {
            pushFollow(FOLLOW_16);
            rule__BORoleInteraction__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10_3__0"


    // $ANTLR start "rule__BORoleInteraction__Group_10_3__0__Impl"
    // InternalBomi.g:6794:1: rule__BORoleInteraction__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__BORoleInteraction__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6798:1: ( ( ',' ) )
            // InternalBomi.g:6799:1: ( ',' )
            {
            // InternalBomi.g:6799:1: ( ',' )
            // InternalBomi.g:6800:2: ','
            {
             before(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_10_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBORoleInteractionAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10_3__0__Impl"


    // $ANTLR start "rule__BORoleInteraction__Group_10_3__1"
    // InternalBomi.g:6809:1: rule__BORoleInteraction__Group_10_3__1 : rule__BORoleInteraction__Group_10_3__1__Impl ;
    public final void rule__BORoleInteraction__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6813:1: ( rule__BORoleInteraction__Group_10_3__1__Impl )
            // InternalBomi.g:6814:2: rule__BORoleInteraction__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10_3__1"


    // $ANTLR start "rule__BORoleInteraction__Group_10_3__1__Impl"
    // InternalBomi.g:6820:1: rule__BORoleInteraction__Group_10_3__1__Impl : ( ( rule__BORoleInteraction__RolesAssignment_10_3_1 ) ) ;
    public final void rule__BORoleInteraction__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6824:1: ( ( ( rule__BORoleInteraction__RolesAssignment_10_3_1 ) ) )
            // InternalBomi.g:6825:1: ( ( rule__BORoleInteraction__RolesAssignment_10_3_1 ) )
            {
            // InternalBomi.g:6825:1: ( ( rule__BORoleInteraction__RolesAssignment_10_3_1 ) )
            // InternalBomi.g:6826:2: ( rule__BORoleInteraction__RolesAssignment_10_3_1 )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_10_3_1()); 
            // InternalBomi.g:6827:2: ( rule__BORoleInteraction__RolesAssignment_10_3_1 )
            // InternalBomi.g:6827:3: rule__BORoleInteraction__RolesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BORoleInteraction__RolesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__Group_10_3__1__Impl"


    // $ANTLR start "rule__BOTeamGovernance__Group__0"
    // InternalBomi.g:6836:1: rule__BOTeamGovernance__Group__0 : rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1 ;
    public final void rule__BOTeamGovernance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6840:1: ( rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1 )
            // InternalBomi.g:6841:2: rule__BOTeamGovernance__Group__0__Impl rule__BOTeamGovernance__Group__1
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
    // InternalBomi.g:6848:1: rule__BOTeamGovernance__Group__0__Impl : ( () ) ;
    public final void rule__BOTeamGovernance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6852:1: ( ( () ) )
            // InternalBomi.g:6853:1: ( () )
            {
            // InternalBomi.g:6853:1: ( () )
            // InternalBomi.g:6854:2: ()
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceAction_0()); 
            // InternalBomi.g:6855:2: ()
            // InternalBomi.g:6855:3: 
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
    // InternalBomi.g:6863:1: rule__BOTeamGovernance__Group__1 : rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2 ;
    public final void rule__BOTeamGovernance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6867:1: ( rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2 )
            // InternalBomi.g:6868:2: rule__BOTeamGovernance__Group__1__Impl rule__BOTeamGovernance__Group__2
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
    // InternalBomi.g:6875:1: rule__BOTeamGovernance__Group__1__Impl : ( 'BOTeamGovernance' ) ;
    public final void rule__BOTeamGovernance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6879:1: ( ( 'BOTeamGovernance' ) )
            // InternalBomi.g:6880:1: ( 'BOTeamGovernance' )
            {
            // InternalBomi.g:6880:1: ( 'BOTeamGovernance' )
            // InternalBomi.g:6881:2: 'BOTeamGovernance'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceKeyword_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalBomi.g:6890:1: rule__BOTeamGovernance__Group__2 : rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3 ;
    public final void rule__BOTeamGovernance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6894:1: ( rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3 )
            // InternalBomi.g:6895:2: rule__BOTeamGovernance__Group__2__Impl rule__BOTeamGovernance__Group__3
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
    // InternalBomi.g:6902:1: rule__BOTeamGovernance__Group__2__Impl : ( ( rule__BOTeamGovernance__NameAssignment_2 ) ) ;
    public final void rule__BOTeamGovernance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6906:1: ( ( ( rule__BOTeamGovernance__NameAssignment_2 ) ) )
            // InternalBomi.g:6907:1: ( ( rule__BOTeamGovernance__NameAssignment_2 ) )
            {
            // InternalBomi.g:6907:1: ( ( rule__BOTeamGovernance__NameAssignment_2 ) )
            // InternalBomi.g:6908:2: ( rule__BOTeamGovernance__NameAssignment_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getNameAssignment_2()); 
            // InternalBomi.g:6909:2: ( rule__BOTeamGovernance__NameAssignment_2 )
            // InternalBomi.g:6909:3: rule__BOTeamGovernance__NameAssignment_2
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
    // InternalBomi.g:6917:1: rule__BOTeamGovernance__Group__3 : rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4 ;
    public final void rule__BOTeamGovernance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6921:1: ( rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4 )
            // InternalBomi.g:6922:2: rule__BOTeamGovernance__Group__3__Impl rule__BOTeamGovernance__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalBomi.g:6929:1: rule__BOTeamGovernance__Group__3__Impl : ( '{' ) ;
    public final void rule__BOTeamGovernance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6933:1: ( ( '{' ) )
            // InternalBomi.g:6934:1: ( '{' )
            {
            // InternalBomi.g:6934:1: ( '{' )
            // InternalBomi.g:6935:2: '{'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBomi.g:6944:1: rule__BOTeamGovernance__Group__4 : rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5 ;
    public final void rule__BOTeamGovernance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6948:1: ( rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5 )
            // InternalBomi.g:6949:2: rule__BOTeamGovernance__Group__4__Impl rule__BOTeamGovernance__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalBomi.g:6956:1: rule__BOTeamGovernance__Group__4__Impl : ( ( rule__BOTeamGovernance__Group_4__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6960:1: ( ( ( rule__BOTeamGovernance__Group_4__0 )? ) )
            // InternalBomi.g:6961:1: ( ( rule__BOTeamGovernance__Group_4__0 )? )
            {
            // InternalBomi.g:6961:1: ( ( rule__BOTeamGovernance__Group_4__0 )? )
            // InternalBomi.g:6962:2: ( rule__BOTeamGovernance__Group_4__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_4()); 
            // InternalBomi.g:6963:2: ( rule__BOTeamGovernance__Group_4__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalBomi.g:6963:3: rule__BOTeamGovernance__Group_4__0
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
    // InternalBomi.g:6971:1: rule__BOTeamGovernance__Group__5 : rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6 ;
    public final void rule__BOTeamGovernance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6975:1: ( rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6 )
            // InternalBomi.g:6976:2: rule__BOTeamGovernance__Group__5__Impl rule__BOTeamGovernance__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalBomi.g:6983:1: rule__BOTeamGovernance__Group__5__Impl : ( ( rule__BOTeamGovernance__Group_5__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:6987:1: ( ( ( rule__BOTeamGovernance__Group_5__0 )? ) )
            // InternalBomi.g:6988:1: ( ( rule__BOTeamGovernance__Group_5__0 )? )
            {
            // InternalBomi.g:6988:1: ( ( rule__BOTeamGovernance__Group_5__0 )? )
            // InternalBomi.g:6989:2: ( rule__BOTeamGovernance__Group_5__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_5()); 
            // InternalBomi.g:6990:2: ( rule__BOTeamGovernance__Group_5__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==76) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBomi.g:6990:3: rule__BOTeamGovernance__Group_5__0
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
    // InternalBomi.g:6998:1: rule__BOTeamGovernance__Group__6 : rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7 ;
    public final void rule__BOTeamGovernance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7002:1: ( rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7 )
            // InternalBomi.g:7003:2: rule__BOTeamGovernance__Group__6__Impl rule__BOTeamGovernance__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalBomi.g:7010:1: rule__BOTeamGovernance__Group__6__Impl : ( ( rule__BOTeamGovernance__Group_6__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7014:1: ( ( ( rule__BOTeamGovernance__Group_6__0 )? ) )
            // InternalBomi.g:7015:1: ( ( rule__BOTeamGovernance__Group_6__0 )? )
            {
            // InternalBomi.g:7015:1: ( ( rule__BOTeamGovernance__Group_6__0 )? )
            // InternalBomi.g:7016:2: ( rule__BOTeamGovernance__Group_6__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_6()); 
            // InternalBomi.g:7017:2: ( rule__BOTeamGovernance__Group_6__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==77) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBomi.g:7017:3: rule__BOTeamGovernance__Group_6__0
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
    // InternalBomi.g:7025:1: rule__BOTeamGovernance__Group__7 : rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8 ;
    public final void rule__BOTeamGovernance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7029:1: ( rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8 )
            // InternalBomi.g:7030:2: rule__BOTeamGovernance__Group__7__Impl rule__BOTeamGovernance__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalBomi.g:7037:1: rule__BOTeamGovernance__Group__7__Impl : ( ( rule__BOTeamGovernance__Group_7__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7041:1: ( ( ( rule__BOTeamGovernance__Group_7__0 )? ) )
            // InternalBomi.g:7042:1: ( ( rule__BOTeamGovernance__Group_7__0 )? )
            {
            // InternalBomi.g:7042:1: ( ( rule__BOTeamGovernance__Group_7__0 )? )
            // InternalBomi.g:7043:2: ( rule__BOTeamGovernance__Group_7__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_7()); 
            // InternalBomi.g:7044:2: ( rule__BOTeamGovernance__Group_7__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalBomi.g:7044:3: rule__BOTeamGovernance__Group_7__0
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
    // InternalBomi.g:7052:1: rule__BOTeamGovernance__Group__8 : rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9 ;
    public final void rule__BOTeamGovernance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7056:1: ( rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9 )
            // InternalBomi.g:7057:2: rule__BOTeamGovernance__Group__8__Impl rule__BOTeamGovernance__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalBomi.g:7064:1: rule__BOTeamGovernance__Group__8__Impl : ( ( rule__BOTeamGovernance__Group_8__0 )? ) ;
    public final void rule__BOTeamGovernance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7068:1: ( ( ( rule__BOTeamGovernance__Group_8__0 )? ) )
            // InternalBomi.g:7069:1: ( ( rule__BOTeamGovernance__Group_8__0 )? )
            {
            // InternalBomi.g:7069:1: ( ( rule__BOTeamGovernance__Group_8__0 )? )
            // InternalBomi.g:7070:2: ( rule__BOTeamGovernance__Group_8__0 )?
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_8()); 
            // InternalBomi.g:7071:2: ( rule__BOTeamGovernance__Group_8__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==33) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalBomi.g:7071:3: rule__BOTeamGovernance__Group_8__0
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
    // InternalBomi.g:7079:1: rule__BOTeamGovernance__Group__9 : rule__BOTeamGovernance__Group__9__Impl ;
    public final void rule__BOTeamGovernance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7083:1: ( rule__BOTeamGovernance__Group__9__Impl )
            // InternalBomi.g:7084:2: rule__BOTeamGovernance__Group__9__Impl
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
    // InternalBomi.g:7090:1: rule__BOTeamGovernance__Group__9__Impl : ( '}' ) ;
    public final void rule__BOTeamGovernance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7094:1: ( ( '}' ) )
            // InternalBomi.g:7095:1: ( '}' )
            {
            // InternalBomi.g:7095:1: ( '}' )
            // InternalBomi.g:7096:2: '}'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBomi.g:7106:1: rule__BOTeamGovernance__Group_4__0 : rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1 ;
    public final void rule__BOTeamGovernance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7110:1: ( rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1 )
            // InternalBomi.g:7111:2: rule__BOTeamGovernance__Group_4__0__Impl rule__BOTeamGovernance__Group_4__1
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
    // InternalBomi.g:7118:1: rule__BOTeamGovernance__Group_4__0__Impl : ( 'purpose' ) ;
    public final void rule__BOTeamGovernance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7122:1: ( ( 'purpose' ) )
            // InternalBomi.g:7123:1: ( 'purpose' )
            {
            // InternalBomi.g:7123:1: ( 'purpose' )
            // InternalBomi.g:7124:2: 'purpose'
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
    // InternalBomi.g:7133:1: rule__BOTeamGovernance__Group_4__1 : rule__BOTeamGovernance__Group_4__1__Impl ;
    public final void rule__BOTeamGovernance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7137:1: ( rule__BOTeamGovernance__Group_4__1__Impl )
            // InternalBomi.g:7138:2: rule__BOTeamGovernance__Group_4__1__Impl
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
    // InternalBomi.g:7144:1: rule__BOTeamGovernance__Group_4__1__Impl : ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7148:1: ( ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) ) )
            // InternalBomi.g:7149:1: ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) )
            {
            // InternalBomi.g:7149:1: ( ( rule__BOTeamGovernance__PurposeAssignment_4_1 ) )
            // InternalBomi.g:7150:2: ( rule__BOTeamGovernance__PurposeAssignment_4_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getPurposeAssignment_4_1()); 
            // InternalBomi.g:7151:2: ( rule__BOTeamGovernance__PurposeAssignment_4_1 )
            // InternalBomi.g:7151:3: rule__BOTeamGovernance__PurposeAssignment_4_1
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
    // InternalBomi.g:7160:1: rule__BOTeamGovernance__Group_5__0 : rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1 ;
    public final void rule__BOTeamGovernance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7164:1: ( rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1 )
            // InternalBomi.g:7165:2: rule__BOTeamGovernance__Group_5__0__Impl rule__BOTeamGovernance__Group_5__1
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
    // InternalBomi.g:7172:1: rule__BOTeamGovernance__Group_5__0__Impl : ( 'coordinationMechanism' ) ;
    public final void rule__BOTeamGovernance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7176:1: ( ( 'coordinationMechanism' ) )
            // InternalBomi.g:7177:1: ( 'coordinationMechanism' )
            {
            // InternalBomi.g:7177:1: ( 'coordinationMechanism' )
            // InternalBomi.g:7178:2: 'coordinationMechanism'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismKeyword_5_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalBomi.g:7187:1: rule__BOTeamGovernance__Group_5__1 : rule__BOTeamGovernance__Group_5__1__Impl ;
    public final void rule__BOTeamGovernance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7191:1: ( rule__BOTeamGovernance__Group_5__1__Impl )
            // InternalBomi.g:7192:2: rule__BOTeamGovernance__Group_5__1__Impl
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
    // InternalBomi.g:7198:1: rule__BOTeamGovernance__Group_5__1__Impl : ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7202:1: ( ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) ) )
            // InternalBomi.g:7203:1: ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) )
            {
            // InternalBomi.g:7203:1: ( ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 ) )
            // InternalBomi.g:7204:2: ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismAssignment_5_1()); 
            // InternalBomi.g:7205:2: ( rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 )
            // InternalBomi.g:7205:3: rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1
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
    // InternalBomi.g:7214:1: rule__BOTeamGovernance__Group_6__0 : rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1 ;
    public final void rule__BOTeamGovernance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7218:1: ( rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1 )
            // InternalBomi.g:7219:2: rule__BOTeamGovernance__Group_6__0__Impl rule__BOTeamGovernance__Group_6__1
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
    // InternalBomi.g:7226:1: rule__BOTeamGovernance__Group_6__0__Impl : ( 'frequencyOfCoordination' ) ;
    public final void rule__BOTeamGovernance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7230:1: ( ( 'frequencyOfCoordination' ) )
            // InternalBomi.g:7231:1: ( 'frequencyOfCoordination' )
            {
            // InternalBomi.g:7231:1: ( 'frequencyOfCoordination' )
            // InternalBomi.g:7232:2: 'frequencyOfCoordination'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationKeyword_6_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalBomi.g:7241:1: rule__BOTeamGovernance__Group_6__1 : rule__BOTeamGovernance__Group_6__1__Impl ;
    public final void rule__BOTeamGovernance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7245:1: ( rule__BOTeamGovernance__Group_6__1__Impl )
            // InternalBomi.g:7246:2: rule__BOTeamGovernance__Group_6__1__Impl
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
    // InternalBomi.g:7252:1: rule__BOTeamGovernance__Group_6__1__Impl : ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7256:1: ( ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) ) )
            // InternalBomi.g:7257:1: ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) )
            {
            // InternalBomi.g:7257:1: ( ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 ) )
            // InternalBomi.g:7258:2: ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationAssignment_6_1()); 
            // InternalBomi.g:7259:2: ( rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 )
            // InternalBomi.g:7259:3: rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1
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
    // InternalBomi.g:7268:1: rule__BOTeamGovernance__Group_7__0 : rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1 ;
    public final void rule__BOTeamGovernance__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7272:1: ( rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1 )
            // InternalBomi.g:7273:2: rule__BOTeamGovernance__Group_7__0__Impl rule__BOTeamGovernance__Group_7__1
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
    // InternalBomi.g:7280:1: rule__BOTeamGovernance__Group_7__0__Impl : ( 'governanceTeams' ) ;
    public final void rule__BOTeamGovernance__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7284:1: ( ( 'governanceTeams' ) )
            // InternalBomi.g:7285:1: ( 'governanceTeams' )
            {
            // InternalBomi.g:7285:1: ( 'governanceTeams' )
            // InternalBomi.g:7286:2: 'governanceTeams'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBomi.g:7295:1: rule__BOTeamGovernance__Group_7__1 : rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2 ;
    public final void rule__BOTeamGovernance__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7299:1: ( rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2 )
            // InternalBomi.g:7300:2: rule__BOTeamGovernance__Group_7__1__Impl rule__BOTeamGovernance__Group_7__2
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
    // InternalBomi.g:7307:1: rule__BOTeamGovernance__Group_7__1__Impl : ( '(' ) ;
    public final void rule__BOTeamGovernance__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7311:1: ( ( '(' ) )
            // InternalBomi.g:7312:1: ( '(' )
            {
            // InternalBomi.g:7312:1: ( '(' )
            // InternalBomi.g:7313:2: '('
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:7322:1: rule__BOTeamGovernance__Group_7__2 : rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3 ;
    public final void rule__BOTeamGovernance__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7326:1: ( rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3 )
            // InternalBomi.g:7327:2: rule__BOTeamGovernance__Group_7__2__Impl rule__BOTeamGovernance__Group_7__3
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
    // InternalBomi.g:7334:1: rule__BOTeamGovernance__Group_7__2__Impl : ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) ) ;
    public final void rule__BOTeamGovernance__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7338:1: ( ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) ) )
            // InternalBomi.g:7339:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) )
            {
            // InternalBomi.g:7339:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 ) )
            // InternalBomi.g:7340:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_7_2()); 
            // InternalBomi.g:7341:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 )
            // InternalBomi.g:7341:3: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2
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
    // InternalBomi.g:7349:1: rule__BOTeamGovernance__Group_7__3 : rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4 ;
    public final void rule__BOTeamGovernance__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7353:1: ( rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4 )
            // InternalBomi.g:7354:2: rule__BOTeamGovernance__Group_7__3__Impl rule__BOTeamGovernance__Group_7__4
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
    // InternalBomi.g:7361:1: rule__BOTeamGovernance__Group_7__3__Impl : ( ( rule__BOTeamGovernance__Group_7_3__0 )* ) ;
    public final void rule__BOTeamGovernance__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7365:1: ( ( ( rule__BOTeamGovernance__Group_7_3__0 )* ) )
            // InternalBomi.g:7366:1: ( ( rule__BOTeamGovernance__Group_7_3__0 )* )
            {
            // InternalBomi.g:7366:1: ( ( rule__BOTeamGovernance__Group_7_3__0 )* )
            // InternalBomi.g:7367:2: ( rule__BOTeamGovernance__Group_7_3__0 )*
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_7_3()); 
            // InternalBomi.g:7368:2: ( rule__BOTeamGovernance__Group_7_3__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==36) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalBomi.g:7368:3: rule__BOTeamGovernance__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOTeamGovernance__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalBomi.g:7376:1: rule__BOTeamGovernance__Group_7__4 : rule__BOTeamGovernance__Group_7__4__Impl ;
    public final void rule__BOTeamGovernance__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7380:1: ( rule__BOTeamGovernance__Group_7__4__Impl )
            // InternalBomi.g:7381:2: rule__BOTeamGovernance__Group_7__4__Impl
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
    // InternalBomi.g:7387:1: rule__BOTeamGovernance__Group_7__4__Impl : ( ')' ) ;
    public final void rule__BOTeamGovernance__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7391:1: ( ( ')' ) )
            // InternalBomi.g:7392:1: ( ')' )
            {
            // InternalBomi.g:7392:1: ( ')' )
            // InternalBomi.g:7393:2: ')'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_7_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:7403:1: rule__BOTeamGovernance__Group_7_3__0 : rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1 ;
    public final void rule__BOTeamGovernance__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7407:1: ( rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1 )
            // InternalBomi.g:7408:2: rule__BOTeamGovernance__Group_7_3__0__Impl rule__BOTeamGovernance__Group_7_3__1
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
    // InternalBomi.g:7415:1: rule__BOTeamGovernance__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BOTeamGovernance__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7419:1: ( ( ',' ) )
            // InternalBomi.g:7420:1: ( ',' )
            {
            // InternalBomi.g:7420:1: ( ',' )
            // InternalBomi.g:7421:2: ','
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_7_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:7430:1: rule__BOTeamGovernance__Group_7_3__1 : rule__BOTeamGovernance__Group_7_3__1__Impl ;
    public final void rule__BOTeamGovernance__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7434:1: ( rule__BOTeamGovernance__Group_7_3__1__Impl )
            // InternalBomi.g:7435:2: rule__BOTeamGovernance__Group_7_3__1__Impl
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
    // InternalBomi.g:7441:1: rule__BOTeamGovernance__Group_7_3__1__Impl : ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7445:1: ( ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) ) )
            // InternalBomi.g:7446:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) )
            {
            // InternalBomi.g:7446:1: ( ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 ) )
            // InternalBomi.g:7447:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsAssignment_7_3_1()); 
            // InternalBomi.g:7448:2: ( rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 )
            // InternalBomi.g:7448:3: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1
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
    // InternalBomi.g:7457:1: rule__BOTeamGovernance__Group_8__0 : rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1 ;
    public final void rule__BOTeamGovernance__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7461:1: ( rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1 )
            // InternalBomi.g:7462:2: rule__BOTeamGovernance__Group_8__0__Impl rule__BOTeamGovernance__Group_8__1
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
    // InternalBomi.g:7469:1: rule__BOTeamGovernance__Group_8__0__Impl : ( 'boundaryObjects' ) ;
    public final void rule__BOTeamGovernance__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7473:1: ( ( 'boundaryObjects' ) )
            // InternalBomi.g:7474:1: ( 'boundaryObjects' )
            {
            // InternalBomi.g:7474:1: ( 'boundaryObjects' )
            // InternalBomi.g:7475:2: 'boundaryObjects'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsKeyword_8_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBomi.g:7484:1: rule__BOTeamGovernance__Group_8__1 : rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2 ;
    public final void rule__BOTeamGovernance__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7488:1: ( rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2 )
            // InternalBomi.g:7489:2: rule__BOTeamGovernance__Group_8__1__Impl rule__BOTeamGovernance__Group_8__2
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
    // InternalBomi.g:7496:1: rule__BOTeamGovernance__Group_8__1__Impl : ( '(' ) ;
    public final void rule__BOTeamGovernance__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7500:1: ( ( '(' ) )
            // InternalBomi.g:7501:1: ( '(' )
            {
            // InternalBomi.g:7501:1: ( '(' )
            // InternalBomi.g:7502:2: '('
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBomi.g:7511:1: rule__BOTeamGovernance__Group_8__2 : rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3 ;
    public final void rule__BOTeamGovernance__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7515:1: ( rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3 )
            // InternalBomi.g:7516:2: rule__BOTeamGovernance__Group_8__2__Impl rule__BOTeamGovernance__Group_8__3
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
    // InternalBomi.g:7523:1: rule__BOTeamGovernance__Group_8__2__Impl : ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) ) ;
    public final void rule__BOTeamGovernance__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7527:1: ( ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) ) )
            // InternalBomi.g:7528:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) )
            {
            // InternalBomi.g:7528:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 ) )
            // InternalBomi.g:7529:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_8_2()); 
            // InternalBomi.g:7530:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 )
            // InternalBomi.g:7530:3: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2
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
    // InternalBomi.g:7538:1: rule__BOTeamGovernance__Group_8__3 : rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4 ;
    public final void rule__BOTeamGovernance__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7542:1: ( rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4 )
            // InternalBomi.g:7543:2: rule__BOTeamGovernance__Group_8__3__Impl rule__BOTeamGovernance__Group_8__4
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
    // InternalBomi.g:7550:1: rule__BOTeamGovernance__Group_8__3__Impl : ( ( rule__BOTeamGovernance__Group_8_3__0 )* ) ;
    public final void rule__BOTeamGovernance__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7554:1: ( ( ( rule__BOTeamGovernance__Group_8_3__0 )* ) )
            // InternalBomi.g:7555:1: ( ( rule__BOTeamGovernance__Group_8_3__0 )* )
            {
            // InternalBomi.g:7555:1: ( ( rule__BOTeamGovernance__Group_8_3__0 )* )
            // InternalBomi.g:7556:2: ( rule__BOTeamGovernance__Group_8_3__0 )*
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGroup_8_3()); 
            // InternalBomi.g:7557:2: ( rule__BOTeamGovernance__Group_8_3__0 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==36) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalBomi.g:7557:3: rule__BOTeamGovernance__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BOTeamGovernance__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // InternalBomi.g:7565:1: rule__BOTeamGovernance__Group_8__4 : rule__BOTeamGovernance__Group_8__4__Impl ;
    public final void rule__BOTeamGovernance__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7569:1: ( rule__BOTeamGovernance__Group_8__4__Impl )
            // InternalBomi.g:7570:2: rule__BOTeamGovernance__Group_8__4__Impl
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
    // InternalBomi.g:7576:1: rule__BOTeamGovernance__Group_8__4__Impl : ( ')' ) ;
    public final void rule__BOTeamGovernance__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7580:1: ( ( ')' ) )
            // InternalBomi.g:7581:1: ( ')' )
            {
            // InternalBomi.g:7581:1: ( ')' )
            // InternalBomi.g:7582:2: ')'
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_8_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBomi.g:7592:1: rule__BOTeamGovernance__Group_8_3__0 : rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1 ;
    public final void rule__BOTeamGovernance__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7596:1: ( rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1 )
            // InternalBomi.g:7597:2: rule__BOTeamGovernance__Group_8_3__0__Impl rule__BOTeamGovernance__Group_8_3__1
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
    // InternalBomi.g:7604:1: rule__BOTeamGovernance__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__BOTeamGovernance__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7608:1: ( ( ',' ) )
            // InternalBomi.g:7609:1: ( ',' )
            {
            // InternalBomi.g:7609:1: ( ',' )
            // InternalBomi.g:7610:2: ','
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_8_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBomi.g:7619:1: rule__BOTeamGovernance__Group_8_3__1 : rule__BOTeamGovernance__Group_8_3__1__Impl ;
    public final void rule__BOTeamGovernance__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7623:1: ( rule__BOTeamGovernance__Group_8_3__1__Impl )
            // InternalBomi.g:7624:2: rule__BOTeamGovernance__Group_8_3__1__Impl
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
    // InternalBomi.g:7630:1: rule__BOTeamGovernance__Group_8_3__1__Impl : ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) ) ;
    public final void rule__BOTeamGovernance__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7634:1: ( ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) ) )
            // InternalBomi.g:7635:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) )
            {
            // InternalBomi.g:7635:1: ( ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 ) )
            // InternalBomi.g:7636:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsAssignment_8_3_1()); 
            // InternalBomi.g:7637:2: ( rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 )
            // InternalBomi.g:7637:3: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1
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
    // InternalBomi.g:7646:1: rule__BOMIModel__BoundaryObjectsAssignment_1_2 : ( ruleBoundaryObject ) ;
    public final void rule__BOMIModel__BoundaryObjectsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7650:1: ( ( ruleBoundaryObject ) )
            // InternalBomi.g:7651:2: ( ruleBoundaryObject )
            {
            // InternalBomi.g:7651:2: ( ruleBoundaryObject )
            // InternalBomi.g:7652:3: ruleBoundaryObject
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
    // InternalBomi.g:7661:1: rule__BOMIModel__BoundaryObjectsAssignment_1_3_1 : ( ruleBoundaryObject ) ;
    public final void rule__BOMIModel__BoundaryObjectsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7665:1: ( ( ruleBoundaryObject ) )
            // InternalBomi.g:7666:2: ( ruleBoundaryObject )
            {
            // InternalBomi.g:7666:2: ( ruleBoundaryObject )
            // InternalBomi.g:7667:3: ruleBoundaryObject
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
    // InternalBomi.g:7676:1: rule__BOMIModel__MethodologicalIslandsAssignment_2_2 : ( ruleMethodologicalIsland ) ;
    public final void rule__BOMIModel__MethodologicalIslandsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7680:1: ( ( ruleMethodologicalIsland ) )
            // InternalBomi.g:7681:2: ( ruleMethodologicalIsland )
            {
            // InternalBomi.g:7681:2: ( ruleMethodologicalIsland )
            // InternalBomi.g:7682:3: ruleMethodologicalIsland
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
    // InternalBomi.g:7691:1: rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1 : ( ruleMethodologicalIsland ) ;
    public final void rule__BOMIModel__MethodologicalIslandsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7695:1: ( ( ruleMethodologicalIsland ) )
            // InternalBomi.g:7696:2: ( ruleMethodologicalIsland )
            {
            // InternalBomi.g:7696:2: ( ruleMethodologicalIsland )
            // InternalBomi.g:7697:3: ruleMethodologicalIsland
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
    // InternalBomi.g:7706:1: rule__BOMIModel__GovernanceTeamsAssignment_3_2 : ( ruleGovernanceTeam ) ;
    public final void rule__BOMIModel__GovernanceTeamsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7710:1: ( ( ruleGovernanceTeam ) )
            // InternalBomi.g:7711:2: ( ruleGovernanceTeam )
            {
            // InternalBomi.g:7711:2: ( ruleGovernanceTeam )
            // InternalBomi.g:7712:3: ruleGovernanceTeam
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
    // InternalBomi.g:7721:1: rule__BOMIModel__GovernanceTeamsAssignment_3_3_1 : ( ruleGovernanceTeam ) ;
    public final void rule__BOMIModel__GovernanceTeamsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7725:1: ( ( ruleGovernanceTeam ) )
            // InternalBomi.g:7726:2: ( ruleGovernanceTeam )
            {
            // InternalBomi.g:7726:2: ( ruleGovernanceTeam )
            // InternalBomi.g:7727:3: ruleGovernanceTeam
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
    // InternalBomi.g:7736:1: rule__BOMIModel__RolesAssignment_4_2 : ( ruleRole ) ;
    public final void rule__BOMIModel__RolesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7740:1: ( ( ruleRole ) )
            // InternalBomi.g:7741:2: ( ruleRole )
            {
            // InternalBomi.g:7741:2: ( ruleRole )
            // InternalBomi.g:7742:3: ruleRole
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
    // InternalBomi.g:7751:1: rule__BOMIModel__RolesAssignment_4_3_1 : ( ruleRole ) ;
    public final void rule__BOMIModel__RolesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7755:1: ( ( ruleRole ) )
            // InternalBomi.g:7756:2: ( ruleRole )
            {
            // InternalBomi.g:7756:2: ( ruleRole )
            // InternalBomi.g:7757:3: ruleRole
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
    // InternalBomi.g:7766:1: rule__BOMIModel__DriversAssignment_5_2 : ( ruleDriver ) ;
    public final void rule__BOMIModel__DriversAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7770:1: ( ( ruleDriver ) )
            // InternalBomi.g:7771:2: ( ruleDriver )
            {
            // InternalBomi.g:7771:2: ( ruleDriver )
            // InternalBomi.g:7772:3: ruleDriver
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
    // InternalBomi.g:7781:1: rule__BOMIModel__DriversAssignment_5_3_1 : ( ruleDriver ) ;
    public final void rule__BOMIModel__DriversAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7785:1: ( ( ruleDriver ) )
            // InternalBomi.g:7786:2: ( ruleDriver )
            {
            // InternalBomi.g:7786:2: ( ruleDriver )
            // InternalBomi.g:7787:3: ruleDriver
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
    // InternalBomi.g:7796:1: rule__BOMIModel__BoMiCoordinationsAssignment_6_0 : ( ruleBOMICoordination ) ;
    public final void rule__BOMIModel__BoMiCoordinationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7800:1: ( ( ruleBOMICoordination ) )
            // InternalBomi.g:7801:2: ( ruleBOMICoordination )
            {
            // InternalBomi.g:7801:2: ( ruleBOMICoordination )
            // InternalBomi.g:7802:3: ruleBOMICoordination
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
    // InternalBomi.g:7811:1: rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1 : ( ruleBOMICoordination ) ;
    public final void rule__BOMIModel__BoMiCoordinationsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7815:1: ( ( ruleBOMICoordination ) )
            // InternalBomi.g:7816:2: ( ruleBOMICoordination )
            {
            // InternalBomi.g:7816:2: ( ruleBOMICoordination )
            // InternalBomi.g:7817:3: ruleBOMICoordination
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
    // InternalBomi.g:7826:1: rule__BOMIModel__BoRoleInteractionsAssignment_7_0 : ( ruleBORoleInteraction ) ;
    public final void rule__BOMIModel__BoRoleInteractionsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7830:1: ( ( ruleBORoleInteraction ) )
            // InternalBomi.g:7831:2: ( ruleBORoleInteraction )
            {
            // InternalBomi.g:7831:2: ( ruleBORoleInteraction )
            // InternalBomi.g:7832:3: ruleBORoleInteraction
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
    // InternalBomi.g:7841:1: rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1 : ( ruleBORoleInteraction ) ;
    public final void rule__BOMIModel__BoRoleInteractionsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7845:1: ( ( ruleBORoleInteraction ) )
            // InternalBomi.g:7846:2: ( ruleBORoleInteraction )
            {
            // InternalBomi.g:7846:2: ( ruleBORoleInteraction )
            // InternalBomi.g:7847:3: ruleBORoleInteraction
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
    // InternalBomi.g:7856:1: rule__BOMIModel__BoTeamGovernancesAssignment_8_0 : ( ruleBOTeamGovernance ) ;
    public final void rule__BOMIModel__BoTeamGovernancesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7860:1: ( ( ruleBOTeamGovernance ) )
            // InternalBomi.g:7861:2: ( ruleBOTeamGovernance )
            {
            // InternalBomi.g:7861:2: ( ruleBOTeamGovernance )
            // InternalBomi.g:7862:3: ruleBOTeamGovernance
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
    // InternalBomi.g:7871:1: rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1 : ( ruleBOTeamGovernance ) ;
    public final void rule__BOMIModel__BoTeamGovernancesAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7875:1: ( ( ruleBOTeamGovernance ) )
            // InternalBomi.g:7876:2: ( ruleBOTeamGovernance )
            {
            // InternalBomi.g:7876:2: ( ruleBOTeamGovernance )
            // InternalBomi.g:7877:3: ruleBOTeamGovernance
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
    // InternalBomi.g:7886:1: rule__BoundaryObject__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BoundaryObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7890:1: ( ( ruleEString ) )
            // InternalBomi.g:7891:2: ( ruleEString )
            {
            // InternalBomi.g:7891:2: ( ruleEString )
            // InternalBomi.g:7892:3: ruleEString
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
    // InternalBomi.g:7901:1: rule__BoundaryObject__SuperTypeAssignment_4_1 : ( ruleBOSuperTypes ) ;
    public final void rule__BoundaryObject__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7905:1: ( ( ruleBOSuperTypes ) )
            // InternalBomi.g:7906:2: ( ruleBOSuperTypes )
            {
            // InternalBomi.g:7906:2: ( ruleBOSuperTypes )
            // InternalBomi.g:7907:3: ruleBOSuperTypes
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
    // InternalBomi.g:7916:1: rule__BoundaryObject__PurposeAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__PurposeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7920:1: ( ( ruleEString ) )
            // InternalBomi.g:7921:2: ( ruleEString )
            {
            // InternalBomi.g:7921:2: ( ruleEString )
            // InternalBomi.g:7922:3: ruleEString
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
    // InternalBomi.g:7931:1: rule__BoundaryObject__LevelOfDetailAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__LevelOfDetailAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7935:1: ( ( ruleHighLow ) )
            // InternalBomi.g:7936:2: ( ruleHighLow )
            {
            // InternalBomi.g:7936:2: ( ruleHighLow )
            // InternalBomi.g:7937:3: ruleHighLow
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
    // InternalBomi.g:7946:1: rule__BoundaryObject__FrequencyOfChangeAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__FrequencyOfChangeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7950:1: ( ( ruleHighLow ) )
            // InternalBomi.g:7951:2: ( ruleHighLow )
            {
            // InternalBomi.g:7951:2: ( ruleHighLow )
            // InternalBomi.g:7952:3: ruleHighLow
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
    // InternalBomi.g:7961:1: rule__BoundaryObject__ModularityAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__ModularityAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7965:1: ( ( ruleHighLow ) )
            // InternalBomi.g:7966:2: ( ruleHighLow )
            {
            // InternalBomi.g:7966:2: ( ruleHighLow )
            // InternalBomi.g:7967:3: ruleHighLow
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
    // InternalBomi.g:7976:1: rule__BoundaryObject__MaintainabilityAssignment_9_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__MaintainabilityAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7980:1: ( ( ruleHighLow ) )
            // InternalBomi.g:7981:2: ( ruleHighLow )
            {
            // InternalBomi.g:7981:2: ( ruleHighLow )
            // InternalBomi.g:7982:3: ruleHighLow
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
    // InternalBomi.g:7991:1: rule__BoundaryObject__PrescriptiveAssignment_10_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__PrescriptiveAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:7995:1: ( ( ruleHighLow ) )
            // InternalBomi.g:7996:2: ( ruleHighLow )
            {
            // InternalBomi.g:7996:2: ( ruleHighLow )
            // InternalBomi.g:7997:3: ruleHighLow
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
    // InternalBomi.g:8006:1: rule__BoundaryObject__LifecycleStageAssignment_11_1 : ( ruleLifecycleStage ) ;
    public final void rule__BoundaryObject__LifecycleStageAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8010:1: ( ( ruleLifecycleStage ) )
            // InternalBomi.g:8011:2: ( ruleLifecycleStage )
            {
            // InternalBomi.g:8011:2: ( ruleLifecycleStage )
            // InternalBomi.g:8012:3: ruleLifecycleStage
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
    // InternalBomi.g:8021:1: rule__BoundaryObject__RepresentationFormatAssignment_12_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__RepresentationFormatAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8025:1: ( ( ruleEString ) )
            // InternalBomi.g:8026:2: ( ruleEString )
            {
            // InternalBomi.g:8026:2: ( ruleEString )
            // InternalBomi.g:8027:3: ruleEString
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
    // InternalBomi.g:8036:1: rule__BoundaryObject__ToolingAssignment_13_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__ToolingAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8040:1: ( ( ruleEString ) )
            // InternalBomi.g:8041:2: ( ruleEString )
            {
            // InternalBomi.g:8041:2: ( ruleEString )
            // InternalBomi.g:8042:3: ruleEString
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
    // InternalBomi.g:8051:1: rule__BoundaryObject__VersioningAssignment_14_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__VersioningAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8055:1: ( ( ruleEString ) )
            // InternalBomi.g:8056:2: ( ruleEString )
            {
            // InternalBomi.g:8056:2: ( ruleEString )
            // InternalBomi.g:8057:3: ruleEString
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
    // InternalBomi.g:8066:1: rule__BoundaryObject__UpToDateAssignment_15_1 : ( ruleEString ) ;
    public final void rule__BoundaryObject__UpToDateAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8070:1: ( ( ruleEString ) )
            // InternalBomi.g:8071:2: ( ruleEString )
            {
            // InternalBomi.g:8071:2: ( ruleEString )
            // InternalBomi.g:8072:3: ruleEString
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
    // InternalBomi.g:8081:1: rule__BoundaryObject__InternalConsistencyAssignment_16_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__InternalConsistencyAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8085:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8086:2: ( ruleHighLow )
            {
            // InternalBomi.g:8086:2: ( ruleHighLow )
            // InternalBomi.g:8087:3: ruleHighLow
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
    // InternalBomi.g:8096:1: rule__BoundaryObject__ExternalConsistencyAssignment_17_1 : ( ruleHighLow ) ;
    public final void rule__BoundaryObject__ExternalConsistencyAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8100:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8101:2: ( ruleHighLow )
            {
            // InternalBomi.g:8101:2: ( ruleHighLow )
            // InternalBomi.g:8102:3: ruleHighLow
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
    // InternalBomi.g:8111:1: rule__MethodologicalIsland__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MethodologicalIsland__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8115:1: ( ( ruleEString ) )
            // InternalBomi.g:8116:2: ( ruleEString )
            {
            // InternalBomi.g:8116:2: ( ruleEString )
            // InternalBomi.g:8117:3: ruleEString
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
    // InternalBomi.g:8126:1: rule__MethodologicalIsland__TypeAssignment_4_1 : ( ruleMIType ) ;
    public final void rule__MethodologicalIsland__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8130:1: ( ( ruleMIType ) )
            // InternalBomi.g:8131:2: ( ruleMIType )
            {
            // InternalBomi.g:8131:2: ( ruleMIType )
            // InternalBomi.g:8132:3: ruleMIType
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
    // InternalBomi.g:8141:1: rule__GovernanceTeam__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__GovernanceTeam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8145:1: ( ( ruleEString ) )
            // InternalBomi.g:8146:2: ( ruleEString )
            {
            // InternalBomi.g:8146:2: ( ruleEString )
            // InternalBomi.g:8147:3: ruleEString
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
    // InternalBomi.g:8156:1: rule__Role__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8160:1: ( ( ruleEString ) )
            // InternalBomi.g:8161:2: ( ruleEString )
            {
            // InternalBomi.g:8161:2: ( ruleEString )
            // InternalBomi.g:8162:3: ruleEString
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
    // InternalBomi.g:8171:1: rule__Role__PartOfGovernanceTeamsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfGovernanceTeamsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8175:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8176:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8176:2: ( ( ruleEString ) )
            // InternalBomi.g:8177:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_2_0()); 
            // InternalBomi.g:8178:3: ( ruleEString )
            // InternalBomi.g:8179:4: ruleEString
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
    // InternalBomi.g:8190:1: rule__Role__PartOfGovernanceTeamsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfGovernanceTeamsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8194:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8195:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8195:2: ( ( ruleEString ) )
            // InternalBomi.g:8196:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_3_1_0()); 
            // InternalBomi.g:8197:3: ( ruleEString )
            // InternalBomi.g:8198:4: ruleEString
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
    // InternalBomi.g:8209:1: rule__Role__PartOfMIsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfMIsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8213:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8214:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8214:2: ( ( ruleEString ) )
            // InternalBomi.g:8215:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_2_0()); 
            // InternalBomi.g:8216:3: ( ruleEString )
            // InternalBomi.g:8217:4: ruleEString
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
    // InternalBomi.g:8228:1: rule__Role__PartOfMIsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Role__PartOfMIsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8232:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8233:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8233:2: ( ( ruleEString ) )
            // InternalBomi.g:8234:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_3_1_0()); 
            // InternalBomi.g:8235:3: ( ruleEString )
            // InternalBomi.g:8236:4: ruleEString
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
    // InternalBomi.g:8247:1: rule__Driver__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Driver__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8251:1: ( ( ruleEString ) )
            // InternalBomi.g:8252:2: ( ruleEString )
            {
            // InternalBomi.g:8252:2: ( ruleEString )
            // InternalBomi.g:8253:3: ruleEString
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
    // InternalBomi.g:8262:1: rule__Driver__DriverTypeAssignment_4_1 : ( ruleDriverTypes ) ;
    public final void rule__Driver__DriverTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8266:1: ( ( ruleDriverTypes ) )
            // InternalBomi.g:8267:2: ( ruleDriverTypes )
            {
            // InternalBomi.g:8267:2: ( ruleDriverTypes )
            // InternalBomi.g:8268:3: ruleDriverTypes
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
    // InternalBomi.g:8277:1: rule__Driver__DistanceTypeAssignment_5_1 : ( ruleDistanceTypes ) ;
    public final void rule__Driver__DistanceTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8281:1: ( ( ruleDistanceTypes ) )
            // InternalBomi.g:8282:2: ( ruleDistanceTypes )
            {
            // InternalBomi.g:8282:2: ( ruleDistanceTypes )
            // InternalBomi.g:8283:3: ruleDistanceTypes
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
    // InternalBomi.g:8292:1: rule__Driver__DistanceSizeAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__Driver__DistanceSizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8296:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8297:2: ( ruleHighLow )
            {
            // InternalBomi.g:8297:2: ( ruleHighLow )
            // InternalBomi.g:8298:3: ruleHighLow
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
    // InternalBomi.g:8307:1: rule__Driver__DrivesMIsAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Driver__DrivesMIsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8311:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8312:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8312:2: ( ( ruleEString ) )
            // InternalBomi.g:8313:3: ( ruleEString )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_2_0()); 
            // InternalBomi.g:8314:3: ( ruleEString )
            // InternalBomi.g:8315:4: ruleEString
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
    // InternalBomi.g:8326:1: rule__Driver__DrivesMIsAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Driver__DrivesMIsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8330:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8331:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8331:2: ( ( ruleEString ) )
            // InternalBomi.g:8332:3: ( ruleEString )
            {
             before(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_3_1_0()); 
            // InternalBomi.g:8333:3: ( ruleEString )
            // InternalBomi.g:8334:4: ruleEString
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
    // InternalBomi.g:8345:1: rule__BOMICoordination__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BOMICoordination__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8349:1: ( ( ruleEString ) )
            // InternalBomi.g:8350:2: ( ruleEString )
            {
            // InternalBomi.g:8350:2: ( ruleEString )
            // InternalBomi.g:8351:3: ruleEString
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
    // InternalBomi.g:8360:1: rule__BOMICoordination__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BOMICoordination__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8364:1: ( ( ruleEString ) )
            // InternalBomi.g:8365:2: ( ruleEString )
            {
            // InternalBomi.g:8365:2: ( ruleEString )
            // InternalBomi.g:8366:3: ruleEString
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
    // InternalBomi.g:8375:1: rule__BOMICoordination__AccessabilityAssignment_5_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__AccessabilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8379:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8380:2: ( ruleHighLow )
            {
            // InternalBomi.g:8380:2: ( ruleHighLow )
            // InternalBomi.g:8381:3: ruleHighLow
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
    // InternalBomi.g:8390:1: rule__BOMICoordination__StabilityAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__StabilityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8394:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8395:2: ( ruleHighLow )
            {
            // InternalBomi.g:8395:2: ( ruleHighLow )
            // InternalBomi.g:8396:3: ruleHighLow
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
    // InternalBomi.g:8405:1: rule__BOMICoordination__CriticalityAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__CriticalityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8409:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8410:2: ( ruleHighLow )
            {
            // InternalBomi.g:8410:2: ( ruleHighLow )
            // InternalBomi.g:8411:3: ruleHighLow
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
    // InternalBomi.g:8420:1: rule__BOMICoordination__FitForPurposeAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BOMICoordination__FitForPurposeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8424:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8425:2: ( ruleHighLow )
            {
            // InternalBomi.g:8425:2: ( ruleHighLow )
            // InternalBomi.g:8426:3: ruleHighLow
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
    // InternalBomi.g:8435:1: rule__BOMICoordination__BoundaryObjectsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__BoundaryObjectsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8439:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8440:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8440:2: ( ( ruleEString ) )
            // InternalBomi.g:8441:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0()); 
            // InternalBomi.g:8442:3: ( ruleEString )
            // InternalBomi.g:8443:4: ruleEString
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
    // InternalBomi.g:8454:1: rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__BoundaryObjectsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8458:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8459:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8459:2: ( ( ruleEString ) )
            // InternalBomi.g:8460:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0()); 
            // InternalBomi.g:8461:3: ( ruleEString )
            // InternalBomi.g:8462:4: ruleEString
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
    // InternalBomi.g:8473:1: rule__BOMICoordination__MethodologicalIslandsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__MethodologicalIslandsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8477:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8478:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8478:2: ( ( ruleEString ) )
            // InternalBomi.g:8479:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_2_0()); 
            // InternalBomi.g:8480:3: ( ruleEString )
            // InternalBomi.g:8481:4: ruleEString
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
    // InternalBomi.g:8492:1: rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOMICoordination__MethodologicalIslandsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8496:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8497:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8497:2: ( ( ruleEString ) )
            // InternalBomi.g:8498:3: ( ruleEString )
            {
             before(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_3_1_0()); 
            // InternalBomi.g:8499:3: ( ruleEString )
            // InternalBomi.g:8500:4: ruleEString
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
    // InternalBomi.g:8511:1: rule__BORoleInteraction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BORoleInteraction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8515:1: ( ( ruleEString ) )
            // InternalBomi.g:8516:2: ( ruleEString )
            {
            // InternalBomi.g:8516:2: ( ruleEString )
            // InternalBomi.g:8517:3: ruleEString
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
    // InternalBomi.g:8526:1: rule__BORoleInteraction__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BORoleInteraction__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8530:1: ( ( ruleEString ) )
            // InternalBomi.g:8531:2: ( ruleEString )
            {
            // InternalBomi.g:8531:2: ( ruleEString )
            // InternalBomi.g:8532:3: ruleEString
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
    // InternalBomi.g:8541:1: rule__BORoleInteraction__AccessabilityAssignment_5_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__AccessabilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8545:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8546:2: ( ruleHighLow )
            {
            // InternalBomi.g:8546:2: ( ruleHighLow )
            // InternalBomi.g:8547:3: ruleHighLow
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
    // InternalBomi.g:8556:1: rule__BORoleInteraction__StabilityAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__StabilityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8560:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8561:2: ( ruleHighLow )
            {
            // InternalBomi.g:8561:2: ( ruleHighLow )
            // InternalBomi.g:8562:3: ruleHighLow
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
    // InternalBomi.g:8571:1: rule__BORoleInteraction__CriticalityAssignment_7_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__CriticalityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8575:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8576:2: ( ruleHighLow )
            {
            // InternalBomi.g:8576:2: ( ruleHighLow )
            // InternalBomi.g:8577:3: ruleHighLow
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
    // InternalBomi.g:8586:1: rule__BORoleInteraction__FitForPurposeAssignment_8_1 : ( ruleHighLow ) ;
    public final void rule__BORoleInteraction__FitForPurposeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8590:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8591:2: ( ruleHighLow )
            {
            // InternalBomi.g:8591:2: ( ruleHighLow )
            // InternalBomi.g:8592:3: ruleHighLow
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


    // $ANTLR start "rule__BORoleInteraction__BoundaryObjectsAssignment_9_2"
    // InternalBomi.g:8601:1: rule__BORoleInteraction__BoundaryObjectsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__BoundaryObjectsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8605:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8606:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8606:2: ( ( ruleEString ) )
            // InternalBomi.g:8607:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0()); 
            // InternalBomi.g:8608:3: ( ruleEString )
            // InternalBomi.g:8609:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__BoundaryObjectsAssignment_9_2"


    // $ANTLR start "rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1"
    // InternalBomi.g:8620:1: rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8624:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8625:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8625:2: ( ( ruleEString ) )
            // InternalBomi.g:8626:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0()); 
            // InternalBomi.g:8627:3: ( ruleEString )
            // InternalBomi.g:8628:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__BoundaryObjectsAssignment_9_3_1"


    // $ANTLR start "rule__BORoleInteraction__RolesAssignment_10_2"
    // InternalBomi.g:8639:1: rule__BORoleInteraction__RolesAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__RolesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8643:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8644:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8644:2: ( ( ruleEString ) )
            // InternalBomi.g:8645:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_10_2_0()); 
            // InternalBomi.g:8646:3: ( ruleEString )
            // InternalBomi.g:8647:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__RolesAssignment_10_2"


    // $ANTLR start "rule__BORoleInteraction__RolesAssignment_10_3_1"
    // InternalBomi.g:8658:1: rule__BORoleInteraction__RolesAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BORoleInteraction__RolesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8662:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8663:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8663:2: ( ( ruleEString ) )
            // InternalBomi.g:8664:3: ( ruleEString )
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_10_3_1_0()); 
            // InternalBomi.g:8665:3: ( ruleEString )
            // InternalBomi.g:8666:4: ruleEString
            {
             before(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BORoleInteraction__RolesAssignment_10_3_1"


    // $ANTLR start "rule__BOTeamGovernance__NameAssignment_2"
    // InternalBomi.g:8677:1: rule__BOTeamGovernance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8681:1: ( ( ruleEString ) )
            // InternalBomi.g:8682:2: ( ruleEString )
            {
            // InternalBomi.g:8682:2: ( ruleEString )
            // InternalBomi.g:8683:3: ruleEString
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
    // InternalBomi.g:8692:1: rule__BOTeamGovernance__PurposeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__PurposeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8696:1: ( ( ruleEString ) )
            // InternalBomi.g:8697:2: ( ruleEString )
            {
            // InternalBomi.g:8697:2: ( ruleEString )
            // InternalBomi.g:8698:3: ruleEString
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
    // InternalBomi.g:8707:1: rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BOTeamGovernance__CoordinationMechanismAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8711:1: ( ( ruleEString ) )
            // InternalBomi.g:8712:2: ( ruleEString )
            {
            // InternalBomi.g:8712:2: ( ruleEString )
            // InternalBomi.g:8713:3: ruleEString
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
    // InternalBomi.g:8722:1: rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1 : ( ruleHighLow ) ;
    public final void rule__BOTeamGovernance__FrequencyOfCoordinationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8726:1: ( ( ruleHighLow ) )
            // InternalBomi.g:8727:2: ( ruleHighLow )
            {
            // InternalBomi.g:8727:2: ( ruleHighLow )
            // InternalBomi.g:8728:3: ruleHighLow
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
    // InternalBomi.g:8737:1: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__GovernanceTeamsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8741:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8742:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8742:2: ( ( ruleEString ) )
            // InternalBomi.g:8743:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_2_0()); 
            // InternalBomi.g:8744:3: ( ruleEString )
            // InternalBomi.g:8745:4: ruleEString
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
    // InternalBomi.g:8756:1: rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__GovernanceTeamsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8760:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8761:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8761:2: ( ( ruleEString ) )
            // InternalBomi.g:8762:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_3_1_0()); 
            // InternalBomi.g:8763:3: ( ruleEString )
            // InternalBomi.g:8764:4: ruleEString
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
    // InternalBomi.g:8775:1: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__BoundaryObjectsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8779:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8780:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8780:2: ( ( ruleEString ) )
            // InternalBomi.g:8781:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_2_0()); 
            // InternalBomi.g:8782:3: ( ruleEString )
            // InternalBomi.g:8783:4: ruleEString
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
    // InternalBomi.g:8794:1: rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BOTeamGovernance__BoundaryObjectsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBomi.g:8798:1: ( ( ( ruleEString ) ) )
            // InternalBomi.g:8799:2: ( ( ruleEString ) )
            {
            // InternalBomi.g:8799:2: ( ( ruleEString ) )
            // InternalBomi.g:8800:3: ( ruleEString )
            {
             before(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_3_1_0()); 
            // InternalBomi.g:8801:3: ( ruleEString )
            // InternalBomi.g:8802:4: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001E200000000L,0x0000000000000C20L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00FFFC0800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000003F8800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001C40800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001E000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x9000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x4000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060010800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000001C0000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000082A00000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000088A00000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000084A00000000L,0x0000000000003000L});

}