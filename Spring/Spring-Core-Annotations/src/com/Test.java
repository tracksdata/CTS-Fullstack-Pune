package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
		Employee emp=ac.getBean("emp",Employee.class);
		
		System.out.println("Emp Id: "+emp.getEmpId());
		System.out.println("Emp Name: "+emp.getEmpName());
		System.out.println("Addr Id: "+emp.getAddr().getAddrId());
		System.out.println("Address: "+emp.getAddr().getAddress());
		
		System.out.println("-- Done ---");
		

		

	}

}
