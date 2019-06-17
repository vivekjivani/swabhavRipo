package com.techlab.set.hashset.test;

import com.techlab.set.hashset.HashSetCurd;

public class HashSetCurdTest {
	public static void main(String args[]) {
		HashSetCurd hashSet = new HashSetCurd();
		hashSet.insertName(10);
		hashSet.insertName(0);
		hashSet.insertName(4);
		hashSet.insertName(5);
		hashSet.insertName(null);
		//hashSet.displayName();
		hashSet.delete(0);
		hashSet.displayName();
	}
}
