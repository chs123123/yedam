package com.yedam;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 5; i++) {
			int provlemLocation = car.run();
			switch (provlemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어 교체.");
				car.tires[0] = new HankookTire("앞왼쪽", 20);
				break;

			case 2:
				System.out.println("앞오른쪽 타이어 교체.");
				car.tires[1] = new Tire("앞오른쪽", 9);
				break;
			case 3:
				System.out.println("뒤왼쪽 금호타이어 교체");
				car.tires[2] = new KumhoTire("뒤왼쪽", 60);
				break;
			case 4:
				System.out.println("뒤오른쪽타이어 교체");
				car.tires[3] = new Tire("뒤오른쪽", 7);
				break;

			}
			System.out.println("----------------------------------------------------");
		}
	}
}
