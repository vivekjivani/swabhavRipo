package com.techlab.set.hashset;

import java.util.HashSet;

public class HashSetCurd {
	private HashSet<Integer> nameSet = new HashSet<Integer>();
	
	public void insertName(Integer name) {
		nameSet.add(name);
	}
	
	public void delete(Integer name) {
		nameSet.remove(name);
	}
		
	public void displayName() {
		for(Integer name : nameSet) {
			System.out.println(name);
		}
	}
			
}
