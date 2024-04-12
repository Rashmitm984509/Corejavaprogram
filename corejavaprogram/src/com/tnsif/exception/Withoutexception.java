package com.tnsif.exception;

public class Withoutexception {
	
public static void main(String[] args) {
	int d=0;
	System.out.println("hello");
	
	try {
	int a=55/0;
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught");
	}
	
}
}
