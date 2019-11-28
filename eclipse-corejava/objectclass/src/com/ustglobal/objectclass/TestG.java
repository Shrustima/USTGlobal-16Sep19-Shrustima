package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		
Employee e1 = new  Employee(1, "shru", 10000);
		
Employee  e2 = new  Employee(2, "shra", 20000);
		
Employee e3 = new  Employee(3, "pra", 30000);
		
Employee e4=e3;
		
		
		boolean isEqual = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(isEqual);
	}

}
