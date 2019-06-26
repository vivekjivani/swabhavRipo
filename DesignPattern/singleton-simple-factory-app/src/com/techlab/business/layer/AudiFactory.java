package com.techlab.business.layer;

public class AudiFactory implements IAutomobileFactory{
	private static AudiFactory audiInstance;
	private AudiFactory() {
		
	}
	public static AudiFactory getInstance() {
		if(audiInstance==null) {
			audiInstance = new AudiFactory();
		}
		return audiInstance;
	}
	public IAutomobile manufacturing() {
		return new Audi();
	}
}
