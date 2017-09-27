package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class App7 {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			con.setAutoCommit(false);

			String q1 = "insert into product values('P0001','Tree',763)";
			String q2 = "update product set product_name='New' where product_id='P002'";
			String q3 = "delete from product where product_id='P006'";

			Statement stmt = con.createStatement();

			stmt.addBatch(q2);
			stmt.addBatch(q1);
			stmt.addBatch(q3);

			int res[] = stmt.executeBatch();

			System.out.println(res.length + " statements executed ");

			boolean flag = true;

			for (int i = 0; i < res.length; i++) {
				if (res[i] == 0)
					flag = false;
			}

			if (flag == true) {
				con.commit();
			} else
				con.rollback();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
