package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustTest {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cf.buildSessionFactory();
		
		Session ses= sf.openSession();
		
		
		Customer cust=new Customer();
		cust.setCustId(11);
		cust.setCustName("james");
		cust.setCustAddr("Goa");
		
		
		
		ses.save(cust); // save prod to DB and will not commit
		
		ses.beginTransaction().commit();// permanently saves prod to DB
		
		ses.close();
		
		System.out.println("---- Done ----");
		

	}

}
