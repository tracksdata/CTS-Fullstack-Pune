package com;

public class Employee_V2 {

	int empId;
	String empName;
	double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		// if.....
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		//
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	void display() {
		System.out.println("Emp Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {

		Employee_V2 e1 = new Employee_V2();
		Employee_V2 e2 = new Employee_V2();
		
		e1.setEmpId(10);
		e1.setEmpName("Ozvitha");
		e1.setSalary(438384);
		
		e2.setEmpId(11);
		e2.setEmpName("Kavya");
		e2.setSalary(348384);

		e1.display();
		e2.display();

	}

}
