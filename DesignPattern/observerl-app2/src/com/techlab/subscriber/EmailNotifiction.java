package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.IBalanceChange;

public class EmailNotifiction implements IBalanceChange {

	@Override
	public void balanceChangeNotifier(Account account) {
		System.out.println("Sending Mail to " + account.getEmail() + " : " + account.getName()
				+ ", your Account balance has chnaged, updated balance is : " + account.getBalance());
	}

}
