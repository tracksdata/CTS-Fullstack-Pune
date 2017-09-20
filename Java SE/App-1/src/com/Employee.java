package com;

public class Employee {

	static int empId;
	double salary;
	
	void f1() {
		empId=200;
		salary=3000;
		
	}
	
	public static void main(String[] args) {

		int x=10;
		
		Employee emp;
		emp=new Employee();
		
		
		empId=100;
		//salary=5000;
		
		
	}

}
