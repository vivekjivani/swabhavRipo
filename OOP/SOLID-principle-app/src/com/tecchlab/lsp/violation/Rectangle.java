package com.tecchlab.lsp.violation;

public class Rectangle {
	protected int width;
	protected int height;

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double calculateArea() {
		return height * width;
	}
}
