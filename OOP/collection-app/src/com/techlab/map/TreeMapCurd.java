package com.techlab.map;

import java.util.TreeMap;

public class TreeMapCurd {
	private TreeMap<String, Integer>  tmap;
	
	public TreeMapCurd() {
		tmap = new TreeMap<String, Integer>();
	}
	
	public void insert(String key, Integer value) {
		tmap.put(key, value);
	}

	public void update(String key, Integer value) {
		tmap.replace(key, value);
	}

	public void delete(String key) {
		if (tmap.containsKey(key))
			tmap.remove(key);
	}

	public TreeMap<String, Integer> display() {
		return tmap;
	}
}
