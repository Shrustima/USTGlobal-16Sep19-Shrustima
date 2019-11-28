package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(28.09);
		al.add(true);
		al.add("shrusti");
		
		
		System.out.println("========using for loop========");
		for(Object o : al) {
			System.out.println(o);
		}
	}
}
