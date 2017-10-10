package com.cts.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.cts.product.model.Login;
import com.cts.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	private List<Product> prods;
	private Product prod = null;
	private Connection con = null;
	private Statement stmt = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public boolean saveProduct(Product prod) {

		con = DBUtils.getConnection();
		boolean flag = false;
		try {
			ps = con.prepareStatement(insertQry);
			ps.setString(1, prod.getProdId());
			ps.setString(2, prod.getProdName());
			ps.setDouble(3, prod.getPrice());

			int res = ps.executeUpdate();
			if (res != 0)
				flag = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}
		return flag;

	}

	@Override
	public Product findProduct(String prodId) {
		boolean flag = false;

		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement(findQuery);
			ps.setString(1, prodId);

			rs = ps.executeQuery();
			if (rs.next()) {
				prod = new Product();
				prod.setProdId(rs.getString("product_id"));
				prod.setProdName(rs.getString("product_name"));
				prod.setPrice(rs.getDouble("price"));
			} else {
				prod = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

		return prod;

	}

	// List all Products
	@Override
	public List<Product> listAll() {

		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectQuery);
			prods = new ArrayList<>();
			while (rs.next()) {
				prod = new Product();
				prod.setProdId(rs.getString("product_id"));
				prod.setProdName(rs.getString("product_name"));
				prod.setPrice(rs.getDouble("price"));

				prods.add(prod);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

		return prods;
	}

	@Override
	public boolean deleteProduct(String prodId) {

		boolean flag = false;
		try {

			con = DBUtils.getConnection();
			ps = con.prepareStatement(deleteQuery);
			ps.setString(1, prodId);
			int res = ps.executeUpdate();

			if (res != 0) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

		return flag;
	}

	@Override
	public boolean updateProduct(Product prod) {

		boolean flag = false;
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement(updateQuery);
			ps.setString(1, prod.getProdName());
			ps.setDouble(2, prod.getPrice());
			ps.setString(3, prod.getProdId());

			int res = ps.executeUpdate();

			if (res != 0)
				flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

		return flag;
	}

	@Override
	public boolean validateUser(Login login) {
		boolean  status=false;
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(loginQuery);
			ps.setString(1, login.getUserName());
			ps.setString(2, login.getPassword());
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				status=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean checkUser(String userName) {
		
		boolean status=false;
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(userQry);
			ps.setString(1, userName);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				status=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return status;
	}

}
