package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기값이 없는 배열 선언 및 데이터 추가하기

		String[] str = new String[7];
		// 'String[]' 은 선언
		// 'String[7]' 7칸을 str변수에 넣는다고 설정, 0~6

		str[0] = "일요일";
		str[1] = "월요일";
		str[2] = "화요일";
		str[3] = "수요일";
		str[4] = "목요일";
		str[5] = "금요일";
		str[6] = "토요일";

		System.out.println(str + "?요일 배열");
		// 배열의 기본은 암호화라서 str이 표시되지 않는다
		System.out.println(str[1] + "," + str[3] + "," + str[5]);
		
		//________________________________________________________
		System.out.println("__________________________________");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		//________________________________________________________
		System.out.println("__________________________________");
		
		//초기값이 있는경우
		
		String[] str2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		for (int i = 0; i < str.length; i++) {
			System.out.println(str2[i]);
		}
				
		

		//________________________________________________________
		System.out.println("__________________________________");
		//________________________________________________________
		System.out.println("__________________________________");
		//________________________________________________________
		System.out.println("__________________________________");
	}

}
