package com.javalec.base;

import java.util.Scanner;

public class MainQuiz3 {
	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int[] point = new int[20];
//
//		System.out.println("Korean의 성적을 입력");// ---------------국어
//		for (int i = 0; i <= 3; i++) {
//			System.out.print("No" + (i + 1) % 5 + "의 성적은 : ");
//			point[i] = scanner.nextInt();
//		}
//
//		System.out.println("English의 성적을 입력");// ---------------영어
//		for (int i = 4; i <= 7; i++) {
//			System.out.print("No" + (i + 2) % 5 + "의 성적은 : ");
//			point[i] = scanner.nextInt();
//		}
//
//		System.out.println("mathematics의 성적을 입력");// ---------------수학
//		for (int i = 8; i <= 11; i++) {
//			System.out.print("No" + (i + 3) % 5 + "의 성적은 : ");
//			point[i] = scanner.nextInt();
//		}
//
//		for (int i = 0; i <= 3; i++) { // -------------------토탈 / 평균
//			point[i + 12] = point[i] + point[i + 4] + point[i + 8];
//			point[i + 16] = point[i + 12] / 3;
//		}
//
//		// _________출력________________
//		System.out.println("\tKorea\tEnglish\tMathmotics\tTotal\tAverage");
//		for (int i = 0; i <= 3; i++) {
//			System.out.println("No" + (i + 1) + "\t" + point[i] + "\t" + point[i + 4] + "\t" + point[i + 8] + "\t\t"
//					+ point[i + 12] + "\t" + point[i + 16]);
//
//		}

//________________________________________________________________________________________________

		Scanner scanner = new Scanner(System.in);
		double[] point = new double[20];

		for (int j = 0; j <= 11; j++) {
			switch (j) {
			case 0:
				System.out.println("Korean의 성적을 입력");// ---------------국어
				break;
			case 4:
				System.out.println("English의 성적을 입력");// ---------------영어
				break;
			case 8:
				System.out.println("mathematics의 성적을 입력");// ---------------수학
				break;
			}
			System.out.print("No" + ((j % 4) + 1) + "의 성적은 : ");
			point[j] = scanner.nextInt();
		}

		for (int i = 0; i <= 3; i++) { // -------------------토탈 / 평균
			point[i + 12] = point[i] + point[i + 4] + point[i + 8];
			point[i + 16] = point[i + 12] / 3;
		}

		// _________출력________________
		System.out.println("\tKorea\tEnglish\tMathmotics\tTotal\tAverage");
		for (int i = 0; i <= 3; i++) {
			System.out.println("No" + (i + 1) + "\t" 
					+ String.format("%.0f", point[i]) + "\t"
					+ String.format("%.0f", point[i + 4]) + "\t" 
					+ String.format("%.0f", point[i + 8]) + "\t\t"
					+ String.format("%.0f", point[i + 12]) + "\t" 
					+ String.format("%.2f", point[i + 16]));
		}

	}

}
