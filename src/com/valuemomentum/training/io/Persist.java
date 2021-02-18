package com.valuemomentum.training.io;

import java.io.*;

public class Persist {

	public static void main(String[] args)throws Exception {
		
		Student s1= new Student(101,"nikki");
		
		FileOutputStream fout=new FileOutputStream("c:/test/f1.txt");
		ObjectOutputStream out= new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("success");

	}

}
