package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
		Employee emp= ac.getBean("emp",Employee.class);
		//Address addr=ac.getBean("addr",Address.class);
		
	//	emp.setAddr(addr); //-->
		
		System.out.println("EMP ID: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary; "+emp.getSalary());
		
		System.out.println("Addr Id: "+emp.getAddr().getAddrid());
		System.out.println("Address: "+emp.getAddr().getAddress());
		
		
		
		
		
		
		System.out.println("-- Done ---");
		

		

	}

}
