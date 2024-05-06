package com.tnsif.comparator;

import java.util.Comparator;

public class SortbyName implements Comparator<Student> {

	@Override
	public int compare(Student b1, Student b2) {
		
		return b1.name.compareTo(b2.name);
	}

	
}
