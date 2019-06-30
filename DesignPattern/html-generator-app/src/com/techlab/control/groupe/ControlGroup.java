package com.techlab.control.groupe;

import java.util.ArrayList;

import com.techlab.control.Control;
import com.techlab.interfacehtmlElement.IHtmlElement;

public class ControlGroup implements IHtmlElement{
	private ArrayList<IHtmlElement> listOfTag;
	private String name;
	
	public ControlGroup(String name) {
		this.name = name;
		listOfTag = new ArrayList<IHtmlElement>();
	}
	
	public void addTag(Control element) {
		listOfTag.add(element);
	}
	
	
	@Override
	public String parseToHtml() {
		String htmlString = "<"+this.name+">\n";
		for(IHtmlElement tag : listOfTag) {
			htmlString += tag.parseToHtml()+"\n";			
		}
		return htmlString+"</"+this.name+">";
	}

}
