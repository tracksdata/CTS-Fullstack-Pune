package com.prod.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.utils.HibUtils;

public class ProductDaoImpl {
	
	public static void saveObject(Product prod,Session s1) {
		
		SessionFactory sf=HibUtils.getSessionFactory();
		
		prod.setProdName("New Pen");
		s1.update(prod);
		s1.beginTransaction().commit();
		System.out.println("-- Updated");
	}

}
