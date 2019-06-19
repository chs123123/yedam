package com.yedam.collection.list;

import java.util.TreeSet;

class Person implements Comparable{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		//return this.age - ((Person) o).age; //음수값이 나오면 오름차순, 양수값이 나오면 내림차순
		//return this.name.compareTo(p.name);
		//name 필드의 문자의 갯수로 정렬....?
		return this.name.length() - this.name.length();
		
	}
}
public class ComparableExple {
	public static void main(String[] args) {
		Person p1 = new Person("aaa", 30);
		Person p2 = new Person("bbb", 20);
		Person p3 = new Person("ccc", 10);
		TreeSet<Person> set = new TreeSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		for(Person p: set) {
			System.out.println(p.age+"-"+p.name);
		}
	}
}
