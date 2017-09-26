package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

public interface ProductDao {

	public void saveProduct(Product prod);

	public Product findProduct(String prodId);

	public List<Product> listAll();

	public boolean deleteProduct(String prodId);

	public void updateProduct(Product prod);

}
