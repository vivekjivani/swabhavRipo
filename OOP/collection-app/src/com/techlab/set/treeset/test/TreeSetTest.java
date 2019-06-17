package com.techlab.set.treeset.test;

import com.techlab.set.treeset.TreeSetCurd;

public class TreeSetTest {
	public static void main(String args[]) {
		TreeSetCurd treeSet = new TreeSetCurd();
		treeSet.insertName("vivek");
		treeSet.insertName("darshan");
		treeSet.insertName("hiren");
		treeSet.insertName("darshan");
		//treeSet.insertName(null);
		//hashSet.displayName();
		treeSet.delete("vivek");
		treeSet.displayName();
	}
}
