package com.techlab.lineitem;

public class LineItem {
	private int id;
	private String productName;
	private double price;
	private int quentity;

	public LineItem(int id, String productName, double price, int quentity) {
		this.id = id;
		this.price = price;
		this.productName = productName;
		this.quentity = quentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuentity() {
		return quentity;
	}

	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	
	public double calculateItemCost() {
		return price*quentity;
	}
}
