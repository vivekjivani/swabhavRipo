package com.techlab.business.layer;

public class BmwFactory implements IAutomobileFactory{
	private static BmwFactory bmwInstance;
	private BmwFactory() {
		
	}
	public static BmwFactory getInstance() {
		if(bmwInstance==null) {
			bmwInstance = new BmwFactory();
		}
		return bmwInstance;
	}
	@Override
	public IAutomobile manufacturing() {
		return new BMW();
	}
 
}
