package com.techlab.xmlgenerator;

public class XmlGenerator {
	private String startString = "";
	private String endString = "";
	private String XmlString="";
	private String level = "";
	
	public void generateXml(String tagName, String level) {
		//XmlString = generateStartTag(tagName,level)+generateEndTag(tagName,level);
		
		
	}
	public String generateStartTag(String tagName, String level) {
		return XmlString += level+"<"+tagName+">\n";
	}
	
	public String generateEndTag(String tagName, String level) {
		return XmlString += "\n"+level+"</"+tagName+">"+"\n";
	}
	
	public String getXML() {
		return XmlString;
	}
}
