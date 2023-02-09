package se.gu.cse.idxse.bomi.text.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import se.gu.cse.idxse.bomi.text.services.BomiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBomiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boRoleInteractions'", "'{'", "','", "'}'", "'boundaryObjects'", "'roles'", "'boMiCoordinations'", "'methodologicalIslands'", "'governanceTeams'", "'boTeamGovernances'", "'drivers'", "'BORoleInteraction'", "'purpose'", "'accessability'", "'stability'", "'criticality'", "'fitForPurpose'", "'responsible'", "'creates'", "'reads'", "'updates'", "'deletes'", "'('", "')'", "'BoundaryObject'", "'superType'", "'levelOfDetail'", "'frequencyOfChange'", "'modularity'", "'maintainability'", "'prescriptive'", "'lifecycleStage'", "'representationFormat'", "'tooling'", "'versioning'", "'upToDate'", "'internalConsistency'", "'externalConsistency'", "'Role'", "'partOfGovernanceTeams'", "'partOfMIs'", "'BOMICoordination'", "'MethodologicalIsland'", "'type'", "'GovernanceTeam'", "'BOTeamGovernance'", "'coordinationMechanism'", "'frequencyOfCoordination'", "'Driver'", "'driverTypeTechnology'", "'driverTypeProcess'", "'driverTypeOrganizational'", "'distanceTypeCultural'", "'distanceTypeGeographical'", "'distanceTypeOrganizational'", "'distanceSize'", "'drivesMIs'", "'NOT_SET'", "'High'", "'Medium'", "'Low'", "'True'", "'False'", "'Standard'", "'Technology'", "'Task'", "'Planning'", "'Value'", "'Product'", "'Other'", "'Operation'", "'Deprecate'", "'Retire'", "'Teams'", "'Silos'", "'Departments'", "'Organizations'"
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

        public InternalBomiParser(TokenStream input, BomiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BOMIModel";
       	}

       	@Override
       	protected BomiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBOMIModel"
    // InternalBomi.g:65:1: entryRuleBOMIModel returns [EObject current=null] : iv_ruleBOMIModel= ruleBOMIModel EOF ;
    public final EObject entryRuleBOMIModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOMIModel = null;


        try {
            // InternalBomi.g:65:50: (iv_ruleBOMIModel= ruleBOMIModel EOF )
            // InternalBomi.g:66:2: iv_ruleBOMIModel= ruleBOMIModel EOF
            {
             newCompositeNode(grammarAccess.getBOMIModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOMIModel=ruleBOMIModel();

            state._fsp--;

             current =iv_ruleBOMIModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOMIModel"


    // $ANTLR start "ruleBOMIModel"
    // InternalBomi.g:72:1: ruleBOMIModel returns [EObject current=null] : ( () (otherlv_1= 'boRoleInteractions' otherlv_2= '{' ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) ) (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )* otherlv_6= '}' )? (otherlv_7= 'boundaryObjects' otherlv_8= '{' ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) ) (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )* otherlv_12= '}' )? (otherlv_13= 'roles' otherlv_14= '{' ( (lv_roles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )* otherlv_18= '}' )? (otherlv_19= 'boMiCoordinations' otherlv_20= '{' ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) ) (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )* otherlv_24= '}' )? (otherlv_25= 'methodologicalIslands' otherlv_26= '{' ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) ) (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )* otherlv_30= '}' )? (otherlv_31= 'governanceTeams' otherlv_32= '{' ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) ) (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )* otherlv_36= '}' )? (otherlv_37= 'boTeamGovernances' otherlv_38= '{' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )* otherlv_42= '}' )? (otherlv_43= 'drivers' otherlv_44= '{' ( (lv_drivers_45_0= ruleDriver ) ) (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )* otherlv_48= '}' )? ) ;
    public final EObject ruleBOMIModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        EObject lv_boRoleInteractions_3_0 = null;

        EObject lv_boRoleInteractions_5_0 = null;

        EObject lv_boundaryObjects_9_0 = null;

        EObject lv_boundaryObjects_11_0 = null;

        EObject lv_roles_15_0 = null;

        EObject lv_roles_17_0 = null;

        EObject lv_boMiCoordinations_21_0 = null;

        EObject lv_boMiCoordinations_23_0 = null;

        EObject lv_methodologicalIslands_27_0 = null;

        EObject lv_methodologicalIslands_29_0 = null;

        EObject lv_governanceTeams_33_0 = null;

        EObject lv_governanceTeams_35_0 = null;

        EObject lv_boTeamGovernances_39_0 = null;

        EObject lv_boTeamGovernances_41_0 = null;

        EObject lv_drivers_45_0 = null;

        EObject lv_drivers_47_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:78:2: ( ( () (otherlv_1= 'boRoleInteractions' otherlv_2= '{' ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) ) (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )* otherlv_6= '}' )? (otherlv_7= 'boundaryObjects' otherlv_8= '{' ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) ) (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )* otherlv_12= '}' )? (otherlv_13= 'roles' otherlv_14= '{' ( (lv_roles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )* otherlv_18= '}' )? (otherlv_19= 'boMiCoordinations' otherlv_20= '{' ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) ) (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )* otherlv_24= '}' )? (otherlv_25= 'methodologicalIslands' otherlv_26= '{' ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) ) (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )* otherlv_30= '}' )? (otherlv_31= 'governanceTeams' otherlv_32= '{' ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) ) (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )* otherlv_36= '}' )? (otherlv_37= 'boTeamGovernances' otherlv_38= '{' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )* otherlv_42= '}' )? (otherlv_43= 'drivers' otherlv_44= '{' ( (lv_drivers_45_0= ruleDriver ) ) (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )* otherlv_48= '}' )? ) )
            // InternalBomi.g:79:2: ( () (otherlv_1= 'boRoleInteractions' otherlv_2= '{' ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) ) (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )* otherlv_6= '}' )? (otherlv_7= 'boundaryObjects' otherlv_8= '{' ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) ) (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )* otherlv_12= '}' )? (otherlv_13= 'roles' otherlv_14= '{' ( (lv_roles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )* otherlv_18= '}' )? (otherlv_19= 'boMiCoordinations' otherlv_20= '{' ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) ) (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )* otherlv_24= '}' )? (otherlv_25= 'methodologicalIslands' otherlv_26= '{' ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) ) (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )* otherlv_30= '}' )? (otherlv_31= 'governanceTeams' otherlv_32= '{' ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) ) (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )* otherlv_36= '}' )? (otherlv_37= 'boTeamGovernances' otherlv_38= '{' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )* otherlv_42= '}' )? (otherlv_43= 'drivers' otherlv_44= '{' ( (lv_drivers_45_0= ruleDriver ) ) (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )* otherlv_48= '}' )? )
            {
            // InternalBomi.g:79:2: ( () (otherlv_1= 'boRoleInteractions' otherlv_2= '{' ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) ) (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )* otherlv_6= '}' )? (otherlv_7= 'boundaryObjects' otherlv_8= '{' ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) ) (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )* otherlv_12= '}' )? (otherlv_13= 'roles' otherlv_14= '{' ( (lv_roles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )* otherlv_18= '}' )? (otherlv_19= 'boMiCoordinations' otherlv_20= '{' ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) ) (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )* otherlv_24= '}' )? (otherlv_25= 'methodologicalIslands' otherlv_26= '{' ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) ) (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )* otherlv_30= '}' )? (otherlv_31= 'governanceTeams' otherlv_32= '{' ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) ) (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )* otherlv_36= '}' )? (otherlv_37= 'boTeamGovernances' otherlv_38= '{' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )* otherlv_42= '}' )? (otherlv_43= 'drivers' otherlv_44= '{' ( (lv_drivers_45_0= ruleDriver ) ) (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )* otherlv_48= '}' )? )
            // InternalBomi.g:80:3: () (otherlv_1= 'boRoleInteractions' otherlv_2= '{' ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) ) (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )* otherlv_6= '}' )? (otherlv_7= 'boundaryObjects' otherlv_8= '{' ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) ) (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )* otherlv_12= '}' )? (otherlv_13= 'roles' otherlv_14= '{' ( (lv_roles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )* otherlv_18= '}' )? (otherlv_19= 'boMiCoordinations' otherlv_20= '{' ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) ) (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )* otherlv_24= '}' )? (otherlv_25= 'methodologicalIslands' otherlv_26= '{' ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) ) (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )* otherlv_30= '}' )? (otherlv_31= 'governanceTeams' otherlv_32= '{' ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) ) (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )* otherlv_36= '}' )? (otherlv_37= 'boTeamGovernances' otherlv_38= '{' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )* otherlv_42= '}' )? (otherlv_43= 'drivers' otherlv_44= '{' ( (lv_drivers_45_0= ruleDriver ) ) (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )* otherlv_48= '}' )?
            {
            // InternalBomi.g:80:3: ()
            // InternalBomi.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOMIModelAccess().getBOMIModelAction_0(),
            					current);
            			

            }

            // InternalBomi.g:87:3: (otherlv_1= 'boRoleInteractions' otherlv_2= '{' ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) ) (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )* otherlv_6= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBomi.g:88:4: otherlv_1= 'boRoleInteractions' otherlv_2= '{' ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) ) (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )* otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBOMIModelAccess().getBoRoleInteractionsKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalBomi.g:96:4: ( (lv_boRoleInteractions_3_0= ruleBORoleInteraction ) )
                    // InternalBomi.g:97:5: (lv_boRoleInteractions_3_0= ruleBORoleInteraction )
                    {
                    // InternalBomi.g:97:5: (lv_boRoleInteractions_3_0= ruleBORoleInteraction )
                    // InternalBomi.g:98:6: lv_boRoleInteractions_3_0= ruleBORoleInteraction
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_boRoleInteractions_3_0=ruleBORoleInteraction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boRoleInteractions",
                    							lv_boRoleInteractions_3_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BORoleInteraction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:115:4: (otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBomi.g:116:5: otherlv_4= ',' ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBOMIModelAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalBomi.g:120:5: ( (lv_boRoleInteractions_5_0= ruleBORoleInteraction ) )
                    	    // InternalBomi.g:121:6: (lv_boRoleInteractions_5_0= ruleBORoleInteraction )
                    	    {
                    	    // InternalBomi.g:121:6: (lv_boRoleInteractions_5_0= ruleBORoleInteraction )
                    	    // InternalBomi.g:122:7: lv_boRoleInteractions_5_0= ruleBORoleInteraction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_boRoleInteractions_5_0=ruleBORoleInteraction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boRoleInteractions",
                    	    								lv_boRoleInteractions_5_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.BORoleInteraction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:145:3: (otherlv_7= 'boundaryObjects' otherlv_8= '{' ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) ) (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBomi.g:146:4: otherlv_7= 'boundaryObjects' otherlv_8= '{' ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) ) (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getBOMIModelAccess().getBoundaryObjectsKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalBomi.g:154:4: ( (lv_boundaryObjects_9_0= ruleBoundaryObject ) )
                    // InternalBomi.g:155:5: (lv_boundaryObjects_9_0= ruleBoundaryObject )
                    {
                    // InternalBomi.g:155:5: (lv_boundaryObjects_9_0= ruleBoundaryObject )
                    // InternalBomi.g:156:6: lv_boundaryObjects_9_0= ruleBoundaryObject
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_boundaryObjects_9_0=ruleBoundaryObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boundaryObjects",
                    							lv_boundaryObjects_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BoundaryObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:173:4: (otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBomi.g:174:5: otherlv_10= ',' ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getBOMIModelAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalBomi.g:178:5: ( (lv_boundaryObjects_11_0= ruleBoundaryObject ) )
                    	    // InternalBomi.g:179:6: (lv_boundaryObjects_11_0= ruleBoundaryObject )
                    	    {
                    	    // InternalBomi.g:179:6: (lv_boundaryObjects_11_0= ruleBoundaryObject )
                    	    // InternalBomi.g:180:7: lv_boundaryObjects_11_0= ruleBoundaryObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_boundaryObjects_11_0=ruleBoundaryObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boundaryObjects",
                    	    								lv_boundaryObjects_11_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.BoundaryObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:203:3: (otherlv_13= 'roles' otherlv_14= '{' ( (lv_roles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBomi.g:204:4: otherlv_13= 'roles' otherlv_14= '{' ( (lv_roles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getBOMIModelAccess().getRolesKeyword_3_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBomi.g:212:4: ( (lv_roles_15_0= ruleRole ) )
                    // InternalBomi.g:213:5: (lv_roles_15_0= ruleRole )
                    {
                    // InternalBomi.g:213:5: (lv_roles_15_0= ruleRole )
                    // InternalBomi.g:214:6: lv_roles_15_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_roles_15_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"roles",
                    							lv_roles_15_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:231:4: (otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBomi.g:232:5: otherlv_16= ',' ( (lv_roles_17_0= ruleRole ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBOMIModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBomi.g:236:5: ( (lv_roles_17_0= ruleRole ) )
                    	    // InternalBomi.g:237:6: (lv_roles_17_0= ruleRole )
                    	    {
                    	    // InternalBomi.g:237:6: (lv_roles_17_0= ruleRole )
                    	    // InternalBomi.g:238:7: lv_roles_17_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_roles_17_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roles",
                    	    								lv_roles_17_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.Role");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:261:3: (otherlv_19= 'boMiCoordinations' otherlv_20= '{' ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) ) (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )* otherlv_24= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBomi.g:262:4: otherlv_19= 'boMiCoordinations' otherlv_20= '{' ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) ) (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getBOMIModelAccess().getBoMiCoordinationsKeyword_4_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBomi.g:270:4: ( (lv_boMiCoordinations_21_0= ruleBOMICoordination ) )
                    // InternalBomi.g:271:5: (lv_boMiCoordinations_21_0= ruleBOMICoordination )
                    {
                    // InternalBomi.g:271:5: (lv_boMiCoordinations_21_0= ruleBOMICoordination )
                    // InternalBomi.g:272:6: lv_boMiCoordinations_21_0= ruleBOMICoordination
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_boMiCoordinations_21_0=ruleBOMICoordination();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boMiCoordinations",
                    							lv_boMiCoordinations_21_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BOMICoordination");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:289:4: (otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBomi.g:290:5: otherlv_22= ',' ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) )
                    	    {
                    	    otherlv_22=(Token)match(input,13,FOLLOW_11); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getBOMIModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBomi.g:294:5: ( (lv_boMiCoordinations_23_0= ruleBOMICoordination ) )
                    	    // InternalBomi.g:295:6: (lv_boMiCoordinations_23_0= ruleBOMICoordination )
                    	    {
                    	    // InternalBomi.g:295:6: (lv_boMiCoordinations_23_0= ruleBOMICoordination )
                    	    // InternalBomi.g:296:7: lv_boMiCoordinations_23_0= ruleBOMICoordination
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_boMiCoordinations_23_0=ruleBOMICoordination();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boMiCoordinations",
                    	    								lv_boMiCoordinations_23_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.BOMICoordination");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_24, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:319:3: (otherlv_25= 'methodologicalIslands' otherlv_26= '{' ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) ) (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )* otherlv_30= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBomi.g:320:4: otherlv_25= 'methodologicalIslands' otherlv_26= '{' ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) ) (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getBOMIModelAccess().getMethodologicalIslandsKeyword_5_0());
                    			
                    otherlv_26=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBomi.g:328:4: ( (lv_methodologicalIslands_27_0= ruleMethodologicalIsland ) )
                    // InternalBomi.g:329:5: (lv_methodologicalIslands_27_0= ruleMethodologicalIsland )
                    {
                    // InternalBomi.g:329:5: (lv_methodologicalIslands_27_0= ruleMethodologicalIsland )
                    // InternalBomi.g:330:6: lv_methodologicalIslands_27_0= ruleMethodologicalIsland
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_methodologicalIslands_27_0=ruleMethodologicalIsland();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"methodologicalIslands",
                    							lv_methodologicalIslands_27_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MethodologicalIsland");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:347:4: (otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBomi.g:348:5: otherlv_28= ',' ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) )
                    	    {
                    	    otherlv_28=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getBOMIModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBomi.g:352:5: ( (lv_methodologicalIslands_29_0= ruleMethodologicalIsland ) )
                    	    // InternalBomi.g:353:6: (lv_methodologicalIslands_29_0= ruleMethodologicalIsland )
                    	    {
                    	    // InternalBomi.g:353:6: (lv_methodologicalIslands_29_0= ruleMethodologicalIsland )
                    	    // InternalBomi.g:354:7: lv_methodologicalIslands_29_0= ruleMethodologicalIsland
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_methodologicalIslands_29_0=ruleMethodologicalIsland();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methodologicalIslands",
                    	    								lv_methodologicalIslands_29_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.MethodologicalIsland");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_30, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:377:3: (otherlv_31= 'governanceTeams' otherlv_32= '{' ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) ) (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )* otherlv_36= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBomi.g:378:4: otherlv_31= 'governanceTeams' otherlv_32= '{' ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) ) (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )* otherlv_36= '}'
                    {
                    otherlv_31=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_31, grammarAccess.getBOMIModelAccess().getGovernanceTeamsKeyword_6_0());
                    			
                    otherlv_32=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_32, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBomi.g:386:4: ( (lv_governanceTeams_33_0= ruleGovernanceTeam ) )
                    // InternalBomi.g:387:5: (lv_governanceTeams_33_0= ruleGovernanceTeam )
                    {
                    // InternalBomi.g:387:5: (lv_governanceTeams_33_0= ruleGovernanceTeam )
                    // InternalBomi.g:388:6: lv_governanceTeams_33_0= ruleGovernanceTeam
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_governanceTeams_33_0=ruleGovernanceTeam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"governanceTeams",
                    							lv_governanceTeams_33_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.GovernanceTeam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:405:4: (otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBomi.g:406:5: otherlv_34= ',' ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) )
                    	    {
                    	    otherlv_34=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getBOMIModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBomi.g:410:5: ( (lv_governanceTeams_35_0= ruleGovernanceTeam ) )
                    	    // InternalBomi.g:411:6: (lv_governanceTeams_35_0= ruleGovernanceTeam )
                    	    {
                    	    // InternalBomi.g:411:6: (lv_governanceTeams_35_0= ruleGovernanceTeam )
                    	    // InternalBomi.g:412:7: lv_governanceTeams_35_0= ruleGovernanceTeam
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_governanceTeams_35_0=ruleGovernanceTeam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"governanceTeams",
                    	    								lv_governanceTeams_35_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.GovernanceTeam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_36, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:435:3: (otherlv_37= 'boTeamGovernances' otherlv_38= '{' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )* otherlv_42= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBomi.g:436:4: otherlv_37= 'boTeamGovernances' otherlv_38= '{' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )* otherlv_42= '}'
                    {
                    otherlv_37=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_37, grammarAccess.getBOMIModelAccess().getBoTeamGovernancesKeyword_7_0());
                    			
                    otherlv_38=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_38, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBomi.g:444:4: ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) )
                    // InternalBomi.g:445:5: (lv_boTeamGovernances_39_0= ruleBOTeamGovernance )
                    {
                    // InternalBomi.g:445:5: (lv_boTeamGovernances_39_0= ruleBOTeamGovernance )
                    // InternalBomi.g:446:6: lv_boTeamGovernances_39_0= ruleBOTeamGovernance
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_boTeamGovernances_39_0=ruleBOTeamGovernance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boTeamGovernances",
                    							lv_boTeamGovernances_39_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BOTeamGovernance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:463:4: (otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBomi.g:464:5: otherlv_40= ',' ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) )
                    	    {
                    	    otherlv_40=(Token)match(input,13,FOLLOW_17); 

                    	    					newLeafNode(otherlv_40, grammarAccess.getBOMIModelAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBomi.g:468:5: ( (lv_boTeamGovernances_41_0= ruleBOTeamGovernance ) )
                    	    // InternalBomi.g:469:6: (lv_boTeamGovernances_41_0= ruleBOTeamGovernance )
                    	    {
                    	    // InternalBomi.g:469:6: (lv_boTeamGovernances_41_0= ruleBOTeamGovernance )
                    	    // InternalBomi.g:470:7: lv_boTeamGovernances_41_0= ruleBOTeamGovernance
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_boTeamGovernances_41_0=ruleBOTeamGovernance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boTeamGovernances",
                    	    								lv_boTeamGovernances_41_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.BOTeamGovernance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_42=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_42, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:493:3: (otherlv_43= 'drivers' otherlv_44= '{' ( (lv_drivers_45_0= ruleDriver ) ) (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )* otherlv_48= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBomi.g:494:4: otherlv_43= 'drivers' otherlv_44= '{' ( (lv_drivers_45_0= ruleDriver ) ) (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )* otherlv_48= '}'
                    {
                    otherlv_43=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_43, grammarAccess.getBOMIModelAccess().getDriversKeyword_8_0());
                    			
                    otherlv_44=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_44, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBomi.g:502:4: ( (lv_drivers_45_0= ruleDriver ) )
                    // InternalBomi.g:503:5: (lv_drivers_45_0= ruleDriver )
                    {
                    // InternalBomi.g:503:5: (lv_drivers_45_0= ruleDriver )
                    // InternalBomi.g:504:6: lv_drivers_45_0= ruleDriver
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_drivers_45_0=ruleDriver();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"drivers",
                    							lv_drivers_45_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.Driver");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:521:4: (otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==13) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBomi.g:522:5: otherlv_46= ',' ( (lv_drivers_47_0= ruleDriver ) )
                    	    {
                    	    otherlv_46=(Token)match(input,13,FOLLOW_19); 

                    	    					newLeafNode(otherlv_46, grammarAccess.getBOMIModelAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBomi.g:526:5: ( (lv_drivers_47_0= ruleDriver ) )
                    	    // InternalBomi.g:527:6: (lv_drivers_47_0= ruleDriver )
                    	    {
                    	    // InternalBomi.g:527:6: (lv_drivers_47_0= ruleDriver )
                    	    // InternalBomi.g:528:7: lv_drivers_47_0= ruleDriver
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_drivers_47_0=ruleDriver();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"drivers",
                    	    								lv_drivers_47_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.Driver");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_48=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_48, grammarAccess.getBOMIModelAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOMIModel"


    // $ANTLR start "entryRuleBORoleInteraction"
    // InternalBomi.g:555:1: entryRuleBORoleInteraction returns [EObject current=null] : iv_ruleBORoleInteraction= ruleBORoleInteraction EOF ;
    public final EObject entryRuleBORoleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBORoleInteraction = null;


        try {
            // InternalBomi.g:555:58: (iv_ruleBORoleInteraction= ruleBORoleInteraction EOF )
            // InternalBomi.g:556:2: iv_ruleBORoleInteraction= ruleBORoleInteraction EOF
            {
             newCompositeNode(grammarAccess.getBORoleInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBORoleInteraction=ruleBORoleInteraction();

            state._fsp--;

             current =iv_ruleBORoleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBORoleInteraction"


    // $ANTLR start "ruleBORoleInteraction"
    // InternalBomi.g:562:1: ruleBORoleInteraction returns [EObject current=null] : ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleUnsettableBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleUnsettableBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleUnsettableBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleUnsettableBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' ) ;
    public final EObject ruleBORoleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_purpose_5_0 = null;

        Enumerator lv_accessability_7_0 = null;

        Enumerator lv_stability_9_0 = null;

        Enumerator lv_criticality_11_0 = null;

        Enumerator lv_fitForPurpose_13_0 = null;

        Enumerator lv_responsible_15_0 = null;

        Enumerator lv_creates_17_0 = null;

        Enumerator lv_reads_19_0 = null;

        Enumerator lv_updates_21_0 = null;

        Enumerator lv_deletes_23_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:568:2: ( ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleUnsettableBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleUnsettableBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleUnsettableBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleUnsettableBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' ) )
            // InternalBomi.g:569:2: ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleUnsettableBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleUnsettableBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleUnsettableBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleUnsettableBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' )
            {
            // InternalBomi.g:569:2: ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleUnsettableBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleUnsettableBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleUnsettableBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleUnsettableBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' )
            // InternalBomi.g:570:3: () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleUnsettableBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleUnsettableBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleUnsettableBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleUnsettableBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}'
            {
            // InternalBomi.g:570:3: ()
            // InternalBomi.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBORoleInteractionAccess().getBORoleInteractionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBORoleInteractionAccess().getBORoleInteractionKeyword_1());
            		
            // InternalBomi.g:581:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:582:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:582:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:583:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBORoleInteractionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getBORoleInteractionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:604:3: (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBomi.g:605:4: otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getBORoleInteractionAccess().getPurposeKeyword_4_0());
                    			
                    // InternalBomi.g:609:4: ( (lv_purpose_5_0= ruleEString ) )
                    // InternalBomi.g:610:5: (lv_purpose_5_0= ruleEString )
                    {
                    // InternalBomi.g:610:5: (lv_purpose_5_0= ruleEString )
                    // InternalBomi.g:611:6: lv_purpose_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getPurposeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_purpose_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"purpose",
                    							lv_purpose_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:629:3: (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBomi.g:630:4: otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getBORoleInteractionAccess().getAccessabilityKeyword_5_0());
                    			
                    // InternalBomi.g:634:4: ( (lv_accessability_7_0= ruleHighLow ) )
                    // InternalBomi.g:635:5: (lv_accessability_7_0= ruleHighLow )
                    {
                    // InternalBomi.g:635:5: (lv_accessability_7_0= ruleHighLow )
                    // InternalBomi.g:636:6: lv_accessability_7_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getAccessabilityHighLowEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_accessability_7_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"accessability",
                    							lv_accessability_7_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:654:3: (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBomi.g:655:4: otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getBORoleInteractionAccess().getStabilityKeyword_6_0());
                    			
                    // InternalBomi.g:659:4: ( (lv_stability_9_0= ruleHighLow ) )
                    // InternalBomi.g:660:5: (lv_stability_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:660:5: (lv_stability_9_0= ruleHighLow )
                    // InternalBomi.g:661:6: lv_stability_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getStabilityHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_stability_9_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"stability",
                    							lv_stability_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:679:3: (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBomi.g:680:4: otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getBORoleInteractionAccess().getCriticalityKeyword_7_0());
                    			
                    // InternalBomi.g:684:4: ( (lv_criticality_11_0= ruleHighLow ) )
                    // InternalBomi.g:685:5: (lv_criticality_11_0= ruleHighLow )
                    {
                    // InternalBomi.g:685:5: (lv_criticality_11_0= ruleHighLow )
                    // InternalBomi.g:686:6: lv_criticality_11_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getCriticalityHighLowEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_criticality_11_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"criticality",
                    							lv_criticality_11_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:704:3: (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBomi.g:705:4: otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getBORoleInteractionAccess().getFitForPurposeKeyword_8_0());
                    			
                    // InternalBomi.g:709:4: ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    // InternalBomi.g:710:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    {
                    // InternalBomi.g:710:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    // InternalBomi.g:711:6: lv_fitForPurpose_13_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_fitForPurpose_13_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"fitForPurpose",
                    							lv_fitForPurpose_13_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:729:3: (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleUnsettableBoolean ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBomi.g:730:4: otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_14, grammarAccess.getBORoleInteractionAccess().getResponsibleKeyword_9_0());
                    			
                    // InternalBomi.g:734:4: ( (lv_responsible_15_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:735:5: (lv_responsible_15_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:735:5: (lv_responsible_15_0= ruleUnsettableBoolean )
                    // InternalBomi.g:736:6: lv_responsible_15_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getResponsibleUnsettableBooleanEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_responsible_15_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"responsible",
                    							lv_responsible_15_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:754:3: (otherlv_16= 'creates' ( (lv_creates_17_0= ruleUnsettableBoolean ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBomi.g:755:4: otherlv_16= 'creates' ( (lv_creates_17_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getBORoleInteractionAccess().getCreatesKeyword_10_0());
                    			
                    // InternalBomi.g:759:4: ( (lv_creates_17_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:760:5: (lv_creates_17_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:760:5: (lv_creates_17_0= ruleUnsettableBoolean )
                    // InternalBomi.g:761:6: lv_creates_17_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getCreatesUnsettableBooleanEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_creates_17_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"creates",
                    							lv_creates_17_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:779:3: (otherlv_18= 'reads' ( (lv_reads_19_0= ruleUnsettableBoolean ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBomi.g:780:4: otherlv_18= 'reads' ( (lv_reads_19_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_18, grammarAccess.getBORoleInteractionAccess().getReadsKeyword_11_0());
                    			
                    // InternalBomi.g:784:4: ( (lv_reads_19_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:785:5: (lv_reads_19_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:785:5: (lv_reads_19_0= ruleUnsettableBoolean )
                    // InternalBomi.g:786:6: lv_reads_19_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getReadsUnsettableBooleanEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_reads_19_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"reads",
                    							lv_reads_19_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:804:3: (otherlv_20= 'updates' ( (lv_updates_21_0= ruleUnsettableBoolean ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBomi.g:805:4: otherlv_20= 'updates' ( (lv_updates_21_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_20, grammarAccess.getBORoleInteractionAccess().getUpdatesKeyword_12_0());
                    			
                    // InternalBomi.g:809:4: ( (lv_updates_21_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:810:5: (lv_updates_21_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:810:5: (lv_updates_21_0= ruleUnsettableBoolean )
                    // InternalBomi.g:811:6: lv_updates_21_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getUpdatesUnsettableBooleanEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_updates_21_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"updates",
                    							lv_updates_21_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:829:3: (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleUnsettableBoolean ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBomi.g:830:4: otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_22=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_22, grammarAccess.getBORoleInteractionAccess().getDeletesKeyword_13_0());
                    			
                    // InternalBomi.g:834:4: ( (lv_deletes_23_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:835:5: (lv_deletes_23_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:835:5: (lv_deletes_23_0= ruleUnsettableBoolean )
                    // InternalBomi.g:836:6: lv_deletes_23_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getDeletesUnsettableBooleanEnumRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_deletes_23_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"deletes",
                    							lv_deletes_23_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:854:3: (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBomi.g:855:4: otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_24, grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsKeyword_14_0());
                    			
                    otherlv_25=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_25, grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_14_1());
                    			
                    // InternalBomi.g:863:4: ( ( ruleEString ) )
                    // InternalBomi.g:864:5: ( ruleEString )
                    {
                    // InternalBomi.g:864:5: ( ruleEString )
                    // InternalBomi.g:865:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:879:4: (otherlv_27= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==13) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalBomi.g:880:5: otherlv_27= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_27=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getBORoleInteractionAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalBomi.g:884:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:885:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:885:6: ( ruleEString )
                    	    // InternalBomi.g:886:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_29, grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:906:3: (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBomi.g:907:4: otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')'
                    {
                    otherlv_30=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_30, grammarAccess.getBORoleInteractionAccess().getRolesKeyword_15_0());
                    			
                    otherlv_31=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_31, grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_15_1());
                    			
                    // InternalBomi.g:915:4: ( ( ruleEString ) )
                    // InternalBomi.g:916:5: ( ruleEString )
                    {
                    // InternalBomi.g:916:5: ( ruleEString )
                    // InternalBomi.g:917:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:931:4: (otherlv_33= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==13) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalBomi.g:932:5: otherlv_33= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_33=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getBORoleInteractionAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalBomi.g:936:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:937:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:937:6: ( ruleEString )
                    	    // InternalBomi.g:938:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,34,FOLLOW_37); 

                    				newLeafNode(otherlv_35, grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getBORoleInteractionAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBORoleInteraction"


    // $ANTLR start "entryRuleBoundaryObject"
    // InternalBomi.g:966:1: entryRuleBoundaryObject returns [EObject current=null] : iv_ruleBoundaryObject= ruleBoundaryObject EOF ;
    public final EObject entryRuleBoundaryObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryObject = null;


        try {
            // InternalBomi.g:966:55: (iv_ruleBoundaryObject= ruleBoundaryObject EOF )
            // InternalBomi.g:967:2: iv_ruleBoundaryObject= ruleBoundaryObject EOF
            {
             newCompositeNode(grammarAccess.getBoundaryObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryObject=ruleBoundaryObject();

            state._fsp--;

             current =iv_ruleBoundaryObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoundaryObject"


    // $ANTLR start "ruleBoundaryObject"
    // InternalBomi.g:973:1: ruleBoundaryObject returns [EObject current=null] : ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( (lv_superType_7_0= ruleBOSuperTypes ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' ) ;
    public final EObject ruleBoundaryObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_purpose_5_0 = null;

        Enumerator lv_superType_7_0 = null;

        Enumerator lv_levelOfDetail_9_0 = null;

        Enumerator lv_frequencyOfChange_11_0 = null;

        Enumerator lv_modularity_13_0 = null;

        Enumerator lv_maintainability_15_0 = null;

        Enumerator lv_prescriptive_17_0 = null;

        Enumerator lv_lifecycleStage_19_0 = null;

        AntlrDatatypeRuleToken lv_representationFormat_21_0 = null;

        AntlrDatatypeRuleToken lv_tooling_23_0 = null;

        AntlrDatatypeRuleToken lv_versioning_25_0 = null;

        AntlrDatatypeRuleToken lv_upToDate_27_0 = null;

        Enumerator lv_internalConsistency_29_0 = null;

        Enumerator lv_externalConsistency_31_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:979:2: ( ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( (lv_superType_7_0= ruleBOSuperTypes ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' ) )
            // InternalBomi.g:980:2: ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( (lv_superType_7_0= ruleBOSuperTypes ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' )
            {
            // InternalBomi.g:980:2: ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( (lv_superType_7_0= ruleBOSuperTypes ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' )
            // InternalBomi.g:981:3: () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( (lv_superType_7_0= ruleBOSuperTypes ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}'
            {
            // InternalBomi.g:981:3: ()
            // InternalBomi.g:982:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundaryObjectAccess().getBoundaryObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryObjectAccess().getBoundaryObjectKeyword_1());
            		
            // InternalBomi.g:992:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:993:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:993:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:994:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoundaryObjectAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBoundaryObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1015:3: (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBomi.g:1016:4: otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getBoundaryObjectAccess().getPurposeKeyword_4_0());
                    			
                    // InternalBomi.g:1020:4: ( (lv_purpose_5_0= ruleEString ) )
                    // InternalBomi.g:1021:5: (lv_purpose_5_0= ruleEString )
                    {
                    // InternalBomi.g:1021:5: (lv_purpose_5_0= ruleEString )
                    // InternalBomi.g:1022:6: lv_purpose_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getPurposeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_purpose_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"purpose",
                    							lv_purpose_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1040:3: (otherlv_6= 'superType' ( (lv_superType_7_0= ruleBOSuperTypes ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBomi.g:1041:4: otherlv_6= 'superType' ( (lv_superType_7_0= ruleBOSuperTypes ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getBoundaryObjectAccess().getSuperTypeKeyword_5_0());
                    			
                    // InternalBomi.g:1045:4: ( (lv_superType_7_0= ruleBOSuperTypes ) )
                    // InternalBomi.g:1046:5: (lv_superType_7_0= ruleBOSuperTypes )
                    {
                    // InternalBomi.g:1046:5: (lv_superType_7_0= ruleBOSuperTypes )
                    // InternalBomi.g:1047:6: lv_superType_7_0= ruleBOSuperTypes
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getSuperTypeBOSuperTypesEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_superType_7_0=ruleBOSuperTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"superType",
                    							lv_superType_7_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BOSuperTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1065:3: (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBomi.g:1066:4: otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getBoundaryObjectAccess().getLevelOfDetailKeyword_6_0());
                    			
                    // InternalBomi.g:1070:4: ( (lv_levelOfDetail_9_0= ruleHighLow ) )
                    // InternalBomi.g:1071:5: (lv_levelOfDetail_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:1071:5: (lv_levelOfDetail_9_0= ruleHighLow )
                    // InternalBomi.g:1072:6: lv_levelOfDetail_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_levelOfDetail_9_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"levelOfDetail",
                    							lv_levelOfDetail_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1090:3: (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBomi.g:1091:4: otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) )
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeKeyword_7_0());
                    			
                    // InternalBomi.g:1095:4: ( (lv_frequencyOfChange_11_0= ruleHighLow ) )
                    // InternalBomi.g:1096:5: (lv_frequencyOfChange_11_0= ruleHighLow )
                    {
                    // InternalBomi.g:1096:5: (lv_frequencyOfChange_11_0= ruleHighLow )
                    // InternalBomi.g:1097:6: lv_frequencyOfChange_11_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeHighLowEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_frequencyOfChange_11_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"frequencyOfChange",
                    							lv_frequencyOfChange_11_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1115:3: (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBomi.g:1116:4: otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getBoundaryObjectAccess().getModularityKeyword_8_0());
                    			
                    // InternalBomi.g:1120:4: ( (lv_modularity_13_0= ruleHighLow ) )
                    // InternalBomi.g:1121:5: (lv_modularity_13_0= ruleHighLow )
                    {
                    // InternalBomi.g:1121:5: (lv_modularity_13_0= ruleHighLow )
                    // InternalBomi.g:1122:6: lv_modularity_13_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getModularityHighLowEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_modularity_13_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"modularity",
                    							lv_modularity_13_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1140:3: (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBomi.g:1141:4: otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) )
                    {
                    otherlv_14=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_14, grammarAccess.getBoundaryObjectAccess().getMaintainabilityKeyword_9_0());
                    			
                    // InternalBomi.g:1145:4: ( (lv_maintainability_15_0= ruleHighLow ) )
                    // InternalBomi.g:1146:5: (lv_maintainability_15_0= ruleHighLow )
                    {
                    // InternalBomi.g:1146:5: (lv_maintainability_15_0= ruleHighLow )
                    // InternalBomi.g:1147:6: lv_maintainability_15_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getMaintainabilityHighLowEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_maintainability_15_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"maintainability",
                    							lv_maintainability_15_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1165:3: (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBomi.g:1166:4: otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) )
                    {
                    otherlv_16=(Token)match(input,41,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getBoundaryObjectAccess().getPrescriptiveKeyword_10_0());
                    			
                    // InternalBomi.g:1170:4: ( (lv_prescriptive_17_0= ruleHighLow ) )
                    // InternalBomi.g:1171:5: (lv_prescriptive_17_0= ruleHighLow )
                    {
                    // InternalBomi.g:1171:5: (lv_prescriptive_17_0= ruleHighLow )
                    // InternalBomi.g:1172:6: lv_prescriptive_17_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getPrescriptiveHighLowEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_prescriptive_17_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"prescriptive",
                    							lv_prescriptive_17_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1190:3: (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBomi.g:1191:4: otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) )
                    {
                    otherlv_18=(Token)match(input,42,FOLLOW_47); 

                    				newLeafNode(otherlv_18, grammarAccess.getBoundaryObjectAccess().getLifecycleStageKeyword_11_0());
                    			
                    // InternalBomi.g:1195:4: ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) )
                    // InternalBomi.g:1196:5: (lv_lifecycleStage_19_0= ruleLifecycleStage )
                    {
                    // InternalBomi.g:1196:5: (lv_lifecycleStage_19_0= ruleLifecycleStage )
                    // InternalBomi.g:1197:6: lv_lifecycleStage_19_0= ruleLifecycleStage
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getLifecycleStageLifecycleStageEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_lifecycleStage_19_0=ruleLifecycleStage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"lifecycleStage",
                    							lv_lifecycleStage_19_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.LifecycleStage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1215:3: (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBomi.g:1216:4: otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,43,FOLLOW_20); 

                    				newLeafNode(otherlv_20, grammarAccess.getBoundaryObjectAccess().getRepresentationFormatKeyword_12_0());
                    			
                    // InternalBomi.g:1220:4: ( (lv_representationFormat_21_0= ruleEString ) )
                    // InternalBomi.g:1221:5: (lv_representationFormat_21_0= ruleEString )
                    {
                    // InternalBomi.g:1221:5: (lv_representationFormat_21_0= ruleEString )
                    // InternalBomi.g:1222:6: lv_representationFormat_21_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatEStringParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_representationFormat_21_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"representationFormat",
                    							lv_representationFormat_21_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1240:3: (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBomi.g:1241:4: otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,44,FOLLOW_20); 

                    				newLeafNode(otherlv_22, grammarAccess.getBoundaryObjectAccess().getToolingKeyword_13_0());
                    			
                    // InternalBomi.g:1245:4: ( (lv_tooling_23_0= ruleEString ) )
                    // InternalBomi.g:1246:5: (lv_tooling_23_0= ruleEString )
                    {
                    // InternalBomi.g:1246:5: (lv_tooling_23_0= ruleEString )
                    // InternalBomi.g:1247:6: lv_tooling_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getToolingEStringParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_tooling_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"tooling",
                    							lv_tooling_23_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1265:3: (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBomi.g:1266:4: otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,45,FOLLOW_20); 

                    				newLeafNode(otherlv_24, grammarAccess.getBoundaryObjectAccess().getVersioningKeyword_14_0());
                    			
                    // InternalBomi.g:1270:4: ( (lv_versioning_25_0= ruleEString ) )
                    // InternalBomi.g:1271:5: (lv_versioning_25_0= ruleEString )
                    {
                    // InternalBomi.g:1271:5: (lv_versioning_25_0= ruleEString )
                    // InternalBomi.g:1272:6: lv_versioning_25_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getVersioningEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_versioning_25_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"versioning",
                    							lv_versioning_25_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1290:3: (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBomi.g:1291:4: otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) )
                    {
                    otherlv_26=(Token)match(input,46,FOLLOW_20); 

                    				newLeafNode(otherlv_26, grammarAccess.getBoundaryObjectAccess().getUpToDateKeyword_15_0());
                    			
                    // InternalBomi.g:1295:4: ( (lv_upToDate_27_0= ruleEString ) )
                    // InternalBomi.g:1296:5: (lv_upToDate_27_0= ruleEString )
                    {
                    // InternalBomi.g:1296:5: (lv_upToDate_27_0= ruleEString )
                    // InternalBomi.g:1297:6: lv_upToDate_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getUpToDateEStringParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_upToDate_27_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"upToDate",
                    							lv_upToDate_27_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1315:3: (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBomi.g:1316:4: otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) )
                    {
                    otherlv_28=(Token)match(input,47,FOLLOW_23); 

                    				newLeafNode(otherlv_28, grammarAccess.getBoundaryObjectAccess().getInternalConsistencyKeyword_16_0());
                    			
                    // InternalBomi.g:1320:4: ( (lv_internalConsistency_29_0= ruleHighLow ) )
                    // InternalBomi.g:1321:5: (lv_internalConsistency_29_0= ruleHighLow )
                    {
                    // InternalBomi.g:1321:5: (lv_internalConsistency_29_0= ruleHighLow )
                    // InternalBomi.g:1322:6: lv_internalConsistency_29_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyHighLowEnumRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_internalConsistency_29_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"internalConsistency",
                    							lv_internalConsistency_29_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1340:3: (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBomi.g:1341:4: otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) )
                    {
                    otherlv_30=(Token)match(input,48,FOLLOW_23); 

                    				newLeafNode(otherlv_30, grammarAccess.getBoundaryObjectAccess().getExternalConsistencyKeyword_17_0());
                    			
                    // InternalBomi.g:1345:4: ( (lv_externalConsistency_31_0= ruleHighLow ) )
                    // InternalBomi.g:1346:5: (lv_externalConsistency_31_0= ruleHighLow )
                    {
                    // InternalBomi.g:1346:5: (lv_externalConsistency_31_0= ruleHighLow )
                    // InternalBomi.g:1347:6: lv_externalConsistency_31_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyHighLowEnumRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_externalConsistency_31_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"externalConsistency",
                    							lv_externalConsistency_31_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_32=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getBoundaryObjectAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoundaryObject"


    // $ANTLR start "entryRuleRole"
    // InternalBomi.g:1373:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalBomi.g:1373:45: (iv_ruleRole= ruleRole EOF )
            // InternalBomi.g:1374:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalBomi.g:1380:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:1386:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalBomi.g:1387:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalBomi.g:1387:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalBomi.g:1388:3: () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalBomi.g:1388:3: ()
            // InternalBomi.g:1389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalBomi.g:1399:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1400:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1400:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1401:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1422:3: (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBomi.g:1423:4: otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getPartOfGovernanceTeamsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBomi.g:1431:4: ( ( ruleEString ) )
                    // InternalBomi.g:1432:5: ( ruleEString )
                    {
                    // InternalBomi.g:1432:5: ( ruleEString )
                    // InternalBomi.g:1433:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1447:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==13) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalBomi.g:1448:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBomi.g:1452:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1453:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1453:6: ( ruleEString )
                    	    // InternalBomi.g:1454:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,34,FOLLOW_55); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:1474:3: (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBomi.g:1475:4: otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getPartOfMIsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBomi.g:1483:4: ( ( ruleEString ) )
                    // InternalBomi.g:1484:5: ( ruleEString )
                    {
                    // InternalBomi.g:1484:5: ( ruleEString )
                    // InternalBomi.g:1485:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1499:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==13) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalBomi.g:1500:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRoleAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBomi.g:1504:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1505:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1505:6: ( ruleEString )
                    	    // InternalBomi.g:1506:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,34,FOLLOW_37); 

                    				newLeafNode(otherlv_15, grammarAccess.getRoleAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleBOMICoordination"
    // InternalBomi.g:1534:1: entryRuleBOMICoordination returns [EObject current=null] : iv_ruleBOMICoordination= ruleBOMICoordination EOF ;
    public final EObject entryRuleBOMICoordination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOMICoordination = null;


        try {
            // InternalBomi.g:1534:57: (iv_ruleBOMICoordination= ruleBOMICoordination EOF )
            // InternalBomi.g:1535:2: iv_ruleBOMICoordination= ruleBOMICoordination EOF
            {
             newCompositeNode(grammarAccess.getBOMICoordinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOMICoordination=ruleBOMICoordination();

            state._fsp--;

             current =iv_ruleBOMICoordination; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOMICoordination"


    // $ANTLR start "ruleBOMICoordination"
    // InternalBomi.g:1541:1: ruleBOMICoordination returns [EObject current=null] : ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' ) ;
    public final EObject ruleBOMICoordination() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_purpose_5_0 = null;

        Enumerator lv_accessability_7_0 = null;

        Enumerator lv_stability_9_0 = null;

        Enumerator lv_criticality_11_0 = null;

        Enumerator lv_fitForPurpose_13_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:1547:2: ( ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' ) )
            // InternalBomi.g:1548:2: ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' )
            {
            // InternalBomi.g:1548:2: ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' )
            // InternalBomi.g:1549:3: () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}'
            {
            // InternalBomi.g:1549:3: ()
            // InternalBomi.g:1550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOMICoordinationAccess().getBOMICoordinationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBOMICoordinationAccess().getBOMICoordinationKeyword_1());
            		
            // InternalBomi.g:1560:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1561:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1561:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1562:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBOMICoordinationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBOMICoordinationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getBOMICoordinationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1583:3: (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBomi.g:1584:4: otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getBOMICoordinationAccess().getPurposeKeyword_4_0());
                    			
                    // InternalBomi.g:1588:4: ( (lv_purpose_5_0= ruleEString ) )
                    // InternalBomi.g:1589:5: (lv_purpose_5_0= ruleEString )
                    {
                    // InternalBomi.g:1589:5: (lv_purpose_5_0= ruleEString )
                    // InternalBomi.g:1590:6: lv_purpose_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getPurposeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_purpose_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMICoordinationRule());
                    						}
                    						set(
                    							current,
                    							"purpose",
                    							lv_purpose_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1608:3: (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBomi.g:1609:4: otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getBOMICoordinationAccess().getAccessabilityKeyword_5_0());
                    			
                    // InternalBomi.g:1613:4: ( (lv_accessability_7_0= ruleHighLow ) )
                    // InternalBomi.g:1614:5: (lv_accessability_7_0= ruleHighLow )
                    {
                    // InternalBomi.g:1614:5: (lv_accessability_7_0= ruleHighLow )
                    // InternalBomi.g:1615:6: lv_accessability_7_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getAccessabilityHighLowEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_accessability_7_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMICoordinationRule());
                    						}
                    						set(
                    							current,
                    							"accessability",
                    							lv_accessability_7_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1633:3: (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBomi.g:1634:4: otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getBOMICoordinationAccess().getStabilityKeyword_6_0());
                    			
                    // InternalBomi.g:1638:4: ( (lv_stability_9_0= ruleHighLow ) )
                    // InternalBomi.g:1639:5: (lv_stability_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:1639:5: (lv_stability_9_0= ruleHighLow )
                    // InternalBomi.g:1640:6: lv_stability_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getStabilityHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_stability_9_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMICoordinationRule());
                    						}
                    						set(
                    							current,
                    							"stability",
                    							lv_stability_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1658:3: (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBomi.g:1659:4: otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getBOMICoordinationAccess().getCriticalityKeyword_7_0());
                    			
                    // InternalBomi.g:1663:4: ( (lv_criticality_11_0= ruleHighLow ) )
                    // InternalBomi.g:1664:5: (lv_criticality_11_0= ruleHighLow )
                    {
                    // InternalBomi.g:1664:5: (lv_criticality_11_0= ruleHighLow )
                    // InternalBomi.g:1665:6: lv_criticality_11_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getCriticalityHighLowEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_criticality_11_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMICoordinationRule());
                    						}
                    						set(
                    							current,
                    							"criticality",
                    							lv_criticality_11_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1683:3: (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBomi.g:1684:4: otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getBOMICoordinationAccess().getFitForPurposeKeyword_8_0());
                    			
                    // InternalBomi.g:1688:4: ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    // InternalBomi.g:1689:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    {
                    // InternalBomi.g:1689:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    // InternalBomi.g:1690:6: lv_fitForPurpose_13_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_fitForPurpose_13_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMICoordinationRule());
                    						}
                    						set(
                    							current,
                    							"fitForPurpose",
                    							lv_fitForPurpose_13_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1708:3: (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==15) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBomi.g:1709:4: otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_14, grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalBomi.g:1717:4: ( ( ruleEString ) )
                    // InternalBomi.g:1718:5: ( ruleEString )
                    {
                    // InternalBomi.g:1718:5: ( ruleEString )
                    // InternalBomi.g:1719:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1733:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==13) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalBomi.g:1734:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getBOMICoordinationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBomi.g:1738:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1739:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1739:6: ( ruleEString )
                    	    // InternalBomi.g:1740:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,34,FOLLOW_62); 

                    				newLeafNode(otherlv_19, grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:1760:3: (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==18) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBomi.g:1761:4: otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_20, grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_21, grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalBomi.g:1769:4: ( ( ruleEString ) )
                    // InternalBomi.g:1770:5: ( ruleEString )
                    {
                    // InternalBomi.g:1770:5: ( ruleEString )
                    // InternalBomi.g:1771:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1785:4: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==13) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalBomi.g:1786:5: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getBOMICoordinationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBomi.g:1790:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1791:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1791:6: ( ruleEString )
                    	    // InternalBomi.g:1792:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,34,FOLLOW_37); 

                    				newLeafNode(otherlv_25, grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getBOMICoordinationAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOMICoordination"


    // $ANTLR start "entryRuleMethodologicalIsland"
    // InternalBomi.g:1820:1: entryRuleMethodologicalIsland returns [EObject current=null] : iv_ruleMethodologicalIsland= ruleMethodologicalIsland EOF ;
    public final EObject entryRuleMethodologicalIsland() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodologicalIsland = null;


        try {
            // InternalBomi.g:1820:61: (iv_ruleMethodologicalIsland= ruleMethodologicalIsland EOF )
            // InternalBomi.g:1821:2: iv_ruleMethodologicalIsland= ruleMethodologicalIsland EOF
            {
             newCompositeNode(grammarAccess.getMethodologicalIslandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodologicalIsland=ruleMethodologicalIsland();

            state._fsp--;

             current =iv_ruleMethodologicalIsland; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodologicalIsland"


    // $ANTLR start "ruleMethodologicalIsland"
    // InternalBomi.g:1827:1: ruleMethodologicalIsland returns [EObject current=null] : ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMethodologicalIsland() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:1833:2: ( ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' ) )
            // InternalBomi.g:1834:2: ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' )
            {
            // InternalBomi.g:1834:2: ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' )
            // InternalBomi.g:1835:3: () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}'
            {
            // InternalBomi.g:1835:3: ()
            // InternalBomi.g:1836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandKeyword_1());
            		
            // InternalBomi.g:1846:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1847:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1847:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1848:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodologicalIslandAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodologicalIslandRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodologicalIslandAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1869:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==54) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBomi.g:1870:4: otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_64); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodologicalIslandAccess().getTypeKeyword_4_0());
                    			
                    // InternalBomi.g:1874:4: ( (lv_type_5_0= ruleMIType ) )
                    // InternalBomi.g:1875:5: (lv_type_5_0= ruleMIType )
                    {
                    // InternalBomi.g:1875:5: (lv_type_5_0= ruleMIType )
                    // InternalBomi.g:1876:6: lv_type_5_0= ruleMIType
                    {

                    						newCompositeNode(grammarAccess.getMethodologicalIslandAccess().getTypeMITypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_type_5_0=ruleMIType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodologicalIslandRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MIType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodologicalIslandAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodologicalIsland"


    // $ANTLR start "entryRuleGovernanceTeam"
    // InternalBomi.g:1902:1: entryRuleGovernanceTeam returns [EObject current=null] : iv_ruleGovernanceTeam= ruleGovernanceTeam EOF ;
    public final EObject entryRuleGovernanceTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceTeam = null;


        try {
            // InternalBomi.g:1902:55: (iv_ruleGovernanceTeam= ruleGovernanceTeam EOF )
            // InternalBomi.g:1903:2: iv_ruleGovernanceTeam= ruleGovernanceTeam EOF
            {
             newCompositeNode(grammarAccess.getGovernanceTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGovernanceTeam=ruleGovernanceTeam();

            state._fsp--;

             current =iv_ruleGovernanceTeam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGovernanceTeam"


    // $ANTLR start "ruleGovernanceTeam"
    // InternalBomi.g:1909:1: ruleGovernanceTeam returns [EObject current=null] : ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleGovernanceTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:1915:2: ( ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBomi.g:1916:2: ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBomi.g:1916:2: ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) )
            // InternalBomi.g:1917:3: () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBomi.g:1917:3: ()
            // InternalBomi.g:1918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGovernanceTeamAccess().getGovernanceTeamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getGovernanceTeamAccess().getGovernanceTeamKeyword_1());
            		
            // InternalBomi.g:1928:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1929:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1929:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1930:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGovernanceTeamAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGovernanceTeamRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGovernanceTeam"


    // $ANTLR start "entryRuleBOTeamGovernance"
    // InternalBomi.g:1951:1: entryRuleBOTeamGovernance returns [EObject current=null] : iv_ruleBOTeamGovernance= ruleBOTeamGovernance EOF ;
    public final EObject entryRuleBOTeamGovernance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOTeamGovernance = null;


        try {
            // InternalBomi.g:1951:57: (iv_ruleBOTeamGovernance= ruleBOTeamGovernance EOF )
            // InternalBomi.g:1952:2: iv_ruleBOTeamGovernance= ruleBOTeamGovernance EOF
            {
             newCompositeNode(grammarAccess.getBOTeamGovernanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOTeamGovernance=ruleBOTeamGovernance();

            state._fsp--;

             current =iv_ruleBOTeamGovernance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOTeamGovernance"


    // $ANTLR start "ruleBOTeamGovernance"
    // InternalBomi.g:1958:1: ruleBOTeamGovernance returns [EObject current=null] : ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'boundaryObjects' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'governanceTeams' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) ;
    public final EObject ruleBOTeamGovernance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_purpose_5_0 = null;

        AntlrDatatypeRuleToken lv_coordinationMechanism_7_0 = null;

        Enumerator lv_frequencyOfCoordination_9_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:1964:2: ( ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'boundaryObjects' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'governanceTeams' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) )
            // InternalBomi.g:1965:2: ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'boundaryObjects' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'governanceTeams' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            {
            // InternalBomi.g:1965:2: ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'boundaryObjects' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'governanceTeams' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            // InternalBomi.g:1966:3: () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'boundaryObjects' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'governanceTeams' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}'
            {
            // InternalBomi.g:1966:3: ()
            // InternalBomi.g:1967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceKeyword_1());
            		
            // InternalBomi.g:1977:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1978:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1978:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1979:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBOTeamGovernanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_3, grammarAccess.getBOTeamGovernanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:2000:3: (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==23) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBomi.g:2001:4: otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getBOTeamGovernanceAccess().getPurposeKeyword_4_0());
                    			
                    // InternalBomi.g:2005:4: ( (lv_purpose_5_0= ruleEString ) )
                    // InternalBomi.g:2006:5: (lv_purpose_5_0= ruleEString )
                    {
                    // InternalBomi.g:2006:5: (lv_purpose_5_0= ruleEString )
                    // InternalBomi.g:2007:6: lv_purpose_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getPurposeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_purpose_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOTeamGovernanceRule());
                    						}
                    						set(
                    							current,
                    							"purpose",
                    							lv_purpose_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2025:3: (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBomi.g:2026:4: otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismKeyword_5_0());
                    			
                    // InternalBomi.g:2030:4: ( (lv_coordinationMechanism_7_0= ruleEString ) )
                    // InternalBomi.g:2031:5: (lv_coordinationMechanism_7_0= ruleEString )
                    {
                    // InternalBomi.g:2031:5: (lv_coordinationMechanism_7_0= ruleEString )
                    // InternalBomi.g:2032:6: lv_coordinationMechanism_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_coordinationMechanism_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOTeamGovernanceRule());
                    						}
                    						set(
                    							current,
                    							"coordinationMechanism",
                    							lv_coordinationMechanism_7_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2050:3: (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==58) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBomi.g:2051:4: otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationKeyword_6_0());
                    			
                    // InternalBomi.g:2055:4: ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) )
                    // InternalBomi.g:2056:5: (lv_frequencyOfCoordination_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:2056:5: (lv_frequencyOfCoordination_9_0= ruleHighLow )
                    // InternalBomi.g:2057:6: lv_frequencyOfCoordination_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_frequencyOfCoordination_9_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOTeamGovernanceRule());
                    						}
                    						set(
                    							current,
                    							"frequencyOfCoordination",
                    							lv_frequencyOfCoordination_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2075:3: (otherlv_10= 'boundaryObjects' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==15) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBomi.g:2076:4: otherlv_10= 'boundaryObjects' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalBomi.g:2084:4: ( ( ruleEString ) )
                    // InternalBomi.g:2085:5: ( ruleEString )
                    {
                    // InternalBomi.g:2085:5: ( ruleEString )
                    // InternalBomi.g:2086:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:2100:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==13) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalBomi.g:2101:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBomi.g:2105:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:2106:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:2106:6: ( ruleEString )
                    	    // InternalBomi.g:2107:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,34,FOLLOW_69); 

                    				newLeafNode(otherlv_15, grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:2127:3: (otherlv_16= 'governanceTeams' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==19) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBomi.g:2128:4: otherlv_16= 'governanceTeams' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_34); 

                    				newLeafNode(otherlv_16, grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_17, grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalBomi.g:2136:4: ( ( ruleEString ) )
                    // InternalBomi.g:2137:5: ( ruleEString )
                    {
                    // InternalBomi.g:2137:5: ( ruleEString )
                    // InternalBomi.g:2138:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:2152:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==13) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalBomi.g:2153:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBomi.g:2157:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:2158:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:2158:6: ( ruleEString )
                    	    // InternalBomi.g:2159:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,34,FOLLOW_37); 

                    				newLeafNode(otherlv_21, grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getBOTeamGovernanceAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOTeamGovernance"


    // $ANTLR start "entryRuleDriver"
    // InternalBomi.g:2187:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // InternalBomi.g:2187:47: (iv_ruleDriver= ruleDriver EOF )
            // InternalBomi.g:2188:2: iv_ruleDriver= ruleDriver EOF
            {
             newCompositeNode(grammarAccess.getDriverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDriver=ruleDriver();

            state._fsp--;

             current =iv_ruleDriver; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDriver"


    // $ANTLR start "ruleDriver"
    // InternalBomi.g:2194:1: ruleDriver returns [EObject current=null] : ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverTypeTechnology' ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) ) )? (otherlv_6= 'driverTypeProcess' ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) ) )? (otherlv_8= 'driverTypeOrganizational' ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) ) )? (otherlv_10= 'distanceTypeCultural' ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) ) )? (otherlv_12= 'distanceTypeGeographical' ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) ) )? (otherlv_14= 'distanceTypeOrganizational' ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'distanceSize' ( (lv_distanceSize_17_0= ruleHighLow ) ) )? (otherlv_18= 'drivesMIs' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) ;
    public final EObject ruleDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_driverTypeTechnology_5_0 = null;

        Enumerator lv_driverTypeProcess_7_0 = null;

        Enumerator lv_driverTypeOrganizational_9_0 = null;

        Enumerator lv_distanceTypeCultural_11_0 = null;

        Enumerator lv_distanceTypeGeographical_13_0 = null;

        Enumerator lv_distanceTypeOrganizational_15_0 = null;

        Enumerator lv_distanceSize_17_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:2200:2: ( ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverTypeTechnology' ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) ) )? (otherlv_6= 'driverTypeProcess' ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) ) )? (otherlv_8= 'driverTypeOrganizational' ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) ) )? (otherlv_10= 'distanceTypeCultural' ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) ) )? (otherlv_12= 'distanceTypeGeographical' ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) ) )? (otherlv_14= 'distanceTypeOrganizational' ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'distanceSize' ( (lv_distanceSize_17_0= ruleHighLow ) ) )? (otherlv_18= 'drivesMIs' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) )
            // InternalBomi.g:2201:2: ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverTypeTechnology' ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) ) )? (otherlv_6= 'driverTypeProcess' ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) ) )? (otherlv_8= 'driverTypeOrganizational' ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) ) )? (otherlv_10= 'distanceTypeCultural' ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) ) )? (otherlv_12= 'distanceTypeGeographical' ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) ) )? (otherlv_14= 'distanceTypeOrganizational' ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'distanceSize' ( (lv_distanceSize_17_0= ruleHighLow ) ) )? (otherlv_18= 'drivesMIs' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            {
            // InternalBomi.g:2201:2: ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverTypeTechnology' ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) ) )? (otherlv_6= 'driverTypeProcess' ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) ) )? (otherlv_8= 'driverTypeOrganizational' ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) ) )? (otherlv_10= 'distanceTypeCultural' ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) ) )? (otherlv_12= 'distanceTypeGeographical' ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) ) )? (otherlv_14= 'distanceTypeOrganizational' ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'distanceSize' ( (lv_distanceSize_17_0= ruleHighLow ) ) )? (otherlv_18= 'drivesMIs' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            // InternalBomi.g:2202:3: () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverTypeTechnology' ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) ) )? (otherlv_6= 'driverTypeProcess' ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) ) )? (otherlv_8= 'driverTypeOrganizational' ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) ) )? (otherlv_10= 'distanceTypeCultural' ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) ) )? (otherlv_12= 'distanceTypeGeographical' ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) ) )? (otherlv_14= 'distanceTypeOrganizational' ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) ) )? (otherlv_16= 'distanceSize' ( (lv_distanceSize_17_0= ruleHighLow ) ) )? (otherlv_18= 'drivesMIs' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}'
            {
            // InternalBomi.g:2202:3: ()
            // InternalBomi.g:2203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDriverAccess().getDriverAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDriverAccess().getDriverKeyword_1());
            		
            // InternalBomi.g:2213:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:2214:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:2214:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:2215:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDriverAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDriverRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.gu.cse.idxse.bomi.text.Bomi.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:2236:3: (otherlv_4= 'driverTypeTechnology' ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==60) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalBomi.g:2237:4: otherlv_4= 'driverTypeTechnology' ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getDriverAccess().getDriverTypeTechnologyKeyword_4_0());
                    			
                    // InternalBomi.g:2241:4: ( (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:2242:5: (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:2242:5: (lv_driverTypeTechnology_5_0= ruleUnsettableBoolean )
                    // InternalBomi.g:2243:6: lv_driverTypeTechnology_5_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDriverTypeTechnologyUnsettableBooleanEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_driverTypeTechnology_5_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"driverTypeTechnology",
                    							lv_driverTypeTechnology_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2261:3: (otherlv_6= 'driverTypeProcess' ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==61) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBomi.g:2262:4: otherlv_6= 'driverTypeProcess' ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getDriverAccess().getDriverTypeProcessKeyword_5_0());
                    			
                    // InternalBomi.g:2266:4: ( (lv_driverTypeProcess_7_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:2267:5: (lv_driverTypeProcess_7_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:2267:5: (lv_driverTypeProcess_7_0= ruleUnsettableBoolean )
                    // InternalBomi.g:2268:6: lv_driverTypeProcess_7_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDriverTypeProcessUnsettableBooleanEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_driverTypeProcess_7_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"driverTypeProcess",
                    							lv_driverTypeProcess_7_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2286:3: (otherlv_8= 'driverTypeOrganizational' ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==62) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBomi.g:2287:4: otherlv_8= 'driverTypeOrganizational' ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getDriverAccess().getDriverTypeOrganizationalKeyword_6_0());
                    			
                    // InternalBomi.g:2291:4: ( (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:2292:5: (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:2292:5: (lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean )
                    // InternalBomi.g:2293:6: lv_driverTypeOrganizational_9_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDriverTypeOrganizationalUnsettableBooleanEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_driverTypeOrganizational_9_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"driverTypeOrganizational",
                    							lv_driverTypeOrganizational_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2311:3: (otherlv_10= 'distanceTypeCultural' ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==63) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalBomi.g:2312:4: otherlv_10= 'distanceTypeCultural' ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_10=(Token)match(input,63,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getDriverAccess().getDistanceTypeCulturalKeyword_7_0());
                    			
                    // InternalBomi.g:2316:4: ( (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:2317:5: (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:2317:5: (lv_distanceTypeCultural_11_0= ruleUnsettableBoolean )
                    // InternalBomi.g:2318:6: lv_distanceTypeCultural_11_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDistanceTypeCulturalUnsettableBooleanEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_distanceTypeCultural_11_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"distanceTypeCultural",
                    							lv_distanceTypeCultural_11_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2336:3: (otherlv_12= 'distanceTypeGeographical' ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==64) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalBomi.g:2337:4: otherlv_12= 'distanceTypeGeographical' ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_12=(Token)match(input,64,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getDriverAccess().getDistanceTypeGeographicalKeyword_8_0());
                    			
                    // InternalBomi.g:2341:4: ( (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:2342:5: (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:2342:5: (lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean )
                    // InternalBomi.g:2343:6: lv_distanceTypeGeographical_13_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDistanceTypeGeographicalUnsettableBooleanEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_distanceTypeGeographical_13_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"distanceTypeGeographical",
                    							lv_distanceTypeGeographical_13_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2361:3: (otherlv_14= 'distanceTypeOrganizational' ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==65) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalBomi.g:2362:4: otherlv_14= 'distanceTypeOrganizational' ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) )
                    {
                    otherlv_14=(Token)match(input,65,FOLLOW_28); 

                    				newLeafNode(otherlv_14, grammarAccess.getDriverAccess().getDistanceTypeOrganizationalKeyword_9_0());
                    			
                    // InternalBomi.g:2366:4: ( (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean ) )
                    // InternalBomi.g:2367:5: (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean )
                    {
                    // InternalBomi.g:2367:5: (lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean )
                    // InternalBomi.g:2368:6: lv_distanceTypeOrganizational_15_0= ruleUnsettableBoolean
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDistanceTypeOrganizationalUnsettableBooleanEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_distanceTypeOrganizational_15_0=ruleUnsettableBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"distanceTypeOrganizational",
                    							lv_distanceTypeOrganizational_15_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.UnsettableBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2386:3: (otherlv_16= 'distanceSize' ( (lv_distanceSize_17_0= ruleHighLow ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==66) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBomi.g:2387:4: otherlv_16= 'distanceSize' ( (lv_distanceSize_17_0= ruleHighLow ) )
                    {
                    otherlv_16=(Token)match(input,66,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getDriverAccess().getDistanceSizeKeyword_10_0());
                    			
                    // InternalBomi.g:2391:4: ( (lv_distanceSize_17_0= ruleHighLow ) )
                    // InternalBomi.g:2392:5: (lv_distanceSize_17_0= ruleHighLow )
                    {
                    // InternalBomi.g:2392:5: (lv_distanceSize_17_0= ruleHighLow )
                    // InternalBomi.g:2393:6: lv_distanceSize_17_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDistanceSizeHighLowEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_distanceSize_17_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"distanceSize",
                    							lv_distanceSize_17_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:2411:3: (otherlv_18= 'drivesMIs' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==67) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalBomi.g:2412:4: otherlv_18= 'drivesMIs' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,67,FOLLOW_34); 

                    				newLeafNode(otherlv_18, grammarAccess.getDriverAccess().getDrivesMIsKeyword_11_0());
                    			
                    otherlv_19=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_19, grammarAccess.getDriverAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalBomi.g:2420:4: ( ( ruleEString ) )
                    // InternalBomi.g:2421:5: ( ruleEString )
                    {
                    // InternalBomi.g:2421:5: ( ruleEString )
                    // InternalBomi.g:2422:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDriverRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:2436:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==13) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalBomi.g:2437:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getDriverAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBomi.g:2441:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:2442:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:2442:6: ( ruleEString )
                    	    // InternalBomi.g:2443:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDriverRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,34,FOLLOW_37); 

                    				newLeafNode(otherlv_23, grammarAccess.getDriverAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDriver"


    // $ANTLR start "entryRuleEString"
    // InternalBomi.g:2471:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBomi.g:2471:47: (iv_ruleEString= ruleEString EOF )
            // InternalBomi.g:2472:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBomi.g:2478:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBomi.g:2484:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBomi.g:2485:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBomi.g:2485:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_STRING) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalBomi.g:2486:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBomi.g:2494:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleHighLow"
    // InternalBomi.g:2505:1: ruleHighLow returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator ruleHighLow() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBomi.g:2511:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // InternalBomi.g:2512:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // InternalBomi.g:2512:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt76=1;
                }
                break;
            case 69:
                {
                alt76=2;
                }
                break;
            case 70:
                {
                alt76=3;
                }
                break;
            case 71:
                {
                alt76=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalBomi.g:2513:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2513:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2514:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2521:3: (enumLiteral_1= 'High' )
                    {
                    // InternalBomi.g:2521:3: (enumLiteral_1= 'High' )
                    // InternalBomi.g:2522:4: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2529:3: (enumLiteral_2= 'Medium' )
                    {
                    // InternalBomi.g:2529:3: (enumLiteral_2= 'Medium' )
                    // InternalBomi.g:2530:4: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2537:3: (enumLiteral_3= 'Low' )
                    {
                    // InternalBomi.g:2537:3: (enumLiteral_3= 'Low' )
                    // InternalBomi.g:2538:4: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getLowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHighLowAccess().getLowEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighLow"


    // $ANTLR start "ruleUnsettableBoolean"
    // InternalBomi.g:2548:1: ruleUnsettableBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) ) ;
    public final Enumerator ruleUnsettableBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBomi.g:2554:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) ) )
            // InternalBomi.g:2555:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) )
            {
            // InternalBomi.g:2555:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt77=1;
                }
                break;
            case 72:
                {
                alt77=2;
                }
                break;
            case 73:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalBomi.g:2556:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2556:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2557:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getUnsettableBooleanAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnsettableBooleanAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2564:3: (enumLiteral_1= 'True' )
                    {
                    // InternalBomi.g:2564:3: (enumLiteral_1= 'True' )
                    // InternalBomi.g:2565:4: enumLiteral_1= 'True'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getUnsettableBooleanAccess().getTrueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnsettableBooleanAccess().getTrueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2572:3: (enumLiteral_2= 'False' )
                    {
                    // InternalBomi.g:2572:3: (enumLiteral_2= 'False' )
                    // InternalBomi.g:2573:4: enumLiteral_2= 'False'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getUnsettableBooleanAccess().getFalseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnsettableBooleanAccess().getFalseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsettableBoolean"


    // $ANTLR start "ruleBOSuperTypes"
    // InternalBomi.g:2583:1: ruleBOSuperTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) ) ;
    public final Enumerator ruleBOSuperTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalBomi.g:2589:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) ) )
            // InternalBomi.g:2590:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) )
            {
            // InternalBomi.g:2590:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) )
            int alt78=8;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt78=1;
                }
                break;
            case 74:
                {
                alt78=2;
                }
                break;
            case 75:
                {
                alt78=3;
                }
                break;
            case 76:
                {
                alt78=4;
                }
                break;
            case 77:
                {
                alt78=5;
                }
                break;
            case 78:
                {
                alt78=6;
                }
                break;
            case 79:
                {
                alt78=7;
                }
                break;
            case 80:
                {
                alt78=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalBomi.g:2591:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2591:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2592:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2599:3: (enumLiteral_1= 'Standard' )
                    {
                    // InternalBomi.g:2599:3: (enumLiteral_1= 'Standard' )
                    // InternalBomi.g:2600:4: enumLiteral_1= 'Standard'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2607:3: (enumLiteral_2= 'Technology' )
                    {
                    // InternalBomi.g:2607:3: (enumLiteral_2= 'Technology' )
                    // InternalBomi.g:2608:4: enumLiteral_2= 'Technology'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2615:3: (enumLiteral_3= 'Task' )
                    {
                    // InternalBomi.g:2615:3: (enumLiteral_3= 'Task' )
                    // InternalBomi.g:2616:4: enumLiteral_3= 'Task'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:2623:3: (enumLiteral_4= 'Planning' )
                    {
                    // InternalBomi.g:2623:3: (enumLiteral_4= 'Planning' )
                    // InternalBomi.g:2624:4: enumLiteral_4= 'Planning'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBomi.g:2631:3: (enumLiteral_5= 'Value' )
                    {
                    // InternalBomi.g:2631:3: (enumLiteral_5= 'Value' )
                    // InternalBomi.g:2632:4: enumLiteral_5= 'Value'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBomi.g:2639:3: (enumLiteral_6= 'Product' )
                    {
                    // InternalBomi.g:2639:3: (enumLiteral_6= 'Product' )
                    // InternalBomi.g:2640:4: enumLiteral_6= 'Product'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBomi.g:2647:3: (enumLiteral_7= 'Other' )
                    {
                    // InternalBomi.g:2647:3: (enumLiteral_7= 'Other' )
                    // InternalBomi.g:2648:4: enumLiteral_7= 'Other'
                    {
                    enumLiteral_7=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getOtherEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBOSuperTypesAccess().getOtherEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOSuperTypes"


    // $ANTLR start "ruleLifecycleStage"
    // InternalBomi.g:2658:1: ruleLifecycleStage returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) ) ;
    public final Enumerator ruleLifecycleStage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBomi.g:2664:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) ) )
            // InternalBomi.g:2665:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) )
            {
            // InternalBomi.g:2665:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt79=1;
                }
                break;
            case 77:
                {
                alt79=2;
                }
                break;
            case 81:
                {
                alt79=3;
                }
                break;
            case 82:
                {
                alt79=4;
                }
                break;
            case 83:
                {
                alt79=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalBomi.g:2666:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2666:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2667:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2674:3: (enumLiteral_1= 'Planning' )
                    {
                    // InternalBomi.g:2674:3: (enumLiteral_1= 'Planning' )
                    // InternalBomi.g:2675:4: enumLiteral_1= 'Planning'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2682:3: (enumLiteral_2= 'Operation' )
                    {
                    // InternalBomi.g:2682:3: (enumLiteral_2= 'Operation' )
                    // InternalBomi.g:2683:4: enumLiteral_2= 'Operation'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2690:3: (enumLiteral_3= 'Deprecate' )
                    {
                    // InternalBomi.g:2690:3: (enumLiteral_3= 'Deprecate' )
                    // InternalBomi.g:2691:4: enumLiteral_3= 'Deprecate'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:2698:3: (enumLiteral_4= 'Retire' )
                    {
                    // InternalBomi.g:2698:3: (enumLiteral_4= 'Retire' )
                    // InternalBomi.g:2699:4: enumLiteral_4= 'Retire'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getRetireEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLifecycleStageAccess().getRetireEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLifecycleStage"


    // $ANTLR start "ruleMIType"
    // InternalBomi.g:2709:1: ruleMIType returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) ) ;
    public final Enumerator ruleMIType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBomi.g:2715:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) ) )
            // InternalBomi.g:2716:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) )
            {
            // InternalBomi.g:2716:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) )
            int alt80=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt80=1;
                }
                break;
            case 84:
                {
                alt80=2;
                }
                break;
            case 85:
                {
                alt80=3;
                }
                break;
            case 86:
                {
                alt80=4;
                }
                break;
            case 87:
                {
                alt80=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalBomi.g:2717:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2717:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2718:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2725:3: (enumLiteral_1= 'Teams' )
                    {
                    // InternalBomi.g:2725:3: (enumLiteral_1= 'Teams' )
                    // InternalBomi.g:2726:4: enumLiteral_1= 'Teams'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2733:3: (enumLiteral_2= 'Silos' )
                    {
                    // InternalBomi.g:2733:3: (enumLiteral_2= 'Silos' )
                    // InternalBomi.g:2734:4: enumLiteral_2= 'Silos'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2741:3: (enumLiteral_3= 'Departments' )
                    {
                    // InternalBomi.g:2741:3: (enumLiteral_3= 'Departments' )
                    // InternalBomi.g:2742:4: enumLiteral_3= 'Departments'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:2749:3: (enumLiteral_4= 'Organizations' )
                    {
                    // InternalBomi.g:2749:3: (enumLiteral_4= 'Organizations' )
                    // InternalBomi.g:2750:4: enumLiteral_4= 'Organizations'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getOrganizationsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMITypeAccess().getOrganizationsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMIType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003F8002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001FF81C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001FF01C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001FE01C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001FC01C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001F801C000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001F001C000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000310L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000001E001C000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000001C001C000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000018001C000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000010001C000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001FFF000804000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001FFF000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x000000000001FC10L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001FFE000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001FFC000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001FF8000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001FF0000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001FE0000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001FC0000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E2010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001F80000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001F00000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001E00000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001C00000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001800000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000C000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000000000F84C000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000000000F04C000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000000000E04C000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000000000C04C000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000000000804C000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F00010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x060000000088C000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x060000000008C000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x040000000008C000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xF000000000004000L,0x000000000000000FL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0xE000000000004000L,0x000000000000000FL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0xC000000000004000L,0x000000000000000FL});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000000000004000L,0x000000000000000FL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004000L,0x000000000000000FL});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000004000L,0x000000000000000CL});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000008L});

}