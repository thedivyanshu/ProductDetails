package com.product.pojo;

public class Product {
	private String pName;
	private String pCost;
	private String pQuantity;
	public Product(String pName, String pCost, String pQuantity) {
		super();
		this.pName = pName;
		this.pCost = pCost;
		this.pQuantity = pQuantity;
	}
	public String getpName() {
		return pName;
	}
	public String getpCost() {
		return pCost;
	}
	public String getpQuantity() {
		return pQuantity;
	}
	
	
}
