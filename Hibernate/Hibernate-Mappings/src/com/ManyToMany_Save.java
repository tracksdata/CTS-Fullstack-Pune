package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.mapping.manytomany.Patient;
import com.mapping.manytomany.Test;

public class ManyToMany_Save {

	public static void main(String[] args) {

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		Session ses = sf.openSession();

		Test t1 = new Test("T001", "Blood", 765);
		Test t2 = new Test("T002", "ECG", 3864);
		Test t3 = new Test("T003", "X-Ray", 100);
		Test t4 = new Test("T004", "City Scan", 15000);
		Test t5 = new Test("T005", "MRI", 1340);

		Patient p1 = new Patient("P001", "James");
		Patient p2 = new Patient("P002", "Prince");
		Patient p3 = new Patient("P003", "Ozvitha");
		Patient p4 = new Patient("P004", "Devi");

		p1.getTests().add(t1);
		p1.getTests().add(t2);

		p2.getTests().add(t1);
		p2.getTests().add(t2);
		p2.getTests().add(t3);
		p2.getTests().add(t4);
		p2.getTests().add(t5);

		p3.getTests().add(t5);
		p3.getTests().add(t1);
		p3.getTests().add(t3);

		p4.getTests().add(t2);
		p4.getTests().add(t4);

		ses.save(p1);
		ses.save(p2);
		ses.save(p3);
		ses.save(p4);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");
		sf.close();

	}

}
