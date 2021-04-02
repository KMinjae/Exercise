package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ______________________선언문_______________________________
		System.out.println("__________________________________");
		Scanner scanner = new Scanner(System.in);
		String[] names = { "", "", "James", "Cathy", "Kenny", "Martin", "Crystal" }; // 이름 배열
		int[] cm = new int[7]; // 키입력 배열
		int sum = 0; // 합산
		double avg = 0; // 평균계산

		// ________________________처리문____________________________
		System.out.println("__________________________________");
		
		
		for (int i = 2; i < names.length; i++) {
			System.out.println(names[i] + "의 신장을 입력하세요. : ");
			cm[i] = scanner.nextInt();// ___________________입력
			if (cm[0] <= cm[i]) { // ______________________크면
				names[0] = names[i];
				cm[0] = cm[i];
			}
			if (cm[1] >= cm[i] || cm[1] == 0) { // ________________작으면
				names[1] = names[i];
				cm[1] = cm[i];
			}
			sum += cm[i];// ________________________________평균값 계산을 위한 합산	
		}
		avg = (double) sum / (cm.length - 2);

		// ____________________출력문________________________________
		System.out.println("__________________________________");
		System.out.println("평균신장은 : " + String.format("%.2f", avg));
		System.out.println("가장 큰 학생은 " + names[0] + " 이며 그학생의 키는 " + cm[0]);
		System.out.println("가장 작은 학생은 " + names[1] + " 이며 그학생의 키는 " + cm[1]);
	}

}
