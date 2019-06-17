package com.techlab.account;

public class Account {
	private String name;
	private long accountNumber;
	private double balance;
	private static double MIN_BALANCE = 500.00;

	public Account(String name, long accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(String name, long accountNumber) {
		this(name, accountNumber, MIN_BALANCE);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdrawal(double amount) {
		if (!this.checkTransactionIsSafe(amount))
			throw new InsufficientFundException(this,amount);
		this.balance -= amount;
	}

	private boolean checkTransactionIsSafe(double amount) {
		if (amount > this.balance)
			return false;
		if ((this.balance - amount) < MIN_BALANCE)
			return false;
		return true;
	}

	/*
	 * @Override public String toString() { String s="Name : " + this.getName() +
	 * "\n" + "Account number : " + this.getAccountNumber() + "\n" + "Balance : " +
	 * this.getBalance()+"\n"+super.toString(); return s; }
	 * 
	 * @Override public boolean equals(Object o) { Account acc = (Account) o; return
	 * this.accountNumber == acc.accountNumber && this.name == acc.name &&
	 * this.balance == acc.balance; }
	 */
}
