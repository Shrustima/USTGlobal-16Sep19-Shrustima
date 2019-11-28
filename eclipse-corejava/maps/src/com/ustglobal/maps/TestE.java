package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lm = new TreeMap<>();
		lm.put("Gulbarga", 560068);
		lm.put("Bangalore", 585103);
		lm.put("Patna", 880000);
		//lm.put(null, 9876543);              // null pointer exception, other than generic if we add then we get class cast exception
		
		
		for(Map.Entry<String, Integer> m : lm.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+value);
			System.out.println("======================");
		}
	}
}
