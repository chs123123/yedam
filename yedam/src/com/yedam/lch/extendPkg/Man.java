package com.yedam.lch.extendPkg;

public class Man {
	// 필드
	String name;
	// 생성자
	Man(){ } // default 생성자.
	Man(String name){
		this.name = name;
	}
	// 메소드
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}
	