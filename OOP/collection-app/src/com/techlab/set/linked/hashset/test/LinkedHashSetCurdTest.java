package com.techlab.set.linked.hashset.test;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import com.techlab.set.linked.hashset.LinkedHashSetCurd;

public class LinkedHashSetCurdTest {
	public static void main(String args[]) {
		LinkedHashSetCurd linkedHashSet = new LinkedHashSetCurd();
		
		linkedHashSet.insertName("vivek");
		linkedHashSet.insertName("darshan");
		linkedHashSet.insertName("hiren");
		linkedHashSet.insertName("darshan");
		linkedHashSet.insertName(null);
		//hashSet.displayName();
		linkedHashSet.delete("vivek");
		linkedHashSet.displayName();
	}
}
