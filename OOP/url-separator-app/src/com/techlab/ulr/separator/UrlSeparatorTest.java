package com.techlab.ulr.separator;

public class UrlSeparatorTest {

	public static void main(String[] args) {
		UrlSeparator obj=new UrlSeparator();
		
		obj.setUrl(args[0]);
		obj.getUrlComponent();
		obj.displayComponent();
	}
}
