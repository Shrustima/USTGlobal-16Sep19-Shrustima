package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<>();
		al.add(new Marker(50, "blue"));
		al.add(new Marker(70, "yellow"));
		al.add(new Marker(65, "white"));
		al.add(new Marker(55, "red"));
		
		System.out.println("before sorting======");
		display(al);
		
		SortByPrice sb = new SortByPrice();
//		Collections.sort(al, sb);
		
		SortByColor sc = new SortByColor();
		Collections.sort(al, sc);
		
		System.out.println("after sorting     ");
		display(al);
		
		
		
	}
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("price is "+m.price);
			System.out.println("color is "+m.color);
			System.out.println("============================");
		}
	}
}
