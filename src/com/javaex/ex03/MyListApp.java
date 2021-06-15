package com.javaex.ex03;

public class MyListApp {
	public static void main(String[] args) {

		// Point List management
		MyList<Point> pList = new MyList<Point>(); // generic

//		Point p01 = new Point(2, 4);
//		Point p02 = new Point(5, 10);

//		Circle c03 = new Circle(100);

		pList.add(new Point(2, 4));
		pList.add(new Point(5, 10));
		//		pList.add(new Circle(100)); --> <Point> Circle error

		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}

	}

}
