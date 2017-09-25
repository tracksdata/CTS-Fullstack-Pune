package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Employee {

	private Employee() {
		System.out.println("Employee class Object created");
	}

	private static Employee emp = null;

	private static FileInputStream fis = null;
	private static Properties props = null;

	static int count=1;
	static {
		try {
			fis = new FileInputStream("src/db.properties");
			props = new Properties();
			props.load(fis);
			System.out.println("Count: "+count++);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static Employee getEmpObject() {

		if (emp == null) {
			emp = new Employee();

		} // end of if

		return emp;
	}

	public void getConnection() {

		System.out.println("--- Driver Class: " + props.getProperty("db.driver"));
		System.out.println("--- URL: " + props.getProperty("url"));
		System.out.println("User Name: " + props.getProperty("user"));
		System.out.println("Password: " + props.getProperty("pwd"));
		System.out.println("-------------------------------------------");
	}

}
