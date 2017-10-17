package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.manytomany.Patient;
import com.mapping.manytomany.Test;

public class ManyToMany_Fetch_V1 {

	public static void main(String[] args) {

		/*
		 * ServiceRegistry serviceRegistry = new
		 * StandardServiceRegistryBuilder().configure().build(); Metadata metadata = new
		 * MetadataSources(serviceRegistry).getMetadataBuilder().build(); SessionFactory
		 * sf=metadata.getSessionFactoryBuilder().build(); Session ses =
		 * sf.openSession();
		 */

		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session ses = sf.openSession();
		
		Test t=ses.get(Test.class, "T001");
		System.out.println("Test Id: "+t.getTestId());
		System.out.println("Test Name: "+t.getTestName());
		System.out.println("Price: "+t.getPrice());
		
		
		for(Patient p:t.getPatients()) {
			System.out.println("Patient Id: " + p.getPatientId());
			System.out.println("Patient Name: " + p.getPatientName());
		}
		
		sf.close();

	}

}
