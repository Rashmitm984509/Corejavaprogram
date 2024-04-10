package com.tnsif.superkeyword;

public class Superchild extends Supervaribale{
	
	int a=7;
//	void display() {
//		System.out.println(a);
//		System.out.println(super.a);
//	}
	void drink() {
		System.out.println("coffee");
	}
	
	void display() {
		drink();
		super.drink();
	}
	public static void main(String[] args) {
		Superchild c=new Superchild();
		c.display();
	
		
	}

}
