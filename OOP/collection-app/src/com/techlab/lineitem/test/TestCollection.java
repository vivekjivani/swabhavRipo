package com.techlab.lineitem.test;

import java.util.ArrayList;

import com.techlab.lineitem.LineItem;

public class TestCollection {
	public static void main(String args[]) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(0, "t-shirt", 550.00, 3));
		cart.add(new LineItem(1, "jeans", 1200.00, 3));
		cart.add("String");
		cart.add(10);
		
		for(Object o: cart) {
			LineItem item=(LineItem)o;
			System.out.println(item.getProductName());
		}
	}
}
