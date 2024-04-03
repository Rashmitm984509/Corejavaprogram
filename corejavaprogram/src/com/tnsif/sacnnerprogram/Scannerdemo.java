package com.tnsif.sacnnerprogram;

import java.util.Scanner;

public class Scannerdemo {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter you are name");
	String n=sc.nextLine();
	System.out.println("enter you are id");
	int i=sc.nextInt();
	
	System.out.println("name of the student " + n);
	System.out.println("id of the student "+ i);
}
}
