package com.ustglobal.beanobject.bean;
import java.util.Scanner;

public class TestB {
	 public static void main(String[] args) {
		System.out.println("Scanner class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("enter name ");
		String name = sc.next();
		System.out.println("name is "+name);
		
		/*
		 * System.out.println("enter full name"); String fullname = sc.nextLine();
		 * System.out.println("ful name is "+fullname);
		 */
		
		System.out.println("Are you female?");
		boolean a = sc.nextBoolean();
		System.out.println(a);
	}
}
