package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangeTest {
	public static void main(String args[]) {
		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();

		smallRectangle.setHeight(10);
		smallRectangle.setWidth(30);
		smallRectangle.setColor("blue");
		bigRectangle.setHeight(111);
		bigRectangle.setWidth(-100);
		bigRectangle.setColor("green");

		System.out.println("Height and Width of Small rectangle is : " + smallRectangle.getHeight() + "x"+ smallRectangle.getWidth());
		System.out.println("Area of Small Rectangle is : " + smallRectangle.calculateArea());
		System.out.println("Height and Width of Big rectangle is : " + bigRectangle.getHeight() + "x" + bigRectangle.getWidth());
		System.out.println("Area of Small Rectangle is : " + bigRectangle.calculateArea());
		System.out.println("Color of Small Rectangle is : "+smallRectangle.getColor());
		System.out.println("Color of Big Rectangle is : "+bigRectangle.getColor());
	}
}
