package com.ustglobal.typecasting.reference;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Marker(); //up casting
		System.out.println(p.cost);
		p.write();
		//System.out.println(p.size);     not possible
		// p.color();             ------------do---------
		Marker m = (Marker) p;   //down casting
		System.out.println(m.size);
		m.color();
		m.write();
	
	}
}
