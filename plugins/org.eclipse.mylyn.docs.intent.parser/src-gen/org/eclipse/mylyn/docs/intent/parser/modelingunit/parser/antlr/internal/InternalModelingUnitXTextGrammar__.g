lexer grammar InternalModelingUnitXTextGrammar;
@header {
package org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : '@see' ;
T16 : 'lineBreak' ;
T17 : 'AdressedAnnotation' ;
T18 : '{' ;
T19 : 'receiver' ;
T20 : ',' ;
T21 : '}' ;
T22 : 'source' ;
T23 : 'message' ;
T24 : 'type' ;
T25 : 'href' ;
T26 : 'referencedElement' ;
T27 : '@Annotation' ;
T28 : 'new' ;
T29 : '[' ;
T30 : ']' ;
T31 : ';' ;
T32 : '=' ;
T33 : 'Resource' ;
T34 : 'URI' ;
T35 : 'contentType' ;
T36 : 'content' ;
T37 : '+=' ;
T38 : '@lazylabel' ;
T39 : '@label' ;

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2554
RULE_EINT : RULE_INT;

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2556
RULE_STRINGWITHOUTQUOTES : ('a'..'z'|'A'..'Z'|'0'..'9'|'.'|':'|'_'|'-')+;

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2558
RULE_URI : '"' ('file:/'|'platform:/'|'cdo:/') ('a'..'z'|'A'..'Z'|'0'..'9'|'.'|'/'|':'|'_'|'-')+ '"';

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2560
RULE_LINE_BREAK : '\n';

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2562
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2564
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2566
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2568
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2570
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2572
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.mylyn.docs.intent.parser/src-gen/org/eclipse/mylyn/docs/intent/parser/modelingunit/parser/antlr/internal/InternalModelingUnitXTextGrammar.g" 2574
RULE_ANY_OTHER : .;


