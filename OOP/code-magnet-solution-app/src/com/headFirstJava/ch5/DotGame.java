package com.headFirstJava.ch5;

public class DotGame {
	
	int[] location=new int[3];
	int numberOfHit=0;
	
	String checkYourSelf(int userGuess)
	{
		String result="miss";
		for (int i : location) {
			if(userGuess==i)
			{
				result="hit";
				numberOfHit++;
				break;
			}
		}
		if(numberOfHit==3)
		{
			result="kill";
		}
		System.out.println(result);
		return result;
	}
		
	void setLocation(int[] loc)
	{
		this.location=loc;
	}
	
}
