package com.tnsif.collectiondemo;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

// Iterator works
public class Example {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("mango");
	list.add("apple");
	list.add("banana");
	list.add("orange");
	System.out.println(list);
	
	Iterator <String> itr= list.iterator();
	while(itr.hasNext()) {
		
	}
}
}
