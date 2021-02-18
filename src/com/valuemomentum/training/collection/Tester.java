package com.valuemomentum.training.collection;

public class Tester {

	int eid;
	String name;
	float sal;
	public Tester(int eid, String name, float sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	@Override  //to string constructor
	public String toString() {
		return "Tester [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
}
