package com.javalec.base;

import java.util.Scanner;

/**
 * 
 * @FileName : Mian.java
 * @Project : for
 * @Date : 2021. 3. 31.
 * @작성자 : gimminjae
 * @변경이력 :
 * @프로그램 설명 :
 */
public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}

		// 1부터 10까지 합계 구하기
		int tot = 0;
		for (int i = 1; i <= 10; i++) {
			tot = tot + i;
		}

		System.out.println("1부터 1000까지의 합은 " + tot + " 입니다.");

		// Exercise
		// 1부터 100까지의 수중 짝수 및 홀수의 합을 구하시오 (단, if문 사용)
		// 선언___________________________________________
		int odd = 0;
		int even = 0;
		// 처리__________________________________________
		for (int add = 0; add <= 100; add = add + 1) {
//		for (int even = 0;  //시작값
//			even <= 100; 	// 100까지
//			even = even + 2) { //2씩 증가하며 다음을 계산
			if (add % 2 == 0) {
				even = even + add;
			} else {
				odd = odd + add;
			}
		}
		// 출력_______________________________________
		System.out.println("짝수의합" + even);
		System.out.println("홀수의합" + odd);

		even = 0;
		for (int add = 0; add <= 100; add = add + 2) {
			even = add + even;
		}
		System.out.println("짝수의합" + even);

		
		//팩토리얼 만들기_______________________________________________
		// 선언문____________________________________
		Scanner scanner = new Scanner(System.in);
		int decimal = 0;
		int add = 1;
		// 처리문____________________________________
		System.out.println("Input your decimal no. : ");
		decimal = scanner.nextInt();
		for (int i = 1; i <= decimal; i++) {
			add *= i; // add = add * i;
			System.out.println(add); // 디버깅(작동결과)
		}

		// 출력문____________________________________
		System.out.println(decimal + "'s factorial value = " + add);
		
		
	}

}
