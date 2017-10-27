package com.employee.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository("empDao")
public class EmployeeDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveEmployee(Employee emp) {

		Session ses=sessionFactory.openSession();
		ses.save(emp);
		ses.beginTransaction().commit();
		
		System.out.println("---- Saved to DB ---");
		
		sessionFactory.close();

	}

}
