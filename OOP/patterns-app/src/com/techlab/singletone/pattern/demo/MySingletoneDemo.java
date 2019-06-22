package com.techlab.singletone.pattern.demo;

import com.techlab.singletone.pattern.MySingletone;

public class MySingletoneDemo {
	public static void main(String args[]) {
		MySingletone instance1 = MySingletone.getInstance();
		instance1.display();
	}
}
