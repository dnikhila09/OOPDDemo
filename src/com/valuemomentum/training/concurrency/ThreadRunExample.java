package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		Thread t1=new Thread(new HeavyWorkRunnable());
		Thread t2=new Thread(new HeavyWorkRunnable());
		System.out.println("Starting Runnable threads");
		t1.start();
		t2.start();
		System.out.println("runnable Threads has been started");
	
		
    Thread t3 =new MyThread1("t3");
	Thread t4=new MyThread1("t4");
	
	System.out.println("starting my threads");
	t3.start();
	t4.start();
	System.out.println("my Threads has been started");

	}

}
