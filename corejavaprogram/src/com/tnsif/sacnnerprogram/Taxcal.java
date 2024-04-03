package com.tnsif.sacnnerprogram;

public class Taxcal {

	public void caluculatetax(Person p) {
		
		if(p.getIncome()<=1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600 && p.getIncome()<=15000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}
}
