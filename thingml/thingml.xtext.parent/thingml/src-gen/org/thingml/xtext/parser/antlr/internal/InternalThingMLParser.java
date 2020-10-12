package org.thingml.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.thingml.xtext.services.ThingMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
@SuppressWarnings("all")
public class InternalThingMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ANNOTATION_ID", "RULE_EXTERN", "RULE_INT", "RULE_BYTE", "RULE_CHAR", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'from'", "'var'", "':'", "'['", "']'", "'datatype'", "'<'", "'>'", "';'", "'object'", "'enumeration'", "'as'", "'{'", "'}'", "'='", "'thing'", "'fragment'", "'includes'", "','", "'set'", "'protocol'", "'function'", "'('", "')'", "'abstract'", "'readonly'", "'property'", "'message'", "'optional'", "'required'", "'port'", "'sends'", "'receives'", "'provided'", "'internal'", "'state'", "'on'", "'entry'", "'exit'", "'transition'", "'->'", "'event'", "'guard'", "'action'", "'composite'", "'init'", "'keeps'", "'history'", "'statechart'", "'session'", "'region'", "'final'", "'?'", "'do'", "'end'", "'&'", "'!'", "'++'", "'--'", "'for'", "'in'", "'while'", "'if'", "'else'", "'return'", "'print'", "'println'", "'error'", "'errorln'", "'fork'", "'or'", "'and'", "'=='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'true'", "'false'", "'.'", "'configuration'", "'instance'", "'connector'", "'=>'", "'over'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_BYTE=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=11;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_EXTERN=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_CHAR=10;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_ANNOTATION_ID=6;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalThingMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalThingMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalThingMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalThingML.g"; }



     	private ThingMLGrammarAccess grammarAccess;

        public InternalThingMLParser(TokenStream input, ThingMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ThingMLModel";
       	}

       	@Override
       	protected ThingMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleThingMLModel"
    // InternalThingML.g:77:1: entryRuleThingMLModel returns [EObject current=null] : iv_ruleThingMLModel= ruleThingMLModel EOF ;
    public final EObject entryRuleThingMLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThingMLModel = null;


        try {
            // InternalThingML.g:77:53: (iv_ruleThingMLModel= ruleThingMLModel EOF )
            // InternalThingML.g:78:2: iv_ruleThingMLModel= ruleThingMLModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThingMLModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThingMLModel=ruleThingMLModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThingMLModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleThingMLModel"


    // $ANTLR start "ruleThingMLModel"
    // InternalThingML.g:84:1: ruleThingMLModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_types_1_0= ruleType ) ) | ( (lv_protocols_2_0= ruleProtocol ) ) | ( (lv_configs_3_0= ruleConfiguration ) ) )* ) ;
    public final EObject ruleThingMLModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_types_1_0 = null;

        EObject lv_protocols_2_0 = null;

        EObject lv_configs_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:90:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_types_1_0= ruleType ) ) | ( (lv_protocols_2_0= ruleProtocol ) ) | ( (lv_configs_3_0= ruleConfiguration ) ) )* ) )
            // InternalThingML.g:91:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_types_1_0= ruleType ) ) | ( (lv_protocols_2_0= ruleProtocol ) ) | ( (lv_configs_3_0= ruleConfiguration ) ) )* )
            {
            // InternalThingML.g:91:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_types_1_0= ruleType ) ) | ( (lv_protocols_2_0= ruleProtocol ) ) | ( (lv_configs_3_0= ruleConfiguration ) ) )* )
            // InternalThingML.g:92:3: ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_types_1_0= ruleType ) ) | ( (lv_protocols_2_0= ruleProtocol ) ) | ( (lv_configs_3_0= ruleConfiguration ) ) )*
            {
            // InternalThingML.g:92:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalThingML.g:93:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalThingML.g:93:4: (lv_imports_0_0= ruleImport )
            	    // InternalThingML.g:94:5: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getThingMLModelAccess().getImportsImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getThingMLModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"org.thingml.xtext.ThingML.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalThingML.g:111:3: ( ( (lv_types_1_0= ruleType ) ) | ( (lv_protocols_2_0= ruleProtocol ) ) | ( (lv_configs_3_0= ruleConfiguration ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 22:
                case 26:
                case 27:
                case 32:
                    {
                    alt2=1;
                    }
                    break;
                case 37:
                    {
                    alt2=2;
                    }
                    break;
                case 102:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalThingML.g:112:4: ( (lv_types_1_0= ruleType ) )
            	    {
            	    // InternalThingML.g:112:4: ( (lv_types_1_0= ruleType ) )
            	    // InternalThingML.g:113:5: (lv_types_1_0= ruleType )
            	    {
            	    // InternalThingML.g:113:5: (lv_types_1_0= ruleType )
            	    // InternalThingML.g:114:6: lv_types_1_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingMLModelAccess().getTypesTypeParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_types_1_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingMLModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_1_0,
            	      							"org.thingml.xtext.ThingML.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:132:4: ( (lv_protocols_2_0= ruleProtocol ) )
            	    {
            	    // InternalThingML.g:132:4: ( (lv_protocols_2_0= ruleProtocol ) )
            	    // InternalThingML.g:133:5: (lv_protocols_2_0= ruleProtocol )
            	    {
            	    // InternalThingML.g:133:5: (lv_protocols_2_0= ruleProtocol )
            	    // InternalThingML.g:134:6: lv_protocols_2_0= ruleProtocol
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingMLModelAccess().getProtocolsProtocolParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_protocols_2_0=ruleProtocol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingMLModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"protocols",
            	      							lv_protocols_2_0,
            	      							"org.thingml.xtext.ThingML.Protocol");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalThingML.g:152:4: ( (lv_configs_3_0= ruleConfiguration ) )
            	    {
            	    // InternalThingML.g:152:4: ( (lv_configs_3_0= ruleConfiguration ) )
            	    // InternalThingML.g:153:5: (lv_configs_3_0= ruleConfiguration )
            	    {
            	    // InternalThingML.g:153:5: (lv_configs_3_0= ruleConfiguration )
            	    // InternalThingML.g:154:6: lv_configs_3_0= ruleConfiguration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingMLModelAccess().getConfigsConfigurationParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_configs_3_0=ruleConfiguration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingMLModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"configs",
            	      							lv_configs_3_0,
            	      							"org.thingml.xtext.ThingML.Configuration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleThingMLModel"


    // $ANTLR start "entryRuleImport"
    // InternalThingML.g:176:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalThingML.g:176:47: (iv_ruleImport= ruleImport EOF )
            // InternalThingML.g:177:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalThingML.g:183:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_from_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_from_3_0=null;


        	enterRule();

        try {
            // InternalThingML.g:189:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_from_3_0= RULE_ID ) ) )? ) )
            // InternalThingML.g:190:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_from_3_0= RULE_ID ) ) )? )
            {
            // InternalThingML.g:190:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_from_3_0= RULE_ID ) ) )? )
            // InternalThingML.g:191:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_from_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalThingML.g:195:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalThingML.g:196:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalThingML.g:196:4: (lv_importURI_1_0= RULE_STRING )
            // InternalThingML.g:197:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"org.thingml.xtext.ThingML.STRING");
              				
            }

            }


            }

            // InternalThingML.g:213:3: (otherlv_2= 'from' ( (lv_from_3_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalThingML.g:214:4: otherlv_2= 'from' ( (lv_from_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportAccess().getFromKeyword_2_0());
                      			
                    }
                    // InternalThingML.g:218:4: ( (lv_from_3_0= RULE_ID ) )
                    // InternalThingML.g:219:5: (lv_from_3_0= RULE_ID )
                    {
                    // InternalThingML.g:219:5: (lv_from_3_0= RULE_ID )
                    // InternalThingML.g:220:6: lv_from_3_0= RULE_ID
                    {
                    lv_from_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_from_3_0, grammarAccess.getImportAccess().getFromIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"from",
                      							lv_from_3_0,
                      							"org.thingml.xtext.ThingML.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePlatformAnnotation"
    // InternalThingML.g:241:1: entryRulePlatformAnnotation returns [EObject current=null] : iv_rulePlatformAnnotation= rulePlatformAnnotation EOF ;
    public final EObject entryRulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformAnnotation = null;


        try {
            // InternalThingML.g:241:59: (iv_rulePlatformAnnotation= rulePlatformAnnotation EOF )
            // InternalThingML.g:242:2: iv_rulePlatformAnnotation= rulePlatformAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlatformAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlatformAnnotation=rulePlatformAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlatformAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlatformAnnotation"


    // $ANTLR start "rulePlatformAnnotation"
    // InternalThingML.g:248:1: rulePlatformAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_EXTERN ) ) | ( (lv_value_2_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalThingML.g:254:2: ( ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_EXTERN ) ) | ( (lv_value_2_0= RULE_STRING ) ) )? ) )
            // InternalThingML.g:255:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_EXTERN ) ) | ( (lv_value_2_0= RULE_STRING ) ) )? )
            {
            // InternalThingML.g:255:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_EXTERN ) ) | ( (lv_value_2_0= RULE_STRING ) ) )? )
            // InternalThingML.g:256:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_EXTERN ) ) | ( (lv_value_2_0= RULE_STRING ) ) )?
            {
            // InternalThingML.g:256:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) )
            // InternalThingML.g:257:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            {
            // InternalThingML.g:257:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            // InternalThingML.g:258:5: lv_name_0_0= RULE_ANNOTATION_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ANNOTATION_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPlatformAnnotationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.thingml.xtext.ThingML.ANNOTATION_ID");
              				
            }

            }


            }

            // InternalThingML.g:274:3: ( ( (lv_value_1_0= RULE_EXTERN ) ) | ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EXTERN) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // InternalThingML.g:275:4: ( (lv_value_1_0= RULE_EXTERN ) )
                    {
                    // InternalThingML.g:275:4: ( (lv_value_1_0= RULE_EXTERN ) )
                    // InternalThingML.g:276:5: (lv_value_1_0= RULE_EXTERN )
                    {
                    // InternalThingML.g:276:5: (lv_value_1_0= RULE_EXTERN )
                    // InternalThingML.g:277:6: lv_value_1_0= RULE_EXTERN
                    {
                    lv_value_1_0=(Token)match(input,RULE_EXTERN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getPlatformAnnotationAccess().getValueEXTERNTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPlatformAnnotationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.thingml.xtext.ThingML.EXTERN");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThingML.g:294:4: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // InternalThingML.g:294:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalThingML.g:295:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalThingML.g:295:5: (lv_value_2_0= RULE_STRING )
                    // InternalThingML.g:296:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getPlatformAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPlatformAnnotationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"org.thingml.xtext.ThingML.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePlatformAnnotation"


    // $ANTLR start "entryRuleVariable"
    // InternalThingML.g:317:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalThingML.g:317:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalThingML.g:318:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalThingML.g:324:1: ruleVariable returns [EObject current=null] : ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeRef ) ) ) | this_LocalVariable_4= ruleLocalVariable | this_Property_5= ruleProperty | this_Parameter_6= ruleParameter ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_typeRef_3_0 = null;

        EObject this_LocalVariable_4 = null;

        EObject this_Property_5 = null;

        EObject this_Parameter_6 = null;



        	enterRule();

        try {
            // InternalThingML.g:330:2: ( ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeRef ) ) ) | this_LocalVariable_4= ruleLocalVariable | this_Property_5= ruleProperty | this_Parameter_6= ruleParameter ) )
            // InternalThingML.g:331:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeRef ) ) ) | this_LocalVariable_4= ruleLocalVariable | this_Property_5= ruleProperty | this_Parameter_6= ruleParameter )
            {
            // InternalThingML.g:331:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeRef ) ) ) | this_LocalVariable_4= ruleLocalVariable | this_Property_5= ruleProperty | this_Parameter_6= ruleParameter )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==19) ) {
                        int LA5_7 = input.LA(4);

                        if ( (LA5_7==RULE_ID) ) {
                            alt5=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==43) ) {
                    alt5=3;
                }
                else if ( (LA5_2==18) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalThingML.g:332:3: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeRef ) ) )
                    {
                    // InternalThingML.g:332:3: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeRef ) ) )
                    // InternalThingML.g:333:4: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= ruleTypeRef ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0_0());
                      			
                    }
                    // InternalThingML.g:337:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalThingML.g:338:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalThingML.g:338:5: (lv_name_1_0= RULE_ID )
                    // InternalThingML.g:339:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.thingml.xtext.ThingML.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalThingML.g:359:4: ( (lv_typeRef_3_0= ruleTypeRef ) )
                    // InternalThingML.g:360:5: (lv_typeRef_3_0= ruleTypeRef )
                    {
                    // InternalThingML.g:360:5: (lv_typeRef_3_0= ruleTypeRef )
                    // InternalThingML.g:361:6: lv_typeRef_3_0= ruleTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableAccess().getTypeRefTypeRefParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_typeRef_3_0=ruleTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableRule());
                      						}
                      						set(
                      							current,
                      							"typeRef",
                      							lv_typeRef_3_0,
                      							"org.thingml.xtext.ThingML.TypeRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThingML.g:380:3: this_LocalVariable_4= ruleLocalVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getLocalVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalVariable_4=ruleLocalVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LocalVariable_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:389:3: this_Property_5= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getPropertyParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Property_5=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Property_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThingML.g:398:3: this_Parameter_6= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getParameterParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameter_6=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parameter_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTypeRef"
    // InternalThingML.g:410:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalThingML.g:410:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalThingML.g:411:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalThingML.g:417:1: ruleTypeRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isArray_1_0= '[' ) ) ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isArray_1_0=null;
        Token otherlv_3=null;
        EObject lv_cardinality_2_1 = null;

        EObject lv_cardinality_2_2 = null;



        	enterRule();

        try {
            // InternalThingML.g:423:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isArray_1_0= '[' ) ) ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )? otherlv_3= ']' )? ) )
            // InternalThingML.g:424:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isArray_1_0= '[' ) ) ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )? otherlv_3= ']' )? )
            {
            // InternalThingML.g:424:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isArray_1_0= '[' ) ) ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )? otherlv_3= ']' )? )
            // InternalThingML.g:425:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_isArray_1_0= '[' ) ) ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )? otherlv_3= ']' )?
            {
            // InternalThingML.g:425:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:426:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:426:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:427:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeRefRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_0());
              				
            }

            }


            }

            // InternalThingML.g:438:3: ( ( (lv_isArray_1_0= '[' ) ) ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )? otherlv_3= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalThingML.g:439:4: ( (lv_isArray_1_0= '[' ) ) ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )? otherlv_3= ']'
                    {
                    // InternalThingML.g:439:4: ( (lv_isArray_1_0= '[' ) )
                    // InternalThingML.g:440:5: (lv_isArray_1_0= '[' )
                    {
                    // InternalThingML.g:440:5: (lv_isArray_1_0= '[' )
                    // InternalThingML.g:441:6: lv_isArray_1_0= '['
                    {
                    lv_isArray_1_0=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isArray_1_0, grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRefRule());
                      						}
                      						setWithLastConsumed(current, "isArray", true, "[");
                      					
                    }

                    }


                    }

                    // InternalThingML.g:453:4: ( ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID||LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalThingML.g:454:5: ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) )
                            {
                            // InternalThingML.g:454:5: ( (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference ) )
                            // InternalThingML.g:455:6: (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference )
                            {
                            // InternalThingML.g:455:6: (lv_cardinality_2_1= ruleIntegerLiteral | lv_cardinality_2_2= rulePropertyReference )
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==RULE_INT) ) {
                                alt6=1;
                            }
                            else if ( (LA6_0==RULE_ID) ) {
                                alt6=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 0, input);

                                throw nvae;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalThingML.g:456:7: lv_cardinality_2_1= ruleIntegerLiteral
                                    {
                                    if ( state.backtracking==0 ) {

                                      							newCompositeNode(grammarAccess.getTypeRefAccess().getCardinalityIntegerLiteralParserRuleCall_1_1_0_0());
                                      						
                                    }
                                    pushFollow(FOLLOW_12);
                                    lv_cardinality_2_1=ruleIntegerLiteral();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElementForParent(grammarAccess.getTypeRefRule());
                                      							}
                                      							set(
                                      								current,
                                      								"cardinality",
                                      								lv_cardinality_2_1,
                                      								"org.thingml.xtext.ThingML.IntegerLiteral");
                                      							afterParserOrEnumRuleCall();
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalThingML.g:472:7: lv_cardinality_2_2= rulePropertyReference
                                    {
                                    if ( state.backtracking==0 ) {

                                      							newCompositeNode(grammarAccess.getTypeRefAccess().getCardinalityPropertyReferenceParserRuleCall_1_1_0_1());
                                      						
                                    }
                                    pushFollow(FOLLOW_12);
                                    lv_cardinality_2_2=rulePropertyReference();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElementForParent(grammarAccess.getTypeRefRule());
                                      							}
                                      							set(
                                      								current,
                                      								"cardinality",
                                      								lv_cardinality_2_2,
                                      								"org.thingml.xtext.ThingML.PropertyReference");
                                      							afterParserOrEnumRuleCall();
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleType"
    // InternalThingML.g:499:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalThingML.g:499:45: (iv_ruleType= ruleType EOF )
            // InternalThingML.g:500:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalThingML.g:506:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ObjectType_1= ruleObjectType | this_Enumeration_2= ruleEnumeration | this_Thing_3= ruleThing ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ObjectType_1 = null;

        EObject this_Enumeration_2 = null;

        EObject this_Thing_3 = null;



        	enterRule();

        try {
            // InternalThingML.g:512:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_ObjectType_1= ruleObjectType | this_Enumeration_2= ruleEnumeration | this_Thing_3= ruleThing ) )
            // InternalThingML.g:513:2: (this_PrimitiveType_0= rulePrimitiveType | this_ObjectType_1= ruleObjectType | this_Enumeration_2= ruleEnumeration | this_Thing_3= ruleThing )
            {
            // InternalThingML.g:513:2: (this_PrimitiveType_0= rulePrimitiveType | this_ObjectType_1= ruleObjectType | this_Enumeration_2= ruleEnumeration | this_Thing_3= ruleThing )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalThingML.g:514:3: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:523:3: this_ObjectType_1= ruleObjectType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getObjectTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ObjectType_1=ruleObjectType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ObjectType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:532:3: this_Enumeration_2= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enumeration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThingML.g:541:3: this_Thing_3= ruleThing
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getThingParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Thing_3=ruleThing();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Thing_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalThingML.g:553:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalThingML.g:553:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalThingML.g:554:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalThingML.g:560:1: rulePrimitiveType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ( '<' )=>otherlv_2= '<' ) ( (lv_ByteSize_3_0= RULE_INT ) ) otherlv_4= '>' ( (lv_annotations_5_0= rulePlatformAnnotation ) )* (otherlv_6= ';' )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_ByteSize_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_5_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:566:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ( '<' )=>otherlv_2= '<' ) ( (lv_ByteSize_3_0= RULE_INT ) ) otherlv_4= '>' ( (lv_annotations_5_0= rulePlatformAnnotation ) )* (otherlv_6= ';' )? ) )
            // InternalThingML.g:567:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ( '<' )=>otherlv_2= '<' ) ( (lv_ByteSize_3_0= RULE_INT ) ) otherlv_4= '>' ( (lv_annotations_5_0= rulePlatformAnnotation ) )* (otherlv_6= ';' )? )
            {
            // InternalThingML.g:567:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ( '<' )=>otherlv_2= '<' ) ( (lv_ByteSize_3_0= RULE_INT ) ) otherlv_4= '>' ( (lv_annotations_5_0= rulePlatformAnnotation ) )* (otherlv_6= ';' )? )
            // InternalThingML.g:568:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ( '<' )=>otherlv_2= '<' ) ( (lv_ByteSize_3_0= RULE_INT ) ) otherlv_4= '>' ( (lv_annotations_5_0= rulePlatformAnnotation ) )* (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalThingML.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:590:3: ( ( '<' )=>otherlv_2= '<' )
            // InternalThingML.g:591:4: ( '<' )=>otherlv_2= '<'
            {
            otherlv_2=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getLessThanSignKeyword_2());
              			
            }

            }

            // InternalThingML.g:597:3: ( (lv_ByteSize_3_0= RULE_INT ) )
            // InternalThingML.g:598:4: (lv_ByteSize_3_0= RULE_INT )
            {
            // InternalThingML.g:598:4: (lv_ByteSize_3_0= RULE_INT )
            // InternalThingML.g:599:5: lv_ByteSize_3_0= RULE_INT
            {
            lv_ByteSize_3_0=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ByteSize_3_0, grammarAccess.getPrimitiveTypeAccess().getByteSizeINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"ByteSize",
              						lv_ByteSize_3_0,
              						"org.thingml.xtext.ThingML.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeAccess().getGreaterThanSignKeyword_4());
              		
            }
            // InternalThingML.g:619:3: ( (lv_annotations_5_0= rulePlatformAnnotation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ANNOTATION_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalThingML.g:620:4: (lv_annotations_5_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:620:4: (lv_annotations_5_0= rulePlatformAnnotation )
            	    // InternalThingML.g:621:5: lv_annotations_5_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_5_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_5_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalThingML.g:638:3: (otherlv_6= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalThingML.g:639:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleObjectType"
    // InternalThingML.g:648:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
            // InternalThingML.g:648:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalThingML.g:649:2: iv_ruleObjectType= ruleObjectType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectType=ruleObjectType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalThingML.g:655:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? ) ;
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_annotations_2_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:661:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? ) )
            // InternalThingML.g:662:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? )
            {
            // InternalThingML.g:662:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? )
            // InternalThingML.g:663:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
              		
            }
            // InternalThingML.g:667:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:668:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:668:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:669:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjectTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:685:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANNOTATION_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalThingML.g:686:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:686:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalThingML.g:687:5: lv_annotations_2_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getObjectTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_2_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getObjectTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_2_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalThingML.g:704:3: (otherlv_3= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalThingML.g:705:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalThingML.g:714:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalThingML.g:714:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalThingML.g:715:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalThingML.g:721:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( ( ( 'as' )=>otherlv_2= 'as' ) ( (lv_typeRef_3_0= ruleTypeRef ) ) )? ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_literals_6_0= ruleEnumerationLiteral ) )* otherlv_7= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_typeRef_3_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_literals_6_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:727:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( ( ( 'as' )=>otherlv_2= 'as' ) ( (lv_typeRef_3_0= ruleTypeRef ) ) )? ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_literals_6_0= ruleEnumerationLiteral ) )* otherlv_7= '}' ) )
            // InternalThingML.g:728:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( ( ( 'as' )=>otherlv_2= 'as' ) ( (lv_typeRef_3_0= ruleTypeRef ) ) )? ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_literals_6_0= ruleEnumerationLiteral ) )* otherlv_7= '}' )
            {
            // InternalThingML.g:728:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( ( ( 'as' )=>otherlv_2= 'as' ) ( (lv_typeRef_3_0= ruleTypeRef ) ) )? ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_literals_6_0= ruleEnumerationLiteral ) )* otherlv_7= '}' )
            // InternalThingML.g:729:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( ( ( 'as' )=>otherlv_2= 'as' ) ( (lv_typeRef_3_0= ruleTypeRef ) ) )? ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_literals_6_0= ruleEnumerationLiteral ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalThingML.g:733:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:734:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:734:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:735:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:751:3: ( ( ( 'as' )=>otherlv_2= 'as' ) ( (lv_typeRef_3_0= ruleTypeRef ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) && (synpred2_InternalThingML())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalThingML.g:752:4: ( ( 'as' )=>otherlv_2= 'as' ) ( (lv_typeRef_3_0= ruleTypeRef ) )
                    {
                    // InternalThingML.g:752:4: ( ( 'as' )=>otherlv_2= 'as' )
                    // InternalThingML.g:753:5: ( 'as' )=>otherlv_2= 'as'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getAsKeyword_2_0());
                      				
                    }

                    }

                    // InternalThingML.g:759:4: ( (lv_typeRef_3_0= ruleTypeRef ) )
                    // InternalThingML.g:760:5: (lv_typeRef_3_0= ruleTypeRef )
                    {
                    // InternalThingML.g:760:5: (lv_typeRef_3_0= ruleTypeRef )
                    // InternalThingML.g:761:6: lv_typeRef_3_0= ruleTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnumerationAccess().getTypeRefTypeRefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_typeRef_3_0=ruleTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnumerationRule());
                      						}
                      						set(
                      							current,
                      							"typeRef",
                      							lv_typeRef_3_0,
                      							"org.thingml.xtext.ThingML.TypeRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:779:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ANNOTATION_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalThingML.g:780:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:780:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalThingML.g:781:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_4_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_4_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalThingML.g:802:3: ( (lv_literals_6_0= ruleEnumerationLiteral ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalThingML.g:803:4: (lv_literals_6_0= ruleEnumerationLiteral )
            	    {
            	    // InternalThingML.g:803:4: (lv_literals_6_0= ruleEnumerationLiteral )
            	    // InternalThingML.g:804:5: lv_literals_6_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_literals_6_0=ruleEnumerationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"literals",
            	      						lv_literals_6_0,
            	      						"org.thingml.xtext.ThingML.EnumerationLiteral");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalThingML.g:829:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalThingML.g:829:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalThingML.g:830:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalThingML.g:836:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleLiteral ) ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_init_2_0 = null;

        EObject lv_annotations_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:842:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleLiteral ) ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:843:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleLiteral ) ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:843:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleLiteral ) ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:844:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_init_2_0= ruleLiteral ) ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            {
            // InternalThingML.g:844:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalThingML.g:845:4: (lv_name_0_0= RULE_ID )
            {
            // InternalThingML.g:845:4: (lv_name_0_0= RULE_ID )
            // InternalThingML.g:846:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:862:3: (otherlv_1= '=' ( (lv_init_2_0= ruleLiteral ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalThingML.g:863:4: otherlv_1= '=' ( (lv_init_2_0= ruleLiteral ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalThingML.g:867:4: ( (lv_init_2_0= ruleLiteral ) )
                    // InternalThingML.g:868:5: (lv_init_2_0= ruleLiteral )
                    {
                    // InternalThingML.g:868:5: (lv_init_2_0= ruleLiteral )
                    // InternalThingML.g:869:6: lv_init_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getInitLiteralParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_init_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
                      						}
                      						set(
                      							current,
                      							"init",
                      							lv_init_2_0,
                      							"org.thingml.xtext.ThingML.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:887:3: ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ANNOTATION_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalThingML.g:888:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:888:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    // InternalThingML.g:889:5: lv_annotations_3_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_3_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_3_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleThing"
    // InternalThingML.g:910:1: entryRuleThing returns [EObject current=null] : iv_ruleThing= ruleThing EOF ;
    public final EObject entryRuleThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThing = null;


        try {
            // InternalThingML.g:910:46: (iv_ruleThing= ruleThing EOF )
            // InternalThingML.g:911:2: iv_ruleThing= ruleThing EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThing=ruleThing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThing; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleThing"


    // $ANTLR start "ruleThing"
    // InternalThingML.g:917:1: ruleThing returns [EObject current=null] : (otherlv_0= 'thing' ( (lv_fragment_1_0= 'fragment' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'includes' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( ( (lv_messages_9_0= ruleMessage ) ) | ( (lv_ports_10_0= rulePort ) ) | ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_functions_12_0= ruleFunction ) ) | ( (lv_assign_13_0= rulePropertyAssign ) ) )* ( (lv_behaviour_14_0= ruleStateMachine ) )? otherlv_15= '}' ) ;
    public final EObject ruleThing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_15=null;
        EObject lv_annotations_7_0 = null;

        EObject lv_messages_9_0 = null;

        EObject lv_ports_10_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_functions_12_0 = null;

        EObject lv_assign_13_0 = null;

        EObject lv_behaviour_14_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:923:2: ( (otherlv_0= 'thing' ( (lv_fragment_1_0= 'fragment' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'includes' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( ( (lv_messages_9_0= ruleMessage ) ) | ( (lv_ports_10_0= rulePort ) ) | ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_functions_12_0= ruleFunction ) ) | ( (lv_assign_13_0= rulePropertyAssign ) ) )* ( (lv_behaviour_14_0= ruleStateMachine ) )? otherlv_15= '}' ) )
            // InternalThingML.g:924:2: (otherlv_0= 'thing' ( (lv_fragment_1_0= 'fragment' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'includes' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( ( (lv_messages_9_0= ruleMessage ) ) | ( (lv_ports_10_0= rulePort ) ) | ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_functions_12_0= ruleFunction ) ) | ( (lv_assign_13_0= rulePropertyAssign ) ) )* ( (lv_behaviour_14_0= ruleStateMachine ) )? otherlv_15= '}' )
            {
            // InternalThingML.g:924:2: (otherlv_0= 'thing' ( (lv_fragment_1_0= 'fragment' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'includes' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( ( (lv_messages_9_0= ruleMessage ) ) | ( (lv_ports_10_0= rulePort ) ) | ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_functions_12_0= ruleFunction ) ) | ( (lv_assign_13_0= rulePropertyAssign ) ) )* ( (lv_behaviour_14_0= ruleStateMachine ) )? otherlv_15= '}' )
            // InternalThingML.g:925:3: otherlv_0= 'thing' ( (lv_fragment_1_0= 'fragment' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'includes' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( ( (lv_messages_9_0= ruleMessage ) ) | ( (lv_ports_10_0= rulePort ) ) | ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_functions_12_0= ruleFunction ) ) | ( (lv_assign_13_0= rulePropertyAssign ) ) )* ( (lv_behaviour_14_0= ruleStateMachine ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThingAccess().getThingKeyword_0());
              		
            }
            // InternalThingML.g:929:3: ( (lv_fragment_1_0= 'fragment' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalThingML.g:930:4: (lv_fragment_1_0= 'fragment' )
                    {
                    // InternalThingML.g:930:4: (lv_fragment_1_0= 'fragment' )
                    // InternalThingML.g:931:5: lv_fragment_1_0= 'fragment'
                    {
                    lv_fragment_1_0=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_fragment_1_0, grammarAccess.getThingAccess().getFragmentFragmentKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getThingRule());
                      					}
                      					setWithLastConsumed(current, "fragment", true, "fragment");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalThingML.g:943:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:944:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:944:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:945:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getThingAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getThingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:961:3: (otherlv_3= 'includes' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalThingML.g:962:4: otherlv_3= 'includes' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getThingAccess().getIncludesKeyword_3_0());
                      			
                    }
                    // InternalThingML.g:966:4: ( (otherlv_4= RULE_ID ) )
                    // InternalThingML.g:967:5: (otherlv_4= RULE_ID )
                    {
                    // InternalThingML.g:967:5: (otherlv_4= RULE_ID )
                    // InternalThingML.g:968:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getThingRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getThingAccess().getIncludesThingCrossReference_3_1_0());
                      					
                    }

                    }


                    }

                    // InternalThingML.g:979:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==35) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalThingML.g:980:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getThingAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalThingML.g:984:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalThingML.g:985:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalThingML.g:985:6: (otherlv_6= RULE_ID )
                    	    // InternalThingML.g:986:7: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getThingRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_6, grammarAccess.getThingAccess().getIncludesThingCrossReference_3_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalThingML.g:999:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ANNOTATION_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalThingML.g:1000:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:1000:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:1001:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getThingRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_8=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalThingML.g:1022:3: ( ( (lv_messages_9_0= ruleMessage ) ) | ( (lv_ports_10_0= rulePort ) ) | ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_functions_12_0= ruleFunction ) ) | ( (lv_assign_13_0= rulePropertyAssign ) ) )*
            loop23:
            do {
                int alt23=6;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt23=1;
                    }
                    break;
                case 45:
                case 46:
                case 50:
                case 51:
                    {
                    alt23=2;
                    }
                    break;
                case 42:
                case 43:
                    {
                    alt23=3;
                    }
                    break;
                case 38:
                case 41:
                    {
                    alt23=4;
                    }
                    break;
                case 36:
                    {
                    alt23=5;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalThingML.g:1023:4: ( (lv_messages_9_0= ruleMessage ) )
            	    {
            	    // InternalThingML.g:1023:4: ( (lv_messages_9_0= ruleMessage ) )
            	    // InternalThingML.g:1024:5: (lv_messages_9_0= ruleMessage )
            	    {
            	    // InternalThingML.g:1024:5: (lv_messages_9_0= ruleMessage )
            	    // InternalThingML.g:1025:6: lv_messages_9_0= ruleMessage
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingAccess().getMessagesMessageParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_messages_9_0=ruleMessage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingRule());
            	      						}
            	      						add(
            	      							current,
            	      							"messages",
            	      							lv_messages_9_0,
            	      							"org.thingml.xtext.ThingML.Message");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:1043:4: ( (lv_ports_10_0= rulePort ) )
            	    {
            	    // InternalThingML.g:1043:4: ( (lv_ports_10_0= rulePort ) )
            	    // InternalThingML.g:1044:5: (lv_ports_10_0= rulePort )
            	    {
            	    // InternalThingML.g:1044:5: (lv_ports_10_0= rulePort )
            	    // InternalThingML.g:1045:6: lv_ports_10_0= rulePort
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingAccess().getPortsPortParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_ports_10_0=rulePort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ports",
            	      							lv_ports_10_0,
            	      							"org.thingml.xtext.ThingML.Port");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalThingML.g:1063:4: ( (lv_properties_11_0= ruleProperty ) )
            	    {
            	    // InternalThingML.g:1063:4: ( (lv_properties_11_0= ruleProperty ) )
            	    // InternalThingML.g:1064:5: (lv_properties_11_0= ruleProperty )
            	    {
            	    // InternalThingML.g:1064:5: (lv_properties_11_0= ruleProperty )
            	    // InternalThingML.g:1065:6: lv_properties_11_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingAccess().getPropertiesPropertyParserRuleCall_6_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_properties_11_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_11_0,
            	      							"org.thingml.xtext.ThingML.Property");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalThingML.g:1083:4: ( (lv_functions_12_0= ruleFunction ) )
            	    {
            	    // InternalThingML.g:1083:4: ( (lv_functions_12_0= ruleFunction ) )
            	    // InternalThingML.g:1084:5: (lv_functions_12_0= ruleFunction )
            	    {
            	    // InternalThingML.g:1084:5: (lv_functions_12_0= ruleFunction )
            	    // InternalThingML.g:1085:6: lv_functions_12_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingAccess().getFunctionsFunctionParserRuleCall_6_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_functions_12_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingRule());
            	      						}
            	      						add(
            	      							current,
            	      							"functions",
            	      							lv_functions_12_0,
            	      							"org.thingml.xtext.ThingML.Function");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalThingML.g:1103:4: ( (lv_assign_13_0= rulePropertyAssign ) )
            	    {
            	    // InternalThingML.g:1103:4: ( (lv_assign_13_0= rulePropertyAssign ) )
            	    // InternalThingML.g:1104:5: (lv_assign_13_0= rulePropertyAssign )
            	    {
            	    // InternalThingML.g:1104:5: (lv_assign_13_0= rulePropertyAssign )
            	    // InternalThingML.g:1105:6: lv_assign_13_0= rulePropertyAssign
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getThingAccess().getAssignPropertyAssignParserRuleCall_6_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_assign_13_0=rulePropertyAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getThingRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assign",
            	      							lv_assign_13_0,
            	      							"org.thingml.xtext.ThingML.PropertyAssign");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalThingML.g:1123:3: ( (lv_behaviour_14_0= ruleStateMachine ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==65) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalThingML.g:1124:4: (lv_behaviour_14_0= ruleStateMachine )
                    {
                    // InternalThingML.g:1124:4: (lv_behaviour_14_0= ruleStateMachine )
                    // InternalThingML.g:1125:5: lv_behaviour_14_0= ruleStateMachine
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getThingAccess().getBehaviourStateMachineParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    lv_behaviour_14_0=ruleStateMachine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getThingRule());
                      					}
                      					set(
                      						current,
                      						"behaviour",
                      						lv_behaviour_14_0,
                      						"org.thingml.xtext.ThingML.StateMachine");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getThingAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleThing"


    // $ANTLR start "entryRulePropertyAssign"
    // InternalThingML.g:1150:1: entryRulePropertyAssign returns [EObject current=null] : iv_rulePropertyAssign= rulePropertyAssign EOF ;
    public final EObject entryRulePropertyAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssign = null;


        try {
            // InternalThingML.g:1150:55: (iv_rulePropertyAssign= rulePropertyAssign EOF )
            // InternalThingML.g:1151:2: iv_rulePropertyAssign= rulePropertyAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyAssign=rulePropertyAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyAssign"


    // $ANTLR start "rulePropertyAssign"
    // InternalThingML.g:1157:1: rulePropertyAssign returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
    public final EObject rulePropertyAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_index_3_0 = null;

        EObject lv_init_6_0 = null;

        EObject lv_annotations_7_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:1163:2: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:1164:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:1164:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:1165:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyAssignAccess().getSetKeyword_0());
              		
            }
            // InternalThingML.g:1169:3: ( (otherlv_1= RULE_ID ) )
            // InternalThingML.g:1170:4: (otherlv_1= RULE_ID )
            {
            // InternalThingML.g:1170:4: (otherlv_1= RULE_ID )
            // InternalThingML.g:1171:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyAssignRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getPropertyAssignAccess().getPropertyPropertyCrossReference_1_0());
              				
            }

            }


            }

            // InternalThingML.g:1182:3: ( ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) && (synpred3_InternalThingML())) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalThingML.g:1183:4: ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    // InternalThingML.g:1183:4: ( ( '[' )=>otherlv_2= '[' )
                    // InternalThingML.g:1184:5: ( '[' )=>otherlv_2= '['
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getPropertyAssignAccess().getLeftSquareBracketKeyword_2_0());
                      				
                    }

                    }

                    // InternalThingML.g:1190:4: ( (lv_index_3_0= ruleExpression ) )
                    // InternalThingML.g:1191:5: (lv_index_3_0= ruleExpression )
                    {
                    // InternalThingML.g:1191:5: (lv_index_3_0= ruleExpression )
                    // InternalThingML.g:1192:6: lv_index_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyAssignAccess().getIndexExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_index_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_3_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPropertyAssignAccess().getRightSquareBracketKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPropertyAssignAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalThingML.g:1218:3: ( (lv_init_6_0= ruleExpression ) )
            // InternalThingML.g:1219:4: (lv_init_6_0= ruleExpression )
            {
            // InternalThingML.g:1219:4: (lv_init_6_0= ruleExpression )
            // InternalThingML.g:1220:5: lv_init_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssignAccess().getInitExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_init_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
              					}
              					set(
              						current,
              						"init",
              						lv_init_6_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:1237:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ANNOTATION_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalThingML.g:1238:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:1238:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:1239:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyAssign"


    // $ANTLR start "entryRuleProtocol"
    // InternalThingML.g:1260:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalThingML.g:1260:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalThingML.g:1261:2: iv_ruleProtocol= ruleProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtocolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtocol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalThingML.g:1267:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_annotations_2_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:1273:2: ( (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? ) )
            // InternalThingML.g:1274:2: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? )
            {
            // InternalThingML.g:1274:2: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )? )
            // InternalThingML.g:1275:3: otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
              		
            }
            // InternalThingML.g:1279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:1280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:1280:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:1281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProtocolRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:1297:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ANNOTATION_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalThingML.g:1298:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:1298:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalThingML.g:1299:5: lv_annotations_2_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProtocolAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_2_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProtocolRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_2_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalThingML.g:1316:3: (otherlv_3= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalThingML.g:1317:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getProtocolAccess().getSemicolonKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleFunction"
    // InternalThingML.g:1326:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalThingML.g:1326:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalThingML.g:1327:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalThingML.g:1333:1: ruleFunction returns [EObject current=null] : ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )? ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ( (lv_body_10_0= ruleAction ) ) ) | this_AbstractFunction_11= ruleAbstractFunction ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_typeRef_8_0 = null;

        EObject lv_annotations_9_0 = null;

        EObject lv_body_10_0 = null;

        EObject this_AbstractFunction_11 = null;



        	enterRule();

        try {
            // InternalThingML.g:1339:2: ( ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )? ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ( (lv_body_10_0= ruleAction ) ) ) | this_AbstractFunction_11= ruleAbstractFunction ) )
            // InternalThingML.g:1340:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )? ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ( (lv_body_10_0= ruleAction ) ) ) | this_AbstractFunction_11= ruleAbstractFunction )
            {
            // InternalThingML.g:1340:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )? ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ( (lv_body_10_0= ruleAction ) ) ) | this_AbstractFunction_11= ruleAbstractFunction )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            else if ( (LA33_0==41) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalThingML.g:1341:3: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )? ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ( (lv_body_10_0= ruleAction ) ) )
                    {
                    // InternalThingML.g:1341:3: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )? ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ( (lv_body_10_0= ruleAction ) ) )
                    // InternalThingML.g:1342:4: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )? ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ( (lv_body_10_0= ruleAction ) )
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0_0());
                      			
                    }
                    // InternalThingML.g:1346:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalThingML.g:1347:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalThingML.g:1347:5: (lv_name_1_0= RULE_ID )
                    // InternalThingML.g:1348:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFunctionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.thingml.xtext.ThingML.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_2());
                      			
                    }
                    // InternalThingML.g:1368:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalThingML.g:1369:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            {
                            // InternalThingML.g:1369:5: ( (lv_parameters_3_0= ruleParameter ) )
                            // InternalThingML.g:1370:6: (lv_parameters_3_0= ruleParameter )
                            {
                            // InternalThingML.g:1370:6: (lv_parameters_3_0= ruleParameter )
                            // InternalThingML.g:1371:7: lv_parameters_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_33);
                            lv_parameters_3_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFunctionRule());
                              							}
                              							add(
                              								current,
                              								"parameters",
                              								lv_parameters_3_0,
                              								"org.thingml.xtext.ThingML.Parameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalThingML.g:1388:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==35) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalThingML.g:1389:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalThingML.g:1393:6: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalThingML.g:1394:7: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalThingML.g:1394:7: (lv_parameters_5_0= ruleParameter )
                            	    // InternalThingML.g:1395:8: lv_parameters_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_33);
                            	    lv_parameters_5_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getFunctionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"parameters",
                            	      									lv_parameters_5_0,
                            	      									"org.thingml.xtext.ThingML.Parameter");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4());
                      			
                    }
                    // InternalThingML.g:1418:4: (otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==19) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalThingML.g:1419:5: otherlv_7= ':' ( (lv_typeRef_8_0= ruleTypeRef ) )
                            {
                            otherlv_7=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getColonKeyword_0_5_0());
                              				
                            }
                            // InternalThingML.g:1423:5: ( (lv_typeRef_8_0= ruleTypeRef ) )
                            // InternalThingML.g:1424:6: (lv_typeRef_8_0= ruleTypeRef )
                            {
                            // InternalThingML.g:1424:6: (lv_typeRef_8_0= ruleTypeRef )
                            // InternalThingML.g:1425:7: lv_typeRef_8_0= ruleTypeRef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFunctionAccess().getTypeRefTypeRefParserRuleCall_0_5_1_0());
                              						
                            }
                            pushFollow(FOLLOW_34);
                            lv_typeRef_8_0=ruleTypeRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFunctionRule());
                              							}
                              							set(
                              								current,
                              								"typeRef",
                              								lv_typeRef_8_0,
                              								"org.thingml.xtext.ThingML.TypeRef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalThingML.g:1443:4: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ANNOTATION_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalThingML.g:1444:5: (lv_annotations_9_0= rulePlatformAnnotation )
                    	    {
                    	    // InternalThingML.g:1444:5: (lv_annotations_9_0= rulePlatformAnnotation )
                    	    // InternalThingML.g:1445:6: lv_annotations_9_0= rulePlatformAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_0_6_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_34);
                    	    lv_annotations_9_0=rulePlatformAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"annotations",
                    	      							lv_annotations_9_0,
                    	      							"org.thingml.xtext.ThingML.PlatformAnnotation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // InternalThingML.g:1462:4: ( (lv_body_10_0= ruleAction ) )
                    // InternalThingML.g:1463:5: (lv_body_10_0= ruleAction )
                    {
                    // InternalThingML.g:1463:5: (lv_body_10_0= ruleAction )
                    // InternalThingML.g:1464:6: lv_body_10_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionAccess().getBodyActionParserRuleCall_0_7_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_10_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionRule());
                      						}
                      						set(
                      							current,
                      							"body",
                      							lv_body_10_0,
                      							"org.thingml.xtext.ThingML.Action");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThingML.g:1483:3: this_AbstractFunction_11= ruleAbstractFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionAccess().getAbstractFunctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AbstractFunction_11=ruleAbstractFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AbstractFunction_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleAbstractFunction"
    // InternalThingML.g:1495:1: entryRuleAbstractFunction returns [EObject current=null] : iv_ruleAbstractFunction= ruleAbstractFunction EOF ;
    public final EObject entryRuleAbstractFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFunction = null;


        try {
            // InternalThingML.g:1495:57: (iv_ruleAbstractFunction= ruleAbstractFunction EOF )
            // InternalThingML.g:1496:2: iv_ruleAbstractFunction= ruleAbstractFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractFunction=ruleAbstractFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractFunction"


    // $ANTLR start "ruleAbstractFunction"
    // InternalThingML.g:1502:1: ruleAbstractFunction returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeRef_9_0= ruleTypeRef ) ) )? ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleAbstractFunction() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_typeRef_9_0 = null;

        EObject lv_annotations_10_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:1508:2: ( ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeRef_9_0= ruleTypeRef ) ) )? ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:1509:2: ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeRef_9_0= ruleTypeRef ) ) )? ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:1509:2: ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeRef_9_0= ruleTypeRef ) ) )? ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:1510:3: ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeRef_9_0= ruleTypeRef ) ) )? ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            {
            // InternalThingML.g:1510:3: ( (lv_abstract_0_0= 'abstract' ) )
            // InternalThingML.g:1511:4: (lv_abstract_0_0= 'abstract' )
            {
            // InternalThingML.g:1511:4: (lv_abstract_0_0= 'abstract' )
            // InternalThingML.g:1512:5: lv_abstract_0_0= 'abstract'
            {
            lv_abstract_0_0=(Token)match(input,41,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_abstract_0_0, grammarAccess.getAbstractFunctionAccess().getAbstractAbstractKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAbstractFunctionRule());
              					}
              					setWithLastConsumed(current, "abstract", true, "abstract");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAbstractFunctionAccess().getFunctionKeyword_1());
              		
            }
            // InternalThingML.g:1528:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:1529:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:1529:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:1530:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getAbstractFunctionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAbstractFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAbstractFunctionAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalThingML.g:1550:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalThingML.g:1551:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // InternalThingML.g:1551:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalThingML.g:1552:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalThingML.g:1552:5: (lv_parameters_4_0= ruleParameter )
                    // InternalThingML.g:1553:6: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_4_0,
                      							"org.thingml.xtext.ThingML.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalThingML.g:1570:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==35) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalThingML.g:1571:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getAbstractFunctionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalThingML.g:1575:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalThingML.g:1576:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalThingML.g:1576:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalThingML.g:1577:7: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_6_0,
                    	      								"org.thingml.xtext.ThingML.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,40,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAbstractFunctionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalThingML.g:1600:3: (otherlv_8= ':' ( (lv_typeRef_9_0= ruleTypeRef ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalThingML.g:1601:4: otherlv_8= ':' ( (lv_typeRef_9_0= ruleTypeRef ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getAbstractFunctionAccess().getColonKeyword_6_0());
                      			
                    }
                    // InternalThingML.g:1605:4: ( (lv_typeRef_9_0= ruleTypeRef ) )
                    // InternalThingML.g:1606:5: (lv_typeRef_9_0= ruleTypeRef )
                    {
                    // InternalThingML.g:1606:5: (lv_typeRef_9_0= ruleTypeRef )
                    // InternalThingML.g:1607:6: lv_typeRef_9_0= ruleTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAbstractFunctionAccess().getTypeRefTypeRefParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_typeRef_9_0=ruleTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
                      						}
                      						set(
                      							current,
                      							"typeRef",
                      							lv_typeRef_9_0,
                      							"org.thingml.xtext.ThingML.TypeRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:1625:3: ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ANNOTATION_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalThingML.g:1626:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:1626:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    // InternalThingML.g:1627:5: lv_annotations_10_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAbstractFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_10_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_10_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAbstractFunction"


    // $ANTLR start "entryRuleProperty"
    // InternalThingML.g:1648:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalThingML.g:1648:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalThingML.g:1649:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalThingML.g:1655:1: ruleProperty returns [EObject current=null] : ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_readonly_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typeRef_4_0 = null;

        EObject lv_init_6_0 = null;

        EObject lv_annotations_7_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:1661:2: ( ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:1662:2: ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:1662:2: ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:1663:3: ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            // InternalThingML.g:1663:3: ( (lv_readonly_0_0= 'readonly' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalThingML.g:1664:4: (lv_readonly_0_0= 'readonly' )
                    {
                    // InternalThingML.g:1664:4: (lv_readonly_0_0= 'readonly' )
                    // InternalThingML.g:1665:5: lv_readonly_0_0= 'readonly'
                    {
                    lv_readonly_0_0=(Token)match(input,42,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_readonly_0_0, grammarAccess.getPropertyAccess().getReadonlyReadonlyKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPropertyRule());
                      					}
                      					setWithLastConsumed(current, "readonly", true, "readonly");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
              		
            }
            // InternalThingML.g:1681:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:1682:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:1682:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:1683:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getColonKeyword_3());
              		
            }
            // InternalThingML.g:1703:3: ( (lv_typeRef_4_0= ruleTypeRef ) )
            // InternalThingML.g:1704:4: (lv_typeRef_4_0= ruleTypeRef )
            {
            // InternalThingML.g:1704:4: (lv_typeRef_4_0= ruleTypeRef )
            // InternalThingML.g:1705:5: lv_typeRef_4_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_typeRef_4_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_4_0,
              						"org.thingml.xtext.ThingML.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:1722:3: (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalThingML.g:1723:4: otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalThingML.g:1727:4: ( (lv_init_6_0= ruleExpression ) )
                    // InternalThingML.g:1728:5: (lv_init_6_0= ruleExpression )
                    {
                    // InternalThingML.g:1728:5: (lv_init_6_0= ruleExpression )
                    // InternalThingML.g:1729:6: lv_init_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyAccess().getInitExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_init_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyRule());
                      						}
                      						set(
                      							current,
                      							"init",
                      							lv_init_6_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:1747:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ANNOTATION_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalThingML.g:1748:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:1748:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:1749:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPropertyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMessage"
    // InternalThingML.g:1770:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalThingML.g:1770:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalThingML.g:1771:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalThingML.g:1777:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* (otherlv_8= ';' )? ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_annotations_7_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:1783:2: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* (otherlv_8= ';' )? ) )
            // InternalThingML.g:1784:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* (otherlv_8= ';' )? )
            {
            // InternalThingML.g:1784:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* (otherlv_8= ';' )? )
            // InternalThingML.g:1785:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
              		
            }
            // InternalThingML.g:1789:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:1790:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:1790:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:1791:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMessageRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalThingML.g:1811:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalThingML.g:1812:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalThingML.g:1812:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalThingML.g:1813:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalThingML.g:1813:5: (lv_parameters_3_0= ruleParameter )
                    // InternalThingML.g:1814:6: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMessageRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"org.thingml.xtext.ThingML.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalThingML.g:1831:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==35) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalThingML.g:1832:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalThingML.g:1836:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalThingML.g:1837:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalThingML.g:1837:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalThingML.g:1838:7: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMessageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"org.thingml.xtext.ThingML.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,40,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalThingML.g:1861:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ANNOTATION_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalThingML.g:1862:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:1862:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:1863:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMessageAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMessageRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalThingML.g:1880:3: (otherlv_8= ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalThingML.g:1881:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleParameter"
    // InternalThingML.g:1890:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalThingML.g:1890:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalThingML.g:1891:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalThingML.g:1897:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= ruleTypeRef ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeRef_2_0 = null;

        EObject lv_annotations_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:1903:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= ruleTypeRef ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:1904:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= ruleTypeRef ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:1904:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= ruleTypeRef ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:1905:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= ruleTypeRef ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            {
            // InternalThingML.g:1905:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalThingML.g:1906:4: (lv_name_0_0= RULE_ID )
            {
            // InternalThingML.g:1906:4: (lv_name_0_0= RULE_ID )
            // InternalThingML.g:1907:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalThingML.g:1927:3: ( (lv_typeRef_2_0= ruleTypeRef ) )
            // InternalThingML.g:1928:4: (lv_typeRef_2_0= ruleTypeRef )
            {
            // InternalThingML.g:1928:4: (lv_typeRef_2_0= ruleTypeRef )
            // InternalThingML.g:1929:5: lv_typeRef_2_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_typeRef_2_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_2_0,
              						"org.thingml.xtext.ThingML.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:1946:3: ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ANNOTATION_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalThingML.g:1947:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:1947:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    // InternalThingML.g:1948:5: lv_annotations_3_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_3_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getParameterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_3_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePort"
    // InternalThingML.g:1969:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalThingML.g:1969:45: (iv_rulePort= rulePort EOF )
            // InternalThingML.g:1970:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalThingML.g:1976:1: rulePort returns [EObject current=null] : (this_RequiredPort_0= ruleRequiredPort | this_ProvidedPort_1= ruleProvidedPort | this_InternalPort_2= ruleInternalPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_RequiredPort_0 = null;

        EObject this_ProvidedPort_1 = null;

        EObject this_InternalPort_2 = null;



        	enterRule();

        try {
            // InternalThingML.g:1982:2: ( (this_RequiredPort_0= ruleRequiredPort | this_ProvidedPort_1= ruleProvidedPort | this_InternalPort_2= ruleInternalPort ) )
            // InternalThingML.g:1983:2: (this_RequiredPort_0= ruleRequiredPort | this_ProvidedPort_1= ruleProvidedPort | this_InternalPort_2= ruleInternalPort )
            {
            // InternalThingML.g:1983:2: (this_RequiredPort_0= ruleRequiredPort | this_ProvidedPort_1= ruleProvidedPort | this_InternalPort_2= ruleInternalPort )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
                {
                alt46=1;
                }
                break;
            case 50:
                {
                alt46=2;
                }
                break;
            case 51:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalThingML.g:1984:3: this_RequiredPort_0= ruleRequiredPort
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RequiredPort_0=ruleRequiredPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RequiredPort_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:1993:3: this_ProvidedPort_1= ruleProvidedPort
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProvidedPort_1=ruleProvidedPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProvidedPort_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:2002:3: this_InternalPort_2= ruleInternalPort
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPortAccess().getInternalPortParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InternalPort_2=ruleInternalPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InternalPort_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleRequiredPort"
    // InternalThingML.g:2014:1: entryRuleRequiredPort returns [EObject current=null] : iv_ruleRequiredPort= ruleRequiredPort EOF ;
    public final EObject entryRuleRequiredPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPort = null;


        try {
            // InternalThingML.g:2014:53: (iv_ruleRequiredPort= ruleRequiredPort EOF )
            // InternalThingML.g:2015:2: iv_ruleRequiredPort= ruleRequiredPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiredPort=ruleRequiredPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredPort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequiredPort"


    // $ANTLR start "ruleRequiredPort"
    // InternalThingML.g:2021:1: ruleRequiredPort returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'required' otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) | (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )* otherlv_14= '}' ) ;
    public final EObject ruleRequiredPort() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:2027:2: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'required' otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) | (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )* otherlv_14= '}' ) )
            // InternalThingML.g:2028:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'required' otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) | (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )* otherlv_14= '}' )
            {
            // InternalThingML.g:2028:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'required' otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) | (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )* otherlv_14= '}' )
            // InternalThingML.g:2029:3: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'required' otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) | (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )* otherlv_14= '}'
            {
            // InternalThingML.g:2029:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalThingML.g:2030:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalThingML.g:2030:4: (lv_optional_0_0= 'optional' )
                    // InternalThingML.g:2031:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,45,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_optional_0_0, grammarAccess.getRequiredPortAccess().getOptionalOptionalKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRequiredPortRule());
                      					}
                      					setWithLastConsumed(current, "optional", true, "optional");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,46,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRequiredPortAccess().getRequiredKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRequiredPortAccess().getPortKeyword_2());
              		
            }
            // InternalThingML.g:2051:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalThingML.g:2052:4: (lv_name_3_0= RULE_ID )
            {
            // InternalThingML.g:2052:4: (lv_name_3_0= RULE_ID )
            // InternalThingML.g:2053:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRequiredPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:2069:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ANNOTATION_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalThingML.g:2070:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:2070:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalThingML.g:2071:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRequiredPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_4_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRequiredPortRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_4_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRequiredPortAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalThingML.g:2092:3: ( (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) | (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==48) ) {
                    alt51=1;
                }
                else if ( (LA51_0==49) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalThingML.g:2093:4: (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            	    {
            	    // InternalThingML.g:2093:4: (otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            	    // InternalThingML.g:2094:5: otherlv_6= 'sends' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getRequiredPortAccess().getSendsKeyword_6_0_0());
            	      				
            	    }
            	    // InternalThingML.g:2098:5: ( (otherlv_7= RULE_ID ) )
            	    // InternalThingML.g:2099:6: (otherlv_7= RULE_ID )
            	    {
            	    // InternalThingML.g:2099:6: (otherlv_7= RULE_ID )
            	    // InternalThingML.g:2100:7: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getRequiredPortRule());
            	      							}
            	      						
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalThingML.g:2111:5: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==35) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalThingML.g:2112:6: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_8, grammarAccess.getRequiredPortAccess().getCommaKeyword_6_0_2_0());
            	    	      					
            	    	    }
            	    	    // InternalThingML.g:2116:6: ( (otherlv_9= RULE_ID ) )
            	    	    // InternalThingML.g:2117:7: (otherlv_9= RULE_ID )
            	    	    {
            	    	    // InternalThingML.g:2117:7: (otherlv_9= RULE_ID )
            	    	    // InternalThingML.g:2118:8: otherlv_9= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElement(grammarAccess.getRequiredPortRule());
            	    	      								}
            	    	      							
            	    	    }
            	    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								newLeafNode(otherlv_9, grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_2_1_0());
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:2132:4: (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            	    {
            	    // InternalThingML.g:2132:4: (otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            	    // InternalThingML.g:2133:5: otherlv_10= 'receives' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            	    {
            	    otherlv_10=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_10, grammarAccess.getRequiredPortAccess().getReceivesKeyword_6_1_0());
            	      				
            	    }
            	    // InternalThingML.g:2137:5: ( (otherlv_11= RULE_ID ) )
            	    // InternalThingML.g:2138:6: (otherlv_11= RULE_ID )
            	    {
            	    // InternalThingML.g:2138:6: (otherlv_11= RULE_ID )
            	    // InternalThingML.g:2139:7: otherlv_11= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getRequiredPortRule());
            	      							}
            	      						
            	    }
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_11, grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalThingML.g:2150:5: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==35) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // InternalThingML.g:2151:6: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_12, grammarAccess.getRequiredPortAccess().getCommaKeyword_6_1_2_0());
            	    	      					
            	    	    }
            	    	    // InternalThingML.g:2155:6: ( (otherlv_13= RULE_ID ) )
            	    	    // InternalThingML.g:2156:7: (otherlv_13= RULE_ID )
            	    	    {
            	    	    // InternalThingML.g:2156:7: (otherlv_13= RULE_ID )
            	    	    // InternalThingML.g:2157:8: otherlv_13= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElement(grammarAccess.getRequiredPortRule());
            	    	      								}
            	    	      							
            	    	    }
            	    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								newLeafNode(otherlv_13, grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_2_1_0());
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_14=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getRequiredPortAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRequiredPort"


    // $ANTLR start "entryRuleProvidedPort"
    // InternalThingML.g:2179:1: entryRuleProvidedPort returns [EObject current=null] : iv_ruleProvidedPort= ruleProvidedPort EOF ;
    public final EObject entryRuleProvidedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedPort = null;


        try {
            // InternalThingML.g:2179:53: (iv_ruleProvidedPort= ruleProvidedPort EOF )
            // InternalThingML.g:2180:2: iv_ruleProvidedPort= ruleProvidedPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProvidedPort=ruleProvidedPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedPort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProvidedPort"


    // $ANTLR start "ruleProvidedPort"
    // InternalThingML.g:2186:1: ruleProvidedPort returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' ) ;
    public final EObject ruleProvidedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_annotations_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:2192:2: ( (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' ) )
            // InternalThingML.g:2193:2: (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' )
            {
            // InternalThingML.g:2193:2: (otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' )
            // InternalThingML.g:2194:3: otherlv_0= 'provided' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProvidedPortAccess().getProvidedKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,47,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProvidedPortAccess().getPortKeyword_1());
              		
            }
            // InternalThingML.g:2202:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:2203:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:2203:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:2204:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProvidedPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:2220:3: ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ANNOTATION_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalThingML.g:2221:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:2221:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    // InternalThingML.g:2222:5: lv_annotations_3_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProvidedPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_3_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProvidedPortRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_3_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProvidedPortAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalThingML.g:2243:3: ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )*
            loop55:
            do {
                int alt55=3;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==48) ) {
                    alt55=1;
                }
                else if ( (LA55_0==49) ) {
                    alt55=2;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalThingML.g:2244:4: (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            	    {
            	    // InternalThingML.g:2244:4: (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            	    // InternalThingML.g:2245:5: otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,48,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getProvidedPortAccess().getSendsKeyword_5_0_0());
            	      				
            	    }
            	    // InternalThingML.g:2249:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalThingML.g:2250:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalThingML.g:2250:6: (otherlv_6= RULE_ID )
            	    // InternalThingML.g:2251:7: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getProvidedPortRule());
            	      							}
            	      						
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_6, grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalThingML.g:2262:5: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==35) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalThingML.g:2263:6: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_7, grammarAccess.getProvidedPortAccess().getCommaKeyword_5_0_2_0());
            	    	      					
            	    	    }
            	    	    // InternalThingML.g:2267:6: ( (otherlv_8= RULE_ID ) )
            	    	    // InternalThingML.g:2268:7: (otherlv_8= RULE_ID )
            	    	    {
            	    	    // InternalThingML.g:2268:7: (otherlv_8= RULE_ID )
            	    	    // InternalThingML.g:2269:8: otherlv_8= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElement(grammarAccess.getProvidedPortRule());
            	    	      								}
            	    	      							
            	    	    }
            	    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								newLeafNode(otherlv_8, grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_2_1_0());
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:2283:4: (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
            	    {
            	    // InternalThingML.g:2283:4: (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
            	    // InternalThingML.g:2284:5: otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_9, grammarAccess.getProvidedPortAccess().getReceivesKeyword_5_1_0());
            	      				
            	    }
            	    // InternalThingML.g:2288:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalThingML.g:2289:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalThingML.g:2289:6: (otherlv_10= RULE_ID )
            	    // InternalThingML.g:2290:7: otherlv_10= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getProvidedPortRule());
            	      							}
            	      						
            	    }
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_10, grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalThingML.g:2301:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==35) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalThingML.g:2302:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_11, grammarAccess.getProvidedPortAccess().getCommaKeyword_5_1_2_0());
            	    	      					
            	    	    }
            	    	    // InternalThingML.g:2306:6: ( (otherlv_12= RULE_ID ) )
            	    	    // InternalThingML.g:2307:7: (otherlv_12= RULE_ID )
            	    	    {
            	    	    // InternalThingML.g:2307:7: (otherlv_12= RULE_ID )
            	    	    // InternalThingML.g:2308:8: otherlv_12= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElement(grammarAccess.getProvidedPortRule());
            	    	      								}
            	    	      							
            	    	    }
            	    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								newLeafNode(otherlv_12, grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_2_1_0());
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_13=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getProvidedPortAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProvidedPort"


    // $ANTLR start "entryRuleInternalPort"
    // InternalThingML.g:2330:1: entryRuleInternalPort returns [EObject current=null] : iv_ruleInternalPort= ruleInternalPort EOF ;
    public final EObject entryRuleInternalPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalPort = null;


        try {
            // InternalThingML.g:2330:53: (iv_ruleInternalPort= ruleInternalPort EOF )
            // InternalThingML.g:2331:2: iv_ruleInternalPort= ruleInternalPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInternalPort=ruleInternalPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalPort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInternalPort"


    // $ANTLR start "ruleInternalPort"
    // InternalThingML.g:2337:1: ruleInternalPort returns [EObject current=null] : (otherlv_0= 'internal' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' ) ;
    public final EObject ruleInternalPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_annotations_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:2343:2: ( (otherlv_0= 'internal' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' ) )
            // InternalThingML.g:2344:2: (otherlv_0= 'internal' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' )
            {
            // InternalThingML.g:2344:2: (otherlv_0= 'internal' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}' )
            // InternalThingML.g:2345:3: otherlv_0= 'internal' otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInternalPortAccess().getInternalKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,47,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInternalPortAccess().getPortKeyword_1());
              		
            }
            // InternalThingML.g:2353:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:2354:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:2354:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:2355:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getInternalPortAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInternalPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:2371:3: ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ANNOTATION_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalThingML.g:2372:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:2372:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    // InternalThingML.g:2373:5: lv_annotations_3_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInternalPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_3_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInternalPortRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_3_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInternalPortAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalThingML.g:2394:3: ( (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )*
            loop59:
            do {
                int alt59=3;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==48) ) {
                    alt59=1;
                }
                else if ( (LA59_0==49) ) {
                    alt59=2;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalThingML.g:2395:4: (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            	    {
            	    // InternalThingML.g:2395:4: (otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            	    // InternalThingML.g:2396:5: otherlv_5= 'sends' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,48,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getInternalPortAccess().getSendsKeyword_5_0_0());
            	      				
            	    }
            	    // InternalThingML.g:2400:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalThingML.g:2401:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalThingML.g:2401:6: (otherlv_6= RULE_ID )
            	    // InternalThingML.g:2402:7: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInternalPortRule());
            	      							}
            	      						
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_6, grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalThingML.g:2413:5: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==35) ) {
            	            alt57=1;
            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // InternalThingML.g:2414:6: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_7, grammarAccess.getInternalPortAccess().getCommaKeyword_5_0_2_0());
            	    	      					
            	    	    }
            	    	    // InternalThingML.g:2418:6: ( (otherlv_8= RULE_ID ) )
            	    	    // InternalThingML.g:2419:7: (otherlv_8= RULE_ID )
            	    	    {
            	    	    // InternalThingML.g:2419:7: (otherlv_8= RULE_ID )
            	    	    // InternalThingML.g:2420:8: otherlv_8= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElement(grammarAccess.getInternalPortRule());
            	    	      								}
            	    	      							
            	    	    }
            	    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								newLeafNode(otherlv_8, grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_2_1_0());
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:2434:4: (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
            	    {
            	    // InternalThingML.g:2434:4: (otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
            	    // InternalThingML.g:2435:5: otherlv_9= 'receives' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_9, grammarAccess.getInternalPortAccess().getReceivesKeyword_5_1_0());
            	      				
            	    }
            	    // InternalThingML.g:2439:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalThingML.g:2440:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalThingML.g:2440:6: (otherlv_10= RULE_ID )
            	    // InternalThingML.g:2441:7: otherlv_10= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInternalPortRule());
            	      							}
            	      						
            	    }
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_10, grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalThingML.g:2452:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==35) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // InternalThingML.g:2453:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_11, grammarAccess.getInternalPortAccess().getCommaKeyword_5_1_2_0());
            	    	      					
            	    	    }
            	    	    // InternalThingML.g:2457:6: ( (otherlv_12= RULE_ID ) )
            	    	    // InternalThingML.g:2458:7: (otherlv_12= RULE_ID )
            	    	    {
            	    	    // InternalThingML.g:2458:7: (otherlv_12= RULE_ID )
            	    	    // InternalThingML.g:2459:8: otherlv_12= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElement(grammarAccess.getInternalPortRule());
            	    	      								}
            	    	      							
            	    	    }
            	    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								newLeafNode(otherlv_12, grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_2_1_0());
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_13=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getInternalPortAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInternalPort"


    // $ANTLR start "entryRuleState"
    // InternalThingML.g:2481:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalThingML.g:2481:46: (iv_ruleState= ruleState EOF )
            // InternalThingML.g:2482:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalThingML.g:2488:1: ruleState returns [EObject current=null] : (this_StateMachine_0= ruleStateMachine | this_FinalState_1= ruleFinalState | this_CompositeState_2= ruleCompositeState | (otherlv_3= 'state' ( (lv_name_4_0= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) otherlv_18= '}' ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_18=null;
        EObject this_StateMachine_0 = null;

        EObject this_FinalState_1 = null;

        EObject this_CompositeState_2 = null;

        EObject lv_annotations_5_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_entry_11_0 = null;

        EObject lv_exit_14_0 = null;

        EObject lv_properties_15_0 = null;

        EObject lv_internal_16_0 = null;

        EObject lv_outgoing_17_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:2494:2: ( (this_StateMachine_0= ruleStateMachine | this_FinalState_1= ruleFinalState | this_CompositeState_2= ruleCompositeState | (otherlv_3= 'state' ( (lv_name_4_0= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) otherlv_18= '}' ) ) )
            // InternalThingML.g:2495:2: (this_StateMachine_0= ruleStateMachine | this_FinalState_1= ruleFinalState | this_CompositeState_2= ruleCompositeState | (otherlv_3= 'state' ( (lv_name_4_0= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) otherlv_18= '}' ) )
            {
            // InternalThingML.g:2495:2: (this_StateMachine_0= ruleStateMachine | this_FinalState_1= ruleFinalState | this_CompositeState_2= ruleCompositeState | (otherlv_3= 'state' ( (lv_name_4_0= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) otherlv_18= '}' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt65=1;
                }
                break;
            case 68:
                {
                alt65=2;
                }
                break;
            case 61:
                {
                alt65=3;
                }
                break;
            case 52:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalThingML.g:2496:3: this_StateMachine_0= ruleStateMachine
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStateAccess().getStateMachineParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StateMachine_0=ruleStateMachine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StateMachine_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:2505:3: this_FinalState_1= ruleFinalState
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FinalState_1=ruleFinalState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FinalState_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:2514:3: this_CompositeState_2= ruleCompositeState
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStateAccess().getCompositeStateParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompositeState_2=ruleCompositeState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompositeState_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThingML.g:2523:3: (otherlv_3= 'state' ( (lv_name_4_0= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) otherlv_18= '}' )
                    {
                    // InternalThingML.g:2523:3: (otherlv_3= 'state' ( (lv_name_4_0= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) otherlv_18= '}' )
                    // InternalThingML.g:2524:4: otherlv_3= 'state' ( (lv_name_4_0= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) otherlv_18= '}'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getStateKeyword_3_0());
                      			
                    }
                    // InternalThingML.g:2528:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalThingML.g:2529:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalThingML.g:2529:5: (lv_name_4_0= RULE_ID )
                    // InternalThingML.g:2530:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_4_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_4_0,
                      							"org.thingml.xtext.ThingML.ID");
                      					
                    }

                    }


                    }

                    // InternalThingML.g:2546:4: ( (lv_annotations_5_0= rulePlatformAnnotation ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_ANNOTATION_ID) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalThingML.g:2547:5: (lv_annotations_5_0= rulePlatformAnnotation )
                    	    {
                    	    // InternalThingML.g:2547:5: (lv_annotations_5_0= rulePlatformAnnotation )
                    	    // InternalThingML.g:2548:6: lv_annotations_5_0= rulePlatformAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_annotations_5_0=rulePlatformAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getStateRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"annotations",
                    	      							lv_annotations_5_0,
                    	      							"org.thingml.xtext.ThingML.PlatformAnnotation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_3());
                      			
                    }
                    // InternalThingML.g:2569:4: ( (lv_properties_7_0= ruleProperty ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==42) ) {
                            int LA61_2 = input.LA(2);

                            if ( (LA61_2==43) ) {
                                int LA61_3 = input.LA(3);

                                if ( (LA61_3==RULE_ID) ) {
                                    int LA61_4 = input.LA(4);

                                    if ( (LA61_4==19) ) {
                                        int LA61_5 = input.LA(5);

                                        if ( (LA61_5==RULE_ID) ) {
                                            alt61=1;
                                        }


                                    }


                                }


                            }


                        }
                        else if ( (LA61_0==43) ) {
                            int LA61_3 = input.LA(2);

                            if ( (LA61_3==RULE_ID) ) {
                                int LA61_4 = input.LA(3);

                                if ( (LA61_4==19) ) {
                                    int LA61_5 = input.LA(4);

                                    if ( (LA61_5==RULE_ID) ) {
                                        alt61=1;
                                    }


                                }


                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalThingML.g:2570:5: (lv_properties_7_0= ruleProperty )
                    	    {
                    	    // InternalThingML.g:2570:5: (lv_properties_7_0= ruleProperty )
                    	    // InternalThingML.g:2571:6: lv_properties_7_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_properties_7_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getStateRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"properties",
                    	      							lv_properties_7_0,
                    	      							"org.thingml.xtext.ThingML.Property");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    // InternalThingML.g:2588:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) ) )
                    // InternalThingML.g:2589:5: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) )
                    {
                    // InternalThingML.g:2589:5: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* ) )
                    // InternalThingML.g:2590:6: ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
                    // InternalThingML.g:2593:6: ( ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )* )
                    // InternalThingML.g:2594:7: ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )*
                    {
                    // InternalThingML.g:2594:7: ( ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) ) )*
                    loop64:
                    do {
                        int alt64=4;
                        int LA64_0 = input.LA(1);

                        if ( LA64_0 == 53 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0) ) ) {
                            int LA64_2 = input.LA(2);

                            if ( LA64_2 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1) ) {
                                alt64=2;
                            }
                            else if ( LA64_2 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0) ) {
                                alt64=1;
                            }


                        }
                        else if ( ( LA64_0 >= 42 && LA64_0 <= 43 || LA64_0 == 51 || LA64_0 == 56 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2) ) {
                            alt64=3;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalThingML.g:2595:5: ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) )
                    	    {
                    	    // InternalThingML.g:2595:5: ({...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) ) )
                    	    // InternalThingML.g:2596:6: {...}? => ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0)");
                    	    }
                    	    // InternalThingML.g:2596:105: ( ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) ) )
                    	    // InternalThingML.g:2597:7: ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0);
                    	    // InternalThingML.g:2600:10: ({...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) ) )
                    	    // InternalThingML.g:2600:11: {...}? => (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleState", "true");
                    	    }
                    	    // InternalThingML.g:2600:20: (otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) ) )
                    	    // InternalThingML.g:2600:21: otherlv_9= 'on' otherlv_10= 'entry' ( (lv_entry_11_0= ruleAction ) )
                    	    {
                    	    otherlv_9=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_9, grammarAccess.getStateAccess().getOnKeyword_3_5_0_0());
                    	      									
                    	    }
                    	    otherlv_10=(Token)match(input,54,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_10, grammarAccess.getStateAccess().getEntryKeyword_3_5_0_1());
                    	      									
                    	    }
                    	    // InternalThingML.g:2608:10: ( (lv_entry_11_0= ruleAction ) )
                    	    // InternalThingML.g:2609:11: (lv_entry_11_0= ruleAction )
                    	    {
                    	    // InternalThingML.g:2609:11: (lv_entry_11_0= ruleAction )
                    	    // InternalThingML.g:2610:12: lv_entry_11_0= ruleAction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      												newCompositeNode(grammarAccess.getStateAccess().getEntryActionParserRuleCall_3_5_0_2_0());
                    	      											
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_entry_11_0=ruleAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElementForParent(grammarAccess.getStateRule());
                    	      												}
                    	      												set(
                    	      													current,
                    	      													"entry",
                    	      													lv_entry_11_0,
                    	      													"org.thingml.xtext.ThingML.Action");
                    	      												afterParserOrEnumRuleCall();
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalThingML.g:2633:5: ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) )
                    	    {
                    	    // InternalThingML.g:2633:5: ({...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) ) )
                    	    // InternalThingML.g:2634:6: {...}? => ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1)");
                    	    }
                    	    // InternalThingML.g:2634:105: ( ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) ) )
                    	    // InternalThingML.g:2635:7: ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1);
                    	    // InternalThingML.g:2638:10: ({...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) ) )
                    	    // InternalThingML.g:2638:11: {...}? => (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleState", "true");
                    	    }
                    	    // InternalThingML.g:2638:20: (otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) ) )
                    	    // InternalThingML.g:2638:21: otherlv_12= 'on' otherlv_13= 'exit' ( (lv_exit_14_0= ruleAction ) )
                    	    {
                    	    otherlv_12=(Token)match(input,53,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_12, grammarAccess.getStateAccess().getOnKeyword_3_5_1_0());
                    	      									
                    	    }
                    	    otherlv_13=(Token)match(input,55,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_13, grammarAccess.getStateAccess().getExitKeyword_3_5_1_1());
                    	      									
                    	    }
                    	    // InternalThingML.g:2646:10: ( (lv_exit_14_0= ruleAction ) )
                    	    // InternalThingML.g:2647:11: (lv_exit_14_0= ruleAction )
                    	    {
                    	    // InternalThingML.g:2647:11: (lv_exit_14_0= ruleAction )
                    	    // InternalThingML.g:2648:12: lv_exit_14_0= ruleAction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      												newCompositeNode(grammarAccess.getStateAccess().getExitActionParserRuleCall_3_5_1_2_0());
                    	      											
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_exit_14_0=ruleAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElementForParent(grammarAccess.getStateRule());
                    	      												}
                    	      												set(
                    	      													current,
                    	      													"exit",
                    	      													lv_exit_14_0,
                    	      													"org.thingml.xtext.ThingML.Action");
                    	      												afterParserOrEnumRuleCall();
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalThingML.g:2671:5: ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) )
                    	    {
                    	    // InternalThingML.g:2671:5: ({...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ ) )
                    	    // InternalThingML.g:2672:6: {...}? => ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2)");
                    	    }
                    	    // InternalThingML.g:2672:105: ( ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+ )
                    	    // InternalThingML.g:2673:7: ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2);
                    	    // InternalThingML.g:2676:10: ({...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) ) )+
                    	    int cnt63=0;
                    	    loop63:
                    	    do {
                    	        int alt63=2;
                    	        switch ( input.LA(1) ) {
                    	        case 42:
                    	            {
                    	            int LA63_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt63=1;
                    	            }


                    	            }
                    	            break;
                    	        case 43:
                    	            {
                    	            int LA63_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt63=1;
                    	            }


                    	            }
                    	            break;
                    	        case 51:
                    	            {
                    	            int LA63_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt63=1;
                    	            }


                    	            }
                    	            break;
                    	        case 56:
                    	            {
                    	            int LA63_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt63=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt63) {
                    	    	case 1 :
                    	    	    // InternalThingML.g:2676:11: {...}? => ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleState", "true");
                    	    	    }
                    	    	    // InternalThingML.g:2676:20: ( ( (lv_properties_15_0= ruleProperty ) ) | ( (lv_internal_16_0= ruleInternalTransition ) ) | ( (lv_outgoing_17_0= ruleTransition ) ) )
                    	    	    int alt62=3;
                    	    	    switch ( input.LA(1) ) {
                    	    	    case 42:
                    	    	    case 43:
                    	    	        {
                    	    	        alt62=1;
                    	    	        }
                    	    	        break;
                    	    	    case 51:
                    	    	        {
                    	    	        alt62=2;
                    	    	        }
                    	    	        break;
                    	    	    case 56:
                    	    	        {
                    	    	        alt62=3;
                    	    	        }
                    	    	        break;
                    	    	    default:
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        NoViableAltException nvae =
                    	    	            new NoViableAltException("", 62, 0, input);

                    	    	        throw nvae;
                    	    	    }

                    	    	    switch (alt62) {
                    	    	        case 1 :
                    	    	            // InternalThingML.g:2676:21: ( (lv_properties_15_0= ruleProperty ) )
                    	    	            {
                    	    	            // InternalThingML.g:2676:21: ( (lv_properties_15_0= ruleProperty ) )
                    	    	            // InternalThingML.g:2677:11: (lv_properties_15_0= ruleProperty )
                    	    	            {
                    	    	            // InternalThingML.g:2677:11: (lv_properties_15_0= ruleProperty )
                    	    	            // InternalThingML.g:2678:12: lv_properties_15_0= ruleProperty
                    	    	            {
                    	    	            if ( state.backtracking==0 ) {

                    	    	              												newCompositeNode(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_5_2_0_0());
                    	    	              											
                    	    	            }
                    	    	            pushFollow(FOLLOW_42);
                    	    	            lv_properties_15_0=ruleProperty();

                    	    	            state._fsp--;
                    	    	            if (state.failed) return current;
                    	    	            if ( state.backtracking==0 ) {

                    	    	              												if (current==null) {
                    	    	              													current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	              												}
                    	    	              												add(
                    	    	              													current,
                    	    	              													"properties",
                    	    	              													lv_properties_15_0,
                    	    	              													"org.thingml.xtext.ThingML.Property");
                    	    	              												afterParserOrEnumRuleCall();
                    	    	              											
                    	    	            }

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;
                    	    	        case 2 :
                    	    	            // InternalThingML.g:2696:10: ( (lv_internal_16_0= ruleInternalTransition ) )
                    	    	            {
                    	    	            // InternalThingML.g:2696:10: ( (lv_internal_16_0= ruleInternalTransition ) )
                    	    	            // InternalThingML.g:2697:11: (lv_internal_16_0= ruleInternalTransition )
                    	    	            {
                    	    	            // InternalThingML.g:2697:11: (lv_internal_16_0= ruleInternalTransition )
                    	    	            // InternalThingML.g:2698:12: lv_internal_16_0= ruleInternalTransition
                    	    	            {
                    	    	            if ( state.backtracking==0 ) {

                    	    	              												newCompositeNode(grammarAccess.getStateAccess().getInternalInternalTransitionParserRuleCall_3_5_2_1_0());
                    	    	              											
                    	    	            }
                    	    	            pushFollow(FOLLOW_42);
                    	    	            lv_internal_16_0=ruleInternalTransition();

                    	    	            state._fsp--;
                    	    	            if (state.failed) return current;
                    	    	            if ( state.backtracking==0 ) {

                    	    	              												if (current==null) {
                    	    	              													current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	              												}
                    	    	              												add(
                    	    	              													current,
                    	    	              													"internal",
                    	    	              													lv_internal_16_0,
                    	    	              													"org.thingml.xtext.ThingML.InternalTransition");
                    	    	              												afterParserOrEnumRuleCall();
                    	    	              											
                    	    	            }

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;
                    	    	        case 3 :
                    	    	            // InternalThingML.g:2716:10: ( (lv_outgoing_17_0= ruleTransition ) )
                    	    	            {
                    	    	            // InternalThingML.g:2716:10: ( (lv_outgoing_17_0= ruleTransition ) )
                    	    	            // InternalThingML.g:2717:11: (lv_outgoing_17_0= ruleTransition )
                    	    	            {
                    	    	            // InternalThingML.g:2717:11: (lv_outgoing_17_0= ruleTransition )
                    	    	            // InternalThingML.g:2718:12: lv_outgoing_17_0= ruleTransition
                    	    	            {
                    	    	            if ( state.backtracking==0 ) {

                    	    	              												newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionParserRuleCall_3_5_2_2_0());
                    	    	              											
                    	    	            }
                    	    	            pushFollow(FOLLOW_42);
                    	    	            lv_outgoing_17_0=ruleTransition();

                    	    	            state._fsp--;
                    	    	            if (state.failed) return current;
                    	    	            if ( state.backtracking==0 ) {

                    	    	              												if (current==null) {
                    	    	              													current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	              												}
                    	    	              												add(
                    	    	              													current,
                    	    	              													"outgoing",
                    	    	              													lv_outgoing_17_0,
                    	    	              													"org.thingml.xtext.ThingML.Transition");
                    	    	              												afterParserOrEnumRuleCall();
                    	    	              											
                    	    	            }

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt63 >= 1 ) break loop63;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(63, input);
                    	                throw eee;
                    	        }
                    	        cnt63++;
                    	    } while (true);

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup_3_5());

                    }

                    otherlv_18=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleHandler"
    // InternalThingML.g:2757:1: entryRuleHandler returns [EObject current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final EObject entryRuleHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandler = null;


        try {
            // InternalThingML.g:2757:48: (iv_ruleHandler= ruleHandler EOF )
            // InternalThingML.g:2758:2: iv_ruleHandler= ruleHandler EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHandlerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHandler=ruleHandler();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHandler; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHandler"


    // $ANTLR start "ruleHandler"
    // InternalThingML.g:2764:1: ruleHandler returns [EObject current=null] : (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition ) ;
    public final EObject ruleHandler() throws RecognitionException {
        EObject current = null;

        EObject this_Transition_0 = null;

        EObject this_InternalTransition_1 = null;



        	enterRule();

        try {
            // InternalThingML.g:2770:2: ( (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition ) )
            // InternalThingML.g:2771:2: (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition )
            {
            // InternalThingML.g:2771:2: (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            else if ( (LA66_0==51) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalThingML.g:2772:3: this_Transition_0= ruleTransition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHandlerAccess().getTransitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Transition_0=ruleTransition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Transition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:2781:3: this_InternalTransition_1= ruleInternalTransition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHandlerAccess().getInternalTransitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InternalTransition_1=ruleInternalTransition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InternalTransition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHandler"


    // $ANTLR start "entryRuleTransition"
    // InternalThingML.g:2793:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalThingML.g:2793:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalThingML.g:2794:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalThingML.g:2800:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* (otherlv_5= 'event' ( (lv_event_6_0= ruleEvent ) ) )? (otherlv_7= 'guard' ( (lv_guard_8_0= ruleExpression ) ) )? (otherlv_9= 'action' ( (lv_action_10_0= ruleAction ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotations_4_0 = null;

        EObject lv_event_6_0 = null;

        EObject lv_guard_8_0 = null;

        EObject lv_action_10_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:2806:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* (otherlv_5= 'event' ( (lv_event_6_0= ruleEvent ) ) )? (otherlv_7= 'guard' ( (lv_guard_8_0= ruleExpression ) ) )? (otherlv_9= 'action' ( (lv_action_10_0= ruleAction ) ) )? ) )
            // InternalThingML.g:2807:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* (otherlv_5= 'event' ( (lv_event_6_0= ruleEvent ) ) )? (otherlv_7= 'guard' ( (lv_guard_8_0= ruleExpression ) ) )? (otherlv_9= 'action' ( (lv_action_10_0= ruleAction ) ) )? )
            {
            // InternalThingML.g:2807:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* (otherlv_5= 'event' ( (lv_event_6_0= ruleEvent ) ) )? (otherlv_7= 'guard' ( (lv_guard_8_0= ruleExpression ) ) )? (otherlv_9= 'action' ( (lv_action_10_0= ruleAction ) ) )? )
            // InternalThingML.g:2808:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* (otherlv_5= 'event' ( (lv_event_6_0= ruleEvent ) ) )? (otherlv_7= 'guard' ( (lv_guard_8_0= ruleExpression ) ) )? (otherlv_9= 'action' ( (lv_action_10_0= ruleAction ) ) )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
              		
            }
            // InternalThingML.g:2812:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalThingML.g:2813:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalThingML.g:2813:4: (lv_name_1_0= RULE_ID )
                    // InternalThingML.g:2814:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTransitionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.thingml.xtext.ThingML.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
              		
            }
            // InternalThingML.g:2834:3: ( (otherlv_3= RULE_ID ) )
            // InternalThingML.g:2835:4: (otherlv_3= RULE_ID )
            {
            // InternalThingML.g:2835:4: (otherlv_3= RULE_ID )
            // InternalThingML.g:2836:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0());
              				
            }

            }


            }

            // InternalThingML.g:2847:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ANNOTATION_ID) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalThingML.g:2848:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:2848:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalThingML.g:2849:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_annotations_4_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTransitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_4_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // InternalThingML.g:2866:3: (otherlv_5= 'event' ( (lv_event_6_0= ruleEvent ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==58) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalThingML.g:2867:4: otherlv_5= 'event' ( (lv_event_6_0= ruleEvent ) )
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEventKeyword_5_0());
                      			
                    }
                    // InternalThingML.g:2871:4: ( (lv_event_6_0= ruleEvent ) )
                    // InternalThingML.g:2872:5: (lv_event_6_0= ruleEvent )
                    {
                    // InternalThingML.g:2872:5: (lv_event_6_0= ruleEvent )
                    // InternalThingML.g:2873:6: lv_event_6_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_event_6_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRule());
                      						}
                      						set(
                      							current,
                      							"event",
                      							lv_event_6_0,
                      							"org.thingml.xtext.ThingML.Event");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:2891:3: (otherlv_7= 'guard' ( (lv_guard_8_0= ruleExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalThingML.g:2892:4: otherlv_7= 'guard' ( (lv_guard_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,59,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getGuardKeyword_6_0());
                      			
                    }
                    // InternalThingML.g:2896:4: ( (lv_guard_8_0= ruleExpression ) )
                    // InternalThingML.g:2897:5: (lv_guard_8_0= ruleExpression )
                    {
                    // InternalThingML.g:2897:5: (lv_guard_8_0= ruleExpression )
                    // InternalThingML.g:2898:6: lv_guard_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_guard_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRule());
                      						}
                      						set(
                      							current,
                      							"guard",
                      							lv_guard_8_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:2916:3: (otherlv_9= 'action' ( (lv_action_10_0= ruleAction ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==60) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalThingML.g:2917:4: otherlv_9= 'action' ( (lv_action_10_0= ruleAction ) )
                    {
                    otherlv_9=(Token)match(input,60,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getActionKeyword_7_0());
                      			
                    }
                    // InternalThingML.g:2921:4: ( (lv_action_10_0= ruleAction ) )
                    // InternalThingML.g:2922:5: (lv_action_10_0= ruleAction )
                    {
                    // InternalThingML.g:2922:5: (lv_action_10_0= ruleAction )
                    // InternalThingML.g:2923:6: lv_action_10_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_action_10_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRule());
                      						}
                      						set(
                      							current,
                      							"action",
                      							lv_action_10_0,
                      							"org.thingml.xtext.ThingML.Action");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInternalTransition"
    // InternalThingML.g:2945:1: entryRuleInternalTransition returns [EObject current=null] : iv_ruleInternalTransition= ruleInternalTransition EOF ;
    public final EObject entryRuleInternalTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalTransition = null;


        try {
            // InternalThingML.g:2945:59: (iv_ruleInternalTransition= ruleInternalTransition EOF )
            // InternalThingML.g:2946:2: iv_ruleInternalTransition= ruleInternalTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInternalTransition=ruleInternalTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInternalTransition"


    // $ANTLR start "ruleInternalTransition"
    // InternalThingML.g:2952:1: ruleInternalTransition returns [EObject current=null] : ( () otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* (otherlv_4= 'event' ( (lv_event_5_0= ruleEvent ) ) )? (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? (otherlv_8= 'action' ( (lv_action_9_0= ruleAction ) ) )? ) ;
    public final EObject ruleInternalTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_3_0 = null;

        EObject lv_event_5_0 = null;

        EObject lv_guard_7_0 = null;

        EObject lv_action_9_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:2958:2: ( ( () otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* (otherlv_4= 'event' ( (lv_event_5_0= ruleEvent ) ) )? (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? (otherlv_8= 'action' ( (lv_action_9_0= ruleAction ) ) )? ) )
            // InternalThingML.g:2959:2: ( () otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* (otherlv_4= 'event' ( (lv_event_5_0= ruleEvent ) ) )? (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? (otherlv_8= 'action' ( (lv_action_9_0= ruleAction ) ) )? )
            {
            // InternalThingML.g:2959:2: ( () otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* (otherlv_4= 'event' ( (lv_event_5_0= ruleEvent ) ) )? (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? (otherlv_8= 'action' ( (lv_action_9_0= ruleAction ) ) )? )
            // InternalThingML.g:2960:3: () otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) )? ( (lv_annotations_3_0= rulePlatformAnnotation ) )* (otherlv_4= 'event' ( (lv_event_5_0= ruleEvent ) ) )? (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? (otherlv_8= 'action' ( (lv_action_9_0= ruleAction ) ) )?
            {
            // InternalThingML.g:2960:3: ()
            // InternalThingML.g:2961:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInternalTransitionAccess().getInternalTransitionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInternalTransitionAccess().getInternalKeyword_1());
              		
            }
            // InternalThingML.g:2971:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalThingML.g:2972:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalThingML.g:2972:4: (lv_name_2_0= RULE_ID )
                    // InternalThingML.g:2973:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getInternalTransitionAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInternalTransitionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"org.thingml.xtext.ThingML.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalThingML.g:2989:3: ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ANNOTATION_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalThingML.g:2990:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:2990:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    // InternalThingML.g:2991:5: lv_annotations_3_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInternalTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_annotations_3_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_3_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalThingML.g:3008:3: (otherlv_4= 'event' ( (lv_event_5_0= ruleEvent ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==58) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalThingML.g:3009:4: otherlv_4= 'event' ( (lv_event_5_0= ruleEvent ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInternalTransitionAccess().getEventKeyword_4_0());
                      			
                    }
                    // InternalThingML.g:3013:4: ( (lv_event_5_0= ruleEvent ) )
                    // InternalThingML.g:3014:5: (lv_event_5_0= ruleEvent )
                    {
                    // InternalThingML.g:3014:5: (lv_event_5_0= ruleEvent )
                    // InternalThingML.g:3015:6: lv_event_5_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_event_5_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
                      						}
                      						set(
                      							current,
                      							"event",
                      							lv_event_5_0,
                      							"org.thingml.xtext.ThingML.Event");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:3033:3: (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==59) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalThingML.g:3034:4: otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getInternalTransitionAccess().getGuardKeyword_5_0());
                      			
                    }
                    // InternalThingML.g:3038:4: ( (lv_guard_7_0= ruleExpression ) )
                    // InternalThingML.g:3039:5: (lv_guard_7_0= ruleExpression )
                    {
                    // InternalThingML.g:3039:5: (lv_guard_7_0= ruleExpression )
                    // InternalThingML.g:3040:6: lv_guard_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInternalTransitionAccess().getGuardExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_guard_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
                      						}
                      						set(
                      							current,
                      							"guard",
                      							lv_guard_7_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:3058:3: (otherlv_8= 'action' ( (lv_action_9_0= ruleAction ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==60) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalThingML.g:3059:4: otherlv_8= 'action' ( (lv_action_9_0= ruleAction ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getInternalTransitionAccess().getActionKeyword_6_0());
                      			
                    }
                    // InternalThingML.g:3063:4: ( (lv_action_9_0= ruleAction ) )
                    // InternalThingML.g:3064:5: (lv_action_9_0= ruleAction )
                    {
                    // InternalThingML.g:3064:5: (lv_action_9_0= ruleAction )
                    // InternalThingML.g:3065:6: lv_action_9_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_action_9_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
                      						}
                      						set(
                      							current,
                      							"action",
                      							lv_action_9_0,
                      							"org.thingml.xtext.ThingML.Action");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInternalTransition"


    // $ANTLR start "entryRuleCompositeState"
    // InternalThingML.g:3087:1: entryRuleCompositeState returns [EObject current=null] : iv_ruleCompositeState= ruleCompositeState EOF ;
    public final EObject entryRuleCompositeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeState = null;


        try {
            // InternalThingML.g:3087:55: (iv_ruleCompositeState= ruleCompositeState EOF )
            // InternalThingML.g:3088:2: iv_ruleCompositeState= ruleCompositeState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompositeState=ruleCompositeState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeState"


    // $ANTLR start "ruleCompositeState"
    // InternalThingML.g:3094:1: ruleCompositeState returns [EObject current=null] : (otherlv_0= 'composite' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'init' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_21_0= ruleRegion ) ) | ( (lv_session_22_0= ruleSession ) ) )* otherlv_23= '}' ) ;
    public final EObject ruleCompositeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_history_6_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_23=null;
        EObject lv_annotations_7_0 = null;

        EObject lv_properties_9_0 = null;

        EObject lv_entry_13_0 = null;

        EObject lv_exit_16_0 = null;

        EObject lv_properties_17_0 = null;

        EObject lv_substate_18_0 = null;

        EObject lv_internal_19_0 = null;

        EObject lv_outgoing_20_0 = null;

        EObject lv_region_21_0 = null;

        EObject lv_session_22_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:3100:2: ( (otherlv_0= 'composite' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'init' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_21_0= ruleRegion ) ) | ( (lv_session_22_0= ruleSession ) ) )* otherlv_23= '}' ) )
            // InternalThingML.g:3101:2: (otherlv_0= 'composite' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'init' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_21_0= ruleRegion ) ) | ( (lv_session_22_0= ruleSession ) ) )* otherlv_23= '}' )
            {
            // InternalThingML.g:3101:2: (otherlv_0= 'composite' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'init' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_21_0= ruleRegion ) ) | ( (lv_session_22_0= ruleSession ) ) )* otherlv_23= '}' )
            // InternalThingML.g:3102:3: otherlv_0= 'composite' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'init' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_21_0= ruleRegion ) ) | ( (lv_session_22_0= ruleSession ) ) )* otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompositeStateAccess().getCompositeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,52,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompositeStateAccess().getStateKeyword_1());
              		
            }
            // InternalThingML.g:3110:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:3111:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:3111:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:3112:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCompositeStateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCompositeStateAccess().getInitKeyword_3());
              		
            }
            // InternalThingML.g:3132:3: ( (otherlv_4= RULE_ID ) )
            // InternalThingML.g:3133:4: (otherlv_4= RULE_ID )
            {
            // InternalThingML.g:3133:4: (otherlv_4= RULE_ID )
            // InternalThingML.g:3134:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCompositeStateRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getCompositeStateAccess().getInitialStateCrossReference_4_0());
              				
            }

            }


            }

            // InternalThingML.g:3145:3: (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==63) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalThingML.g:3146:4: otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getCompositeStateAccess().getKeepsKeyword_5_0());
                      			
                    }
                    // InternalThingML.g:3150:4: ( (lv_history_6_0= 'history' ) )
                    // InternalThingML.g:3151:5: (lv_history_6_0= 'history' )
                    {
                    // InternalThingML.g:3151:5: (lv_history_6_0= 'history' )
                    // InternalThingML.g:3152:6: lv_history_6_0= 'history'
                    {
                    lv_history_6_0=(Token)match(input,64,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_history_6_0, grammarAccess.getCompositeStateAccess().getHistoryHistoryKeyword_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCompositeStateRule());
                      						}
                      						setWithLastConsumed(current, "history", true, "history");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:3165:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ANNOTATION_ID) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalThingML.g:3166:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:3166:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:3167:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCompositeStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_8=(Token)match(input,29,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalThingML.g:3188:3: ( (lv_properties_9_0= ruleProperty ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==42) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==43) ) {
                        int LA79_3 = input.LA(3);

                        if ( (LA79_3==RULE_ID) ) {
                            int LA79_4 = input.LA(4);

                            if ( (LA79_4==19) ) {
                                int LA79_5 = input.LA(5);

                                if ( (LA79_5==RULE_ID) ) {
                                    alt79=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA79_0==43) ) {
                    int LA79_3 = input.LA(2);

                    if ( (LA79_3==RULE_ID) ) {
                        int LA79_4 = input.LA(3);

                        if ( (LA79_4==19) ) {
                            int LA79_5 = input.LA(4);

                            if ( (LA79_5==RULE_ID) ) {
                                alt79=1;
                            }


                        }


                    }


                }


                switch (alt79) {
            	case 1 :
            	    // InternalThingML.g:3189:4: (lv_properties_9_0= ruleProperty )
            	    {
            	    // InternalThingML.g:3189:4: (lv_properties_9_0= ruleProperty )
            	    // InternalThingML.g:3190:5: lv_properties_9_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_properties_9_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"properties",
            	      						lv_properties_9_0,
            	      						"org.thingml.xtext.ThingML.Property");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalThingML.g:3207:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) ) )
            // InternalThingML.g:3208:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) )
            {
            // InternalThingML.g:3208:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* ) )
            // InternalThingML.g:3209:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
            // InternalThingML.g:3212:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )* )
            // InternalThingML.g:3213:6: ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )*
            {
            // InternalThingML.g:3213:6: ( ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) ) )*
            loop82:
            do {
                int alt82=4;
                int LA82_0 = input.LA(1);

                if ( LA82_0 == 53 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0) ) ) {
                    int LA82_2 = input.LA(2);

                    if ( LA82_2 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1) ) {
                        alt82=2;
                    }
                    else if ( LA82_2 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0) ) {
                        alt82=1;
                    }


                }
                else if ( ( LA82_0 >= 42 && LA82_0 <= 43 || LA82_0 >= 51 && LA82_0 <= 52 || LA82_0 == 56 || LA82_0 == 61 || LA82_0 == 65 || LA82_0 == 68 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2) ) {
                    alt82=3;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalThingML.g:3214:4: ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) )
            	    {
            	    // InternalThingML.g:3214:4: ({...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) ) )
            	    // InternalThingML.g:3215:5: {...}? => ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCompositeState", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0)");
            	    }
            	    // InternalThingML.g:3215:111: ( ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) ) )
            	    // InternalThingML.g:3216:6: ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0);
            	    // InternalThingML.g:3219:9: ({...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) ) )
            	    // InternalThingML.g:3219:10: {...}? => (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCompositeState", "true");
            	    }
            	    // InternalThingML.g:3219:19: (otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) ) )
            	    // InternalThingML.g:3219:20: otherlv_11= 'on' otherlv_12= 'entry' ( (lv_entry_13_0= ruleAction ) )
            	    {
            	    otherlv_11=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getCompositeStateAccess().getOnKeyword_9_0_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,54,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getCompositeStateAccess().getEntryKeyword_9_0_1());
            	      								
            	    }
            	    // InternalThingML.g:3227:9: ( (lv_entry_13_0= ruleAction ) )
            	    // InternalThingML.g:3228:10: (lv_entry_13_0= ruleAction )
            	    {
            	    // InternalThingML.g:3228:10: (lv_entry_13_0= ruleAction )
            	    // InternalThingML.g:3229:11: lv_entry_13_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getCompositeStateAccess().getEntryActionParserRuleCall_9_0_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_entry_13_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	      											}
            	      											set(
            	      												current,
            	      												"entry",
            	      												lv_entry_13_0,
            	      												"org.thingml.xtext.ThingML.Action");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:3252:4: ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) )
            	    {
            	    // InternalThingML.g:3252:4: ({...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) ) )
            	    // InternalThingML.g:3253:5: {...}? => ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCompositeState", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1)");
            	    }
            	    // InternalThingML.g:3253:111: ( ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) ) )
            	    // InternalThingML.g:3254:6: ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1);
            	    // InternalThingML.g:3257:9: ({...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) ) )
            	    // InternalThingML.g:3257:10: {...}? => (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCompositeState", "true");
            	    }
            	    // InternalThingML.g:3257:19: (otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) ) )
            	    // InternalThingML.g:3257:20: otherlv_14= 'on' otherlv_15= 'exit' ( (lv_exit_16_0= ruleAction ) )
            	    {
            	    otherlv_14=(Token)match(input,53,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_14, grammarAccess.getCompositeStateAccess().getOnKeyword_9_1_0());
            	      								
            	    }
            	    otherlv_15=(Token)match(input,55,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getCompositeStateAccess().getExitKeyword_9_1_1());
            	      								
            	    }
            	    // InternalThingML.g:3265:9: ( (lv_exit_16_0= ruleAction ) )
            	    // InternalThingML.g:3266:10: (lv_exit_16_0= ruleAction )
            	    {
            	    // InternalThingML.g:3266:10: (lv_exit_16_0= ruleAction )
            	    // InternalThingML.g:3267:11: lv_exit_16_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getCompositeStateAccess().getExitActionParserRuleCall_9_1_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_exit_16_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	      											}
            	      											set(
            	      												current,
            	      												"exit",
            	      												lv_exit_16_0,
            	      												"org.thingml.xtext.ThingML.Action");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalThingML.g:3290:4: ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) )
            	    {
            	    // InternalThingML.g:3290:4: ({...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ ) )
            	    // InternalThingML.g:3291:5: {...}? => ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCompositeState", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2)");
            	    }
            	    // InternalThingML.g:3291:111: ( ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+ )
            	    // InternalThingML.g:3292:6: ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2);
            	    // InternalThingML.g:3295:9: ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+
            	    int cnt81=0;
            	    loop81:
            	    do {
            	        int alt81=2;
            	        alt81 = dfa81.predict(input);
            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalThingML.g:3295:10: {...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleCompositeState", "true");
            	    	    }
            	    	    // InternalThingML.g:3295:19: ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) )
            	    	    int alt80=4;
            	    	    switch ( input.LA(1) ) {
            	    	    case 42:
            	    	    case 43:
            	    	        {
            	    	        alt80=1;
            	    	        }
            	    	        break;
            	    	    case 52:
            	    	    case 61:
            	    	    case 65:
            	    	    case 68:
            	    	        {
            	    	        alt80=2;
            	    	        }
            	    	        break;
            	    	    case 51:
            	    	        {
            	    	        alt80=3;
            	    	        }
            	    	        break;
            	    	    case 56:
            	    	        {
            	    	        alt80=4;
            	    	        }
            	    	        break;
            	    	    default:
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 80, 0, input);

            	    	        throw nvae;
            	    	    }

            	    	    switch (alt80) {
            	    	        case 1 :
            	    	            // InternalThingML.g:3295:20: ( (lv_properties_17_0= ruleProperty ) )
            	    	            {
            	    	            // InternalThingML.g:3295:20: ( (lv_properties_17_0= ruleProperty ) )
            	    	            // InternalThingML.g:3296:10: (lv_properties_17_0= ruleProperty )
            	    	            {
            	    	            // InternalThingML.g:3296:10: (lv_properties_17_0= ruleProperty )
            	    	            // InternalThingML.g:3297:11: lv_properties_17_0= ruleProperty
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              											newCompositeNode(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_9_2_0_0());
            	    	              										
            	    	            }
            	    	            pushFollow(FOLLOW_55);
            	    	            lv_properties_17_0=ruleProperty();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											if (current==null) {
            	    	              												current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	    	              											}
            	    	              											add(
            	    	              												current,
            	    	              												"properties",
            	    	              												lv_properties_17_0,
            	    	              												"org.thingml.xtext.ThingML.Property");
            	    	              											afterParserOrEnumRuleCall();
            	    	              										
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalThingML.g:3315:9: ( (lv_substate_18_0= ruleState ) )
            	    	            {
            	    	            // InternalThingML.g:3315:9: ( (lv_substate_18_0= ruleState ) )
            	    	            // InternalThingML.g:3316:10: (lv_substate_18_0= ruleState )
            	    	            {
            	    	            // InternalThingML.g:3316:10: (lv_substate_18_0= ruleState )
            	    	            // InternalThingML.g:3317:11: lv_substate_18_0= ruleState
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              											newCompositeNode(grammarAccess.getCompositeStateAccess().getSubstateStateParserRuleCall_9_2_1_0());
            	    	              										
            	    	            }
            	    	            pushFollow(FOLLOW_55);
            	    	            lv_substate_18_0=ruleState();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											if (current==null) {
            	    	              												current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	    	              											}
            	    	              											add(
            	    	              												current,
            	    	              												"substate",
            	    	              												lv_substate_18_0,
            	    	              												"org.thingml.xtext.ThingML.State");
            	    	              											afterParserOrEnumRuleCall();
            	    	              										
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 3 :
            	    	            // InternalThingML.g:3335:9: ( (lv_internal_19_0= ruleInternalTransition ) )
            	    	            {
            	    	            // InternalThingML.g:3335:9: ( (lv_internal_19_0= ruleInternalTransition ) )
            	    	            // InternalThingML.g:3336:10: (lv_internal_19_0= ruleInternalTransition )
            	    	            {
            	    	            // InternalThingML.g:3336:10: (lv_internal_19_0= ruleInternalTransition )
            	    	            // InternalThingML.g:3337:11: lv_internal_19_0= ruleInternalTransition
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              											newCompositeNode(grammarAccess.getCompositeStateAccess().getInternalInternalTransitionParserRuleCall_9_2_2_0());
            	    	              										
            	    	            }
            	    	            pushFollow(FOLLOW_55);
            	    	            lv_internal_19_0=ruleInternalTransition();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											if (current==null) {
            	    	              												current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	    	              											}
            	    	              											add(
            	    	              												current,
            	    	              												"internal",
            	    	              												lv_internal_19_0,
            	    	              												"org.thingml.xtext.ThingML.InternalTransition");
            	    	              											afterParserOrEnumRuleCall();
            	    	              										
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 4 :
            	    	            // InternalThingML.g:3355:9: ( (lv_outgoing_20_0= ruleTransition ) )
            	    	            {
            	    	            // InternalThingML.g:3355:9: ( (lv_outgoing_20_0= ruleTransition ) )
            	    	            // InternalThingML.g:3356:10: (lv_outgoing_20_0= ruleTransition )
            	    	            {
            	    	            // InternalThingML.g:3356:10: (lv_outgoing_20_0= ruleTransition )
            	    	            // InternalThingML.g:3357:11: lv_outgoing_20_0= ruleTransition
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              											newCompositeNode(grammarAccess.getCompositeStateAccess().getOutgoingTransitionParserRuleCall_9_2_3_0());
            	    	              										
            	    	            }
            	    	            pushFollow(FOLLOW_55);
            	    	            lv_outgoing_20_0=ruleTransition();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											if (current==null) {
            	    	              												current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	    	              											}
            	    	              											add(
            	    	              												current,
            	    	              												"outgoing",
            	    	              												lv_outgoing_20_0,
            	    	              												"org.thingml.xtext.ThingML.Transition");
            	    	              											afterParserOrEnumRuleCall();
            	    	              										
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt81 >= 1 ) break loop81;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(81, input);
            	                throw eee;
            	        }
            	        cnt81++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());

            }

            // InternalThingML.g:3387:3: ( ( (lv_region_21_0= ruleRegion ) ) | ( (lv_session_22_0= ruleSession ) ) )*
            loop83:
            do {
                int alt83=3;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==67) ) {
                    alt83=1;
                }
                else if ( (LA83_0==66) ) {
                    alt83=2;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalThingML.g:3388:4: ( (lv_region_21_0= ruleRegion ) )
            	    {
            	    // InternalThingML.g:3388:4: ( (lv_region_21_0= ruleRegion ) )
            	    // InternalThingML.g:3389:5: (lv_region_21_0= ruleRegion )
            	    {
            	    // InternalThingML.g:3389:5: (lv_region_21_0= ruleRegion )
            	    // InternalThingML.g:3390:6: lv_region_21_0= ruleRegion
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCompositeStateAccess().getRegionRegionParserRuleCall_10_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_region_21_0=ruleRegion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"region",
            	      							lv_region_21_0,
            	      							"org.thingml.xtext.ThingML.Region");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:3408:4: ( (lv_session_22_0= ruleSession ) )
            	    {
            	    // InternalThingML.g:3408:4: ( (lv_session_22_0= ruleSession ) )
            	    // InternalThingML.g:3409:5: (lv_session_22_0= ruleSession )
            	    {
            	    // InternalThingML.g:3409:5: (lv_session_22_0= ruleSession )
            	    // InternalThingML.g:3410:6: lv_session_22_0= ruleSession
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCompositeStateAccess().getSessionSessionParserRuleCall_10_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_session_22_0=ruleSession();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"session",
            	      							lv_session_22_0,
            	      							"org.thingml.xtext.ThingML.Session");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_23=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompositeState"


    // $ANTLR start "entryRuleStateMachine"
    // InternalThingML.g:3436:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalThingML.g:3436:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalThingML.g:3437:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateMachine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalThingML.g:3443:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'statechart' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_19_0= ruleRegion ) ) | ( (lv_session_20_0= ruleSession ) ) )* otherlv_21= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_history_5_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_21=null;
        EObject lv_annotations_6_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_entry_12_0 = null;

        EObject lv_exit_15_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_substate_17_0 = null;

        EObject lv_internal_18_0 = null;

        EObject lv_region_19_0 = null;

        EObject lv_session_20_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:3449:2: ( (otherlv_0= 'statechart' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_19_0= ruleRegion ) ) | ( (lv_session_20_0= ruleSession ) ) )* otherlv_21= '}' ) )
            // InternalThingML.g:3450:2: (otherlv_0= 'statechart' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_19_0= ruleRegion ) ) | ( (lv_session_20_0= ruleSession ) ) )* otherlv_21= '}' )
            {
            // InternalThingML.g:3450:2: (otherlv_0= 'statechart' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_19_0= ruleRegion ) ) | ( (lv_session_20_0= ruleSession ) ) )* otherlv_21= '}' )
            // InternalThingML.g:3451:3: otherlv_0= 'statechart' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) ) ) ( ( (lv_region_19_0= ruleRegion ) ) | ( (lv_session_20_0= ruleSession ) ) )* otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStatechartKeyword_0());
              		
            }
            // InternalThingML.g:3455:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalThingML.g:3456:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalThingML.g:3456:4: (lv_name_1_0= RULE_ID )
                    // InternalThingML.g:3457:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStateMachineRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.thingml.xtext.ThingML.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getInitKeyword_2());
              		
            }
            // InternalThingML.g:3477:3: ( (otherlv_3= RULE_ID ) )
            // InternalThingML.g:3478:4: (otherlv_3= RULE_ID )
            {
            // InternalThingML.g:3478:4: (otherlv_3= RULE_ID )
            // InternalThingML.g:3479:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateMachineRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getInitialStateCrossReference_3_0());
              				
            }

            }


            }

            // InternalThingML.g:3490:3: (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==63) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalThingML.g:3491:4: otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) )
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getKeepsKeyword_4_0());
                      			
                    }
                    // InternalThingML.g:3495:4: ( (lv_history_5_0= 'history' ) )
                    // InternalThingML.g:3496:5: (lv_history_5_0= 'history' )
                    {
                    // InternalThingML.g:3496:5: (lv_history_5_0= 'history' )
                    // InternalThingML.g:3497:6: lv_history_5_0= 'history'
                    {
                    lv_history_5_0=(Token)match(input,64,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_history_5_0, grammarAccess.getStateMachineAccess().getHistoryHistoryKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStateMachineRule());
                      						}
                      						setWithLastConsumed(current, "history", true, "history");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:3510:3: ( (lv_annotations_6_0= rulePlatformAnnotation ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_ANNOTATION_ID) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalThingML.g:3511:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:3511:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    // InternalThingML.g:3512:5: lv_annotations_6_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateMachineAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_6_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_6_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalThingML.g:3533:3: ( (lv_properties_8_0= ruleProperty ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==42) ) {
                    int LA87_2 = input.LA(2);

                    if ( (LA87_2==43) ) {
                        int LA87_3 = input.LA(3);

                        if ( (LA87_3==RULE_ID) ) {
                            int LA87_4 = input.LA(4);

                            if ( (LA87_4==19) ) {
                                int LA87_5 = input.LA(5);

                                if ( (LA87_5==RULE_ID) ) {
                                    alt87=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA87_0==43) ) {
                    int LA87_3 = input.LA(2);

                    if ( (LA87_3==RULE_ID) ) {
                        int LA87_4 = input.LA(3);

                        if ( (LA87_4==19) ) {
                            int LA87_5 = input.LA(4);

                            if ( (LA87_5==RULE_ID) ) {
                                alt87=1;
                            }


                        }


                    }


                }


                switch (alt87) {
            	case 1 :
            	    // InternalThingML.g:3534:4: (lv_properties_8_0= ruleProperty )
            	    {
            	    // InternalThingML.g:3534:4: (lv_properties_8_0= ruleProperty )
            	    // InternalThingML.g:3535:5: lv_properties_8_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_properties_8_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"properties",
            	      						lv_properties_8_0,
            	      						"org.thingml.xtext.ThingML.Property");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // InternalThingML.g:3552:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) ) )
            // InternalThingML.g:3553:4: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) )
            {
            // InternalThingML.g:3553:4: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* ) )
            // InternalThingML.g:3554:5: ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
            // InternalThingML.g:3557:5: ( ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )* )
            // InternalThingML.g:3558:6: ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )*
            {
            // InternalThingML.g:3558:6: ( ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) ) )*
            loop90:
            do {
                int alt90=4;
                int LA90_0 = input.LA(1);

                if ( LA90_0 == 53 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0) ) ) {
                    int LA90_2 = input.LA(2);

                    if ( LA90_2 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1) ) {
                        alt90=2;
                    }
                    else if ( LA90_2 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0) ) {
                        alt90=1;
                    }


                }
                else if ( ( LA90_0 >= 42 && LA90_0 <= 43 || LA90_0 >= 51 && LA90_0 <= 52 || LA90_0 == 61 || LA90_0 == 65 || LA90_0 == 68 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2) ) {
                    alt90=3;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalThingML.g:3559:4: ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) )
            	    {
            	    // InternalThingML.g:3559:4: ({...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) ) )
            	    // InternalThingML.g:3560:5: {...}? => ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalThingML.g:3560:109: ( ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) ) )
            	    // InternalThingML.g:3561:6: ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0);
            	    // InternalThingML.g:3564:9: ({...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) ) )
            	    // InternalThingML.g:3564:10: {...}? => (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
            	    }
            	    // InternalThingML.g:3564:19: (otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) ) )
            	    // InternalThingML.g:3564:20: otherlv_10= 'on' otherlv_11= 'entry' ( (lv_entry_12_0= ruleAction ) )
            	    {
            	    otherlv_10=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getOnKeyword_8_0_0());
            	      								
            	    }
            	    otherlv_11=(Token)match(input,54,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getEntryKeyword_8_0_1());
            	      								
            	    }
            	    // InternalThingML.g:3572:9: ( (lv_entry_12_0= ruleAction ) )
            	    // InternalThingML.g:3573:10: (lv_entry_12_0= ruleAction )
            	    {
            	    // InternalThingML.g:3573:10: (lv_entry_12_0= ruleAction )
            	    // InternalThingML.g:3574:11: lv_entry_12_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getStateMachineAccess().getEntryActionParserRuleCall_8_0_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_entry_12_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      											}
            	      											set(
            	      												current,
            	      												"entry",
            	      												lv_entry_12_0,
            	      												"org.thingml.xtext.ThingML.Action");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:3597:4: ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) )
            	    {
            	    // InternalThingML.g:3597:4: ({...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) ) )
            	    // InternalThingML.g:3598:5: {...}? => ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalThingML.g:3598:109: ( ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) ) )
            	    // InternalThingML.g:3599:6: ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1);
            	    // InternalThingML.g:3602:9: ({...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) ) )
            	    // InternalThingML.g:3602:10: {...}? => (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
            	    }
            	    // InternalThingML.g:3602:19: (otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) ) )
            	    // InternalThingML.g:3602:20: otherlv_13= 'on' otherlv_14= 'exit' ( (lv_exit_15_0= ruleAction ) )
            	    {
            	    otherlv_13=(Token)match(input,53,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getOnKeyword_8_1_0());
            	      								
            	    }
            	    otherlv_14=(Token)match(input,55,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getExitKeyword_8_1_1());
            	      								
            	    }
            	    // InternalThingML.g:3610:9: ( (lv_exit_15_0= ruleAction ) )
            	    // InternalThingML.g:3611:10: (lv_exit_15_0= ruleAction )
            	    {
            	    // InternalThingML.g:3611:10: (lv_exit_15_0= ruleAction )
            	    // InternalThingML.g:3612:11: lv_exit_15_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getStateMachineAccess().getExitActionParserRuleCall_8_1_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_exit_15_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      											}
            	      											set(
            	      												current,
            	      												"exit",
            	      												lv_exit_15_0,
            	      												"org.thingml.xtext.ThingML.Action");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalThingML.g:3635:4: ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) )
            	    {
            	    // InternalThingML.g:3635:4: ({...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ ) )
            	    // InternalThingML.g:3636:5: {...}? => ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // InternalThingML.g:3636:109: ( ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+ )
            	    // InternalThingML.g:3637:6: ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2);
            	    // InternalThingML.g:3640:9: ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+
            	    int cnt89=0;
            	    loop89:
            	    do {
            	        int alt89=2;
            	        alt89 = dfa89.predict(input);
            	        switch (alt89) {
            	    	case 1 :
            	    	    // InternalThingML.g:3640:10: {...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
            	    	    }
            	    	    // InternalThingML.g:3640:19: ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) )
            	    	    int alt88=3;
            	    	    switch ( input.LA(1) ) {
            	    	    case 42:
            	    	    case 43:
            	    	        {
            	    	        alt88=1;
            	    	        }
            	    	        break;
            	    	    case 52:
            	    	    case 61:
            	    	    case 65:
            	    	    case 68:
            	    	        {
            	    	        alt88=2;
            	    	        }
            	    	        break;
            	    	    case 51:
            	    	        {
            	    	        alt88=3;
            	    	        }
            	    	        break;
            	    	    default:
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 88, 0, input);

            	    	        throw nvae;
            	    	    }

            	    	    switch (alt88) {
            	    	        case 1 :
            	    	            // InternalThingML.g:3640:20: ( (lv_properties_16_0= ruleProperty ) )
            	    	            {
            	    	            // InternalThingML.g:3640:20: ( (lv_properties_16_0= ruleProperty ) )
            	    	            // InternalThingML.g:3641:10: (lv_properties_16_0= ruleProperty )
            	    	            {
            	    	            // InternalThingML.g:3641:10: (lv_properties_16_0= ruleProperty )
            	    	            // InternalThingML.g:3642:11: lv_properties_16_0= ruleProperty
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              											newCompositeNode(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_8_2_0_0());
            	    	              										
            	    	            }
            	    	            pushFollow(FOLLOW_58);
            	    	            lv_properties_16_0=ruleProperty();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											if (current==null) {
            	    	              												current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	              											}
            	    	              											add(
            	    	              												current,
            	    	              												"properties",
            	    	              												lv_properties_16_0,
            	    	              												"org.thingml.xtext.ThingML.Property");
            	    	              											afterParserOrEnumRuleCall();
            	    	              										
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalThingML.g:3660:9: ( (lv_substate_17_0= ruleState ) )
            	    	            {
            	    	            // InternalThingML.g:3660:9: ( (lv_substate_17_0= ruleState ) )
            	    	            // InternalThingML.g:3661:10: (lv_substate_17_0= ruleState )
            	    	            {
            	    	            // InternalThingML.g:3661:10: (lv_substate_17_0= ruleState )
            	    	            // InternalThingML.g:3662:11: lv_substate_17_0= ruleState
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              											newCompositeNode(grammarAccess.getStateMachineAccess().getSubstateStateParserRuleCall_8_2_1_0());
            	    	              										
            	    	            }
            	    	            pushFollow(FOLLOW_58);
            	    	            lv_substate_17_0=ruleState();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											if (current==null) {
            	    	              												current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	              											}
            	    	              											add(
            	    	              												current,
            	    	              												"substate",
            	    	              												lv_substate_17_0,
            	    	              												"org.thingml.xtext.ThingML.State");
            	    	              											afterParserOrEnumRuleCall();
            	    	              										
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 3 :
            	    	            // InternalThingML.g:3680:9: ( (lv_internal_18_0= ruleInternalTransition ) )
            	    	            {
            	    	            // InternalThingML.g:3680:9: ( (lv_internal_18_0= ruleInternalTransition ) )
            	    	            // InternalThingML.g:3681:10: (lv_internal_18_0= ruleInternalTransition )
            	    	            {
            	    	            // InternalThingML.g:3681:10: (lv_internal_18_0= ruleInternalTransition )
            	    	            // InternalThingML.g:3682:11: lv_internal_18_0= ruleInternalTransition
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              											newCompositeNode(grammarAccess.getStateMachineAccess().getInternalInternalTransitionParserRuleCall_8_2_2_0());
            	    	              										
            	    	            }
            	    	            pushFollow(FOLLOW_58);
            	    	            lv_internal_18_0=ruleInternalTransition();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											if (current==null) {
            	    	              												current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	              											}
            	    	              											add(
            	    	              												current,
            	    	              												"internal",
            	    	              												lv_internal_18_0,
            	    	              												"org.thingml.xtext.ThingML.InternalTransition");
            	    	              											afterParserOrEnumRuleCall();
            	    	              										
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt89 >= 1 ) break loop89;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(89, input);
            	                throw eee;
            	        }
            	        cnt89++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());

            }

            // InternalThingML.g:3712:3: ( ( (lv_region_19_0= ruleRegion ) ) | ( (lv_session_20_0= ruleSession ) ) )*
            loop91:
            do {
                int alt91=3;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==67) ) {
                    alt91=1;
                }
                else if ( (LA91_0==66) ) {
                    alt91=2;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalThingML.g:3713:4: ( (lv_region_19_0= ruleRegion ) )
            	    {
            	    // InternalThingML.g:3713:4: ( (lv_region_19_0= ruleRegion ) )
            	    // InternalThingML.g:3714:5: (lv_region_19_0= ruleRegion )
            	    {
            	    // InternalThingML.g:3714:5: (lv_region_19_0= ruleRegion )
            	    // InternalThingML.g:3715:6: lv_region_19_0= ruleRegion
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStateMachineAccess().getRegionRegionParserRuleCall_9_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_region_19_0=ruleRegion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      						}
            	      						add(
            	      							current,
            	      							"region",
            	      							lv_region_19_0,
            	      							"org.thingml.xtext.ThingML.Region");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:3733:4: ( (lv_session_20_0= ruleSession ) )
            	    {
            	    // InternalThingML.g:3733:4: ( (lv_session_20_0= ruleSession ) )
            	    // InternalThingML.g:3734:5: (lv_session_20_0= ruleSession )
            	    {
            	    // InternalThingML.g:3734:5: (lv_session_20_0= ruleSession )
            	    // InternalThingML.g:3735:6: lv_session_20_0= ruleSession
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStateMachineAccess().getSessionSessionParserRuleCall_9_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_session_20_0=ruleSession();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      						}
            	      						add(
            	      							current,
            	      							"session",
            	      							lv_session_20_0,
            	      							"org.thingml.xtext.ThingML.Session");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_21=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleSession"
    // InternalThingML.g:3761:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalThingML.g:3761:48: (iv_ruleSession= ruleSession EOF )
            // InternalThingML.g:3762:2: iv_ruleSession= ruleSession EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSessionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSession=ruleSession();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSession; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSession"


    // $ANTLR start "ruleSession"
    // InternalThingML.g:3768:1: ruleSession returns [EObject current=null] : (otherlv_0= 'session' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) ) otherlv_4= '>' )? otherlv_5= 'init' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_substate_9_0= ruleState ) )* otherlv_10= '}' ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_maxInstances_3_1 = null;

        EObject lv_maxInstances_3_2 = null;

        EObject lv_annotations_7_0 = null;

        EObject lv_substate_9_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:3774:2: ( (otherlv_0= 'session' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) ) otherlv_4= '>' )? otherlv_5= 'init' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_substate_9_0= ruleState ) )* otherlv_10= '}' ) )
            // InternalThingML.g:3775:2: (otherlv_0= 'session' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) ) otherlv_4= '>' )? otherlv_5= 'init' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_substate_9_0= ruleState ) )* otherlv_10= '}' )
            {
            // InternalThingML.g:3775:2: (otherlv_0= 'session' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) ) otherlv_4= '>' )? otherlv_5= 'init' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_substate_9_0= ruleState ) )* otherlv_10= '}' )
            // InternalThingML.g:3776:3: otherlv_0= 'session' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) ) otherlv_4= '>' )? otherlv_5= 'init' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* otherlv_8= '{' ( (lv_substate_9_0= ruleState ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSessionAccess().getSessionKeyword_0());
              		
            }
            // InternalThingML.g:3780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:3781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:3781:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:3782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSessionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:3798:3: (otherlv_2= '<' ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) ) otherlv_4= '>' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==23) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalThingML.g:3799:4: otherlv_2= '<' ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getLessThanSignKeyword_2_0());
                      			
                    }
                    // InternalThingML.g:3803:4: ( ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) ) )
                    // InternalThingML.g:3804:5: ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) )
                    {
                    // InternalThingML.g:3804:5: ( (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference ) )
                    // InternalThingML.g:3805:6: (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference )
                    {
                    // InternalThingML.g:3805:6: (lv_maxInstances_3_1= ruleIntegerLiteral | lv_maxInstances_3_2= rulePropertyReference )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==RULE_INT) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==RULE_ID) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalThingML.g:3806:7: lv_maxInstances_3_1= ruleIntegerLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSessionAccess().getMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_maxInstances_3_1=ruleIntegerLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSessionRule());
                              							}
                              							set(
                              								current,
                              								"maxInstances",
                              								lv_maxInstances_3_1,
                              								"org.thingml.xtext.ThingML.IntegerLiteral");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalThingML.g:3822:7: lv_maxInstances_3_2= rulePropertyReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSessionAccess().getMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_maxInstances_3_2=rulePropertyReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSessionRule());
                              							}
                              							set(
                              								current,
                              								"maxInstances",
                              								lv_maxInstances_3_2,
                              								"org.thingml.xtext.ThingML.PropertyReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getGreaterThanSignKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSessionAccess().getInitKeyword_3());
              		
            }
            // InternalThingML.g:3849:3: ( (otherlv_6= RULE_ID ) )
            // InternalThingML.g:3850:4: (otherlv_6= RULE_ID )
            {
            // InternalThingML.g:3850:4: (otherlv_6= RULE_ID )
            // InternalThingML.g:3851:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSessionRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getInitialStateCrossReference_4_0());
              				
            }

            }


            }

            // InternalThingML.g:3862:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_ANNOTATION_ID) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalThingML.g:3863:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:3863:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:3864:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSessionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSessionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_8=(Token)match(input,29,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalThingML.g:3885:3: ( (lv_substate_9_0= ruleState ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==52||LA95_0==61||LA95_0==65||LA95_0==68) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalThingML.g:3886:4: (lv_substate_9_0= ruleState )
            	    {
            	    // InternalThingML.g:3886:4: (lv_substate_9_0= ruleState )
            	    // InternalThingML.g:3887:5: lv_substate_9_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSessionAccess().getSubstateStateParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_substate_9_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSessionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"substate",
            	      						lv_substate_9_0,
            	      						"org.thingml.xtext.ThingML.State");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            otherlv_10=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleRegion"
    // InternalThingML.g:3912:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalThingML.g:3912:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalThingML.g:3913:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRegion=ruleRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalThingML.g:3919:1: ruleRegion returns [EObject current=null] : (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_history_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotations_6_0 = null;

        EObject lv_substate_8_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:3925:2: ( (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' ) )
            // InternalThingML.g:3926:2: (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' )
            {
            // InternalThingML.g:3926:2: (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' )
            // InternalThingML.g:3927:3: otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'init' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )? ( (lv_annotations_6_0= rulePlatformAnnotation ) )* otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRegionAccess().getRegionKeyword_0());
              		
            }
            // InternalThingML.g:3931:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalThingML.g:3932:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalThingML.g:3932:4: (lv_name_1_0= RULE_ID )
                    // InternalThingML.g:3933:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRegionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.thingml.xtext.ThingML.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getInitKeyword_2());
              		
            }
            // InternalThingML.g:3953:3: ( (otherlv_3= RULE_ID ) )
            // InternalThingML.g:3954:4: (otherlv_3= RULE_ID )
            {
            // InternalThingML.g:3954:4: (otherlv_3= RULE_ID )
            // InternalThingML.g:3955:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRegionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getRegionAccess().getInitialStateCrossReference_3_0());
              				
            }

            }


            }

            // InternalThingML.g:3966:3: (otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==63) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalThingML.g:3967:4: otherlv_4= 'keeps' ( (lv_history_5_0= 'history' ) )
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRegionAccess().getKeepsKeyword_4_0());
                      			
                    }
                    // InternalThingML.g:3971:4: ( (lv_history_5_0= 'history' ) )
                    // InternalThingML.g:3972:5: (lv_history_5_0= 'history' )
                    {
                    // InternalThingML.g:3972:5: (lv_history_5_0= 'history' )
                    // InternalThingML.g:3973:6: lv_history_5_0= 'history'
                    {
                    lv_history_5_0=(Token)match(input,64,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_history_5_0, grammarAccess.getRegionAccess().getHistoryHistoryKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRegionRule());
                      						}
                      						setWithLastConsumed(current, "history", true, "history");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:3986:3: ( (lv_annotations_6_0= rulePlatformAnnotation ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_ANNOTATION_ID) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalThingML.g:3987:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:3987:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    // InternalThingML.g:3988:5: lv_annotations_6_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRegionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_6_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRegionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_6_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalThingML.g:4009:3: ( (lv_substate_8_0= ruleState ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==52||LA99_0==61||LA99_0==65||LA99_0==68) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalThingML.g:4010:4: (lv_substate_8_0= ruleState )
            	    {
            	    // InternalThingML.g:4010:4: (lv_substate_8_0= ruleState )
            	    // InternalThingML.g:4011:5: lv_substate_8_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRegionAccess().getSubstateStateParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_substate_8_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRegionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"substate",
            	      						lv_substate_8_0,
            	      						"org.thingml.xtext.ThingML.State");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleFinalState"
    // InternalThingML.g:4036:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalThingML.g:4036:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalThingML.g:4037:2: iv_ruleFinalState= ruleFinalState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinalStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFinalState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalThingML.g:4043:1: ruleFinalState returns [EObject current=null] : (otherlv_0= 'final' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' (otherlv_5= 'on' otherlv_6= 'entry' ( (lv_entry_7_0= ruleAction ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_3_0 = null;

        EObject lv_entry_7_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4049:2: ( (otherlv_0= 'final' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' (otherlv_5= 'on' otherlv_6= 'entry' ( (lv_entry_7_0= ruleAction ) ) )? otherlv_8= '}' ) )
            // InternalThingML.g:4050:2: (otherlv_0= 'final' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' (otherlv_5= 'on' otherlv_6= 'entry' ( (lv_entry_7_0= ruleAction ) ) )? otherlv_8= '}' )
            {
            // InternalThingML.g:4050:2: (otherlv_0= 'final' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' (otherlv_5= 'on' otherlv_6= 'entry' ( (lv_entry_7_0= ruleAction ) ) )? otherlv_8= '}' )
            // InternalThingML.g:4051:3: otherlv_0= 'final' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ( (lv_annotations_3_0= rulePlatformAnnotation ) )* otherlv_4= '{' (otherlv_5= 'on' otherlv_6= 'entry' ( (lv_entry_7_0= ruleAction ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFinalStateAccess().getFinalKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,52,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getStateKeyword_1());
              		
            }
            // InternalThingML.g:4059:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:4060:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:4060:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:4061:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFinalStateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:4077:3: ( (lv_annotations_3_0= rulePlatformAnnotation ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_ANNOTATION_ID) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalThingML.g:4078:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:4078:4: (lv_annotations_3_0= rulePlatformAnnotation )
            	    // InternalThingML.g:4079:5: lv_annotations_3_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFinalStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_3_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_3_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFinalStateAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalThingML.g:4100:3: (otherlv_5= 'on' otherlv_6= 'entry' ( (lv_entry_7_0= ruleAction ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==53) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalThingML.g:4101:4: otherlv_5= 'on' otherlv_6= 'entry' ( (lv_entry_7_0= ruleAction ) )
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFinalStateAccess().getOnKeyword_5_0());
                      			
                    }
                    otherlv_6=(Token)match(input,54,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFinalStateAccess().getEntryKeyword_5_1());
                      			
                    }
                    // InternalThingML.g:4109:4: ( (lv_entry_7_0= ruleAction ) )
                    // InternalThingML.g:4110:5: (lv_entry_7_0= ruleAction )
                    {
                    // InternalThingML.g:4110:5: (lv_entry_7_0= ruleAction )
                    // InternalThingML.g:4111:6: lv_entry_7_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFinalStateAccess().getEntryActionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_entry_7_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFinalStateRule());
                      						}
                      						set(
                      							current,
                      							"entry",
                      							lv_entry_7_0,
                      							"org.thingml.xtext.ThingML.Action");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getFinalStateAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleStateContainer"
    // InternalThingML.g:4137:1: entryRuleStateContainer returns [EObject current=null] : iv_ruleStateContainer= ruleStateContainer EOF ;
    public final EObject entryRuleStateContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateContainer = null;


        try {
            // InternalThingML.g:4137:55: (iv_ruleStateContainer= ruleStateContainer EOF )
            // InternalThingML.g:4138:2: iv_ruleStateContainer= ruleStateContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateContainerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateContainer=ruleStateContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateContainer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateContainer"


    // $ANTLR start "ruleStateContainer"
    // InternalThingML.g:4144:1: ruleStateContainer returns [EObject current=null] : (this_CompositeState_0= ruleCompositeState | this_Region_1= ruleRegion | this_Session_2= ruleSession | (otherlv_3= 'keeps' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' ) ) ;
    public final EObject ruleStateContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_history_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_CompositeState_0 = null;

        EObject this_Region_1 = null;

        EObject this_Session_2 = null;

        EObject lv_substate_8_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4150:2: ( (this_CompositeState_0= ruleCompositeState | this_Region_1= ruleRegion | this_Session_2= ruleSession | (otherlv_3= 'keeps' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' ) ) )
            // InternalThingML.g:4151:2: (this_CompositeState_0= ruleCompositeState | this_Region_1= ruleRegion | this_Session_2= ruleSession | (otherlv_3= 'keeps' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' ) )
            {
            // InternalThingML.g:4151:2: (this_CompositeState_0= ruleCompositeState | this_Region_1= ruleRegion | this_Session_2= ruleSession | (otherlv_3= 'keeps' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' ) )
            int alt104=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt104=1;
                }
                break;
            case 67:
                {
                alt104=2;
                }
                break;
            case 66:
                {
                alt104=3;
                }
                break;
            case 63:
                {
                alt104=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalThingML.g:4152:3: this_CompositeState_0= ruleCompositeState
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStateContainerAccess().getCompositeStateParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompositeState_0=ruleCompositeState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompositeState_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:4161:3: this_Region_1= ruleRegion
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStateContainerAccess().getRegionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Region_1=ruleRegion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Region_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:4170:3: this_Session_2= ruleSession
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStateContainerAccess().getSessionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Session_2=ruleSession();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Session_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThingML.g:4179:3: (otherlv_3= 'keeps' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' )
                    {
                    // InternalThingML.g:4179:3: (otherlv_3= 'keeps' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}' )
                    // InternalThingML.g:4180:4: otherlv_3= 'keeps' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )? otherlv_7= '{' ( (lv_substate_8_0= ruleState ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStateContainerAccess().getKeepsKeyword_3_0());
                      			
                    }
                    // InternalThingML.g:4184:4: ( (otherlv_4= RULE_ID ) )
                    // InternalThingML.g:4185:5: (otherlv_4= RULE_ID )
                    {
                    // InternalThingML.g:4185:5: (otherlv_4= RULE_ID )
                    // InternalThingML.g:4186:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStateContainerRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getStateContainerAccess().getInitialStateCrossReference_3_1_0());
                      					
                    }

                    }


                    }

                    // InternalThingML.g:4197:4: (otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==63) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalThingML.g:4198:5: otherlv_5= 'keeps' ( (lv_history_6_0= 'history' ) )
                            {
                            otherlv_5=(Token)match(input,63,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getStateContainerAccess().getKeepsKeyword_3_2_0());
                              				
                            }
                            // InternalThingML.g:4202:5: ( (lv_history_6_0= 'history' ) )
                            // InternalThingML.g:4203:6: (lv_history_6_0= 'history' )
                            {
                            // InternalThingML.g:4203:6: (lv_history_6_0= 'history' )
                            // InternalThingML.g:4204:7: lv_history_6_0= 'history'
                            {
                            lv_history_6_0=(Token)match(input,64,FOLLOW_64); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_history_6_0, grammarAccess.getStateContainerAccess().getHistoryHistoryKeyword_3_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getStateContainerRule());
                              							}
                              							setWithLastConsumed(current, "history", true, "history");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getStateContainerAccess().getLeftCurlyBracketKeyword_3_3());
                      			
                    }
                    // InternalThingML.g:4221:4: ( (lv_substate_8_0= ruleState ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==52||LA103_0==61||LA103_0==65||LA103_0==68) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalThingML.g:4222:5: (lv_substate_8_0= ruleState )
                    	    {
                    	    // InternalThingML.g:4222:5: (lv_substate_8_0= ruleState )
                    	    // InternalThingML.g:4223:6: lv_substate_8_0= ruleState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getStateContainerAccess().getSubstateStateParserRuleCall_3_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_substate_8_0=ruleState();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getStateContainerRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"substate",
                    	      							lv_substate_8_0,
                    	      							"org.thingml.xtext.ThingML.State");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getStateContainerAccess().getRightCurlyBracketKeyword_3_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStateContainer"


    // $ANTLR start "entryRuleEvent"
    // InternalThingML.g:4249:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalThingML.g:4249:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalThingML.g:4250:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalThingML.g:4256:1: ruleEvent returns [EObject current=null] : this_ReceiveMessage_0= ruleReceiveMessage ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_ReceiveMessage_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4262:2: (this_ReceiveMessage_0= ruleReceiveMessage )
            // InternalThingML.g:4263:2: this_ReceiveMessage_0= ruleReceiveMessage
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEventAccess().getReceiveMessageParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ReceiveMessage_0=ruleReceiveMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ReceiveMessage_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleReceiveMessage"
    // InternalThingML.g:4274:1: entryRuleReceiveMessage returns [EObject current=null] : iv_ruleReceiveMessage= ruleReceiveMessage EOF ;
    public final EObject entryRuleReceiveMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiveMessage = null;


        try {
            // InternalThingML.g:4274:55: (iv_ruleReceiveMessage= ruleReceiveMessage EOF )
            // InternalThingML.g:4275:2: iv_ruleReceiveMessage= ruleReceiveMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiveMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReceiveMessage=ruleReceiveMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReceiveMessage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReceiveMessage"


    // $ANTLR start "ruleReceiveMessage"
    // InternalThingML.g:4281:1: ruleReceiveMessage returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '?' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleReceiveMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalThingML.g:4287:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '?' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalThingML.g:4288:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '?' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalThingML.g:4288:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '?' ( (otherlv_4= RULE_ID ) ) )
            // InternalThingML.g:4289:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '?' ( (otherlv_4= RULE_ID ) )
            {
            // InternalThingML.g:4289:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID) ) {
                int LA105_1 = input.LA(2);

                if ( (LA105_1==19) ) {
                    alt105=1;
                }
            }
            switch (alt105) {
                case 1 :
                    // InternalThingML.g:4290:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalThingML.g:4290:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalThingML.g:4291:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalThingML.g:4291:5: (lv_name_0_0= RULE_ID )
                    // InternalThingML.g:4292:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getReceiveMessageAccess().getNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReceiveMessageRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.thingml.xtext.ThingML.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getReceiveMessageAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalThingML.g:4313:3: ( (otherlv_2= RULE_ID ) )
            // InternalThingML.g:4314:4: (otherlv_2= RULE_ID )
            {
            // InternalThingML.g:4314:4: (otherlv_2= RULE_ID )
            // InternalThingML.g:4315:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReceiveMessageRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getReceiveMessageAccess().getPortPortCrossReference_1_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,69,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReceiveMessageAccess().getQuestionMarkKeyword_2());
              		
            }
            // InternalThingML.g:4330:3: ( (otherlv_4= RULE_ID ) )
            // InternalThingML.g:4331:4: (otherlv_4= RULE_ID )
            {
            // InternalThingML.g:4331:4: (otherlv_4= RULE_ID )
            // InternalThingML.g:4332:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReceiveMessageRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getReceiveMessageAccess().getMessageMessageCrossReference_3_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReceiveMessage"


    // $ANTLR start "entryRuleAction"
    // InternalThingML.g:4347:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalThingML.g:4347:47: (iv_ruleAction= ruleAction EOF )
            // InternalThingML.g:4348:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalThingML.g:4354:1: ruleAction returns [EObject current=null] : (this_ActionBlock_0= ruleActionBlock | this_ExternStatement_1= ruleExternStatement | this_SendAction_2= ruleSendAction | this_VariableAssignment_3= ruleVariableAssignment | this_Increment_4= ruleIncrement | this_Decrement_5= ruleDecrement | this_LoopAction_6= ruleLoopAction | this_ForAction_7= ruleForAction | this_ConditionalAction_8= ruleConditionalAction | this_ReturnAction_9= ruleReturnAction | this_PrintAction_10= rulePrintAction | this_ErrorAction_11= ruleErrorAction | this_StartSession_12= ruleStartSession | this_FunctionCallStatement_13= ruleFunctionCallStatement | this_LocalVariable_14= ruleLocalVariable ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionBlock_0 = null;

        EObject this_ExternStatement_1 = null;

        EObject this_SendAction_2 = null;

        EObject this_VariableAssignment_3 = null;

        EObject this_Increment_4 = null;

        EObject this_Decrement_5 = null;

        EObject this_LoopAction_6 = null;

        EObject this_ForAction_7 = null;

        EObject this_ConditionalAction_8 = null;

        EObject this_ReturnAction_9 = null;

        EObject this_PrintAction_10 = null;

        EObject this_ErrorAction_11 = null;

        EObject this_StartSession_12 = null;

        EObject this_FunctionCallStatement_13 = null;

        EObject this_LocalVariable_14 = null;



        	enterRule();

        try {
            // InternalThingML.g:4360:2: ( (this_ActionBlock_0= ruleActionBlock | this_ExternStatement_1= ruleExternStatement | this_SendAction_2= ruleSendAction | this_VariableAssignment_3= ruleVariableAssignment | this_Increment_4= ruleIncrement | this_Decrement_5= ruleDecrement | this_LoopAction_6= ruleLoopAction | this_ForAction_7= ruleForAction | this_ConditionalAction_8= ruleConditionalAction | this_ReturnAction_9= ruleReturnAction | this_PrintAction_10= rulePrintAction | this_ErrorAction_11= ruleErrorAction | this_StartSession_12= ruleStartSession | this_FunctionCallStatement_13= ruleFunctionCallStatement | this_LocalVariable_14= ruleLocalVariable ) )
            // InternalThingML.g:4361:2: (this_ActionBlock_0= ruleActionBlock | this_ExternStatement_1= ruleExternStatement | this_SendAction_2= ruleSendAction | this_VariableAssignment_3= ruleVariableAssignment | this_Increment_4= ruleIncrement | this_Decrement_5= ruleDecrement | this_LoopAction_6= ruleLoopAction | this_ForAction_7= ruleForAction | this_ConditionalAction_8= ruleConditionalAction | this_ReturnAction_9= ruleReturnAction | this_PrintAction_10= rulePrintAction | this_ErrorAction_11= ruleErrorAction | this_StartSession_12= ruleStartSession | this_FunctionCallStatement_13= ruleFunctionCallStatement | this_LocalVariable_14= ruleLocalVariable )
            {
            // InternalThingML.g:4361:2: (this_ActionBlock_0= ruleActionBlock | this_ExternStatement_1= ruleExternStatement | this_SendAction_2= ruleSendAction | this_VariableAssignment_3= ruleVariableAssignment | this_Increment_4= ruleIncrement | this_Decrement_5= ruleDecrement | this_LoopAction_6= ruleLoopAction | this_ForAction_7= ruleForAction | this_ConditionalAction_8= ruleConditionalAction | this_ReturnAction_9= ruleReturnAction | this_PrintAction_10= rulePrintAction | this_ErrorAction_11= ruleErrorAction | this_StartSession_12= ruleStartSession | this_FunctionCallStatement_13= ruleFunctionCallStatement | this_LocalVariable_14= ruleLocalVariable )
            int alt106=15;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // InternalThingML.g:4362:3: this_ActionBlock_0= ruleActionBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getActionBlockParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ActionBlock_0=ruleActionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActionBlock_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:4371:3: this_ExternStatement_1= ruleExternStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getExternStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternStatement_1=ruleExternStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternStatement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:4380:3: this_SendAction_2= ruleSendAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getSendActionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SendAction_2=ruleSendAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SendAction_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThingML.g:4389:3: this_VariableAssignment_3= ruleVariableAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getVariableAssignmentParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableAssignment_3=ruleVariableAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableAssignment_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalThingML.g:4398:3: this_Increment_4= ruleIncrement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getIncrementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Increment_4=ruleIncrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Increment_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalThingML.g:4407:3: this_Decrement_5= ruleDecrement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getDecrementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Decrement_5=ruleDecrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Decrement_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalThingML.g:4416:3: this_LoopAction_6= ruleLoopAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getLoopActionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LoopAction_6=ruleLoopAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LoopAction_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalThingML.g:4425:3: this_ForAction_7= ruleForAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getForActionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForAction_7=ruleForAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForAction_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalThingML.g:4434:3: this_ConditionalAction_8= ruleConditionalAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getConditionalActionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionalAction_8=ruleConditionalAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionalAction_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalThingML.g:4443:3: this_ReturnAction_9= ruleReturnAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getReturnActionParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnAction_9=ruleReturnAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReturnAction_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalThingML.g:4452:3: this_PrintAction_10= rulePrintAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getPrintActionParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrintAction_10=rulePrintAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrintAction_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalThingML.g:4461:3: this_ErrorAction_11= ruleErrorAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getErrorActionParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ErrorAction_11=ruleErrorAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ErrorAction_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalThingML.g:4470:3: this_StartSession_12= ruleStartSession
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getStartSessionParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StartSession_12=ruleStartSession();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StartSession_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalThingML.g:4479:3: this_FunctionCallStatement_13= ruleFunctionCallStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getFunctionCallStatementParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCallStatement_13=ruleFunctionCallStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCallStatement_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalThingML.g:4488:3: this_LocalVariable_14= ruleLocalVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getLocalVariableParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalVariable_14=ruleLocalVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LocalVariable_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionBlock"
    // InternalThingML.g:4500:1: entryRuleActionBlock returns [EObject current=null] : iv_ruleActionBlock= ruleActionBlock EOF ;
    public final EObject entryRuleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBlock = null;


        try {
            // InternalThingML.g:4500:52: (iv_ruleActionBlock= ruleActionBlock EOF )
            // InternalThingML.g:4501:2: iv_ruleActionBlock= ruleActionBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActionBlock=ruleActionBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActionBlock"


    // $ANTLR start "ruleActionBlock"
    // InternalThingML.g:4507:1: ruleActionBlock returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= 'end' ) ;
    public final EObject ruleActionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4513:2: ( ( () otherlv_1= 'do' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= 'end' ) )
            // InternalThingML.g:4514:2: ( () otherlv_1= 'do' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= 'end' )
            {
            // InternalThingML.g:4514:2: ( () otherlv_1= 'do' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= 'end' )
            // InternalThingML.g:4515:3: () otherlv_1= 'do' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= 'end'
            {
            // InternalThingML.g:4515:3: ()
            // InternalThingML.g:4516:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getActionBlockAccess().getActionBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getActionBlockAccess().getDoKeyword_1());
              		
            }
            // InternalThingML.g:4526:3: ( (lv_actions_2_0= ruleAction ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==RULE_ID||LA107_0==RULE_EXTERN||LA107_0==18||LA107_0==42||LA107_0==70||LA107_0==76||(LA107_0>=78 && LA107_0<=79)||(LA107_0>=81 && LA107_0<=86)) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalThingML.g:4527:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalThingML.g:4527:4: (lv_actions_2_0= ruleAction )
            	    // InternalThingML.g:4528:5: lv_actions_2_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getActionBlockAccess().getActionsActionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_66);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getActionBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"actions",
            	      						lv_actions_2_0,
            	      						"org.thingml.xtext.ThingML.Action");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            otherlv_3=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getActionBlockAccess().getEndKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActionBlock"


    // $ANTLR start "entryRuleExternStatement"
    // InternalThingML.g:4553:1: entryRuleExternStatement returns [EObject current=null] : iv_ruleExternStatement= ruleExternStatement EOF ;
    public final EObject entryRuleExternStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternStatement = null;


        try {
            // InternalThingML.g:4553:56: (iv_ruleExternStatement= ruleExternStatement EOF )
            // InternalThingML.g:4554:2: iv_ruleExternStatement= ruleExternStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternStatement=ruleExternStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExternStatement"


    // $ANTLR start "ruleExternStatement"
    // InternalThingML.g:4560:1: ruleExternStatement returns [EObject current=null] : ( ( (lv_statement_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExternStatement() throws RecognitionException {
        EObject current = null;

        Token lv_statement_0_0=null;
        Token otherlv_1=null;
        EObject lv_segments_2_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4566:2: ( ( ( (lv_statement_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* ) )
            // InternalThingML.g:4567:2: ( ( (lv_statement_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* )
            {
            // InternalThingML.g:4567:2: ( ( (lv_statement_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* )
            // InternalThingML.g:4568:3: ( (lv_statement_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )*
            {
            // InternalThingML.g:4568:3: ( (lv_statement_0_0= RULE_EXTERN ) )
            // InternalThingML.g:4569:4: (lv_statement_0_0= RULE_EXTERN )
            {
            // InternalThingML.g:4569:4: (lv_statement_0_0= RULE_EXTERN )
            // InternalThingML.g:4570:5: lv_statement_0_0= RULE_EXTERN
            {
            lv_statement_0_0=(Token)match(input,RULE_EXTERN,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_statement_0_0, grammarAccess.getExternStatementAccess().getStatementEXTERNTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExternStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"statement",
              						lv_statement_0_0,
              						"org.thingml.xtext.ThingML.EXTERN");
              				
            }

            }


            }

            // InternalThingML.g:4586:3: (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==72) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalThingML.g:4587:4: otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExternStatementAccess().getAmpersandKeyword_1_0());
            	      			
            	    }
            	    // InternalThingML.g:4591:4: ( (lv_segments_2_0= ruleExpression ) )
            	    // InternalThingML.g:4592:5: (lv_segments_2_0= ruleExpression )
            	    {
            	    // InternalThingML.g:4592:5: (lv_segments_2_0= ruleExpression )
            	    // InternalThingML.g:4593:6: lv_segments_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExternStatementAccess().getSegmentsExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_segments_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExternStatementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"segments",
            	      							lv_segments_2_0,
            	      							"org.thingml.xtext.ThingML.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExternStatement"


    // $ANTLR start "entryRuleLocalVariable"
    // InternalThingML.g:4615:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalThingML.g:4615:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalThingML.g:4616:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariable=ruleLocalVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // InternalThingML.g:4622:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_readonly_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typeRef_4_0 = null;

        EObject lv_init_6_0 = null;

        EObject lv_annotations_7_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4628:2: ( ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:4629:2: ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:4629:2: ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:4630:3: ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_typeRef_4_0= ruleTypeRef ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )? ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            // InternalThingML.g:4630:3: ( (lv_readonly_0_0= 'readonly' ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==42) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalThingML.g:4631:4: (lv_readonly_0_0= 'readonly' )
                    {
                    // InternalThingML.g:4631:4: (lv_readonly_0_0= 'readonly' )
                    // InternalThingML.g:4632:5: lv_readonly_0_0= 'readonly'
                    {
                    lv_readonly_0_0=(Token)match(input,42,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_readonly_0_0, grammarAccess.getLocalVariableAccess().getReadonlyReadonlyKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLocalVariableRule());
                      					}
                      					setWithLastConsumed(current, "readonly", true, "readonly");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getVarKeyword_1());
              		
            }
            // InternalThingML.g:4648:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalThingML.g:4649:4: (lv_name_2_0= RULE_ID )
            {
            // InternalThingML.g:4649:4: (lv_name_2_0= RULE_ID )
            // InternalThingML.g:4650:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLocalVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLocalVariableAccess().getColonKeyword_3());
              		
            }
            // InternalThingML.g:4670:3: ( (lv_typeRef_4_0= ruleTypeRef ) )
            // InternalThingML.g:4671:4: (lv_typeRef_4_0= ruleTypeRef )
            {
            // InternalThingML.g:4671:4: (lv_typeRef_4_0= ruleTypeRef )
            // InternalThingML.g:4672:5: lv_typeRef_4_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLocalVariableAccess().getTypeRefTypeRefParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_typeRef_4_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLocalVariableRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_4_0,
              						"org.thingml.xtext.ThingML.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:4689:3: (otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==31) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalThingML.g:4690:4: otherlv_5= '=' ( (lv_init_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalThingML.g:4694:4: ( (lv_init_6_0= ruleExpression ) )
                    // InternalThingML.g:4695:5: (lv_init_6_0= ruleExpression )
                    {
                    // InternalThingML.g:4695:5: (lv_init_6_0= ruleExpression )
                    // InternalThingML.g:4696:6: lv_init_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocalVariableAccess().getInitExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_init_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLocalVariableRule());
                      						}
                      						set(
                      							current,
                      							"init",
                      							lv_init_6_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:4714:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==RULE_ANNOTATION_ID) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalThingML.g:4715:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:4715:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:4716:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLocalVariableAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLocalVariableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleSendAction"
    // InternalThingML.g:4737:1: entryRuleSendAction returns [EObject current=null] : iv_ruleSendAction= ruleSendAction EOF ;
    public final EObject entryRuleSendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendAction = null;


        try {
            // InternalThingML.g:4737:51: (iv_ruleSendAction= ruleSendAction EOF )
            // InternalThingML.g:4738:2: iv_ruleSendAction= ruleSendAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSendActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSendAction=ruleSendAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSendAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSendAction"


    // $ANTLR start "ruleSendAction"
    // InternalThingML.g:4744:1: ruleSendAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleSendAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4750:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) )
            // InternalThingML.g:4751:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            {
            // InternalThingML.g:4751:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            // InternalThingML.g:4752:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )* )? otherlv_7= ')'
            {
            // InternalThingML.g:4752:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:4753:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:4753:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:4754:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSendActionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSendActionAccess().getPortPortCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,73,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSendActionAccess().getExclamationMarkKeyword_1());
              		
            }
            // InternalThingML.g:4769:3: ( (otherlv_2= RULE_ID ) )
            // InternalThingML.g:4770:4: (otherlv_2= RULE_ID )
            {
            // InternalThingML.g:4770:4: (otherlv_2= RULE_ID )
            // InternalThingML.g:4771:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSendActionRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getSendActionAccess().getMessageMessageCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSendActionAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalThingML.g:4786:3: ( ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )* )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_STRING && LA113_0<=RULE_ID)||(LA113_0>=RULE_EXTERN && LA113_0<=RULE_FLOAT)||LA113_0==29||LA113_0==39||LA113_0==94||(LA113_0>=98 && LA113_0<=100)) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalThingML.g:4787:4: ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )*
                    {
                    // InternalThingML.g:4787:4: ( (lv_parameters_4_0= ruleExpression ) )
                    // InternalThingML.g:4788:5: (lv_parameters_4_0= ruleExpression )
                    {
                    // InternalThingML.g:4788:5: (lv_parameters_4_0= ruleExpression )
                    // InternalThingML.g:4789:6: lv_parameters_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSendActionRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_4_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalThingML.g:4806:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==35) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalThingML.g:4807:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getSendActionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalThingML.g:4811:5: ( (lv_parameters_6_0= ruleExpression ) )
                    	    // InternalThingML.g:4812:6: (lv_parameters_6_0= ruleExpression )
                    	    {
                    	    // InternalThingML.g:4812:6: (lv_parameters_6_0= ruleExpression )
                    	    // InternalThingML.g:4813:7: lv_parameters_6_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameters_6_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSendActionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_6_0,
                    	      								"org.thingml.xtext.ThingML.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSendActionAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSendAction"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalThingML.g:4840:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalThingML.g:4840:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalThingML.g:4841:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalThingML.g:4847:1: ruleVariableAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( '[' )=>otherlv_1= '[' ) ( (lv_index_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_index_2_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:4853:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( '[' )=>otherlv_1= '[' ) ( (lv_index_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // InternalThingML.g:4854:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( '[' )=>otherlv_1= '[' ) ( (lv_index_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // InternalThingML.g:4854:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( '[' )=>otherlv_1= '[' ) ( (lv_index_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            // InternalThingML.g:4855:3: ( (otherlv_0= RULE_ID ) ) ( ( ( '[' )=>otherlv_1= '[' ) ( (lv_index_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // InternalThingML.g:4855:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:4856:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:4856:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:4857:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableAssignmentRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getVariableAssignmentAccess().getPropertyVariableCrossReference_0_0());
              				
            }

            }


            }

            // InternalThingML.g:4868:3: ( ( ( '[' )=>otherlv_1= '[' ) ( (lv_index_2_0= ruleExpression ) ) otherlv_3= ']' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==20) && (synpred4_InternalThingML())) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalThingML.g:4869:4: ( ( '[' )=>otherlv_1= '[' ) ( (lv_index_2_0= ruleExpression ) ) otherlv_3= ']'
                    {
                    // InternalThingML.g:4869:4: ( ( '[' )=>otherlv_1= '[' )
                    // InternalThingML.g:4870:5: ( '[' )=>otherlv_1= '['
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_1_0());
                      				
                    }

                    }

                    // InternalThingML.g:4876:4: ( (lv_index_2_0= ruleExpression ) )
                    // InternalThingML.g:4877:5: (lv_index_2_0= ruleExpression )
                    {
                    // InternalThingML.g:4877:5: (lv_index_2_0= ruleExpression )
                    // InternalThingML.g:4878:6: lv_index_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableAssignmentAccess().getIndexExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_index_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_2_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalThingML.g:4904:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalThingML.g:4905:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalThingML.g:4905:4: (lv_expression_5_0= ruleExpression )
            // InternalThingML.g:4906:5: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_5_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleIncrement"
    // InternalThingML.g:4927:1: entryRuleIncrement returns [EObject current=null] : iv_ruleIncrement= ruleIncrement EOF ;
    public final EObject entryRuleIncrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncrement = null;


        try {
            // InternalThingML.g:4927:50: (iv_ruleIncrement= ruleIncrement EOF )
            // InternalThingML.g:4928:2: iv_ruleIncrement= ruleIncrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncrementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIncrement=ruleIncrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncrement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIncrement"


    // $ANTLR start "ruleIncrement"
    // InternalThingML.g:4934:1: ruleIncrement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '++' ) ;
    public final EObject ruleIncrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalThingML.g:4940:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '++' ) )
            // InternalThingML.g:4941:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '++' )
            {
            // InternalThingML.g:4941:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '++' )
            // InternalThingML.g:4942:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '++'
            {
            // InternalThingML.g:4942:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:4943:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:4943:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:4944:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIncrementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getIncrementAccess().getVarVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIncrementAccess().getPlusSignPlusSignKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIncrement"


    // $ANTLR start "entryRuleDecrement"
    // InternalThingML.g:4963:1: entryRuleDecrement returns [EObject current=null] : iv_ruleDecrement= ruleDecrement EOF ;
    public final EObject entryRuleDecrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecrement = null;


        try {
            // InternalThingML.g:4963:50: (iv_ruleDecrement= ruleDecrement EOF )
            // InternalThingML.g:4964:2: iv_ruleDecrement= ruleDecrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecrementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecrement=ruleDecrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecrement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecrement"


    // $ANTLR start "ruleDecrement"
    // InternalThingML.g:4970:1: ruleDecrement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' ) ;
    public final EObject ruleDecrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalThingML.g:4976:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' ) )
            // InternalThingML.g:4977:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' )
            {
            // InternalThingML.g:4977:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' )
            // InternalThingML.g:4978:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '--'
            {
            // InternalThingML.g:4978:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:4979:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:4979:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:4980:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDecrementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDecrementAccess().getVarVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDecrementAccess().getHyphenMinusHyphenMinusKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecrement"


    // $ANTLR start "entryRuleForAction"
    // InternalThingML.g:4999:1: entryRuleForAction returns [EObject current=null] : iv_ruleForAction= ruleForAction EOF ;
    public final EObject entryRuleForAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAction = null;


        try {
            // InternalThingML.g:4999:50: (iv_ruleForAction= ruleForAction EOF )
            // InternalThingML.g:5000:2: iv_ruleForAction= ruleForAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForAction=ruleForAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForAction"


    // $ANTLR start "ruleForAction"
    // InternalThingML.g:5006:1: ruleForAction returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleParameter ) ) )? otherlv_5= 'in' ( (lv_array_6_0= rulePropertyReference ) ) otherlv_7= ')' ( (lv_action_8_0= ruleAction ) ) ) ;
    public final EObject ruleForAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_2_0 = null;

        EObject lv_index_4_0 = null;

        EObject lv_array_6_0 = null;

        EObject lv_action_8_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5012:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleParameter ) ) )? otherlv_5= 'in' ( (lv_array_6_0= rulePropertyReference ) ) otherlv_7= ')' ( (lv_action_8_0= ruleAction ) ) ) )
            // InternalThingML.g:5013:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleParameter ) ) )? otherlv_5= 'in' ( (lv_array_6_0= rulePropertyReference ) ) otherlv_7= ')' ( (lv_action_8_0= ruleAction ) ) )
            {
            // InternalThingML.g:5013:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleParameter ) ) )? otherlv_5= 'in' ( (lv_array_6_0= rulePropertyReference ) ) otherlv_7= ')' ( (lv_action_8_0= ruleAction ) ) )
            // InternalThingML.g:5014:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleParameter ) ) )? otherlv_5= 'in' ( (lv_array_6_0= rulePropertyReference ) ) otherlv_7= ')' ( (lv_action_8_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForActionAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,39,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForActionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalThingML.g:5022:3: ( (lv_variable_2_0= ruleParameter ) )
            // InternalThingML.g:5023:4: (lv_variable_2_0= ruleParameter )
            {
            // InternalThingML.g:5023:4: (lv_variable_2_0= ruleParameter )
            // InternalThingML.g:5024:5: lv_variable_2_0= ruleParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForActionAccess().getVariableParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_73);
            lv_variable_2_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForActionRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_2_0,
              						"org.thingml.xtext.ThingML.Parameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:5041:3: (otherlv_3= ',' ( (lv_index_4_0= ruleParameter ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==35) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalThingML.g:5042:4: otherlv_3= ',' ( (lv_index_4_0= ruleParameter ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getForActionAccess().getCommaKeyword_3_0());
                      			
                    }
                    // InternalThingML.g:5046:4: ( (lv_index_4_0= ruleParameter ) )
                    // InternalThingML.g:5047:5: (lv_index_4_0= ruleParameter )
                    {
                    // InternalThingML.g:5047:5: (lv_index_4_0= ruleParameter )
                    // InternalThingML.g:5048:6: lv_index_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForActionAccess().getIndexParameterParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
                    lv_index_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getForActionRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_4_0,
                      							"org.thingml.xtext.ThingML.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,77,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForActionAccess().getInKeyword_4());
              		
            }
            // InternalThingML.g:5070:3: ( (lv_array_6_0= rulePropertyReference ) )
            // InternalThingML.g:5071:4: (lv_array_6_0= rulePropertyReference )
            {
            // InternalThingML.g:5071:4: (lv_array_6_0= rulePropertyReference )
            // InternalThingML.g:5072:5: lv_array_6_0= rulePropertyReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForActionAccess().getArrayPropertyReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_array_6_0=rulePropertyReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForActionRule());
              					}
              					set(
              						current,
              						"array",
              						lv_array_6_0,
              						"org.thingml.xtext.ThingML.PropertyReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForActionAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalThingML.g:5093:3: ( (lv_action_8_0= ruleAction ) )
            // InternalThingML.g:5094:4: (lv_action_8_0= ruleAction )
            {
            // InternalThingML.g:5094:4: (lv_action_8_0= ruleAction )
            // InternalThingML.g:5095:5: lv_action_8_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForActionAccess().getActionActionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_action_8_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForActionRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_8_0,
              						"org.thingml.xtext.ThingML.Action");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForAction"


    // $ANTLR start "entryRuleLoopAction"
    // InternalThingML.g:5116:1: entryRuleLoopAction returns [EObject current=null] : iv_ruleLoopAction= ruleLoopAction EOF ;
    public final EObject entryRuleLoopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopAction = null;


        try {
            // InternalThingML.g:5116:51: (iv_ruleLoopAction= ruleLoopAction EOF )
            // InternalThingML.g:5117:2: iv_ruleLoopAction= ruleLoopAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopAction=ruleLoopAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoopAction"


    // $ANTLR start "ruleLoopAction"
    // InternalThingML.g:5123:1: ruleLoopAction returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) ) ;
    public final EObject ruleLoopAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_action_4_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5129:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) ) )
            // InternalThingML.g:5130:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) )
            {
            // InternalThingML.g:5130:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) )
            // InternalThingML.g:5131:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLoopActionAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,39,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLoopActionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalThingML.g:5139:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalThingML.g:5140:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalThingML.g:5140:4: (lv_condition_2_0= ruleExpression )
            // InternalThingML.g:5141:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoopActionAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoopActionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLoopActionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalThingML.g:5162:3: ( (lv_action_4_0= ruleAction ) )
            // InternalThingML.g:5163:4: (lv_action_4_0= ruleAction )
            {
            // InternalThingML.g:5163:4: (lv_action_4_0= ruleAction )
            // InternalThingML.g:5164:5: lv_action_4_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoopActionAccess().getActionActionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_action_4_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoopActionRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_4_0,
              						"org.thingml.xtext.ThingML.Action");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLoopAction"


    // $ANTLR start "entryRuleConditionalAction"
    // InternalThingML.g:5185:1: entryRuleConditionalAction returns [EObject current=null] : iv_ruleConditionalAction= ruleConditionalAction EOF ;
    public final EObject entryRuleConditionalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAction = null;


        try {
            // InternalThingML.g:5185:58: (iv_ruleConditionalAction= ruleConditionalAction EOF )
            // InternalThingML.g:5186:2: iv_ruleConditionalAction= ruleConditionalAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAction=ruleConditionalAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalAction"


    // $ANTLR start "ruleConditionalAction"
    // InternalThingML.g:5192:1: ruleConditionalAction returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseAction_6_0= ruleAction ) ) )? ) ;
    public final EObject ruleConditionalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_action_4_0 = null;

        EObject lv_elseAction_6_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5198:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseAction_6_0= ruleAction ) ) )? ) )
            // InternalThingML.g:5199:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseAction_6_0= ruleAction ) ) )? )
            {
            // InternalThingML.g:5199:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseAction_6_0= ruleAction ) ) )? )
            // InternalThingML.g:5200:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_action_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseAction_6_0= ruleAction ) ) )?
            {
            otherlv_0=(Token)match(input,79,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionalActionAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,39,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConditionalActionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalThingML.g:5208:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalThingML.g:5209:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalThingML.g:5209:4: (lv_condition_2_0= ruleExpression )
            // InternalThingML.g:5210:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalActionAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalActionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConditionalActionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalThingML.g:5231:3: ( (lv_action_4_0= ruleAction ) )
            // InternalThingML.g:5232:4: (lv_action_4_0= ruleAction )
            {
            // InternalThingML.g:5232:4: (lv_action_4_0= ruleAction )
            // InternalThingML.g:5233:5: lv_action_4_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalActionAccess().getActionActionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_76);
            lv_action_4_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalActionRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_4_0,
              						"org.thingml.xtext.ThingML.Action");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:5250:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseAction_6_0= ruleAction ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==80) ) {
                int LA116_1 = input.LA(2);

                if ( (synpred5_InternalThingML()) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // InternalThingML.g:5251:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseAction_6_0= ruleAction ) )
                    {
                    // InternalThingML.g:5251:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalThingML.g:5252:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,80,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getConditionalActionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalThingML.g:5258:4: ( (lv_elseAction_6_0= ruleAction ) )
                    // InternalThingML.g:5259:5: (lv_elseAction_6_0= ruleAction )
                    {
                    // InternalThingML.g:5259:5: (lv_elseAction_6_0= ruleAction )
                    // InternalThingML.g:5260:6: lv_elseAction_6_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionalActionAccess().getElseActionActionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseAction_6_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                      						}
                      						set(
                      							current,
                      							"elseAction",
                      							lv_elseAction_6_0,
                      							"org.thingml.xtext.ThingML.Action");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConditionalAction"


    // $ANTLR start "entryRuleReturnAction"
    // InternalThingML.g:5282:1: entryRuleReturnAction returns [EObject current=null] : iv_ruleReturnAction= ruleReturnAction EOF ;
    public final EObject entryRuleReturnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnAction = null;


        try {
            // InternalThingML.g:5282:53: (iv_ruleReturnAction= ruleReturnAction EOF )
            // InternalThingML.g:5283:2: iv_ruleReturnAction= ruleReturnAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnAction=ruleReturnAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnAction"


    // $ANTLR start "ruleReturnAction"
    // InternalThingML.g:5289:1: ruleReturnAction returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression ) )? ) ;
    public final EObject ruleReturnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5295:2: ( ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression ) )? ) )
            // InternalThingML.g:5296:2: ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression ) )? )
            {
            // InternalThingML.g:5296:2: ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression ) )? )
            // InternalThingML.g:5297:3: () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression ) )?
            {
            // InternalThingML.g:5297:3: ()
            // InternalThingML.g:5298:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnActionAccess().getReturnActionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnActionAccess().getReturnKeyword_1());
              		
            }
            // InternalThingML.g:5308:3: ( ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression ) )?
            int alt117=2;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // InternalThingML.g:5309:4: ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression )
                    {
                    // InternalThingML.g:5313:4: (lv_exp_2_0= ruleExpression )
                    // InternalThingML.g:5314:5: lv_exp_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReturnActionAccess().getExpExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getReturnActionRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_2_0,
                      						"org.thingml.xtext.ThingML.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReturnAction"


    // $ANTLR start "entryRulePrintAction"
    // InternalThingML.g:5335:1: entryRulePrintAction returns [EObject current=null] : iv_rulePrintAction= rulePrintAction EOF ;
    public final EObject entryRulePrintAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintAction = null;


        try {
            // InternalThingML.g:5335:52: (iv_rulePrintAction= rulePrintAction EOF )
            // InternalThingML.g:5336:2: iv_rulePrintAction= rulePrintAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrintAction=rulePrintAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrintAction"


    // $ANTLR start "rulePrintAction"
    // InternalThingML.g:5342:1: rulePrintAction returns [EObject current=null] : ( (otherlv_0= 'print' | ( (lv_line_1_0= 'println' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* ) ;
    public final EObject rulePrintAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_line_1_0=null;
        Token otherlv_3=null;
        EObject lv_msg_2_0 = null;

        EObject lv_msg_4_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5348:2: ( ( (otherlv_0= 'print' | ( (lv_line_1_0= 'println' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* ) )
            // InternalThingML.g:5349:2: ( (otherlv_0= 'print' | ( (lv_line_1_0= 'println' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* )
            {
            // InternalThingML.g:5349:2: ( (otherlv_0= 'print' | ( (lv_line_1_0= 'println' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* )
            // InternalThingML.g:5350:3: (otherlv_0= 'print' | ( (lv_line_1_0= 'println' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )*
            {
            // InternalThingML.g:5350:3: (otherlv_0= 'print' | ( (lv_line_1_0= 'println' ) ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==82) ) {
                alt118=1;
            }
            else if ( (LA118_0==83) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalThingML.g:5351:4: otherlv_0= 'print'
                    {
                    otherlv_0=(Token)match(input,82,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrintActionAccess().getPrintKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:5356:4: ( (lv_line_1_0= 'println' ) )
                    {
                    // InternalThingML.g:5356:4: ( (lv_line_1_0= 'println' ) )
                    // InternalThingML.g:5357:5: (lv_line_1_0= 'println' )
                    {
                    // InternalThingML.g:5357:5: (lv_line_1_0= 'println' )
                    // InternalThingML.g:5358:6: lv_line_1_0= 'println'
                    {
                    lv_line_1_0=(Token)match(input,83,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_line_1_0, grammarAccess.getPrintActionAccess().getLinePrintlnKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrintActionRule());
                      						}
                      						setWithLastConsumed(current, "line", true, "println");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:5371:3: ( (lv_msg_2_0= ruleExpression ) )
            // InternalThingML.g:5372:4: (lv_msg_2_0= ruleExpression )
            {
            // InternalThingML.g:5372:4: (lv_msg_2_0= ruleExpression )
            // InternalThingML.g:5373:5: lv_msg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_78);
            lv_msg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintActionRule());
              					}
              					add(
              						current,
              						"msg",
              						lv_msg_2_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:5390:3: (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==35) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalThingML.g:5391:4: otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getPrintActionAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalThingML.g:5395:4: ( (lv_msg_4_0= ruleExpression ) )
            	    // InternalThingML.g:5396:5: (lv_msg_4_0= ruleExpression )
            	    {
            	    // InternalThingML.g:5396:5: (lv_msg_4_0= ruleExpression )
            	    // InternalThingML.g:5397:6: lv_msg_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_78);
            	    lv_msg_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPrintActionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"msg",
            	      							lv_msg_4_0,
            	      							"org.thingml.xtext.ThingML.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrintAction"


    // $ANTLR start "entryRuleErrorAction"
    // InternalThingML.g:5419:1: entryRuleErrorAction returns [EObject current=null] : iv_ruleErrorAction= ruleErrorAction EOF ;
    public final EObject entryRuleErrorAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorAction = null;


        try {
            // InternalThingML.g:5419:52: (iv_ruleErrorAction= ruleErrorAction EOF )
            // InternalThingML.g:5420:2: iv_ruleErrorAction= ruleErrorAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getErrorActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleErrorAction=ruleErrorAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleErrorAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleErrorAction"


    // $ANTLR start "ruleErrorAction"
    // InternalThingML.g:5426:1: ruleErrorAction returns [EObject current=null] : ( (otherlv_0= 'error' | ( (lv_line_1_0= 'errorln' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* ) ;
    public final EObject ruleErrorAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_line_1_0=null;
        Token otherlv_3=null;
        EObject lv_msg_2_0 = null;

        EObject lv_msg_4_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5432:2: ( ( (otherlv_0= 'error' | ( (lv_line_1_0= 'errorln' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* ) )
            // InternalThingML.g:5433:2: ( (otherlv_0= 'error' | ( (lv_line_1_0= 'errorln' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* )
            {
            // InternalThingML.g:5433:2: ( (otherlv_0= 'error' | ( (lv_line_1_0= 'errorln' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )* )
            // InternalThingML.g:5434:3: (otherlv_0= 'error' | ( (lv_line_1_0= 'errorln' ) ) ) ( (lv_msg_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )*
            {
            // InternalThingML.g:5434:3: (otherlv_0= 'error' | ( (lv_line_1_0= 'errorln' ) ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==84) ) {
                alt120=1;
            }
            else if ( (LA120_0==85) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalThingML.g:5435:4: otherlv_0= 'error'
                    {
                    otherlv_0=(Token)match(input,84,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getErrorActionAccess().getErrorKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:5440:4: ( (lv_line_1_0= 'errorln' ) )
                    {
                    // InternalThingML.g:5440:4: ( (lv_line_1_0= 'errorln' ) )
                    // InternalThingML.g:5441:5: (lv_line_1_0= 'errorln' )
                    {
                    // InternalThingML.g:5441:5: (lv_line_1_0= 'errorln' )
                    // InternalThingML.g:5442:6: lv_line_1_0= 'errorln'
                    {
                    lv_line_1_0=(Token)match(input,85,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_line_1_0, grammarAccess.getErrorActionAccess().getLineErrorlnKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getErrorActionRule());
                      						}
                      						setWithLastConsumed(current, "line", true, "errorln");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThingML.g:5455:3: ( (lv_msg_2_0= ruleExpression ) )
            // InternalThingML.g:5456:4: (lv_msg_2_0= ruleExpression )
            {
            // InternalThingML.g:5456:4: (lv_msg_2_0= ruleExpression )
            // InternalThingML.g:5457:5: lv_msg_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_78);
            lv_msg_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getErrorActionRule());
              					}
              					add(
              						current,
              						"msg",
              						lv_msg_2_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:5474:3: (otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) ) )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==35) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // InternalThingML.g:5475:4: otherlv_3= ',' ( (lv_msg_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getErrorActionAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalThingML.g:5479:4: ( (lv_msg_4_0= ruleExpression ) )
            	    // InternalThingML.g:5480:5: (lv_msg_4_0= ruleExpression )
            	    {
            	    // InternalThingML.g:5480:5: (lv_msg_4_0= ruleExpression )
            	    // InternalThingML.g:5481:6: lv_msg_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_78);
            	    lv_msg_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getErrorActionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"msg",
            	      							lv_msg_4_0,
            	      							"org.thingml.xtext.ThingML.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleErrorAction"


    // $ANTLR start "entryRuleStartSession"
    // InternalThingML.g:5503:1: entryRuleStartSession returns [EObject current=null] : iv_ruleStartSession= ruleStartSession EOF ;
    public final EObject entryRuleStartSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartSession = null;


        try {
            // InternalThingML.g:5503:53: (iv_ruleStartSession= ruleStartSession EOF )
            // InternalThingML.g:5504:2: iv_ruleStartSession= ruleStartSession EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStartSessionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStartSession=ruleStartSession();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStartSession; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStartSession"


    // $ANTLR start "ruleStartSession"
    // InternalThingML.g:5510:1: ruleStartSession returns [EObject current=null] : (otherlv_0= 'fork' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleStartSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalThingML.g:5516:2: ( (otherlv_0= 'fork' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalThingML.g:5517:2: (otherlv_0= 'fork' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalThingML.g:5517:2: (otherlv_0= 'fork' ( (otherlv_1= RULE_ID ) ) )
            // InternalThingML.g:5518:3: otherlv_0= 'fork' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,86,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStartSessionAccess().getForkKeyword_0());
              		
            }
            // InternalThingML.g:5522:3: ( (otherlv_1= RULE_ID ) )
            // InternalThingML.g:5523:4: (otherlv_1= RULE_ID )
            {
            // InternalThingML.g:5523:4: (otherlv_1= RULE_ID )
            // InternalThingML.g:5524:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStartSessionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getStartSessionAccess().getSessionSessionCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStartSession"


    // $ANTLR start "entryRuleFunctionCallStatement"
    // InternalThingML.g:5539:1: entryRuleFunctionCallStatement returns [EObject current=null] : iv_ruleFunctionCallStatement= ruleFunctionCallStatement EOF ;
    public final EObject entryRuleFunctionCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallStatement = null;


        try {
            // InternalThingML.g:5539:62: (iv_ruleFunctionCallStatement= ruleFunctionCallStatement EOF )
            // InternalThingML.g:5540:2: iv_ruleFunctionCallStatement= ruleFunctionCallStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallStatement=ruleFunctionCallStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCallStatement"


    // $ANTLR start "ruleFunctionCallStatement"
    // InternalThingML.g:5546:1: ruleFunctionCallStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5552:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalThingML.g:5553:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalThingML.g:5553:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalThingML.g:5554:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalThingML.g:5554:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:5555:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:5555:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:5556:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallStatementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallStatementAccess().getFunctionFunctionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalThingML.g:5571:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=RULE_STRING && LA123_0<=RULE_ID)||(LA123_0>=RULE_EXTERN && LA123_0<=RULE_FLOAT)||LA123_0==29||LA123_0==39||LA123_0==94||(LA123_0>=98 && LA123_0<=100)) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalThingML.g:5572:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalThingML.g:5572:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalThingML.g:5573:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalThingML.g:5573:5: (lv_parameters_2_0= ruleExpression )
                    // InternalThingML.g:5574:6: lv_parameters_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_parameters_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallStatementRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalThingML.g:5591:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==35) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalThingML.g:5592:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallStatementAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalThingML.g:5596:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalThingML.g:5597:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalThingML.g:5597:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalThingML.g:5598:7: lv_parameters_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameters_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallStatementRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"org.thingml.xtext.ThingML.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionCallStatementAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionCallStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalThingML.g:5625:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalThingML.g:5625:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalThingML.g:5626:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalThingML.g:5632:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5638:2: (this_OrExpression_0= ruleOrExpression )
            // InternalThingML.g:5639:2: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalThingML.g:5650:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalThingML.g:5650:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalThingML.g:5651:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalThingML.g:5657:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5663:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleAndExpression ) ) )* ) )
            // InternalThingML.g:5664:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleAndExpression ) ) )* )
            {
            // InternalThingML.g:5664:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleAndExpression ) ) )* )
            // InternalThingML.g:5665:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_79);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:5673:3: ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleAndExpression ) ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==87) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalThingML.g:5674:4: () otherlv_2= 'or' ( (lv_rhs_3_0= ruleAndExpression ) )
            	    {
            	    // InternalThingML.g:5674:4: ()
            	    // InternalThingML.g:5675:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,87,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    // InternalThingML.g:5685:4: ( (lv_rhs_3_0= ruleAndExpression ) )
            	    // InternalThingML.g:5686:5: (lv_rhs_3_0= ruleAndExpression )
            	    {
            	    // InternalThingML.g:5686:5: (lv_rhs_3_0= ruleAndExpression )
            	    // InternalThingML.g:5687:6: lv_rhs_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_79);
            	    lv_rhs_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"org.thingml.xtext.ThingML.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalThingML.g:5709:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalThingML.g:5709:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalThingML.g:5710:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalThingML.g:5716:1: ruleAndExpression returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5722:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleEquality ) ) )* ) )
            // InternalThingML.g:5723:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            {
            // InternalThingML.g:5723:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            // InternalThingML.g:5724:3: this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_80);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:5732:3: ( () otherlv_2= 'and' ( (lv_rhs_3_0= ruleEquality ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==88) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalThingML.g:5733:4: () otherlv_2= 'and' ( (lv_rhs_3_0= ruleEquality ) )
            	    {
            	    // InternalThingML.g:5733:4: ()
            	    // InternalThingML.g:5734:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,88,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    // InternalThingML.g:5744:4: ( (lv_rhs_3_0= ruleEquality ) )
            	    // InternalThingML.g:5745:5: (lv_rhs_3_0= ruleEquality )
            	    {
            	    // InternalThingML.g:5745:5: (lv_rhs_3_0= ruleEquality )
            	    // InternalThingML.g:5746:6: lv_rhs_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_80);
            	    lv_rhs_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"org.thingml.xtext.ThingML.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEquality"
    // InternalThingML.g:5768:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalThingML.g:5768:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalThingML.g:5769:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalThingML.g:5775:1: ruleEquality returns [EObject current=null] : (this_Comparaison_0= ruleComparaison ( ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) ) | ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparaison_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_rhs_6_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5781:2: ( (this_Comparaison_0= ruleComparaison ( ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) ) | ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) ) )* ) )
            // InternalThingML.g:5782:2: (this_Comparaison_0= ruleComparaison ( ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) ) | ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) ) )* )
            {
            // InternalThingML.g:5782:2: (this_Comparaison_0= ruleComparaison ( ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) ) | ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) ) )* )
            // InternalThingML.g:5783:3: this_Comparaison_0= ruleComparaison ( ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) ) | ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparaisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_81);
            this_Comparaison_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparaison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:5791:3: ( ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) ) | ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) ) )*
            loop126:
            do {
                int alt126=3;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==89) ) {
                    alt126=1;
                }
                else if ( (LA126_0==90) ) {
                    alt126=2;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalThingML.g:5792:4: ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) )
            	    {
            	    // InternalThingML.g:5792:4: ( () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) ) )
            	    // InternalThingML.g:5793:5: () otherlv_2= '==' ( (lv_rhs_3_0= ruleComparaison ) )
            	    {
            	    // InternalThingML.g:5793:5: ()
            	    // InternalThingML.g:5794:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualityAccess().getEqualsExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,89,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalThingML.g:5804:5: ( (lv_rhs_3_0= ruleComparaison ) )
            	    // InternalThingML.g:5805:6: (lv_rhs_3_0= ruleComparaison )
            	    {
            	    // InternalThingML.g:5805:6: (lv_rhs_3_0= ruleComparaison )
            	    // InternalThingML.g:5806:7: lv_rhs_3_0= ruleComparaison
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_81);
            	    lv_rhs_3_0=ruleComparaison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.thingml.xtext.ThingML.Comparaison");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:5825:4: ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) )
            	    {
            	    // InternalThingML.g:5825:4: ( () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) ) )
            	    // InternalThingML.g:5826:5: () otherlv_5= '!=' ( (lv_rhs_6_0= ruleComparaison ) )
            	    {
            	    // InternalThingML.g:5826:5: ()
            	    // InternalThingML.g:5827:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualityAccess().getNotEqualsExpressionLhsAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,90,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	      				
            	    }
            	    // InternalThingML.g:5837:5: ( (lv_rhs_6_0= ruleComparaison ) )
            	    // InternalThingML.g:5838:6: (lv_rhs_6_0= ruleComparaison )
            	    {
            	    // InternalThingML.g:5838:6: (lv_rhs_6_0= ruleComparaison )
            	    // InternalThingML.g:5839:7: lv_rhs_6_0= ruleComparaison
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_81);
            	    lv_rhs_6_0=ruleComparaison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_6_0,
            	      								"org.thingml.xtext.ThingML.Comparaison");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparaison"
    // InternalThingML.g:5862:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalThingML.g:5862:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalThingML.g:5863:2: iv_ruleComparaison= ruleComparaison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparaisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparaison=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparaison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparaison"


    // $ANTLR start "ruleComparaison"
    // InternalThingML.g:5869:1: ruleComparaison returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) ) | ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) ) | ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) ) | ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) ) )* ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_Addition_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_rhs_6_0 = null;

        EObject lv_rhs_9_0 = null;

        EObject lv_rhs_12_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:5875:2: ( (this_Addition_0= ruleAddition ( ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) ) | ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) ) | ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) ) | ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) ) )* ) )
            // InternalThingML.g:5876:2: (this_Addition_0= ruleAddition ( ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) ) | ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) ) | ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) ) | ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) ) )* )
            {
            // InternalThingML.g:5876:2: (this_Addition_0= ruleAddition ( ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) ) | ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) ) | ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) ) | ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) ) )* )
            // InternalThingML.g:5877:3: this_Addition_0= ruleAddition ( ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) ) | ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) ) | ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) ) | ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparaisonAccess().getAdditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_82);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Addition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:5885:3: ( ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) ) | ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) ) | ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) ) | ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) ) )*
            loop127:
            do {
                int alt127=5;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt127=1;
                    }
                    break;
                case 23:
                    {
                    alt127=2;
                    }
                    break;
                case 91:
                    {
                    alt127=3;
                    }
                    break;
                case 92:
                    {
                    alt127=4;
                    }
                    break;

                }

                switch (alt127) {
            	case 1 :
            	    // InternalThingML.g:5886:4: ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) )
            	    {
            	    // InternalThingML.g:5886:4: ( () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) ) )
            	    // InternalThingML.g:5887:5: () otherlv_2= '>' ( (lv_rhs_3_0= ruleAddition ) )
            	    {
            	    // InternalThingML.g:5887:5: ()
            	    // InternalThingML.g:5888:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparaisonAccess().getGreaterExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getComparaisonAccess().getGreaterThanSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalThingML.g:5898:5: ( (lv_rhs_3_0= ruleAddition ) )
            	    // InternalThingML.g:5899:6: (lv_rhs_3_0= ruleAddition )
            	    {
            	    // InternalThingML.g:5899:6: (lv_rhs_3_0= ruleAddition )
            	    // InternalThingML.g:5900:7: lv_rhs_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_82);
            	    lv_rhs_3_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getComparaisonRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.thingml.xtext.ThingML.Addition");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:5919:4: ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) )
            	    {
            	    // InternalThingML.g:5919:4: ( () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) ) )
            	    // InternalThingML.g:5920:5: () otherlv_5= '<' ( (lv_rhs_6_0= ruleAddition ) )
            	    {
            	    // InternalThingML.g:5920:5: ()
            	    // InternalThingML.g:5921:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparaisonAccess().getLowerExpressionLhsAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getComparaisonAccess().getLessThanSignKeyword_1_1_1());
            	      				
            	    }
            	    // InternalThingML.g:5931:5: ( (lv_rhs_6_0= ruleAddition ) )
            	    // InternalThingML.g:5932:6: (lv_rhs_6_0= ruleAddition )
            	    {
            	    // InternalThingML.g:5932:6: (lv_rhs_6_0= ruleAddition )
            	    // InternalThingML.g:5933:7: lv_rhs_6_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_82);
            	    lv_rhs_6_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getComparaisonRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_6_0,
            	      								"org.thingml.xtext.ThingML.Addition");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalThingML.g:5952:4: ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) )
            	    {
            	    // InternalThingML.g:5952:4: ( () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) ) )
            	    // InternalThingML.g:5953:5: () otherlv_8= '>=' ( (lv_rhs_9_0= ruleAddition ) )
            	    {
            	    // InternalThingML.g:5953:5: ()
            	    // InternalThingML.g:5954:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparaisonAccess().getGreaterOrEqualExpressionLhsAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,91,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getComparaisonAccess().getGreaterThanSignEqualsSignKeyword_1_2_1());
            	      				
            	    }
            	    // InternalThingML.g:5964:5: ( (lv_rhs_9_0= ruleAddition ) )
            	    // InternalThingML.g:5965:6: (lv_rhs_9_0= ruleAddition )
            	    {
            	    // InternalThingML.g:5965:6: (lv_rhs_9_0= ruleAddition )
            	    // InternalThingML.g:5966:7: lv_rhs_9_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_82);
            	    lv_rhs_9_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getComparaisonRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_9_0,
            	      								"org.thingml.xtext.ThingML.Addition");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalThingML.g:5985:4: ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) )
            	    {
            	    // InternalThingML.g:5985:4: ( () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) ) )
            	    // InternalThingML.g:5986:5: () otherlv_11= '<=' ( (lv_rhs_12_0= ruleAddition ) )
            	    {
            	    // InternalThingML.g:5986:5: ()
            	    // InternalThingML.g:5987:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparaisonAccess().getLowerOrEqualExpressionLhsAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,92,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getComparaisonAccess().getLessThanSignEqualsSignKeyword_1_3_1());
            	      				
            	    }
            	    // InternalThingML.g:5997:5: ( (lv_rhs_12_0= ruleAddition ) )
            	    // InternalThingML.g:5998:6: (lv_rhs_12_0= ruleAddition )
            	    {
            	    // InternalThingML.g:5998:6: (lv_rhs_12_0= ruleAddition )
            	    // InternalThingML.g:5999:7: lv_rhs_12_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_3_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_82);
            	    lv_rhs_12_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getComparaisonRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_12_0,
            	      								"org.thingml.xtext.ThingML.Addition");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparaison"


    // $ANTLR start "entryRuleAddition"
    // InternalThingML.g:6022:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalThingML.g:6022:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalThingML.g:6023:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalThingML.g:6029:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) ) | ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Multiplication_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_rhs_6_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:6035:2: ( (this_Multiplication_0= ruleMultiplication ( ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) ) | ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) ) )* ) )
            // InternalThingML.g:6036:2: (this_Multiplication_0= ruleMultiplication ( ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) ) | ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) ) )* )
            {
            // InternalThingML.g:6036:2: (this_Multiplication_0= ruleMultiplication ( ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) ) | ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) ) )* )
            // InternalThingML.g:6037:3: this_Multiplication_0= ruleMultiplication ( ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) ) | ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_83);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:6045:3: ( ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) ) | ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) ) )*
            loop128:
            do {
                int alt128=3;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==93) ) {
                    alt128=1;
                }
                else if ( (LA128_0==94) ) {
                    alt128=2;
                }


                switch (alt128) {
            	case 1 :
            	    // InternalThingML.g:6046:4: ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) )
            	    {
            	    // InternalThingML.g:6046:4: ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) ) )
            	    // InternalThingML.g:6047:5: () otherlv_2= '+' ( (lv_rhs_3_0= ruleMultiplication ) )
            	    {
            	    // InternalThingML.g:6047:5: ()
            	    // InternalThingML.g:6048:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAdditionAccess().getPlusExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,93,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalThingML.g:6058:5: ( (lv_rhs_3_0= ruleMultiplication ) )
            	    // InternalThingML.g:6059:6: (lv_rhs_3_0= ruleMultiplication )
            	    {
            	    // InternalThingML.g:6059:6: (lv_rhs_3_0= ruleMultiplication )
            	    // InternalThingML.g:6060:7: lv_rhs_3_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_83);
            	    lv_rhs_3_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.thingml.xtext.ThingML.Multiplication");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:6079:4: ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) )
            	    {
            	    // InternalThingML.g:6079:4: ( () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) ) )
            	    // InternalThingML.g:6080:5: () otherlv_5= '-' ( (lv_rhs_6_0= ruleMultiplication ) )
            	    {
            	    // InternalThingML.g:6080:5: ()
            	    // InternalThingML.g:6081:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAdditionAccess().getMinusExpressionLhsAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,94,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalThingML.g:6091:5: ( (lv_rhs_6_0= ruleMultiplication ) )
            	    // InternalThingML.g:6092:6: (lv_rhs_6_0= ruleMultiplication )
            	    {
            	    // InternalThingML.g:6092:6: (lv_rhs_6_0= ruleMultiplication )
            	    // InternalThingML.g:6093:7: lv_rhs_6_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_83);
            	    lv_rhs_6_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_6_0,
            	      								"org.thingml.xtext.ThingML.Multiplication");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalThingML.g:6116:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalThingML.g:6116:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalThingML.g:6117:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalThingML.g:6123:1: ruleMultiplication returns [EObject current=null] : (this_CastExpression_0= ruleCastExpression ( ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) ) | ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) ) | ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_CastExpression_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_rhs_6_0 = null;

        EObject lv_rhs_9_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:6129:2: ( (this_CastExpression_0= ruleCastExpression ( ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) ) | ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) ) | ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) ) )* ) )
            // InternalThingML.g:6130:2: (this_CastExpression_0= ruleCastExpression ( ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) ) | ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) ) | ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) ) )* )
            {
            // InternalThingML.g:6130:2: (this_CastExpression_0= ruleCastExpression ( ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) ) | ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) ) | ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) ) )* )
            // InternalThingML.g:6131:3: this_CastExpression_0= ruleCastExpression ( ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) ) | ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) ) | ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getCastExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_84);
            this_CastExpression_0=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CastExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:6139:3: ( ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) ) | ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) ) | ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) ) )*
            loop129:
            do {
                int alt129=4;
                switch ( input.LA(1) ) {
                case 95:
                    {
                    alt129=1;
                    }
                    break;
                case 96:
                    {
                    alt129=2;
                    }
                    break;
                case 97:
                    {
                    alt129=3;
                    }
                    break;

                }

                switch (alt129) {
            	case 1 :
            	    // InternalThingML.g:6140:4: ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) )
            	    {
            	    // InternalThingML.g:6140:4: ( () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) ) )
            	    // InternalThingML.g:6141:5: () otherlv_2= '*' ( (lv_rhs_3_0= ruleCastExpression ) )
            	    {
            	    // InternalThingML.g:6141:5: ()
            	    // InternalThingML.g:6142:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMultiplicationAccess().getTimesExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,95,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_1());
            	      				
            	    }
            	    // InternalThingML.g:6152:5: ( (lv_rhs_3_0= ruleCastExpression ) )
            	    // InternalThingML.g:6153:6: (lv_rhs_3_0= ruleCastExpression )
            	    {
            	    // InternalThingML.g:6153:6: (lv_rhs_3_0= ruleCastExpression )
            	    // InternalThingML.g:6154:7: lv_rhs_3_0= ruleCastExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_84);
            	    lv_rhs_3_0=ruleCastExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.thingml.xtext.ThingML.CastExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:6173:4: ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) )
            	    {
            	    // InternalThingML.g:6173:4: ( () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) ) )
            	    // InternalThingML.g:6174:5: () otherlv_5= '/' ( (lv_rhs_6_0= ruleCastExpression ) )
            	    {
            	    // InternalThingML.g:6174:5: ()
            	    // InternalThingML.g:6175:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMultiplicationAccess().getDivExpressionLhsAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,96,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalThingML.g:6185:5: ( (lv_rhs_6_0= ruleCastExpression ) )
            	    // InternalThingML.g:6186:6: (lv_rhs_6_0= ruleCastExpression )
            	    {
            	    // InternalThingML.g:6186:6: (lv_rhs_6_0= ruleCastExpression )
            	    // InternalThingML.g:6187:7: lv_rhs_6_0= ruleCastExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_84);
            	    lv_rhs_6_0=ruleCastExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_6_0,
            	      								"org.thingml.xtext.ThingML.CastExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalThingML.g:6206:4: ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) )
            	    {
            	    // InternalThingML.g:6206:4: ( () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) ) )
            	    // InternalThingML.g:6207:5: () otherlv_8= '%' ( (lv_rhs_9_0= ruleCastExpression ) )
            	    {
            	    // InternalThingML.g:6207:5: ()
            	    // InternalThingML.g:6208:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMultiplicationAccess().getModExpressionLhsAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,97,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_2_1());
            	      				
            	    }
            	    // InternalThingML.g:6218:5: ( (lv_rhs_9_0= ruleCastExpression ) )
            	    // InternalThingML.g:6219:6: (lv_rhs_9_0= ruleCastExpression )
            	    {
            	    // InternalThingML.g:6219:6: (lv_rhs_9_0= ruleCastExpression )
            	    // InternalThingML.g:6220:7: lv_rhs_9_0= ruleCastExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_84);
            	    lv_rhs_9_0=ruleCastExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_9_0,
            	      								"org.thingml.xtext.ThingML.CastExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleCastExpression"
    // InternalThingML.g:6243:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // InternalThingML.g:6243:55: (iv_ruleCastExpression= ruleCastExpression EOF )
            // InternalThingML.g:6244:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCastExpression=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCastExpression"


    // $ANTLR start "ruleCastExpression"
    // InternalThingML.g:6250:1: ruleCastExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )? )? ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_isArray_4_0=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:6256:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )? )? ) )
            // InternalThingML.g:6257:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )? )? )
            {
            // InternalThingML.g:6257:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )? )? )
            // InternalThingML.g:6258:3: this_Primary_0= rulePrimary ( () otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )? )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCastExpressionAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_85);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:6266:3: ( () otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )? )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==28) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalThingML.g:6267:4: () otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )?
                    {
                    // InternalThingML.g:6267:4: ()
                    // InternalThingML.g:6268:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getCastExpressionAccess().getCastExpressionTermAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getAsKeyword_1_1());
                      			
                    }
                    // InternalThingML.g:6278:4: ( (otherlv_3= RULE_ID ) )
                    // InternalThingML.g:6279:5: (otherlv_3= RULE_ID )
                    {
                    // InternalThingML.g:6279:5: (otherlv_3= RULE_ID )
                    // InternalThingML.g:6280:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCastExpressionRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getCastExpressionAccess().getTypeTypeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalThingML.g:6291:4: ( ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']' )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==20) ) {
                        int LA130_1 = input.LA(2);

                        if ( (LA130_1==21) ) {
                            alt130=1;
                        }
                    }
                    switch (alt130) {
                        case 1 :
                            // InternalThingML.g:6292:5: ( (lv_isArray_4_0= '[' ) ) otherlv_5= ']'
                            {
                            // InternalThingML.g:6292:5: ( (lv_isArray_4_0= '[' ) )
                            // InternalThingML.g:6293:6: (lv_isArray_4_0= '[' )
                            {
                            // InternalThingML.g:6293:6: (lv_isArray_4_0= '[' )
                            // InternalThingML.g:6294:7: lv_isArray_4_0= '['
                            {
                            lv_isArray_4_0=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_isArray_4_0, grammarAccess.getCastExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getCastExpressionRule());
                              							}
                              							setWithLastConsumed(current, "isArray", true, "[");
                              						
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getCastExpressionAccess().getRightSquareBracketKeyword_1_3_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCastExpression"


    // $ANTLR start "entryRulePrimary"
    // InternalThingML.g:6316:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalThingML.g:6316:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalThingML.g:6317:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalThingML.g:6323:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_term_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= 'not' ( (lv_term_6_0= rulePrimary ) ) ) | ( () otherlv_8= '-' ( (lv_term_9_0= rulePrimary ) ) ) | this_ArrayIndexPostfix_10= ruleArrayIndexPostfix ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_term_2_0 = null;

        EObject lv_term_6_0 = null;

        EObject lv_term_9_0 = null;

        EObject this_ArrayIndexPostfix_10 = null;



        	enterRule();

        try {
            // InternalThingML.g:6329:2: ( ( ( () otherlv_1= '(' ( (lv_term_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= 'not' ( (lv_term_6_0= rulePrimary ) ) ) | ( () otherlv_8= '-' ( (lv_term_9_0= rulePrimary ) ) ) | this_ArrayIndexPostfix_10= ruleArrayIndexPostfix ) )
            // InternalThingML.g:6330:2: ( ( () otherlv_1= '(' ( (lv_term_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= 'not' ( (lv_term_6_0= rulePrimary ) ) ) | ( () otherlv_8= '-' ( (lv_term_9_0= rulePrimary ) ) ) | this_ArrayIndexPostfix_10= ruleArrayIndexPostfix )
            {
            // InternalThingML.g:6330:2: ( ( () otherlv_1= '(' ( (lv_term_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= 'not' ( (lv_term_6_0= rulePrimary ) ) ) | ( () otherlv_8= '-' ( (lv_term_9_0= rulePrimary ) ) ) | this_ArrayIndexPostfix_10= ruleArrayIndexPostfix )
            int alt132=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt132=1;
                }
                break;
            case 98:
                {
                alt132=2;
                }
                break;
            case 94:
                {
                alt132=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_EXTERN:
            case RULE_INT:
            case RULE_BYTE:
            case RULE_CHAR:
            case RULE_FLOAT:
            case 29:
            case 99:
            case 100:
                {
                alt132=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalThingML.g:6331:3: ( () otherlv_1= '(' ( (lv_term_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalThingML.g:6331:3: ( () otherlv_1= '(' ( (lv_term_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalThingML.g:6332:4: () otherlv_1= '(' ( (lv_term_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    // InternalThingML.g:6332:4: ()
                    // InternalThingML.g:6333:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getExpressionGroupAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalThingML.g:6343:4: ( (lv_term_2_0= ruleExpression ) )
                    // InternalThingML.g:6344:5: (lv_term_2_0= ruleExpression )
                    {
                    // InternalThingML.g:6344:5: (lv_term_2_0= ruleExpression )
                    // InternalThingML.g:6345:6: lv_term_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getTermExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_75);
                    lv_term_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_2_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThingML.g:6368:3: ( () otherlv_5= 'not' ( (lv_term_6_0= rulePrimary ) ) )
                    {
                    // InternalThingML.g:6368:3: ( () otherlv_5= 'not' ( (lv_term_6_0= rulePrimary ) ) )
                    // InternalThingML.g:6369:4: () otherlv_5= 'not' ( (lv_term_6_0= rulePrimary ) )
                    {
                    // InternalThingML.g:6369:4: ()
                    // InternalThingML.g:6370:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,98,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
                      			
                    }
                    // InternalThingML.g:6380:4: ( (lv_term_6_0= rulePrimary ) )
                    // InternalThingML.g:6381:5: (lv_term_6_0= rulePrimary )
                    {
                    // InternalThingML.g:6381:5: (lv_term_6_0= rulePrimary )
                    // InternalThingML.g:6382:6: lv_term_6_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_term_6_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_6_0,
                      							"org.thingml.xtext.ThingML.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThingML.g:6401:3: ( () otherlv_8= '-' ( (lv_term_9_0= rulePrimary ) ) )
                    {
                    // InternalThingML.g:6401:3: ( () otherlv_8= '-' ( (lv_term_9_0= rulePrimary ) ) )
                    // InternalThingML.g:6402:4: () otherlv_8= '-' ( (lv_term_9_0= rulePrimary ) )
                    {
                    // InternalThingML.g:6402:4: ()
                    // InternalThingML.g:6403:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,94,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalThingML.g:6413:4: ( (lv_term_9_0= rulePrimary ) )
                    // InternalThingML.g:6414:5: (lv_term_9_0= rulePrimary )
                    {
                    // InternalThingML.g:6414:5: (lv_term_9_0= rulePrimary )
                    // InternalThingML.g:6415:6: lv_term_9_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_term_9_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_9_0,
                      							"org.thingml.xtext.ThingML.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThingML.g:6434:3: this_ArrayIndexPostfix_10= ruleArrayIndexPostfix
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getArrayIndexPostfixParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayIndexPostfix_10=ruleArrayIndexPostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayIndexPostfix_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleArrayIndexPostfix"
    // InternalThingML.g:6446:1: entryRuleArrayIndexPostfix returns [EObject current=null] : iv_ruleArrayIndexPostfix= ruleArrayIndexPostfix EOF ;
    public final EObject entryRuleArrayIndexPostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndexPostfix = null;


        try {
            // InternalThingML.g:6446:58: (iv_ruleArrayIndexPostfix= ruleArrayIndexPostfix EOF )
            // InternalThingML.g:6447:2: iv_ruleArrayIndexPostfix= ruleArrayIndexPostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayIndexPostfixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayIndexPostfix=ruleArrayIndexPostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayIndexPostfix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayIndexPostfix"


    // $ANTLR start "ruleArrayIndexPostfix"
    // InternalThingML.g:6453:1: ruleArrayIndexPostfix returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleArrayIndexPostfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AtomicExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:6459:2: ( (this_AtomicExpression_0= ruleAtomicExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ) )
            // InternalThingML.g:6460:2: (this_AtomicExpression_0= ruleAtomicExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            {
            // InternalThingML.g:6460:2: (this_AtomicExpression_0= ruleAtomicExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            // InternalThingML.g:6461:3: this_AtomicExpression_0= ruleAtomicExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayIndexPostfixAccess().getAtomicExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_AtomicExpression_0=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AtomicExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThingML.g:6469:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==20) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalThingML.g:6470:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    // InternalThingML.g:6470:4: ()
                    // InternalThingML.g:6471:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getArrayIndexPostfixAccess().getArrayIndexArrayAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayIndexPostfixAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    // InternalThingML.g:6481:4: ( (lv_index_3_0= ruleExpression ) )
                    // InternalThingML.g:6482:5: (lv_index_3_0= ruleExpression )
                    {
                    // InternalThingML.g:6482:5: (lv_index_3_0= ruleExpression )
                    // InternalThingML.g:6483:6: lv_index_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayIndexPostfixAccess().getIndexExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_index_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayIndexPostfixRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_3_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getArrayIndexPostfixAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayIndexPostfix"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalThingML.g:6509:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalThingML.g:6509:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalThingML.g:6510:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalThingML.g:6516:1: ruleAtomicExpression returns [EObject current=null] : (this_ExternExpression_0= ruleExternExpression | this_Literal_1= ruleLiteral | this_ArrayInit_2= ruleArrayInit | this_PropertyReference_3= rulePropertyReference | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_EventReference_5= ruleEventReference ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExternExpression_0 = null;

        EObject this_Literal_1 = null;

        EObject this_ArrayInit_2 = null;

        EObject this_PropertyReference_3 = null;

        EObject this_FunctionCallExpression_4 = null;

        EObject this_EventReference_5 = null;



        	enterRule();

        try {
            // InternalThingML.g:6522:2: ( (this_ExternExpression_0= ruleExternExpression | this_Literal_1= ruleLiteral | this_ArrayInit_2= ruleArrayInit | this_PropertyReference_3= rulePropertyReference | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_EventReference_5= ruleEventReference ) )
            // InternalThingML.g:6523:2: (this_ExternExpression_0= ruleExternExpression | this_Literal_1= ruleLiteral | this_ArrayInit_2= ruleArrayInit | this_PropertyReference_3= rulePropertyReference | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_EventReference_5= ruleEventReference )
            {
            // InternalThingML.g:6523:2: (this_ExternExpression_0= ruleExternExpression | this_Literal_1= ruleLiteral | this_ArrayInit_2= ruleArrayInit | this_PropertyReference_3= rulePropertyReference | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_EventReference_5= ruleEventReference )
            int alt134=6;
            switch ( input.LA(1) ) {
            case RULE_EXTERN:
                {
                alt134=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt134=5;
                    }
                    break;
                case 19:
                    {
                    alt134=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_ANNOTATION_ID:
                case RULE_EXTERN:
                case 18:
                case 20:
                case 21:
                case 23:
                case 24:
                case 28:
                case 30:
                case 35:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 50:
                case 51:
                case 52:
                case 53:
                case 56:
                case 60:
                case 61:
                case 65:
                case 66:
                case 67:
                case 68:
                case 70:
                case 71:
                case 72:
                case 76:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 103:
                case 104:
                    {
                    alt134=4;
                    }
                    break;
                case 101:
                    {
                    alt134=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 134, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BYTE:
            case RULE_CHAR:
            case RULE_FLOAT:
            case 99:
            case 100:
                {
                alt134=2;
                }
                break;
            case 29:
                {
                alt134=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // InternalThingML.g:6524:3: this_ExternExpression_0= ruleExternExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExternExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternExpression_0=ruleExternExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:6533:3: this_Literal_1= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:6542:3: this_ArrayInit_2= ruleArrayInit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getArrayInitParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayInit_2=ruleArrayInit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayInit_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThingML.g:6551:3: this_PropertyReference_3= rulePropertyReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getPropertyReferenceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyReference_3=rulePropertyReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyReference_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalThingML.g:6560:3: this_FunctionCallExpression_4= ruleFunctionCallExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCallExpression_4=ruleFunctionCallExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCallExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalThingML.g:6569:3: this_EventReference_5= ruleEventReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getEventReferenceParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EventReference_5=ruleEventReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EventReference_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleExternExpression"
    // InternalThingML.g:6581:1: entryRuleExternExpression returns [EObject current=null] : iv_ruleExternExpression= ruleExternExpression EOF ;
    public final EObject entryRuleExternExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternExpression = null;


        try {
            // InternalThingML.g:6581:57: (iv_ruleExternExpression= ruleExternExpression EOF )
            // InternalThingML.g:6582:2: iv_ruleExternExpression= ruleExternExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternExpression=ruleExternExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExternExpression"


    // $ANTLR start "ruleExternExpression"
    // InternalThingML.g:6588:1: ruleExternExpression returns [EObject current=null] : ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExternExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;
        Token otherlv_1=null;
        EObject lv_segments_2_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:6594:2: ( ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* ) )
            // InternalThingML.g:6595:2: ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* )
            {
            // InternalThingML.g:6595:2: ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* )
            // InternalThingML.g:6596:3: ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )*
            {
            // InternalThingML.g:6596:3: ( (lv_expression_0_0= RULE_EXTERN ) )
            // InternalThingML.g:6597:4: (lv_expression_0_0= RULE_EXTERN )
            {
            // InternalThingML.g:6597:4: (lv_expression_0_0= RULE_EXTERN )
            // InternalThingML.g:6598:5: lv_expression_0_0= RULE_EXTERN
            {
            lv_expression_0_0=(Token)match(input,RULE_EXTERN,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_expression_0_0, grammarAccess.getExternExpressionAccess().getExpressionEXTERNTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExternExpressionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"org.thingml.xtext.ThingML.EXTERN");
              				
            }

            }


            }

            // InternalThingML.g:6614:3: (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==72) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalThingML.g:6615:4: otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExternExpressionAccess().getAmpersandKeyword_1_0());
            	      			
            	    }
            	    // InternalThingML.g:6619:4: ( (lv_segments_2_0= ruleExpression ) )
            	    // InternalThingML.g:6620:5: (lv_segments_2_0= ruleExpression )
            	    {
            	    // InternalThingML.g:6620:5: (lv_segments_2_0= ruleExpression )
            	    // InternalThingML.g:6621:6: lv_segments_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExternExpressionAccess().getSegmentsExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_segments_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExternExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"segments",
            	      							lv_segments_2_0,
            	      							"org.thingml.xtext.ThingML.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExternExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalThingML.g:6643:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalThingML.g:6643:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalThingML.g:6644:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalThingML.g:6650:1: ruleLiteral returns [EObject current=null] : (this_EnumLiteralRef_0= ruleEnumLiteralRef | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_EnumLiteralRef_0 = null;

        EObject this_ByteLiteral_1 = null;

        EObject this_CharLiteral_2 = null;

        EObject this_IntegerLiteral_3 = null;

        EObject this_BooleanLiteral_4 = null;

        EObject this_StringLiteral_5 = null;

        EObject this_DoubleLiteral_6 = null;



        	enterRule();

        try {
            // InternalThingML.g:6656:2: ( (this_EnumLiteralRef_0= ruleEnumLiteralRef | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral ) )
            // InternalThingML.g:6657:2: (this_EnumLiteralRef_0= ruleEnumLiteralRef | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral )
            {
            // InternalThingML.g:6657:2: (this_EnumLiteralRef_0= ruleEnumLiteralRef | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral )
            int alt136=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt136=1;
                }
                break;
            case RULE_BYTE:
                {
                alt136=2;
                }
                break;
            case RULE_CHAR:
                {
                alt136=3;
                }
                break;
            case RULE_INT:
                {
                alt136=4;
                }
                break;
            case 99:
            case 100:
                {
                alt136=5;
                }
                break;
            case RULE_STRING:
                {
                alt136=6;
                }
                break;
            case RULE_FLOAT:
                {
                alt136=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // InternalThingML.g:6658:3: this_EnumLiteralRef_0= ruleEnumLiteralRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getEnumLiteralRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumLiteralRef_0=ruleEnumLiteralRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumLiteralRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:6667:3: this_ByteLiteral_1= ruleByteLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getByteLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ByteLiteral_1=ruleByteLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ByteLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThingML.g:6676:3: this_CharLiteral_2= ruleCharLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CharLiteral_2=ruleCharLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CharLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThingML.g:6685:3: this_IntegerLiteral_3= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_3=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalThingML.g:6694:3: this_BooleanLiteral_4= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalThingML.g:6703:3: this_StringLiteral_5= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_5=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalThingML.g:6712:3: this_DoubleLiteral_6= ruleDoubleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getDoubleLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DoubleLiteral_6=ruleDoubleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DoubleLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayInit"
    // InternalThingML.g:6724:1: entryRuleArrayInit returns [EObject current=null] : iv_ruleArrayInit= ruleArrayInit EOF ;
    public final EObject entryRuleArrayInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInit = null;


        try {
            // InternalThingML.g:6724:50: (iv_ruleArrayInit= ruleArrayInit EOF )
            // InternalThingML.g:6725:2: iv_ruleArrayInit= ruleArrayInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayInitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayInit=ruleArrayInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayInit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayInit"


    // $ANTLR start "ruleArrayInit"
    // InternalThingML.g:6731:1: ruleArrayInit returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:6737:2: ( (otherlv_0= '{' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= '}' ) )
            // InternalThingML.g:6738:2: (otherlv_0= '{' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= '}' )
            {
            // InternalThingML.g:6738:2: (otherlv_0= '{' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= '}' )
            // InternalThingML.g:6739:3: otherlv_0= '{' ( (lv_values_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayInitAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalThingML.g:6743:3: ( (lv_values_1_0= ruleExpression ) )
            // InternalThingML.g:6744:4: (lv_values_1_0= ruleExpression )
            {
            // InternalThingML.g:6744:4: (lv_values_1_0= ruleExpression )
            // InternalThingML.g:6745:5: lv_values_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_86);
            lv_values_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayInitRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_1_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:6762:3: (otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) ) )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==35) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // InternalThingML.g:6763:4: otherlv_2= ',' ( (lv_values_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getArrayInitAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalThingML.g:6767:4: ( (lv_values_3_0= ruleExpression ) )
            	    // InternalThingML.g:6768:5: (lv_values_3_0= ruleExpression )
            	    {
            	    // InternalThingML.g:6768:5: (lv_values_3_0= ruleExpression )
            	    // InternalThingML.g:6769:6: lv_values_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_86);
            	    lv_values_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArrayInitRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_3_0,
            	      							"org.thingml.xtext.ThingML.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArrayInitAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayInit"


    // $ANTLR start "entryRuleEnumLiteralRef"
    // InternalThingML.g:6795:1: entryRuleEnumLiteralRef returns [EObject current=null] : iv_ruleEnumLiteralRef= ruleEnumLiteralRef EOF ;
    public final EObject entryRuleEnumLiteralRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralRef = null;


        try {
            // InternalThingML.g:6795:55: (iv_ruleEnumLiteralRef= ruleEnumLiteralRef EOF )
            // InternalThingML.g:6796:2: iv_ruleEnumLiteralRef= ruleEnumLiteralRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumLiteralRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteralRef=ruleEnumLiteralRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumLiteralRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumLiteralRef"


    // $ANTLR start "ruleEnumLiteralRef"
    // InternalThingML.g:6802:1: ruleEnumLiteralRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteralRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalThingML.g:6808:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalThingML.g:6809:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalThingML.g:6809:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalThingML.g:6810:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalThingML.g:6810:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:6811:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:6811:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:6812:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumLiteralRefRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralRefAccess().getColonKeyword_1());
              		
            }
            // InternalThingML.g:6827:3: ( (otherlv_2= RULE_ID ) )
            // InternalThingML.g:6828:4: (otherlv_2= RULE_ID )
            {
            // InternalThingML.g:6828:4: (otherlv_2= RULE_ID )
            // InternalThingML.g:6829:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumLiteralRefRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralCrossReference_2_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumLiteralRef"


    // $ANTLR start "entryRuleByteLiteral"
    // InternalThingML.g:6844:1: entryRuleByteLiteral returns [EObject current=null] : iv_ruleByteLiteral= ruleByteLiteral EOF ;
    public final EObject entryRuleByteLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByteLiteral = null;


        try {
            // InternalThingML.g:6844:52: (iv_ruleByteLiteral= ruleByteLiteral EOF )
            // InternalThingML.g:6845:2: iv_ruleByteLiteral= ruleByteLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByteLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleByteLiteral=ruleByteLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleByteLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleByteLiteral"


    // $ANTLR start "ruleByteLiteral"
    // InternalThingML.g:6851:1: ruleByteLiteral returns [EObject current=null] : ( (lv_byteValue_0_0= RULE_BYTE ) ) ;
    public final EObject ruleByteLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_byteValue_0_0=null;


        	enterRule();

        try {
            // InternalThingML.g:6857:2: ( ( (lv_byteValue_0_0= RULE_BYTE ) ) )
            // InternalThingML.g:6858:2: ( (lv_byteValue_0_0= RULE_BYTE ) )
            {
            // InternalThingML.g:6858:2: ( (lv_byteValue_0_0= RULE_BYTE ) )
            // InternalThingML.g:6859:3: (lv_byteValue_0_0= RULE_BYTE )
            {
            // InternalThingML.g:6859:3: (lv_byteValue_0_0= RULE_BYTE )
            // InternalThingML.g:6860:4: lv_byteValue_0_0= RULE_BYTE
            {
            lv_byteValue_0_0=(Token)match(input,RULE_BYTE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_byteValue_0_0, grammarAccess.getByteLiteralAccess().getByteValueBYTETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getByteLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"byteValue",
              					lv_byteValue_0_0,
              					"org.thingml.xtext.ThingML.BYTE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleByteLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalThingML.g:6879:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // InternalThingML.g:6879:52: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // InternalThingML.g:6880:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalThingML.g:6886:1: ruleCharLiteral returns [EObject current=null] : ( (lv_charValue_0_0= RULE_CHAR ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_charValue_0_0=null;


        	enterRule();

        try {
            // InternalThingML.g:6892:2: ( ( (lv_charValue_0_0= RULE_CHAR ) ) )
            // InternalThingML.g:6893:2: ( (lv_charValue_0_0= RULE_CHAR ) )
            {
            // InternalThingML.g:6893:2: ( (lv_charValue_0_0= RULE_CHAR ) )
            // InternalThingML.g:6894:3: (lv_charValue_0_0= RULE_CHAR )
            {
            // InternalThingML.g:6894:3: (lv_charValue_0_0= RULE_CHAR )
            // InternalThingML.g:6895:4: lv_charValue_0_0= RULE_CHAR
            {
            lv_charValue_0_0=(Token)match(input,RULE_CHAR,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_charValue_0_0, grammarAccess.getCharLiteralAccess().getCharValueCHARTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getCharLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"charValue",
              					lv_charValue_0_0,
              					"org.thingml.xtext.ThingML.CHAR");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalThingML.g:6914:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalThingML.g:6914:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalThingML.g:6915:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalThingML.g:6921:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_intValue_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;


        	enterRule();

        try {
            // InternalThingML.g:6927:2: ( ( (lv_intValue_0_0= RULE_INT ) ) )
            // InternalThingML.g:6928:2: ( (lv_intValue_0_0= RULE_INT ) )
            {
            // InternalThingML.g:6928:2: ( (lv_intValue_0_0= RULE_INT ) )
            // InternalThingML.g:6929:3: (lv_intValue_0_0= RULE_INT )
            {
            // InternalThingML.g:6929:3: (lv_intValue_0_0= RULE_INT )
            // InternalThingML.g:6930:4: lv_intValue_0_0= RULE_INT
            {
            lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_intValue_0_0, grammarAccess.getIntegerLiteralAccess().getIntValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntegerLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"intValue",
              					lv_intValue_0_0,
              					"org.thingml.xtext.ThingML.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalThingML.g:6949:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalThingML.g:6949:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalThingML.g:6950:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalThingML.g:6956:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_boolValue_0_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalThingML.g:6962:2: ( ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) )
            // InternalThingML.g:6963:2: ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            {
            // InternalThingML.g:6963:2: ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==99) ) {
                alt138=1;
            }
            else if ( (LA138_0==100) ) {
                alt138=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // InternalThingML.g:6964:3: ( (lv_boolValue_0_0= 'true' ) )
                    {
                    // InternalThingML.g:6964:3: ( (lv_boolValue_0_0= 'true' ) )
                    // InternalThingML.g:6965:4: (lv_boolValue_0_0= 'true' )
                    {
                    // InternalThingML.g:6965:4: (lv_boolValue_0_0= 'true' )
                    // InternalThingML.g:6966:5: lv_boolValue_0_0= 'true'
                    {
                    lv_boolValue_0_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolValue_0_0, grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      					}
                      					setWithLastConsumed(current, "boolValue", true, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThingML.g:6979:3: ( () otherlv_2= 'false' )
                    {
                    // InternalThingML.g:6979:3: ( () otherlv_2= 'false' )
                    // InternalThingML.g:6980:4: () otherlv_2= 'false'
                    {
                    // InternalThingML.g:6980:4: ()
                    // InternalThingML.g:6981:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalThingML.g:6996:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalThingML.g:6996:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalThingML.g:6997:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalThingML.g:7003:1: ruleStringLiteral returns [EObject current=null] : ( (lv_stringValue_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;


        	enterRule();

        try {
            // InternalThingML.g:7009:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) )
            // InternalThingML.g:7010:2: ( (lv_stringValue_0_0= RULE_STRING ) )
            {
            // InternalThingML.g:7010:2: ( (lv_stringValue_0_0= RULE_STRING ) )
            // InternalThingML.g:7011:3: (lv_stringValue_0_0= RULE_STRING )
            {
            // InternalThingML.g:7011:3: (lv_stringValue_0_0= RULE_STRING )
            // InternalThingML.g:7012:4: lv_stringValue_0_0= RULE_STRING
            {
            lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_stringValue_0_0, grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"stringValue",
              					lv_stringValue_0_0,
              					"org.thingml.xtext.ThingML.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalThingML.g:7031:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // InternalThingML.g:7031:54: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // InternalThingML.g:7032:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalThingML.g:7038:1: ruleDoubleLiteral returns [EObject current=null] : ( (lv_doubleValue_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_doubleValue_0_0=null;


        	enterRule();

        try {
            // InternalThingML.g:7044:2: ( ( (lv_doubleValue_0_0= RULE_FLOAT ) ) )
            // InternalThingML.g:7045:2: ( (lv_doubleValue_0_0= RULE_FLOAT ) )
            {
            // InternalThingML.g:7045:2: ( (lv_doubleValue_0_0= RULE_FLOAT ) )
            // InternalThingML.g:7046:3: (lv_doubleValue_0_0= RULE_FLOAT )
            {
            // InternalThingML.g:7046:3: (lv_doubleValue_0_0= RULE_FLOAT )
            // InternalThingML.g:7047:4: lv_doubleValue_0_0= RULE_FLOAT
            {
            lv_doubleValue_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_doubleValue_0_0, grammarAccess.getDoubleLiteralAccess().getDoubleValueFLOATTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDoubleLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"doubleValue",
              					lv_doubleValue_0_0,
              					"org.thingml.xtext.ThingML.FLOAT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRulePropertyReference"
    // InternalThingML.g:7066:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalThingML.g:7066:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalThingML.g:7067:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyReference=rulePropertyReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // InternalThingML.g:7073:1: rulePropertyReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalThingML.g:7079:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalThingML.g:7080:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalThingML.g:7080:2: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:7081:3: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:7081:3: (otherlv_0= RULE_ID )
            // InternalThingML.g:7082:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPropertyReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getPropertyVariableCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRuleEventReference"
    // InternalThingML.g:7096:1: entryRuleEventReference returns [EObject current=null] : iv_ruleEventReference= ruleEventReference EOF ;
    public final EObject entryRuleEventReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventReference = null;


        try {
            // InternalThingML.g:7096:55: (iv_ruleEventReference= ruleEventReference EOF )
            // InternalThingML.g:7097:2: iv_ruleEventReference= ruleEventReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventReference=ruleEventReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventReference"


    // $ANTLR start "ruleEventReference"
    // InternalThingML.g:7103:1: ruleEventReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEventReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalThingML.g:7109:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalThingML.g:7110:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalThingML.g:7110:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalThingML.g:7111:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalThingML.g:7111:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:7112:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:7112:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:7113:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEventReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getEventReferenceAccess().getReceiveMsgEventCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,101,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEventReferenceAccess().getFullStopKeyword_1());
              		
            }
            // InternalThingML.g:7128:3: ( (otherlv_2= RULE_ID ) )
            // InternalThingML.g:7129:4: (otherlv_2= RULE_ID )
            {
            // InternalThingML.g:7129:4: (otherlv_2= RULE_ID )
            // InternalThingML.g:7130:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEventReferenceRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getEventReferenceAccess().getParameterParameterCrossReference_2_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEventReference"


    // $ANTLR start "entryRuleFunctionCallExpression"
    // InternalThingML.g:7145:1: entryRuleFunctionCallExpression returns [EObject current=null] : iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF ;
    public final EObject entryRuleFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallExpression = null;


        try {
            // InternalThingML.g:7145:63: (iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF )
            // InternalThingML.g:7146:2: iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallExpression=ruleFunctionCallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCallExpression"


    // $ANTLR start "ruleFunctionCallExpression"
    // InternalThingML.g:7152:1: ruleFunctionCallExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:7158:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalThingML.g:7159:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalThingML.g:7159:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalThingML.g:7160:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalThingML.g:7160:3: ( (otherlv_0= RULE_ID ) )
            // InternalThingML.g:7161:4: (otherlv_0= RULE_ID )
            {
            // InternalThingML.g:7161:4: (otherlv_0= RULE_ID )
            // InternalThingML.g:7162:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallExpressionAccess().getFunctionFunctionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalThingML.g:7177:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( ((LA140_0>=RULE_STRING && LA140_0<=RULE_ID)||(LA140_0>=RULE_EXTERN && LA140_0<=RULE_FLOAT)||LA140_0==29||LA140_0==39||LA140_0==94||(LA140_0>=98 && LA140_0<=100)) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalThingML.g:7178:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalThingML.g:7178:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalThingML.g:7179:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalThingML.g:7179:5: (lv_parameters_2_0= ruleExpression )
                    // InternalThingML.g:7180:6: lv_parameters_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_parameters_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalThingML.g:7197:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==35) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalThingML.g:7198:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalThingML.g:7202:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalThingML.g:7203:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalThingML.g:7203:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalThingML.g:7204:7: lv_parameters_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameters_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"org.thingml.xtext.ThingML.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionCallExpressionAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionCallExpression"


    // $ANTLR start "entryRuleConfiguration"
    // InternalThingML.g:7231:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalThingML.g:7231:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalThingML.g:7232:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalThingML.g:7238:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_instances_4_0= ruleInstance ) ) | ( (lv_connectors_5_0= ruleAbstractConnector ) ) | ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_instances_4_0 = null;

        EObject lv_connectors_5_0 = null;

        EObject lv_propassigns_6_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:7244:2: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_instances_4_0= ruleInstance ) ) | ( (lv_connectors_5_0= ruleAbstractConnector ) ) | ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) ) )* otherlv_7= '}' ) )
            // InternalThingML.g:7245:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_instances_4_0= ruleInstance ) ) | ( (lv_connectors_5_0= ruleAbstractConnector ) ) | ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) ) )* otherlv_7= '}' )
            {
            // InternalThingML.g:7245:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_instances_4_0= ruleInstance ) ) | ( (lv_connectors_5_0= ruleAbstractConnector ) ) | ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) ) )* otherlv_7= '}' )
            // InternalThingML.g:7246:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_instances_4_0= ruleInstance ) ) | ( (lv_connectors_5_0= ruleAbstractConnector ) ) | ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
              		
            }
            // InternalThingML.g:7250:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:7251:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:7251:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:7252:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            // InternalThingML.g:7268:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==RULE_ANNOTATION_ID) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalThingML.g:7269:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:7269:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalThingML.g:7270:5: lv_annotations_2_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_2_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_2_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalThingML.g:7291:3: ( ( (lv_instances_4_0= ruleInstance ) ) | ( (lv_connectors_5_0= ruleAbstractConnector ) ) | ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) ) )*
            loop142:
            do {
                int alt142=4;
                switch ( input.LA(1) ) {
                case 103:
                    {
                    alt142=1;
                    }
                    break;
                case 104:
                    {
                    alt142=2;
                    }
                    break;
                case 36:
                    {
                    alt142=3;
                    }
                    break;

                }

                switch (alt142) {
            	case 1 :
            	    // InternalThingML.g:7292:4: ( (lv_instances_4_0= ruleInstance ) )
            	    {
            	    // InternalThingML.g:7292:4: ( (lv_instances_4_0= ruleInstance ) )
            	    // InternalThingML.g:7293:5: (lv_instances_4_0= ruleInstance )
            	    {
            	    // InternalThingML.g:7293:5: (lv_instances_4_0= ruleInstance )
            	    // InternalThingML.g:7294:6: lv_instances_4_0= ruleInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationAccess().getInstancesInstanceParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_88);
            	    lv_instances_4_0=ruleInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"instances",
            	      							lv_instances_4_0,
            	      							"org.thingml.xtext.ThingML.Instance");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalThingML.g:7312:4: ( (lv_connectors_5_0= ruleAbstractConnector ) )
            	    {
            	    // InternalThingML.g:7312:4: ( (lv_connectors_5_0= ruleAbstractConnector ) )
            	    // InternalThingML.g:7313:5: (lv_connectors_5_0= ruleAbstractConnector )
            	    {
            	    // InternalThingML.g:7313:5: (lv_connectors_5_0= ruleAbstractConnector )
            	    // InternalThingML.g:7314:6: lv_connectors_5_0= ruleAbstractConnector
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationAccess().getConnectorsAbstractConnectorParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_88);
            	    lv_connectors_5_0=ruleAbstractConnector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"connectors",
            	      							lv_connectors_5_0,
            	      							"org.thingml.xtext.ThingML.AbstractConnector");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalThingML.g:7332:4: ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) )
            	    {
            	    // InternalThingML.g:7332:4: ( (lv_propassigns_6_0= ruleConfigPropertyAssign ) )
            	    // InternalThingML.g:7333:5: (lv_propassigns_6_0= ruleConfigPropertyAssign )
            	    {
            	    // InternalThingML.g:7333:5: (lv_propassigns_6_0= ruleConfigPropertyAssign )
            	    // InternalThingML.g:7334:6: lv_propassigns_6_0= ruleConfigPropertyAssign
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationAccess().getPropassignsConfigPropertyAssignParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_88);
            	    lv_propassigns_6_0=ruleConfigPropertyAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propassigns",
            	      							lv_propassigns_6_0,
            	      							"org.thingml.xtext.ThingML.ConfigPropertyAssign");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleInstance"
    // InternalThingML.g:7360:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalThingML.g:7360:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalThingML.g:7361:2: iv_ruleInstance= ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalThingML.g:7367:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:7373:2: ( (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:7374:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:7374:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:7375:3: otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,103,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
              		
            }
            // InternalThingML.g:7379:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThingML.g:7380:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThingML.g:7380:4: (lv_name_1_0= RULE_ID )
            // InternalThingML.g:7381:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.thingml.xtext.ThingML.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
              		
            }
            // InternalThingML.g:7401:3: ( (otherlv_3= RULE_ID ) )
            // InternalThingML.g:7402:4: (otherlv_3= RULE_ID )
            {
            // InternalThingML.g:7402:4: (otherlv_3= RULE_ID )
            // InternalThingML.g:7403:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getTypeThingCrossReference_3_0());
              				
            }

            }


            }

            // InternalThingML.g:7414:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==RULE_ANNOTATION_ID) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // InternalThingML.g:7415:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:7415:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalThingML.g:7416:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInstanceAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_4_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInstanceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_4_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleConfigPropertyAssign"
    // InternalThingML.g:7437:1: entryRuleConfigPropertyAssign returns [EObject current=null] : iv_ruleConfigPropertyAssign= ruleConfigPropertyAssign EOF ;
    public final EObject entryRuleConfigPropertyAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigPropertyAssign = null;


        try {
            // InternalThingML.g:7437:61: (iv_ruleConfigPropertyAssign= ruleConfigPropertyAssign EOF )
            // InternalThingML.g:7438:2: iv_ruleConfigPropertyAssign= ruleConfigPropertyAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigPropertyAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigPropertyAssign=ruleConfigPropertyAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigPropertyAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigPropertyAssign"


    // $ANTLR start "ruleConfigPropertyAssign"
    // InternalThingML.g:7444:1: ruleConfigPropertyAssign returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_index_5_0= ruleExpression ) ) otherlv_6= ']' )? otherlv_7= '=' ( (lv_init_8_0= ruleExpression ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleConfigPropertyAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_index_5_0 = null;

        EObject lv_init_8_0 = null;

        EObject lv_annotations_9_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:7450:2: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_index_5_0= ruleExpression ) ) otherlv_6= ']' )? otherlv_7= '=' ( (lv_init_8_0= ruleExpression ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:7451:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_index_5_0= ruleExpression ) ) otherlv_6= ']' )? otherlv_7= '=' ( (lv_init_8_0= ruleExpression ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:7451:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_index_5_0= ruleExpression ) ) otherlv_6= ']' )? otherlv_7= '=' ( (lv_init_8_0= ruleExpression ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:7452:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_index_5_0= ruleExpression ) ) otherlv_6= ']' )? otherlv_7= '=' ( (lv_init_8_0= ruleExpression ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigPropertyAssignAccess().getSetKeyword_0());
              		
            }
            // InternalThingML.g:7456:3: ( (otherlv_1= RULE_ID ) )
            // InternalThingML.g:7457:4: (otherlv_1= RULE_ID )
            {
            // InternalThingML.g:7457:4: (otherlv_1= RULE_ID )
            // InternalThingML.g:7458:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigPropertyAssignRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getConfigPropertyAssignAccess().getInstanceInstanceCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,101,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConfigPropertyAssignAccess().getFullStopKeyword_2());
              		
            }
            // InternalThingML.g:7473:3: ( (otherlv_3= RULE_ID ) )
            // InternalThingML.g:7474:4: (otherlv_3= RULE_ID )
            {
            // InternalThingML.g:7474:4: (otherlv_3= RULE_ID )
            // InternalThingML.g:7475:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigPropertyAssignRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getConfigPropertyAssignAccess().getPropertyPropertyCrossReference_3_0());
              				
            }

            }


            }

            // InternalThingML.g:7486:3: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_index_5_0= ruleExpression ) ) otherlv_6= ']' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==20) && (synpred7_InternalThingML())) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalThingML.g:7487:4: ( ( '[' )=>otherlv_4= '[' ) ( (lv_index_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    // InternalThingML.g:7487:4: ( ( '[' )=>otherlv_4= '[' )
                    // InternalThingML.g:7488:5: ( '[' )=>otherlv_4= '['
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getConfigPropertyAssignAccess().getLeftSquareBracketKeyword_4_0());
                      				
                    }

                    }

                    // InternalThingML.g:7494:4: ( (lv_index_5_0= ruleExpression ) )
                    // InternalThingML.g:7495:5: (lv_index_5_0= ruleExpression )
                    {
                    // InternalThingML.g:7495:5: (lv_index_5_0= ruleExpression )
                    // InternalThingML.g:7496:6: lv_index_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getIndexExpressionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_index_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_5_0,
                      							"org.thingml.xtext.ThingML.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConfigPropertyAssignAccess().getRightSquareBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConfigPropertyAssignAccess().getEqualsSignKeyword_5());
              		
            }
            // InternalThingML.g:7522:3: ( (lv_init_8_0= ruleExpression ) )
            // InternalThingML.g:7523:4: (lv_init_8_0= ruleExpression )
            {
            // InternalThingML.g:7523:4: (lv_init_8_0= ruleExpression )
            // InternalThingML.g:7524:5: lv_init_8_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getInitExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_init_8_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
              					}
              					set(
              						current,
              						"init",
              						lv_init_8_0,
              						"org.thingml.xtext.ThingML.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThingML.g:7541:3: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==RULE_ANNOTATION_ID) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // InternalThingML.g:7542:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:7542:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    // InternalThingML.g:7543:5: lv_annotations_9_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_9_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_9_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop145;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigPropertyAssign"


    // $ANTLR start "entryRuleAbstractConnector"
    // InternalThingML.g:7564:1: entryRuleAbstractConnector returns [EObject current=null] : iv_ruleAbstractConnector= ruleAbstractConnector EOF ;
    public final EObject entryRuleAbstractConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConnector = null;


        try {
            // InternalThingML.g:7564:58: (iv_ruleAbstractConnector= ruleAbstractConnector EOF )
            // InternalThingML.g:7565:2: iv_ruleAbstractConnector= ruleAbstractConnector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractConnector=ruleAbstractConnector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractConnector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractConnector"


    // $ANTLR start "ruleAbstractConnector"
    // InternalThingML.g:7571:1: ruleAbstractConnector returns [EObject current=null] : (this_Connector_0= ruleConnector | this_ExternalConnector_1= ruleExternalConnector ) ;
    public final EObject ruleAbstractConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Connector_0 = null;

        EObject this_ExternalConnector_1 = null;



        	enterRule();

        try {
            // InternalThingML.g:7577:2: ( (this_Connector_0= ruleConnector | this_ExternalConnector_1= ruleExternalConnector ) )
            // InternalThingML.g:7578:2: (this_Connector_0= ruleConnector | this_ExternalConnector_1= ruleExternalConnector )
            {
            // InternalThingML.g:7578:2: (this_Connector_0= ruleConnector | this_ExternalConnector_1= ruleExternalConnector )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==104) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==RULE_ID) ) {
                    int LA146_2 = input.LA(3);

                    if ( (LA146_2==RULE_ID) ) {
                        int LA146_3 = input.LA(4);

                        if ( (LA146_3==101) ) {
                            int LA146_4 = input.LA(5);

                            if ( (LA146_4==RULE_ID) ) {
                                int LA146_5 = input.LA(6);

                                if ( (LA146_5==106) ) {
                                    alt146=2;
                                }
                                else if ( (LA146_5==105) ) {
                                    alt146=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 146, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 146, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 146, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA146_2==101) ) {
                        int LA146_4 = input.LA(4);

                        if ( (LA146_4==RULE_ID) ) {
                            int LA146_5 = input.LA(5);

                            if ( (LA146_5==106) ) {
                                alt146=2;
                            }
                            else if ( (LA146_5==105) ) {
                                alt146=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 146, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 146, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 146, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalThingML.g:7579:3: this_Connector_0= ruleConnector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractConnectorAccess().getConnectorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Connector_0=ruleConnector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Connector_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThingML.g:7588:3: this_ExternalConnector_1= ruleExternalConnector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractConnectorAccess().getExternalConnectorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternalConnector_1=ruleExternalConnector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternalConnector_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAbstractConnector"


    // $ANTLR start "entryRuleConnector"
    // InternalThingML.g:7600:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalThingML.g:7600:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalThingML.g:7601:2: iv_ruleConnector= ruleConnector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalThingML.g:7607:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=>' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotations_9_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:7613:2: ( (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=>' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:7614:2: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=>' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:7614:2: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=>' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:7615:3: otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=>' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,104,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
              		
            }
            // InternalThingML.g:7619:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==RULE_ID) ) {
                int LA147_1 = input.LA(2);

                if ( (LA147_1==RULE_ID) ) {
                    alt147=1;
                }
            }
            switch (alt147) {
                case 1 :
                    // InternalThingML.g:7620:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalThingML.g:7620:4: (lv_name_1_0= RULE_ID )
                    // InternalThingML.g:7621:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.thingml.xtext.ThingML.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalThingML.g:7637:3: ( (otherlv_2= RULE_ID ) )
            // InternalThingML.g:7638:4: (otherlv_2= RULE_ID )
            {
            // InternalThingML.g:7638:4: (otherlv_2= RULE_ID )
            // InternalThingML.g:7639:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getCliInstanceCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,101,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getFullStopKeyword_3());
              		
            }
            // InternalThingML.g:7654:3: ( (otherlv_4= RULE_ID ) )
            // InternalThingML.g:7655:4: (otherlv_4= RULE_ID )
            {
            // InternalThingML.g:7655:4: (otherlv_4= RULE_ID )
            // InternalThingML.g:7656:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getRequiredRequiredPortCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,105,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getEqualsSignGreaterThanSignKeyword_5());
              		
            }
            // InternalThingML.g:7671:3: ( (otherlv_6= RULE_ID ) )
            // InternalThingML.g:7672:4: (otherlv_6= RULE_ID )
            {
            // InternalThingML.g:7672:4: (otherlv_6= RULE_ID )
            // InternalThingML.g:7673:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getSrvInstanceCrossReference_6_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,101,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getFullStopKeyword_7());
              		
            }
            // InternalThingML.g:7688:3: ( (otherlv_8= RULE_ID ) )
            // InternalThingML.g:7689:4: (otherlv_8= RULE_ID )
            {
            // InternalThingML.g:7689:4: (otherlv_8= RULE_ID )
            // InternalThingML.g:7690:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getProvidedProvidedPortCrossReference_8_0());
              				
            }

            }


            }

            // InternalThingML.g:7701:3: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==RULE_ANNOTATION_ID) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // InternalThingML.g:7702:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:7702:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    // InternalThingML.g:7703:5: lv_annotations_9_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_9_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConnectorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_9_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleExternalConnector"
    // InternalThingML.g:7724:1: entryRuleExternalConnector returns [EObject current=null] : iv_ruleExternalConnector= ruleExternalConnector EOF ;
    public final EObject entryRuleExternalConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalConnector = null;


        try {
            // InternalThingML.g:7724:58: (iv_ruleExternalConnector= ruleExternalConnector EOF )
            // InternalThingML.g:7725:2: iv_ruleExternalConnector= ruleExternalConnector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalConnector=ruleExternalConnector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalConnector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExternalConnector"


    // $ANTLR start "ruleExternalConnector"
    // InternalThingML.g:7731:1: ruleExternalConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleExternalConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_annotations_7_0 = null;



        	enterRule();

        try {
            // InternalThingML.g:7737:2: ( (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalThingML.g:7738:2: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalThingML.g:7738:2: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalThingML.g:7739:3: otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,104,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExternalConnectorAccess().getConnectorKeyword_0());
              		
            }
            // InternalThingML.g:7743:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==RULE_ID) ) {
                int LA149_1 = input.LA(2);

                if ( (LA149_1==RULE_ID) ) {
                    alt149=1;
                }
            }
            switch (alt149) {
                case 1 :
                    // InternalThingML.g:7744:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalThingML.g:7744:4: (lv_name_1_0= RULE_ID )
                    // InternalThingML.g:7745:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getExternalConnectorAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExternalConnectorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.thingml.xtext.ThingML.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalThingML.g:7761:3: ( (otherlv_2= RULE_ID ) )
            // InternalThingML.g:7762:4: (otherlv_2= RULE_ID )
            {
            // InternalThingML.g:7762:4: (otherlv_2= RULE_ID )
            // InternalThingML.g:7763:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExternalConnectorRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getExternalConnectorAccess().getInstInstanceCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,101,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExternalConnectorAccess().getFullStopKeyword_3());
              		
            }
            // InternalThingML.g:7778:3: ( (otherlv_4= RULE_ID ) )
            // InternalThingML.g:7779:4: (otherlv_4= RULE_ID )
            {
            // InternalThingML.g:7779:4: (otherlv_4= RULE_ID )
            // InternalThingML.g:7780:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExternalConnectorRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getExternalConnectorAccess().getPortPortCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,106,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getExternalConnectorAccess().getOverKeyword_5());
              		
            }
            // InternalThingML.g:7795:3: ( (otherlv_6= RULE_ID ) )
            // InternalThingML.g:7796:4: (otherlv_6= RULE_ID )
            {
            // InternalThingML.g:7796:4: (otherlv_6= RULE_ID )
            // InternalThingML.g:7797:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExternalConnectorRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getExternalConnectorAccess().getProtocolProtocolCrossReference_6_0());
              				
            }

            }


            }

            // InternalThingML.g:7808:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==RULE_ANNOTATION_ID) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // InternalThingML.g:7809:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalThingML.g:7809:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalThingML.g:7810:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getExternalConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getExternalConnectorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_7_0,
            	      						"org.thingml.xtext.ThingML.PlatformAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExternalConnector"

    // $ANTLR start synpred2_InternalThingML
    public final void synpred2_InternalThingML_fragment() throws RecognitionException {   
        // InternalThingML.g:753:5: ( 'as' )
        // InternalThingML.g:753:6: 'as'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalThingML

    // $ANTLR start synpred3_InternalThingML
    public final void synpred3_InternalThingML_fragment() throws RecognitionException {   
        // InternalThingML.g:1184:5: ( '[' )
        // InternalThingML.g:1184:6: '['
        {
        match(input,20,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalThingML

    // $ANTLR start synpred4_InternalThingML
    public final void synpred4_InternalThingML_fragment() throws RecognitionException {   
        // InternalThingML.g:4870:5: ( '[' )
        // InternalThingML.g:4870:6: '['
        {
        match(input,20,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalThingML

    // $ANTLR start synpred5_InternalThingML
    public final void synpred5_InternalThingML_fragment() throws RecognitionException {   
        // InternalThingML.g:5252:5: ( 'else' )
        // InternalThingML.g:5252:6: 'else'
        {
        match(input,80,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalThingML

    // $ANTLR start synpred6_InternalThingML
    public final void synpred6_InternalThingML_fragment() throws RecognitionException {   
        // InternalThingML.g:5309:4: ( ( ruleExpression ) )
        // InternalThingML.g:5309:5: ( ruleExpression )
        {
        // InternalThingML.g:5309:5: ( ruleExpression )
        // InternalThingML.g:5310:5: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalThingML

    // $ANTLR start synpred7_InternalThingML
    public final void synpred7_InternalThingML_fragment() throws RecognitionException {   
        // InternalThingML.g:7488:5: ( '[' )
        // InternalThingML.g:7488:6: '['
        {
        match(input,20,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalThingML

    // Delegated rules

    public final boolean synpred5_InternalThingML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalThingML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalThingML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalThingML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalThingML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalThingML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalThingML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalThingML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalThingML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalThingML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalThingML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalThingML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA81 dfa81 = new DFA81(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA117 dfa117 = new DFA117(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\36\1\uffff\10\0\1\uffff";
    static final String dfa_3s = "\1\104\1\uffff\10\0\1\uffff";
    static final String dfa_4s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_5s = "\2\uffff\1\1\1\0\1\2\1\3\1\5\1\6\1\4\1\7\1\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\13\uffff\1\2\1\3\7\uffff\1\10\1\7\1\1\2\uffff\1\11\4\uffff\1\6\3\uffff\1\4\2\1\1\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 3295:9: ({...}? => ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_substate_18_0= ruleState ) ) | ( (lv_internal_19_0= ruleInternalTransition ) ) | ( (lv_outgoing_20_0= ruleTransition ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_3 = input.LA(1);

                         
                        int index81_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\36\1\uffff\7\0\1\uffff";
    static final String dfa_9s = "\1\104\1\uffff\7\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_11s = "\2\uffff\1\1\1\0\1\2\1\3\1\5\1\6\1\4\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\13\uffff\1\2\1\3\7\uffff\1\10\1\7\1\1\7\uffff\1\6\3\uffff\1\4\2\1\1\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 3640:9: ({...}? => ( ( (lv_properties_16_0= ruleProperty ) ) | ( (lv_substate_17_0= ruleState ) ) | ( (lv_internal_18_0= ruleInternalTransition ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_3 = input.LA(1);

                         
                        int index89_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA89_2 = input.LA(1);

                         
                        int index89_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA89_4 = input.LA(1);

                         
                        int index89_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA89_5 = input.LA(1);

                         
                        int index89_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA89_8 = input.LA(1);

                         
                        int index89_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA89_6 = input.LA(1);

                         
                        int index89_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA89_7 = input.LA(1);

                         
                        int index89_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\21\uffff";
    static final String dfa_14s = "\1\5\2\uffff\1\24\15\uffff";
    static final String dfa_15s = "\1\126\2\uffff\1\113\15\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\6\1\16\1\5\1\4\1\3";
    static final String dfa_17s = "\21\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\1\uffff\1\2\12\uffff\1\13\27\uffff\1\13\33\uffff\1\1\5\uffff\1\5\1\uffff\1\4\1\6\1\uffff\1\7\2\10\2\11\1\12",
            "",
            "",
            "\1\17\12\uffff\1\17\7\uffff\1\15\41\uffff\1\20\1\16\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "4361:2: (this_ActionBlock_0= ruleActionBlock | this_ExternStatement_1= ruleExternStatement | this_SendAction_2= ruleSendAction | this_VariableAssignment_3= ruleVariableAssignment | this_Increment_4= ruleIncrement | this_Decrement_5= ruleDecrement | this_LoopAction_6= ruleLoopAction | this_ForAction_7= ruleForAction | this_ConditionalAction_8= ruleConditionalAction | this_ReturnAction_9= ruleReturnAction | this_PrintAction_10= rulePrintAction | this_ErrorAction_11= ruleErrorAction | this_StartSession_12= ruleStartSession | this_FunctionCallStatement_13= ruleFunctionCallStatement | this_LocalVariable_14= ruleLocalVariable )";
        }
    }
    static final String dfa_19s = "\57\uffff";
    static final String dfa_20s = "\1\16\56\uffff";
    static final String dfa_21s = "\1\4\3\uffff\2\0\51\uffff";
    static final String dfa_22s = "\1\144\3\uffff\2\0\51\uffff";
    static final String dfa_23s = "\1\uffff\3\1\2\uffff\10\1\1\2\40\uffff";
    static final String dfa_24s = "\1\0\3\uffff\1\1\1\2\51\uffff}>";
    static final String[] dfa_25s = {
            "\1\13\1\5\1\uffff\1\4\1\10\1\6\1\7\1\14\6\uffff\1\16\12\uffff\1\15\1\16\5\uffff\1\16\1\uffff\1\16\1\1\1\uffff\6\16\3\uffff\4\16\2\uffff\1\16\4\uffff\1\16\3\uffff\4\16\1\uffff\2\16\4\uffff\1\16\1\uffff\11\16\7\uffff\1\3\3\uffff\1\2\1\11\1\12",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "5308:3: ( ( ( ruleExpression ) )=> (lv_exp_2_0= ruleExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_0 = input.LA(1);

                         
                        int index117_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_0==39) && (synpred6_InternalThingML())) {s = 1;}

                        else if ( (LA117_0==98) && (synpred6_InternalThingML())) {s = 2;}

                        else if ( (LA117_0==94) && (synpred6_InternalThingML())) {s = 3;}

                        else if ( (LA117_0==RULE_EXTERN) ) {s = 4;}

                        else if ( (LA117_0==RULE_ID) ) {s = 5;}

                        else if ( (LA117_0==RULE_BYTE) && (synpred6_InternalThingML())) {s = 6;}

                        else if ( (LA117_0==RULE_CHAR) && (synpred6_InternalThingML())) {s = 7;}

                        else if ( (LA117_0==RULE_INT) && (synpred6_InternalThingML())) {s = 8;}

                        else if ( (LA117_0==99) && (synpred6_InternalThingML())) {s = 9;}

                        else if ( (LA117_0==100) && (synpred6_InternalThingML())) {s = 10;}

                        else if ( (LA117_0==RULE_STRING) && (synpred6_InternalThingML())) {s = 11;}

                        else if ( (LA117_0==RULE_FLOAT) && (synpred6_InternalThingML())) {s = 12;}

                        else if ( (LA117_0==29) && (synpred6_InternalThingML())) {s = 13;}

                        else if ( (LA117_0==EOF||LA117_0==18||LA117_0==30||LA117_0==36||LA117_0==38||(LA117_0>=41 && LA117_0<=46)||(LA117_0>=50 && LA117_0<=53)||LA117_0==56||LA117_0==61||(LA117_0>=65 && LA117_0<=68)||(LA117_0>=70 && LA117_0<=71)||LA117_0==76||(LA117_0>=78 && LA117_0<=86)) ) {s = 14;}

                         
                        input.seek(index117_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_4 = input.LA(1);

                         
                        int index117_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalThingML()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index117_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_5 = input.LA(1);

                         
                        int index117_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalThingML()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index117_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 117, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000210C410002L,0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000210C400002L,0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200120L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000F30L,0x0000001800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000420000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000820000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000C7E5040000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008020000FB0L,0x0000001C40000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000400000C00E0L,0x00000000007ED040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003000840000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x01280C0040000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1C00000000000042L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1C00000000000062L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000020000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x21380C0040000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000040000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x20380C0040000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2010000040000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000040000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000020000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00000400000C00E0L,0x00000000007ED0C0L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000018020000FB0L,0x0000001C40000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000800000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000008020000FB2L,0x0000001C40000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000001800002L,0x0000000018000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000001040000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});

}
