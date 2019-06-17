package com.techlab.set.linked.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetCurd {
	LinkedHashSet<String> names = new LinkedHashSet<String>();

	public void insertName(String name) {
		names.add(name);
	}
	
	public void delete(String name) {
		names.remove(name);
	}

	public void displayName() {
		for (String name : names) {
			System.out.println(name);
		}
	}
}
