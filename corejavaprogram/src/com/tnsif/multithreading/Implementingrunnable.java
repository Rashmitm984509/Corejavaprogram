package com.tnsif.multithreading;
// implementing runnable interface

public class Implementingrunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("implementing runnable interface");
	}
	
	public static void main(String[] args) {
		Implementingrunnable r=new Implementingrunnable(); //new state

		Thread t1=new Thread(r);
		
		t1.start();  // runnable state
	}

}
