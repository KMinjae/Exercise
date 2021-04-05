package com.javalec.base;

import java.util.Scanner;

/**
 * 
 * @FileName : Gugu.java
 * @Project : Gugu
 * @Date : 2021. 3. 31.
 * @작성자 : gimminjae
 * @변경이력 :
 * @프로그램 설명 : 구구단 만들기
 */
public class Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 99; i++) {
			for (int j = 1; j <= 99; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}

		// Exercise
		// 원하시는 단을 입력하세요. :

		// 선언문
		Scanner scanner = new Scanner(System.in);
		int num = 0;

		// 처리문
		System.out.print("원하시는 단을 입력하세요 : ");
		num = scanner.nextInt();

		// 출력문
		for (int i = 2; i <= 9; i += 2) {
			System.out.println(num + " X " + i + " = " + num * i);
		}

		// Exercise2
		// 원하는 단을 계산하는데 홀수곱은 빈칸으로 표시하세요.
		// 선언문____________________________________
		Scanner scanner2 = new Scanner(System.in);
		int num2 = 0;

		// 처리문____________________________________
		System.out.print("원하시는 단을 입력하세요 : ");
		num2 = scanner.nextInt();

		// 출력문____________________________________
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + (i % 2 == 0 ? i : "_") + " = " + (num * i));
		}

		// 입력한 각 자릿수 정수의 합을 구하는 프로그램을 작성하라.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer(0~9) : ");

		// 선언
		int num3 = scan.nextInt();

		// 풀이
		int sum = 0;
		for (int i = 0; i <= 15; i++) {
			sum += num3 % 10; // ex) 12345678 의 나머지는 8
			num3 /= 10; // 12345678 의 나머지 8을 구했으니, 제일 끝 숫자인 7을 나머지로 구하기 위해 10으로 나눈다.
			// 이 계산이 끝나면 다시 for문 처음으로 올라가서 나머지 7을 구하게 되고 계속 반복된다.

			System.out.println(sum);
		}

		// 출력
		System.out.println("Sum of digits = " + sum);
	}
}
