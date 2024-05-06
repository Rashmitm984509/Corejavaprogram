package com.tnsif.lambdaexpression;

public class TestDemo {
public static void main(String[] args) {
	
	Runnable b =()->{String threadname=Thread.currentThread().getName();
	System.out.println("threadname"+threadname);
	};
	
	Thread t1=new Thread(b);   //new state
	Thread t2=new Thread(b);
	 
	t1.start();
	t2.start();
}
}
