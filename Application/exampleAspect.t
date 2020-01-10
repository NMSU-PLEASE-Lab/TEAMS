aspect MyAspect {

pointcut Execution(): execution(* doThis()) {
  requires General.methodName; 
};

Advice1 before() : Execution;
}

