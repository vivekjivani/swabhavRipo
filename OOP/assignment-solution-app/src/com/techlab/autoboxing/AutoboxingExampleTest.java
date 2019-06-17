package com.techlab.autoboxing;

import java.util.ArrayList;

public class AutoboxingExampleTest {
	public static void main(String args[]) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		// Boxing...
		int primitive=20;
		arraylist.add(primitive);
		// Unboxing...
		primitive=arraylist.get(0);
		System.out.println("arraylist[0] : " + primitive);
	}
}
