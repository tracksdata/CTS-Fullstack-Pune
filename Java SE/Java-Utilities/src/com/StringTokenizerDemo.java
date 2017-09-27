package com;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	
	public static void main(String[] args) {
		
		
		String msg="Pune:is very,cold cool city?really!";
		StringTokenizer st=new StringTokenizer(msg,":|,| ");
		
		while(st.hasMoreTokens()) {
			String s1=st.nextToken();
			System.out.println(s1);
		}
		
		
	}
}
