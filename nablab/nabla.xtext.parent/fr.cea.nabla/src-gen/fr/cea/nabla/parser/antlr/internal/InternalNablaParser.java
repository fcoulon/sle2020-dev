package fr.cea.nabla.parser.antlr.internal;

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
import fr.cea.nabla.services.NablaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNablaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "';'", "'with'", "'connectivities'", "'{'", "'}'", "'functions'", "':'", "'\\u2200'", "','", "'='", "'if'", "'('", "')'", "'else'", "'\\u2208'", "'\\u2115'", "'\\u25C4'", "'\\u25BA'", "'const'", "'['", "']'", "'\\u2205'", "'\\u2192'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'", "'.MinValue'", "'.MaxValue'", "'^{'", "'.'", "'.*'", "'\\u211D'", "'\\u211D\\u00B2'", "'\\u211D\\u00B2\\u02E3\\u00B2'", "'\\u211D\\u00B3'", "'\\u211D\\u00B3\\u02E3\\u00B3'", "'\\u213E'", "'node'", "'cell'", "'face'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalNablaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNablaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNablaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNabla.g"; }



     	private NablaGrammarAccess grammarAccess;

        public InternalNablaParser(TokenStream input, NablaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NablaModule";
       	}

       	@Override
       	protected NablaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNablaModule"
    // InternalNabla.g:65:1: entryRuleNablaModule returns [EObject current=null] : iv_ruleNablaModule= ruleNablaModule EOF ;
    public final EObject entryRuleNablaModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNablaModule = null;


        try {
            // InternalNabla.g:65:52: (iv_ruleNablaModule= ruleNablaModule EOF )
            // InternalNabla.g:66:2: iv_ruleNablaModule= ruleNablaModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNablaModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNablaModule=ruleNablaModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNablaModule; 
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
    // $ANTLR end "entryRuleNablaModule"


    // $ANTLR start "ruleNablaModule"
    // InternalNabla.g:72:1: ruleNablaModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_blocks_4_0= ruleDeclarationBlock ) )* ( ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) ) )* ( (lv_jobs_6_0= ruleJob ) )* ) ;
    public final EObject ruleNablaModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_blocks_4_0 = null;

        EObject lv_variables_5_1 = null;

        EObject lv_variables_5_2 = null;

        EObject lv_jobs_6_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:78:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_blocks_4_0= ruleDeclarationBlock ) )* ( ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) ) )* ( (lv_jobs_6_0= ruleJob ) )* ) )
            // InternalNabla.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_blocks_4_0= ruleDeclarationBlock ) )* ( ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) ) )* ( (lv_jobs_6_0= ruleJob ) )* )
            {
            // InternalNabla.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_blocks_4_0= ruleDeclarationBlock ) )* ( ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) ) )* ( (lv_jobs_6_0= ruleJob ) )* )
            // InternalNabla.g:80:3: otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_blocks_4_0= ruleDeclarationBlock ) )* ( ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) ) )* ( (lv_jobs_6_0= ruleJob ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNablaModuleAccess().getModuleKeyword_0());
              		
            }
            // InternalNabla.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalNabla.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalNabla.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalNabla.g:86:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNablaModuleAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNablaModuleRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"fr.cea.nabla.Nabla.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNablaModuleAccess().getSemicolonKeyword_2());
              		
            }
            // InternalNabla.g:107:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNabla.g:108:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalNabla.g:108:4: (lv_imports_3_0= ruleImport )
            	    // InternalNabla.g:109:5: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNablaModuleAccess().getImportsImportParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNablaModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"fr.cea.nabla.Nabla.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalNabla.g:126:3: ( (lv_blocks_4_0= ruleDeclarationBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalNabla.g:127:4: (lv_blocks_4_0= ruleDeclarationBlock )
            	    {
            	    // InternalNabla.g:127:4: (lv_blocks_4_0= ruleDeclarationBlock )
            	    // InternalNabla.g:128:5: lv_blocks_4_0= ruleDeclarationBlock
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNablaModuleAccess().getBlocksDeclarationBlockParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_blocks_4_0=ruleDeclarationBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNablaModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"blocks",
            	      						lv_blocks_4_0,
            	      						"fr.cea.nabla.Nabla.DeclarationBlock");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalNabla.g:145:3: ( ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28||LA4_0==31||(LA4_0>=56 && LA4_0<=61)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNabla.g:146:4: ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) )
            	    {
            	    // InternalNabla.g:146:4: ( (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration ) )
            	    // InternalNabla.g:147:5: (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration )
            	    {
            	    // InternalNabla.g:147:5: (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration )
            	    int alt3=2;
            	    alt3 = dfa3.predict(input);
            	    switch (alt3) {
            	        case 1 :
            	            // InternalNabla.g:148:6: lv_variables_5_1= ruleScalarVarDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getNablaModuleAccess().getVariablesScalarVarDefinitionParserRuleCall_5_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_7);
            	            lv_variables_5_1=ruleScalarVarDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getNablaModuleRule());
            	              						}
            	              						add(
            	              							current,
            	              							"variables",
            	              							lv_variables_5_1,
            	              							"fr.cea.nabla.Nabla.ScalarVarDefinition");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNabla.g:164:6: lv_variables_5_2= ruleVarGroupDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getNablaModuleAccess().getVariablesVarGroupDeclarationParserRuleCall_5_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_7);
            	            lv_variables_5_2=ruleVarGroupDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getNablaModuleRule());
            	              						}
            	              						add(
            	              							current,
            	              							"variables",
            	              							lv_variables_5_2,
            	              							"fr.cea.nabla.Nabla.VarGroupDeclaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalNabla.g:182:3: ( (lv_jobs_6_0= ruleJob ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNabla.g:183:4: (lv_jobs_6_0= ruleJob )
            	    {
            	    // InternalNabla.g:183:4: (lv_jobs_6_0= ruleJob )
            	    // InternalNabla.g:184:5: lv_jobs_6_0= ruleJob
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNablaModuleAccess().getJobsJobParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_jobs_6_0=ruleJob();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNablaModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"jobs",
            	      						lv_jobs_6_0,
            	      						"fr.cea.nabla.Nabla.Job");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleNablaModule"


    // $ANTLR start "entryRuleImport"
    // InternalNabla.g:205:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalNabla.g:205:47: (iv_ruleImport= ruleImport EOF )
            // InternalNabla.g:206:2: iv_ruleImport= ruleImport EOF
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
    // InternalNabla.g:212:1: ruleImport returns [EObject current=null] : (otherlv_0= 'with' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:218:2: ( (otherlv_0= 'with' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalNabla.g:219:2: (otherlv_0= 'with' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalNabla.g:219:2: (otherlv_0= 'with' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalNabla.g:220:3: otherlv_0= 'with' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getWithKeyword_0());
              		
            }
            // InternalNabla.g:224:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalNabla.g:225:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalNabla.g:225:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalNabla.g:226:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"fr.cea.nabla.Nabla.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
              		
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


    // $ANTLR start "entryRuleDeclarationBlock"
    // InternalNabla.g:251:1: entryRuleDeclarationBlock returns [EObject current=null] : iv_ruleDeclarationBlock= ruleDeclarationBlock EOF ;
    public final EObject entryRuleDeclarationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationBlock = null;


        try {
            // InternalNabla.g:251:57: (iv_ruleDeclarationBlock= ruleDeclarationBlock EOF )
            // InternalNabla.g:252:2: iv_ruleDeclarationBlock= ruleDeclarationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclarationBlock=ruleDeclarationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationBlock; 
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
    // $ANTLR end "entryRuleDeclarationBlock"


    // $ANTLR start "ruleDeclarationBlock"
    // InternalNabla.g:258:1: ruleDeclarationBlock returns [EObject current=null] : ( ( () otherlv_1= 'connectivities' otherlv_2= '{' ( (lv_connectivities_3_0= ruleConnectivity ) )* otherlv_4= '}' ) | ( () otherlv_6= 'functions' otherlv_7= '{' ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )* otherlv_9= '}' ) ) ;
    public final EObject ruleDeclarationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_connectivities_3_0 = null;

        EObject lv_functions_8_1 = null;

        EObject lv_functions_8_2 = null;



        	enterRule();

        try {
            // InternalNabla.g:264:2: ( ( ( () otherlv_1= 'connectivities' otherlv_2= '{' ( (lv_connectivities_3_0= ruleConnectivity ) )* otherlv_4= '}' ) | ( () otherlv_6= 'functions' otherlv_7= '{' ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )* otherlv_9= '}' ) ) )
            // InternalNabla.g:265:2: ( ( () otherlv_1= 'connectivities' otherlv_2= '{' ( (lv_connectivities_3_0= ruleConnectivity ) )* otherlv_4= '}' ) | ( () otherlv_6= 'functions' otherlv_7= '{' ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )* otherlv_9= '}' ) )
            {
            // InternalNabla.g:265:2: ( ( () otherlv_1= 'connectivities' otherlv_2= '{' ( (lv_connectivities_3_0= ruleConnectivity ) )* otherlv_4= '}' ) | ( () otherlv_6= 'functions' otherlv_7= '{' ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )* otherlv_9= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNabla.g:266:3: ( () otherlv_1= 'connectivities' otherlv_2= '{' ( (lv_connectivities_3_0= ruleConnectivity ) )* otherlv_4= '}' )
                    {
                    // InternalNabla.g:266:3: ( () otherlv_1= 'connectivities' otherlv_2= '{' ( (lv_connectivities_3_0= ruleConnectivity ) )* otherlv_4= '}' )
                    // InternalNabla.g:267:4: () otherlv_1= 'connectivities' otherlv_2= '{' ( (lv_connectivities_3_0= ruleConnectivity ) )* otherlv_4= '}'
                    {
                    // InternalNabla.g:267:4: ()
                    // InternalNabla.g:268:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDeclarationBlockAccess().getConnectivityDeclarationBlockAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDeclarationBlockAccess().getConnectivitiesKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeclarationBlockAccess().getLeftCurlyBracketKeyword_0_2());
                      			
                    }
                    // InternalNabla.g:282:4: ( (lv_connectivities_3_0= ruleConnectivity ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalNabla.g:283:5: (lv_connectivities_3_0= ruleConnectivity )
                    	    {
                    	    // InternalNabla.g:283:5: (lv_connectivities_3_0= ruleConnectivity )
                    	    // InternalNabla.g:284:6: lv_connectivities_3_0= ruleConnectivity
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDeclarationBlockAccess().getConnectivitiesConnectivityParserRuleCall_0_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_connectivities_3_0=ruleConnectivity();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDeclarationBlockRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"connectivities",
                    	      							lv_connectivities_3_0,
                    	      							"fr.cea.nabla.Nabla.Connectivity");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDeclarationBlockAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:307:3: ( () otherlv_6= 'functions' otherlv_7= '{' ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )* otherlv_9= '}' )
                    {
                    // InternalNabla.g:307:3: ( () otherlv_6= 'functions' otherlv_7= '{' ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )* otherlv_9= '}' )
                    // InternalNabla.g:308:4: () otherlv_6= 'functions' otherlv_7= '{' ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )* otherlv_9= '}'
                    {
                    // InternalNabla.g:308:4: ()
                    // InternalNabla.g:309:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDeclarationBlockAccess().getFunctionDeclarationBlockAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDeclarationBlockAccess().getFunctionsKeyword_1_1());
                      			
                    }
                    otherlv_7=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDeclarationBlockAccess().getLeftCurlyBracketKeyword_1_2());
                      			
                    }
                    // InternalNabla.g:323:4: ( ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalNabla.g:324:5: ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) )
                    	    {
                    	    // InternalNabla.g:324:5: ( (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction ) )
                    	    // InternalNabla.g:325:6: (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction )
                    	    {
                    	    // InternalNabla.g:325:6: (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction )
                    	    int alt7=2;
                    	    alt7 = dfa7.predict(input);
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalNabla.g:326:7: lv_functions_8_1= ruleFunction
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getDeclarationBlockAccess().getFunctionsFunctionParserRuleCall_1_3_0_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_10);
                    	            lv_functions_8_1=ruleFunction();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getDeclarationBlockRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"functions",
                    	              								lv_functions_8_1,
                    	              								"fr.cea.nabla.Nabla.Function");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalNabla.g:342:7: lv_functions_8_2= ruleReduction
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getDeclarationBlockAccess().getFunctionsReductionParserRuleCall_1_3_0_1());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_10);
                    	            lv_functions_8_2=ruleReduction();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getDeclarationBlockRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"functions",
                    	              								lv_functions_8_2,
                    	              								"fr.cea.nabla.Nabla.Reduction");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDeclarationBlockAccess().getRightCurlyBracketKeyword_1_4());
                      			
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
    // $ANTLR end "ruleDeclarationBlock"


    // $ANTLR start "entryRuleJob"
    // InternalNabla.g:369:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalNabla.g:369:44: (iv_ruleJob= ruleJob EOF )
            // InternalNabla.g:370:2: iv_ruleJob= ruleJob EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJob; 
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
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalNabla.g:376:1: ruleJob returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_instruction_3_0= ruleInstruction ) ) ) | ( () ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= '\\u2200' ( (lv_iterator_8_0= ruleTimeIterator ) ) otherlv_9= ',' ( (lv_initialization_10_0= ruleInstruction ) ) otherlv_11= ',' ( (lv_body_12_0= ruleInstruction ) ) ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_instruction_3_0 = null;

        EObject lv_iterator_8_0 = null;

        EObject lv_initialization_10_0 = null;

        EObject lv_body_12_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:382:2: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_instruction_3_0= ruleInstruction ) ) ) | ( () ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= '\\u2200' ( (lv_iterator_8_0= ruleTimeIterator ) ) otherlv_9= ',' ( (lv_initialization_10_0= ruleInstruction ) ) otherlv_11= ',' ( (lv_body_12_0= ruleInstruction ) ) ) ) )
            // InternalNabla.g:383:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_instruction_3_0= ruleInstruction ) ) ) | ( () ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= '\\u2200' ( (lv_iterator_8_0= ruleTimeIterator ) ) otherlv_9= ',' ( (lv_initialization_10_0= ruleInstruction ) ) otherlv_11= ',' ( (lv_body_12_0= ruleInstruction ) ) ) )
            {
            // InternalNabla.g:383:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_instruction_3_0= ruleInstruction ) ) ) | ( () ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= '\\u2200' ( (lv_iterator_8_0= ruleTimeIterator ) ) otherlv_9= ',' ( (lv_initialization_10_0= ruleInstruction ) ) otherlv_11= ',' ( (lv_body_12_0= ruleInstruction ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==19) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RULE_ID||LA10_2==16||LA10_2==23||LA10_2==28||LA10_2==31||(LA10_2>=56 && LA10_2<=61)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==20) ) {
                        int LA10_4 = input.LA(4);

                        if ( (LA10_4==RULE_ID) ) {
                            int LA10_5 = input.LA(5);

                            if ( (LA10_5==27) ) {
                                int LA10_6 = input.LA(6);

                                if ( (LA10_6==RULE_ID) ) {
                                    alt10=1;
                                }
                                else if ( (LA10_6==28) ) {
                                    alt10=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalNabla.g:384:3: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_instruction_3_0= ruleInstruction ) ) )
                    {
                    // InternalNabla.g:384:3: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_instruction_3_0= ruleInstruction ) ) )
                    // InternalNabla.g:385:4: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_instruction_3_0= ruleInstruction ) )
                    {
                    // InternalNabla.g:385:4: ()
                    // InternalNabla.g:386:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getJobAccess().getInstructionJobAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:392:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalNabla.g:393:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalNabla.g:393:5: (lv_name_1_0= RULE_ID )
                    // InternalNabla.g:394:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getJobAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getJobRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"fr.cea.nabla.Nabla.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getJobAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalNabla.g:414:4: ( (lv_instruction_3_0= ruleInstruction ) )
                    // InternalNabla.g:415:5: (lv_instruction_3_0= ruleInstruction )
                    {
                    // InternalNabla.g:415:5: (lv_instruction_3_0= ruleInstruction )
                    // InternalNabla.g:416:6: lv_instruction_3_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJobAccess().getInstructionInstructionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_instruction_3_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJobRule());
                      						}
                      						set(
                      							current,
                      							"instruction",
                      							lv_instruction_3_0,
                      							"fr.cea.nabla.Nabla.Instruction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:435:3: ( () ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= '\\u2200' ( (lv_iterator_8_0= ruleTimeIterator ) ) otherlv_9= ',' ( (lv_initialization_10_0= ruleInstruction ) ) otherlv_11= ',' ( (lv_body_12_0= ruleInstruction ) ) )
                    {
                    // InternalNabla.g:435:3: ( () ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= '\\u2200' ( (lv_iterator_8_0= ruleTimeIterator ) ) otherlv_9= ',' ( (lv_initialization_10_0= ruleInstruction ) ) otherlv_11= ',' ( (lv_body_12_0= ruleInstruction ) ) )
                    // InternalNabla.g:436:4: () ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= '\\u2200' ( (lv_iterator_8_0= ruleTimeIterator ) ) otherlv_9= ',' ( (lv_initialization_10_0= ruleInstruction ) ) otherlv_11= ',' ( (lv_body_12_0= ruleInstruction ) )
                    {
                    // InternalNabla.g:436:4: ()
                    // InternalNabla.g:437:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getJobAccess().getTimeLoopJobAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:443:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalNabla.g:444:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalNabla.g:444:5: (lv_name_5_0= RULE_ID )
                    // InternalNabla.g:445:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_5_0, grammarAccess.getJobAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getJobRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_5_0,
                      							"fr.cea.nabla.Nabla.ID");
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getJobAccess().getColonKeyword_1_2());
                      			
                    }
                    otherlv_7=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getJobAccess().getForAllKeyword_1_3());
                      			
                    }
                    // InternalNabla.g:469:4: ( (lv_iterator_8_0= ruleTimeIterator ) )
                    // InternalNabla.g:470:5: (lv_iterator_8_0= ruleTimeIterator )
                    {
                    // InternalNabla.g:470:5: (lv_iterator_8_0= ruleTimeIterator )
                    // InternalNabla.g:471:6: lv_iterator_8_0= ruleTimeIterator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJobAccess().getIteratorTimeIteratorParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_iterator_8_0=ruleTimeIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJobRule());
                      						}
                      						set(
                      							current,
                      							"iterator",
                      							lv_iterator_8_0,
                      							"fr.cea.nabla.Nabla.TimeIterator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getJobAccess().getCommaKeyword_1_5());
                      			
                    }
                    // InternalNabla.g:492:4: ( (lv_initialization_10_0= ruleInstruction ) )
                    // InternalNabla.g:493:5: (lv_initialization_10_0= ruleInstruction )
                    {
                    // InternalNabla.g:493:5: (lv_initialization_10_0= ruleInstruction )
                    // InternalNabla.g:494:6: lv_initialization_10_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJobAccess().getInitializationInstructionParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_initialization_10_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJobRule());
                      						}
                      						set(
                      							current,
                      							"initialization",
                      							lv_initialization_10_0,
                      							"fr.cea.nabla.Nabla.Instruction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getJobAccess().getCommaKeyword_1_7());
                      			
                    }
                    // InternalNabla.g:515:4: ( (lv_body_12_0= ruleInstruction ) )
                    // InternalNabla.g:516:5: (lv_body_12_0= ruleInstruction )
                    {
                    // InternalNabla.g:516:5: (lv_body_12_0= ruleInstruction )
                    // InternalNabla.g:517:6: lv_body_12_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJobAccess().getBodyInstructionParserRuleCall_1_8_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_12_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJobRule());
                      						}
                      						set(
                      							current,
                      							"body",
                      							lv_body_12_0,
                      							"fr.cea.nabla.Nabla.Instruction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleInstruction"
    // InternalNabla.g:539:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalNabla.g:539:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalNabla.g:540:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalNabla.g:546:1: ruleInstruction returns [EObject current=null] : (this_ScalarVarDefinition_0= ruleScalarVarDefinition | this_VarGroupDeclaration_1= ruleVarGroupDeclaration | ( () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}' ) | ( () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';' ) | ( () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) ) ) | ( () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )? ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject this_ScalarVarDefinition_0 = null;

        EObject this_VarGroupDeclaration_1 = null;

        EObject lv_instructions_4_0 = null;

        EObject lv_varRef_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_iterator_13_0 = null;

        EObject lv_body_15_0 = null;

        EObject lv_condition_19_0 = null;

        EObject lv_then_21_0 = null;

        EObject lv_else_23_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:552:2: ( (this_ScalarVarDefinition_0= ruleScalarVarDefinition | this_VarGroupDeclaration_1= ruleVarGroupDeclaration | ( () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}' ) | ( () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';' ) | ( () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) ) ) | ( () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )? ) ) )
            // InternalNabla.g:553:2: (this_ScalarVarDefinition_0= ruleScalarVarDefinition | this_VarGroupDeclaration_1= ruleVarGroupDeclaration | ( () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}' ) | ( () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';' ) | ( () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) ) ) | ( () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )? ) )
            {
            // InternalNabla.g:553:2: (this_ScalarVarDefinition_0= ruleScalarVarDefinition | this_VarGroupDeclaration_1= ruleVarGroupDeclaration | ( () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}' ) | ( () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';' ) | ( () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) ) ) | ( () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )? ) )
            int alt13=6;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalNabla.g:554:3: this_ScalarVarDefinition_0= ruleScalarVarDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInstructionAccess().getScalarVarDefinitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScalarVarDefinition_0=ruleScalarVarDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScalarVarDefinition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNabla.g:563:3: this_VarGroupDeclaration_1= ruleVarGroupDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInstructionAccess().getVarGroupDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarGroupDeclaration_1=ruleVarGroupDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarGroupDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNabla.g:572:3: ( () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}' )
                    {
                    // InternalNabla.g:572:3: ( () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}' )
                    // InternalNabla.g:573:4: () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}'
                    {
                    // InternalNabla.g:573:4: ()
                    // InternalNabla.g:574:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInstructionAccess().getInstructionBlockAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalNabla.g:584:4: ( (lv_instructions_4_0= ruleInstruction ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==16||LA11_0==20||LA11_0==23||LA11_0==28||LA11_0==31||(LA11_0>=56 && LA11_0<=61)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalNabla.g:585:5: (lv_instructions_4_0= ruleInstruction )
                    	    {
                    	    // InternalNabla.g:585:5: (lv_instructions_4_0= ruleInstruction )
                    	    // InternalNabla.g:586:6: lv_instructions_4_0= ruleInstruction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionsInstructionParserRuleCall_2_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_instructions_4_0=ruleInstruction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"instructions",
                    	      							lv_instructions_4_0,
                    	      							"fr.cea.nabla.Nabla.Instruction");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalNabla.g:609:3: ( () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';' )
                    {
                    // InternalNabla.g:609:3: ( () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';' )
                    // InternalNabla.g:610:4: () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';'
                    {
                    // InternalNabla.g:610:4: ()
                    // InternalNabla.g:611:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInstructionAccess().getAffectationAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:617:4: ( (lv_varRef_7_0= ruleVarRef ) )
                    // InternalNabla.g:618:5: (lv_varRef_7_0= ruleVarRef )
                    {
                    // InternalNabla.g:618:5: (lv_varRef_7_0= ruleVarRef )
                    // InternalNabla.g:619:6: lv_varRef_7_0= ruleVarRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInstructionAccess().getVarRefVarRefParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_varRef_7_0=ruleVarRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInstructionRule());
                      						}
                      						set(
                      							current,
                      							"varRef",
                      							lv_varRef_7_0,
                      							"fr.cea.nabla.Nabla.VarRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getInstructionAccess().getEqualsSignKeyword_3_2());
                      			
                    }
                    // InternalNabla.g:640:4: ( (lv_expression_9_0= ruleExpression ) )
                    // InternalNabla.g:641:5: (lv_expression_9_0= ruleExpression )
                    {
                    // InternalNabla.g:641:5: (lv_expression_9_0= ruleExpression )
                    // InternalNabla.g:642:6: lv_expression_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInstructionAccess().getExpressionExpressionParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_expression_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInstructionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_9_0,
                      							"fr.cea.nabla.Nabla.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getInstructionAccess().getSemicolonKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalNabla.g:665:3: ( () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) ) )
                    {
                    // InternalNabla.g:665:3: ( () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) ) )
                    // InternalNabla.g:666:4: () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) )
                    {
                    // InternalNabla.g:666:4: ()
                    // InternalNabla.g:667:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInstructionAccess().getLoopAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getInstructionAccess().getForAllKeyword_4_1());
                      			
                    }
                    // InternalNabla.g:677:4: ( (lv_iterator_13_0= ruleSpaceIterator ) )
                    // InternalNabla.g:678:5: (lv_iterator_13_0= ruleSpaceIterator )
                    {
                    // InternalNabla.g:678:5: (lv_iterator_13_0= ruleSpaceIterator )
                    // InternalNabla.g:679:6: lv_iterator_13_0= ruleSpaceIterator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInstructionAccess().getIteratorSpaceIteratorParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_iterator_13_0=ruleSpaceIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInstructionRule());
                      						}
                      						set(
                      							current,
                      							"iterator",
                      							lv_iterator_13_0,
                      							"fr.cea.nabla.Nabla.SpaceIterator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getInstructionAccess().getCommaKeyword_4_3());
                      			
                    }
                    // InternalNabla.g:700:4: ( (lv_body_15_0= ruleInstruction ) )
                    // InternalNabla.g:701:5: (lv_body_15_0= ruleInstruction )
                    {
                    // InternalNabla.g:701:5: (lv_body_15_0= ruleInstruction )
                    // InternalNabla.g:702:6: lv_body_15_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInstructionAccess().getBodyInstructionParserRuleCall_4_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_15_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInstructionRule());
                      						}
                      						set(
                      							current,
                      							"body",
                      							lv_body_15_0,
                      							"fr.cea.nabla.Nabla.Instruction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalNabla.g:721:3: ( () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )? )
                    {
                    // InternalNabla.g:721:3: ( () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )? )
                    // InternalNabla.g:722:4: () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )?
                    {
                    // InternalNabla.g:722:4: ()
                    // InternalNabla.g:723:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInstructionAccess().getIfAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_17=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getInstructionAccess().getIfKeyword_5_1());
                      			
                    }
                    otherlv_18=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getInstructionAccess().getLeftParenthesisKeyword_5_2());
                      			
                    }
                    // InternalNabla.g:737:4: ( (lv_condition_19_0= ruleExpression ) )
                    // InternalNabla.g:738:5: (lv_condition_19_0= ruleExpression )
                    {
                    // InternalNabla.g:738:5: (lv_condition_19_0= ruleExpression )
                    // InternalNabla.g:739:6: lv_condition_19_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInstructionAccess().getConditionExpressionParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_condition_19_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInstructionRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_19_0,
                      							"fr.cea.nabla.Nabla.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getInstructionAccess().getRightParenthesisKeyword_5_4());
                      			
                    }
                    // InternalNabla.g:760:4: ( (lv_then_21_0= ruleInstruction ) )
                    // InternalNabla.g:761:5: (lv_then_21_0= ruleInstruction )
                    {
                    // InternalNabla.g:761:5: (lv_then_21_0= ruleInstruction )
                    // InternalNabla.g:762:6: lv_then_21_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInstructionAccess().getThenInstructionParserRuleCall_5_5_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_then_21_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInstructionRule());
                      						}
                      						set(
                      							current,
                      							"then",
                      							lv_then_21_0,
                      							"fr.cea.nabla.Nabla.Instruction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNabla.g:779:4: ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred1_InternalNabla()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalNabla.g:780:5: ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) )
                            {
                            // InternalNabla.g:780:5: ( ( 'else' )=>otherlv_22= 'else' )
                            // InternalNabla.g:781:6: ( 'else' )=>otherlv_22= 'else'
                            {
                            otherlv_22=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_22, grammarAccess.getInstructionAccess().getElseKeyword_5_6_0());
                              					
                            }

                            }

                            // InternalNabla.g:787:5: ( (lv_else_23_0= ruleInstruction ) )
                            // InternalNabla.g:788:6: (lv_else_23_0= ruleInstruction )
                            {
                            // InternalNabla.g:788:6: (lv_else_23_0= ruleInstruction )
                            // InternalNabla.g:789:7: lv_else_23_0= ruleInstruction
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getInstructionAccess().getElseInstructionParserRuleCall_5_6_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_23_0=ruleInstruction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getInstructionRule());
                              							}
                              							set(
                              								current,
                              								"else",
                              								lv_else_23_0,
                              								"fr.cea.nabla.Nabla.Instruction");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleTimeIterator"
    // InternalNabla.g:812:1: entryRuleTimeIterator returns [EObject current=null] : iv_ruleTimeIterator= ruleTimeIterator EOF ;
    public final EObject entryRuleTimeIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeIterator = null;


        try {
            // InternalNabla.g:812:53: (iv_ruleTimeIterator= ruleTimeIterator EOF )
            // InternalNabla.g:813:2: iv_ruleTimeIterator= ruleTimeIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeIteratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeIterator=ruleTimeIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeIterator; 
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
    // $ANTLR end "entryRuleTimeIterator"


    // $ANTLR start "ruleTimeIterator"
    // InternalNabla.g:819:1: ruleTimeIterator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' otherlv_2= '\\u2115' ) ;
    public final EObject ruleTimeIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNabla.g:825:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' otherlv_2= '\\u2115' ) )
            // InternalNabla.g:826:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' otherlv_2= '\\u2115' )
            {
            // InternalNabla.g:826:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' otherlv_2= '\\u2115' )
            // InternalNabla.g:827:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' otherlv_2= '\\u2115'
            {
            // InternalNabla.g:827:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNabla.g:828:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNabla.g:828:4: (lv_name_0_0= RULE_ID )
            // InternalNabla.g:829:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTimeIteratorAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTimeIteratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"fr.cea.nabla.Nabla.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTimeIteratorAccess().getElementOfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTimeIteratorAccess().getDoubleStruckCapitalNKeyword_2());
              		
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
    // $ANTLR end "ruleTimeIterator"


    // $ANTLR start "entryRuleSpaceIterator"
    // InternalNabla.g:857:1: entryRuleSpaceIterator returns [EObject current=null] : iv_ruleSpaceIterator= ruleSpaceIterator EOF ;
    public final EObject entryRuleSpaceIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceIterator = null;


        try {
            // InternalNabla.g:857:54: (iv_ruleSpaceIterator= ruleSpaceIterator EOF )
            // InternalNabla.g:858:2: iv_ruleSpaceIterator= ruleSpaceIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpaceIteratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpaceIterator=ruleSpaceIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpaceIterator; 
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
    // $ANTLR end "entryRuleSpaceIterator"


    // $ANTLR start "ruleSpaceIterator"
    // InternalNabla.g:864:1: ruleSpaceIterator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' ( (lv_range_2_0= ruleSpaceIteratorRange ) ) ) ;
    public final EObject ruleSpaceIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_range_2_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:870:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' ( (lv_range_2_0= ruleSpaceIteratorRange ) ) ) )
            // InternalNabla.g:871:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' ( (lv_range_2_0= ruleSpaceIteratorRange ) ) )
            {
            // InternalNabla.g:871:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' ( (lv_range_2_0= ruleSpaceIteratorRange ) ) )
            // InternalNabla.g:872:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\u2208' ( (lv_range_2_0= ruleSpaceIteratorRange ) )
            {
            // InternalNabla.g:872:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNabla.g:873:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNabla.g:873:4: (lv_name_0_0= RULE_ID )
            // InternalNabla.g:874:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getSpaceIteratorAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSpaceIteratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"fr.cea.nabla.Nabla.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpaceIteratorAccess().getElementOfKeyword_1());
              		
            }
            // InternalNabla.g:894:3: ( (lv_range_2_0= ruleSpaceIteratorRange ) )
            // InternalNabla.g:895:4: (lv_range_2_0= ruleSpaceIteratorRange )
            {
            // InternalNabla.g:895:4: (lv_range_2_0= ruleSpaceIteratorRange )
            // InternalNabla.g:896:5: lv_range_2_0= ruleSpaceIteratorRange
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpaceIteratorAccess().getRangeSpaceIteratorRangeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_range_2_0=ruleSpaceIteratorRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpaceIteratorRule());
              					}
              					set(
              						current,
              						"range",
              						lv_range_2_0,
              						"fr.cea.nabla.Nabla.SpaceIteratorRange");
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
    // $ANTLR end "ruleSpaceIterator"


    // $ANTLR start "entryRuleSpaceIteratorRange"
    // InternalNabla.g:917:1: entryRuleSpaceIteratorRange returns [EObject current=null] : iv_ruleSpaceIteratorRange= ruleSpaceIteratorRange EOF ;
    public final EObject entryRuleSpaceIteratorRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceIteratorRange = null;


        try {
            // InternalNabla.g:917:59: (iv_ruleSpaceIteratorRange= ruleSpaceIteratorRange EOF )
            // InternalNabla.g:918:2: iv_ruleSpaceIteratorRange= ruleSpaceIteratorRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpaceIteratorRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpaceIteratorRange=ruleSpaceIteratorRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpaceIteratorRange; 
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
    // $ANTLR end "entryRuleSpaceIteratorRange"


    // $ANTLR start "ruleSpaceIteratorRange"
    // InternalNabla.g:924:1: ruleSpaceIteratorRange returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSpaceIteratorRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleSpaceIteratorRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:930:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSpaceIteratorRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )* )? otherlv_5= ')' ) )
            // InternalNabla.g:931:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSpaceIteratorRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )* )? otherlv_5= ')' )
            {
            // InternalNabla.g:931:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSpaceIteratorRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )* )? otherlv_5= ')' )
            // InternalNabla.g:932:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSpaceIteratorRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )* )? otherlv_5= ')'
            {
            // InternalNabla.g:932:3: ( (otherlv_0= RULE_ID ) )
            // InternalNabla.g:933:4: (otherlv_0= RULE_ID )
            {
            // InternalNabla.g:933:4: (otherlv_0= RULE_ID )
            // InternalNabla.g:934:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSpaceIteratorRangeRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSpaceIteratorRangeAccess().getConnectivityConnectivityCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpaceIteratorRangeAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalNabla.g:949:3: ( ( (lv_args_2_0= ruleSpaceIteratorRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=29 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNabla.g:950:4: ( (lv_args_2_0= ruleSpaceIteratorRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )*
                    {
                    // InternalNabla.g:950:4: ( (lv_args_2_0= ruleSpaceIteratorRef ) )
                    // InternalNabla.g:951:5: (lv_args_2_0= ruleSpaceIteratorRef )
                    {
                    // InternalNabla.g:951:5: (lv_args_2_0= ruleSpaceIteratorRef )
                    // InternalNabla.g:952:6: lv_args_2_0= ruleSpaceIteratorRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSpaceIteratorRangeAccess().getArgsSpaceIteratorRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_args_2_0=ruleSpaceIteratorRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSpaceIteratorRangeRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_2_0,
                      							"fr.cea.nabla.Nabla.SpaceIteratorRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNabla.g:969:4: (otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalNabla.g:970:5: otherlv_3= ',' ( (lv_args_4_0= ruleSpaceIteratorRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSpaceIteratorRangeAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNabla.g:974:5: ( (lv_args_4_0= ruleSpaceIteratorRef ) )
                    	    // InternalNabla.g:975:6: (lv_args_4_0= ruleSpaceIteratorRef )
                    	    {
                    	    // InternalNabla.g:975:6: (lv_args_4_0= ruleSpaceIteratorRef )
                    	    // InternalNabla.g:976:7: lv_args_4_0= ruleSpaceIteratorRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSpaceIteratorRangeAccess().getArgsSpaceIteratorRefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_args_4_0=ruleSpaceIteratorRef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSpaceIteratorRangeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_4_0,
                    	      								"fr.cea.nabla.Nabla.SpaceIteratorRef");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSpaceIteratorRangeAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleSpaceIteratorRange"


    // $ANTLR start "entryRuleSpaceIteratorRef"
    // InternalNabla.g:1003:1: entryRuleSpaceIteratorRef returns [EObject current=null] : iv_ruleSpaceIteratorRef= ruleSpaceIteratorRef EOF ;
    public final EObject entryRuleSpaceIteratorRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceIteratorRef = null;


        try {
            // InternalNabla.g:1003:57: (iv_ruleSpaceIteratorRef= ruleSpaceIteratorRef EOF )
            // InternalNabla.g:1004:2: iv_ruleSpaceIteratorRef= ruleSpaceIteratorRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpaceIteratorRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpaceIteratorRef=ruleSpaceIteratorRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpaceIteratorRef; 
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
    // $ANTLR end "entryRuleSpaceIteratorRef"


    // $ANTLR start "ruleSpaceIteratorRef"
    // InternalNabla.g:1010:1: ruleSpaceIteratorRef returns [EObject current=null] : ( ( ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleSpaceIteratorRef() throws RecognitionException {
        EObject current = null;

        Token lv_prev_0_0=null;
        Token lv_next_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalNabla.g:1016:2: ( ( ( ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( (otherlv_5= RULE_ID ) ) ) )
            // InternalNabla.g:1017:2: ( ( ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalNabla.g:1017:2: ( ( ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( (otherlv_5= RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalNabla.g:1018:3: ( ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // InternalNabla.g:1018:3: ( ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    // InternalNabla.g:1019:4: ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    // InternalNabla.g:1019:4: ( ( (lv_prev_0_0= '\\u25C4' ) ) | ( (lv_next_1_0= '\\u25BA' ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==29) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==30) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalNabla.g:1020:5: ( (lv_prev_0_0= '\\u25C4' ) )
                            {
                            // InternalNabla.g:1020:5: ( (lv_prev_0_0= '\\u25C4' ) )
                            // InternalNabla.g:1021:6: (lv_prev_0_0= '\\u25C4' )
                            {
                            // InternalNabla.g:1021:6: (lv_prev_0_0= '\\u25C4' )
                            // InternalNabla.g:1022:7: lv_prev_0_0= '\\u25C4'
                            {
                            lv_prev_0_0=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prev_0_0, grammarAccess.getSpaceIteratorRefAccess().getPrevBlackLeftPointingPointerKeyword_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSpaceIteratorRefRule());
                              							}
                              							setWithLastConsumed(current, "prev", true, "\u25C4");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalNabla.g:1035:5: ( (lv_next_1_0= '\\u25BA' ) )
                            {
                            // InternalNabla.g:1035:5: ( (lv_next_1_0= '\\u25BA' ) )
                            // InternalNabla.g:1036:6: (lv_next_1_0= '\\u25BA' )
                            {
                            // InternalNabla.g:1036:6: (lv_next_1_0= '\\u25BA' )
                            // InternalNabla.g:1037:7: lv_next_1_0= '\\u25BA'
                            {
                            lv_next_1_0=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_next_1_0, grammarAccess.getSpaceIteratorRefAccess().getNextBlackRightPointingPointerKeyword_0_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSpaceIteratorRefRule());
                              							}
                              							setWithLastConsumed(current, "next", true, "\u25BA");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSpaceIteratorRefAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalNabla.g:1054:4: ( (otherlv_3= RULE_ID ) )
                    // InternalNabla.g:1055:5: (otherlv_3= RULE_ID )
                    {
                    // InternalNabla.g:1055:5: (otherlv_3= RULE_ID )
                    // InternalNabla.g:1056:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSpaceIteratorRefRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorCrossReference_0_2_0());
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSpaceIteratorRefAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:1073:3: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalNabla.g:1073:3: ( (otherlv_5= RULE_ID ) )
                    // InternalNabla.g:1074:4: (otherlv_5= RULE_ID )
                    {
                    // InternalNabla.g:1074:4: (otherlv_5= RULE_ID )
                    // InternalNabla.g:1075:5: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpaceIteratorRefRule());
                      					}
                      				
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorCrossReference_1_0());
                      				
                    }

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
    // $ANTLR end "ruleSpaceIteratorRef"


    // $ANTLR start "entryRuleScalarVarDefinition"
    // InternalNabla.g:1090:1: entryRuleScalarVarDefinition returns [EObject current=null] : iv_ruleScalarVarDefinition= ruleScalarVarDefinition EOF ;
    public final EObject entryRuleScalarVarDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarVarDefinition = null;


        try {
            // InternalNabla.g:1090:60: (iv_ruleScalarVarDefinition= ruleScalarVarDefinition EOF )
            // InternalNabla.g:1091:2: iv_ruleScalarVarDefinition= ruleScalarVarDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarVarDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScalarVarDefinition=ruleScalarVarDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarVarDefinition; 
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
    // $ANTLR end "entryRuleScalarVarDefinition"


    // $ANTLR start "ruleScalarVarDefinition"
    // InternalNabla.g:1097:1: ruleScalarVarDefinition returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleBasicType ) ) ( (lv_variable_2_0= ruleScalarVar ) ) otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleScalarVarDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_defaultValue_4_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1103:2: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleBasicType ) ) ( (lv_variable_2_0= ruleScalarVar ) ) otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            // InternalNabla.g:1104:2: ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleBasicType ) ) ( (lv_variable_2_0= ruleScalarVar ) ) otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) otherlv_5= ';' )
            {
            // InternalNabla.g:1104:2: ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleBasicType ) ) ( (lv_variable_2_0= ruleScalarVar ) ) otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) otherlv_5= ';' )
            // InternalNabla.g:1105:3: ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleBasicType ) ) ( (lv_variable_2_0= ruleScalarVar ) ) otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) otherlv_5= ';'
            {
            // InternalNabla.g:1105:3: ( (lv_const_0_0= 'const' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalNabla.g:1106:4: (lv_const_0_0= 'const' )
                    {
                    // InternalNabla.g:1106:4: (lv_const_0_0= 'const' )
                    // InternalNabla.g:1107:5: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_const_0_0, grammarAccess.getScalarVarDefinitionAccess().getConstConstKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarVarDefinitionRule());
                      					}
                      					setWithLastConsumed(current, "const", true, "const");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNabla.g:1119:3: ( (lv_type_1_0= ruleBasicType ) )
            // InternalNabla.g:1120:4: (lv_type_1_0= ruleBasicType )
            {
            // InternalNabla.g:1120:4: (lv_type_1_0= ruleBasicType )
            // InternalNabla.g:1121:5: lv_type_1_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScalarVarDefinitionAccess().getTypeBasicTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScalarVarDefinitionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"fr.cea.nabla.Nabla.BasicType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNabla.g:1138:3: ( (lv_variable_2_0= ruleScalarVar ) )
            // InternalNabla.g:1139:4: (lv_variable_2_0= ruleScalarVar )
            {
            // InternalNabla.g:1139:4: (lv_variable_2_0= ruleScalarVar )
            // InternalNabla.g:1140:5: lv_variable_2_0= ruleScalarVar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScalarVarDefinitionAccess().getVariableScalarVarParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_variable_2_0=ruleScalarVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScalarVarDefinitionRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_2_0,
              						"fr.cea.nabla.Nabla.ScalarVar");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getScalarVarDefinitionAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalNabla.g:1161:3: ( (lv_defaultValue_4_0= ruleExpression ) )
            // InternalNabla.g:1162:4: (lv_defaultValue_4_0= ruleExpression )
            {
            // InternalNabla.g:1162:4: (lv_defaultValue_4_0= ruleExpression )
            // InternalNabla.g:1163:5: lv_defaultValue_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScalarVarDefinitionAccess().getDefaultValueExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_defaultValue_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScalarVarDefinitionRule());
              					}
              					set(
              						current,
              						"defaultValue",
              						lv_defaultValue_4_0,
              						"fr.cea.nabla.Nabla.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getScalarVarDefinitionAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleScalarVarDefinition"


    // $ANTLR start "entryRuleVarGroupDeclaration"
    // InternalNabla.g:1188:1: entryRuleVarGroupDeclaration returns [EObject current=null] : iv_ruleVarGroupDeclaration= ruleVarGroupDeclaration EOF ;
    public final EObject entryRuleVarGroupDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarGroupDeclaration = null;


        try {
            // InternalNabla.g:1188:60: (iv_ruleVarGroupDeclaration= ruleVarGroupDeclaration EOF )
            // InternalNabla.g:1189:2: iv_ruleVarGroupDeclaration= ruleVarGroupDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarGroupDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarGroupDeclaration=ruleVarGroupDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarGroupDeclaration; 
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
    // $ANTLR end "entryRuleVarGroupDeclaration"


    // $ANTLR start "ruleVarGroupDeclaration"
    // InternalNabla.g:1195:1: ruleVarGroupDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleBasicType ) ) ( (lv_variables_1_0= ruleVar ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVar ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleVarGroupDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1201:2: ( ( ( (lv_type_0_0= ruleBasicType ) ) ( (lv_variables_1_0= ruleVar ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVar ) ) )* otherlv_4= ';' ) )
            // InternalNabla.g:1202:2: ( ( (lv_type_0_0= ruleBasicType ) ) ( (lv_variables_1_0= ruleVar ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVar ) ) )* otherlv_4= ';' )
            {
            // InternalNabla.g:1202:2: ( ( (lv_type_0_0= ruleBasicType ) ) ( (lv_variables_1_0= ruleVar ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVar ) ) )* otherlv_4= ';' )
            // InternalNabla.g:1203:3: ( (lv_type_0_0= ruleBasicType ) ) ( (lv_variables_1_0= ruleVar ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVar ) ) )* otherlv_4= ';'
            {
            // InternalNabla.g:1203:3: ( (lv_type_0_0= ruleBasicType ) )
            // InternalNabla.g:1204:4: (lv_type_0_0= ruleBasicType )
            {
            // InternalNabla.g:1204:4: (lv_type_0_0= ruleBasicType )
            // InternalNabla.g:1205:5: lv_type_0_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarGroupDeclarationAccess().getTypeBasicTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarGroupDeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"fr.cea.nabla.Nabla.BasicType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNabla.g:1222:3: ( (lv_variables_1_0= ruleVar ) )
            // InternalNabla.g:1223:4: (lv_variables_1_0= ruleVar )
            {
            // InternalNabla.g:1223:4: (lv_variables_1_0= ruleVar )
            // InternalNabla.g:1224:5: lv_variables_1_0= ruleVar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarGroupDeclarationAccess().getVariablesVarParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_variables_1_0=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarGroupDeclarationRule());
              					}
              					add(
              						current,
              						"variables",
              						lv_variables_1_0,
              						"fr.cea.nabla.Nabla.Var");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNabla.g:1241:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVar ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalNabla.g:1242:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVar ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVarGroupDeclarationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNabla.g:1246:4: ( (lv_variables_3_0= ruleVar ) )
            	    // InternalNabla.g:1247:5: (lv_variables_3_0= ruleVar )
            	    {
            	    // InternalNabla.g:1247:5: (lv_variables_3_0= ruleVar )
            	    // InternalNabla.g:1248:6: lv_variables_3_0= ruleVar
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVarGroupDeclarationAccess().getVariablesVarParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_variables_3_0=ruleVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVarGroupDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variables",
            	      							lv_variables_3_0,
            	      							"fr.cea.nabla.Nabla.Var");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVarGroupDeclarationAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleVarGroupDeclaration"


    // $ANTLR start "entryRuleVar"
    // InternalNabla.g:1274:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalNabla.g:1274:44: (iv_ruleVar= ruleVar EOF )
            // InternalNabla.g:1275:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalNabla.g:1281:1: ruleVar returns [EObject current=null] : (this_ScalarVar_0= ruleScalarVar | this_ArrayVar_1= ruleArrayVar ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarVar_0 = null;

        EObject this_ArrayVar_1 = null;



        	enterRule();

        try {
            // InternalNabla.g:1287:2: ( (this_ScalarVar_0= ruleScalarVar | this_ArrayVar_1= ruleArrayVar ) )
            // InternalNabla.g:1288:2: (this_ScalarVar_0= ruleScalarVar | this_ArrayVar_1= ruleArrayVar )
            {
            // InternalNabla.g:1288:2: (this_ScalarVar_0= ruleScalarVar | this_ArrayVar_1= ruleArrayVar )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==13||LA20_1==21) ) {
                    alt20=1;
                }
                else if ( (LA20_1==32) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalNabla.g:1289:3: this_ScalarVar_0= ruleScalarVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVarAccess().getScalarVarParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScalarVar_0=ruleScalarVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScalarVar_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNabla.g:1298:3: this_ArrayVar_1= ruleArrayVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVarAccess().getArrayVarParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayVar_1=ruleArrayVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayVar_1;
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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleScalarVar"
    // InternalNabla.g:1310:1: entryRuleScalarVar returns [EObject current=null] : iv_ruleScalarVar= ruleScalarVar EOF ;
    public final EObject entryRuleScalarVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarVar = null;


        try {
            // InternalNabla.g:1310:50: (iv_ruleScalarVar= ruleScalarVar EOF )
            // InternalNabla.g:1311:2: iv_ruleScalarVar= ruleScalarVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScalarVar=ruleScalarVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarVar; 
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
    // $ANTLR end "entryRuleScalarVar"


    // $ANTLR start "ruleScalarVar"
    // InternalNabla.g:1317:1: ruleScalarVar returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleScalarVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalNabla.g:1323:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalNabla.g:1324:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalNabla.g:1324:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalNabla.g:1325:3: (lv_name_0_0= RULE_ID )
            {
            // InternalNabla.g:1325:3: (lv_name_0_0= RULE_ID )
            // InternalNabla.g:1326:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getScalarVarAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getScalarVarRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"fr.cea.nabla.Nabla.ID");
              			
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
    // $ANTLR end "ruleScalarVar"


    // $ANTLR start "entryRuleArrayVar"
    // InternalNabla.g:1345:1: entryRuleArrayVar returns [EObject current=null] : iv_ruleArrayVar= ruleArrayVar EOF ;
    public final EObject entryRuleArrayVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayVar = null;


        try {
            // InternalNabla.g:1345:49: (iv_ruleArrayVar= ruleArrayVar EOF )
            // InternalNabla.g:1346:2: iv_ruleArrayVar= ruleArrayVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayVar=ruleArrayVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayVar; 
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
    // $ANTLR end "entryRuleArrayVar"


    // $ANTLR start "ruleArrayVar"
    // InternalNabla.g:1352:1: ruleArrayVar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleArrayVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalNabla.g:1358:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ']' ) )
            // InternalNabla.g:1359:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ']' )
            {
            // InternalNabla.g:1359:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ']' )
            // InternalNabla.g:1360:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ']'
            {
            // InternalNabla.g:1360:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNabla.g:1361:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNabla.g:1361:4: (lv_name_0_0= RULE_ID )
            // InternalNabla.g:1362:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getArrayVarAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrayVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"fr.cea.nabla.Nabla.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayVarAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNabla.g:1382:3: ( (otherlv_2= RULE_ID ) )
            // InternalNabla.g:1383:4: (otherlv_2= RULE_ID )
            {
            // InternalNabla.g:1383:4: (otherlv_2= RULE_ID )
            // InternalNabla.g:1384:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrayVarRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getArrayVarAccess().getDimensionsConnectivityCrossReference_2_0());
              				
            }

            }


            }

            // InternalNabla.g:1395:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalNabla.g:1396:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getArrayVarAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalNabla.g:1400:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalNabla.g:1401:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalNabla.g:1401:5: (otherlv_4= RULE_ID )
            	    // InternalNabla.g:1402:6: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getArrayVarRule());
            	      						}
            	      					
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getArrayVarAccess().getDimensionsConnectivityCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArrayVarAccess().getRightSquareBracketKeyword_4());
              		
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
    // $ANTLR end "ruleArrayVar"


    // $ANTLR start "entryRuleConnectivity"
    // InternalNabla.g:1422:1: entryRuleConnectivity returns [EObject current=null] : iv_ruleConnectivity= ruleConnectivity EOF ;
    public final EObject entryRuleConnectivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectivity = null;


        try {
            // InternalNabla.g:1422:53: (iv_ruleConnectivity= ruleConnectivity EOF )
            // InternalNabla.g:1423:2: iv_ruleConnectivity= ruleConnectivity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectivityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectivity=ruleConnectivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectivity; 
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
    // $ANTLR end "entryRuleConnectivity"


    // $ANTLR start "ruleConnectivity"
    // InternalNabla.g:1429:1: ruleConnectivity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* ) | otherlv_6= '\\u2205' ) otherlv_7= ')' otherlv_8= '\\u2192' ( (lv_returnType_9_0= ruleItemArgType ) ) otherlv_10= ';' ) ;
    public final EObject ruleConnectivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_inTypes_3_0 = null;

        Enumerator lv_inTypes_5_0 = null;

        EObject lv_returnType_9_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1435:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* ) | otherlv_6= '\\u2205' ) otherlv_7= ')' otherlv_8= '\\u2192' ( (lv_returnType_9_0= ruleItemArgType ) ) otherlv_10= ';' ) )
            // InternalNabla.g:1436:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* ) | otherlv_6= '\\u2205' ) otherlv_7= ')' otherlv_8= '\\u2192' ( (lv_returnType_9_0= ruleItemArgType ) ) otherlv_10= ';' )
            {
            // InternalNabla.g:1436:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* ) | otherlv_6= '\\u2205' ) otherlv_7= ')' otherlv_8= '\\u2192' ( (lv_returnType_9_0= ruleItemArgType ) ) otherlv_10= ';' )
            // InternalNabla.g:1437:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* ) | otherlv_6= '\\u2205' ) otherlv_7= ')' otherlv_8= '\\u2192' ( (lv_returnType_9_0= ruleItemArgType ) ) otherlv_10= ';'
            {
            // InternalNabla.g:1437:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNabla.g:1438:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNabla.g:1438:4: (lv_name_0_0= RULE_ID )
            // InternalNabla.g:1439:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getConnectivityAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectivityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"fr.cea.nabla.Nabla.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectivityAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConnectivityAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalNabla.g:1463:3: ( ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* ) | otherlv_6= '\\u2205' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=62 && LA23_0<=64)) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalNabla.g:1464:4: ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* )
                    {
                    // InternalNabla.g:1464:4: ( ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )* )
                    // InternalNabla.g:1465:5: ( (lv_inTypes_3_0= ruleItemType ) ) (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )*
                    {
                    // InternalNabla.g:1465:5: ( (lv_inTypes_3_0= ruleItemType ) )
                    // InternalNabla.g:1466:6: (lv_inTypes_3_0= ruleItemType )
                    {
                    // InternalNabla.g:1466:6: (lv_inTypes_3_0= ruleItemType )
                    // InternalNabla.g:1467:7: lv_inTypes_3_0= ruleItemType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConnectivityAccess().getInTypesItemTypeEnumRuleCall_3_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_inTypes_3_0=ruleItemType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getConnectivityRule());
                      							}
                      							add(
                      								current,
                      								"inTypes",
                      								lv_inTypes_3_0,
                      								"fr.cea.nabla.Nabla.ItemType");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalNabla.g:1484:5: (otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==21) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalNabla.g:1485:6: otherlv_4= ',' ( (lv_inTypes_5_0= ruleItemType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getConnectivityAccess().getCommaKeyword_3_0_1_0());
                    	      					
                    	    }
                    	    // InternalNabla.g:1489:6: ( (lv_inTypes_5_0= ruleItemType ) )
                    	    // InternalNabla.g:1490:7: (lv_inTypes_5_0= ruleItemType )
                    	    {
                    	    // InternalNabla.g:1490:7: (lv_inTypes_5_0= ruleItemType )
                    	    // InternalNabla.g:1491:8: lv_inTypes_5_0= ruleItemType
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getConnectivityAccess().getInTypesItemTypeEnumRuleCall_3_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_inTypes_5_0=ruleItemType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getConnectivityRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"inTypes",
                    	      									lv_inTypes_5_0,
                    	      									"fr.cea.nabla.Nabla.ItemType");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:1511:4: otherlv_6= '\\u2205'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConnectivityAccess().getEmptySetKeyword_3_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConnectivityAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getConnectivityAccess().getRightwardsArrowKeyword_5());
              		
            }
            // InternalNabla.g:1524:3: ( (lv_returnType_9_0= ruleItemArgType ) )
            // InternalNabla.g:1525:4: (lv_returnType_9_0= ruleItemArgType )
            {
            // InternalNabla.g:1525:4: (lv_returnType_9_0= ruleItemArgType )
            // InternalNabla.g:1526:5: lv_returnType_9_0= ruleItemArgType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectivityAccess().getReturnTypeItemArgTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_returnType_9_0=ruleItemArgType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectivityRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_9_0,
              						"fr.cea.nabla.Nabla.ItemArgType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getConnectivityAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleConnectivity"


    // $ANTLR start "entryRuleItemArgType"
    // InternalNabla.g:1551:1: entryRuleItemArgType returns [EObject current=null] : iv_ruleItemArgType= ruleItemArgType EOF ;
    public final EObject entryRuleItemArgType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemArgType = null;


        try {
            // InternalNabla.g:1551:52: (iv_ruleItemArgType= ruleItemArgType EOF )
            // InternalNabla.g:1552:2: iv_ruleItemArgType= ruleItemArgType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemArgTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemArgType=ruleItemArgType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemArgType; 
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
    // $ANTLR end "entryRuleItemArgType"


    // $ANTLR start "ruleItemArgType"
    // InternalNabla.g:1558:1: ruleItemArgType returns [EObject current=null] : ( ( ( (lv_multiple_0_0= '{' ) ) ( (lv_type_1_0= ruleItemType ) ) otherlv_2= '}' ) | ( (lv_type_3_0= ruleItemType ) ) ) ;
    public final EObject ruleItemArgType() throws RecognitionException {
        EObject current = null;

        Token lv_multiple_0_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1564:2: ( ( ( ( (lv_multiple_0_0= '{' ) ) ( (lv_type_1_0= ruleItemType ) ) otherlv_2= '}' ) | ( (lv_type_3_0= ruleItemType ) ) ) )
            // InternalNabla.g:1565:2: ( ( ( (lv_multiple_0_0= '{' ) ) ( (lv_type_1_0= ruleItemType ) ) otherlv_2= '}' ) | ( (lv_type_3_0= ruleItemType ) ) )
            {
            // InternalNabla.g:1565:2: ( ( ( (lv_multiple_0_0= '{' ) ) ( (lv_type_1_0= ruleItemType ) ) otherlv_2= '}' ) | ( (lv_type_3_0= ruleItemType ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=62 && LA24_0<=64)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalNabla.g:1566:3: ( ( (lv_multiple_0_0= '{' ) ) ( (lv_type_1_0= ruleItemType ) ) otherlv_2= '}' )
                    {
                    // InternalNabla.g:1566:3: ( ( (lv_multiple_0_0= '{' ) ) ( (lv_type_1_0= ruleItemType ) ) otherlv_2= '}' )
                    // InternalNabla.g:1567:4: ( (lv_multiple_0_0= '{' ) ) ( (lv_type_1_0= ruleItemType ) ) otherlv_2= '}'
                    {
                    // InternalNabla.g:1567:4: ( (lv_multiple_0_0= '{' ) )
                    // InternalNabla.g:1568:5: (lv_multiple_0_0= '{' )
                    {
                    // InternalNabla.g:1568:5: (lv_multiple_0_0= '{' )
                    // InternalNabla.g:1569:6: lv_multiple_0_0= '{'
                    {
                    lv_multiple_0_0=(Token)match(input,16,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_multiple_0_0, grammarAccess.getItemArgTypeAccess().getMultipleLeftCurlyBracketKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getItemArgTypeRule());
                      						}
                      						setWithLastConsumed(current, "multiple", true, "{");
                      					
                    }

                    }


                    }

                    // InternalNabla.g:1581:4: ( (lv_type_1_0= ruleItemType ) )
                    // InternalNabla.g:1582:5: (lv_type_1_0= ruleItemType )
                    {
                    // InternalNabla.g:1582:5: (lv_type_1_0= ruleItemType )
                    // InternalNabla.g:1583:6: lv_type_1_0= ruleItemType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getItemArgTypeAccess().getTypeItemTypeEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_type_1_0=ruleItemType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getItemArgTypeRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_1_0,
                      							"fr.cea.nabla.Nabla.ItemType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getItemArgTypeAccess().getRightCurlyBracketKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:1606:3: ( (lv_type_3_0= ruleItemType ) )
                    {
                    // InternalNabla.g:1606:3: ( (lv_type_3_0= ruleItemType ) )
                    // InternalNabla.g:1607:4: (lv_type_3_0= ruleItemType )
                    {
                    // InternalNabla.g:1607:4: (lv_type_3_0= ruleItemType )
                    // InternalNabla.g:1608:5: lv_type_3_0= ruleItemType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getItemArgTypeAccess().getTypeItemTypeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleItemType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getItemArgTypeRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_3_0,
                      						"fr.cea.nabla.Nabla.ItemType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // $ANTLR end "ruleItemArgType"


    // $ANTLR start "entryRuleFunction"
    // InternalNabla.g:1629:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalNabla.g:1629:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalNabla.g:1630:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalNabla.g:1636:1: ruleFunction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleFunctionArg ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_argGroups_3_0 = null;

        EObject lv_argGroups_5_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1642:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleFunctionArg ) ) )* otherlv_6= ';' ) )
            // InternalNabla.g:1643:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleFunctionArg ) ) )* otherlv_6= ';' )
            {
            // InternalNabla.g:1643:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleFunctionArg ) ) )* otherlv_6= ';' )
            // InternalNabla.g:1644:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleFunctionArg ) ) )* otherlv_6= ';'
            {
            // InternalNabla.g:1644:3: ()
            // InternalNabla.g:1645:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionAccess().getFunctionAction_0(),
              					current);
              			
            }

            }

            // InternalNabla.g:1651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNabla.g:1652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNabla.g:1652:4: (lv_name_1_0= RULE_ID )
            // InternalNabla.g:1653:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"fr.cea.nabla.Nabla.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
              		
            }
            // InternalNabla.g:1673:3: ( (lv_argGroups_3_0= ruleFunctionArg ) )
            // InternalNabla.g:1674:4: (lv_argGroups_3_0= ruleFunctionArg )
            {
            // InternalNabla.g:1674:4: (lv_argGroups_3_0= ruleFunctionArg )
            // InternalNabla.g:1675:5: lv_argGroups_3_0= ruleFunctionArg
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getArgGroupsFunctionArgParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_argGroups_3_0=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					add(
              						current,
              						"argGroups",
              						lv_argGroups_3_0,
              						"fr.cea.nabla.Nabla.FunctionArg");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNabla.g:1692:3: (otherlv_4= ',' ( (lv_argGroups_5_0= ruleFunctionArg ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalNabla.g:1693:4: otherlv_4= ',' ( (lv_argGroups_5_0= ruleFunctionArg ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalNabla.g:1697:4: ( (lv_argGroups_5_0= ruleFunctionArg ) )
            	    // InternalNabla.g:1698:5: (lv_argGroups_5_0= ruleFunctionArg )
            	    {
            	    // InternalNabla.g:1698:5: (lv_argGroups_5_0= ruleFunctionArg )
            	    // InternalNabla.g:1699:6: lv_argGroups_5_0= ruleFunctionArg
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFunctionAccess().getArgGroupsFunctionArgParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_argGroups_5_0=ruleFunctionArg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"argGroups",
            	      							lv_argGroups_5_0,
            	      							"fr.cea.nabla.Nabla.FunctionArg");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionArg"
    // InternalNabla.g:1725:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // InternalNabla.g:1725:52: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // InternalNabla.g:1726:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
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
    // $ANTLR end "entryRuleFunctionArg"


    // $ANTLR start "ruleFunctionArg"
    // InternalNabla.g:1732:1: ruleFunctionArg returns [EObject current=null] : (otherlv_0= '(' ( ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* ) | otherlv_4= '\\u2205' ) otherlv_5= ')' otherlv_6= '\\u2192' ( (lv_returnType_7_0= ruleBasicType ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_inTypes_1_0 = null;

        Enumerator lv_inTypes_3_0 = null;

        Enumerator lv_returnType_7_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1738:2: ( (otherlv_0= '(' ( ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* ) | otherlv_4= '\\u2205' ) otherlv_5= ')' otherlv_6= '\\u2192' ( (lv_returnType_7_0= ruleBasicType ) ) ) )
            // InternalNabla.g:1739:2: (otherlv_0= '(' ( ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* ) | otherlv_4= '\\u2205' ) otherlv_5= ')' otherlv_6= '\\u2192' ( (lv_returnType_7_0= ruleBasicType ) ) )
            {
            // InternalNabla.g:1739:2: (otherlv_0= '(' ( ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* ) | otherlv_4= '\\u2205' ) otherlv_5= ')' otherlv_6= '\\u2192' ( (lv_returnType_7_0= ruleBasicType ) ) )
            // InternalNabla.g:1740:3: otherlv_0= '(' ( ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* ) | otherlv_4= '\\u2205' ) otherlv_5= ')' otherlv_6= '\\u2192' ( (lv_returnType_7_0= ruleBasicType ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionArgAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalNabla.g:1744:3: ( ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* ) | otherlv_4= '\\u2205' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28||(LA27_0>=56 && LA27_0<=61)) ) {
                alt27=1;
            }
            else if ( (LA27_0==34) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalNabla.g:1745:4: ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* )
                    {
                    // InternalNabla.g:1745:4: ( ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )* )
                    // InternalNabla.g:1746:5: ( (lv_inTypes_1_0= ruleBasicType ) ) (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )*
                    {
                    // InternalNabla.g:1746:5: ( (lv_inTypes_1_0= ruleBasicType ) )
                    // InternalNabla.g:1747:6: (lv_inTypes_1_0= ruleBasicType )
                    {
                    // InternalNabla.g:1747:6: (lv_inTypes_1_0= ruleBasicType )
                    // InternalNabla.g:1748:7: lv_inTypes_1_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionArgAccess().getInTypesBasicTypeEnumRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_inTypes_1_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionArgRule());
                      							}
                      							add(
                      								current,
                      								"inTypes",
                      								lv_inTypes_1_0,
                      								"fr.cea.nabla.Nabla.BasicType");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalNabla.g:1765:5: (otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==21) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalNabla.g:1766:6: otherlv_2= ',' ( (lv_inTypes_3_0= ruleBasicType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getFunctionArgAccess().getCommaKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    // InternalNabla.g:1770:6: ( (lv_inTypes_3_0= ruleBasicType ) )
                    	    // InternalNabla.g:1771:7: (lv_inTypes_3_0= ruleBasicType )
                    	    {
                    	    // InternalNabla.g:1771:7: (lv_inTypes_3_0= ruleBasicType )
                    	    // InternalNabla.g:1772:8: lv_inTypes_3_0= ruleBasicType
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFunctionArgAccess().getInTypesBasicTypeEnumRuleCall_1_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_inTypes_3_0=ruleBasicType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getFunctionArgRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"inTypes",
                    	      									lv_inTypes_3_0,
                    	      									"fr.cea.nabla.Nabla.BasicType");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;
                case 2 :
                    // InternalNabla.g:1792:4: otherlv_4= '\\u2205'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFunctionArgAccess().getEmptySetKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionArgAccess().getRightParenthesisKeyword_2());
              		
            }
            otherlv_6=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionArgAccess().getRightwardsArrowKeyword_3());
              		
            }
            // InternalNabla.g:1805:3: ( (lv_returnType_7_0= ruleBasicType ) )
            // InternalNabla.g:1806:4: (lv_returnType_7_0= ruleBasicType )
            {
            // InternalNabla.g:1806:4: (lv_returnType_7_0= ruleBasicType )
            // InternalNabla.g:1807:5: lv_returnType_7_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionArgAccess().getReturnTypeBasicTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_7_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionArgRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_7_0,
              						"fr.cea.nabla.Nabla.BasicType");
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
    // $ANTLR end "ruleFunctionArg"


    // $ANTLR start "entryRuleReduction"
    // InternalNabla.g:1828:1: entryRuleReduction returns [EObject current=null] : iv_ruleReduction= ruleReduction EOF ;
    public final EObject entryRuleReduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReduction = null;


        try {
            // InternalNabla.g:1828:50: (iv_ruleReduction= ruleReduction EOF )
            // InternalNabla.g:1829:2: iv_ruleReduction= ruleReduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReduction=ruleReduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReduction; 
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
    // $ANTLR end "entryRuleReduction"


    // $ANTLR start "ruleReduction"
    // InternalNabla.g:1835:1: ruleReduction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleReductionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleReductionArg ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleReduction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_argGroups_3_0 = null;

        EObject lv_argGroups_5_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1841:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleReductionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleReductionArg ) ) )* otherlv_6= ';' ) )
            // InternalNabla.g:1842:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleReductionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleReductionArg ) ) )* otherlv_6= ';' )
            {
            // InternalNabla.g:1842:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleReductionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleReductionArg ) ) )* otherlv_6= ';' )
            // InternalNabla.g:1843:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_argGroups_3_0= ruleReductionArg ) ) (otherlv_4= ',' ( (lv_argGroups_5_0= ruleReductionArg ) ) )* otherlv_6= ';'
            {
            // InternalNabla.g:1843:3: ()
            // InternalNabla.g:1844:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReductionAccess().getReductionAction_0(),
              					current);
              			
            }

            }

            // InternalNabla.g:1850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNabla.g:1851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNabla.g:1851:4: (lv_name_1_0= RULE_ID )
            // InternalNabla.g:1852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getReductionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReductionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"fr.cea.nabla.Nabla.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReductionAccess().getColonKeyword_2());
              		
            }
            // InternalNabla.g:1872:3: ( (lv_argGroups_3_0= ruleReductionArg ) )
            // InternalNabla.g:1873:4: (lv_argGroups_3_0= ruleReductionArg )
            {
            // InternalNabla.g:1873:4: (lv_argGroups_3_0= ruleReductionArg )
            // InternalNabla.g:1874:5: lv_argGroups_3_0= ruleReductionArg
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReductionAccess().getArgGroupsReductionArgParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_argGroups_3_0=ruleReductionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReductionRule());
              					}
              					add(
              						current,
              						"argGroups",
              						lv_argGroups_3_0,
              						"fr.cea.nabla.Nabla.ReductionArg");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNabla.g:1891:3: (otherlv_4= ',' ( (lv_argGroups_5_0= ruleReductionArg ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalNabla.g:1892:4: otherlv_4= ',' ( (lv_argGroups_5_0= ruleReductionArg ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getReductionAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalNabla.g:1896:4: ( (lv_argGroups_5_0= ruleReductionArg ) )
            	    // InternalNabla.g:1897:5: (lv_argGroups_5_0= ruleReductionArg )
            	    {
            	    // InternalNabla.g:1897:5: (lv_argGroups_5_0= ruleReductionArg )
            	    // InternalNabla.g:1898:6: lv_argGroups_5_0= ruleReductionArg
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReductionAccess().getArgGroupsReductionArgParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_argGroups_5_0=ruleReductionArg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReductionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"argGroups",
            	      							lv_argGroups_5_0,
            	      							"fr.cea.nabla.Nabla.ReductionArg");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getReductionAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleReduction"


    // $ANTLR start "entryRuleReductionArg"
    // InternalNabla.g:1924:1: entryRuleReductionArg returns [EObject current=null] : iv_ruleReductionArg= ruleReductionArg EOF ;
    public final EObject entryRuleReductionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReductionArg = null;


        try {
            // InternalNabla.g:1924:53: (iv_ruleReductionArg= ruleReductionArg EOF )
            // InternalNabla.g:1925:2: iv_ruleReductionArg= ruleReductionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReductionArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReductionArg=ruleReductionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReductionArg; 
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
    // $ANTLR end "entryRuleReductionArg"


    // $ANTLR start "ruleReductionArg"
    // InternalNabla.g:1931:1: ruleReductionArg returns [EObject current=null] : (otherlv_0= '(' ( (lv_seed_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_collectionType_3_0= ruleBasicType ) ) otherlv_4= ')' otherlv_5= '\\u2192' ( (lv_returnType_6_0= ruleBasicType ) ) ) ;
    public final EObject ruleReductionArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_seed_1_0 = null;

        Enumerator lv_collectionType_3_0 = null;

        Enumerator lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:1937:2: ( (otherlv_0= '(' ( (lv_seed_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_collectionType_3_0= ruleBasicType ) ) otherlv_4= ')' otherlv_5= '\\u2192' ( (lv_returnType_6_0= ruleBasicType ) ) ) )
            // InternalNabla.g:1938:2: (otherlv_0= '(' ( (lv_seed_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_collectionType_3_0= ruleBasicType ) ) otherlv_4= ')' otherlv_5= '\\u2192' ( (lv_returnType_6_0= ruleBasicType ) ) )
            {
            // InternalNabla.g:1938:2: (otherlv_0= '(' ( (lv_seed_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_collectionType_3_0= ruleBasicType ) ) otherlv_4= ')' otherlv_5= '\\u2192' ( (lv_returnType_6_0= ruleBasicType ) ) )
            // InternalNabla.g:1939:3: otherlv_0= '(' ( (lv_seed_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_collectionType_3_0= ruleBasicType ) ) otherlv_4= ')' otherlv_5= '\\u2192' ( (lv_returnType_6_0= ruleBasicType ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReductionArgAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalNabla.g:1943:3: ( (lv_seed_1_0= ruleExpression ) )
            // InternalNabla.g:1944:4: (lv_seed_1_0= ruleExpression )
            {
            // InternalNabla.g:1944:4: (lv_seed_1_0= ruleExpression )
            // InternalNabla.g:1945:5: lv_seed_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReductionArgAccess().getSeedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_seed_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReductionArgRule());
              					}
              					set(
              						current,
              						"seed",
              						lv_seed_1_0,
              						"fr.cea.nabla.Nabla.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReductionArgAccess().getCommaKeyword_2());
              		
            }
            // InternalNabla.g:1966:3: ( (lv_collectionType_3_0= ruleBasicType ) )
            // InternalNabla.g:1967:4: (lv_collectionType_3_0= ruleBasicType )
            {
            // InternalNabla.g:1967:4: (lv_collectionType_3_0= ruleBasicType )
            // InternalNabla.g:1968:5: lv_collectionType_3_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReductionArgAccess().getCollectionTypeBasicTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_collectionType_3_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReductionArgRule());
              					}
              					set(
              						current,
              						"collectionType",
              						lv_collectionType_3_0,
              						"fr.cea.nabla.Nabla.BasicType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getReductionArgAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getReductionArgAccess().getRightwardsArrowKeyword_5());
              		
            }
            // InternalNabla.g:1993:3: ( (lv_returnType_6_0= ruleBasicType ) )
            // InternalNabla.g:1994:4: (lv_returnType_6_0= ruleBasicType )
            {
            // InternalNabla.g:1994:4: (lv_returnType_6_0= ruleBasicType )
            // InternalNabla.g:1995:5: lv_returnType_6_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReductionArgAccess().getReturnTypeBasicTypeEnumRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReductionArgRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"fr.cea.nabla.Nabla.BasicType");
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
    // $ANTLR end "ruleReductionArg"


    // $ANTLR start "entryRuleExpression"
    // InternalNabla.g:2016:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalNabla.g:2016:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalNabla.g:2017:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalNabla.g:2023:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:2029:2: (this_Or_0= ruleOr )
            // InternalNabla.g:2030:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
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


    // $ANTLR start "entryRuleOr"
    // InternalNabla.g:2041:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalNabla.g:2041:43: (iv_ruleOr= ruleOr EOF )
            // InternalNabla.g:2042:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalNabla.g:2048:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:2054:2: ( (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalNabla.g:2055:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalNabla.g:2055:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalNabla.g:2056:3: this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNabla.g:2064:3: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalNabla.g:2065:4: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalNabla.g:2065:4: ()
            	    // InternalNabla.g:2066:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNabla.g:2072:4: ( (lv_op_2_0= '||' ) )
            	    // InternalNabla.g:2073:5: (lv_op_2_0= '||' )
            	    {
            	    // InternalNabla.g:2073:5: (lv_op_2_0= '||' )
            	    // InternalNabla.g:2074:6: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNabla.g:2086:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalNabla.g:2087:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalNabla.g:2087:5: (lv_right_3_0= ruleAnd )
            	    // InternalNabla.g:2088:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"fr.cea.nabla.Nabla.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalNabla.g:2110:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalNabla.g:2110:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalNabla.g:2111:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalNabla.g:2117:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:2123:2: ( (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalNabla.g:2124:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalNabla.g:2124:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalNabla.g:2125:3: this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNabla.g:2133:3: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalNabla.g:2134:4: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalNabla.g:2134:4: ()
            	    // InternalNabla.g:2135:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNabla.g:2141:4: ( (lv_op_2_0= '&&' ) )
            	    // InternalNabla.g:2142:5: (lv_op_2_0= '&&' )
            	    {
            	    // InternalNabla.g:2142:5: (lv_op_2_0= '&&' )
            	    // InternalNabla.g:2143:6: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,37,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAndRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNabla.g:2155:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalNabla.g:2156:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalNabla.g:2156:5: (lv_right_3_0= ruleEquality )
            	    // InternalNabla.g:2157:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"fr.cea.nabla.Nabla.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalNabla.g:2179:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalNabla.g:2179:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalNabla.g:2180:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalNabla.g:2186:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:2192:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalNabla.g:2193:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalNabla.g:2193:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalNabla.g:2194:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNabla.g:2202:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=38 && LA32_0<=39)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalNabla.g:2203:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalNabla.g:2203:4: ()
            	    // InternalNabla.g:2204:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNabla.g:2210:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalNabla.g:2211:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalNabla.g:2211:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalNabla.g:2212:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalNabla.g:2212:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==38) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==39) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalNabla.g:2213:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,38,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNabla.g:2224:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,39,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalNabla.g:2237:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalNabla.g:2238:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalNabla.g:2238:5: (lv_right_3_0= ruleComparison )
            	    // InternalNabla.g:2239:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"fr.cea.nabla.Nabla.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "entryRuleComparison"
    // InternalNabla.g:2261:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalNabla.g:2261:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalNabla.g:2262:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalNabla.g:2268:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:2274:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalNabla.g:2275:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalNabla.g:2275:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalNabla.g:2276:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNabla.g:2284:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=40 && LA34_0<=43)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalNabla.g:2285:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalNabla.g:2285:4: ()
            	    // InternalNabla.g:2286:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNabla.g:2292:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalNabla.g:2293:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalNabla.g:2293:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalNabla.g:2294:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalNabla.g:2294:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt33=4;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // InternalNabla.g:2295:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNabla.g:2306:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalNabla.g:2317:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,42,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalNabla.g:2328:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,43,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalNabla.g:2341:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalNabla.g:2342:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalNabla.g:2342:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalNabla.g:2343:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"fr.cea.nabla.Nabla.PlusOrMinus");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalNabla.g:2365:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalNabla.g:2365:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalNabla.g:2366:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalNabla.g:2372:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:2378:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalNabla.g:2379:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalNabla.g:2379:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalNabla.g:2380:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNabla.g:2388:3: ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=44 && LA36_0<=45)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalNabla.g:2389:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalNabla.g:2389:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==44) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==45) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalNabla.g:2390:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            {
            	            // InternalNabla.g:2390:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            // InternalNabla.g:2391:6: () ( (lv_op_2_0= '+' ) )
            	            {
            	            // InternalNabla.g:2391:6: ()
            	            // InternalNabla.g:2392:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalNabla.g:2398:6: ( (lv_op_2_0= '+' ) )
            	            // InternalNabla.g:2399:7: (lv_op_2_0= '+' )
            	            {
            	            // InternalNabla.g:2399:7: (lv_op_2_0= '+' )
            	            // InternalNabla.g:2400:8: lv_op_2_0= '+'
            	            {
            	            lv_op_2_0=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_0, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_0, "+");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalNabla.g:2414:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            {
            	            // InternalNabla.g:2414:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            // InternalNabla.g:2415:6: () ( (lv_op_4_0= '-' ) )
            	            {
            	            // InternalNabla.g:2415:6: ()
            	            // InternalNabla.g:2416:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalNabla.g:2422:6: ( (lv_op_4_0= '-' ) )
            	            // InternalNabla.g:2423:7: (lv_op_4_0= '-' )
            	            {
            	            // InternalNabla.g:2423:7: (lv_op_4_0= '-' )
            	            // InternalNabla.g:2424:8: lv_op_4_0= '-'
            	            {
            	            lv_op_4_0=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_4_0, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_4_0, "-");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalNabla.g:2438:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalNabla.g:2439:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalNabla.g:2439:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalNabla.g:2440:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"fr.cea.nabla.Nabla.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalNabla.g:2462:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalNabla.g:2462:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalNabla.g:2463:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalNabla.g:2469:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:2475:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalNabla.g:2476:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalNabla.g:2476:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalNabla.g:2477:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNabla.g:2485:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=46 && LA38_0<=47)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalNabla.g:2486:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalNabla.g:2486:4: ()
            	    // InternalNabla.g:2487:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNabla.g:2493:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalNabla.g:2494:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalNabla.g:2494:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalNabla.g:2495:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalNabla.g:2495:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==46) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==47) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalNabla.g:2496:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulOrDivRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNabla.g:2507:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulOrDivRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalNabla.g:2520:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalNabla.g:2521:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalNabla.g:2521:5: (lv_right_3_0= rulePrimary )
            	    // InternalNabla.g:2522:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"fr.cea.nabla.Nabla.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalNabla.g:2544:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalNabla.g:2544:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalNabla.g:2545:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalNabla.g:2551:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_9_0 = null;

        EObject this_Atomic_10 = null;



        	enterRule();

        try {
            // InternalNabla.g:2557:2: ( ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic ) )
            // InternalNabla.g:2558:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic )
            {
            // InternalNabla.g:2558:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt39=1;
                }
                break;
            case 45:
                {
                alt39=2;
                }
                break;
            case 48:
                {
                alt39=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_REAL:
            case 16:
            case 28:
            case 49:
            case 50:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalNabla.g:2559:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalNabla.g:2559:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalNabla.g:2560:4: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    // InternalNabla.g:2560:4: ()
                    // InternalNabla.g:2561:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getParenthesisAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalNabla.g:2571:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalNabla.g:2572:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalNabla.g:2572:5: (lv_expression_2_0= ruleExpression )
                    // InternalNabla.g:2573:6: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"fr.cea.nabla.Nabla.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:2596:3: ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) )
                    {
                    // InternalNabla.g:2596:3: ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) )
                    // InternalNabla.g:2597:4: () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) )
                    {
                    // InternalNabla.g:2597:4: ()
                    // InternalNabla.g:2598:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getUnaryMinusAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalNabla.g:2608:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalNabla.g:2609:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalNabla.g:2609:5: (lv_expression_6_0= rulePrimary )
                    // InternalNabla.g:2610:6: lv_expression_6_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_6_0,
                      							"fr.cea.nabla.Nabla.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNabla.g:2629:3: ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) )
                    {
                    // InternalNabla.g:2629:3: ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) )
                    // InternalNabla.g:2630:4: () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) )
                    {
                    // InternalNabla.g:2630:4: ()
                    // InternalNabla.g:2631:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,48,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_2_1());
                      			
                    }
                    // InternalNabla.g:2641:4: ( (lv_expression_9_0= rulePrimary ) )
                    // InternalNabla.g:2642:5: (lv_expression_9_0= rulePrimary )
                    {
                    // InternalNabla.g:2642:5: (lv_expression_9_0= rulePrimary )
                    // InternalNabla.g:2643:6: lv_expression_9_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_9_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_9_0,
                      							"fr.cea.nabla.Nabla.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalNabla.g:2662:3: this_Atomic_10= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_10=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_10;
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


    // $ANTLR start "entryRuleAtomic"
    // InternalNabla.g:2674:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalNabla.g:2674:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalNabla.g:2675:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalNabla.g:2681:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | this_Real2Constant_4= ruleReal2Constant | this_Real3Constant_5= ruleReal3Constant | ( () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' ) ) | ( () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}' ) | ( () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}' ) | ( () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')' ) | ( () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue' ) | ( () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue' ) | ( () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')' ) | ( () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')' ) | this_VarRef_49= ruleVarRef ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token lv_value_26_0=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        EObject this_Real2Constant_4 = null;

        EObject this_Real3Constant_5 = null;

        EObject lv_x_11_0 = null;

        EObject lv_y_13_0 = null;

        EObject lv_x_17_0 = null;

        EObject lv_y_19_0 = null;

        EObject lv_z_21_0 = null;

        Enumerator lv_type_24_0 = null;

        Enumerator lv_type_29_0 = null;

        Enumerator lv_type_32_0 = null;

        EObject lv_args_37_0 = null;

        EObject lv_args_39_0 = null;

        EObject lv_iterator_44_0 = null;

        EObject lv_arg_47_0 = null;

        EObject this_VarRef_49 = null;



        	enterRule();

        try {
            // InternalNabla.g:2687:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | this_Real2Constant_4= ruleReal2Constant | this_Real3Constant_5= ruleReal3Constant | ( () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' ) ) | ( () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}' ) | ( () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}' ) | ( () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')' ) | ( () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue' ) | ( () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue' ) | ( () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')' ) | ( () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')' ) | this_VarRef_49= ruleVarRef ) )
            // InternalNabla.g:2688:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | this_Real2Constant_4= ruleReal2Constant | this_Real3Constant_5= ruleReal3Constant | ( () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' ) ) | ( () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}' ) | ( () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}' ) | ( () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')' ) | ( () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue' ) | ( () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue' ) | ( () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')' ) | ( () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')' ) | this_VarRef_49= ruleVarRef )
            {
            // InternalNabla.g:2688:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | this_Real2Constant_4= ruleReal2Constant | this_Real3Constant_5= ruleReal3Constant | ( () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' ) ) | ( () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}' ) | ( () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}' ) | ( () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')' ) | ( () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue' ) | ( () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue' ) | ( () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')' ) | ( () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')' ) | this_VarRef_49= ruleVarRef )
            int alt43=13;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalNabla.g:2689:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalNabla.g:2689:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalNabla.g:2690:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalNabla.g:2690:4: ()
                    // InternalNabla.g:2691:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:2697:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalNabla.g:2698:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalNabla.g:2698:5: (lv_value_1_0= RULE_INT )
                    // InternalNabla.g:2699:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:2717:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    {
                    // InternalNabla.g:2717:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    // InternalNabla.g:2718:4: () ( (lv_value_3_0= RULE_REAL ) )
                    {
                    // InternalNabla.g:2718:4: ()
                    // InternalNabla.g:2719:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getRealConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:2725:4: ( (lv_value_3_0= RULE_REAL ) )
                    // InternalNabla.g:2726:5: (lv_value_3_0= RULE_REAL )
                    {
                    // InternalNabla.g:2726:5: (lv_value_3_0= RULE_REAL )
                    // InternalNabla.g:2727:6: lv_value_3_0= RULE_REAL
                    {
                    lv_value_3_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"fr.cea.nabla.Nabla.REAL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNabla.g:2745:3: this_Real2Constant_4= ruleReal2Constant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getReal2ConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Real2Constant_4=ruleReal2Constant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Real2Constant_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNabla.g:2754:3: this_Real3Constant_5= ruleReal3Constant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getReal3ConstantParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Real3Constant_5=ruleReal3Constant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Real3Constant_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNabla.g:2763:3: ( () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' ) )
                    {
                    // InternalNabla.g:2763:3: ( () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' ) )
                    // InternalNabla.g:2764:4: () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' )
                    {
                    // InternalNabla.g:2764:4: ()
                    // InternalNabla.g:2765:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBoolConstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:2771:4: ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==49) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==50) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalNabla.g:2772:5: ( (lv_value_7_0= 'true' ) )
                            {
                            // InternalNabla.g:2772:5: ( (lv_value_7_0= 'true' ) )
                            // InternalNabla.g:2773:6: (lv_value_7_0= 'true' )
                            {
                            // InternalNabla.g:2773:6: (lv_value_7_0= 'true' )
                            // InternalNabla.g:2774:7: lv_value_7_0= 'true'
                            {
                            lv_value_7_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalNabla.g:2787:5: otherlv_8= 'false'
                            {
                            otherlv_8=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getFalseKeyword_4_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalNabla.g:2794:3: ( () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}' )
                    {
                    // InternalNabla.g:2794:3: ( () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}' )
                    // InternalNabla.g:2795:4: () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}'
                    {
                    // InternalNabla.g:2795:4: ()
                    // InternalNabla.g:2796:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getReal2x2ConstantAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_5_1());
                      			
                    }
                    // InternalNabla.g:2806:4: ( (lv_x_11_0= ruleReal2Constant ) )
                    // InternalNabla.g:2807:5: (lv_x_11_0= ruleReal2Constant )
                    {
                    // InternalNabla.g:2807:5: (lv_x_11_0= ruleReal2Constant )
                    // InternalNabla.g:2808:6: lv_x_11_0= ruleReal2Constant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getXReal2ConstantParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_x_11_0=ruleReal2Constant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"x",
                      							lv_x_11_0,
                      							"fr.cea.nabla.Nabla.Real2Constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getAtomicAccess().getCommaKeyword_5_3());
                      			
                    }
                    // InternalNabla.g:2829:4: ( (lv_y_13_0= ruleReal2Constant ) )
                    // InternalNabla.g:2830:5: (lv_y_13_0= ruleReal2Constant )
                    {
                    // InternalNabla.g:2830:5: (lv_y_13_0= ruleReal2Constant )
                    // InternalNabla.g:2831:6: lv_y_13_0= ruleReal2Constant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getYReal2ConstantParserRuleCall_5_4_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_y_13_0=ruleReal2Constant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"y",
                      							lv_y_13_0,
                      							"fr.cea.nabla.Nabla.Real2Constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_5_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalNabla.g:2854:3: ( () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}' )
                    {
                    // InternalNabla.g:2854:3: ( () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}' )
                    // InternalNabla.g:2855:4: () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}'
                    {
                    // InternalNabla.g:2855:4: ()
                    // InternalNabla.g:2856:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getReal3x3ConstantAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_16=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalNabla.g:2866:4: ( (lv_x_17_0= ruleReal3Constant ) )
                    // InternalNabla.g:2867:5: (lv_x_17_0= ruleReal3Constant )
                    {
                    // InternalNabla.g:2867:5: (lv_x_17_0= ruleReal3Constant )
                    // InternalNabla.g:2868:6: lv_x_17_0= ruleReal3Constant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getXReal3ConstantParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_x_17_0=ruleReal3Constant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"x",
                      							lv_x_17_0,
                      							"fr.cea.nabla.Nabla.Real3Constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getAtomicAccess().getCommaKeyword_6_3());
                      			
                    }
                    // InternalNabla.g:2889:4: ( (lv_y_19_0= ruleReal3Constant ) )
                    // InternalNabla.g:2890:5: (lv_y_19_0= ruleReal3Constant )
                    {
                    // InternalNabla.g:2890:5: (lv_y_19_0= ruleReal3Constant )
                    // InternalNabla.g:2891:6: lv_y_19_0= ruleReal3Constant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getYReal3ConstantParserRuleCall_6_4_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_y_19_0=ruleReal3Constant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"y",
                      							lv_y_19_0,
                      							"fr.cea.nabla.Nabla.Real3Constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getAtomicAccess().getCommaKeyword_6_5());
                      			
                    }
                    // InternalNabla.g:2912:4: ( (lv_z_21_0= ruleReal3Constant ) )
                    // InternalNabla.g:2913:5: (lv_z_21_0= ruleReal3Constant )
                    {
                    // InternalNabla.g:2913:5: (lv_z_21_0= ruleReal3Constant )
                    // InternalNabla.g:2914:6: lv_z_21_0= ruleReal3Constant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getZReal3ConstantParserRuleCall_6_6_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_z_21_0=ruleReal3Constant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"z",
                      							lv_z_21_0,
                      							"fr.cea.nabla.Nabla.Real3Constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_6_7());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalNabla.g:2937:3: ( () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')' )
                    {
                    // InternalNabla.g:2937:3: ( () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')' )
                    // InternalNabla.g:2938:4: () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')'
                    {
                    // InternalNabla.g:2938:4: ()
                    // InternalNabla.g:2939:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getRealXCompactConstantAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:2945:4: ( (lv_type_24_0= ruleBasicType ) )
                    // InternalNabla.g:2946:5: (lv_type_24_0= ruleBasicType )
                    {
                    // InternalNabla.g:2946:5: (lv_type_24_0= ruleBasicType )
                    // InternalNabla.g:2947:6: lv_type_24_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_type_24_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_24_0,
                      							"fr.cea.nabla.Nabla.BasicType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,24,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_7_2());
                      			
                    }
                    // InternalNabla.g:2968:4: ( (lv_value_26_0= RULE_REAL ) )
                    // InternalNabla.g:2969:5: (lv_value_26_0= RULE_REAL )
                    {
                    // InternalNabla.g:2969:5: (lv_value_26_0= RULE_REAL )
                    // InternalNabla.g:2970:6: lv_value_26_0= RULE_REAL
                    {
                    lv_value_26_0=(Token)match(input,RULE_REAL,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_26_0, grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_7_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_26_0,
                      							"fr.cea.nabla.Nabla.REAL");
                      					
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_7_4());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalNabla.g:2992:3: ( () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue' )
                    {
                    // InternalNabla.g:2992:3: ( () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue' )
                    // InternalNabla.g:2993:4: () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue'
                    {
                    // InternalNabla.g:2993:4: ()
                    // InternalNabla.g:2994:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getMinConstantAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:3000:4: ( (lv_type_29_0= ruleBasicType ) )
                    // InternalNabla.g:3001:5: (lv_type_29_0= ruleBasicType )
                    {
                    // InternalNabla.g:3001:5: (lv_type_29_0= ruleBasicType )
                    // InternalNabla.g:3002:6: lv_type_29_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_type_29_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_29_0,
                      							"fr.cea.nabla.Nabla.BasicType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getAtomicAccess().getMinValueKeyword_8_2());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalNabla.g:3025:3: ( () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue' )
                    {
                    // InternalNabla.g:3025:3: ( () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue' )
                    // InternalNabla.g:3026:4: () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue'
                    {
                    // InternalNabla.g:3026:4: ()
                    // InternalNabla.g:3027:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getMaxConstantAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:3033:4: ( (lv_type_32_0= ruleBasicType ) )
                    // InternalNabla.g:3034:5: (lv_type_32_0= ruleBasicType )
                    {
                    // InternalNabla.g:3034:5: (lv_type_32_0= ruleBasicType )
                    // InternalNabla.g:3035:6: lv_type_32_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_type_32_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_32_0,
                      							"fr.cea.nabla.Nabla.BasicType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getAtomicAccess().getMaxValueKeyword_9_2());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalNabla.g:3058:3: ( () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')' )
                    {
                    // InternalNabla.g:3058:3: ( () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')' )
                    // InternalNabla.g:3059:4: () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')'
                    {
                    // InternalNabla.g:3059:4: ()
                    // InternalNabla.g:3060:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getFunctionCallAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:3066:4: ( ( ruleQualifiedName ) )
                    // InternalNabla.g:3067:5: ( ruleQualifiedName )
                    {
                    // InternalNabla.g:3067:5: ( ruleQualifiedName )
                    // InternalNabla.g:3068:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getFunctionFunctionCrossReference_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_36=(Token)match(input,24,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_10_2());
                      			
                    }
                    // InternalNabla.g:3086:4: ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_REAL)||LA42_0==16||LA42_0==24||LA42_0==28||LA42_0==45||(LA42_0>=48 && LA42_0<=50)||(LA42_0>=56 && LA42_0<=61)) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalNabla.g:3087:5: ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )*
                            {
                            // InternalNabla.g:3087:5: ( (lv_args_37_0= ruleExpression ) )
                            // InternalNabla.g:3088:6: (lv_args_37_0= ruleExpression )
                            {
                            // InternalNabla.g:3088:6: (lv_args_37_0= ruleExpression )
                            // InternalNabla.g:3089:7: lv_args_37_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicAccess().getArgsExpressionParserRuleCall_10_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
                            lv_args_37_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicRule());
                              							}
                              							add(
                              								current,
                              								"args",
                              								lv_args_37_0,
                              								"fr.cea.nabla.Nabla.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalNabla.g:3106:5: (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==21) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalNabla.g:3107:6: otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_38, grammarAccess.getAtomicAccess().getCommaKeyword_10_3_1_0());
                            	      					
                            	    }
                            	    // InternalNabla.g:3111:6: ( (lv_args_39_0= ruleExpression ) )
                            	    // InternalNabla.g:3112:7: (lv_args_39_0= ruleExpression )
                            	    {
                            	    // InternalNabla.g:3112:7: (lv_args_39_0= ruleExpression )
                            	    // InternalNabla.g:3113:8: lv_args_39_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicAccess().getArgsExpressionParserRuleCall_10_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_24);
                            	    lv_args_39_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAtomicRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"args",
                            	      									lv_args_39_0,
                            	      									"fr.cea.nabla.Nabla.Expression");
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

                    otherlv_40=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_40, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_10_4());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalNabla.g:3138:3: ( () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')' )
                    {
                    // InternalNabla.g:3138:3: ( () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')' )
                    // InternalNabla.g:3139:4: () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')'
                    {
                    // InternalNabla.g:3139:4: ()
                    // InternalNabla.g:3140:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getReductionCallAction_11_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNabla.g:3146:4: ( ( ruleQualifiedName ) )
                    // InternalNabla.g:3147:5: ( ruleQualifiedName )
                    {
                    // InternalNabla.g:3147:5: ( ruleQualifiedName )
                    // InternalNabla.g:3148:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getReductionReductionCrossReference_11_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_43=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_11_2());
                      			
                    }
                    // InternalNabla.g:3166:4: ( (lv_iterator_44_0= ruleSpaceIterator ) )
                    // InternalNabla.g:3167:5: (lv_iterator_44_0= ruleSpaceIterator )
                    {
                    // InternalNabla.g:3167:5: (lv_iterator_44_0= ruleSpaceIterator )
                    // InternalNabla.g:3168:6: lv_iterator_44_0= ruleSpaceIterator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getIteratorSpaceIteratorParserRuleCall_11_3_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_iterator_44_0=ruleSpaceIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"iterator",
                      							lv_iterator_44_0,
                      							"fr.cea.nabla.Nabla.SpaceIterator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_11_4());
                      			
                    }
                    otherlv_46=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_46, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_11_5());
                      			
                    }
                    // InternalNabla.g:3193:4: ( (lv_arg_47_0= ruleExpression ) )
                    // InternalNabla.g:3194:5: (lv_arg_47_0= ruleExpression )
                    {
                    // InternalNabla.g:3194:5: (lv_arg_47_0= ruleExpression )
                    // InternalNabla.g:3195:6: lv_arg_47_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getArgExpressionParserRuleCall_11_6_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_arg_47_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"arg",
                      							lv_arg_47_0,
                      							"fr.cea.nabla.Nabla.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_48=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_48, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_11_7());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalNabla.g:3218:3: this_VarRef_49= ruleVarRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getVarRefParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarRef_49=ruleVarRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarRef_49;
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleReal2Constant"
    // InternalNabla.g:3230:1: entryRuleReal2Constant returns [EObject current=null] : iv_ruleReal2Constant= ruleReal2Constant EOF ;
    public final EObject entryRuleReal2Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal2Constant = null;


        try {
            // InternalNabla.g:3230:54: (iv_ruleReal2Constant= ruleReal2Constant EOF )
            // InternalNabla.g:3231:2: iv_ruleReal2Constant= ruleReal2Constant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReal2ConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReal2Constant=ruleReal2Constant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal2Constant; 
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
    // $ANTLR end "entryRuleReal2Constant"


    // $ANTLR start "ruleReal2Constant"
    // InternalNabla.g:3237:1: ruleReal2Constant returns [EObject current=null] : (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= '}' ) ;
    public final EObject ruleReal2Constant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalNabla.g:3243:2: ( (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= '}' ) )
            // InternalNabla.g:3244:2: (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= '}' )
            {
            // InternalNabla.g:3244:2: (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= '}' )
            // InternalNabla.g:3245:3: otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReal2ConstantAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalNabla.g:3249:3: ( (lv_x_1_0= RULE_REAL ) )
            // InternalNabla.g:3250:4: (lv_x_1_0= RULE_REAL )
            {
            // InternalNabla.g:3250:4: (lv_x_1_0= RULE_REAL )
            // InternalNabla.g:3251:5: lv_x_1_0= RULE_REAL
            {
            lv_x_1_0=(Token)match(input,RULE_REAL,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_x_1_0, grammarAccess.getReal2ConstantAccess().getXREALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReal2ConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"x",
              						lv_x_1_0,
              						"fr.cea.nabla.Nabla.REAL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReal2ConstantAccess().getCommaKeyword_2());
              		
            }
            // InternalNabla.g:3271:3: ( (lv_y_3_0= RULE_REAL ) )
            // InternalNabla.g:3272:4: (lv_y_3_0= RULE_REAL )
            {
            // InternalNabla.g:3272:4: (lv_y_3_0= RULE_REAL )
            // InternalNabla.g:3273:5: lv_y_3_0= RULE_REAL
            {
            lv_y_3_0=(Token)match(input,RULE_REAL,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_y_3_0, grammarAccess.getReal2ConstantAccess().getYREALTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReal2ConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"y",
              						lv_y_3_0,
              						"fr.cea.nabla.Nabla.REAL");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getReal2ConstantAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleReal2Constant"


    // $ANTLR start "entryRuleReal3Constant"
    // InternalNabla.g:3297:1: entryRuleReal3Constant returns [EObject current=null] : iv_ruleReal3Constant= ruleReal3Constant EOF ;
    public final EObject entryRuleReal3Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal3Constant = null;


        try {
            // InternalNabla.g:3297:54: (iv_ruleReal3Constant= ruleReal3Constant EOF )
            // InternalNabla.g:3298:2: iv_ruleReal3Constant= ruleReal3Constant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReal3ConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReal3Constant=ruleReal3Constant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal3Constant; 
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
    // $ANTLR end "entryRuleReal3Constant"


    // $ANTLR start "ruleReal3Constant"
    // InternalNabla.g:3304:1: ruleReal3Constant returns [EObject current=null] : (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= ',' ( (lv_z_5_0= RULE_REAL ) ) otherlv_6= '}' ) ;
    public final EObject ruleReal3Constant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;
        Token lv_z_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalNabla.g:3310:2: ( (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= ',' ( (lv_z_5_0= RULE_REAL ) ) otherlv_6= '}' ) )
            // InternalNabla.g:3311:2: (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= ',' ( (lv_z_5_0= RULE_REAL ) ) otherlv_6= '}' )
            {
            // InternalNabla.g:3311:2: (otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= ',' ( (lv_z_5_0= RULE_REAL ) ) otherlv_6= '}' )
            // InternalNabla.g:3312:3: otherlv_0= '{' ( (lv_x_1_0= RULE_REAL ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_REAL ) ) otherlv_4= ',' ( (lv_z_5_0= RULE_REAL ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReal3ConstantAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalNabla.g:3316:3: ( (lv_x_1_0= RULE_REAL ) )
            // InternalNabla.g:3317:4: (lv_x_1_0= RULE_REAL )
            {
            // InternalNabla.g:3317:4: (lv_x_1_0= RULE_REAL )
            // InternalNabla.g:3318:5: lv_x_1_0= RULE_REAL
            {
            lv_x_1_0=(Token)match(input,RULE_REAL,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_x_1_0, grammarAccess.getReal3ConstantAccess().getXREALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReal3ConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"x",
              						lv_x_1_0,
              						"fr.cea.nabla.Nabla.REAL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReal3ConstantAccess().getCommaKeyword_2());
              		
            }
            // InternalNabla.g:3338:3: ( (lv_y_3_0= RULE_REAL ) )
            // InternalNabla.g:3339:4: (lv_y_3_0= RULE_REAL )
            {
            // InternalNabla.g:3339:4: (lv_y_3_0= RULE_REAL )
            // InternalNabla.g:3340:5: lv_y_3_0= RULE_REAL
            {
            lv_y_3_0=(Token)match(input,RULE_REAL,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_y_3_0, grammarAccess.getReal3ConstantAccess().getYREALTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReal3ConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"y",
              						lv_y_3_0,
              						"fr.cea.nabla.Nabla.REAL");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getReal3ConstantAccess().getCommaKeyword_4());
              		
            }
            // InternalNabla.g:3360:3: ( (lv_z_5_0= RULE_REAL ) )
            // InternalNabla.g:3361:4: (lv_z_5_0= RULE_REAL )
            {
            // InternalNabla.g:3361:4: (lv_z_5_0= RULE_REAL )
            // InternalNabla.g:3362:5: lv_z_5_0= RULE_REAL
            {
            lv_z_5_0=(Token)match(input,RULE_REAL,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_z_5_0, grammarAccess.getReal3ConstantAccess().getZREALTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReal3ConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"z",
              						lv_z_5_0,
              						"fr.cea.nabla.Nabla.REAL");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getReal3ConstantAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleReal3Constant"


    // $ANTLR start "entryRuleVarRef"
    // InternalNabla.g:3386:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // InternalNabla.g:3386:47: (iv_ruleVarRef= ruleVarRef EOF )
            // InternalNabla.g:3387:2: iv_ruleVarRef= ruleVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarRef; 
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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalNabla.g:3393:1: ruleVarRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) ) (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )* otherlv_5= '}' )? (otherlv_6= '^{' ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) ) otherlv_8= '}' )? (otherlv_9= '.' ( (lv_fields_10_0= RULE_ID ) ) )* ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_fields_10_0=null;
        EObject lv_spaceIterators_2_0 = null;

        EObject lv_spaceIterators_4_0 = null;

        EObject lv_timeIterator_7_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:3399:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) ) (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )* otherlv_5= '}' )? (otherlv_6= '^{' ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) ) otherlv_8= '}' )? (otherlv_9= '.' ( (lv_fields_10_0= RULE_ID ) ) )* ) )
            // InternalNabla.g:3400:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) ) (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )* otherlv_5= '}' )? (otherlv_6= '^{' ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) ) otherlv_8= '}' )? (otherlv_9= '.' ( (lv_fields_10_0= RULE_ID ) ) )* )
            {
            // InternalNabla.g:3400:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) ) (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )* otherlv_5= '}' )? (otherlv_6= '^{' ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) ) otherlv_8= '}' )? (otherlv_9= '.' ( (lv_fields_10_0= RULE_ID ) ) )* )
            // InternalNabla.g:3401:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) ) (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )* otherlv_5= '}' )? (otherlv_6= '^{' ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) ) otherlv_8= '}' )? (otherlv_9= '.' ( (lv_fields_10_0= RULE_ID ) ) )*
            {
            // InternalNabla.g:3401:3: ( (otherlv_0= RULE_ID ) )
            // InternalNabla.g:3402:4: (otherlv_0= RULE_ID )
            {
            // InternalNabla.g:3402:4: (otherlv_0= RULE_ID )
            // InternalNabla.g:3403:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarRefRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getVariableVarCrossReference_0_0());
              				
            }

            }


            }

            // InternalNabla.g:3414:3: (otherlv_1= '{' ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) ) (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )* otherlv_5= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==16) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalNabla.g:3415:4: otherlv_1= '{' ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) ) (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVarRefAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    // InternalNabla.g:3419:4: ( (lv_spaceIterators_2_0= ruleIteratorRangeOrRef ) )
                    // InternalNabla.g:3420:5: (lv_spaceIterators_2_0= ruleIteratorRangeOrRef )
                    {
                    // InternalNabla.g:3420:5: (lv_spaceIterators_2_0= ruleIteratorRangeOrRef )
                    // InternalNabla.g:3421:6: lv_spaceIterators_2_0= ruleIteratorRangeOrRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarRefAccess().getSpaceIteratorsIteratorRangeOrRefParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
                    lv_spaceIterators_2_0=ruleIteratorRangeOrRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarRefRule());
                      						}
                      						add(
                      							current,
                      							"spaceIterators",
                      							lv_spaceIterators_2_0,
                      							"fr.cea.nabla.Nabla.IteratorRangeOrRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNabla.g:3438:4: (otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalNabla.g:3439:5: otherlv_3= ',' ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getVarRefAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalNabla.g:3443:5: ( (lv_spaceIterators_4_0= ruleIteratorRangeOrRef ) )
                    	    // InternalNabla.g:3444:6: (lv_spaceIterators_4_0= ruleIteratorRangeOrRef )
                    	    {
                    	    // InternalNabla.g:3444:6: (lv_spaceIterators_4_0= ruleIteratorRangeOrRef )
                    	    // InternalNabla.g:3445:7: lv_spaceIterators_4_0= ruleIteratorRangeOrRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getVarRefAccess().getSpaceIteratorsIteratorRangeOrRefParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_47);
                    	    lv_spaceIterators_4_0=ruleIteratorRangeOrRef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getVarRefRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"spaceIterators",
                    	      								lv_spaceIterators_4_0,
                    	      								"fr.cea.nabla.Nabla.IteratorRangeOrRef");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getVarRefAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalNabla.g:3468:3: (otherlv_6= '^{' ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) ) otherlv_8= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalNabla.g:3469:4: otherlv_6= '^{' ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getVarRefAccess().getCircumflexAccentLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    // InternalNabla.g:3473:4: ( (lv_timeIterator_7_0= ruleTimeIteratorRef ) )
                    // InternalNabla.g:3474:5: (lv_timeIterator_7_0= ruleTimeIteratorRef )
                    {
                    // InternalNabla.g:3474:5: (lv_timeIterator_7_0= ruleTimeIteratorRef )
                    // InternalNabla.g:3475:6: lv_timeIterator_7_0= ruleTimeIteratorRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarRefAccess().getTimeIteratorTimeIteratorRefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_timeIterator_7_0=ruleTimeIteratorRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarRefRule());
                      						}
                      						set(
                      							current,
                      							"timeIterator",
                      							lv_timeIterator_7_0,
                      							"fr.cea.nabla.Nabla.TimeIteratorRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getVarRefAccess().getRightCurlyBracketKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalNabla.g:3497:3: (otherlv_9= '.' ( (lv_fields_10_0= RULE_ID ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==54) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalNabla.g:3498:4: otherlv_9= '.' ( (lv_fields_10_0= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getVarRefAccess().getFullStopKeyword_3_0());
            	      			
            	    }
            	    // InternalNabla.g:3502:4: ( (lv_fields_10_0= RULE_ID ) )
            	    // InternalNabla.g:3503:5: (lv_fields_10_0= RULE_ID )
            	    {
            	    // InternalNabla.g:3503:5: (lv_fields_10_0= RULE_ID )
            	    // InternalNabla.g:3504:6: lv_fields_10_0= RULE_ID
            	    {
            	    lv_fields_10_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_fields_10_0, grammarAccess.getVarRefAccess().getFieldsIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVarRefRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"fields",
            	      							lv_fields_10_0,
            	      							"fr.cea.nabla.Nabla.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleIteratorRangeOrRef"
    // InternalNabla.g:3525:1: entryRuleIteratorRangeOrRef returns [EObject current=null] : iv_ruleIteratorRangeOrRef= ruleIteratorRangeOrRef EOF ;
    public final EObject entryRuleIteratorRangeOrRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorRangeOrRef = null;


        try {
            // InternalNabla.g:3525:59: (iv_ruleIteratorRangeOrRef= ruleIteratorRangeOrRef EOF )
            // InternalNabla.g:3526:2: iv_ruleIteratorRangeOrRef= ruleIteratorRangeOrRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorRangeOrRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIteratorRangeOrRef=ruleIteratorRangeOrRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteratorRangeOrRef; 
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
    // $ANTLR end "entryRuleIteratorRangeOrRef"


    // $ANTLR start "ruleIteratorRangeOrRef"
    // InternalNabla.g:3532:1: ruleIteratorRangeOrRef returns [EObject current=null] : (this_SpaceIteratorRange_0= ruleSpaceIteratorRange | this_SpaceIteratorRef_1= ruleSpaceIteratorRef ) ;
    public final EObject ruleIteratorRangeOrRef() throws RecognitionException {
        EObject current = null;

        EObject this_SpaceIteratorRange_0 = null;

        EObject this_SpaceIteratorRef_1 = null;



        	enterRule();

        try {
            // InternalNabla.g:3538:2: ( (this_SpaceIteratorRange_0= ruleSpaceIteratorRange | this_SpaceIteratorRef_1= ruleSpaceIteratorRef ) )
            // InternalNabla.g:3539:2: (this_SpaceIteratorRange_0= ruleSpaceIteratorRange | this_SpaceIteratorRef_1= ruleSpaceIteratorRef )
            {
            // InternalNabla.g:3539:2: (this_SpaceIteratorRange_0= ruleSpaceIteratorRange | this_SpaceIteratorRef_1= ruleSpaceIteratorRef )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||LA48_1==17||LA48_1==21) ) {
                    alt48=2;
                }
                else if ( (LA48_1==24) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA48_0>=29 && LA48_0<=30)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalNabla.g:3540:3: this_SpaceIteratorRange_0= ruleSpaceIteratorRange
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIteratorRangeOrRefAccess().getSpaceIteratorRangeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpaceIteratorRange_0=ruleSpaceIteratorRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpaceIteratorRange_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNabla.g:3549:3: this_SpaceIteratorRef_1= ruleSpaceIteratorRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIteratorRangeOrRefAccess().getSpaceIteratorRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpaceIteratorRef_1=ruleSpaceIteratorRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpaceIteratorRef_1;
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
    // $ANTLR end "ruleIteratorRangeOrRef"


    // $ANTLR start "entryRuleTimeIteratorRef"
    // InternalNabla.g:3561:1: entryRuleTimeIteratorRef returns [EObject current=null] : iv_ruleTimeIteratorRef= ruleTimeIteratorRef EOF ;
    public final EObject entryRuleTimeIteratorRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeIteratorRef = null;


        try {
            // InternalNabla.g:3561:56: (iv_ruleTimeIteratorRef= ruleTimeIteratorRef EOF )
            // InternalNabla.g:3562:2: iv_ruleTimeIteratorRef= ruleTimeIteratorRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeIteratorRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeIteratorRef=ruleTimeIteratorRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeIteratorRef; 
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
    // $ANTLR end "entryRuleTimeIteratorRef"


    // $ANTLR start "ruleTimeIteratorRef"
    // InternalNabla.g:3568:1: ruleTimeIteratorRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) ) ( (lv_value_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTimeIteratorRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_init_1_0=null;
        Token lv_next_2_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalNabla.g:3574:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) ) ( (lv_value_3_0= RULE_INT ) ) )? ) )
            // InternalNabla.g:3575:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) ) ( (lv_value_3_0= RULE_INT ) ) )? )
            {
            // InternalNabla.g:3575:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) ) ( (lv_value_3_0= RULE_INT ) ) )? )
            // InternalNabla.g:3576:3: ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) ) ( (lv_value_3_0= RULE_INT ) ) )?
            {
            // InternalNabla.g:3576:3: ( (otherlv_0= RULE_ID ) )
            // InternalNabla.g:3577:4: (otherlv_0= RULE_ID )
            {
            // InternalNabla.g:3577:4: (otherlv_0= RULE_ID )
            // InternalNabla.g:3578:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTimeIteratorRefRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getTimeIteratorRefAccess().getIteratorTimeIteratorCrossReference_0_0());
              				
            }

            }


            }

            // InternalNabla.g:3589:3: ( ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) ) ( (lv_value_3_0= RULE_INT ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==22||LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalNabla.g:3590:4: ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) ) ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalNabla.g:3590:4: ( ( (lv_init_1_0= '=' ) ) | ( (lv_next_2_0= '+' ) ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==22) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==44) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalNabla.g:3591:5: ( (lv_init_1_0= '=' ) )
                            {
                            // InternalNabla.g:3591:5: ( (lv_init_1_0= '=' ) )
                            // InternalNabla.g:3592:6: (lv_init_1_0= '=' )
                            {
                            // InternalNabla.g:3592:6: (lv_init_1_0= '=' )
                            // InternalNabla.g:3593:7: lv_init_1_0= '='
                            {
                            lv_init_1_0=(Token)match(input,22,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_init_1_0, grammarAccess.getTimeIteratorRefAccess().getInitEqualsSignKeyword_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTimeIteratorRefRule());
                              							}
                              							setWithLastConsumed(current, "init", true, "=");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalNabla.g:3606:5: ( (lv_next_2_0= '+' ) )
                            {
                            // InternalNabla.g:3606:5: ( (lv_next_2_0= '+' ) )
                            // InternalNabla.g:3607:6: (lv_next_2_0= '+' )
                            {
                            // InternalNabla.g:3607:6: (lv_next_2_0= '+' )
                            // InternalNabla.g:3608:7: lv_next_2_0= '+'
                            {
                            lv_next_2_0=(Token)match(input,44,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_next_2_0, grammarAccess.getTimeIteratorRefAccess().getNextPlusSignKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTimeIteratorRefRule());
                              							}
                              							setWithLastConsumed(current, "next", true, "+");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalNabla.g:3621:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalNabla.g:3622:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalNabla.g:3622:5: (lv_value_3_0= RULE_INT )
                    // InternalNabla.g:3623:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getTimeIteratorRefAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeIteratorRefRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
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
    // $ANTLR end "ruleTimeIteratorRef"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalNabla.g:3644:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalNabla.g:3644:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalNabla.g:3645:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalNabla.g:3651:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalNabla.g:3657:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalNabla.g:3658:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalNabla.g:3658:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalNabla.g:3659:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalNabla.g:3666:3: (kw= '.' this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==54) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalNabla.g:3667:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalNabla.g:3684:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalNabla.g:3684:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalNabla.g:3685:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalNabla.g:3691:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalNabla.g:3697:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalNabla.g:3698:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalNabla.g:3698:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalNabla.g:3699:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNabla.g:3709:3: (kw= '.*' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalNabla.g:3710:4: kw= '.*'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleBasicType"
    // InternalNabla.g:3720:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= '\\u2115' ) | (enumLiteral_1= '\\u211D' ) | (enumLiteral_2= '\\u211D\\u00B2' ) | (enumLiteral_3= '\\u211D\\u00B2\\u02E3\\u00B2' ) | (enumLiteral_4= '\\u211D\\u00B3' ) | (enumLiteral_5= '\\u211D\\u00B3\\u02E3\\u00B3' ) | (enumLiteral_6= '\\u213E' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalNabla.g:3726:2: ( ( (enumLiteral_0= '\\u2115' ) | (enumLiteral_1= '\\u211D' ) | (enumLiteral_2= '\\u211D\\u00B2' ) | (enumLiteral_3= '\\u211D\\u00B2\\u02E3\\u00B2' ) | (enumLiteral_4= '\\u211D\\u00B3' ) | (enumLiteral_5= '\\u211D\\u00B3\\u02E3\\u00B3' ) | (enumLiteral_6= '\\u213E' ) ) )
            // InternalNabla.g:3727:2: ( (enumLiteral_0= '\\u2115' ) | (enumLiteral_1= '\\u211D' ) | (enumLiteral_2= '\\u211D\\u00B2' ) | (enumLiteral_3= '\\u211D\\u00B2\\u02E3\\u00B2' ) | (enumLiteral_4= '\\u211D\\u00B3' ) | (enumLiteral_5= '\\u211D\\u00B3\\u02E3\\u00B3' ) | (enumLiteral_6= '\\u213E' ) )
            {
            // InternalNabla.g:3727:2: ( (enumLiteral_0= '\\u2115' ) | (enumLiteral_1= '\\u211D' ) | (enumLiteral_2= '\\u211D\\u00B2' ) | (enumLiteral_3= '\\u211D\\u00B2\\u02E3\\u00B2' ) | (enumLiteral_4= '\\u211D\\u00B3' ) | (enumLiteral_5= '\\u211D\\u00B3\\u02E3\\u00B3' ) | (enumLiteral_6= '\\u213E' ) )
            int alt53=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt53=1;
                }
                break;
            case 56:
                {
                alt53=2;
                }
                break;
            case 57:
                {
                alt53=3;
                }
                break;
            case 58:
                {
                alt53=4;
                }
                break;
            case 59:
                {
                alt53=5;
                }
                break;
            case 60:
                {
                alt53=6;
                }
                break;
            case 61:
                {
                alt53=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalNabla.g:3728:3: (enumLiteral_0= '\\u2115' )
                    {
                    // InternalNabla.g:3728:3: (enumLiteral_0= '\\u2115' )
                    // InternalNabla.g:3729:4: enumLiteral_0= '\\u2115'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:3736:3: (enumLiteral_1= '\\u211D' )
                    {
                    // InternalNabla.g:3736:3: (enumLiteral_1= '\\u211D' )
                    // InternalNabla.g:3737:4: enumLiteral_1= '\\u211D'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalNabla.g:3744:3: (enumLiteral_2= '\\u211D\\u00B2' )
                    {
                    // InternalNabla.g:3744:3: (enumLiteral_2= '\\u211D\\u00B2' )
                    // InternalNabla.g:3745:4: enumLiteral_2= '\\u211D\\u00B2'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getReal2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getReal2EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalNabla.g:3752:3: (enumLiteral_3= '\\u211D\\u00B2\\u02E3\\u00B2' )
                    {
                    // InternalNabla.g:3752:3: (enumLiteral_3= '\\u211D\\u00B2\\u02E3\\u00B2' )
                    // InternalNabla.g:3753:4: enumLiteral_3= '\\u211D\\u00B2\\u02E3\\u00B2'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getReal2x2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getReal2x2EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalNabla.g:3760:3: (enumLiteral_4= '\\u211D\\u00B3' )
                    {
                    // InternalNabla.g:3760:3: (enumLiteral_4= '\\u211D\\u00B3' )
                    // InternalNabla.g:3761:4: enumLiteral_4= '\\u211D\\u00B3'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getReal3EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getReal3EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalNabla.g:3768:3: (enumLiteral_5= '\\u211D\\u00B3\\u02E3\\u00B3' )
                    {
                    // InternalNabla.g:3768:3: (enumLiteral_5= '\\u211D\\u00B3\\u02E3\\u00B3' )
                    // InternalNabla.g:3769:4: enumLiteral_5= '\\u211D\\u00B3\\u02E3\\u00B3'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getReal3x3EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getReal3x3EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalNabla.g:3776:3: (enumLiteral_6= '\\u213E' )
                    {
                    // InternalNabla.g:3776:3: (enumLiteral_6= '\\u213E' )
                    // InternalNabla.g:3777:4: enumLiteral_6= '\\u213E'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getBoolEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getBoolEnumLiteralDeclaration_6());
                      			
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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "ruleItemType"
    // InternalNabla.g:3787:1: ruleItemType returns [Enumerator current=null] : ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'cell' ) | (enumLiteral_2= 'face' ) ) ;
    public final Enumerator ruleItemType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalNabla.g:3793:2: ( ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'cell' ) | (enumLiteral_2= 'face' ) ) )
            // InternalNabla.g:3794:2: ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'cell' ) | (enumLiteral_2= 'face' ) )
            {
            // InternalNabla.g:3794:2: ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'cell' ) | (enumLiteral_2= 'face' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt54=1;
                }
                break;
            case 63:
                {
                alt54=2;
                }
                break;
            case 64:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalNabla.g:3795:3: (enumLiteral_0= 'node' )
                    {
                    // InternalNabla.g:3795:3: (enumLiteral_0= 'node' )
                    // InternalNabla.g:3796:4: enumLiteral_0= 'node'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getItemTypeAccess().getNodeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getItemTypeAccess().getNodeEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNabla.g:3803:3: (enumLiteral_1= 'cell' )
                    {
                    // InternalNabla.g:3803:3: (enumLiteral_1= 'cell' )
                    // InternalNabla.g:3804:4: enumLiteral_1= 'cell'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getItemTypeAccess().getCellEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getItemTypeAccess().getCellEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalNabla.g:3811:3: (enumLiteral_2= 'face' )
                    {
                    // InternalNabla.g:3811:3: (enumLiteral_2= 'face' )
                    // InternalNabla.g:3812:4: enumLiteral_2= 'face'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getItemTypeAccess().getFaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getItemTypeAccess().getFaceEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleItemType"

    // $ANTLR start synpred1_InternalNabla
    public final void synpred1_InternalNabla_fragment() throws RecognitionException {   
        // InternalNabla.g:781:6: ( 'else' )
        // InternalNabla.g:781:7: 'else'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNabla

    // Delegated rules

    public final boolean synpred1_InternalNabla() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNabla_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\34\1\uffff\7\4\1\15\1\uffff";
    static final String dfa_3s = "\1\75\1\uffff\7\4\1\40\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\10\uffff\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\uffff\1\1\30\uffff\1\3\1\4\1\5\1\6\1\7\1\10",
            "",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\12\7\uffff\1\12\1\1\11\uffff\1\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "147:5: (lv_variables_5_1= ruleScalarVarDefinition | lv_variables_5_2= ruleVarGroupDeclaration )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\4\1\23\1\30\1\4\1\uffff\7\25\1\uffff";
    static final String dfa_9s = "\1\4\1\23\1\30\1\75\1\uffff\7\64\1\uffff";
    static final String dfa_10s = "\4\uffff\1\2\7\uffff\1\1";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\3\4\11\uffff\1\4\7\uffff\1\4\3\uffff\1\5\5\uffff\1\14\12\uffff\1\4\2\uffff\3\4\5\uffff\1\6\1\7\1\10\1\11\1\12\1\13",
            "",
            "\1\14\2\uffff\1\4\1\14\31\uffff\2\4",
            "\1\14\2\uffff\1\4\1\14\31\uffff\2\4",
            "\1\14\2\uffff\1\4\1\14\31\uffff\2\4",
            "\1\14\2\uffff\1\4\1\14\31\uffff\2\4",
            "\1\14\2\uffff\1\4\1\14\31\uffff\2\4",
            "\1\14\2\uffff\1\4\1\14\31\uffff\2\4",
            "\1\14\2\uffff\1\4\1\14\31\uffff\2\4",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "325:6: (lv_functions_8_1= ruleFunction | lv_functions_8_2= ruleReduction )";
        }
    }
    static final String dfa_13s = "\17\uffff";
    static final String dfa_14s = "\1\4\1\uffff\7\4\4\uffff\1\15\1\uffff";
    static final String dfa_15s = "\1\75\1\uffff\7\4\4\uffff\1\40\1\uffff";
    static final String dfa_16s = "\1\uffff\1\1\7\uffff\1\3\1\4\1\5\1\6\1\uffff\1\2";
    static final String dfa_17s = "\17\uffff}>";
    static final String[] dfa_18s = {
            "\1\12\13\uffff\1\11\3\uffff\1\13\2\uffff\1\14\4\uffff\1\2\2\uffff\1\1\30\uffff\1\3\1\4\1\5\1\6\1\7\1\10",
            "",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "",
            "",
            "",
            "",
            "\1\16\7\uffff\1\16\1\1\11\uffff\1\16",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "553:2: (this_ScalarVarDefinition_0= ruleScalarVarDefinition | this_VarGroupDeclaration_1= ruleVarGroupDeclaration | ( () otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )+ otherlv_5= '}' ) | ( () ( (lv_varRef_7_0= ruleVarRef ) ) otherlv_8= '=' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= ';' ) | ( () otherlv_12= '\\u2200' ( (lv_iterator_13_0= ruleSpaceIterator ) ) otherlv_14= ',' ( (lv_body_15_0= ruleInstruction ) ) ) | ( () otherlv_17= 'if' otherlv_18= '(' ( (lv_condition_19_0= ruleExpression ) ) otherlv_20= ')' ( (lv_then_21_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_22= 'else' ) ( (lv_else_23_0= ruleInstruction ) ) )? ) )";
        }
    }
    static final String dfa_19s = "\42\uffff";
    static final String dfa_20s = "\14\uffff\1\23\14\uffff\1\23\10\uffff";
    static final String dfa_21s = "\1\4\2\uffff\1\6\1\uffff\7\30\1\15\1\6\1\25\3\uffff\1\4\1\uffff\1\4\1\uffff\1\25\1\6\1\21\1\15\1\6\1\21\1\uffff\1\21\4\uffff";
    static final String dfa_22s = "\1\75\2\uffff\1\20\1\uffff\7\64\1\66\1\6\1\25\3\uffff\1\36\1\uffff\1\4\1\uffff\1\25\1\6\1\33\1\66\1\6\1\25\1\uffff\1\25\4\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\2\1\uffff\1\5\12\uffff\1\11\1\10\1\12\1\uffff\1\15\1\uffff\1\13\6\uffff\1\14\1\uffff\1\4\1\3\1\7\1\6";
    static final String dfa_24s = "\42\uffff}>";
    static final String[] dfa_25s = {
            "\1\14\1\1\1\2\11\uffff\1\3\13\uffff\1\5\24\uffff\2\4\5\uffff\1\6\1\7\1\10\1\11\1\12\1\13",
            "",
            "",
            "\1\16\11\uffff\1\15",
            "",
            "\1\20\32\uffff\1\17\1\21",
            "\1\20\32\uffff\1\17\1\21",
            "\1\20\32\uffff\1\17\1\21",
            "\1\20\32\uffff\1\17\1\21",
            "\1\20\32\uffff\1\17\1\21",
            "\1\20\32\uffff\1\17\1\21",
            "\1\20\32\uffff\1\17\1\21",
            "\1\23\2\uffff\1\22\4\uffff\1\23\2\uffff\1\25\1\23\12\uffff\14\23\5\uffff\1\23\1\24",
            "\1\26",
            "\1\27",
            "",
            "",
            "",
            "\1\30\30\uffff\2\23",
            "",
            "\1\31",
            "",
            "\1\32",
            "\1\33",
            "\1\23\3\uffff\1\23\2\uffff\1\23\2\uffff\1\34",
            "\1\23\2\uffff\1\34\4\uffff\1\23\2\uffff\1\25\1\23\12\uffff\14\23\6\uffff\1\24",
            "\1\35",
            "\1\37\3\uffff\1\36",
            "",
            "\1\41\3\uffff\1\40",
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

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2688:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | this_Real2Constant_4= ruleReal2Constant | this_Real3Constant_5= ruleReal3Constant | ( () ( ( (lv_value_7_0= 'true' ) ) | otherlv_8= 'false' ) ) | ( () otherlv_10= '{' ( (lv_x_11_0= ruleReal2Constant ) ) otherlv_12= ',' ( (lv_y_13_0= ruleReal2Constant ) ) otherlv_14= '}' ) | ( () otherlv_16= '{' ( (lv_x_17_0= ruleReal3Constant ) ) otherlv_18= ',' ( (lv_y_19_0= ruleReal3Constant ) ) otherlv_20= ',' ( (lv_z_21_0= ruleReal3Constant ) ) otherlv_22= '}' ) | ( () ( (lv_type_24_0= ruleBasicType ) ) otherlv_25= '(' ( (lv_value_26_0= RULE_REAL ) ) otherlv_27= ')' ) | ( () ( (lv_type_29_0= ruleBasicType ) ) otherlv_30= '.MinValue' ) | ( () ( (lv_type_32_0= ruleBasicType ) ) otherlv_33= '.MaxValue' ) | ( () ( ( ruleQualifiedName ) ) otherlv_36= '(' ( ( (lv_args_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_args_39_0= ruleExpression ) ) )* )? otherlv_40= ')' ) | ( () ( ( ruleQualifiedName ) ) otherlv_43= '{' ( (lv_iterator_44_0= ruleSpaceIterator ) ) otherlv_45= '}' otherlv_46= '(' ( (lv_arg_47_0= ruleExpression ) ) otherlv_48= ')' ) | this_VarRef_49= ruleVarRef )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x3F0000009004C012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x3F00000090048012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x3F00000090000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x3F00000090910010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x3F00000090930010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x3F07200091010070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000062000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x3F00000090000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xC000000400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xC000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x3F00000490000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x3F07200093010070L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0060000000010002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000400002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000002L});

}