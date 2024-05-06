package com.tnsif.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	
	List<Laptop> laps=new ArrayList<Laptop>();
	
	laps.add(new Laptop("dell",150000,15));
	laps.add(new Laptop("apple",18000000,17));
	laps.add(new Laptop("hp",1600000,16));
	
	Collections.sort(laps);
	System.out.println(laps);
	
	for(Laptop l:laps) {
		System.out.println(l);
	}
	
	
}
}
