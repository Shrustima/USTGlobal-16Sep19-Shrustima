package com.ustgloba.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		
		Predicate<Employee> p = s -> {
			if(s.salary >= 35000) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee s = new Employee(1, "anup", 65000);
		boolean res = p.test(s);
	System.out.println("Result is "+res);
	}
	}

