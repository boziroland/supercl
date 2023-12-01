grammar simple;

program : statement* ;
statement : definition | ifStatement ;
definition : TYPE VARIABLE ('=' NUMBER)? ';' ;
lessThan : (VARIABLE | NUMBER) '<' (VARIABLE | NUMBER) ;
postFix : VARIABLE ('++' | '--') ;
ifStatement : 'if' '(' (postFix | lessThan) ')' '{' statement* '}' ;

TYPE : 'char' | 'int' | 'bool' | 'float';
VARIABLE : LETTER+ ;
LETTER : [a-zA-Z] ;
NUMBER : [0-9] ;
WS : (' '| '\t' | '\n' | '\r') -> skip ;