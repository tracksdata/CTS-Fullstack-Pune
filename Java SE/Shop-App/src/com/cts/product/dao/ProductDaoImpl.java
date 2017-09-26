package com.cts.product.dao;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.cts.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	private List<Product> prods;
	private Product prod;

	@Override
	public void saveProduct(Product prod) {

		prods = DBUtils.getCollection();
		prods.add(prod);
		System.out.println("Dao: Product added to DB");

	}

	@Override
	public Product findProduct(String prodId) {
		boolean flag = false;
		prods = DBUtils.getCollection();
		for (Product prod : prods) {
			if (prod.getProdId().equals(prodId)) {
				this.prod = prod;
				flag = true;
			}
		}

		if (!flag)
			return null;
		else
			return prod;

	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return DBUtils.getCollection();
	}

	@Override
	public boolean deleteProduct(String prodId) {

		prods = DBUtils.getCollection();
		boolean flag=false;
		Iterator<Product> prod = prods.iterator();
		while (prod.hasNext()) {
			if (prod.next().getProdId().equals(prodId)) {
				prod.remove();
				flag=true;
			}
			
		}// end of while
		return flag;
	}

	@Override
	public void updateProduct(Product prod) {
		prods = DBUtils.getCollection();

		ListIterator<Product> li = prods.listIterator();
		while (li.hasNext()) {
			if (prod.getProdId().equals(li.next().getProdId()))
				li.set(prod);
		}

	}

}
