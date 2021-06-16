package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {
	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();

		/*
		pSet.add(new Point(1, 2));
		pSet.add(new Point(3, 6));
		pSet.add(new Point(5, 10));
		 */

		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(5, 10);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);

		System.out.println(pSet.toString());

		System.out.println();

		/*
		for ( Point p : pSet ) {
			System.out.println(p.toString());
		}
		 */

		// 중복 체크가 HashCode(주소값?)으로 됨 --> 중복의 정의 필요
		System.out.println("=== p02와 매개변수가 같은 p04추가 / pSet.toString 출력 ===");
		//		pSet.add(new Point(3, 6));
		Point p04 = new Point(3, 6);
		pSet.add(p04);
		System.out.println(pSet);

		System.out.println();

		// Point 비교 --> equals()
		System.out.println("=== equals() 재정의 및 비교 ===");
		System.out.println(p02.equals(p04)); // equals 재정의 --> 매개변수 값
		System.out.println(p02 == p04); // 주소값

		System.out.println(p01.equals(p04)); // equals 재정의 --> 매개변수 값
		System.out.println(p01 == p04); // 주소값

		System.out.println();

		// hashCode 재정의
		System.out.println("=== hashCode() 재정의 ===");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());

		System.out.println(p02 == p04); // 주소값

	}

}
