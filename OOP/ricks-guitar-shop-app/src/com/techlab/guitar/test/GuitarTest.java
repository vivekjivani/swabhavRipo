package com.techlab.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.tecchlab.guitar.inventory.Inventory;
import com.tecchlab.guitar.spec.GuitarSpec;
import com.techlab.guitar.Guitar;
import com.techlab.guitar.eums.Builder;
import com.techlab.guitar.eums.Type;
import com.techlab.guitar.eums.Wood;

public class GuitarTest {
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatVivekLike = new GuitarSpec(Builder.GIBSON, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		List matchingGuiters = inventory.search(whatVivekLike);

		if (!matchingGuiters.isEmpty()) {
			System.out.println("Vivek, you might like this Guitars..");
			for (Iterator i = matchingGuiters.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec guitarSpec = guitar.getSpec();
				System.out.println(
						"We have " + guitarSpec.getBuilder() + " " + guitarSpec.getType() + " Guitar :\n Top Wood : "
								+ guitarSpec.getTopWood() + ", Back Wood : " + guitarSpec.getBackWood()+"\n Price : "+guitar.getPrice());
			}
		} else {
			System.out.println("Sorry.. we have nothing for you..");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("A562492", 20000.00, Builder.GIBSON, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("B165288", 14000.00, Builder.FENDER, Type.ARCHTOP, Wood.MAHOGANY, Wood.MAHOGANY);
		inventory.addGuitar("P176279", 15999.00, Builder.GIBSON, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
	}
}
