package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class App5 {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			String qry = "select * from product";
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(qry);

			rs.absolute(3);
			
			rs.updateString(2, "New Value");
			rs.updateRow();

			System.out.println(rs.getString("product_id"));
			System.out.println(rs.getString("product_name"));
			System.out.println(rs.getString("price"));
			System.out.println("----------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
