package com.tnsif.Streamapi;

import java.util.stream.Stream;

public class SkipExample {
public static void main(String[] args) {
	Stream.of(1,2,3,4,5,6,7,8,9,11,23,56).filter(num->num%2==0)//filter even number
	//.skip(2)  // skip the first two
	.limit(2)     // limited values
	.forEach(num->System.out.println(num+" "));
}
}
