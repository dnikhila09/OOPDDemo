package com.valuemomentum.training.io;

import java.io.File;
import java.io.IOException;

public class FileClass {

	private static File f;

	public static void main(String[] args) {
	
		File f= new File("c:/test/hello.txt");
		try {
			
			if(f.createNewFile()) {
				System.out.println("new file is created!");
			}else {
				System.out.println("the file is already exist.");
			}
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
		System.out.println("Name of the file:"+f.getName());
        System.out.println("Path of the file:"+f.getPath());
        System.out.println("File last modified:"+f.lastModified());
        System.out.println("Parent directory:"+f.getParent());
        System.out.println("Size of the File:"+f.length()+"Bytes");
	}
}
		
		
	
