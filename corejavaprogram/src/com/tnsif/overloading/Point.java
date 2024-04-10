package com.tnsif.overloading;
// to demonstrate constructor overloading
public class Point {
	private float x;
	private float y;   // data members
	
public Point() {
	x=6.7f;
	y=9.7f;
}
public Point(float x) {
	this.x=x;
	this.y=x;
}
public Point (float x,float y) {
	this.x=x;
	this.y=y;
}
@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}
	
	

}
