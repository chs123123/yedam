package com.yedam.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	static List<Student> list = new LinkedList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		while(start) {
		int Number = sc.nextInt();
		switch(Number) {
		case 1:
		System.out.println("학번을 입력하세요.");
		String sNo = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("전공을 입력하세요.");
		String major = sc.nextLine();
		Student student = new Student(sNo,name,major);
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		}
		}
	}
}
