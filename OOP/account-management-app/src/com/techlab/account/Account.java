package com.techlab.account;

import com.tecchlab.account.exceptions.NegativeValueException;
import com.tecchlab.account.exceptions.NullValueException;

public class Account {
	private String name;
	private String accountNumber;
	private double balance;
	private static double MIN_BALANCE = 500.00;

	public Account(String name, String accountNumber, double balance) throws NullValueException {
		if (name == null || accountNumber == null) {
			throw new NullValueException();
		}
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(String name, String accountNumber) throws NullValueException {
		this(name, accountNumber, MIN_BALANCE);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) throws NegativeValueException {
		if(amount<0.0) 
			throw new NegativeValueException();
		this.balance += amount;
	}

	public void withdrawal(double amount) throws NegativeValueException {
		if (!this.checkTransactionIsSafe(amount))
			throw new TransactionExcaption();
		this.balance -= amount;
	}

	private boolean checkTransactionIsSafe(double amount) throws NegativeValueException {
		if(amount <0.0)
			throw new NegativeValueException();
		if (amount > this.balance)
			return false;
		if ((this.balance - amount) < MIN_BALANCE)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = "Name : " + this.getName() + "\n" + "Account number : " + this.getAccountNumber() + "\n"
				+ "Balance : " + this.getBalance() + "\n" + super.toString();
		return s;
	}

	@Override
	public boolean equals(Object o) {
		Account acc = (Account) o;
		return this.accountNumber == acc.accountNumber && this.name == acc.name && this.balance == acc.balance;
	}
}
