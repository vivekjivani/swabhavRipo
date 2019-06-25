package com.techlab.lsp.solution;

public class Rectangle implements Shape {
	private int height;
	private int width;

	@Override
	public int calculateArea() {
		return height * width;
	}

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

}
