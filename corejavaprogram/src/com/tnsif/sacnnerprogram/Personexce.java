package com.tnsif.sacnnerprogram;

import java.util.Scanner;

public class Personexce {
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter person name");
	String n=sc.nextLine();
	System.out.println("enter the income");
	int i=sc.nextInt();
	
	// object creation
	Person p1=new Person();
	p1.setName(n);
	p1.setIncome(i);
	
	Taxcal c=new Taxcal();
	
	c.caluculatetax(p1);
	System.out.println("after calucation");
	System.out.println(p1);
}
}
