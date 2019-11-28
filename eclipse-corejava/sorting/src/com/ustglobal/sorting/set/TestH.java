package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
		
	
	TreeSet<Employee> hs = new TreeSet<>();                         // sorts class only which are comparable
	Employee e1 = new Employee(12, "sweety", 45000);                  // so implements comparable
	                                                            //and give implementation to compare to method
	Employee e2 = new Employee(13, "qweety", 25000);
	Employee e3 = new Employee(14, "reety", 35000);
	Employee e4 = new Employee(15, "meety", 55000);           
	Employee e5 = new Employee(15, "meety", 55000);
	
	
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	
	System.out.println("=====using iterator=========");
	
	Iterator<Employee> it = hs.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println("Id is "+e.id);
		System.out.println("name is "+e.name);
		System.out.println("salary is "+e.salary);
		System.out.println("==============================");
		
	}
	}
}
