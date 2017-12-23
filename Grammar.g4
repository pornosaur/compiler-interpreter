grammar Grammar;

program
    :   func_def*
    ;

func_def
    :   return_type ID '(' param ')' '{' block '}'
    ;

return_type
    :   data_type | 'void'
    ;

block
    :   (   declar ';'
        |   const_declar ';'
        |   def ';'
        |   multiple_def ';'
        |   parallel_def ';'
        |   array_def ';'
        |   loop
        |   statement
        |   s_switch
        |   func ';'
        )*
         r_return?
    ;

data_type
    :   'string'
    |   'integer'
    |   'bool'
    ;

param
    :   (data_type ID (',' data_type ID)*)?
    ;

declar
    :   data_type ID         	            # declarID
    |	data_type ID '[' (integer | ID) ']' # declarArray
    |   data_type def            	        # declarDef
    ;

const_declar
    :   'const' data_type def
    ;

value
    :   (   ID
        |   num_exp
        |   str_def
        |   bool_exp
        |   array_def ';'
        )
    ;

def
    :   ID '=' (func | ternar_oper | value)
    ;

multiple_def
    :   ID ('=' ID)+ '=' (func |value | ternar_oper)
    ;

parallel_def
    : '{'ID (',' ID)*'}' '=' '{' (func | value) (',' (func | value))* '}'
    ;
    
array_def
    : 	ID '['value']' '=' (func | ternar_oper | value)
    ;

num_exp
    :   num_exp op=('*' | '/') num_exp     # multiDiv
    |   num_exp op=('+' | '-') num_exp     # plusMinus
    |   integer                            # integers
    |   func                               # numFunc
    |   ID'['num_exp']'                    # numArray
    |   ID                                 # numID
    |   '(' num_exp ')'                    # numBrackets
    |   sign=('+' | '-') num_exp           # signed
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
    |   ID                                                         # boolID
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
    :   'foreach' '(' data_type ID ':' ID ')' '{' block '}'
    ;

s_switch
    :   'switch' '(' ID? ')' '{'
        (s_case+
          |
         s_default?
         )
        '}'
    ;

s_case
    :   ('case' (num_exp | str_def) ':' block (BREAK)?)
    ;

s_default
    :   'default:' block (BREAK)?
    ;

func
    :   ID '(' (value (',' value)*)? ')'
    ;

ternar_oper
    :   bool_exp '?' value ':' value
    ;

r_return
    :   'return'
        (   ternar_oper
        |   value
        |   func
        )
        ';'
    ;

BREAK
    : 'break;'
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

