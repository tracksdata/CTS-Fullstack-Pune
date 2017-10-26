package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.billing.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {
		
		String[] cart1= {"Item01","Item02","Item03"};
		String[] cart2= {"Item04","Item05"};
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		//-----------------------------------------------------
		BillingImpl bill=ac.getBean("bill",BillingImpl.class);
		//-----------------------------------------------------
		
		double total=bill.getBill(cart1);
		System.out.println("Total fol cart 1 is "+total);
		
		total=bill.getBill(cart2);
		System.out.println("Total fol cart 2 is "+total);
		
		
		

	}

}
