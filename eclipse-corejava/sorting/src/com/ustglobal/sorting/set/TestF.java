package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("shru");
		ts.add("shraa");
		ts.add("dikki");
		ts.add("soumya");
		
		System.out.println("==========using for each===");
		for(String o : ts) {
			System.out.println(o);
		}
		
		System.out.println("==========using iterator====");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}
		
	}
}
