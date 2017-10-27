package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	@Transactional
	public List<Employee> saveEmployee(Employee emp) {
		
		empDao.saveEmployee(emp);
		 
		return empDao.listAll();
	
	}
	
	@Transactional
	public List<Employee> listAll(){
		
		return empDao.listAll();
	}
	

}
