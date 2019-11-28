package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet();
		ls.add(23.33);
		ls.add(34.44);
		ls.add(12.33);
		ls.add(77.66);
		ls.add(45.32);
		
		System.out.println("==========using for each===");
		for(Double o : ls) {
			System.out.println(o);
		}
		
		System.out.println("==========using iterator====");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Double p =it.next();
			System.out.println(p);
		}
	}
}
