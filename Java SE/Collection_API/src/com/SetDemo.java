package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Object> hs=new TreeSet<>();
		hs.add("Abc");
		hs.add("ZHG");
		hs.add("Bhg");
		hs.add("Abc");
		hs.add("KHJJG");
		hs.add("CHDGD");
		hs.remove("Bhg");
		
		ArrayList<String> ar=new ArrayList<>();
		ar.add("ZSdf");
		ar.add("BSdf");
		ar.add("KSdf");
		ar.add("CSdf");
		ar.add("ZSdf");
		
		Collections.sort(ar);
		int idx=Collections.binarySearch(ar, "CSdf");
		System.out.println("AL: "+ar);
		System.out.println(idx);

		System.out.println("TS: "+hs);
		
		
	}

}
