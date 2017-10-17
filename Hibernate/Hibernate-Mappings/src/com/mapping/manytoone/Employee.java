package com.mapping.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private double salary;
	
	

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptId")
	//@JoinTable(name="empDetails",joinColumns= {@JoinColumn(name="empId")},inverseJoinColumns= {@JoinColumn(name="deptId")})
	private Department dept;
/*
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "projId")
	private Project proj;

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}
*/
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

}
