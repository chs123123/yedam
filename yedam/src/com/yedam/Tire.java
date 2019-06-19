package com.yedam;

public class Tire {
	// 필드
	public int maxRotation; // 사용가능한 최대회전수
	public int accmulateRotation; // 현재 누적된 회전수
	public String location; // 장착위치..왼쪽앞,왼쪽뒤,오른쪽앞,오른쪽뒤
	// 생성자

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accmulateRotation;
		if (accmulateRotation < maxRotation) {
			System.out.println(location + "Tire수명" + (maxRotation - accmulateRotation));
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크***");
			return false;
		}
	}

}
