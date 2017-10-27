package com.employee.dao;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);
	public List<Employee> listAll();

}