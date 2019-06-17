package com.techlab.even.odd;

public class Even {
	
	int[] even_numbers=new int[50];
	
	void generateEven()
	{
		for(int i=0,x=0;i<100;i++)
		{
			if(i%2==0)
			{
				even_numbers[x]=i;
				x++;
			}
		}
	}
	
	void displayEven()
	{
		System.out.println("Even numbers are...\n");
		for(int i=0;i<even_numbers.length;i++)
		{
			System.out.print(even_numbers[i]+" ");
		}
	}

}
