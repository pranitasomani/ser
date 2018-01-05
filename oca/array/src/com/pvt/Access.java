package com.pvt;

public class Access {
	
	 public void doDance()
	
	{
		makeNoise();
		System.out.println("hi");
	}
	
	protected void makeNoise() {
		
		System.out.println("hiii");
		System.out.println("f off");
		
	}
	public final void abc() {
		int x = 5;
		int y=10;
		int z = x+y;
		System.out.println("final sum = "+z);
	}

}
