package com.techlab.account;

public class InsufficientFundException extends RuntimeException {
	String message;

	public InsufficientFundException(Account account, double amount) {
		String name = account.getName();
		double balance = account.getBalance();
		this.message = "Insufficient Fund, "+name + "'s current balance is :" + balance + ", You trying to withdraval : " + amount;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
