package com.techlab.inventory;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlab.instrument.Instrument;
import com.techlab.instrumentSpec.InstrumentSpec;

public class Inventory {
	private ArrayList<Instrument> inventory;
	
	public Inventory() {
		inventory = new ArrayList<Instrument>();
	}
	
	public void addInstrumen(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNumber, price, spec);
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for(Iterator i = inventory.iterator(); i.hasNext() ; ) {
			Instrument instrument = (Instrument)i.next();
			if(instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;	
	}
	
	public List search(InstrumentSpec searchSpec) {
		List matchingInstrument = new LinkedList();
		for(Iterator i = inventory.iterator();i.hasNext(); )
		{
			Instrument instrument = (Instrument)i.next();
			if(instrument.getSpec().matches(searchSpec))
				matchingInstrument.add(instrument);
		}
		return matchingInstrument;
	}

}
