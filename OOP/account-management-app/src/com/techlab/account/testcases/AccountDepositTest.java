package com.techlab.account.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tecchlab.account.exceptions.NegativeValueException;
import com.tecchlab.account.exceptions.NullValueException;
import com.techlab.account.Account;

public class AccountDepositTest {
	Account acc;

	@Test
	public void testDeposit_500ValueISGiven_ResultShuoldBe1000()
			throws NullValueException, NegativeValueException {
		acc = new Account("vivek", "456789032121");
		acc.deposit(500);
		double expectedValue = 1000.0;
		assertTrue(expectedValue==acc.getBalance());
	}

	@Test(expected = com.tecchlab.account.exceptions.NegativeValueException.class)
	public void testDeposit_NegativeValueIsGiven_ShouldThrowException()
			throws NullValueException, NegativeValueException {
		acc = new Account("vivek", "456789032121");
		acc.deposit(-500);
	}

}
