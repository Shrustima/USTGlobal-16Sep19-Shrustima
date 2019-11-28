package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("soumya");
		
		Object o = al.get(0);
		String name = (String)o;    //down casting
		
		name = name.toUpperCase();         //this method is not present in object class so down cast
		System.out.println(name);
	}
}
