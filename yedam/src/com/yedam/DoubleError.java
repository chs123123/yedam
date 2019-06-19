package com.yedam;

import java.math.BigDecimal;

public class DoubleError {
	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("1.6");
		BigDecimal d2 = new BigDecimal("0.1");
		System.out.println("덧셈 결과: " + d1.add(d2));
		System.out.println("곱셈 결과: " + d1.multiply(d2));
		
	}
}




/*
double d1 = 1.6;
double d2 = 0.1;
System.out.println("덧셈 결과: " + (d1 + d2));
System.out.println("곱셈 결과: " + (d1 * d2));
*/
