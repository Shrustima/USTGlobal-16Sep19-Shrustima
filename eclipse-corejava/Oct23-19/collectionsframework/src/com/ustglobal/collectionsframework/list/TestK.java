package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(35.55);
		al.add(24.6);
		al.add(9.66);
		al.add(13.44);
		al.add(35.55);          //allows duplicate
		al.add(null);             // allows null
		al.add(null);
		
		System.out.println(al);
		al.add(2, 56.5);
		System.out.println("After add in second index"+al);
		al.remove(0);
		System.out.println("Afer removing 0th index"+al);
		al.remove(null);
		System.out.println("After removing null"+al);
		Double val = al.get(4);
		System.out.println("Object at 4th index"+val);
		al.set(2, 13.44);
		System.out.println("After replacing 2nd index"+al);
		al.clear();
		System.out.println("After clear method"+al);
		al.contains(24.6);
		
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.33);
		al1.add(23.44);
		al1.add(34.55);
		
		al.addAll(al1);
		System.out.println("After add all "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("contains all "+contain);
		
		System.out.println("Before remove "+al);
		boolean res = al.removeAll(al1);
		System.out.println("Removed all of al1 "+res);
		System.out.println("After remove "+al);
		
		
	}

}
