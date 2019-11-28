package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("kuku", 45678989);
		hm.put("shr", 2345656);
		hm.put("shraaa", 987656);
		hm.put(null, 987656);
		hm.put(null, 987659876);

		System.out.println("Data "+hm);
		hm.put("shr", 23476654);
		System.out.println("After modify "+hm);
		hm.put("dimple", 987656);
		System.out.println("After dimple "+hm);

		System.out.println("After adding null "+hm);
		System.out.println("=======================");
		System.out.println("After adding duplicate null "+hm);

		Object o = hm.get("shr");
		System.out.println("After get() the value is  "+o);

		System.out.println("==============");

		Object o1 = hm.get("shruu");                  // key which does not exists
		System.out.println("After get() the value is  "+o1);

		Object o2 =	hm.remove("shruu");
		System.out.println("value "+o2);
		
		System.out.println("After remove()   "+hm);



	}

}
