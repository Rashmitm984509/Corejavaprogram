package com.tnsif.inheritance;

public class Child extends Father {
	int s=9;
	@Override
	void learn() {
		System.out.println("Story");
	}
	public static void main(String[] args) {
		
		Child c=new Child();
		
		c.learn();
		System.out.println(c.money);
		System.out.println(c.car);
		System.out.println(c.s);
	}

}
