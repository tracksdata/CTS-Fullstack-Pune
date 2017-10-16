package com;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.onetoone.Department;
import com.mapping.onetoone.Employee;


public class OneToOne_Fetch {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();

		Session ses = sf.openSession();

		Employee emp = ses.get(Employee.class, 1028);

		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Emp name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Dept Id: " + emp.getDept().getDeptId());
		System.out.println("Dept Name: " + emp.getDept().getDeptName());
		System.out.println("Loc: " + emp.getDept().getLoc());
		System.out.println("------------------------------------");

	}

}
