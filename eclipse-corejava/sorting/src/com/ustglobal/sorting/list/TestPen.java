package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen {
	public static void main(String[] args) {
		
		ArrayList<Pen> al = new ArrayList<>();
		
		Pen p1 = new Pen(25, "cello");
		Pen p2 = new Pen(40, "Bright");
		Pen p3 = new Pen(35, "Pin point");
		Pen p4 = new Pen(45, "Doms");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("before sorting=====================");
		displayPenDetails(al);
		Collections.sort(al);
		System.out.println("after sorting ================");
		displayPenDetails(al);

	}
		
		static void displayPenDetails(ArrayList<Pen> al) {
			Iterator<Pen> it = al.iterator();
			while(it.hasNext()) {
				Pen s = it.next();
				System.out.println("Id is "+s.price);
				System.out.println("Name is "+s.brand);
				System.out.println("===================");
			}
				
			
	}
}

