package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();           // we get keys in descending order
		ht.put(131, "diki");
		ht.put(132, "soumi");
		ht.put(133, "shru");
		ht.put(130, "shra");
		ht.put(131, "niki");
		//ht.put(null, "john");          // null pointer exception for key
		//ht.put(137, null);             //null pointer exception for value 
		
		System.out.println("Data "+ht);
		
	}
}
