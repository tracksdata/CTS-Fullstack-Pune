package com;

public class Employee {

	static String company;
	int empId;
	String empName;
	double salary;
	
	
	
	public static void main(String[] args) {
	
		company="Cognizant";
		
		
		
		Employee e1=new Employee();
		e1.empId=1024;
		e1.empName="James";
		e1.salary=33434;
		
		company="CTS";
		
		company="TCS";
		
		System.out.println("Emp 1: Name Id: "+e1.empId);
		System.out.println("Emp 1: Name Name: "+e1.empName);
		System.out.println("Emp 1: Salary Id: "+e1.salary);
		System.out.println("Emp 1: Company Id: "+e1.company);
		
		
		Employee e2=new Employee();
		e2.empId=1025;
		e2.empName="Sandeep";
		e2.salary=8346384;
		//e2.company="HCL";
		
		
		
		
		System.out.println("----------------------------------");
		
		System.out.println("Emp 2: Name Id: "+e2.empId);
		System.out.println("Emp 2: Name Name: "+e2.empName);
		System.out.println("Emp 2: Salary Id: "+e2.salary);
		System.out.println("Emp 2: Company Id: "+e2.company);
		
		
		
		
		
		
	}
	
	
	
}
