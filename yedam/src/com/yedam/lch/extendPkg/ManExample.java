package com.yedam.lch.extendPkg;

import java.util.Scanner;

public class ManExample {
	public static void main(String[] args) {
		// 정보를 담을 Man클래스의 배열을 선언
		Man[] manAry = new Man[5];

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		String name, company, major;
		while (true) {
			System.out.println("입력하세요. 1)학생정보입력 2)교수정보입력 3)전체조회 4)종료.");
			menu = sc.nextInt();
			if (menu == 1) {
				// 화면에 사용자에게 입력해야할 정보를 보여준다.
				System.out.println("1번을 선택했습니다.");
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				System.out.println("학번을 입력하세요.");
				major = sc.next();
				sc.nextLine();

				// 대학동기의 정보입력
				Man man = new UnivMan(name, major);
				insertInfo(man, manAry);

			} else if (menu == 2) {
				// 화면에 사용자에게 입력해야할 정보를 보여준다.
				System.out.println("2번을 선택했습니다.");
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				System.out.println("교수번호을 입력하세요.");
				company = sc.next();
				sc.nextLine();

				// 거래처의 정보입력
				Man man = new BusineseMan(name, company);
				insertInfo(man, manAry);

			} else if (menu == 3) {
				// 전체조회하기.
				System.out.println("3번을 선택했습니다.");
				listInfo(manAry);

			} else {
				System.out.println("종료합니다.");
				// break;
				System.exit(0);
			}
		}
//		System.out.println("프로그램 끝...");
	}

// 입력된 정보를 조회하는 메소드 ..
	static void listInfo(Man[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] != null)
				mAry[i].tellYourName();
		}
	}

// 배열에 한건을 입력하는 메소드 ..
	static void insertInfo(Man m, Man[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] == null) {
				mAry[i] = m;
				break;
			}
		}
		System.out.println("입력되었습니다.");
	}
}
