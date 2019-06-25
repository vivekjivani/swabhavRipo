package com.techlab.srp.solution.test;

import com.techlab.srp.solution.InvoicePrinter;
import com.techlab.srp.violation.Invoice;

public class InvoiceTest {
	public static void main(String aegs[]) {
		Invoice invoice1 = new Invoice("1", "1-JAN-2019", 8000.00, 0.010f, 0.05f);
		InvoicePrinter invoicePrinter= new InvoicePrinter();
		invoicePrinter.printInvoice(invoice1);
	}
}
