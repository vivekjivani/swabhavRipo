package com.techlab.humn.test;

import com.techlab.human.Human;

public class HumanCounterTest {
	public static void main(String args[]) {
		Human vivek=new Human("vivek",20);
		System.out.println("vivek counter : "+Human.headCount());
		Human darshan=new Human("darshan",10);
		System.out.println("darshan counter : "+Human.headCount());
		System.out.println("vivek counter : "+Human.headCount());
	}
}
