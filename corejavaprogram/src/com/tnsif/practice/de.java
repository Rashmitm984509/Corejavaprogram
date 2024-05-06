package com.tnsif.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class de {
public static void display() {
	Set<Integer> s=new HashSet<Integer>();
	s.add(2);
	s.add(3);
	s.add(7);
	s.addAll(Arrays.asList(new Integer[] {1,4,5}));
	System.out.println(s);
	
	Set<Integer> s1=new HashSet<Integer>();
	s1.addAll(Arrays.asList(new Integer[] {1,4,5}));
	
	Set<Integer> s3=new HashSet<Integer>(s);
	s3.retainAll(s1);
	System.out.println(s3);
	
	Set<Integer> s4=new HashSet<Integer>(s);
	s4.addAll(s1);
	System.out.println(s4);
}
public static void main(String[] args) {
	de.display();
}
}
