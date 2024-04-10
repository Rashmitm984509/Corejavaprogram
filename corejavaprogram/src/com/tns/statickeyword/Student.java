package com.tns.statickeyword;
// static method
public class Student {
int rollno;
String name;

static String college="ITS";

static void  change() {
	   college="tkr";
	               // static method
	
}
Student(int r,String n){
	rollno=r;
	name=n;
}
void display1() {
	System.out.println(rollno+" "+name+" "+college);
}

}
