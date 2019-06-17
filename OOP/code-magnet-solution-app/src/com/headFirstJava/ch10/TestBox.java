package com.headFirstJava.ch10;

public class TestBox {
	int j;
	Integer i;
	
	public void go() {
		i=j;
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		TestBox t=new TestBox();
		t.go();
	}

}
