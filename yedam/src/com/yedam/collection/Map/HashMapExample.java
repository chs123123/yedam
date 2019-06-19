package com.yedam.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Person {
	String ssno;
	String name;
	//private Object sson;
	private Object sson;

	public Person(String ssno, String name) {
		super();
		this.ssno = ssno;
		this.name = name;
	}

	String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return this.ssno.equals(person.sson) && this.name == person.name;
		
	}

	@Override
	public int hashCode() {
		return ssno.hashCode();
	}
	
	
}

public class HashMapExample {
	public static void main(String[] args) {
		// Map<String, Integer> map = new HashMap<String, Integer>();
		Map<Person, String> map = new HashMap<Person, String>();
		map.put(new Person("111", "hong1"), "hello");
		map.put(new Person("111", "hong1"), "nice");
		map.put(new Person("333", "hong3"), "good");
		// Person hashcode, equals 수정.
		// Iterator<Person> itr = map.iterator();
		// 결과값이 hello, good
		Set<Person> set = map.keySet();
		Iterator<Person> itr = set.iterator();
		while (itr.hasNext()) {
			Person p = itr.next();
			System.out.println(itr.next());
		}

//		map.put("김길동", 20);
//		map.put("헐길동", 20);
//		map.put("홍길동", 60);
		/*
		 * System.out.println("총 Entry 수: " + map.size());
		 * System.out.println("홍길동의 점수: " + map.get("홍길동")); Set<String> set =
		 * map.keySet(); System.out.println(set);
		 * 
		 * Iterator<String> itr = set.iterator(); while(itr.hasNext()) { String key =
		 * itr.next(); System.out.println("key값은 : " + key + " 값은: " +
		 * map.get(key).getName()); //
		 *///System.out.println(itr.next());
	}
}
