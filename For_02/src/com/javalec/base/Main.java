package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("apple\nBanana\nGrape"); // new line
		System.out.println("apple\tBanana\tGrape"); // tab
		System.out.println("apple \"Banana\" Grape"); // "
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " X " + i + " = " + j * i + "\t");
			}
			System.out.println("");
		}
		// ________________________________________________________________

		Scanner scanner = new Scanner(System.in);
		int startNum = 0;

		System.out.println("시작할 단 입력 :");
		startNum = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.print(startNum + " X " + i + " = " + (startNum * i) + "\t");
			System.out.print(startNum + 1 + " X " + i + " = " + ((startNum + 1) * i) + "\t");
			System.out.print(startNum + 2 + " X " + i + " = " + ((startNum + 2) * i) + "\t");
			System.out.print(startNum + 3 + " X " + i + " = " + ((startNum + 3) * i) + "\t");
			System.out.println();
		}
		// ________________________________________________________________
		/*
		 * 단을 입력하세요 : 2 2 X 1 = 2 2 X 2 = 4 2 X 3 = 6 2 X 4 = 8
		 */

		scanner = new Scanner(System.in);
		startNum = 0;

		System.out.println("시작할 단 입력 :");
		startNum = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.print(startNum + "X" + i + "=" + (startNum * i) +"\t");
			if (i % 3 == 0) {
				System.out.println();
			}
		}

		// ________________________________________________________________
		
		for(int i=2; i<=9; i++){
			System.out.println(i+" X 1"+" = "+ i*1 + "\t"
					+ i+" X 2"+" = "+ i*2+ "\t"
					+ i+" X 3"+" = "+ i*3+ "\t");
		}
	}
}
