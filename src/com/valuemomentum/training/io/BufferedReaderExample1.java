package com.valuemomentum.training.io;

import java.io.*;

public class BufferedReaderExample1
{    
   public static void main(String args[])throws Exception
   {             
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r); 
    
    
    System.out.println("Enter your name and age");    
    String name=br.readLine();    
    int age =Integer.parseInt(br.readLine());
    
    System.out.println("Welcome "+name);    
}    
}