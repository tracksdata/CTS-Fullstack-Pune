package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.Account;

@Entity
@Table(name = "person")
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

	@Embedded
	private Account acc;

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
