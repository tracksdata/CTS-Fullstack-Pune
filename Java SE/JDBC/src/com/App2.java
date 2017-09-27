package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class App2 {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String qry = "insert into product values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(1, "P9091");
			ps.setString(2, "Red Ink Pen");
			ps.setDouble(3, 76.34);

			int res = ps.executeUpdate();
			System.out.println(res + " statemnts executed");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
