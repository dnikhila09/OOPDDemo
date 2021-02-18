package com.valuemomentum.training.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student55> ar=new ArrayList<Student55>();
		
		Student55 s1=new Student55(111,"John","Bengaluru");
		Student55 s2=new Student55(121,"Allan","Mumbai");
		Student55 s3=new Student55(101,"Mike","Newyork");
		Student55 s4=new Student55(115,"Sam","Milan");
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		System.out.println("**********Unsorted Array List:************");
		//System.out.println(ar); // invoke toString() method
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByRoll());
		
		System.out.println("**********Sorted Array List by Roll No:**********");
				for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

		Collections.sort(ar, new SortByName());
		System.out.println("**********Sorted Array List by Name:**************");
		for (int i=0; i<ar.size(); i++)
    System.out.println(ar.get(i));
	}

}
