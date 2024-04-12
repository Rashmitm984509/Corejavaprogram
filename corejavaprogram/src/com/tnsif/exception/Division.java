package com.tnsif.exception;
//exception with try and catch
public class Division {
	
	public static void  divide() {
		
		int a=6, b=0,c;
		try {
			c=a/b;
			System.out.println("division"+c);
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("division"+d.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("division"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("welcome");
		}
		
	}
	

}
