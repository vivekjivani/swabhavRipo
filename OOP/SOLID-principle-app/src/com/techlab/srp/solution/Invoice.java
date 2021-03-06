package com.techlab.srp.solution;

public class Invoice {
	private String invoiceNumber;
	private String date;
	private double cost;
	private float discount;
	private float goodsServiceTex;

	public Invoice(String invoiceNumber, String date, double cost, float discount, float goodsServiceTex) {
		this.invoiceNumber = invoiceNumber;
		this.date = date;
		this.cost = cost;
		this.discount = discount;
		this.goodsServiceTex = goodsServiceTex;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public String getDate() {
		return date;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}

	public float getGoodsServiceTex() {
		return goodsServiceTex;
	}

	public double calculateTex() {
		return cost * goodsServiceTex;
	}

	public double calculateDiscount() {
		return cost * discount;
	}

	public double calculateTotalCost() {
		return cost + calculateTex() + calculateDiscount();
	}
}
