package com.techlab.set;

import java.util.HashSet;

import java.util.Iterator;

public class HeshSetCurd {
	HashSet<String> set;

	public HeshSetCurd() {
		set = new HashSet<String>();
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
