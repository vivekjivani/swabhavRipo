package com.techlab.ocp.solution.test;

import com.techlab.ocp.solution.FixedDeposit;
import com.techlab.ocp.solution.HoliFestival;
import com.techlab.ocp.solution.NewYearFestival;

public class FixedDepositTest {
	public static void main(String args[]) {
		FixedDeposit holi_fd = new FixedDeposit("987654321098", "vivek", 100000.00, 12, new HoliFestival());
		FixedDeposit newyear_fd = new FixedDeposit("567890432143", "darshan", 10000.00, 12, new NewYearFestival());
		System.out.println(holi_fd.calculateSimpleInterest());
		System.out.println(newyear_fd.calculateSimpleInterest());
	}
}
