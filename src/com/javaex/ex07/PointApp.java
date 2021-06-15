package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {
	public void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();

		pSet.add(new Point(1, 2));
		pSet.add(new Point(3, 6));
		pSet.add(new Point(5, 10));

		System.out.println(pSet.toString());

		/*
		for ( Point p : pSet ) {
			System.out.println(p.toString());
		}
		 */

		// 중복 체크가 HashCode(주소값?)으로 됨 --> 중복의 정의 필요
		pSet.add(new Point(3, 6));
		System.out.println(pSet);

	}

}
