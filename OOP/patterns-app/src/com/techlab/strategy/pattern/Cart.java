package com.techlab.strategy.pattern;

import java.util.ArrayList;

public class Cart {
	ArrayList<Item> itemList;
	
	public Cart() {
		itemList = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void removeItem(Item item) {
		itemList.remove(item);
	}
	
	public double calculateTotalPice() {
		double sum=0.0;
		for(Item i : itemList) {
			sum += i.getPrice();
		}
		return sum;
	}

	public void pay(PaymetStrategy strategy) {
		double amount = calculateTotalPice();
		strategy.pay(amount);
	}
}

