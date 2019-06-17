package com.techlab.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	final static int MINIMUM_VALUE = 1;
	final static int MAXIMUM_VALUE = 100;
	final static String DEFAULT_COLOR="Red";

	public int calculateArea() {
		return width * height;
	}

	public void setWidth(int width) {
		this.width = validateValue(width);
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = validateValue(height);
	}

	public int getHeight() {
		return this.height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = validateColor(color);
	}

	private int validateValue(int value) {
		if (value < MINIMUM_VALUE)
			value = MINIMUM_VALUE;
		if (value > MAXIMUM_VALUE)
			value = MAXIMUM_VALUE;
		return value;
	}

	private String validateColor(String color) {
		
		if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("green")) {
			return color;
		}
		return DEFAULT_COLOR;
	}
}
