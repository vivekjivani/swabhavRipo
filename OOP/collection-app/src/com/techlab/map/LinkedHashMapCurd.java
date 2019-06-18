package com.techlab.map;

import java.util.LinkedHashMap;

public class LinkedHashMapCurd {
	private LinkedHashMap<String, Integer> linkedMap;

	public LinkedHashMapCurd() {
		linkedMap = new LinkedHashMap<String, Integer>();
	}

	public void insert(String key, Integer value) {
		linkedMap.put(key, value);
	}

	public void update(String key, Integer value) {
		linkedMap.replace(key, value);
	}

	public void delete(String key) {
		if (linkedMap.containsKey(key))
			linkedMap.remove(key);
	}

	public LinkedHashMap<String, Integer> display() {
		return linkedMap;
	}
}
