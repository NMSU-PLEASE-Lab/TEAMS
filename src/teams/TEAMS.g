grammar TEAMS;
/*options
{
//backtrack=true;
}*/
@parser::header
{
package teams;
import java.util.Vector;
import extension.*;
}
@lexer::header
{
package teams;
}
@members 
{ 
/*
* An instance of the Aspect class to hold the aspect's data 
*/
Aspect myAsp = new Aspect();
}

/* This will be the entry point of our parser. */
eval   returns [Aspect value]
    : e= aspect
        {
        myAsp = $aspect.value;
        $value = $aspect.value; 
        }
    ;


aspect returns [Aspect value]
	: {
            $value =new Aspect();
          }
            'aspect'(SPACE|WS)? e=myAspect
            {
            $value.setName( $e.text);
            }
             (SPACE|WS)?'{'(SPACE|WS)?((SPACE|WS)? pointcutDefinition  
                         {
                         $value.addPointcut( $pointcutDefinition.value);
                         }
                     ) * 
           ( (SPACE|WS)? adviceDefinition 
                         {
                         $value.addAdvice( $adviceDefinition.value);
                         //System.out.print("An advice is added");
                        // System.out.println(" with Id: "+$value.getAdvice().elementAt(0).getName());
                         }
                           )*
            
            '}' 
        ;
	
myAspect returns [String value]
	: Identifier 
            {
            $value = $Identifier.text;
            }
	;
	
pointcutDefinition  returns [PointcutExpression value]
    :
    {
    $value = new PointcutExpression();
    }
    (SPACE|WS)?'pointcut ' (Identifier )'(' e=args ')' ':' e1=pointcutExp
        {
	$value.setPC($pointcutExp.value);
        $value.setName( $Identifier.text);
	$value.setArgs($args.value);
	}          
	';'
    ;

adviceDefinition  returns [AdviceExpression value]
    :
    {
    $value = new AdviceExpression();
    }
    (SPACE|WS)? (Identifier )? (SPACE|WS)? e1=adviceExp ':' pointcutExpReferences
        {
         $value.setAdvice($adviceExp.value);
         $value.setPointcutList( $pointcutExpReferences.value);
         $value.setName($Identifier.text);
        } 
        ';'
    ;
pointcutExpReferences returns[Vector<Argument> value]
	:	e1 =args{$value = $e1.value;}
	;
adviceExp returns [AdviceExecutionModel value]
    :
        
   (SPACE|WS)? e1=adviceExecutionModel (SPACE|WS)?
            {
            //$value = new AdviceExecutionModel();
            $value = $adviceExecutionModel.value;
            }
    | e2=adviceExp(SPACE|WS)? ',' (SPACE|WS)? e3=adviceExp(SPACE|WS)?
            {
            $value = new CommaExpression();
            ((CommaExpression) $value).setOperand($e2.value, $e3.value);
            }
    ;

adviceExecutionModel returns [AdviceExecutionModel value]
    :
        {
       // $value= new AdviceExecutionModel();
        }
        e1 = before
            {
            $value = $before.value;
            }
            |
            e2 = after
            {
            $value = $after.value;
            }
   ;
before returns[BeforeAdviceExecutionModel value]
	:{System.err.println("JECG: creating before AEM");
     $value = new BeforeAdviceExecutionModel(); $value.setName("before");} 
         'before' '(' (SPACE|WS)? ')'
	;
after returns[AfterAdviceExecutionModel value]
	:{System.err.println("JECG: creating after AEM");
     $value = new AfterAdviceExecutionModel(); $value.setName("after");} 
         'after' '(' (SPACE|WS)? ')'
	;
/*andPointcutExp returns[AndExpression value]
	:  e1=pointcutExp '&&' e2=pointcutExp
            {
            $value = new AndExpression();
            $value.setOperand($e1.value, $e2.value);
            }
            ;*/

pointcutExp returns[PointCutExpressionInterface value]
    :  e1=notPointcutExp 
            {
            $value = new NotExpression(); 
            $value = $notPointcutExp.value;
            }
	/*|e2= andPointcutExp
            {
            $value = new AndExpression();
            $value =$andPointcutExp.value;
            }*/
	| (SPACE|WS)? e3=designator (SPACE|WS)?
            {
            $value = new Designator();
            $value = $designator.value;
            }
        | e4=pointcutExp '&&' e5=pointcutExp
            {
            $value = new AndExpression();
            ((AndExpression) $value).setOperand($e4.value, $e5.value);
            }
            
            	;	
            	
/*andPointcutExp returns[AndExpression value]
	:  e1=pointcutExp '&&' e2=pointcutExp
            {
            $value = new AndExpression();
            $value.setOperand($e1.value, $e2.value);
            }
            ;*/
notPointcutExp returns[NotExpression value]
	:
	'!' e=pointcutExp
	{$value = new NotExpression(); 
	$value.setOperand($e.value);
	}
	;

atomExp returns[PointCutExpressionInterface value]
	: e1=designator
            {
            $value =$e1.value; /*new PointCutExpression(); $value.setPC(e1);*/
            }
	;
    
