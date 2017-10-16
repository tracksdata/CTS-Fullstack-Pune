package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.mapping.onetomany.Department;
import com.mapping.onetomany.Employee;

public class OneToMany_Save {

	public static void main(String[] args) {

		
		 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		 Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		 SessionFactory sf=metadata.getSessionFactoryBuilder().build();
		 Session ses = sf.openSession();
		
		/*Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();

		Session ses = sf.openSession();
*/
		Department dept = new Department();

		Employee e1 = new Employee(1025, "Praveen", 34863);
		Employee e2 = new Employee(1026, "James", 34873);
		Employee e3 = new Employee(1027, "Divya", 384834);
		Employee e4 = new Employee(1028, "Swapna", 947394);
		Employee e5 = new Employee(1029, "Ozviitha", 487348);

		dept.setDeptId(10);
		dept.setDeptName("HR");
		dept.setLoc("Pune");

		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		dept.getEmps().add(e3);
		dept.getEmps().add(e4);
		dept.getEmps().add(e5);
		
		ses.save(dept);
		
		
		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
