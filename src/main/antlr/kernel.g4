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
    : if | for | while | methodHeader | method | declaration | methodCall | singleLineComment | multiLineComment | class | prefixOperator | postfixOperator | assignment
    ;

for
    : FOR LPARENT declaration SEMI expression SEMI expression RPARENT block
    ;

class
    : CLASS WORD BLOCKBEGIN (TYPE WORD)+ BLOCKEND
    ;

parameter
    :   MEMORY_QUALIFIER? TYPE WORD
    ;

methodHeader
    : (KERNEL | TYPE) WORD LPARENT parameter (COMMA parameter)* RPARENT
    ;

method
    : methodHeader block
    ;

while
    : WHILE LPARENT expression RPARENT block
    ;

if
    : IF LPARENT expression RPARENT block (ELSE (block | if))*
    ;

block
    : BLOCKBEGIN (statement)* BLOCKEND
    ;

singleLineComment
    : INLINECOMMENT WORD*
    ;

multiLineComment
    : BLOCKCOMMENTSTART WORD* BLOCKCOMMENTEND
    ;

methodCall
    : WORD LPARENT (WORD | REALNUMBER | STRING | methodCall) (',' (WORD | REALNUMBER | STRING | methodCall))* RPARENT
    ;

declaration
    : MEMORY_QUALIFIER? (TYPE | WORD) WORD ASSIGN (WORD | REALNUMBER | methodCall | STRING | expression)
    ;

assignment
    : WORD (ASSIGN | specialAssign) (WORD | REALNUMBER | methodCall | STRING | expression)
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

specialAssign
    : STARASSIGN | DIVASSIGN | MODASSIGN | PLUSASSIGN | MINUSASSIGN | ANDASSIGN | XORASSIGN | ORASSIGN
    ;

TYPE
    : 'float' | 'string' | 'bool' | 'int' | 'void'
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

WORD
    : LETTER (LETTER | REALNUMBER)*
    ;

fragment LETTER
    : [a-zA-Z]
    ;

fragment NUMBER
    : [0-9]
    ;