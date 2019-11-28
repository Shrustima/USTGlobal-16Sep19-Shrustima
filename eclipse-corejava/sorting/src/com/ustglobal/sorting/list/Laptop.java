package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	
	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
//	public int compareTo(Laptop p) {
//		Integer q = this.ram;
//		Integer r = p.ram;
//		return q.compareTo(r);
//	}

	
	
	public int compareTo(Laptop p) {
		Double q = this.price;
		Double r = p.price;
		return q.compareTo(r);
	}
}
