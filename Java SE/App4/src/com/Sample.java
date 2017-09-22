package com;

public class Sample extends Test{ // is 'A'

	void f2() {
		System.out.println("--- Sample f2 method");
	}
	
	public static void main(String[] args) {
		
		
		     Sample s=new Sample();
		     Test t=new Test();
		     t=s;
		     
		     
		   //  Test t=s;
		     Sample s1=(Sample) t;
		     
		     s1.f1();
		     s1.f2();
		     System.out.println("-- DOne ");
		
		
		
		
		
		
	}
	
	
	
}
