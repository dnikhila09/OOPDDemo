package com.valuemomentum.training.io;
import java.io.*;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		 
		Employee e = new Employee(null, null, 0, 0);
		e.name="Nikki";
		e.address="korutla";
		e.SSN=1112222;
		e.number=111;
		try {
		FileOutputStream fileOut= new FileOutputStream("c:/test/emply.ser");
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		out.writeObject(e);
		out.close();
		fileOut.close();
		System.out.println("Serialized data is saved in c:/test/emply.ser");
		}catch(IOException i)
		{
			i.printStackTrace();
		}

	

}
}