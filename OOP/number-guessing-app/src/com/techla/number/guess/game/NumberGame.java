package com.techla.number.guess.game;

public class NumberGame {
	int userGuess;
	InputGetter obj;
	
	public boolean checkUserGuess(int number,int Random_number) {
		if(number<Random_number) {
			System.out.println("Too Low");
			return false;
		}
		if(number>Random_number) {
			System.out.println("Too High");
			return false;
		}
		return true;	
	}
}
