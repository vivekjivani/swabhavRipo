package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangeTest {
	public static void main(String args[]) {
		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();

		smallRectangle.height=-10;
		smallRectangle.width=30;
		bigRectangle.height=50;
		bigRectangle.width=80;
		 
		System.out.println("Height and Width of Small rectangle is : " + smallRectangle.height + "x"+ smallRectangle.width);
		System.out.println("Area of Small Rectangle is : " + smallRectangle.calculateArea());
		System.out.println("Height and Width of Big rectangle is : " + bigRectangle.height + "x" + bigRectangle.width);
		System.out.println("Area of Small Rectangle is : " + bigRectangle.calculateArea());
	}
}
