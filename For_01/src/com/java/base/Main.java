package com.java.base;

import java.util.Scanner;

/**
 * 
 * @FileName : Main.java
 * @Project : For_01
 * @Date : 2021. 4. 1.
 * @작성자 : gimminjae
 * @변경이력 :
 * @프로그램 설명 : for문 추가설명?
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main 메소드는 1개 이고 무조건 하나는 있어야 한다.
		Scanner scanner = new Scanner(System.in);
		int dan;

		// ________________________________________________________________
		System.out.print("1) 단을 입력하세요 : ");
		dan = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + String.format("%03d", (dan * i)));
			// String.format("%3d",(dan * i)) 문자열.형태("%?d",)
			// "%3d" 는 ?자리수 표시 (ex, %3d == ``1 `12 123)
			// "%03d" 는 ?자리수 표시 (ex, %3d == 001 012 123)
		}

		// ________________________________________________________________ //
		System.out.print("2) 단을 입력하세요 : ");
		dan = scanner.nextInt();
		for (dan = 2; dan <= 9; dan++) {
			System.out.println(dan);
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " X " + i + " = " + String.format("%03d", (dan * i)));
			}
			System.out.println("_______________________");
			System.out.println((dan + 1) + "단~!");
		}

		// ________________________________________________________________
		/*
		 * 구구단 시작 범위 입력 : 2 구구단 끝 범위 입력 : 4
		 */

		int startNum = 0;
		int endNum = 0;
		int temp = 0;

		System.out.print("시작 할 단 수를 입력해 주세요. : ");
		startNum = scanner.nextInt();

		System.out.print("끝날 단 수를 입력해 주세요. : ");
		endNum = scanner.nextInt();

		// 시작과 끝을 자동으로 변환
		/*
		 * startNum 은 temp 에 보관. startNum 의 값을 endNum 값으로 변환. startNum 의 값을 보관중인 endNum
		 * 에 삽입.
		 */

		// 사용자의 입력 정보 check
		if (startNum > endNum) {
			temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
		for (int i = startNum; i <= endNum; i++) {
			System.out.println((i) + "단~!");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + "=" + (i * j));
			}
			System.out.println("_______________________");
		}

		// ________________________________________________________________
		// 홀수단은 홀수 단위 구구단만, 짝수단은 짝수단위 구구단만 출력하기

		int odd = 1;
		int even = 0;

		for (int i = startNum; i <= endNum; i++) {
			System.out.println((i) + "단~!");
			System.out.println("temp odd even 초기값 : temp:"+temp+"/ odd:"+odd+ "/ even:"+even);

			temp = odd; //temp 은 홀짝구분 변수이고 데이터를 대입 (temp 1)
			System.out.println("tepm("+temp+")" +"<= odd("+odd+")");
			odd = even; //odd 에 even데이터(0) 를 대입 (odd 0)
			System.out.println("odd("+odd+")" +"<= even("+even+")");
			for (int j = 1; j <= 9; j += 2) {
				if (temp % 2 == 0 && j+1 != 10) { // i 의 나머지가 0일경우 짝수
						System.out.println(i + " X " + (j + 1) + "=" + (i * (j + 1)));
				} else if(temp % 2 == 1){ // i 의 나머지가 1일경우 홀수
					System.out.println(i + " X " + (j) + "=" + (i * (j)));
				}
			}
			even = temp;  // even 에 temp 데이터 (0) 을 대입 (0)
			System.out.println("even("+even+")" +"<= temp("+temp+")");
			System.out.println("______________________________________");
		}

		// ________________________________________________________________

		
//		for(int i = startNum; i<=endNum; i++) {
//			if(i%2==0) { //단이 짝수
//				for(int j=1; j<=9; j+=2) {
//					System.out.println(i + " X " + (j + 1) + "=" + (i * (j + 1)));
//				}
//			}else if(i%2==1) { //단이 홀수
//				for(int j=1; j<=9; j+=2) {
//					System.out.println(i + " X " + (j) + "=" + (i * (j)));
//				}
//			}
//		}
		/*
		 *  여기서 중복되는부분을 제거해야해
		 * 우선 
		 */
	
		// ________________________________________________________________

	}

}
