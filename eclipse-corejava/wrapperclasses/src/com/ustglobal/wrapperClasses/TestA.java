package com.ustglobal.wrapperClasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(" a is "+a);
		Integer i = a; // Boxing or Auto boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;         // unboxing or autounboxing
		System.out.println(" y is "+y);
		
		int value = Integer.parseInt("123");   
		System.out.println("value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is "+result);
		
		int value1 = Integer.parseInt("1sd3");    // NumberFormatException
		System.out.println("value1 is "+value1);
		
		boolean result1 = Boolean.parseBoolean("123true");
		System.out.println("Result1 is "+result1);
	}
}
