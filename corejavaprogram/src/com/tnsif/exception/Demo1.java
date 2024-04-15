package com.tnsif.exception;

import java.io.IOException;

public class Demo1 {
public static void main(String[] args) {
	Throwskeyword d=new Throwskeyword();
	try {
		d.display();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("caught exception"+e);
	}
}
}
