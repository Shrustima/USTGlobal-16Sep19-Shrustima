package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestEmployee {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Shrusti", "Software developer");
		Employee e2 = new Employee(2, "Soumya", "Developer");
		Employee e3 = new Employee(3, "Rakshu", "Manager");
		 
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			System.out.println("Id is "+e.eid);
			System.out.println("Name is "+e.ename);
			System.out.println("Designation is "+e.designation);
		}
		System.out.println("===========for each========");
		for(Employee e : al) {
			System.out.println(e);
			
		}
		
		System.out.println("==using iterator=====");
		Iterator<Employee> it1 = al.iterator();
		while(it1.hasNext()) {
			Employee o = (Employee) it1.next();
			System.out.println(o);
		}
		
		ListIterator<Employee> li = al.listIterator();                                    //using linked list
		System.out.println("=========list iterator forward=========");
		while(li.hasNext()) {
			Employee ob = li.next();
			System.out.println(ob);
		}
		System.out.println("============list iterator backward==========");
		
		while(li.hasPrevious()) {
			Employee o = li.previous();
			System.out.println(o);
		}
		
		System.out.println("=using vector=======");
		Vector<Employee> v1 = new Vector<Employee>();                                       //using vector
		v1.add(e1);
		v1.add(e2);
		v1.add(e3);
		System.out.println("=======usig for loop========");
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
			
		}
		System.out.println("==========using foe each=======");
		for(Employee obj : v1) {
			System.out.println(obj);
		}
		
		System.out.println("=======using iterator==");
		Iterator<Employee> it = v1.iterator();
		while(it.hasNext()) {
			Employee o = it.next();
			System.out.println(o);
		}
		
		System.out.println("==using list iterator forward===============");
		ListIterator<Employee> lt = v1.listIterator();
		while(lt.hasNext()) {
			Employee o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("========using stack================");
		Stack<Employee> li1 = new Stack<Employee>();                                             //using stack
		li.add(e1);
		li.add(e2);
		li.add(e3);
		System.out.println("=======usig for loop========");
		for (int i = 0; i < li1.size(); i++) {
			System.out.println(li1.get(i));
			
		}
		System.out.println("==========using for each=======");
		for(Employee e11 : li1) {
			System.out.println(e11);
		}
		
		System.out.println("=======using iterator==");
		Iterator<Employee> it2 = li1.iterator();
		while(it2.hasNext()) {
			Employee o = it2.next();
			System.out.println(o);
		}
		
		
		System.out.println("==using list iterator forward===============");
		ListIterator<Employee> lt1 = li1.listIterator();
		while(lt1.hasNext()) {
			Employee o = lt1.next();
			System.out.println(o);
		}
		
		System.out.println("=using iterator backward==== ");
		while(lt1.hasPrevious()) {
			Employee o = lt1.previous();
			System.out.println(o);
		}
	}
}
