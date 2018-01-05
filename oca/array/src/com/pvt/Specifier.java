package com.pvt;

public class Specifier extends Access
{
	public static void main(String[] args) {
		//doDance();
		Specifier s = new Specifier();
		s.doDance();
		s.doSing();
		s.doGym();
	}
	 void doSing()
	{
		int x;
		//doDance(); or
		this.doDance();
	}
	
	public void doGym()
	{
		System.out.println("in do gym");
		//doDance();
	}
	
}
