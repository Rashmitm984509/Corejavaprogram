package com.tnsif.collectiondemo;

import java.util.LinkedList;

//Linkedlist demo
public class Linkedlistdemo {
public static void main(String[] args) {
	LinkedList<String> s=new LinkedList<String>();
	System.out.println("Initial list of elements "+s);
	s.add("r");
	s.add("u");
	s.add("p");
	s.add("t");
	
	System.out.println(s);
	s.add(1, "rashmi");
	System.out.println(s);
	LinkedList <String> s1=new LinkedList<String>();
	s1.add("q");
	s1.add("h");
	
	s.addAll(s1);
	
	System.out.println(s);
	s.addFirst("hash");
	System.out.println(s);
	s.remove(0);
	System.out.println(s);
}
}
