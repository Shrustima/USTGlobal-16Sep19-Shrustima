package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

		public static void main(String[] args) {
			
			ArrayList<Integer> al = new ArrayList<>();
			al.add(12);
			al.add(23);
			al.add(55);
			al.add(62);
			al.add(2);
			al.add(4);
			
			List<Integer> l = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());  //converts data to list type
			
			
			for(Integer i : l) {
				System.out.println(i);
			}
			
			
		}
}
