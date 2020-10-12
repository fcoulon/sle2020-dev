package org.tetrabox.minijava.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import kaulua.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import kaulua.contentassist.antlr.internal.DFA;
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'true'", "'false'", "'private'", "'protected'", "'public'", "'package'", "'import'", "'.'", "'.*'", "'class'", "'{'", "'}'", "'extends'", "'implements'", "','", "'interface'", "'('", "')'", "'='", "'System'", "'out'", "'println'", "'return'", "'if'", "'else'", "'while'", "'for'", "'['", "']'", "'int'", "'boolean'", "'String'", "'void'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'length'", "'!'", "'this'", "'super'", "'null'", "'new'", "'abstract'", "'static'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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


        public InternalMiniJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniJava.g"; }


    	private MiniJavaGrammarAccess grammarAccess;

    	public void setGrammarAccess(MiniJavaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalMiniJava.g:51:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMiniJava.g:52:1: ( ruleProgram EOF )
            // InternalMiniJava.g:53:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniJava.g:60:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:64:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMiniJava.g:65:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMiniJava.g:65:2: ( ( rule__Program__Group__0 ) )
            // InternalMiniJava.g:66:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalMiniJava.g:67:3: ( rule__Program__Group__0 )
            // InternalMiniJava.g:67:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleImport"
    // InternalMiniJava.g:76:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMiniJava.g:77:1: ( ruleImport EOF )
            // InternalMiniJava.g:78:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMiniJava.g:85:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:89:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMiniJava.g:90:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMiniJava.g:90:2: ( ( rule__Import__Group__0 ) )
            // InternalMiniJava.g:91:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMiniJava.g:92:3: ( rule__Import__Group__0 )
            // InternalMiniJava.g:92:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava.g:101:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMiniJava.g:102:1: ( ruleQualifiedName EOF )
            // InternalMiniJava.g:103:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava.g:110:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:114:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMiniJava.g:115:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMiniJava.g:115:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMiniJava.g:116:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMiniJava.g:117:3: ( rule__QualifiedName__Group__0 )
            // InternalMiniJava.g:117:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMiniJava.g:126:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMiniJava.g:127:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMiniJava.g:128:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMiniJava.g:135:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:139:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMiniJava.g:140:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMiniJava.g:140:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMiniJava.g:141:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMiniJava.g:142:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMiniJava.g:142:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMiniJava.g:151:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:152:1: ( ruleTypeDeclaration EOF )
            // InternalMiniJava.g:153:1: ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMiniJava.g:160:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Alternatives ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:164:2: ( ( ( rule__TypeDeclaration__Alternatives ) ) )
            // InternalMiniJava.g:165:2: ( ( rule__TypeDeclaration__Alternatives ) )
            {
            // InternalMiniJava.g:165:2: ( ( rule__TypeDeclaration__Alternatives ) )
            // InternalMiniJava.g:166:3: ( rule__TypeDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:167:3: ( rule__TypeDeclaration__Alternatives )
            // InternalMiniJava.g:167:4: rule__TypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleClass"
    // InternalMiniJava.g:176:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMiniJava.g:177:1: ( ruleClass EOF )
            // InternalMiniJava.g:178:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMiniJava.g:185:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:189:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMiniJava.g:190:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMiniJava.g:190:2: ( ( rule__Class__Group__0 ) )
            // InternalMiniJava.g:191:3: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // InternalMiniJava.g:192:3: ( rule__Class__Group__0 )
            // InternalMiniJava.g:192:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInterface"
    // InternalMiniJava.g:201:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalMiniJava.g:202:1: ( ruleInterface EOF )
            // InternalMiniJava.g:203:1: ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMiniJava.g:210:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:214:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalMiniJava.g:215:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalMiniJava.g:215:2: ( ( rule__Interface__Group__0 ) )
            // InternalMiniJava.g:216:3: ( rule__Interface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup()); 
            }
            // InternalMiniJava.g:217:3: ( rule__Interface__Group__0 )
            // InternalMiniJava.g:217:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava.g:226:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMiniJava.g:227:1: ( ruleMember EOF )
            // InternalMiniJava.g:228:1: ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava.g:235:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:239:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalMiniJava.g:240:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalMiniJava.g:240:2: ( ( rule__Member__Alternatives ) )
            // InternalMiniJava.g:241:3: ( rule__Member__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:242:3: ( rule__Member__Alternatives )
            // InternalMiniJava.g:242:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava.g:251:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMiniJava.g:252:1: ( ruleMethod EOF )
            // InternalMiniJava.g:253:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMiniJava.g:260:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:264:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMiniJava.g:265:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMiniJava.g:265:2: ( ( rule__Method__Group__0 ) )
            // InternalMiniJava.g:266:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalMiniJava.g:267:3: ( rule__Method__Group__0 )
            // InternalMiniJava.g:267:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:276:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMiniJava.g:277:1: ( ruleParameter EOF )
            // InternalMiniJava.g:278:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMiniJava.g:285:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:289:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMiniJava.g:290:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMiniJava.g:290:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMiniJava.g:291:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalMiniJava.g:292:3: ( rule__Parameter__Group__0 )
            // InternalMiniJava.g:292:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:301:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMiniJava.g:302:1: ( ruleField EOF )
            // InternalMiniJava.g:303:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMiniJava.g:310:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:314:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMiniJava.g:315:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMiniJava.g:315:2: ( ( rule__Field__Group__0 ) )
            // InternalMiniJava.g:316:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalMiniJava.g:317:3: ( rule__Field__Group__0 )
            // InternalMiniJava.g:317:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBlock"
    // InternalMiniJava.g:326:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMiniJava.g:327:1: ( ruleBlock EOF )
            // InternalMiniJava.g:328:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMiniJava.g:335:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:339:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMiniJava.g:340:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMiniJava.g:340:2: ( ( rule__Block__Group__0 ) )
            // InternalMiniJava.g:341:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalMiniJava.g:342:3: ( rule__Block__Group__0 )
            // InternalMiniJava.g:342:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:351:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:352:1: ( ruleStatement EOF )
            // InternalMiniJava.g:353:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:360:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:364:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMiniJava.g:365:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMiniJava.g:365:2: ( ( rule__Statement__Alternatives ) )
            // InternalMiniJava.g:366:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:367:3: ( rule__Statement__Alternatives )
            // InternalMiniJava.g:367:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrintStatement"
    // InternalMiniJava.g:376:1: entryRulePrintStatement : rulePrintStatement EOF ;
    public final void entryRulePrintStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:377:1: ( rulePrintStatement EOF )
            // InternalMiniJava.g:378:1: rulePrintStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrintStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalMiniJava.g:385:1: rulePrintStatement : ( ( rule__PrintStatement__Group__0 ) ) ;
    public final void rulePrintStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:389:2: ( ( ( rule__PrintStatement__Group__0 ) ) )
            // InternalMiniJava.g:390:2: ( ( rule__PrintStatement__Group__0 ) )
            {
            // InternalMiniJava.g:390:2: ( ( rule__PrintStatement__Group__0 ) )
            // InternalMiniJava.g:391:3: ( rule__PrintStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:392:3: ( rule__PrintStatement__Group__0 )
            // InternalMiniJava.g:392:4: rule__PrintStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleReturn"
    // InternalMiniJava.g:401:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // InternalMiniJava.g:402:1: ( ruleReturn EOF )
            // InternalMiniJava.g:403:1: ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalMiniJava.g:410:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:414:2: ( ( ( rule__Return__Group__0 ) ) )
            // InternalMiniJava.g:415:2: ( ( rule__Return__Group__0 ) )
            {
            // InternalMiniJava.g:415:2: ( ( rule__Return__Group__0 ) )
            // InternalMiniJava.g:416:3: ( rule__Return__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getGroup()); 
            }
            // InternalMiniJava.g:417:3: ( rule__Return__Group__0 )
            // InternalMiniJava.g:417:4: rule__Return__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMiniJava.g:426:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:427:1: ( ruleIfStatement EOF )
            // InternalMiniJava.g:428:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMiniJava.g:435:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:439:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalMiniJava.g:440:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalMiniJava.g:440:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalMiniJava.g:441:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:442:3: ( rule__IfStatement__Group__0 )
            // InternalMiniJava.g:442:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalMiniJava.g:451:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:452:1: ( ruleWhileStatement EOF )
            // InternalMiniJava.g:453:1: ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhileStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalMiniJava.g:460:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:464:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalMiniJava.g:465:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalMiniJava.g:465:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalMiniJava.g:466:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:467:3: ( rule__WhileStatement__Group__0 )
            // InternalMiniJava.g:467:4: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalMiniJava.g:476:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:477:1: ( ruleForStatement EOF )
            // InternalMiniJava.g:478:1: ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMiniJava.g:485:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:489:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalMiniJava.g:490:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalMiniJava.g:490:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalMiniJava.g:491:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:492:3: ( rule__ForStatement__Group__0 )
            // InternalMiniJava.g:492:4: rule__ForStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleTypeRef"
    // InternalMiniJava.g:501:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // InternalMiniJava.g:502:1: ( ruleTypeRef EOF )
            // InternalMiniJava.g:503:1: ruleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalMiniJava.g:510:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:514:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // InternalMiniJava.g:515:2: ( ( rule__TypeRef__Group__0 ) )
            {
            // InternalMiniJava.g:515:2: ( ( rule__TypeRef__Group__0 ) )
            // InternalMiniJava.g:516:3: ( rule__TypeRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getGroup()); 
            }
            // InternalMiniJava.g:517:3: ( rule__TypeRef__Group__0 )
            // InternalMiniJava.g:517:4: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleSingleTypeRef"
    // InternalMiniJava.g:526:1: entryRuleSingleTypeRef : ruleSingleTypeRef EOF ;
    public final void entryRuleSingleTypeRef() throws RecognitionException {
        try {
            // InternalMiniJava.g:527:1: ( ruleSingleTypeRef EOF )
            // InternalMiniJava.g:528:1: ruleSingleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSingleTypeRef"


    // $ANTLR start "ruleSingleTypeRef"
    // InternalMiniJava.g:535:1: ruleSingleTypeRef : ( ( rule__SingleTypeRef__Alternatives ) ) ;
    public final void ruleSingleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:539:2: ( ( ( rule__SingleTypeRef__Alternatives ) ) )
            // InternalMiniJava.g:540:2: ( ( rule__SingleTypeRef__Alternatives ) )
            {
            // InternalMiniJava.g:540:2: ( ( rule__SingleTypeRef__Alternatives ) )
            // InternalMiniJava.g:541:3: ( rule__SingleTypeRef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:542:3: ( rule__SingleTypeRef__Alternatives )
            // InternalMiniJava.g:542:4: rule__SingleTypeRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleTypeRef"


    // $ANTLR start "entryRuleClassRef"
    // InternalMiniJava.g:551:1: entryRuleClassRef : ruleClassRef EOF ;
    public final void entryRuleClassRef() throws RecognitionException {
        try {
            // InternalMiniJava.g:552:1: ( ruleClassRef EOF )
            // InternalMiniJava.g:553:1: ruleClassRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassRef"


    // $ANTLR start "ruleClassRef"
    // InternalMiniJava.g:560:1: ruleClassRef : ( ( rule__ClassRef__ReferencedClassAssignment ) ) ;
    public final void ruleClassRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:564:2: ( ( ( rule__ClassRef__ReferencedClassAssignment ) ) )
            // InternalMiniJava.g:565:2: ( ( rule__ClassRef__ReferencedClassAssignment ) )
            {
            // InternalMiniJava.g:565:2: ( ( rule__ClassRef__ReferencedClassAssignment ) )
            // InternalMiniJava.g:566:3: ( rule__ClassRef__ReferencedClassAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefAccess().getReferencedClassAssignment()); 
            }
            // InternalMiniJava.g:567:3: ( rule__ClassRef__ReferencedClassAssignment )
            // InternalMiniJava.g:567:4: rule__ClassRef__ReferencedClassAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassRef__ReferencedClassAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefAccess().getReferencedClassAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassRef"


    // $ANTLR start "entryRuleTypedDeclaration"
    // InternalMiniJava.g:576:1: entryRuleTypedDeclaration : ruleTypedDeclaration EOF ;
    public final void entryRuleTypedDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:577:1: ( ruleTypedDeclaration EOF )
            // InternalMiniJava.g:578:1: ruleTypedDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypedDeclaration"


    // $ANTLR start "ruleTypedDeclaration"
    // InternalMiniJava.g:585:1: ruleTypedDeclaration : ( ( rule__TypedDeclaration__Alternatives ) ) ;
    public final void ruleTypedDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:589:2: ( ( ( rule__TypedDeclaration__Alternatives ) ) )
            // InternalMiniJava.g:590:2: ( ( rule__TypedDeclaration__Alternatives ) )
            {
            // InternalMiniJava.g:590:2: ( ( rule__TypedDeclaration__Alternatives ) )
            // InternalMiniJava.g:591:3: ( rule__TypedDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:592:3: ( rule__TypedDeclaration__Alternatives )
            // InternalMiniJava.g:592:4: rule__TypedDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypedDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedDeclaration"


    // $ANTLR start "entryRuleSymbol"
    // InternalMiniJava.g:601:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalMiniJava.g:602:1: ( ruleSymbol EOF )
            // InternalMiniJava.g:603:1: ruleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalMiniJava.g:610:1: ruleSymbol : ( ( rule__Symbol__Alternatives ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:614:2: ( ( ( rule__Symbol__Alternatives ) ) )
            // InternalMiniJava.g:615:2: ( ( rule__Symbol__Alternatives ) )
            {
            // InternalMiniJava.g:615:2: ( ( rule__Symbol__Alternatives ) )
            // InternalMiniJava.g:616:3: ( rule__Symbol__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:617:3: ( rule__Symbol__Alternatives )
            // InternalMiniJava.g:617:4: rule__Symbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMiniJava.g:626:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:627:1: ( ruleVariableDeclaration EOF )
            // InternalMiniJava.g:628:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMiniJava.g:635:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:639:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:640:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:640:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalMiniJava.g:641:3: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // InternalMiniJava.g:642:3: ( rule__VariableDeclaration__Group__0 )
            // InternalMiniJava.g:642:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAssignment"
    // InternalMiniJava.g:651:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMiniJava.g:652:1: ( ruleAssignment EOF )
            // InternalMiniJava.g:653:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMiniJava.g:660:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:664:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMiniJava.g:665:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMiniJava.g:665:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMiniJava.g:666:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalMiniJava.g:667:3: ( rule__Assignment__Group__0 )
            // InternalMiniJava.g:667:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignee"
    // InternalMiniJava.g:676:1: entryRuleAssignee : ruleAssignee EOF ;
    public final void entryRuleAssignee() throws RecognitionException {
        try {
            // InternalMiniJava.g:677:1: ( ruleAssignee EOF )
            // InternalMiniJava.g:678:1: ruleAssignee EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssigneeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignee();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssigneeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignee"


    // $ANTLR start "ruleAssignee"
    // InternalMiniJava.g:685:1: ruleAssignee : ( ( rule__Assignee__Alternatives ) ) ;
    public final void ruleAssignee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:689:2: ( ( ( rule__Assignee__Alternatives ) ) )
            // InternalMiniJava.g:690:2: ( ( rule__Assignee__Alternatives ) )
            {
            // InternalMiniJava.g:690:2: ( ( rule__Assignee__Alternatives ) )
            // InternalMiniJava.g:691:3: ( rule__Assignee__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssigneeAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:692:3: ( rule__Assignee__Alternatives )
            // InternalMiniJava.g:692:4: rule__Assignee__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Assignee__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssigneeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignee"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:701:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:702:1: ( ruleExpression EOF )
            // InternalMiniJava.g:703:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:710:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:714:2: ( ( ruleOr ) )
            // InternalMiniJava.g:715:2: ( ruleOr )
            {
            // InternalMiniJava.g:715:2: ( ruleOr )
            // InternalMiniJava.g:716:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalMiniJava.g:726:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMiniJava.g:727:1: ( ruleOr EOF )
            // InternalMiniJava.g:728:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMiniJava.g:735:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:739:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMiniJava.g:740:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMiniJava.g:740:2: ( ( rule__Or__Group__0 ) )
            // InternalMiniJava.g:741:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalMiniJava.g:742:3: ( rule__Or__Group__0 )
            // InternalMiniJava.g:742:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMiniJava.g:751:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMiniJava.g:752:1: ( ruleAnd EOF )
            // InternalMiniJava.g:753:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMiniJava.g:760:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:764:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMiniJava.g:765:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMiniJava.g:765:2: ( ( rule__And__Group__0 ) )
            // InternalMiniJava.g:766:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalMiniJava.g:767:3: ( rule__And__Group__0 )
            // InternalMiniJava.g:767:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMiniJava.g:776:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalMiniJava.g:777:1: ( ruleEquality EOF )
            // InternalMiniJava.g:778:1: ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMiniJava.g:785:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:789:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalMiniJava.g:790:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalMiniJava.g:790:2: ( ( rule__Equality__Group__0 ) )
            // InternalMiniJava.g:791:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalMiniJava.g:792:3: ( rule__Equality__Group__0 )
            // InternalMiniJava.g:792:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMiniJava.g:801:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMiniJava.g:802:1: ( ruleComparison EOF )
            // InternalMiniJava.g:803:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMiniJava.g:810:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:814:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMiniJava.g:815:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMiniJava.g:815:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMiniJava.g:816:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalMiniJava.g:817:3: ( rule__Comparison__Group__0 )
            // InternalMiniJava.g:817:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMiniJava.g:826:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMiniJava.g:827:1: ( rulePlusOrMinus EOF )
            // InternalMiniJava.g:828:1: rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMiniJava.g:835:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:839:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMiniJava.g:840:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMiniJava.g:840:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMiniJava.g:841:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalMiniJava.g:842:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMiniJava.g:842:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMiniJava.g:851:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalMiniJava.g:852:1: ( ruleMulOrDiv EOF )
            // InternalMiniJava.g:853:1: ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMiniJava.g:860:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:864:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalMiniJava.g:865:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalMiniJava.g:865:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalMiniJava.g:866:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalMiniJava.g:867:3: ( rule__MulOrDiv__Group__0 )
            // InternalMiniJava.g:867:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleArrayAccess"
    // InternalMiniJava.g:876:1: entryRuleArrayAccess : ruleArrayAccess EOF ;
    public final void entryRuleArrayAccess() throws RecognitionException {
        try {
            // InternalMiniJava.g:877:1: ( ruleArrayAccess EOF )
            // InternalMiniJava.g:878:1: ruleArrayAccess EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayAccess"


    // $ANTLR start "ruleArrayAccess"
    // InternalMiniJava.g:885:1: ruleArrayAccess : ( ( rule__ArrayAccess__Group__0 ) ) ;
    public final void ruleArrayAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:889:2: ( ( ( rule__ArrayAccess__Group__0 ) ) )
            // InternalMiniJava.g:890:2: ( ( rule__ArrayAccess__Group__0 ) )
            {
            // InternalMiniJava.g:890:2: ( ( rule__ArrayAccess__Group__0 ) )
            // InternalMiniJava.g:891:3: ( rule__ArrayAccess__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getGroup()); 
            }
            // InternalMiniJava.g:892:3: ( rule__ArrayAccess__Group__0 )
            // InternalMiniJava.g:892:4: rule__ArrayAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayAccess"


    // $ANTLR start "entryRuleArrayLength"
    // InternalMiniJava.g:901:1: entryRuleArrayLength : ruleArrayLength EOF ;
    public final void entryRuleArrayLength() throws RecognitionException {
        try {
            // InternalMiniJava.g:902:1: ( ruleArrayLength EOF )
            // InternalMiniJava.g:903:1: ruleArrayLength EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayLength();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalMiniJava.g:910:1: ruleArrayLength : ( ( rule__ArrayLength__Group__0 ) ) ;
    public final void ruleArrayLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:914:2: ( ( ( rule__ArrayLength__Group__0 ) ) )
            // InternalMiniJava.g:915:2: ( ( rule__ArrayLength__Group__0 ) )
            {
            // InternalMiniJava.g:915:2: ( ( rule__ArrayLength__Group__0 ) )
            // InternalMiniJava.g:916:3: ( rule__ArrayLength__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getGroup()); 
            }
            // InternalMiniJava.g:917:3: ( rule__ArrayLength__Group__0 )
            // InternalMiniJava.g:917:4: rule__ArrayLength__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniJava.g:926:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMiniJava.g:927:1: ( rulePrimary EOF )
            // InternalMiniJava.g:928:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniJava.g:935:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:939:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMiniJava.g:940:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMiniJava.g:940:2: ( ( rule__Primary__Alternatives ) )
            // InternalMiniJava.g:941:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:942:3: ( rule__Primary__Alternatives )
            // InternalMiniJava.g:942:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleSelectionExpression"
    // InternalMiniJava.g:951:1: entryRuleSelectionExpression : ruleSelectionExpression EOF ;
    public final void entryRuleSelectionExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:952:1: ( ruleSelectionExpression EOF )
            // InternalMiniJava.g:953:1: ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // InternalMiniJava.g:960:1: ruleSelectionExpression : ( ( rule__SelectionExpression__Group__0 ) ) ;
    public final void ruleSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:964:2: ( ( ( rule__SelectionExpression__Group__0 ) ) )
            // InternalMiniJava.g:965:2: ( ( rule__SelectionExpression__Group__0 ) )
            {
            // InternalMiniJava.g:965:2: ( ( rule__SelectionExpression__Group__0 ) )
            // InternalMiniJava.g:966:3: ( rule__SelectionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup()); 
            }
            // InternalMiniJava.g:967:3: ( rule__SelectionExpression__Group__0 )
            // InternalMiniJava.g:967:4: rule__SelectionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava.g:976:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:977:1: ( ruleTerminalExpression EOF )
            // InternalMiniJava.g:978:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalMiniJava.g:985:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:989:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalMiniJava.g:990:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalMiniJava.g:990:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalMiniJava.g:991:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:992:3: ( rule__TerminalExpression__Alternatives )
            // InternalMiniJava.g:992:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleAccessLevel"
    // InternalMiniJava.g:1001:1: ruleAccessLevel : ( ( rule__AccessLevel__Alternatives ) ) ;
    public final void ruleAccessLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1005:1: ( ( ( rule__AccessLevel__Alternatives ) ) )
            // InternalMiniJava.g:1006:2: ( ( rule__AccessLevel__Alternatives ) )
            {
            // InternalMiniJava.g:1006:2: ( ( rule__AccessLevel__Alternatives ) )
            // InternalMiniJava.g:1007:3: ( rule__AccessLevel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessLevelAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:1008:3: ( rule__AccessLevel__Alternatives )
            // InternalMiniJava.g:1008:4: rule__AccessLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessLevel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessLevelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessLevel"


    // $ANTLR start "rule__TypeDeclaration__Alternatives"
    // InternalMiniJava.g:1016:1: rule__TypeDeclaration__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__TypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1020:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21||LA1_1==63) ) {
                    alt1=1;
                }
                else if ( (LA1_1==27) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==21||LA1_2==63) ) {
                    alt1=1;
                }
                else if ( (LA1_2==27) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==21||LA1_3==63) ) {
                    alt1=1;
                }
                else if ( (LA1_3==27) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 63:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:1021:2: ( ruleClass )
                    {
                    // InternalMiniJava.g:1021:2: ( ruleClass )
                    // InternalMiniJava.g:1022:3: ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDeclarationAccess().getClassParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDeclarationAccess().getClassParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1027:2: ( ruleInterface )
                    {
                    // InternalMiniJava.g:1027:2: ( ruleInterface )
                    // InternalMiniJava.g:1028:3: ruleInterface
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDeclarationAccess().getInterfaceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDeclarationAccess().getInterfaceParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__TypeDeclaration__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalMiniJava.g:1037:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1041:1: ( ( ruleField ) | ( ruleMethod ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:1042:2: ( ruleField )
                    {
                    // InternalMiniJava.g:1042:2: ( ruleField )
                    // InternalMiniJava.g:1043:3: ruleField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1048:2: ( ruleMethod )
                    {
                    // InternalMiniJava.g:1048:2: ( ruleMethod )
                    // InternalMiniJava.g:1049:3: ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Method__Alternatives_8"
    // InternalMiniJava.g:1058:1: rule__Method__Alternatives_8 : ( ( ( rule__Method__BodyAssignment_8_0 ) ) | ( ';' ) );
    public final void rule__Method__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1062:1: ( ( ( rule__Method__BodyAssignment_8_0 ) ) | ( ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniJava.g:1063:2: ( ( rule__Method__BodyAssignment_8_0 ) )
                    {
                    // InternalMiniJava.g:1063:2: ( ( rule__Method__BodyAssignment_8_0 ) )
                    // InternalMiniJava.g:1064:3: ( rule__Method__BodyAssignment_8_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getBodyAssignment_8_0()); 
                    }
                    // InternalMiniJava.g:1065:3: ( rule__Method__BodyAssignment_8_0 )
                    // InternalMiniJava.g:1065:4: rule__Method__BodyAssignment_8_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__BodyAssignment_8_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getBodyAssignment_8_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1069:2: ( ';' )
                    {
                    // InternalMiniJava.g:1069:2: ( ';' )
                    // InternalMiniJava.g:1070:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getSemicolonKeyword_8_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getSemicolonKeyword_8_1()); 
                    }

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
    // $ANTLR end "rule__Method__Alternatives_8"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMiniJava.g:1079:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleForStatement ) | ( ( rule__Statement__Group_5__0 ) ) | ( ruleBlock ) | ( ( rule__Statement__Group_7__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1083:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleForStatement ) | ( ( rule__Statement__Group_5__0 ) ) | ( ruleBlock ) | ( ( rule__Statement__Group_7__0 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:1084:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:1084:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalMiniJava.g:1085:3: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // InternalMiniJava.g:1086:3: ( rule__Statement__Group_0__0 )
                    // InternalMiniJava.g:1086:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1090:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1090:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalMiniJava.g:1091:3: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1092:3: ( rule__Statement__Group_1__0 )
                    // InternalMiniJava.g:1092:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1096:2: ( ruleIfStatement )
                    {
                    // InternalMiniJava.g:1096:2: ( ruleIfStatement )
                    // InternalMiniJava.g:1097:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1102:2: ( ruleWhileStatement )
                    {
                    // InternalMiniJava.g:1102:2: ( ruleWhileStatement )
                    // InternalMiniJava.g:1103:3: ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1108:2: ( ruleForStatement )
                    {
                    // InternalMiniJava.g:1108:2: ( ruleForStatement )
                    // InternalMiniJava.g:1109:3: ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1114:2: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:1114:2: ( ( rule__Statement__Group_5__0 ) )
                    // InternalMiniJava.g:1115:3: ( rule__Statement__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // InternalMiniJava.g:1116:3: ( rule__Statement__Group_5__0 )
                    // InternalMiniJava.g:1116:4: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1120:2: ( ruleBlock )
                    {
                    // InternalMiniJava.g:1120:2: ( ruleBlock )
                    // InternalMiniJava.g:1121:3: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBlockParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getBlockParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1126:2: ( ( rule__Statement__Group_7__0 ) )
                    {
                    // InternalMiniJava.g:1126:2: ( ( rule__Statement__Group_7__0 ) )
                    // InternalMiniJava.g:1127:3: ( rule__Statement__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_7()); 
                    }
                    // InternalMiniJava.g:1128:3: ( rule__Statement__Group_7__0 )
                    // InternalMiniJava.g:1128:4: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_7()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__SingleTypeRef__Alternatives"
    // InternalMiniJava.g:1136:1: rule__SingleTypeRef__Alternatives : ( ( ruleClassRef ) | ( ( rule__SingleTypeRef__Group_1__0 ) ) | ( ( rule__SingleTypeRef__Group_2__0 ) ) | ( ( rule__SingleTypeRef__Group_3__0 ) ) | ( ( rule__SingleTypeRef__Group_4__0 ) ) );
    public final void rule__SingleTypeRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1140:1: ( ( ruleClassRef ) | ( ( rule__SingleTypeRef__Group_1__0 ) ) | ( ( rule__SingleTypeRef__Group_2__0 ) ) | ( ( rule__SingleTypeRef__Group_3__0 ) ) | ( ( rule__SingleTypeRef__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            case 44:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:1141:2: ( ruleClassRef )
                    {
                    // InternalMiniJava.g:1141:2: ( ruleClassRef )
                    // InternalMiniJava.g:1142:3: ruleClassRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getClassRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClassRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getClassRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1147:2: ( ( rule__SingleTypeRef__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1147:2: ( ( rule__SingleTypeRef__Group_1__0 ) )
                    // InternalMiniJava.g:1148:3: ( rule__SingleTypeRef__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1149:3: ( rule__SingleTypeRef__Group_1__0 )
                    // InternalMiniJava.g:1149:4: rule__SingleTypeRef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1153:2: ( ( rule__SingleTypeRef__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:1153:2: ( ( rule__SingleTypeRef__Group_2__0 ) )
                    // InternalMiniJava.g:1154:3: ( rule__SingleTypeRef__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:1155:3: ( rule__SingleTypeRef__Group_2__0 )
                    // InternalMiniJava.g:1155:4: rule__SingleTypeRef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1159:2: ( ( rule__SingleTypeRef__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:1159:2: ( ( rule__SingleTypeRef__Group_3__0 ) )
                    // InternalMiniJava.g:1160:3: ( rule__SingleTypeRef__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_3()); 
                    }
                    // InternalMiniJava.g:1161:3: ( rule__SingleTypeRef__Group_3__0 )
                    // InternalMiniJava.g:1161:4: rule__SingleTypeRef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1165:2: ( ( rule__SingleTypeRef__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:1165:2: ( ( rule__SingleTypeRef__Group_4__0 ) )
                    // InternalMiniJava.g:1166:3: ( rule__SingleTypeRef__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_4()); 
                    }
                    // InternalMiniJava.g:1167:3: ( rule__SingleTypeRef__Group_4__0 )
                    // InternalMiniJava.g:1167:4: rule__SingleTypeRef__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_4()); 
                    }

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
    // $ANTLR end "rule__SingleTypeRef__Alternatives"


    // $ANTLR start "rule__TypedDeclaration__Alternatives"
    // InternalMiniJava.g:1175:1: rule__TypedDeclaration__Alternatives : ( ( ruleSymbol ) | ( ruleMember ) );
    public final void rule__TypedDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1179:1: ( ( ruleSymbol ) | ( ruleMember ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:1180:2: ( ruleSymbol )
                    {
                    // InternalMiniJava.g:1180:2: ( ruleSymbol )
                    // InternalMiniJava.g:1181:3: ruleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypedDeclarationAccess().getSymbolParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSymbol();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypedDeclarationAccess().getSymbolParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1186:2: ( ruleMember )
                    {
                    // InternalMiniJava.g:1186:2: ( ruleMember )
                    // InternalMiniJava.g:1187:3: ruleMember
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypedDeclarationAccess().getMemberParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMember();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypedDeclarationAccess().getMemberParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__TypedDeclaration__Alternatives"


    // $ANTLR start "rule__Symbol__Alternatives"
    // InternalMiniJava.g:1196:1: rule__Symbol__Alternatives : ( ( ( ruleParameter ) ) | ( ruleVariableDeclaration ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1200:1: ( ( ( ruleParameter ) ) | ( ruleVariableDeclaration ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:1201:2: ( ( ruleParameter ) )
                    {
                    // InternalMiniJava.g:1201:2: ( ( ruleParameter ) )
                    // InternalMiniJava.g:1202:3: ( ruleParameter )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0()); 
                    }
                    // InternalMiniJava.g:1203:3: ( ruleParameter )
                    // InternalMiniJava.g:1203:4: ruleParameter
                    {
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1207:2: ( ruleVariableDeclaration )
                    {
                    // InternalMiniJava.g:1207:2: ( ruleVariableDeclaration )
                    // InternalMiniJava.g:1208:3: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Symbol__Alternatives"


    // $ANTLR start "rule__Assignee__Alternatives"
    // InternalMiniJava.g:1217:1: rule__Assignee__Alternatives : ( ( ( ruleArrayAccess ) ) | ( ruleVariableDeclaration ) );
    public final void rule__Assignee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1221:1: ( ( ( ruleArrayAccess ) ) | ( ruleVariableDeclaration ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:1222:2: ( ( ruleArrayAccess ) )
                    {
                    // InternalMiniJava.g:1222:2: ( ( ruleArrayAccess ) )
                    // InternalMiniJava.g:1223:3: ( ruleArrayAccess )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssigneeAccess().getArrayAccessParserRuleCall_0()); 
                    }
                    // InternalMiniJava.g:1224:3: ( ruleArrayAccess )
                    // InternalMiniJava.g:1224:4: ruleArrayAccess
                    {
                    pushFollow(FOLLOW_2);
                    ruleArrayAccess();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssigneeAccess().getArrayAccessParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1228:2: ( ruleVariableDeclaration )
                    {
                    // InternalMiniJava.g:1228:2: ( ruleVariableDeclaration )
                    // InternalMiniJava.g:1229:3: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssigneeAccess().getVariableDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssigneeAccess().getVariableDeclarationParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Assignee__Alternatives"


    // $ANTLR start "rule__Equality__Alternatives_1_0"
    // InternalMiniJava.g:1238:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1242:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==48) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:1243:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1243:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1244:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1245:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalMiniJava.g:1245:4: rule__Equality__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1249:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1249:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1250:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1251:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalMiniJava.g:1251:4: rule__Equality__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Equality__Alternatives_1_0"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // InternalMiniJava.g:1259:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1263:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 51:
                {
                alt10=3;
                }
                break;
            case 52:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMiniJava.g:1264:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1264:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1265:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1266:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalMiniJava.g:1266:4: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1270:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1270:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1271:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1272:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalMiniJava.g:1272:4: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1276:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalMiniJava.g:1276:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalMiniJava.g:1277:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }
                    // InternalMiniJava.g:1278:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalMiniJava.g:1278:4: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1282:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // InternalMiniJava.g:1282:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // InternalMiniJava.g:1283:3: ( rule__Comparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }
                    // InternalMiniJava.g:1284:3: ( rule__Comparison__Group_1_0_3__0 )
                    // InternalMiniJava.g:1284:4: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }

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
    // $ANTLR end "rule__Comparison__Alternatives_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalMiniJava.g:1292:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1296:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            else if ( (LA11_0==54) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMiniJava.g:1297:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1297:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1298:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1299:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalMiniJava.g:1299:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1303:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1303:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1304:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1305:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalMiniJava.g:1305:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__Alternatives_1_0"
    // InternalMiniJava.g:1313:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1317:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==55) ) {
                alt12=1;
            }
            else if ( (LA12_0==56) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:1318:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1318:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1319:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1320:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalMiniJava.g:1320:4: rule__MulOrDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1324:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1324:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1325:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1326:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalMiniJava.g:1326:4: rule__MulOrDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }

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
    // $ANTLR end "rule__MulOrDiv__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMiniJava.g:1334:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleSelectionExpression ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1338:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleSelectionExpression ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 58:
                {
                alt13=2;
                }
                break;
            case 54:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 12:
            case 13:
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:1339:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:1339:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMiniJava.g:1340:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalMiniJava.g:1341:3: ( rule__Primary__Group_0__0 )
                    // InternalMiniJava.g:1341:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1345:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1345:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMiniJava.g:1346:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1347:3: ( rule__Primary__Group_1__0 )
                    // InternalMiniJava.g:1347:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1351:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:1351:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMiniJava.g:1352:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:1353:3: ( rule__Primary__Group_2__0 )
                    // InternalMiniJava.g:1353:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1357:2: ( ruleSelectionExpression )
                    {
                    // InternalMiniJava.g:1357:2: ( ruleSelectionExpression )
                    // InternalMiniJava.g:1358:3: ruleSelectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getSelectionExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSelectionExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getSelectionExpressionParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__SelectionExpression__Alternatives_1"
    // InternalMiniJava.g:1367:1: rule__SelectionExpression__Alternatives_1 : ( ( ( rule__SelectionExpression__Group_1_0__0 ) ) | ( ( rule__SelectionExpression__Group_1_1__0 ) ) );
    public final void rule__SelectionExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1371:1: ( ( ( rule__SelectionExpression__Group_1_0__0 ) ) | ( ( rule__SelectionExpression__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==EOF||LA14_2==11||LA14_2==19||LA14_2==26||(LA14_2>=29 && LA14_2<=30)||(LA14_2>=39 && LA14_2<=40)||(LA14_2>=45 && LA14_2<=56)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==28) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniJava.g:1372:2: ( ( rule__SelectionExpression__Group_1_0__0 ) )
                    {
                    // InternalMiniJava.g:1372:2: ( ( rule__SelectionExpression__Group_1_0__0 ) )
                    // InternalMiniJava.g:1373:3: ( rule__SelectionExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectionExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalMiniJava.g:1374:3: ( rule__SelectionExpression__Group_1_0__0 )
                    // InternalMiniJava.g:1374:4: rule__SelectionExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectionExpressionAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1378:2: ( ( rule__SelectionExpression__Group_1_1__0 ) )
                    {
                    // InternalMiniJava.g:1378:2: ( ( rule__SelectionExpression__Group_1_1__0 ) )
                    // InternalMiniJava.g:1379:3: ( rule__SelectionExpression__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectionExpressionAccess().getGroup_1_1()); 
                    }
                    // InternalMiniJava.g:1380:3: ( rule__SelectionExpression__Group_1_1__0 )
                    // InternalMiniJava.g:1380:4: rule__SelectionExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectionExpressionAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__SelectionExpression__Alternatives_1"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalMiniJava.g:1388:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1392:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:1393:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:1393:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalMiniJava.g:1394:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalMiniJava.g:1395:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalMiniJava.g:1395:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1399:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1399:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalMiniJava.g:1400:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1401:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalMiniJava.g:1401:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1405:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:1405:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalMiniJava.g:1406:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:1407:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalMiniJava.g:1407:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1411:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:1411:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalMiniJava.g:1412:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalMiniJava.g:1413:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalMiniJava.g:1413:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1417:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:1417:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalMiniJava.g:1418:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalMiniJava.g:1419:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalMiniJava.g:1419:4: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1423:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:1423:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalMiniJava.g:1424:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalMiniJava.g:1425:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalMiniJava.g:1425:4: rule__TerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1429:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalMiniJava.g:1429:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalMiniJava.g:1430:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }
                    // InternalMiniJava.g:1431:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalMiniJava.g:1431:4: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1435:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    {
                    // InternalMiniJava.g:1435:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    // InternalMiniJava.g:1436:3: ( rule__TerminalExpression__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    }
                    // InternalMiniJava.g:1437:3: ( rule__TerminalExpression__Group_7__0 )
                    // InternalMiniJava.g:1437:4: rule__TerminalExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:1441:2: ( ( rule__TerminalExpression__Group_8__0 ) )
                    {
                    // InternalMiniJava.g:1441:2: ( ( rule__TerminalExpression__Group_8__0 ) )
                    // InternalMiniJava.g:1442:3: ( rule__TerminalExpression__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_8()); 
                    }
                    // InternalMiniJava.g:1443:3: ( rule__TerminalExpression__Group_8__0 )
                    // InternalMiniJava.g:1443:4: rule__TerminalExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_8()); 
                    }

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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__TerminalExpression__ValueAlternatives_2_1_0"
    // InternalMiniJava.g:1451:1: rule__TerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__TerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1455:1: ( ( 'true' ) | ( 'false' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==13) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniJava.g:1456:2: ( 'true' )
                    {
                    // InternalMiniJava.g:1456:2: ( 'true' )
                    // InternalMiniJava.g:1457:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1462:2: ( 'false' )
                    {
                    // InternalMiniJava.g:1462:2: ( 'false' )
                    // InternalMiniJava.g:1463:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }

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
    // $ANTLR end "rule__TerminalExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__AccessLevel__Alternatives"
    // InternalMiniJava.g:1472:1: rule__AccessLevel__Alternatives : ( ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'public' ) ) );
    public final void rule__AccessLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1476:1: ( ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'public' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt17=1;
                }
                break;
            case 15:
                {
                alt17=2;
                }
                break;
            case 16:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:1477:2: ( ( 'private' ) )
                    {
                    // InternalMiniJava.g:1477:2: ( ( 'private' ) )
                    // InternalMiniJava.g:1478:3: ( 'private' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }
                    // InternalMiniJava.g:1479:3: ( 'private' )
                    // InternalMiniJava.g:1479:4: 'private'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1483:2: ( ( 'protected' ) )
                    {
                    // InternalMiniJava.g:1483:2: ( ( 'protected' ) )
                    // InternalMiniJava.g:1484:3: ( 'protected' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1()); 
                    }
                    // InternalMiniJava.g:1485:3: ( 'protected' )
                    // InternalMiniJava.g:1485:4: 'protected'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1489:2: ( ( 'public' ) )
                    {
                    // InternalMiniJava.g:1489:2: ( ( 'public' ) )
                    // InternalMiniJava.g:1490:3: ( 'public' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
                    }
                    // InternalMiniJava.g:1491:3: ( 'public' )
                    // InternalMiniJava.g:1491:4: 'public'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__AccessLevel__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMiniJava.g:1499:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1503:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMiniJava.g:1504:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMiniJava.g:1511:1: rule__Program__Group__0__Impl : ( ( rule__Program__Group_0__0 )? ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1515:1: ( ( ( rule__Program__Group_0__0 )? ) )
            // InternalMiniJava.g:1516:1: ( ( rule__Program__Group_0__0 )? )
            {
            // InternalMiniJava.g:1516:1: ( ( rule__Program__Group_0__0 )? )
            // InternalMiniJava.g:1517:2: ( rule__Program__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_0()); 
            }
            // InternalMiniJava.g:1518:2: ( rule__Program__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:1518:3: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMiniJava.g:1526:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1530:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMiniJava.g:1531:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMiniJava.g:1538:1: rule__Program__Group__1__Impl : ( ( rule__Program__ImportsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1542:1: ( ( ( rule__Program__ImportsAssignment_1 )* ) )
            // InternalMiniJava.g:1543:1: ( ( rule__Program__ImportsAssignment_1 )* )
            {
            // InternalMiniJava.g:1543:1: ( ( rule__Program__ImportsAssignment_1 )* )
            // InternalMiniJava.g:1544:2: ( rule__Program__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
            }
            // InternalMiniJava.g:1545:2: ( rule__Program__ImportsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniJava.g:1545:3: rule__Program__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMiniJava.g:1553:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1557:1: ( rule__Program__Group__2__Impl )
            // InternalMiniJava.g:1558:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMiniJava.g:1564:1: rule__Program__Group__2__Impl : ( ( rule__Program__ClassesAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1568:1: ( ( ( rule__Program__ClassesAssignment_2 )* ) )
            // InternalMiniJava.g:1569:1: ( ( rule__Program__ClassesAssignment_2 )* )
            {
            // InternalMiniJava.g:1569:1: ( ( rule__Program__ClassesAssignment_2 )* )
            // InternalMiniJava.g:1570:2: ( rule__Program__ClassesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
            }
            // InternalMiniJava.g:1571:2: ( rule__Program__ClassesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=14 && LA20_0<=16)||LA20_0==21||LA20_0==27||LA20_0==63) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMiniJava.g:1571:3: rule__Program__ClassesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__ClassesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group_0__0"
    // InternalMiniJava.g:1580:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1584:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // InternalMiniJava.g:1585:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // InternalMiniJava.g:1592:1: rule__Program__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1596:1: ( ( 'package' ) )
            // InternalMiniJava.g:1597:1: ( 'package' )
            {
            // InternalMiniJava.g:1597:1: ( 'package' )
            // InternalMiniJava.g:1598:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getPackageKeyword_0_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getPackageKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // InternalMiniJava.g:1607:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl rule__Program__Group_0__2 ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1611:1: ( rule__Program__Group_0__1__Impl rule__Program__Group_0__2 )
            // InternalMiniJava.g:1612:2: rule__Program__Group_0__1__Impl rule__Program__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // InternalMiniJava.g:1619:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__NameAssignment_0_1 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1623:1: ( ( ( rule__Program__NameAssignment_0_1 ) ) )
            // InternalMiniJava.g:1624:1: ( ( rule__Program__NameAssignment_0_1 ) )
            {
            // InternalMiniJava.g:1624:1: ( ( rule__Program__NameAssignment_0_1 ) )
            // InternalMiniJava.g:1625:2: ( rule__Program__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
            }
            // InternalMiniJava.g:1626:2: ( rule__Program__NameAssignment_0_1 )
            // InternalMiniJava.g:1626:3: rule__Program__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0__2"
    // InternalMiniJava.g:1634:1: rule__Program__Group_0__2 : rule__Program__Group_0__2__Impl ;
    public final void rule__Program__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1638:1: ( rule__Program__Group_0__2__Impl )
            // InternalMiniJava.g:1639:2: rule__Program__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2"


    // $ANTLR start "rule__Program__Group_0__2__Impl"
    // InternalMiniJava.g:1645:1: rule__Program__Group_0__2__Impl : ( ';' ) ;
    public final void rule__Program__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1649:1: ( ( ';' ) )
            // InternalMiniJava.g:1650:1: ( ';' )
            {
            // InternalMiniJava.g:1650:1: ( ';' )
            // InternalMiniJava.g:1651:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMiniJava.g:1661:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1665:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMiniJava.g:1666:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMiniJava.g:1673:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1677:1: ( ( 'import' ) )
            // InternalMiniJava.g:1678:1: ( 'import' )
            {
            // InternalMiniJava.g:1678:1: ( 'import' )
            // InternalMiniJava.g:1679:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMiniJava.g:1688:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1692:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMiniJava.g:1693:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMiniJava.g:1700:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1704:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMiniJava.g:1705:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMiniJava.g:1705:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMiniJava.g:1706:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalMiniJava.g:1707:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMiniJava.g:1707:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMiniJava.g:1715:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1719:1: ( rule__Import__Group__2__Impl )
            // InternalMiniJava.g:1720:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMiniJava.g:1726:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1730:1: ( ( ';' ) )
            // InternalMiniJava.g:1731:1: ( ';' )
            {
            // InternalMiniJava.g:1731:1: ( ';' )
            // InternalMiniJava.g:1732:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMiniJava.g:1742:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1746:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMiniJava.g:1747:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMiniJava.g:1754:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1758:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1759:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1759:1: ( RULE_ID )
            // InternalMiniJava.g:1760:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMiniJava.g:1769:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1773:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMiniJava.g:1774:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMiniJava.g:1780:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1784:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMiniJava.g:1785:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMiniJava.g:1785:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMiniJava.g:1786:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:1787:2: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMiniJava.g:1787:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMiniJava.g:1796:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1800:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMiniJava.g:1801:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMiniJava.g:1808:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1812:1: ( ( '.' ) )
            // InternalMiniJava.g:1813:1: ( '.' )
            {
            // InternalMiniJava.g:1813:1: ( '.' )
            // InternalMiniJava.g:1814:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMiniJava.g:1823:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1827:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMiniJava.g:1828:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMiniJava.g:1834:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1838:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1839:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1839:1: ( RULE_ID )
            // InternalMiniJava.g:1840:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalMiniJava.g:1850:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1854:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMiniJava.g:1855:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalMiniJava.g:1862:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1866:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:1867:1: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:1867:1: ( ruleQualifiedName )
            // InternalMiniJava.g:1868:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalMiniJava.g:1877:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1881:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMiniJava.g:1882:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalMiniJava.g:1888:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1892:1: ( ( ( '.*' )? ) )
            // InternalMiniJava.g:1893:1: ( ( '.*' )? )
            {
            // InternalMiniJava.g:1893:1: ( ( '.*' )? )
            // InternalMiniJava.g:1894:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalMiniJava.g:1895:2: ( '.*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMiniJava.g:1895:3: '.*'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalMiniJava.g:1904:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1908:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMiniJava.g:1909:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalMiniJava.g:1916:1: rule__Class__Group__0__Impl : ( ( rule__Class__AccessLevelAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1920:1: ( ( ( rule__Class__AccessLevelAssignment_0 )? ) )
            // InternalMiniJava.g:1921:1: ( ( rule__Class__AccessLevelAssignment_0 )? )
            {
            // InternalMiniJava.g:1921:1: ( ( rule__Class__AccessLevelAssignment_0 )? )
            // InternalMiniJava.g:1922:2: ( rule__Class__AccessLevelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAccessLevelAssignment_0()); 
            }
            // InternalMiniJava.g:1923:2: ( rule__Class__AccessLevelAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=14 && LA23_0<=16)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMiniJava.g:1923:3: rule__Class__AccessLevelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AccessLevelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAccessLevelAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalMiniJava.g:1931:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1935:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMiniJava.g:1936:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalMiniJava.g:1943:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1947:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalMiniJava.g:1948:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalMiniJava.g:1948:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalMiniJava.g:1949:2: ( rule__Class__AbstractAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            }
            // InternalMiniJava.g:1950:2: ( rule__Class__AbstractAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniJava.g:1950:3: rule__Class__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalMiniJava.g:1958:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1962:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMiniJava.g:1963:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalMiniJava.g:1970:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1974:1: ( ( 'class' ) )
            // InternalMiniJava.g:1975:1: ( 'class' )
            {
            // InternalMiniJava.g:1975:1: ( 'class' )
            // InternalMiniJava.g:1976:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalMiniJava.g:1985:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1989:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMiniJava.g:1990:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalMiniJava.g:1997:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2001:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalMiniJava.g:2002:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalMiniJava.g:2002:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalMiniJava.g:2003:2: ( rule__Class__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            }
            // InternalMiniJava.g:2004:2: ( rule__Class__NameAssignment_3 )
            // InternalMiniJava.g:2004:3: rule__Class__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalMiniJava.g:2012:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2016:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMiniJava.g:2017:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalMiniJava.g:2024:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2028:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalMiniJava.g:2029:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalMiniJava.g:2029:1: ( ( rule__Class__Group_4__0 )? )
            // InternalMiniJava.g:2030:2: ( rule__Class__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_4()); 
            }
            // InternalMiniJava.g:2031:2: ( rule__Class__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiniJava.g:2031:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalMiniJava.g:2039:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2043:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMiniJava.g:2044:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalMiniJava.g:2051:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2055:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalMiniJava.g:2056:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalMiniJava.g:2056:1: ( ( rule__Class__Group_5__0 )? )
            // InternalMiniJava.g:2057:2: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // InternalMiniJava.g:2058:2: ( rule__Class__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMiniJava.g:2058:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalMiniJava.g:2066:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2070:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalMiniJava.g:2071:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalMiniJava.g:2078:1: rule__Class__Group__6__Impl : ( '{' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2082:1: ( ( '{' ) )
            // InternalMiniJava.g:2083:1: ( '{' )
            {
            // InternalMiniJava.g:2083:1: ( '{' )
            // InternalMiniJava.g:2084:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalMiniJava.g:2093:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2097:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalMiniJava.g:2098:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalMiniJava.g:2105:1: rule__Class__Group__7__Impl : ( ( rule__Class__MembersAssignment_7 )* ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2109:1: ( ( ( rule__Class__MembersAssignment_7 )* ) )
            // InternalMiniJava.g:2110:1: ( ( rule__Class__MembersAssignment_7 )* )
            {
            // InternalMiniJava.g:2110:1: ( ( rule__Class__MembersAssignment_7 )* )
            // InternalMiniJava.g:2111:2: ( rule__Class__MembersAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMembersAssignment_7()); 
            }
            // InternalMiniJava.g:2112:2: ( rule__Class__MembersAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=14 && LA27_0<=16)||(LA27_0>=41 && LA27_0<=44)||(LA27_0>=63 && LA27_0<=64)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMiniJava.g:2112:3: rule__Class__MembersAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Class__MembersAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMembersAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalMiniJava.g:2120:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2124:1: ( rule__Class__Group__8__Impl )
            // InternalMiniJava.g:2125:2: rule__Class__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // InternalMiniJava.g:2131:1: rule__Class__Group__8__Impl : ( '}' ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2135:1: ( ( '}' ) )
            // InternalMiniJava.g:2136:1: ( '}' )
            {
            // InternalMiniJava.g:2136:1: ( '}' )
            // InternalMiniJava.g:2137:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalMiniJava.g:2147:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2151:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalMiniJava.g:2152:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalMiniJava.g:2159:1: rule__Class__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2163:1: ( ( 'extends' ) )
            // InternalMiniJava.g:2164:1: ( 'extends' )
            {
            // InternalMiniJava.g:2164:1: ( 'extends' )
            // InternalMiniJava.g:2165:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalMiniJava.g:2174:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2178:1: ( rule__Class__Group_4__1__Impl )
            // InternalMiniJava.g:2179:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalMiniJava.g:2185:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__SuperClassAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2189:1: ( ( ( rule__Class__SuperClassAssignment_4_1 ) ) )
            // InternalMiniJava.g:2190:1: ( ( rule__Class__SuperClassAssignment_4_1 ) )
            {
            // InternalMiniJava.g:2190:1: ( ( rule__Class__SuperClassAssignment_4_1 ) )
            // InternalMiniJava.g:2191:2: ( rule__Class__SuperClassAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperClassAssignment_4_1()); 
            }
            // InternalMiniJava.g:2192:2: ( rule__Class__SuperClassAssignment_4_1 )
            // InternalMiniJava.g:2192:3: rule__Class__SuperClassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperClassAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperClassAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalMiniJava.g:2201:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2205:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalMiniJava.g:2206:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalMiniJava.g:2213:1: rule__Class__Group_5__0__Impl : ( 'implements' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2217:1: ( ( 'implements' ) )
            // InternalMiniJava.g:2218:1: ( 'implements' )
            {
            // InternalMiniJava.g:2218:1: ( 'implements' )
            // InternalMiniJava.g:2219:2: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getImplementsKeyword_5_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getImplementsKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalMiniJava.g:2228:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2232:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalMiniJava.g:2233:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalMiniJava.g:2240:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__ImplementsAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2244:1: ( ( ( rule__Class__ImplementsAssignment_5_1 ) ) )
            // InternalMiniJava.g:2245:1: ( ( rule__Class__ImplementsAssignment_5_1 ) )
            {
            // InternalMiniJava.g:2245:1: ( ( rule__Class__ImplementsAssignment_5_1 ) )
            // InternalMiniJava.g:2246:2: ( rule__Class__ImplementsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getImplementsAssignment_5_1()); 
            }
            // InternalMiniJava.g:2247:2: ( rule__Class__ImplementsAssignment_5_1 )
            // InternalMiniJava.g:2247:3: rule__Class__ImplementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ImplementsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getImplementsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalMiniJava.g:2255:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2259:1: ( rule__Class__Group_5__2__Impl )
            // InternalMiniJava.g:2260:2: rule__Class__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalMiniJava.g:2266:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__Group_5_2__0 )* ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2270:1: ( ( ( rule__Class__Group_5_2__0 )* ) )
            // InternalMiniJava.g:2271:1: ( ( rule__Class__Group_5_2__0 )* )
            {
            // InternalMiniJava.g:2271:1: ( ( rule__Class__Group_5_2__0 )* )
            // InternalMiniJava.g:2272:2: ( rule__Class__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5_2()); 
            }
            // InternalMiniJava.g:2273:2: ( rule__Class__Group_5_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMiniJava.g:2273:3: rule__Class__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group_5_2__0"
    // InternalMiniJava.g:2282:1: rule__Class__Group_5_2__0 : rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 ;
    public final void rule__Class__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2286:1: ( rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 )
            // InternalMiniJava.g:2287:2: rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__0"


    // $ANTLR start "rule__Class__Group_5_2__0__Impl"
    // InternalMiniJava.g:2294:1: rule__Class__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2298:1: ( ( ',' ) )
            // InternalMiniJava.g:2299:1: ( ',' )
            {
            // InternalMiniJava.g:2299:1: ( ',' )
            // InternalMiniJava.g:2300:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getCommaKeyword_5_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getCommaKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__0__Impl"


    // $ANTLR start "rule__Class__Group_5_2__1"
    // InternalMiniJava.g:2309:1: rule__Class__Group_5_2__1 : rule__Class__Group_5_2__1__Impl ;
    public final void rule__Class__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2313:1: ( rule__Class__Group_5_2__1__Impl )
            // InternalMiniJava.g:2314:2: rule__Class__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__1"


    // $ANTLR start "rule__Class__Group_5_2__1__Impl"
    // InternalMiniJava.g:2320:1: rule__Class__Group_5_2__1__Impl : ( ( rule__Class__ImplementsAssignment_5_2_1 ) ) ;
    public final void rule__Class__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2324:1: ( ( ( rule__Class__ImplementsAssignment_5_2_1 ) ) )
            // InternalMiniJava.g:2325:1: ( ( rule__Class__ImplementsAssignment_5_2_1 ) )
            {
            // InternalMiniJava.g:2325:1: ( ( rule__Class__ImplementsAssignment_5_2_1 ) )
            // InternalMiniJava.g:2326:2: ( rule__Class__ImplementsAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getImplementsAssignment_5_2_1()); 
            }
            // InternalMiniJava.g:2327:2: ( rule__Class__ImplementsAssignment_5_2_1 )
            // InternalMiniJava.g:2327:3: rule__Class__ImplementsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ImplementsAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getImplementsAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalMiniJava.g:2336:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2340:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalMiniJava.g:2341:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalMiniJava.g:2348:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__AccessLevelAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2352:1: ( ( ( rule__Interface__AccessLevelAssignment_0 )? ) )
            // InternalMiniJava.g:2353:1: ( ( rule__Interface__AccessLevelAssignment_0 )? )
            {
            // InternalMiniJava.g:2353:1: ( ( rule__Interface__AccessLevelAssignment_0 )? )
            // InternalMiniJava.g:2354:2: ( rule__Interface__AccessLevelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getAccessLevelAssignment_0()); 
            }
            // InternalMiniJava.g:2355:2: ( rule__Interface__AccessLevelAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=14 && LA29_0<=16)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMiniJava.g:2355:3: rule__Interface__AccessLevelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__AccessLevelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getAccessLevelAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalMiniJava.g:2363:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2367:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalMiniJava.g:2368:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalMiniJava.g:2375:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2379:1: ( ( 'interface' ) )
            // InternalMiniJava.g:2380:1: ( 'interface' )
            {
            // InternalMiniJava.g:2380:1: ( 'interface' )
            // InternalMiniJava.g:2381:2: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalMiniJava.g:2390:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2394:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalMiniJava.g:2395:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Interface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalMiniJava.g:2402:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2406:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // InternalMiniJava.g:2407:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // InternalMiniJava.g:2407:1: ( ( rule__Interface__NameAssignment_2 ) )
            // InternalMiniJava.g:2408:2: ( rule__Interface__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            }
            // InternalMiniJava.g:2409:2: ( rule__Interface__NameAssignment_2 )
            // InternalMiniJava.g:2409:3: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalMiniJava.g:2417:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2421:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalMiniJava.g:2422:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Interface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalMiniJava.g:2429:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Group_3__0 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2433:1: ( ( ( rule__Interface__Group_3__0 )? ) )
            // InternalMiniJava.g:2434:1: ( ( rule__Interface__Group_3__0 )? )
            {
            // InternalMiniJava.g:2434:1: ( ( rule__Interface__Group_3__0 )? )
            // InternalMiniJava.g:2435:2: ( rule__Interface__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:2436:2: ( rule__Interface__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMiniJava.g:2436:3: rule__Interface__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalMiniJava.g:2444:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2448:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalMiniJava.g:2449:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalMiniJava.g:2456:1: rule__Interface__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2460:1: ( ( '{' ) )
            // InternalMiniJava.g:2461:1: ( '{' )
            {
            // InternalMiniJava.g:2461:1: ( '{' )
            // InternalMiniJava.g:2462:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // InternalMiniJava.g:2471:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2475:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalMiniJava.g:2476:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalMiniJava.g:2483:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__MembersAssignment_5 )* ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2487:1: ( ( ( rule__Interface__MembersAssignment_5 )* ) )
            // InternalMiniJava.g:2488:1: ( ( rule__Interface__MembersAssignment_5 )* )
            {
            // InternalMiniJava.g:2488:1: ( ( rule__Interface__MembersAssignment_5 )* )
            // InternalMiniJava.g:2489:2: ( rule__Interface__MembersAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersAssignment_5()); 
            }
            // InternalMiniJava.g:2490:2: ( rule__Interface__MembersAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=14 && LA31_0<=16)||(LA31_0>=41 && LA31_0<=44)||(LA31_0>=63 && LA31_0<=64)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMiniJava.g:2490:3: rule__Interface__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interface__MembersAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getMembersAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // InternalMiniJava.g:2498:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2502:1: ( rule__Interface__Group__6__Impl )
            // InternalMiniJava.g:2503:2: rule__Interface__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // InternalMiniJava.g:2509:1: rule__Interface__Group__6__Impl : ( '}' ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2513:1: ( ( '}' ) )
            // InternalMiniJava.g:2514:1: ( '}' )
            {
            // InternalMiniJava.g:2514:1: ( '}' )
            // InternalMiniJava.g:2515:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group_3__0"
    // InternalMiniJava.g:2525:1: rule__Interface__Group_3__0 : rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 ;
    public final void rule__Interface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2529:1: ( rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 )
            // InternalMiniJava.g:2530:2: rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__0"


    // $ANTLR start "rule__Interface__Group_3__0__Impl"
    // InternalMiniJava.g:2537:1: rule__Interface__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2541:1: ( ( 'extends' ) )
            // InternalMiniJava.g:2542:1: ( 'extends' )
            {
            // InternalMiniJava.g:2542:1: ( 'extends' )
            // InternalMiniJava.g:2543:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_3__1"
    // InternalMiniJava.g:2552:1: rule__Interface__Group_3__1 : rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 ;
    public final void rule__Interface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2556:1: ( rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 )
            // InternalMiniJava.g:2557:2: rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__Interface__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__1"


    // $ANTLR start "rule__Interface__Group_3__1__Impl"
    // InternalMiniJava.g:2564:1: rule__Interface__Group_3__1__Impl : ( ( rule__Interface__ImplementsAssignment_3_1 ) ) ;
    public final void rule__Interface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2568:1: ( ( ( rule__Interface__ImplementsAssignment_3_1 ) ) )
            // InternalMiniJava.g:2569:1: ( ( rule__Interface__ImplementsAssignment_3_1 ) )
            {
            // InternalMiniJava.g:2569:1: ( ( rule__Interface__ImplementsAssignment_3_1 ) )
            // InternalMiniJava.g:2570:2: ( rule__Interface__ImplementsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementsAssignment_3_1()); 
            }
            // InternalMiniJava.g:2571:2: ( rule__Interface__ImplementsAssignment_3_1 )
            // InternalMiniJava.g:2571:3: rule__Interface__ImplementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ImplementsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__1__Impl"


    // $ANTLR start "rule__Interface__Group_3__2"
    // InternalMiniJava.g:2579:1: rule__Interface__Group_3__2 : rule__Interface__Group_3__2__Impl ;
    public final void rule__Interface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2583:1: ( rule__Interface__Group_3__2__Impl )
            // InternalMiniJava.g:2584:2: rule__Interface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__2"


    // $ANTLR start "rule__Interface__Group_3__2__Impl"
    // InternalMiniJava.g:2590:1: rule__Interface__Group_3__2__Impl : ( ( rule__Interface__Group_3_2__0 )* ) ;
    public final void rule__Interface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2594:1: ( ( ( rule__Interface__Group_3_2__0 )* ) )
            // InternalMiniJava.g:2595:1: ( ( rule__Interface__Group_3_2__0 )* )
            {
            // InternalMiniJava.g:2595:1: ( ( rule__Interface__Group_3_2__0 )* )
            // InternalMiniJava.g:2596:2: ( rule__Interface__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup_3_2()); 
            }
            // InternalMiniJava.g:2597:2: ( rule__Interface__Group_3_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMiniJava.g:2597:3: rule__Interface__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Interface__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__2__Impl"


    // $ANTLR start "rule__Interface__Group_3_2__0"
    // InternalMiniJava.g:2606:1: rule__Interface__Group_3_2__0 : rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 ;
    public final void rule__Interface__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2610:1: ( rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 )
            // InternalMiniJava.g:2611:2: rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_2__0"


    // $ANTLR start "rule__Interface__Group_3_2__0__Impl"
    // InternalMiniJava.g:2618:1: rule__Interface__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2622:1: ( ( ',' ) )
            // InternalMiniJava.g:2623:1: ( ',' )
            {
            // InternalMiniJava.g:2623:1: ( ',' )
            // InternalMiniJava.g:2624:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_2__0__Impl"


    // $ANTLR start "rule__Interface__Group_3_2__1"
    // InternalMiniJava.g:2633:1: rule__Interface__Group_3_2__1 : rule__Interface__Group_3_2__1__Impl ;
    public final void rule__Interface__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2637:1: ( rule__Interface__Group_3_2__1__Impl )
            // InternalMiniJava.g:2638:2: rule__Interface__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_2__1"


    // $ANTLR start "rule__Interface__Group_3_2__1__Impl"
    // InternalMiniJava.g:2644:1: rule__Interface__Group_3_2__1__Impl : ( ( rule__Interface__ImplementsAssignment_3_2_1 ) ) ;
    public final void rule__Interface__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2648:1: ( ( ( rule__Interface__ImplementsAssignment_3_2_1 ) ) )
            // InternalMiniJava.g:2649:1: ( ( rule__Interface__ImplementsAssignment_3_2_1 ) )
            {
            // InternalMiniJava.g:2649:1: ( ( rule__Interface__ImplementsAssignment_3_2_1 ) )
            // InternalMiniJava.g:2650:2: ( rule__Interface__ImplementsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementsAssignment_3_2_1()); 
            }
            // InternalMiniJava.g:2651:2: ( rule__Interface__ImplementsAssignment_3_2_1 )
            // InternalMiniJava.g:2651:3: rule__Interface__ImplementsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ImplementsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_2__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMiniJava.g:2660:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2664:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMiniJava.g:2665:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalMiniJava.g:2672:1: rule__Method__Group__0__Impl : ( ( rule__Method__AccessAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2676:1: ( ( ( rule__Method__AccessAssignment_0 )? ) )
            // InternalMiniJava.g:2677:1: ( ( rule__Method__AccessAssignment_0 )? )
            {
            // InternalMiniJava.g:2677:1: ( ( rule__Method__AccessAssignment_0 )? )
            // InternalMiniJava.g:2678:2: ( rule__Method__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAccessAssignment_0()); 
            }
            // InternalMiniJava.g:2679:2: ( rule__Method__AccessAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=14 && LA33_0<=16)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMiniJava.g:2679:3: rule__Method__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAccessAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalMiniJava.g:2687:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2691:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMiniJava.g:2692:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalMiniJava.g:2699:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2703:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalMiniJava.g:2704:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalMiniJava.g:2704:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalMiniJava.g:2705:2: ( rule__Method__AbstractAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            }
            // InternalMiniJava.g:2706:2: ( rule__Method__AbstractAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==63) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMiniJava.g:2706:3: rule__Method__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__AbstractAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalMiniJava.g:2714:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2718:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMiniJava.g:2719:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalMiniJava.g:2726:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2730:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalMiniJava.g:2731:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalMiniJava.g:2731:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalMiniJava.g:2732:2: ( rule__Method__StaticAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            }
            // InternalMiniJava.g:2733:2: ( rule__Method__StaticAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==64) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMiniJava.g:2733:3: rule__Method__StaticAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__StaticAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalMiniJava.g:2741:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2745:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMiniJava.g:2746:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalMiniJava.g:2753:1: rule__Method__Group__3__Impl : ( ( rule__Method__TypeRefAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2757:1: ( ( ( rule__Method__TypeRefAssignment_3 ) ) )
            // InternalMiniJava.g:2758:1: ( ( rule__Method__TypeRefAssignment_3 ) )
            {
            // InternalMiniJava.g:2758:1: ( ( rule__Method__TypeRefAssignment_3 ) )
            // InternalMiniJava.g:2759:2: ( rule__Method__TypeRefAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypeRefAssignment_3()); 
            }
            // InternalMiniJava.g:2760:2: ( rule__Method__TypeRefAssignment_3 )
            // InternalMiniJava.g:2760:3: rule__Method__TypeRefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeRefAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypeRefAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalMiniJava.g:2768:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2772:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMiniJava.g:2773:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalMiniJava.g:2780:1: rule__Method__Group__4__Impl : ( ( rule__Method__NameAssignment_4 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2784:1: ( ( ( rule__Method__NameAssignment_4 )? ) )
            // InternalMiniJava.g:2785:1: ( ( rule__Method__NameAssignment_4 )? )
            {
            // InternalMiniJava.g:2785:1: ( ( rule__Method__NameAssignment_4 )? )
            // InternalMiniJava.g:2786:2: ( rule__Method__NameAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_4()); 
            }
            // InternalMiniJava.g:2787:2: ( rule__Method__NameAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMiniJava.g:2787:3: rule__Method__NameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__NameAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalMiniJava.g:2795:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2799:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalMiniJava.g:2800:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalMiniJava.g:2807:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2811:1: ( ( '(' ) )
            // InternalMiniJava.g:2812:1: ( '(' )
            {
            // InternalMiniJava.g:2812:1: ( '(' )
            // InternalMiniJava.g:2813:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalMiniJava.g:2822:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2826:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalMiniJava.g:2827:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalMiniJava.g:2834:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2838:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalMiniJava.g:2839:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalMiniJava.g:2839:1: ( ( rule__Method__Group_6__0 )? )
            // InternalMiniJava.g:2840:2: ( rule__Method__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_6()); 
            }
            // InternalMiniJava.g:2841:2: ( rule__Method__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=41 && LA37_0<=44)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMiniJava.g:2841:3: rule__Method__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalMiniJava.g:2849:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2853:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalMiniJava.g:2854:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalMiniJava.g:2861:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2865:1: ( ( ')' ) )
            // InternalMiniJava.g:2866:1: ( ')' )
            {
            // InternalMiniJava.g:2866:1: ( ')' )
            // InternalMiniJava.g:2867:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // InternalMiniJava.g:2876:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2880:1: ( rule__Method__Group__8__Impl )
            // InternalMiniJava.g:2881:2: rule__Method__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // InternalMiniJava.g:2887:1: rule__Method__Group__8__Impl : ( ( rule__Method__Alternatives_8 ) ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2891:1: ( ( ( rule__Method__Alternatives_8 ) ) )
            // InternalMiniJava.g:2892:1: ( ( rule__Method__Alternatives_8 ) )
            {
            // InternalMiniJava.g:2892:1: ( ( rule__Method__Alternatives_8 ) )
            // InternalMiniJava.g:2893:2: ( rule__Method__Alternatives_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives_8()); 
            }
            // InternalMiniJava.g:2894:2: ( rule__Method__Alternatives_8 )
            // InternalMiniJava.g:2894:3: rule__Method__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAlternatives_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalMiniJava.g:2903:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2907:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalMiniJava.g:2908:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalMiniJava.g:2915:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParamsAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2919:1: ( ( ( rule__Method__ParamsAssignment_6_0 ) ) )
            // InternalMiniJava.g:2920:1: ( ( rule__Method__ParamsAssignment_6_0 ) )
            {
            // InternalMiniJava.g:2920:1: ( ( rule__Method__ParamsAssignment_6_0 ) )
            // InternalMiniJava.g:2921:2: ( rule__Method__ParamsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_6_0()); 
            }
            // InternalMiniJava.g:2922:2: ( rule__Method__ParamsAssignment_6_0 )
            // InternalMiniJava.g:2922:3: rule__Method__ParamsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalMiniJava.g:2930:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2934:1: ( rule__Method__Group_6__1__Impl )
            // InternalMiniJava.g:2935:2: rule__Method__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalMiniJava.g:2941:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2945:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalMiniJava.g:2946:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalMiniJava.g:2946:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalMiniJava.g:2947:2: ( rule__Method__Group_6_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            }
            // InternalMiniJava.g:2948:2: ( rule__Method__Group_6_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMiniJava.g:2948:3: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Method__Group_6_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Method__Group_6_1__0"
    // InternalMiniJava.g:2957:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2961:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalMiniJava.g:2962:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__0"


    // $ANTLR start "rule__Method__Group_6_1__0__Impl"
    // InternalMiniJava.g:2969:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2973:1: ( ( ',' ) )
            // InternalMiniJava.g:2974:1: ( ',' )
            {
            // InternalMiniJava.g:2974:1: ( ',' )
            // InternalMiniJava.g:2975:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__0__Impl"


    // $ANTLR start "rule__Method__Group_6_1__1"
    // InternalMiniJava.g:2984:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2988:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalMiniJava.g:2989:2: rule__Method__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__1"


    // $ANTLR start "rule__Method__Group_6_1__1__Impl"
    // InternalMiniJava.g:2995:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParamsAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2999:1: ( ( ( rule__Method__ParamsAssignment_6_1_1 ) ) )
            // InternalMiniJava.g:3000:1: ( ( rule__Method__ParamsAssignment_6_1_1 ) )
            {
            // InternalMiniJava.g:3000:1: ( ( rule__Method__ParamsAssignment_6_1_1 ) )
            // InternalMiniJava.g:3001:2: ( rule__Method__ParamsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_6_1_1()); 
            }
            // InternalMiniJava.g:3002:2: ( rule__Method__ParamsAssignment_6_1_1 )
            // InternalMiniJava.g:3002:3: rule__Method__ParamsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_6_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMiniJava.g:3011:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3015:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMiniJava.g:3016:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMiniJava.g:3023:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeRefAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3027:1: ( ( ( rule__Parameter__TypeRefAssignment_0 ) ) )
            // InternalMiniJava.g:3028:1: ( ( rule__Parameter__TypeRefAssignment_0 ) )
            {
            // InternalMiniJava.g:3028:1: ( ( rule__Parameter__TypeRefAssignment_0 ) )
            // InternalMiniJava.g:3029:2: ( rule__Parameter__TypeRefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeRefAssignment_0()); 
            }
            // InternalMiniJava.g:3030:2: ( rule__Parameter__TypeRefAssignment_0 )
            // InternalMiniJava.g:3030:3: rule__Parameter__TypeRefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeRefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeRefAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMiniJava.g:3038:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3042:1: ( rule__Parameter__Group__1__Impl )
            // InternalMiniJava.g:3043:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMiniJava.g:3049:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3053:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMiniJava.g:3054:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:3054:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMiniJava.g:3055:2: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:3056:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMiniJava.g:3056:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMiniJava.g:3065:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3069:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMiniJava.g:3070:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalMiniJava.g:3077:1: rule__Field__Group__0__Impl : ( ( rule__Field__AccessAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3081:1: ( ( ( rule__Field__AccessAssignment_0 )? ) )
            // InternalMiniJava.g:3082:1: ( ( rule__Field__AccessAssignment_0 )? )
            {
            // InternalMiniJava.g:3082:1: ( ( rule__Field__AccessAssignment_0 )? )
            // InternalMiniJava.g:3083:2: ( rule__Field__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAccessAssignment_0()); 
            }
            // InternalMiniJava.g:3084:2: ( rule__Field__AccessAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=14 && LA39_0<=16)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMiniJava.g:3084:3: rule__Field__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAccessAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalMiniJava.g:3092:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3096:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMiniJava.g:3097:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalMiniJava.g:3104:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeRefAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3108:1: ( ( ( rule__Field__TypeRefAssignment_1 ) ) )
            // InternalMiniJava.g:3109:1: ( ( rule__Field__TypeRefAssignment_1 ) )
            {
            // InternalMiniJava.g:3109:1: ( ( rule__Field__TypeRefAssignment_1 ) )
            // InternalMiniJava.g:3110:2: ( rule__Field__TypeRefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeRefAssignment_1()); 
            }
            // InternalMiniJava.g:3111:2: ( rule__Field__TypeRefAssignment_1 )
            // InternalMiniJava.g:3111:3: rule__Field__TypeRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeRefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeRefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalMiniJava.g:3119:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3123:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalMiniJava.g:3124:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalMiniJava.g:3131:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3135:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalMiniJava.g:3136:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalMiniJava.g:3136:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalMiniJava.g:3137:2: ( rule__Field__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            }
            // InternalMiniJava.g:3138:2: ( rule__Field__NameAssignment_2 )
            // InternalMiniJava.g:3138:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalMiniJava.g:3146:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3150:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalMiniJava.g:3151:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalMiniJava.g:3158:1: rule__Field__Group__3__Impl : ( ( rule__Field__Group_3__0 )? ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3162:1: ( ( ( rule__Field__Group_3__0 )? ) )
            // InternalMiniJava.g:3163:1: ( ( rule__Field__Group_3__0 )? )
            {
            // InternalMiniJava.g:3163:1: ( ( rule__Field__Group_3__0 )? )
            // InternalMiniJava.g:3164:2: ( rule__Field__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:3165:2: ( rule__Field__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMiniJava.g:3165:3: rule__Field__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalMiniJava.g:3173:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3177:1: ( rule__Field__Group__4__Impl )
            // InternalMiniJava.g:3178:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalMiniJava.g:3184:1: rule__Field__Group__4__Impl : ( ';' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3188:1: ( ( ';' ) )
            // InternalMiniJava.g:3189:1: ( ';' )
            {
            // InternalMiniJava.g:3189:1: ( ';' )
            // InternalMiniJava.g:3190:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group_3__0"
    // InternalMiniJava.g:3200:1: rule__Field__Group_3__0 : rule__Field__Group_3__0__Impl rule__Field__Group_3__1 ;
    public final void rule__Field__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3204:1: ( rule__Field__Group_3__0__Impl rule__Field__Group_3__1 )
            // InternalMiniJava.g:3205:2: rule__Field__Group_3__0__Impl rule__Field__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__Field__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3__0"


    // $ANTLR start "rule__Field__Group_3__0__Impl"
    // InternalMiniJava.g:3212:1: rule__Field__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Field__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3216:1: ( ( '=' ) )
            // InternalMiniJava.g:3217:1: ( '=' )
            {
            // InternalMiniJava.g:3217:1: ( '=' )
            // InternalMiniJava.g:3218:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3__0__Impl"


    // $ANTLR start "rule__Field__Group_3__1"
    // InternalMiniJava.g:3227:1: rule__Field__Group_3__1 : rule__Field__Group_3__1__Impl ;
    public final void rule__Field__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3231:1: ( rule__Field__Group_3__1__Impl )
            // InternalMiniJava.g:3232:2: rule__Field__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3__1"


    // $ANTLR start "rule__Field__Group_3__1__Impl"
    // InternalMiniJava.g:3238:1: rule__Field__Group_3__1__Impl : ( ( rule__Field__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__Field__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3242:1: ( ( ( rule__Field__DefaultValueAssignment_3_1 ) ) )
            // InternalMiniJava.g:3243:1: ( ( rule__Field__DefaultValueAssignment_3_1 ) )
            {
            // InternalMiniJava.g:3243:1: ( ( rule__Field__DefaultValueAssignment_3_1 ) )
            // InternalMiniJava.g:3244:2: ( rule__Field__DefaultValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultValueAssignment_3_1()); 
            }
            // InternalMiniJava.g:3245:2: ( rule__Field__DefaultValueAssignment_3_1 )
            // InternalMiniJava.g:3245:3: rule__Field__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__DefaultValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getDefaultValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalMiniJava.g:3254:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3258:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMiniJava.g:3259:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalMiniJava.g:3266:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3270:1: ( ( () ) )
            // InternalMiniJava.g:3271:1: ( () )
            {
            // InternalMiniJava.g:3271:1: ( () )
            // InternalMiniJava.g:3272:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalMiniJava.g:3273:2: ()
            // InternalMiniJava.g:3273:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMiniJava.g:3281:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3285:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMiniJava.g:3286:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalMiniJava.g:3293:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3297:1: ( ( '{' ) )
            // InternalMiniJava.g:3298:1: ( '{' )
            {
            // InternalMiniJava.g:3298:1: ( '{' )
            // InternalMiniJava.g:3299:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalMiniJava.g:3308:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3312:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMiniJava.g:3313:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalMiniJava.g:3320:1: rule__Block__Group__2__Impl : ( ( rule__Block__StatementsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3324:1: ( ( ( rule__Block__StatementsAssignment_2 )* ) )
            // InternalMiniJava.g:3325:1: ( ( rule__Block__StatementsAssignment_2 )* )
            {
            // InternalMiniJava.g:3325:1: ( ( rule__Block__StatementsAssignment_2 )* )
            // InternalMiniJava.g:3326:2: ( rule__Block__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }
            // InternalMiniJava.g:3327:2: ( rule__Block__StatementsAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||(LA41_0>=12 && LA41_0<=13)||LA41_0==22||LA41_0==28||LA41_0==31||(LA41_0>=34 && LA41_0<=35)||(LA41_0>=37 && LA41_0<=38)||(LA41_0>=41 && LA41_0<=44)||LA41_0==54||(LA41_0>=58 && LA41_0<=62)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMiniJava.g:3327:3: rule__Block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Block__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalMiniJava.g:3335:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3339:1: ( rule__Block__Group__3__Impl )
            // InternalMiniJava.g:3340:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalMiniJava.g:3346:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3350:1: ( ( '}' ) )
            // InternalMiniJava.g:3351:1: ( '}' )
            {
            // InternalMiniJava.g:3351:1: ( '}' )
            // InternalMiniJava.g:3352:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalMiniJava.g:3362:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3366:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMiniJava.g:3367:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalMiniJava.g:3374:1: rule__Statement__Group_0__0__Impl : ( ruleReturn ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3378:1: ( ( ruleReturn ) )
            // InternalMiniJava.g:3379:1: ( ruleReturn )
            {
            // InternalMiniJava.g:3379:1: ( ruleReturn )
            // InternalMiniJava.g:3380:2: ruleReturn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalMiniJava.g:3389:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3393:1: ( rule__Statement__Group_0__1__Impl )
            // InternalMiniJava.g:3394:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalMiniJava.g:3400:1: rule__Statement__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3404:1: ( ( ';' ) )
            // InternalMiniJava.g:3405:1: ( ';' )
            {
            // InternalMiniJava.g:3405:1: ( ';' )
            // InternalMiniJava.g:3406:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalMiniJava.g:3416:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3420:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalMiniJava.g:3421:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalMiniJava.g:3428:1: rule__Statement__Group_1__0__Impl : ( ( ruleAssignment ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3432:1: ( ( ( ruleAssignment ) ) )
            // InternalMiniJava.g:3433:1: ( ( ruleAssignment ) )
            {
            // InternalMiniJava.g:3433:1: ( ( ruleAssignment ) )
            // InternalMiniJava.g:3434:2: ( ruleAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0()); 
            }
            // InternalMiniJava.g:3435:2: ( ruleAssignment )
            // InternalMiniJava.g:3435:3: ruleAssignment
            {
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalMiniJava.g:3443:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3447:1: ( rule__Statement__Group_1__1__Impl )
            // InternalMiniJava.g:3448:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalMiniJava.g:3454:1: rule__Statement__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3458:1: ( ( ';' ) )
            // InternalMiniJava.g:3459:1: ( ';' )
            {
            // InternalMiniJava.g:3459:1: ( ';' )
            // InternalMiniJava.g:3460:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_5__0"
    // InternalMiniJava.g:3470:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3474:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // InternalMiniJava.g:3475:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0"


    // $ANTLR start "rule__Statement__Group_5__0__Impl"
    // InternalMiniJava.g:3482:1: rule__Statement__Group_5__0__Impl : ( rulePrintStatement ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3486:1: ( ( rulePrintStatement ) )
            // InternalMiniJava.g:3487:1: ( rulePrintStatement )
            {
            // InternalMiniJava.g:3487:1: ( rulePrintStatement )
            // InternalMiniJava.g:3488:2: rulePrintStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrintStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0__Impl"


    // $ANTLR start "rule__Statement__Group_5__1"
    // InternalMiniJava.g:3497:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3501:1: ( rule__Statement__Group_5__1__Impl )
            // InternalMiniJava.g:3502:2: rule__Statement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1"


    // $ANTLR start "rule__Statement__Group_5__1__Impl"
    // InternalMiniJava.g:3508:1: rule__Statement__Group_5__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3512:1: ( ( ';' ) )
            // InternalMiniJava.g:3513:1: ( ';' )
            {
            // InternalMiniJava.g:3513:1: ( ';' )
            // InternalMiniJava.g:3514:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1__Impl"


    // $ANTLR start "rule__Statement__Group_7__0"
    // InternalMiniJava.g:3524:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3528:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // InternalMiniJava.g:3529:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__0"


    // $ANTLR start "rule__Statement__Group_7__0__Impl"
    // InternalMiniJava.g:3536:1: rule__Statement__Group_7__0__Impl : ( ruleSelectionExpression ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3540:1: ( ( ruleSelectionExpression ) )
            // InternalMiniJava.g:3541:1: ( ruleSelectionExpression )
            {
            // InternalMiniJava.g:3541:1: ( ruleSelectionExpression )
            // InternalMiniJava.g:3542:2: ruleSelectionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSelectionExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSelectionExpressionParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__0__Impl"


    // $ANTLR start "rule__Statement__Group_7__1"
    // InternalMiniJava.g:3551:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3555:1: ( rule__Statement__Group_7__1__Impl )
            // InternalMiniJava.g:3556:2: rule__Statement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__1"


    // $ANTLR start "rule__Statement__Group_7__1__Impl"
    // InternalMiniJava.g:3562:1: rule__Statement__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3566:1: ( ( ';' ) )
            // InternalMiniJava.g:3567:1: ( ';' )
            {
            // InternalMiniJava.g:3567:1: ( ';' )
            // InternalMiniJava.g:3568:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__1__Impl"


    // $ANTLR start "rule__PrintStatement__Group__0"
    // InternalMiniJava.g:3578:1: rule__PrintStatement__Group__0 : rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1 ;
    public final void rule__PrintStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3582:1: ( rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1 )
            // InternalMiniJava.g:3583:2: rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PrintStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__0"


    // $ANTLR start "rule__PrintStatement__Group__0__Impl"
    // InternalMiniJava.g:3590:1: rule__PrintStatement__Group__0__Impl : ( 'System' ) ;
    public final void rule__PrintStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3594:1: ( ( 'System' ) )
            // InternalMiniJava.g:3595:1: ( 'System' )
            {
            // InternalMiniJava.g:3595:1: ( 'System' )
            // InternalMiniJava.g:3596:2: 'System'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getSystemKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getSystemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__0__Impl"


    // $ANTLR start "rule__PrintStatement__Group__1"
    // InternalMiniJava.g:3605:1: rule__PrintStatement__Group__1 : rule__PrintStatement__Group__1__Impl rule__PrintStatement__Group__2 ;
    public final void rule__PrintStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3609:1: ( rule__PrintStatement__Group__1__Impl rule__PrintStatement__Group__2 )
            // InternalMiniJava.g:3610:2: rule__PrintStatement__Group__1__Impl rule__PrintStatement__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__PrintStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__1"


    // $ANTLR start "rule__PrintStatement__Group__1__Impl"
    // InternalMiniJava.g:3617:1: rule__PrintStatement__Group__1__Impl : ( '.' ) ;
    public final void rule__PrintStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3621:1: ( ( '.' ) )
            // InternalMiniJava.g:3622:1: ( '.' )
            {
            // InternalMiniJava.g:3622:1: ( '.' )
            // InternalMiniJava.g:3623:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getFullStopKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__1__Impl"


    // $ANTLR start "rule__PrintStatement__Group__2"
    // InternalMiniJava.g:3632:1: rule__PrintStatement__Group__2 : rule__PrintStatement__Group__2__Impl rule__PrintStatement__Group__3 ;
    public final void rule__PrintStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3636:1: ( rule__PrintStatement__Group__2__Impl rule__PrintStatement__Group__3 )
            // InternalMiniJava.g:3637:2: rule__PrintStatement__Group__2__Impl rule__PrintStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PrintStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__2"


    // $ANTLR start "rule__PrintStatement__Group__2__Impl"
    // InternalMiniJava.g:3644:1: rule__PrintStatement__Group__2__Impl : ( 'out' ) ;
    public final void rule__PrintStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3648:1: ( ( 'out' ) )
            // InternalMiniJava.g:3649:1: ( 'out' )
            {
            // InternalMiniJava.g:3649:1: ( 'out' )
            // InternalMiniJava.g:3650:2: 'out'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getOutKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getOutKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__2__Impl"


    // $ANTLR start "rule__PrintStatement__Group__3"
    // InternalMiniJava.g:3659:1: rule__PrintStatement__Group__3 : rule__PrintStatement__Group__3__Impl rule__PrintStatement__Group__4 ;
    public final void rule__PrintStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3663:1: ( rule__PrintStatement__Group__3__Impl rule__PrintStatement__Group__4 )
            // InternalMiniJava.g:3664:2: rule__PrintStatement__Group__3__Impl rule__PrintStatement__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__PrintStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__3"


    // $ANTLR start "rule__PrintStatement__Group__3__Impl"
    // InternalMiniJava.g:3671:1: rule__PrintStatement__Group__3__Impl : ( '.' ) ;
    public final void rule__PrintStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3675:1: ( ( '.' ) )
            // InternalMiniJava.g:3676:1: ( '.' )
            {
            // InternalMiniJava.g:3676:1: ( '.' )
            // InternalMiniJava.g:3677:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getFullStopKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getFullStopKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__3__Impl"


    // $ANTLR start "rule__PrintStatement__Group__4"
    // InternalMiniJava.g:3686:1: rule__PrintStatement__Group__4 : rule__PrintStatement__Group__4__Impl rule__PrintStatement__Group__5 ;
    public final void rule__PrintStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3690:1: ( rule__PrintStatement__Group__4__Impl rule__PrintStatement__Group__5 )
            // InternalMiniJava.g:3691:2: rule__PrintStatement__Group__4__Impl rule__PrintStatement__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__PrintStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__4"


    // $ANTLR start "rule__PrintStatement__Group__4__Impl"
    // InternalMiniJava.g:3698:1: rule__PrintStatement__Group__4__Impl : ( 'println' ) ;
    public final void rule__PrintStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3702:1: ( ( 'println' ) )
            // InternalMiniJava.g:3703:1: ( 'println' )
            {
            // InternalMiniJava.g:3703:1: ( 'println' )
            // InternalMiniJava.g:3704:2: 'println'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getPrintlnKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getPrintlnKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__4__Impl"


    // $ANTLR start "rule__PrintStatement__Group__5"
    // InternalMiniJava.g:3713:1: rule__PrintStatement__Group__5 : rule__PrintStatement__Group__5__Impl rule__PrintStatement__Group__6 ;
    public final void rule__PrintStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3717:1: ( rule__PrintStatement__Group__5__Impl rule__PrintStatement__Group__6 )
            // InternalMiniJava.g:3718:2: rule__PrintStatement__Group__5__Impl rule__PrintStatement__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__PrintStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__5"


    // $ANTLR start "rule__PrintStatement__Group__5__Impl"
    // InternalMiniJava.g:3725:1: rule__PrintStatement__Group__5__Impl : ( '(' ) ;
    public final void rule__PrintStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3729:1: ( ( '(' ) )
            // InternalMiniJava.g:3730:1: ( '(' )
            {
            // InternalMiniJava.g:3730:1: ( '(' )
            // InternalMiniJava.g:3731:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getLeftParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getLeftParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__5__Impl"


    // $ANTLR start "rule__PrintStatement__Group__6"
    // InternalMiniJava.g:3740:1: rule__PrintStatement__Group__6 : rule__PrintStatement__Group__6__Impl rule__PrintStatement__Group__7 ;
    public final void rule__PrintStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3744:1: ( rule__PrintStatement__Group__6__Impl rule__PrintStatement__Group__7 )
            // InternalMiniJava.g:3745:2: rule__PrintStatement__Group__6__Impl rule__PrintStatement__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__PrintStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__6"


    // $ANTLR start "rule__PrintStatement__Group__6__Impl"
    // InternalMiniJava.g:3752:1: rule__PrintStatement__Group__6__Impl : ( ( rule__PrintStatement__ExpressionAssignment_6 ) ) ;
    public final void rule__PrintStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3756:1: ( ( ( rule__PrintStatement__ExpressionAssignment_6 ) ) )
            // InternalMiniJava.g:3757:1: ( ( rule__PrintStatement__ExpressionAssignment_6 ) )
            {
            // InternalMiniJava.g:3757:1: ( ( rule__PrintStatement__ExpressionAssignment_6 ) )
            // InternalMiniJava.g:3758:2: ( rule__PrintStatement__ExpressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getExpressionAssignment_6()); 
            }
            // InternalMiniJava.g:3759:2: ( rule__PrintStatement__ExpressionAssignment_6 )
            // InternalMiniJava.g:3759:3: rule__PrintStatement__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__ExpressionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getExpressionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__6__Impl"


    // $ANTLR start "rule__PrintStatement__Group__7"
    // InternalMiniJava.g:3767:1: rule__PrintStatement__Group__7 : rule__PrintStatement__Group__7__Impl ;
    public final void rule__PrintStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3771:1: ( rule__PrintStatement__Group__7__Impl )
            // InternalMiniJava.g:3772:2: rule__PrintStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__7"


    // $ANTLR start "rule__PrintStatement__Group__7__Impl"
    // InternalMiniJava.g:3778:1: rule__PrintStatement__Group__7__Impl : ( ')' ) ;
    public final void rule__PrintStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3782:1: ( ( ')' ) )
            // InternalMiniJava.g:3783:1: ( ')' )
            {
            // InternalMiniJava.g:3783:1: ( ')' )
            // InternalMiniJava.g:3784:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__7__Impl"


    // $ANTLR start "rule__Return__Group__0"
    // InternalMiniJava.g:3794:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3798:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // InternalMiniJava.g:3799:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Return__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Return__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0"


    // $ANTLR start "rule__Return__Group__0__Impl"
    // InternalMiniJava.g:3806:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3810:1: ( ( 'return' ) )
            // InternalMiniJava.g:3811:1: ( 'return' )
            {
            // InternalMiniJava.g:3811:1: ( 'return' )
            // InternalMiniJava.g:3812:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0__Impl"


    // $ANTLR start "rule__Return__Group__1"
    // InternalMiniJava.g:3821:1: rule__Return__Group__1 : rule__Return__Group__1__Impl ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3825:1: ( rule__Return__Group__1__Impl )
            // InternalMiniJava.g:3826:2: rule__Return__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1"


    // $ANTLR start "rule__Return__Group__1__Impl"
    // InternalMiniJava.g:3832:1: rule__Return__Group__1__Impl : ( ( rule__Return__ExpressionAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3836:1: ( ( ( rule__Return__ExpressionAssignment_1 ) ) )
            // InternalMiniJava.g:3837:1: ( ( rule__Return__ExpressionAssignment_1 ) )
            {
            // InternalMiniJava.g:3837:1: ( ( rule__Return__ExpressionAssignment_1 ) )
            // InternalMiniJava.g:3838:2: ( rule__Return__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getExpressionAssignment_1()); 
            }
            // InternalMiniJava.g:3839:2: ( rule__Return__ExpressionAssignment_1 )
            // InternalMiniJava.g:3839:3: rule__Return__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Return__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalMiniJava.g:3848:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3852:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalMiniJava.g:3853:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalMiniJava.g:3860:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3864:1: ( ( 'if' ) )
            // InternalMiniJava.g:3865:1: ( 'if' )
            {
            // InternalMiniJava.g:3865:1: ( 'if' )
            // InternalMiniJava.g:3866:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalMiniJava.g:3875:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3879:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalMiniJava.g:3880:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalMiniJava.g:3887:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3891:1: ( ( '(' ) )
            // InternalMiniJava.g:3892:1: ( '(' )
            {
            // InternalMiniJava.g:3892:1: ( '(' )
            // InternalMiniJava.g:3893:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalMiniJava.g:3902:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3906:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalMiniJava.g:3907:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalMiniJava.g:3914:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3918:1: ( ( ( rule__IfStatement__ExpressionAssignment_2 ) ) )
            // InternalMiniJava.g:3919:1: ( ( rule__IfStatement__ExpressionAssignment_2 ) )
            {
            // InternalMiniJava.g:3919:1: ( ( rule__IfStatement__ExpressionAssignment_2 ) )
            // InternalMiniJava.g:3920:2: ( rule__IfStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExpressionAssignment_2()); 
            }
            // InternalMiniJava.g:3921:2: ( rule__IfStatement__ExpressionAssignment_2 )
            // InternalMiniJava.g:3921:3: rule__IfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalMiniJava.g:3929:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3933:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalMiniJava.g:3934:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalMiniJava.g:3941:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3945:1: ( ( ')' ) )
            // InternalMiniJava.g:3946:1: ( ')' )
            {
            // InternalMiniJava.g:3946:1: ( ')' )
            // InternalMiniJava.g:3947:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalMiniJava.g:3956:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3960:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalMiniJava.g:3961:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalMiniJava.g:3968:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__ThenBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3972:1: ( ( ( rule__IfStatement__ThenBlockAssignment_4 ) ) )
            // InternalMiniJava.g:3973:1: ( ( rule__IfStatement__ThenBlockAssignment_4 ) )
            {
            // InternalMiniJava.g:3973:1: ( ( rule__IfStatement__ThenBlockAssignment_4 ) )
            // InternalMiniJava.g:3974:2: ( rule__IfStatement__ThenBlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4()); 
            }
            // InternalMiniJava.g:3975:2: ( rule__IfStatement__ThenBlockAssignment_4 )
            // InternalMiniJava.g:3975:3: rule__IfStatement__ThenBlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ThenBlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalMiniJava.g:3983:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3987:1: ( rule__IfStatement__Group__5__Impl )
            // InternalMiniJava.g:3988:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalMiniJava.g:3994:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )? ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3998:1: ( ( ( rule__IfStatement__Group_5__0 )? ) )
            // InternalMiniJava.g:3999:1: ( ( rule__IfStatement__Group_5__0 )? )
            {
            // InternalMiniJava.g:3999:1: ( ( rule__IfStatement__Group_5__0 )? )
            // InternalMiniJava.g:4000:2: ( rule__IfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }
            // InternalMiniJava.g:4001:2: ( rule__IfStatement__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMiniJava.g:4001:3: rule__IfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__0"
    // InternalMiniJava.g:4010:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4014:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // InternalMiniJava.g:4015:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0"


    // $ANTLR start "rule__IfStatement__Group_5__0__Impl"
    // InternalMiniJava.g:4022:1: rule__IfStatement__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4026:1: ( ( ( 'else' ) ) )
            // InternalMiniJava.g:4027:1: ( ( 'else' ) )
            {
            // InternalMiniJava.g:4027:1: ( ( 'else' ) )
            // InternalMiniJava.g:4028:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            }
            // InternalMiniJava.g:4029:2: ( 'else' )
            // InternalMiniJava.g:4029:3: 'else'
            {
            match(input,36,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__1"
    // InternalMiniJava.g:4037:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4041:1: ( rule__IfStatement__Group_5__1__Impl )
            // InternalMiniJava.g:4042:2: rule__IfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1"


    // $ANTLR start "rule__IfStatement__Group_5__1__Impl"
    // InternalMiniJava.g:4048:1: rule__IfStatement__Group_5__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4052:1: ( ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) ) )
            // InternalMiniJava.g:4053:1: ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) )
            {
            // InternalMiniJava.g:4053:1: ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) )
            // InternalMiniJava.g:4054:2: ( rule__IfStatement__ElseBlockAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1()); 
            }
            // InternalMiniJava.g:4055:2: ( rule__IfStatement__ElseBlockAssignment_5_1 )
            // InternalMiniJava.g:4055:3: rule__IfStatement__ElseBlockAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseBlockAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // InternalMiniJava.g:4064:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4068:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalMiniJava.g:4069:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // InternalMiniJava.g:4076:1: rule__WhileStatement__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4080:1: ( ( 'while' ) )
            // InternalMiniJava.g:4081:1: ( 'while' )
            {
            // InternalMiniJava.g:4081:1: ( 'while' )
            // InternalMiniJava.g:4082:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // InternalMiniJava.g:4091:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4095:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalMiniJava.g:4096:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // InternalMiniJava.g:4103:1: rule__WhileStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4107:1: ( ( '(' ) )
            // InternalMiniJava.g:4108:1: ( '(' )
            {
            // InternalMiniJava.g:4108:1: ( '(' )
            // InternalMiniJava.g:4109:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // InternalMiniJava.g:4118:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4122:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalMiniJava.g:4123:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // InternalMiniJava.g:4130:1: rule__WhileStatement__Group__2__Impl : ( ( rule__WhileStatement__ConditionAssignment_2 ) ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4134:1: ( ( ( rule__WhileStatement__ConditionAssignment_2 ) ) )
            // InternalMiniJava.g:4135:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            {
            // InternalMiniJava.g:4135:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            // InternalMiniJava.g:4136:2: ( rule__WhileStatement__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
            }
            // InternalMiniJava.g:4137:2: ( rule__WhileStatement__ConditionAssignment_2 )
            // InternalMiniJava.g:4137:3: rule__WhileStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // InternalMiniJava.g:4145:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4149:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalMiniJava.g:4150:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // InternalMiniJava.g:4157:1: rule__WhileStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4161:1: ( ( ')' ) )
            // InternalMiniJava.g:4162:1: ( ')' )
            {
            // InternalMiniJava.g:4162:1: ( ')' )
            // InternalMiniJava.g:4163:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // InternalMiniJava.g:4172:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4176:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalMiniJava.g:4177:2: rule__WhileStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // InternalMiniJava.g:4183:1: rule__WhileStatement__Group__4__Impl : ( ( rule__WhileStatement__BlockAssignment_4 ) ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4187:1: ( ( ( rule__WhileStatement__BlockAssignment_4 ) ) )
            // InternalMiniJava.g:4188:1: ( ( rule__WhileStatement__BlockAssignment_4 ) )
            {
            // InternalMiniJava.g:4188:1: ( ( rule__WhileStatement__BlockAssignment_4 ) )
            // InternalMiniJava.g:4189:2: ( rule__WhileStatement__BlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getBlockAssignment_4()); 
            }
            // InternalMiniJava.g:4190:2: ( rule__WhileStatement__BlockAssignment_4 )
            // InternalMiniJava.g:4190:3: rule__WhileStatement__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__BlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getBlockAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalMiniJava.g:4199:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4203:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalMiniJava.g:4204:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ForStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__0"


    // $ANTLR start "rule__ForStatement__Group__0__Impl"
    // InternalMiniJava.g:4211:1: rule__ForStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4215:1: ( ( 'for' ) )
            // InternalMiniJava.g:4216:1: ( 'for' )
            {
            // InternalMiniJava.g:4216:1: ( 'for' )
            // InternalMiniJava.g:4217:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__0__Impl"


    // $ANTLR start "rule__ForStatement__Group__1"
    // InternalMiniJava.g:4226:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4230:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalMiniJava.g:4231:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ForStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__1"


    // $ANTLR start "rule__ForStatement__Group__1__Impl"
    // InternalMiniJava.g:4238:1: rule__ForStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4242:1: ( ( '(' ) )
            // InternalMiniJava.g:4243:1: ( '(' )
            {
            // InternalMiniJava.g:4243:1: ( '(' )
            // InternalMiniJava.g:4244:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__1__Impl"


    // $ANTLR start "rule__ForStatement__Group__2"
    // InternalMiniJava.g:4253:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4257:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalMiniJava.g:4258:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ForStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__2"


    // $ANTLR start "rule__ForStatement__Group__2__Impl"
    // InternalMiniJava.g:4265:1: rule__ForStatement__Group__2__Impl : ( ( rule__ForStatement__DeclarationAssignment_2 ) ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4269:1: ( ( ( rule__ForStatement__DeclarationAssignment_2 ) ) )
            // InternalMiniJava.g:4270:1: ( ( rule__ForStatement__DeclarationAssignment_2 ) )
            {
            // InternalMiniJava.g:4270:1: ( ( rule__ForStatement__DeclarationAssignment_2 ) )
            // InternalMiniJava.g:4271:2: ( rule__ForStatement__DeclarationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getDeclarationAssignment_2()); 
            }
            // InternalMiniJava.g:4272:2: ( rule__ForStatement__DeclarationAssignment_2 )
            // InternalMiniJava.g:4272:3: rule__ForStatement__DeclarationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__DeclarationAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getDeclarationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__2__Impl"


    // $ANTLR start "rule__ForStatement__Group__3"
    // InternalMiniJava.g:4280:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4284:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalMiniJava.g:4285:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ForStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__3"


    // $ANTLR start "rule__ForStatement__Group__3__Impl"
    // InternalMiniJava.g:4292:1: rule__ForStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4296:1: ( ( ';' ) )
            // InternalMiniJava.g:4297:1: ( ';' )
            {
            // InternalMiniJava.g:4297:1: ( ';' )
            // InternalMiniJava.g:4298:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getSemicolonKeyword_3()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__3__Impl"


    // $ANTLR start "rule__ForStatement__Group__4"
    // InternalMiniJava.g:4307:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4311:1: ( rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 )
            // InternalMiniJava.g:4312:2: rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ForStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__4"


    // $ANTLR start "rule__ForStatement__Group__4__Impl"
    // InternalMiniJava.g:4319:1: rule__ForStatement__Group__4__Impl : ( ( rule__ForStatement__ConditionAssignment_4 ) ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4323:1: ( ( ( rule__ForStatement__ConditionAssignment_4 ) ) )
            // InternalMiniJava.g:4324:1: ( ( rule__ForStatement__ConditionAssignment_4 ) )
            {
            // InternalMiniJava.g:4324:1: ( ( rule__ForStatement__ConditionAssignment_4 ) )
            // InternalMiniJava.g:4325:2: ( rule__ForStatement__ConditionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getConditionAssignment_4()); 
            }
            // InternalMiniJava.g:4326:2: ( rule__ForStatement__ConditionAssignment_4 )
            // InternalMiniJava.g:4326:3: rule__ForStatement__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__ConditionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getConditionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__4__Impl"


    // $ANTLR start "rule__ForStatement__Group__5"
    // InternalMiniJava.g:4334:1: rule__ForStatement__Group__5 : rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 ;
    public final void rule__ForStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4338:1: ( rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 )
            // InternalMiniJava.g:4339:2: rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__ForStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__5"


    // $ANTLR start "rule__ForStatement__Group__5__Impl"
    // InternalMiniJava.g:4346:1: rule__ForStatement__Group__5__Impl : ( ';' ) ;
    public final void rule__ForStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4350:1: ( ( ';' ) )
            // InternalMiniJava.g:4351:1: ( ';' )
            {
            // InternalMiniJava.g:4351:1: ( ';' )
            // InternalMiniJava.g:4352:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getSemicolonKeyword_5()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__5__Impl"


    // $ANTLR start "rule__ForStatement__Group__6"
    // InternalMiniJava.g:4361:1: rule__ForStatement__Group__6 : rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 ;
    public final void rule__ForStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4365:1: ( rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 )
            // InternalMiniJava.g:4366:2: rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__ForStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__6"


    // $ANTLR start "rule__ForStatement__Group__6__Impl"
    // InternalMiniJava.g:4373:1: rule__ForStatement__Group__6__Impl : ( ( rule__ForStatement__ProgressionAssignment_6 ) ) ;
    public final void rule__ForStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4377:1: ( ( ( rule__ForStatement__ProgressionAssignment_6 ) ) )
            // InternalMiniJava.g:4378:1: ( ( rule__ForStatement__ProgressionAssignment_6 ) )
            {
            // InternalMiniJava.g:4378:1: ( ( rule__ForStatement__ProgressionAssignment_6 ) )
            // InternalMiniJava.g:4379:2: ( rule__ForStatement__ProgressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getProgressionAssignment_6()); 
            }
            // InternalMiniJava.g:4380:2: ( rule__ForStatement__ProgressionAssignment_6 )
            // InternalMiniJava.g:4380:3: rule__ForStatement__ProgressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__ProgressionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getProgressionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__6__Impl"


    // $ANTLR start "rule__ForStatement__Group__7"
    // InternalMiniJava.g:4388:1: rule__ForStatement__Group__7 : rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 ;
    public final void rule__ForStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4392:1: ( rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 )
            // InternalMiniJava.g:4393:2: rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__ForStatement__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__7"


    // $ANTLR start "rule__ForStatement__Group__7__Impl"
    // InternalMiniJava.g:4400:1: rule__ForStatement__Group__7__Impl : ( ')' ) ;
    public final void rule__ForStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4404:1: ( ( ')' ) )
            // InternalMiniJava.g:4405:1: ( ')' )
            {
            // InternalMiniJava.g:4405:1: ( ')' )
            // InternalMiniJava.g:4406:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__7__Impl"


    // $ANTLR start "rule__ForStatement__Group__8"
    // InternalMiniJava.g:4415:1: rule__ForStatement__Group__8 : rule__ForStatement__Group__8__Impl ;
    public final void rule__ForStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4419:1: ( rule__ForStatement__Group__8__Impl )
            // InternalMiniJava.g:4420:2: rule__ForStatement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__8"


    // $ANTLR start "rule__ForStatement__Group__8__Impl"
    // InternalMiniJava.g:4426:1: rule__ForStatement__Group__8__Impl : ( ( rule__ForStatement__BlockAssignment_8 ) ) ;
    public final void rule__ForStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4430:1: ( ( ( rule__ForStatement__BlockAssignment_8 ) ) )
            // InternalMiniJava.g:4431:1: ( ( rule__ForStatement__BlockAssignment_8 ) )
            {
            // InternalMiniJava.g:4431:1: ( ( rule__ForStatement__BlockAssignment_8 ) )
            // InternalMiniJava.g:4432:2: ( rule__ForStatement__BlockAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBlockAssignment_8()); 
            }
            // InternalMiniJava.g:4433:2: ( rule__ForStatement__BlockAssignment_8 )
            // InternalMiniJava.g:4433:3: rule__ForStatement__BlockAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__BlockAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getBlockAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__8__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // InternalMiniJava.g:4442:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4446:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // InternalMiniJava.g:4447:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // InternalMiniJava.g:4454:1: rule__TypeRef__Group__0__Impl : ( ruleSingleTypeRef ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4458:1: ( ( ruleSingleTypeRef ) )
            // InternalMiniJava.g:4459:1: ( ruleSingleTypeRef )
            {
            // InternalMiniJava.g:4459:1: ( ruleSingleTypeRef )
            // InternalMiniJava.g:4460:2: ruleSingleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getSingleTypeRefParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getSingleTypeRefParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // InternalMiniJava.g:4469:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4473:1: ( rule__TypeRef__Group__1__Impl )
            // InternalMiniJava.g:4474:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // InternalMiniJava.g:4480:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__Group_1__0 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4484:1: ( ( ( rule__TypeRef__Group_1__0 )? ) )
            // InternalMiniJava.g:4485:1: ( ( rule__TypeRef__Group_1__0 )? )
            {
            // InternalMiniJava.g:4485:1: ( ( rule__TypeRef__Group_1__0 )? )
            // InternalMiniJava.g:4486:2: ( rule__TypeRef__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:4487:2: ( rule__TypeRef__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==40) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalMiniJava.g:4487:3: rule__TypeRef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeRef__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__0"
    // InternalMiniJava.g:4496:1: rule__TypeRef__Group_1__0 : rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1 ;
    public final void rule__TypeRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4500:1: ( rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1 )
            // InternalMiniJava.g:4501:2: rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__TypeRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__0"


    // $ANTLR start "rule__TypeRef__Group_1__0__Impl"
    // InternalMiniJava.g:4508:1: rule__TypeRef__Group_1__0__Impl : ( () ) ;
    public final void rule__TypeRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4512:1: ( ( () ) )
            // InternalMiniJava.g:4513:1: ( () )
            {
            // InternalMiniJava.g:4513:1: ( () )
            // InternalMiniJava.g:4514:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getArrayTypeRefTypeRefAction_1_0()); 
            }
            // InternalMiniJava.g:4515:2: ()
            // InternalMiniJava.g:4515:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getArrayTypeRefTypeRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__1"
    // InternalMiniJava.g:4523:1: rule__TypeRef__Group_1__1 : rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2 ;
    public final void rule__TypeRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4527:1: ( rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2 )
            // InternalMiniJava.g:4528:2: rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2
            {
            pushFollow(FOLLOW_36);
            rule__TypeRef__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__1"


    // $ANTLR start "rule__TypeRef__Group_1__1__Impl"
    // InternalMiniJava.g:4535:1: rule__TypeRef__Group_1__1__Impl : ( '[' ) ;
    public final void rule__TypeRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4539:1: ( ( '[' ) )
            // InternalMiniJava.g:4540:1: ( '[' )
            {
            // InternalMiniJava.g:4540:1: ( '[' )
            // InternalMiniJava.g:4541:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getLeftSquareBracketKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getLeftSquareBracketKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__2"
    // InternalMiniJava.g:4550:1: rule__TypeRef__Group_1__2 : rule__TypeRef__Group_1__2__Impl ;
    public final void rule__TypeRef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4554:1: ( rule__TypeRef__Group_1__2__Impl )
            // InternalMiniJava.g:4555:2: rule__TypeRef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__2"


    // $ANTLR start "rule__TypeRef__Group_1__2__Impl"
    // InternalMiniJava.g:4561:1: rule__TypeRef__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TypeRef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4565:1: ( ( ']' ) )
            // InternalMiniJava.g:4566:1: ( ']' )
            {
            // InternalMiniJava.g:4566:1: ( ']' )
            // InternalMiniJava.g:4567:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__2__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_1__0"
    // InternalMiniJava.g:4577:1: rule__SingleTypeRef__Group_1__0 : rule__SingleTypeRef__Group_1__0__Impl rule__SingleTypeRef__Group_1__1 ;
    public final void rule__SingleTypeRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4581:1: ( rule__SingleTypeRef__Group_1__0__Impl rule__SingleTypeRef__Group_1__1 )
            // InternalMiniJava.g:4582:2: rule__SingleTypeRef__Group_1__0__Impl rule__SingleTypeRef__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__SingleTypeRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_1__0"


    // $ANTLR start "rule__SingleTypeRef__Group_1__0__Impl"
    // InternalMiniJava.g:4589:1: rule__SingleTypeRef__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4593:1: ( ( () ) )
            // InternalMiniJava.g:4594:1: ( () )
            {
            // InternalMiniJava.g:4594:1: ( () )
            // InternalMiniJava.g:4595:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getIntegerTypeRefAction_1_0()); 
            }
            // InternalMiniJava.g:4596:2: ()
            // InternalMiniJava.g:4596:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getIntegerTypeRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_1__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_1__1"
    // InternalMiniJava.g:4604:1: rule__SingleTypeRef__Group_1__1 : rule__SingleTypeRef__Group_1__1__Impl ;
    public final void rule__SingleTypeRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4608:1: ( rule__SingleTypeRef__Group_1__1__Impl )
            // InternalMiniJava.g:4609:2: rule__SingleTypeRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_1__1"


    // $ANTLR start "rule__SingleTypeRef__Group_1__1__Impl"
    // InternalMiniJava.g:4615:1: rule__SingleTypeRef__Group_1__1__Impl : ( 'int' ) ;
    public final void rule__SingleTypeRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4619:1: ( ( 'int' ) )
            // InternalMiniJava.g:4620:1: ( 'int' )
            {
            // InternalMiniJava.g:4620:1: ( 'int' )
            // InternalMiniJava.g:4621:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getIntKeyword_1_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getIntKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_1__1__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_2__0"
    // InternalMiniJava.g:4631:1: rule__SingleTypeRef__Group_2__0 : rule__SingleTypeRef__Group_2__0__Impl rule__SingleTypeRef__Group_2__1 ;
    public final void rule__SingleTypeRef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4635:1: ( rule__SingleTypeRef__Group_2__0__Impl rule__SingleTypeRef__Group_2__1 )
            // InternalMiniJava.g:4636:2: rule__SingleTypeRef__Group_2__0__Impl rule__SingleTypeRef__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__SingleTypeRef__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_2__0"


    // $ANTLR start "rule__SingleTypeRef__Group_2__0__Impl"
    // InternalMiniJava.g:4643:1: rule__SingleTypeRef__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4647:1: ( ( () ) )
            // InternalMiniJava.g:4648:1: ( () )
            {
            // InternalMiniJava.g:4648:1: ( () )
            // InternalMiniJava.g:4649:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getBooleanTypeRefAction_2_0()); 
            }
            // InternalMiniJava.g:4650:2: ()
            // InternalMiniJava.g:4650:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getBooleanTypeRefAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_2__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_2__1"
    // InternalMiniJava.g:4658:1: rule__SingleTypeRef__Group_2__1 : rule__SingleTypeRef__Group_2__1__Impl ;
    public final void rule__SingleTypeRef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4662:1: ( rule__SingleTypeRef__Group_2__1__Impl )
            // InternalMiniJava.g:4663:2: rule__SingleTypeRef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_2__1"


    // $ANTLR start "rule__SingleTypeRef__Group_2__1__Impl"
    // InternalMiniJava.g:4669:1: rule__SingleTypeRef__Group_2__1__Impl : ( 'boolean' ) ;
    public final void rule__SingleTypeRef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4673:1: ( ( 'boolean' ) )
            // InternalMiniJava.g:4674:1: ( 'boolean' )
            {
            // InternalMiniJava.g:4674:1: ( 'boolean' )
            // InternalMiniJava.g:4675:2: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getBooleanKeyword_2_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getBooleanKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_2__1__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_3__0"
    // InternalMiniJava.g:4685:1: rule__SingleTypeRef__Group_3__0 : rule__SingleTypeRef__Group_3__0__Impl rule__SingleTypeRef__Group_3__1 ;
    public final void rule__SingleTypeRef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4689:1: ( rule__SingleTypeRef__Group_3__0__Impl rule__SingleTypeRef__Group_3__1 )
            // InternalMiniJava.g:4690:2: rule__SingleTypeRef__Group_3__0__Impl rule__SingleTypeRef__Group_3__1
            {
            pushFollow(FOLLOW_39);
            rule__SingleTypeRef__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_3__0"


    // $ANTLR start "rule__SingleTypeRef__Group_3__0__Impl"
    // InternalMiniJava.g:4697:1: rule__SingleTypeRef__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4701:1: ( ( () ) )
            // InternalMiniJava.g:4702:1: ( () )
            {
            // InternalMiniJava.g:4702:1: ( () )
            // InternalMiniJava.g:4703:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getStringTypeRefAction_3_0()); 
            }
            // InternalMiniJava.g:4704:2: ()
            // InternalMiniJava.g:4704:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getStringTypeRefAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_3__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_3__1"
    // InternalMiniJava.g:4712:1: rule__SingleTypeRef__Group_3__1 : rule__SingleTypeRef__Group_3__1__Impl ;
    public final void rule__SingleTypeRef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4716:1: ( rule__SingleTypeRef__Group_3__1__Impl )
            // InternalMiniJava.g:4717:2: rule__SingleTypeRef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_3__1"


    // $ANTLR start "rule__SingleTypeRef__Group_3__1__Impl"
    // InternalMiniJava.g:4723:1: rule__SingleTypeRef__Group_3__1__Impl : ( 'String' ) ;
    public final void rule__SingleTypeRef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4727:1: ( ( 'String' ) )
            // InternalMiniJava.g:4728:1: ( 'String' )
            {
            // InternalMiniJava.g:4728:1: ( 'String' )
            // InternalMiniJava.g:4729:2: 'String'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getStringKeyword_3_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getStringKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_3__1__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_4__0"
    // InternalMiniJava.g:4739:1: rule__SingleTypeRef__Group_4__0 : rule__SingleTypeRef__Group_4__0__Impl rule__SingleTypeRef__Group_4__1 ;
    public final void rule__SingleTypeRef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4743:1: ( rule__SingleTypeRef__Group_4__0__Impl rule__SingleTypeRef__Group_4__1 )
            // InternalMiniJava.g:4744:2: rule__SingleTypeRef__Group_4__0__Impl rule__SingleTypeRef__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__SingleTypeRef__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_4__0"


    // $ANTLR start "rule__SingleTypeRef__Group_4__0__Impl"
    // InternalMiniJava.g:4751:1: rule__SingleTypeRef__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4755:1: ( ( () ) )
            // InternalMiniJava.g:4756:1: ( () )
            {
            // InternalMiniJava.g:4756:1: ( () )
            // InternalMiniJava.g:4757:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getVoidTypeRefAction_4_0()); 
            }
            // InternalMiniJava.g:4758:2: ()
            // InternalMiniJava.g:4758:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getVoidTypeRefAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_4__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_4__1"
    // InternalMiniJava.g:4766:1: rule__SingleTypeRef__Group_4__1 : rule__SingleTypeRef__Group_4__1__Impl ;
    public final void rule__SingleTypeRef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4770:1: ( rule__SingleTypeRef__Group_4__1__Impl )
            // InternalMiniJava.g:4771:2: rule__SingleTypeRef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_4__1"


    // $ANTLR start "rule__SingleTypeRef__Group_4__1__Impl"
    // InternalMiniJava.g:4777:1: rule__SingleTypeRef__Group_4__1__Impl : ( 'void' ) ;
    public final void rule__SingleTypeRef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4781:1: ( ( 'void' ) )
            // InternalMiniJava.g:4782:1: ( 'void' )
            {
            // InternalMiniJava.g:4782:1: ( 'void' )
            // InternalMiniJava.g:4783:2: 'void'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getVoidKeyword_4_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getVoidKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_4__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalMiniJava.g:4793:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4797:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalMiniJava.g:4798:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalMiniJava.g:4805:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4809:1: ( ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) ) )
            // InternalMiniJava.g:4810:1: ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) )
            {
            // InternalMiniJava.g:4810:1: ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) )
            // InternalMiniJava.g:4811:2: ( rule__VariableDeclaration__TypeRefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeRefAssignment_0()); 
            }
            // InternalMiniJava.g:4812:2: ( rule__VariableDeclaration__TypeRefAssignment_0 )
            // InternalMiniJava.g:4812:3: rule__VariableDeclaration__TypeRefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__TypeRefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getTypeRefAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalMiniJava.g:4820:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4824:1: ( rule__VariableDeclaration__Group__1__Impl )
            // InternalMiniJava.g:4825:2: rule__VariableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalMiniJava.g:4831:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4835:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalMiniJava.g:4836:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:4836:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalMiniJava.g:4837:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:4838:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalMiniJava.g:4838:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMiniJava.g:4847:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4851:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMiniJava.g:4852:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMiniJava.g:4859:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__AssigneeAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4863:1: ( ( ( rule__Assignment__AssigneeAssignment_0 ) ) )
            // InternalMiniJava.g:4864:1: ( ( rule__Assignment__AssigneeAssignment_0 ) )
            {
            // InternalMiniJava.g:4864:1: ( ( rule__Assignment__AssigneeAssignment_0 ) )
            // InternalMiniJava.g:4865:2: ( rule__Assignment__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssigneeAssignment_0()); 
            }
            // InternalMiniJava.g:4866:2: ( rule__Assignment__AssigneeAssignment_0 )
            // InternalMiniJava.g:4866:3: rule__Assignment__AssigneeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__AssigneeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAssigneeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMiniJava.g:4874:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4878:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMiniJava.g:4879:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMiniJava.g:4886:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4890:1: ( ( '=' ) )
            // InternalMiniJava.g:4891:1: ( '=' )
            {
            // InternalMiniJava.g:4891:1: ( '=' )
            // InternalMiniJava.g:4892:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalMiniJava.g:4901:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4905:1: ( rule__Assignment__Group__2__Impl )
            // InternalMiniJava.g:4906:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalMiniJava.g:4912:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4916:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMiniJava.g:4917:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMiniJava.g:4917:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMiniJava.g:4918:2: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // InternalMiniJava.g:4919:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMiniJava.g:4919:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalMiniJava.g:4928:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4932:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMiniJava.g:4933:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalMiniJava.g:4940:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4944:1: ( ( ruleAnd ) )
            // InternalMiniJava.g:4945:1: ( ruleAnd )
            {
            // InternalMiniJava.g:4945:1: ( ruleAnd )
            // InternalMiniJava.g:4946:2: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalMiniJava.g:4955:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4959:1: ( rule__Or__Group__1__Impl )
            // InternalMiniJava.g:4960:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalMiniJava.g:4966:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4970:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMiniJava.g:4971:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMiniJava.g:4971:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMiniJava.g:4972:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:4973:2: ( rule__Or__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==45) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMiniJava.g:4973:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalMiniJava.g:4982:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4986:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMiniJava.g:4987:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalMiniJava.g:4994:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4998:1: ( ( () ) )
            // InternalMiniJava.g:4999:1: ( () )
            {
            // InternalMiniJava.g:4999:1: ( () )
            // InternalMiniJava.g:5000:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // InternalMiniJava.g:5001:2: ()
            // InternalMiniJava.g:5001:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalMiniJava.g:5009:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5013:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMiniJava.g:5014:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalMiniJava.g:5021:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5025:1: ( ( '||' ) )
            // InternalMiniJava.g:5026:1: ( '||' )
            {
            // InternalMiniJava.g:5026:1: ( '||' )
            // InternalMiniJava.g:5027:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalMiniJava.g:5036:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5040:1: ( rule__Or__Group_1__2__Impl )
            // InternalMiniJava.g:5041:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalMiniJava.g:5047:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5051:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:5052:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:5052:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMiniJava.g:5053:2: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniJava.g:5054:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMiniJava.g:5054:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalMiniJava.g:5063:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5067:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMiniJava.g:5068:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalMiniJava.g:5075:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5079:1: ( ( ruleEquality ) )
            // InternalMiniJava.g:5080:1: ( ruleEquality )
            {
            // InternalMiniJava.g:5080:1: ( ruleEquality )
            // InternalMiniJava.g:5081:2: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalMiniJava.g:5090:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5094:1: ( rule__And__Group__1__Impl )
            // InternalMiniJava.g:5095:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalMiniJava.g:5101:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5105:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMiniJava.g:5106:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMiniJava.g:5106:1: ( ( rule__And__Group_1__0 )* )
            // InternalMiniJava.g:5107:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5108:2: ( rule__And__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==46) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMiniJava.g:5108:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalMiniJava.g:5117:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5121:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMiniJava.g:5122:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalMiniJava.g:5129:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5133:1: ( ( () ) )
            // InternalMiniJava.g:5134:1: ( () )
            {
            // InternalMiniJava.g:5134:1: ( () )
            // InternalMiniJava.g:5135:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }
            // InternalMiniJava.g:5136:2: ()
            // InternalMiniJava.g:5136:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalMiniJava.g:5144:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5148:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMiniJava.g:5149:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalMiniJava.g:5156:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5160:1: ( ( '&&' ) )
            // InternalMiniJava.g:5161:1: ( '&&' )
            {
            // InternalMiniJava.g:5161:1: ( '&&' )
            // InternalMiniJava.g:5162:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalMiniJava.g:5171:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5175:1: ( rule__And__Group_1__2__Impl )
            // InternalMiniJava.g:5176:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalMiniJava.g:5182:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5186:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:5187:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:5187:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMiniJava.g:5188:2: ( rule__And__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniJava.g:5189:2: ( rule__And__RightAssignment_1_2 )
            // InternalMiniJava.g:5189:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalMiniJava.g:5198:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5202:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalMiniJava.g:5203:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Equality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalMiniJava.g:5210:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5214:1: ( ( ruleComparison ) )
            // InternalMiniJava.g:5215:1: ( ruleComparison )
            {
            // InternalMiniJava.g:5215:1: ( ruleComparison )
            // InternalMiniJava.g:5216:2: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalMiniJava.g:5225:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5229:1: ( rule__Equality__Group__1__Impl )
            // InternalMiniJava.g:5230:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalMiniJava.g:5236:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5240:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalMiniJava.g:5241:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalMiniJava.g:5241:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalMiniJava.g:5242:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5243:2: ( rule__Equality__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=47 && LA46_0<=48)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMiniJava.g:5243:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalMiniJava.g:5252:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5256:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalMiniJava.g:5257:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalMiniJava.g:5264:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5268:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:5269:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:5269:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalMiniJava.g:5270:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:5271:2: ( rule__Equality__Alternatives_1_0 )
            // InternalMiniJava.g:5271:3: rule__Equality__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalMiniJava.g:5279:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5283:1: ( rule__Equality__Group_1__1__Impl )
            // InternalMiniJava.g:5284:2: rule__Equality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalMiniJava.g:5290:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RightAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5294:1: ( ( ( rule__Equality__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:5295:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:5295:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            // InternalMiniJava.g:5296:2: ( rule__Equality__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:5297:2: ( rule__Equality__RightAssignment_1_1 )
            // InternalMiniJava.g:5297:3: rule__Equality__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__0"
    // InternalMiniJava.g:5306:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5310:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalMiniJava.g:5311:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_47);
            rule__Equality__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0"


    // $ANTLR start "rule__Equality__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:5318:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5322:1: ( ( () ) )
            // InternalMiniJava.g:5323:1: ( () )
            {
            // InternalMiniJava.g:5323:1: ( () )
            // InternalMiniJava.g:5324:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:5325:2: ()
            // InternalMiniJava.g:5325:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__1"
    // InternalMiniJava.g:5333:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5337:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:5338:2: rule__Equality__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__1"


    // $ANTLR start "rule__Equality__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:5344:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5348:1: ( ( '==' ) )
            // InternalMiniJava.g:5349:1: ( '==' )
            {
            // InternalMiniJava.g:5349:1: ( '==' )
            // InternalMiniJava.g:5350:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__0"
    // InternalMiniJava.g:5360:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5364:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalMiniJava.g:5365:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_45);
            rule__Equality__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0"


    // $ANTLR start "rule__Equality__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:5372:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5376:1: ( ( () ) )
            // InternalMiniJava.g:5377:1: ( () )
            {
            // InternalMiniJava.g:5377:1: ( () )
            // InternalMiniJava.g:5378:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:5379:2: ()
            // InternalMiniJava.g:5379:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__1"
    // InternalMiniJava.g:5387:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5391:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:5392:2: rule__Equality__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__1"


    // $ANTLR start "rule__Equality__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:5398:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5402:1: ( ( '!=' ) )
            // InternalMiniJava.g:5403:1: ( '!=' )
            {
            // InternalMiniJava.g:5403:1: ( '!=' )
            // InternalMiniJava.g:5404:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMiniJava.g:5414:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5418:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMiniJava.g:5419:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMiniJava.g:5426:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5430:1: ( ( rulePlusOrMinus ) )
            // InternalMiniJava.g:5431:1: ( rulePlusOrMinus )
            {
            // InternalMiniJava.g:5431:1: ( rulePlusOrMinus )
            // InternalMiniJava.g:5432:2: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMiniJava.g:5441:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5445:1: ( rule__Comparison__Group__1__Impl )
            // InternalMiniJava.g:5446:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMiniJava.g:5452:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5456:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalMiniJava.g:5457:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalMiniJava.g:5457:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalMiniJava.g:5458:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5459:2: ( rule__Comparison__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=49 && LA47_0<=52)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMiniJava.g:5459:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalMiniJava.g:5468:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5472:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalMiniJava.g:5473:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalMiniJava.g:5480:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5484:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:5485:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:5485:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalMiniJava.g:5486:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:5487:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalMiniJava.g:5487:3: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalMiniJava.g:5495:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5499:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalMiniJava.g:5500:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalMiniJava.g:5506:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5510:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:5511:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:5511:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalMiniJava.g:5512:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:5513:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalMiniJava.g:5513:3: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // InternalMiniJava.g:5522:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5526:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalMiniJava.g:5527:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_50);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:5534:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5538:1: ( ( () ) )
            // InternalMiniJava.g:5539:1: ( () )
            {
            // InternalMiniJava.g:5539:1: ( () )
            // InternalMiniJava.g:5540:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getSuperiorOrEqualLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:5541:2: ()
            // InternalMiniJava.g:5541:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getSuperiorOrEqualLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // InternalMiniJava.g:5549:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5553:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:5554:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:5560:1: rule__Comparison__Group_1_0_0__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5564:1: ( ( '>=' ) )
            // InternalMiniJava.g:5565:1: ( '>=' )
            {
            // InternalMiniJava.g:5565:1: ( '>=' )
            // InternalMiniJava.g:5566:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0"
    // InternalMiniJava.g:5576:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5580:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalMiniJava.g:5581:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_51);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:5588:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5592:1: ( ( () ) )
            // InternalMiniJava.g:5593:1: ( () )
            {
            // InternalMiniJava.g:5593:1: ( () )
            // InternalMiniJava.g:5594:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getInferiorOrEqualLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:5595:2: ()
            // InternalMiniJava.g:5595:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getInferiorOrEqualLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1"
    // InternalMiniJava.g:5603:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5607:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:5608:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:5614:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5618:1: ( ( '<=' ) )
            // InternalMiniJava.g:5619:1: ( '<=' )
            {
            // InternalMiniJava.g:5619:1: ( '<=' )
            // InternalMiniJava.g:5620:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0"
    // InternalMiniJava.g:5630:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5634:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalMiniJava.g:5635:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_52);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0__Impl"
    // InternalMiniJava.g:5642:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5646:1: ( ( () ) )
            // InternalMiniJava.g:5647:1: ( () )
            {
            // InternalMiniJava.g:5647:1: ( () )
            // InternalMiniJava.g:5648:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getSuperiorLeftAction_1_0_2_0()); 
            }
            // InternalMiniJava.g:5649:2: ()
            // InternalMiniJava.g:5649:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getSuperiorLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1"
    // InternalMiniJava.g:5657:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5661:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalMiniJava.g:5662:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1__Impl"
    // InternalMiniJava.g:5668:1: rule__Comparison__Group_1_0_2__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5672:1: ( ( '>' ) )
            // InternalMiniJava.g:5673:1: ( '>' )
            {
            // InternalMiniJava.g:5673:1: ( '>' )
            // InternalMiniJava.g:5674:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0"
    // InternalMiniJava.g:5684:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5688:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalMiniJava.g:5689:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_48);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0__Impl"
    // InternalMiniJava.g:5696:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5700:1: ( ( () ) )
            // InternalMiniJava.g:5701:1: ( () )
            {
            // InternalMiniJava.g:5701:1: ( () )
            // InternalMiniJava.g:5702:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getInferiorLeftAction_1_0_3_0()); 
            }
            // InternalMiniJava.g:5703:2: ()
            // InternalMiniJava.g:5703:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getInferiorLeftAction_1_0_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1"
    // InternalMiniJava.g:5711:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5715:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalMiniJava.g:5716:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1__Impl"
    // InternalMiniJava.g:5722:1: rule__Comparison__Group_1_0_3__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5726:1: ( ( '<' ) )
            // InternalMiniJava.g:5727:1: ( '<' )
            {
            // InternalMiniJava.g:5727:1: ( '<' )
            // InternalMiniJava.g:5728:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMiniJava.g:5738:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5742:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMiniJava.g:5743:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMiniJava.g:5750:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5754:1: ( ( ruleMulOrDiv ) )
            // InternalMiniJava.g:5755:1: ( ruleMulOrDiv )
            {
            // InternalMiniJava.g:5755:1: ( ruleMulOrDiv )
            // InternalMiniJava.g:5756:2: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMiniJava.g:5765:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5769:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMiniJava.g:5770:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMiniJava.g:5776:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5780:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMiniJava.g:5781:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMiniJava.g:5781:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMiniJava.g:5782:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5783:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=53 && LA48_0<=54)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMiniJava.g:5783:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalMiniJava.g:5792:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5796:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMiniJava.g:5797:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalMiniJava.g:5804:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5808:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:5809:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:5809:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalMiniJava.g:5810:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:5811:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalMiniJava.g:5811:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalMiniJava.g:5819:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5823:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMiniJava.g:5824:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalMiniJava.g:5830:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5834:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:5835:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:5835:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMiniJava.g:5836:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:5837:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMiniJava.g:5837:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalMiniJava.g:5846:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5850:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalMiniJava.g:5851:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_55);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:5858:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5862:1: ( ( () ) )
            // InternalMiniJava.g:5863:1: ( () )
            {
            // InternalMiniJava.g:5863:1: ( () )
            // InternalMiniJava.g:5864:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:5865:2: ()
            // InternalMiniJava.g:5865:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalMiniJava.g:5873:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5877:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:5878:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:5884:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5888:1: ( ( '+' ) )
            // InternalMiniJava.g:5889:1: ( '+' )
            {
            // InternalMiniJava.g:5889:1: ( '+' )
            // InternalMiniJava.g:5890:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalMiniJava.g:5900:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5904:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalMiniJava.g:5905:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_53);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:5912:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5916:1: ( ( () ) )
            // InternalMiniJava.g:5917:1: ( () )
            {
            // InternalMiniJava.g:5917:1: ( () )
            // InternalMiniJava.g:5918:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:5919:2: ()
            // InternalMiniJava.g:5919:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalMiniJava.g:5927:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5931:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:5932:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:5938:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5942:1: ( ( '-' ) )
            // InternalMiniJava.g:5943:1: ( '-' )
            {
            // InternalMiniJava.g:5943:1: ( '-' )
            // InternalMiniJava.g:5944:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalMiniJava.g:5954:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5958:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalMiniJava.g:5959:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalMiniJava.g:5966:1: rule__MulOrDiv__Group__0__Impl : ( ruleArrayAccess ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5970:1: ( ( ruleArrayAccess ) )
            // InternalMiniJava.g:5971:1: ( ruleArrayAccess )
            {
            // InternalMiniJava.g:5971:1: ( ruleArrayAccess )
            // InternalMiniJava.g:5972:2: ruleArrayAccess
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getArrayAccessParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getArrayAccessParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalMiniJava.g:5981:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5985:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalMiniJava.g:5986:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalMiniJava.g:5992:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5996:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalMiniJava.g:5997:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalMiniJava.g:5997:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalMiniJava.g:5998:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5999:2: ( rule__MulOrDiv__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=55 && LA49_0<=56)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMiniJava.g:5999:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalMiniJava.g:6008:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6012:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalMiniJava.g:6013:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalMiniJava.g:6020:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6024:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:6025:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:6025:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalMiniJava.g:6026:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:6027:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalMiniJava.g:6027:3: rule__MulOrDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalMiniJava.g:6035:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6039:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalMiniJava.g:6040:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalMiniJava.g:6046:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6050:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:6051:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:6051:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalMiniJava.g:6052:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:6053:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalMiniJava.g:6053:3: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0"
    // InternalMiniJava.g:6062:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6066:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalMiniJava.g:6067:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_58);
            rule__MulOrDiv__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:6074:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6078:1: ( ( () ) )
            // InternalMiniJava.g:6079:1: ( () )
            {
            // InternalMiniJava.g:6079:1: ( () )
            // InternalMiniJava.g:6080:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultiplicationLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:6081:2: ()
            // InternalMiniJava.g:6081:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getMultiplicationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1"
    // InternalMiniJava.g:6089:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6093:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:6094:2: rule__MulOrDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:6100:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6104:1: ( ( '*' ) )
            // InternalMiniJava.g:6105:1: ( '*' )
            {
            // InternalMiniJava.g:6105:1: ( '*' )
            // InternalMiniJava.g:6106:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0"
    // InternalMiniJava.g:6116:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6120:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalMiniJava.g:6121:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_56);
            rule__MulOrDiv__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:6128:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6132:1: ( ( () ) )
            // InternalMiniJava.g:6133:1: ( () )
            {
            // InternalMiniJava.g:6133:1: ( () )
            // InternalMiniJava.g:6134:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivisionLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:6135:2: ()
            // InternalMiniJava.g:6135:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getDivisionLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1"
    // InternalMiniJava.g:6143:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6147:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:6148:2: rule__MulOrDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:6154:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6158:1: ( ( '/' ) )
            // InternalMiniJava.g:6159:1: ( '/' )
            {
            // InternalMiniJava.g:6159:1: ( '/' )
            // InternalMiniJava.g:6160:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__ArrayAccess__Group__0"
    // InternalMiniJava.g:6170:1: rule__ArrayAccess__Group__0 : rule__ArrayAccess__Group__0__Impl rule__ArrayAccess__Group__1 ;
    public final void rule__ArrayAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6174:1: ( rule__ArrayAccess__Group__0__Impl rule__ArrayAccess__Group__1 )
            // InternalMiniJava.g:6175:2: rule__ArrayAccess__Group__0__Impl rule__ArrayAccess__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ArrayAccess__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group__0"


    // $ANTLR start "rule__ArrayAccess__Group__0__Impl"
    // InternalMiniJava.g:6182:1: rule__ArrayAccess__Group__0__Impl : ( ruleArrayLength ) ;
    public final void rule__ArrayAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6186:1: ( ( ruleArrayLength ) )
            // InternalMiniJava.g:6187:1: ( ruleArrayLength )
            {
            // InternalMiniJava.g:6187:1: ( ruleArrayLength )
            // InternalMiniJava.g:6188:2: ruleArrayLength
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getArrayLengthParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayLength();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getArrayLengthParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group__0__Impl"


    // $ANTLR start "rule__ArrayAccess__Group__1"
    // InternalMiniJava.g:6197:1: rule__ArrayAccess__Group__1 : rule__ArrayAccess__Group__1__Impl ;
    public final void rule__ArrayAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6201:1: ( rule__ArrayAccess__Group__1__Impl )
            // InternalMiniJava.g:6202:2: rule__ArrayAccess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group__1"


    // $ANTLR start "rule__ArrayAccess__Group__1__Impl"
    // InternalMiniJava.g:6208:1: rule__ArrayAccess__Group__1__Impl : ( ( rule__ArrayAccess__Group_1__0 )? ) ;
    public final void rule__ArrayAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6212:1: ( ( ( rule__ArrayAccess__Group_1__0 )? ) )
            // InternalMiniJava.g:6213:1: ( ( rule__ArrayAccess__Group_1__0 )? )
            {
            // InternalMiniJava.g:6213:1: ( ( rule__ArrayAccess__Group_1__0 )? )
            // InternalMiniJava.g:6214:2: ( rule__ArrayAccess__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:6215:2: ( rule__ArrayAccess__Group_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMiniJava.g:6215:3: rule__ArrayAccess__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayAccess__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group__1__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__0"
    // InternalMiniJava.g:6224:1: rule__ArrayAccess__Group_1__0 : rule__ArrayAccess__Group_1__0__Impl rule__ArrayAccess__Group_1__1 ;
    public final void rule__ArrayAccess__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6228:1: ( rule__ArrayAccess__Group_1__0__Impl rule__ArrayAccess__Group_1__1 )
            // InternalMiniJava.g:6229:2: rule__ArrayAccess__Group_1__0__Impl rule__ArrayAccess__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ArrayAccess__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__0"


    // $ANTLR start "rule__ArrayAccess__Group_1__0__Impl"
    // InternalMiniJava.g:6236:1: rule__ArrayAccess__Group_1__0__Impl : ( () ) ;
    public final void rule__ArrayAccess__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6240:1: ( ( () ) )
            // InternalMiniJava.g:6241:1: ( () )
            {
            // InternalMiniJava.g:6241:1: ( () )
            // InternalMiniJava.g:6242:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getArrayAccessObjectAction_1_0()); 
            }
            // InternalMiniJava.g:6243:2: ()
            // InternalMiniJava.g:6243:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getArrayAccessObjectAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__1"
    // InternalMiniJava.g:6251:1: rule__ArrayAccess__Group_1__1 : rule__ArrayAccess__Group_1__1__Impl rule__ArrayAccess__Group_1__2 ;
    public final void rule__ArrayAccess__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6255:1: ( rule__ArrayAccess__Group_1__1__Impl rule__ArrayAccess__Group_1__2 )
            // InternalMiniJava.g:6256:2: rule__ArrayAccess__Group_1__1__Impl rule__ArrayAccess__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__ArrayAccess__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__1"


    // $ANTLR start "rule__ArrayAccess__Group_1__1__Impl"
    // InternalMiniJava.g:6263:1: rule__ArrayAccess__Group_1__1__Impl : ( '[' ) ;
    public final void rule__ArrayAccess__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6267:1: ( ( '[' ) )
            // InternalMiniJava.g:6268:1: ( '[' )
            {
            // InternalMiniJava.g:6268:1: ( '[' )
            // InternalMiniJava.g:6269:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getLeftSquareBracketKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getLeftSquareBracketKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__2"
    // InternalMiniJava.g:6278:1: rule__ArrayAccess__Group_1__2 : rule__ArrayAccess__Group_1__2__Impl rule__ArrayAccess__Group_1__3 ;
    public final void rule__ArrayAccess__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6282:1: ( rule__ArrayAccess__Group_1__2__Impl rule__ArrayAccess__Group_1__3 )
            // InternalMiniJava.g:6283:2: rule__ArrayAccess__Group_1__2__Impl rule__ArrayAccess__Group_1__3
            {
            pushFollow(FOLLOW_36);
            rule__ArrayAccess__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__2"


    // $ANTLR start "rule__ArrayAccess__Group_1__2__Impl"
    // InternalMiniJava.g:6290:1: rule__ArrayAccess__Group_1__2__Impl : ( ( rule__ArrayAccess__IndexAssignment_1_2 ) ) ;
    public final void rule__ArrayAccess__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6294:1: ( ( ( rule__ArrayAccess__IndexAssignment_1_2 ) ) )
            // InternalMiniJava.g:6295:1: ( ( rule__ArrayAccess__IndexAssignment_1_2 ) )
            {
            // InternalMiniJava.g:6295:1: ( ( rule__ArrayAccess__IndexAssignment_1_2 ) )
            // InternalMiniJava.g:6296:2: ( rule__ArrayAccess__IndexAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getIndexAssignment_1_2()); 
            }
            // InternalMiniJava.g:6297:2: ( rule__ArrayAccess__IndexAssignment_1_2 )
            // InternalMiniJava.g:6297:3: rule__ArrayAccess__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__IndexAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getIndexAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__2__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__3"
    // InternalMiniJava.g:6305:1: rule__ArrayAccess__Group_1__3 : rule__ArrayAccess__Group_1__3__Impl ;
    public final void rule__ArrayAccess__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6309:1: ( rule__ArrayAccess__Group_1__3__Impl )
            // InternalMiniJava.g:6310:2: rule__ArrayAccess__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__3"


    // $ANTLR start "rule__ArrayAccess__Group_1__3__Impl"
    // InternalMiniJava.g:6316:1: rule__ArrayAccess__Group_1__3__Impl : ( ']' ) ;
    public final void rule__ArrayAccess__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6320:1: ( ( ']' ) )
            // InternalMiniJava.g:6321:1: ( ']' )
            {
            // InternalMiniJava.g:6321:1: ( ']' )
            // InternalMiniJava.g:6322:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getRightSquareBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__3__Impl"


    // $ANTLR start "rule__ArrayLength__Group__0"
    // InternalMiniJava.g:6332:1: rule__ArrayLength__Group__0 : rule__ArrayLength__Group__0__Impl rule__ArrayLength__Group__1 ;
    public final void rule__ArrayLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6336:1: ( rule__ArrayLength__Group__0__Impl rule__ArrayLength__Group__1 )
            // InternalMiniJava.g:6337:2: rule__ArrayLength__Group__0__Impl rule__ArrayLength__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ArrayLength__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group__0"


    // $ANTLR start "rule__ArrayLength__Group__0__Impl"
    // InternalMiniJava.g:6344:1: rule__ArrayLength__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ArrayLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6348:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:6349:1: ( rulePrimary )
            {
            // InternalMiniJava.g:6349:1: ( rulePrimary )
            // InternalMiniJava.g:6350:2: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group__0__Impl"


    // $ANTLR start "rule__ArrayLength__Group__1"
    // InternalMiniJava.g:6359:1: rule__ArrayLength__Group__1 : rule__ArrayLength__Group__1__Impl ;
    public final void rule__ArrayLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6363:1: ( rule__ArrayLength__Group__1__Impl )
            // InternalMiniJava.g:6364:2: rule__ArrayLength__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group__1"


    // $ANTLR start "rule__ArrayLength__Group__1__Impl"
    // InternalMiniJava.g:6370:1: rule__ArrayLength__Group__1__Impl : ( ( rule__ArrayLength__Group_1__0 )? ) ;
    public final void rule__ArrayLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6374:1: ( ( ( rule__ArrayLength__Group_1__0 )? ) )
            // InternalMiniJava.g:6375:1: ( ( rule__ArrayLength__Group_1__0 )? )
            {
            // InternalMiniJava.g:6375:1: ( ( rule__ArrayLength__Group_1__0 )? )
            // InternalMiniJava.g:6376:2: ( rule__ArrayLength__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:6377:2: ( rule__ArrayLength__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==19) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMiniJava.g:6377:3: rule__ArrayLength__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayLength__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group__1__Impl"


    // $ANTLR start "rule__ArrayLength__Group_1__0"
    // InternalMiniJava.g:6386:1: rule__ArrayLength__Group_1__0 : rule__ArrayLength__Group_1__0__Impl rule__ArrayLength__Group_1__1 ;
    public final void rule__ArrayLength__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6390:1: ( rule__ArrayLength__Group_1__0__Impl rule__ArrayLength__Group_1__1 )
            // InternalMiniJava.g:6391:2: rule__ArrayLength__Group_1__0__Impl rule__ArrayLength__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ArrayLength__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group_1__0"


    // $ANTLR start "rule__ArrayLength__Group_1__0__Impl"
    // InternalMiniJava.g:6398:1: rule__ArrayLength__Group_1__0__Impl : ( () ) ;
    public final void rule__ArrayLength__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6402:1: ( ( () ) )
            // InternalMiniJava.g:6403:1: ( () )
            {
            // InternalMiniJava.g:6403:1: ( () )
            // InternalMiniJava.g:6404:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getArrayLengthArrayAction_1_0()); 
            }
            // InternalMiniJava.g:6405:2: ()
            // InternalMiniJava.g:6405:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getArrayLengthArrayAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayLength__Group_1__1"
    // InternalMiniJava.g:6413:1: rule__ArrayLength__Group_1__1 : rule__ArrayLength__Group_1__1__Impl rule__ArrayLength__Group_1__2 ;
    public final void rule__ArrayLength__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6417:1: ( rule__ArrayLength__Group_1__1__Impl rule__ArrayLength__Group_1__2 )
            // InternalMiniJava.g:6418:2: rule__ArrayLength__Group_1__1__Impl rule__ArrayLength__Group_1__2
            {
            pushFollow(FOLLOW_59);
            rule__ArrayLength__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group_1__1"


    // $ANTLR start "rule__ArrayLength__Group_1__1__Impl"
    // InternalMiniJava.g:6425:1: rule__ArrayLength__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ArrayLength__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6429:1: ( ( '.' ) )
            // InternalMiniJava.g:6430:1: ( '.' )
            {
            // InternalMiniJava.g:6430:1: ( '.' )
            // InternalMiniJava.g:6431:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getFullStopKeyword_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayLength__Group_1__2"
    // InternalMiniJava.g:6440:1: rule__ArrayLength__Group_1__2 : rule__ArrayLength__Group_1__2__Impl ;
    public final void rule__ArrayLength__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6444:1: ( rule__ArrayLength__Group_1__2__Impl )
            // InternalMiniJava.g:6445:2: rule__ArrayLength__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group_1__2"


    // $ANTLR start "rule__ArrayLength__Group_1__2__Impl"
    // InternalMiniJava.g:6451:1: rule__ArrayLength__Group_1__2__Impl : ( 'length' ) ;
    public final void rule__ArrayLength__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6455:1: ( ( 'length' ) )
            // InternalMiniJava.g:6456:1: ( 'length' )
            {
            // InternalMiniJava.g:6456:1: ( 'length' )
            // InternalMiniJava.g:6457:2: 'length'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getLengthKeyword_1_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getLengthKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMiniJava.g:6467:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6471:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMiniJava.g:6472:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMiniJava.g:6479:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6483:1: ( ( '(' ) )
            // InternalMiniJava.g:6484:1: ( '(' )
            {
            // InternalMiniJava.g:6484:1: ( '(' )
            // InternalMiniJava.g:6485:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMiniJava.g:6494:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6498:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMiniJava.g:6499:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_32);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMiniJava.g:6506:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6510:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:6511:1: ( ruleExpression )
            {
            // InternalMiniJava.g:6511:1: ( ruleExpression )
            // InternalMiniJava.g:6512:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMiniJava.g:6521:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6525:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMiniJava.g:6526:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMiniJava.g:6532:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6536:1: ( ( ')' ) )
            // InternalMiniJava.g:6537:1: ( ')' )
            {
            // InternalMiniJava.g:6537:1: ( ')' )
            // InternalMiniJava.g:6538:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMiniJava.g:6548:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6552:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMiniJava.g:6553:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_60);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMiniJava.g:6560:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6564:1: ( ( () ) )
            // InternalMiniJava.g:6565:1: ( () )
            {
            // InternalMiniJava.g:6565:1: ( () )
            // InternalMiniJava.g:6566:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalMiniJava.g:6567:2: ()
            // InternalMiniJava.g:6567:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMiniJava.g:6575:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6579:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMiniJava.g:6580:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMiniJava.g:6587:1: rule__Primary__Group_1__1__Impl : ( ( '!' ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6591:1: ( ( ( '!' ) ) )
            // InternalMiniJava.g:6592:1: ( ( '!' ) )
            {
            // InternalMiniJava.g:6592:1: ( ( '!' ) )
            // InternalMiniJava.g:6593:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            // InternalMiniJava.g:6594:2: ( '!' )
            // InternalMiniJava.g:6594:3: '!'
            {
            match(input,58,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMiniJava.g:6602:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6606:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMiniJava.g:6607:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMiniJava.g:6613:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6617:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalMiniJava.g:6618:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalMiniJava.g:6618:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalMiniJava.g:6619:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }
            // InternalMiniJava.g:6620:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalMiniJava.g:6620:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMiniJava.g:6629:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6633:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMiniJava.g:6634:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_61);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMiniJava.g:6641:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6645:1: ( ( () ) )
            // InternalMiniJava.g:6646:1: ( () )
            {
            // InternalMiniJava.g:6646:1: ( () )
            // InternalMiniJava.g:6647:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNegAction_2_0()); 
            }
            // InternalMiniJava.g:6648:2: ()
            // InternalMiniJava.g:6648:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNegAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMiniJava.g:6656:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6660:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMiniJava.g:6661:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMiniJava.g:6668:1: rule__Primary__Group_2__1__Impl : ( ( '-' ) ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6672:1: ( ( ( '-' ) ) )
            // InternalMiniJava.g:6673:1: ( ( '-' ) )
            {
            // InternalMiniJava.g:6673:1: ( ( '-' ) )
            // InternalMiniJava.g:6674:2: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }
            // InternalMiniJava.g:6675:2: ( '-' )
            // InternalMiniJava.g:6675:3: '-'
            {
            match(input,54,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMiniJava.g:6683:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6687:1: ( rule__Primary__Group_2__2__Impl )
            // InternalMiniJava.g:6688:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMiniJava.g:6694:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6698:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalMiniJava.g:6699:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalMiniJava.g:6699:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalMiniJava.g:6700:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }
            // InternalMiniJava.g:6701:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalMiniJava.g:6701:3: rule__Primary__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__0"
    // InternalMiniJava.g:6710:1: rule__SelectionExpression__Group__0 : rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 ;
    public final void rule__SelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6714:1: ( rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 )
            // InternalMiniJava.g:6715:2: rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__0"


    // $ANTLR start "rule__SelectionExpression__Group__0__Impl"
    // InternalMiniJava.g:6722:1: rule__SelectionExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__SelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6726:1: ( ( ruleTerminalExpression ) )
            // InternalMiniJava.g:6727:1: ( ruleTerminalExpression )
            {
            // InternalMiniJava.g:6727:1: ( ruleTerminalExpression )
            // InternalMiniJava.g:6728:2: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__1"
    // InternalMiniJava.g:6737:1: rule__SelectionExpression__Group__1 : rule__SelectionExpression__Group__1__Impl ;
    public final void rule__SelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6741:1: ( rule__SelectionExpression__Group__1__Impl )
            // InternalMiniJava.g:6742:2: rule__SelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__1"


    // $ANTLR start "rule__SelectionExpression__Group__1__Impl"
    // InternalMiniJava.g:6748:1: rule__SelectionExpression__Group__1__Impl : ( ( rule__SelectionExpression__Alternatives_1 )* ) ;
    public final void rule__SelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6752:1: ( ( ( rule__SelectionExpression__Alternatives_1 )* ) )
            // InternalMiniJava.g:6753:1: ( ( rule__SelectionExpression__Alternatives_1 )* )
            {
            // InternalMiniJava.g:6753:1: ( ( rule__SelectionExpression__Alternatives_1 )* )
            // InternalMiniJava.g:6754:2: ( rule__SelectionExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getAlternatives_1()); 
            }
            // InternalMiniJava.g:6755:2: ( rule__SelectionExpression__Alternatives_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==19) ) {
                    int LA52_2 = input.LA(2);

                    if ( (LA52_2==RULE_ID) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalMiniJava.g:6755:3: rule__SelectionExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SelectionExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__0"
    // InternalMiniJava.g:6764:1: rule__SelectionExpression__Group_1_0__0 : rule__SelectionExpression__Group_1_0__0__Impl rule__SelectionExpression__Group_1_0__1 ;
    public final void rule__SelectionExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6768:1: ( rule__SelectionExpression__Group_1_0__0__Impl rule__SelectionExpression__Group_1_0__1 )
            // InternalMiniJava.g:6769:2: rule__SelectionExpression__Group_1_0__0__Impl rule__SelectionExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_0__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__0__Impl"
    // InternalMiniJava.g:6776:1: rule__SelectionExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__SelectionExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6780:1: ( ( () ) )
            // InternalMiniJava.g:6781:1: ( () )
            {
            // InternalMiniJava.g:6781:1: ( () )
            // InternalMiniJava.g:6782:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldAccessReceiverAction_1_0_0()); 
            }
            // InternalMiniJava.g:6783:2: ()
            // InternalMiniJava.g:6783:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldAccessReceiverAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__1"
    // InternalMiniJava.g:6791:1: rule__SelectionExpression__Group_1_0__1 : rule__SelectionExpression__Group_1_0__1__Impl rule__SelectionExpression__Group_1_0__2 ;
    public final void rule__SelectionExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6795:1: ( rule__SelectionExpression__Group_1_0__1__Impl rule__SelectionExpression__Group_1_0__2 )
            // InternalMiniJava.g:6796:2: rule__SelectionExpression__Group_1_0__1__Impl rule__SelectionExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectionExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_0__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__1__Impl"
    // InternalMiniJava.g:6803:1: rule__SelectionExpression__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__SelectionExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6807:1: ( ( '.' ) )
            // InternalMiniJava.g:6808:1: ( '.' )
            {
            // InternalMiniJava.g:6808:1: ( '.' )
            // InternalMiniJava.g:6809:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__2"
    // InternalMiniJava.g:6818:1: rule__SelectionExpression__Group_1_0__2 : rule__SelectionExpression__Group_1_0__2__Impl ;
    public final void rule__SelectionExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6822:1: ( rule__SelectionExpression__Group_1_0__2__Impl )
            // InternalMiniJava.g:6823:2: rule__SelectionExpression__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_0__2"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__2__Impl"
    // InternalMiniJava.g:6829:1: rule__SelectionExpression__Group_1_0__2__Impl : ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) ) ;
    public final void rule__SelectionExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6833:1: ( ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) ) )
            // InternalMiniJava.g:6834:1: ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) )
            {
            // InternalMiniJava.g:6834:1: ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) )
            // InternalMiniJava.g:6835:2: ( rule__SelectionExpression__FieldAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldAssignment_1_0_2()); 
            }
            // InternalMiniJava.g:6836:2: ( rule__SelectionExpression__FieldAssignment_1_0_2 )
            // InternalMiniJava.g:6836:3: rule__SelectionExpression__FieldAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__FieldAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__0"
    // InternalMiniJava.g:6845:1: rule__SelectionExpression__Group_1_1__0 : rule__SelectionExpression__Group_1_1__0__Impl rule__SelectionExpression__Group_1_1__1 ;
    public final void rule__SelectionExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6849:1: ( rule__SelectionExpression__Group_1_1__0__Impl rule__SelectionExpression__Group_1_1__1 )
            // InternalMiniJava.g:6850:2: rule__SelectionExpression__Group_1_1__0__Impl rule__SelectionExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__0__Impl"
    // InternalMiniJava.g:6857:1: rule__SelectionExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__SelectionExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6861:1: ( ( () ) )
            // InternalMiniJava.g:6862:1: ( () )
            {
            // InternalMiniJava.g:6862:1: ( () )
            // InternalMiniJava.g:6863:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodCallReceiverAction_1_1_0()); 
            }
            // InternalMiniJava.g:6864:2: ()
            // InternalMiniJava.g:6864:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodCallReceiverAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__1"
    // InternalMiniJava.g:6872:1: rule__SelectionExpression__Group_1_1__1 : rule__SelectionExpression__Group_1_1__1__Impl rule__SelectionExpression__Group_1_1__2 ;
    public final void rule__SelectionExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6876:1: ( rule__SelectionExpression__Group_1_1__1__Impl rule__SelectionExpression__Group_1_1__2 )
            // InternalMiniJava.g:6877:2: rule__SelectionExpression__Group_1_1__1__Impl rule__SelectionExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectionExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__1__Impl"
    // InternalMiniJava.g:6884:1: rule__SelectionExpression__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__SelectionExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6888:1: ( ( '.' ) )
            // InternalMiniJava.g:6889:1: ( '.' )
            {
            // InternalMiniJava.g:6889:1: ( '.' )
            // InternalMiniJava.g:6890:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__2"
    // InternalMiniJava.g:6899:1: rule__SelectionExpression__Group_1_1__2 : rule__SelectionExpression__Group_1_1__2__Impl rule__SelectionExpression__Group_1_1__3 ;
    public final void rule__SelectionExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6903:1: ( rule__SelectionExpression__Group_1_1__2__Impl rule__SelectionExpression__Group_1_1__3 )
            // InternalMiniJava.g:6904:2: rule__SelectionExpression__Group_1_1__2__Impl rule__SelectionExpression__Group_1_1__3
            {
            pushFollow(FOLLOW_31);
            rule__SelectionExpression__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__2"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__2__Impl"
    // InternalMiniJava.g:6911:1: rule__SelectionExpression__Group_1_1__2__Impl : ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) ) ;
    public final void rule__SelectionExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6915:1: ( ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) ) )
            // InternalMiniJava.g:6916:1: ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) )
            {
            // InternalMiniJava.g:6916:1: ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) )
            // InternalMiniJava.g:6917:2: ( rule__SelectionExpression__MethodAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodAssignment_1_1_2()); 
            }
            // InternalMiniJava.g:6918:2: ( rule__SelectionExpression__MethodAssignment_1_1_2 )
            // InternalMiniJava.g:6918:3: rule__SelectionExpression__MethodAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__MethodAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__3"
    // InternalMiniJava.g:6926:1: rule__SelectionExpression__Group_1_1__3 : rule__SelectionExpression__Group_1_1__3__Impl rule__SelectionExpression__Group_1_1__4 ;
    public final void rule__SelectionExpression__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6930:1: ( rule__SelectionExpression__Group_1_1__3__Impl rule__SelectionExpression__Group_1_1__4 )
            // InternalMiniJava.g:6931:2: rule__SelectionExpression__Group_1_1__3__Impl rule__SelectionExpression__Group_1_1__4
            {
            pushFollow(FOLLOW_62);
            rule__SelectionExpression__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__3"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__3__Impl"
    // InternalMiniJava.g:6938:1: rule__SelectionExpression__Group_1_1__3__Impl : ( '(' ) ;
    public final void rule__SelectionExpression__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6942:1: ( ( '(' ) )
            // InternalMiniJava.g:6943:1: ( '(' )
            {
            // InternalMiniJava.g:6943:1: ( '(' )
            // InternalMiniJava.g:6944:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getLeftParenthesisKeyword_1_1_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getLeftParenthesisKeyword_1_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__3__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__4"
    // InternalMiniJava.g:6953:1: rule__SelectionExpression__Group_1_1__4 : rule__SelectionExpression__Group_1_1__4__Impl rule__SelectionExpression__Group_1_1__5 ;
    public final void rule__SelectionExpression__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6957:1: ( rule__SelectionExpression__Group_1_1__4__Impl rule__SelectionExpression__Group_1_1__5 )
            // InternalMiniJava.g:6958:2: rule__SelectionExpression__Group_1_1__4__Impl rule__SelectionExpression__Group_1_1__5
            {
            pushFollow(FOLLOW_62);
            rule__SelectionExpression__Group_1_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__4"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__4__Impl"
    // InternalMiniJava.g:6965:1: rule__SelectionExpression__Group_1_1__4__Impl : ( ( rule__SelectionExpression__Group_1_1_4__0 )? ) ;
    public final void rule__SelectionExpression__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6969:1: ( ( ( rule__SelectionExpression__Group_1_1_4__0 )? ) )
            // InternalMiniJava.g:6970:1: ( ( rule__SelectionExpression__Group_1_1_4__0 )? )
            {
            // InternalMiniJava.g:6970:1: ( ( rule__SelectionExpression__Group_1_1_4__0 )? )
            // InternalMiniJava.g:6971:2: ( rule__SelectionExpression__Group_1_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4()); 
            }
            // InternalMiniJava.g:6972:2: ( rule__SelectionExpression__Group_1_1_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_INT)||(LA53_0>=12 && LA53_0<=13)||LA53_0==28||LA53_0==54||(LA53_0>=58 && LA53_0<=62)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMiniJava.g:6972:3: rule__SelectionExpression__Group_1_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__4__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__5"
    // InternalMiniJava.g:6980:1: rule__SelectionExpression__Group_1_1__5 : rule__SelectionExpression__Group_1_1__5__Impl ;
    public final void rule__SelectionExpression__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6984:1: ( rule__SelectionExpression__Group_1_1__5__Impl )
            // InternalMiniJava.g:6985:2: rule__SelectionExpression__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__5"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__5__Impl"
    // InternalMiniJava.g:6991:1: rule__SelectionExpression__Group_1_1__5__Impl : ( ')' ) ;
    public final void rule__SelectionExpression__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6995:1: ( ( ')' ) )
            // InternalMiniJava.g:6996:1: ( ')' )
            {
            // InternalMiniJava.g:6996:1: ( ')' )
            // InternalMiniJava.g:6997:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_1_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__5__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__0"
    // InternalMiniJava.g:7007:1: rule__SelectionExpression__Group_1_1_4__0 : rule__SelectionExpression__Group_1_1_4__0__Impl rule__SelectionExpression__Group_1_1_4__1 ;
    public final void rule__SelectionExpression__Group_1_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7011:1: ( rule__SelectionExpression__Group_1_1_4__0__Impl rule__SelectionExpression__Group_1_1_4__1 )
            // InternalMiniJava.g:7012:2: rule__SelectionExpression__Group_1_1_4__0__Impl rule__SelectionExpression__Group_1_1_4__1
            {
            pushFollow(FOLLOW_15);
            rule__SelectionExpression__Group_1_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__0__Impl"
    // InternalMiniJava.g:7019:1: rule__SelectionExpression__Group_1_1_4__0__Impl : ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) ) ;
    public final void rule__SelectionExpression__Group_1_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7023:1: ( ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) ) )
            // InternalMiniJava.g:7024:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) )
            {
            // InternalMiniJava.g:7024:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) )
            // InternalMiniJava.g:7025:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_0()); 
            }
            // InternalMiniJava.g:7026:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 )
            // InternalMiniJava.g:7026:3: rule__SelectionExpression__ArgsAssignment_1_1_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__ArgsAssignment_1_1_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__1"
    // InternalMiniJava.g:7034:1: rule__SelectionExpression__Group_1_1_4__1 : rule__SelectionExpression__Group_1_1_4__1__Impl ;
    public final void rule__SelectionExpression__Group_1_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7038:1: ( rule__SelectionExpression__Group_1_1_4__1__Impl )
            // InternalMiniJava.g:7039:2: rule__SelectionExpression__Group_1_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__1__Impl"
    // InternalMiniJava.g:7045:1: rule__SelectionExpression__Group_1_1_4__1__Impl : ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* ) ;
    public final void rule__SelectionExpression__Group_1_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7049:1: ( ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* ) )
            // InternalMiniJava.g:7050:1: ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* )
            {
            // InternalMiniJava.g:7050:1: ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* )
            // InternalMiniJava.g:7051:2: ( rule__SelectionExpression__Group_1_1_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4_1()); 
            }
            // InternalMiniJava.g:7052:2: ( rule__SelectionExpression__Group_1_1_4_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==26) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMiniJava.g:7052:3: rule__SelectionExpression__Group_1_1_4_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SelectionExpression__Group_1_1_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__0"
    // InternalMiniJava.g:7061:1: rule__SelectionExpression__Group_1_1_4_1__0 : rule__SelectionExpression__Group_1_1_4_1__0__Impl rule__SelectionExpression__Group_1_1_4_1__1 ;
    public final void rule__SelectionExpression__Group_1_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7065:1: ( rule__SelectionExpression__Group_1_1_4_1__0__Impl rule__SelectionExpression__Group_1_1_4_1__1 )
            // InternalMiniJava.g:7066:2: rule__SelectionExpression__Group_1_1_4_1__0__Impl rule__SelectionExpression__Group_1_1_4_1__1
            {
            pushFollow(FOLLOW_25);
            rule__SelectionExpression__Group_1_1_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__0__Impl"
    // InternalMiniJava.g:7073:1: rule__SelectionExpression__Group_1_1_4_1__0__Impl : ( ',' ) ;
    public final void rule__SelectionExpression__Group_1_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7077:1: ( ( ',' ) )
            // InternalMiniJava.g:7078:1: ( ',' )
            {
            // InternalMiniJava.g:7078:1: ( ',' )
            // InternalMiniJava.g:7079:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_1_4_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_1_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__1"
    // InternalMiniJava.g:7088:1: rule__SelectionExpression__Group_1_1_4_1__1 : rule__SelectionExpression__Group_1_1_4_1__1__Impl ;
    public final void rule__SelectionExpression__Group_1_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7092:1: ( rule__SelectionExpression__Group_1_1_4_1__1__Impl )
            // InternalMiniJava.g:7093:2: rule__SelectionExpression__Group_1_1_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__1__Impl"
    // InternalMiniJava.g:7099:1: rule__SelectionExpression__Group_1_1_4_1__1__Impl : ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) ) ;
    public final void rule__SelectionExpression__Group_1_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7103:1: ( ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) ) )
            // InternalMiniJava.g:7104:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) )
            {
            // InternalMiniJava.g:7104:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) )
            // InternalMiniJava.g:7105:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_1_1()); 
            }
            // InternalMiniJava.g:7106:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 )
            // InternalMiniJava.g:7106:3: rule__SelectionExpression__ArgsAssignment_1_1_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__ArgsAssignment_1_1_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalMiniJava.g:7115:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7119:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalMiniJava.g:7120:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_63);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalMiniJava.g:7127:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7131:1: ( ( () ) )
            // InternalMiniJava.g:7132:1: ( () )
            {
            // InternalMiniJava.g:7132:1: ( () )
            // InternalMiniJava.g:7133:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_0_0()); 
            }
            // InternalMiniJava.g:7134:2: ()
            // InternalMiniJava.g:7134:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalMiniJava.g:7142:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7146:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalMiniJava.g:7147:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalMiniJava.g:7153:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7157:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalMiniJava.g:7158:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalMiniJava.g:7158:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalMiniJava.g:7159:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalMiniJava.g:7160:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalMiniJava.g:7160:3: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalMiniJava.g:7169:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7173:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalMiniJava.g:7174:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_64);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalMiniJava.g:7181:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7185:1: ( ( () ) )
            // InternalMiniJava.g:7186:1: ( () )
            {
            // InternalMiniJava.g:7186:1: ( () )
            // InternalMiniJava.g:7187:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_1_0()); 
            }
            // InternalMiniJava.g:7188:2: ()
            // InternalMiniJava.g:7188:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalMiniJava.g:7196:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7200:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalMiniJava.g:7201:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalMiniJava.g:7207:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7211:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalMiniJava.g:7212:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalMiniJava.g:7212:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalMiniJava.g:7213:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalMiniJava.g:7214:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalMiniJava.g:7214:3: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalMiniJava.g:7223:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7227:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalMiniJava.g:7228:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_65);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalMiniJava.g:7235:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7239:1: ( ( () ) )
            // InternalMiniJava.g:7240:1: ( () )
            {
            // InternalMiniJava.g:7240:1: ( () )
            // InternalMiniJava.g:7241:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }
            // InternalMiniJava.g:7242:2: ()
            // InternalMiniJava.g:7242:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalMiniJava.g:7250:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7254:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalMiniJava.g:7255:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalMiniJava.g:7261:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7265:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalMiniJava.g:7266:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalMiniJava.g:7266:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalMiniJava.g:7267:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalMiniJava.g:7268:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalMiniJava.g:7268:3: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__0"
    // InternalMiniJava.g:7277:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7281:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalMiniJava.g:7282:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_66);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0"


    // $ANTLR start "rule__TerminalExpression__Group_3__0__Impl"
    // InternalMiniJava.g:7289:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7293:1: ( ( () ) )
            // InternalMiniJava.g:7294:1: ( () )
            {
            // InternalMiniJava.g:7294:1: ( () )
            // InternalMiniJava.g:7295:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisAction_3_0()); 
            }
            // InternalMiniJava.g:7296:2: ()
            // InternalMiniJava.g:7296:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getThisAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__1"
    // InternalMiniJava.g:7304:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7308:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalMiniJava.g:7309:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1"


    // $ANTLR start "rule__TerminalExpression__Group_3__1__Impl"
    // InternalMiniJava.g:7315:1: rule__TerminalExpression__Group_3__1__Impl : ( 'this' ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7319:1: ( ( 'this' ) )
            // InternalMiniJava.g:7320:1: ( 'this' )
            {
            // InternalMiniJava.g:7320:1: ( 'this' )
            // InternalMiniJava.g:7321:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__0"
    // InternalMiniJava.g:7331:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7335:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalMiniJava.g:7336:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_67);
            rule__TerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_4__0__Impl"
    // InternalMiniJava.g:7343:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7347:1: ( ( () ) )
            // InternalMiniJava.g:7348:1: ( () )
            {
            // InternalMiniJava.g:7348:1: ( () )
            // InternalMiniJava.g:7349:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSuperAction_4_0()); 
            }
            // InternalMiniJava.g:7350:2: ()
            // InternalMiniJava.g:7350:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSuperAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__1"
    // InternalMiniJava.g:7358:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7362:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // InternalMiniJava.g:7363:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_4__1__Impl"
    // InternalMiniJava.g:7369:1: rule__TerminalExpression__Group_4__1__Impl : ( 'super' ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7373:1: ( ( 'super' ) )
            // InternalMiniJava.g:7374:1: ( 'super' )
            {
            // InternalMiniJava.g:7374:1: ( 'super' )
            // InternalMiniJava.g:7375:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__0"
    // InternalMiniJava.g:7385:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7389:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalMiniJava.g:7390:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_68);
            rule__TerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0"


    // $ANTLR start "rule__TerminalExpression__Group_5__0__Impl"
    // InternalMiniJava.g:7397:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7401:1: ( ( () ) )
            // InternalMiniJava.g:7402:1: ( () )
            {
            // InternalMiniJava.g:7402:1: ( () )
            // InternalMiniJava.g:7403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullAction_5_0()); 
            }
            // InternalMiniJava.g:7404:2: ()
            // InternalMiniJava.g:7404:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNullAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__1"
    // InternalMiniJava.g:7412:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7416:1: ( rule__TerminalExpression__Group_5__1__Impl )
            // InternalMiniJava.g:7417:2: rule__TerminalExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1"


    // $ANTLR start "rule__TerminalExpression__Group_5__1__Impl"
    // InternalMiniJava.g:7423:1: rule__TerminalExpression__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7427:1: ( ( 'null' ) )
            // InternalMiniJava.g:7428:1: ( 'null' )
            {
            // InternalMiniJava.g:7428:1: ( 'null' )
            // InternalMiniJava.g:7429:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__0"
    // InternalMiniJava.g:7439:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7443:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalMiniJava.g:7444:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_69);
            rule__TerminalExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0"


    // $ANTLR start "rule__TerminalExpression__Group_6__0__Impl"
    // InternalMiniJava.g:7451:1: rule__TerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7455:1: ( ( () ) )
            // InternalMiniJava.g:7456:1: ( () )
            {
            // InternalMiniJava.g:7456:1: ( () )
            // InternalMiniJava.g:7457:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewObjectAction_6_0()); 
            }
            // InternalMiniJava.g:7458:2: ()
            // InternalMiniJava.g:7458:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewObjectAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__1"
    // InternalMiniJava.g:7466:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7470:1: ( rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 )
            // InternalMiniJava.g:7471:2: rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2
            {
            pushFollow(FOLLOW_6);
            rule__TerminalExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1"


    // $ANTLR start "rule__TerminalExpression__Group_6__1__Impl"
    // InternalMiniJava.g:7478:1: rule__TerminalExpression__Group_6__1__Impl : ( 'new' ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7482:1: ( ( 'new' ) )
            // InternalMiniJava.g:7483:1: ( 'new' )
            {
            // InternalMiniJava.g:7483:1: ( 'new' )
            // InternalMiniJava.g:7484:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewKeyword_6_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__2"
    // InternalMiniJava.g:7493:1: rule__TerminalExpression__Group_6__2 : rule__TerminalExpression__Group_6__2__Impl rule__TerminalExpression__Group_6__3 ;
    public final void rule__TerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7497:1: ( rule__TerminalExpression__Group_6__2__Impl rule__TerminalExpression__Group_6__3 )
            // InternalMiniJava.g:7498:2: rule__TerminalExpression__Group_6__2__Impl rule__TerminalExpression__Group_6__3
            {
            pushFollow(FOLLOW_31);
            rule__TerminalExpression__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__2"


    // $ANTLR start "rule__TerminalExpression__Group_6__2__Impl"
    // InternalMiniJava.g:7505:1: rule__TerminalExpression__Group_6__2__Impl : ( ( rule__TerminalExpression__TypeAssignment_6_2 ) ) ;
    public final void rule__TerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7509:1: ( ( ( rule__TerminalExpression__TypeAssignment_6_2 ) ) )
            // InternalMiniJava.g:7510:1: ( ( rule__TerminalExpression__TypeAssignment_6_2 ) )
            {
            // InternalMiniJava.g:7510:1: ( ( rule__TerminalExpression__TypeAssignment_6_2 ) )
            // InternalMiniJava.g:7511:2: ( rule__TerminalExpression__TypeAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_6_2()); 
            }
            // InternalMiniJava.g:7512:2: ( rule__TerminalExpression__TypeAssignment_6_2 )
            // InternalMiniJava.g:7512:3: rule__TerminalExpression__TypeAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__TypeAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__3"
    // InternalMiniJava.g:7520:1: rule__TerminalExpression__Group_6__3 : rule__TerminalExpression__Group_6__3__Impl rule__TerminalExpression__Group_6__4 ;
    public final void rule__TerminalExpression__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7524:1: ( rule__TerminalExpression__Group_6__3__Impl rule__TerminalExpression__Group_6__4 )
            // InternalMiniJava.g:7525:2: rule__TerminalExpression__Group_6__3__Impl rule__TerminalExpression__Group_6__4
            {
            pushFollow(FOLLOW_62);
            rule__TerminalExpression__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__3"


    // $ANTLR start "rule__TerminalExpression__Group_6__3__Impl"
    // InternalMiniJava.g:7532:1: rule__TerminalExpression__Group_6__3__Impl : ( ( '(' ) ) ;
    public final void rule__TerminalExpression__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7536:1: ( ( ( '(' ) ) )
            // InternalMiniJava.g:7537:1: ( ( '(' ) )
            {
            // InternalMiniJava.g:7537:1: ( ( '(' ) )
            // InternalMiniJava.g:7538:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_3()); 
            }
            // InternalMiniJava.g:7539:2: ( '(' )
            // InternalMiniJava.g:7539:3: '('
            {
            match(input,28,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__4"
    // InternalMiniJava.g:7547:1: rule__TerminalExpression__Group_6__4 : rule__TerminalExpression__Group_6__4__Impl rule__TerminalExpression__Group_6__5 ;
    public final void rule__TerminalExpression__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7551:1: ( rule__TerminalExpression__Group_6__4__Impl rule__TerminalExpression__Group_6__5 )
            // InternalMiniJava.g:7552:2: rule__TerminalExpression__Group_6__4__Impl rule__TerminalExpression__Group_6__5
            {
            pushFollow(FOLLOW_62);
            rule__TerminalExpression__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__4"


    // $ANTLR start "rule__TerminalExpression__Group_6__4__Impl"
    // InternalMiniJava.g:7559:1: rule__TerminalExpression__Group_6__4__Impl : ( ( rule__TerminalExpression__Group_6_4__0 )? ) ;
    public final void rule__TerminalExpression__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7563:1: ( ( ( rule__TerminalExpression__Group_6_4__0 )? ) )
            // InternalMiniJava.g:7564:1: ( ( rule__TerminalExpression__Group_6_4__0 )? )
            {
            // InternalMiniJava.g:7564:1: ( ( rule__TerminalExpression__Group_6_4__0 )? )
            // InternalMiniJava.g:7565:2: ( rule__TerminalExpression__Group_6_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getGroup_6_4()); 
            }
            // InternalMiniJava.g:7566:2: ( rule__TerminalExpression__Group_6_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_INT)||(LA55_0>=12 && LA55_0<=13)||LA55_0==28||LA55_0==54||(LA55_0>=58 && LA55_0<=62)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMiniJava.g:7566:3: rule__TerminalExpression__Group_6_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getGroup_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__4__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__5"
    // InternalMiniJava.g:7574:1: rule__TerminalExpression__Group_6__5 : rule__TerminalExpression__Group_6__5__Impl ;
    public final void rule__TerminalExpression__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7578:1: ( rule__TerminalExpression__Group_6__5__Impl )
            // InternalMiniJava.g:7579:2: rule__TerminalExpression__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__5"


    // $ANTLR start "rule__TerminalExpression__Group_6__5__Impl"
    // InternalMiniJava.g:7585:1: rule__TerminalExpression__Group_6__5__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7589:1: ( ( ')' ) )
            // InternalMiniJava.g:7590:1: ( ')' )
            {
            // InternalMiniJava.g:7590:1: ( ')' )
            // InternalMiniJava.g:7591:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__5__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6_4__0"
    // InternalMiniJava.g:7601:1: rule__TerminalExpression__Group_6_4__0 : rule__TerminalExpression__Group_6_4__0__Impl rule__TerminalExpression__Group_6_4__1 ;
    public final void rule__TerminalExpression__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7605:1: ( rule__TerminalExpression__Group_6_4__0__Impl rule__TerminalExpression__Group_6_4__1 )
            // InternalMiniJava.g:7606:2: rule__TerminalExpression__Group_6_4__0__Impl rule__TerminalExpression__Group_6_4__1
            {
            pushFollow(FOLLOW_15);
            rule__TerminalExpression__Group_6_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_6_4__0__Impl"
    // InternalMiniJava.g:7613:1: rule__TerminalExpression__Group_6_4__0__Impl : ( ( rule__TerminalExpression__ArgsAssignment_6_4_0 ) ) ;
    public final void rule__TerminalExpression__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7617:1: ( ( ( rule__TerminalExpression__ArgsAssignment_6_4_0 ) ) )
            // InternalMiniJava.g:7618:1: ( ( rule__TerminalExpression__ArgsAssignment_6_4_0 ) )
            {
            // InternalMiniJava.g:7618:1: ( ( rule__TerminalExpression__ArgsAssignment_6_4_0 ) )
            // InternalMiniJava.g:7619:2: ( rule__TerminalExpression__ArgsAssignment_6_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_6_4_0()); 
            }
            // InternalMiniJava.g:7620:2: ( rule__TerminalExpression__ArgsAssignment_6_4_0 )
            // InternalMiniJava.g:7620:3: rule__TerminalExpression__ArgsAssignment_6_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ArgsAssignment_6_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_6_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6_4__1"
    // InternalMiniJava.g:7628:1: rule__TerminalExpression__Group_6_4__1 : rule__TerminalExpression__Group_6_4__1__Impl ;
    public final void rule__TerminalExpression__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7632:1: ( rule__TerminalExpression__Group_6_4__1__Impl )
            // InternalMiniJava.g:7633:2: rule__TerminalExpression__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_6_4__1__Impl"
    // InternalMiniJava.g:7639:1: rule__TerminalExpression__Group_6_4__1__Impl : ( ( rule__TerminalExpression__Group_6_4_1__0 )* ) ;
    public final void rule__TerminalExpression__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7643:1: ( ( ( rule__TerminalExpression__Group_6_4_1__0 )* ) )
            // InternalMiniJava.g:7644:1: ( ( rule__TerminalExpression__Group_6_4_1__0 )* )
            {
            // InternalMiniJava.g:7644:1: ( ( rule__TerminalExpression__Group_6_4_1__0 )* )
            // InternalMiniJava.g:7645:2: ( rule__TerminalExpression__Group_6_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getGroup_6_4_1()); 
            }
            // InternalMiniJava.g:7646:2: ( rule__TerminalExpression__Group_6_4_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==26) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMiniJava.g:7646:3: rule__TerminalExpression__Group_6_4_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TerminalExpression__Group_6_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getGroup_6_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6_4_1__0"
    // InternalMiniJava.g:7655:1: rule__TerminalExpression__Group_6_4_1__0 : rule__TerminalExpression__Group_6_4_1__0__Impl rule__TerminalExpression__Group_6_4_1__1 ;
    public final void rule__TerminalExpression__Group_6_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7659:1: ( rule__TerminalExpression__Group_6_4_1__0__Impl rule__TerminalExpression__Group_6_4_1__1 )
            // InternalMiniJava.g:7660:2: rule__TerminalExpression__Group_6_4_1__0__Impl rule__TerminalExpression__Group_6_4_1__1
            {
            pushFollow(FOLLOW_25);
            rule__TerminalExpression__Group_6_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_6_4_1__0__Impl"
    // InternalMiniJava.g:7667:1: rule__TerminalExpression__Group_6_4_1__0__Impl : ( ',' ) ;
    public final void rule__TerminalExpression__Group_6_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7671:1: ( ( ',' ) )
            // InternalMiniJava.g:7672:1: ( ',' )
            {
            // InternalMiniJava.g:7672:1: ( ',' )
            // InternalMiniJava.g:7673:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_6_4_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_6_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6_4_1__1"
    // InternalMiniJava.g:7682:1: rule__TerminalExpression__Group_6_4_1__1 : rule__TerminalExpression__Group_6_4_1__1__Impl ;
    public final void rule__TerminalExpression__Group_6_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7686:1: ( rule__TerminalExpression__Group_6_4_1__1__Impl )
            // InternalMiniJava.g:7687:2: rule__TerminalExpression__Group_6_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_6_4_1__1__Impl"
    // InternalMiniJava.g:7693:1: rule__TerminalExpression__Group_6_4_1__1__Impl : ( ( rule__TerminalExpression__ArgsAssignment_6_4_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_6_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7697:1: ( ( ( rule__TerminalExpression__ArgsAssignment_6_4_1_1 ) ) )
            // InternalMiniJava.g:7698:1: ( ( rule__TerminalExpression__ArgsAssignment_6_4_1_1 ) )
            {
            // InternalMiniJava.g:7698:1: ( ( rule__TerminalExpression__ArgsAssignment_6_4_1_1 ) )
            // InternalMiniJava.g:7699:2: ( rule__TerminalExpression__ArgsAssignment_6_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_6_4_1_1()); 
            }
            // InternalMiniJava.g:7700:2: ( rule__TerminalExpression__ArgsAssignment_6_4_1_1 )
            // InternalMiniJava.g:7700:3: rule__TerminalExpression__ArgsAssignment_6_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ArgsAssignment_6_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_6_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6_4_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__0"
    // InternalMiniJava.g:7709:1: rule__TerminalExpression__Group_7__0 : rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 ;
    public final void rule__TerminalExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7713:1: ( rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 )
            // InternalMiniJava.g:7714:2: rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1
            {
            pushFollow(FOLLOW_69);
            rule__TerminalExpression__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__0"


    // $ANTLR start "rule__TerminalExpression__Group_7__0__Impl"
    // InternalMiniJava.g:7721:1: rule__TerminalExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7725:1: ( ( () ) )
            // InternalMiniJava.g:7726:1: ( () )
            {
            // InternalMiniJava.g:7726:1: ( () )
            // InternalMiniJava.g:7727:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewArrayAction_7_0()); 
            }
            // InternalMiniJava.g:7728:2: ()
            // InternalMiniJava.g:7728:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewArrayAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__1"
    // InternalMiniJava.g:7736:1: rule__TerminalExpression__Group_7__1 : rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 ;
    public final void rule__TerminalExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7740:1: ( rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 )
            // InternalMiniJava.g:7741:2: rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2
            {
            pushFollow(FOLLOW_23);
            rule__TerminalExpression__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__1"


    // $ANTLR start "rule__TerminalExpression__Group_7__1__Impl"
    // InternalMiniJava.g:7748:1: rule__TerminalExpression__Group_7__1__Impl : ( 'new' ) ;
    public final void rule__TerminalExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7752:1: ( ( 'new' ) )
            // InternalMiniJava.g:7753:1: ( 'new' )
            {
            // InternalMiniJava.g:7753:1: ( 'new' )
            // InternalMiniJava.g:7754:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__2"
    // InternalMiniJava.g:7763:1: rule__TerminalExpression__Group_7__2 : rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3 ;
    public final void rule__TerminalExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7767:1: ( rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3 )
            // InternalMiniJava.g:7768:2: rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3
            {
            pushFollow(FOLLOW_35);
            rule__TerminalExpression__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__2"


    // $ANTLR start "rule__TerminalExpression__Group_7__2__Impl"
    // InternalMiniJava.g:7775:1: rule__TerminalExpression__Group_7__2__Impl : ( ( rule__TerminalExpression__TypeAssignment_7_2 ) ) ;
    public final void rule__TerminalExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7779:1: ( ( ( rule__TerminalExpression__TypeAssignment_7_2 ) ) )
            // InternalMiniJava.g:7780:1: ( ( rule__TerminalExpression__TypeAssignment_7_2 ) )
            {
            // InternalMiniJava.g:7780:1: ( ( rule__TerminalExpression__TypeAssignment_7_2 ) )
            // InternalMiniJava.g:7781:2: ( rule__TerminalExpression__TypeAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }
            // InternalMiniJava.g:7782:2: ( rule__TerminalExpression__TypeAssignment_7_2 )
            // InternalMiniJava.g:7782:3: rule__TerminalExpression__TypeAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__TypeAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__3"
    // InternalMiniJava.g:7790:1: rule__TerminalExpression__Group_7__3 : rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4 ;
    public final void rule__TerminalExpression__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7794:1: ( rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4 )
            // InternalMiniJava.g:7795:2: rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4
            {
            pushFollow(FOLLOW_25);
            rule__TerminalExpression__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__3"


    // $ANTLR start "rule__TerminalExpression__Group_7__3__Impl"
    // InternalMiniJava.g:7802:1: rule__TerminalExpression__Group_7__3__Impl : ( ( '[' ) ) ;
    public final void rule__TerminalExpression__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7806:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:7807:1: ( ( '[' ) )
            {
            // InternalMiniJava.g:7807:1: ( ( '[' ) )
            // InternalMiniJava.g:7808:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftSquareBracketKeyword_7_3()); 
            }
            // InternalMiniJava.g:7809:2: ( '[' )
            // InternalMiniJava.g:7809:3: '['
            {
            match(input,39,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftSquareBracketKeyword_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__4"
    // InternalMiniJava.g:7817:1: rule__TerminalExpression__Group_7__4 : rule__TerminalExpression__Group_7__4__Impl rule__TerminalExpression__Group_7__5 ;
    public final void rule__TerminalExpression__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7821:1: ( rule__TerminalExpression__Group_7__4__Impl rule__TerminalExpression__Group_7__5 )
            // InternalMiniJava.g:7822:2: rule__TerminalExpression__Group_7__4__Impl rule__TerminalExpression__Group_7__5
            {
            pushFollow(FOLLOW_36);
            rule__TerminalExpression__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__4"


    // $ANTLR start "rule__TerminalExpression__Group_7__4__Impl"
    // InternalMiniJava.g:7829:1: rule__TerminalExpression__Group_7__4__Impl : ( ( rule__TerminalExpression__SizeAssignment_7_4 ) ) ;
    public final void rule__TerminalExpression__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7833:1: ( ( ( rule__TerminalExpression__SizeAssignment_7_4 ) ) )
            // InternalMiniJava.g:7834:1: ( ( rule__TerminalExpression__SizeAssignment_7_4 ) )
            {
            // InternalMiniJava.g:7834:1: ( ( rule__TerminalExpression__SizeAssignment_7_4 ) )
            // InternalMiniJava.g:7835:2: ( rule__TerminalExpression__SizeAssignment_7_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSizeAssignment_7_4()); 
            }
            // InternalMiniJava.g:7836:2: ( rule__TerminalExpression__SizeAssignment_7_4 )
            // InternalMiniJava.g:7836:3: rule__TerminalExpression__SizeAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__SizeAssignment_7_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSizeAssignment_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__4__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__5"
    // InternalMiniJava.g:7844:1: rule__TerminalExpression__Group_7__5 : rule__TerminalExpression__Group_7__5__Impl ;
    public final void rule__TerminalExpression__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7848:1: ( rule__TerminalExpression__Group_7__5__Impl )
            // InternalMiniJava.g:7849:2: rule__TerminalExpression__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__5"


    // $ANTLR start "rule__TerminalExpression__Group_7__5__Impl"
    // InternalMiniJava.g:7855:1: rule__TerminalExpression__Group_7__5__Impl : ( ']' ) ;
    public final void rule__TerminalExpression__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7859:1: ( ( ']' ) )
            // InternalMiniJava.g:7860:1: ( ']' )
            {
            // InternalMiniJava.g:7860:1: ( ']' )
            // InternalMiniJava.g:7861:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightSquareBracketKeyword_7_5()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightSquareBracketKeyword_7_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__5__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__0"
    // InternalMiniJava.g:7871:1: rule__TerminalExpression__Group_8__0 : rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1 ;
    public final void rule__TerminalExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7875:1: ( rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1 )
            // InternalMiniJava.g:7876:2: rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1
            {
            pushFollow(FOLLOW_25);
            rule__TerminalExpression__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__0"


    // $ANTLR start "rule__TerminalExpression__Group_8__0__Impl"
    // InternalMiniJava.g:7883:1: rule__TerminalExpression__Group_8__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7887:1: ( ( () ) )
            // InternalMiniJava.g:7888:1: ( () )
            {
            // InternalMiniJava.g:7888:1: ( () )
            // InternalMiniJava.g:7889:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_8_0()); 
            }
            // InternalMiniJava.g:7890:2: ()
            // InternalMiniJava.g:7890:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__1"
    // InternalMiniJava.g:7898:1: rule__TerminalExpression__Group_8__1 : rule__TerminalExpression__Group_8__1__Impl ;
    public final void rule__TerminalExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7902:1: ( rule__TerminalExpression__Group_8__1__Impl )
            // InternalMiniJava.g:7903:2: rule__TerminalExpression__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__1"


    // $ANTLR start "rule__TerminalExpression__Group_8__1__Impl"
    // InternalMiniJava.g:7909:1: rule__TerminalExpression__Group_8__1__Impl : ( ( rule__TerminalExpression__SymbolAssignment_8_1 ) ) ;
    public final void rule__TerminalExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7913:1: ( ( ( rule__TerminalExpression__SymbolAssignment_8_1 ) ) )
            // InternalMiniJava.g:7914:1: ( ( rule__TerminalExpression__SymbolAssignment_8_1 ) )
            {
            // InternalMiniJava.g:7914:1: ( ( rule__TerminalExpression__SymbolAssignment_8_1 ) )
            // InternalMiniJava.g:7915:2: ( rule__TerminalExpression__SymbolAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_8_1()); 
            }
            // InternalMiniJava.g:7916:2: ( rule__TerminalExpression__SymbolAssignment_8_1 )
            // InternalMiniJava.g:7916:3: rule__TerminalExpression__SymbolAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__SymbolAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__1__Impl"


    // $ANTLR start "rule__Program__NameAssignment_0_1"
    // InternalMiniJava.g:7925:1: rule__Program__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Program__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7929:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:7930:2: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:7930:2: ( ruleQualifiedName )
            // InternalMiniJava.g:7931:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_0_1"


    // $ANTLR start "rule__Program__ImportsAssignment_1"
    // InternalMiniJava.g:7940:1: rule__Program__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Program__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7944:1: ( ( ruleImport ) )
            // InternalMiniJava.g:7945:2: ( ruleImport )
            {
            // InternalMiniJava.g:7945:2: ( ruleImport )
            // InternalMiniJava.g:7946:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ImportsAssignment_1"


    // $ANTLR start "rule__Program__ClassesAssignment_2"
    // InternalMiniJava.g:7955:1: rule__Program__ClassesAssignment_2 : ( ruleTypeDeclaration ) ;
    public final void rule__Program__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7959:1: ( ( ruleTypeDeclaration ) )
            // InternalMiniJava.g:7960:2: ( ruleTypeDeclaration )
            {
            // InternalMiniJava.g:7960:2: ( ruleTypeDeclaration )
            // InternalMiniJava.g:7961:3: ruleTypeDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesTypeDeclarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesTypeDeclarationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClassesAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMiniJava.g:7970:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7974:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMiniJava.g:7975:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMiniJava.g:7975:2: ( ruleQualifiedNameWithWildcard )
            // InternalMiniJava.g:7976:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Class__AccessLevelAssignment_0"
    // InternalMiniJava.g:7985:1: rule__Class__AccessLevelAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Class__AccessLevelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7989:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:7990:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:7990:2: ( ruleAccessLevel )
            // InternalMiniJava.g:7991:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AccessLevelAssignment_0"


    // $ANTLR start "rule__Class__AbstractAssignment_1"
    // InternalMiniJava.g:8000:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8004:1: ( ( ( 'abstract' ) ) )
            // InternalMiniJava.g:8005:2: ( ( 'abstract' ) )
            {
            // InternalMiniJava.g:8005:2: ( ( 'abstract' ) )
            // InternalMiniJava.g:8006:3: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            }
            // InternalMiniJava.g:8007:3: ( 'abstract' )
            // InternalMiniJava.g:8008:4: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_3"
    // InternalMiniJava.g:8019:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8023:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8024:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8024:2: ( RULE_ID )
            // InternalMiniJava.g:8025:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3"


    // $ANTLR start "rule__Class__SuperClassAssignment_4_1"
    // InternalMiniJava.g:8034:1: rule__Class__SuperClassAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__SuperClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8038:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8039:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8039:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8040:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperClassClassCrossReference_4_1_0()); 
            }
            // InternalMiniJava.g:8041:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8042:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperClassClassQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperClassClassQualifiedNameParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperClassClassCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperClassAssignment_4_1"


    // $ANTLR start "rule__Class__ImplementsAssignment_5_1"
    // InternalMiniJava.g:8053:1: rule__Class__ImplementsAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__ImplementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8057:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8058:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8058:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8059:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getImplementsInterfaceCrossReference_5_1_0()); 
            }
            // InternalMiniJava.g:8060:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8061:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getImplementsInterfaceQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getImplementsInterfaceQualifiedNameParserRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getImplementsInterfaceCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ImplementsAssignment_5_1"


    // $ANTLR start "rule__Class__ImplementsAssignment_5_2_1"
    // InternalMiniJava.g:8072:1: rule__Class__ImplementsAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__ImplementsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8076:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8077:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8077:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8078:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getImplementsInterfaceCrossReference_5_2_1_0()); 
            }
            // InternalMiniJava.g:8079:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8080:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getImplementsInterfaceQualifiedNameParserRuleCall_5_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getImplementsInterfaceQualifiedNameParserRuleCall_5_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getImplementsInterfaceCrossReference_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ImplementsAssignment_5_2_1"


    // $ANTLR start "rule__Class__MembersAssignment_7"
    // InternalMiniJava.g:8091:1: rule__Class__MembersAssignment_7 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8095:1: ( ( ruleMember ) )
            // InternalMiniJava.g:8096:2: ( ruleMember )
            {
            // InternalMiniJava.g:8096:2: ( ruleMember )
            // InternalMiniJava.g:8097:3: ruleMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_7"


    // $ANTLR start "rule__Interface__AccessLevelAssignment_0"
    // InternalMiniJava.g:8106:1: rule__Interface__AccessLevelAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Interface__AccessLevelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8110:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:8111:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:8111:2: ( ruleAccessLevel )
            // InternalMiniJava.g:8112:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AccessLevelAssignment_0"


    // $ANTLR start "rule__Interface__NameAssignment_2"
    // InternalMiniJava.g:8121:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8125:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8126:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8126:2: ( RULE_ID )
            // InternalMiniJava.g:8127:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2"


    // $ANTLR start "rule__Interface__ImplementsAssignment_3_1"
    // InternalMiniJava.g:8136:1: rule__Interface__ImplementsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__ImplementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8140:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8141:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8141:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8142:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementsInterfaceCrossReference_3_1_0()); 
            }
            // InternalMiniJava.g:8143:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8144:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementsInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementsInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementsInterfaceCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ImplementsAssignment_3_1"


    // $ANTLR start "rule__Interface__ImplementsAssignment_3_2_1"
    // InternalMiniJava.g:8155:1: rule__Interface__ImplementsAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__ImplementsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8159:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8160:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8160:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8161:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementsInterfaceCrossReference_3_2_1_0()); 
            }
            // InternalMiniJava.g:8162:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8163:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementsInterfaceQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementsInterfaceQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementsInterfaceCrossReference_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ImplementsAssignment_3_2_1"


    // $ANTLR start "rule__Interface__MembersAssignment_5"
    // InternalMiniJava.g:8174:1: rule__Interface__MembersAssignment_5 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8178:1: ( ( ruleMember ) )
            // InternalMiniJava.g:8179:2: ( ruleMember )
            {
            // InternalMiniJava.g:8179:2: ( ruleMember )
            // InternalMiniJava.g:8180:3: ruleMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MembersAssignment_5"


    // $ANTLR start "rule__Method__AccessAssignment_0"
    // InternalMiniJava.g:8189:1: rule__Method__AccessAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Method__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8193:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:8194:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:8194:2: ( ruleAccessLevel )
            // InternalMiniJava.g:8195:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__AccessAssignment_0"


    // $ANTLR start "rule__Method__AbstractAssignment_1"
    // InternalMiniJava.g:8204:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8208:1: ( ( ( 'abstract' ) ) )
            // InternalMiniJava.g:8209:2: ( ( 'abstract' ) )
            {
            // InternalMiniJava.g:8209:2: ( ( 'abstract' ) )
            // InternalMiniJava.g:8210:3: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            }
            // InternalMiniJava.g:8211:3: ( 'abstract' )
            // InternalMiniJava.g:8212:4: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__AbstractAssignment_1"


    // $ANTLR start "rule__Method__StaticAssignment_2"
    // InternalMiniJava.g:8223:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8227:1: ( ( ( 'static' ) ) )
            // InternalMiniJava.g:8228:2: ( ( 'static' ) )
            {
            // InternalMiniJava.g:8228:2: ( ( 'static' ) )
            // InternalMiniJava.g:8229:3: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            }
            // InternalMiniJava.g:8230:3: ( 'static' )
            // InternalMiniJava.g:8231:4: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__StaticAssignment_2"


    // $ANTLR start "rule__Method__TypeRefAssignment_3"
    // InternalMiniJava.g:8242:1: rule__Method__TypeRefAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Method__TypeRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8246:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8247:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8247:2: ( ruleTypeRef )
            // InternalMiniJava.g:8248:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypeRefTypeRefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypeRefTypeRefParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeRefAssignment_3"


    // $ANTLR start "rule__Method__NameAssignment_4"
    // InternalMiniJava.g:8257:1: rule__Method__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8261:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8262:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8262:2: ( RULE_ID )
            // InternalMiniJava.g:8263:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_4"


    // $ANTLR start "rule__Method__ParamsAssignment_6_0"
    // InternalMiniJava.g:8272:1: rule__Method__ParamsAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8276:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:8277:2: ( ruleParameter )
            {
            // InternalMiniJava.g:8277:2: ( ruleParameter )
            // InternalMiniJava.g:8278:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_6_0"


    // $ANTLR start "rule__Method__ParamsAssignment_6_1_1"
    // InternalMiniJava.g:8287:1: rule__Method__ParamsAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8291:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:8292:2: ( ruleParameter )
            {
            // InternalMiniJava.g:8292:2: ( ruleParameter )
            // InternalMiniJava.g:8293:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_6_1_1"


    // $ANTLR start "rule__Method__BodyAssignment_8_0"
    // InternalMiniJava.g:8302:1: rule__Method__BodyAssignment_8_0 : ( ruleBlock ) ;
    public final void rule__Method__BodyAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8306:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8307:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8307:2: ( ruleBlock )
            // InternalMiniJava.g:8308:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_8_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_8_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__BodyAssignment_8_0"


    // $ANTLR start "rule__Parameter__TypeRefAssignment_0"
    // InternalMiniJava.g:8317:1: rule__Parameter__TypeRefAssignment_0 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8321:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8322:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8322:2: ( ruleTypeRef )
            // InternalMiniJava.g:8323:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeRefAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMiniJava.g:8332:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8336:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8337:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8337:2: ( RULE_ID )
            // InternalMiniJava.g:8338:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Field__AccessAssignment_0"
    // InternalMiniJava.g:8347:1: rule__Field__AccessAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Field__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8351:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:8352:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:8352:2: ( ruleAccessLevel )
            // InternalMiniJava.g:8353:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__AccessAssignment_0"


    // $ANTLR start "rule__Field__TypeRefAssignment_1"
    // InternalMiniJava.g:8362:1: rule__Field__TypeRefAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Field__TypeRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8366:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8367:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8367:2: ( ruleTypeRef )
            // InternalMiniJava.g:8368:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeRefTypeRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeRefTypeRefParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeRefAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalMiniJava.g:8377:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8381:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8382:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8382:2: ( RULE_ID )
            // InternalMiniJava.g:8383:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__DefaultValueAssignment_3_1"
    // InternalMiniJava.g:8392:1: rule__Field__DefaultValueAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Field__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8396:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8397:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8397:2: ( ruleExpression )
            // InternalMiniJava.g:8398:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultValueExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getDefaultValueExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__DefaultValueAssignment_3_1"


    // $ANTLR start "rule__Block__StatementsAssignment_2"
    // InternalMiniJava.g:8407:1: rule__Block__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8411:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:8412:2: ( ruleStatement )
            {
            // InternalMiniJava.g:8412:2: ( ruleStatement )
            // InternalMiniJava.g:8413:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_2"


    // $ANTLR start "rule__PrintStatement__ExpressionAssignment_6"
    // InternalMiniJava.g:8422:1: rule__PrintStatement__ExpressionAssignment_6 : ( ruleExpression ) ;
    public final void rule__PrintStatement__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8426:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8427:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8427:2: ( ruleExpression )
            // InternalMiniJava.g:8428:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getExpressionExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getExpressionExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__ExpressionAssignment_6"


    // $ANTLR start "rule__Return__ExpressionAssignment_1"
    // InternalMiniJava.g:8437:1: rule__Return__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Return__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8441:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8442:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8442:2: ( ruleExpression )
            // InternalMiniJava.g:8443:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__ExpressionAssignment_1"


    // $ANTLR start "rule__IfStatement__ExpressionAssignment_2"
    // InternalMiniJava.g:8452:1: rule__IfStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8456:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8457:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8457:2: ( ruleExpression )
            // InternalMiniJava.g:8458:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__IfStatement__ThenBlockAssignment_4"
    // InternalMiniJava.g:8467:1: rule__IfStatement__ThenBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__ThenBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8471:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8472:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8472:2: ( ruleBlock )
            // InternalMiniJava.g:8473:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBlockBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBlockBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ThenBlockAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseBlockAssignment_5_1"
    // InternalMiniJava.g:8482:1: rule__IfStatement__ElseBlockAssignment_5_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8486:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8487:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8487:2: ( ruleBlock )
            // InternalMiniJava.g:8488:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseBlockAssignment_5_1"


    // $ANTLR start "rule__WhileStatement__ConditionAssignment_2"
    // InternalMiniJava.g:8497:1: rule__WhileStatement__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8501:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8502:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8502:2: ( ruleExpression )
            // InternalMiniJava.g:8503:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__ConditionAssignment_2"


    // $ANTLR start "rule__WhileStatement__BlockAssignment_4"
    // InternalMiniJava.g:8512:1: rule__WhileStatement__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileStatement__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8516:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8517:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8517:2: ( ruleBlock )
            // InternalMiniJava.g:8518:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__BlockAssignment_4"


    // $ANTLR start "rule__ForStatement__DeclarationAssignment_2"
    // InternalMiniJava.g:8527:1: rule__ForStatement__DeclarationAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForStatement__DeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8531:1: ( ( ruleAssignment ) )
            // InternalMiniJava.g:8532:2: ( ruleAssignment )
            {
            // InternalMiniJava.g:8532:2: ( ruleAssignment )
            // InternalMiniJava.g:8533:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getDeclarationAssignmentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getDeclarationAssignmentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__DeclarationAssignment_2"


    // $ANTLR start "rule__ForStatement__ConditionAssignment_4"
    // InternalMiniJava.g:8542:1: rule__ForStatement__ConditionAssignment_4 : ( ruleExpression ) ;
    public final void rule__ForStatement__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8546:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8547:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8547:2: ( ruleExpression )
            // InternalMiniJava.g:8548:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getConditionExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getConditionExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__ConditionAssignment_4"


    // $ANTLR start "rule__ForStatement__ProgressionAssignment_6"
    // InternalMiniJava.g:8557:1: rule__ForStatement__ProgressionAssignment_6 : ( ruleAssignment ) ;
    public final void rule__ForStatement__ProgressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8561:1: ( ( ruleAssignment ) )
            // InternalMiniJava.g:8562:2: ( ruleAssignment )
            {
            // InternalMiniJava.g:8562:2: ( ruleAssignment )
            // InternalMiniJava.g:8563:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getProgressionAssignmentParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getProgressionAssignmentParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__ProgressionAssignment_6"


    // $ANTLR start "rule__ForStatement__BlockAssignment_8"
    // InternalMiniJava.g:8572:1: rule__ForStatement__BlockAssignment_8 : ( ruleBlock ) ;
    public final void rule__ForStatement__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8576:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8577:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8577:2: ( ruleBlock )
            // InternalMiniJava.g:8578:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__BlockAssignment_8"


    // $ANTLR start "rule__ClassRef__ReferencedClassAssignment"
    // InternalMiniJava.g:8587:1: rule__ClassRef__ReferencedClassAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassRef__ReferencedClassAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8591:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8592:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8592:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8593:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationCrossReference_0()); 
            }
            // InternalMiniJava.g:8594:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8595:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationQualifiedNameParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassRef__ReferencedClassAssignment"


    // $ANTLR start "rule__VariableDeclaration__TypeRefAssignment_0"
    // InternalMiniJava.g:8606:1: rule__VariableDeclaration__TypeRefAssignment_0 : ( ruleTypeRef ) ;
    public final void rule__VariableDeclaration__TypeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8610:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8611:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8611:2: ( ruleTypeRef )
            // InternalMiniJava.g:8612:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeRefAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalMiniJava.g:8621:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8625:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8626:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8626:2: ( RULE_ID )
            // InternalMiniJava.g:8627:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Assignment__AssigneeAssignment_0"
    // InternalMiniJava.g:8636:1: rule__Assignment__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Assignment__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8640:1: ( ( ruleAssignee ) )
            // InternalMiniJava.g:8641:2: ( ruleAssignee )
            {
            // InternalMiniJava.g:8641:2: ( ruleAssignee )
            // InternalMiniJava.g:8642:3: ruleAssignee
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignee();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__AssigneeAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMiniJava.g:8651:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8655:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8656:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8656:2: ( ruleExpression )
            // InternalMiniJava.g:8657:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalMiniJava.g:8666:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8670:1: ( ( ruleAnd ) )
            // InternalMiniJava.g:8671:2: ( ruleAnd )
            {
            // InternalMiniJava.g:8671:2: ( ruleAnd )
            // InternalMiniJava.g:8672:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalMiniJava.g:8681:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8685:1: ( ( ruleEquality ) )
            // InternalMiniJava.g:8686:2: ( ruleEquality )
            {
            // InternalMiniJava.g:8686:2: ( ruleEquality )
            // InternalMiniJava.g:8687:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__RightAssignment_1_1"
    // InternalMiniJava.g:8696:1: rule__Equality__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8700:1: ( ( ruleComparison ) )
            // InternalMiniJava.g:8701:2: ( ruleComparison )
            {
            // InternalMiniJava.g:8701:2: ( ruleComparison )
            // InternalMiniJava.g:8702:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // InternalMiniJava.g:8711:1: rule__Comparison__RightAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8715:1: ( ( rulePlusOrMinus ) )
            // InternalMiniJava.g:8716:2: ( rulePlusOrMinus )
            {
            // InternalMiniJava.g:8716:2: ( rulePlusOrMinus )
            // InternalMiniJava.g:8717:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalMiniJava.g:8726:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8730:1: ( ( ruleMulOrDiv ) )
            // InternalMiniJava.g:8731:2: ( ruleMulOrDiv )
            {
            // InternalMiniJava.g:8731:2: ( ruleMulOrDiv )
            // InternalMiniJava.g:8732:3: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // InternalMiniJava.g:8741:1: rule__MulOrDiv__RightAssignment_1_1 : ( ruleArrayAccess ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8745:1: ( ( ruleArrayAccess ) )
            // InternalMiniJava.g:8746:2: ( ruleArrayAccess )
            {
            // InternalMiniJava.g:8746:2: ( ruleArrayAccess )
            // InternalMiniJava.g:8747:3: ruleArrayAccess
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightArrayAccessParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightArrayAccessParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__ArrayAccess__IndexAssignment_1_2"
    // InternalMiniJava.g:8756:1: rule__ArrayAccess__IndexAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__ArrayAccess__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8760:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8761:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8761:2: ( ruleExpression )
            // InternalMiniJava.g:8762:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getIndexExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getIndexExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__IndexAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalMiniJava.g:8771:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8775:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:8776:2: ( rulePrimary )
            {
            // InternalMiniJava.g:8776:2: ( rulePrimary )
            // InternalMiniJava.g:8777:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_2_2"
    // InternalMiniJava.g:8786:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8790:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:8791:2: ( rulePrimary )
            {
            // InternalMiniJava.g:8791:2: ( rulePrimary )
            // InternalMiniJava.g:8792:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_2_2"


    // $ANTLR start "rule__SelectionExpression__FieldAssignment_1_0_2"
    // InternalMiniJava.g:8801:1: rule__SelectionExpression__FieldAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__SelectionExpression__FieldAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8805:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:8806:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:8806:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:8807:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldFieldCrossReference_1_0_2_0()); 
            }
            // InternalMiniJava.g:8808:3: ( RULE_ID )
            // InternalMiniJava.g:8809:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldFieldIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldFieldIDTerminalRuleCall_1_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldFieldCrossReference_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__FieldAssignment_1_0_2"


    // $ANTLR start "rule__SelectionExpression__MethodAssignment_1_1_2"
    // InternalMiniJava.g:8820:1: rule__SelectionExpression__MethodAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__SelectionExpression__MethodAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8824:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:8825:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:8825:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:8826:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodMethodCrossReference_1_1_2_0()); 
            }
            // InternalMiniJava.g:8827:3: ( RULE_ID )
            // InternalMiniJava.g:8828:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodMethodIDTerminalRuleCall_1_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodMethodIDTerminalRuleCall_1_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodMethodCrossReference_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__MethodAssignment_1_1_2"


    // $ANTLR start "rule__SelectionExpression__ArgsAssignment_1_1_4_0"
    // InternalMiniJava.g:8839:1: rule__SelectionExpression__ArgsAssignment_1_1_4_0 : ( ruleExpression ) ;
    public final void rule__SelectionExpression__ArgsAssignment_1_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8843:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8844:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8844:2: ( ruleExpression )
            // InternalMiniJava.g:8845:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__ArgsAssignment_1_1_4_0"


    // $ANTLR start "rule__SelectionExpression__ArgsAssignment_1_1_4_1_1"
    // InternalMiniJava.g:8854:1: rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 : ( ruleExpression ) ;
    public final void rule__SelectionExpression__ArgsAssignment_1_1_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8858:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8859:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8859:2: ( ruleExpression )
            // InternalMiniJava.g:8860:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__ArgsAssignment_1_1_4_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_1"
    // InternalMiniJava.g:8869:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8873:1: ( ( RULE_STRING ) )
            // InternalMiniJava.g:8874:2: ( RULE_STRING )
            {
            // InternalMiniJava.g:8874:2: ( RULE_STRING )
            // InternalMiniJava.g:8875:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalMiniJava.g:8884:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8888:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:8889:2: ( RULE_INT )
            {
            // InternalMiniJava.g:8889:2: ( RULE_INT )
            // InternalMiniJava.g:8890:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1"
    // InternalMiniJava.g:8899:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8903:1: ( ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // InternalMiniJava.g:8904:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // InternalMiniJava.g:8904:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            // InternalMiniJava.g:8905:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }
            // InternalMiniJava.g:8906:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            // InternalMiniJava.g:8906:4: rule__TerminalExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__TerminalExpression__TypeAssignment_6_2"
    // InternalMiniJava.g:8914:1: rule__TerminalExpression__TypeAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__TypeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8918:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:8919:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:8919:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:8920:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeClassCrossReference_6_2_0()); 
            }
            // InternalMiniJava.g:8921:3: ( RULE_ID )
            // InternalMiniJava.g:8922:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeClassIDTerminalRuleCall_6_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeClassIDTerminalRuleCall_6_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeClassCrossReference_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__TypeAssignment_6_2"


    // $ANTLR start "rule__TerminalExpression__ArgsAssignment_6_4_0"
    // InternalMiniJava.g:8933:1: rule__TerminalExpression__ArgsAssignment_6_4_0 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgsAssignment_6_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8937:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8938:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8938:2: ( ruleExpression )
            // InternalMiniJava.g:8939:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_6_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_6_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ArgsAssignment_6_4_0"


    // $ANTLR start "rule__TerminalExpression__ArgsAssignment_6_4_1_1"
    // InternalMiniJava.g:8948:1: rule__TerminalExpression__ArgsAssignment_6_4_1_1 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgsAssignment_6_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8952:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8953:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8953:2: ( ruleExpression )
            // InternalMiniJava.g:8954:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_6_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_6_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ArgsAssignment_6_4_1_1"


    // $ANTLR start "rule__TerminalExpression__TypeAssignment_7_2"
    // InternalMiniJava.g:8963:1: rule__TerminalExpression__TypeAssignment_7_2 : ( ruleTypeRef ) ;
    public final void rule__TerminalExpression__TypeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8967:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8968:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8968:2: ( ruleTypeRef )
            // InternalMiniJava.g:8969:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeTypeRefParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeTypeRefParserRuleCall_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__TypeAssignment_7_2"


    // $ANTLR start "rule__TerminalExpression__SizeAssignment_7_4"
    // InternalMiniJava.g:8978:1: rule__TerminalExpression__SizeAssignment_7_4 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__SizeAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8982:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8983:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8983:2: ( ruleExpression )
            // InternalMiniJava.g:8984:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSizeExpressionParserRuleCall_7_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSizeExpressionParserRuleCall_7_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__SizeAssignment_7_4"


    // $ANTLR start "rule__TerminalExpression__SymbolAssignment_8_1"
    // InternalMiniJava.g:8993:1: rule__TerminalExpression__SymbolAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__SymbolAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8997:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:8998:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:8998:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:8999:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_8_1_0()); 
            }
            // InternalMiniJava.g:9000:3: ( RULE_ID )
            // InternalMiniJava.g:9001:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolIDTerminalRuleCall_8_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolIDTerminalRuleCall_8_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__SymbolAssignment_8_1"

    // $ANTLR start synpred5_InternalMiniJava
    public final void synpred5_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1090:2: ( ( ( rule__Statement__Group_1__0 ) ) )
        // InternalMiniJava.g:1090:2: ( ( rule__Statement__Group_1__0 ) )
        {
        // InternalMiniJava.g:1090:2: ( ( rule__Statement__Group_1__0 ) )
        // InternalMiniJava.g:1091:3: ( rule__Statement__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_1()); 
        }
        // InternalMiniJava.g:1092:3: ( rule__Statement__Group_1__0 )
        // InternalMiniJava.g:1092:4: rule__Statement__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Statement__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalMiniJava

    // $ANTLR start synpred16_InternalMiniJava
    public final void synpred16_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1201:2: ( ( ( ruleParameter ) ) )
        // InternalMiniJava.g:1201:2: ( ( ruleParameter ) )
        {
        // InternalMiniJava.g:1201:2: ( ( ruleParameter ) )
        // InternalMiniJava.g:1202:3: ( ruleParameter )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0()); 
        }
        // InternalMiniJava.g:1203:3: ( ruleParameter )
        // InternalMiniJava.g:1203:4: ruleParameter
        {
        pushFollow(FOLLOW_2);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalMiniJava

    // Delegated rules

    public final boolean synpred5_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\11\4\1\uffff\1\4\1\50\1\13\2\4\1\uffff";
    static final String dfa_3s = "\4\100\5\47\1\uffff\1\4\1\50\1\36\1\47\1\34\1\uffff";
    static final String dfa_4s = "\11\uffff\1\2\5\uffff\1\1";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\11\uffff\1\1\1\2\1\3\30\uffff\1\5\1\6\1\7\1\10\22\uffff\2\11",
            "\1\4\44\uffff\1\5\1\6\1\7\1\10\22\uffff\2\11",
            "\1\4\44\uffff\1\5\1\6\1\7\1\10\22\uffff\2\11",
            "\1\4\44\uffff\1\5\1\6\1\7\1\10\22\uffff\2\11",
            "\1\14\16\uffff\1\12\10\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "",
            "\1\15",
            "\1\16",
            "\1\17\20\uffff\1\11\1\uffff\1\17",
            "\1\14\16\uffff\1\12\10\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1037:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );";
        }
    }
    static final String dfa_7s = "\30\uffff";
    static final String dfa_8s = "\1\4\4\uffff\11\0\12\uffff";
    static final String dfa_9s = "\1\76\4\uffff\11\0\12\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\17\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_11s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\15\1\5\1\6\5\uffff\1\7\1\10\10\uffff\1\26\5\uffff\1\2\2\uffff\1\25\2\uffff\1\1\1\22\1\uffff\1\23\1\24\2\uffff\4\2\11\uffff\1\2\3\uffff\1\2\1\11\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1079:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleForStatement ) | ( ( rule__Statement__Group_5__0 ) ) | ( ruleBlock ) | ( ( rule__Statement__Group_7__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_13 = input.LA(1);

                         
                        int index4_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index4_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\11\uffff\1\14\3\uffff";
    static final String dfa_15s = "\6\4\1\uffff\1\4\1\50\1\13\2\4\1\uffff";
    static final String dfa_16s = "\1\100\5\47\1\uffff\1\4\1\50\1\36\1\47\1\34\1\uffff";
    static final String dfa_17s = "\6\uffff\1\2\5\uffff\1\1";
    static final String dfa_18s = "\15\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\11\uffff\3\6\30\uffff\1\2\1\3\1\4\1\5\22\uffff\2\6",
            "\1\11\16\uffff\1\7\10\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "",
            "\1\12",
            "\1\13",
            "\1\6\20\uffff\1\6\1\uffff\1\6",
            "\1\11\16\uffff\1\7\10\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1175:1: rule__TypedDeclaration__Alternatives : ( ( ruleSymbol ) | ( ruleMember ) );";
        }
    }
    static final String dfa_20s = "\7\4\1\50\1\0\2\4\2\uffff";
    static final String dfa_21s = "\1\54\5\47\1\4\1\50\1\0\1\47\1\4\2\uffff";
    static final String dfa_22s = "\13\uffff\1\1\1\2";
    static final String dfa_23s = "\10\uffff\1\0\4\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\44\uffff\1\2\1\3\1\4\1\5",
            "\1\10\16\uffff\1\6\23\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\uffff",
            "\1\10\16\uffff\1\6\23\uffff\1\7",
            "\1\10",
            "",
            ""
    };
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1196:1: rule__Symbol__Alternatives : ( ( ( ruleParameter ) ) | ( ruleVariableDeclaration ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalMiniJava()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\7\uffff";
    static final String dfa_26s = "\2\uffff\1\1\3\uffff\1\1";
    static final String dfa_27s = "\1\4\1\uffff\1\4\1\uffff\3\4";
    static final String dfa_28s = "\1\76\1\uffff\1\47\1\uffff\1\71\1\76\1\47";
    static final String dfa_29s = "\1\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String dfa_30s = "\7\uffff}>";
    static final String[] dfa_31s = {
            "\1\2\2\1\5\uffff\2\1\16\uffff\1\1\14\uffff\4\3\11\uffff\1\1\3\uffff\5\1",
            "",
            "\1\3\16\uffff\1\4\12\uffff\1\1\10\uffff\1\5",
            "",
            "\1\6\64\uffff\1\1",
            "\3\1\5\uffff\2\1\16\uffff\1\1\13\uffff\1\3\15\uffff\1\1\3\uffff\5\1",
            "\1\3\16\uffff\1\4\10\uffff\1\1\1\uffff\1\1\10\uffff\1\5"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1217:1: rule__Assignee__Alternatives : ( ( ( ruleArrayAccess ) ) | ( ruleVariableDeclaration ) );";
        }
    }
    static final String dfa_32s = "\14\uffff";
    static final String dfa_33s = "\1\4\6\uffff\1\4\1\uffff\1\23\2\uffff";
    static final String dfa_34s = "\1\76\6\uffff\1\54\1\uffff\1\47\2\uffff";
    static final String dfa_35s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\uffff\1\10\1\7";
    static final String dfa_36s = "\14\uffff}>";
    static final String[] dfa_37s = {
            "\1\10\1\1\1\2\5\uffff\2\3\55\uffff\1\4\1\5\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\44\uffff\4\12",
            "",
            "\1\12\10\uffff\1\13\12\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "1388:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x800000000825C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x800000000821C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x800000000021C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x80001E000081C010L,0x0000000000000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x80001E000001C012L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x800000000821C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x80001E000001C010L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001E002001C010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001E000001C010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x7C40000010003070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x7C401E6C90C1F070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x7C401E6C9041F072L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x7C401E001001F070L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x7C40000030003070L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4000000000000000L});

}