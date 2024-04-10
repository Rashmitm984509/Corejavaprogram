package com.tns.statickeyword;
// static keyword to variables

public class Employee {
	
	int eid;  // non-static 
	String name;
	static String company="TNS";  // static
	
	Employee(int r,String n){
		eid=r;
		name=n;
	}
	void display() {
		System.out.println(eid+" "+name+" "+company);
	}

}
