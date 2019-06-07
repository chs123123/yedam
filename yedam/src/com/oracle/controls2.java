package com.oracle;

public class controls2 {
	public static void main(String[] args) {
		int num = 1;
		// while loop
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		// do ... while loop
		// 2*1=1, 2*2=4,.....
		num = 1;
		do {
			System.out.println("2 * " + num + " = " + (2 * num));
			num++;
		}	while (num <= 4);
		
		// for loop;
		for (int i = 0; i < 5; i++) {
			System.out.println("i  = " + i);
			for(int j = 0; j < 5; j++) {
				System.out.print("i, j => " + i + ", " + j + "\t");
			}
			System.out.println();
		}
		}

}
