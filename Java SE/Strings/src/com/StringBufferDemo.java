package com;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Abc");
		System.out.println("Before Modifecation: SB1: "+sb1);
		System.out.println("SB1: hashcode: "+sb1.hashCode());
		sb1.append("Xyz");
		System.out.println("After Modifecation: SB1: "+sb1);
		System.out.println("SB1: hashcode: "+sb1.hashCode());
		
		
		
		StringBuffer sb2=new StringBuffer("Abc");
		System.out.println("SB1: hashcode: "+sb2.hashCode());
		
		
		
	}

}
