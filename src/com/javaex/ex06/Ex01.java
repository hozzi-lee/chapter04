package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {

		// create HashSet
		Set<Integer> iSet = new HashSet<Integer>();

		iSet.add(4);
		iSet.add(5);
		iSet.add(6);

		System.out.println("=== size() Element count ===");
		System.out.println(iSet.size());

		System.out.println();

		System.out.println("=== iSet.toString() ===");
		System.out.println(iSet); // --> toString()

		System.out.println();

		System.out.println("=== iSet Enhanced loopFor ===");
		for(Integer num : iSet) {
			System.out.println(num); // --> toString()
		}

		System.out.println("=== add same Value ===");
		iSet.add(5);
		System.out.println("=== iSet Enhanced loopFor ===");
		for(Integer num : iSet) {
			System.out.println(num); // --> toString()
		}
	}
}
