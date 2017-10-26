package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	
	@Before("execution(void set*(int))")
	public void m1(JoinPoint jp) {
	
		System.out.println("---- Property about to change of "+jp.toLongString());
	}
	
	@After("execution(* get*())")
	public void m2(JoinPoint jp) {
		System.out.println("---- Property about to changed from "+jp.toLongString());
	}
	
	
}
