grammar Grammar;

program
    :   func_def*
    ;

func_def
    :   return_type ID '(' param ')' '{' block '}'
    ;

return_type
    :    array_type | data_type | 'void'
    ;

array_type
    :   data_type '['']'
    ;

block
    :   (   declar ';'
        |   const_declar ';'
        |   def ';'
        |   multiple_def ';'
        |   parallel_def ';'
        |   array_def ';'
        |   array_asigne ';'
        |   loop
        |   statement
        |   s_switch
        |   func ';'
        )*
         r_return?
    ;

data_type
    :   'integer'
    |   'bool'
    ;

param
    :   (param_item (',' param_item)*)?
    ;

param_item
    :   ((data_type ID)| array_param)
    ;

array_param
    :   data_type ID '['']'
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
        |   array_pos
        |   num_exp
        |   bool_exp
        )
    ;

array_pos
    :   ID '[' (integer | ID) ']'
    ;

array_asigne
    :   data_type ID '[' ']' '=' (ID | func)
    ;

def
    :   ID '=' (value | func | ternar_oper)
    ;

multiple_def
    :   ID ('=' ID)+ '=' (value | func | ternar_oper)
    ;

parallel_def
    : '{' ID (',' ID)*'}' '=' '{' (value | func) (',' (value | func))* '}'
    ;
    
array_def
    : 	ID '['value']' '=' ( func | value | ternar_oper)
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
    :  NUMVAL
    ;

bool_exp
    :   num_exp op=('<' | '>' | '==' | '<=' | '>=' | '!=') num_exp # boolNumExp
    |   bool_exp op=('!=' | '==') bool_exp                         # boolCompare
    |   bool_exp op=('&&' | '||') bool_exp                         # boolExp
    |   bool                                                       # boolean
    |   func                                                       # boolFunc
    |   ID'['num_exp']'                                            # boolArray
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
    |   repeat_until
    |   foreach
    ;

loop_while
    :   'while' '(' bool_exp ')' '{' block '}'
    ;

do_while
    :   'do' '{' block '}' 'while' '(' bool_exp ')' ';'
    ;

repeat_until
    :   'repeat' '{' block '}' 'until' '(' bool_exp ')' ';'
    ;

loop_for
    :   'for' '(' data_type def ';' bool_exp ';' def ')' '{' block '}'
    ;

foreach
    :   'foreach' '(' data_type ID ':' ID ')' '{' block '}'
    ;

s_switch
    :   'switch' '(' ID ')' '{' ('case' num_exp ':' block s_break)* '}'
    ;

s_break
    :   BREAK?
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
        |   array_pos
        )
        ';'
    ;

BREAK
    :   'break;'
    ;

ID
    :   (ALPHABET | CHARS) (ALPHABET_NUMERIC | CHARS)*
    ;

CHARS
    :   '_'
    ;

NUMVAL
    : NUMERIC+
    ;

ALPHABET_NUMERIC
    :   ALPHABET | NUMERIC
    ;

ALPHABET
    :  ('A'..'Z' | 'a'..'z')
    ;

MULTIDIV
    :   '/' | '*'
    ;

WS
    :   [ \t\n\f\r]+ -> skip
    ;

fragment NUMERIC
    :   [0-9]
    ;