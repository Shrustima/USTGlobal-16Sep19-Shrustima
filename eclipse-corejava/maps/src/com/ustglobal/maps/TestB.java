package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 45678989);
		hm.put("shr", 2345656);
		hm.put("shraaa", 987656);

		HashMap hm1 = new HashMap();
		hm1.put("shruu", 876548);
		hm1.put("hema", 87654);
		hm1.put("chutki", 87654367);
		
		boolean haskey = hm.containsKey("shr");
		System.out.println("Has key? "+haskey);
		
		System.out.println("=======================");
		
		boolean hasvalue = hm.containsValue(2345656);
		System.out.println("Has value? "+hasvalue);
		
		System.out.println("=======================");

		hm.putAll(hm1);                                           // to copy from one hash map to another
		System.out.println("After putall "+hm);
		
		System.out.println(hm.size());
		
		boolean ie = hm.isEmpty();
		System.out.println("map isempty? "+ie);
		
		hm.clear();
		System.out.println("After clear() "+hm);
				
	}
}
