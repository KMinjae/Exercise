package com.javalec.base;

import java.util.Scanner;

/**
 * 
 * @FileName : Main.java
 * @Project : Array210405
 * @Date : 2021. 4. 5.
 * @작성자 : gimminjae
 * @변경이력 :
 * @프로그램설명 : 10개의 점수 (0점 부터 99점)를 입력받아 점수의 분포를 10점 간격의 등급으로 된 히스토그램을 표시하라. Input
 *         score : 1의 score :34 2의 score :32 3의 score :55 4의 score :57 5의 score
 *         :59 6의 score :53 7의 score :90 8의 score :99 9의 score :88 10의 score :12
 *         ------------Histogram-------------- 90 : ## 80 : # 70 : 60 : 50 :
 *         #### 40 : 30 : ## 20 : 10 : # 0 :
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int[] point = new int[10];

		for (int i = 0; i <= 9; i++) {
			System.out.println("Input score");
			System.out.print(i + "의 score :");
			num = scanner.nextInt();
			
			
			
			if(num<0 || num>=100) {
				System.out.println("----------다시 입력해 주세요.----------");
				i--;
			}else {
				point[num / 10]++; // 샵 개수 증가
			}

			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("-----Histogram-----");
		for (int i = 9; i >= 0; i--) {
			System.out.print(i + "0 :");
			for (int j = point[i]; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}