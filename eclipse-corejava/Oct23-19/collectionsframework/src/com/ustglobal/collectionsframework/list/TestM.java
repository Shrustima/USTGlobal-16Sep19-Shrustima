package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("shru");
		al.add("shra");
		al.add("soumya");
		al.add("diksha");
		
		System.out.println("Before sort=="+al);
		Collections.sort(al);
		System.out.println("After sort "+al);
		
	}
}
