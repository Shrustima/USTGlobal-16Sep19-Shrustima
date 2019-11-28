package com.ustglobal.objectclass;

public class TestH {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p1 = new Person(14, "shrusti");
		System.out.println("p1 is "+p1.id);
		System.out.println("p1 name "+p1.name);
		
		Object o = p1.clone();
		Person p2 = (Person) o;
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);
		
		
		p2.id = 30;
		p2.name = "soumya";
		System.out.println("----------------After cloneing---------");
		System.out.println("p1 is "+p1.id);
		System.out.println("p1 name "+p1.name);
		System.out.println("p2 is "+p2.id);
		System.out.println("p2 name "+p2.name);


		
		
	}

}
