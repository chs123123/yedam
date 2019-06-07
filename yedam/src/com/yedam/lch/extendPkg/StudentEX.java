package com.yedam.lch.extendPkg;

public class StudentEX {
		public static void main(String[] args) {
		Student student = new Student("1111","홍길동","English"
				+ "","1990년10월2일");
		Student student2 = new Student();
		Student stident3 = new Student("똥", "computer");
		System.out.println(student.getStudentNo());
		System.out.println(student.getName());
		System.out.println(student.getMajor());
		System.out.println(student.getBirthday());
		//Student 필드에 학생생일 담을 수 있는 필드 선언.
		//set, get 메소드
		//2)Student 클래스의 메소드추가.
		//void getStudentIfo()=> 학번:1111, 이름: 홍길동, 전공: Englist, 생일:1990년10월9일
		student.getStudentInfo();
		student.setBirthday("1990년10월2일");
		
		}
}
