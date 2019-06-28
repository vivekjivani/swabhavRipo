package com.techlab.publisher;

import java.util.ArrayList;

import com.techlab.exceptions.NegativeValueException;
import com.techlab.exceptions.NullValueException;
import com.techlab.exceptions.TransactionExcaption;

public class Account {
	private String name;
	private String accountNumber;
	private double balance;
	private String phone;
	private String email;
	private static double MIN_BALANCE = 500.00;
	private ArrayList<IBalanceChange> listOfObserver;

	public Account(String name, String accountNumber, double balance, String phone, String email)throws NullValueException {
		if (name == null || accountNumber == null || phone == null) {
			throw new NullValueException();
		}
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.phone = phone;
		this.email = email;
		listOfObserver = new ArrayList<IBalanceChange>();
	}

	public Account(String name, String accountNumber, String number, String email) throws NullValueException {
		this(name, accountNumber, MIN_BALANCE, number, email);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
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

	public void registerObserver(IBalanceChange obserever) {
		listOfObserver.add(obserever);
	}

	public void removeObserver(IBalanceChange observer) {
		listOfObserver.remove(observer);
	}

	public void deposit(double amount) throws NegativeValueException {
		if (amount < 0.0)
			throw new NegativeValueException();
		this.balance += amount;
		notifyObserver();
	}

	public void withdrawal(double amount) throws NegativeValueException, TransactionExcaption {
		if (!this.checkTransactionIsSafe(amount))
			throw new TransactionExcaption();
		this.balance -= amount;
		notifyObserver();
	}

	private boolean checkTransactionIsSafe(double amount) throws NegativeValueException {
		if (amount < 0.0)
			throw new NegativeValueException();
		if (amount > this.balance)
			return false;
		if ((this.balance - amount) < MIN_BALANCE)
			return false;
		return true;
	}

	private void notifyObserver() {
		for (IBalanceChange observer : listOfObserver) {
			observer.balanceChangeNotifier(this);
		}
	}
}
