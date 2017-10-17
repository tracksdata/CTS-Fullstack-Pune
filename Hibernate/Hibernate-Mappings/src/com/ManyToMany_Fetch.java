package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.manytomany.Patient;
import com.mapping.manytomany.Test;

public class ManyToMany_Fetch {

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

		Patient p = ses.get(Patient.class, "P004");

		System.out.println("Patient Id: " + p.getPatientId());
		System.out.println("Patient Name: " + p.getPatientName());

		double total = 0.0;
		for (Test t : p.getTests()) {
			System.out.println("Test Id: " + t.getTestId());
			System.out.println("Test Name: " + t.getTestName());
			total = total + t.getPrice();
		}

		System.out.println("Total for All test: "+total);
		sf.close();
		System.out.println("------------------------------------");
	}

}
