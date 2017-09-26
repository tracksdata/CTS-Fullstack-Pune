package com;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Object, Object> hm=new TreeMap<>();
		hm.put("B", "Praveen");
		hm.put("C", "Maria");
		hm.put("A", "Kavya");
		//hm.put(1, "Praveen");
		//hm.put(null, null);

		System.out.println(hm);
		// copy only keys into set
		
		Set<Object> keys= hm.keySet();
		
		Iterator<Object> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
		}
		
		
		
	    Set<Map.Entry<Object, Object>> s=hm.entrySet();
	    
	    System.out.println("S: "+s);
		
		
		
		
		
		
		
	}

}
