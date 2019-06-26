package com.techlab.business.layer;

public class TeslaFactory implements IAutomobileFactory{
	private static TeslaFactory teslaInstance;
	private TeslaFactory() {
		
	}
	public static TeslaFactory getInstance() {
		if(teslaInstance==null) {
			teslaInstance = new TeslaFactory();
		}
		return teslaInstance;
	}
	@Override
	public IAutomobile manufacturing() {
		return new Tesla();
	}

}
