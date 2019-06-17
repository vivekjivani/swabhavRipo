package com.techlab.ulr.separator;

public class UrlSeparator {
	
	private String company = "";
	private String developer = "";
	private String location = "";
	private String url = "";

	public void getUrlComponent() {
		String words[] = url.split("\\W");
	
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("www"))
				company = words[i + 1];
			
			if (words[i].equals("developer")) 
				developer = words[i + 1];
			
			if (words[i].equals("location")) 
					location = words[i+1];
		}
	}

	public void displayComponent() {
		System.out.println("Company name = " + company);
		System.out.println("Developer name = " + developer);
		System.out.println("Location = " + location);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
