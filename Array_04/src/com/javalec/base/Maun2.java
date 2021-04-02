package com.javalec.base;

public class Maun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long multiply = 1;
		for(int i=0; i<=10; i++) {
			System.out.println("10^" + String.format("%2d", i) + " = " + String.format("%11d", multiply));
			multiply *= 10;
			System.out.println("10^" + String.format("%2d", i) + " = " + String.format("%11d", multiply));
			multiply *= 10;
			System.out.println("10^" + String.format("%2d", i) + " = " + String.format("%11d", multiply));
			multiply *= 10;
		}
	}
}
