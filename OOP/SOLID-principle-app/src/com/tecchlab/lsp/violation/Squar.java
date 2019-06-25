package com.tecchlab.lsp.violation;

public class Squar extends Rectangle {

	public Squar(int side) {
		super(side, side);
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}

	@Override
	public void setWidth(int width) {
		this.height = width;
		this.width = width;
	}
}
