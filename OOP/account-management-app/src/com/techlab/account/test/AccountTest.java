package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.TransactionExcaption;

public class AccountTest {
	public static void main(String args[]) {
		Account accountOne = new Account("vivek", 123456789012L, 1000.0);
		Account accountTwo = new Account("darshan", 567890432122L);
		displayInfo(accountOne);
		displayInfo(accountTwo);
		accountOne.deposit(1000);
		displayInfo(accountOne);
		try {
			accountTwo.withdrawal(1000);
		} catch (TransactionExcaption e) {
			System.out.println(e);
		}
	}

	private static void displayInfo(Account ac) {
		System.out.println("Name : " + ac.getName());
		System.out.println("Account number : " + ac.getAccountNumber());
		System.out.println("Balance : " + ac.getBalance());
	}
}
