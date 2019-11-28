package com.ustglobal.objectclass;

public class TestE {
		public static void main(String[] args) {
			
			Car c = new Car(2000000, "Hundai", "red");
			Car c1 = new Car(1000000, "Renault", "black");
			int h = c.hashCode();
			System.out.println(h);
			System.out.println(c);
			System.out.println(c1);
			
		}

}
