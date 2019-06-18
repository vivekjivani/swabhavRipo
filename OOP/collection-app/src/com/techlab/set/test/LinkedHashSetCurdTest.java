package com.techlab.set.test;

import com.techlab.set.LinkedHashSetCurd;

public class LinkedHashSetCurdTest {
	public static void main(String args[]) {
		LinkedHashSetCurd set = new LinkedHashSetCurd();

		set.insert("vivek");
		set.insert("darshan");
		set.insert("hiren");
		set.insert("chirag");
		set.display();
		System.out.println("-------------");
		set.delete("vivek");
		set.display();
		System.out.println("-------------");
		set.update("chirag", "vivek");
		set.display();
		System.out.println("-------------");
	}
}
