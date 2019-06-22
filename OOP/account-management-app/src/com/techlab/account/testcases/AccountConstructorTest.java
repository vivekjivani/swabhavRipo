package com.techlab.account.testcases;

import org.junit.Test;

import com.tecchlab.account.exceptions.NullValueException;
import com.techlab.account.Account;

public class AccountConstructorTest {
	Account acc1;

	@Test
	public void testParameterisedConstructure_VivekAnd98765432109ValuesAreGiven_ShouldNotThrowException()
			throws NullValueException {
		acc1 = new Account("vivek", "98765432109");
	}

	@Test(expected = com.tecchlab.account.exceptions.NullValueException.class)
	public void testPerameteridesConstructor_nullValuesAreGiven_ShouldThrowException() throws NullValueException {
		acc1 = new Account(null, null);
	}
}
