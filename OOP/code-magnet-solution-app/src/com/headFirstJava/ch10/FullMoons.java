package com.headFirstJava.ch10;

import java.util.*;
import static java.lang.System.out;

public class FullMoons {

	static int DAY_IM=100*60*60*24;
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2004,0,7,15,40);
		out.println(String.format("full moon night %t",c));
	}
}
