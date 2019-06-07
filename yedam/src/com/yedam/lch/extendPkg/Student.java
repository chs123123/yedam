package com.yedam.lch.extendPkg;

public class Student extends Man {
	// 필드
	private String studentNo;
	private String name;
	private String major;
	private String birthday;

	// 생성자
	Student() {
	}

	Student(String name, String major) {
		super(name);
		this.major = major;
	}

	Student(String studentNo, String name, String major, String birthday) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
		this.birthday = birthday;
	}

	// 메소드
	String getStudentNo() {
		return this.studentNo;
	}

	String getName() {
		return this.name;
	}

	String getMajor() {
		return this.major;
	}

	void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	void setName(String name) {
		this.name = name;
	}

	void setMajor(String major) {
		this.major = major;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", major=" + major + ", birthday" + birthday
				+ "]";
			}
	public void getStudentInfo() {
		System.out.println("Student [학번=" + studentNo + ", 이름=" + name + ", 전공=" + major + ", 생일" + birthday
				+ "]");
	}

}