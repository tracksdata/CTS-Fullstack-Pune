package com.billing;

import com.pricematrix.PriceMatrix;
//Dependent
public class BillingImpl{
	
	/*
	 *  Design Issues:
	 *  ----------------
	 *  
	 *   1. Too many dependency objs with dependent.
	 *     (prob:Performance , Too much Memory , Too many resource used )
	 *   
	 *   2. Both Dependent and Dependency comp classes
	 *      are tightly coupled.
	 *     (prob : Maintenance , Much Time Required to build Appln )
	 *   
	 *   3. Unit Testing Not Possible   
	 *     (prob:Production will be slow , cant ensure comp integrity)
	 * 
	 * 
	 *  ----------------------------------------------------
	 *  
	 *  why these design issues occurring with comp?
	 *  
	 *  " Dependent Obj itself creating
	 *    dependency Obj for its need. "
	 *  
	 *  
	 *  Solution:
	 *  -----
	 *  
	 *    " Don't create dependency in Dependent class, Find It ".
	 *    
	 *     problem: Dependent component is tightly coupled with
	 *          dependency remote location. 
	 *  
	 *   Best Solution:
	 *   ----------
	 *      "Don't create/find dependency in dependent class, 
	 *      give dependency to dependent  by third party "
	 *      
	 *      Don't create and Don't Find , get from third party
	 *      ( Inversion of Control )
	 *      
	 *      
	 *      How to implement IOC ?
	 *      ---------------------
	 *      
	 *       --> Dependency Injection ( DI )
	 *       
	 *       		a. Constructor
	 *       		b. Setter
	 * --------------------------------------------------
	 */

	private PriceMatrix price;
	
	
	
	public void setPrice(PriceMatrix price) { // DI
		this.price = price;
	}



	public double getBill(String[] cart) {

		// Find Total Price
		double totalPrice = 0.0;

		for (String itemCode : cart) {

			// Get Price of Each Item and Sum it

			// PriceMatrixImpl price = null;
			// price = new PriceMatrixImpl();

			totalPrice = totalPrice + price.getItemPrice(itemCode);

		}
		return totalPrice;

	}

}
