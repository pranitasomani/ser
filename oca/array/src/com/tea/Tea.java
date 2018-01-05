package com.tea;

public abstract class Tea {
	
	//Tea t = new Tea();
	

	public /*abstract*/ void goFast(int ... x){
		int i=x[0]+x[1]+2;
		System.out.println(i);
	}
	public abstract void impressNeighbors();
}
