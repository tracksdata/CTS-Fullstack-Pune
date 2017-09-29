package com.cts.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	private static Connection con = null;

	public static Connection getConnection() {

		if (con == null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return con;
	}

	public static void closeConnection() {

		if (con != null)
			try {
				con.close();
				con = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
