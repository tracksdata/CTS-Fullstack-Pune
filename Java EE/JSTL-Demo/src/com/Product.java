package com;

public class Product {
	private String prodId;
	private String prodName;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String prodId, String prodName, double price) {
		
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
