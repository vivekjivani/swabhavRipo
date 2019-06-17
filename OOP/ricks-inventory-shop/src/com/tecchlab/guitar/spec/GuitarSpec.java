package com.tecchlab.guitar.spec;

import com.techlab.guitar.eums.Builder;
import com.techlab.guitar.eums.Type;
import com.techlab.guitar.eums.Wood;

public class GuitarSpec {
	private Builder builder;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, Type type, Wood topWood, Wood backWood) {
		this.builder = builder;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

}
