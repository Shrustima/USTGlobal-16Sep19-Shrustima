package com.ustglobal.objectclass;

public class TestC {
	public static void main(String[] args) {
		
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println(h); //decimal value
		System.out.println(s); //hexadecimal value
		
		
		Marker p = new Marker();
		System.out.println(p);   //internally it calls toString method
		
	}

}
