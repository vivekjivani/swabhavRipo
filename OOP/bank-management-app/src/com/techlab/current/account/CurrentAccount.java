package com.techlab.current.account;

import com.techlab.account.Account;
import com.techlab.transactionExcaption.TransactionExcaption;

public class CurrentAccount extends Account {
	private static double MINIMUM_BALANCE = 2000.00;

	public CurrentAccount(String name, long accountNumber, double balance) {
		super(name,accountNumber,balance);
	}

	public CurrentAccount(String name, long accountNumber) {
		this(name, accountNumber, 2000.00);
	}

	@Override
	public void withdrawal(double amount) {
		if (!this.checkTransactionIsSafe(amount))
			throw new TransactionExcaption("failed");
		this.balance -= amount;
	}

	private boolean checkTransactionIsSafe(double amount) {
		if (amount > this.balance)
			return false;
		if ((this.balance - amount) < MINIMUM_BALANCE)
			return false;
		return true;
	}

}
