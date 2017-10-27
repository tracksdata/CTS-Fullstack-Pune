package com.employee.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository("empDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveEmployee(Employee emp) {
		Session ses = sessionFactory.getCurrentSession();

		ses.save(emp);

		System.out.println("---- Saved to DB ---");

	}

	public List<Employee> listAll() {
		Session ses = sessionFactory.getCurrentSession();

		Query qry = ses.createQuery("from Employee");

		return qry.list();
	}

}
