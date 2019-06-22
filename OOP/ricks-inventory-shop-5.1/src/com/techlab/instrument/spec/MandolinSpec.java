package com.techlab.instrument.spec;

import com.techlab.instrumentEnum.Builder;
import com.techlab.instrumentEnum.Style;
import com.techlab.instrumentEnum.Type;
import com.techlab.instrumentEnum.Wood;

public class MandolinSpec extends InstrumentSpec{
	private Style style;
	
	public MandolinSpec(Builder builder, Type type, Wood topWood, Wood backWood, String model,Style style) {
		super(builder, type, topWood, backWood, model);
		this.style = style;
	}
	
	public Style getStyle() {
		return style;
	}
	
	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec))
			return false;
		if(!(otherSpec instanceof MandolinSpec))
			return false;
		MandolinSpec spec = (MandolinSpec) otherSpec;
		if(style != spec.style)
			return false;
		return true;
	}
	
}
