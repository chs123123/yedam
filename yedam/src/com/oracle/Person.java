package com.oracle;

public class Person {
	String name;
	int age;
	int height;
	
	Person(){
		
	}
	
	Person(String a, int age, int height){
		name = a;
		age = age;
		height = height;
	}

	void introduc() {
		System.out.println("저의 이름은" + name + "입니다.");
		System.out.println("저의 나이는" + age + "입니다.");
		System.out.println("저의 키는" + height + "입니다.");
	}
}
