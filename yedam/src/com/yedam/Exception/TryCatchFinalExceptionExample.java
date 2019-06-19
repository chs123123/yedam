package com.yedam.Exception;

public class TryCatchFinalExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
	try {
	data1 = args[0];
	data2 = args[1];
	int num1 = Integer.parseInt(data1);
	int num2 = Integer.parseInt(data2);
	int result = num1 + num2;
	System.out.println(num1 +"+" + num2 + "=" + result);
	}catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
		System.out.println("실행매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		//System.out.println("실행방법:");
		//System.out.println("java TryCatchFinalExceptionExample num1 num2");
	}catch (Exception e) {
		System.out.println("알 수 없는 예외 발생.");
	}finally {
		System.out.println("다시 실행해주세요.");
	}
	
}
}