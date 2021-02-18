package com.valuemomentum.training.collection;

import java.util.*;
public class Details  {

	public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(79,"Nikky",101,"java"));
	   arraylist.add(new Student(88,"Pinky",102,"C"));
	   arraylist.add(new Student(65,"Megh",103,"C++"));

	   /*Sorting based on Student Name*/
	   System.out.println("Student Name Sorting:");
	   Collections.sort(arraylist, Student.StuNameComparator);

	   for(Student str: arraylist){
			System.out.println(str);
	   }

	   /* Sorting on Rollno property*/
	   System.out.println("Sorting according to marks:");
	   Collections.sort(arraylist, Student.StuMarkscomparator);
	   for(Student str: arraylist){
			System.out.println(str);
	   }
	}
}