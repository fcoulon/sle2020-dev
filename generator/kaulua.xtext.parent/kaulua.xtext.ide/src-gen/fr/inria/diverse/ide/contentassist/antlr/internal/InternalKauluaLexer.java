package fr.inria.diverse.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKauluaLexer extends Lexer {
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

    public InternalKauluaLexer() {;} 
    public InternalKauluaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKauluaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKaulua.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:11:7: ( 'Protocol' )
            // InternalKaulua.g:11:9: 'Protocol'
            {
            match("Protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:12:7: ( '{' )
            // InternalKaulua.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:13:7: ( 'dependencies' )
            // InternalKaulua.g:13:9: 'dependencies'
            {
            match("dependencies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:14:7: ( '}' )
            // InternalKaulua.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:15:7: ( 'feature' )
            // InternalKaulua.g:15:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:16:7: ( 'capabilities' )
            // InternalKaulua.g:16:9: 'capabilities'
            {
            match("capabilities"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:17:7: ( ':' )
            // InternalKaulua.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:18:7: ( 'alternativeOf' )
            // InternalKaulua.g:18:9: 'alternativeOf'
            {
            match("alternativeOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:19:7: ( '[' )
            // InternalKaulua.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:20:7: ( ']' )
            // InternalKaulua.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:21:7: ( '->' )
            // InternalKaulua.g:21:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:22:7: ( 'mandatory' )
            // InternalKaulua.g:22:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_QUALIFIER"
    public final void mRULE_QUALIFIER() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1153:16: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalKaulua.g:1153:18: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalKaulua.g:1153:26: ( '.' RULE_ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKaulua.g:1153:27: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1155:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKaulua.g:1155:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKaulua.g:1155:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKaulua.g:1155:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKaulua.g:1155:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKaulua.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1157:10: ( ( '0' .. '9' )+ )
            // InternalKaulua.g:1157:12: ( '0' .. '9' )+
            {
            // InternalKaulua.g:1157:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKaulua.g:1157:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1159:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKaulua.g:1159:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKaulua.g:1159:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKaulua.g:1159:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKaulua.g:1159:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKaulua.g:1159:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKaulua.g:1159:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKaulua.g:1159:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKaulua.g:1159:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKaulua.g:1159:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKaulua.g:1159:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1161:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKaulua.g:1161:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKaulua.g:1161:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKaulua.g:1161:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1163:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKaulua.g:1163:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKaulua.g:1163:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKaulua.g:1163:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalKaulua.g:1163:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKaulua.g:1163:41: ( '\\r' )? '\\n'
                    {
                    // InternalKaulua.g:1163:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKaulua.g:1163:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1165:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKaulua.g:1165:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKaulua.g:1165:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKaulua.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKaulua.g:1167:16: ( . )
            // InternalKaulua.g:1167:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKaulua.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_QUALIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=20;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalKaulua.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalKaulua.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalKaulua.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalKaulua.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalKaulua.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalKaulua.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalKaulua.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalKaulua.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalKaulua.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalKaulua.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalKaulua.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalKaulua.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalKaulua.g:1:82: RULE_QUALIFIER
                {
                mRULE_QUALIFIER(); 

                }
                break;
            case 14 :
                // InternalKaulua.g:1:97: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalKaulua.g:1:105: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalKaulua.g:1:114: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalKaulua.g:1:126: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalKaulua.g:1:142: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalKaulua.g:1:158: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // InternalKaulua.g:1:166: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\26\1\uffff\1\26\1\uffff\2\26\1\uffff\1\26\2\uffff\1\24\1\26\1\24\1\26\1\uffff\3\24\2\uffff\1\26\1\uffff\1\26\2\uffff\1\26\1\uffff\2\26\1\uffff\1\26\3\uffff\2\26\5\uffff\32\26\1\112\3\26\1\116\1\26\1\uffff\3\26\1\uffff\3\26\1\126\3\26\1\uffff\3\26\1\135\1\136\1\26\2\uffff\1\140\1\uffff";
    static final String DFA13_eofS =
        "\141\uffff";
    static final String DFA13_minS =
        "\1\0\1\56\1\uffff\1\56\1\uffff\2\56\1\uffff\1\56\2\uffff\1\76\1\56\1\101\1\56\1\uffff\2\0\1\52\2\uffff\1\56\1\uffff\1\56\2\uffff\1\56\1\uffff\2\56\1\uffff\1\56\3\uffff\2\56\5\uffff\40\56\1\uffff\3\56\1\uffff\7\56\1\uffff\6\56\2\uffff\1\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\2\uffff\1\76\3\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\2\172\1\uffff\1\172\3\uffff\2\172\5\uffff\40\172\1\uffff\3\172\1\uffff\7\172\1\uffff\6\172\2\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\2\uffff\1\7\1\uffff\1\11\1\12\4\uffff\1\17\3\uffff\1\23\1\24\1\uffff\1\16\1\uffff\1\15\1\2\1\uffff\1\4\2\uffff\1\7\1\uffff\1\11\1\12\1\13\2\uffff\1\17\1\20\1\21\1\22\1\23\40\uffff\1\5\3\uffff\1\1\7\uffff\1\14\6\uffff\1\3\1\6\1\uffff\1\10";
    static final String DFA13_specialS =
        "\1\0\17\uffff\1\2\1\1\117\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\5\24\1\13\1\24\1\22\12\17\1\7\6\24\17\16\1\1\12\16\1\11\1\24\1\12\1\15\1\16\1\24\1\10\1\16\1\6\1\3\1\16\1\5\6\16\1\14\15\16\1\2\1\24\1\4\uff82\24",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\25\10\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\32\25\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\34\25\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\35\31\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\37\16\27",
            "",
            "",
            "\1\42",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\43\31\27",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\46",
            "\0\46",
            "\1\47\4\uffff\1\50",
            "",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\52\13\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\53\12\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\54\31\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\55\12\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\56\6\27",
            "",
            "",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\57\14\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\60\6\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\61\25\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\62\6\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\63\31\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\64\25\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\3\27\1\65\26\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\66\13\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\67\14\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\24\27\1\70\5\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\27\1\71\30\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\72\10\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\73\31\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\74\27\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\3\27\1\75\26\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\76\10\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\77\21\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\100\14\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\101\6\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\102\13\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\103\25\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\104\25\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\105\16\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\106\31\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\107\13\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\110\16\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\111\14\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\113\21\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\114\6\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\115\10\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\117\27\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\120\6\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\121\21\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\30\27\1\122\1\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\123\21\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\124\21\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\25\27\1\125\4\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\127\25\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\130\25\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\131\25\27",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\132\7\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\133\7\27",
            "\1\30\1\uffff\12\27\7\uffff\16\27\1\134\13\27\4\uffff\1\27\1\uffff\32\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\5\27\1\137\24\27",
            "",
            "",
            "\1\30\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_QUALIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='P') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='d') ) {s = 3;}

                        else if ( (LA13_0=='}') ) {s = 4;}

                        else if ( (LA13_0=='f') ) {s = 5;}

                        else if ( (LA13_0=='c') ) {s = 6;}

                        else if ( (LA13_0==':') ) {s = 7;}

                        else if ( (LA13_0=='a') ) {s = 8;}

                        else if ( (LA13_0=='[') ) {s = 9;}

                        else if ( (LA13_0==']') ) {s = 10;}

                        else if ( (LA13_0=='-') ) {s = 11;}

                        else if ( (LA13_0=='m') ) {s = 12;}

                        else if ( (LA13_0=='^') ) {s = 13;}

                        else if ( ((LA13_0>='A' && LA13_0<='O')||(LA13_0>='Q' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='e'||(LA13_0>='g' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='z')) ) {s = 14;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 15;}

                        else if ( (LA13_0=='\"') ) {s = 16;}

                        else if ( (LA13_0=='\'') ) {s = 17;}

                        else if ( (LA13_0=='/') ) {s = 18;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 19;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=',')||LA13_0=='.'||(LA13_0>=';' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_17 = input.LA(1);

                        s = -1;
                        if ( ((LA13_17>='\u0000' && LA13_17<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='\u0000' && LA13_16<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}