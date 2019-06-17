package com.techlab.human.serialization;

import com.techlab.human.Human;;
public class HumanSerializationTest {

	public static void main(String[] args) {
		HumanSerialization sirialize=new HumanSerialization();
		Human vivek=new Human("vivek",21);
		sirialize.setFileName("E:\\HumanObject.dat");
		sirialize.serializeHuman(vivek);
		sirialize.deserializeHuman();
	}

}
