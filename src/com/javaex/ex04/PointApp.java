package com.javaex.ex04;

import java.util.ArrayList;

public class PointApp {
	public static void main(String[] args) {

		ArrayList<Point> pointArray = new ArrayList<Point>();

		pointArray.add(new Point(1, 1));
		pointArray.add(new Point(2, 2));
		pointArray.add(new Point(4, 4));
		pointArray.add(new Point(8, 8));
		pointArray.add(new Point(16, 16));
		pointArray.add(new Point(32, 32));
		pointArray.add(new Point(64, 64));
		pointArray.add(new Point(128, 128));
		pointArray.add(new Point(256, 256));
		pointArray.add(new Point(512, 512));
		pointArray.add(new Point(1024, 1024));
		pointArray.add(new Point(2048, 2048));

		// Array count
		System.out.println("=== size() ===");
		System.out.println(pointArray.size());

		System.out.println();

		// pointArray[0] output - toString(), getX(), getY()
		System.out.println("=== pointArray[0] toString(), getX(), getY() ===");
		Point p = pointArray.get(0); // --> toString()
		System.out.println(p); // --> toString()
		System.out.println(p.toString());
		System.out.println(p.getX()); // --> x값
		System.out.println(p.getY()); // --> y값

		System.out.println();

		// loopFor - All output
		System.out.println("=== loopFor - All output ===");
		for(int i = 0; i < pointArray.size(); i++) {
			System.out.println(pointArray.get(i).getStrX());
		}

		System.out.println();

		// pointArray.toString()
		System.out.println("=== toString() ===");
		System.out.println(pointArray.toString());

		System.out.println();

		// 13th Point add in pointArray[1]
		System.out.println("=== pointArray[1] add(1) ===");
		pointArray.add(1, new Point(4096, 4096));
		System.out.println(pointArray);

		System.out.println();

		// 13th Point remove from pointArray[1]
		System.out.println("=== pointArray[1] remove(1) ===");
		pointArray.remove(1);
		System.out.println(pointArray);

		System.out.println();

		// Enhanced loopFor
		System.out.println("=== Enhanced loopFor ===");
		for(Point pArray : pointArray) {
			System.out.println(pArray);
		}

	}

}
