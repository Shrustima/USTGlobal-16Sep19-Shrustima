package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(22);
		marks.add(73);
		marks.add(55);
		marks.add(32);
		marks.add(92);
		marks.add(45);
		
		Comparator<Integer> cmp = (m1, m2)->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2){
				return -1;
			}else {
				return 0;
			}
		};
		long noOffFailedStudents = marks.stream().filter(i -> i<35).count();
		System.out.println(noOffFailedStudents);
		
		System.out.println("===========================");
		Integer i = marks.stream().min(cmp).get();
		System.out.println("Min value "+i);

		System.out.println("===========================");
		Integer i1 = marks.stream().max(cmp).get();
		System.out.println("Max value "+i1);
	}
}
