package com.tnsif.overloading;

public class Overloadingdemo {
public static void main(String[] args) {
	
	Point p1=new Point();
	Point p2=new Point(2.3f);
	Point p3=new Point(6.7f,8.0f);
	
	System.out.println(p1);

	System.out.println(p2);

	System.out.println(p3);
}
}
