package com.yedam;

public class UseWrapperClass {
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Integer iInst = new Integer(123);
		showData(iInst);
		showData(new Double(7.15));
	}
}
