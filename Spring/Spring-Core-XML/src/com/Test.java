package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
		ac.getBean("emp1");
		ac.getBean("emp1");
		
		
		/*Employee e1= (Employee) ac.getBean("emp1");
		Employee e2= (Employee) ac.getBean("emp1");
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());*/
		
		System.out.println("-- Done ---");
		

		

	}

}
