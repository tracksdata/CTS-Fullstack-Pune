package com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.onetomany.Department;
import com.mapping.onetomany.Employee;

public class OneToMany_Fetch {

	public static void main(String[] args) {
		
		/* ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		 Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		 SessionFactory sf=metadata.getSessionFactoryBuilder().build();
		 Session ses = sf.openSession();*/
		

		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		 Session ses = sf.openSession();

		

		Department dept = ses.get(Department.class, 10);
		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Dept Name: " + dept.getDeptName());
		System.out.println("Loc: " + dept.getLoc());

		for (Employee emp : dept.getEmps()) {

			System.out.println("Emp Id: " + emp.getEmpId());
			System.out.println("EMp Name: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());

		}

		sf.close();
		System.out.println("------------------------------------");
	}

}
