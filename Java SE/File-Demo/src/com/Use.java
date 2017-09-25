package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Use {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpId(11);
		emp.setEmpName("James");
		emp.setSalary(349734);
		emp.setInfo("Info about Emp");

		try {

			FileOutputStream fos = new FileOutputStream("d:/f1/cts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp); // state ---> Synch
			

			System.out.println("-- Writing is done");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}
}
