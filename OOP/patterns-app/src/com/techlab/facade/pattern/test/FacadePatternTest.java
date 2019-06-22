package com.techlab.facade.pattern.test;

import com.techlab.facade.pattern.ShapeMaker;

public class FacadePatternTest {
	public static void main(String args[]) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
