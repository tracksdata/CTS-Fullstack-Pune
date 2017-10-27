package com.employee;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(1026);
		emp.setEmpName("Ozvitha");
		emp.setSalary(45454545);

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeService empService = ac.getBean(EmployeeService.class);

		List<Employee> emps= empService.saveEmployee(emp);
		
		for(Employee e:emps) {
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getSalary());
			System.out.println("----------------------");
		}
		
		
		ac.registerShutdownHook();

	}

}