designator returns[Designator  value]
    : {
        $value= new Designator();
      }
        (
        
        e=call
            {
            $value = $e.value;
            } 
        | 
        e1=execution
            {
            $value = $e1.value;
            } 
        |
        e2=basicblock
            {
            $value = $e2.value;
            } 
        |
        e3=within
            {
            $value = $e3.value;
            }
        |
        e4=withincode
            {
            $value = $e4.value;
            }
        |
        e5=fieldAccess
            {
            $value = $e5.value;
            }
         |
        e6=yourDesignator
            {
            $value = $e6.value;
            }
	|
        e7=loop
            {
            $value = $e7.value;
            }
      )
       ((SPACE|WS)? 
            '{'(SPACE|WS)?
               ({ JoinPointInfoExp info = new JoinPointInfoExp(); }
                (SPACE|WS)? 'requires' (SPACE|WS)? Identifier
                            {/*if ($Identifier.text !=$value.getName())
                                   System.out.println("WARNING! the domain of the info "+ $Identifier.text+" !");*/
                             info.setType( $Identifier.text);
                            }
                   '.'Identifier (SPACE|WS)?';'(SPACE|WS)?
                         {
                         info.setName($Identifier.text);
                         $value.getJoinPointInfoExp().add( info);
                         }
                     ) * 
             '}'(SPACE|WS)?)?
          
    ;       

args returns[Vector<Argument> value]
    :
        {
        $value = new Vector<Argument>();
        }
	(SPACE|WS)? e=arg (SPACE|WS)?
            {
            $value.add($e.value);
            }
	(','e1=arg{$value.add($e1.value);})*
    ;
arg returns[Argument value]
    : 
    e1=simpleArgument{$value = $e1.value;} |
    e2= methodOrConstructorPattern{$value = $e2.value;}| 
    e3= path{$value = $e3.value;}
    ;
        
simpleArgument returns[SimpleArgument value]:
	{$value = new SimpleArgument();}
	Identifier{$value.setExpression($Identifier.text);}
	;    
    /*{$value = new String [10]; int i =0; } ((e=Identifier {$value[i] = $e.text;} (',' e1=Identifier{i++; $value[i]= $e1.text; })*))*|
     {$value = new String [1]; }e=Identifier'.'{$value[0] = $e.text+".";}( e1=Identifier{$value[0] = $value[0]+$e1.text;}|
   '*'{$value[0] = $value[0]+".*";})('.'(e2=Identifier{$value[0] = $value[0]+"."+$e2.text;}|'*'{$value[0] = $value[0]+".*";}))*
   */
    
	 

call returns[Designator value]
	:{$value = new Designator(); $value.setName("call");} 'call' '(' e=methodOrConstructorPattern{$value.setArgument($e.value);} ')'
	;
        
methodOrConstructorPattern returns[MethodExpression value]: 
	{$value = new MethodExpression();}
	e=primitiveType SPACE e1=(RegExp|Identifier){$value.setReturnType($e.text); $value.setExpression($e1.text);} 
	'(' e2=args{$value.setArgs($e2.value);} ')';
        
execution returns[Designator value]
	:{$value = new Designator(); $value.setName("execution");} 'execution' '('e=methodOrConstructorPattern{$value.setArgument($e.value);} ')';                    
  /**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...                  
 */
basicblock returns[Designator value]
	: {$value = new Designator(); $value.setName( "basicblock");}'basicblock' '(' e=methodOrConstructorPattern{$value.setArgument($e.value);} ')';         

fieldAccess returns[Designator value]
	: {$value = new Designator(); $value.setName("fieldAccess");}'fieldAccess' '(' (e=methodOrConstructorPattern{$value.setArgument($e.value);})? ')';         

loop returns[Designator value]
	: {$value = new Designator(); $value.setName("loop");}'loop' '(' e=methodOrConstructorPattern{$value.setArgument($e.value);} ')';         

yourDesignator returns[Designator value]
	: {$value = new Designator(); $value.setName("yourDesignator");}'yourDesignator' '(' e=methodOrConstructorPattern{$value.setArgument($e.value);} ')';         

within returns[Designator value]
	:{$value = new Designator(); $value.setName("within");} 'within' '(' e=path ')'{$value.setArgument($e.value);}
	;    
withincode returns[Designator value]
	:{$value = new Designator(); $value.setName("withincode");} 'withincode' '(' e=methodOrConstructorPattern{$value.setArgument($e.value);} ')'
	;
path returns[PathExpression value]: 
	{$value = new PathExpression(); }
        ((e=Identifier|e='*'){$value.setExpression($e.text);}('.'(e=Identifier|e='*')
	{$value.setExpression($value.getExpression() +"/"+$e.text);})*)? ;
                       
primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |'*'
    ;

SPACE	:	' '+;

   
/* We're going to ignore all white space characters */


INT :   '0'..'9'+ ;

Identifier 
    	:(('_'|'$')+('0'..'9')*)?('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z'|'0'..'9' | '/'|'_'|'$')+
    ;

RegExp 
    	:('*')?(('a'..'z' | 'A'..'Z'|'$'|'_'|'0'..'9')('?'|'+'|'*')?)+
    ;
//NEWLINE:'\r'? '\n' ;
//WS  :  [ \r\t\u000C\n]+ -> skip


//COMMENT
//    :   '/*' .*? '*/' -> channel(HIDDEN)
//    | '//' ~(('\r')? '\n')   {skip();}    
//    | '/*' .* '*/'         {skip();}
//    ;
   

/*LINE_COMMENT
    : '//' ~[\r\n]* ('\r'? '\n' | EOF) -> channel(HIDDEN)
	;*/
//WS
//    : ' ' | '\t' | '\r' | '\n' | '\u000c' {skip();} 
//    ;
WS  
    :   (' ' | '\t' | '\r'| '\n') { skip(); }
    ;
