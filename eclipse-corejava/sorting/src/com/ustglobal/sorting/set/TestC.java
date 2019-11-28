package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();                  //insertion order is preserved
		ls.add(35);
		ls.add(45.66);
		ls.add("shru");
		ls.add(35);
		ls.add("dikki");
		ls.add(null);                         //does not allow duplicate
		ls.add(null);
		
		System.out.println("=using for each =======");
		for(Object o : ls) {
			System.out.println(o);
		}
		
		System.out.println("=====using iterator=====");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
