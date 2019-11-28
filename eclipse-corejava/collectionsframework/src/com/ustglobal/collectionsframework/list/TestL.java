package com.ustglobal.collectionsframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(23);
		l.add(54);
		l.add(44);
		l.add(80);
		
		System.out.println("Bofore sort "+l);
		Collections.sort(l);                                 //always pass generic type and we cannot pass null
		System.out.println("After sort "+l);                  //if we pass non generic type we get class cast exception
		
		
		Collections.reverse(l);
		System.out.println("After reverse "+l);
		
		Collections.shuffle(l);
		System.out.println("After shuffle "+l);

	}
}
