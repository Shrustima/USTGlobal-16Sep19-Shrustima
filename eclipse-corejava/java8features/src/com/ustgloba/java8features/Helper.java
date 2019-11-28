package com.ustgloba.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentae is "+s.percentage);
			System.out.println("========================");
			
		}
	}
	void displayFailedStudent(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(student -> student.percentage<35).collect(Collectors.toList());
		
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentae is "+s.percentage);
			System.out.println("========================");
			
		}
	}
		void displayPassedStudent(ArrayList<Student> al) {
			List<Student> l = al.stream().filter(student -> student.percentage>35).collect(Collectors.toList());
			
			Iterator<Student> it = l.iterator();
			while(it.hasNext()) {
				
				Student s = it.next();
				System.out.println("Id is "+s.id);
				System.out.println("Name is "+s.name);
				System.out.println("Percentae is "+s.percentage);
				System.out.println("========================");
				
			}
		}
void toppedStudent(ArrayList<Student> al) {
	
		Comparator<Student> cmp = (m1, m2)->{
			if(m1.percentage>m2.percentage) {
				return 1;
			}else if(m1.percentage<m2.percentage){
				return -1;
			}else {
				return 0;
			}
		};
		
				
		System.out.println("===========================");
		Student i = al.stream().max(cmp).get();
		System.out.println("Id is "+i.id);
		System.out.println("Name is "+i.name);
		System.out.println("Percenatage is "+i.percentage);
	}
	
}
