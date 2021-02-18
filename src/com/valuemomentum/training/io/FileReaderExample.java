package com.valuemomentum.training.io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		try
		{
			Reader r=new FileReader("c:/test/hello.txt");
			int data =r.read();
			while(data !=-1) {//-1 when stream ends
				System.out.print((char) data);
				data =r.read();
			}
			r.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
