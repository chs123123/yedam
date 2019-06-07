package com.yedam.lch.extendPkg;

public class StudyClassMain {
	public static void main(String[] args) {
		StudyClass sclass = new StudyClass();
		// 1.반정보생성
		Professor professor = new Professor("p1111","김교수","english");
		Student student1 = new Student("s1111", "이", "english");
		Student student2 = new Student("s2222", "김", "english");
		Student student3 = new Student("s3333", "박", "english");
		Student[] studentAry = {student1, student2, student3};
		sclass.setClassName("English");
		sclass.setProfessor(professor);
		sclass.setStudentAry(studentAry);
		System.out.println(sclass.classInfo());
	}
}
