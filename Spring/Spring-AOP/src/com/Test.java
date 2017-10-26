package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp= ac.getBean("emp",Employee.class);
		Department dept=ac.getBean(Department.class);
		dept.setDeptId(122);
		emp.setSalary(2333);
		emp.setEmpId(1024);
		emp.setEmpName("Praveen");
		
		System.out.println("-- EmpId: "+emp.getEmpId());
		
		
		ac.registerShutdownHook();
		
		
	}
}
