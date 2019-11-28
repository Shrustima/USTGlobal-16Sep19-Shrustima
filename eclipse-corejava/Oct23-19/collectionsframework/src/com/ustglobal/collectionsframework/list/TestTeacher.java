package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestTeacher {
	public static void main(String[] args) {
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();                                 //using array list
		Teacher t1 = new Teacher(12, "Jaishree", "Science");
		Teacher t2 = new Teacher(13, "Chaya", "Kannada");
		Teacher t3 = new Teacher(14, "Mahdevi", "Social");
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		
		System.out.println("=========using for loop=========");
		for (int i = 0; i < al.size(); i++) {
			Teacher t = al.get(i);
			System.out.println("Id is "+t.id);
			System.out.println("Name is "+t.name);
			System.out.println("Subject is "+t.subject);
		}
		System.out.println("===========for each========");
		for(Teacher t : al) {
			System.out.println(t);
			
		}
		
		System.out.println("==using iterator=====");
		Iterator<Teacher> it1 = al.iterator();
		while(it1.hasNext()) {
			Teacher o = (Teacher) it1.next();
			System.out.println(o);
		}
		
		ListIterator<Teacher> li = al.listIterator();                                    //using linked list
		System.out.println("=========list iterator forward=========");
		while(li.hasNext()) {
			Teacher ob = li.next();
			System.out.println(ob);
		}
		System.out.println("============list iterator backward==========");
		
		while(li.hasPrevious()) {
			Teacher o = li.previous();
			System.out.println(o);
		}
		
		System.out.println("=using vector=======");
		Vector<Teacher> v1 = new Vector<Teacher>();                                       //using vector
		v1.add(t1);
		v1.add(t2);
		v1.add(t3);
		System.out.println("=======usig for loop========");
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
			
		}
		System.out.println("==========using foe each=======");
		for(Teacher obj : v1) {
			System.out.println(obj);
		}
		
		System.out.println("=======using iterator==");
		Iterator<Teacher> it = v1.iterator();
		while(it.hasNext()) {
			Teacher o = it.next();
			System.out.println(o);
		}
		
		System.out.println("==using list iterator forward===============");
		ListIterator<Teacher> lt = v1.listIterator();
		while(lt.hasNext()) {
			Teacher o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("========using stack================");
		Stack<Teacher> li1 = new Stack<Teacher>();                                             //using stack
		li.add(t1);
		li.add(t2);
		li.add(t3);
		System.out.println("=======usig for loop========");
		for (int i = 0; i < li1.size(); i++) {
			System.out.println(li1.get(i));
			
		}
		System.out.println("==========using foe each=======");
		for(Teacher t11 : li1) {
			System.out.println(t11);
		}
		
		System.out.println("=======using iterator==");
		Iterator<Teacher> it2 = li1.iterator();
		while(it2.hasNext()) {
			Teacher o = it2.next();
			System.out.println(o);
		}
		
		System.out.println("==using list iterator forward===============");
		ListIterator<Teacher> lt1 = li1.listIterator();
		while(lt1.hasNext()) {
			Teacher o = lt1.next();
			System.out.println(o);
		}
		
		System.out.println("=using iterator backward==== ");
		while(lt.hasPrevious()) {
			Teacher o = lt.previous();
			System.out.println(o);
		}
		
	}
}
