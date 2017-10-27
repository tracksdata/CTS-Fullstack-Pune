package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {

	List<Employee> saveEmployee(Employee emp);
	List<Employee> listAll();

}