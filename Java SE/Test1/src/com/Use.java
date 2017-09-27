package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Use {

	public static void main(String[] args) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("-- DOne");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}
}
