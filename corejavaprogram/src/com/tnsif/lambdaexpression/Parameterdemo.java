package com.tnsif.lambdaexpression;

public class Parameterdemo {
public static void main(String[] args) {
	
	// lambda expression
	
	Cube c=(a)->{return (a*a*a);};
	
	System.out.println("cube of the number"+c.calculate(2));
}
}
