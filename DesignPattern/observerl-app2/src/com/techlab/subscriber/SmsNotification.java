package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.IBalanceChange;

public class SmsNotification implements IBalanceChange {

	@Override
	public void balanceChangeNotifier(Account account) {
		System.out.println("Sending SMS to " + account.getPhone() + " : " + account.getName()
				+ ", your balance has changed, updated balance is : " + account.getBalance());
	}

}
