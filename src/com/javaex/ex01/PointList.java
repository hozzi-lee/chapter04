package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	// field
	private Point[] pArray;
	private int crtPos = 0;



	// constructors
	public PointList() {
		this.pArray = new Point[3];	// 배열의 크기가변 로직 생략
		//		crtPos = 0;
	}



	// method getter/setter

	// method
	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}

	public void add(Point p) {
		pArray[crtPos] = p;
		crtPos++;
	}

	public void remove(Point p) {
		
	}
	
	public int size() {
		return crtPos;
	}

	public Point get(int num) {
		return pArray[num];
	}




}
