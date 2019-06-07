package com.oracle;

public class naw {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j) + "\t");
			if(i==j) {
				break;
			}
			}
			System.out.println();
		}

	}
	// TODO Auto-generated method stub

}

