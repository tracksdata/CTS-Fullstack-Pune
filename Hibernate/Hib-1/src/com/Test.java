package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cf.buildSessionFactory();
		
		Session ses= sf.openSession();
		
		
		Product prod=new Product();
		
		prod.setProdId("P009");
		prod.setProdName("New Book");
		prod.setPrice(34.45);
		
		ses.save(prod); // save prod to DB and will not commit
		
		ses.beginTransaction().commit();// permanently saves prod to DB
		
		ses.close();
		
		System.out.println("---- Done ----");
		

	}

}
