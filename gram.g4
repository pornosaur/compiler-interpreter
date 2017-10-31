grammar gram;

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
    |   'int'
    |   'boolean'
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
        |   num_def
        |   str_def
        |   boolean_def
        |   array_def
        )
    ;

def
    :   ID '=' (ternar_oper | value)
    ;

multiple_def
    :   ID ('=' ID)* '=' (value | ternar_oper)
    ;

num_def
    : sign? term (sign term)*
    ;

array_def
    :   '{' (value (',' value)*)? '}'
    ;

term
    :   factor (('*' | '/' | '&' | '|') factor)*
    ;

factor
    :  (num | boolean)
    |   '!'? '(' (num_def | boolean_def)')'
    |   '!' (num | boolean)
    ;

num
    :   int
    |   real
    |   ID
    ;

real
    :   int ('.' int)?
    ;

int
    :   NUMERIC+
    ;

str_def
    :   str ('+' str)*
    ;

str
    :   '"' (~SPECIAL_CHARS | ESCAPE)* '"'
    ;

boolean_def
    :   factor (bin_oper factor)*
    ;

boolean
    :   'true' | 'false' | ID
    ;
cond
    :   'if' '(' cond_head ')' '{' block '}'
        ( 'else' '{' block '}' )?
    ;

cond_head
    :   ((num_def comp_oper num_def) | boolean_def)
        ((bin_oper num_def comp_oper num_def) | boolean_def)*
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
        ( ('case' (num_def | str_def) ':')+ block 'break'?)+
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

