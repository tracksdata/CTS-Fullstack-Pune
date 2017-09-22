
package com;

import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	private Department dept; // has 'A'
	private List<Address> addrs; // has 'A'

	public List<Address> getAddrs() {
		return addrs;
	}

	public void setAddrs(List<Address> addrs) {
		this.addrs = addrs;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
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

	public void display() {
		System.out.println("Emp Id: " + empId);
		System.out.println("name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Dept Name: " + dept.getDeptName());
		System.out.println("Location: " + dept.getLoc());
		System.out.println("---- Address ----");
		for(Address addr:addrs) {
			System.out.println("Addr Type: "+addr.getAddrType());
			System.out.println("Addr id: "+addr.getAddrId());
			System.out.println("Hno: "+addr.getHno());
			System.out.println("City: "+addr.getCity());
			System.out.println("----------------");
		}
		System.out.println("------------------------------");
	}

}
