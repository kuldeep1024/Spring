package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

/*	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName() @Before");
	}
	@After("execution(public String getName())")
	public void getNameAdviceAfter(){
		System.out.println("Executing Advice on getName() @After");
	}*/

	@Before("execution(* get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
	
	@Before("execution(public void set*(*))")
	public void getSetAdvice(){
		System.out.println("Service method *Setter* called");
	}
}
