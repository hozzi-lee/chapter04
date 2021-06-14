package com.javaex.ex02;

public class Point {

	// field
	private int x;
	private int y;



	// constructors
	public Point() {
		super();
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}



	// method getter/setter
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}

	// method
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
