package com.techlab.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCurd {
	LinkedHashSet<String> set;

	public LinkedHashSetCurd() {
		set = new LinkedHashSet<String>();
	}

	public void insert(String s) {
		set.add(s);
	}

	public void delete(String s) {
		set.remove(s);
	}

	public boolean update(String oldValue, String newValue) {
		for (String s : set) {
			if (s.equals(oldValue)) {
				set.remove(oldValue);
				set.add(newValue);
				return true;
			}
		}
		return false;
	}

	public void display() {
		Iterator<String> i = set.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
