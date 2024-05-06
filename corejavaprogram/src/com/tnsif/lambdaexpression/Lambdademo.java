package com.tnsif.lambdaexpression;

public class Lambdademo {
public static void main(String[] args) {
	// lambda expression
	Message m=()->{return "hello";};
	
	System.out.println(m.greet());
}
}
