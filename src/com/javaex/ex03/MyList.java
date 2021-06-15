package com.javaex.ex03;

import java.util.Arrays;

public class MyList<E> {

	// field
	private E[] oArray;
	private int arrayCount = 0;



	// constructors
	public MyList() {
		this.oArray = (E[])new Object[5];
	}



	// method getter/setter

	// method
	@Override
	public String toString() {
		return "MyList [array=" + Arrays.toString(oArray) + ", arrayCount=" + arrayCount + "]";
	}

	public void add(E array) {
		oArray[arrayCount] = array;
		arrayCount++;
	}

	public int size() {
		return arrayCount;
	}

	public E get(int num) {
		return oArray[num];
	}

}
