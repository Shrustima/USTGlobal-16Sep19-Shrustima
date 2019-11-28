package com.ustglobal.collectionsframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		
		Stack li = new Stack();
		li.add(12);
		li.add(08.01);
		li.add("shru");
		li.add(true);
		li.add(null);
		
		System.out.println("=======usig for loop========");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		System.out.println("==========using foe each=======");
		for(Object obj : li) {
			System.out.println(obj);
		}
		
		System.out.println("=======using iterator==");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("==using list iterator forward===============");
		ListIterator lt = li.listIterator();
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
