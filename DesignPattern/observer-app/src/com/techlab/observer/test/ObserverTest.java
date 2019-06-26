package com.techlab.observer.test;

import com.techlab.observer.Internet;
import com.techlab.observer.NewsPaper;
import com.techlab.subject.Loan;

public class ObserverTest {
	public static void main(String args[]) {
		Loan homeLoan = new Loan(0.05f, "HDFC", "HomeLoan");
		NewsPaper newsPaper = new NewsPaper();
		Internet internet = new Internet();
		homeLoan.addObserver(newsPaper);
		homeLoan.addObserver(internet);
		homeLoan.setInterest(0.050f);
	}
}
