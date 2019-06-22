package com.techlab.instrument.spec;

import com.techlab.instrumentEnum.Builder;
import com.techlab.instrumentEnum.Type;
import com.techlab.instrumentEnum.Wood;

public class GuitarSpec extends InstrumentSpec{
	private int numberOfStrings;
	
	public GuitarSpec(Builder builder, Type type, Wood topWood, Wood backWood, String model, int numberOfString) {
		super(builder, type, topWood, backWood, model);
		this.numberOfStrings = numberOfString;
	}
	
	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec))
			return false;
		if(!(otherSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec) otherSpec;
		if(numberOfStrings != spec.numberOfStrings)
			return false;
		return true;
	}
}
