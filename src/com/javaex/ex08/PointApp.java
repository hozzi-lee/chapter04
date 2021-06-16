package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	// method
	public static void main(String[] args) {

		//		List<Point> pList = new ArrayList<Point>();

		Map<String, Point> pMap = new HashMap<String, Point>(); // <키값, 관리클래스>
		/*
		pMap.put("정우성", new Point(1, 1));
		pMap.put("이효리", new Point(2, 2));
		pMap.put("유재석", new Point(4, 4));
		 */
		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(4, 4);

		// Map 요소 추가 == .put(key값(자료형), instance)
		System.out.println("=== Map 요소 추가 == .put(key값(자료형), instance) ===");
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("유재석", p03);

		System.out.println();

		// pMap.size(), toString() 출력
		System.out.println("=== pMap.size(), toString() 출력 ===");
		System.out.println(pMap.size());
		System.out.println(pMap.toString());

		System.out.println();

		// pMap.get(key) --> 해당 키값으로 출력
		System.out.println("=== pMap.get(key) --> 해당 키값으로 출력 ===");
		System.out.println(pMap.get("유재석").getStrX());
		System.out.println(pMap.get("정우성").getStrX());

		System.out.println();

		// 동일 키값으로 새로운 인스턴스 생성 --> 해당 키값 수정
		System.out.println("=== 동일 키값으로 새로운 인스턴스 생성 --> 해당 키값 수정 ===");
		// pMap.put("박명수", new Point(100, 100);
		Point p04 = new Point(100, 1000);
		pMap.put("유재석", p04);
		System.out.println(pMap.toString());

		System.out.println();

		// for문 : 키 리스트("정우성", "이효리", "유재석") == pMap.keySet() Map이 key들을 Set으로 관리
		System.out.println("=== for문 --> 키 리스트(\"정우성\", \"이효리\", \"유재석\") == pMap.keySet() Map이 key들을 Set으로 관리 ===");
		Set<String> keys = pMap.keySet();
		// 향상된 for문
		for ( String p : keys ) {
			System.out.println(p); // key값 출력
			System.out.println(pMap.get(p)); // key값에 대한 Map 출력
		}

	}

}
