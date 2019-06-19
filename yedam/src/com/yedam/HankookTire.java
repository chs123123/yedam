package com.yedam;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // 매개값이 2개인 생셩자를 super 호출.
	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if (accmulateRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accmulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " HankookTire 펑크***");
			return false;
		}
	}
}
