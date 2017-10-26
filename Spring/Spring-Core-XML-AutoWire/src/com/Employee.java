package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	private Address addr;
	private Project proj;

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {

		this.addr = addr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
