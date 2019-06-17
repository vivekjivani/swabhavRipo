package com.techlab.account.test;

import com.tecchlab.saving.account.SavingAccount;
import com.techlab.account.Account;
import com.techlab.current.account.CurrentAccount;

public class AccountTest {
	public static void main(String args[]) {
		SavingAccount accSaving=new SavingAccount("vivek", 123456789098L, 12000.00);
		CurrentAccount accCurrent=new CurrentAccount("darshan", 567890432134L,20000.00);
		
		//displayInfo(accSaving);
		//accSaving.deposit(1000);
		//accSaving.withdrawal(1000);
		displayInfo(accCurrent);
		accCurrent.deposit(1000);
		accCurrent.withdrawal(1000);
		System.out.println("-----------------------");
		//displayInfo(accSaving);
		displayInfo(accCurrent);
	}
	private static void displayInfo(Account ac) {
		System.out.println("Name : " + ac.getName());
		System.out.println("Account number : " + ac.getAccountNumber());
		System.out.println("Balance : " + ac.getBalance());
	}
}
