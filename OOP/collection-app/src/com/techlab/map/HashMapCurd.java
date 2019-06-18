package com.techlab.map;

import java.util.HashMap;

public class HashMapCurd {
	private HashMap<String, Integer> map;
	
	public HashMapCurd() {
		map = new HashMap();
	}
	
	public void insert(String key,Integer value) {
		map.put(key, value);
	}
	
	public void update(String key, Integer value) {
		map.replace(key, value);
	}
	
	public void delete(String key) {
		if(map.containsKey(key))
			map.remove(key);
	}
	
	public HashMap<String, Integer>  display() {
		return map;
	}
}
