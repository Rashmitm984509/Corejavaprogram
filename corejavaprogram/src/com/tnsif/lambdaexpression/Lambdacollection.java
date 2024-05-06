package com.tnsif.lambdaexpression;

import java.util.ArrayList;

public class Lambdacollection {
public static void main(String[] args) {
	ArrayList<Integer> li=new ArrayList<Integer>();
	li.add(2);
	li.add(4);
	li.add(8);
	li.add(9);
	
	//System.out.println(li);
	
	for(Integer ele:li) {
		System.out.println(li);
}
	
	li.forEach(ele->System.out.println(ele));
}
}
