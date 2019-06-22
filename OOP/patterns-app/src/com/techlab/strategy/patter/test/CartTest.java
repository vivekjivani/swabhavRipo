package com.techlab.strategy.patter.test;

import com.techlab.strategy.pattern.Cart;
import com.techlab.strategy.pattern.CreditCardStrategy;
import com.techlab.strategy.pattern.Item;
import com.techlab.strategy.pattern.PaypalStrategy;

public class CartTest {
	public static void main(String args[]) {
		Item item = new Item("tea",120);
		Cart cart = new Cart();
		cart.addItem(item);
		Item item2 = new Item("Coffee",200);
		cart.addItem(item2);
		cart.pay(new PaypalStrategy("vivek@gmail.com","1122"));
		cart.pay(new CreditCardStrategy("vivek",123456789090L,"990","JAN/2019"));
	}
}
