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
    : if | for | while | methodHeader | method | declaration | methodCall | singleLineComment | multiLineComment | class | prefixOperator | postfixOperator | assignment | returnExpression
    ;

for
    : FOR LPARENT declaration expression SEMI expression RPARENT block
    ;

className
    : WORD
    ;

class
    : CLASS className (EXTENDS className)? BLOCKBEGIN ((typeName WORD SEMI) | method)+ BLOCKEND
    ;

parameter
    :   MEMORY_QUALIFIER? typeName WORD
    ;

methodHeader
    : (KERNEL | typeName) WORD LPARENT parameter? (COMMA parameter)* RPARENT
    ;

method
    : methodHeader methodBody
    ;

while
    : WHILE LPARENT expression RPARENT block
    ;

if
    : IF LPARENT expression RPARENT block else*
    ;

else
    : ELSE (block | if)
    ;

block
    : BLOCKBEGIN statementList BLOCKEND
    ;

returnExpression
    : RETURN expressionWithReturnValue SEMI
    ;

methodBody
    : BLOCKBEGIN statementList BLOCKEND
    ;

singleLineComment
    : INLINECOMMENT WORD*
    ;

multiLineComment
    : BLOCKCOMMENTSTART WORD* BLOCKCOMMENTEND
    ;

methodCall
    : WORD LPARENT (WORD | REALNUMBER | STRING | methodCall | variable) (',' (WORD | REALNUMBER | STRING | methodCall | variable))* RPARENT
    ;

declaration
    : MEMORY_QUALIFIER? typeName variable (ASSIGN cast? LPARENT* expression RPARENT*)? SEMI
    ;

assignment
    : variable (ASSIGN | specialAssign) cast? (WORD | REALNUMBER | methodCall | STRING | expression | variable)
    ;

expression
    : LPARENT* (prefixOperator | postfixOperator | binaryOperator | literal) ((andandoror) expression)* RPARENT*
    ;

literal
    : TRUE | FALSE | WORD | REALNUMBER | STRING | variable | methodCall
    ;

prefixOperator
    : (PLUSPLUS | MINUSMINUS) (WORD | variable)
    ;

postfixOperator
    : (WORD | variable) (PLUSPLUS | MINUSMINUS)
    ;

expressionWithReturnValue
    : LPARENT* (variable | WORD | REALNUMBER | methodCall | STRING | binaryOperator) RPARENT*
    ;

binaryOperator
    : literal (STAR | MOD | DIV) (literal | binaryOperator)
    | literal (PLUS | MINUS)  (literal | binaryOperator)
    | literal (EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATER | GREATEREQUAL) (literal | binaryOperator)
    ;

specialAssign
    : STARASSIGN | DIVASSIGN | MODASSIGN | PLUSASSIGN | MINUSASSIGN | ANDASSIGN | XORASSIGN | ORASSIGN
    ;

variable
    : WORD ('.' (WORD | methodCall))*
    ;

typeName
    : TYPE | WORD
    ;

cast
    : LPARENT (TYPE | className) RPARENT
    ;

andandoror
    : (ANDAND | OROR)
    ;

TYPE
    : 'float' | 'string' | 'bool' | 'int' | 'void' | 'float2'
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

EXTENDS
    : 'extends'
    ;

PRIVATE
    : 'private'
    ;

PUBLIC
    : 'public'
    ;

PROTECTED
    : 'protected'
    ;

RETURN
    : 'return'
    ;

WS
    : (' '| '\t' | '\n' | '\r') -> skip
    ;

WORD
    : LETTER (LETTER | REALNUMBER | '_' | '.')*
    ;

fragment LETTER
    : [a-zA-Z]
    ;

fragment NUMBER
    : [0-9]
    ;