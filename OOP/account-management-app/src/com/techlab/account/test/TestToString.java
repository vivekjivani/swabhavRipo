package com.techlab.account.test;

import com.techlab.account.Account;

public class TestToString {
	public static void main(String args[]) {
		Account acc1 = new Account("vivek", 123456789090L);
		Account acc2 = new Account("vivek", 123456789090L);
		System.out.println(acc1.toString());
		//System.out.println(acc1);
	}
}
