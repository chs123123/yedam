package com.oracle;

import java.util.Scanner;

public class MethodSample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 : "); //1
		int num1 = sc.nextInt(); //2
		int num2 = sc.nextInt(); //4
		gugudan(num1, num2);
		
	}
	
	public static void gugudan(int num1, int num2) {
		System.out.println(num1 + "단 입니다.");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
		}
		System.out.println(num2 + "단 입니다.");
		for (int i = 1; i <= 9; i++)
			System.out.println(num2 + " * " + i + " = " + (num2 * i));
	}
}
