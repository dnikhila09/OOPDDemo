package com.valuemomentum.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * A BufferedReader example that reads a file line by line
 */

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("c:/test/countries.txt")));
			String line = "";
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace(); 
		} catch (IOException e)
		{
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();		
			}	
		}
	}