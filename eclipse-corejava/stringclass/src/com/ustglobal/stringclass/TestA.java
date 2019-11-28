package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		
		String s1 = "shrusti";
		String s2 = "Soumya";
		
		String s3 = new String("shrusti");
		String s4 = new String("shrusti");
		String s5 = "shrusti";
		
		System.out.println(s1==(s2));   //checks hash code equals to operator
		System.out.println(s3.equals(s4)); // so use equals method
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s2));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("SHrusti");
		System.out.println(b);
		System.out.println("========================");
		
		StringBuffer sb1 = new StringBuffer("kavya");
		sb1.append("xyz");
		System.out.println(sb1);
		
		System.out.println(s1.length());
	}

}
