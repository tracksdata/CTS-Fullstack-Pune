package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity()
@Table(name="p4",schema="praveen")
public class Person {

	@Id
	@Column(name="person_id",length=10)
	private String personId;
	@Column(name="person_name",length=20)
	private String personName;
	private int age;
	@Column(name="person_addr",length=30)
	private String addr;
	
	@Temporal(TemporalType.TIME)
	@Column(name="person_dateofbirth")
	private Date dob;

	@Transient
	private String info;

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
