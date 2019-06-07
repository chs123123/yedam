package com.oracle;

public class MethodDef {

	public static void main(String[] args) {
		System.out.println("프로그램시작.");
		hiEveryOne(20);
		hiEveryOne(40, 163.3);
		int score = sumScore(50, 60, 70);
		System.out.println("score: " + score);
		goodBye();
		double avg = avgScore(50, 65);
		System.out.println();
		System.out.println("프로그램종료.");
	}
	public static double avgScore(int a, int b) {
		return ((double)a + (double)b) / 2;
	}

	public static int sumScore(int m, int e, int k) {
		return (m + e + k);
	}

	public static void hiEveryOne(int age) {
		System.out.println("Hell, everyone");
		System.out.println("I am " + age + " old.");
	}

	public static void hiEveryOne(int age, double height) {
		System.out.println("Hell, everyone");
		System.out.println("I am " + age + " old.");
		System.out.println("I am " + height + " cm. ");
	}

	public static void goodBye() {
		System.out.println("bye");
	}

}
