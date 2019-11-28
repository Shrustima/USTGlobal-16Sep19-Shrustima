package com.ustglobal.collectionsframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.add(12);
		v1.add(08.01);
		v1.add("shru");
		v1.add(true);
		v1.add(null);
		
		System.out.println("=======usig for loop========");
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
			
		}
		System.out.println("==========using foe each=======");
		for(Object obj : v1) {
			System.out.println(obj);
		}
		
		System.out.println("=======using iterator==");
		Iterator it = v1.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("==using list iterator forward===============");
		ListIterator lt = v1.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("=using iterator backward==== ");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}

	}
}
