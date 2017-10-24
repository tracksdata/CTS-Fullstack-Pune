package com.pricematrix;

// Dependency
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl object created");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to connect to DB and fetch price for itemCode

		return 100.0;
	}
	
	void test() {
		
	}

}
