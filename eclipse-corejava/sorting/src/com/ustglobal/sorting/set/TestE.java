package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();                                //sorted , no duplicate, all should be of same type, no null
		ts.add(23);                           
		ts.add(34);
		ts.add(22);
		ts.add(22);
		ts.add(33);
		
//		ts.add("shru");       //class cast exception
//		ts.add(null);             // null pointer exception
		
		
		System.out.println("==========using for each===");
		for(Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("==========using iterator====");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}
}
