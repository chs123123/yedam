package com.yedam.collection.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	String name;
	int age;
	String ssno;

	public Person(String name, int age, String ssno) {
		super();
		this.name = name;
		this.age = age;
		this.ssno = ssno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsno() {
		return ssno;
	}

	public void setSsno(String ssno) {
		this.ssno = ssno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		boolean b1 = this.name.equals(person.name);
		boolean b2 = this.age == person.age;
		boolean b3 = this.ssno == person.ssno;
		return b1 && b2 && b3;
		// return this.name.equals(person.name) && this.age == person.age && this.ssno
		// == person.ssno;

	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
		// name.hashcode+22;
	}

}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("hong", 33, "0502"));
		set.add(new Person("kang", 22, "225"));// 주소값 -> hashcode()
		set.add(new Person("kang", 22, "225"));// 주소값 -> hashcode()
		set.add(new Person("choi", 11, "4865"));

		Iterator<Person> itr = set.iterator();
		while (itr.hasNext()) {
			Person p = itr.next();
			System.out.println(p.getName() + "-" + p.getAge() + "-" + p.getSsno());
		}
	}

}
/*
 * Set<String> set = new HashSet<String>(); set.add("Java"); set.add("JDBC");
 * set.add("Oracle"); set.add("Java"); set.add("iBatis");
 * 
 * int size = set.size(); System.out.println(size); System.out.println(set);
 * 
 * Iterator<String> itr = set.iterator(); while(itr.hasNext()) { String str =
 * itr.next(); System.out.println(str); } set.remove("JDBC");
 * System.out.println(set.size()); itr = set.iterator(); while (itr.hasNext()) {
 * String str = itr.next(); System.out.println(str); } set.clear();
 * if(set.isEmpty()) System.out.println("비어있습니다."); } }
 */