package com.techlab.test.elder;

import com.techlab.human.Human;

public class TestElder {
	public static void main(String args[]) {
		Human vivek = new Human("vivek", 21);
		Human darshan = new Human("darshan", 22);
		Human elder = vivek.whoIsElder(darshan);
		System.out.println("Elder is : " + elder.getName());
		System.out.println("vivek : " + vivek.hashCode());
		System.out.println("darshan : " + darshan.hashCode());
		System.out.println("elder : " + elder.hashCode());
	}
}
