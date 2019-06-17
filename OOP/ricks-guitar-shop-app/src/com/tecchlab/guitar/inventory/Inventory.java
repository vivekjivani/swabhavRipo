package com.tecchlab.guitar.inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tecchlab.guitar.spec.GuitarSpec;
import com.techlab.guitar.Guitar;
import com.techlab.guitar.eums.Builder;
import com.techlab.guitar.eums.Type;
import com.techlab.guitar.eums.Wood;

public class Inventory {
	List<Guitar> guitarList = new ArrayList();

	public void addGuitar(String serialNumber, double price, Builder builder, Type type, Wood topWood, Wood backWood) {
		GuitarSpec spec = new GuitarSpec(builder, type, topWood, backWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitarList.add(guitar);
	}

	public List search(GuitarSpec searchSpec) {
		List matchingGuitarList = new ArrayList();
		for (Iterator iterator = guitarList.iterator(); iterator.hasNext();) {
			Guitar guitar = (Guitar) iterator.next();
			GuitarSpec guitarSpec = guitar.getSpec();
			if (searchSpec.getBuilder() != guitarSpec.getBuilder())
				continue;
			if (searchSpec.getType() != guitarSpec.getType()) 
				continue;
			if (searchSpec.getBackWood() != guitarSpec.getBackWood())
				continue;
			if (searchSpec.getTopWood() != guitarSpec.getTopWood())
				continue;
			matchingGuitarList.add(guitar);
		}
		return matchingGuitarList;
	}
}
