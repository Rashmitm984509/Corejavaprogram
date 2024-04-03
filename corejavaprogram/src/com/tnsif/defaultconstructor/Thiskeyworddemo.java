package com.tnsif.defaultconstructor;
// to demostrate this keyword
public class Thiskeyworddemo {

	int rollno;    // actual parameter or class variable
	String name;        // data members
	
	Thiskeyworddemo(int rollno, String name){// formal p
		this.rollno=rollno; // formal p
		this.name=name;
	}
	public static void main(String[] args) {
		Thiskeyworddemo f=new Thiskeyworddemo(1,"r");
	}
}
