package com.techlab.set;

import com.techlab.set.test.TreeSetCurd;

public class TreeSetCurdTest {
	public static void main(String args[]) {
		TreeSetCurd set = new TreeSetCurd();

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
