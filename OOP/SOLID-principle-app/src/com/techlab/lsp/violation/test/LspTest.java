package com.techlab.lsp.violation.test;

import com.tecchlab.lsp.violation.Rectangle;
import com.tecchlab.lsp.violation.Squar;

public class LspTest {
	public static void main(String args[]) {
		shouldNotChangeHeightIfWidthIsChanged(new Rectangle(50, 100));
		shouldNotChangeHeightIfWidthIsChanged(new Squar(50));
	}

	private static void shouldNotChangeHeightIfWidthIsChanged(Rectangle r) {
		int beforeChange = r.getHeight();
		r.setWidth(r.getWidth() + 5);
		int afterChange = r.getHeight();
		System.out.println("befor height : " + beforeChange);
		System.out.println("after height : " + afterChange);
		System.out.println(beforeChange == afterChange);
	}
}
