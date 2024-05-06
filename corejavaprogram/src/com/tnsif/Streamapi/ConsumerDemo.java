package com.tnsif.Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// consumer demo
public class ConsumerDemo {
public static void main(String[] args) {
	List<String> cities=new ArrayList<String>();
	cities.add("dehli");
	cities.add("mumbai");
	cities.add("goa");
	
	Consumer<String> print=city->System.out.println(city);
	
}
}
