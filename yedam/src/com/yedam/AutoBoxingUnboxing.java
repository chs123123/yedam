package com.yedam;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		Integer iObj = 10;
		Double dObj = 3.14;
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj;
		double num2 = dObj;
		System.out.println(num1 + 20);
		System.out.println(num2 + 5.1);
	}
}
