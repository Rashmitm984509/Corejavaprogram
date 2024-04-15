package com.tnsif.exception;
// no exception but finally block execute
public class Test {
public static void main(String[] args) {
	try {
		System.out.println("welcome");
	}
	catch(Exception e) {
		System.out.println("java");
	}
	finally {
		System.out.println("finally");
	}
}
}
