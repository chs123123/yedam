package com.oracle;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Controcls {

	public static void main(String[] args) {
		boolean bool = false;
		int num1 = 10;
		int num2 = 20;
		bool = (num1 > num2);
				System.out.println(bool);
		if (num1 > 0 && num1 < 10)
			System.out.println("result is true");
		else
			System.out.println("result is false");
		
		if(num1 > 5)
			System.out.println("0 초과.");
		else if (num1 > 0)
			System.out.println("5 초과.");
		else if (num1 > 10)
			System.out.println("10 초과.");
		else
			System.out.println("else");
		num1 = 20;
		if(num1 > 0) {
			if(num1 % 2 == 0) {
				System.out.println("2의 배수.");
			} else {
				System.out.println("2의 배수 아님.");
			}
		} else {
			System.out.println("양수 아님.");
					}
		}
}


