package com.yedam.lch.extendPkg;

import java.util.Scanner;

public class InterfaceManExe {
	public static void main(String[] args) {
		InterfaceMan[] iAry = new InterfaceMan[5];
Man[] manAry = new Man[5];
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		String name, company, major;
		while (true) {
			System.out.println("입력하세요. 1)학생정보입력 2)교수정보입력 3)전체조회 4)종료.");
			menu = sc.nextInt();


			if (menu == 1) {
				System.out.println("이름을 입력하세요");
				name = sc.next();
				sc.nextLine();
				System.out.println("학번을 입력하세요");
				major = sc.next();
				sc.nextLine();
			
				Man man = new Student(name, major);
				insertInfo(man, manAry);

			} else if (menu == 2) {
				System.out.println("2번을 선택했습니다.");
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				System.out.println("교수번호를 입력하세요.");
				company = sc.next();
				sc.nextLine();

				Man man = new Professor(name, company);
				insertInfo(man, manAry);

			} else if (menu == 3) {
				System.out.println("3번을 선택했습니다.");
				listInfo(manAry);

			} else {
				System.out.println("종료합니다");
				System.exit(0);
			}
		}
	}

	private static void listInfo(Man[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] != null)
				mAry[i].tellYourName();
		}

	}

	private static void insertInfo(Man man, Man[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] == null) {
				mAry[i] = man;
				break;
			}
		}
		System.out.println("입력되었습니다.");

	}

}

