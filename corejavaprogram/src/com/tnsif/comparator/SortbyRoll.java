package com.tnsif.comparator;

import java.util.Comparator;

public class SortbyRoll implements Comparator<Student>{

	@Override
	public int compare(Student b1, Student b2) {
		
		return b2.rollno-b1.rollno;
	}

}
