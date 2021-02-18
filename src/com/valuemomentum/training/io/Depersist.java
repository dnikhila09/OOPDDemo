package com.valuemomentum.training.io;
import java.io.*;
import java.io.ObjectInputStream;
public class Depersist {

	public static void main(String[] args)throws Exception {
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/test/hello.txt"));
		
		Student s=(Student)in.readObject();
		System.out.println(s.id+""+s.name);
		
		in.close();
		
		
		
	}

}
