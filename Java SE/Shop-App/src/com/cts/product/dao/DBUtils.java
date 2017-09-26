package com.cts.product.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.product.model.Product;

public class DBUtils {

	private static List<Product> prods = null;

	public static List<Product> getCollection() {

		if (prods == null)
			prods = new ArrayList<>();

		return prods;
	}
	
	

}
