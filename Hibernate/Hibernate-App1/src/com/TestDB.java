package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestDB {
	
	public static void main(String[] args) {
		
		// Load hibernate.cfg.xml
		Configuration cfg=new Configuration().configure();
		
		// Start reading data from XML
		
		// Build session Factory obj
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		// get one session from session Factory
		Session s1= sf.openSession();
		// --> s1- save
		// --> s1 - update
		// --> s1 - delete
		// --> s1 - fetch
		
		//Session s2= sf.openSession();
		
		
		
		
		
		
		
		
		
	}

}
