package com.valuemomentum.training.collection;

	public class Student09 implements Comparable<Student09> {
	    int rollNo;
	    String name;
	    int age;
	    public Student09(int rollNo, String name, int age) {
	        super();
	        this.rollNo = rollNo;
	        this.name = name;
	        this.age = age;
	    }
	    public int compareTo(Student09 st) {
	        if(age==st.age)
	            return 0;
	        else if(age>st.age)
	            return 1;
	        else
	            return -1;
	    }
	
	   
	}
	 

     