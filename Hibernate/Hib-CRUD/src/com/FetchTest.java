package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.prod.dao.ProductDaoImpl;
import com.utils.HibUtils;

public class FetchTest {

	public static void main(String[] args) {
		
		
		SessionFactory sf=HibUtils.getSessionFactory();
		Session s1=sf.openSession();
		
	   Product prod=s1.load(Product.class, "P001");
	   
	   ProductDaoImpl.saveObject(prod,s1);
	   
	  // prod.setProdName("New Pen");
	 
	
	   
	 /*  System.out.println("Prod Id: "+prod.getProdId());
	   System.out.println("prodName: "+prod.getProdName());
	   System.out.println("Price: "+prod.getPrice());*/
	   
	   System.out.println("-----------------------------------");
		
		
		
		
		

	}

}
