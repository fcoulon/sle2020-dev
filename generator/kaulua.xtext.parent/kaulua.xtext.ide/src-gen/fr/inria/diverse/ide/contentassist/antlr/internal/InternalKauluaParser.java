package fr.inria.diverse.ide.contentassist.antlr.internal;

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
import fr.inria.diverse.services.KauluaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKauluaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_QUALIFIER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Protocol'", "'{'", "'dependencies'", "'}'", "'feature'", "'capabilities'", "':'", "'alternativeOf'", "'['", "']'", "'->'", "'mandatory'"
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

    	public void setGrammarAccess(KauluaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProtocol"
    // InternalKaulua.g:53:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalKaulua.g:54:1: ( ruleProtocol EOF )
            // InternalKaulua.g:55:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalKaulua.g:62:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:66:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalKaulua.g:67:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalKaulua.g:67:2: ( ( rule__Protocol__Group__0 ) )
            // InternalKaulua.g:68:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalKaulua.g:69:3: ( rule__Protocol__Group__0 )
            // InternalKaulua.g:69:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleFeature"
    // InternalKaulua.g:78:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalKaulua.g:79:1: ( ruleFeature EOF )
            // InternalKaulua.g:80:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalKaulua.g:87:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:91:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalKaulua.g:92:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalKaulua.g:92:2: ( ( rule__Feature__Group__0 ) )
            // InternalKaulua.g:93:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalKaulua.g:94:3: ( rule__Feature__Group__0 )
            // InternalKaulua.g:94:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleCapability"
    // InternalKaulua.g:103:1: entryRuleCapability : ruleCapability EOF ;
    public final void entryRuleCapability() throws RecognitionException {
        try {
            // InternalKaulua.g:104:1: ( ruleCapability EOF )
            // InternalKaulua.g:105:1: ruleCapability EOF
            {
             before(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getCapabilityRule()); 
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
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalKaulua.g:112:1: ruleCapability : ( ( rule__Capability__Group__0 ) ) ;
    public final void ruleCapability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:116:2: ( ( ( rule__Capability__Group__0 ) ) )
            // InternalKaulua.g:117:2: ( ( rule__Capability__Group__0 ) )
            {
            // InternalKaulua.g:117:2: ( ( rule__Capability__Group__0 ) )
            // InternalKaulua.g:118:3: ( rule__Capability__Group__0 )
            {
             before(grammarAccess.getCapabilityAccess().getGroup()); 
            // InternalKaulua.g:119:3: ( rule__Capability__Group__0 )
            // InternalKaulua.g:119:4: rule__Capability__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleDependency"
    // InternalKaulua.g:128:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalKaulua.g:129:1: ( ruleDependency EOF )
            // InternalKaulua.g:130:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalKaulua.g:137:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:141:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // InternalKaulua.g:142:2: ( ( rule__Dependency__Group__0 ) )
            {
            // InternalKaulua.g:142:2: ( ( rule__Dependency__Group__0 ) )
            // InternalKaulua.g:143:3: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // InternalKaulua.g:144:3: ( rule__Dependency__Group__0 )
            // InternalKaulua.g:144:4: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalKaulua.g:152:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:156:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalKaulua.g:157:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalKaulua.g:164:1: rule__Protocol__Group__0__Impl : ( 'Protocol' ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:168:1: ( ( 'Protocol' ) )
            // InternalKaulua.g:169:1: ( 'Protocol' )
            {
            // InternalKaulua.g:169:1: ( 'Protocol' )
            // InternalKaulua.g:170:2: 'Protocol'
            {
             before(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalKaulua.g:179:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:183:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // InternalKaulua.g:184:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Protocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalKaulua.g:191:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:195:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // InternalKaulua.g:196:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // InternalKaulua.g:196:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // InternalKaulua.g:197:2: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // InternalKaulua.g:198:2: ( rule__Protocol__NameAssignment_1 )
            // InternalKaulua.g:198:3: rule__Protocol__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // InternalKaulua.g:206:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:210:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // InternalKaulua.g:211:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Protocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // InternalKaulua.g:218:1: rule__Protocol__Group__2__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:222:1: ( ( '{' ) )
            // InternalKaulua.g:223:1: ( '{' )
            {
            // InternalKaulua.g:223:1: ( '{' )
            // InternalKaulua.g:224:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2__Impl"


    // $ANTLR start "rule__Protocol__Group__3"
    // InternalKaulua.g:233:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl rule__Protocol__Group__4 ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:237:1: ( rule__Protocol__Group__3__Impl rule__Protocol__Group__4 )
            // InternalKaulua.g:238:2: rule__Protocol__Group__3__Impl rule__Protocol__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Protocol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3"


    // $ANTLR start "rule__Protocol__Group__3__Impl"
    // InternalKaulua.g:245:1: rule__Protocol__Group__3__Impl : ( ( ( rule__Protocol__FeaturesAssignment_3 ) ) ( ( rule__Protocol__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:249:1: ( ( ( ( rule__Protocol__FeaturesAssignment_3 ) ) ( ( rule__Protocol__FeaturesAssignment_3 )* ) ) )
            // InternalKaulua.g:250:1: ( ( ( rule__Protocol__FeaturesAssignment_3 ) ) ( ( rule__Protocol__FeaturesAssignment_3 )* ) )
            {
            // InternalKaulua.g:250:1: ( ( ( rule__Protocol__FeaturesAssignment_3 ) ) ( ( rule__Protocol__FeaturesAssignment_3 )* ) )
            // InternalKaulua.g:251:2: ( ( rule__Protocol__FeaturesAssignment_3 ) ) ( ( rule__Protocol__FeaturesAssignment_3 )* )
            {
            // InternalKaulua.g:251:2: ( ( rule__Protocol__FeaturesAssignment_3 ) )
            // InternalKaulua.g:252:3: ( rule__Protocol__FeaturesAssignment_3 )
            {
             before(grammarAccess.getProtocolAccess().getFeaturesAssignment_3()); 
            // InternalKaulua.g:253:3: ( rule__Protocol__FeaturesAssignment_3 )
            // InternalKaulua.g:253:4: rule__Protocol__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Protocol__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getFeaturesAssignment_3()); 

            }

            // InternalKaulua.g:256:2: ( ( rule__Protocol__FeaturesAssignment_3 )* )
            // InternalKaulua.g:257:3: ( rule__Protocol__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getProtocolAccess().getFeaturesAssignment_3()); 
            // InternalKaulua.g:258:3: ( rule__Protocol__FeaturesAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKaulua.g:258:4: rule__Protocol__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Protocol__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getFeaturesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__4"
    // InternalKaulua.g:267:1: rule__Protocol__Group__4 : rule__Protocol__Group__4__Impl rule__Protocol__Group__5 ;
    public final void rule__Protocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:271:1: ( rule__Protocol__Group__4__Impl rule__Protocol__Group__5 )
            // InternalKaulua.g:272:2: rule__Protocol__Group__4__Impl rule__Protocol__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Protocol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4"


    // $ANTLR start "rule__Protocol__Group__4__Impl"
    // InternalKaulua.g:279:1: rule__Protocol__Group__4__Impl : ( 'dependencies' ) ;
    public final void rule__Protocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:283:1: ( ( 'dependencies' ) )
            // InternalKaulua.g:284:1: ( 'dependencies' )
            {
            // InternalKaulua.g:284:1: ( 'dependencies' )
            // InternalKaulua.g:285:2: 'dependencies'
            {
             before(grammarAccess.getProtocolAccess().getDependenciesKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getDependenciesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4__Impl"


    // $ANTLR start "rule__Protocol__Group__5"
    // InternalKaulua.g:294:1: rule__Protocol__Group__5 : rule__Protocol__Group__5__Impl rule__Protocol__Group__6 ;
    public final void rule__Protocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:298:1: ( rule__Protocol__Group__5__Impl rule__Protocol__Group__6 )
            // InternalKaulua.g:299:2: rule__Protocol__Group__5__Impl rule__Protocol__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Protocol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5"


    // $ANTLR start "rule__Protocol__Group__5__Impl"
    // InternalKaulua.g:306:1: rule__Protocol__Group__5__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:310:1: ( ( '{' ) )
            // InternalKaulua.g:311:1: ( '{' )
            {
            // InternalKaulua.g:311:1: ( '{' )
            // InternalKaulua.g:312:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5__Impl"


    // $ANTLR start "rule__Protocol__Group__6"
    // InternalKaulua.g:321:1: rule__Protocol__Group__6 : rule__Protocol__Group__6__Impl rule__Protocol__Group__7 ;
    public final void rule__Protocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:325:1: ( rule__Protocol__Group__6__Impl rule__Protocol__Group__7 )
            // InternalKaulua.g:326:2: rule__Protocol__Group__6__Impl rule__Protocol__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Protocol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6"


    // $ANTLR start "rule__Protocol__Group__6__Impl"
    // InternalKaulua.g:333:1: rule__Protocol__Group__6__Impl : ( ( rule__Protocol__DependenciesAssignment_6 )* ) ;
    public final void rule__Protocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:337:1: ( ( ( rule__Protocol__DependenciesAssignment_6 )* ) )
            // InternalKaulua.g:338:1: ( ( rule__Protocol__DependenciesAssignment_6 )* )
            {
            // InternalKaulua.g:338:1: ( ( rule__Protocol__DependenciesAssignment_6 )* )
            // InternalKaulua.g:339:2: ( rule__Protocol__DependenciesAssignment_6 )*
            {
             before(grammarAccess.getProtocolAccess().getDependenciesAssignment_6()); 
            // InternalKaulua.g:340:2: ( rule__Protocol__DependenciesAssignment_6 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_QUALIFIER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKaulua.g:340:3: rule__Protocol__DependenciesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Protocol__DependenciesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getDependenciesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6__Impl"


    // $ANTLR start "rule__Protocol__Group__7"
    // InternalKaulua.g:348:1: rule__Protocol__Group__7 : rule__Protocol__Group__7__Impl rule__Protocol__Group__8 ;
    public final void rule__Protocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:352:1: ( rule__Protocol__Group__7__Impl rule__Protocol__Group__8 )
            // InternalKaulua.g:353:2: rule__Protocol__Group__7__Impl rule__Protocol__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Protocol__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7"


    // $ANTLR start "rule__Protocol__Group__7__Impl"
    // InternalKaulua.g:360:1: rule__Protocol__Group__7__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:364:1: ( ( '}' ) )
            // InternalKaulua.g:365:1: ( '}' )
            {
            // InternalKaulua.g:365:1: ( '}' )
            // InternalKaulua.g:366:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7__Impl"


    // $ANTLR start "rule__Protocol__Group__8"
    // InternalKaulua.g:375:1: rule__Protocol__Group__8 : rule__Protocol__Group__8__Impl ;
    public final void rule__Protocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:379:1: ( rule__Protocol__Group__8__Impl )
            // InternalKaulua.g:380:2: rule__Protocol__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8"


    // $ANTLR start "rule__Protocol__Group__8__Impl"
    // InternalKaulua.g:386:1: rule__Protocol__Group__8__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:390:1: ( ( '}' ) )
            // InternalKaulua.g:391:1: ( '}' )
            {
            // InternalKaulua.g:391:1: ( '}' )
            // InternalKaulua.g:392:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalKaulua.g:402:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:406:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalKaulua.g:407:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalKaulua.g:414:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__IsMandatoryAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:418:1: ( ( ( rule__Feature__IsMandatoryAssignment_0 )? ) )
            // InternalKaulua.g:419:1: ( ( rule__Feature__IsMandatoryAssignment_0 )? )
            {
            // InternalKaulua.g:419:1: ( ( rule__Feature__IsMandatoryAssignment_0 )? )
            // InternalKaulua.g:420:2: ( rule__Feature__IsMandatoryAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getIsMandatoryAssignment_0()); 
            // InternalKaulua.g:421:2: ( rule__Feature__IsMandatoryAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKaulua.g:421:3: rule__Feature__IsMandatoryAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__IsMandatoryAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsMandatoryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalKaulua.g:429:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:433:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalKaulua.g:434:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalKaulua.g:441:1: rule__Feature__Group__1__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:445:1: ( ( 'feature' ) )
            // InternalKaulua.g:446:1: ( 'feature' )
            {
            // InternalKaulua.g:446:1: ( 'feature' )
            // InternalKaulua.g:447:2: 'feature'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalKaulua.g:456:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:460:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalKaulua.g:461:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalKaulua.g:468:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:472:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalKaulua.g:473:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalKaulua.g:473:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalKaulua.g:474:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalKaulua.g:475:2: ( rule__Feature__NameAssignment_2 )
            // InternalKaulua.g:475:3: rule__Feature__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalKaulua.g:483:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:487:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalKaulua.g:488:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalKaulua.g:495:1: rule__Feature__Group__3__Impl : ( '{' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:499:1: ( ( '{' ) )
            // InternalKaulua.g:500:1: ( '{' )
            {
            // InternalKaulua.g:500:1: ( '{' )
            // InternalKaulua.g:501:2: '{'
            {
             before(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalKaulua.g:510:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:514:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalKaulua.g:515:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalKaulua.g:522:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__Group_4__0 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:526:1: ( ( ( rule__Feature__Group_4__0 )? ) )
            // InternalKaulua.g:527:1: ( ( rule__Feature__Group_4__0 )? )
            {
            // InternalKaulua.g:527:1: ( ( rule__Feature__Group_4__0 )? )
            // InternalKaulua.g:528:2: ( rule__Feature__Group_4__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_4()); 
            // InternalKaulua.g:529:2: ( rule__Feature__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKaulua.g:529:3: rule__Feature__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // InternalKaulua.g:537:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:541:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // InternalKaulua.g:542:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // InternalKaulua.g:549:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:553:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // InternalKaulua.g:554:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // InternalKaulua.g:554:1: ( ( rule__Feature__Group_5__0 )? )
            // InternalKaulua.g:555:2: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // InternalKaulua.g:556:2: ( rule__Feature__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKaulua.g:556:3: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__6"
    // InternalKaulua.g:564:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:568:1: ( rule__Feature__Group__6__Impl )
            // InternalKaulua.g:569:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6"


    // $ANTLR start "rule__Feature__Group__6__Impl"
    // InternalKaulua.g:575:1: rule__Feature__Group__6__Impl : ( '}' ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:579:1: ( ( '}' ) )
            // InternalKaulua.g:580:1: ( '}' )
            {
            // InternalKaulua.g:580:1: ( '}' )
            // InternalKaulua.g:581:2: '}'
            {
             before(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6__Impl"


    // $ANTLR start "rule__Feature__Group_4__0"
    // InternalKaulua.g:591:1: rule__Feature__Group_4__0 : rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 ;
    public final void rule__Feature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:595:1: ( rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 )
            // InternalKaulua.g:596:2: rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__0"


    // $ANTLR start "rule__Feature__Group_4__0__Impl"
    // InternalKaulua.g:603:1: rule__Feature__Group_4__0__Impl : ( 'capabilities' ) ;
    public final void rule__Feature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:607:1: ( ( 'capabilities' ) )
            // InternalKaulua.g:608:1: ( 'capabilities' )
            {
            // InternalKaulua.g:608:1: ( 'capabilities' )
            // InternalKaulua.g:609:2: 'capabilities'
            {
             before(grammarAccess.getFeatureAccess().getCapabilitiesKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getCapabilitiesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__0__Impl"


    // $ANTLR start "rule__Feature__Group_4__1"
    // InternalKaulua.g:618:1: rule__Feature__Group_4__1 : rule__Feature__Group_4__1__Impl rule__Feature__Group_4__2 ;
    public final void rule__Feature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:622:1: ( rule__Feature__Group_4__1__Impl rule__Feature__Group_4__2 )
            // InternalKaulua.g:623:2: rule__Feature__Group_4__1__Impl rule__Feature__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__1"


    // $ANTLR start "rule__Feature__Group_4__1__Impl"
    // InternalKaulua.g:630:1: rule__Feature__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:634:1: ( ( ':' ) )
            // InternalKaulua.g:635:1: ( ':' )
            {
            // InternalKaulua.g:635:1: ( ':' )
            // InternalKaulua.g:636:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_4_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__1__Impl"


    // $ANTLR start "rule__Feature__Group_4__2"
    // InternalKaulua.g:645:1: rule__Feature__Group_4__2 : rule__Feature__Group_4__2__Impl ;
    public final void rule__Feature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:649:1: ( rule__Feature__Group_4__2__Impl )
            // InternalKaulua.g:650:2: rule__Feature__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__2"


    // $ANTLR start "rule__Feature__Group_4__2__Impl"
    // InternalKaulua.g:656:1: rule__Feature__Group_4__2__Impl : ( ( ( rule__Feature__CapabilitiesAssignment_4_2 ) ) ( ( rule__Feature__CapabilitiesAssignment_4_2 )* ) ) ;
    public final void rule__Feature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:660:1: ( ( ( ( rule__Feature__CapabilitiesAssignment_4_2 ) ) ( ( rule__Feature__CapabilitiesAssignment_4_2 )* ) ) )
            // InternalKaulua.g:661:1: ( ( ( rule__Feature__CapabilitiesAssignment_4_2 ) ) ( ( rule__Feature__CapabilitiesAssignment_4_2 )* ) )
            {
            // InternalKaulua.g:661:1: ( ( ( rule__Feature__CapabilitiesAssignment_4_2 ) ) ( ( rule__Feature__CapabilitiesAssignment_4_2 )* ) )
            // InternalKaulua.g:662:2: ( ( rule__Feature__CapabilitiesAssignment_4_2 ) ) ( ( rule__Feature__CapabilitiesAssignment_4_2 )* )
            {
            // InternalKaulua.g:662:2: ( ( rule__Feature__CapabilitiesAssignment_4_2 ) )
            // InternalKaulua.g:663:3: ( rule__Feature__CapabilitiesAssignment_4_2 )
            {
             before(grammarAccess.getFeatureAccess().getCapabilitiesAssignment_4_2()); 
            // InternalKaulua.g:664:3: ( rule__Feature__CapabilitiesAssignment_4_2 )
            // InternalKaulua.g:664:4: rule__Feature__CapabilitiesAssignment_4_2
            {
            pushFollow(FOLLOW_14);
            rule__Feature__CapabilitiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getCapabilitiesAssignment_4_2()); 

            }

            // InternalKaulua.g:667:2: ( ( rule__Feature__CapabilitiesAssignment_4_2 )* )
            // InternalKaulua.g:668:3: ( rule__Feature__CapabilitiesAssignment_4_2 )*
            {
             before(grammarAccess.getFeatureAccess().getCapabilitiesAssignment_4_2()); 
            // InternalKaulua.g:669:3: ( rule__Feature__CapabilitiesAssignment_4_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKaulua.g:669:4: rule__Feature__CapabilitiesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Feature__CapabilitiesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getCapabilitiesAssignment_4_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__2__Impl"


    // $ANTLR start "rule__Feature__Group_5__0"
    // InternalKaulua.g:679:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:683:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // InternalKaulua.g:684:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0"


    // $ANTLR start "rule__Feature__Group_5__0__Impl"
    // InternalKaulua.g:691:1: rule__Feature__Group_5__0__Impl : ( 'alternativeOf' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:695:1: ( ( 'alternativeOf' ) )
            // InternalKaulua.g:696:1: ( 'alternativeOf' )
            {
            // InternalKaulua.g:696:1: ( 'alternativeOf' )
            // InternalKaulua.g:697:2: 'alternativeOf'
            {
             before(grammarAccess.getFeatureAccess().getAlternativeOfKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getAlternativeOfKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0__Impl"


    // $ANTLR start "rule__Feature__Group_5__1"
    // InternalKaulua.g:706:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl rule__Feature__Group_5__2 ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:710:1: ( rule__Feature__Group_5__1__Impl rule__Feature__Group_5__2 )
            // InternalKaulua.g:711:2: rule__Feature__Group_5__1__Impl rule__Feature__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1"


    // $ANTLR start "rule__Feature__Group_5__1__Impl"
    // InternalKaulua.g:718:1: rule__Feature__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:722:1: ( ( ':' ) )
            // InternalKaulua.g:723:1: ( ':' )
            {
            // InternalKaulua.g:723:1: ( ':' )
            // InternalKaulua.g:724:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1__Impl"


    // $ANTLR start "rule__Feature__Group_5__2"
    // InternalKaulua.g:733:1: rule__Feature__Group_5__2 : rule__Feature__Group_5__2__Impl ;
    public final void rule__Feature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:737:1: ( rule__Feature__Group_5__2__Impl )
            // InternalKaulua.g:738:2: rule__Feature__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__2"


    // $ANTLR start "rule__Feature__Group_5__2__Impl"
    // InternalKaulua.g:744:1: rule__Feature__Group_5__2__Impl : ( ( rule__Feature__AlternativeGroupAssignment_5_2 ) ) ;
    public final void rule__Feature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:748:1: ( ( ( rule__Feature__AlternativeGroupAssignment_5_2 ) ) )
            // InternalKaulua.g:749:1: ( ( rule__Feature__AlternativeGroupAssignment_5_2 ) )
            {
            // InternalKaulua.g:749:1: ( ( rule__Feature__AlternativeGroupAssignment_5_2 ) )
            // InternalKaulua.g:750:2: ( rule__Feature__AlternativeGroupAssignment_5_2 )
            {
             before(grammarAccess.getFeatureAccess().getAlternativeGroupAssignment_5_2()); 
            // InternalKaulua.g:751:2: ( rule__Feature__AlternativeGroupAssignment_5_2 )
            // InternalKaulua.g:751:3: rule__Feature__AlternativeGroupAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__AlternativeGroupAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternativeGroupAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__2__Impl"


    // $ANTLR start "rule__Capability__Group__0"
    // InternalKaulua.g:760:1: rule__Capability__Group__0 : rule__Capability__Group__0__Impl rule__Capability__Group__1 ;
    public final void rule__Capability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:764:1: ( rule__Capability__Group__0__Impl rule__Capability__Group__1 )
            // InternalKaulua.g:765:2: rule__Capability__Group__0__Impl rule__Capability__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Capability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0"


    // $ANTLR start "rule__Capability__Group__0__Impl"
    // InternalKaulua.g:772:1: rule__Capability__Group__0__Impl : ( ( rule__Capability__NameAssignment_0 ) ) ;
    public final void rule__Capability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:776:1: ( ( ( rule__Capability__NameAssignment_0 ) ) )
            // InternalKaulua.g:777:1: ( ( rule__Capability__NameAssignment_0 ) )
            {
            // InternalKaulua.g:777:1: ( ( rule__Capability__NameAssignment_0 ) )
            // InternalKaulua.g:778:2: ( rule__Capability__NameAssignment_0 )
            {
             before(grammarAccess.getCapabilityAccess().getNameAssignment_0()); 
            // InternalKaulua.g:779:2: ( rule__Capability__NameAssignment_0 )
            // InternalKaulua.g:779:3: rule__Capability__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Capability__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0__Impl"


    // $ANTLR start "rule__Capability__Group__1"
    // InternalKaulua.g:787:1: rule__Capability__Group__1 : rule__Capability__Group__1__Impl ;
    public final void rule__Capability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:791:1: ( rule__Capability__Group__1__Impl )
            // InternalKaulua.g:792:2: rule__Capability__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1"


    // $ANTLR start "rule__Capability__Group__1__Impl"
    // InternalKaulua.g:798:1: rule__Capability__Group__1__Impl : ( ( rule__Capability__Group_1__0 )? ) ;
    public final void rule__Capability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:802:1: ( ( ( rule__Capability__Group_1__0 )? ) )
            // InternalKaulua.g:803:1: ( ( rule__Capability__Group_1__0 )? )
            {
            // InternalKaulua.g:803:1: ( ( rule__Capability__Group_1__0 )? )
            // InternalKaulua.g:804:2: ( rule__Capability__Group_1__0 )?
            {
             before(grammarAccess.getCapabilityAccess().getGroup_1()); 
            // InternalKaulua.g:805:2: ( rule__Capability__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKaulua.g:805:3: rule__Capability__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Capability__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCapabilityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1__Impl"


    // $ANTLR start "rule__Capability__Group_1__0"
    // InternalKaulua.g:814:1: rule__Capability__Group_1__0 : rule__Capability__Group_1__0__Impl rule__Capability__Group_1__1 ;
    public final void rule__Capability__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:818:1: ( rule__Capability__Group_1__0__Impl rule__Capability__Group_1__1 )
            // InternalKaulua.g:819:2: rule__Capability__Group_1__0__Impl rule__Capability__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Capability__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_1__0"


    // $ANTLR start "rule__Capability__Group_1__0__Impl"
    // InternalKaulua.g:826:1: rule__Capability__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Capability__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:830:1: ( ( '[' ) )
            // InternalKaulua.g:831:1: ( '[' )
            {
            // InternalKaulua.g:831:1: ( '[' )
            // InternalKaulua.g:832:2: '['
            {
             before(grammarAccess.getCapabilityAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_1__0__Impl"


    // $ANTLR start "rule__Capability__Group_1__1"
    // InternalKaulua.g:841:1: rule__Capability__Group_1__1 : rule__Capability__Group_1__1__Impl rule__Capability__Group_1__2 ;
    public final void rule__Capability__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:845:1: ( rule__Capability__Group_1__1__Impl rule__Capability__Group_1__2 )
            // InternalKaulua.g:846:2: rule__Capability__Group_1__1__Impl rule__Capability__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Capability__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_1__1"


    // $ANTLR start "rule__Capability__Group_1__1__Impl"
    // InternalKaulua.g:853:1: rule__Capability__Group_1__1__Impl : ( ( rule__Capability__DefinitionFileAssignment_1_1 ) ) ;
    public final void rule__Capability__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:857:1: ( ( ( rule__Capability__DefinitionFileAssignment_1_1 ) ) )
            // InternalKaulua.g:858:1: ( ( rule__Capability__DefinitionFileAssignment_1_1 ) )
            {
            // InternalKaulua.g:858:1: ( ( rule__Capability__DefinitionFileAssignment_1_1 ) )
            // InternalKaulua.g:859:2: ( rule__Capability__DefinitionFileAssignment_1_1 )
            {
             before(grammarAccess.getCapabilityAccess().getDefinitionFileAssignment_1_1()); 
            // InternalKaulua.g:860:2: ( rule__Capability__DefinitionFileAssignment_1_1 )
            // InternalKaulua.g:860:3: rule__Capability__DefinitionFileAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Capability__DefinitionFileAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getDefinitionFileAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_1__1__Impl"


    // $ANTLR start "rule__Capability__Group_1__2"
    // InternalKaulua.g:868:1: rule__Capability__Group_1__2 : rule__Capability__Group_1__2__Impl ;
    public final void rule__Capability__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:872:1: ( rule__Capability__Group_1__2__Impl )
            // InternalKaulua.g:873:2: rule__Capability__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_1__2"


    // $ANTLR start "rule__Capability__Group_1__2__Impl"
    // InternalKaulua.g:879:1: rule__Capability__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Capability__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:883:1: ( ( ']' ) )
            // InternalKaulua.g:884:1: ( ']' )
            {
            // InternalKaulua.g:884:1: ( ']' )
            // InternalKaulua.g:885:2: ']'
            {
             before(grammarAccess.getCapabilityAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_1__2__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // InternalKaulua.g:895:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:899:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalKaulua.g:900:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // InternalKaulua.g:907:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__CallerAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:911:1: ( ( ( rule__Dependency__CallerAssignment_0 ) ) )
            // InternalKaulua.g:912:1: ( ( rule__Dependency__CallerAssignment_0 ) )
            {
            // InternalKaulua.g:912:1: ( ( rule__Dependency__CallerAssignment_0 ) )
            // InternalKaulua.g:913:2: ( rule__Dependency__CallerAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getCallerAssignment_0()); 
            // InternalKaulua.g:914:2: ( rule__Dependency__CallerAssignment_0 )
            // InternalKaulua.g:914:3: rule__Dependency__CallerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__CallerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getCallerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // InternalKaulua.g:922:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:926:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // InternalKaulua.g:927:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Dependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // InternalKaulua.g:934:1: rule__Dependency__Group__1__Impl : ( '->' ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:938:1: ( ( '->' ) )
            // InternalKaulua.g:939:1: ( '->' )
            {
            // InternalKaulua.g:939:1: ( '->' )
            // InternalKaulua.g:940:2: '->'
            {
             before(grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Dependency__Group__2"
    // InternalKaulua.g:949:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:953:1: ( rule__Dependency__Group__2__Impl )
            // InternalKaulua.g:954:2: rule__Dependency__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__2"


    // $ANTLR start "rule__Dependency__Group__2__Impl"
    // InternalKaulua.g:960:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__CalleeAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:964:1: ( ( ( rule__Dependency__CalleeAssignment_2 ) ) )
            // InternalKaulua.g:965:1: ( ( rule__Dependency__CalleeAssignment_2 ) )
            {
            // InternalKaulua.g:965:1: ( ( rule__Dependency__CalleeAssignment_2 ) )
            // InternalKaulua.g:966:2: ( rule__Dependency__CalleeAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getCalleeAssignment_2()); 
            // InternalKaulua.g:967:2: ( rule__Dependency__CalleeAssignment_2 )
            // InternalKaulua.g:967:3: rule__Dependency__CalleeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__CalleeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getCalleeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__2__Impl"


    // $ANTLR start "rule__Protocol__NameAssignment_1"
    // InternalKaulua.g:976:1: rule__Protocol__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:980:1: ( ( RULE_STRING ) )
            // InternalKaulua.g:981:2: ( RULE_STRING )
            {
            // InternalKaulua.g:981:2: ( RULE_STRING )
            // InternalKaulua.g:982:3: RULE_STRING
            {
             before(grammarAccess.getProtocolAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_1"


    // $ANTLR start "rule__Protocol__FeaturesAssignment_3"
    // InternalKaulua.g:991:1: rule__Protocol__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Protocol__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:995:1: ( ( ruleFeature ) )
            // InternalKaulua.g:996:2: ( ruleFeature )
            {
            // InternalKaulua.g:996:2: ( ruleFeature )
            // InternalKaulua.g:997:3: ruleFeature
            {
             before(grammarAccess.getProtocolAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getFeaturesFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__FeaturesAssignment_3"


    // $ANTLR start "rule__Protocol__DependenciesAssignment_6"
    // InternalKaulua.g:1006:1: rule__Protocol__DependenciesAssignment_6 : ( ruleDependency ) ;
    public final void rule__Protocol__DependenciesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1010:1: ( ( ruleDependency ) )
            // InternalKaulua.g:1011:2: ( ruleDependency )
            {
            // InternalKaulua.g:1011:2: ( ruleDependency )
            // InternalKaulua.g:1012:3: ruleDependency
            {
             before(grammarAccess.getProtocolAccess().getDependenciesDependencyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getDependenciesDependencyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__DependenciesAssignment_6"


    // $ANTLR start "rule__Feature__IsMandatoryAssignment_0"
    // InternalKaulua.g:1021:1: rule__Feature__IsMandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__Feature__IsMandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1025:1: ( ( ( 'mandatory' ) ) )
            // InternalKaulua.g:1026:2: ( ( 'mandatory' ) )
            {
            // InternalKaulua.g:1026:2: ( ( 'mandatory' ) )
            // InternalKaulua.g:1027:3: ( 'mandatory' )
            {
             before(grammarAccess.getFeatureAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            // InternalKaulua.g:1028:3: ( 'mandatory' )
            // InternalKaulua.g:1029:4: 'mandatory'
            {
             before(grammarAccess.getFeatureAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getIsMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsMandatoryMandatoryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IsMandatoryAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalKaulua.g:1040:1: rule__Feature__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1044:1: ( ( RULE_ID ) )
            // InternalKaulua.g:1045:2: ( RULE_ID )
            {
            // InternalKaulua.g:1045:2: ( RULE_ID )
            // InternalKaulua.g:1046:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_2"


    // $ANTLR start "rule__Feature__CapabilitiesAssignment_4_2"
    // InternalKaulua.g:1055:1: rule__Feature__CapabilitiesAssignment_4_2 : ( ruleCapability ) ;
    public final void rule__Feature__CapabilitiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1059:1: ( ( ruleCapability ) )
            // InternalKaulua.g:1060:2: ( ruleCapability )
            {
            // InternalKaulua.g:1060:2: ( ruleCapability )
            // InternalKaulua.g:1061:3: ruleCapability
            {
             before(grammarAccess.getFeatureAccess().getCapabilitiesCapabilityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getCapabilitiesCapabilityParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__CapabilitiesAssignment_4_2"


    // $ANTLR start "rule__Feature__AlternativeGroupAssignment_5_2"
    // InternalKaulua.g:1070:1: rule__Feature__AlternativeGroupAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Feature__AlternativeGroupAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1074:1: ( ( RULE_STRING ) )
            // InternalKaulua.g:1075:2: ( RULE_STRING )
            {
            // InternalKaulua.g:1075:2: ( RULE_STRING )
            // InternalKaulua.g:1076:3: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getAlternativeGroupSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getAlternativeGroupSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AlternativeGroupAssignment_5_2"


    // $ANTLR start "rule__Capability__NameAssignment_0"
    // InternalKaulua.g:1085:1: rule__Capability__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Capability__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1089:1: ( ( RULE_ID ) )
            // InternalKaulua.g:1090:2: ( RULE_ID )
            {
            // InternalKaulua.g:1090:2: ( RULE_ID )
            // InternalKaulua.g:1091:3: RULE_ID
            {
             before(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__NameAssignment_0"


    // $ANTLR start "rule__Capability__DefinitionFileAssignment_1_1"
    // InternalKaulua.g:1100:1: rule__Capability__DefinitionFileAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Capability__DefinitionFileAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1104:1: ( ( RULE_STRING ) )
            // InternalKaulua.g:1105:2: ( RULE_STRING )
            {
            // InternalKaulua.g:1105:2: ( RULE_STRING )
            // InternalKaulua.g:1106:3: RULE_STRING
            {
             before(grammarAccess.getCapabilityAccess().getDefinitionFileSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getDefinitionFileSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__DefinitionFileAssignment_1_1"


    // $ANTLR start "rule__Dependency__CallerAssignment_0"
    // InternalKaulua.g:1115:1: rule__Dependency__CallerAssignment_0 : ( ( RULE_QUALIFIER ) ) ;
    public final void rule__Dependency__CallerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1119:1: ( ( ( RULE_QUALIFIER ) ) )
            // InternalKaulua.g:1120:2: ( ( RULE_QUALIFIER ) )
            {
            // InternalKaulua.g:1120:2: ( ( RULE_QUALIFIER ) )
            // InternalKaulua.g:1121:3: ( RULE_QUALIFIER )
            {
             before(grammarAccess.getDependencyAccess().getCallerCapabilityCrossReference_0_0()); 
            // InternalKaulua.g:1122:3: ( RULE_QUALIFIER )
            // InternalKaulua.g:1123:4: RULE_QUALIFIER
            {
             before(grammarAccess.getDependencyAccess().getCallerCapabilityQUALIFIERTerminalRuleCall_0_0_1()); 
            match(input,RULE_QUALIFIER,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getCallerCapabilityQUALIFIERTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getCallerCapabilityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__CallerAssignment_0"


    // $ANTLR start "rule__Dependency__CalleeAssignment_2"
    // InternalKaulua.g:1134:1: rule__Dependency__CalleeAssignment_2 : ( ( RULE_QUALIFIER ) ) ;
    public final void rule__Dependency__CalleeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKaulua.g:1138:1: ( ( ( RULE_QUALIFIER ) ) )
            // InternalKaulua.g:1139:2: ( ( RULE_QUALIFIER ) )
            {
            // InternalKaulua.g:1139:2: ( ( RULE_QUALIFIER ) )
            // InternalKaulua.g:1140:3: ( RULE_QUALIFIER )
            {
             before(grammarAccess.getDependencyAccess().getCalleeCapabilityCrossReference_2_0()); 
            // InternalKaulua.g:1141:3: ( RULE_QUALIFIER )
            // InternalKaulua.g:1142:4: RULE_QUALIFIER
            {
             before(grammarAccess.getDependencyAccess().getCalleeCapabilityQUALIFIERTerminalRuleCall_2_0_1()); 
            match(input,RULE_QUALIFIER,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getCalleeCapabilityQUALIFIERTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getCalleeCapabilityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__CalleeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});

}