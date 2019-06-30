package com.techlab.test;

import com.techlab.idirectory.component.File;
import com.techlab.idirectory.component.Folder;

public class FolderTest {
	public static void main(String args[]) {
		Folder movie = new Folder("Movie");
		
		Folder hindi = new Folder("Hindi");
		
		Folder horror = new Folder("Horror");
		
		Folder english = new Folder("English");
		
		
		movie.addChildre(new File("abc","avi"));
		movie.addChildre(new File("pqr","avi"));
		hindi.addChildre(new File("DDLJ","avi"));
		hindi.addChildre(new File("SOTY","avi"));
		horror.addChildre(new File("Hunted","avi"));
		english.addChildre(new File("Marvel","avi"));
		english.addChildre(new File("Twilight","avi"));
		
		movie.addChildre(hindi);	
		hindi.addChildre(horror);	
		movie.addChildre(english);
		
		movie.addChildre(new File("xyz","avi"));
		
		movie.display();
	}
}
