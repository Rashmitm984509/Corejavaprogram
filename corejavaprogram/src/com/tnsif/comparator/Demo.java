package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	
	al.add(new Student(262,"rashmi","bangalore"));
	al.add(new Student (243,"kusuma","bangalfdsfore"));
	al.add(new Student (278,"sushma","ban"));
	
	
	
	Collections.sort(al,new SortbyRoll());
	Collections.sort(al,new SortbyName());
	
	
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
}
}
