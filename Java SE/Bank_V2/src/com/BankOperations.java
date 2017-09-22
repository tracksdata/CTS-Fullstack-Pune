package com;

public abstract class  BankOperations implements Customer, Manager {

	@Override
	public void withDraw() {
		System.out.println("-- cust With draw");
	}

	@Override
	public void deposit() {
		System.out.println("-- cust deposit");
	}

	@Override
	public void openAccount() {
		System.out.println("--- openAccounr method");

	}

	@Override
	public void lockerAccess() {
		System.out.println("locker Access");

	}

	public void clearkOperations() {

		System.out.println("-- CLeark Operations");
	}

}
