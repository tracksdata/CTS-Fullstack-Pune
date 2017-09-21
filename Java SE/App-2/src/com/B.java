package com;

class A {

	public void fun() {
		System.out.println("--- A fun method");
	}
}

public class B extends A {

	@Override
	public void fun() {

		System.out.println("--- B fun method");
		super.fun();
		
	}

	public static void main(String[] args) {
		
		
		B  b=new B();
		b.fun();
		

	}
}
