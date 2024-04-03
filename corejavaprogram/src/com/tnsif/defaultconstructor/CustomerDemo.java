package com.tnsif.defaultconstructor;

import java.util.Scanner;

public class CustomerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter you are name");
	String n=sc.nextLine();
	System.out.println("enter you are id");
	int i=sc.nextInt();
	System.out.println("enter you are name of the city");
	String s=sc.next();
	
	Customer c=new Customer();
	c.setCustomername(n);
	c.setCustomerid(i);
	c.setCustomercity(s);
	
	System.out.println(c);
	
	
}
}
