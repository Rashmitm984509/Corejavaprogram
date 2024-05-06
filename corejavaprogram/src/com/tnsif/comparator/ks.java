package com.tnsif.comparator;

import java.util.Comparator;

public class ks implements Comparator<Student> {

	@Override
	public int compare(Student b1, Student b2) {
		if(b1.getRollno()==b2.getRollno()) {
			return b1.getName().compareTo(b2.getName());
		
	}
	return b1.getRollno()-b2.getRollno();

}

}
