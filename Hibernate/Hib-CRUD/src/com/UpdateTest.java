package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.prod.dao.ProductDaoImpl;
import com.utils.HibUtils;

public class UpdateTest {

	public static void main(String[] args) {
		
		
		SessionFactory sf=HibUtils.getSessionFactory();
		Session s1=sf.openSession();
		
	   Product prod=s1.load(Product.class, "P001");
	   Product p2=prod;
	   
	 
	   p2.setProdName("Black Pen");
	   
	   s1.update(p2);
	   
	   s1.beginTransaction().commit();
	   
	   
	   
	   
	   
	   System.out.println("-----------------------------------");
		
		
		
		
		

	}

}
