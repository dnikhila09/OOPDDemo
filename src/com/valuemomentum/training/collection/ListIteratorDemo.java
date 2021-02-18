package com.valuemomentum.training.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new
				ArrayList<String>();
		al.add("jim");
		al.add("jeery");
		al.add("john");
		al.add("jive");
		
		System.out.println("element at 2nf position:" +al.get(2));
 
		ListIterator<String> itr=al.listIterator();
		
		System.out.println("traversing ele in the forward direction");
		
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	     
	     System.out.println("traversing ele in backward direction");
	     
	   while(itr.hasPrevious()){
		System.out.println(itr.previous());
	}
	}

}
