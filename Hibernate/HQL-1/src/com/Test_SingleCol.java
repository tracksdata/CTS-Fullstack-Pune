package com;

import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_SingleCol {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory sf = cf.buildSessionFactory();

		Session ses = sf.openSession();

		String q1 = "from Course as c";
		String q2 = "select c.price from Course as c";

		Query<Object> qry = ses.createQuery(q2);
		List<Object> courses = qry.list();

		for (Object obj : courses) {

			System.out.println(obj);

		}

		sf.close();

		System.out.println("---- Done ----");

	}

}
