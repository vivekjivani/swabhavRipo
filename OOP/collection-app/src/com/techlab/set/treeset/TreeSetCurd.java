package com.techlab.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCurd {
	TreeSet treeSet=new TreeSet();
	
	public void insertName(String name) {
		treeSet.add(name);
	}
	
	public void delete(String name) {
		treeSet.remove(name);
	}
	
	public void displayName() {
		Iterator iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
	}
}
