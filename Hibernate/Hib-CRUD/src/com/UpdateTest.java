package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.prod.dao.ProductDaoImpl;
import com.utils.HibUtils;

public class UpdateTest {

	public static void main(String[] args) {

		SessionFactory sf = HibUtils.getSessionFactory();
		Session s1 = sf.openSession();

		Product prod = s1.load(Product.class, "P001");

		// Product prod=new Product();
		// prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(343);

		s1.update(prod);
		// s1.saveOrUpdate(prod);

		s1.beginTransaction().commit();

		System.out.println("-----------------------------------");

	}

}
