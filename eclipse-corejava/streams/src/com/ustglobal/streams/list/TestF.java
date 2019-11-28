package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(23);
		al.add(55);
		al.add(62);
		al.add(2);
		al.add(4);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = al.iterator();
		System.out.println("sorted======");
		while(it.hasNext()) {
			
			Integer i = it.next();
			System.out.println(i);
		}
		
	}
}
