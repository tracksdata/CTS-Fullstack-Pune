package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Person;

public class TestDB1 {

	public static void main(String[] args) {

		// Load hibernate.cfg.xml
		Configuration cfg1 = new Configuration().configure("mysql.xml");
		// Configuration cfg2=new Configuration().configure("oracle.xml");
		// Start reading data from XML

		// Build session Factory obj

		SessionFactory sf1 = cfg1.buildSessionFactory();
		// SessionFactory sf2= cfg2.buildSessionFactory();

		// get one session from session Factory
		Session s1 = sf1.openSession();
		// Session s2= sf2.openSession();
		// --> s1- save
		// --> s1 - update
		// --> s1 - delete
		// --> s1 - fetch

		Person p1 = new Person();

		p1.setPersonId("P001");
		p1.setPersonName("James");
		p1.setAge(23);
		p1.setAddr("Hyderabad");
		p1.setDob(new Date());

		
		Account acc=new Account();
		acc.setAccountNo("Acc001");
		acc.setAccountName("Praveen");
		acc.setBalancfe(3848734);
		
		p1.setAcc(acc);
		
		
		
		
		s1.save(p1);
		s1.beginTransaction().commit();
		
		System.out.println("-- Done --");

	}

}
