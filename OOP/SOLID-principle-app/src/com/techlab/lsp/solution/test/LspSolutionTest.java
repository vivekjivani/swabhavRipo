package com.techlab.lsp.solution.test;

import com.techlab.lsp.solution.Rectangle;
import com.techlab.lsp.solution.Square;

public class LspSolutionTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(50, 100);
		System.out.println(r1.calculateArea());
		Square s1 = new Square(40);
		System.out.println(s1.calculateArea());
	}
}
