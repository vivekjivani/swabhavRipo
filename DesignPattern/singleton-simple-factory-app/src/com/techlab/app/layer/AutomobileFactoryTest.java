package com.techlab.app.layer;

import com.techlab.business.layer.BmwFactory;
import com.techlab.business.layer.IAutomobile;
import com.techlab.business.layer.IAutomobileFactory;
import com.techlab.business.layer.TeslaFactory;

public class AutomobileFactoryTest {
	public static void main(String args[]) {
		IAutomobileFactory factory = TeslaFactory.getInstance();
		IAutomobile auto = factory.manufacturing();
		System.out.println("Class : " + auto.getClass().getSimpleName());
		auto.start();
		auto.stop();
	}
}
