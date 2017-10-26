package com.pricematrix;

import org.springframework.stereotype.Repository;

// Dependency
@Repository("price")
public class PriceMatrixImpl implements PriceMatrix {
	


	@Override
	public double getItemPrice(String itemCode) {
		// code to connect to DB and fetch price for itemCode

		return 100.0;
	}
	
	

}
