package com.javaex.ex02;

import java.util.Arrays;

public class MyList {

	// field
	private Object[] oArray;
	private int arrayCount = 0;



	// constructors
	public MyList() {
		this.oArray = new Object[3];
	}



	// method getter/setter

	// method
	@Override
	public String toString() {
		return "MyList [array=" + Arrays.toString(oArray) + ", arrayCount=" + arrayCount + "]";
	}

	public void add(Object array) {
		oArray[arrayCount] = array;
		arrayCount++;
	}

	public int size() {
		return arrayCount;
	}

	public Object get(int num) {
		return oArray[num];
	}

}
