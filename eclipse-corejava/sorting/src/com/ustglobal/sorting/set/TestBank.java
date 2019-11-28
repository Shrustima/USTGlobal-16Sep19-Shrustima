package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicr sm = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);

		Bank b1 = new Bank("ICICI", 568744, 987654);
		Bank b2 = new Bank("HDFC", 345674, 456784);
		Bank b3 = new Bank("RBI", 1234567, 98765443);
		Bank b4 = new Bank("CANARA", 876543, 7654365);
		//Bank b5 = new Bank("CANARA", 876543, 7654365);

		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		//ts.add(b5);
		
		System.out.println("=====using iterator======");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Pincode is "+e.pincode);
			System.out.println("Micr is "+e.micr);
			System.out.println("==============================");
			
		}
		
		
		
	}
}
