package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.utils.HibUtils;

public class SaveTest {

	public static void main(String[] args) {
		
		
		SessionFactory sf=HibUtils.getSessionFactory();
		Session s1=sf.openSession();
		
		Product prod=new Product();
		prod.setProdId("P004");
		prod.setProdName("Laptop");
		prod.setPrice(12322);
		
		s1.save(prod);
		s1.beginTransaction().commit();
		System.out.println("-- Done --");
		
		
		

	}

}
