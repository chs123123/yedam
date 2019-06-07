package com.yedam.lch.extendPkg;

public class Singleton {
	// static 객체를 생성.
	private static int num;
	private static Singleton singLeton = new Singleton();
	private Singleton() {
	
	}
	static Singleton getInstance() {
		return singLeton;
	}
	void setNum(int a) {
		this.num =a;
		}
	int getNum() {
		return num;
	}
}
