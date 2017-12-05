grammar Basic;

@header{
package basicintast.parser;
import basicintast.util.*;
}

@members{
String traducao = "";
String aux = "";
char open = '{';
char close = '}';
String num = "";
String num2 = "";
}


progr : PROGRAM ID EOL          {traducao+=      "#include<iostream>\n";
                                traducao+="using namespace std;\n";
                                traducao+="int main()"+open+"\n"; 
 
                                } block    #progrRule;
   
block : varBlock? statementBlock    #blockRule;

varBlock : VAR var+ #varBlockRule;

var: ID (','ID)* VARDEC simpletype EOL    {traducao+=$ID.text + ";" + "\n";} #varIDDec
    
    | ID OPCOL {aux+=$ID.text;} expr CLCOL                                              #indexedVar   
    | ID VARDEC {aux+=$ID.text;}  arraytype                      #varArrayType
    | ID                            {aux+=$ID.text;}                   #varID;
   

type: simpletype   #typeSimple 
    | arraytype    #typeArray;

simpletype: STRING      {traducao += "string ";}#simpleTypeString
            | INTEGER   {traducao += "int ";}#simpleTypeInteger
            | FLOAT     {traducao += "float ";}#simpleTypeFloat
            | BOOLEAN   {traducao += "bool ";}#simpleTypeBool;

arraytype: ARRAY OPCOL indexrange CLCOL OF simpletype {traducao+=aux+"["+num2+"-"+num+"];"+"\n";}  #arrayTypeRule;

indexrange: NUM{num+=$NUM.text;} '..' NUM{num2+=$NUM.text;}   #IndexRangeRule;

statementBlock: BEGIN statement* {traducao+="\n"+close;}END {CriarCPP.get(traducao);}#stateBlock; 

cond: IF {traducao+="\nif(" ;} condExpr (orand)* {traducao+= $condExpr.text + ")" + open + "\n";} THEN b1 = statementBlock  ELSE {traducao+="else" + open ;} b2 = statementBlock {traducao+= close + "/n" ;} #condIfThenElseState
    | IF {traducao+="\nif(" ;} condExpr (orand)* {traducao+= $condExpr.text + ")" + open + "\n";} THEN statementBlock  ELSE {traducao+="else" + open ;} cond {traducao+=  close + "\n" ;}    #condIfThenElseCond
    | IF {traducao+="\nif(" ;} condExpr (orand)* {traducao+= $condExpr.text + ")" + open + "\n";} THEN  statementBlock #condIfThen; 
           

forLoop: FOR {traducao += "\nfor (";} b1 = statement* EOL condExpr EOL {traducao += $condExpr.text + ";";}  b2 = statement* {traducao += ")" + open + "\n";}DO statementBlock #forLoopRule;

whileLoop: WHILE {traducao += "\nwhile (";} condExpr+ (orand)* {traducao += $condExpr.text + ")";} DO {traducao += open + "\n";}statementBlock  #whileLoopRule;  

statement : attr        #stateAttr
           | cond       #stateCond
           | write      #stateWrite
           | writeln    #stateWriteLn
           | read       #stateRead
           | expr       #stateExpr
           | forLoop    #stateForLoop
           | procedure  #stateProcedure
           | whileLoop  #stateWhileLoop;
           
           
attr: ID ATTR expr {traducao += $ID.text + " = " + $expr.text + "; ";}#attrRule
    | ID OPCOL expr CLCOL ATTR  {traducao += $ID.text + "[" + $expr.text + "]" + " = ";} expr {traducao += $expr.text + ";";} #attrArray;

write: WRITE OPPAR b1 =condExpr(','b2 = condExpr)* CLPAR  {traducao+= "cout << " + $b1.text + ";\n";}       #writeRule; 

writeln: WRITELN OPPAR condExpr(','condExpr)* CLPAR{traducao+= "cout << " + $condExpr.text + " << endl; \n";} #writeLnRule;

read: READ OPPAR ID ( ',' ID)* CLPAR {traducao += "cin >> " + $ID.text + ";\n";} #readRule; 

expr: expr1 PLUS  expr   #exprPlus
      | expr1 MINUS expr #exprMinus
      | expr1 #exprEmpty;  

expr1: expr2 TIMES expr #expr1TIMES
       | expr2 DIV expr #expr1DIV
       | expr2 #expr1RuleEmpty;

expr2: OPPAR expr CLPAR #expr2Expr
       | NUM    #expr2NUM
       | ID OPCOL expr CLCOL #expr2Array
       | ID     #expr2ID
       | STR    #expr2STR
       | TRUE   #expr2True
       | FALSE  #expr2False;             

condExpr: b2=expr EQ b1=expr   #condExprRuleEquals  
          | b2=expr DF  b1=expr #condExprRuleDifferent
          | b2=expr LT b1=expr #condExprRuleMenor
          | b2=expr GT b1=expr #condExprRuleMaior
          | b2=expr LTE b1=expr #condExprRuleMenorIgual
          | b2=expr GTE b1=expr #condExprRuleMaiorIgual
          | b2=expr    #condExprRuleEmpty;

orand: OR condExpr     #OrandOR
      | AND condExpr   #OrandAND;

procedure: PROCEDURE ID EOL block  #ProcedureRule; 


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

// ---[Tokens]-----------------------------
EOL       : ';';
IF        : I F;
THEN      : T H E N;
ELSE      : E L S E;
WHILE     : W H I L E;
BEGIN     : B E G I N;
END       : E N D;
WRITE     : W R I T E;
WRITELN   : W R I T E L N;
PROGRAM   : P R O G R A M;
VAR       : V A R;
STRING    : S T R I N G;
INTEGER   : I N T E G E R;
FLOAT     : F L O A T;
BOOLEAN   : B O O L E A N;
ARRAY     : A R R A Y;
TRUE      : T R U E;
FALSE     : F A L S E;
READ      : R E A D;
OF        : O F;
FOR       : F O R;
OR        : O R;
AND       : A N D;
DO        : D O;
PROCEDURE : P R O C E D U R E;
OPCOL     : '[';
CLCOL     : ']';
OPPAR     : '(';
CLPAR     : ')';
ATTR      : ':=';
VARDEC    : ':';

ID        : [a-zA-Z][a-zA-Z0-9]*;
EQ        : '==';
STR       : ["].*?["];
NUM       : [-]?[0-9]+(.[0-9]+)?;
PLUS      : '+';
MINUS     : '-';
TIMES     : '*';
DIV       : '/';
DF        : '!=';
LT        : '<';
GT        : '>';
LTE       : '<=';
GTE       : '>=';
WS        : [\n\r \t]+ -> skip;