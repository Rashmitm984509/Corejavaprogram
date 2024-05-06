package com.tnsif.Stringsdemo;

public class Equalsdemo {
public static void main(String[] args) {
	String s1="sachin";
	String s2="SACHIN";
	
	String s3=new String("sachin");
	String s4="suyog";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	//System.out.println(s1.equals(s4));
}
}
