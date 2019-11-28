package com.ustglobal.hasarelation.weak;

public class TestB {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.name);
		c.move();
		c.stop();
		System.out.println("====================");
		c.m1.play();      // HasA relation
	}

}
