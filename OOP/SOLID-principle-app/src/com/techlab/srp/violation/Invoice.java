package com.techlab.srp.violation;

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

	public void printInvoice(Invoice invoice) {
		System.out.println("Invoice Number : "+invoice.getInvoiceNumber());
		System.out.println("Date : "+invoice.getDate());
		System.out.println("Cost : "+invoice.getCost());
		System.out.println("Discount : "+invoice.getDiscount());
		System.out.println("GST : "+invoice.getGoodsServiceTex());
		System.out.println("TotalCost : "+invoice.calculateTotalCost());
	}
}
