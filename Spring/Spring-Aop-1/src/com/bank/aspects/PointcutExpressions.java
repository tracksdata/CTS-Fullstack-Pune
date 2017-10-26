package com.bank.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class PointcutExpressions {

	// All Pointcut def
	@Pointcut(value = "execution(* *.*(..))")
	public void allMethods() {
	};
	
	

}
