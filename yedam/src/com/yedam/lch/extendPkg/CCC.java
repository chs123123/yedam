package com.yedam.lch.extendPkg;


public class CCC {
	public static void main(String[] args) {
		int[] [] ary = new int[5][5];
		int num = 1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				ary[i][j] = num;
				num++;
		}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%3d \t", ary[i][j]);
			}
			System.out.println();
		}	
		 
}
}
//private(해당클래스) , public(모든pkg)




/*
public static void main(String[] args) {
	int[] [] ary = new int[][] { {1},{2,3},{4,5,6}};
		System.out.println("[0] 의 크기: " + ary[0].length);
		System.out.println("[1] 의 크기: " + ary[1].length);
		System.out.println("[2] 의 크기: " + ary[2].length);
	*/