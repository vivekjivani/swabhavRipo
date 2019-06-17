package com.techlab.guitar;

import com.tecchlab.guitar.spec.GuitarSpec;
import com.techlab.guitar.eums.Builder;
import com.techlab.guitar.eums.Type;
import com.techlab.guitar.eums.Wood;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public Guitar(String serialNumber, double price, Builder builder, Type type, Wood topWood, Wood backWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		spec.setBuilder(builder);
		spec.setType(type);
		spec.setBackWood(backWood);
		spec.setTopWood(topWood);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
