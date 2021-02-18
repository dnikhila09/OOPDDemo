package com.valuemomentum.training.concurrency;

public class JoinDemo extends Thread {

	
		public void run() {
			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				}
				catch(InterruptedException e)
			     {
		         }
			}
		}
		public static void main(String[] args) {
			
			JoinDemo  t1=new JoinDemo();
			JoinDemo  t2=new JoinDemo();
			JoinDemo  t3=new JoinDemo();
			
			t1.start();
			try {
				t1.join();//method waits for thread to die
			}catch(InterruptedException e)
		     {
				e.printStackTrace();
			}
			t2.start();
			t3.start();
			
	}

}
