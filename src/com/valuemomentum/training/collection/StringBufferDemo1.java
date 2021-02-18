package com.valuemomentum.training.collection;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		StringBuffer str= new StringBuffer("JamesGosling");
		int l=str.length();
		System.out.println("the length of String is:" +l);
		
		System.out.println("the Capacity of the string is:"+str.capacity());//length+extra 16 is added
		
	
		
		System.out.println("the substring:"+str.substring(0,5));
		
		str.replace(5, 10, "java");
		System.out.println(str);
		
		System.out.println("the reversed string is:"+str.reverse());
		
	}

}
