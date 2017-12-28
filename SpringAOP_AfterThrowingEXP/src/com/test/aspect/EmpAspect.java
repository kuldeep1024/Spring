package com.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmpAspect {

	@Before("execution(public String get*())")
	public void getMethodsBefore(){
		System.out.println("Before get*** mthod executed.");
	}
	/*	@After("execution(public String get*())")
	public void getMethodsAfter(){
		System.out.println("After get*** mthod executed.");
	}
*/
/*	@AfterThrowing(pointcut="within(com.test..*)", throwing = "e")
	public void logExceptions(JoinPoint joinPoint,Exception e){
		System.out.println("Exception thrown in Employee Method="+joinPoint.getSignature().getName().toString()+" and exception is : "+e);
	}
	*/
	
/*	@Before("within(com.test..*)")
	public void executeAllMethodsBefore(JoinPoint joinPoint){
		System.out.println("Before Method = "+joinPoint.getSignature().getName().toString());
	}
	@After("within(com.test..*)")
	public void executeAllMethodsAfter(JoinPoint joinPoint){
		System.out.println("After Method = "+joinPoint.getSignature().getName().toString());
	}*/
}
