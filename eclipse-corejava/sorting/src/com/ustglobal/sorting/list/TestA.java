package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student(13, "shru", 70.99);
		Student s2 = new Student(14, "Diksha", 60.69);
		Student s3 = new Student(15, "soumya", 73.08);
		Student s4= new Student(16, "shraa", 65.39);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("Before sorting=====");
		displayStudentDetails(al);
		Collections.sort(al);
		
		System.out.println("After sorting------");
		displayStudentDetails(al);
		
	}
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("===================");
			
		}
	}
}
