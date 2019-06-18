package com.techlab.map.test;

import com.techlab.map.LinkedHashMapCurd;

public class LinkedHashMapCurdTest {

	public static void main(String args[]) {
		LinkedHashMapCurd linkedMap = new LinkedHashMapCurd();
		
		linkedMap.insert("vivek", 21);
		linkedMap.insert("darshan", 20);
		linkedMap.insert("hiren", 22);
		linkedMap.insert("chirag", 21);
		linkedMap.insert("chirag", 20);
		
		System.out.println(linkedMap.display());
		System.out.println("-------------");
		
		linkedMap.delete("chirag");
		
		System.out.println(linkedMap.display());
		System.out.println("-------------");
		
		linkedMap.update("hiren", 21);
		System.out.println(linkedMap.display());
		System.out.println("-------------");
		
	}

}
