package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEEmployee {
	public static void main(String[] args) {
		
		
		
		Comparator<EEmployee> comp = (e1, e2)->{               //using lambda expression
			if(e1.height > e2.height) {
				return 1;
			}else if(e1.height < e2.height) {
				return -1;
			}else {
				return 0;
			}
		};
		
		TreeSet<EEmployee> ts = new TreeSet<>(comp);
		
		EEmployee e1 = new EEmployee(3, "shru", 5.6);
		EEmployee e2 = new EEmployee(4, "shraa", 6.6);
		EEmployee e3 = new EEmployee(5, "diki", 7.3);
		EEmployee e4 = new EEmployee(6, "soumi", 4.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("------------using iterator--------");
		Iterator<EEmployee> it = ts.iterator();
		while(it.hasNext()) {
			EEmployee e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("================");
		}
		
	}
}
