package com.techlab.idirectory.component;

import java.util.ArrayList;

public class Folder implements IDirectoryComponent {
	private String name;
	private String level ="\t";
	private ArrayList<IDirectoryComponent> childrenList;
	private static boolean flag=true;

	public Folder(String name) {
		this.name = name;
		childrenList = new ArrayList<IDirectoryComponent>();
	}

	public String getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}

	public void addChildre(IDirectoryComponent children) {
		children.setLevel(this.getLevel()+"\t");
		childrenList.add(children);
	}

	@Override
	public void display() {
		if(flag) {
			System.out.println(this.getDetail());
			flag=false;
		}
		for(IDirectoryComponent children : childrenList) {
			System.out.println(level+children.getDetail());
			children.display();
		}
	}

	private boolean isFolder(IDirectoryComponent component) {
		if (component instanceof Folder) {
			return true;
		}
		return false;
	}

	private boolean isFile(IDirectoryComponent component) {
		if (component instanceof File) {
			return true;
		}
		return false;
	}

	@Override
	public String getDetail() {
		return "["+this.name+"]";
		
	}

}
