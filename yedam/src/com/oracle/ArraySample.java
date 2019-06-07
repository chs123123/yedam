package com.oracle;

public class ArraySample {

	public static void main(String[] args) {
		int[] ary = { 1, 2, 30 }; // int ary[] = {1,2,3};
		int[] arry = new int[5];
		System.out.println("ary의 배열크기 : " + ary.length);

		
		
		
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}

		
		
		
		
		
		
		System.out.println("arry의 배열크기 : " + arry.length);
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
		// arry[0] = 10; arry[1] =20;.....
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (i + 1) * 10;
			}
		System.out.println("값이 할당된 후...");
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);

		}
		int sum = 0;
		for (int i = 0; i < arry.length; i++) {
			sum = sum + arry[i];
		}
		System.out.println("합계는 :" + sum + "입니다.");
		// arry = 10,20,30,...
		int result = sum(arry);
	}

	static int sum(int[] ary) {
		int sum = 0;
		return sum;

		// while...100,200,300,...

	}
}
