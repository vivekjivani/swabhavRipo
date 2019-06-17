package com.techla.number.guess.game;

import java.io.IOException;

public class GameStarter {

	public static void main(String[] args) throws IOException {
		
		int Random_number= (int)(Math.random()*100);
		System.out.println("number generated is: "+Random_number);
		int numberOfHit=0;
		boolean result=false;
		
		NumberGame starter=new NumberGame();
		InputGetter obj=new InputGetter();
		
		while(result!=true) {
			int userGuess=obj.getInput();
			result=starter.checkUserGuess(userGuess,Random_number);
			numberOfHit++;
		}
		System.out.println("you got it!!");
		System.out.println("Number of hit is: "+numberOfHit);
	}

}
