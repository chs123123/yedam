package com.yedam;

public class Chs {
	private String name;
	private String num;
	private String major;
	
	public Chs() {
}
	public Chs(String name, String num, String major) {
			this.name = name;
			this.num = num;
			this.major = major;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getnum() {
		return num;
	}	
	
	public void setnum(String num) {
		this.num = num;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return "Choi [name:" + name + " num:" + num + " major:" + major + "]" ; 
	}
}

