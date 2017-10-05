package com;

public class Test implements Cloneable{
	
	public Test() {
		System.out.println("Test class Object created");
	}
	String name;

	public static void main(String[] args) {
		
		try {
			
			Test t=new Test();
			t.name="Praveen";
			Test t2=(Test)t.clone();
			t2.name="Ozvitha";
			
			System.out.println(t.hashCode());
			System.out.println(t2.hashCode());
			
			System.out.println(t.name);
			System.out.println(t2.name);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
