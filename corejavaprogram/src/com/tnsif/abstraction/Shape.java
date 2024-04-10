package com.tnsif.abstraction;
// abstraction
// parent
public abstract class Shape {
	
	protected float area;  // data member
	
	// abstract method
	
	abstract void calarea();
	
	//Concrete method
	
	void show() {
		System.out.println("area of shape"+ area);
	}
	
	

}
