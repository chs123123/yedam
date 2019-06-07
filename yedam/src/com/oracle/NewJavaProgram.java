package com.oracle;

public class NewJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result, num1, num2;
		num1 = 10;
		num2 = 20;
		result = num1 + (num2 * 3) + (30 / num1) - 10;
		result = num1 % num2;
		System.out.println(result); // 10

		result += 20; // result = result + 20;
		System.out.println(result);

		boolean bool2;
		bool2 = (1 > num1);
		System.out.println(bool2); // false

		bool2 = (1 < num1) && (10 > num2); // true and true
		System.out.println(bool2); // false

		bool2 = (1 < num1) || (10 < num2); // true and true
		System.out.println(bool2); // false

		bool2 = !bool2;

		if (bool2)
			System.out.println("result value true");
		else
			System.out.println("result value false");

		int num4 = 0;
		System.out.println(num4++); // num4 = num4 + 1;
		System.out.println(num4);

		// bit operation
		int a = 3;
		int b = 2;
		result = a & b;
		System.out.println(a + " & " + b + " = " + result);
	}
}