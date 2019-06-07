package com.yedam.lch.extendPkg;

public class Calculator {
	static double PI = 3.14; // static 필드
	String color; // instance필드

	// instance 메소드
	void setColor(String color) {
		this.color = color;
	}

	// static 메소드
	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	// 추가 ...plus,minus
	static double plus(double x, double y) {
		return x + y;
	}

	static double minus(double x, double y) {
		return x - y;
	}

	static double multi(double x, double y) {
		return x * y;
	}

	static double divide(double x, double y) {
		return x / y;
	}

	static double execute(double x, double y, String z) {
			if(z == "*") {
				return multi(x, y);
			}else if(z == "+"){
				return plus(x, y);
			}else if(z == "-"){
				return minus(x, y);
			}else if(z == "/") {
				return divide(x, y);
			}else {
				return 0;
			}
	}	
	
	static double getRect(double a, double b) {
		 return a * b;
	}

}