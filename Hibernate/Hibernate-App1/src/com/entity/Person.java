package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="person")
//@SecondaryTable(name="account")
@SecondaryTables(value= {@SecondaryTable(name="account"),@SecondaryTable(name="address")})
public class Person {

	@Id
	@Column(name = "person_id", length = 10)
	private String personId;
	@Column(name = "person_name", length = 20)
	private String personName;
	
	@Transient
	private int age;
	@Column(name = "person_addr", length = 20)
	private String addr;

	@Transient
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "person_dateofbirth")
	private Date dob;

	@Column(name="account_no",table="account",length=10)
	private String accNo;
	@Column(name="account_type",table="account",length=10)
	private String accType;
	@Column(table="account")
	private double balance;
	
	@Column(length=10,table="address")
	private String city;
	@Column(length=10,table="address")
	private String street;
	@Column(length=10,table="address")
	private String state;
	
	
	
	

	@Transient
	private String info;
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
