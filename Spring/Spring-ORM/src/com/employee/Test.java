package com.employee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(1024);
		emp.setEmpName("Praveen");
		emp.setSalary(349734);

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDaoImpl empDao = ac.getBean(EmployeeDaoImpl.class);

		empDao.saveEmployee(emp);

		ac.registerShutdownHook();

	}

}
