package org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.services.ModelingUnitXTextGrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelingUnitXTextGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRINGWITHOUTQUOTES", "RULE_LINE_BREAK", "RULE_STRING", "RULE_URI", "RULE_INT", "RULE_EINT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@see'", "'lineBreak'", "'AdressedAnnotation'", "'{'", "'receiver'", "','", "'}'", "'source'", "'message'", "'type'", "'href'", "'referencedElement'", "'@Annotation'", "'new'", "'['", "']'", "';'", "'='", "'Resource'", "'URI'", "'contentType'", "'content'", "'+='", "'@lazylabel'", "'@label'"
    };
    public static final int RULE_ID=10;
    public static final int RULE_STRING=6;
    public static final int RULE_STRINGWITHOUTQUOTES=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_EINT=9;
    public static final int RULE_LINE_BREAK=5;
    public static final int RULE_INT=8;
    public static final int RULE_WS=13;
    public static final int RULE_URI=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;

        public InternalModelingUnitXTextGrammarParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g"; }



     	private ModelingUnitXTextGrammarGrammarAccess grammarAccess;
     	
        public InternalModelingUnitXTextGrammarParser(TokenStream input, IAstFactory factory, ModelingUnitXTextGrammarGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ModelingUnit";	
       	}
       	
       	@Override
       	protected ModelingUnitXTextGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModelingUnit
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:78:1: entryRuleModelingUnit returns [EObject current=null] : iv_ruleModelingUnit= ruleModelingUnit EOF ;
    public final EObject entryRuleModelingUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelingUnit = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:79:2: (iv_ruleModelingUnit= ruleModelingUnit EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:80:2: iv_ruleModelingUnit= ruleModelingUnit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelingUnitRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelingUnit_in_entryRuleModelingUnit75);
            iv_ruleModelingUnit=ruleModelingUnit();
            _fsp--;

             current =iv_ruleModelingUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelingUnit85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModelingUnit


    // $ANTLR start ruleModelingUnit
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:87:1: ruleModelingUnit returns [EObject current=null] : ( () ( (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES ) )? ( RULE_LINE_BREAK )? ( (lv_resource_3_0= ruleResourceReference ) )? ( ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) ) )* ) ;
    public final EObject ruleModelingUnit() throws RecognitionException {
        EObject current = null;

        Token lv_unitName_1_0=null;
        EObject lv_resource_3_0 = null;

        EObject lv_instructions_4_1 = null;

        EObject lv_instructions_4_2 = null;

        EObject lv_instructions_4_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:92:6: ( ( () ( (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES ) )? ( RULE_LINE_BREAK )? ( (lv_resource_3_0= ruleResourceReference ) )? ( ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) ) )* ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:93:1: ( () ( (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES ) )? ( RULE_LINE_BREAK )? ( (lv_resource_3_0= ruleResourceReference ) )? ( ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) ) )* )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:93:1: ( () ( (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES ) )? ( RULE_LINE_BREAK )? ( (lv_resource_3_0= ruleResourceReference ) )? ( ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) ) )* )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:93:2: () ( (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES ) )? ( RULE_LINE_BREAK )? ( (lv_resource_3_0= ruleResourceReference ) )? ( ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) ) )*
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:93:2: ()
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:94:5: 
            {
             
                    temp=factory.create(grammarAccess.getModelingUnitAccess().getModelingUnitAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModelingUnitAccess().getModelingUnitAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:104:2: ( (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRINGWITHOUTQUOTES) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=RULE_STRINGWITHOUTQUOTES && LA1_1<=RULE_LINE_BREAK)||(LA1_1>=15 && LA1_1<=17)||(LA1_1>=27 && LA1_1<=29)||LA1_1==33||(LA1_1>=38 && LA1_1<=39)) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:105:1: (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:105:1: (lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:106:3: lv_unitName_1_0= RULE_STRINGWITHOUTQUOTES
                    {
                    lv_unitName_1_0=(Token)input.LT(1);
                    match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleModelingUnit136); 

                    			createLeafNode(grammarAccess.getModelingUnitAccess().getUnitNameStringWithoutQuotesTerminalRuleCall_1_0(), "unitName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelingUnitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"unitName",
                    	        		lv_unitName_1_0, 
                    	        		"StringWithoutQuotes", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:128:3: ( RULE_LINE_BREAK )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LINE_BREAK) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:128:4: RULE_LINE_BREAK
                    {
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleModelingUnit152); 
                     
                        createLeafNode(grammarAccess.getModelingUnitAccess().getLINE_BREAKTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:132:3: ( (lv_resource_3_0= ruleResourceReference ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:133:1: (lv_resource_3_0= ruleResourceReference )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:133:1: (lv_resource_3_0= ruleResourceReference )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:134:3: lv_resource_3_0= ruleResourceReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModelingUnitAccess().getResourceResourceReferenceParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleResourceReference_in_ruleModelingUnit174);
                    lv_resource_3_0=ruleResourceReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelingUnitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"resource",
                    	        		lv_resource_3_0, 
                    	        		"ResourceReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:156:3: ( ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRINGWITHOUTQUOTES||(LA5_0>=15 && LA5_0<=17)||(LA5_0>=27 && LA5_0<=28)||LA5_0==33||(LA5_0>=38 && LA5_0<=39)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:157:1: ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) )
            	    {
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:157:1: ( (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation ) )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:158:1: (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation )
            	    {
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:158:1: (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation )
            	    int alt4=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_STRINGWITHOUTQUOTES:
            	    case 27:
            	    case 28:
            	    case 33:
            	    case 38:
            	    case 39:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 15:
            	        {
            	        int LA4_2 = input.LA(2);

            	        if ( ((LA4_2>=38 && LA4_2<=39)) ) {
            	            alt4=2;
            	        }
            	        else if ( (LA4_2==RULE_STRING) ) {
            	            alt4=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("158:1: (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation )", 4, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 16:
            	    case 17:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("158:1: (lv_instructions_4_1= ruleModelingUnitInstruction | lv_instructions_4_2= ruleLabelReferenceInstruction | lv_instructions_4_3= ruleAdressedAnnotation )", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:159:3: lv_instructions_4_1= ruleModelingUnitInstruction
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getModelingUnitAccess().getInstructionsModelingUnitInstructionParserRuleCall_4_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleModelingUnitInstruction_in_ruleModelingUnit198);
            	            lv_instructions_4_1=ruleModelingUnitInstruction();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getModelingUnitRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"instructions",
            	            	        		lv_instructions_4_1, 
            	            	        		"ModelingUnitInstruction", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:180:8: lv_instructions_4_2= ruleLabelReferenceInstruction
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getModelingUnitAccess().getInstructionsLabelReferenceInstructionParserRuleCall_4_0_1(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleLabelReferenceInstruction_in_ruleModelingUnit217);
            	            lv_instructions_4_2=ruleLabelReferenceInstruction();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getModelingUnitRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"instructions",
            	            	        		lv_instructions_4_2, 
            	            	        		"LabelReferenceInstruction", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:201:8: lv_instructions_4_3= ruleAdressedAnnotation
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getModelingUnitAccess().getInstructionsAdressedAnnotationParserRuleCall_4_0_2(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleAdressedAnnotation_in_ruleModelingUnit236);
            	            lv_instructions_4_3=ruleAdressedAnnotation();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getModelingUnitRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"instructions",
            	            	        		lv_instructions_4_3, 
            	            	        		"AdressedAnnotation", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelingUnit


    // $ANTLR start entryRuleEString
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:235:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:236:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:237:2: iv_ruleEString= ruleEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString279);
            iv_ruleEString=ruleEString();
            _fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:244:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringWithQuotes_0= ruleStringWithQuotes | this_StringWithoutQuotes_1= RULE_STRINGWITHOUTQUOTES ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_StringWithoutQuotes_1=null;
        AntlrDatatypeRuleToken this_StringWithQuotes_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:249:6: ( (this_StringWithQuotes_0= ruleStringWithQuotes | this_StringWithoutQuotes_1= RULE_STRINGWITHOUTQUOTES ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:250:1: (this_StringWithQuotes_0= ruleStringWithQuotes | this_StringWithoutQuotes_1= RULE_STRINGWITHOUTQUOTES )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:250:1: (this_StringWithQuotes_0= ruleStringWithQuotes | this_StringWithoutQuotes_1= RULE_STRINGWITHOUTQUOTES )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRINGWITHOUTQUOTES) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("250:1: (this_StringWithQuotes_0= ruleStringWithQuotes | this_StringWithoutQuotes_1= RULE_STRINGWITHOUTQUOTES )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:251:5: this_StringWithQuotes_0= ruleStringWithQuotes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEStringAccess().getStringWithQuotesParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringWithQuotes_in_ruleEString337);
                    this_StringWithQuotes_0=ruleStringWithQuotes();
                    _fsp--;


                    		current.merge(this_StringWithQuotes_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:262:10: this_StringWithoutQuotes_1= RULE_STRINGWITHOUTQUOTES
                    {
                    this_StringWithoutQuotes_1=(Token)input.LT(1);
                    match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleEString363); 

                    		current.merge(this_StringWithoutQuotes_1);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getStringWithoutQuotesTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEString


    // $ANTLR start entryRuleStringWithQuotes
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:277:1: entryRuleStringWithQuotes returns [String current=null] : iv_ruleStringWithQuotes= ruleStringWithQuotes EOF ;
    public final String entryRuleStringWithQuotes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringWithQuotes = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:278:2: (iv_ruleStringWithQuotes= ruleStringWithQuotes EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:279:2: iv_ruleStringWithQuotes= ruleStringWithQuotes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringWithQuotesRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringWithQuotes_in_entryRuleStringWithQuotes409);
            iv_ruleStringWithQuotes=ruleStringWithQuotes();
            _fsp--;

             current =iv_ruleStringWithQuotes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringWithQuotes420); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringWithQuotes


    // $ANTLR start ruleStringWithQuotes
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:286:1: ruleStringWithQuotes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringWithQuotes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:291:6: (this_STRING_0= RULE_STRING )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:292:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringWithQuotes459); 

            		current.merge(this_STRING_0);
                
             
                createLeafNode(grammarAccess.getStringWithQuotesAccess().getSTRINGTerminalRuleCall(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringWithQuotes


    // $ANTLR start entryRuleLabelReferenceInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:309:1: entryRuleLabelReferenceInstruction returns [EObject current=null] : iv_ruleLabelReferenceInstruction= ruleLabelReferenceInstruction EOF ;
    public final EObject entryRuleLabelReferenceInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelReferenceInstruction = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:310:2: (iv_ruleLabelReferenceInstruction= ruleLabelReferenceInstruction EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:311:2: iv_ruleLabelReferenceInstruction= ruleLabelReferenceInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelReferenceInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabelReferenceInstruction_in_entryRuleLabelReferenceInstruction505);
            iv_ruleLabelReferenceInstruction=ruleLabelReferenceInstruction();
            _fsp--;

             current =iv_ruleLabelReferenceInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelReferenceInstruction515); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLabelReferenceInstruction


    // $ANTLR start ruleLabelReferenceInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:318:1: ruleLabelReferenceInstruction returns [EObject current=null] : ( '@see' ( (lv_type_1_0= ruleTypeLabel ) ) ( (lv_referencedLabel_2_0= ruleLabelDeclarationReference ) ) ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleLabelReferenceInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_3_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_referencedLabel_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:323:6: ( ( '@see' ( (lv_type_1_0= ruleTypeLabel ) ) ( (lv_referencedLabel_2_0= ruleLabelDeclarationReference ) ) ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:324:1: ( '@see' ( (lv_type_1_0= ruleTypeLabel ) ) ( (lv_referencedLabel_2_0= ruleLabelDeclarationReference ) ) ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:324:1: ( '@see' ( (lv_type_1_0= ruleTypeLabel ) ) ( (lv_referencedLabel_2_0= ruleLabelDeclarationReference ) ) ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:324:3: '@see' ( (lv_type_1_0= ruleTypeLabel ) ) ( (lv_referencedLabel_2_0= ruleLabelDeclarationReference ) ) ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            {
            match(input,15,FOLLOW_15_in_ruleLabelReferenceInstruction550); 

                    createLeafNode(grammarAccess.getLabelReferenceInstructionAccess().getSeeKeyword_0(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:328:1: ( (lv_type_1_0= ruleTypeLabel ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:329:1: (lv_type_1_0= ruleTypeLabel )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:329:1: (lv_type_1_0= ruleTypeLabel )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:330:3: lv_type_1_0= ruleTypeLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLabelReferenceInstructionAccess().getTypeTypeLabelEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeLabel_in_ruleLabelReferenceInstruction571);
            lv_type_1_0=ruleTypeLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelReferenceInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"TypeLabel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:352:2: ( (lv_referencedLabel_2_0= ruleLabelDeclarationReference ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:353:1: (lv_referencedLabel_2_0= ruleLabelDeclarationReference )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:353:1: (lv_referencedLabel_2_0= ruleLabelDeclarationReference )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:354:3: lv_referencedLabel_2_0= ruleLabelDeclarationReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLabelReferenceInstructionAccess().getReferencedLabelLabelDeclarationReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabelDeclarationReference_in_ruleLabelReferenceInstruction592);
            lv_referencedLabel_2_0=ruleLabelDeclarationReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelReferenceInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"referencedLabel",
            	        		lv_referencedLabel_2_0, 
            	        		"LabelDeclarationReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:376:2: ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LINE_BREAK) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:377:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:377:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:378:3: lv_lineBreak_3_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_3_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleLabelReferenceInstruction609); 

                    			createLeafNode(grammarAccess.getLabelReferenceInstructionAccess().getLineBreakLINE_BREAKTerminalRuleCall_3_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLabelReferenceInstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLabelReferenceInstruction


    // $ANTLR start entryRuleSectionReferenceInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:408:1: entryRuleSectionReferenceInstruction returns [EObject current=null] : iv_ruleSectionReferenceInstruction= ruleSectionReferenceInstruction EOF ;
    public final EObject entryRuleSectionReferenceInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionReferenceInstruction = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:409:2: (iv_ruleSectionReferenceInstruction= ruleSectionReferenceInstruction EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:410:2: iv_ruleSectionReferenceInstruction= ruleSectionReferenceInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionReferenceInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionReferenceInstruction_in_entryRuleSectionReferenceInstruction651);
            iv_ruleSectionReferenceInstruction=ruleSectionReferenceInstruction();
            _fsp--;

             current =iv_ruleSectionReferenceInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionReferenceInstruction661); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSectionReferenceInstruction


    // $ANTLR start ruleSectionReferenceInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:417:1: ruleSectionReferenceInstruction returns [EObject current=null] : ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleSectionReferenceInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_3_0=null;
        EObject lv_referencedObject_1_0 = null;

        AntlrDatatypeRuleToken lv_textToPrint_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:422:6: ( ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:423:1: ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:423:1: ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:423:3: '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            {
            match(input,15,FOLLOW_15_in_ruleSectionReferenceInstruction696); 

                    createLeafNode(grammarAccess.getSectionReferenceInstructionAccess().getSeeKeyword_0(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:427:1: ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:428:1: (lv_referencedObject_1_0= ruleSectionOrParagraphReference )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:428:1: (lv_referencedObject_1_0= ruleSectionOrParagraphReference )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:429:3: lv_referencedObject_1_0= ruleSectionOrParagraphReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionReferenceInstructionAccess().getReferencedObjectSectionOrParagraphReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSectionOrParagraphReference_in_ruleSectionReferenceInstruction717);
            lv_referencedObject_1_0=ruleSectionOrParagraphReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSectionReferenceInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"referencedObject",
            	        		lv_referencedObject_1_0, 
            	        		"SectionOrParagraphReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:451:2: ( (lv_textToPrint_2_0= ruleEString ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRINGWITHOUTQUOTES||LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:452:1: (lv_textToPrint_2_0= ruleEString )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:452:1: (lv_textToPrint_2_0= ruleEString )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:453:3: lv_textToPrint_2_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionReferenceInstructionAccess().getTextToPrintEStringParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleSectionReferenceInstruction738);
                    lv_textToPrint_2_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionReferenceInstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"textToPrint",
                    	        		lv_textToPrint_2_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:475:3: ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LINE_BREAK) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:476:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:476:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:477:3: lv_lineBreak_3_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_3_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleSectionReferenceInstruction756); 

                    			createLeafNode(grammarAccess.getSectionReferenceInstructionAccess().getLineBreakLINE_BREAKTerminalRuleCall_3_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionReferenceInstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionReferenceInstruction


    // $ANTLR start entryRuleAdressedAnnotation
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:507:1: entryRuleAdressedAnnotation returns [EObject current=null] : iv_ruleAdressedAnnotation= ruleAdressedAnnotation EOF ;
    public final EObject entryRuleAdressedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdressedAnnotation = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:508:2: (iv_ruleAdressedAnnotation= ruleAdressedAnnotation EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:509:2: iv_ruleAdressedAnnotation= ruleAdressedAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdressedAnnotationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAdressedAnnotation_in_entryRuleAdressedAnnotation798);
            iv_ruleAdressedAnnotation=ruleAdressedAnnotation();
            _fsp--;

             current =iv_ruleAdressedAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdressedAnnotation808); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAdressedAnnotation


    // $ANTLR start ruleAdressedAnnotation
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:516:1: ruleAdressedAnnotation returns [EObject current=null] : ( ( (lv_lineBreak_0_0= 'lineBreak' ) )? 'AdressedAnnotation' '{' 'receiver' '{' ( (lv_receiver_5_0= ruleEString ) ) ( ',' ( (lv_receiver_7_0= ruleEString ) ) )* '}' 'source' ( (lv_source_10_0= ruleEString ) ) 'message' ( (lv_message_12_0= ruleEString ) ) 'type' ( (lv_type_14_0= ruleEString ) ) '}' ) ;
    public final EObject ruleAdressedAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_0_0=null;
        AntlrDatatypeRuleToken lv_receiver_5_0 = null;

        AntlrDatatypeRuleToken lv_receiver_7_0 = null;

        AntlrDatatypeRuleToken lv_source_10_0 = null;

        AntlrDatatypeRuleToken lv_message_12_0 = null;

        AntlrDatatypeRuleToken lv_type_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:521:6: ( ( ( (lv_lineBreak_0_0= 'lineBreak' ) )? 'AdressedAnnotation' '{' 'receiver' '{' ( (lv_receiver_5_0= ruleEString ) ) ( ',' ( (lv_receiver_7_0= ruleEString ) ) )* '}' 'source' ( (lv_source_10_0= ruleEString ) ) 'message' ( (lv_message_12_0= ruleEString ) ) 'type' ( (lv_type_14_0= ruleEString ) ) '}' ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:522:1: ( ( (lv_lineBreak_0_0= 'lineBreak' ) )? 'AdressedAnnotation' '{' 'receiver' '{' ( (lv_receiver_5_0= ruleEString ) ) ( ',' ( (lv_receiver_7_0= ruleEString ) ) )* '}' 'source' ( (lv_source_10_0= ruleEString ) ) 'message' ( (lv_message_12_0= ruleEString ) ) 'type' ( (lv_type_14_0= ruleEString ) ) '}' )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:522:1: ( ( (lv_lineBreak_0_0= 'lineBreak' ) )? 'AdressedAnnotation' '{' 'receiver' '{' ( (lv_receiver_5_0= ruleEString ) ) ( ',' ( (lv_receiver_7_0= ruleEString ) ) )* '}' 'source' ( (lv_source_10_0= ruleEString ) ) 'message' ( (lv_message_12_0= ruleEString ) ) 'type' ( (lv_type_14_0= ruleEString ) ) '}' )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:522:2: ( (lv_lineBreak_0_0= 'lineBreak' ) )? 'AdressedAnnotation' '{' 'receiver' '{' ( (lv_receiver_5_0= ruleEString ) ) ( ',' ( (lv_receiver_7_0= ruleEString ) ) )* '}' 'source' ( (lv_source_10_0= ruleEString ) ) 'message' ( (lv_message_12_0= ruleEString ) ) 'type' ( (lv_type_14_0= ruleEString ) ) '}'
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:522:2: ( (lv_lineBreak_0_0= 'lineBreak' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:523:1: (lv_lineBreak_0_0= 'lineBreak' )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:523:1: (lv_lineBreak_0_0= 'lineBreak' )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:524:3: lv_lineBreak_0_0= 'lineBreak'
                    {
                    lv_lineBreak_0_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleAdressedAnnotation851); 

                            createLeafNode(grammarAccess.getAdressedAnnotationAccess().getLineBreakLineBreakKeyword_0_0(), "lineBreak"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAdressedAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "lineBreak", true, "lineBreak", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleAdressedAnnotation875); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getAdressedAnnotationKeyword_1(), null); 
                
            match(input,18,FOLLOW_18_in_ruleAdressedAnnotation885); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,19,FOLLOW_19_in_ruleAdressedAnnotation895); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getReceiverKeyword_3(), null); 
                
            match(input,18,FOLLOW_18_in_ruleAdressedAnnotation905); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:559:1: ( (lv_receiver_5_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:560:1: (lv_receiver_5_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:560:1: (lv_receiver_5_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:561:3: lv_receiver_5_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAdressedAnnotationAccess().getReceiverEStringParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAdressedAnnotation926);
            lv_receiver_5_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdressedAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"receiver",
            	        		lv_receiver_5_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:583:2: ( ',' ( (lv_receiver_7_0= ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:583:4: ',' ( (lv_receiver_7_0= ruleEString ) )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleAdressedAnnotation937); 

            	            createLeafNode(grammarAccess.getAdressedAnnotationAccess().getCommaKeyword_6_0(), null); 
            	        
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:587:1: ( (lv_receiver_7_0= ruleEString ) )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:588:1: (lv_receiver_7_0= ruleEString )
            	    {
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:588:1: (lv_receiver_7_0= ruleEString )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:589:3: lv_receiver_7_0= ruleEString
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdressedAnnotationAccess().getReceiverEStringParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleAdressedAnnotation958);
            	    lv_receiver_7_0=ruleEString();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAdressedAnnotationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"receiver",
            	    	        		lv_receiver_7_0, 
            	    	        		"EString", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleAdressedAnnotation970); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getRightCurlyBracketKeyword_7(), null); 
                
            match(input,22,FOLLOW_22_in_ruleAdressedAnnotation980); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getSourceKeyword_8(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:619:1: ( (lv_source_10_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:620:1: (lv_source_10_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:620:1: (lv_source_10_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:621:3: lv_source_10_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAdressedAnnotationAccess().getSourceEStringParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAdressedAnnotation1001);
            lv_source_10_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdressedAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"source",
            	        		lv_source_10_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleAdressedAnnotation1011); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getMessageKeyword_10(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:647:1: ( (lv_message_12_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:648:1: (lv_message_12_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:648:1: (lv_message_12_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:649:3: lv_message_12_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAdressedAnnotationAccess().getMessageEStringParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAdressedAnnotation1032);
            lv_message_12_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdressedAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_12_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleAdressedAnnotation1042); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getTypeKeyword_12(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:675:1: ( (lv_type_14_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:676:1: (lv_type_14_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:676:1: (lv_type_14_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:677:3: lv_type_14_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAdressedAnnotationAccess().getTypeEStringParserRuleCall_13_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAdressedAnnotation1063);
            lv_type_14_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdressedAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_14_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleAdressedAnnotation1073); 

                    createLeafNode(grammarAccess.getAdressedAnnotationAccess().getRightCurlyBracketKeyword_14(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAdressedAnnotation


    // $ANTLR start entryRuleSectionOrParagraphReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:711:1: entryRuleSectionOrParagraphReference returns [EObject current=null] : iv_ruleSectionOrParagraphReference= ruleSectionOrParagraphReference EOF ;
    public final EObject entryRuleSectionOrParagraphReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionOrParagraphReference = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:712:2: (iv_ruleSectionOrParagraphReference= ruleSectionOrParagraphReference EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:713:2: iv_ruleSectionOrParagraphReference= ruleSectionOrParagraphReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionOrParagraphReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionOrParagraphReference_in_entryRuleSectionOrParagraphReference1109);
            iv_ruleSectionOrParagraphReference=ruleSectionOrParagraphReference();
            _fsp--;

             current =iv_ruleSectionOrParagraphReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionOrParagraphReference1119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSectionOrParagraphReference


    // $ANTLR start ruleSectionOrParagraphReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:720:1: ruleSectionOrParagraphReference returns [EObject current=null] : ( (lv_IntentHref_0_0= ruleStringWithQuotes ) ) ;
    public final EObject ruleSectionOrParagraphReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_IntentHref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:725:6: ( ( (lv_IntentHref_0_0= ruleStringWithQuotes ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:726:1: ( (lv_IntentHref_0_0= ruleStringWithQuotes ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:726:1: ( (lv_IntentHref_0_0= ruleStringWithQuotes ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:727:1: (lv_IntentHref_0_0= ruleStringWithQuotes )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:727:1: (lv_IntentHref_0_0= ruleStringWithQuotes )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:728:3: lv_IntentHref_0_0= ruleStringWithQuotes
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionOrParagraphReferenceAccess().getIntentHrefStringWithQuotesParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStringWithQuotes_in_ruleSectionOrParagraphReference1164);
            lv_IntentHref_0_0=ruleStringWithQuotes();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSectionOrParagraphReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"IntentHref",
            	        		lv_IntentHref_0_0, 
            	        		"StringWithQuotes", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionOrParagraphReference


    // $ANTLR start entryRuleLabelDeclarationReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:760:1: entryRuleLabelDeclarationReference returns [EObject current=null] : iv_ruleLabelDeclarationReference= ruleLabelDeclarationReference EOF ;
    public final EObject entryRuleLabelDeclarationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDeclarationReference = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:761:2: (iv_ruleLabelDeclarationReference= ruleLabelDeclarationReference EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:762:2: iv_ruleLabelDeclarationReference= ruleLabelDeclarationReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelDeclarationReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabelDeclarationReference_in_entryRuleLabelDeclarationReference1201);
            iv_ruleLabelDeclarationReference=ruleLabelDeclarationReference();
            _fsp--;

             current =iv_ruleLabelDeclarationReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelDeclarationReference1211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLabelDeclarationReference


    // $ANTLR start ruleLabelDeclarationReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:769:1: ruleLabelDeclarationReference returns [EObject current=null] : ( 'href' ( (lv_IntentHref_1_0= ruleEString ) ) ( 'referencedElement' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleLabelDeclarationReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_IntentHref_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:774:6: ( ( 'href' ( (lv_IntentHref_1_0= ruleEString ) ) ( 'referencedElement' ( ( ruleEString ) ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:775:1: ( 'href' ( (lv_IntentHref_1_0= ruleEString ) ) ( 'referencedElement' ( ( ruleEString ) ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:775:1: ( 'href' ( (lv_IntentHref_1_0= ruleEString ) ) ( 'referencedElement' ( ( ruleEString ) ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:775:3: 'href' ( (lv_IntentHref_1_0= ruleEString ) ) ( 'referencedElement' ( ( ruleEString ) ) )?
            {
            match(input,25,FOLLOW_25_in_ruleLabelDeclarationReference1246); 

                    createLeafNode(grammarAccess.getLabelDeclarationReferenceAccess().getHrefKeyword_0(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:779:1: ( (lv_IntentHref_1_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:780:1: (lv_IntentHref_1_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:780:1: (lv_IntentHref_1_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:781:3: lv_IntentHref_1_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLabelDeclarationReferenceAccess().getIntentHrefEStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleLabelDeclarationReference1267);
            lv_IntentHref_1_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelDeclarationReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"IntentHref",
            	        		lv_IntentHref_1_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:803:2: ( 'referencedElement' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:803:4: 'referencedElement' ( ( ruleEString ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleLabelDeclarationReference1278); 

                            createLeafNode(grammarAccess.getLabelDeclarationReferenceAccess().getReferencedElementKeyword_2_0(), null); 
                        
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:807:1: ( ( ruleEString ) )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:808:1: ( ruleEString )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:808:1: ( ruleEString )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:809:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getLabelDeclarationReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLabelDeclarationReferenceAccess().getReferencedElementLabelDeclarationCrossReference_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleLabelDeclarationReference1301);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLabelDeclarationReference


    // $ANTLR start entryRuleModelingUnitInstructionReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:831:1: entryRuleModelingUnitInstructionReference returns [EObject current=null] : iv_ruleModelingUnitInstructionReference= ruleModelingUnitInstructionReference EOF ;
    public final EObject entryRuleModelingUnitInstructionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelingUnitInstructionReference = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:832:2: (iv_ruleModelingUnitInstructionReference= ruleModelingUnitInstructionReference EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:833:2: iv_ruleModelingUnitInstructionReference= ruleModelingUnitInstructionReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelingUnitInstructionReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelingUnitInstructionReference_in_entryRuleModelingUnitInstructionReference1339);
            iv_ruleModelingUnitInstructionReference=ruleModelingUnitInstructionReference();
            _fsp--;

             current =iv_ruleModelingUnitInstructionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelingUnitInstructionReference1349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModelingUnitInstructionReference


    // $ANTLR start ruleModelingUnitInstructionReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:840:1: ruleModelingUnitInstructionReference returns [EObject current=null] : this_ModelingUnitInstructionReference_Impl_0= ruleModelingUnitInstructionReference_Impl ;
    public final EObject ruleModelingUnitInstructionReference() throws RecognitionException {
        EObject current = null;

        EObject this_ModelingUnitInstructionReference_Impl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:845:6: (this_ModelingUnitInstructionReference_Impl_0= ruleModelingUnitInstructionReference_Impl )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:847:5: this_ModelingUnitInstructionReference_Impl_0= ruleModelingUnitInstructionReference_Impl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getModelingUnitInstructionReferenceAccess().getModelingUnitInstructionReference_ImplParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleModelingUnitInstructionReference_Impl_in_ruleModelingUnitInstructionReference1395);
            this_ModelingUnitInstructionReference_Impl_0=ruleModelingUnitInstructionReference_Impl();
            _fsp--;

             
                    current = this_ModelingUnitInstructionReference_Impl_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelingUnitInstructionReference


    // $ANTLR start entryRuleModelingUnitInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:863:1: entryRuleModelingUnitInstruction returns [EObject current=null] : iv_ruleModelingUnitInstruction= ruleModelingUnitInstruction EOF ;
    public final EObject entryRuleModelingUnitInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelingUnitInstruction = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:864:2: (iv_ruleModelingUnitInstruction= ruleModelingUnitInstruction EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:865:2: iv_ruleModelingUnitInstruction= ruleModelingUnitInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelingUnitInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelingUnitInstruction_in_entryRuleModelingUnitInstruction1429);
            iv_ruleModelingUnitInstruction=ruleModelingUnitInstruction();
            _fsp--;

             current =iv_ruleModelingUnitInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelingUnitInstruction1439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModelingUnitInstruction


    // $ANTLR start ruleModelingUnitInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:872:1: ruleModelingUnitInstruction returns [EObject current=null] : (this_InstanceLevelInstruction_0= ruleInstanceLevelInstruction | this_ResourceDeclaration_1= ruleResourceDeclaration | this_ContributionInstruction_2= ruleContributionInstruction | this_AnnotationDeclaration_3= ruleAnnotationDeclaration | this_SectionReferenceinModelingUnit_4= ruleSectionReferenceinModelingUnit | this_LabelinModelingUnit_5= ruleLabelinModelingUnit ) ;
    public final EObject ruleModelingUnitInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_InstanceLevelInstruction_0 = null;

        EObject this_ResourceDeclaration_1 = null;

        EObject this_ContributionInstruction_2 = null;

        EObject this_AnnotationDeclaration_3 = null;

        EObject this_SectionReferenceinModelingUnit_4 = null;

        EObject this_LabelinModelingUnit_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:877:6: ( (this_InstanceLevelInstruction_0= ruleInstanceLevelInstruction | this_ResourceDeclaration_1= ruleResourceDeclaration | this_ContributionInstruction_2= ruleContributionInstruction | this_AnnotationDeclaration_3= ruleAnnotationDeclaration | this_SectionReferenceinModelingUnit_4= ruleSectionReferenceinModelingUnit | this_LabelinModelingUnit_5= ruleLabelinModelingUnit ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:878:1: (this_InstanceLevelInstruction_0= ruleInstanceLevelInstruction | this_ResourceDeclaration_1= ruleResourceDeclaration | this_ContributionInstruction_2= ruleContributionInstruction | this_AnnotationDeclaration_3= ruleAnnotationDeclaration | this_SectionReferenceinModelingUnit_4= ruleSectionReferenceinModelingUnit | this_LabelinModelingUnit_5= ruleLabelinModelingUnit )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:878:1: (this_InstanceLevelInstruction_0= ruleInstanceLevelInstruction | this_ResourceDeclaration_1= ruleResourceDeclaration | this_ContributionInstruction_2= ruleContributionInstruction | this_AnnotationDeclaration_3= ruleAnnotationDeclaration | this_SectionReferenceinModelingUnit_4= ruleSectionReferenceinModelingUnit | this_LabelinModelingUnit_5= ruleLabelinModelingUnit )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case RULE_STRINGWITHOUTQUOTES:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==18) ) {
                    alt13=3;
                }
                else if ( (LA13_2==32||LA13_2==37) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("878:1: (this_InstanceLevelInstruction_0= ruleInstanceLevelInstruction | this_ResourceDeclaration_1= ruleResourceDeclaration | this_ContributionInstruction_2= ruleContributionInstruction | this_AnnotationDeclaration_3= ruleAnnotationDeclaration | this_SectionReferenceinModelingUnit_4= ruleSectionReferenceinModelingUnit | this_LabelinModelingUnit_5= ruleLabelinModelingUnit )", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 15:
                {
                alt13=5;
                }
                break;
            case 38:
            case 39:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("878:1: (this_InstanceLevelInstruction_0= ruleInstanceLevelInstruction | this_ResourceDeclaration_1= ruleResourceDeclaration | this_ContributionInstruction_2= ruleContributionInstruction | this_AnnotationDeclaration_3= ruleAnnotationDeclaration | this_SectionReferenceinModelingUnit_4= ruleSectionReferenceinModelingUnit | this_LabelinModelingUnit_5= ruleLabelinModelingUnit )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:879:5: this_InstanceLevelInstruction_0= ruleInstanceLevelInstruction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelingUnitInstructionAccess().getInstanceLevelInstructionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInstanceLevelInstruction_in_ruleModelingUnitInstruction1486);
                    this_InstanceLevelInstruction_0=ruleInstanceLevelInstruction();
                    _fsp--;

                     
                            current = this_InstanceLevelInstruction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:889:5: this_ResourceDeclaration_1= ruleResourceDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelingUnitInstructionAccess().getResourceDeclarationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResourceDeclaration_in_ruleModelingUnitInstruction1513);
                    this_ResourceDeclaration_1=ruleResourceDeclaration();
                    _fsp--;

                     
                            current = this_ResourceDeclaration_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:899:5: this_ContributionInstruction_2= ruleContributionInstruction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelingUnitInstructionAccess().getContributionInstructionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContributionInstruction_in_ruleModelingUnitInstruction1540);
                    this_ContributionInstruction_2=ruleContributionInstruction();
                    _fsp--;

                     
                            current = this_ContributionInstruction_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:909:5: this_AnnotationDeclaration_3= ruleAnnotationDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelingUnitInstructionAccess().getAnnotationDeclarationParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnnotationDeclaration_in_ruleModelingUnitInstruction1567);
                    this_AnnotationDeclaration_3=ruleAnnotationDeclaration();
                    _fsp--;

                     
                            current = this_AnnotationDeclaration_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:919:5: this_SectionReferenceinModelingUnit_4= ruleSectionReferenceinModelingUnit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelingUnitInstructionAccess().getSectionReferenceinModelingUnitParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSectionReferenceinModelingUnit_in_ruleModelingUnitInstruction1594);
                    this_SectionReferenceinModelingUnit_4=ruleSectionReferenceinModelingUnit();
                    _fsp--;

                     
                            current = this_SectionReferenceinModelingUnit_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:929:5: this_LabelinModelingUnit_5= ruleLabelinModelingUnit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelingUnitInstructionAccess().getLabelinModelingUnitParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabelinModelingUnit_in_ruleModelingUnitInstruction1621);
                    this_LabelinModelingUnit_5=ruleLabelinModelingUnit();
                    _fsp--;

                     
                            current = this_LabelinModelingUnit_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelingUnitInstruction


    // $ANTLR start entryRuleInstanceLevelInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:945:1: entryRuleInstanceLevelInstruction returns [EObject current=null] : iv_ruleInstanceLevelInstruction= ruleInstanceLevelInstruction EOF ;
    public final EObject entryRuleInstanceLevelInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceLevelInstruction = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:946:2: (iv_ruleInstanceLevelInstruction= ruleInstanceLevelInstruction EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:947:2: iv_ruleInstanceLevelInstruction= ruleInstanceLevelInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanceLevelInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstanceLevelInstruction_in_entryRuleInstanceLevelInstruction1656);
            iv_ruleInstanceLevelInstruction=ruleInstanceLevelInstruction();
            _fsp--;

             current =iv_ruleInstanceLevelInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceLevelInstruction1666); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstanceLevelInstruction


    // $ANTLR start ruleInstanceLevelInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:954:1: ruleInstanceLevelInstruction returns [EObject current=null] : (this_InstanciationInstruction_0= ruleInstanciationInstruction | this_StructuralFeatureAffectation_1= ruleStructuralFeatureAffectation ) ;
    public final EObject ruleInstanceLevelInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_InstanciationInstruction_0 = null;

        EObject this_StructuralFeatureAffectation_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:959:6: ( (this_InstanciationInstruction_0= ruleInstanciationInstruction | this_StructuralFeatureAffectation_1= ruleStructuralFeatureAffectation ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:960:1: (this_InstanciationInstruction_0= ruleInstanciationInstruction | this_StructuralFeatureAffectation_1= ruleStructuralFeatureAffectation )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:960:1: (this_InstanciationInstruction_0= ruleInstanciationInstruction | this_StructuralFeatureAffectation_1= ruleStructuralFeatureAffectation )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRINGWITHOUTQUOTES) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("960:1: (this_InstanciationInstruction_0= ruleInstanciationInstruction | this_StructuralFeatureAffectation_1= ruleStructuralFeatureAffectation )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:961:5: this_InstanciationInstruction_0= ruleInstanciationInstruction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstanceLevelInstructionAccess().getInstanciationInstructionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInstanciationInstruction_in_ruleInstanceLevelInstruction1713);
                    this_InstanciationInstruction_0=ruleInstanciationInstruction();
                    _fsp--;

                     
                            current = this_InstanciationInstruction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:971:5: this_StructuralFeatureAffectation_1= ruleStructuralFeatureAffectation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstanceLevelInstructionAccess().getStructuralFeatureAffectationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructuralFeatureAffectation_in_ruleInstanceLevelInstruction1740);
                    this_StructuralFeatureAffectation_1=ruleStructuralFeatureAffectation();
                    _fsp--;

                     
                            current = this_StructuralFeatureAffectation_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstanceLevelInstruction


    // $ANTLR start entryRuleValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:987:1: entryRuleValueForStructuralFeature returns [EObject current=null] : iv_ruleValueForStructuralFeature= ruleValueForStructuralFeature EOF ;
    public final EObject entryRuleValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueForStructuralFeature = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:988:2: (iv_ruleValueForStructuralFeature= ruleValueForStructuralFeature EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:989:2: iv_ruleValueForStructuralFeature= ruleValueForStructuralFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueForStructuralFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleValueForStructuralFeature_in_entryRuleValueForStructuralFeature1775);
            iv_ruleValueForStructuralFeature=ruleValueForStructuralFeature();
            _fsp--;

             current =iv_ruleValueForStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueForStructuralFeature1785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValueForStructuralFeature


    // $ANTLR start ruleValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:996:1: ruleValueForStructuralFeature returns [EObject current=null] : (this_NativeValueForStructuralFeature_0= ruleNativeValueForStructuralFeature | this_ReferenceValueForStructuralFeature_1= ruleReferenceValueForStructuralFeature | this_NewObjectValueForStructuralFeature_2= ruleNewObjectValueForStructuralFeature ) ;
    public final EObject ruleValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_NativeValueForStructuralFeature_0 = null;

        EObject this_ReferenceValueForStructuralFeature_1 = null;

        EObject this_NewObjectValueForStructuralFeature_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1001:6: ( (this_NativeValueForStructuralFeature_0= ruleNativeValueForStructuralFeature | this_ReferenceValueForStructuralFeature_1= ruleReferenceValueForStructuralFeature | this_NewObjectValueForStructuralFeature_2= ruleNewObjectValueForStructuralFeature ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1002:1: (this_NativeValueForStructuralFeature_0= ruleNativeValueForStructuralFeature | this_ReferenceValueForStructuralFeature_1= ruleReferenceValueForStructuralFeature | this_NewObjectValueForStructuralFeature_2= ruleNewObjectValueForStructuralFeature )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1002:1: (this_NativeValueForStructuralFeature_0= ruleNativeValueForStructuralFeature | this_ReferenceValueForStructuralFeature_1= ruleReferenceValueForStructuralFeature | this_NewObjectValueForStructuralFeature_2= ruleNewObjectValueForStructuralFeature )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_STRINGWITHOUTQUOTES:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1002:1: (this_NativeValueForStructuralFeature_0= ruleNativeValueForStructuralFeature | this_ReferenceValueForStructuralFeature_1= ruleReferenceValueForStructuralFeature | this_NewObjectValueForStructuralFeature_2= ruleNewObjectValueForStructuralFeature )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1003:5: this_NativeValueForStructuralFeature_0= ruleNativeValueForStructuralFeature
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueForStructuralFeatureAccess().getNativeValueForStructuralFeatureParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNativeValueForStructuralFeature_in_ruleValueForStructuralFeature1832);
                    this_NativeValueForStructuralFeature_0=ruleNativeValueForStructuralFeature();
                    _fsp--;

                     
                            current = this_NativeValueForStructuralFeature_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1013:5: this_ReferenceValueForStructuralFeature_1= ruleReferenceValueForStructuralFeature
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueForStructuralFeatureAccess().getReferenceValueForStructuralFeatureParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReferenceValueForStructuralFeature_in_ruleValueForStructuralFeature1859);
                    this_ReferenceValueForStructuralFeature_1=ruleReferenceValueForStructuralFeature();
                    _fsp--;

                     
                            current = this_ReferenceValueForStructuralFeature_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1023:5: this_NewObjectValueForStructuralFeature_2= ruleNewObjectValueForStructuralFeature
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueForStructuralFeatureAccess().getNewObjectValueForStructuralFeatureParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNewObjectValueForStructuralFeature_in_ruleValueForStructuralFeature1886);
                    this_NewObjectValueForStructuralFeature_2=ruleNewObjectValueForStructuralFeature();
                    _fsp--;

                     
                            current = this_NewObjectValueForStructuralFeature_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValueForStructuralFeature


    // $ANTLR start entryRuleModelingUnitInstructionReference_Impl
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1039:1: entryRuleModelingUnitInstructionReference_Impl returns [EObject current=null] : iv_ruleModelingUnitInstructionReference_Impl= ruleModelingUnitInstructionReference_Impl EOF ;
    public final EObject entryRuleModelingUnitInstructionReference_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelingUnitInstructionReference_Impl = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1040:2: (iv_ruleModelingUnitInstructionReference_Impl= ruleModelingUnitInstructionReference_Impl EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1041:2: iv_ruleModelingUnitInstructionReference_Impl= ruleModelingUnitInstructionReference_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelingUnitInstructionReference_ImplRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelingUnitInstructionReference_Impl_in_entryRuleModelingUnitInstructionReference_Impl1921);
            iv_ruleModelingUnitInstructionReference_Impl=ruleModelingUnitInstructionReference_Impl();
            _fsp--;

             current =iv_ruleModelingUnitInstructionReference_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelingUnitInstructionReference_Impl1931); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModelingUnitInstructionReference_Impl


    // $ANTLR start ruleModelingUnitInstructionReference_Impl
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1048:1: ruleModelingUnitInstructionReference_Impl returns [EObject current=null] : ( (lv_IntentHref_0_0= RULE_STRINGWITHOUTQUOTES ) ) ;
    public final EObject ruleModelingUnitInstructionReference_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_IntentHref_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1053:6: ( ( (lv_IntentHref_0_0= RULE_STRINGWITHOUTQUOTES ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1054:1: ( (lv_IntentHref_0_0= RULE_STRINGWITHOUTQUOTES ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1054:1: ( (lv_IntentHref_0_0= RULE_STRINGWITHOUTQUOTES ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1055:1: (lv_IntentHref_0_0= RULE_STRINGWITHOUTQUOTES )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1055:1: (lv_IntentHref_0_0= RULE_STRINGWITHOUTQUOTES )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1056:3: lv_IntentHref_0_0= RULE_STRINGWITHOUTQUOTES
            {
            lv_IntentHref_0_0=(Token)input.LT(1);
            match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleModelingUnitInstructionReference_Impl1972); 

            			createLeafNode(grammarAccess.getModelingUnitInstructionReference_ImplAccess().getIntentHrefStringWithoutQuotesTerminalRuleCall_0(), "IntentHref"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelingUnitInstructionReference_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"IntentHref",
            	        		lv_IntentHref_0_0, 
            	        		"StringWithoutQuotes", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelingUnitInstructionReference_Impl


    // $ANTLR start entryRuleSectionReferenceinModelingUnit
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1086:1: entryRuleSectionReferenceinModelingUnit returns [EObject current=null] : iv_ruleSectionReferenceinModelingUnit= ruleSectionReferenceinModelingUnit EOF ;
    public final EObject entryRuleSectionReferenceinModelingUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionReferenceinModelingUnit = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1087:2: (iv_ruleSectionReferenceinModelingUnit= ruleSectionReferenceinModelingUnit EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1088:2: iv_ruleSectionReferenceinModelingUnit= ruleSectionReferenceinModelingUnit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionReferenceinModelingUnitRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionReferenceinModelingUnit_in_entryRuleSectionReferenceinModelingUnit2012);
            iv_ruleSectionReferenceinModelingUnit=ruleSectionReferenceinModelingUnit();
            _fsp--;

             current =iv_ruleSectionReferenceinModelingUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionReferenceinModelingUnit2022); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSectionReferenceinModelingUnit


    // $ANTLR start ruleSectionReferenceinModelingUnit
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1095:1: ruleSectionReferenceinModelingUnit returns [EObject current=null] : ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleSectionReferenceinModelingUnit() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_3_0=null;
        EObject lv_referencedObject_1_0 = null;

        AntlrDatatypeRuleToken lv_textToPrint_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1100:6: ( ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1101:1: ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1101:1: ( '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1101:3: '@see' ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            {
            match(input,15,FOLLOW_15_in_ruleSectionReferenceinModelingUnit2057); 

                    createLeafNode(grammarAccess.getSectionReferenceinModelingUnitAccess().getSeeKeyword_0(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1105:1: ( (lv_referencedObject_1_0= ruleSectionOrParagraphReference ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1106:1: (lv_referencedObject_1_0= ruleSectionOrParagraphReference )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1106:1: (lv_referencedObject_1_0= ruleSectionOrParagraphReference )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1107:3: lv_referencedObject_1_0= ruleSectionOrParagraphReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionReferenceinModelingUnitAccess().getReferencedObjectSectionOrParagraphReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSectionOrParagraphReference_in_ruleSectionReferenceinModelingUnit2078);
            lv_referencedObject_1_0=ruleSectionOrParagraphReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSectionReferenceinModelingUnitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"referencedObject",
            	        		lv_referencedObject_1_0, 
            	        		"SectionOrParagraphReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1129:2: ( (lv_textToPrint_2_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRINGWITHOUTQUOTES) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||(LA16_2>=RULE_STRINGWITHOUTQUOTES && LA16_2<=RULE_LINE_BREAK)||(LA16_2>=15 && LA16_2<=17)||LA16_2==21||(LA16_2>=27 && LA16_2<=28)||LA16_2==33||(LA16_2>=38 && LA16_2<=39)) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1130:1: (lv_textToPrint_2_0= ruleEString )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1130:1: (lv_textToPrint_2_0= ruleEString )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1131:3: lv_textToPrint_2_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionReferenceinModelingUnitAccess().getTextToPrintEStringParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleSectionReferenceinModelingUnit2099);
                    lv_textToPrint_2_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionReferenceinModelingUnitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"textToPrint",
                    	        		lv_textToPrint_2_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1153:3: ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LINE_BREAK) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1154:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1154:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1155:3: lv_lineBreak_3_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_3_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleSectionReferenceinModelingUnit2117); 

                    			createLeafNode(grammarAccess.getSectionReferenceinModelingUnitAccess().getLineBreakLINE_BREAKTerminalRuleCall_3_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionReferenceinModelingUnitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionReferenceinModelingUnit


    // $ANTLR start entryRuleLabelinModelingUnit
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1185:1: entryRuleLabelinModelingUnit returns [EObject current=null] : iv_ruleLabelinModelingUnit= ruleLabelinModelingUnit EOF ;
    public final EObject entryRuleLabelinModelingUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelinModelingUnit = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1186:2: (iv_ruleLabelinModelingUnit= ruleLabelinModelingUnit EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1187:2: iv_ruleLabelinModelingUnit= ruleLabelinModelingUnit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelinModelingUnitRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabelinModelingUnit_in_entryRuleLabelinModelingUnit2159);
            iv_ruleLabelinModelingUnit=ruleLabelinModelingUnit();
            _fsp--;

             current =iv_ruleLabelinModelingUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelinModelingUnit2169); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLabelinModelingUnit


    // $ANTLR start ruleLabelinModelingUnit
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1194:1: ruleLabelinModelingUnit returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeLabel ) ) ( (lv_labelValue_1_0= ruleEString ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleLabelinModelingUnit() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_3_0=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_labelValue_1_0 = null;

        AntlrDatatypeRuleToken lv_textToPrint_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1199:6: ( ( ( (lv_type_0_0= ruleTypeLabel ) ) ( (lv_labelValue_1_0= ruleEString ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1200:1: ( ( (lv_type_0_0= ruleTypeLabel ) ) ( (lv_labelValue_1_0= ruleEString ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1200:1: ( ( (lv_type_0_0= ruleTypeLabel ) ) ( (lv_labelValue_1_0= ruleEString ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1200:2: ( (lv_type_0_0= ruleTypeLabel ) ) ( (lv_labelValue_1_0= ruleEString ) ) ( (lv_textToPrint_2_0= ruleEString ) )? ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1200:2: ( (lv_type_0_0= ruleTypeLabel ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1201:1: (lv_type_0_0= ruleTypeLabel )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1201:1: (lv_type_0_0= ruleTypeLabel )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1202:3: lv_type_0_0= ruleTypeLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLabelinModelingUnitAccess().getTypeTypeLabelEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeLabel_in_ruleLabelinModelingUnit2215);
            lv_type_0_0=ruleTypeLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelinModelingUnitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"TypeLabel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1224:2: ( (lv_labelValue_1_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1225:1: (lv_labelValue_1_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1225:1: (lv_labelValue_1_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1226:3: lv_labelValue_1_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLabelinModelingUnitAccess().getLabelValueEStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleLabelinModelingUnit2236);
            lv_labelValue_1_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelinModelingUnitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"labelValue",
            	        		lv_labelValue_1_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1248:2: ( (lv_textToPrint_2_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRINGWITHOUTQUOTES) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EOF||(LA18_2>=RULE_STRINGWITHOUTQUOTES && LA18_2<=RULE_LINE_BREAK)||(LA18_2>=15 && LA18_2<=17)||LA18_2==21||(LA18_2>=27 && LA18_2<=28)||LA18_2==33||(LA18_2>=38 && LA18_2<=39)) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1249:1: (lv_textToPrint_2_0= ruleEString )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1249:1: (lv_textToPrint_2_0= ruleEString )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1250:3: lv_textToPrint_2_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLabelinModelingUnitAccess().getTextToPrintEStringParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleLabelinModelingUnit2257);
                    lv_textToPrint_2_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLabelinModelingUnitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"textToPrint",
                    	        		lv_textToPrint_2_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1272:3: ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LINE_BREAK) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1273:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1273:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1274:3: lv_lineBreak_3_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_3_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleLabelinModelingUnit2275); 

                    			createLeafNode(grammarAccess.getLabelinModelingUnitAccess().getLineBreakLINE_BREAKTerminalRuleCall_3_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLabelinModelingUnitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLabelinModelingUnit


    // $ANTLR start entryRuleAnnotationDeclaration
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1304:1: entryRuleAnnotationDeclaration returns [EObject current=null] : iv_ruleAnnotationDeclaration= ruleAnnotationDeclaration EOF ;
    public final EObject entryRuleAnnotationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationDeclaration = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1305:2: (iv_ruleAnnotationDeclaration= ruleAnnotationDeclaration EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1306:2: iv_ruleAnnotationDeclaration= ruleAnnotationDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationDeclaration_in_entryRuleAnnotationDeclaration2317);
            iv_ruleAnnotationDeclaration=ruleAnnotationDeclaration();
            _fsp--;

             current =iv_ruleAnnotationDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationDeclaration2327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationDeclaration


    // $ANTLR start ruleAnnotationDeclaration
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1313:1: ruleAnnotationDeclaration returns [EObject current=null] : ( '@Annotation' ( (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES ) ) ( (lv_map_2_0= ruleKeyValForAnnotation ) ) ( ',' ( (lv_map_4_0= ruleKeyValForAnnotation ) ) )* ( (lv_lineBreak_5_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleAnnotationDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_annotationID_1_0=null;
        Token lv_lineBreak_5_0=null;
        EObject lv_map_2_0 = null;

        EObject lv_map_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1318:6: ( ( '@Annotation' ( (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES ) ) ( (lv_map_2_0= ruleKeyValForAnnotation ) ) ( ',' ( (lv_map_4_0= ruleKeyValForAnnotation ) ) )* ( (lv_lineBreak_5_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1319:1: ( '@Annotation' ( (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES ) ) ( (lv_map_2_0= ruleKeyValForAnnotation ) ) ( ',' ( (lv_map_4_0= ruleKeyValForAnnotation ) ) )* ( (lv_lineBreak_5_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1319:1: ( '@Annotation' ( (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES ) ) ( (lv_map_2_0= ruleKeyValForAnnotation ) ) ( ',' ( (lv_map_4_0= ruleKeyValForAnnotation ) ) )* ( (lv_lineBreak_5_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1319:3: '@Annotation' ( (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES ) ) ( (lv_map_2_0= ruleKeyValForAnnotation ) ) ( ',' ( (lv_map_4_0= ruleKeyValForAnnotation ) ) )* ( (lv_lineBreak_5_0= RULE_LINE_BREAK ) )?
            {
            match(input,27,FOLLOW_27_in_ruleAnnotationDeclaration2362); 

                    createLeafNode(grammarAccess.getAnnotationDeclarationAccess().getAnnotationKeyword_0(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1323:1: ( (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1324:1: (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1324:1: (lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1325:3: lv_annotationID_1_0= RULE_STRINGWITHOUTQUOTES
            {
            lv_annotationID_1_0=(Token)input.LT(1);
            match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleAnnotationDeclaration2379); 

            			createLeafNode(grammarAccess.getAnnotationDeclarationAccess().getAnnotationIDStringWithoutQuotesTerminalRuleCall_1_0(), "annotationID"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"annotationID",
            	        		lv_annotationID_1_0, 
            	        		"StringWithoutQuotes", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1347:2: ( (lv_map_2_0= ruleKeyValForAnnotation ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1348:1: (lv_map_2_0= ruleKeyValForAnnotation )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1348:1: (lv_map_2_0= ruleKeyValForAnnotation )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1349:3: lv_map_2_0= ruleKeyValForAnnotation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationDeclarationAccess().getMapKeyValForAnnotationParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleKeyValForAnnotation_in_ruleAnnotationDeclaration2405);
            lv_map_2_0=ruleKeyValForAnnotation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"map",
            	        		lv_map_2_0, 
            	        		"KeyValForAnnotation", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1371:2: ( ',' ( (lv_map_4_0= ruleKeyValForAnnotation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1371:4: ',' ( (lv_map_4_0= ruleKeyValForAnnotation ) )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleAnnotationDeclaration2416); 

            	            createLeafNode(grammarAccess.getAnnotationDeclarationAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1375:1: ( (lv_map_4_0= ruleKeyValForAnnotation ) )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1376:1: (lv_map_4_0= ruleKeyValForAnnotation )
            	    {
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1376:1: (lv_map_4_0= ruleKeyValForAnnotation )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1377:3: lv_map_4_0= ruleKeyValForAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationDeclarationAccess().getMapKeyValForAnnotationParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleKeyValForAnnotation_in_ruleAnnotationDeclaration2437);
            	    lv_map_4_0=ruleKeyValForAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAnnotationDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"map",
            	    	        		lv_map_4_0, 
            	    	        		"KeyValForAnnotation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1399:4: ( (lv_lineBreak_5_0= RULE_LINE_BREAK ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_LINE_BREAK) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1400:1: (lv_lineBreak_5_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1400:1: (lv_lineBreak_5_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1401:3: lv_lineBreak_5_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_5_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleAnnotationDeclaration2456); 

                    			createLeafNode(grammarAccess.getAnnotationDeclarationAccess().getLineBreakLINE_BREAKTerminalRuleCall_4_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnnotationDeclaration


    // $ANTLR start entryRuleInstanciationInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1431:1: entryRuleInstanciationInstruction returns [EObject current=null] : iv_ruleInstanciationInstruction= ruleInstanciationInstruction EOF ;
    public final EObject entryRuleInstanciationInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanciationInstruction = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1432:2: (iv_ruleInstanciationInstruction= ruleInstanciationInstruction EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1433:2: iv_ruleInstanciationInstruction= ruleInstanciationInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanciationInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstanciationInstruction_in_entryRuleInstanciationInstruction2498);
            iv_ruleInstanciationInstruction=ruleInstanciationInstruction();
            _fsp--;

             current =iv_ruleInstanciationInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanciationInstruction2508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstanciationInstruction


    // $ANTLR start ruleInstanciationInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1440:1: ruleInstanciationInstruction returns [EObject current=null] : ( 'new' ( (lv_metaType_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation ) )* '}' ( (lv_lineBreak_6_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleInstanciationInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_lineBreak_6_0=null;
        EObject lv_metaType_1_0 = null;

        EObject lv_structuralFeatures_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1445:6: ( ( 'new' ( (lv_metaType_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation ) )* '}' ( (lv_lineBreak_6_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1446:1: ( 'new' ( (lv_metaType_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation ) )* '}' ( (lv_lineBreak_6_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1446:1: ( 'new' ( (lv_metaType_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation ) )* '}' ( (lv_lineBreak_6_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1446:3: 'new' ( (lv_metaType_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation ) )* '}' ( (lv_lineBreak_6_0= RULE_LINE_BREAK ) )?
            {
            match(input,28,FOLLOW_28_in_ruleInstanciationInstruction2543); 

                    createLeafNode(grammarAccess.getInstanciationInstructionAccess().getNewKeyword_0(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1450:1: ( (lv_metaType_1_0= ruleTypeReference ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1451:1: (lv_metaType_1_0= ruleTypeReference )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1451:1: (lv_metaType_1_0= ruleTypeReference )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1452:3: lv_metaType_1_0= ruleTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstanciationInstructionAccess().getMetaTypeTypeReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleInstanciationInstruction2564);
            lv_metaType_1_0=ruleTypeReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstanciationInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"metaType",
            	        		lv_metaType_1_0, 
            	        		"TypeReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1474:2: ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRINGWITHOUTQUOTES) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1475:1: (lv_name_2_0= RULE_STRINGWITHOUTQUOTES )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1475:1: (lv_name_2_0= RULE_STRINGWITHOUTQUOTES )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1476:3: lv_name_2_0= RULE_STRINGWITHOUTQUOTES
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleInstanciationInstruction2581); 

                    			createLeafNode(grammarAccess.getInstanciationInstructionAccess().getNameStringWithoutQuotesTerminalRuleCall_2_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanciationInstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"StringWithoutQuotes", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleInstanciationInstruction2597); 

                    createLeafNode(grammarAccess.getInstanciationInstructionAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1502:1: ( (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRINGWITHOUTQUOTES) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1503:1: (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation )
            	    {
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1503:1: (lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1504:3: lv_structuralFeatures_4_0= ruleStructuralFeatureAffectation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInstanciationInstructionAccess().getStructuralFeaturesStructuralFeatureAffectationParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructuralFeatureAffectation_in_ruleInstanciationInstruction2618);
            	    lv_structuralFeatures_4_0=ruleStructuralFeatureAffectation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInstanciationInstructionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"structuralFeatures",
            	    	        		lv_structuralFeatures_4_0, 
            	    	        		"StructuralFeatureAffectation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleInstanciationInstruction2629); 

                    createLeafNode(grammarAccess.getInstanciationInstructionAccess().getRightCurlyBracketKeyword_5(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1530:1: ( (lv_lineBreak_6_0= RULE_LINE_BREAK ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LINE_BREAK) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1531:1: (lv_lineBreak_6_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1531:1: (lv_lineBreak_6_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1532:3: lv_lineBreak_6_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_6_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleInstanciationInstruction2646); 

                    			createLeafNode(grammarAccess.getInstanciationInstructionAccess().getLineBreakLINE_BREAKTerminalRuleCall_6_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanciationInstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstanciationInstruction


    // $ANTLR start entryRuleStructuralFeatureAffectation
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1562:1: entryRuleStructuralFeatureAffectation returns [EObject current=null] : iv_ruleStructuralFeatureAffectation= ruleStructuralFeatureAffectation EOF ;
    public final EObject entryRuleStructuralFeatureAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeatureAffectation = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1563:2: (iv_ruleStructuralFeatureAffectation= ruleStructuralFeatureAffectation EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1564:2: iv_ruleStructuralFeatureAffectation= ruleStructuralFeatureAffectation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructuralFeatureAffectationRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructuralFeatureAffectation_in_entryRuleStructuralFeatureAffectation2688);
            iv_ruleStructuralFeatureAffectation=ruleStructuralFeatureAffectation();
            _fsp--;

             current =iv_ruleStructuralFeatureAffectation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeatureAffectation2698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStructuralFeatureAffectation


    // $ANTLR start ruleStructuralFeatureAffectation
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1571:1: ruleStructuralFeatureAffectation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRINGWITHOUTQUOTES ) ) ( ( (lv_usedOperator_1_0= ruleAffectationOperator ) ) ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) ) ) ';' ( (lv_lineBreak_9_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleStructuralFeatureAffectation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_lineBreak_9_0=null;
        Enumerator lv_usedOperator_1_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1576:6: ( ( ( (lv_name_0_0= RULE_STRINGWITHOUTQUOTES ) ) ( ( (lv_usedOperator_1_0= ruleAffectationOperator ) ) ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) ) ) ';' ( (lv_lineBreak_9_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1577:1: ( ( (lv_name_0_0= RULE_STRINGWITHOUTQUOTES ) ) ( ( (lv_usedOperator_1_0= ruleAffectationOperator ) ) ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) ) ) ';' ( (lv_lineBreak_9_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1577:1: ( ( (lv_name_0_0= RULE_STRINGWITHOUTQUOTES ) ) ( ( (lv_usedOperator_1_0= ruleAffectationOperator ) ) ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) ) ) ';' ( (lv_lineBreak_9_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1577:2: ( (lv_name_0_0= RULE_STRINGWITHOUTQUOTES ) ) ( ( (lv_usedOperator_1_0= ruleAffectationOperator ) ) ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) ) ) ';' ( (lv_lineBreak_9_0= RULE_LINE_BREAK ) )?
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1577:2: ( (lv_name_0_0= RULE_STRINGWITHOUTQUOTES ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1578:1: (lv_name_0_0= RULE_STRINGWITHOUTQUOTES )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1578:1: (lv_name_0_0= RULE_STRINGWITHOUTQUOTES )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1579:3: lv_name_0_0= RULE_STRINGWITHOUTQUOTES
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleStructuralFeatureAffectation2740); 

            			createLeafNode(grammarAccess.getStructuralFeatureAffectationAccess().getNameStringWithoutQuotesTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructuralFeatureAffectationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"StringWithoutQuotes", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1601:2: ( ( (lv_usedOperator_1_0= ruleAffectationOperator ) ) ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1601:3: ( (lv_usedOperator_1_0= ruleAffectationOperator ) ) ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1601:3: ( (lv_usedOperator_1_0= ruleAffectationOperator ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1602:1: (lv_usedOperator_1_0= ruleAffectationOperator )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1602:1: (lv_usedOperator_1_0= ruleAffectationOperator )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1603:3: lv_usedOperator_1_0= ruleAffectationOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAffectationAccess().getUsedOperatorAffectationOperatorEnumRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAffectationOperator_in_ruleStructuralFeatureAffectation2767);
            lv_usedOperator_1_0=ruleAffectationOperator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructuralFeatureAffectationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"usedOperator",
            	        		lv_usedOperator_1_0, 
            	        		"AffectationOperator", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1625:2: ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRINGWITHOUTQUOTES||LA26_0==RULE_STRING||LA26_0==28) ) {
                alt26=1;
            }
            else if ( (LA26_0==29) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1625:2: ( ( (lv_values_2_0= ruleValueForStructuralFeature ) ) | ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1625:3: ( (lv_values_2_0= ruleValueForStructuralFeature ) )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1625:3: ( (lv_values_2_0= ruleValueForStructuralFeature ) )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1626:1: (lv_values_2_0= ruleValueForStructuralFeature )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1626:1: (lv_values_2_0= ruleValueForStructuralFeature )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1627:3: lv_values_2_0= ruleValueForStructuralFeature
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAffectationAccess().getValuesValueForStructuralFeatureParserRuleCall_1_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueForStructuralFeature_in_ruleStructuralFeatureAffectation2789);
                    lv_values_2_0=ruleValueForStructuralFeature();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructuralFeatureAffectationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_2_0, 
                    	        		"ValueForStructuralFeature", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1650:6: ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1650:6: ( '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']' )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1650:8: '[' ( (lv_values_4_0= ruleValueForStructuralFeature ) ) ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )* ']'
                    {
                    match(input,29,FOLLOW_29_in_ruleStructuralFeatureAffectation2806); 

                            createLeafNode(grammarAccess.getStructuralFeatureAffectationAccess().getLeftSquareBracketKeyword_1_1_1_0(), null); 
                        
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1654:1: ( (lv_values_4_0= ruleValueForStructuralFeature ) )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1655:1: (lv_values_4_0= ruleValueForStructuralFeature )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1655:1: (lv_values_4_0= ruleValueForStructuralFeature )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1656:3: lv_values_4_0= ruleValueForStructuralFeature
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAffectationAccess().getValuesValueForStructuralFeatureParserRuleCall_1_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueForStructuralFeature_in_ruleStructuralFeatureAffectation2827);
                    lv_values_4_0=ruleValueForStructuralFeature();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructuralFeatureAffectationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_4_0, 
                    	        		"ValueForStructuralFeature", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1678:2: ( ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1678:4: ',' ( (lv_values_6_0= ruleValueForStructuralFeature ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleStructuralFeatureAffectation2838); 

                    	            createLeafNode(grammarAccess.getStructuralFeatureAffectationAccess().getCommaKeyword_1_1_1_2_0(), null); 
                    	        
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1682:1: ( (lv_values_6_0= ruleValueForStructuralFeature ) )
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1683:1: (lv_values_6_0= ruleValueForStructuralFeature )
                    	    {
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1683:1: (lv_values_6_0= ruleValueForStructuralFeature )
                    	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1684:3: lv_values_6_0= ruleValueForStructuralFeature
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAffectationAccess().getValuesValueForStructuralFeatureParserRuleCall_1_1_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueForStructuralFeature_in_ruleStructuralFeatureAffectation2859);
                    	    lv_values_6_0=ruleValueForStructuralFeature();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStructuralFeatureAffectationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_6_0, 
                    	    	        		"ValueForStructuralFeature", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,30,FOLLOW_30_in_ruleStructuralFeatureAffectation2871); 

                            createLeafNode(grammarAccess.getStructuralFeatureAffectationAccess().getRightSquareBracketKeyword_1_1_1_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

            match(input,31,FOLLOW_31_in_ruleStructuralFeatureAffectation2884); 

                    createLeafNode(grammarAccess.getStructuralFeatureAffectationAccess().getSemicolonKeyword_2(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1714:1: ( (lv_lineBreak_9_0= RULE_LINE_BREAK ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_LINE_BREAK) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1715:1: (lv_lineBreak_9_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1715:1: (lv_lineBreak_9_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1716:3: lv_lineBreak_9_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_9_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleStructuralFeatureAffectation2901); 

                    			createLeafNode(grammarAccess.getStructuralFeatureAffectationAccess().getLineBreakLINE_BREAKTerminalRuleCall_3_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructuralFeatureAffectationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStructuralFeatureAffectation


    // $ANTLR start entryRuleNativeValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1746:1: entryRuleNativeValueForStructuralFeature returns [EObject current=null] : iv_ruleNativeValueForStructuralFeature= ruleNativeValueForStructuralFeature EOF ;
    public final EObject entryRuleNativeValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeValueForStructuralFeature = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1747:2: (iv_ruleNativeValueForStructuralFeature= ruleNativeValueForStructuralFeature EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1748:2: iv_ruleNativeValueForStructuralFeature= ruleNativeValueForStructuralFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNativeValueForStructuralFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleNativeValueForStructuralFeature_in_entryRuleNativeValueForStructuralFeature2943);
            iv_ruleNativeValueForStructuralFeature=ruleNativeValueForStructuralFeature();
            _fsp--;

             current =iv_ruleNativeValueForStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeValueForStructuralFeature2953); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNativeValueForStructuralFeature


    // $ANTLR start ruleNativeValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1755:1: ruleNativeValueForStructuralFeature returns [EObject current=null] : ( ( (lv_value_0_0= ruleStringWithQuotes ) ) ( (lv_lineBreak_1_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleNativeValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1760:6: ( ( ( (lv_value_0_0= ruleStringWithQuotes ) ) ( (lv_lineBreak_1_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1761:1: ( ( (lv_value_0_0= ruleStringWithQuotes ) ) ( (lv_lineBreak_1_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1761:1: ( ( (lv_value_0_0= ruleStringWithQuotes ) ) ( (lv_lineBreak_1_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1761:2: ( (lv_value_0_0= ruleStringWithQuotes ) ) ( (lv_lineBreak_1_0= RULE_LINE_BREAK ) )?
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1761:2: ( (lv_value_0_0= ruleStringWithQuotes ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1762:1: (lv_value_0_0= ruleStringWithQuotes )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1762:1: (lv_value_0_0= ruleStringWithQuotes )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1763:3: lv_value_0_0= ruleStringWithQuotes
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNativeValueForStructuralFeatureAccess().getValueStringWithQuotesParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStringWithQuotes_in_ruleNativeValueForStructuralFeature2999);
            lv_value_0_0=ruleStringWithQuotes();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNativeValueForStructuralFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"StringWithQuotes", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1785:2: ( (lv_lineBreak_1_0= RULE_LINE_BREAK ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LINE_BREAK) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1786:1: (lv_lineBreak_1_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1786:1: (lv_lineBreak_1_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1787:3: lv_lineBreak_1_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_1_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleNativeValueForStructuralFeature3016); 

                    			createLeafNode(grammarAccess.getNativeValueForStructuralFeatureAccess().getLineBreakLINE_BREAKTerminalRuleCall_1_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNativeValueForStructuralFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNativeValueForStructuralFeature


    // $ANTLR start entryRuleNewObjectValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1817:1: entryRuleNewObjectValueForStructuralFeature returns [EObject current=null] : iv_ruleNewObjectValueForStructuralFeature= ruleNewObjectValueForStructuralFeature EOF ;
    public final EObject entryRuleNewObjectValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewObjectValueForStructuralFeature = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1818:2: (iv_ruleNewObjectValueForStructuralFeature= ruleNewObjectValueForStructuralFeature EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1819:2: iv_ruleNewObjectValueForStructuralFeature= ruleNewObjectValueForStructuralFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNewObjectValueForStructuralFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleNewObjectValueForStructuralFeature_in_entryRuleNewObjectValueForStructuralFeature3058);
            iv_ruleNewObjectValueForStructuralFeature=ruleNewObjectValueForStructuralFeature();
            _fsp--;

             current =iv_ruleNewObjectValueForStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObjectValueForStructuralFeature3068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNewObjectValueForStructuralFeature


    // $ANTLR start ruleNewObjectValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1826:1: ruleNewObjectValueForStructuralFeature returns [EObject current=null] : ( (lv_value_0_0= ruleInstanciationInstruction ) ) ;
    public final EObject ruleNewObjectValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1831:6: ( ( (lv_value_0_0= ruleInstanciationInstruction ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1832:1: ( (lv_value_0_0= ruleInstanciationInstruction ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1832:1: ( (lv_value_0_0= ruleInstanciationInstruction ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1833:1: (lv_value_0_0= ruleInstanciationInstruction )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1833:1: (lv_value_0_0= ruleInstanciationInstruction )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1834:3: lv_value_0_0= ruleInstanciationInstruction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNewObjectValueForStructuralFeatureAccess().getValueInstanciationInstructionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInstanciationInstruction_in_ruleNewObjectValueForStructuralFeature3113);
            lv_value_0_0=ruleInstanciationInstruction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNewObjectValueForStructuralFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"InstanciationInstruction", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNewObjectValueForStructuralFeature


    // $ANTLR start entryRuleReferenceValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1864:1: entryRuleReferenceValueForStructuralFeature returns [EObject current=null] : iv_ruleReferenceValueForStructuralFeature= ruleReferenceValueForStructuralFeature EOF ;
    public final EObject entryRuleReferenceValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValueForStructuralFeature = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1865:2: (iv_ruleReferenceValueForStructuralFeature= ruleReferenceValueForStructuralFeature EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1866:2: iv_ruleReferenceValueForStructuralFeature= ruleReferenceValueForStructuralFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceValueForStructuralFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleReferenceValueForStructuralFeature_in_entryRuleReferenceValueForStructuralFeature3148);
            iv_ruleReferenceValueForStructuralFeature=ruleReferenceValueForStructuralFeature();
            _fsp--;

             current =iv_ruleReferenceValueForStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValueForStructuralFeature3158); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReferenceValueForStructuralFeature


    // $ANTLR start ruleReferenceValueForStructuralFeature
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1873:1: ruleReferenceValueForStructuralFeature returns [EObject current=null] : ( (lv_referencedElement_0_0= ruleInstanciationInstructionReference ) ) ;
    public final EObject ruleReferenceValueForStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject lv_referencedElement_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1878:6: ( ( (lv_referencedElement_0_0= ruleInstanciationInstructionReference ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1879:1: ( (lv_referencedElement_0_0= ruleInstanciationInstructionReference ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1879:1: ( (lv_referencedElement_0_0= ruleInstanciationInstructionReference ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1880:1: (lv_referencedElement_0_0= ruleInstanciationInstructionReference )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1880:1: (lv_referencedElement_0_0= ruleInstanciationInstructionReference )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1881:3: lv_referencedElement_0_0= ruleInstanciationInstructionReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReferenceValueForStructuralFeatureAccess().getReferencedElementInstanciationInstructionReferenceParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInstanciationInstructionReference_in_ruleReferenceValueForStructuralFeature3203);
            lv_referencedElement_0_0=ruleInstanciationInstructionReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceValueForStructuralFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"referencedElement",
            	        		lv_referencedElement_0_0, 
            	        		"InstanciationInstructionReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReferenceValueForStructuralFeature


    // $ANTLR start entryRuleContributionInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1911:1: entryRuleContributionInstruction returns [EObject current=null] : iv_ruleContributionInstruction= ruleContributionInstruction EOF ;
    public final EObject entryRuleContributionInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionInstruction = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1912:2: (iv_ruleContributionInstruction= ruleContributionInstruction EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1913:2: iv_ruleContributionInstruction= ruleContributionInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributionInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleContributionInstruction_in_entryRuleContributionInstruction3238);
            iv_ruleContributionInstruction=ruleContributionInstruction();
            _fsp--;

             current =iv_ruleContributionInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionInstruction3248); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContributionInstruction


    // $ANTLR start ruleContributionInstruction
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1920:1: ruleContributionInstruction returns [EObject current=null] : ( ( (lv_referencedElement_0_0= ruleModelingUnitInstructionReference ) ) '{' ( (lv_contributions_2_0= ruleModelingUnitInstruction ) )* '}' ( (lv_lineBreak_4_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleContributionInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_4_0=null;
        EObject lv_referencedElement_0_0 = null;

        EObject lv_contributions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1925:6: ( ( ( (lv_referencedElement_0_0= ruleModelingUnitInstructionReference ) ) '{' ( (lv_contributions_2_0= ruleModelingUnitInstruction ) )* '}' ( (lv_lineBreak_4_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1926:1: ( ( (lv_referencedElement_0_0= ruleModelingUnitInstructionReference ) ) '{' ( (lv_contributions_2_0= ruleModelingUnitInstruction ) )* '}' ( (lv_lineBreak_4_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1926:1: ( ( (lv_referencedElement_0_0= ruleModelingUnitInstructionReference ) ) '{' ( (lv_contributions_2_0= ruleModelingUnitInstruction ) )* '}' ( (lv_lineBreak_4_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1926:2: ( (lv_referencedElement_0_0= ruleModelingUnitInstructionReference ) ) '{' ( (lv_contributions_2_0= ruleModelingUnitInstruction ) )* '}' ( (lv_lineBreak_4_0= RULE_LINE_BREAK ) )?
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1926:2: ( (lv_referencedElement_0_0= ruleModelingUnitInstructionReference ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1927:1: (lv_referencedElement_0_0= ruleModelingUnitInstructionReference )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1927:1: (lv_referencedElement_0_0= ruleModelingUnitInstructionReference )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1928:3: lv_referencedElement_0_0= ruleModelingUnitInstructionReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContributionInstructionAccess().getReferencedElementModelingUnitInstructionReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModelingUnitInstructionReference_in_ruleContributionInstruction3294);
            lv_referencedElement_0_0=ruleModelingUnitInstructionReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContributionInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"referencedElement",
            	        		lv_referencedElement_0_0, 
            	        		"ModelingUnitInstructionReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleContributionInstruction3304); 

                    createLeafNode(grammarAccess.getContributionInstructionAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1954:1: ( (lv_contributions_2_0= ruleModelingUnitInstruction ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRINGWITHOUTQUOTES||LA29_0==15||(LA29_0>=27 && LA29_0<=28)||LA29_0==33||(LA29_0>=38 && LA29_0<=39)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1955:1: (lv_contributions_2_0= ruleModelingUnitInstruction )
            	    {
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1955:1: (lv_contributions_2_0= ruleModelingUnitInstruction )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1956:3: lv_contributions_2_0= ruleModelingUnitInstruction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getContributionInstructionAccess().getContributionsModelingUnitInstructionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelingUnitInstruction_in_ruleContributionInstruction3325);
            	    lv_contributions_2_0=ruleModelingUnitInstruction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getContributionInstructionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contributions",
            	    	        		lv_contributions_2_0, 
            	    	        		"ModelingUnitInstruction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleContributionInstruction3336); 

                    createLeafNode(grammarAccess.getContributionInstructionAccess().getRightCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1982:1: ( (lv_lineBreak_4_0= RULE_LINE_BREAK ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_LINE_BREAK) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1983:1: (lv_lineBreak_4_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1983:1: (lv_lineBreak_4_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:1984:3: lv_lineBreak_4_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_4_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleContributionInstruction3353); 

                    			createLeafNode(grammarAccess.getContributionInstructionAccess().getLineBreakLINE_BREAKTerminalRuleCall_4_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContributionInstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContributionInstruction


    // $ANTLR start entryRuleTypeReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2014:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2015:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2016:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference3395);
            iv_ruleTypeReference=ruleTypeReference();
            _fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference3405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeReference


    // $ANTLR start ruleTypeReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2023:1: ruleTypeReference returns [EObject current=null] : ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_IntentHref_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2028:6: ( ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2029:1: ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2029:1: ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2029:2: () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2029:2: ()
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2030:5: 
            {
             
                    temp=factory.create(grammarAccess.getTypeReferenceAccess().getTypeReferenceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeReferenceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2040:2: ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2041:1: (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2041:1: (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2042:3: lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES
            {
            lv_IntentHref_1_0=(Token)input.LT(1);
            match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleTypeReference3456); 

            			createLeafNode(grammarAccess.getTypeReferenceAccess().getIntentHrefStringWithoutQuotesTerminalRuleCall_1_0(), "IntentHref"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"IntentHref",
            	        		lv_IntentHref_1_0, 
            	        		"StringWithoutQuotes", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeReference


    // $ANTLR start entryRuleInstanciationInstructionReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2072:1: entryRuleInstanciationInstructionReference returns [EObject current=null] : iv_ruleInstanciationInstructionReference= ruleInstanciationInstructionReference EOF ;
    public final EObject entryRuleInstanciationInstructionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanciationInstructionReference = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2073:2: (iv_ruleInstanciationInstructionReference= ruleInstanciationInstructionReference EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2074:2: iv_ruleInstanciationInstructionReference= ruleInstanciationInstructionReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanciationInstructionReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstanciationInstructionReference_in_entryRuleInstanciationInstructionReference3497);
            iv_ruleInstanciationInstructionReference=ruleInstanciationInstructionReference();
            _fsp--;

             current =iv_ruleInstanciationInstructionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanciationInstructionReference3507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstanciationInstructionReference


    // $ANTLR start ruleInstanciationInstructionReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2081:1: ruleInstanciationInstructionReference returns [EObject current=null] : ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) ) ;
    public final EObject ruleInstanciationInstructionReference() throws RecognitionException {
        EObject current = null;

        Token lv_IntentHref_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2086:6: ( ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2087:1: ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2087:1: ( () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2087:2: () ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2087:2: ()
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2088:5: 
            {
             
                    temp=factory.create(grammarAccess.getInstanciationInstructionReferenceAccess().getInstanciationInstructionReferenceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getInstanciationInstructionReferenceAccess().getInstanciationInstructionReferenceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2098:2: ( (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2099:1: (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2099:1: (lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2100:3: lv_IntentHref_1_0= RULE_STRINGWITHOUTQUOTES
            {
            lv_IntentHref_1_0=(Token)input.LT(1);
            match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleInstanciationInstructionReference3558); 

            			createLeafNode(grammarAccess.getInstanciationInstructionReferenceAccess().getIntentHrefStringWithoutQuotesTerminalRuleCall_1_0(), "IntentHref"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstanciationInstructionReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"IntentHref",
            	        		lv_IntentHref_1_0, 
            	        		"StringWithoutQuotes", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstanciationInstructionReference


    // $ANTLR start entryRuleKeyValForAnnotation
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2130:1: entryRuleKeyValForAnnotation returns [EObject current=null] : iv_ruleKeyValForAnnotation= ruleKeyValForAnnotation EOF ;
    public final EObject entryRuleKeyValForAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValForAnnotation = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2131:2: (iv_ruleKeyValForAnnotation= ruleKeyValForAnnotation EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2132:2: iv_ruleKeyValForAnnotation= ruleKeyValForAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKeyValForAnnotationRule(), currentNode); 
            pushFollow(FOLLOW_ruleKeyValForAnnotation_in_entryRuleKeyValForAnnotation3599);
            iv_ruleKeyValForAnnotation=ruleKeyValForAnnotation();
            _fsp--;

             current =iv_ruleKeyValForAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValForAnnotation3609); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleKeyValForAnnotation


    // $ANTLR start ruleKeyValForAnnotation
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2139:1: ruleKeyValForAnnotation returns [EObject current=null] : ( () ( (lv_key_1_0= RULE_STRINGWITHOUTQUOTES ) ) '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValForAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2144:6: ( ( () ( (lv_key_1_0= RULE_STRINGWITHOUTQUOTES ) ) '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2145:1: ( () ( (lv_key_1_0= RULE_STRINGWITHOUTQUOTES ) ) '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2145:1: ( () ( (lv_key_1_0= RULE_STRINGWITHOUTQUOTES ) ) '=' ( (lv_value_3_0= ruleEString ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2145:2: () ( (lv_key_1_0= RULE_STRINGWITHOUTQUOTES ) ) '=' ( (lv_value_3_0= ruleEString ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2145:2: ()
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2146:5: 
            {
             
                    temp=factory.create(grammarAccess.getKeyValForAnnotationAccess().getKeyValForAnnotationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getKeyValForAnnotationAccess().getKeyValForAnnotationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2156:2: ( (lv_key_1_0= RULE_STRINGWITHOUTQUOTES ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2157:1: (lv_key_1_0= RULE_STRINGWITHOUTQUOTES )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2157:1: (lv_key_1_0= RULE_STRINGWITHOUTQUOTES )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2158:3: lv_key_1_0= RULE_STRINGWITHOUTQUOTES
            {
            lv_key_1_0=(Token)input.LT(1);
            match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleKeyValForAnnotation3660); 

            			createLeafNode(grammarAccess.getKeyValForAnnotationAccess().getKeyStringWithoutQuotesTerminalRuleCall_1_0(), "key"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getKeyValForAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"key",
            	        		lv_key_1_0, 
            	        		"StringWithoutQuotes", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,32,FOLLOW_32_in_ruleKeyValForAnnotation3675); 

                    createLeafNode(grammarAccess.getKeyValForAnnotationAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2184:1: ( (lv_value_3_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2185:1: (lv_value_3_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2185:1: (lv_value_3_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2186:3: lv_value_3_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getKeyValForAnnotationAccess().getValueEStringParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleKeyValForAnnotation3696);
            lv_value_3_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getKeyValForAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleKeyValForAnnotation


    // $ANTLR start entryRuleResourceReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2216:1: entryRuleResourceReference returns [EObject current=null] : iv_ruleResourceReference= ruleResourceReference EOF ;
    public final EObject entryRuleResourceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceReference = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2217:2: (iv_ruleResourceReference= ruleResourceReference EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2218:2: iv_ruleResourceReference= ruleResourceReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceReference_in_entryRuleResourceReference3732);
            iv_ruleResourceReference=ruleResourceReference();
            _fsp--;

             current =iv_ruleResourceReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceReference3742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleResourceReference


    // $ANTLR start ruleResourceReference
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2225:1: ruleResourceReference returns [EObject current=null] : ( '[' ( (lv_IntentHref_1_0= ruleEString ) ) ']' ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleResourceReference() throws RecognitionException {
        EObject current = null;

        Token lv_lineBreak_3_0=null;
        AntlrDatatypeRuleToken lv_IntentHref_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2230:6: ( ( '[' ( (lv_IntentHref_1_0= ruleEString ) ) ']' ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2231:1: ( '[' ( (lv_IntentHref_1_0= ruleEString ) ) ']' ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2231:1: ( '[' ( (lv_IntentHref_1_0= ruleEString ) ) ']' ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2231:3: '[' ( (lv_IntentHref_1_0= ruleEString ) ) ']' ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            {
            match(input,29,FOLLOW_29_in_ruleResourceReference3777); 

                    createLeafNode(grammarAccess.getResourceReferenceAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2235:1: ( (lv_IntentHref_1_0= ruleEString ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2236:1: (lv_IntentHref_1_0= ruleEString )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2236:1: (lv_IntentHref_1_0= ruleEString )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2237:3: lv_IntentHref_1_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getResourceReferenceAccess().getIntentHrefEStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleResourceReference3798);
            lv_IntentHref_1_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"IntentHref",
            	        		lv_IntentHref_1_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleResourceReference3808); 

                    createLeafNode(grammarAccess.getResourceReferenceAccess().getRightSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2263:1: ( (lv_lineBreak_3_0= RULE_LINE_BREAK ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_LINE_BREAK) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2264:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2264:1: (lv_lineBreak_3_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2265:3: lv_lineBreak_3_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_3_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleResourceReference3825); 

                    			createLeafNode(grammarAccess.getResourceReferenceAccess().getLineBreakLINE_BREAKTerminalRuleCall_3_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleResourceReference


    // $ANTLR start entryRuleResourceDeclaration
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2295:1: entryRuleResourceDeclaration returns [EObject current=null] : iv_ruleResourceDeclaration= ruleResourceDeclaration EOF ;
    public final EObject entryRuleResourceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceDeclaration = null;


        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2296:2: (iv_ruleResourceDeclaration= ruleResourceDeclaration EOF )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2297:2: iv_ruleResourceDeclaration= ruleResourceDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceDeclaration_in_entryRuleResourceDeclaration3867);
            iv_ruleResourceDeclaration=ruleResourceDeclaration();
            _fsp--;

             current =iv_ruleResourceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceDeclaration3877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleResourceDeclaration


    // $ANTLR start ruleResourceDeclaration
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2304:1: ruleResourceDeclaration returns [EObject current=null] : ( () 'Resource' ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( RULE_LINE_BREAK )? ( 'URI' '=' ( (lv_uri_7_0= RULE_URI ) ) ';' ( RULE_LINE_BREAK )? )? ( 'contentType' '=' ( (lv_contentType_12_0= ruleEString ) ) ';' ( RULE_LINE_BREAK )? )? ( 'content' '+=' ( (lv_content_17_0= ruleModelingUnitInstructionReference ) ) ';' ( RULE_LINE_BREAK )? )* '}' ( (lv_lineBreak_21_0= RULE_LINE_BREAK ) )? ) ;
    public final EObject ruleResourceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_uri_7_0=null;
        Token lv_lineBreak_21_0=null;
        AntlrDatatypeRuleToken lv_contentType_12_0 = null;

        EObject lv_content_17_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2309:6: ( ( () 'Resource' ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( RULE_LINE_BREAK )? ( 'URI' '=' ( (lv_uri_7_0= RULE_URI ) ) ';' ( RULE_LINE_BREAK )? )? ( 'contentType' '=' ( (lv_contentType_12_0= ruleEString ) ) ';' ( RULE_LINE_BREAK )? )? ( 'content' '+=' ( (lv_content_17_0= ruleModelingUnitInstructionReference ) ) ';' ( RULE_LINE_BREAK )? )* '}' ( (lv_lineBreak_21_0= RULE_LINE_BREAK ) )? ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2310:1: ( () 'Resource' ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( RULE_LINE_BREAK )? ( 'URI' '=' ( (lv_uri_7_0= RULE_URI ) ) ';' ( RULE_LINE_BREAK )? )? ( 'contentType' '=' ( (lv_contentType_12_0= ruleEString ) ) ';' ( RULE_LINE_BREAK )? )? ( 'content' '+=' ( (lv_content_17_0= ruleModelingUnitInstructionReference ) ) ';' ( RULE_LINE_BREAK )? )* '}' ( (lv_lineBreak_21_0= RULE_LINE_BREAK ) )? )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2310:1: ( () 'Resource' ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( RULE_LINE_BREAK )? ( 'URI' '=' ( (lv_uri_7_0= RULE_URI ) ) ';' ( RULE_LINE_BREAK )? )? ( 'contentType' '=' ( (lv_contentType_12_0= ruleEString ) ) ';' ( RULE_LINE_BREAK )? )? ( 'content' '+=' ( (lv_content_17_0= ruleModelingUnitInstructionReference ) ) ';' ( RULE_LINE_BREAK )? )* '}' ( (lv_lineBreak_21_0= RULE_LINE_BREAK ) )? )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2310:2: () 'Resource' ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )? '{' ( RULE_LINE_BREAK )? ( 'URI' '=' ( (lv_uri_7_0= RULE_URI ) ) ';' ( RULE_LINE_BREAK )? )? ( 'contentType' '=' ( (lv_contentType_12_0= ruleEString ) ) ';' ( RULE_LINE_BREAK )? )? ( 'content' '+=' ( (lv_content_17_0= ruleModelingUnitInstructionReference ) ) ';' ( RULE_LINE_BREAK )? )* '}' ( (lv_lineBreak_21_0= RULE_LINE_BREAK ) )?
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2310:2: ()
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2311:5: 
            {
             
                    temp=factory.create(grammarAccess.getResourceDeclarationAccess().getResourceDeclarationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getResourceDeclarationAccess().getResourceDeclarationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,33,FOLLOW_33_in_ruleResourceDeclaration3921); 

                    createLeafNode(grammarAccess.getResourceDeclarationAccess().getResourceKeyword_1(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2325:1: ( (lv_name_2_0= RULE_STRINGWITHOUTQUOTES ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRINGWITHOUTQUOTES) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2326:1: (lv_name_2_0= RULE_STRINGWITHOUTQUOTES )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2326:1: (lv_name_2_0= RULE_STRINGWITHOUTQUOTES )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2327:3: lv_name_2_0= RULE_STRINGWITHOUTQUOTES
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRINGWITHOUTQUOTES,FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleResourceDeclaration3938); 

                    			createLeafNode(grammarAccess.getResourceDeclarationAccess().getNameStringWithoutQuotesTerminalRuleCall_2_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"StringWithoutQuotes", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleResourceDeclaration3954); 

                    createLeafNode(grammarAccess.getResourceDeclarationAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2353:1: ( RULE_LINE_BREAK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LINE_BREAK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2353:2: RULE_LINE_BREAK
                    {
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration3964); 
                     
                        createLeafNode(grammarAccess.getResourceDeclarationAccess().getLINE_BREAKTerminalRuleCall_4(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2357:3: ( 'URI' '=' ( (lv_uri_7_0= RULE_URI ) ) ';' ( RULE_LINE_BREAK )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2357:5: 'URI' '=' ( (lv_uri_7_0= RULE_URI ) ) ';' ( RULE_LINE_BREAK )?
                    {
                    match(input,34,FOLLOW_34_in_ruleResourceDeclaration3976); 

                            createLeafNode(grammarAccess.getResourceDeclarationAccess().getURIKeyword_5_0(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleResourceDeclaration3986); 

                            createLeafNode(grammarAccess.getResourceDeclarationAccess().getEqualsSignKeyword_5_1(), null); 
                        
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2365:1: ( (lv_uri_7_0= RULE_URI ) )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2366:1: (lv_uri_7_0= RULE_URI )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2366:1: (lv_uri_7_0= RULE_URI )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2367:3: lv_uri_7_0= RULE_URI
                    {
                    lv_uri_7_0=(Token)input.LT(1);
                    match(input,RULE_URI,FOLLOW_RULE_URI_in_ruleResourceDeclaration4003); 

                    			createLeafNode(grammarAccess.getResourceDeclarationAccess().getUriURITerminalRuleCall_5_2_0(), "uri"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"uri",
                    	        		lv_uri_7_0, 
                    	        		"URI", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,31,FOLLOW_31_in_ruleResourceDeclaration4018); 

                            createLeafNode(grammarAccess.getResourceDeclarationAccess().getSemicolonKeyword_5_3(), null); 
                        
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2393:1: ( RULE_LINE_BREAK )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_LINE_BREAK) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2393:2: RULE_LINE_BREAK
                            {
                            match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4028); 
                             
                                createLeafNode(grammarAccess.getResourceDeclarationAccess().getLINE_BREAKTerminalRuleCall_5_4(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2397:5: ( 'contentType' '=' ( (lv_contentType_12_0= ruleEString ) ) ';' ( RULE_LINE_BREAK )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2397:7: 'contentType' '=' ( (lv_contentType_12_0= ruleEString ) ) ';' ( RULE_LINE_BREAK )?
                    {
                    match(input,35,FOLLOW_35_in_ruleResourceDeclaration4042); 

                            createLeafNode(grammarAccess.getResourceDeclarationAccess().getContentTypeKeyword_6_0(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleResourceDeclaration4052); 

                            createLeafNode(grammarAccess.getResourceDeclarationAccess().getEqualsSignKeyword_6_1(), null); 
                        
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2405:1: ( (lv_contentType_12_0= ruleEString ) )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2406:1: (lv_contentType_12_0= ruleEString )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2406:1: (lv_contentType_12_0= ruleEString )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2407:3: lv_contentType_12_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getResourceDeclarationAccess().getContentTypeEStringParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleResourceDeclaration4073);
                    lv_contentType_12_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"contentType",
                    	        		lv_contentType_12_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,31,FOLLOW_31_in_ruleResourceDeclaration4083); 

                            createLeafNode(grammarAccess.getResourceDeclarationAccess().getSemicolonKeyword_6_3(), null); 
                        
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2433:1: ( RULE_LINE_BREAK )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_LINE_BREAK) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2433:2: RULE_LINE_BREAK
                            {
                            match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4093); 
                             
                                createLeafNode(grammarAccess.getResourceDeclarationAccess().getLINE_BREAKTerminalRuleCall_6_4(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2437:5: ( 'content' '+=' ( (lv_content_17_0= ruleModelingUnitInstructionReference ) ) ';' ( RULE_LINE_BREAK )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2437:7: 'content' '+=' ( (lv_content_17_0= ruleModelingUnitInstructionReference ) ) ';' ( RULE_LINE_BREAK )?
            	    {
            	    match(input,36,FOLLOW_36_in_ruleResourceDeclaration4107); 

            	            createLeafNode(grammarAccess.getResourceDeclarationAccess().getContentKeyword_7_0(), null); 
            	        
            	    match(input,37,FOLLOW_37_in_ruleResourceDeclaration4117); 

            	            createLeafNode(grammarAccess.getResourceDeclarationAccess().getPlusSignEqualsSignKeyword_7_1(), null); 
            	        
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2445:1: ( (lv_content_17_0= ruleModelingUnitInstructionReference ) )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2446:1: (lv_content_17_0= ruleModelingUnitInstructionReference )
            	    {
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2446:1: (lv_content_17_0= ruleModelingUnitInstructionReference )
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2447:3: lv_content_17_0= ruleModelingUnitInstructionReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getResourceDeclarationAccess().getContentModelingUnitInstructionReferenceParserRuleCall_7_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelingUnitInstructionReference_in_ruleResourceDeclaration4138);
            	    lv_content_17_0=ruleModelingUnitInstructionReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getResourceDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"content",
            	    	        		lv_content_17_0, 
            	    	        		"ModelingUnitInstructionReference", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,31,FOLLOW_31_in_ruleResourceDeclaration4148); 

            	            createLeafNode(grammarAccess.getResourceDeclarationAccess().getSemicolonKeyword_7_3(), null); 
            	        
            	    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2473:1: ( RULE_LINE_BREAK )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==RULE_LINE_BREAK) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2473:2: RULE_LINE_BREAK
            	            {
            	            match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4158); 
            	             
            	                createLeafNode(grammarAccess.getResourceDeclarationAccess().getLINE_BREAKTerminalRuleCall_7_4(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleResourceDeclaration4171); 

                    createLeafNode(grammarAccess.getResourceDeclarationAccess().getRightCurlyBracketKeyword_8(), null); 
                
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2481:1: ( (lv_lineBreak_21_0= RULE_LINE_BREAK ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_LINE_BREAK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2482:1: (lv_lineBreak_21_0= RULE_LINE_BREAK )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2482:1: (lv_lineBreak_21_0= RULE_LINE_BREAK )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2483:3: lv_lineBreak_21_0= RULE_LINE_BREAK
                    {
                    lv_lineBreak_21_0=(Token)input.LT(1);
                    match(input,RULE_LINE_BREAK,FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4188); 

                    			createLeafNode(grammarAccess.getResourceDeclarationAccess().getLineBreakLINE_BREAKTerminalRuleCall_9_0(), "lineBreak"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lineBreak",
                    	        		true, 
                    	        		"LINE_BREAK", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleResourceDeclaration


    // $ANTLR start ruleTypeLabel
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2513:1: ruleTypeLabel returns [Enumerator current=null] : ( ( '@lazylabel' ) | ( '@label' ) ) ;
    public final Enumerator ruleTypeLabel() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2517:6: ( ( ( '@lazylabel' ) | ( '@label' ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2518:1: ( ( '@lazylabel' ) | ( '@label' ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2518:1: ( ( '@lazylabel' ) | ( '@label' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            else if ( (LA41_0==39) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2518:1: ( ( '@lazylabel' ) | ( '@label' ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2518:2: ( '@lazylabel' )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2518:2: ( '@lazylabel' )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2518:4: '@lazylabel'
                    {
                    match(input,38,FOLLOW_38_in_ruleTypeLabel4242); 

                            current = grammarAccess.getTypeLabelAccess().getLAZYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeLabelAccess().getLAZYEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2524:6: ( '@label' )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2524:6: ( '@label' )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2524:8: '@label'
                    {
                    match(input,39,FOLLOW_39_in_ruleTypeLabel4257); 

                            current = grammarAccess.getTypeLabelAccess().getEXPLICITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeLabelAccess().getEXPLICITEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeLabel


    // $ANTLR start ruleAffectationOperator
    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2534:1: ruleAffectationOperator returns [Enumerator current=null] : ( ( '+=' ) | ( '=' ) ) ;
    public final Enumerator ruleAffectationOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2538:6: ( ( ( '+=' ) | ( '=' ) ) )
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2539:1: ( ( '+=' ) | ( '=' ) )
            {
            // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2539:1: ( ( '+=' ) | ( '=' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            else if ( (LA42_0==32) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2539:1: ( ( '+=' ) | ( '=' ) )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2539:2: ( '+=' )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2539:2: ( '+=' )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2539:4: '+='
                    {
                    match(input,37,FOLLOW_37_in_ruleAffectationOperator4300); 

                            current = grammarAccess.getAffectationOperatorAccess().getMULTI_VALUED_AFFECTATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAffectationOperatorAccess().getMULTI_VALUED_AFFECTATIONEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2545:6: ( '=' )
                    {
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2545:6: ( '=' )
                    // ../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g:2545:8: '='
                    {
                    match(input,32,FOLLOW_32_in_ruleAffectationOperator4315); 

                            current = grammarAccess.getAffectationOperatorAccess().getSINGLE_VALUED_AFFECTATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAffectationOperatorAccess().getSINGLE_VALUED_AFFECTATIONEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAffectationOperator


 

    public static final BitSet FOLLOW_ruleModelingUnit_in_entryRuleModelingUnit75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelingUnit85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleModelingUnit136 = new BitSet(new long[]{0x000000C238038032L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleModelingUnit152 = new BitSet(new long[]{0x000000C238038012L});
    public static final BitSet FOLLOW_ruleResourceReference_in_ruleModelingUnit174 = new BitSet(new long[]{0x000000C218038012L});
    public static final BitSet FOLLOW_ruleModelingUnitInstruction_in_ruleModelingUnit198 = new BitSet(new long[]{0x000000C218038012L});
    public static final BitSet FOLLOW_ruleLabelReferenceInstruction_in_ruleModelingUnit217 = new BitSet(new long[]{0x000000C218038012L});
    public static final BitSet FOLLOW_ruleAdressedAnnotation_in_ruleModelingUnit236 = new BitSet(new long[]{0x000000C218038012L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringWithQuotes_in_ruleEString337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleEString363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringWithQuotes_in_entryRuleStringWithQuotes409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringWithQuotes420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringWithQuotes459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelReferenceInstruction_in_entryRuleLabelReferenceInstruction505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelReferenceInstruction515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLabelReferenceInstruction550 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleTypeLabel_in_ruleLabelReferenceInstruction571 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLabelDeclarationReference_in_ruleLabelReferenceInstruction592 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleLabelReferenceInstruction609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReferenceInstruction_in_entryRuleSectionReferenceInstruction651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionReferenceInstruction661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSectionReferenceInstruction696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSectionOrParagraphReference_in_ruleSectionReferenceInstruction717 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSectionReferenceInstruction738 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleSectionReferenceInstruction756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdressedAnnotation_in_entryRuleAdressedAnnotation798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdressedAnnotation808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAdressedAnnotation851 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAdressedAnnotation875 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAdressedAnnotation885 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAdressedAnnotation895 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAdressedAnnotation905 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAdressedAnnotation926 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAdressedAnnotation937 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAdressedAnnotation958 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleAdressedAnnotation970 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAdressedAnnotation980 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAdressedAnnotation1001 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAdressedAnnotation1011 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAdressedAnnotation1032 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAdressedAnnotation1042 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAdressedAnnotation1063 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAdressedAnnotation1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionOrParagraphReference_in_entryRuleSectionOrParagraphReference1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionOrParagraphReference1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringWithQuotes_in_ruleSectionOrParagraphReference1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelDeclarationReference_in_entryRuleLabelDeclarationReference1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelDeclarationReference1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLabelDeclarationReference1246 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLabelDeclarationReference1267 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleLabelDeclarationReference1278 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLabelDeclarationReference1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelingUnitInstructionReference_in_entryRuleModelingUnitInstructionReference1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelingUnitInstructionReference1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelingUnitInstructionReference_Impl_in_ruleModelingUnitInstructionReference1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelingUnitInstruction_in_entryRuleModelingUnitInstruction1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelingUnitInstruction1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceLevelInstruction_in_ruleModelingUnitInstruction1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceDeclaration_in_ruleModelingUnitInstruction1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionInstruction_in_ruleModelingUnitInstruction1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDeclaration_in_ruleModelingUnitInstruction1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReferenceinModelingUnit_in_ruleModelingUnitInstruction1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelinModelingUnit_in_ruleModelingUnitInstruction1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceLevelInstruction_in_entryRuleInstanceLevelInstruction1656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceLevelInstruction1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanciationInstruction_in_ruleInstanceLevelInstruction1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeatureAffectation_in_ruleInstanceLevelInstruction1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueForStructuralFeature_in_entryRuleValueForStructuralFeature1775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueForStructuralFeature1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeValueForStructuralFeature_in_ruleValueForStructuralFeature1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueForStructuralFeature_in_ruleValueForStructuralFeature1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObjectValueForStructuralFeature_in_ruleValueForStructuralFeature1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelingUnitInstructionReference_Impl_in_entryRuleModelingUnitInstructionReference_Impl1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelingUnitInstructionReference_Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleModelingUnitInstructionReference_Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReferenceinModelingUnit_in_entryRuleSectionReferenceinModelingUnit2012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionReferenceinModelingUnit2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSectionReferenceinModelingUnit2057 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSectionOrParagraphReference_in_ruleSectionReferenceinModelingUnit2078 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSectionReferenceinModelingUnit2099 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleSectionReferenceinModelingUnit2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelinModelingUnit_in_entryRuleLabelinModelingUnit2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelinModelingUnit2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLabel_in_ruleLabelinModelingUnit2215 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLabelinModelingUnit2236 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLabelinModelingUnit2257 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleLabelinModelingUnit2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDeclaration_in_entryRuleAnnotationDeclaration2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationDeclaration2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAnnotationDeclaration2362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleAnnotationDeclaration2379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKeyValForAnnotation_in_ruleAnnotationDeclaration2405 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_20_in_ruleAnnotationDeclaration2416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKeyValForAnnotation_in_ruleAnnotationDeclaration2437 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleAnnotationDeclaration2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanciationInstruction_in_entryRuleInstanciationInstruction2498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanciationInstruction2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInstanciationInstruction2543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleInstanciationInstruction2564 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleInstanciationInstruction2581 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInstanciationInstruction2597 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleStructuralFeatureAffectation_in_ruleInstanciationInstruction2618 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleInstanciationInstruction2629 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleInstanciationInstruction2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeatureAffectation_in_entryRuleStructuralFeatureAffectation2688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeatureAffectation2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleStructuralFeatureAffectation2740 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_ruleAffectationOperator_in_ruleStructuralFeatureAffectation2767 = new BitSet(new long[]{0x0000000030000050L});
    public static final BitSet FOLLOW_ruleValueForStructuralFeature_in_ruleStructuralFeatureAffectation2789 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29_in_ruleStructuralFeatureAffectation2806 = new BitSet(new long[]{0x0000000010000050L});
    public static final BitSet FOLLOW_ruleValueForStructuralFeature_in_ruleStructuralFeatureAffectation2827 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_20_in_ruleStructuralFeatureAffectation2838 = new BitSet(new long[]{0x0000000010000050L});
    public static final BitSet FOLLOW_ruleValueForStructuralFeature_in_ruleStructuralFeatureAffectation2859 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_30_in_ruleStructuralFeatureAffectation2871 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleStructuralFeatureAffectation2884 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleStructuralFeatureAffectation2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeValueForStructuralFeature_in_entryRuleNativeValueForStructuralFeature2943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeValueForStructuralFeature2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringWithQuotes_in_ruleNativeValueForStructuralFeature2999 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleNativeValueForStructuralFeature3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObjectValueForStructuralFeature_in_entryRuleNewObjectValueForStructuralFeature3058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObjectValueForStructuralFeature3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanciationInstruction_in_ruleNewObjectValueForStructuralFeature3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueForStructuralFeature_in_entryRuleReferenceValueForStructuralFeature3148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValueForStructuralFeature3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanciationInstructionReference_in_ruleReferenceValueForStructuralFeature3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionInstruction_in_entryRuleContributionInstruction3238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionInstruction3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelingUnitInstructionReference_in_ruleContributionInstruction3294 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionInstruction3304 = new BitSet(new long[]{0x000000C218208010L});
    public static final BitSet FOLLOW_ruleModelingUnitInstruction_in_ruleContributionInstruction3325 = new BitSet(new long[]{0x000000C218208010L});
    public static final BitSet FOLLOW_21_in_ruleContributionInstruction3336 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleContributionInstruction3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference3395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleTypeReference3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanciationInstructionReference_in_entryRuleInstanciationInstructionReference3497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanciationInstructionReference3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleInstanciationInstructionReference3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValForAnnotation_in_entryRuleKeyValForAnnotation3599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValForAnnotation3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleKeyValForAnnotation3660 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleKeyValForAnnotation3675 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyValForAnnotation3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceReference_in_entryRuleResourceReference3732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceReference3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleResourceReference3777 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleResourceReference3798 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleResourceReference3808 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleResourceReference3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceDeclaration_in_entryRuleResourceDeclaration3867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceDeclaration3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleResourceDeclaration3921 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_STRINGWITHOUTQUOTES_in_ruleResourceDeclaration3938 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceDeclaration3954 = new BitSet(new long[]{0x0000001C00200020L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration3964 = new BitSet(new long[]{0x0000001C00200000L});
    public static final BitSet FOLLOW_34_in_ruleResourceDeclaration3976 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleResourceDeclaration3986 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_URI_in_ruleResourceDeclaration4003 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleResourceDeclaration4018 = new BitSet(new long[]{0x0000001800200020L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4028 = new BitSet(new long[]{0x0000001800200000L});
    public static final BitSet FOLLOW_35_in_ruleResourceDeclaration4042 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleResourceDeclaration4052 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleResourceDeclaration4073 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleResourceDeclaration4083 = new BitSet(new long[]{0x0000001000200020L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4093 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_36_in_ruleResourceDeclaration4107 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResourceDeclaration4117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModelingUnitInstructionReference_in_ruleResourceDeclaration4138 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleResourceDeclaration4148 = new BitSet(new long[]{0x0000001000200020L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4158 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_21_in_ruleResourceDeclaration4171 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_LINE_BREAK_in_ruleResourceDeclaration4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypeLabel4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeLabel4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAffectationOperator4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAffectationOperator4315 = new BitSet(new long[]{0x0000000000000002L});

}