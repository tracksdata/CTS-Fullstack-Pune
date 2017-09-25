package com;

class Employee {

	static int count=1;
	
	@Override
	protected void finalize() {
		System.out.println("-- Employee Obj is garbage collected "+count++);
	}
}

public class GC {

	public static void main(String[] args) {

		
		Runtime rt=Runtime.getRuntime();
		
		for(int i=1;i<=3000000;i++) {
		new Employee();
		}
		//System.gc();
		
		System.out.println("--- Done ---");

	}

}
