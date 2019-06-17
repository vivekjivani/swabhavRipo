package com.techlab.constructor.case2;

public class Child extends Parent{
	public Child() {
		super(500);
		System.out.println("Child constructor...");
	}
	public Child(int foo) {
		super(foo);
	}
}
