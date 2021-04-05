package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputValue = new int[3];
		Scanner scanner = new Scanner(System.in);
		int tot = 0; // 합계 구할 변수
		double avg = 0.0; // 평균 구하기

		// ________________________________________________________
		System.out.println("__________________________________");
		// 사용자로 부터 정보 입력 받아서 배열에 넣기
		System.out.println("사용자로 부터 정보 입력 받아서 배열에 넣기 (숫자) : ");
		for (int i = 0; i < inputValue.length; i++) { // 배열에 입력
			inputValue[i] = scanner.nextInt();
		}

		// ________________________________________________________
		System.out.println("__________________________________");
		// 입력한 정보의 합계 구하기
		for (int i = 0; i < inputValue.length; i++) {
			tot += inputValue[i];
		}
		// ________________________________________________________
		System.out.println("__________________________________");
		// 입력한 정보의 평균 구하기
		avg = (double) tot / inputValue.length;

		// ________________________________________________________
		System.out.println("__________________________________");
		// 입력한 정보 출력하기
		System.out.println("귀하가 입력한 정보는 다음과 같습니다.");
		for (int i = 0; i < inputValue.length; i++) {
			System.out.print(inputValue[i] + "\t");
		}
		System.out.println();
		System.out.println("입력한 정보의 총합은 : "+ tot);
		System.out.println("입력한 정보의 평균은 : "+ String.format("%.3f", avg));
	}

}
