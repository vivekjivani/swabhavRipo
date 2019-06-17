package com.headFirstJava.ch5;

public class DotGameTest {

	public static void main(String[] args) {
		
		DotGame d=new DotGame();
		int[] loc= {2,3,4};
		d.setLocation(loc);
		int userGuess=4;
		String result=d.checkYourSelf(userGuess);
	}

}
