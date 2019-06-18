package com.techlab.set.test;

import com.techlab.set.HeshSetCurd;

public class HeshSetCurdTest {
	public static void main(String args[]) {
		HeshSetCurd set = new HeshSetCurd();

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
