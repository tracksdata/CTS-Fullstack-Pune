package com.mapping.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Patient {

	@Id
	private String patientId;
	private String patientName;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientId, String patientName) {

		this.patientId = patientId;
		this.patientName = patientName;

	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "testDetails", joinColumns = { @JoinColumn(name = "patientId") }, inverseJoinColumns = {
			@JoinColumn(name = "testId") })
	private List<Test> tests=new ArrayList<>();

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

}
