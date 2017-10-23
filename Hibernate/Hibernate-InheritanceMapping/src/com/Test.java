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

	
		Module m=new Module();
		m.setProjId(11);
		m.setProjName("Honda");
		m.setModuleId(2);
		m.setModuleName("Hibernate");
		
		Client c=new Client();
		c.setClientId(3);
		c.setClientName("James");
		c.setProjId(12);
		c.setProjName("Ford");
		
		ses.save(c);
		ses.save(m);
		
		
		ses.beginTransaction().commit();

		sf.close();
		System.out.println("---- Done ----");

	}

}
