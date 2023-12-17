grammar kernel;

program
    :   statementList
    ;

statementList
    :   statement*
    ;

statement
    : if | for | while | methodHeader | method | declaration | methodCall | MULTILINECOMMENT | SINGLELINECOMMENT | class | prefixOperator | postfixOperator | assignment | returnExpression
    ;

for
    : FOR LPARENT declaration SEMI expression SEMI expression RPARENT block
    ;

className
    : WORD
    ;

class
    : CLASS className (EXTENDS className)? BLOCKBEGIN ((typeName WORD) | method)+ BLOCKEND
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
    : RETURN expression
    ;

methodBody
    : BLOCKBEGIN statementList BLOCKEND
    ;

methodCallParameter
    : realNumberVec2D | realNumberVec3D | REALNUMBER | STRING | methodCall | variable
    ;

methodCall
    : WORD LPARENT (methodCallParameter)? (COMMA methodCallParameter)* RPARENT
    ;

declaration
    : MEMORY_QUALIFIER? typeName variable (ASSIGN cast? LPARENT* expression RPARENT*)?
    ;

assignment
    : variable (ASSIGN | specialAssign) cast? (WORD | REALNUMBER | methodCall | STRING | expression | variable)
    ;

expression
    : LPARENT* (prefixOperator | postfixOperator | binaryOperator | literal) (CONNECTIVE expression)* RPARENT*
    ;

literal
    : realNumberVec2D | realNumberVec3D | TRUE | FALSE | WORD | REALNUMBER | STRING | variable | methodCall
    ;

prefixOperator
    : (PLUSPLUS | MINUSMINUS) variable
    ;

postfixOperator
    : variable (PLUSPLUS | MINUSMINUS)
    ;

expressionWithReturnValue
    : LPARENT* (variable | WORD | REALNUMBER | methodCall | STRING | binaryOperator) RPARENT*
    ;

binaryOperator
    : literal (STAR | MOD | DIV) (literal | binaryOperator | expression)
    | literal (PLUS | MINUS)  (literal | binaryOperator | expression)
    | literal (EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATER | GREATEREQUAL) (literal | binaryOperator | expression)
    ;

specialAssign
    : STARASSIGN | DIVASSIGN | MODASSIGN | PLUSASSIGN | MINUSASSIGN | ANDASSIGN | XORASSIGN | ORASSIGN
    ;

variable
    : WORD ('.' (WORD | methodCall))* (LEFTBRACKET (REALNUMBER | WORD) RIGHTBRACKET)? ('.' (WORD | methodCall))*
    ;

typeName
    : (TYPE | WORD) (LEFTBRACKET REALNUMBER RIGHTBRACKET)?
    ;

cast
    : LPARENT (TYPE | className) RPARENT
    ;


realNumberVec2D
    : LPARENT (REALNUMBER | expression) COMMA (REALNUMBER | expression) RPARENT
    ;

realNumberVec3D
    : LPARENT (REALNUMBER | expression) COMMA (REALNUMBER | expression) COMMA (REALNUMBER | expression) RPARENT
    ;

SINGLELINECOMMENT
    : INLINECOMMENT WORD* -> channel(HIDDEN)
    ;

MULTILINECOMMENT
    : BLOCKCOMMENTSTART WORD* BLOCKCOMMENTEND -> channel(HIDDEN)
    ;

CONNECTIVE
    : (CONJUNCTION | DISJUNCTION)
    ;

TYPE
    : 'float' | 'string' | 'bool' | 'int' | 'void' | 'float2' | 'float3' | 'int2' | 'int3'
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
CONJUNCTION : '&&';
DISJUNCTION : '||';
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