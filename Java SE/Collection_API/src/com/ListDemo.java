package com;
import java.util.ListIterator;
import java.util.Vector;
public class ListDemo {
	
	public static void main(String[] args) {
	
		
		Vector<Object> al=new Vector<Object>();
		al.add("Abc");
		al.add(3443);
		al.add(3443.65f);
		al.add('B');
		al.add("Abc");
		
		ListIterator<Object> li=al.listIterator();
		
		while(li.hasNext()) {
			Object obj=li.next();
			
			if(obj.equals(3443))
				li.set(111);
			
		}
		System.out.println(al);
		/*Iterator<Object> it=al.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals(3443))
				it.remove();
		
		}
		
		System.out.println(al);*/
		
		
		/*for(int i=0;i<al.size();i++) {
			if(al.get(i).equals(3443)) {
				al.remove(i);
				al.add(i,111);
				System.out.println(al.get(i));
			}
				
			//System.out.println(al.get(i));
		}
		*/
		
	/*	for(Object obj:al) {
			
			if (obj.equals(3443)) {
				// al.add(111);
				al.remove(1);
			}
			
			System.out.println(obj);
		}*/
	//	System.out.println(al);
		
		/*System.out.println("-------------------");
		
		for(Object obj:al) {
			
				
			System.out.println(obj);
		}
		
		System.out.println("--------------------");
		
		// Iterator
		
		
		Iterator<Object> it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------------");
		//ListIterator
		
		ListIterator<Object> li=al.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		//System.out.println(al.get(2));
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		
		
		
		*/
		
	}

}
