package com.techlab.account.test;

import com.tecchlab.account.exceptions.NullValueException;
import com.techlab.account.Account;

public class TestEquality {
	public static void main(String args[]) throws NullValueException {
		Account acc1 = new Account("vivek", "123456789012");
		Account acc2 = new Account("vivek", "123456789012");
		System.out.println(acc1==acc1);
		System.out.println(acc1==acc2);
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));
	}
}
