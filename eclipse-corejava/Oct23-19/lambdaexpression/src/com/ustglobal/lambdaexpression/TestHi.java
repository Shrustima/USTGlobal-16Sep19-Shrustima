package com.ustglobal.lambdaexpression;

public class TestHi {
	public static void main(String[] args) {
		
		SayHiInterface  sh    = ()->{
			System.out.println("Hi");
			return null;
		};
		String shh = sh.sayHi();
	}
}
