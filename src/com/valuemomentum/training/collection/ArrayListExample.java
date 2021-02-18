package com.valuemomentum.training.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
	  //creating list of books
		List<Book> List= new ArrayList<Book>();

		//Creating Books
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

	    
	    //adding books to list
	    List.add(b1);
	    List.add(b2);
	    List.add(b3);
	   
	    //travesing list
	    for(Book b:List)
	    {
	    	System.out.println(b.id+" "+b.name+""+b.author+""+b.publisher+""+b.quantity);
	    }
	}

}
