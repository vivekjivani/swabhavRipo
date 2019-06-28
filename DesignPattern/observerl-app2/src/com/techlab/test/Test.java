package com.techlab.test;

import com.techlab.exceptions.NegativeValueException;
import com.techlab.exceptions.NullValueException;
import com.techlab.publisher.Account;
import com.techlab.subscriber.EmailNotifiction;
import com.techlab.subscriber.SmsNotification;

public class Test {
	public static void main(String args[]) throws NullValueException, NegativeValueException {
		// Publisher
		Account account1 = new Account("vivek", "123456789087", 1000, "9876543212", "vivek@gmail.com");
		
		// Subscriber
		EmailNotifiction emailNotifier = new EmailNotifiction();
		SmsNotification smsNotifier = new SmsNotification();
		
		account1.registerObserver(smsNotifier);
		account1.registerObserver(emailNotifier);
		
		account1.deposit(1000);
	}
}
