package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer {
	public static void main(String[] args) {
		
		SortByCustName scn = new SortByCustName();
		TreeSet<Customer> ts = new TreeSet<Customer>(scn);
		Customer c1 = new Customer("shru", 13, 6000.00);
		Customer c2 = new Customer("shraa", 14, 7000.00);
		Customer c3 = new Customer("diki", 12, 82000.00);
		Customer c4 = new Customer("soumya", 16, 9000.00);
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		
		System.out.println("=====using iterator======");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Pincode is "+e.id);
			System.out.println("Micr is "+e.salary);
			System.out.println("==============================");
			
		}

		

	}
}
