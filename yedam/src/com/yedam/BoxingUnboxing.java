package com.yedam;

public class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);
		Double dObj = new Double(3.14);
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();

		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		iObj = new Integer(num1 + 10); // iObj.intValue()
		dObj = new Double(num2 + 1.2); // dObj.doubleValue()
		System.out.println(iObj);
		System.out.println(dObj);
	}

}
