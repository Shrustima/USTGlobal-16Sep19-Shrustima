package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		int a = 10;
		int b = 0;
		try {
			b = 10/0;                          // there is an exception so directly it goes to the catch block 
			System.out.println(b);
			System.out.println("Hello");      // these lines will not get executed
			System.out.println("Happy Deewali");
		}
		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}
		
		
		
		System.out.println("Main ended");
	}

}
