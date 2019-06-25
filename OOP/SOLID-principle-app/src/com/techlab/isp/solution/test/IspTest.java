package com.techlab.isp.solution.test;

import com.techlab.isp.solution.IEatableWorkable;
import com.techlab.isp.solution.IWorkable;
import com.techlab.isp.solution.Manager;
import com.techlab.isp.solution.Robot;


public class IspTest {
	public static void main(String args[]) {
		atWorkStation(new Manager());
		atWorkStation(new Robot());
		atCafeteria(new Manager());
	}
	private static void atWorkStation(IWorkable worker) {
		worker.startWork();
		worker.stopWork();
	}
	private static void atCafeteria(IEatableWorkable worker) {
		worker.startEat();
		worker.stopEat();
	}
}
