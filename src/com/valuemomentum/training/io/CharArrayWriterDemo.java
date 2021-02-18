package com.valuemomentum.training.io;
import java.io.*;
public class CharArrayWriterDemo {  

public static void main(String args[])throws Exception{ 
   
          CharArrayWriter out=new CharArrayWriter(); 
   
          out.write("Welcome to IO Programming in Java");    
          FileWriter f1=new FileWriter("c:/test/hello.txt");    
          FileWriter f2=new FileWriter("c:/test/pinky.txt");    
          FileWriter f3=new FileWriter("c:/test/nikki.txt");    
          FileWriter f4=new FileWriter("c:/test/abc.txt");

    
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    

          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    
         }    
        }    
