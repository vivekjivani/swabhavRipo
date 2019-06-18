package com.techlab.map.test;

import com.techlab.map.HashMapCurd;

public class HashMapCurdTest {
	public static void main(String args[]) {
		HashMapCurd map = new HashMapCurd();
		
		map.insert("vivek", 80);
		map.insert("darshan", 90);
		map.insert("hiren", 85);
		//map.insert("hiren", 90);
		System.out.println(map.display());
		System.out.println("--------------");
		map.update("vivek", 90);
		map.delete("hiren");
		System.out.println(map.display());
		System.out.println("--------------");
	}
}
