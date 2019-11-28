package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
		lm.put("Bangalore", 560068);
		lm.put("Gulbarga", 585103);
		lm.put("Patna", 880000);
		
		System.out.println(lm);
		
		Set<String> s = lm.keySet();
		for(String key : s) {
			System.out.println("key "+key);
		}
		System.out.println("=======================");
		
		Collection<Integer> c = lm.values();
		for(Integer val : c) {
			System.out.println("values "+val);
		}
		
		

	}
}
