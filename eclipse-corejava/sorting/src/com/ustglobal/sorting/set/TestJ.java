package com.ustglobal.sorting.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

public class TestJ {
		public static void main(String[] args) {
			
			Vector v = new Vector();
			System.out.println(v.capacity());
			v.add(12);
			v.add(12);
			v.add(12);
			v.add(12);
			v.add(12);
			v.add(12);
			v.add(12);
			v.add(12);
			v.add(12);
			v.add(34);
			Object[] o = v.toArray();
			System.out.println(o);
			List l = Arrays.asList(o);
			System.out.println(l);
			
			System.out.println(v.capacity());
			
			PriorityQueue pq = new PriorityQueue<>();           // should be of generic type and no null
			pq.add(12);
			pq.add(24);
			//pq.add(null);            throws null pointer exception
			pq.offer(1);
			
			System.out.println("before poll "+pq);
			System.out.println("============using iterator-----------");
			Iterator<Integer> it = pq.iterator();
			while(it.hasNext()) {
				System.out.println(pq.poll());
			}
			System.out.println("After poll "+pq);
			
		}

}
