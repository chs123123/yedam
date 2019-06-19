package com.yedam.Exception;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
			e.printStackTrace();
		}
	}
	static void findClass() throws ClassNotFoundException {
		Class t = Class.forName("java.lang.String2");
		System.out.println(t.getName());
	}
}
