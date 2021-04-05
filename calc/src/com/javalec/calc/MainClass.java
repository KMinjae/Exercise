package com.javalec.calc;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int num = 2;
//			System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		
		//사용자의 입력 데이터 받기
		Scanner scanner = new Scanner(System.in); 
		// 노란'scanner'는 인스턴스, 오브젝트, 객체 등등 으로 불린다.
		
		System.out.println("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		//scanner.nextInt(); // '.(점)' 뒤에를 메소드라고 한다.
		System.out.println("사용자 입력 숫자는 " + num + "입니다.");
		
		
		/*
		 * Exercise
		 * 
		 * 숫자를 입력해 주세요 : 12
		 * 
		 * 입력하신 숫자는 3의 배수 입니다.
		 * 
		 * ----------------
		 * 
		 * 숫자를 입력해 주세요 : 10
		 * 
		 * 입력하신 숫자는 3의 배수가 아닙니다.
		 * 
		 */
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int num2 = scanner.nextInt();
		System.out.println(num2%3 == 0 ? "입력하신 숫자 "+num2+"은(는) 3의 배수 입니다." : "입력하신 숫자 "+num2+"은(는)  3의 배수가 아닙니다.");
		
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int num3 = scanner.nextInt();
		System.out.println(num3%3 != 0 ? "입력하신 숫자 "+num3+"은(는) 3의 배수가 아닙니다." : "입력하신 숫자 "+num3+"은(는) 3의 배수 입니다.");

		Scanner scanner4 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int num4 = scanner.nextInt();		
		System.out.println("입력하신 숫자 "+num4+"은(는) 3의배수");
		System.out.println(num4 % 3 == 0 ? "입니다." : "가 아닙니다.3");

		Scanner scanner5 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int num5 = scanner.nextInt();		
		System.out.println("입력하신 숫자 "+num5+"은(는) ");
//		System.out.println(num5 % 3 == 0 ? "입니다." : "가 아닙니다.3");
		System.out.println(num5 % 2 == 0 ? "2의 배수 입니다." : num5 % 3 == 0 ? "3의 배수 입니다." : "모릅니다.");
		}

}
