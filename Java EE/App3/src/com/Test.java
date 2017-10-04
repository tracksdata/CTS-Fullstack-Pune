package com;

public class Test implements Cloneable{
	String name;

	public static void main(String[] args) {
		
		try {
			
			Test t=new Test();
			t.name="Praveen";
			Test t2=(Test)t.clone();	
			System.out.println(t.hashCode());
			System.out.println(t2.hashCode());
			
			System.out.println(t.name);
			System.out.println(t2.name);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
