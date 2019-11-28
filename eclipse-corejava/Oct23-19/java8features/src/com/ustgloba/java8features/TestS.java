package com.ustgloba.java8features;

import java.util.ArrayList;

public class TestS {
public static void main(String[] args) {
	
	ArrayList<Student> al = new ArrayList<>();
	al.add(new Student(3, "vvvv", 88.6));
	al.add(new Student(4, "eeee", 65.8));
	al.add(new Student(5, "ffff", 27.64));
	al.add(new Student(6, "gggg", 43.62));
	
	
	
	Helper h = new Helper();
	//h.displayAllStudent(al);
	//h.displayFailedStudent(al);
	h.toppedStudent(al);
}
}
