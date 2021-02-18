package com.valuemomentum.training.collection;

class Sample<T>  //generic class
{
	private T data;

	public Sample(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		
     Sample<Integer> s1=new Sample<Integer>(15); //creating object for generic class
  //   s1.setData(15);
     System.out.println("display from generic class of type integer "+s1.getData());
     
     Sample<String> s2=new Sample<String>("Java generics"); //creating object for generic class
    // s2.setData("java generics");
     System.out.println("display from generic class of type string "+s2.getData());
     
     Sample<Float> s3=new Sample<Float>(125.35f); //creating object for generic class
  //   s3.setData(120.56f);
     System.out.println("display from generic class of type float "+s3.getData());
     
     
     
	}

}
