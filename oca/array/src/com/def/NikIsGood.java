package com.def;

public class NikIsGood {
	public static void main(String[] args) {
		AccessDefault obj = new AccessDefault();
		obj.test();
		//obj.makeNoise(); It is Wrong(Private Access)
	}

}
