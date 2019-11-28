package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList  al = new ArrayList();
		al.add(12);
		al.add(22.03);
		al.add("shru");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("=========forward");
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		System.out.println("backward==========");
		
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}
}
