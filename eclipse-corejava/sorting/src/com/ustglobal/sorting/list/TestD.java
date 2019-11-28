package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.add(12);
		s.add(24);
		s.add(43);
		
		System.out.println("using get()=============");
		for(int i =0; i<s.size();i++) {
			System.out.println(s.get(i));
		}
		System.out.println("using pop()----------");
		int j = s.size();
		for(int i=0;i<j;i++) {
			System.out.println(s.pop());
		}
	}
}
