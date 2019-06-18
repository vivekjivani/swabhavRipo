package com.techlab.map.test;

import com.techlab.map.TreeMapCurd;

public class TreeMapCurdTest {

	public static void main(String args[]) {
		TreeMapCurd tmap = new TreeMapCurd();
		
		tmap.insert("vivek", 21);
		tmap.insert("darshan", 20);
		tmap.insert("hiren", 22);
		tmap.insert("chirag", 21);
		tmap.insert("chirag", 20);
		
		System.out.println(tmap.display());
		System.out.println("-------------");
		
		tmap.delete("chirag");
		
		System.out.println(tmap.display());
		System.out.println("-------------");
		
		tmap.update("hiren", 21);
		System.out.println(tmap.display());
		System.out.println("-------------");
	}
}
