package com.techlab.test.reference;

import com.techlab.rectangle.*;

public class TestReference {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setHeight(20);
		r1.setWidth(10);
		printInfo(r1);
		Rectangle r2 = r1;
		printInfo(r2);
		r2.setWidth(100);
		printInfo(r2);
		printInfo(r1);
		System.out.println("Area of Anonymous Objecct : " + new Rectangle().calculateArea());
		printInfo(new Rectangle());
	}

	static void printInfo(Rectangle rect) {
		System.out.println("Height : " + rect.getHeight());
		System.out.println("Width : " + rect.getWidth());
		System.out.println("Hash code : " + rect.hashCode());
	}
}
