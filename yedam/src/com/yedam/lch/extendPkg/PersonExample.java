package com.yedam.lch.extendPkg;

public class PersonExample {
	public static void main(String[] args) {
		if(args != null) {
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
			System.out.println(args);
		}
		Person person = new Person("1111","이이링");
		// final은 초기화를 하면 변경할 수 없다 = person.ssn = "2222";
		person.name = "김이랑";
		System.out.println(person.nation+","+person.name+",");
	}
	
}
