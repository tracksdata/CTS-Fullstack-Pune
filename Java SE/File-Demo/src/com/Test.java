package com;

class Abc {
	public Abc() {
		System.out.println("-- Default of Abc");
	}

	public Abc(int x) {
		System.out.println("---- Abc para "+x);
	}
}

public class Test extends Abc{
	public Test() {
		super(60);
		System.out.println("-- Test default const");
	}
	
	void f1() {
		
		System.out.println("-- f1 method");
		
	}

	public static void main(String[] args) {

		Test t=new Test();
		
		t.f1();
	}
}
