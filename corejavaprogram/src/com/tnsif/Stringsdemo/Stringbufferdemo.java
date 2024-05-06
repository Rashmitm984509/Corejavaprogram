package com.tnsif.Stringsdemo;
// String buffer demo
public class Stringbufferdemo {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("welcome");
	str.append(" to java");
	System.out.println(str);
	 System.out.println(str.insert(2, "hi"));
	 System.out.println(str.delete(2, 4));
	 System.out.println(str.reverse());
}
}
