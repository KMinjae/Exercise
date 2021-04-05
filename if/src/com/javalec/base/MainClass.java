package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교문 #1
		int i = 10;
		int j = 20;
		int k = 10;
		
		
		if(i > j) {
			System.out.println("i가 j보다 큽니다.");
		}
		System.out.println(">>> End <<<");
		
		//비교문 #2 : 비교문으로 입력한 숫자 크기의 차이 구하기.
		
		if(i>j) {
			System.out.println("i는 j보다" + (i - j) + "만큼 큽니다.");
		}else {
			System.out.println("j는 i보다"+ (j - i) + "만큼 큽니다.");
		}
		
		//비교문#3 : 비교문으로 크다, 작다, 같다의 3종류 이상의 비교문
		if(i>j) {
			System.out.println("i가 j보다 큽니다.");
		}else if(i==j) {
			System.out.println("i와 j가 같습니");
		}else {
			System.out.println("i와 j가 다릅니");			
		}
		
		int price = 5000;
		if(price > 8000) {
			System.out.println("너무 비쌉니다.");
		}else if(price >5000) {
			System.out.println("조금 비쌉니다.");
		}else if(price >3000) {
			System.out.println("적당한 금액 입니다.");
		}else {
			System.out.println("싼편 입니다.");
		}
		System.out.println("구입 하실래요?");
		
		
		/*
		 * 성적을 입력하세요 : 90
		 * 귀하의 학점은 A학점 입니다.
		 * 
		 * 성적을 입력하세요 : 80
		 * 귀하의 학점은 B학점 입니다.
		 * 
		 * 성적을 입력하세요 : 70
		 * 귀하의 학점은 C학점 입니다.
		 * 
		 * 성적을 입력하세요 : 60
		 * 귀하의 학점은 D학점 입니다.
		 * 
		 * 성적을 입력하세요 : 50
		 * 귀하의 학점은 F학점 입니다.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int num = scanner.nextInt();
		String point = "";
		
		if(num > 100) {
			point = "error";
		}else if(num >= 90) {
			point = "A";
		}else if(num >= 80 ) {
			point = "B";
		}else if(num >= 70) {
			point = "C";
		}else if(num >= 60) {
			point = "D";
		}else if(num >= 0){
			point = "F";
		}else {
			point = "error";
		}
		

		if(point == "error") {
			System.out.println("점수를 잘못 입력 하셨습니다.");
		}else{
			System.out.println("귀하는 "+ point +"학점 입니다.");
		}
	
		/*
		 * 국어 점수를 입력하세요
		 * 90
		 * 영어 점수를 입력하세요
		 * 70
		 * 수학점수를 입력하세요
		 * 60
		 * 평균점수 : 80.0
		 * 국어 점수는 평균 보다 높습니다.
		 * 영어 점수는 평균 점수 입니다.
		 * 수학 점수는 평균 보 낮습니다.
		 * 
		 */
		
		 Scanner scan1 = new Scanner(System.in);
		 Scanner scan2 = new Scanner(System.in);
		 Scanner scan3 = new Scanner(System.in);
		 double Korea = 0;
		 double English = 0;
		 double Math = 0;
		 double average = 0;
		 
		 System.out.println("국어 점수를 입력하세요.");
		 Korea = scan1.nextInt();
		 System.out.println("영어 점수를 입력하세요.");
		 English = scan2.nextInt();
		 System.out.println("수학 점수를 입력하세요.");
		 Math = scan3.nextInt();
		 average = (Korea + English + Math) / 3;

		 if(Korea > 100 || English > 100 || Math > 100) {
			 System.out.println("점수를 다시 입력하세요.");
		 }else if(Korea < 0 || English < 0 || Math < 0) {
			 System.out.println("점수를 다시 입력하세요.");
		 }else {
			 System.out.println("평균 점수 : " + average);
			 System.out.print("국어 점수는 평균점수 ");
			 if(Korea > average) {
				 System.out.println("보다 높습니다.");
			 }else if(Korea == average) {
				 System.out.println("입니다.");
			 }else {
				 System.out.println("보다 낮습니다.");
			 }

			 System.out.print("영어 점수는 평균점수 ");
			 if(English > average) {
				 System.out.println("보다 높습니다.");
			 }else if(English == average) {
				 System.out.println("입니다.");
			 }else {
				 System.out.println("보다 낮습니다.");
			 }

			 System.out.print("수학 점수는 평균점수 ");
			 if(Math > average) {
				 System.out.println("보다 높습니다.");
			 }else if(Math == average) {
				 System.out.println("입니다.");
			 }else {
				 System.out.println("보다 낮습니다.");
			 }
		 }
		 

		 double kg = 0;
		 double cm = 0;
		 double bmi = 0;
		 String riskIndex = "";
		 Scanner scan4 = new Scanner(System.in);
		 Scanner scan5 = new Scanner(System.in);
		 
		 System.out.println("<---- BMI 지수 구하기 ---->");
		 System.out.print("몸무게를 입력해 주세요. (단위 : kg) : ");
		 kg = scan4.nextInt();
		 if(kg <= 0) {
			 System.out.print("(0이하 제외) 몸무게를 입력해 주세요. (단위 : kg)");
			 System.out.print("처음부터 다시 시작해 주십시오.");
		 }else{
			 System.out.print("키를 입력해 주세요. (단위 : cm) : ");
			 cm = scan5.nextInt();
			 if(cm <= 0) {
				 System.out.print("(0이하 제외) 키를 입력해 주세요. (단위 : cm) : ");
				 System.out.print("처음부터 다시 시작해 주십시오.");
			 }else {
				 cm = cm/100;
				 bmi = kg / (cm * cm);
				 System.out.println("당신의 BMI 지수는 " + bmi + " 입니다.");
				 System.out.print("당신의 위험지수는 : ");
				 if(bmi >= 30) {
					 riskIndex = "고도비만";
				 }else if(bmi >= 25) {
					 riskIndex = "중도비만";
				 }else if(bmi >= 23) {
					 riskIndex = "비만";
				 }else if(bmi >= 18.5) {
					 riskIndex = "정상";
				 }else{
					 riskIndex = "저체중";
				 }
				 System.out.println(riskIndex + "입니다.");
			 }	 
		 }
	}
}
