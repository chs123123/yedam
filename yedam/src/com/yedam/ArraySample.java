package com.oracle;

class Friend {
	String name;
	String phone;
	int age;

	Friend(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	String getPhone() {
		return phone;
	}
}

public class ArraySample {
	public static void main(String[] args) {
		Friend fr1 = new Friend("홍길동");
		Friend fr2 = new Friend("김길동");
		Friend fr3 = new Friend("이길동");
		fr1.setPhone("1111");
		fr2.setPhone("2222");
		fr3.setPhone("3333");
		Friend[] frndAry = { fr1, fr2, fr3 };
		for (int i = 0; i < frndAry.length; i++) {
			System.out.println(frndAry[i].getName() + " " + frndAry[i].getPhone());
		}
//		int[] ary1 = {1,2,3,5,6,7};// int ary[] = {1,2,3};
//		int result = sum(ary1);
//		System.out.println("결과값은: " + result);

//		String str = "hello";
//		String str2 = "world";
//		String[] strAry = {str, str2};
//		for(int i=0;i<strAry.length;i++) {
//			System.out.println(strAry[i]);
//		}
	}

	static int sum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
