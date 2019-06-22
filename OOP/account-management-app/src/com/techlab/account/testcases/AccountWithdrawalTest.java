package com.techlab.account.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tecchlab.account.exceptions.NegativeValueException;
import com.tecchlab.account.exceptions.NullValueException;
import com.techlab.account.Account;

public class AccountWithdrawalTest {
	Account acc1;

	@Test
	public void testWithdrawal_1000ValueIsGiven_ResultShouldBe9000()
			throws NullValueException, NegativeValueException {
		acc1 = new Account("vivek", "987654321098", 10000.00);
		acc1.withdrawal(1000.0);
		double expectedValue=9000.0;
		assertTrue(expectedValue==acc1.getBalance());
	}

	@Test(expected = com.techlab.account.TransactionExcaption.class)
	public void testWithdrawal_15000ValueISGiven_ShoulThrowTransactionException()
			throws NullValueException, NegativeValueException {
		acc1 = new Account("vivek", "987654321098", 1000.00);
		acc1.withdrawal(15000);
	}

	@Test(expected = com.tecchlab.account.exceptions.NegativeValueException.class)
	public void testWithdrawal_NegativeValueIsGiven_ShouldThrowException()
			throws NullValueException, NegativeValueException {
		acc1 = new Account("vivek", "456789032121");
		acc1.deposit(-500);
	}
}
