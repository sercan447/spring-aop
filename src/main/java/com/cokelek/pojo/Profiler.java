package com.cokelek.pojo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Profiler {

	
	@Before("execution(* com.cokelek.pojo.BusinessTargetObject.sayHello())")
	public void logBeforeTxn(JoinPoint joinpoint){
		System.out.println("Begining execution for :"+joinpoint.getSignature().getName());
		
	}

	@After("execution(* com.cokelek.pojo.BusinessTargetObject.sayHello(..))")
	public void logAfterTxn(JoinPoint joinpoint){
		System.out.println("Execution completed for :"+joinpoint.getSignature().getName());
	}
	
	@Around("execution(* com.cokelek.pojo.BusinessTargetObject.merryGoAround(..))")
	public void logAroundTxn(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
			
		System.out.println("Begining execution for :"+proceedingJoinPoint.getSignature().getName());
		proceedingJoinPoint.proceed();
		System.out.println("Execution completed for :"+proceedingJoinPoint.getSignature().getName());
	}
	
	
	@AfterReturning(pointcut="execution(* com.cokelek.pojo.BusinessTargetObject.performTransaction(..))",returning="retVal")
	public void logResultAfterTxn(JoinPoint joinpoint,Object retVal){
		System.out.println("Execution completed for : "+joinpoint.getSignature().getName());
		System.out.println("Value being returned is :"+retVal);
	}
	
	@AfterThrowing(pointcut = "execution(* com.cokelek.pojo.BusinessTargetObject.throwException(..))",throwing="exception")
	public void logResultAfterError(JoinPoint joinpoint , Throwable exception){
		
		System.out.println("Execution completed for :"+joinpoint.getSignature().getName());
		System.out.println("Error in join Point due to : "+exception.getMessage());
		System.out.println("Advice complete");
	}
	
}
