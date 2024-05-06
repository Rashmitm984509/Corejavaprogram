package com.tnsif.Stackdemo;

import java.util.Stack;

// stack example
//push
//pop
//isempty
public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> ob=new Stack<Integer>();
	ob.push(1);     // add the data
	ob.push(5);
	ob.push(8);
	ob.push(56);
	System.out.println(ob);
	ob.pop();
	ob.pop();
	System.out.println(ob);
	// peak()  : use to print last element of the stack
	System.out.println(ob.peek());
	if(ob.isEmpty()){
		System.out.println("stack is empty");
	}
	else {
		System.out.println("stack is not empty");
	}
	// if we want to search element
	
	System.out.println(ob.search(90));
	
}
}
