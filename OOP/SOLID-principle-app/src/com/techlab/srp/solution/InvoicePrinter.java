package com.techlab.srp.solution;

import com.techlab.srp.violation.Invoice;

public class InvoicePrinter {
	
	public void printInvoice(Invoice invoice) {
		System.out.println("Invoice Number : " + invoice.getInvoiceNumber());
		System.out.println("Date : " + invoice.getDate());
		System.out.println("Cost : " + invoice.getCost());
		System.out.println("Discount : " + invoice.getDiscount());
		System.out.println("GST : " + invoice.getGoodsServiceTex());
		System.out.println("TotalCost : " + invoice.calculateTotalCost());
	}
}
