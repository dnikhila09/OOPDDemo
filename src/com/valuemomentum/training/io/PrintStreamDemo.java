package com.valuemomentum.training.io;
import java.io.*;
public class PrintStreamDemo{    

	 public static void main(String args[])throws Exception{   
	 
	   FileOutputStream fout=new FileOutputStream("c:/test/hello.txt ");    
	   PrintStream pout=new PrintStream(fout);    
	   pout.println(2016);    
	   pout.println("Hello Java");    
	   pout.println("Welcome to Java");    
	   pout.close();    
	   fout.close();    
	  System.out.println("Success?");    
	 }    
	}    