package com.ustglobal.beanobject.bean;

public class TestA {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(70);
		s.setName("Shrusti");
		s.setRollNo(131);
		
		Database d = new Database();
		d.receive(s);
		
		Employee e = new Employee();
		e.setId(12);
		e.setName("Shrusti");
		e.setSalary(34567);
		e.setDesignation("developer");
		e.setDept(30);
		
	}
}
