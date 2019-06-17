package com.techlab.constructor.case2;

public class Parent {
	private int foo;
	public Parent(int foo) {
		this.foo=foo;
		System.out.println("parent construstor..");
	}
	public int getFoo() {
		return foo;
	}
}
