package com.techla.number.guess.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputGetter {
	
	public int getInput() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number:");
		String input=br.readLine();
		int number=Integer.parseInt(input);
		return number;
	}

}
