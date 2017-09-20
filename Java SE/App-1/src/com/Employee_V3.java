package com;

public class Employee_V3 {

	private int empId;
	private String empName;
	private double salary;

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
		// ??
		this.salary = salary;
	}

	void display() {
		System.out.println("Emp Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("----------------------------");
	}

}
