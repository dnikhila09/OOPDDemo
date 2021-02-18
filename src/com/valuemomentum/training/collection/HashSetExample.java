package com.valuemomentum.training.collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
	
   HashSet<String> hset = new HashSet<String>();
   
   hset.add("apple");
   hset.add("mango");
   hset.add("grapes");
   hset.add("orange");
   hset.add("fig");
   
   //addition of duplicates
   hset.add("apple");
   hset.add("mango");
   //addition of null values
   hset.add(null);
   hset.add(null);
   //display
   
   System.out.println(hset);
		
	}

}
