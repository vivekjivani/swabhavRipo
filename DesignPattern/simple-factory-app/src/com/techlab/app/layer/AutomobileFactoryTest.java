package com.techlab.app.layer;

import com.techlab.business.layer.AutoType;
import com.techlab.business.layer.AutomobileFactory;
import com.techlab.business.layer.IAutomobile;

public class AutomobileFactoryTest {
	public static void main(String args[]) {
		AutomobileFactory factory = new AutomobileFactory();
		IAutomobile auto = factory.manufacturing(AutoType.TESLA);
		System.out.println("Class : " + auto.getClass().getSimpleName());
		auto.start();
		auto.stop();
	}
}
