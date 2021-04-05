package com.javalec.base;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if문과 sitch
		// 선언문____________________________________________
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0; // 사용자 입
		String result = ""; // 처리 결과 저장

		// 처리_____________________________________________
		System.out.println("숫자를 입력하세요.");
		inputNumber = scanner.nextInt();

//		if(inputNumber % 2 == 0) { //짝수 판
//			result = "짝수";
//		}else { //홀수 판
//			result = "홀수";
//		}

		switch (inputNumber % 2) {
		case 0:
			result = "짝수";
			break;
		case 1:
			result = "홀수";
			break;
		default:
			break;

		}

		// 결과 보여주기______________________________________
		System.out.println("입력하신 숫자 " + inputNumber + "은(는) " + result + "입니다.");

		// if 프로젝트 해봤던거 다시해보기
		/*
		 * 성적을 입력하세요 : 90 귀하의 학점은 A학점 입니다.
		 * 
		 * 성적을 입력하세요 : 80 귀하의 학점은 B학점 입니다.
		 * 
		 * 성적을 입력하세요 : 70 귀하의 학점은 C학점 입니다.
		 * 
		 * 성적을 입력하세요 : 60 귀하의 학점은 D학점 입니다.
		 * 
		 * 성적을 입력하세요 : 50 귀하의 학점은 F학점 입니다.
		 * 
		 */
		// 선언문
		int point = 0; // 성적입력
		int trueFulse = 1; // 값입력 에러 및 출력 표시 결정
		String grade = ""; // 학점표시

		// 처리문
		System.out.print("성적을 입력하세요. : ");
		point = scanner.nextInt(); // 성적 입력
		System.out.println("입력하신 성적 : " + point);// 성적 다시확인차 표시

		if (point <= 100 && point >= 0) {
			switch (point / 10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
			}
			trueFulse = 1;//학점 결정 완료 , 스위치 
		} else {
			trueFulse = 0;//학점 결정 완료 , 스위치 
		}

		// 출력문
		switch (trueFulse) {
		case 1:
			System.out.println("당신의 성적은 " + grade + "학점 입니다.");
			break;
		case 0:
			System.out.println("잘못 입력 하셨습니다. 100이하 0이상의 성적으로 다시 처음부터 입력해 주세요.");
			break;

		default:
			break;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
