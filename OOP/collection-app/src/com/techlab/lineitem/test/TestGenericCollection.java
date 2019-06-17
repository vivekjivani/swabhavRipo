package com.techlab.lineitem.test;

import java.util.ArrayList;

import com.techlab.lineitem.LineItem;

public class TestGenericCollection {
	public static void main(String args[]) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(0, "t-shirt", 550.00, 3));
		cart.add(new LineItem(1, "jeans", 1200.00, 3));
		
		for (LineItem item : cart) {
			System.out.println("Item : " + item.getProductName() + "\nPrice : " + item.getPrice() + "\nQuentity : "
					+ item.getQuentity()+"\nTotal_Cost : "+item.calculateItemCost()+"\n");
		}
	}
}
