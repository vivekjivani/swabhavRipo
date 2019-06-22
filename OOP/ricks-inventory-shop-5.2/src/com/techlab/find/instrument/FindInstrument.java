package com.techlab.find.instrument;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlab.instrument.Instrument;
import com.techlab.instrumentEnum.Builder;
import com.techlab.instrumentEnum.InstrumentType;
import com.techlab.instrumentEnum.Type;
import com.techlab.instrumentEnum.Wood;
import com.techlab.instrumentSpec.InstrumentSpec;
import com.techlab.inventory.Inventory;

public class FindInstrument {
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		initializeInventoy(inventory);
		
		Map properties = new HashMap();
		properties.put("builder",Builder.FENDER);
		properties.put("backWood",Wood.ALDER);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);
		
		List matchingInstruments = inventory.search(clientSpec);
		if(!matchingInstruments.isEmpty()) {
			
			System.out.println("You might like this instruments...");
			for(Iterator i = matchingInstruments.iterator() ; i.hasNext(); ) {
				Instrument instrument =(Instrument)i.next();
				InstrumentSpec spec =instrument.getSpec();
				System.out.println("We have "+spec.getProperty("instrumentType")+" with the following properties..");
				for(Iterator j = spec.getProperties().keySet().iterator();j.hasNext();) {
					String propertyName = (String) j.next();
					if(propertyName.equals("instrumentType"))
						continue;
					System.out.println(" "+propertyName+": "+spec.getProperty(propertyName));
				}
				System.out.println("you can have this "+spec.getProperty("instrumentType")+" for "+instrument.getPrice()+"\n--");
			}
		}
	}

	private static void initializeInventoy(Inventory inventory) {
		Map properties = new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.FENDER);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numberOfString", 6);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood", Wood.ALDER);
		inventory.addInstrumen("V5050505", 9999.00, new InstrumentSpec(properties));
		
		properties.put("builder", Builder.FENDER);
		properties.put("model", "D-11");
		properties.put("topWood", Wood.MAHOGANY);
		properties.put("backWood", Wood.ALDER);
		inventory.addInstrumen("V123456", 15000.00, new InstrumentSpec(properties));
		
		properties.put("builder", Builder.FENDER);
		properties.put("model", "Stratocastor");
		properties.put("type", Type.ELECTRIC);
		properties.put("topWood", Wood.BASSWOOD);
		properties.put("backWood", Wood.ALDER);
		inventory.addInstrumen("V5050505", 9999.00, new InstrumentSpec(properties));
	}
}
