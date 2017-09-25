package com;

class Person{
	
	int x;
	
	public void test(Sample s) {
		
		System.out.println("No is "+s.no);
	}
	
}

public class Sample {

	int no=100;
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		Person p=new Person();
		//p.test(this);
		
		
		
		
	}
}
