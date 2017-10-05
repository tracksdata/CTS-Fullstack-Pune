package com;
class C1{

	void fun(int x) {
		System.out.println("--- Int X: "+x);
		fun((long)x);
	}
	
	void fun(long x) {
		System.out.println("--- Long X: "+x);
		
	
	}
	
}


public class Test extends C1{
	
	@Override
	void fun(long x) {
		System.out.println("--- sub class fun long method");
	}
	
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.fun(100);
		
		
	}
	
}
