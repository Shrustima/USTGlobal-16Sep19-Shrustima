package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(12, "shru", 30000);
		Employee e2 = new Employee(13, "shraa", 30000);
		Employee e3 = new Employee(14, "diki", 30000);
		Employee e4 = new Employee(15, "soumi", 30000);
		Employee e5 = new Employee(16, "niki", 30000);
		Employee e6 = new Employee(17, "arshu", 30000);
		Employee e7 = new Employee(18, "ranveer", 30000);
		Employee e8 = new Employee(19, "rohan", 30000);
		Employee e9 = new Employee(20, "prati", 30000);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
//		
//		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
//		hm.put("first", al);
//		hm.put("second", al1);
//		hm.put("third", al2);
//		
//		ArrayList<Employee> first = hm.get("second");
//		Iterator<Employee> it = first.iterator();
//		while(it.hasNext()) {
//			Employee e = it.next();
//			System.out.println("Id is "+e.id);
//			System.out.println("Name is "+e.name);
//			System.out.println("Salary is "+e.salary);
//			System.out.println("===================================");
//			
//		}	
		
		
		
		HashMap<Integer, ArrayList<Employee>> hm = new HashMap<>();
		hm.put(1, al);
		hm.put(2, al1);
		hm.put(3, al2);
		
		ArrayList<Employee> first = hm.get(3);
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("===================================");
			
		}	
	}
}
