package com.javaex.ex01;

public class Circle {

	// field
	private int radius;
	
	
	
	// constructors
	public Circle() {
		super();
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	
	// method getter/setter
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	// method
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}