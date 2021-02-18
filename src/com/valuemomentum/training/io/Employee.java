package com.valuemomentum.training.io;

import java.io.Serializable;

public class Employee implements Serializable {

	
	public String name;
	public String address;
	public transient int SSN;
	public int number;

 {
		super();
		this.name = name;
		this.address = address;
		this.SSN = SSN;
		this.number = number;
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to"+ name +"" +address);
	}
	
}
