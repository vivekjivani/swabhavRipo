package com.techlab.number.geassing.game;

import java.util.Scanner;

public class Game {
	
	int numberOfHit;
	String playerName;
	int gussedNumber;
	String status="fail";
	static int aim;
	static{
		aim=(int)(Math.random()*100);
		System.out.println("aim is : "+aim);
	}
	
	public Game(){
	}

	public Game(String name) {
		playerName=name;
	}
	public void getUserInput(){
		Scanner input=new Scanner(System.in);
		System.out.print("guess a number: ");
		gussedNumber=input.nextInt();
		numberOfHit++;
	}
	
	public void checkUserInput() {
		if(gussedNumber==aim)
			this.displayMessage(0);
		if(gussedNumber<aim)
			this.displayMessage(1);
		if(gussedNumber>aim)
			this.displayMessage(2);
		
	}
	
	public void displayMessage(int code) {
		if(code==0) {
			System.out.println("matched!! you win.....");
			this.changeState();
		}
		if(code==1)
			System.out.println("Not yet, it is too smaller then aim");
		if(code==2)
			System.out.println("Not yet, it is too higher then aim");
	}
	
	public void changeState() {
		this.status="win";
	}
	
	public void displayHits() {
		System.out.println(this.playerName+"'s number of hits is : "+this.numberOfHit);
		
	}
}
