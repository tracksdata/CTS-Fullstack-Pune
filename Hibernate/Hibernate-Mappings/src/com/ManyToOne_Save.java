package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.manytoone.Department;
import com.mapping.manytoone.Employee;

public class ManyToOne_Save {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();

		Session ses = sf.openSession();

		Department dept = new Department();

		Employee e1 = new Employee(1025, "Praveen", 34863);
		Employee e2 = new Employee(1026, "James", 34873);
		Employee e3 = new Employee(1027, "Divya", 384834);
		Employee e4 = new Employee(1028, "Swapna", 947394);
		Employee e5 = new Employee(1029, "Ozviitha", 487348);

		dept.setDeptId(10);
		dept.setDeptName("HR");
		dept.setLoc("Pune");

		e1.setDept(dept);
		e2.setDept(dept);
		e3.setDept(dept);
		e4.setDept(dept);
		e5.setDept(dept);

		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

		sf.close();
	}

}
