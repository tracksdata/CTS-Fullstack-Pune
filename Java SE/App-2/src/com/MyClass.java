package com;

import java.io.FileInputStream;
import java.util.Properties;

public class MyClass {

	int empId;
	static FileInputStream isr = null;
	static Properties props = new Properties();

	static {
		try {
			A1 a=new A1();
			isr = new FileInputStream("src/test.properties");
			props.load(isr);

		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("-- s 1");
	}
	static {
		System.out.println("-- s 2");
	}
	public static void main(String[] args) {
		//MyClass m=new MyClass();

		try {
			Class.forName(props.getProperty("cname"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//System.out.println("---main  " + props.getProperty("ename"));

	}

}
