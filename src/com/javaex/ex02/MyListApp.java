package com.javaex.ex02;

public class MyListApp {
	public static void main(String[] args) {

		System.out.println("------- Point -------");
		MyList pList = new MyList();

		pList.add(new Point(1, 2));
		pList.add(new Point(4, 8));

		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}

		//
		System.out.println();
		//

		System.out.println("------- Circle -------");
		MyList cList = new MyList();

		cList.add(new Circle(16));
		cList.add(new Circle(32));

		for(int i = 0; i < cList.size(); i++ ) {
			System.out.println(cList.get(i));
		}

	}

}
