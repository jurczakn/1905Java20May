package com.revature.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnimalAspect {
	
	@Before("execution(void com.revature.services.CowService.milk(String))")
	public void prepairToMilk() {
		System.out.println("Grabbing my pale and a stool.");
	}
	
	@After("execution(void com.revature.services.*.milk(String))")
	public void drinkMilk() {
		System.out.println("Boy was that refreshing.");
	}
	
	@AfterReturning("execution(void *.*(..))")
	public void returnVoid() {
		System.out.println("Nothing to see here");
	}
	
	//Hook empty method that holds an annotation
	@Pointcut("execution(* *(.., String, ..)) || execution(* *(.., String ...))")
	public void takesStringOrStringsParameter() {
		
	}

	@Before("takesStringOrStringsParameter()")
	public void logStringParam(JoinPoint jp) {
		
		System.out.println("Arguments: ");
		for (Object o : jp.getArgs()) {
			System.out.println(o);
		}
		
	}
}
