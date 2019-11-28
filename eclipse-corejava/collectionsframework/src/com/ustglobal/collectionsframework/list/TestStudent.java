package com.ustglobal.collectionsframework.list;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList <Student> al = new ArrayList<Student>();
		Student s1 =  new Student(131, "shrusti", 70.09);
		Student s2 = new Student(121, "soumya", 69.09);
		Student s3 = new Student(141, "jaii", 65.07);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
		System.out.println("===========for each========");
		for(Student s : al) {
			System.out.println(s);
			
		}
	}
}
