package com.techlab.strategy.pattern;

public class CreditCardStrategy implements PaymetStrategy {
	private String name;
	private long cardNumber;
	private String cvv;
	private String dtaeOfExpiry;

	public CreditCardStrategy(String name, long cardNumber, String cvv, String dtaeOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dtaeOfExpiry = dtaeOfExpiry;
	}

	public String getName() {
		return name;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public String getDtaeOfExpiry() {
		return dtaeOfExpiry;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Payment using credit card, amount : "+amount);
	}

}
