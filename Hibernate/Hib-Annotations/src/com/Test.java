package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory sf = cf.buildSessionFactory();

		Session ses = sf.openSession();

		// Transaction tx=ses.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId(1030);
		emp.setEmpName("Bucky Wall Hj");
		emp.setSalary(123321);

		ses.save(emp);

		ses.beginTransaction().commit();

		System.out.println("---- Done ----");

	}

}
