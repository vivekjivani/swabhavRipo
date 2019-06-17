package com.headFirstJava.ch2;

public class DrumkitTestDrive {

	public static void main(String[] args) {
		
		Drumkit d=new Drumkit();
		
		d.playSnare();
		d.snare=false;
		if(d.snare==true)
		{
			d.playSnare();
		}
		d.playTopHat();
	}

}
