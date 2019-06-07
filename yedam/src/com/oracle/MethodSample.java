package com.oracle;

public class MethodSample {

	public static void main(String[] args) {
		int reslut = absMinus(5, 3);
		System.out.println(reslut);
		System.out.println(println);
	}

	public static int reslut(int a, int b) {
		return (a * b);
	}

	public static String println(String a) {
		return (a);

	}

	public static int absMinus(int a, int b) {
		if (a > b) {
			return (a - b);
		} else
			return (b - a);
	}

	

}
