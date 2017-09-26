package com;

import java.util.ArrayList;

class Abc{
	
}
class Xyz extends Abc{
	
}
class Test{
	
}

public class GenericsDemo<E> {

	
	/*void test(E e1) {
		System.out.println("Value is "+e1);
	}
	*/
	
	void test(Object obj) {
		System.out.println("Value is "+obj);
	}
	
	/*void swap(E1 x, E2 y) {

		System.out.println("Before Swap: X= "+x+" and Y= "+y);
		Object obj = x;
		x = (E1) y;
		y = (E2) obj;
		System.out.println("After Swap: X= "+x+" and Y= "+y);

	}
	
	void swap(Object e1,Object e2) {
		
	}

	
	 * void calc(E x) { System.out.println("Value of X is "+x); }
	 

	
	 * void calc(int x) { System.out.println((x * x));
	 * 
	 * }
	 * 
	 * void calc(float x) { System.out.println((x * x)); }
	 * 
	 * void calc(long x) { System.out.println((x * x)); }
	 */

	public static void main(String[] args) {

		GenericsDemo<Integer> g = new GenericsDemo<>();
		GenericsDemo<String> g1 = new GenericsDemo<>();
		GenericsDemo<Abc> g2 = new GenericsDemo<>();
		
	/*	GenericsDemo g2 = new GenericsDemo();
		g2.test("A");
		g2.test(23);
*/		
		
		g2.test(new Abc());
		g2.test(new Xyz());
		g2.test(new Test());
		
		g.test(100);
		//g.test("Xyz");
		g.test(300);
		g.test(7656);
		
		g1.test("Abc");
		g1.test("Xyz");
		
		
		
		
	}

}
