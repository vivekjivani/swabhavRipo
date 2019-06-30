package com.techlab.idirectory.component;

public class File implements IDirectoryComponent {
	private String name;
	private String extension;


	public File(String name, String extension) {
		this.name = name;
		this.extension = extension;
	}

	@Override
	public void display() {
		
	}

	public String getName() {
		return name+"."+extension;
	}

	@Override
	public void setLevel(String level) {
				
	}

	@Override
	public String getDetail() {
		return name + "." + extension;
	}

}
