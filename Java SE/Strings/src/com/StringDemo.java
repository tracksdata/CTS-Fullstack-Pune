package com;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1="Abc";
		System.out.println("S1: "+s1);
		System.out.println("S1 HashCode: "+System.identityHashCode(s1));
		
		String s2=new String("Abc");
		String s3=new String("Abc");
		//s2="Abc";
		
		
		System.out.println("S2: "+s2);
		System.out.println("S2 HashCode: "+s2.hashCode());
		System.out.println("S3 HashCode: "+s3.hashCode());


		if(s1.equals(s2)) {
			System.out.println("-- Equals");
		}else {
			System.out.println("-- Not Equals");
		}
		
		/*System.out.println("S2: "+s2);
		System.out.println("S2 HashCode: "+s2.hashCode());*/
		
		
		
		
		
		
		
	}

}
