package com.valuemomentum.training.io;
import java.io.*;

	  
public class DataStreamDemo {

	 

    public static void main(String[] args)throws IOException 
    {
        DataInputStream d=new DataInputStream(new FileInputStream("c:/Test/hello.txt"));
        DataOutputStream out=new DataOutputStream(new FileOutputStream("c:/Test/hello1.txt"));
        
        String count;
        while((count=d.readLine())!=null)
        {
            String u=count.toUpperCase();
            System.out.println(u);
            out.writeBytes(u+",");
        }
        d.close();
        out.close();
    }

 

}