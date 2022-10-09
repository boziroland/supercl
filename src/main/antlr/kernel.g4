grammar kernel;

//options {
//    tokenVocab = 'KernelLexer';
//}

program
    :   statementList
    ;

statementList
    :   statement*
    ;

statement
    : for | while | if | methodHeader | method | assignment | methodCall | singleLineComment | multiLineComment | class | prefixOperator | postfixOperator | if
    ;

class
    : CLASS WORD BLOCKBEGIN WORD+ BLOCKEND
    ;

parameter
    :   MEMORY_QUALIFIER? WORD
    ;

methodHeader
    : (KERNEL | DEF) WORD LPARENT parameter (COMMA parameter)* RPARENT
    ;

method
    : methodHeader BLOCKBEGIN block BLOCKEND
    ;

for
    : FOR LPARENT assignment COLON expression COLON expression RPARENT block
    ;

while
    : WHILE LPARENT expression RPARENT block
    ;

if
    : IF LPARENT expression RPARENT block (ELSE (block | if))*
    ;

block
    : BLOCKBEGIN (if | assignment | prefixOperator | postfixOperator | methodCall | singleLineComment | multiLineComment)* BLOCKEND
    ;

singleLineComment
    : INLINECOMMENT WORD*
    ;

multiLineComment
    : BLOCKCOMMENTSTART WORD* BLOCKCOMMENTEND
    ;

methodCall
    : WORD LPARENT (assignment | WORD | REALNUMBER | STRING) (',' (assignment | WORD | REALNUMBER | STRING))* RPARENT
    ;

assignment
    : MEMORY_QUALIFIER? WORD ASSIGN (WORD | REALNUMBER | methodCall | STRING | expression)
    ;

expression
    : (prefixOperator | postfixOperator | binaryOperator | TRUE) ((AND | OR) expression)*
    ;

prefixOperator
    : (PLUSPLUS | MINUSMINUS) WORD
    ;

postfixOperator
    : WORD (PLUSPLUS | MINUSMINUS)
    ;

binaryOperator
    : (WORD | REALNUMBER | methodCall | STRING) (PLUS | MINUS | STAR | MOD | DIV | EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATER | GREATEREQUAL) (WORD | REALNUMBER | methodCall | STRING)
    ;

WORD
    : LETTER (LETTER | REALNUMBER)*
    ;

REALNUMBER
    : FLOAT | NUMBER+
    ;

FLOAT
    : NUMBER+ '.' NUMBER+
    ;

MEMORY_QUALIFIER
    : '__global' | '__local' | '__constant'
    ;

BARRIER_OPERATOR
    : 'synchronized'
    ;

KERNEL
    : '__kernel'
    ;

STRING
	: '"' (~[\r\n"])* '"'
	;

LPARENT
    : '('
    ;

RPARENT
    : ')'
    ;

BLOCKBEGIN
    : '{'
    ;

BLOCKEND
    : '}'
    ;

LEFTBRACKET
    : '['
    ;

RIGHTBRACKET
    : ']'
    ;

PLUS : '+';
PLUSPLUS : '++';
MINUS : '-';
MINUSMINUS : '--';
STAR : '*';
DIV : '/';
MOD : '%';

AND : '&';
OR : '|';
ANDAND : '&&';
OROR : '||';
CARET : '^';
NOT : '!';
TILDE : '~';

QUESTION : '?';
COLON : ':';
SEMI : ';';
COMMA : ',';

ASSIGN : '=';

// '*=' | '/=' | '%=' | '+=' | '-=' | '&=' | '^=' | '|='
STARASSIGN : '*=';
DIVASSIGN : '/=';
MODASSIGN : '%=';
PLUSASSIGN : '+=';
MINUSASSIGN : '-=';
ANDASSIGN : '&=';
XORASSIGN : '^=';
ORASSIGN : '|=';

EQUAL : '==';
NOTEQUAL : '!=';

INLINECOMMENT : '//';
BLOCKCOMMENTSTART : '/*';
BLOCKCOMMENTEND : '*/';

TRUE: 'true';
FALSE: 'false';

LESS : '<';
LESSEQUAL : '<=';
GREATER : '>';
GREATEREQUAL : '>=';

CLASS
    : 'class '
    ;

IF
    : 'if'
    ;

ELSE
    : 'else'
    ;

FOR
    : 'for'
    ;

WHILE
    : 'while'
    ;

DEF
    : 'def'
    ;

WS	: 	(' '| '\t' | '\n' | '\r') -> skip
	;

fragment LETTER
    : [a-zA-Z]
    ;

fragment NUMBER
    : [0-9]
    ;