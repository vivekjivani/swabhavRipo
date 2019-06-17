package com.techlab.account;

public abstract class Account {
	private String name;
	private long accountNumber;
	protected double balance;

	public Account(String name, long accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public abstract void withdrawal(double amount);
}
