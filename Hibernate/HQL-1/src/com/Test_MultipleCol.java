package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_MultipleCol {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory sf = cf.buildSessionFactory();

		Session ses = sf.openSession();

		String q1 = "from Course as c";
		String q2 = "select c.price from Course as c";
		String q3="select c.courseId,c.courseName from Course as c";
		
		
		Query<Object[]>  qry=ses.createQuery(q3);
		
		List<Object[]> rows= qry.list();
		
		for(int i=0;i<rows.size();i++) {
			Object[] cols=rows.get(i);
			for(Object col:cols) {
				System.out.println(col);
			}
			System.out.println("--------------------");
			
		}
		
		
		
		
		sf.close();

		System.out.println("---- Done ----");

	}

}
