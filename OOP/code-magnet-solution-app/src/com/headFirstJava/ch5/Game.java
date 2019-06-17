package com.headFirstJava.ch5;

import java.util.Random;

public class Game {

	public static void main(String[] args) {
		
		int numberOfGuess=0;
		DotGame d=new DotGame();
		Random r=new Random();
		int num=r.nextInt(4)+1;
		int[] loc= {num,num+1,num+2};
		d.setLocation(loc);
		

	}

}
