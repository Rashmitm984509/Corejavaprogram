package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;



//Generic 
public class Genericsdemo {
public static void main(String[] args) {
	ArrayList <String> al=new ArrayList<String>();
	al.add("rahul");
	al.add("jai");
	String s=al.get(1);
	System.out.println(s);
	
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {     // check the data present or not
		System.out.println(itr.next()); // read and move to next
	}
}
}
