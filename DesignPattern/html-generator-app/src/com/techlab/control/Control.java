package com.techlab.control;

import com.techlab.interfacehtmlElement.IHtmlElement;

public class Control implements IHtmlElement {
	private String text;
	private String name;
	private String type;
	
	public Control(String name) {
		this.name = name;
	}
	
	public Control(String text,String name, String type) {
		this.text = text;
		this.name = name;
		this.type = type;
	}

	@Override
	public String parseToHtml() {
		return text+": <input Type="+type+"/>";
	}
}
