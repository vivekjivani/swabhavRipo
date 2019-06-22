package com.techlab.instrument;

import com.techlab.instrumentSpec.InstrumentSpec;

public class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec spec;
	
	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.price = price;
		this.serialNumber = serialNumber;
		this.spec = spec;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public InstrumentSpec getSpec() {
		return spec;
	}
}
