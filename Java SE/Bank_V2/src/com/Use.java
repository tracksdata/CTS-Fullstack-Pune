package com;

public class Use {

	public static void main(String[] args) {
		
		Customer cust=new BankService();
		Manager mgr=new BankService();
		
		
		cust.withDraw();
		cust.f1();
		mgr.lockerAccess();
		mgr.clearkOperations();
		
		
		
	}
}
