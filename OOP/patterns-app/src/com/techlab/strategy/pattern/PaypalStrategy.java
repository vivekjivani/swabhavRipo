package com.techlab.strategy.pattern;

public class PaypalStrategy implements PaymetStrategy {
	private String userId;
	private String password;

	public PaypalStrategy(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paying through paypal, amount : " + amount);
	}

}
