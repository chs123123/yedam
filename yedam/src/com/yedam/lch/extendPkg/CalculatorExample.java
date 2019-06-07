package com.yedam.lch.extendPkg;

public class CalculatorExample {
	public static void main(String[] args) {
		int result = Calculator.minus(30, 20);// 정적메소드(static) (new안만들어도된다)
		System.out.println("결과값은:" + result);
		result = Calculator.plus(30, 20);
		System.out.println("결과값은:" + result);

		double result1 = Calculator.plus(23.5, 12.5);
		
		System.out.println("결과값은:" + result1);
		result1 = Calculator.minus(34.2, 12.9);
		System.out.println("결과값은:" + result1);
		result1 = Calculator.multi(20, 15);
		System.out.println("X결과값은:" + result1);
		result1 = Calculator.divide(20, 10);
		System.out.println("/결과값은:" + result1);

		System.out.println(Calculator.PI);

		result1 = Calculator.execute(23.5, 12.5, "+");
		System.out.println("결과값은:" + result1);

		result1 = Calculator.getRect(23, 23);
		System.out.println("결과값은:" + result1);

		int sum = getArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("합:" + sum);
	}

	static int getArgs(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 1)
				sum = sum + values[i];
		}
		return sum;
	}

}
