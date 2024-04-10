package com.tnsif.nestedinterface;
// nested interface
public interface Myinterface {
	
	void calculateArea();
	
	//nested interface
	
	interface Myinnerinterface{
		
		int id=20;
		void print();
		
	}

}
