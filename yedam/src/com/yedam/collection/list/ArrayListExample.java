package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("hello");
		list.add(2, "index");
		
		System.out.println(list.get(0));
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add("DataBase");
		System.out.println();
		for(String str : list) {
			System.out.println(str);
		}
		list.remove(4);
		System.err.println();
		for(String str : list) {
			System.out.println(str);
	}
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime));
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		}
}

