package com.tnsif.comparator;
// comparator
public class Student {
int rollno;
String name;
String address;    // data members
public Student(int rollno, String name, String address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
}


public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}


}
