package com.tea;

public class TestTea extends Tea {
	public void goFast(){
		int i=3+2+4;
		System.out.println(i);
	}

	@Override
	public void impressNeighbors() {
		// TODO Auto-generated method stub
		System.out.println("ass");
	}
	
	public static void main(String[] args) {
		Tea t = new TestTea();
		t.goFast(5,2);
	}

}
