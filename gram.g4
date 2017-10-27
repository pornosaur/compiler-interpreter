grammar gram;



func
    :   var_type ID '(' param* ')' '{' block '}'
    ;

var_type
    :   data_type
    |   struct
    ;

data_type
    :   'string' 
    |   'int'  
    |   'bool'
    ;

struct
    :   data_type '[' ']'
    ;



param
    :   data_type ID
    ;

block
    :   (   declar 
        |   def
        |   loop
        |   cond     
        |   s_switch    
        |   call_fnc
        |   cond_assig
        )*
        r_return? 
    ;

declar
    :   (var_type ID 
        |   var_type def
        )
        ';'
    ;
value
    :   (   ID
        |   num_def
        |   str_def
        |   bool_def
        )
    ; 
def
    :   ID '='
        value
        ';'
    ;

num_def
    :   term( ( '+' | '-'  ) term )*
    |   '+' term ( ( '+' | '-'  ) term )* 
    |   '-' term ( ( '+' | '-'  ) term )*
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
    :   num
    |   '(' num_def ')'
    |   '!' num
    ;

num
    :   INT
    |   real
    |   ID 
    ;

INT
    :   ('0'..'9')+
    ;

real
    :
        INT ('.' INT)?
        
    ;

str_def
    :
        str ('+' str)
    ;

str
    :   '"' /*TODO*/ '"'
    |   ID
    ;
bool_def
    :   bool (bin_oper bool)*
    ;

bool
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
    :   ( ( num_def comp_oper num_def ) | bool_def )
        ( ( bin_oper num_def comp_oper num_def ) | bool_def )*
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
    ;

loop
    : loop_while
    | loop_for
    | do_while
    | foreach
    ;
    
loop_while
    : 'while' '(' cond_head ')' '{' block  '}'
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
        
        '}'
    ;

call_fnc
    : ID '(' ID* ')' ';'
    ;

cond_assig
    : ID '=' '(' cond_head ')' '?' value ':' value';'
    ;

r_return
    :   'return'
        (   value
        |   call_fnc
        )
        ';'
    ;

ID
    :   ('A'..'Z'|'a'..'z')('A'..'Z'|'a'..'z'|'0'..'9')*
    ;
