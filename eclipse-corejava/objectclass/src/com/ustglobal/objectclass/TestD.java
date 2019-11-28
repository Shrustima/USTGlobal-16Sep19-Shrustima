package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		
		Student s = new Student(10, "shr",70.00);
		int code = s.hashCode();
		System.out.println(code);
		System.out.println(s);
	}
}
