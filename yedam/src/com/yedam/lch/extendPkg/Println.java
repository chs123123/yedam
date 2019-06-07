package com.yedam.lch.extendPkg;

public class Println {
		public static void main(String[] args) {
			System.out.println("main 메소드입니다.");
			int num = println(30, 2);
			System.out.println(num + "main 메소드입니다.종료");
		}
		
		static int println(int a, int b) {
			System.out.println("----------------");
			return a / b;
		}
}
