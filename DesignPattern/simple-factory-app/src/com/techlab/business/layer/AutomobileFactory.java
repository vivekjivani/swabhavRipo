package com.techlab.business.layer;

public class AutomobileFactory {
	public IAutomobile manufacturing(AutoType type) {
		if (type.equals(AutoType.AUDI))
			return new Audi();
		if (type.equals(AutoType.BMW))
			return new BMW();
		if (type.equals(AutoType.TESLA))
			return new Tesla();
		return null;
	}
}
