package com.tecchlab.saving.account;

import com.techlab.account.Account;
import com.techlab.transactionExcaption.*;

public class SavingAccount extends Account {
	private static double MINIMUM_BALANCE = 500;

	public SavingAccount(String name, long accountNumber, double balance) {
		super(name,accountNumber,balance);
	}

	public SavingAccount(String name, long accountNumber) {
		this(name, accountNumber, 500.00);
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
