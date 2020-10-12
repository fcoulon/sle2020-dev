package fr.inria.diverse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.services.KauluaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKauluaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_QUALIFIER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Protocol'", "'{'", "'dependencies'", "'}'", "'mandatory'", "'feature'", "'capabilities'", "':'", "'alternativeOf'", "'['", "']'", "'->'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_QUALIFIER=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKauluaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKauluaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKauluaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKaulua.g"; }



     	private KauluaGrammarAccess grammarAccess;

        public InternalKauluaParser(TokenStream input, KauluaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Protocol";
       	}

       	@Override
       	protected KauluaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProtocol"
    // InternalKaulua.g:64:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalKaulua.g:64:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalKaulua.g:65:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalKaulua.g:71:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'Protocol' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= 'dependencies' otherlv_5= '{' ( (lv_dependencies_6_0= ruleDependency ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_features_3_0 = null;

        EObject lv_dependencies_6_0 = null;



        	enterRule();

        try {
            // InternalKaulua.g:77:2: ( (otherlv_0= 'Protocol' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= 'dependencies' otherlv_5= '{' ( (lv_dependencies_6_0= ruleDependency ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalKaulua.g:78:2: (otherlv_0= 'Protocol' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= 'dependencies' otherlv_5= '{' ( (lv_dependencies_6_0= ruleDependency ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalKaulua.g:78:2: (otherlv_0= 'Protocol' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= 'dependencies' otherlv_5= '{' ( (lv_dependencies_6_0= ruleDependency ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalKaulua.g:79:3: otherlv_0= 'Protocol' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= 'dependencies' otherlv_5= '{' ( (lv_dependencies_6_0= ruleDependency ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
            		
            // InternalKaulua.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalKaulua.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalKaulua.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalKaulua.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProtocolAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKaulua.g:105:3: ( (lv_features_3_0= ruleFeature ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKaulua.g:106:4: (lv_features_3_0= ruleFeature )
            	    {
            	    // InternalKaulua.g:106:4: (lv_features_3_0= ruleFeature )
            	    // InternalKaulua.g:107:5: lv_features_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getProtocolAccess().getFeaturesFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProtocolRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"fr.inria.diverse.Kaulua.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getProtocolAccess().getDependenciesKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalKaulua.g:132:3: ( (lv_dependencies_6_0= ruleDependency ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_QUALIFIER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKaulua.g:133:4: (lv_dependencies_6_0= ruleDependency )
            	    {
            	    // InternalKaulua.g:133:4: (lv_dependencies_6_0= ruleDependency )
            	    // InternalKaulua.g:134:5: lv_dependencies_6_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getProtocolAccess().getDependenciesDependencyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_dependencies_6_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProtocolRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_6_0,
            	    						"fr.inria.diverse.Kaulua.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleFeature"
    // InternalKaulua.g:163:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalKaulua.g:163:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalKaulua.g:164:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalKaulua.g:170:1: ruleFeature returns [EObject current=null] : ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'capabilities' otherlv_5= ':' ( (lv_capabilities_6_0= ruleCapability ) )+ )? (otherlv_7= 'alternativeOf' otherlv_8= ':' ( (lv_alternativeGroup_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_isMandatory_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_alternativeGroup_9_0=null;
        Token otherlv_10=null;
        EObject lv_capabilities_6_0 = null;



        	enterRule();

        try {
            // InternalKaulua.g:176:2: ( ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'capabilities' otherlv_5= ':' ( (lv_capabilities_6_0= ruleCapability ) )+ )? (otherlv_7= 'alternativeOf' otherlv_8= ':' ( (lv_alternativeGroup_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalKaulua.g:177:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'capabilities' otherlv_5= ':' ( (lv_capabilities_6_0= ruleCapability ) )+ )? (otherlv_7= 'alternativeOf' otherlv_8= ':' ( (lv_alternativeGroup_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalKaulua.g:177:2: ( ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'capabilities' otherlv_5= ':' ( (lv_capabilities_6_0= ruleCapability ) )+ )? (otherlv_7= 'alternativeOf' otherlv_8= ':' ( (lv_alternativeGroup_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalKaulua.g:178:3: ( (lv_isMandatory_0_0= 'mandatory' ) )? otherlv_1= 'feature' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'capabilities' otherlv_5= ':' ( (lv_capabilities_6_0= ruleCapability ) )+ )? (otherlv_7= 'alternativeOf' otherlv_8= ':' ( (lv_alternativeGroup_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalKaulua.g:178:3: ( (lv_isMandatory_0_0= 'mandatory' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKaulua.g:179:4: (lv_isMandatory_0_0= 'mandatory' )
                    {
                    // InternalKaulua.g:179:4: (lv_isMandatory_0_0= 'mandatory' )
                    // InternalKaulua.g:180:5: lv_isMandatory_0_0= 'mandatory'
                    {
                    lv_isMandatory_0_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_isMandatory_0_0, grammarAccess.getFeatureAccess().getIsMandatoryMandatoryKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", true, "mandatory");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalKaulua.g:196:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKaulua.g:197:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKaulua.g:197:4: (lv_name_2_0= RULE_ID )
            // InternalKaulua.g:198:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalKaulua.g:218:3: (otherlv_4= 'capabilities' otherlv_5= ':' ( (lv_capabilities_6_0= ruleCapability ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKaulua.g:219:4: otherlv_4= 'capabilities' otherlv_5= ':' ( (lv_capabilities_6_0= ruleCapability ) )+
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getCapabilitiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getColonKeyword_4_1());
                    			
                    // InternalKaulua.g:227:4: ( (lv_capabilities_6_0= ruleCapability ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKaulua.g:228:5: (lv_capabilities_6_0= ruleCapability )
                    	    {
                    	    // InternalKaulua.g:228:5: (lv_capabilities_6_0= ruleCapability )
                    	    // InternalKaulua.g:229:6: lv_capabilities_6_0= ruleCapability
                    	    {

                    	    						newCompositeNode(grammarAccess.getFeatureAccess().getCapabilitiesCapabilityParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_capabilities_6_0=ruleCapability();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"capabilities",
                    	    							lv_capabilities_6_0,
                    	    							"fr.inria.diverse.Kaulua.Capability");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // InternalKaulua.g:247:3: (otherlv_7= 'alternativeOf' otherlv_8= ':' ( (lv_alternativeGroup_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKaulua.g:248:4: otherlv_7= 'alternativeOf' otherlv_8= ':' ( (lv_alternativeGroup_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getAlternativeOfKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeatureAccess().getColonKeyword_5_1());
                    			
                    // InternalKaulua.g:256:4: ( (lv_alternativeGroup_9_0= RULE_STRING ) )
                    // InternalKaulua.g:257:5: (lv_alternativeGroup_9_0= RULE_STRING )
                    {
                    // InternalKaulua.g:257:5: (lv_alternativeGroup_9_0= RULE_STRING )
                    // InternalKaulua.g:258:6: lv_alternativeGroup_9_0= RULE_STRING
                    {
                    lv_alternativeGroup_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_alternativeGroup_9_0, grammarAccess.getFeatureAccess().getAlternativeGroupSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alternativeGroup",
                    							lv_alternativeGroup_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleCapability"
    // InternalKaulua.g:283:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // InternalKaulua.g:283:51: (iv_ruleCapability= ruleCapability EOF )
            // InternalKaulua.g:284:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
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
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalKaulua.g:290:1: ruleCapability returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_definitionFile_2_0= RULE_STRING ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_definitionFile_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKaulua.g:296:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_definitionFile_2_0= RULE_STRING ) ) otherlv_3= ']' )? ) )
            // InternalKaulua.g:297:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_definitionFile_2_0= RULE_STRING ) ) otherlv_3= ']' )? )
            {
            // InternalKaulua.g:297:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_definitionFile_2_0= RULE_STRING ) ) otherlv_3= ']' )? )
            // InternalKaulua.g:298:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_definitionFile_2_0= RULE_STRING ) ) otherlv_3= ']' )?
            {
            // InternalKaulua.g:298:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKaulua.g:299:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKaulua.g:299:4: (lv_name_0_0= RULE_ID )
            // InternalKaulua.g:300:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKaulua.g:316:3: (otherlv_1= '[' ( (lv_definitionFile_2_0= RULE_STRING ) ) otherlv_3= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKaulua.g:317:4: otherlv_1= '[' ( (lv_definitionFile_2_0= RULE_STRING ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCapabilityAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalKaulua.g:321:4: ( (lv_definitionFile_2_0= RULE_STRING ) )
                    // InternalKaulua.g:322:5: (lv_definitionFile_2_0= RULE_STRING )
                    {
                    // InternalKaulua.g:322:5: (lv_definitionFile_2_0= RULE_STRING )
                    // InternalKaulua.g:323:6: lv_definitionFile_2_0= RULE_STRING
                    {
                    lv_definitionFile_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_definitionFile_2_0, grammarAccess.getCapabilityAccess().getDefinitionFileSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCapabilityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"definitionFile",
                    							lv_definitionFile_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleDependency"
    // InternalKaulua.g:348:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalKaulua.g:348:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalKaulua.g:349:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalKaulua.g:355:1: ruleDependency returns [EObject current=null] : ( ( (otherlv_0= RULE_QUALIFIER ) ) otherlv_1= '->' ( (otherlv_2= RULE_QUALIFIER ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKaulua.g:361:2: ( ( ( (otherlv_0= RULE_QUALIFIER ) ) otherlv_1= '->' ( (otherlv_2= RULE_QUALIFIER ) ) ) )
            // InternalKaulua.g:362:2: ( ( (otherlv_0= RULE_QUALIFIER ) ) otherlv_1= '->' ( (otherlv_2= RULE_QUALIFIER ) ) )
            {
            // InternalKaulua.g:362:2: ( ( (otherlv_0= RULE_QUALIFIER ) ) otherlv_1= '->' ( (otherlv_2= RULE_QUALIFIER ) ) )
            // InternalKaulua.g:363:3: ( (otherlv_0= RULE_QUALIFIER ) ) otherlv_1= '->' ( (otherlv_2= RULE_QUALIFIER ) )
            {
            // InternalKaulua.g:363:3: ( (otherlv_0= RULE_QUALIFIER ) )
            // InternalKaulua.g:364:4: (otherlv_0= RULE_QUALIFIER )
            {
            // InternalKaulua.g:364:4: (otherlv_0= RULE_QUALIFIER )
            // InternalKaulua.g:365:5: otherlv_0= RULE_QUALIFIER
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_QUALIFIER,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getCallerCapabilityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalKaulua.g:380:3: ( (otherlv_2= RULE_QUALIFIER ) )
            // InternalKaulua.g:381:4: (otherlv_2= RULE_QUALIFIER )
            {
            // InternalKaulua.g:381:4: (otherlv_2= RULE_QUALIFIER )
            // InternalKaulua.g:382:5: otherlv_2= RULE_QUALIFIER
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_QUALIFIER,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getCalleeCapabilityCrossReference_2_0());
            				

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
    // $ANTLR end "ruleDependency"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000148000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}