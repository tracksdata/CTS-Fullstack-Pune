package com;
class Test{ // outer
	
	  void t1() {
		  System.out.println("t1 method of Test outer class");
	  }
	
	static class Fun { // Inner 
		void f1() {
			System.out.println("f1 method of inner class Fun");
		}
	}
	
}


public class Employee {
	
	public static void main(String[] args) {
		Test t=new Test();
		t.t1();
		Test.Fun tf=new Test.Fun();
		tf.f1();
		
	}
	
	
	
	
}
