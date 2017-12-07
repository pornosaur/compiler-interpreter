grammar Grammar;

program
    :   const_declar//func_def*
    ;

func_def
    :   (var_type | 'void') ID '(' (param | 'void') ')' '{' block '}'
    ;

block
    :   (   declar
        |   const_declar
        |   def
        |   loop
        |   cond
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
    :    var_type (ID | def | multiple_def) ';'
    ;

const_declar
    :   'const' var_type (def | multiple_def)
    ;

value
    :   (   ID
        |   num_exp
        |   str_def
        |   bool_def
        |   array_def
        )
    ;

value_array
    :   (   ID
        |   num_exp
        |   str_def
        |   bool_def
        )
    ;

def
    :   ID '=' (ternar_oper | value)
    ;

multiple_def
    :   ID ('=' ID)* '=' (value | ternar_oper)
    ;


num_exp
    :   num_exp op=('*' | '/') num_exp     # multidiv
    |   num_exp op=('+' | '-') num_exp     # plusminus
    |   num                                # numerics
    |   '(' num_exp ')'                    # brackets
    |   sign num_exp                       # signed
    ;

array_def
    :   '{' (value_array (',' value_array)*)? '}'
    ;


term
    :   factor (('*' | '/' | '&' | '|') factor)*
    ;

factor
    :  (num | bool)
    |   '!'? '(' (num_exp | bool)')'
    |   '!' (num | bool)
    ;

num
    :   integer
    |   real
    |   ID
    ;

real
    :   integer ('.' integer)?
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

bool_def
    :   factor (bin_oper factor)*
    ;

bool
    :   'true' | 'false' | ID
    ;
cond
    :   'if' '(' cond_head ')' '{' block '}'
        ( 'else' '{' block '}' )?
    ;

cond_head
    :   ((num_exp comp_oper num_exp) | bool_def)
        ((bin_oper num_exp comp_oper num_exp) | bool_def)*
    ;

bin_oper
    :   '&&'
    |   '||'
    ;

comp_oper
    :   '=='
    |   '>='
    |   '<='
    |   '>'
    |   '<'
    |   '!='
    |   '==='
    ;

loop
    :   loop_while
    |   loop_for
    |   do_while
    |   foreach
    ;

loop_while
    :   'while' '(' cond_head ')' '{' block '}'
    ;

do_while
    :   'do' '{' block '}' 'while' '(' cond_head ')' ';'
    ;
loop_for
    :   'for' '(' data_type def ';' cond_head ';' def ')' '{' block '}'
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
    :   cond_head '?' value ':' value
    ;

r_return
    :   'return'
        (   ternar_oper
        |   value
        |   func
        )
        ';'
    ;

sign
    : '-'
    | '+'
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

