package com.techlab.args;

public class ArgumentTest {

	public static void main(String[] args) {
	
		if(args.length==0)
		{
			System.out.println("No Argument Found..");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.println("Hello "+args[i]);
			}
			 for (String string : args) { System.out.println("Hello "+string); }
			
		}
	}

}
