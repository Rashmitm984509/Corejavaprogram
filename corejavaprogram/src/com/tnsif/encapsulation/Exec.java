package com.tnsif.encapsulation;

public class Exec {
	
public static void main(String[] args) {
	
	EncapsulationDemo e=new EncapsulationDemo();
	e.n=7;
	e.s="rashmi";
	e.a=24;
	
	e.show();
	boolean s=e instanceof EncapsulationDemo;
	System.out.println(s);
}
}
