package com.yedam;

public class Student {
//필드
	private String num;
	private String name;
	private String major;
//생성자
	
	Student(){
	}
	Student(String num, String name, String major){
		this.num = num;
		this.name = name;
		this.major = major;
	}
//메소드
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
