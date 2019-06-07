package com.yedam;

public class Professor {
//필드 (속성) (String타입) (타입이 오고 뒤에 변수)
	private String prfNo;
	private String name;
	private String major;

//생성자
	public Professor() {
	}

	public Professor(String prfNo, String name, String major) {
		this.prfNo = prfNo;
		this.name = name;
		this.major = major;
	}

	public String getPrfNo() {
		return prfNo;
	}

	public void setPrfNo(String prfNo) {
		this.prfNo = prfNo;
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

	@Override
	public String toString() {
		return "Professor [prfNo=" + prfNo + ", name=" + name + ", major=" + major + "]";
	}

//메소드: 클라스안에

}
