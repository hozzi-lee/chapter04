package com.javaex.ex01;

public class MyListApp {
	public static void main(String[] args) {

		System.out.println("-------Point-------");
		// Point를 관리하는 리스트(배열대용)
		PointList pList = new PointList();

		Point p00 = new Point(1, 1);
		Point p01 = new Point(2, 2);
		Point p02 = new Point(4, 4);

		pList.add(p00); // 배열 1개
		pList.add(p01); // 배열 1개 --> 배열 2개
		pList.add(p02); // 배열 2개 --> 배열 3개

		System.out.println(pList);

		System.out.println(pList.size()); // 배열 개수 출력 --> 3

		System.out.println(pList.get(1)); // [1]데이터 toString() 출력
		System.out.println(pList.get(1).getX()); // [1]데이터의 x값
		
		System.out.println("-------------------");
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
			System.out.println(pList.get(i).getX());
		}
		
		/*
		pList.remove(0); // [0]데이터 삭제 --> 배열 2개

		Point p03 = new Point(8, 8);
		pList.add(p03); // 배열 2개 --> 배열 3개
		 */

		// 배열 사용시 갯수를 정해야 한다는 불편함.
		/*
		Point[] pArray = new Point[3];

		Point p00 = new Point(1, 1);
		Point p01 = new Point(2, 2);
		Point p02 = new Point(4, 4);

		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;
		 */
		/*
		Point[] pArray = {
				new Point(1, 1),
				new Point(2, 2),
				new Point(4, 4)
		};

		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		 */
		System.out.println("=======Point=======");
		
		
	}

}