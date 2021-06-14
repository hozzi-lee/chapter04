package com.javaex.ex02;

public class MyListApp {
	public static void main(String[] args) {

		System.out.println("------- Point -------");
		MyList pointList = new MyList();

		pointList.add(new Point(1, 2));
		pointList.add(new Point(4, 8));

		for(int i = 0; i < pointList.size(); i++) {
			System.out.println(pointList.get(i));
		}

		//
		System.out.println();
		//

		System.out.println("------- Circle -------");
		MyList circleList = new MyList();

		circleList.add(new Circle(16));
		circleList.add(new Circle(32));
		circleList.add(new Circle(64));
		// --> circleList에 Point가 들어와도 오류가 없음.
		circleList.add(new Point(128, 256));

		for(int i = 0; i < circleList.size(); i++ ) {
			System.out.println(circleList.get(i));
		}

	}

}
