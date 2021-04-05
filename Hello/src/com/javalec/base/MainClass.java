package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {
		//comment 커멘트 - 주석
		/* ----------
		 * 슬레시 * 엔터
		 * ----------
		 */
		
		//화면에 문자열 상수 출력  syso 컨트롤스페이스 엔터
		System.out.println("------------");
		System.out.println("hello, World!");
		System.out.println("------------");

		System.out.print("------------");
		System.out.print("hello, World!");
		System.out.print("------------");
		
		//화면에 정수(숫자) 출력
		System.out.println(10);
		System.out.println(10 + 20); // 덧셈
		System.out.println(10 - 20); // 뺄셈
		System.out.println(10 * 20); // 곱셈
		System.out.println(10 / 20); // 나눗셈 = 정수 
		System.out.println(10.0 / 20.0); // 나눗셈 = '실수' 로 변경
		
		//화면 출력을 예쁘게 하기
		System.out.println("a " + "b");
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		System.out.println(10 + "-" + 20 + "=" + (10 - 20));
		System.out.println(10 + "*" + 20 + "=" + (10 * 20));
		System.out.println(10 + "/" + 20 + "=" + (10 / 20));
		System.out.println(10.0 + "/" + "20.0" + "=" + (10.0 / 20.0));
		}
	
}
