package com.techlab.contact.exception;

public class ContactNotFountException extends Exception {
	public ContactNotFountException(String s) {
		super(s);
		System.out.println("Contact Not Found");
	}
}
