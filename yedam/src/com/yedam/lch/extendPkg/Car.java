package com.yedam;

public class Car {
	// 필드
//	Tire frontLeftTire = new Tire("앞왼쪽", 6);
//	Tire frontRightTire = new Tire("앞오른쪽", 2);
//	Tire backLeftTire = new Tire("뒤왼쪽", 3);
//	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// frontLeftTire => 배열의 첫번째위치. frontRightTire => 배열의 두번째위치
	// backLeftTire => 배열의 세번째위치. backRightTire => 배열의 네번째위치
	Tire[] tires = {new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4)};
	// run() 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0; i<4; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i+1;
			}
		}
//		if(frontLeftTire.roll() == false) {
//			stop();
//			return 1;
//		}
//		if(frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if(backLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if(backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
