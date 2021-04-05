package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int count2 = 0;
		int sum = 0;
		int num = 0;
		
		
		System.out.println("몇개의 숫자를 더할까요 ? : ");
		count = scanner.nextInt();

		System.out.println(count+"개의 숫자를 입력하세요.");
		while(true) {
			count2 = scanner.nextInt();
			sum += count2;
			num += 1;
			if(num == count) {
				break;
			}
		}
//		
//		for(int i = 1; i <= count; i++) {
//			count2 = scanner.nextInt();
//			sum += count2;
//		}
		System.out.println("입력한 숫자의 합은 " + sum + " 입니다.");
		// _______________________________________________________??
	}
}
