package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {

			HashSet hs = new HashSet();                     // has no index and does not preserve insertion order
			hs.add(12);
			hs.add(45);
			hs.add("shru");
			hs.add(55.5);
			hs.add(12);                                       //(duplicates not allowed) it will not print duplicate only once it will print
			hs.add(null);
			hs.add(null);
			
			
			System.out.println("========using for each==============");
			for(Object o : hs) {
				System.out.println(o);
			}
			
			System.out.println("==========using iterator===========");
			Iterator it = hs.iterator();
			while(it.hasNext()) {
				Object s = it.next();
				System.out.println(s);
			}
	}

}
