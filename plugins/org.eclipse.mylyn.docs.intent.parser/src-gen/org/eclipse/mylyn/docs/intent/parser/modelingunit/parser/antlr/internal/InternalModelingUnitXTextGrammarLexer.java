package org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelingUnitXTextGrammarLexer extends Lexer {
    public static final int RULE_ID=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LINE_BREAK=5;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int RULE_URI=7;
    public static final int Tokens=40;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=12;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING=6;
    public static final int RULE_STRINGWITHOUTQUOTES=4;
    public static final int RULE_EINT=9;
    public static final int RULE_INT=8;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int RULE_WS=13;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalModelingUnitXTextGrammarLexer() {;} 
    public InternalModelingUnitXTextGrammarLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g"; }

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:10:5: ( '@see' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:10:7: '@see'
            {
            match("@see"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:11:5: ( 'lineBreak' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:11:7: 'lineBreak'
            {
            match("lineBreak"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:12:5: ( 'AdressedAnnotation' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:12:7: 'AdressedAnnotation'
            {
            match("AdressedAnnotation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:13:5: ( '{' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:13:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:14:5: ( 'receiver' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:14:7: 'receiver'
            {
            match("receiver"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:15:5: ( ',' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:15:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:16:5: ( '}' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:16:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:17:5: ( 'source' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:17:7: 'source'
            {
            match("source"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:18:5: ( 'message' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:18:7: 'message'
            {
            match("message"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:19:5: ( 'type' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:19:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:20:5: ( 'href' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:20:7: 'href'
            {
            match("href"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:21:5: ( 'referencedElement' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:21:7: 'referencedElement'
            {
            match("referencedElement"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:22:5: ( '@Annotation' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:22:7: '@Annotation'
            {
            match("@Annotation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:23:5: ( 'new' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:23:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:24:5: ( '[' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:24:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:25:5: ( ']' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:25:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:26:5: ( ';' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:26:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:27:5: ( '=' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:27:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:28:5: ( 'Resource' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:28:7: 'Resource'
            {
            match("Resource"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:29:5: ( 'URI' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:29:7: 'URI'
            {
            match("URI"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:30:5: ( 'contentType' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:30:7: 'contentType'
            {
            match("contentType"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:31:5: ( 'content' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:31:7: 'content'
            {
            match("content"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:32:5: ( '+=' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:32:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:33:5: ( '@lazylabel' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:33:7: '@lazylabel'
            {
            match("@lazylabel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:34:5: ( '@label' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:34:7: '@label'
            {
            match("@label"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start RULE_EINT
    public final void mRULE_EINT() throws RecognitionException {
        try {
            int _type = RULE_EINT;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2554:11: ( RULE_INT )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2554:13: RULE_INT
            {
            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_EINT

    // $ANTLR start RULE_STRINGWITHOUTQUOTES
    public final void mRULE_STRINGWITHOUTQUOTES() throws RecognitionException {
        try {
            int _type = RULE_STRINGWITHOUTQUOTES;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2556:26: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | ':' | '_' | '-' )+ )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2556:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | ':' | '_' | '-' )+
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2556:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | ':' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='-' && LA1_0<='.')||(LA1_0>='0' && LA1_0<=':')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRINGWITHOUTQUOTES

    // $ANTLR start RULE_URI
    public final void mRULE_URI() throws RecognitionException {
        try {
            int _type = RULE_URI;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2558:10: ( '\"' ( 'file:/' | 'platform:/' | 'cdo:/' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '/' | ':' | '_' | '-' )+ '\"' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2558:12: '\"' ( 'file:/' | 'platform:/' | 'cdo:/' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '/' | ':' | '_' | '-' )+ '\"'
            {
            match('\"'); 
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2558:16: ( 'file:/' | 'platform:/' | 'cdo:/' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'f':
                {
                alt2=1;
                }
                break;
            case 'p':
                {
                alt2=2;
                }
                break;
            case 'c':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2558:16: ( 'file:/' | 'platform:/' | 'cdo:/' )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2558:17: 'file:/'
                    {
                    match("file:/"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2558:26: 'platform:/'
                    {
                    match("platform:/"); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2558:39: 'cdo:/'
                    {
                    match("cdo:/"); 


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2558:48: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '/' | ':' | '_' | '-' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='-' && LA3_0<=':')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_URI

    // $ANTLR start RULE_LINE_BREAK
    public final void mRULE_LINE_BREAK() throws RecognitionException {
        try {
            int _type = RULE_LINE_BREAK;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2560:17: ( '\\n' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2560:19: '\\n'
            {
            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LINE_BREAK

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2562:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2562:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2562:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2562:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2562:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2564:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2564:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2564:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2564:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2566:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2566:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2568:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2568:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2568:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2568:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2570:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2572:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2572:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2572:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2574:16: ( . )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2574:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:8: ( T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | RULE_EINT | RULE_STRINGWITHOUTQUOTES | RULE_URI | RULE_LINE_BREAK | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=36;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:10: T15
                {
                mT15(); 

                }
                break;
            case 2 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:14: T16
                {
                mT16(); 

                }
                break;
            case 3 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:18: T17
                {
                mT17(); 

                }
                break;
            case 4 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:22: T18
                {
                mT18(); 

                }
                break;
            case 5 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:26: T19
                {
                mT19(); 

                }
                break;
            case 6 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:30: T20
                {
                mT20(); 

                }
                break;
            case 7 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:34: T21
                {
                mT21(); 

                }
                break;
            case 8 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:38: T22
                {
                mT22(); 

                }
                break;
            case 9 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:42: T23
                {
                mT23(); 

                }
                break;
            case 10 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:46: T24
                {
                mT24(); 

                }
                break;
            case 11 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:50: T25
                {
                mT25(); 

                }
                break;
            case 12 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:54: T26
                {
                mT26(); 

                }
                break;
            case 13 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:58: T27
                {
                mT27(); 

                }
                break;
            case 14 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:62: T28
                {
                mT28(); 

                }
                break;
            case 15 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:66: T29
                {
                mT29(); 

                }
                break;
            case 16 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:70: T30
                {
                mT30(); 

                }
                break;
            case 17 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:74: T31
                {
                mT31(); 

                }
                break;
            case 18 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:78: T32
                {
                mT32(); 

                }
                break;
            case 19 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:82: T33
                {
                mT33(); 

                }
                break;
            case 20 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:86: T34
                {
                mT34(); 

                }
                break;
            case 21 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:90: T35
                {
                mT35(); 

                }
                break;
            case 22 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:94: T36
                {
                mT36(); 

                }
                break;
            case 23 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:98: T37
                {
                mT37(); 

                }
                break;
            case 24 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:102: T38
                {
                mT38(); 

                }
                break;
            case 25 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:106: T39
                {
                mT39(); 

                }
                break;
            case 26 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:110: RULE_EINT
                {
                mRULE_EINT(); 

                }
                break;
            case 27 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:120: RULE_STRINGWITHOUTQUOTES
                {
                mRULE_STRINGWITHOUTQUOTES(); 

                }
                break;
            case 28 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:145: RULE_URI
                {
                mRULE_URI(); 

                }
                break;
            case 29 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:154: RULE_LINE_BREAK
                {
                mRULE_LINE_BREAK(); 

                }
                break;
            case 30 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:170: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:178: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:187: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:199: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:215: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:231: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1:239: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\36\2\44\1\uffff\1\44\2\uffff\5\44\4\uffff\3\44\1\36\1"+
        "\67\1\44\1\36\1\75\1\36\1\uffff\2\36\5\uffff\2\44\1\uffff\1\44\1"+
        "\uffff\1\44\2\uffff\5\44\4\uffff\3\44\2\uffff\1\67\12\uffff\10\44"+
        "\1\134\1\44\1\136\1\44\5\uffff\6\44\1\151\1\152\1\uffff\1\44\1\uffff"+
        "\1\44\3\uffff\6\44\2\uffff\2\44\3\uffff\4\44\1\177\3\44\3\uffff"+
        "\4\44\1\uffff\1\u008a\1\44\1\u008d\3\uffff\2\44\1\u0092\1\44\1\uffff"+
        "\1\u0094\1\44\3\uffff\1\u0098\1\44\1\uffff\1\44\1\uffff\1\44\3\uffff"+
        "\3\44\1\uffff\2\44\1\u00a3\1\uffff\2\44\1\uffff\11\44\1\u00af\1"+
        "\u00b0\2\uffff";
    static final String DFA15_eofS =
        "\u00b1\uffff";
    static final String DFA15_minS =
        "\1\0\1\101\2\60\1\uffff\1\60\2\uffff\5\60\4\uffff\3\60\1\75\1\55"+
        "\1\60\1\0\1\11\1\101\1\uffff\1\0\1\52\3\uffff\1\141\1\uffff\2\60"+
        "\1\uffff\1\60\1\uffff\1\60\2\uffff\5\60\4\uffff\3\60\2\uffff\1\55"+
        "\3\0\6\uffff\1\142\10\60\1\55\1\60\1\55\1\60\3\0\2\uffff\6\60\2"+
        "\55\1\uffff\1\60\1\uffff\1\60\3\0\6\60\2\uffff\2\60\3\0\4\60\1\55"+
        "\3\60\3\0\4\60\1\uffff\1\55\1\60\1\55\3\0\2\60\1\55\1\60\1\uffff"+
        "\1\55\1\60\1\uffff\1\0\1\uffff\1\55\1\60\1\uffff\1\60\1\uffff\1"+
        "\60\1\0\2\uffff\3\60\1\0\2\60\1\55\1\0\2\60\1\uffff\11\60\2\55\2"+
        "\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\1\163\2\172\1\uffff\1\172\2\uffff\5\172\4\uffff\3\172\1"+
        "\75\2\172\1\ufffe\1\40\1\172\1\uffff\1\ufffe\1\57\3\uffff\1\141"+
        "\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\2\uffff\5\172\4\uffff"+
        "\3\172\2\uffff\1\172\3\ufffe\6\uffff\15\172\3\ufffe\2\uffff\10\172"+
        "\1\uffff\1\172\1\uffff\1\172\3\ufffe\6\172\2\uffff\2\172\3\ufffe"+
        "\10\172\3\ufffe\4\172\1\uffff\3\172\3\ufffe\4\172\1\uffff\2\172"+
        "\1\uffff\1\ufffe\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\ufffe"+
        "\2\uffff\3\172\1\ufffe\3\172\1\ufffe\2\172\1\uffff\13\172\2\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\5\uffff\1\17\1\20\1\21\1\22\11\uffff"+
        "\1\33\2\uffff\1\43\1\44\1\15\1\uffff\1\1\2\uffff\1\33\1\uffff\1"+
        "\4\1\uffff\1\6\1\7\5\uffff\1\17\1\20\1\21\1\22\3\uffff\1\27\1\32"+
        "\4\uffff\1\40\1\35\1\43\1\36\1\42\1\41\20\uffff\1\30\1\31\10\uffff"+
        "\1\16\1\uffff\1\24\12\uffff\1\12\1\13\24\uffff\1\10\12\uffff\1\11"+
        "\2\uffff\1\26\1\uffff\1\34\2\uffff\1\5\1\uffff\1\23\2\uffff\1\34"+
        "\1\2\12\uffff\1\25\13\uffff\1\14\1\3";
    static final String DFA15_specialS =
        "\u00b1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\36\1\35\1\30\2\36\1\35\22\36\1\35\1\36\1\27\4\36\1\33\3"+
            "\36\1\24\1\6\2\32\1\34\12\25\1\32\1\17\1\36\1\20\2\36\1\1\1"+
            "\3\20\26\1\21\2\26\1\22\5\26\1\15\1\36\1\16\1\31\1\26\1\36\2"+
            "\26\1\23\4\26\1\13\3\26\1\2\1\11\1\14\3\26\1\5\1\10\1\12\6\26"+
            "\1\4\1\36\1\7\uff81\36",
            "\1\37\52\uffff\1\40\6\uffff\1\41",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\42\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\45\26\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\47\25\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\52\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\53\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\30\43\1\54\1\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\55\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\56\25\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\63\25\43",
            "\12\43\7\uffff\21\43\1\64\10\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\65\13\43",
            "\1\66",
            "\2\44\1\uffff\12\70\1\44\6\uffff\32\44\4\uffff\1\44\1\uffff"+
            "\32\44",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\143\74\1\73\2\74\1\71\11\74\1\72\uff8e\74",
            "\2\76\2\uffff\1\76\22\uffff\1\76",
            "\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\uffff\74",
            "\1\101\4\uffff\1\100",
            "",
            "",
            "",
            "\1\102",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\103\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\104\10\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\105\2\43\1"+
            "\106\24\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\107\5\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\110\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\111\12\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\112\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\26\43\1\113\3\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\114\7\43",
            "\12\43\7\uffff\10\43\1\115\21\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\116\14\43",
            "",
            "",
            "\2\44\1\uffff\12\70\1\44\6\uffff\32\44\4\uffff\1\44\1\uffff"+
            "\32\44",
            "\151\74\1\117\uff95\74",
            "\154\74\1\120\uff92\74",
            "\144\74\1\121\uff9a\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123\27\uffff\1\122",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\124\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\125\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\126\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\127\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\130\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\131\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\132\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\5\43\1\133\24\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\135\13\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\137\6\43",
            "\154\74\1\140\uff92\74",
            "\141\74\1\141\uff9d\74",
            "\157\74\1\142\uff8f\74",
            "",
            "",
            "\12\43\7\uffff\1\43\1\143\30\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\144\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\145\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\146\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\147\27\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\150\31\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\153\5\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\154\25\43",
            "\145\74\1\155\uff99\74",
            "\164\74\1\156\uff8a\74",
            "\72\74\1\157\uffc4\74",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\160\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\161\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\162\4\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\163\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\164\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\165\23\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\166\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\167\14\43",
            "\72\74\1\170\uffc4\74",
            "\146\74\1\171\uff98\74",
            "\57\74\1\172\uffcf\74",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\173\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\174\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\175\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\176\14\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0080\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u0081\27\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0082\6\43",
            "\57\74\1\u0083\uffcf\74",
            "\157\74\1\u0084\uff8f\74",
            "\55\74\16\u0085\6\74\32\u0085\4\74\1\u0085\1\74\32\u0085\uff84"+
            "\74",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u0086\31\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\u0087\26\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u0088\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43\1\u0089\27\43",
            "",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u008b\25\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\23\43\1\u008c\6\43\4\uffff"+
            "\1\43\1\uffff\32\43",
            "\55\74\16\u0085\6\74\32\u0085\4\74\1\u0085\1\74\32\u0085\uff84"+
            "\74",
            "\162\74\1\u008e\uff8c\74",
            "\42\74\1\u008f\12\74\16\u0085\6\74\32\u0085\4\74\1\u0085\1\74"+
            "\32\u0085\uff84\74",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\12\43\1\u0090\17\43",
            "\12\43\7\uffff\1\u0091\31\43\4\uffff\1\43\1\uffff\32\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0093\25\43",
            "",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\30\43\1\u0095\1\43",
            "",
            "\155\74\1\u0096\uff91\74",
            "",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u0099\14\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\u009a\26\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\u009b\12\43",
            "\72\74\1\u009c\uffc4\74",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u009d\14\43",
            "\12\43\7\uffff\4\43\1\u009e\25\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u009f\25\43",
            "\57\74\1\u00a0\uffcf\74",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u00a1\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u00a2\16\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\55\74\16\u0085\6\74\32\u0085\4\74\1\u0085\1\74\32\u0085\uff84"+
            "\74",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00a4\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00a5\25\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u00a6\31\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\u00a7\15\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00a8\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u00a9\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00aa\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00ab\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u00ac\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00ad\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u00ae\14\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "\2\44\1\uffff\12\43\1\44\6\uffff\32\43\4\uffff\1\43\1\uffff"+
            "\32\43",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | RULE_EINT | RULE_STRINGWITHOUTQUOTES | RULE_URI | RULE_LINE_BREAK | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}