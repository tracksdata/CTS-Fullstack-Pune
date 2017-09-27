package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App1 {

	public static void main(String[] args) {

		try {
			/*
			 * Driver drv=new Driver(); DriverManager.registerDriver(drv);
			 * 
			 * 
			 * //Class.forName("com.mysql.jdbc.Driver");
			 * //System.out.println("-- Driver loaded");
			 */

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// Connection con2 =
			// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			// System.out.println("-- Connected with
			// "+con.getMetaData().getDatabaseProductName());
			// System.out.println("-- Connected with
			// "+con2.getMetaData().getDatabaseProductName());

			Statement stmt = con.createStatement();
			String qry = "insert into product values('P9090','My Pen',12.45)";
			int res = stmt.executeUpdate(qry);
			if (res != 0)
				System.out.println(res + " statemnt(s) executed");
			else
				System.out.println("-- Issue with DB");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
