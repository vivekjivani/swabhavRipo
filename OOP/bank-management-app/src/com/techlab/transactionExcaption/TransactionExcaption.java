package com.techlab.transactionExcaption;

public class TransactionExcaption extends RuntimeException {
	public TransactionExcaption(String s) {
		super(s);
		System.out.println("Transaction failed");
	}
}
