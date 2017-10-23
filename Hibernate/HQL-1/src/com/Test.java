package com;

import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory sf = cf.buildSessionFactory();

		Session ses = sf.openSession();

		String q1="from Course as c";
		String q2="select c.courseName from Course as c";
		
		Query<Course> qry=ses.createQuery(q1);
		List<Course> courses=qry.list();
		
		for(Course c:courses) {
			System.out.println(c.getCourseId());
			System.out.println(c.getCourseName());
			System.out.println(c.getPrice());
			System.out.println("-------------------------");
		}
		
		
		sf.close();
		
		System.out.println("---- Done ----");

	}

}
