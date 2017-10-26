package com.bank.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.bank.model.Account;

/*
 *  AOP Terminology
 *  ----------------
 *   
 *   --> joinpoint
 *   --> pointcut
 *   --> advice
 *   --> aspect
 *   --> introuction
 *       
 *        --> To introduce new behav to 
 *            target at runtime
 *
 * ---------------------------------------------------
 * 
 * 
 *  Types of AOP Advices
 *  --------------------
 *  
 *   1. Before
 *   2. After
 *   3. AfterReturning
 *   4. AfterThrowing
 *   5. Around
 *   
 *   -------------------------------------------
 *   
 *   How to write effective pointcuts?
 *   
 *     --> Try to re-use same Pointcut Expression.
 *   
 *   
 * 
 * 
 */

// Aspect

@Component
@Aspect
public class LoggingAspect {

	// ------------------------------------

	// // All Pointcut def
	// @Pointcut(value="execution(* *.*(..))")
	// public void allMethods(){};

	// -------------------------------------

	//@Before("com.bank.aspects.PointcutExpressions.allMethods()")
	// @Before("within(com.service.*)")
	// @Before("@annotation(com.myanotations.Loggable)")
	public void logBefore(JoinPoint joinPoint) {
		String methodDet = joinPoint.toLongString();
		System.out.println("LOG: Before  Method :" + methodDet);
	}

	// ------------------------------------------------

	//@AfterReturning(pointcut = "execution(* *.with*(..))", returning = "amount")
	public void afterRetunAdvice(double amount) {
		System.out.println("After Return : Withdraw-" + amount);
	}

	//@AfterThrowing(pointcut = "execution(* *.with*(..))", throwing = "e")
	public void afterRetunThrow(Exception e) {
		System.out.println("After Throwing : Withdraw :" + e.getMessage());
	}

	//@After("com.bank.aspects.PointcutExpressions.allMethods()")
	public void afterAdvice() {
		System.out.println("After Withdraw :");
	}

	// --------------------------------------------------

	@Around("execution(* *.withdraw2(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		Object obj=null;
		try {
			// Before
			System.out.println("Around Advice: Before");
			String v = "before";
			 obj=pjp.proceed();
			// After Returning
			System.out.println("Around Advice: returning "+obj);

		} catch (Throwable e) {
			// AFter Throwing
			System.out.println("Around Advice: Throwing");
			throw e;
		}
		// After
		System.out.println("Around Advice: After");
		return obj;
	}

}
