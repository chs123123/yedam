package com.yedam.lch.extendPkg;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton singleton1= Singleton.getInstance();
		Singleton singleton2= Singleton.getInstance();
		
		System.out.println(singleton1 == singleton2);

		args = new String[] {"str1", "str2", "str3"};
		PersonExample.main(args);
	}
}
