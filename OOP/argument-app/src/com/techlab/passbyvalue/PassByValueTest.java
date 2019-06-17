package com.techlab.passbyvalue;

public class PassByValueTest {

	 public static void main(String args[])
	 {
		 int mark=100;
		 String s="vivek";
		 PassByValueTest.changeMarksToZero(mark,s);
		 System.out.println(mark);
		 System.out.println(s);
		 int[] m= {10,20,30,40};
		 PassByValueTest.changeMarkarrToZero(m);
		 for (int i : m) {
			System.out.println(i);
		}
	 }
	 private static void changeMarksToZero(int marks,String s)
	 {
		 marks=0;
		 s="hi";
	 }
	 private static void changeMarkarrToZero(int [] m)
	 {
		 for(int i=0;i<m.length;i++)
		 {
			 m[i]=0;
		 }
	 }
}
