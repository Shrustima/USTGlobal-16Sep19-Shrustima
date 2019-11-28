package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
	double price;
	String brand;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
//	@Override
//	public int compareTo(Pen o) {
//		Double p = this.price;
//		Double q = o.price;
//		
//		return p.compareTo(q);
//	}
	
	
	@Override
	public int compareTo(Pen s) {
	
		String p = this.brand.toUpperCase();
		String q = s.brand.toUpperCase();
		return p.compareToIgnoreCase(q);                                  //calling string compareTo method
		
	}
}
