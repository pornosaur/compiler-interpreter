grammar Grammar;

program
    :   func_def*
    ;

func_def
    :   return_type ID '(' param ')' '{' block '}'
    ;

return_type
    :   var_type | 'void'
    ;

block
    :   (   declar
        |   const_declar
        |   def
        |   multiple_def
        |   loop
        |   statement
        |   s_switch
        |   call_fnc
        )*
        r_return?
    ;

data_type
    :   'string'
    |   'integer'
    |   'bool'
    ;

array
    :   data_type '[' ']'
    ;

var_type
    :   data_type
    |   array
    ;

param
    :   (var_type ID (',' var_type ID)*)?
    ;

declar
    :   var_type ID ';'         # declarID
    |   var_type def            # declarDef
    ;

const_declar
    :   'const' var_type def
    ;

value
    :   (   ID
        |   num_exp
        |   str_def
        |   bool_exp
        |   array_def
        )
    ;

value_array
    :   (   ID
        |   num_exp
        |   str_def
        |   bool_exp
        )
    ;

def
    :   ID '=' (ternar_oper | value) ';'
    ;

multiple_def
    :   ID ('=' ID)+ '=' (value | ternar_oper) ';'
    ;


num_exp
    :   num_exp op=('*' | '/') num_exp     # multiDiv
    |   num_exp op=('+' | '-') num_exp     # plusMinus
    |   integer                            # integers
    |   integer ('.' integer)?             # real
    |   '(' num_exp ')'                    # numBrackets
    |   sign=('+' | '-') num_exp           # signed
    ;

array_def
    :   '{' (value_array (',' value_array)*)? '}'
    ;

integer
    :   NUMERIC+
    ;

str_def
    :   str ('+' str)*
    ;

str
    :   '"' (~SPECIAL_CHARS | ESCAPE)* '"'
    ;

bool_exp
    :   num_exp op=('<' | '>' | '==' | '<=' | '>=' | '!=') num_exp # boolNumExp
    |   bool_exp op=('!=' | '==') bool_exp                         # boolCompare
    |   bool_exp op=('&&' | '||') bool_exp                         # boolExp
    |   bool                                                       # boolean
    |   '(' bool_exp ')'                                           # boolBrackets
    |   '!' bool_exp                                               # boolNeg
    ;

bool
    :   'true' | 'false'
    ;

statement
    :   'if' '(' bool_exp ')' '{' block '}'
        ( 'else' '{' block '}' )?
    ;

loop
    :   loop_while
    |   loop_for
    |   do_while
    |   foreach
    ;

loop_while
    :   'while' '(' bool_exp ')' '{' block '}'
    ;

do_while
    :   'do' '{' block '}' 'while' '(' bool_exp ')' ';'
    ;
loop_for
    :   'for' '(' data_type def ';' bool_exp ';' def ')' '{' block '}'
    ;

foreach
    :   'foreach' '(' var_type ID ':' ID ')' '{' block '}'
    ;

s_switch
    :   'switch' '(' ID ')' '{'
        ( ('case' (num_exp | str_def) ':')+ block 'break'?)+
          |
        ( ('default:')+ block 'break'?)?
        '}'
    ;

call_fnc
    :   func ';'
    ;

func
    :   ID '(' (value (',' value)*)? ')'
    ;

ternar_oper
    :   bool_exp '?' value ':' value ';'
    ;

r_return
    :   'return'
        (   ternar_oper
        |   value
        |   func
        )
        ';'
    ;

ID
    :   (ALPHABET | CHARS) (ALPHABET_NUMERIC | CHARS)*
    ;

CHARS
    :   '_'
    ;

NUMERIC
    :   ('0'..'9')
    ;

ALPHABET_NUMERIC
    :   ALPHABET | NUMERIC
    ;

ALPHABET
    :   ('A'..'Z' | 'a'..'z')
    ;

SPECIAL_CHARS
    :   '"'
    ;

ESCAPE
    :   '/' SPECIAL_CHARS
    ;


MULTIDIV
    :   '/' | '*'
    ;

WS
    :   [ \t\n\r]+ -> skip
    ;

