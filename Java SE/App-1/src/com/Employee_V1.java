package com;

public class Employee_V1 {

	int empId;
	String empName;
	double salary;
	
	void display() {
		System.out.println("Emp Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {

		Employee_V1 e1 = new Employee_V1();
		e1.empId = 1024;
		e1.empName = "James";
		e1.salary = 33434;

		
		Employee_V1 e2 = new Employee_V1();
		e2.empId = 1025;
		e2.empName = "Sandeep";
		e2.salary = 8346384;

		e1.display();
		e2.display();
		

	}

}
