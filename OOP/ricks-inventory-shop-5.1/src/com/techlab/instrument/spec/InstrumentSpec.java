package com.techlab.instrument.spec;

import com.techlab.instrumentEnum.*;

public abstract class InstrumentSpec {
	private Builder builder;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private String model;

	public InstrumentSpec(Builder builder, Type type, Wood topWood, Wood backWood, String model) {
		this.builder = builder;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
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
	
	public boolean matches(InstrumentSpec otherSpec) {
		if(builder != otherSpec.builder)
			return false;
		if((model != null) && (model != otherSpec.model))
			return false;
		if((type != null) && (type != otherSpec.type))
			return false;
		if((topWood != null) && (topWood != otherSpec.topWood))
			return false;
		if((backWood != null) && (backWood != otherSpec.backWood))
			return false;
		return true;
	}
}
