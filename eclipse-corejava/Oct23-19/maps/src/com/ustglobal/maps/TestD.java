package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
		lm.put("Bangalore", 560068);
		lm.put("Gulbarga", 585103);
		lm.put("Patna", 880000);
		
		for(Map.Entry<String, Integer> m : lm.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key+ "---------"+"value is "+value);
			System.out.println("=========================");
		}
	}
}
