package com.techlab.isp.violation.test;

import com.techlab.isp.violation.Iworker;
import com.techlab.isp.violation.Manager;
import com.techlab.isp.violation.Robot;

public class IspTest {
	public static void main(String args[]) {
		atWorkStation(new Manager());
		atWorkStation(new Robot());
		atCafeteria(new Manager());
		atCafeteria(new Robot());
	}
	private static void atWorkStation(Iworker worker) {
		worker.startWork();
		worker.stopWork();
	}
	private static void atCafeteria(Iworker worker) {
		worker.startEat();
		worker.stopEat();
	}
}
