package com.tnsif.vectordemo;

import java.util.ArrayList;
import java.util.Vector;

// Vector example
public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("red");
		v.add("white");
		v.add("blue");
		v.add("orange");
		System.out.println(v);
		int cap=v.capacity();
		System.out.println(cap);
		v.add(4, "green");
		System.out.println(v);
		ArrayList <String> a=new ArrayList<String>();
		a.add("ff");
		a.add("black");
		a.add("purple");
		a.add("ff");
		a.add("black");
		a.add("purple");
		v.addAll(a);
		System.out.println(v);
		int cap1=v.capacity();
		System.out.println(cap1);
	}

}
