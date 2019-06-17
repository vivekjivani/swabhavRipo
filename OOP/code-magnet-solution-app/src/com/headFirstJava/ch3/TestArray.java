package com.headFirstJava.ch3;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] isLands=new String[4];
		isLands[0]="Bermuda";
		isLands[1]="Fiji";
		isLands[2]="Azores";
		isLands[3]="Cozumel";
		
		int [] index= new int[4];
		index[0]=1;
		index[1]=3;
		index[2]=0;
		index[3]=2;
		
		int y=0;
		int ref;
		
		while(y<4)
		{
			System.out.print("isLands= ");
			ref=index[y];
			System.out.println(isLands[ref]);
			y++;
		}
	}

}
