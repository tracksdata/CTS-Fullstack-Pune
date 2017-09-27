package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class App3 {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String qry = "update product set product_name=?,price=? where product_id=?";

			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(1, "Black Ink Pen");
			ps.setString(3, "P9091");
			ps.setDouble(2, 56);

			int res = ps.executeUpdate();
			System.out.println(res + " statemnts Updated");
			ps.setString(1, "My Note Book");
			ps.setString(3, "P002");
			ps.setDouble(2, 102);

			res = ps.executeUpdate();
			System.out.println(res + " statemnts Updated");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
