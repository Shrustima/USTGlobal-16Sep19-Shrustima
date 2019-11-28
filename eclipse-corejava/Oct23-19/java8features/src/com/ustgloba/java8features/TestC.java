package com.ustgloba.java8features;


import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		int res = f.apply(12);
		System.out.println("Square of 12 is  "+res);
		
		int res1 = f.apply(4);
		System.out.println("Square of 4 is  "+res1);

	}
}
