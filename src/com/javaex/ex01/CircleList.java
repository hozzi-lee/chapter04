package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	// field
	private Circle[] cArray;
	private int arrayCount = 0;
	
	
	
	// constructors
	public CircleList() {
		this.cArray = new Circle[7];
	}

	
	
	// method getter/setter
	
	// method
	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", arrayCount=" + arrayCount + "]";
	}
	
	public void add(Circle array) {
		cArray[arrayCount] = array;
		arrayCount++;
	}
	
	public int size() {
		return arrayCount;
	}
	
	public Circle get(int num) {
		return cArray[num];
	}
	
	
}
