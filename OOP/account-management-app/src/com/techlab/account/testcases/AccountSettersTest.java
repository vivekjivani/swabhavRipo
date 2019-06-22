package com.techlab.account.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tecchlab.account.exceptions.NullValueException;
import com.techlab.account.Account;

public class AccountSettersTest {
	Account acc;

	@Test
	public void testSetName_VivekIsGiven_ShouldReturnVivek() throws NullValueException {
		acc = new Account("vivek", "123456789009");
		acc.setName("vivek");
		assertTrue(acc.getName() == "vivek");
	}

	@Test
	public void testGetNameName_VivekIsGiven_ShouldReturnVivek() throws NullValueException {
		acc = new Account("vivek", "123456789009");
		assertTrue(acc.getName() == "vivek");
	}

	@Test
	public void testSetAccountNumber_998877665544IsGiven_ShouldReturn998877665544() throws NullValueException {
		acc = new Account("vivek", "998877665544");
		acc.setAccountNumber("998877665544");
		assertTrue(acc.getAccountNumber() == "998877665544");
	}

	@Test
	public void testGetAccountNumber_998877665544IsGiven_ShouldReturn998877665544() throws NullValueException {
		acc = new Account("vivek", "998877665544");
		assertTrue(acc.getAccountNumber() == "998877665544");
	}

	@Test
	public void testSetBalance_1000IsGiven_ShouldReturn1000() throws NullValueException {
		acc = new Account("vivek", "123456789009", 1000.00);
		acc.setBalance(1000.00);
		assertTrue(acc.getBalance() == 1000.00);
	}

	@Test
	public void testGetBalance_1000IsGiven_ShouldReturn1000() throws NullValueException {
		acc = new Account("vivek", "123456789009", 1000.00);
		assertTrue(acc.getBalance() == 1000.00);
	}

}
