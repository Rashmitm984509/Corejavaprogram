package com.tnsif.defaultconstructor;
// to demonstrate parameterized constructor

public class Example {
Example(){
	System.out.println("default const or no argument");
}
Example(int i, int j){
	System.out.println("2 parameter");
}
Example(int i, String n){
	System.out.println("different argument");
}
Example(int i, int j,int k){
	System.out.println("3 parameter");
}
public static void main(String[] args) {
	Example e1=new Example();
	Example e2=new Example(7,8);
	Example e3=new Example(4,"s");
	Example e4=new Example(1,3,4);
}
}
