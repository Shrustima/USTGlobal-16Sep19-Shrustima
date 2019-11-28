package com.ustglobal.collectionsframework.list;

public class Employee {
	int eid;
	String ename;
	String designation;
	public Employee(int eid, String ename, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + "]";
	}
	
}
