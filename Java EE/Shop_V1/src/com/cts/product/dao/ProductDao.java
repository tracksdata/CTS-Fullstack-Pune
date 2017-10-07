package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

public interface ProductDao {

	String insertQry = "insert into product values(?,?,?)";
	String selectQuery = "select * from product";
	String findQuery = "select * from product where product_id=?";
	String deleteQuery = "delete from product where product_id=?";
	String updateQuery = "update product set product_name=?,price=? where product_id=?";

	public boolean saveProduct(Product prod);

	public Product findProduct(String prodId);

	public List<Product> listAll();

	public boolean deleteProduct(String prodId);

	public boolean updateProduct(Product prod);

}
