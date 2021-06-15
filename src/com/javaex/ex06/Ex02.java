package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {

		Set<Integer> lotto = new HashSet<Integer>();

		while(lotto.size() < 6) {
			int lottoNum6 = (int)((Math.random() * 45) + 1);
			System.out.println(lottoNum6);
			lotto.add(lottoNum6); // 중복체크
		}

		System.out.println("=======================");

		for (int lottoNum : lotto) {
			System.out.print(lottoNum + "   ");
		}


	}

}
