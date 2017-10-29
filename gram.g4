grammar gram;


func_def
    :   var_type ID '(' (param | 'void')')' '{' block '}'
    ;

var_type
    :   data_type
    |   array
    |   'void'
    ;

data_type
    :   'string'
    |   'int'
    |   'boolean'
    ;

array
    :   data_type '[' ']'
    ;

param
    :   (var_type ID (',' var_type ID)*)?
    ;

block
    :   (   declar
        |   def
        |   loop
        |   cond
        |   s_switch
        |   call_fnc
        )*
        r_return?
    ;

declar
    :    var_type (ID | def | multiple_def) ';'
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
    :   term( ( '+' | '-'  ) term )*
    |   '+' term ( ( '+' | '-'  ) term )*
    |   '-' term ( ( '+' | '-'  ) term )*
    ;

array_def
    :   '{' (ID (',' ID)*)? '}'
    ;

term
    :   factor
        (   (   '*'
            |   '/'
            |   '&'
            |   '|'
            )
            factor
        )*
    ;

factor
    :   (num | boolean)
    |   '!'? '(' (num_def | boolean_def)')'
    |   '!' (num | boolean)
    ;

num
    :   INT
    |   real
    |   ID
    ;

INT
    :   NUMERIC+
    ;

real
    :
        INT ('.' INT)?

    ;

str_def
    :
        str ('+' str)*
    ;

str
    :   '"'  (~SPECIAL_CHARS | ESCAPE)* '"'
    ;
boolean_def
    :   factor
        (
             bin_oper
             factor
        )*
    ;

boolean
    :   'true'
    |   'false'
    |   ID
    ;
cond
    :
        'if' '(' cond_head ')' '{' block '}'
        ( 'else' '{' block '}' )?
    ;

cond_head
    :   ( ( num_def comp_oper num_def ) | boolean_def )
        ( ( bin_oper num_def comp_oper num_def ) | boolean_def )*
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
    : loop_while
    | loop_for
    | do_while
    | foreach
    ;

loop_while
    : 'while' '(' cond_head ')' '{' block '}'
    ;

do_while
    : 'do' '{' block '}' 'while' '(' cond_head ')' ';'
    ;
loop_for
    : 'for' '(' data_type def ';' cond_head ';' def ')' '{' block '}'
    ;

foreach
    : 'foreach' '(' var_type ID ':' ID ')' '{' block '}'
    ;

s_switch
    :   'switch' '(' ID ')' '{'
        ( ('case' (num_def | str_def) ':')+ block 'break'?)+
          |
        ( ('default:')+ block 'break'?)?
        '}'
    ;

call_fnc
    : func ';'
    ;

func
    : ID '(' (value (',' value)*)? ')'
    ;

ternar_oper
    : cond_head '?' value ':' value
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
    :   (ALPHABET | SPECIAL) (ALPHABET_NUMERIC | SPECIAL)*
    ;

SPECIAL
    : '_'
    ;


ALPHABET_NUMERIC
    : ALPHABET | NUMERIC
    ;

ALPHABET
    : ('A'..'Z'|'a'..'z')
    ;

NUMERIC
    : ('0'..'9')
    ;

SPECIAL_CHARS
    :   '"'
    ;

ESCAPE
    :   '/' SPECIAL_CHARS
    ;