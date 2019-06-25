package com.techlab.ocp.violation.test;

import com.techlab.ocp.violation.FestivalType;
import com.techlab.ocp.violation.FixedDeposit;

public class FixedDepositTest {
	public static void main(String args[]) {
		FixedDeposit fd = new FixedDeposit("907856341234", "vivek", 100000, 1.5f, FestivalType.HOLI);
		System.out.println(fd.calculateSimpleInterest());
	}
}
