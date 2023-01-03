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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boundaryObjects'", "'{'", "','", "'}'", "'methodologicalIslands'", "'governanceTeams'", "'roles'", "'drivers'", "'BoundaryObject'", "'superType'", "'purpose'", "'levelOfDetail'", "'frequencyOfChange'", "'modularity'", "'maintainability'", "'prescriptive'", "'lifecycleStage'", "'representationFormat'", "'tooling'", "'versioning'", "'upToDate'", "'internalConsistency'", "'externalConsistency'", "'MethodologicalIsland'", "'type'", "'GovernanceTeam'", "'Role'", "'partOfGovernanceTeams'", "'('", "')'", "'partOfMIs'", "'Driver'", "'driverType'", "'distanceType'", "'distanceSize'", "'drivesMIs'", "'BOMICoordination'", "'accessability'", "'stability'", "'criticality'", "'fitForPurpose'", "'BORoleInteraction'", "'responsible'", "'creates'", "'reads'", "'updates'", "'deletes'", "'BOTeamGovernance'", "'coordinationMechanism'", "'frequencyOfCoordination'", "'NOT_SET'", "'High'", "'Medium'", "'Low'", "'True'", "'False'", "'Standard'", "'Technology'", "'Task'", "'Planning'", "'Value'", "'Product'", "'Other'", "'Operation'", "'Deprecate'", "'Retire'", "'Teams'", "'Silos'", "'Departments'", "'Organizations'", "'Process'", "'Organizational'", "'Cultural'", "'Geographical'"
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
    // InternalBomi.g:72:1: ruleBOMIModel returns [EObject current=null] : ( () (otherlv_1= 'boundaryObjects' otherlv_2= '{' ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) ) (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )* otherlv_6= '}' )? (otherlv_7= 'methodologicalIslands' otherlv_8= '{' ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) ) (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )* otherlv_12= '}' )? (otherlv_13= 'governanceTeams' otherlv_14= '{' ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) ) (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )* otherlv_18= '}' )? (otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' )? (otherlv_25= 'drivers' otherlv_26= '{' ( (lv_drivers_27_0= ruleDriver ) ) (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )* otherlv_30= '}' )? ( ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) ) (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )* )? ( ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) ) (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )* )? ( ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) ) (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )* )? ) ;
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
        Token otherlv_32=null;
        Token otherlv_35=null;
        Token otherlv_38=null;
        EObject lv_boundaryObjects_3_0 = null;

        EObject lv_boundaryObjects_5_0 = null;

        EObject lv_methodologicalIslands_9_0 = null;

        EObject lv_methodologicalIslands_11_0 = null;

        EObject lv_governanceTeams_15_0 = null;

        EObject lv_governanceTeams_17_0 = null;

        EObject lv_roles_21_0 = null;

        EObject lv_roles_23_0 = null;

        EObject lv_drivers_27_0 = null;

        EObject lv_drivers_29_0 = null;

        EObject lv_boMiCoordinations_31_0 = null;

        EObject lv_boMiCoordinations_33_0 = null;

        EObject lv_boRoleInteractions_34_0 = null;

        EObject lv_boRoleInteractions_36_0 = null;

        EObject lv_boTeamGovernances_37_0 = null;

        EObject lv_boTeamGovernances_39_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:78:2: ( ( () (otherlv_1= 'boundaryObjects' otherlv_2= '{' ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) ) (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )* otherlv_6= '}' )? (otherlv_7= 'methodologicalIslands' otherlv_8= '{' ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) ) (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )* otherlv_12= '}' )? (otherlv_13= 'governanceTeams' otherlv_14= '{' ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) ) (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )* otherlv_18= '}' )? (otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' )? (otherlv_25= 'drivers' otherlv_26= '{' ( (lv_drivers_27_0= ruleDriver ) ) (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )* otherlv_30= '}' )? ( ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) ) (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )* )? ( ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) ) (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )* )? ( ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) ) (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )* )? ) )
            // InternalBomi.g:79:2: ( () (otherlv_1= 'boundaryObjects' otherlv_2= '{' ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) ) (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )* otherlv_6= '}' )? (otherlv_7= 'methodologicalIslands' otherlv_8= '{' ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) ) (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )* otherlv_12= '}' )? (otherlv_13= 'governanceTeams' otherlv_14= '{' ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) ) (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )* otherlv_18= '}' )? (otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' )? (otherlv_25= 'drivers' otherlv_26= '{' ( (lv_drivers_27_0= ruleDriver ) ) (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )* otherlv_30= '}' )? ( ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) ) (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )* )? ( ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) ) (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )* )? ( ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) ) (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )* )? )
            {
            // InternalBomi.g:79:2: ( () (otherlv_1= 'boundaryObjects' otherlv_2= '{' ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) ) (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )* otherlv_6= '}' )? (otherlv_7= 'methodologicalIslands' otherlv_8= '{' ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) ) (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )* otherlv_12= '}' )? (otherlv_13= 'governanceTeams' otherlv_14= '{' ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) ) (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )* otherlv_18= '}' )? (otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' )? (otherlv_25= 'drivers' otherlv_26= '{' ( (lv_drivers_27_0= ruleDriver ) ) (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )* otherlv_30= '}' )? ( ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) ) (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )* )? ( ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) ) (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )* )? ( ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) ) (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )* )? )
            // InternalBomi.g:80:3: () (otherlv_1= 'boundaryObjects' otherlv_2= '{' ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) ) (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )* otherlv_6= '}' )? (otherlv_7= 'methodologicalIslands' otherlv_8= '{' ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) ) (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )* otherlv_12= '}' )? (otherlv_13= 'governanceTeams' otherlv_14= '{' ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) ) (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )* otherlv_18= '}' )? (otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' )? (otherlv_25= 'drivers' otherlv_26= '{' ( (lv_drivers_27_0= ruleDriver ) ) (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )* otherlv_30= '}' )? ( ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) ) (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )* )? ( ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) ) (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )* )? ( ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) ) (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )* )?
            {
            // InternalBomi.g:80:3: ()
            // InternalBomi.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOMIModelAccess().getBOMIModelAction_0(),
            					current);
            			

            }

            // InternalBomi.g:87:3: (otherlv_1= 'boundaryObjects' otherlv_2= '{' ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) ) (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )* otherlv_6= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBomi.g:88:4: otherlv_1= 'boundaryObjects' otherlv_2= '{' ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) ) (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )* otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBOMIModelAccess().getBoundaryObjectsKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalBomi.g:96:4: ( (lv_boundaryObjects_3_0= ruleBoundaryObject ) )
                    // InternalBomi.g:97:5: (lv_boundaryObjects_3_0= ruleBoundaryObject )
                    {
                    // InternalBomi.g:97:5: (lv_boundaryObjects_3_0= ruleBoundaryObject )
                    // InternalBomi.g:98:6: lv_boundaryObjects_3_0= ruleBoundaryObject
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_boundaryObjects_3_0=ruleBoundaryObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boundaryObjects",
                    							lv_boundaryObjects_3_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BoundaryObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:115:4: (otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBomi.g:116:5: otherlv_4= ',' ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBOMIModelAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalBomi.g:120:5: ( (lv_boundaryObjects_5_0= ruleBoundaryObject ) )
                    	    // InternalBomi.g:121:6: (lv_boundaryObjects_5_0= ruleBoundaryObject )
                    	    {
                    	    // InternalBomi.g:121:6: (lv_boundaryObjects_5_0= ruleBoundaryObject )
                    	    // InternalBomi.g:122:7: lv_boundaryObjects_5_0= ruleBoundaryObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoundaryObjectsBoundaryObjectParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_boundaryObjects_5_0=ruleBoundaryObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boundaryObjects",
                    	    								lv_boundaryObjects_5_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.BoundaryObject");
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

            // InternalBomi.g:145:3: (otherlv_7= 'methodologicalIslands' otherlv_8= '{' ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) ) (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBomi.g:146:4: otherlv_7= 'methodologicalIslands' otherlv_8= '{' ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) ) (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getBOMIModelAccess().getMethodologicalIslandsKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalBomi.g:154:4: ( (lv_methodologicalIslands_9_0= ruleMethodologicalIsland ) )
                    // InternalBomi.g:155:5: (lv_methodologicalIslands_9_0= ruleMethodologicalIsland )
                    {
                    // InternalBomi.g:155:5: (lv_methodologicalIslands_9_0= ruleMethodologicalIsland )
                    // InternalBomi.g:156:6: lv_methodologicalIslands_9_0= ruleMethodologicalIsland
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_methodologicalIslands_9_0=ruleMethodologicalIsland();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"methodologicalIslands",
                    							lv_methodologicalIslands_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MethodologicalIsland");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:173:4: (otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBomi.g:174:5: otherlv_10= ',' ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getBOMIModelAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalBomi.g:178:5: ( (lv_methodologicalIslands_11_0= ruleMethodologicalIsland ) )
                    	    // InternalBomi.g:179:6: (lv_methodologicalIslands_11_0= ruleMethodologicalIsland )
                    	    {
                    	    // InternalBomi.g:179:6: (lv_methodologicalIslands_11_0= ruleMethodologicalIsland )
                    	    // InternalBomi.g:180:7: lv_methodologicalIslands_11_0= ruleMethodologicalIsland
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getMethodologicalIslandsMethodologicalIslandParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_methodologicalIslands_11_0=ruleMethodologicalIsland();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methodologicalIslands",
                    	    								lv_methodologicalIslands_11_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.MethodologicalIsland");
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

            // InternalBomi.g:203:3: (otherlv_13= 'governanceTeams' otherlv_14= '{' ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) ) (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBomi.g:204:4: otherlv_13= 'governanceTeams' otherlv_14= '{' ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) ) (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getBOMIModelAccess().getGovernanceTeamsKeyword_3_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBomi.g:212:4: ( (lv_governanceTeams_15_0= ruleGovernanceTeam ) )
                    // InternalBomi.g:213:5: (lv_governanceTeams_15_0= ruleGovernanceTeam )
                    {
                    // InternalBomi.g:213:5: (lv_governanceTeams_15_0= ruleGovernanceTeam )
                    // InternalBomi.g:214:6: lv_governanceTeams_15_0= ruleGovernanceTeam
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_governanceTeams_15_0=ruleGovernanceTeam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"governanceTeams",
                    							lv_governanceTeams_15_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.GovernanceTeam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:231:4: (otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBomi.g:232:5: otherlv_16= ',' ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBOMIModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBomi.g:236:5: ( (lv_governanceTeams_17_0= ruleGovernanceTeam ) )
                    	    // InternalBomi.g:237:6: (lv_governanceTeams_17_0= ruleGovernanceTeam )
                    	    {
                    	    // InternalBomi.g:237:6: (lv_governanceTeams_17_0= ruleGovernanceTeam )
                    	    // InternalBomi.g:238:7: lv_governanceTeams_17_0= ruleGovernanceTeam
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getGovernanceTeamsGovernanceTeamParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_governanceTeams_17_0=ruleGovernanceTeam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"governanceTeams",
                    	    								lv_governanceTeams_17_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.GovernanceTeam");
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

            // InternalBomi.g:261:3: (otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBomi.g:262:4: otherlv_19= 'roles' otherlv_20= '{' ( (lv_roles_21_0= ruleRole ) ) (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getBOMIModelAccess().getRolesKeyword_4_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBomi.g:270:4: ( (lv_roles_21_0= ruleRole ) )
                    // InternalBomi.g:271:5: (lv_roles_21_0= ruleRole )
                    {
                    // InternalBomi.g:271:5: (lv_roles_21_0= ruleRole )
                    // InternalBomi.g:272:6: lv_roles_21_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_roles_21_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"roles",
                    							lv_roles_21_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:289:4: (otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBomi.g:290:5: otherlv_22= ',' ( (lv_roles_23_0= ruleRole ) )
                    	    {
                    	    otherlv_22=(Token)match(input,13,FOLLOW_11); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getBOMIModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBomi.g:294:5: ( (lv_roles_23_0= ruleRole ) )
                    	    // InternalBomi.g:295:6: (lv_roles_23_0= ruleRole )
                    	    {
                    	    // InternalBomi.g:295:6: (lv_roles_23_0= ruleRole )
                    	    // InternalBomi.g:296:7: lv_roles_23_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getRolesRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_roles_23_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roles",
                    	    								lv_roles_23_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.Role");
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

            // InternalBomi.g:319:3: (otherlv_25= 'drivers' otherlv_26= '{' ( (lv_drivers_27_0= ruleDriver ) ) (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )* otherlv_30= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBomi.g:320:4: otherlv_25= 'drivers' otherlv_26= '{' ( (lv_drivers_27_0= ruleDriver ) ) (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getBOMIModelAccess().getDriversKeyword_5_0());
                    			
                    otherlv_26=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getBOMIModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBomi.g:328:4: ( (lv_drivers_27_0= ruleDriver ) )
                    // InternalBomi.g:329:5: (lv_drivers_27_0= ruleDriver )
                    {
                    // InternalBomi.g:329:5: (lv_drivers_27_0= ruleDriver )
                    // InternalBomi.g:330:6: lv_drivers_27_0= ruleDriver
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_drivers_27_0=ruleDriver();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"drivers",
                    							lv_drivers_27_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.Driver");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:347:4: (otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBomi.g:348:5: otherlv_28= ',' ( (lv_drivers_29_0= ruleDriver ) )
                    	    {
                    	    otherlv_28=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getBOMIModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBomi.g:352:5: ( (lv_drivers_29_0= ruleDriver ) )
                    	    // InternalBomi.g:353:6: (lv_drivers_29_0= ruleDriver )
                    	    {
                    	    // InternalBomi.g:353:6: (lv_drivers_29_0= ruleDriver )
                    	    // InternalBomi.g:354:7: lv_drivers_29_0= ruleDriver
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getDriversDriverParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_drivers_29_0=ruleDriver();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"drivers",
                    	    								lv_drivers_29_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.Driver");
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

            // InternalBomi.g:377:3: ( ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) ) (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBomi.g:378:4: ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) ) (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )*
                    {
                    // InternalBomi.g:378:4: ( (lv_boMiCoordinations_31_0= ruleBOMICoordination ) )
                    // InternalBomi.g:379:5: (lv_boMiCoordinations_31_0= ruleBOMICoordination )
                    {
                    // InternalBomi.g:379:5: (lv_boMiCoordinations_31_0= ruleBOMICoordination )
                    // InternalBomi.g:380:6: lv_boMiCoordinations_31_0= ruleBOMICoordination
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_boMiCoordinations_31_0=ruleBOMICoordination();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boMiCoordinations",
                    							lv_boMiCoordinations_31_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BOMICoordination");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:397:4: (otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBomi.g:398:5: otherlv_32= ',' ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) )
                    	    {
                    	    otherlv_32=(Token)match(input,13,FOLLOW_16); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getBOMIModelAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalBomi.g:402:5: ( (lv_boMiCoordinations_33_0= ruleBOMICoordination ) )
                    	    // InternalBomi.g:403:6: (lv_boMiCoordinations_33_0= ruleBOMICoordination )
                    	    {
                    	    // InternalBomi.g:403:6: (lv_boMiCoordinations_33_0= ruleBOMICoordination )
                    	    // InternalBomi.g:404:7: lv_boMiCoordinations_33_0= ruleBOMICoordination
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoMiCoordinationsBOMICoordinationParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_boMiCoordinations_33_0=ruleBOMICoordination();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boMiCoordinations",
                    	    								lv_boMiCoordinations_33_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.BOMICoordination");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBomi.g:423:3: ( ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) ) (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBomi.g:424:4: ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) ) (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )*
                    {
                    // InternalBomi.g:424:4: ( (lv_boRoleInteractions_34_0= ruleBORoleInteraction ) )
                    // InternalBomi.g:425:5: (lv_boRoleInteractions_34_0= ruleBORoleInteraction )
                    {
                    // InternalBomi.g:425:5: (lv_boRoleInteractions_34_0= ruleBORoleInteraction )
                    // InternalBomi.g:426:6: lv_boRoleInteractions_34_0= ruleBORoleInteraction
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_boRoleInteractions_34_0=ruleBORoleInteraction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boRoleInteractions",
                    							lv_boRoleInteractions_34_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BORoleInteraction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:443:4: (otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBomi.g:444:5: otherlv_35= ',' ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) )
                    	    {
                    	    otherlv_35=(Token)match(input,13,FOLLOW_18); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getBOMIModelAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalBomi.g:448:5: ( (lv_boRoleInteractions_36_0= ruleBORoleInteraction ) )
                    	    // InternalBomi.g:449:6: (lv_boRoleInteractions_36_0= ruleBORoleInteraction )
                    	    {
                    	    // InternalBomi.g:449:6: (lv_boRoleInteractions_36_0= ruleBORoleInteraction )
                    	    // InternalBomi.g:450:7: lv_boRoleInteractions_36_0= ruleBORoleInteraction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoRoleInteractionsBORoleInteractionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_boRoleInteractions_36_0=ruleBORoleInteraction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"boRoleInteractions",
                    	    								lv_boRoleInteractions_36_0,
                    	    								"se.gu.cse.idxse.bomi.text.Bomi.BORoleInteraction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBomi.g:469:3: ( ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) ) (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==58) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBomi.g:470:4: ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) ) (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )*
                    {
                    // InternalBomi.g:470:4: ( (lv_boTeamGovernances_37_0= ruleBOTeamGovernance ) )
                    // InternalBomi.g:471:5: (lv_boTeamGovernances_37_0= ruleBOTeamGovernance )
                    {
                    // InternalBomi.g:471:5: (lv_boTeamGovernances_37_0= ruleBOTeamGovernance )
                    // InternalBomi.g:472:6: lv_boTeamGovernances_37_0= ruleBOTeamGovernance
                    {

                    						newCompositeNode(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_boTeamGovernances_37_0=ruleBOTeamGovernance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBOMIModelRule());
                    						}
                    						add(
                    							current,
                    							"boTeamGovernances",
                    							lv_boTeamGovernances_37_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BOTeamGovernance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:489:4: (otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==13) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBomi.g:490:5: otherlv_38= ',' ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) )
                    	    {
                    	    otherlv_38=(Token)match(input,13,FOLLOW_20); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getBOMIModelAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalBomi.g:494:5: ( (lv_boTeamGovernances_39_0= ruleBOTeamGovernance ) )
                    	    // InternalBomi.g:495:6: (lv_boTeamGovernances_39_0= ruleBOTeamGovernance )
                    	    {
                    	    // InternalBomi.g:495:6: (lv_boTeamGovernances_39_0= ruleBOTeamGovernance )
                    	    // InternalBomi.g:496:7: lv_boTeamGovernances_39_0= ruleBOTeamGovernance
                    	    {

                    	    							newCompositeNode(grammarAccess.getBOMIModelAccess().getBoTeamGovernancesBOTeamGovernanceParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


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


    // $ANTLR start "entryRuleBoundaryObject"
    // InternalBomi.g:519:1: entryRuleBoundaryObject returns [EObject current=null] : iv_ruleBoundaryObject= ruleBoundaryObject EOF ;
    public final EObject entryRuleBoundaryObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryObject = null;


        try {
            // InternalBomi.g:519:55: (iv_ruleBoundaryObject= ruleBoundaryObject EOF )
            // InternalBomi.g:520:2: iv_ruleBoundaryObject= ruleBoundaryObject EOF
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
    // InternalBomi.g:526:1: ruleBoundaryObject returns [EObject current=null] : ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'superType' ( (lv_superType_5_0= ruleBOSuperTypes ) ) )? (otherlv_6= 'purpose' ( (lv_purpose_7_0= ruleEString ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' ) ;
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

        Enumerator lv_superType_5_0 = null;

        AntlrDatatypeRuleToken lv_purpose_7_0 = null;

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
            // InternalBomi.g:532:2: ( ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'superType' ( (lv_superType_5_0= ruleBOSuperTypes ) ) )? (otherlv_6= 'purpose' ( (lv_purpose_7_0= ruleEString ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' ) )
            // InternalBomi.g:533:2: ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'superType' ( (lv_superType_5_0= ruleBOSuperTypes ) ) )? (otherlv_6= 'purpose' ( (lv_purpose_7_0= ruleEString ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' )
            {
            // InternalBomi.g:533:2: ( () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'superType' ( (lv_superType_5_0= ruleBOSuperTypes ) ) )? (otherlv_6= 'purpose' ( (lv_purpose_7_0= ruleEString ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}' )
            // InternalBomi.g:534:3: () otherlv_1= 'BoundaryObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'superType' ( (lv_superType_5_0= ruleBOSuperTypes ) ) )? (otherlv_6= 'purpose' ( (lv_purpose_7_0= ruleEString ) ) )? (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )? (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )? (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )? (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )? (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )? (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )? (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )? (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )? (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )? (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )? (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )? (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )? otherlv_32= '}'
            {
            // InternalBomi.g:534:3: ()
            // InternalBomi.g:535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundaryObjectAccess().getBoundaryObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryObjectAccess().getBoundaryObjectKeyword_1());
            		
            // InternalBomi.g:545:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:546:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:546:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:547:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getBoundaryObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:568:3: (otherlv_4= 'superType' ( (lv_superType_5_0= ruleBOSuperTypes ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBomi.g:569:4: otherlv_4= 'superType' ( (lv_superType_5_0= ruleBOSuperTypes ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getBoundaryObjectAccess().getSuperTypeKeyword_4_0());
                    			
                    // InternalBomi.g:573:4: ( (lv_superType_5_0= ruleBOSuperTypes ) )
                    // InternalBomi.g:574:5: (lv_superType_5_0= ruleBOSuperTypes )
                    {
                    // InternalBomi.g:574:5: (lv_superType_5_0= ruleBOSuperTypes )
                    // InternalBomi.g:575:6: lv_superType_5_0= ruleBOSuperTypes
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getSuperTypeBOSuperTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_superType_5_0=ruleBOSuperTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"superType",
                    							lv_superType_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.BOSuperTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:593:3: (otherlv_6= 'purpose' ( (lv_purpose_7_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBomi.g:594:4: otherlv_6= 'purpose' ( (lv_purpose_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getBoundaryObjectAccess().getPurposeKeyword_5_0());
                    			
                    // InternalBomi.g:598:4: ( (lv_purpose_7_0= ruleEString ) )
                    // InternalBomi.g:599:5: (lv_purpose_7_0= ruleEString )
                    {
                    // InternalBomi.g:599:5: (lv_purpose_7_0= ruleEString )
                    // InternalBomi.g:600:6: lv_purpose_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getPurposeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_purpose_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoundaryObjectRule());
                    						}
                    						set(
                    							current,
                    							"purpose",
                    							lv_purpose_7_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:618:3: (otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBomi.g:619:4: otherlv_8= 'levelOfDetail' ( (lv_levelOfDetail_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getBoundaryObjectAccess().getLevelOfDetailKeyword_6_0());
                    			
                    // InternalBomi.g:623:4: ( (lv_levelOfDetail_9_0= ruleHighLow ) )
                    // InternalBomi.g:624:5: (lv_levelOfDetail_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:624:5: (lv_levelOfDetail_9_0= ruleHighLow )
                    // InternalBomi.g:625:6: lv_levelOfDetail_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getLevelOfDetailHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalBomi.g:643:3: (otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBomi.g:644:4: otherlv_10= 'frequencyOfChange' ( (lv_frequencyOfChange_11_0= ruleHighLow ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeKeyword_7_0());
                    			
                    // InternalBomi.g:648:4: ( (lv_frequencyOfChange_11_0= ruleHighLow ) )
                    // InternalBomi.g:649:5: (lv_frequencyOfChange_11_0= ruleHighLow )
                    {
                    // InternalBomi.g:649:5: (lv_frequencyOfChange_11_0= ruleHighLow )
                    // InternalBomi.g:650:6: lv_frequencyOfChange_11_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getFrequencyOfChangeHighLowEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalBomi.g:668:3: (otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBomi.g:669:4: otherlv_12= 'modularity' ( (lv_modularity_13_0= ruleHighLow ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_26); 

                    				newLeafNode(otherlv_12, grammarAccess.getBoundaryObjectAccess().getModularityKeyword_8_0());
                    			
                    // InternalBomi.g:673:4: ( (lv_modularity_13_0= ruleHighLow ) )
                    // InternalBomi.g:674:5: (lv_modularity_13_0= ruleHighLow )
                    {
                    // InternalBomi.g:674:5: (lv_modularity_13_0= ruleHighLow )
                    // InternalBomi.g:675:6: lv_modularity_13_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getModularityHighLowEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

            // InternalBomi.g:693:3: (otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBomi.g:694:4: otherlv_14= 'maintainability' ( (lv_maintainability_15_0= ruleHighLow ) )
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getBoundaryObjectAccess().getMaintainabilityKeyword_9_0());
                    			
                    // InternalBomi.g:698:4: ( (lv_maintainability_15_0= ruleHighLow ) )
                    // InternalBomi.g:699:5: (lv_maintainability_15_0= ruleHighLow )
                    {
                    // InternalBomi.g:699:5: (lv_maintainability_15_0= ruleHighLow )
                    // InternalBomi.g:700:6: lv_maintainability_15_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getMaintainabilityHighLowEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalBomi.g:718:3: (otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBomi.g:719:4: otherlv_16= 'prescriptive' ( (lv_prescriptive_17_0= ruleHighLow ) )
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getBoundaryObjectAccess().getPrescriptiveKeyword_10_0());
                    			
                    // InternalBomi.g:723:4: ( (lv_prescriptive_17_0= ruleHighLow ) )
                    // InternalBomi.g:724:5: (lv_prescriptive_17_0= ruleHighLow )
                    {
                    // InternalBomi.g:724:5: (lv_prescriptive_17_0= ruleHighLow )
                    // InternalBomi.g:725:6: lv_prescriptive_17_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getPrescriptiveHighLowEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            // InternalBomi.g:743:3: (otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBomi.g:744:4: otherlv_18= 'lifecycleStage' ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) )
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_32); 

                    				newLeafNode(otherlv_18, grammarAccess.getBoundaryObjectAccess().getLifecycleStageKeyword_11_0());
                    			
                    // InternalBomi.g:748:4: ( (lv_lifecycleStage_19_0= ruleLifecycleStage ) )
                    // InternalBomi.g:749:5: (lv_lifecycleStage_19_0= ruleLifecycleStage )
                    {
                    // InternalBomi.g:749:5: (lv_lifecycleStage_19_0= ruleLifecycleStage )
                    // InternalBomi.g:750:6: lv_lifecycleStage_19_0= ruleLifecycleStage
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getLifecycleStageLifecycleStageEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalBomi.g:768:3: (otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBomi.g:769:4: otherlv_20= 'representationFormat' ( (lv_representationFormat_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getBoundaryObjectAccess().getRepresentationFormatKeyword_12_0());
                    			
                    // InternalBomi.g:773:4: ( (lv_representationFormat_21_0= ruleEString ) )
                    // InternalBomi.g:774:5: (lv_representationFormat_21_0= ruleEString )
                    {
                    // InternalBomi.g:774:5: (lv_representationFormat_21_0= ruleEString )
                    // InternalBomi.g:775:6: lv_representationFormat_21_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getRepresentationFormatEStringParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

            // InternalBomi.g:793:3: (otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBomi.g:794:4: otherlv_22= 'tooling' ( (lv_tooling_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_22, grammarAccess.getBoundaryObjectAccess().getToolingKeyword_13_0());
                    			
                    // InternalBomi.g:798:4: ( (lv_tooling_23_0= ruleEString ) )
                    // InternalBomi.g:799:5: (lv_tooling_23_0= ruleEString )
                    {
                    // InternalBomi.g:799:5: (lv_tooling_23_0= ruleEString )
                    // InternalBomi.g:800:6: lv_tooling_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getToolingEStringParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalBomi.g:818:3: (otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBomi.g:819:4: otherlv_24= 'versioning' ( (lv_versioning_25_0= ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_24, grammarAccess.getBoundaryObjectAccess().getVersioningKeyword_14_0());
                    			
                    // InternalBomi.g:823:4: ( (lv_versioning_25_0= ruleEString ) )
                    // InternalBomi.g:824:5: (lv_versioning_25_0= ruleEString )
                    {
                    // InternalBomi.g:824:5: (lv_versioning_25_0= ruleEString )
                    // InternalBomi.g:825:6: lv_versioning_25_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getVersioningEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalBomi.g:843:3: (otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBomi.g:844:4: otherlv_26= 'upToDate' ( (lv_upToDate_27_0= ruleEString ) )
                    {
                    otherlv_26=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_26, grammarAccess.getBoundaryObjectAccess().getUpToDateKeyword_15_0());
                    			
                    // InternalBomi.g:848:4: ( (lv_upToDate_27_0= ruleEString ) )
                    // InternalBomi.g:849:5: (lv_upToDate_27_0= ruleEString )
                    {
                    // InternalBomi.g:849:5: (lv_upToDate_27_0= ruleEString )
                    // InternalBomi.g:850:6: lv_upToDate_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getUpToDateEStringParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalBomi.g:868:3: (otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBomi.g:869:4: otherlv_28= 'internalConsistency' ( (lv_internalConsistency_29_0= ruleHighLow ) )
                    {
                    otherlv_28=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_28, grammarAccess.getBoundaryObjectAccess().getInternalConsistencyKeyword_16_0());
                    			
                    // InternalBomi.g:873:4: ( (lv_internalConsistency_29_0= ruleHighLow ) )
                    // InternalBomi.g:874:5: (lv_internalConsistency_29_0= ruleHighLow )
                    {
                    // InternalBomi.g:874:5: (lv_internalConsistency_29_0= ruleHighLow )
                    // InternalBomi.g:875:6: lv_internalConsistency_29_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getInternalConsistencyHighLowEnumRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalBomi.g:893:3: (otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBomi.g:894:4: otherlv_30= 'externalConsistency' ( (lv_externalConsistency_31_0= ruleHighLow ) )
                    {
                    otherlv_30=(Token)match(input,33,FOLLOW_26); 

                    				newLeafNode(otherlv_30, grammarAccess.getBoundaryObjectAccess().getExternalConsistencyKeyword_17_0());
                    			
                    // InternalBomi.g:898:4: ( (lv_externalConsistency_31_0= ruleHighLow ) )
                    // InternalBomi.g:899:5: (lv_externalConsistency_31_0= ruleHighLow )
                    {
                    // InternalBomi.g:899:5: (lv_externalConsistency_31_0= ruleHighLow )
                    // InternalBomi.g:900:6: lv_externalConsistency_31_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBoundaryObjectAccess().getExternalConsistencyHighLowEnumRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_39);
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


    // $ANTLR start "entryRuleMethodologicalIsland"
    // InternalBomi.g:926:1: entryRuleMethodologicalIsland returns [EObject current=null] : iv_ruleMethodologicalIsland= ruleMethodologicalIsland EOF ;
    public final EObject entryRuleMethodologicalIsland() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodologicalIsland = null;


        try {
            // InternalBomi.g:926:61: (iv_ruleMethodologicalIsland= ruleMethodologicalIsland EOF )
            // InternalBomi.g:927:2: iv_ruleMethodologicalIsland= ruleMethodologicalIsland EOF
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
    // InternalBomi.g:933:1: ruleMethodologicalIsland returns [EObject current=null] : ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' ) ;
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
            // InternalBomi.g:939:2: ( ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' ) )
            // InternalBomi.g:940:2: ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' )
            {
            // InternalBomi.g:940:2: ( () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}' )
            // InternalBomi.g:941:3: () otherlv_1= 'MethodologicalIsland' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )? otherlv_6= '}'
            {
            // InternalBomi.g:941:3: ()
            // InternalBomi.g:942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodologicalIslandAccess().getMethodologicalIslandKeyword_1());
            		
            // InternalBomi.g:952:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:953:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:953:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:954:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodologicalIslandAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:975:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBomi.g:976:4: otherlv_4= 'type' ( (lv_type_5_0= ruleMIType ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodologicalIslandAccess().getTypeKeyword_4_0());
                    			
                    // InternalBomi.g:980:4: ( (lv_type_5_0= ruleMIType ) )
                    // InternalBomi.g:981:5: (lv_type_5_0= ruleMIType )
                    {
                    // InternalBomi.g:981:5: (lv_type_5_0= ruleMIType )
                    // InternalBomi.g:982:6: lv_type_5_0= ruleMIType
                    {

                    						newCompositeNode(grammarAccess.getMethodologicalIslandAccess().getTypeMITypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
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
    // InternalBomi.g:1008:1: entryRuleGovernanceTeam returns [EObject current=null] : iv_ruleGovernanceTeam= ruleGovernanceTeam EOF ;
    public final EObject entryRuleGovernanceTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceTeam = null;


        try {
            // InternalBomi.g:1008:55: (iv_ruleGovernanceTeam= ruleGovernanceTeam EOF )
            // InternalBomi.g:1009:2: iv_ruleGovernanceTeam= ruleGovernanceTeam EOF
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
    // InternalBomi.g:1015:1: ruleGovernanceTeam returns [EObject current=null] : ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleGovernanceTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:1021:2: ( ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBomi.g:1022:2: ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBomi.g:1022:2: ( () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) ) )
            // InternalBomi.g:1023:3: () otherlv_1= 'GovernanceTeam' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBomi.g:1023:3: ()
            // InternalBomi.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGovernanceTeamAccess().getGovernanceTeamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGovernanceTeamAccess().getGovernanceTeamKeyword_1());
            		
            // InternalBomi.g:1034:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1035:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1035:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1036:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleRole"
    // InternalBomi.g:1057:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalBomi.g:1057:45: (iv_ruleRole= ruleRole EOF )
            // InternalBomi.g:1058:2: iv_ruleRole= ruleRole EOF
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
    // InternalBomi.g:1064:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalBomi.g:1070:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalBomi.g:1071:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalBomi.g:1071:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalBomi.g:1072:3: () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalBomi.g:1072:3: ()
            // InternalBomi.g:1073:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalBomi.g:1083:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1084:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1084:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1085:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1106:3: (otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBomi.g:1107:4: otherlv_4= 'partOfGovernanceTeams' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getPartOfGovernanceTeamsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBomi.g:1115:4: ( ( ruleEString ) )
                    // InternalBomi.g:1116:5: ( ruleEString )
                    {
                    // InternalBomi.g:1116:5: ( ruleEString )
                    // InternalBomi.g:1117:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1131:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==13) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalBomi.g:1132:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBomi.g:1136:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1137:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1137:6: ( ruleEString )
                    	    // InternalBomi.g:1138:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getPartOfGovernanceTeamsGovernanceTeamCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,40,FOLLOW_45); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:1158:3: (otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBomi.g:1159:4: otherlv_10= 'partOfMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getPartOfMIsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBomi.g:1167:4: ( ( ruleEString ) )
                    // InternalBomi.g:1168:5: ( ruleEString )
                    {
                    // InternalBomi.g:1168:5: ( ruleEString )
                    // InternalBomi.g:1169:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1183:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==13) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalBomi.g:1184:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRoleAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBomi.g:1188:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1189:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1189:6: ( ruleEString )
                    	    // InternalBomi.g:1190:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getPartOfMIsMethodologicalIslandCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,40,FOLLOW_39); 

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


    // $ANTLR start "entryRuleDriver"
    // InternalBomi.g:1218:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // InternalBomi.g:1218:47: (iv_ruleDriver= ruleDriver EOF )
            // InternalBomi.g:1219:2: iv_ruleDriver= ruleDriver EOF
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
    // InternalBomi.g:1225:1: ruleDriver returns [EObject current=null] : ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverType' ( (lv_driverType_5_0= ruleDriverTypes ) ) )? (otherlv_6= 'distanceType' ( (lv_distanceType_7_0= ruleDistanceTypes ) ) )? (otherlv_8= 'distanceSize' ( (lv_distanceSize_9_0= ruleHighLow ) ) )? (otherlv_10= 'drivesMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleDriver() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_driverType_5_0 = null;

        Enumerator lv_distanceType_7_0 = null;

        Enumerator lv_distanceSize_9_0 = null;



        	enterRule();

        try {
            // InternalBomi.g:1231:2: ( ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverType' ( (lv_driverType_5_0= ruleDriverTypes ) ) )? (otherlv_6= 'distanceType' ( (lv_distanceType_7_0= ruleDistanceTypes ) ) )? (otherlv_8= 'distanceSize' ( (lv_distanceSize_9_0= ruleHighLow ) ) )? (otherlv_10= 'drivesMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalBomi.g:1232:2: ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverType' ( (lv_driverType_5_0= ruleDriverTypes ) ) )? (otherlv_6= 'distanceType' ( (lv_distanceType_7_0= ruleDistanceTypes ) ) )? (otherlv_8= 'distanceSize' ( (lv_distanceSize_9_0= ruleHighLow ) ) )? (otherlv_10= 'drivesMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalBomi.g:1232:2: ( () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverType' ( (lv_driverType_5_0= ruleDriverTypes ) ) )? (otherlv_6= 'distanceType' ( (lv_distanceType_7_0= ruleDistanceTypes ) ) )? (otherlv_8= 'distanceSize' ( (lv_distanceSize_9_0= ruleHighLow ) ) )? (otherlv_10= 'drivesMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalBomi.g:1233:3: () otherlv_1= 'Driver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driverType' ( (lv_driverType_5_0= ruleDriverTypes ) ) )? (otherlv_6= 'distanceType' ( (lv_distanceType_7_0= ruleDistanceTypes ) ) )? (otherlv_8= 'distanceSize' ( (lv_distanceSize_9_0= ruleHighLow ) ) )? (otherlv_10= 'drivesMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalBomi.g:1233:3: ()
            // InternalBomi.g:1234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDriverAccess().getDriverAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDriverAccess().getDriverKeyword_1());
            		
            // InternalBomi.g:1244:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1245:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1245:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1246:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1267:3: (otherlv_4= 'driverType' ( (lv_driverType_5_0= ruleDriverTypes ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBomi.g:1268:4: otherlv_4= 'driverType' ( (lv_driverType_5_0= ruleDriverTypes ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_47); 

                    				newLeafNode(otherlv_4, grammarAccess.getDriverAccess().getDriverTypeKeyword_4_0());
                    			
                    // InternalBomi.g:1272:4: ( (lv_driverType_5_0= ruleDriverTypes ) )
                    // InternalBomi.g:1273:5: (lv_driverType_5_0= ruleDriverTypes )
                    {
                    // InternalBomi.g:1273:5: (lv_driverType_5_0= ruleDriverTypes )
                    // InternalBomi.g:1274:6: lv_driverType_5_0= ruleDriverTypes
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDriverTypeDriverTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_driverType_5_0=ruleDriverTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"driverType",
                    							lv_driverType_5_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.DriverTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1292:3: (otherlv_6= 'distanceType' ( (lv_distanceType_7_0= ruleDistanceTypes ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBomi.g:1293:4: otherlv_6= 'distanceType' ( (lv_distanceType_7_0= ruleDistanceTypes ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_49); 

                    				newLeafNode(otherlv_6, grammarAccess.getDriverAccess().getDistanceTypeKeyword_5_0());
                    			
                    // InternalBomi.g:1297:4: ( (lv_distanceType_7_0= ruleDistanceTypes ) )
                    // InternalBomi.g:1298:5: (lv_distanceType_7_0= ruleDistanceTypes )
                    {
                    // InternalBomi.g:1298:5: (lv_distanceType_7_0= ruleDistanceTypes )
                    // InternalBomi.g:1299:6: lv_distanceType_7_0= ruleDistanceTypes
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDistanceTypeDistanceTypesEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_distanceType_7_0=ruleDistanceTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"distanceType",
                    							lv_distanceType_7_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.DistanceTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1317:3: (otherlv_8= 'distanceSize' ( (lv_distanceSize_9_0= ruleHighLow ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBomi.g:1318:4: otherlv_8= 'distanceSize' ( (lv_distanceSize_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getDriverAccess().getDistanceSizeKeyword_6_0());
                    			
                    // InternalBomi.g:1322:4: ( (lv_distanceSize_9_0= ruleHighLow ) )
                    // InternalBomi.g:1323:5: (lv_distanceSize_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:1323:5: (lv_distanceSize_9_0= ruleHighLow )
                    // InternalBomi.g:1324:6: lv_distanceSize_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getDriverAccess().getDistanceSizeHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_distanceSize_9_0=ruleHighLow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDriverRule());
                    						}
                    						set(
                    							current,
                    							"distanceSize",
                    							lv_distanceSize_9_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.HighLow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1342:3: (otherlv_10= 'drivesMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBomi.g:1343:4: otherlv_10= 'drivesMIs' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getDriverAccess().getDrivesMIsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getDriverAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalBomi.g:1351:4: ( ( ruleEString ) )
                    // InternalBomi.g:1352:5: ( ruleEString )
                    {
                    // InternalBomi.g:1352:5: ( ruleEString )
                    // InternalBomi.g:1353:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDriverRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1367:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==13) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalBomi.g:1368:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDriverAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBomi.g:1372:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1373:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1373:6: ( ruleEString )
                    	    // InternalBomi.g:1374:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDriverRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDriverAccess().getDrivesMIsMethodologicalIslandCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_15, grammarAccess.getDriverAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleBOMICoordination"
    // InternalBomi.g:1402:1: entryRuleBOMICoordination returns [EObject current=null] : iv_ruleBOMICoordination= ruleBOMICoordination EOF ;
    public final EObject entryRuleBOMICoordination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOMICoordination = null;


        try {
            // InternalBomi.g:1402:57: (iv_ruleBOMICoordination= ruleBOMICoordination EOF )
            // InternalBomi.g:1403:2: iv_ruleBOMICoordination= ruleBOMICoordination EOF
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
    // InternalBomi.g:1409:1: ruleBOMICoordination returns [EObject current=null] : ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' ) ;
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
            // InternalBomi.g:1415:2: ( ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' ) )
            // InternalBomi.g:1416:2: ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' )
            {
            // InternalBomi.g:1416:2: ( () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}' )
            // InternalBomi.g:1417:3: () otherlv_1= 'BOMICoordination' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= '}'
            {
            // InternalBomi.g:1417:3: ()
            // InternalBomi.g:1418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOMICoordinationAccess().getBOMICoordinationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBOMICoordinationAccess().getBOMICoordinationKeyword_1());
            		
            // InternalBomi.g:1428:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1429:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1429:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1430:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getBOMICoordinationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1451:3: (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBomi.g:1452:4: otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBOMICoordinationAccess().getPurposeKeyword_4_0());
                    			
                    // InternalBomi.g:1456:4: ( (lv_purpose_5_0= ruleEString ) )
                    // InternalBomi.g:1457:5: (lv_purpose_5_0= ruleEString )
                    {
                    // InternalBomi.g:1457:5: (lv_purpose_5_0= ruleEString )
                    // InternalBomi.g:1458:6: lv_purpose_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getPurposeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalBomi.g:1476:3: (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBomi.g:1477:4: otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getBOMICoordinationAccess().getAccessabilityKeyword_5_0());
                    			
                    // InternalBomi.g:1481:4: ( (lv_accessability_7_0= ruleHighLow ) )
                    // InternalBomi.g:1482:5: (lv_accessability_7_0= ruleHighLow )
                    {
                    // InternalBomi.g:1482:5: (lv_accessability_7_0= ruleHighLow )
                    // InternalBomi.g:1483:6: lv_accessability_7_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getAccessabilityHighLowEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_54);
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

            // InternalBomi.g:1501:3: (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBomi.g:1502:4: otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getBOMICoordinationAccess().getStabilityKeyword_6_0());
                    			
                    // InternalBomi.g:1506:4: ( (lv_stability_9_0= ruleHighLow ) )
                    // InternalBomi.g:1507:5: (lv_stability_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:1507:5: (lv_stability_9_0= ruleHighLow )
                    // InternalBomi.g:1508:6: lv_stability_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getStabilityHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            // InternalBomi.g:1526:3: (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBomi.g:1527:4: otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) )
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getBOMICoordinationAccess().getCriticalityKeyword_7_0());
                    			
                    // InternalBomi.g:1531:4: ( (lv_criticality_11_0= ruleHighLow ) )
                    // InternalBomi.g:1532:5: (lv_criticality_11_0= ruleHighLow )
                    {
                    // InternalBomi.g:1532:5: (lv_criticality_11_0= ruleHighLow )
                    // InternalBomi.g:1533:6: lv_criticality_11_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getCriticalityHighLowEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_56);
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

            // InternalBomi.g:1551:3: (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBomi.g:1552:4: otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    {
                    otherlv_12=(Token)match(input,51,FOLLOW_26); 

                    				newLeafNode(otherlv_12, grammarAccess.getBOMICoordinationAccess().getFitForPurposeKeyword_8_0());
                    			
                    // InternalBomi.g:1556:4: ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    // InternalBomi.g:1557:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    {
                    // InternalBomi.g:1557:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    // InternalBomi.g:1558:6: lv_fitForPurpose_13_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

            // InternalBomi.g:1576:3: (otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==11) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBomi.g:1577:4: otherlv_14= 'boundaryObjects' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,11,FOLLOW_43); 

                    				newLeafNode(otherlv_14, grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_15, grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalBomi.g:1585:4: ( ( ruleEString ) )
                    // InternalBomi.g:1586:5: ( ruleEString )
                    {
                    // InternalBomi.g:1586:5: ( ruleEString )
                    // InternalBomi.g:1587:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1601:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==13) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalBomi.g:1602:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getBOMICoordinationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBomi.g:1606:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1607:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1607:6: ( ruleEString )
                    	    // InternalBomi.g:1608:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOMICoordinationAccess().getBoundaryObjectsBoundaryObjectCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,40,FOLLOW_58); 

                    				newLeafNode(otherlv_19, grammarAccess.getBOMICoordinationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:1628:3: (otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBomi.g:1629:4: otherlv_20= 'methodologicalIslands' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_20, grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_21, grammarAccess.getBOMICoordinationAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalBomi.g:1637:4: ( ( ruleEString ) )
                    // InternalBomi.g:1638:5: ( ruleEString )
                    {
                    // InternalBomi.g:1638:5: ( ruleEString )
                    // InternalBomi.g:1639:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:1653:4: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==13) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalBomi.g:1654:5: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getBOMICoordinationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBomi.g:1658:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:1659:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:1659:6: ( ruleEString )
                    	    // InternalBomi.g:1660:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOMICoordinationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOMICoordinationAccess().getMethodologicalIslandsMethodologicalIslandCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,40,FOLLOW_39); 

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


    // $ANTLR start "entryRuleBORoleInteraction"
    // InternalBomi.g:1688:1: entryRuleBORoleInteraction returns [EObject current=null] : iv_ruleBORoleInteraction= ruleBORoleInteraction EOF ;
    public final EObject entryRuleBORoleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBORoleInteraction = null;


        try {
            // InternalBomi.g:1688:58: (iv_ruleBORoleInteraction= ruleBORoleInteraction EOF )
            // InternalBomi.g:1689:2: iv_ruleBORoleInteraction= ruleBORoleInteraction EOF
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
    // InternalBomi.g:1695:1: ruleBORoleInteraction returns [EObject current=null] : ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleMyBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleMyBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleMyBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleMyBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleMyBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' ) ;
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
            // InternalBomi.g:1701:2: ( ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleMyBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleMyBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleMyBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleMyBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleMyBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' ) )
            // InternalBomi.g:1702:2: ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleMyBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleMyBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleMyBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleMyBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleMyBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' )
            {
            // InternalBomi.g:1702:2: ( () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleMyBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleMyBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleMyBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleMyBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleMyBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}' )
            // InternalBomi.g:1703:3: () otherlv_1= 'BORoleInteraction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )? (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )? (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )? (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )? (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleMyBoolean ) ) )? (otherlv_16= 'creates' ( (lv_creates_17_0= ruleMyBoolean ) ) )? (otherlv_18= 'reads' ( (lv_reads_19_0= ruleMyBoolean ) ) )? (otherlv_20= 'updates' ( (lv_updates_21_0= ruleMyBoolean ) ) )? (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleMyBoolean ) ) )? (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )? otherlv_36= '}'
            {
            // InternalBomi.g:1703:3: ()
            // InternalBomi.g:1704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBORoleInteractionAccess().getBORoleInteractionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBORoleInteractionAccess().getBORoleInteractionKeyword_1());
            		
            // InternalBomi.g:1714:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:1715:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:1715:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:1716:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getBORoleInteractionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:1737:3: (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==21) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBomi.g:1738:4: otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBORoleInteractionAccess().getPurposeKeyword_4_0());
                    			
                    // InternalBomi.g:1742:4: ( (lv_purpose_5_0= ruleEString ) )
                    // InternalBomi.g:1743:5: (lv_purpose_5_0= ruleEString )
                    {
                    // InternalBomi.g:1743:5: (lv_purpose_5_0= ruleEString )
                    // InternalBomi.g:1744:6: lv_purpose_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getPurposeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            // InternalBomi.g:1762:3: (otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBomi.g:1763:4: otherlv_6= 'accessability' ( (lv_accessability_7_0= ruleHighLow ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getBORoleInteractionAccess().getAccessabilityKeyword_5_0());
                    			
                    // InternalBomi.g:1767:4: ( (lv_accessability_7_0= ruleHighLow ) )
                    // InternalBomi.g:1768:5: (lv_accessability_7_0= ruleHighLow )
                    {
                    // InternalBomi.g:1768:5: (lv_accessability_7_0= ruleHighLow )
                    // InternalBomi.g:1769:6: lv_accessability_7_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getAccessabilityHighLowEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            // InternalBomi.g:1787:3: (otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBomi.g:1788:4: otherlv_8= 'stability' ( (lv_stability_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getBORoleInteractionAccess().getStabilityKeyword_6_0());
                    			
                    // InternalBomi.g:1792:4: ( (lv_stability_9_0= ruleHighLow ) )
                    // InternalBomi.g:1793:5: (lv_stability_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:1793:5: (lv_stability_9_0= ruleHighLow )
                    // InternalBomi.g:1794:6: lv_stability_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getStabilityHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_62);
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

            // InternalBomi.g:1812:3: (otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBomi.g:1813:4: otherlv_10= 'criticality' ( (lv_criticality_11_0= ruleHighLow ) )
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getBORoleInteractionAccess().getCriticalityKeyword_7_0());
                    			
                    // InternalBomi.g:1817:4: ( (lv_criticality_11_0= ruleHighLow ) )
                    // InternalBomi.g:1818:5: (lv_criticality_11_0= ruleHighLow )
                    {
                    // InternalBomi.g:1818:5: (lv_criticality_11_0= ruleHighLow )
                    // InternalBomi.g:1819:6: lv_criticality_11_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getCriticalityHighLowEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalBomi.g:1837:3: (otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBomi.g:1838:4: otherlv_12= 'fitForPurpose' ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    {
                    otherlv_12=(Token)match(input,51,FOLLOW_26); 

                    				newLeafNode(otherlv_12, grammarAccess.getBORoleInteractionAccess().getFitForPurposeKeyword_8_0());
                    			
                    // InternalBomi.g:1842:4: ( (lv_fitForPurpose_13_0= ruleHighLow ) )
                    // InternalBomi.g:1843:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    {
                    // InternalBomi.g:1843:5: (lv_fitForPurpose_13_0= ruleHighLow )
                    // InternalBomi.g:1844:6: lv_fitForPurpose_13_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getFitForPurposeHighLowEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalBomi.g:1862:3: (otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleMyBoolean ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBomi.g:1863:4: otherlv_14= 'responsible' ( (lv_responsible_15_0= ruleMyBoolean ) )
                    {
                    otherlv_14=(Token)match(input,53,FOLLOW_65); 

                    				newLeafNode(otherlv_14, grammarAccess.getBORoleInteractionAccess().getResponsibleKeyword_9_0());
                    			
                    // InternalBomi.g:1867:4: ( (lv_responsible_15_0= ruleMyBoolean ) )
                    // InternalBomi.g:1868:5: (lv_responsible_15_0= ruleMyBoolean )
                    {
                    // InternalBomi.g:1868:5: (lv_responsible_15_0= ruleMyBoolean )
                    // InternalBomi.g:1869:6: lv_responsible_15_0= ruleMyBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getResponsibleMyBooleanEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_responsible_15_0=ruleMyBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"responsible",
                    							lv_responsible_15_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MyBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1887:3: (otherlv_16= 'creates' ( (lv_creates_17_0= ruleMyBoolean ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBomi.g:1888:4: otherlv_16= 'creates' ( (lv_creates_17_0= ruleMyBoolean ) )
                    {
                    otherlv_16=(Token)match(input,54,FOLLOW_65); 

                    				newLeafNode(otherlv_16, grammarAccess.getBORoleInteractionAccess().getCreatesKeyword_10_0());
                    			
                    // InternalBomi.g:1892:4: ( (lv_creates_17_0= ruleMyBoolean ) )
                    // InternalBomi.g:1893:5: (lv_creates_17_0= ruleMyBoolean )
                    {
                    // InternalBomi.g:1893:5: (lv_creates_17_0= ruleMyBoolean )
                    // InternalBomi.g:1894:6: lv_creates_17_0= ruleMyBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getCreatesMyBooleanEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_creates_17_0=ruleMyBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"creates",
                    							lv_creates_17_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MyBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1912:3: (otherlv_18= 'reads' ( (lv_reads_19_0= ruleMyBoolean ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBomi.g:1913:4: otherlv_18= 'reads' ( (lv_reads_19_0= ruleMyBoolean ) )
                    {
                    otherlv_18=(Token)match(input,55,FOLLOW_65); 

                    				newLeafNode(otherlv_18, grammarAccess.getBORoleInteractionAccess().getReadsKeyword_11_0());
                    			
                    // InternalBomi.g:1917:4: ( (lv_reads_19_0= ruleMyBoolean ) )
                    // InternalBomi.g:1918:5: (lv_reads_19_0= ruleMyBoolean )
                    {
                    // InternalBomi.g:1918:5: (lv_reads_19_0= ruleMyBoolean )
                    // InternalBomi.g:1919:6: lv_reads_19_0= ruleMyBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getReadsMyBooleanEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_reads_19_0=ruleMyBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"reads",
                    							lv_reads_19_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MyBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1937:3: (otherlv_20= 'updates' ( (lv_updates_21_0= ruleMyBoolean ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBomi.g:1938:4: otherlv_20= 'updates' ( (lv_updates_21_0= ruleMyBoolean ) )
                    {
                    otherlv_20=(Token)match(input,56,FOLLOW_65); 

                    				newLeafNode(otherlv_20, grammarAccess.getBORoleInteractionAccess().getUpdatesKeyword_12_0());
                    			
                    // InternalBomi.g:1942:4: ( (lv_updates_21_0= ruleMyBoolean ) )
                    // InternalBomi.g:1943:5: (lv_updates_21_0= ruleMyBoolean )
                    {
                    // InternalBomi.g:1943:5: (lv_updates_21_0= ruleMyBoolean )
                    // InternalBomi.g:1944:6: lv_updates_21_0= ruleMyBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getUpdatesMyBooleanEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_updates_21_0=ruleMyBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"updates",
                    							lv_updates_21_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MyBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1962:3: (otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleMyBoolean ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==57) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBomi.g:1963:4: otherlv_22= 'deletes' ( (lv_deletes_23_0= ruleMyBoolean ) )
                    {
                    otherlv_22=(Token)match(input,57,FOLLOW_65); 

                    				newLeafNode(otherlv_22, grammarAccess.getBORoleInteractionAccess().getDeletesKeyword_13_0());
                    			
                    // InternalBomi.g:1967:4: ( (lv_deletes_23_0= ruleMyBoolean ) )
                    // InternalBomi.g:1968:5: (lv_deletes_23_0= ruleMyBoolean )
                    {
                    // InternalBomi.g:1968:5: (lv_deletes_23_0= ruleMyBoolean )
                    // InternalBomi.g:1969:6: lv_deletes_23_0= ruleMyBoolean
                    {

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getDeletesMyBooleanEnumRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_deletes_23_0=ruleMyBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBORoleInteractionRule());
                    						}
                    						set(
                    							current,
                    							"deletes",
                    							lv_deletes_23_0,
                    							"se.gu.cse.idxse.bomi.text.Bomi.MyBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBomi.g:1987:3: (otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==11) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBomi.g:1988:4: otherlv_24= 'boundaryObjects' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,11,FOLLOW_43); 

                    				newLeafNode(otherlv_24, grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsKeyword_14_0());
                    			
                    otherlv_25=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_25, grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_14_1());
                    			
                    // InternalBomi.g:1996:4: ( ( ruleEString ) )
                    // InternalBomi.g:1997:5: ( ruleEString )
                    {
                    // InternalBomi.g:1997:5: ( ruleEString )
                    // InternalBomi.g:1998:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:2012:4: (otherlv_27= ',' ( ( ruleEString ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==13) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalBomi.g:2013:5: otherlv_27= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_27=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getBORoleInteractionAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalBomi.g:2017:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:2018:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:2018:6: ( ruleEString )
                    	    // InternalBomi.g:2019:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBORoleInteractionAccess().getBoundaryObjectsBoundaryObjectCrossReference_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,40,FOLLOW_71); 

                    				newLeafNode(otherlv_29, grammarAccess.getBORoleInteractionAccess().getRightParenthesisKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:2039:3: (otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==17) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBomi.g:2040:4: otherlv_30= 'roles' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')'
                    {
                    otherlv_30=(Token)match(input,17,FOLLOW_43); 

                    				newLeafNode(otherlv_30, grammarAccess.getBORoleInteractionAccess().getRolesKeyword_15_0());
                    			
                    otherlv_31=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_31, grammarAccess.getBORoleInteractionAccess().getLeftParenthesisKeyword_15_1());
                    			
                    // InternalBomi.g:2048:4: ( ( ruleEString ) )
                    // InternalBomi.g:2049:5: ( ruleEString )
                    {
                    // InternalBomi.g:2049:5: ( ruleEString )
                    // InternalBomi.g:2050:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:2064:4: (otherlv_33= ',' ( ( ruleEString ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==13) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalBomi.g:2065:5: otherlv_33= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_33=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getBORoleInteractionAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalBomi.g:2069:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:2070:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:2070:6: ( ruleEString )
                    	    // InternalBomi.g:2071:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBORoleInteractionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBORoleInteractionAccess().getRolesRoleCrossReference_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
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

                    otherlv_35=(Token)match(input,40,FOLLOW_39); 

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


    // $ANTLR start "entryRuleBOTeamGovernance"
    // InternalBomi.g:2099:1: entryRuleBOTeamGovernance returns [EObject current=null] : iv_ruleBOTeamGovernance= ruleBOTeamGovernance EOF ;
    public final EObject entryRuleBOTeamGovernance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOTeamGovernance = null;


        try {
            // InternalBomi.g:2099:57: (iv_ruleBOTeamGovernance= ruleBOTeamGovernance EOF )
            // InternalBomi.g:2100:2: iv_ruleBOTeamGovernance= ruleBOTeamGovernance EOF
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
    // InternalBomi.g:2106:1: ruleBOTeamGovernance returns [EObject current=null] : ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'governanceTeams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'boundaryObjects' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) ;
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
            // InternalBomi.g:2112:2: ( ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'governanceTeams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'boundaryObjects' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) )
            // InternalBomi.g:2113:2: ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'governanceTeams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'boundaryObjects' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            {
            // InternalBomi.g:2113:2: ( () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'governanceTeams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'boundaryObjects' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            // InternalBomi.g:2114:3: () otherlv_1= 'BOTeamGovernance' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )? (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )? (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )? (otherlv_10= 'governanceTeams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'boundaryObjects' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}'
            {
            // InternalBomi.g:2114:3: ()
            // InternalBomi.g:2115:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBOTeamGovernanceAccess().getBOTeamGovernanceKeyword_1());
            		
            // InternalBomi.g:2125:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBomi.g:2126:4: (lv_name_2_0= ruleEString )
            {
            // InternalBomi.g:2126:4: (lv_name_2_0= ruleEString )
            // InternalBomi.g:2127:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getBOTeamGovernanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBomi.g:2148:3: (otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==21) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalBomi.g:2149:4: otherlv_4= 'purpose' ( (lv_purpose_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBOTeamGovernanceAccess().getPurposeKeyword_4_0());
                    			
                    // InternalBomi.g:2153:4: ( (lv_purpose_5_0= ruleEString ) )
                    // InternalBomi.g:2154:5: (lv_purpose_5_0= ruleEString )
                    {
                    // InternalBomi.g:2154:5: (lv_purpose_5_0= ruleEString )
                    // InternalBomi.g:2155:6: lv_purpose_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getPurposeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalBomi.g:2173:3: (otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBomi.g:2174:4: otherlv_6= 'coordinationMechanism' ( (lv_coordinationMechanism_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismKeyword_5_0());
                    			
                    // InternalBomi.g:2178:4: ( (lv_coordinationMechanism_7_0= ruleEString ) )
                    // InternalBomi.g:2179:5: (lv_coordinationMechanism_7_0= ruleEString )
                    {
                    // InternalBomi.g:2179:5: (lv_coordinationMechanism_7_0= ruleEString )
                    // InternalBomi.g:2180:6: lv_coordinationMechanism_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getCoordinationMechanismEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            // InternalBomi.g:2198:3: (otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==60) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalBomi.g:2199:4: otherlv_8= 'frequencyOfCoordination' ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationKeyword_6_0());
                    			
                    // InternalBomi.g:2203:4: ( (lv_frequencyOfCoordination_9_0= ruleHighLow ) )
                    // InternalBomi.g:2204:5: (lv_frequencyOfCoordination_9_0= ruleHighLow )
                    {
                    // InternalBomi.g:2204:5: (lv_frequencyOfCoordination_9_0= ruleHighLow )
                    // InternalBomi.g:2205:6: lv_frequencyOfCoordination_9_0= ruleHighLow
                    {

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getFrequencyOfCoordinationHighLowEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_75);
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

            // InternalBomi.g:2223:3: (otherlv_10= 'governanceTeams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==16) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBomi.g:2224:4: otherlv_10= 'governanceTeams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalBomi.g:2232:4: ( ( ruleEString ) )
                    // InternalBomi.g:2233:5: ( ruleEString )
                    {
                    // InternalBomi.g:2233:5: ( ruleEString )
                    // InternalBomi.g:2234:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:2248:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==13) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalBomi.g:2249:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBomi.g:2253:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:2254:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:2254:6: ( ruleEString )
                    	    // InternalBomi.g:2255:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getGovernanceTeamsGovernanceTeamCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,40,FOLLOW_76); 

                    				newLeafNode(otherlv_15, grammarAccess.getBOTeamGovernanceAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalBomi.g:2275:3: (otherlv_16= 'boundaryObjects' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==11) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalBomi.g:2276:4: otherlv_16= 'boundaryObjects' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,11,FOLLOW_43); 

                    				newLeafNode(otherlv_16, grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getBOTeamGovernanceAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalBomi.g:2284:4: ( ( ruleEString ) )
                    // InternalBomi.g:2285:5: ( ruleEString )
                    {
                    // InternalBomi.g:2285:5: ( ruleEString )
                    // InternalBomi.g:2286:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBomi.g:2300:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==13) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalBomi.g:2301:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_21); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getBOTeamGovernanceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBomi.g:2305:5: ( ( ruleEString ) )
                    	    // InternalBomi.g:2306:6: ( ruleEString )
                    	    {
                    	    // InternalBomi.g:2306:6: ( ruleEString )
                    	    // InternalBomi.g:2307:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBOTeamGovernanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBOTeamGovernanceAccess().getBoundaryObjectsBoundaryObjectCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,40,FOLLOW_39); 

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


    // $ANTLR start "entryRuleEString"
    // InternalBomi.g:2335:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBomi.g:2335:47: (iv_ruleEString= ruleEString EOF )
            // InternalBomi.g:2336:2: iv_ruleEString= ruleEString EOF
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
    // InternalBomi.g:2342:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBomi.g:2348:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBomi.g:2349:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBomi.g:2349:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_STRING) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_ID) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalBomi.g:2350:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBomi.g:2358:3: this_ID_1= RULE_ID
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
    // InternalBomi.g:2369:1: ruleHighLow returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator ruleHighLow() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBomi.g:2375:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // InternalBomi.g:2376:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // InternalBomi.g:2376:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt72=1;
                }
                break;
            case 62:
                {
                alt72=2;
                }
                break;
            case 63:
                {
                alt72=3;
                }
                break;
            case 64:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalBomi.g:2377:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2377:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2378:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHighLowAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2385:3: (enumLiteral_1= 'High' )
                    {
                    // InternalBomi.g:2385:3: (enumLiteral_1= 'High' )
                    // InternalBomi.g:2386:4: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHighLowAccess().getHighEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2393:3: (enumLiteral_2= 'Medium' )
                    {
                    // InternalBomi.g:2393:3: (enumLiteral_2= 'Medium' )
                    // InternalBomi.g:2394:4: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHighLowAccess().getMediumEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2401:3: (enumLiteral_3= 'Low' )
                    {
                    // InternalBomi.g:2401:3: (enumLiteral_3= 'Low' )
                    // InternalBomi.g:2402:4: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

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


    // $ANTLR start "ruleMyBoolean"
    // InternalBomi.g:2412:1: ruleMyBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) ) ;
    public final Enumerator ruleMyBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBomi.g:2418:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) ) )
            // InternalBomi.g:2419:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) )
            {
            // InternalBomi.g:2419:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'True' ) | (enumLiteral_2= 'False' ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt73=1;
                }
                break;
            case 65:
                {
                alt73=2;
                }
                break;
            case 66:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalBomi.g:2420:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2420:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2421:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMyBooleanAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMyBooleanAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2428:3: (enumLiteral_1= 'True' )
                    {
                    // InternalBomi.g:2428:3: (enumLiteral_1= 'True' )
                    // InternalBomi.g:2429:4: enumLiteral_1= 'True'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMyBooleanAccess().getTrueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMyBooleanAccess().getTrueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2436:3: (enumLiteral_2= 'False' )
                    {
                    // InternalBomi.g:2436:3: (enumLiteral_2= 'False' )
                    // InternalBomi.g:2437:4: enumLiteral_2= 'False'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMyBooleanAccess().getFalseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMyBooleanAccess().getFalseEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "ruleBOSuperTypes"
    // InternalBomi.g:2447:1: ruleBOSuperTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) ) ;
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
            // InternalBomi.g:2453:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) ) )
            // InternalBomi.g:2454:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) )
            {
            // InternalBomi.g:2454:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Standard' ) | (enumLiteral_2= 'Technology' ) | (enumLiteral_3= 'Task' ) | (enumLiteral_4= 'Planning' ) | (enumLiteral_5= 'Value' ) | (enumLiteral_6= 'Product' ) | (enumLiteral_7= 'Other' ) )
            int alt74=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt74=1;
                }
                break;
            case 67:
                {
                alt74=2;
                }
                break;
            case 68:
                {
                alt74=3;
                }
                break;
            case 69:
                {
                alt74=4;
                }
                break;
            case 70:
                {
                alt74=5;
                }
                break;
            case 71:
                {
                alt74=6;
                }
                break;
            case 72:
                {
                alt74=7;
                }
                break;
            case 73:
                {
                alt74=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalBomi.g:2455:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2455:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2456:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBOSuperTypesAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2463:3: (enumLiteral_1= 'Standard' )
                    {
                    // InternalBomi.g:2463:3: (enumLiteral_1= 'Standard' )
                    // InternalBomi.g:2464:4: enumLiteral_1= 'Standard'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBOSuperTypesAccess().getStandardEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2471:3: (enumLiteral_2= 'Technology' )
                    {
                    // InternalBomi.g:2471:3: (enumLiteral_2= 'Technology' )
                    // InternalBomi.g:2472:4: enumLiteral_2= 'Technology'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBOSuperTypesAccess().getTechnologyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2479:3: (enumLiteral_3= 'Task' )
                    {
                    // InternalBomi.g:2479:3: (enumLiteral_3= 'Task' )
                    // InternalBomi.g:2480:4: enumLiteral_3= 'Task'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBOSuperTypesAccess().getTaskEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:2487:3: (enumLiteral_4= 'Planning' )
                    {
                    // InternalBomi.g:2487:3: (enumLiteral_4= 'Planning' )
                    // InternalBomi.g:2488:4: enumLiteral_4= 'Planning'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBOSuperTypesAccess().getPlanningEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBomi.g:2495:3: (enumLiteral_5= 'Value' )
                    {
                    // InternalBomi.g:2495:3: (enumLiteral_5= 'Value' )
                    // InternalBomi.g:2496:4: enumLiteral_5= 'Value'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBOSuperTypesAccess().getValueEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBomi.g:2503:3: (enumLiteral_6= 'Product' )
                    {
                    // InternalBomi.g:2503:3: (enumLiteral_6= 'Product' )
                    // InternalBomi.g:2504:4: enumLiteral_6= 'Product'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBOSuperTypesAccess().getProductEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBomi.g:2511:3: (enumLiteral_7= 'Other' )
                    {
                    // InternalBomi.g:2511:3: (enumLiteral_7= 'Other' )
                    // InternalBomi.g:2512:4: enumLiteral_7= 'Other'
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_2); 

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
    // InternalBomi.g:2522:1: ruleLifecycleStage returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) ) ;
    public final Enumerator ruleLifecycleStage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBomi.g:2528:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) ) )
            // InternalBomi.g:2529:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) )
            {
            // InternalBomi.g:2529:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Planning' ) | (enumLiteral_2= 'Operation' ) | (enumLiteral_3= 'Deprecate' ) | (enumLiteral_4= 'Retire' ) )
            int alt75=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt75=1;
                }
                break;
            case 70:
                {
                alt75=2;
                }
                break;
            case 74:
                {
                alt75=3;
                }
                break;
            case 75:
                {
                alt75=4;
                }
                break;
            case 76:
                {
                alt75=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalBomi.g:2530:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2530:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2531:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLifecycleStageAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2538:3: (enumLiteral_1= 'Planning' )
                    {
                    // InternalBomi.g:2538:3: (enumLiteral_1= 'Planning' )
                    // InternalBomi.g:2539:4: enumLiteral_1= 'Planning'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLifecycleStageAccess().getPlanningEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2546:3: (enumLiteral_2= 'Operation' )
                    {
                    // InternalBomi.g:2546:3: (enumLiteral_2= 'Operation' )
                    // InternalBomi.g:2547:4: enumLiteral_2= 'Operation'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLifecycleStageAccess().getOperationEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2554:3: (enumLiteral_3= 'Deprecate' )
                    {
                    // InternalBomi.g:2554:3: (enumLiteral_3= 'Deprecate' )
                    // InternalBomi.g:2555:4: enumLiteral_3= 'Deprecate'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLifecycleStageAccess().getDeprecateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:2562:3: (enumLiteral_4= 'Retire' )
                    {
                    // InternalBomi.g:2562:3: (enumLiteral_4= 'Retire' )
                    // InternalBomi.g:2563:4: enumLiteral_4= 'Retire'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); 

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
    // InternalBomi.g:2573:1: ruleMIType returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) ) ;
    public final Enumerator ruleMIType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBomi.g:2579:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) ) )
            // InternalBomi.g:2580:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) )
            {
            // InternalBomi.g:2580:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Teams' ) | (enumLiteral_2= 'Silos' ) | (enumLiteral_3= 'Departments' ) | (enumLiteral_4= 'Organizations' ) )
            int alt76=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt76=1;
                }
                break;
            case 77:
                {
                alt76=2;
                }
                break;
            case 78:
                {
                alt76=3;
                }
                break;
            case 79:
                {
                alt76=4;
                }
                break;
            case 80:
                {
                alt76=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalBomi.g:2581:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2581:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2582:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMITypeAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2589:3: (enumLiteral_1= 'Teams' )
                    {
                    // InternalBomi.g:2589:3: (enumLiteral_1= 'Teams' )
                    // InternalBomi.g:2590:4: enumLiteral_1= 'Teams'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMITypeAccess().getTeamsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2597:3: (enumLiteral_2= 'Silos' )
                    {
                    // InternalBomi.g:2597:3: (enumLiteral_2= 'Silos' )
                    // InternalBomi.g:2598:4: enumLiteral_2= 'Silos'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMITypeAccess().getSilosEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2605:3: (enumLiteral_3= 'Departments' )
                    {
                    // InternalBomi.g:2605:3: (enumLiteral_3= 'Departments' )
                    // InternalBomi.g:2606:4: enumLiteral_3= 'Departments'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMITypeAccess().getDepartmentsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBomi.g:2613:3: (enumLiteral_4= 'Organizations' )
                    {
                    // InternalBomi.g:2613:3: (enumLiteral_4= 'Organizations' )
                    // InternalBomi.g:2614:4: enumLiteral_4= 'Organizations'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_2); 

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


    // $ANTLR start "ruleDriverTypes"
    // InternalBomi.g:2624:1: ruleDriverTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Technology' ) | (enumLiteral_2= 'Process' ) | (enumLiteral_3= 'Organizational' ) ) ;
    public final Enumerator ruleDriverTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBomi.g:2630:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Technology' ) | (enumLiteral_2= 'Process' ) | (enumLiteral_3= 'Organizational' ) ) )
            // InternalBomi.g:2631:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Technology' ) | (enumLiteral_2= 'Process' ) | (enumLiteral_3= 'Organizational' ) )
            {
            // InternalBomi.g:2631:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Technology' ) | (enumLiteral_2= 'Process' ) | (enumLiteral_3= 'Organizational' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt77=1;
                }
                break;
            case 68:
                {
                alt77=2;
                }
                break;
            case 81:
                {
                alt77=3;
                }
                break;
            case 82:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalBomi.g:2632:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2632:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2633:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDriverTypesAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDriverTypesAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2640:3: (enumLiteral_1= 'Technology' )
                    {
                    // InternalBomi.g:2640:3: (enumLiteral_1= 'Technology' )
                    // InternalBomi.g:2641:4: enumLiteral_1= 'Technology'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDriverTypesAccess().getTechnologyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDriverTypesAccess().getTechnologyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2648:3: (enumLiteral_2= 'Process' )
                    {
                    // InternalBomi.g:2648:3: (enumLiteral_2= 'Process' )
                    // InternalBomi.g:2649:4: enumLiteral_2= 'Process'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDriverTypesAccess().getProcessEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDriverTypesAccess().getProcessEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2656:3: (enumLiteral_3= 'Organizational' )
                    {
                    // InternalBomi.g:2656:3: (enumLiteral_3= 'Organizational' )
                    // InternalBomi.g:2657:4: enumLiteral_3= 'Organizational'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDriverTypesAccess().getOrganizationalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDriverTypesAccess().getOrganizationalEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDriverTypes"


    // $ANTLR start "ruleDistanceTypes"
    // InternalBomi.g:2667:1: ruleDistanceTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Cultural' ) | (enumLiteral_2= 'Geographical' ) | (enumLiteral_3= 'Organizational' ) ) ;
    public final Enumerator ruleDistanceTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBomi.g:2673:2: ( ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Cultural' ) | (enumLiteral_2= 'Geographical' ) | (enumLiteral_3= 'Organizational' ) ) )
            // InternalBomi.g:2674:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Cultural' ) | (enumLiteral_2= 'Geographical' ) | (enumLiteral_3= 'Organizational' ) )
            {
            // InternalBomi.g:2674:2: ( (enumLiteral_0= 'NOT_SET' ) | (enumLiteral_1= 'Cultural' ) | (enumLiteral_2= 'Geographical' ) | (enumLiteral_3= 'Organizational' ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt78=1;
                }
                break;
            case 83:
                {
                alt78=2;
                }
                break;
            case 84:
                {
                alt78=3;
                }
                break;
            case 82:
                {
                alt78=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalBomi.g:2675:3: (enumLiteral_0= 'NOT_SET' )
                    {
                    // InternalBomi.g:2675:3: (enumLiteral_0= 'NOT_SET' )
                    // InternalBomi.g:2676:4: enumLiteral_0= 'NOT_SET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDistanceTypesAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistanceTypesAccess().getNOT_SETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBomi.g:2683:3: (enumLiteral_1= 'Cultural' )
                    {
                    // InternalBomi.g:2683:3: (enumLiteral_1= 'Cultural' )
                    // InternalBomi.g:2684:4: enumLiteral_1= 'Cultural'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDistanceTypesAccess().getCulturalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDistanceTypesAccess().getCulturalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBomi.g:2691:3: (enumLiteral_2= 'Geographical' )
                    {
                    // InternalBomi.g:2691:3: (enumLiteral_2= 'Geographical' )
                    // InternalBomi.g:2692:4: enumLiteral_2= 'Geographical'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDistanceTypesAccess().getGeographicalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDistanceTypesAccess().getGeographicalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBomi.g:2699:3: (enumLiteral_3= 'Organizational' )
                    {
                    // InternalBomi.g:2699:3: (enumLiteral_3= 'Organizational' )
                    // InternalBomi.g:2700:4: enumLiteral_3= 'Organizational'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDistanceTypesAccess().getOrganizationalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDistanceTypesAccess().getOrganizationalEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDistanceTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0410800000078002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0410800000070002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0410800000060002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0410800000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0410800000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0410000000002002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0400000000002002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003FFF04000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000000000000L,0x00000000000003F8L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003FFE04000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003FFC04000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000003FF804000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000003FF004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000003FE004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000003FC004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000003F8004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2000000000000000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000003F0004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000003E0004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000003C0004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000380004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000024000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000780000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L,0x0000000000060010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000700000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000600000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000F00000020C800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000F00000000C800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000E00000000C800L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000C00000000C800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000800000000C800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000000000000C800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x03EF000000224800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x03EF000000024800L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x03EE000000024800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x03EC000000024800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x03E8000000024800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x03E0000000024800L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x03C0000000024800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0380000000024800L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0300000000024800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0200000000024800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000024800L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1800000000214800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x1800000000014800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1000000000014800L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000014800L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000004800L});

}