package com;

public abstract class BankOperations extends Bank {

	public abstract void withDraw();

	public abstract void deposit();

	@Override
	public void openAccount() {
		System.out.println("--- openAccounr method");

	}

	@Override
	public void lockerAccess() {
		System.out.println("locker Access");

	}

}
