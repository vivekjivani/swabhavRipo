package com.techlab.account.test;

import com.tecchlab.account.exceptions.NullValueException;
import com.techlab.account.Account;

public class TestToString {
	public static void main(String args[]) throws NullValueException {
		Account acc1 = new Account("vivek", "123456789090");
		Account acc2 = new Account("vivek", "123456789090");
		System.out.println(acc1.toString());
		//System.out.println(acc1);
	}
}
