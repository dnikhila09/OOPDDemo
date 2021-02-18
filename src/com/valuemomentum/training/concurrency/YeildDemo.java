package com.valuemomentum.training.concurrency;
class MyThread12 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " in control");
		}
	}
}
//driver class
public class YeildDemo {

	public static void main(String[] args) {
		MyThread12 t=new MyThread12();
		t.start();
		
		for(int i=0;i<5;i++)
		{
			
			//control passes to child thread
			Thread.yield();
			
			//main thread takes over
			System.out.println(Thread.currentThread().getName() +" in control");
		}
		
	}

}
