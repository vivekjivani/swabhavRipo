package com.techlab.even.odd;

public class Odd {
	
	int[] odd_numbers=new int[50];
	
	void generateOdd()
	{
		for(int i=1,x=0;i<100;i++)
		{
			if(i%2!=0)
			{
				odd_numbers[x]=i;
				x++;
			}
		}
	}
	
	void displayOdd()
	{
		System.out.println("\nOdds are..\n");
		for(int i=0;i<odd_numbers.length;i++)
		{
			System.out.print(odd_numbers[i]+" ");
		}
	}

}
