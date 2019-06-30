package com.tecchlab.test;

import com.techlab.control.Control;
import com.techlab.control.groupe.ControlGroup;

public class Test {
	public static void main(String args[]) {
		
		Control inputControl1 = new Control("UserName","input","text");
		
		Control inputControl2 = new Control("Password","input","password");
		
		ControlGroup div = new ControlGroup("div");
		
		ControlGroup section = new ControlGroup("section");
	
		section.addTag(inputControl1);
		section.addTag(inputControl2);
		
		System.out.println(section.parseToHtml());
	}
}
