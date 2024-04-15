package com.tnsif.exception;

public class UserDemo {
public static void main(String[] args) {
	try {
		UserDefined.validate();
	} catch (Age e) {
		System.out.println("caught exception"+e.getMessage());
		
	}
}
}
