package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student(2, "shru", 78.96);
		Student s2 = new Student(3, "shraa", 68.96);
		Student s3 = new Student(4, "diki", 57.46);
		Student s4 = new Student(5, "soumi", 48.36);
		Student s5 = new Student(6, "niki", 58.26);
		Student s6 = new Student(7, "moumi", 73.86);
		Student s7 = new Student(8, "dumi", 47.99);
		Student s8 = new Student(9, "foumi", 49.26);
		Student s9 = new Student(10, "aoumi", 88.76);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> second = hm.get("second");
		Iterator<Student> it = second.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("===================================");
			
		}




	}
}
