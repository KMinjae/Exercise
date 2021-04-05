package com.javalec.base;

import java.util.Scanner;

/**
 * 
 * @FileName : Maun2.java
 * @Project : Array_04
 * @Date : 2021. 4. 2.
 * @작성자 : gimminjae
 * @변경이력 :
 * @프로그램설명 :
 */
public class Maun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long multiply = 1;
		for (int i = 0; i <= 10; i++) {
			System.out.println("10^" + String.format("%2d", i) + " = " + String.format("%11d", multiply));
			multiply *= 10;
		}

		Scanner scanner = new Scanner(System.in);
		int[] point = new int[5];
		int[] pointNum = new int[point.length]; // 각 점수벌 개별번호
		int highPoint = 0; // 최고점수가 입력될 곳
		int highPointRank = 0; //

		System.out.println("입력할 숫자의 갯수 ? (100개 미만)");
		for (int i = 0; i <= 4; i++) {
			point[i] = scanner.nextInt();
			if (highPoint <= point[i]) {
				highPoint = point[i];
				pointNum[i] = i + 1;
				highPointRank = pointNum[i];
			}
		}

		System.out.println("입력한 숫자중 최대값은 " + highPoint + "이고" + highPointRank + "번째 값 입니다.");

	}
}
