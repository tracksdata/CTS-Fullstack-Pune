package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

	
	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream fis=new FileInputStream("d:/f1/cts.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employee emp=(Employee) ois.readObject();
			
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println(emp.getInfo());

			ois.close();
			fis.close();
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
	}
}
