package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

// arraylist example
public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("y");
		list.add("t");
		list.add("u");
		System.out.println(list);
		//System.out.println(list.sort(null));
		Collections.sort(list);
		System.out.println(list);
	}

}
