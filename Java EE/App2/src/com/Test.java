package com;

class Employee {
	private int empID;
	private String empName;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEmpID(10);
		e2.setEmpID(20);
		
		

	}

}
