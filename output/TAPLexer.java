// $ANTLR 3.4 /home/kinow/java/workspace/tap-grammar/TAP.g 2012-12-04 04:09:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TAPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int INTEGER=4;
    public static final int WhiteSpace=5;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TAPLexer() {} 
    public TAPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TAPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/kinow/java/workspace/tap-grammar/TAP.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:2:6: ( '#' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:2:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:3:6: ( '#1111' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:3:8: '#1111'
            {
            match("#1111"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:4:6: ( '1..' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:4:8: '1..'
            {
            match("1.."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:5:6: ( 'SKIP' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:5:8: 'SKIP'
            {
            match("SKIP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:6:7: ( '\\n' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:6:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:7:7: ( '\\r' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:7:9: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:8:7: ( 'not ok' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:8:9: 'not ok'
            {
            match("not ok"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:9:7: ( 'ok' )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:9:9: 'ok'
            {
            match("ok"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:6:9: ( '1' .. '9' ( '0' .. '9' )* )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:6:11: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 

            // /home/kinow/java/workspace/tap-grammar/TAP.g:6:20: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/kinow/java/workspace/tap-grammar/TAP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kinow/java/workspace/tap-grammar/TAP.g:7:11: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // /home/kinow/java/workspace/tap-grammar/TAP.g:7:13: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // /home/kinow/java/workspace/tap-grammar/TAP.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | INTEGER | WhiteSpace )
        int alt2=10;
        switch ( input.LA(1) ) {
        case '#':
            {
            int LA2_1 = input.LA(2);

            if ( (LA2_1=='1') ) {
                alt2=2;
            }
            else {
                alt2=1;
            }
            }
            break;
        case '1':
            {
            int LA2_2 = input.LA(2);

            if ( (LA2_2=='.') ) {
                alt2=3;
            }
            else {
                alt2=9;
            }
            }
            break;
        case 'S':
            {
            alt2=4;
            }
            break;
        case '\n':
            {
            alt2=5;
            }
            break;
        case '\r':
            {
            alt2=6;
            }
            break;
        case 'n':
            {
            alt2=7;
            }
            break;
        case 'o':
            {
            alt2=8;
            }
            break;
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt2=9;
            }
            break;
        case '\t':
        case '\f':
        case ' ':
            {
            alt2=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:10: T__6
                {
                mT__6(); 


                }
                break;
            case 2 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:15: T__7
                {
                mT__7(); 


                }
                break;
            case 3 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:20: T__8
                {
                mT__8(); 


                }
                break;
            case 4 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:25: T__9
                {
                mT__9(); 


                }
                break;
            case 5 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:30: T__10
                {
                mT__10(); 


                }
                break;
            case 6 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:36: T__11
                {
                mT__11(); 


                }
                break;
            case 7 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:42: T__12
                {
                mT__12(); 


                }
                break;
            case 8 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:48: T__13
                {
                mT__13(); 


                }
                break;
            case 9 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:54: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 10 :
                // /home/kinow/java/workspace/tap-grammar/TAP.g:1:62: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


 

}